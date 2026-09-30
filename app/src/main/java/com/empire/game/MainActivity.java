package com.empire.game;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setGravity(Gravity.CENTER);
        root.setPadding(50, 50, 50, 50);
        root.setBackgroundColor(Color.BLACK);

        TextView title = new TextView(this);
        title.setText("EMPIRE GAME");
        title.setTextColor(Color.WHITE);
        title.setTextSize(28);
        title.setGravity(Gravity.CENTER);

        TextView status = new TextView(this);
        status.setText("در حال دانلود دیتا");
        status.setTextColor(Color.WHITE);
        status.setTextSize(20);
        status.setGravity(Gravity.CENTER);
        status.setPadding(0, 50, 0, 30);

        ProgressBar progress = new ProgressBar(
                this,
                null,
                android.R.attr.progressBarStyleHorizontal
        );
        progress.setMax(100);
        progress.setProgress(0);

        TextView percent = new TextView(this);
        percent.setText("0%");
        percent.setTextColor(Color.WHITE);
        percent.setTextSize(17);
        percent.setGravity(Gravity.CENTER);
        percent.setPadding(0, 25, 0, 10);

        TextView info = new TextView(this);
        info.setText("در حال آماده‌سازی فایل‌های بازی...");
        info.setTextColor(Color.LTGRAY);
        info.setTextSize(14);
        info.setGravity(Gravity.CENTER);

        root.addView(title);
        root.addView(status);
        root.addView(progress,
                new LinearLayout.LayoutParams(-1, 45));
        root.addView(percent);
        root.addView(info);

        setContentView(root);
    }
}
