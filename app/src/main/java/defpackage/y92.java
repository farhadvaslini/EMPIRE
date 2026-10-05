package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipInputStream;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class y92 {
    public static volatile y92 j;
    public final File a;
    public final File b;
    public final File c;
    public final SharedPreferences d;
    public final dt1 e;
    public final i93 f;
    public final i93 g;
    public final i93 h;
    public static final h01 i = new h01(20);
    public static final uk2 k = new uk2("^[0-9a-fA-F]{64}$");

    public y92(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.a = new File(applicationContext.getFilesDir(), "plugins");
        this.b = new File(applicationContext.getFilesDir(), "plugin-data");
        this.c = new File(applicationContext.getCacheDir(), "plugin-staging");
        this.d = applicationContext.getSharedPreferences("plugin_repository", 0);
        this.e = new dt1();
        xa3 xa3VarF = jo3.f();
        j90 j90Var = ac0.a;
        n40 n40VarC = ur.c(pq.Q(xa3VarF, x80.h));
        i93 i93VarE = s51.e(ni0.f);
        this.f = i93VarE;
        this.g = i93VarE;
        this.h = s51.e(Boolean.FALSE);
        cl3.t(n40VarC, null, new l(this, null, 26), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01e9 A[Catch: all -> 0x01ee, PHI: r1
      0x01e9: PHI (r1v31 java.lang.Object) = (r1v30 java.lang.Object), (r1v35 java.lang.Object) binds: [B:127:0x026d, B:107:0x01e7] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {all -> 0x01ee, blocks: (B:3:0x001e, B:5:0x0024, B:106:0x01e0, B:108:0x01e9, B:126:0x0266, B:142:0x029c, B:144:0x02a5, B:145:0x02a8, B:146:0x02a9, B:147:0x02b0, B:7:0x0045, B:9:0x004b, B:12:0x0052, B:15:0x0059, B:16:0x0060, B:19:0x0064, B:21:0x0072, B:23:0x0082, B:24:0x0088, B:27:0x0094, B:30:0x009b, B:31:0x00a2, B:33:0x00a5, B:36:0x00ac, B:37:0x00b3, B:39:0x00b6, B:42:0x00bf, B:43:0x00c6, B:44:0x00c7, B:46:0x00d4, B:48:0x00da, B:50:0x00e5, B:51:0x00ef, B:53:0x00f5, B:57:0x0108, B:59:0x010c, B:62:0x0114, B:64:0x011a, B:67:0x0125, B:69:0x012b, B:72:0x0132, B:73:0x0139, B:74:0x013a, B:75:0x013f, B:76:0x0140, B:77:0x0145, B:78:0x0146, B:80:0x0151, B:83:0x015e, B:84:0x0163, B:85:0x0164, B:87:0x016f, B:90:0x017c, B:95:0x018b, B:98:0x019d, B:100:0x01a3, B:101:0x01c7, B:103:0x01cd, B:105:0x01de, B:112:0x01f1, B:113:0x01f6, B:114:0x01f7, B:115:0x01fe, B:116:0x01ff, B:117:0x0209, B:120:0x0229, B:121:0x024d, B:123:0x0253, B:125:0x0264, B:129:0x0271, B:130:0x0276, B:119:0x021c, B:131:0x0277, B:132:0x027c, B:133:0x027d, B:134:0x0284, B:136:0x0286, B:137:0x028b, B:138:0x028c, B:139:0x0293, B:140:0x0294, B:141:0x029b), top: B:234:0x001e, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final j82 a(y92 y92Var, InputStream inputStream, String str, String str2, String str3, String str4, String str5) throws Throwable {
        Object qn2Var;
        Object next;
        SharedPreferences sharedPreferences = y92Var.d;
        i93 i93Var = y92Var.f;
        File file = y92Var.c;
        File file2 = y92Var.a;
        try {
            if (!fa3.Y(str, ".splug", true)) {
                throw new IllegalArgumentException("Plugin package must use the .splug extension");
            }
            file2.mkdirs();
            file.mkdirs();
            String string = UUID.randomUUID().toString();
            string.getClass();
            File file3 = new File(file, string.concat(".splug"));
            File file4 = new File(file, string);
            try {
                String strD = d(file3, inputStream);
                if (str2 != null && !y93.q0(str2) && !strD.equalsIgnoreCase(str2)) {
                    throw new IllegalArgumentException("Plugin package checksum mismatch");
                }
                e(file3, file4);
                if (!new File(file4, "manifest.json").isFile()) {
                    throw new IllegalArgumentException("Plugin package must contain manifest.json at the archive root");
                }
                File file5 = new File(file4, "manifest.json");
                if (file5.length() > 131072) {
                    throw new IllegalArgumentException("Plugin manifest is too large");
                }
                String strZ = em0.Z(file5, ys.a);
                try {
                    uk2 uk2Var = k82.l;
                    k82 k82VarE = oz2.E(strZ);
                    String str6 = k82VarE.d;
                    String str7 = k82VarE.b;
                    if (str3 != null && !s51.n(str7, str3)) {
                        throw new IllegalArgumentException("Plugin package id does not match the catalog");
                    }
                    if (str4 != null && !s51.n(str6, str4)) {
                        throw new IllegalArgumentException("Plugin package version does not match the catalog");
                    }
                    if (str5 != null && !k82VarE.e.equals(str5)) {
                        throw new IllegalArgumentException("Plugin package API version does not match the catalog");
                    }
                    File file6 = new File(file4, k82VarE.f);
                    if (!file6.isFile() || !g(file6, file4) || file6.length() > 2097152) {
                        throw new IllegalArgumentException("Plugin entry file is missing or too large");
                    }
                    Iterator it = ((Iterable) i93Var.getValue()).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (s51.n(((y31) next).a.b, str7)) {
                            break;
                        }
                    }
                    y31 y31Var = (y31) next;
                    String str8 = y31Var != null ? y31Var.a.d : null;
                    if (str8 != null && !s51.n(str6, str8)) {
                        str6.getClass();
                        ou2 ou2VarU = n32.u(str6, false);
                        if (ou2VarU == null) {
                            throw new IllegalStateException("Invalid semantic version");
                        }
                        ou2 ou2VarU2 = n32.u(str8, false);
                        if (ou2VarU2 == null) {
                            throw new IllegalStateException("Invalid semantic version");
                        }
                        if (ou2VarU.compareTo(ou2VarU2) <= 0) {
                            throw new IllegalArgumentException("Plugin downgrade is not supported");
                        }
                    }
                    File file7 = new File(file2, str7);
                    if (!file7.exists() && y92Var.q().size() >= 64) {
                        throw new IllegalArgumentException("Too many plugins are installed");
                    }
                    File file8 = new File(file7, str6);
                    if (!g(file8, file2)) {
                        throw new IllegalArgumentException("Invalid plugin install path");
                    }
                    file7.mkdirs();
                    if (!file8.exists()) {
                        em0.a0(new File(file4, ".package-sha256"), strD, ys.d);
                        try {
                            Files.move(file4.toPath(), file8.toPath(), StandardCopyOption.ATOMIC_MOVE);
                        } catch (AtomicMoveNotSupportedException unused) {
                            Files.move(file4.toPath(), file8.toPath(), new CopyOption[0]);
                        }
                        sharedPreferences.getClass();
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.getClass();
                        editorEdit.remove(r(str7));
                        editorEdit.apply();
                        y92Var.i(file7);
                        y92Var.k();
                        for (Object obj : (Iterable) i93Var.getValue()) {
                            if (s51.n(((y31) obj).a.b, str7)) {
                                qn2Var = (y31) obj;
                                file3.delete();
                                if (file4.exists()) {
                                }
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    File file9 = new File(file8, ".package-sha256");
                    if (!file9.isFile()) {
                        file9 = null;
                    }
                    if (!fa3.Z(file9 != null ? y93.G0(em0.Z(file9, ys.d)).toString() : null, strD, true)) {
                        throw new IllegalArgumentException("This plugin version is already installed with different contents");
                    }
                    sharedPreferences.getClass();
                    SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                    editorEdit2.getClass();
                    editorEdit2.remove(r(str7));
                    editorEdit2.apply();
                    y92Var.i(file7);
                    y92Var.k();
                    for (Object obj2 : (Iterable) i93Var.getValue()) {
                        if (s51.n(((y31) obj2).a.b, str7)) {
                            qn2Var = (y31) obj2;
                            file3.delete();
                            if (file4.exists()) {
                                em0.W(file4);
                            }
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                } catch (RuntimeException e) {
                    throw new l82(e);
                }
            } catch (Throwable th) {
                file3.delete();
                if (file4.exists()) {
                    em0.W(file4);
                }
                throw th;
            }
        } catch (Throwable th2) {
            qn2Var = new qn2(th2);
        }
        Throwable thA = rn2.a(qn2Var);
        if (thA == null) {
            return new i82((y31) qn2Var);
        }
        if (thA instanceof CancellationException) {
            throw thA;
        }
        boolean z = thA instanceof ZipException;
        g82 g82Var = g82.k;
        if (!z) {
            boolean z2 = thA instanceof l82;
            g82 g82Var2 = g82.m;
            if (z2) {
                Throwable cause = thA.getCause();
                String message = cause != null ? cause.getMessage() : null;
                g82Var = fa3.e0(message != null ? message : "", "Unsupported plugin API version", false) ? g82.n : g82Var2;
            } else {
                String message2 = thA.getMessage();
                String str9 = message2 != null ? message2 : "";
                if (y93.h0(str9, "must use the .splug extension", false)) {
                    g82Var = g82.f;
                } else if (y93.h0(str9, "checksum mismatch", false)) {
                    g82Var = g82.j;
                } else if (y93.h0(str9, "manifest.json at the archive root", false)) {
                    g82Var = g82.l;
                } else if (!y93.h0(str9, "manifest is too large", false)) {
                    if (y93.h0(str9, "package id does not match", false) || y93.h0(str9, "package version does not match", false) || y93.h0(str9, "package API version does not match", false)) {
                        g82Var = g82.o;
                    } else if (y93.h0(str9, "entry file is missing", false)) {
                        g82Var = g82.p;
                    } else if (y93.h0(str9, "downgrade is not supported", false)) {
                        g82Var = g82.q;
                    } else if (y93.h0(str9, "Too many plugins are installed", false)) {
                        g82Var = g82.r;
                    } else if (y93.h0(str9, "already installed with different contents", false)) {
                        g82Var = g82.s;
                    } else if (y93.h0(str9, "Unsafe plugin package path", false) || y93.h0(str9, "package path escapes", false) || y93.h0(str9, "Invalid plugin install path", false)) {
                        g82Var = g82.t;
                    } else if (!y93.h0(str9, "not a valid or non-empty ZIP archive", false)) {
                        g82Var = (y93.h0(str9, "too large", false) || y93.h0(str9, "too many files", false) || y93.h0(str9, "expands beyond", false)) ? g82.i : g82.u;
                    }
                }
            }
        }
        return new h82(g82Var);
    }

    public static String b(String str) {
        return by1.g("approved_permissions.", str);
    }

    public static String d(File file, InputStream inputStream) throws NoSuchAlgorithmException, IOException {
        FileOutputStream fileOutputStream;
        byte[] bArr;
        long j2;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                bArr = new byte[8192];
                j2 = 0;
            } finally {
            }
        } finally {
        }
        while (true) {
            int i2 = bufferedInputStream.read(bArr);
            if (i2 == -1) {
                fileOutputStream.close();
                bufferedInputStream.close();
                byte[] bArrDigest = messageDigest.digest();
                bArrDigest.getClass();
                return uj.W(bArrDigest, "", new s12(10), 30);
            }
            j2 += (long) i2;
            if (j2 > 33554432) {
                throw new IllegalArgumentException("Plugin package is too large");
            }
            messageDigest.update(bArr, 0, i2);
            fileOutputStream.write(bArr, 0, i2);
        }
    }

    public static void e(File file, File file2) throws IOException {
        file2.mkdirs();
        String str = file2.getCanonicalPath() + File.separator;
        int i2 = 8192;
        ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(file), 8192));
        int i3 = 0;
        long j2 = 0;
        while (true) {
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    zipInputStream.close();
                    if (i3 > 0) {
                        return;
                    }
                    c.p("Plugin package is not a valid or non-empty ZIP archive");
                    return;
                }
                i3++;
                if (i3 > 512) {
                    throw new IllegalArgumentException("Plugin package contains too many files");
                }
                String name = nextEntry.getName();
                name.getClass();
                String strW0 = y93.w0(name, "/");
                uk2 uk2Var = k82.l;
                if (!oz2.z(strW0)) {
                    throw new IllegalArgumentException("Unsafe plugin package path");
                }
                File file3 = new File(file2, strW0);
                String canonicalPath = file3.getCanonicalPath();
                canonicalPath.getClass();
                if (!fa3.e0(canonicalPath, str, false)) {
                    throw new IllegalArgumentException("Plugin package path escapes its directory");
                }
                if (nextEntry.isDirectory()) {
                    file3.mkdirs();
                } else {
                    long j3 = fa3.Y(strW0, ".lua", true) ? 2097152L : 16777216L;
                    File parentFile = file3.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                    try {
                        byte[] bArr = new byte[i2];
                        long j4 = 0;
                        while (true) {
                            int i4 = zipInputStream.read(bArr);
                            if (i4 == -1) {
                                fileOutputStream.close();
                                break;
                            }
                            long j5 = i4;
                            j4 += j5;
                            j2 += j5;
                            if (j4 > j3) {
                                throw new IllegalArgumentException("Plugin file is too large");
                            }
                            if (j2 > 67108864) {
                                throw new IllegalArgumentException("Plugin package expands beyond its size limit");
                            }
                            fileOutputStream.write(bArr, 0, i4);
                        }
                    } finally {
                    }
                }
                zipInputStream.closeEntry();
                i2 = 8192;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    uq.l(zipInputStream, th);
                    throw th2;
                }
            }
        }
    }

    public static boolean g(File file, File file2) throws IOException {
        String str = file2.getCanonicalPath() + File.separator;
        String canonicalPath = file.getCanonicalPath();
        canonicalPath.getClass();
        return fa3.e0(canonicalPath, str, false);
    }

    public static String r(String str) {
        return by1.g("selected_version.", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(q40 q40Var) {
        u92 u92Var;
        if (q40Var instanceof u92) {
            u92Var = (u92) q40Var;
            int i2 = u92Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u92Var.k = i2 - Integer.MIN_VALUE;
            } else {
                u92Var = new u92(this, q40Var);
            }
        }
        Object obj = u92Var.i;
        int i3 = u92Var.k;
        if (i3 == 0) {
            y02.Q(obj);
            t92 t92Var = new t92(this.h, 0);
            u92Var.k = 1;
            Object objE = lr.E(t92Var, u92Var);
            y50 y50Var = y50.f;
            if (objE == y50Var) {
                return y50Var;
            }
        } else {
            if (i3 != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y02.Q(obj);
        }
        return dm3.a;
    }

    public final boolean f(String str, List list) {
        String strB = b(str);
        SharedPreferences sharedPreferences = this.d;
        Set<String> set = si0.f;
        Set<String> stringSet = sharedPreferences.getStringSet(strB, set);
        if (stringSet != null) {
            set = stringSet;
        }
        return m22.n(list, set).c.isEmpty();
    }

    public final synchronized m92 h(String str) {
        Object next;
        try {
            str.getClass();
            Iterator it = ((Iterable) this.f.getValue()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (s51.n(((y31) next).a.b, str)) {
                    break;
                }
            }
            y31 y31Var = (y31) next;
            if (y31Var == null) {
                return null;
            }
            SharedPreferences sharedPreferences = this.d;
            String strB = b(str);
            Set<String> set = si0.f;
            Set<String> stringSet = sharedPreferences.getStringSet(strB, set);
            if (stringSet != null) {
                set = stringSet;
            }
            return m22.n(y31Var.a.i, set);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void i(File file) {
        r32 r32Var;
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        ArrayList arrayList = new ArrayList();
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                arrayList.add(file2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            File file3 = (File) obj;
            file3.getClass();
            y31 y31VarJ = j(file3);
            if (y31VarJ != null) {
                String str = y31VarJ.a.d;
                str.getClass();
                ou2 ou2VarU = n32.u(str, false);
                if (ou2VarU == null) {
                    c.q("Invalid semantic version");
                    return;
                }
                r32Var = new r32(file3, new la2(ou2VarU));
            } else {
                r32Var = null;
            }
            if (r32Var != null) {
                arrayList2.add(r32Var);
            }
        }
        Iterator it = qx.o0(2, qx.G0(arrayList2, new up0(12))).iterator();
        while (it.hasNext()) {
            File file4 = (File) ((r32) it.next()).f;
            file4.getClass();
            em0.W(file4);
        }
    }

    public final y31 j(File file) {
        Object qn2Var;
        try {
        } catch (Throwable th) {
            qn2Var = new qn2(th);
        }
        if (!g(file, this.a)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        File file2 = new File(file, "manifest.json");
        if (!file2.isFile() || file2.length() > 131072) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        uk2 uk2Var = k82.l;
        k82 k82VarE = oz2.E(em0.Z(file2, ys.a));
        if (!s51.n(file.getName(), k82VarE.d)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        File parentFile = file.getParentFile();
        if (!s51.n(parentFile != null ? parentFile.getName() : null, k82VarE.b)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        File file3 = new File(file, k82VarE.f);
        if (!file3.isFile() || !g(file3, file) || file3.length() > 2097152) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        File file4 = new File(file, ".package-sha256");
        if (!file4.isFile()) {
            file4 = null;
        }
        String string = file4 != null ? y93.G0(em0.Z(file4, ys.d)).toString() : null;
        if (string != null && !k.c(string)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        qn2Var = new y31(k82VarE, file, false, string);
        return (y31) (qn2Var instanceof qn2 ? null : qn2Var);
    }

    public final synchronized void k() {
        try {
            SharedPreferences sharedPreferences = this.d;
            Set<String> set = si0.f;
            Set<String> stringSet = sharedPreferences.getStringSet("enabled_plugin_ids", set);
            if (stringSet != null) {
                set = stringSet;
            }
            Set setR0 = qx.R0(set);
            List<y31> listQ = q();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listQ) {
                y31 y31Var = (y31) obj;
                if (setR0.contains(y31Var.a.b)) {
                    k82 k82Var = y31Var.a;
                    if (f(k82Var.b, k82Var.i)) {
                        arrayList.add(obj);
                    }
                }
            }
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj2 = arrayList.get(i2);
                i2++;
                hashSet.add(((y31) obj2).a.b);
            }
            if (!hashSet.equals(setR0)) {
                SharedPreferences sharedPreferences2 = this.d;
                sharedPreferences2.getClass();
                SharedPreferences.Editor editorEdit = sharedPreferences2.edit();
                editorEdit.getClass();
                editorEdit.putStringSet("enabled_plugin_ids", hashSet);
                editorEdit.apply();
            }
            i93 i93Var = this.f;
            ArrayList arrayList2 = new ArrayList(rx.d0(listQ, 10));
            for (y31 y31Var2 : listQ) {
                arrayList2.add(y31.a(y31Var2, hashSet.contains(y31Var2.a.b)));
            }
            i93Var.getClass();
            i93Var.j(null, arrayList2);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean l(String str, Set set) {
        Object next;
        try {
            str.getClass();
            Iterator it = ((Iterable) this.f.getValue()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (s51.n(((y31) next).a.b, str)) {
                    break;
                }
            }
            y31 y31Var = (y31) next;
            if (y31Var == null) {
                return false;
            }
            SharedPreferences sharedPreferences = this.d;
            String strB = b(str);
            Set<String> set2 = si0.f;
            Set<String> stringSet = sharedPreferences.getStringSet(strB, set2);
            if (stringSet != null) {
                set2 = stringSet;
            }
            if (!m22.m(y31Var.a.i, set2, set)) {
                return false;
            }
            SharedPreferences sharedPreferences2 = this.d;
            sharedPreferences2.getClass();
            SharedPreferences.Editor editorEdit = sharedPreferences2.edit();
            editorEdit.getClass();
            editorEdit.putStringSet(b(str), set);
            editorEdit.apply();
            k();
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean m(String str) {
        boolean z;
        str.getClass();
        z = false;
        if (h(str) != null) {
            if (!r3.c.isEmpty()) {
                z = true;
            }
        }
        return z;
    }

    public final synchronized ea2 n(String str) {
        Object next;
        ea2 da2Var;
        str.getClass();
        aa2 aa2VarO = o(str);
        if (aa2VarO == null) {
            return ca2.a;
        }
        SharedPreferences sharedPreferences = this.d;
        sharedPreferences.getClass();
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.getClass();
        editorEdit.putString(r(str), aa2VarO.c);
        editorEdit.apply();
        k();
        Iterator it = ((Iterable) this.f.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (s51.n(((y31) next).a.b, str)) {
                break;
            }
        }
        y31 y31Var = (y31) next;
        if (s51.n(y31Var != null ? y31Var.a.d : null, aa2VarO.c)) {
            da2Var = new da2(y31Var);
        } else {
            SharedPreferences sharedPreferences2 = this.d;
            sharedPreferences2.getClass();
            SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
            editorEdit2.getClass();
            editorEdit2.remove(r(str));
            editorEdit2.apply();
            k();
            da2Var = ba2.a;
        }
        return da2Var;
    }

    public final synchronized aa2 o(String str) {
        Object next;
        try {
            str.getClass();
            Iterator it = ((Iterable) this.f.getValue()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (s51.n(((y31) next).a.b, str)) {
                    break;
                }
            }
            y31 y31Var = (y31) next;
            if (y31Var == null) {
                return null;
            }
            File parentFile = y31Var.b.getParentFile();
            if (parentFile == null) {
                return null;
            }
            String str2 = y31Var.a.d;
            File[] fileArrListFiles = parentFile.listFiles();
            int i2 = 0;
            if (fileArrListFiles == null) {
                fileArrListFiles = new File[0];
            }
            ArrayList arrayList = new ArrayList();
            for (File file : fileArrListFiles) {
                if (file.isDirectory()) {
                    arrayList.add(file);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                y31 y31VarJ = j((File) obj);
                if (y31VarJ != null) {
                    arrayList2.add(y31VarJ);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            int size2 = arrayList2.size();
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                if (((y31) obj2).d != null) {
                    arrayList3.add(obj2);
                }
            }
            y31 y31Var2 = (y31) g12.a0(str2, arrayList3, new s12(11));
            if (y31Var2 == null) {
                return null;
            }
            return new aa2(str, y31Var.a.d, y31Var2.a.d);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final ArrayList p(Set set, f82 f82Var) {
        set.getClass();
        Iterable iterable = (Iterable) this.f.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (set.contains(((y31) obj).a.b)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj2 = arrayList.get(i3);
            i3++;
            k82 k82Var = ((y31) obj2).a;
            if (f(k82Var.b, k82Var.i)) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList2.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj3 = arrayList2.get(i4);
            i4++;
            y31 y31Var = (y31) obj3;
            if (y31Var.a.j.isEmpty() || y31Var.a.j.contains(f82Var.f)) {
                arrayList3.add(obj3);
            }
        }
        ArrayList arrayList4 = new ArrayList(rx.d0(arrayList3, 10));
        int size3 = arrayList3.size();
        while (i2 < size3) {
            Object obj4 = arrayList3.get(i2);
            i2++;
            y31 y31Var2 = (y31) obj4;
            k82 k82Var2 = y31Var2.a;
            File file = y31Var2.b;
            String str = k82Var2.b;
            String str2 = k82Var2.d;
            String str3 = k82Var2.e;
            String str4 = y31Var2.d;
            String absolutePath = new File(file, k82Var2.f).getAbsolutePath();
            absolutePath.getClass();
            String absolutePath2 = file.getAbsolutePath();
            absolutePath2.getClass();
            String absolutePath3 = new File(this.b, k82Var2.b).getAbsolutePath();
            absolutePath3.getClass();
            arrayList4.add(new fa2(str, str2, str3, str4, absolutePath, absolutePath2, absolutePath3, k82Var2.h, k82Var2.i));
        }
        return arrayList4;
    }

    public final List q() {
        File file = this.a;
        if (!file.isDirectory()) {
            return ni0.f;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        return pv2.L(new bm0(2, pv2.K(pv2.J(new bm0(2, new jm0(fileArrListFiles.length == 0 ? ri0.a : new vj(0, fileArrListFiles), true, new s12(12)), new up0(13)), new xc1(15, this)), 64), new up0(14)));
    }

    public final synchronized boolean s(String str, boolean z) {
        Object next;
        try {
            str.getClass();
            Iterator it = ((Iterable) this.f.getValue()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (s51.n(((y31) next).a.b, str)) {
                    break;
                }
            }
            y31 y31Var = (y31) next;
            if (y31Var == null) {
                return false;
            }
            if (z && !f(str, y31Var.a.i)) {
                return false;
            }
            SharedPreferences sharedPreferences = this.d;
            Set<String> set = si0.f;
            Set<String> stringSet = sharedPreferences.getStringSet("enabled_plugin_ids", set);
            if (stringSet != null) {
                set = stringSet;
            }
            Set<String> setQ0 = qx.Q0(set);
            if (z) {
                setQ0.add(str);
            } else {
                setQ0.remove(str);
            }
            SharedPreferences sharedPreferences2 = this.d;
            sharedPreferences2.getClass();
            SharedPreferences.Editor editorEdit = sharedPreferences2.edit();
            editorEdit.getClass();
            editorEdit.putStringSet("enabled_plugin_ids", setQ0);
            editorEdit.apply();
            i93 i93Var = this.f;
            Iterable<y31> iterable = (Iterable) i93Var.getValue();
            ArrayList arrayList = new ArrayList(rx.d0(iterable, 10));
            for (y31 y31VarA : iterable) {
                if (s51.n(y31VarA.a.b, str)) {
                    y31VarA = y31.a(y31VarA, z);
                }
                arrayList.add(y31VarA);
            }
            i93Var.j(null, arrayList);
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }
}
