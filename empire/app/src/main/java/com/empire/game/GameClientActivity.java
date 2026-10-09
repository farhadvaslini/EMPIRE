package com.empire.game;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * EMPIRE GAME internal client shell.
 *
 * The native bridge is intentionally small: it verifies that the Android
 * project can load its own native client layer. A real SA-MP-compatible
 * game client must be supplied from an authorized/owned implementation.
 */
public class GameClientActivity extends Activity {
    private TextView status;
    private String host;
    private int port;

    static {
        System.loadLibrary("empireclient");
    }

    private static native String nativeStatus(String host, int port, String nickname);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(Color.BLACK);
        getWindow().setNavigationBarColor(Color.BLACK);

        host = getIntent().getStringExtra("server_host");
        if (host == null) host = "85.133.205.240";
        port = getIntent().getIntExtra("server_port", 7777);

        buildUi();
    }

    private void buildUi() {
        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setGravity(Gravity.CENTER);
        root.setPadding(48, 48, 48, 48);
        root.setBackgroundColor(Color.BLACK);

        TextView title = new TextView(this);
        title.setText("EMPIRE GAME");
        title.setTextColor(Color.WHITE);
        title.setTextSize(30);
        title.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        title.setGravity(Gravity.CENTER);

        TextView subtitle = new TextView(this);
        subtitle.setText("کلاینت داخلی");
        subtitle.setTextColor(Color.LTGRAY);
        subtitle.setTextSize(16);
        subtitle.setGravity(Gravity.CENTER);
        subtitle.setPadding(0, 16, 0, 30);

        status = new TextView(this);
        status.setText("در حال آماده‌سازی...");
        status.setTextColor(Color.WHITE);
        status.setTextSize(17);
        status.setGravity(Gravity.CENTER);
        status.setPadding(0, 25, 0, 18);

        TextView server = new TextView(this);
        server.setText("سرور: " + host + ":" + port);
        server.setTextColor(Color.LTGRAY);
        server.setTextSize(15);
        server.setGravity(Gravity.CENTER);
        server.setPadding(0, 0, 0, 30);

        Button connect = new Button(this);
        connect.setText("آماده‌سازی اتصال");
        connect.setOnClickListener(v -> beginConnection());

        root.addView(title);
        root.addView(subtitle);
        root.addView(status);
        root.addView(server);
        root.addView(connect, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, 60));

        setContentView(root);
        beginConnection();
    }

    private void beginConnection() {
        new Thread(() -> {
            String probe = ServerProbe.check(host, port, 5000);
            ClientEngine.Result engine = ClientEngine.load(this);
            String bridge;
            try {
                bridge = nativeStatus(host, port, "Player");
            } catch (Throwable error) {
                bridge = "Native bridge error: " + error.getClass().getSimpleName();
            }
            final String message = probe + "\n" + engine.message + "\n" + bridge;
            runOnUiThread(() -> status.setText(message));
        }).start();
    }
}
