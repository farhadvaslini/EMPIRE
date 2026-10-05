package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipInputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class nw {
    public static final uk2 f = new uk2("^[a-z][a-z0-9]*(?:[._-][a-z0-9]+)*$");
    public static final Set g = oz2.L("csa", "csi", "cm", "fxt", "ini", "txt", "wav", "mp3", "ogg", "txd", "dff", "dat", "s");
    public final ContentResolver a;
    public final File b;
    public final File c;
    public final File d;
    public final Object e;

    public nw(Context context) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext.getContentResolver();
        File externalFilesDir = applicationContext.getExternalFilesDir(null);
        this.b = new File(externalFilesDir == null ? applicationContext.getFilesDir() : externalFilesDir, "CLEO");
        this.c = new File(new File(applicationContext.getFilesDir(), "cleo"), "installed.json");
        this.d = new File(applicationContext.getCacheDir(), "cleo-staging");
        this.e = new Object();
    }

    public static long a(InputStream inputStream, FileOutputStream fileOutputStream, long j, dv dvVar) throws IOException {
        byte[] bArr = new byte[8192];
        long j2 = 0;
        while (true) {
            int i = inputStream.read(bArr);
            if (i < 0) {
                return j2;
            }
            if (i != 0) {
                j2 += (long) i;
                if (j2 > j) {
                    throw new cv(dvVar, "CLEO file exceeds the allowed size");
                }
                fileOutputStream.write(bArr, 0, i);
            }
        }
    }

    public static void d(File file) throws cv {
        if ((!file.exists() && !file.mkdirs()) || !file.isDirectory()) {
            throw new cv(dv.g, "Unable to create CLEO directory");
        }
    }

    public static boolean i(File file, File file2) {
        Object qn2Var;
        Object qn2Var2;
        try {
            qn2Var = file2.getCanonicalFile();
        } catch (Throwable th) {
            qn2Var = new qn2(th);
        }
        if (qn2Var instanceof qn2) {
            qn2Var = null;
        }
        File file3 = (File) qn2Var;
        if (file3 != null) {
            try {
                qn2Var2 = file.getCanonicalFile();
            } catch (Throwable th2) {
                qn2Var2 = new qn2(th2);
            }
            File file4 = (File) (qn2Var2 instanceof qn2 ? null : qn2Var2);
            if (file4 != null) {
                return file4.equals(file3) || file4.toPath().startsWith(file3.toPath());
            }
        }
        return false;
    }

    public static String k(String str) throws cv {
        String strReplace = str.replace('\\', '/');
        strReplace.getClass();
        String string = y93.G0(strReplace).toString();
        int length = string.length();
        dv dvVar = dv.l;
        if (length != 0 && !y93.B0(string, '/') && !y93.i0(string, (char) 0)) {
            List<String> listZ0 = y93.z0(string, new char[]{'/'}, 6);
            if (!listZ0.isEmpty()) {
                for (String str2 : listZ0) {
                    if (str2.length() != 0 && !str2.equals(".") && !str2.equals("..")) {
                        for (int i = 0; i < str2.length(); i++) {
                            char cCharAt = str2.charAt(i);
                            if (cCharAt >= ' ' && cCharAt != 127) {
                            }
                        }
                    }
                }
            }
            byte[] bytes = string.getBytes(ys.a);
            bytes.getClass();
            if (bytes.length <= 512) {
                return string;
            }
            throw new cv(dvVar, "CLEO package path is too long");
        }
        throw new cv(dvVar, "CLEO package contains an unsafe path");
    }

    public static Object o(Serializable serializable) throws Throwable {
        Throwable thA = rn2.a(serializable);
        if (thA != null) {
            if (thA instanceof CancellationException) {
                throw thA;
            }
            if (!(thA instanceof cv)) {
                String message = thA.getMessage();
                if (message == null) {
                    message = "CLEO operation failed";
                }
                return new qn2(new cv(dv.o, message, thA));
            }
        }
        return serializable;
    }

    public static String p(String str) throws cv {
        String strD0 = y93.D0(str, '/', str);
        String strD02 = y93.D0(strD0, '\\', strD0);
        if (strD02.length() != 0 && !strD02.equals(".") && !strD02.equals("..")) {
            int i = 0;
            while (true) {
                if (i < strD02.length()) {
                    char cCharAt = strD02.charAt(i);
                    if (cCharAt == '/' || cCharAt == '\\' || cCharAt == 0 || cCharAt < ' ' || cCharAt == 127) {
                        break;
                    }
                    i++;
                } else {
                    byte[] bytes = strD02.getBytes(ys.a);
                    bytes.getClass();
                    if (bytes.length <= 128) {
                        return strD02;
                    }
                }
            }
        }
        throw new cv(dv.l, "Invalid CLEO file name");
    }

    public final void b(Uri uri, File file, long j, dv dvVar) throws cv, FileNotFoundException {
        InputStream inputStreamOpenInputStream = this.a.openInputStream(uri);
        dv dvVar2 = dv.g;
        try {
            if (inputStreamOpenInputStream == null) {
                throw new cv(dvVar2, "Unable to open selected CLEO file");
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    a(inputStreamOpenInputStream, fileOutputStream, j, dvVar);
                    fileOutputStream.close();
                    inputStreamOpenInputStream.close();
                } finally {
                }
            } finally {
            }
        } catch (cv e) {
            throw e;
        } catch (Exception e2) {
            throw new cv(dvVar2, "Unable to read selected CLEO file", e2);
        }
    }

    public final int c(String str) throws JSONException, IOException {
        Object obj;
        String strK = k(str);
        boolean zI0 = y93.i0(strK, '/');
        dv dvVar = dv.l;
        if (!zI0) {
            lw.g.getClass();
            if (zj.g(strK) != null) {
                ArrayList arrayListO0 = qx.O0(n());
                int size = arrayListO0.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        obj = null;
                        break;
                    }
                    obj = arrayListO0.get(i);
                    i++;
                    if (((mw) obj).c.contains(strK)) {
                        break;
                    }
                }
                mw mwVar = (mw) obj;
                List<String> listK = mwVar != null ? mwVar.c : null;
                if (listK == null) {
                    listK = ni0.f;
                }
                if (listK.isEmpty()) {
                    listK = vr.K(strK);
                }
                for (String str2 : listK) {
                    File file = this.b;
                    File file2 = new File(file, str2);
                    if (!i(file2, file)) {
                        throw new cv(dvVar, "Invalid CLEO deletion path");
                    }
                    if (file2.exists() && !file2.delete()) {
                        throw new cv(dv.g, "Unable to delete CLEO file");
                    }
                }
                if (mwVar != null) {
                    vx.g0(arrayListO0, new s(15, mwVar));
                    q(arrayListO0);
                }
                return listK.size();
            }
        }
        throw new cv(dvVar, "Invalid CLEO script path");
    }

    public final Object e(Uri uri) {
        Serializable qn2Var;
        Object objO;
        String strL;
        uri.getClass();
        synchronized (this.e) {
            try {
                strL = l(uri);
            } catch (Throwable th) {
                qn2Var = new qn2(th);
            }
            if (strL == null) {
                throw new cv(dv.g, "The selected file has no name");
            }
            lw.g.getClass();
            int iF = 1;
            if (zj.g(strL) != null) {
                g(uri, strL);
            } else {
                if (!fa3.Y(strL, ".zip", true)) {
                    throw new cv(dv.f, "Unsupported CLEO file extension");
                }
                iF = f(uri);
            }
            qn2Var = Integer.valueOf(iF);
            objO = o(qn2Var);
        }
        return objO;
    }

    public final int f(Uri uri) throws IOException {
        long jM = m(uri);
        dv dvVar = dv.i;
        if (jM > 33554432) {
            throw new cv(dvVar, "CLEO package is too large");
        }
        File file = this.d;
        d(file);
        File fileCreateTempFile = File.createTempFile(".cleo-package-", ".zip", file);
        try {
            fileCreateTempFile.getClass();
            b(uri, fileCreateTempFile, 33554432L, dvVar);
            String string = UUID.randomUUID().toString();
            string.getClass();
            Locale locale = Locale.ROOT;
            locale.getClass();
            String lowerCase = string.toLowerCase(locale);
            lowerCase.getClass();
            return h(fileCreateTempFile, "local-".concat(lowerCase), "local", null);
        } finally {
            fileCreateTempFile.delete();
        }
    }

    public final void g(Uri uri, String str) throws IOException {
        File file;
        zj zjVar = lw.g;
        zjVar.getClass();
        lw lwVarG = zj.g(str);
        if (lwVarG == null) {
            throw new cv(dv.f, "Unsupported CLEO script extension");
        }
        String strP = p(str);
        long jM = m(uri);
        dv dvVar = dv.h;
        if (jM > 16777216) {
            throw new cv(dvVar, "CLEO script is too large");
        }
        File file2 = this.b;
        d(file2);
        String strP2 = p(strP);
        File file3 = new File(file2, strP2);
        if (file3.exists()) {
            int iR0 = y93.r0(strP2, '.', 0, 6);
            String strSubstring = iR0 == -1 ? strP2 : strP2.substring(0, iR0);
            String strD0 = y93.D0(strP2, '.', strP2);
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i >= 16) {
                    throw new cv(dv.m, "Unable to create a unique CLEO file name");
                }
                File file4 = new File(file2, strSubstring + "-imported-" + System.nanoTime() + "-" + i2 + "." + strD0);
                if (!file4.exists()) {
                    file = file4;
                    break;
                }
                i = i2;
            }
        } else {
            file = file3;
        }
        File fileCreateTempFile = File.createTempFile(".cleo-import-", ".tmp", file2);
        try {
            fileCreateTempFile.getClass();
            b(uri, fileCreateTempFile, 16777216L, dvVar);
            long length = fileCreateTempFile.length();
            if (2 > length || length >= 16777217) {
                throw new cv(dvVar, "CLEO script is empty or too large");
            }
            try {
                Files.move(fileCreateTempFile.toPath(), file.toPath(), StandardCopyOption.ATOMIC_MOVE);
            } catch (AtomicMoveNotSupportedException unused) {
                Files.move(fileCreateTempFile.toPath(), file.toPath(), new CopyOption[0]);
            }
            String name = file.getName();
            name.getClass();
            zjVar.getClass();
            if (lwVarG != zj.g(name)) {
                throw new IllegalStateException("Check failed.");
            }
            fileCreateTempFile.delete();
        } catch (Throwable th) {
            fileCreateTempFile.delete();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x021f, code lost:
    
        r6 = r7.get(r9);
        r9 = r9 + 1;
        r10 = new java.io.File(r4, (java.lang.String) r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0230, code lost:
    
        if (i(r10, r4) != false) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0232, code lost:
    
        defpackage.em0.W(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0236, code lost:
    
        r2 = new defpackage.zn2(r3).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x024c, code lost:
    
        r3 = (defpackage.r32) ((java.util.ListIterator) ((defpackage.yn2) r2).g).previous();
        r6 = (java.lang.String) r3.f;
        r3 = (java.io.File) r3.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0265, code lost:
    
        if (r3.exists() != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0267, code lost:
    
        r7 = new java.io.File(r4, r6);
        r6 = r7.getParentFile();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0270, code lost:
    
        if (r6 != null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0272, code lost:
    
        r6.mkdirs();
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0275, code lost:
    
        r3 = r3.toPath();
        r6 = r7.toPath();
        r9 = new java.nio.file.CopyOption[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0284, code lost:
    
        r9[0] = java.nio.file.StandardCopyOption.REPLACE_EXISTING;
        java.nio.file.Files.move(r3, r6, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x028d, code lost:
    
        r1.q(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0290, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x029c, code lost:
    
        throw new defpackage.cv(defpackage.dv.k, "CLEO package contains no supported scripts");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008e, code lost:
    
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0095, code lost:
    
        if (r11.isEmpty() != false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0097, code lost:
    
        if (r2 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009d, code lost:
    
        if (r11.isEmpty() != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009f, code lost:
    
        r5 = r11.size();
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a4, code lost:
    
        if (r10 >= r5) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a6, code lost:
    
        r12 = r11.get(r10);
        r10 = r10 + 1;
        r19.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b5, code lost:
    
        if (defpackage.zj.g((java.lang.String) r12) != r2) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c7, code lost:
    
        throw new defpackage.cv(defpackage.dv.n, "CLEO package does not contain the catalogued script type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c8, code lost:
    
        r2 = defpackage.qx.O0(r1.n());
        r5 = defpackage.qx.N0(r2);
        r10 = r2.size();
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d9, code lost:
    
        if (r12 >= r10) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00db, code lost:
    
        r15 = r2.get(r12);
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ea, code lost:
    
        if (defpackage.s51.n(((defpackage.mw) r15).a, r0) == false) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ed, code lost:
    
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ee, code lost:
    
        r15 = (defpackage.mw) r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f0, code lost:
    
        if (r15 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f2, code lost:
    
        r14 = r15.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f5, code lost:
    
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f6, code lost:
    
        if (r14 != null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f8, code lost:
    
        r14 = defpackage.ni0.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fa, code lost:
    
        r10 = defpackage.qx.R0(r14);
        r12 = r7.size();
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0103, code lost:
    
        if (r14 >= r12) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0105, code lost:
    
        r15 = r7.get(r14);
        r14 = r14 + 1;
        r15 = (java.lang.String) r15;
        r3 = new java.io.File(r4, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0116, code lost:
    
        if (r3.exists() == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011c, code lost:
    
        if (r10.contains(r15) == false) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0128, code lost:
    
        throw new defpackage.cv(defpackage.dv.m, "CLEO package conflicts with an existing file");
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x012d, code lost:
    
        if (i(r3, r4) == false) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0137, code lost:
    
        throw new defpackage.cv(r6, "CLEO package contains an unsafe destination");
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0138, code lost:
    
        r3 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0141, code lost:
    
        if (r9.mkdirs() == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0143, code lost:
    
        r10 = defpackage.qx.N0(defpackage.qx.Q0(defpackage.qx.D0(r7, r10))).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0159, code lost:
    
        if (r10.hasNext() == false) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x015b, code lost:
    
        r12 = (java.lang.String) r10.next();
        r13 = new java.io.File(r4, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x016a, code lost:
    
        if (r13.exists() == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0170, code lost:
    
        if (i(r13, r4) == false) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0172, code lost:
    
        r14 = new java.io.File(r9, r12);
        r15 = r14.getParentFile();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x017b, code lost:
    
        if (r15 == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x017d, code lost:
    
        r15.mkdirs();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0181, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x018e, code lost:
    
        r21 = r9;
        r27 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0193, code lost:
    
        java.nio.file.Files.move(r13.toPath(), r14.toPath(), new java.nio.file.CopyOption[0]);
        r3.add(new defpackage.r32(r12, r14));
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a4, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01b0, code lost:
    
        throw new defpackage.cv(r6, "CLEO package contains an unsafe existing path");
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01b1, code lost:
    
        r21 = r9;
        r27 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01b5, code lost:
    
        r10 = r27;
        r9 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01ba, code lost:
    
        r21 = r9;
        r6 = r7.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c1, code lost:
    
        if (r9 >= r6) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c3, code lost:
    
        r10 = r7.get(r9);
        r9 = r9 + 1;
        r10 = (java.lang.String) r10;
        r12 = new java.io.File(r8, r10);
        r13 = new java.io.File(r4, r10);
        r10 = r13.getParentFile();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01d9, code lost:
    
        if (r10 == null) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01db, code lost:
    
        r10.mkdirs();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01de, code lost:
    
        java.nio.file.Files.move(r12.toPath(), r13.toPath(), new java.nio.file.CopyOption[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01ed, code lost:
    
        defpackage.vx.g0(r2, new defpackage.im(2, r0));
        r2.add(new defpackage.mw(r0, r26, r7));
        r1.q(r2);
        r0 = r11.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0207, code lost:
    
        defpackage.em0.W(r8);
        defpackage.em0.W(r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x020d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0217, code lost:
    
        throw new defpackage.cv(r13, "Unable to create CLEO backup directory");
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0218, code lost:
    
        r2 = r7.size();
        r9 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(File file, String str, String str2, lw lwVar) throws Throwable {
        ZipInputStream zipInputStream;
        dv dvVar;
        long j;
        int i;
        Throwable th;
        ZipEntry nextEntry;
        zj zjVar;
        dv dvVar2;
        nw nwVar = this;
        String str3 = str;
        lw lwVar2 = lwVar;
        dv dvVar3 = dv.j;
        boolean zIsFile = file.isFile();
        dv dvVar4 = dv.i;
        if (!zIsFile || file.length() > 33554432) {
            throw new cv(dvVar4, "CLEO package is missing or too large");
        }
        boolean zC = f.c(str3);
        dv dvVar5 = dv.l;
        if (!zC) {
            throw new cv(dvVar5, "Invalid CLEO package id");
        }
        File file2 = nwVar.b;
        d(file2);
        File file3 = nwVar.d;
        d(file3);
        File file4 = new File(file3, UUID.randomUUID().toString());
        File file5 = new File(file3, file4.getName() + "-backup");
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList2 = new ArrayList();
        try {
            boolean zMkdirs = file4.mkdirs();
            dv dvVar6 = dv.g;
            try {
                if (!zMkdirs) {
                    throw new cv(dvVar6, "Unable to create CLEO staging directory");
                }
                try {
                    try {
                        dvVar = dvVar3;
                        try {
                            zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(file), 8192));
                            j = 0;
                            i = 0;
                        } catch (ZipException e) {
                            e = e;
                            dvVar3 = dvVar;
                        }
                    } catch (cv e2) {
                        throw e2;
                    }
                } catch (ZipException e3) {
                    e = e3;
                }
                while (true) {
                    try {
                        nextEntry = zipInputStream.getNextEntry();
                        zjVar = lw.g;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    if (nextEntry == null) {
                        break;
                    }
                    File file6 = file5;
                    int i2 = i + 1;
                    if (i2 > 128) {
                        throw new cv(dvVar4, "CLEO package contains too many files");
                    }
                    try {
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    if (nextEntry.isDirectory()) {
                        try {
                            zipInputStream.closeEntry();
                            str3 = str;
                            i = i2;
                            file5 = file6;
                        } catch (Throwable th4) {
                            th = th4;
                            dvVar3 = dvVar;
                        }
                    } else {
                        String name = nextEntry.getName();
                        name.getClass();
                        String strK = k(name);
                        try {
                            String strD0 = y93.D0(strK, '.', "");
                            Locale locale = Locale.ROOT;
                            String lowerCase = strD0.toLowerCase(locale);
                            lowerCase.getClass();
                            if (!g.contains(lowerCase)) {
                                throw new cv(dvVar, "CLEO package contains an unsupported file");
                            }
                            locale.getClass();
                            String lowerCase2 = strK.toLowerCase(locale);
                            lowerCase2.getClass();
                            if (!linkedHashSet.add(lowerCase2)) {
                                throw new cv(dvVar, "CLEO package contains duplicate files");
                            }
                            File file7 = new File(file4, strK);
                            if (!i(file7, file4)) {
                                throw new cv(dvVar5, "CLEO package contains an unsafe path");
                            }
                            File parentFile = file7.getParentFile();
                            if (parentFile != null) {
                                parentFile.mkdirs();
                            }
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(file7);
                                File file8 = file2;
                                try {
                                    long jA = a(zipInputStream, fileOutputStream, 16777216L, dvVar4);
                                    fileOutputStream.close();
                                    j += jA;
                                    if (j > 67108864) {
                                        throw new cv(dvVar4, "CLEO package expands beyond the allowed size");
                                    }
                                    arrayList.add(strK);
                                    zjVar.getClass();
                                    if (zj.g(strK) != null) {
                                        if (y93.i0(strK, '/')) {
                                            throw new cv(dvVar, "CLEO scripts must be at the package root");
                                        }
                                        arrayList2.add(strK);
                                    }
                                    dvVar3 = dvVar;
                                    try {
                                        zipInputStream.closeEntry();
                                        i = i2;
                                        str3 = str;
                                        lwVar2 = lwVar;
                                        file2 = file8;
                                        dvVar = dvVar3;
                                        file5 = file6;
                                        nwVar = this;
                                    } catch (Throwable th5) {
                                        th = th5;
                                    }
                                } catch (Throwable th6) {
                                    dvVar2 = dvVar;
                                    try {
                                        throw th6;
                                    } catch (Throwable th7) {
                                        try {
                                            uq.l(fileOutputStream, th6);
                                            throw th7;
                                        } catch (cv e4) {
                                            throw e4;
                                        } catch (Exception e5) {
                                            e = e5;
                                            throw new cv(dvVar2, "Unable to read CLEO package entry", e);
                                        }
                                    }
                                }
                            } catch (cv e6) {
                                throw e6;
                            } catch (Exception e7) {
                                e = e7;
                                dvVar2 = dvVar;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            dvVar3 = dvVar;
                        }
                        dvVar3 = dvVar;
                        th = th;
                        try {
                            throw th;
                        } catch (Throwable th9) {
                            try {
                                uq.l(zipInputStream, th);
                                throw th9;
                            } catch (cv e8) {
                                throw e8;
                            } catch (ZipException e9) {
                                e = e9;
                            }
                        }
                    }
                    throw new cv(dvVar3, "Invalid CLEO ZIP package", e);
                }
            } catch (Throwable th10) {
                th = th10;
                em0.W(file4);
                em0.W(file5);
                throw th;
            }
        } catch (Throwable th11) {
            th = th11;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List j() {
        File file = this.b;
        if (!file.isDirectory()) {
            return ni0.f;
        }
        List<mw> listN = n();
        ArrayList arrayList = new ArrayList();
        for (mw mwVar : listN) {
            List list = mwVar.c;
            ArrayList arrayList2 = new ArrayList(rx.d0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(new r32((String) it.next(), mwVar));
            }
            vx.f0(arrayList, arrayList2);
        }
        Map mapA0 = om1.a0(arrayList);
        File[] fileArrListFiles = file.listFiles();
        int i = 0;
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        ArrayList arrayList3 = new ArrayList();
        for (File file2 : fileArrListFiles) {
            if (file2.isFile() && !Files.isSymbolicLink(file2.toPath())) {
                arrayList3.add(file2);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList3.size();
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            File file3 = (File) obj;
            String name = file3.getName();
            name.getClass();
            lw.g.getClass();
            lw lwVarG = zj.g(name);
            if (lwVarG != null) {
                mw mwVar2 = (mw) mapA0.get(file3.getName());
                String name2 = file3.getName();
                name2.getClass();
                x31Var = new x31(name2, lwVarG, file3.length(), file3.lastModified(), mwVar2 != null ? mwVar2.a : null, mwVar2 != null ? mwVar2.b : null);
            }
            if (x31Var != null) {
                arrayList4.add(x31Var);
            }
        }
        String.CASE_INSENSITIVE_ORDER.getClass();
        return qx.G0(arrayList4, new up0(9));
    }

    public final String l(Uri uri) throws IOException {
        Cursor cursorQuery = this.a.query(uri, new String[]{"_display_name"}, null, null, null);
        if (cursorQuery != null) {
            try {
                int columnIndex = cursorQuery.getColumnIndex("_display_name");
                String string = (columnIndex < 0 || !cursorQuery.moveToFirst()) ? null : cursorQuery.getString(columnIndex);
                cursorQuery.close();
                if (string != null) {
                    if (y93.q0(string)) {
                        string = null;
                    }
                    if (string != null) {
                        return string;
                    }
                }
            } finally {
            }
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment != null) {
            String strD0 = y93.D0(lastPathSegment, '/', lastPathSegment);
            if (!y93.q0(strD0)) {
                return strD0;
            }
        }
        return null;
    }

    public final long m(Uri uri) throws IOException {
        Cursor cursorQuery = this.a.query(uri, new String[]{"_size"}, null, null, null);
        long j = -1;
        if (cursorQuery == null) {
            return -1L;
        }
        try {
            int columnIndex = cursorQuery.getColumnIndex("_size");
            if (columnIndex >= 0 && cursorQuery.moveToFirst() && !cursorQuery.isNull(columnIndex)) {
                j = cursorQuery.getLong(columnIndex);
            }
            cursorQuery.close();
            return j;
        } finally {
        }
    }

    public final List n() {
        Object qn2Var;
        Object qn2Var2;
        File file = this.c;
        boolean zIsFile = file.isFile();
        ni0 ni0Var = ni0.f;
        if (!zIsFile || file.length() > 262144) {
            return ni0Var;
        }
        try {
            JSONArray jSONArrayOptJSONArray = new JSONObject(em0.Z(file, ys.a)).optJSONArray("packages");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
            }
            ai1 ai1VarX = vr.x();
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("id");
                    uk2 uk2Var = f;
                    strOptString.getClass();
                    List listR = null;
                    if (!uk2Var.c(strOptString)) {
                        strOptString = null;
                    }
                    if (strOptString != null) {
                        String strOptString2 = jSONObjectOptJSONObject.optString("version");
                        strOptString2.getClass();
                        if (y93.q0(strOptString2)) {
                            strOptString2 = null;
                        }
                        if (strOptString2 == null) {
                            strOptString2 = "local";
                        }
                        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("files");
                        if (jSONArrayOptJSONArray2 != null) {
                            ai1 ai1VarX2 = vr.x();
                            int length2 = jSONArrayOptJSONArray2.length();
                            for (int i2 = 0; i2 < length2; i2++) {
                                String strOptString3 = jSONArrayOptJSONArray2.optString(i2);
                                strOptString3.getClass();
                                if (!y93.q0(strOptString3)) {
                                    try {
                                        qn2Var2 = k(strOptString3);
                                    } catch (Throwable th) {
                                        qn2Var2 = new qn2(th);
                                    }
                                    if (!(qn2Var2 instanceof qn2)) {
                                        ai1VarX2.add(strOptString3);
                                    }
                                }
                            }
                            listR = vr.r(ai1VarX2);
                        }
                        if (listR == null) {
                            listR = ni0Var;
                        }
                        if (!listR.isEmpty()) {
                            ai1VarX.add(new mw(strOptString, strOptString2, listR));
                        }
                    }
                }
            }
            qn2Var = vr.r(ai1VarX);
        } catch (Throwable th2) {
            qn2Var = new qn2(th2);
        }
        Object obj = ni0Var;
        if (!(qn2Var instanceof qn2)) {
            obj = qn2Var;
        }
        return (List) obj;
    }

    public final void q(List list) throws JSONException, IOException {
        File file = this.c;
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (hashSet.add(((mw) obj).a)) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            mw mwVar = (mw) obj2;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", mwVar.a);
            jSONObject2.put("version", mwVar.b);
            jSONObject2.put("files", new JSONArray((Collection) mwVar.c));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("packages", jSONArray);
        File fileCreateTempFile = File.createTempFile("packages-", ".tmp", file.getParentFile());
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            try {
                String string = jSONObject.toString();
                string.getClass();
                byte[] bytes = string.getBytes(ys.a);
                bytes.getClass();
                fileOutputStream.write(bytes);
                fileOutputStream.getFD().sync();
                fileOutputStream.close();
                try {
                    Files.move(fileCreateTempFile.toPath(), file.toPath(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
                } catch (AtomicMoveNotSupportedException unused) {
                    Files.move(fileCreateTempFile.toPath(), file.toPath(), StandardCopyOption.REPLACE_EXISTING);
                }
            } finally {
            }
        } finally {
            fileCreateTempFile.delete();
        }
    }
}
