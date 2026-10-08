package com.empire.game;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class GameClientActivity extends Activity {

    static {
        System.loadLibrary("empireclient");
    }

    private TextView status;

    private native String nativeGetStatus();
    private native boolean nativeStartClient();
    private native void nativeStopClient();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setStatusBarColor(Color.BLACK);
        getWindow().setNavigationBarColor(Color.BLACK);

        String host = getIntent().getStringExtra("server_host");
        int port = getIntent().getIntExtra("server_port", 7777);

        if (host == null) {
            host = "85.133.205.240";
        }

        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setGravity(Gravity.CENTER);
        root.setPadding(40, 40, 40, 40);
        root.setBackgroundColor(Color.BLACK);

        TextView title = new TextView(this);
        title.setText("EMPIRE GAME");
        title.setTextColor(Color.WHITE);
        title.setTextSize(30);
        title.setGravity(Gravity.CENTER);

        TextView server = new TextView(this);
        server.setText(
                "سرور\n" +
                host + ":" + port
        );
        server.setTextColor(Color.LTGRAY);
        server.setTextSize(17);
        server.setGravity(Gravity.CENTER);
        server.setPadding(0, 30, 0, 30);

        status = new TextView(this);
        status.setText(nativeGetStatus());
        status.setTextColor(Color.WHITE);
        status.setTextSize(18);
        status.setGravity(Gravity.CENTER);

        root.addView(title);
        root.addView(server);
        root.addView(status);

        setContentView(root);

        boolean started = nativeStartClient();

        if (started) {
            status.setText(nativeGetStatus());
        }
    }

    @Override
    protected void onDestroy() {
        nativeStopClient();
        super.onDestroy();
    }
}
