package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ui {
    public static volatile File b;
    public static volatile ti a = ti.h;
    public static final SimpleDateFormat c = new SimpleDateFormat("HH:mm:ss.SSS", Locale.US);

    public static void a(String str, String str2) {
        c(ti.h, str, str2, null);
    }

    public static void b(Context context) {
        Object qn2Var;
        try {
            File externalFilesDir = context.getExternalFilesDir(null);
            if (externalFilesDir == null) {
                externalFilesDir = context.getFilesDir();
            }
            if (!externalFilesDir.exists()) {
                externalFilesDir.mkdirs();
            }
            File file = new File(externalFilesDir, "launcher.log");
            if (!file.exists()) {
                file.createNewFile();
            }
            d(file);
            qn2Var = file;
        } catch (Throwable th) {
            qn2Var = new qn2(th);
        }
        if (!(qn2Var instanceof qn2)) {
            b = (File) qn2Var;
        }
        Throwable thA = rn2.a(qn2Var);
        if (thA != null) {
            Log.w("SA-MP-Android", "Unable to initialize file logger", thA);
        }
    }

    public static void c(ti tiVar, String str, String str2, Throwable th) {
        String str3;
        String str4;
        if (tiVar.f < a.f) {
            return;
        }
        String string = y93.G0(str).toString();
        if (string.length() == 0) {
            string = "App";
        }
        String strConcat = "SA-MP-Android/".concat(string);
        if (th != null) {
            str2 = str2 + "\n" + Log.getStackTraceString(th);
        }
        if (str2.length() <= 3800) {
            Log.println(tiVar.f, strConcat, str2);
        } else {
            int i = 0;
            while (i < str2.length()) {
                int iMin = Math.min(i + 3800, str2.length());
                Log.println(tiVar.f, strConcat, str2.substring(i, iMin));
                i = iMin;
            }
        }
        SimpleDateFormat simpleDateFormat = c;
        synchronized (simpleDateFormat) {
            str3 = simpleDateFormat.format(new Date());
        }
        int iOrdinal = tiVar.ordinal();
        if (iOrdinal == 0) {
            str4 = "D";
        } else if (iOrdinal == 1) {
            str4 = "I";
        } else if (iOrdinal == 2) {
            str4 = "W";
        } else {
            if (iOrdinal != 3) {
                c.k();
                return;
            }
            str4 = "E";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str3);
        sb.append(" ");
        sb.append(str4);
        sb.append("/");
        sb.append(str);
        String strJ = nc2.j(sb, ": ", str2);
        try {
            File file = b;
            if (file == null) {
                return;
            }
            String str5 = strJ + "\n";
            Charset charset = ys.a;
            charset.getClass();
            FileOutputStream fileOutputStream = new FileOutputStream(file, true);
            try {
                em0.b0(fileOutputStream, str5, charset);
                fileOutputStream.close();
            } finally {
            }
        } catch (Exception unused) {
        }
    }

    public static void d(File file) {
        if (!file.exists() || file.length() <= 10485760) {
            return;
        }
        String parent = file.getParent();
        String name = file.getName();
        name.getClass();
        int iLastIndexOf = name.lastIndexOf(".", name.length() - 1);
        if (iLastIndexOf != -1) {
            name = name.substring(0, iLastIndexOf);
        }
        String name2 = file.getName();
        name2.getClass();
        File file2 = new File(parent, name + "_old." + y93.D0(name2, '.', ""));
        if (file2.exists()) {
            file2.delete();
        }
        file.renameTo(file2);
    }
}
