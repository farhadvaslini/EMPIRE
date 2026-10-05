package com.empire.game;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;

public class MainActivity extends Activity {

    private TextView status;
    private TextView progressText;
    private Button play;

    private static final String DATA_BASE_URL =
            "http://85.133.205.240/empire-data/";

    private static final String MANIFEST_URL =
            DATA_BASE_URL + "manifest.json";

    private File dataDir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setStatusBarColor(Color.BLACK);
        getWindow().setNavigationBarColor(Color.BLACK);

        dataDir = new File(getFilesDir(), "empire-data");

        buildUi();

        startDataCheck();
    }

    private void buildUi() {

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
        subtitle.setPadding(0, 15, 0, 30);

        TextView server = new TextView(this);
        server.setText("سرور آنلاین\n85.133.205.240:7777");
        server.setTextColor(Color.WHITE);
        server.setTextSize(16);
        server.setGravity(Gravity.CENTER);
        server.setPadding(0, 10, 0, 25);

        status = new TextView(this);
        status.setText("در حال بررسی دیتا...");
        status.setTextColor(Color.WHITE);
        status.setTextSize(18);
        status.setGravity(Gravity.CENTER);
        status.setPadding(0, 15, 0, 10);

        progressText = new TextView(this);
        progressText.setText("0%");
        progressText.setTextColor(Color.LTGRAY);
        progressText.setTextSize(16);
        progressText.setGravity(Gravity.CENTER);
        progressText.setPadding(0, 0, 0, 25);

        play = new Button(this);
        play.setText("ورود به بازی");
        play.setTextSize(18);
        play.setEnabled(false);

        play.setOnClickListener(v -> openGameClient());

        root.addView(title);
        root.addView(subtitle);
        root.addView(server);
        root.addView(status);
        root.addView(progressText);
        root.addView(
                play,
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        70
                )
        );

        setContentView(root);
    }

    private void startDataCheck() {

        status.setText("در حال بررسی دیتا...");
        progressText.setText("0%");
        play.setEnabled(false);

        new Thread(() -> {

            try {

                if (!dataDir.exists()) {
                    dataDir.mkdirs();
                }

                String manifestText = downloadText(MANIFEST_URL);

                JSONObject manifest = new JSONObject(manifestText);
                JSONArray files = manifest.getJSONArray("files");

                long totalBytes = 0;
                long completedBytes = 0;

                for (int i = 0; i < files.length(); i++) {
                    JSONObject item = files.getJSONObject(i);
                    totalBytes += item.getLong("size");
                }

                for (int i = 0; i < files.length(); i++) {

                    JSONObject item = files.getJSONObject(i);

                    String path = item.getString("path");
                    long expectedSize = item.getLong("size");
                    String expectedSha =
                            item.getString("sha256");

                    File target = new File(dataDir, path);

                    if (target.exists()
                            && target.length() == expectedSize
                            && sha256(target).equalsIgnoreCase(expectedSha)) {

                        completedBytes += expectedSize;
                        updateProgress(
                                completedBytes,
                                totalBytes,
                                "دیتا بررسی شد"
                        );

                        continue;
                    }

                    File parent = target.getParentFile();

                    if (parent != null && !parent.exists()) {
                        parent.mkdirs();
                    }

                    downloadFile(
                            DATA_BASE_URL + path,
                            target,
                            expectedSize,
                            completedBytes,
                            totalBytes
                    );

                    completedBytes += expectedSize;
                }

                runOnUiThread(() -> {

                    status.setText("دیتا آماده است");
                    progressText.setText("100%");
                    play.setEnabled(true);

                });

            } catch (Exception e) {

                runOnUiThread(() -> {

                    status.setText(
                            "خطا در دانلود دیتا"
                    );

                    progressText.setText(
                            e.getMessage() == null
                                    ? "خطای نامشخص"
                                    : e.getMessage()
                    );

                    play.setEnabled(false);
                });

            }

        }).start();
    }

    private String downloadText(String address)
            throws Exception {

        URL url = new URL(address);

        HttpURLConnection connection =
                (HttpURLConnection) url.openConnection();

        connection.setConnectTimeout(15000);
        connection.setReadTimeout(30000);
        connection.setRequestMethod("GET");

        InputStream input =
                new BufferedInputStream(
                        connection.getInputStream()
                );

        StringBuilder result =
                new StringBuilder();

        byte[] buffer = new byte[4096];

        int count;

        while ((count = input.read(buffer)) != -1) {
            result.append(
                    new String(buffer, 0, count, "UTF-8")
            );
        }

        input.close();
        connection.disconnect();

        return result.toString();
    }

    private void downloadFile(
            String address,
            File target,
            long expectedSize,
            long alreadyCompleted,
            long totalBytes
    ) throws Exception {

        URL url = new URL(address);

        HttpURLConnection connection =
                (HttpURLConnection) url.openConnection();

        connection.setConnectTimeout(15000);
        connection.setReadTimeout(60000);
        connection.setRequestMethod("GET");

        int responseCode =
                connection.getResponseCode();

        if (responseCode != HttpURLConnection.HTTP_OK) {
            throw new Exception(
                    "HTTP " + responseCode
            );
        }

        File temp = new File(
                target.getAbsolutePath() + ".part"
        );

        InputStream input =
                new BufferedInputStream(
                        connection.getInputStream()
                );

        FileOutputStream output =
                new FileOutputStream(temp);

        byte[] buffer = new byte[8192];

        long downloaded = 0;
        int count;

        while ((count = input.read(buffer)) != -1) {

            output.write(buffer, 0, count);

            downloaded += count;

            long current =
                    alreadyCompleted + downloaded;

            updateProgress(
                    current,
                    totalBytes,
                    "در حال دانلود دیتا..."
            );
        }

        output.flush();
        output.close();
        input.close();
        connection.disconnect();

        if (temp.length() != expectedSize) {

            temp.delete();

            throw new Exception(
                    "حجم فایل صحیح نیست"
            );
        }

        if (target.exists()) {
            target.delete();
        }

        if (!temp.renameTo(target)) {

            throw new Exception(
                    "خطا در ذخیره فایل دیتا"
            );
        }
    }

    private void updateProgress(
            long completed,
            long total,
            String message
    ) {

        int percent;

        if (total <= 0) {
            percent = 0;
        } else {
            percent =
                    (int) ((completed * 100L) / total);
        }

        final int finalPercent = percent;

        runOnUiThread(() -> {

            status.setText(message);

            progressText.setText(
                    finalPercent + "%\n" +
                    completed + " B / " +
                    total + " B"
            );
        });
    }

    private String sha256(File file)
            throws Exception {

        MessageDigest digest =
                MessageDigest.getInstance("SHA-256");

        FileInputStream input =
                new FileInputStream(file);

        byte[] buffer = new byte[8192];

        int count;

        while ((count = input.read(buffer)) != -1) {
            digest.update(buffer, 0, count);
        }

        input.close();

        byte[] hash = digest.digest();

        StringBuilder result =
                new StringBuilder();

        for (byte b : hash) {
            result.append(
                    String.format("%02x", b)
            );
        }

        return result.toString();
    }

    private void openGameClient() {

        status.setText("در حال اجرای کلاینت...");
        progressText.setText(
                "EMPIRE GAME • 85.133.205.240:7777"
        );

        Intent intent =
                new Intent(
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
    }
}
