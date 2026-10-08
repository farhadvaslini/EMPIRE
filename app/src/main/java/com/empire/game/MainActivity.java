package com.empire.game;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.content.Intent;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView status;
    private TextView progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setStatusBarColor(Color.BLACK);
        getWindow().setNavigationBarColor(Color.BLACK);

        showClientMenu();
    }

    private void showClientMenu() {

        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setGravity(Gravity.CENTER);
        root.setPadding(35, 35, 35, 35);
        root.setBackgroundColor(Color.BLACK);

        TextView title = new TextView(this);
        title.setText("EMPIRE GAME");
        title.setTextColor(Color.WHITE);
        title.setTextSize(32);
        title.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        title.setGravity(Gravity.CENTER);

        TextView subtitle = new TextView(this);
        subtitle.setText("کلاینت رسمی EMPIRE GAME");
        subtitle.setTextColor(Color.LTGRAY);
        subtitle.setTextSize(17);
        subtitle.setGravity(Gravity.CENTER);
        subtitle.setPadding(0, 15, 0, 35);

        TextView server = new TextView(this);
        server.setText("سرور آنلاین\n85.133.205.240:7777");
        server.setTextColor(Color.WHITE);
        server.setTextSize(16);
        server.setGravity(Gravity.CENTER);
        server.setPadding(0, 10, 0, 25);

        status = new TextView(this);
        status.setText("آماده ورود به بازی");
        status.setTextColor(Color.WHITE);
        status.setTextSize(18);
        status.setGravity(Gravity.CENTER);
        status.setPadding(0, 20, 0, 10);

        progress = new TextView(this);
        progress.setText("داده‌های بازی بررسی شده‌اند");
        progress.setTextColor(Color.LTGRAY);
        progress.setTextSize(14);
        progress.setGravity(Gravity.CENTER);
        progress.setPadding(0, 0, 0, 25);

        Button play = new Button(this);
        play.setText("ورود به بازی");
        play.setTextSize(18);

        play.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                play.setEnabled(false);

                status.setText("در حال اجرای کلاینت...");
                progress.setText(
                        "EMPIRE GAME • 85.133.205.240:7777"
                );

                Intent intent = new Intent(
                        MainActivity.this,
                        GameClientActivity.class
                );

                intent.putExtra(
                        "server_host",
                        "85.133.205.240"
                );

                intent.putExtra(
                        "server_port",
                        7777
                );

                startActivity(intent);

                play.setEnabled(true);
            }
        });

        root.addView(
                title,
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                )
        );

        root.addView(
                subtitle,
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                )
        );

        root.addView(
                server,
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                )
        );

        root.addView(
                status,
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                )
        );

        root.addView(
                progress,
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                )
        );

        root.addView(
                play,
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        70
                )
        );

        setContentView(root);
    }
}
