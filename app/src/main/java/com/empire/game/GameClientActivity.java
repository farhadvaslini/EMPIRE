package com.empire.game;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

/** Original EMPIRE GAME integration layer.
 * The authorized native game engine/client is loaded separately when supplied.
 */
public final class GameClientActivity extends Activity {
    private TextView status;
    private String host;
    private int port;
    private String nickname;

    static {
        try { System.loadLibrary("empireclient"); } catch (UnsatisfiedLinkError ignored) { }
    }

    private static native String nativeStatus(String host, int port, String nickname);

    @Override protected void onCreate(Bundle state) {
        super.onCreate(state);
        getWindow().setStatusBarColor(Color.BLACK);
        getWindow().setNavigationBarColor(Color.BLACK);
        host = getIntent().getStringExtra("server_host");
        port = getIntent().getIntExtra("server_port", 7777);
        nickname = getIntent().getStringExtra("nickname");
        if (host == null) host = "85.133.205.240";
        if (nickname == null) nickname = "Player";
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
        title.setGravity(Gravity.CENTER);

        status = new TextView(this);
        status.setTextColor(Color.WHITE);
        status.setTextSize(18);
        status.setGravity(Gravity.CENTER);
        status.setPadding(0, 24, 0, 24);

        root.addView(title);
        root.addView(status);
        setContentView(root);

        try {
            status.setText(nativeStatus(host, port, nickname));
        } catch (Throwable t) {
            status.setText("Native client integration آماده است\n" + host + ":" + port);
        }
    }
}
