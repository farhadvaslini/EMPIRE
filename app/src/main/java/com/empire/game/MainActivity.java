package com.empire.game;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.text.InputType;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class MainActivity extends Activity {

    private TextView status;
    private TextView percent;
    private TextView sizeInfo;
    private ProgressBar progress;

    private static final String HOST = "85.133.205.240";
    private static final int PORT = 3939;
    private static final String USERNAME = "empiredata";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        createUi();

        new AlertDialog.Builder(this)
                .setTitle("اتصال به سرور")
                .setMessage("رمز SFTP کاربر empiredata را وارد کنید.")
                .setView(createPasswordInput())
                .setCancelable(false)
                .setPositiveButton("اتصال", (dialog, which) -> {
                    EditText input = (EditText) ((AlertDialog) dialog).findViewById(1001);

                    if (input != null) {
                        startDownload(input.getText().toString());
                    }
                })
                .show();
    }

    private EditText createPasswordInput() {
        EditText input = new EditText(this);
        input.setId(1001);
        input.setHint("رمز SFTP");
        input.setSingleLine(true);
        input.setInputType(
                InputType.TYPE_CLASS_TEXT |
                InputType.TYPE_TEXT_VARIATION_PASSWORD
        );

        int padding = 40;
        input.setPadding(padding, 20, padding, 20);

        return input;
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
        status.setText("در حال آماده‌سازی...");
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

    private void startDownload(String password) {

        if (password == null || password.trim().isEmpty()) {
            status.setText("رمز وارد نشده است.");
            return;
        }

        status.setText("در حال دریافت اطلاعات فایل‌ها...");

        File manifestFile =
                new File(getFilesDir(), "manifest.json");

        SftpDownloader downloader =
                new SftpDownloader(
                        HOST,
                        PORT,
                        USERNAME,
                        password
                );

        downloader.download(
                "data/manifest.json",
                manifestFile,
                -1,
                "",
                new SftpDownloader.ProgressListener() {

                    @Override
                    public void onProgress(
                            long downloaded,
                            long total
                    ) {
                        if (total > 0) {
                            int value =
                                    (int) ((downloaded * 100L) / total);

                            updateProgress(
                                    value,
                                    downloaded,
                                    total
                            );
                        }
                    }

                    @Override
                    public void onStatus(String message) {
                        runOnUiThread(() ->
                                status.setText(message)
                        );
                    }

                    @Override
                    public void onComplete() {
                        readManifest(
                                manifestFile,
                                password
                        );
                    }

                    @Override
                    public void onError(String error) {
                        runOnUiThread(() ->
                                status.setText("خطا: " + error)
                        );
                    }
                }
        );
    }

    private void readManifest(
            File manifestFile,
            String password
    ) {

        new Thread(() -> {

            try {

                StringBuilder json =
                        new StringBuilder();

                BufferedReader reader =
                        new BufferedReader(
                                new FileReader(manifestFile)
                        );

                String line;

                while ((line = reader.readLine()) != null) {
                    json.append(line);
                }

                reader.close();

                JSONObject manifest =
                        new JSONObject(json.toString());

                JSONArray files =
                        manifest.getJSONArray("files");

                if (files.length() == 0) {
                    throw new Exception(
                            "manifest فایل ندارد."
                    );
                }

                JSONObject fileInfo =
                        files.getJSONObject(0);

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

                if (localFile.exists()
                        && localFile.length() == expectedSize
                        && sha256(localFile)
                        .equalsIgnoreCase(expectedSha256)) {

                    runOnUiThread(() -> {
                        status.setText(
                                "فایل‌ها سالم هستند."
                        );

                        progress.setProgress(100);
                        percent.setText("100%");

                        sizeInfo.setText(
                                formatBytes(expectedSize)
                                        + " / "
                                        + formatBytes(expectedSize)
                        );
                    });

                    return;
                }

                runOnUiThread(() -> {
                    status.setText(
                            "فایل ناقص یا تغییرکرده است؛ دانلود مجدد..."
                    );
                    progress.setProgress(0);
                });

                SftpDownloader downloader =
                        new SftpDownloader(
                                HOST,
                                PORT,
                                USERNAME,
                                password
                        );

                downloader.download(
                        "data/" + remotePath,
                        localFile,
                        expectedSize,
                        expectedSha256,
                        new SftpDownloader.ProgressListener() {

                            @Override
                            public void onProgress(
                                    long downloaded,
                                    long total
                            ) {

                                int value = 0;

                                if (total > 0) {
                                    value =
                                            (int) ((downloaded * 100L)
                                                    / total);
                                }

                                updateProgress(
                                        value,
                                        downloaded,
                                        total
                                );
                            }

                            @Override
                            public void onStatus(
                                    String message
                            ) {
                                runOnUiThread(() ->
                                        status.setText(message)
                                );
                            }

                            @Override
                            public void onComplete() {
                                runOnUiThread(() -> {
                                    status.setText(
                                            "دیتا با موفقیت آماده شد."
                                    );

                                    progress.setProgress(100);
                                    percent.setText("100%");
                                });
                            }

                            @Override
                            public void onError(
                                    String error
                            ) {
                                runOnUiThread(() ->
                                        status.setText(
                                                "خطا: " + error
                                        )
                                );
                            }
                        }
                );

            } catch (Exception e) {

                runOnUiThread(() ->
                        status.setText(
                                "خطا در خواندن manifest: "
                                        + e.getMessage()
                        )
                );
            }

        }).start();
    }

    private void updateProgress(
            int value,
            long downloaded,
            long total
    ) {

        runOnUiThread(() -> {

            progress.setProgress(value);
            percent.setText(value + "%");

            sizeInfo.setText(
                    formatBytes(downloaded)
                            + " / "
                            + formatBytes(total)
            );
        });
    }

    private String sha256(File file)
            throws Exception {

        java.security.MessageDigest digest =
                java.security.MessageDigest.getInstance(
                        "SHA-256"
                );

        java.io.InputStream input =
                new java.io.FileInputStream(file);

        byte[] buffer = new byte[8192];

        int read;

        while ((read = input.read(buffer)) != -1) {
            digest.update(buffer, 0, read);
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

    private String formatBytes(long bytes) {

        if (bytes < 1024) {
            return bytes + " B";
        }

        if (bytes < 1024 * 1024) {
            return String.format(
                    "%.2f KB",
                    bytes / 1024.0
            );
        }

        return String.format(
                "%.2f MB",
                bytes / 1024.0 / 1024.0
        );
    }
}
