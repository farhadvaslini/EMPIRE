package com.empire.game;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
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
import java.util.Locale;

public class MainActivity extends Activity {

    private TextView status;
    private TextView percent;
    private TextView sizeInfo;
    private ProgressBar progress;

    private static final String DATA_BASE_URL =
            "http://85.133.205.240/empire-data/";

    private static final String MANIFEST_URL =
            DATA_BASE_URL + "manifest.json";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        createUi();
        startDataCheck();
    }

    private void createUi() {

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

        status = new TextView(this);
        status.setText("در حال بررسی دیتا...");
        status.setTextColor(Color.WHITE);
        status.setTextSize(20);
        status.setGravity(Gravity.CENTER);
        status.setPadding(0, 50, 0, 30);

        progress = new ProgressBar(
                this,
                null,
                android.R.attr.progressBarStyleHorizontal
        );
        progress.setMax(100);
        progress.setProgress(0);

        percent = new TextView(this);
        percent.setText("0%");
        percent.setTextColor(Color.WHITE);
        percent.setTextSize(17);
        percent.setGravity(Gravity.CENTER);
        percent.setPadding(0, 25, 0, 10);

        sizeInfo = new TextView(this);
        sizeInfo.setText("0 B / 0 B");
        sizeInfo.setTextColor(Color.LTGRAY);
        sizeInfo.setTextSize(14);
        sizeInfo.setGravity(Gravity.CENTER);

        root.addView(title);
        root.addView(status);

        root.addView(
                progress,
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        45
                )
        );

        root.addView(percent);
        root.addView(sizeInfo);

        setContentView(root);
    }

    private void startDataCheck() {

        new Thread(() -> {

            try {

                runOnUiThread(() -> {
                    status.setText("در حال دریافت اطلاعات دیتا...");
                    progress.setProgress(0);
                    percent.setText("0%");
                    sizeInfo.setText("0 B / 0 B");
                });

                JSONObject manifest = downloadManifest();

                JSONArray files =
                        manifest.getJSONArray("files");

                if (files.length() == 0) {
                    throw new Exception(
                            "هیچ فایلی در manifest وجود ندارد."
                    );
                }

                long totalBytes = 0;

                for (int i = 0; i < files.length(); i++) {

                    JSONObject fileInfo =
                            files.getJSONObject(i);

                    totalBytes +=
                            fileInfo.getLong("size");
                }

                long completedBytes = 0;

                for (int i = 0; i < files.length(); i++) {

                    JSONObject fileInfo =
                            files.getJSONObject(i);

                    String remotePath =
                            fileInfo.getString("path");

                    long expectedSize =
                            fileInfo.getLong("size");

                    String expectedSha256 =
                            fileInfo.getString("sha256");

                    File localFile =
                            new File(
                                    getFilesDir(),
                                    remotePath
                            );

                    File parent =
                            localFile.getParentFile();

                    if (parent != null &&
                            !parent.exists()) {

                        if (!parent.mkdirs()) {
                            throw new Exception(
                                    "خطا در ساخت پوشه دیتا."
                            );
                        }
                    }

                    runOnUiThread(() ->
                            status.setText(
                                    "در حال بررسی: "
                                            + remotePath
                            )
                    );

                    boolean valid = false;

                    if (localFile.exists()
                            && localFile.length()
                            == expectedSize) {

                        String localHash =
                                sha256(localFile);

                        valid =
                                localHash.equalsIgnoreCase(
                                        expectedSha256
                                );
                    }

                    if (valid) {

                        completedBytes += expectedSize;

                        updateProgress(
                                completedBytes,
                                totalBytes
                        );

                        continue;
                    }

                    runOnUiThread(() ->
                            status.setText(
                                    "در حال دانلود: "
                                            + remotePath
                            )
                    );

                    downloadFile(
                            DATA_BASE_URL + remotePath,
                            localFile,
                            expectedSize,
                            expectedSha256,
                            completedBytes,
                            totalBytes
                    );

                    completedBytes += expectedSize;

                    updateProgress(
                            completedBytes,
                            totalBytes
                    );
                }

                final long finalTotalBytes = totalBytes;

                runOnUiThread(() -> {

                    progress.setProgress(100);
                    percent.setText("100%");

                    status.setText(
                            "دیتا با موفقیت آماده شد."
                    );

                    sizeInfo.setText(
                            formatBytes(finalTotalBytes)
                                    + " / "
                                    + formatBytes(finalTotalBytes)
                    );
                });

                Thread.sleep(1000);

                prepareGame();

            } catch (Exception e) {

                runOnUiThread(() ->
                        status.setText(
                                "خطا: "
                                        + e.getMessage()
                        )
                );
            }

        }).start();
    }

    private JSONObject downloadManifest()
            throws Exception {

        HttpURLConnection connection =
                (HttpURLConnection)
                        new URL(MANIFEST_URL)
                                .openConnection();

        connection.setRequestMethod("GET");
        connection.setConnectTimeout(15000);
        connection.setReadTimeout(30000);

        int responseCode =
                connection.getResponseCode();

        if (responseCode != 200) {

            throw new Exception(
                    "Manifest HTTP "
                            + responseCode
            );
        }

        InputStream input =
                new BufferedInputStream(
                        connection.getInputStream()
                );

        StringBuilder json =
                new StringBuilder();

        byte[] buffer = new byte[4096];

        int read;

        while ((read = input.read(buffer)) != -1) {

            json.append(
                    new String(
                            buffer,
                            0,
                            read,
                            "UTF-8"
                    )
            );
        }

        input.close();
        connection.disconnect();

        return new JSONObject(
                json.toString()
        );
    }

    private void downloadFile(
            String urlString,
            File destination,
            long expectedSize,
            String expectedSha256,
            long completedBefore,
            long totalBytes
    ) throws Exception {

        File tempFile =
                new File(
                        destination.getAbsolutePath()
                                + ".part"
                );

        HttpURLConnection connection =
                (HttpURLConnection)
                        new URL(urlString)
                                .openConnection();

        connection.setRequestMethod("GET");
        connection.setConnectTimeout(15000);
        connection.setReadTimeout(60000);

        int responseCode =
                connection.getResponseCode();

        if (responseCode != 200) {

            throw new Exception(
                    "Download HTTP "
                            + responseCode
            );
        }

        long contentLength =
                connection.getContentLengthLong();

        if (contentLength > 0
                && contentLength != expectedSize) {

            throw new Exception(
                    "حجم فایل با manifest مطابقت ندارد."
            );
        }

        InputStream input =
                new BufferedInputStream(
                        connection.getInputStream()
                );

        FileOutputStream output =
                new FileOutputStream(tempFile);

        byte[] buffer =
                new byte[64 * 1024];

        long downloaded = 0;

        int read;

        while ((read = input.read(buffer)) != -1) {

            output.write(buffer, 0, read);

            downloaded += read;

            long currentTotal =
                    completedBefore + downloaded;

            updateProgress(
                    currentTotal,
                    totalBytes
            );
        }

        output.flush();
        output.close();
        input.close();
        connection.disconnect();

        if (downloaded != expectedSize) {

            tempFile.delete();

            throw new Exception(
                    "حجم دانلود شده صحیح نیست."
            );
        }

        String actualSha256 =
                sha256(tempFile);

        if (!actualSha256.equalsIgnoreCase(
                expectedSha256)) {

            tempFile.delete();

            throw new Exception(
                    "SHA-256 فایل صحیح نیست."
            );
        }

        if (destination.exists()) {
            destination.delete();
        }

        if (!tempFile.renameTo(destination)) {

            throw new Exception(
                    "خطا در ذخیره فایل."
            );
        }
    }

    private void updateProgress(
            long completed,
            long total
    ) {

        if (total <= 0) {
            return;
        }

        int calculatedValue =
                (int)
                        ((completed * 100L)
                                / total);

        if (calculatedValue > 100) {
            calculatedValue = 100;
        }

        final int finalValue = calculatedValue;
        final long finalCompleted = completed;
        final long finalTotal = total;

        runOnUiThread(() -> {

            progress.setProgress(finalValue);

            percent.setText(
                    finalValue + "%"
            );

            sizeInfo.setText(
                    formatBytes(finalCompleted)
                            + " / "
                            + formatBytes(finalTotal)
            );
        });
    }

    private String sha256(File file)
            throws Exception {

        MessageDigest digest =
                MessageDigest.getInstance(
                        "SHA-256"
                );

        InputStream input =
                new FileInputStream(file);

        byte[] buffer =
                new byte[64 * 1024];

        int read;

        while ((read =
                input.read(buffer)) != -1) {

            digest.update(
                    buffer,
                    0,
                    read
            );
        }

        input.close();

        byte[] hash =
                digest.digest();

        StringBuilder result =
                new StringBuilder();

        for (byte b : hash) {

            result.append(
                    String.format(
                            Locale.US,
                            "%02x",
                            b
                    )
            );
        }

        return result.toString();
    }

    private String formatBytes(long bytes) {

        if (bytes < 1024) {
            return bytes + " B";
        }

        if (bytes < 1024 * 1024) {

            return String.format(
                    Locale.US,
                    "%.2f KB",
                    bytes / 1024.0
            );
        }

        if (bytes < 1024L * 1024L * 1024L) {

            return String.format(
                    Locale.US,
                    "%.2f MB",
                    bytes / 1024.0 / 1024.0
            );
        }

        return String.format(
                Locale.US,
                "%.2f GB",
                bytes / 1024.0 / 1024.0 / 1024.0
        );
    }

    private void prepareGame() {

        runOnUiThread(() -> {

            status.setText(
                    "آماده‌سازی بازی..."
            );

            percent.setText("100%");
            progress.setProgress(100);
        });

        // اجرای SA-MP را در مرحله بعد وصل می‌کنیم.
    }
}
