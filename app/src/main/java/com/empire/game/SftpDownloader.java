package com.empire.game;

import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.security.MessageDigest;

public class SftpDownloader {

    public interface ProgressListener {
        void onProgress(long downloaded, long total);
        void onStatus(String status);
        void onComplete();
        void onError(String error);
    }

    private final String host;
    private final int port;
    private final String username;
    private final String password;

    public SftpDownloader(
            String host,
            int port,
            String username,
            String password
    ) {
        this.host = host;
        this.port = port;
        this.username = username;
        this.password = password;
    }

    public void download(
            String remoteFile,
            File localFile,
            long expectedSize,
            String expectedSha256,
            ProgressListener listener
    ) {

        new Thread(() -> {

            Session session = null;
            ChannelSftp sftp = null;

            try {
                listener.onStatus("در حال اتصال به سرور...");

                JSch jsch = new JSch();

                session = jsch.getSession(
                        username,
                        host,
                        port
                );

                session.setPassword(password);

                session.setConfig(
                        "StrictHostKeyChecking",
                        "no"
                );

                session.connect(15000);

                sftp = (ChannelSftp)
                        session.openChannel("sftp");

                sftp.connect(15000);

                ChannelSftp finalSftp = sftp;

                long total = expectedSize;

                if (total <= 0) {
                    total =
                            finalSftp
                                    .stat(remoteFile)
                                    .getSize();
                }

                listener.onStatus("در حال دانلود...");

                File parent = localFile.getParentFile();

                if (parent != null && !parent.exists()) {
                    parent.mkdirs();
                }

                File tempFile =
                        new File(
                                localFile.getAbsolutePath()
                                        + ".part"
                        );

                InputStream input =
                        finalSftp.get(remoteFile);

                FileOutputStream output =
                        new FileOutputStream(tempFile);

                byte[] buffer = new byte[8192];

                long downloaded = 0;
                int read;

                while ((read = input.read(buffer)) != -1) {

                    output.write(buffer, 0, read);

                    downloaded += read;

                    listener.onProgress(
                            downloaded,
                            total
                    );
                }

                output.flush();
                output.close();
                input.close();

                if (downloaded != total) {

                    tempFile.delete();

                    listener.onError(
                            "حجم فایل صحیح نیست."
                    );

                    return;
                }

                if (expectedSha256 != null
                        && !expectedSha256.isEmpty()) {

                    listener.onStatus(
                            "در حال بررسی SHA-256..."
                    );

                    String actualSha256 =
                            sha256(tempFile);

                    if (!actualSha256.equalsIgnoreCase(
                            expectedSha256
                    )) {

                        tempFile.delete();

                        listener.onError(
                                "SHA-256 فایل صحیح نیست."
                        );

                        return;
                    }
                }

                if (localFile.exists()) {
                    localFile.delete();
                }

                if (!tempFile.renameTo(localFile)) {

                    listener.onError(
                            "ذخیره فایل انجام نشد."
                    );

                    return;
                }

                listener.onComplete();

            } catch (Exception e) {

                listener.onError(
                        e.getClass().getSimpleName()
                                + ": "
                                + e.getMessage()
                );

            } finally {

                try {
                    if (sftp != null) {
                        sftp.disconnect();
                    }
                } catch (Exception ignored) {
                }

                try {
                    if (session != null) {
                        session.disconnect();
                    }
                } catch (Exception ignored) {
                }
            }

        }).start();
    }

    private static String sha256(File file)
            throws Exception {

        MessageDigest digest =
                MessageDigest.getInstance("SHA-256");

        InputStream input =
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
}
