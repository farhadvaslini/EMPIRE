package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ul2 {
    public static final uk2 f = new uk2("bytes (\\d+)-(\\d+)/(\\d+|\\*)");
    public final my1 a;
    public final my1 b;
    public volatile ij2 c;
    public final Set d;
    public final int e;

    public ul2() {
        ly1 ly1Var = new ly1();
        ly1Var.a(30L);
        ly1Var.b(30L);
        my1 my1Var = new my1(ly1Var);
        this.a = my1Var;
        ly1 ly1Var2 = new ly1();
        ly1Var2.a = my1Var.a;
        ly1Var2.b = my1Var.C;
        vx.f0(ly1Var2.c, my1Var.b);
        vx.f0(ly1Var2.d, my1Var.c);
        ly1Var2.e = my1Var.d;
        ly1Var2.f = my1Var.e;
        ly1Var2.g = my1Var.f;
        ly1Var2.h = my1Var.g;
        ly1Var2.k = my1Var.j;
        ly1Var2.l = my1Var.k;
        ly1Var2.m = my1Var.l;
        ly1Var2.n = my1Var.m;
        ly1Var2.o = my1Var.n;
        ly1Var2.p = my1Var.o;
        ly1Var2.q = my1Var.p;
        ly1Var2.r = my1Var.q;
        ly1Var2.s = my1Var.r;
        ly1Var2.t = my1Var.s;
        ly1Var2.u = my1Var.t;
        ly1Var2.v = my1Var.u;
        ly1Var2.w = my1Var.v;
        ly1Var2.x = my1Var.w;
        ly1Var2.y = my1Var.x;
        ly1Var2.z = my1Var.y;
        ly1Var2.A = my1Var.z;
        ly1Var2.B = my1Var.A;
        ly1Var2.C = my1Var.B;
        ly1Var2.i = false;
        ly1Var2.j = false;
        this.b = new my1(ly1Var2);
        this.d = oz2.L(301, 302, 303, 307, 308);
        this.e = 5;
    }

    public static final void c(pk2 pk2Var, pk2 pk2Var2, pk2 pk2Var3, ad0 ad0Var, long j) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = jCurrentTimeMillis - pk2Var.f;
        if (j2 >= 300) {
            double d = j2 / 1000.0d;
            ad0Var.e(new cd0(pk2Var2.f, j, d > 0.0d ? (long) ((r5 - pk2Var3.f) / d) : 0L));
            pk2Var.f = jCurrentTimeMillis;
            pk2Var3.f = pk2Var2.f;
        }
    }

    public static tl2 e(String str) {
        sm1 sm1VarB;
        Long lG0;
        if (str == null || (sm1VarB = f.b(str)) == null || (lG0 = fa3.g0((String) ((qm1) sm1VarB.a()).get(1))) == null) {
            return null;
        }
        long jLongValue = lG0.longValue();
        Long lG02 = fa3.g0((String) ((qm1) sm1VarB.a()).get(2));
        if (lG02 == null) {
            return null;
        }
        long jLongValue2 = lG02.longValue();
        Long lG03 = fa3.g0((String) ((qm1) sm1VarB.a()).get(3));
        long jLongValue3 = lG03 != null ? lG03.longValue() : -1L;
        if (jLongValue2 < jLongValue) {
            return null;
        }
        if (jLongValue3 < 0 || jLongValue2 < jLongValue3) {
            return new tl2(jLongValue, jLongValue3);
        }
        return null;
    }

    public final void a(String str, File file, String str2, long j, boolean z, ad0 ad0Var) {
        ij2 ij2Var;
        File file2;
        long jB;
        boolean z2;
        pk2 pk2Var;
        pk2 pk2Var2;
        InputStream inputStreamA;
        Object obj;
        long j2;
        int i;
        int i2;
        str.getClass();
        file.getClass();
        str2.getClass();
        if (j <= 0) {
            c.p("Maximum download size must be positive");
            return;
        }
        try {
            try {
                pk2 pk2Var3 = new pk2();
                File file3 = new File(file.getParentFile(), file.getName() + ".tmp");
                if (file3.exists()) {
                    try {
                        pk2Var3.f = file3.length();
                    } catch (Throwable th) {
                        th = th;
                        ij2Var = null;
                        this.c = ij2Var;
                        throw th;
                    }
                }
                if (pk2Var3.f > j) {
                    file3.delete();
                    ad0Var.f("Downloaded file is too large");
                    this.c = null;
                    return;
                }
                pl plVar = new pl(7);
                plVar.E(str);
                long j3 = pk2Var3.f;
                if (j3 > 0) {
                    String str3 = "bytes=" + j3 + "-";
                    tx0 tx0Var = (tx0) plVar.i;
                    tx0Var.getClass();
                    d32.r("Range");
                    d32.s(str3, "Range");
                    d32.j(tx0Var, "Range", str3);
                }
                r32 r32VarD = d(new ll2(plVar), z);
                Object obj2 = r32VarD.f;
                Closeable closeable = (Closeable) r32VarD.g;
                try {
                    ln2 ln2Var = (ln2) closeable;
                    nn2 nn2Var = ln2Var.l;
                    int i3 = ln2Var.i;
                    if (i3 == 206) {
                        tl2 tl2VarE = e(ln2.b(ln2Var, "Content-Range"));
                        if (tl2VarE == null) {
                            throw new IllegalStateException("Invalid Content-Range response");
                        }
                        file2 = file3;
                        long j4 = tl2VarE.a;
                        long j5 = pk2Var3.f;
                        if (j4 != j5) {
                            file2.delete();
                            throw new IllegalStateException("Unexpected Content-Range start");
                        }
                        z2 = j5 > 0;
                        jB = tl2VarE.b;
                    } else {
                        file2 = file3;
                        if (!ln2Var.u) {
                            ad0Var.f("HTTP " + i3);
                            uq.l(closeable, null);
                            this.c = null;
                            return;
                        }
                        if (pk2Var3.f > 0) {
                            file2.delete();
                            pk2Var3.f = 0L;
                        }
                        jB = nn2Var.b();
                        z2 = false;
                    }
                    long j6 = jB;
                    if (j6 > j) {
                        file2.delete();
                        ad0Var.f("Downloaded file is too large");
                        uq.l(closeable, null);
                        this.c = null;
                        return;
                    }
                    pk2 pk2Var4 = new pk2();
                    pk2Var4.f = System.currentTimeMillis();
                    pk2 pk2Var5 = new pk2();
                    pk2Var5.f = pk2Var3.f;
                    byte[] bArr = new byte[8192];
                    if (z2) {
                        RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
                        try {
                            randomAccessFile.seek(pk2Var3.f);
                            inputStreamA = nn2Var.f().A();
                        } finally {
                        }
                        while (!((ij2) obj2).v && (i2 = inputStreamA.read(bArr)) != -1) {
                            try {
                                pk2 pk2Var6 = pk2Var5;
                                long j7 = i2;
                                if (j7 > j - pk2Var3.f) {
                                    file2.delete();
                                    ad0Var.f("Downloaded file is too large");
                                    inputStreamA.close();
                                    randomAccessFile.close();
                                    uq.l(closeable, null);
                                    this.c = null;
                                    return;
                                }
                                randomAccessFile.write(bArr, 0, i2);
                                pk2Var3.f += j7;
                                pk2 pk2Var7 = pk2Var3;
                                long j8 = j6;
                                c(pk2Var4, pk2Var7, pk2Var6, ad0Var, j8);
                                j6 = j8;
                                pk2Var5 = pk2Var6;
                                pk2Var3 = pk2Var7;
                            } finally {
                            }
                        }
                        pk2Var = pk2Var3;
                        pk2Var2 = pk2Var5;
                        inputStreamA.close();
                        randomAccessFile.close();
                        obj = obj2;
                        j2 = j6;
                    } else {
                        pk2Var = pk2Var3;
                        pk2Var2 = pk2Var5;
                        Object obj3 = obj2;
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        try {
                            inputStreamA = nn2Var.f().A();
                        } finally {
                        }
                        while (!((ij2) obj3).v && (i = inputStreamA.read(bArr)) != -1) {
                            try {
                                Object obj4 = obj3;
                                long j9 = i;
                                if (j9 > j - pk2Var.f) {
                                    file2.delete();
                                    ad0Var.f("Downloaded file is too large");
                                    inputStreamA.close();
                                    fileOutputStream.close();
                                    uq.l(closeable, null);
                                    this.c = null;
                                    return;
                                }
                                fileOutputStream.write(bArr, 0, i);
                                pk2Var.f += j9;
                                long j10 = j6;
                                c(pk2Var4, pk2Var, pk2Var2, ad0Var, j10);
                                obj3 = obj4;
                                j6 = j10;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        }
                        obj = obj3;
                        j2 = j6;
                        inputStreamA.close();
                        fileOutputStream.close();
                    }
                    if (((ij2) obj).v) {
                        uq.l(closeable, null);
                        this.c = null;
                        return;
                    }
                    if (j2 >= 0) {
                        long j11 = pk2Var.f;
                        if (j11 != j2) {
                            if (j11 > j2) {
                                file2.delete();
                            }
                            throw new IllegalStateException("Downloaded size does not match the server response");
                        }
                    }
                    double dCurrentTimeMillis = (System.currentTimeMillis() - pk2Var4.f) / 1000.0d;
                    ad0Var.e(new cd0(pk2Var.f, j2, dCurrentTimeMillis > 0.0d ? (long) ((r2 - pk2Var2.f) / dCurrentTimeMillis) : 0L));
                    if (!y93.q0(str2)) {
                        String strK = uq.K(file2);
                        if (!strK.equalsIgnoreCase(str2)) {
                            file2.delete();
                            ad0Var.f("Checksum mismatch: expected " + str2 + ", got " + strK);
                            uq.l(closeable, null);
                            this.c = null;
                            return;
                        }
                    }
                    Files.move(file2.toPath(), file.toPath(), StandardCopyOption.REPLACE_EXISTING);
                    ad0Var.a(file);
                    uq.l(closeable, null);
                    this.c = null;
                } finally {
                }
            } catch (Exception e) {
                ij2 ij2Var2 = this.c;
                if (ij2Var2 == null || !ij2Var2.v) {
                    String message = e.getMessage();
                    if (message == null) {
                        message = "Unknown error";
                    }
                    ad0Var.f(message);
                }
                this.c = null;
            }
        } catch (Throwable th2) {
            th = th2;
            ij2Var = null;
        }
    }

    public final r32 d(ll2 ll2Var, boolean z) {
        if (z && !ll2Var.a.f()) {
            c.q("Download URL must use HTTPS");
            return null;
        }
        int i = this.e + 1;
        int i2 = 0;
        while (i2 < i) {
            my1 my1Var = z ? this.b : this.a;
            my1Var.getClass();
            ij2 ij2Var = new ij2(my1Var, ll2Var);
            this.c = ij2Var;
            ln2 ln2VarF = ij2Var.f();
            if (!z || !this.d.contains(Integer.valueOf(ln2VarF.i))) {
                return new r32(ij2Var, ln2VarF);
            }
            String strB = ln2.b(ln2VarF, "Location");
            if (strB == null) {
                return new r32(ij2Var, ln2VarF);
            }
            if (i2 >= this.e) {
                ln2VarF.close();
                c.q("Too many HTTPS redirects");
                return null;
            }
            i01 i01VarH = ll2Var.a.h(strB);
            if (i01VarH == null || !i01VarH.f()) {
                ln2VarF.close();
                c.q("Invalid HTTPS redirect URL");
                return null;
            }
            ln2VarF.close();
            pl plVarA = ll2Var.a();
            plVarA.g = i01VarH;
            plVarA.s();
            i2++;
            ll2Var = new ll2(plVarA);
        }
        c.q("Too many HTTPS redirects");
        return null;
    }
}
