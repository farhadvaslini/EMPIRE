package defpackage;

import android.app.Application;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class uu {
    public final /* synthetic */ int a;
    public final File b;
    public final File c;

    public uu(Application application, int i) {
        this.a = i;
        application.getClass();
        switch (i) {
            case 1:
                File file = new File(application.getFilesDir(), "plugin-catalog");
                this.b = file;
                this.c = new File(file, "catalog-v1.json");
                break;
            default:
                File file2 = new File(application.getFilesDir(), "cleo-catalog");
                this.b = file2;
                this.c = new File(file2, "catalog.json");
                break;
        }
    }

    public final void a(String str) throws JSONException, IOException {
        File fileCreateTempFile;
        FileOutputStream fileOutputStream;
        int i = this.a;
        File file = this.b;
        File file2 = this.c;
        switch (i) {
            case 0:
                Charset charset = ys.a;
                str.getBytes(charset).getClass();
                if (r10.length > 262144) {
                    c.p("Failed requirement.");
                    return;
                }
                wu.b(str);
                file.mkdirs();
                fileCreateTempFile = File.createTempFile("catalog-", ".tmp", file);
                try {
                    fileOutputStream = new FileOutputStream(fileCreateTempFile);
                    try {
                        byte[] bytes = str.getBytes(charset);
                        bytes.getClass();
                        fileOutputStream.write(bytes);
                        fileOutputStream.getFD().sync();
                        fileOutputStream.close();
                        try {
                            Files.move(fileCreateTempFile.toPath(), file2.toPath(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
                            break;
                        } catch (AtomicMoveNotSupportedException unused) {
                            Files.move(fileCreateTempFile.toPath(), file2.toPath(), StandardCopyOption.REPLACE_EXISTING);
                        }
                        return;
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } finally {
                }
            default:
                Charset charset2 = ys.a;
                str.getBytes(charset2).getClass();
                if (r10.length > 262144) {
                    c.p("Failed requirement.");
                    return;
                }
                x72.a(str);
                file.mkdirs();
                fileCreateTempFile = File.createTempFile("catalog-", ".tmp", file);
                try {
                    fileOutputStream = new FileOutputStream(fileCreateTempFile);
                    try {
                        byte[] bytes2 = str.getBytes(charset2);
                        bytes2.getClass();
                        fileOutputStream.write(bytes2);
                        fileOutputStream.getFD().sync();
                        fileOutputStream.close();
                        try {
                            Files.move(fileCreateTempFile.toPath(), file2.toPath(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
                            break;
                        } catch (AtomicMoveNotSupportedException unused2) {
                            Files.move(fileCreateTempFile.toPath(), file2.toPath(), StandardCopyOption.REPLACE_EXISTING);
                        }
                        return;
                    } finally {
                    }
                } finally {
                }
        }
    }
}
