package defpackage;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class vl2 {
    public volatile boolean a;

    public static int a(File file) {
        int i = 0;
        try {
            ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(file), 8192));
            while (zipInputStream.getNextEntry() != null) {
                try {
                    i++;
                    zipInputStream.closeEntry();
                } finally {
                }
            }
            zipInputStream.close();
            return i;
        } catch (Exception e) {
            ti tiVar = ui.a;
            ui.c(ti.i, "ResourceExtractor", by1.g("Failed to count ZIP entries: ", e.getMessage()), null);
            return i;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(File file, File file2, pm2 pm2Var) {
        String message;
        int iA;
        ZipInputStream zipInputStream;
        ZipEntry nextEntry;
        int i;
        int i2;
        file.getClass();
        file2.getClass();
        this.a = false;
        if (!file.exists()) {
            pm2Var.b("ZIP file not found: " + file.getAbsolutePath());
            return;
        }
        if (!file2.exists()) {
            file2.mkdirs();
        }
        try {
            iA = a(file);
            zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(file), 8192));
            try {
                i = 0;
            } finally {
            }
        } catch (Exception e) {
            message = e.getMessage();
            if (message == null) {
            }
            pm2Var.b(message);
            return;
        }
        for (nextEntry = zipInputStream.getNextEntry(); nextEntry != null && !this.a; nextEntry = zipInputStream.getNextEntry()) {
            File file3 = new File(file2, nextEntry.getName());
            String canonicalPath = file3.getCanonicalPath();
            canonicalPath.getClass();
            String canonicalPath2 = file2.getCanonicalPath();
            canonicalPath2.getClass();
            if (!fa3.e0(canonicalPath, canonicalPath2, false)) {
                pm2Var.b("Path traversal detected: " + nextEntry.getName());
                zipInputStream.close();
                return;
            }
            if (nextEntry.isDirectory()) {
                file3.mkdirs();
            } else {
                File parentFile = file3.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file3);
                try {
                    byte[] bArr = new byte[8192];
                    while (!this.a && (i2 = zipInputStream.read(bArr)) != -1) {
                        fileOutputStream.write(bArr, 0, i2);
                    }
                    fileOutputStream.close();
                } finally {
                }
            }
            i++;
            String name = nextEntry.getName();
            name.getClass();
            pm2Var.c(new vk0(i, iA, name));
            zipInputStream.closeEntry();
            message = e.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            pm2Var.b(message);
            return;
        }
        zipInputStream.close();
        if (this.a) {
            pm2Var.b("Extraction cancelled");
        } else {
            pm2Var.a(i);
        }
    }
}
