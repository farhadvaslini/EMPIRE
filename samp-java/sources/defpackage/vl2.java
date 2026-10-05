package defpackage;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.zip.ZipInputStream;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.io.File r10, java.io.File r11, defpackage.pm2 r12) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vl2.b(java.io.File, java.io.File, pm2):void");
    }
}
