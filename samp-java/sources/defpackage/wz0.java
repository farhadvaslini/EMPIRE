package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class wz0 implements Closeable {
    public static final pz2 E;
    public final pi A;
    public final e01 B;
    public final gw C;
    public final LinkedHashSet D;
    public final uz0 f;
    public final LinkedHashMap g = new LinkedHashMap();
    public final String h;
    public int i;
    public int j;
    public boolean k;
    public final id3 l;
    public final hd3 m;
    public final hd3 n;
    public final hd3 o;
    public final m22 p;
    public long q;
    public long r;
    public long s;
    public long t;
    public final hn0 u;
    public final pz2 v;
    public pz2 w;
    public final al3 x;
    public long y;
    public long z;

    static {
        pz2 pz2Var = new pz2();
        pz2Var.b(4, 65535);
        pz2Var.b(5, 16384);
        E = pz2Var;
    }

    public wz0(qk qkVar) {
        this.f = (uz0) qkVar.d;
        String str = (String) qkVar.c;
        if (str == null) {
            s51.F("connectionName");
            throw null;
        }
        this.h = str;
        this.j = 3;
        id3 id3Var = (id3) qkVar.a;
        this.l = id3Var;
        this.m = id3Var.d();
        this.n = id3Var.d();
        this.o = id3Var.d();
        this.p = m22.j;
        this.u = (hn0) qkVar.e;
        pz2 pz2Var = new pz2();
        pz2Var.b(4, 16777216);
        this.v = pz2Var;
        this.w = E;
        this.x = new al3(0);
        this.z = r0.a();
        pi piVar = (pi) qkVar.b;
        if (piVar == null) {
            s51.F("socket");
            throw null;
        }
        this.A = piVar;
        this.B = new e01((dj2) piVar.i);
        this.C = new gw(this, new zz0((ej2) piVar.h));
        this.D = new LinkedHashSet();
    }

    public final void b(nj0 nj0Var, nj0 nj0Var2, IOException iOException) {
        int i;
        Object[] array;
        TimeZone timeZone = lv3.a;
        try {
            h(nj0Var);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.g.isEmpty()) {
                array = null;
            } else {
                array = this.g.values().toArray(new d01[0]);
                this.g.clear();
            }
        }
        d01[] d01VarArr = (d01[]) array;
        if (d01VarArr != null) {
            for (d01 d01Var : d01VarArr) {
                try {
                    d01Var.d(nj0Var2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.B.close();
        } catch (IOException unused3) {
        }
        try {
            ((Socket) ((pl) this.A.g).g).close();
        } catch (IOException unused4) {
        }
        this.m.e();
        this.n.e();
        this.o.e();
    }

    public final d01 c(int i) {
        d01 d01Var;
        synchronized (this) {
            d01Var = (d01) this.g.get(Integer.valueOf(i));
        }
        return d01Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b(nj0.h, nj0.m, null);
    }

    public final d01 f(int i) {
        d01 d01Var;
        synchronized (this) {
            d01Var = (d01) this.g.remove(Integer.valueOf(i));
            notifyAll();
        }
        return d01Var;
    }

    public final void h(nj0 nj0Var) {
        synchronized (this.B) {
            synchronized (this) {
                if (this.k) {
                    return;
                }
                this.k = true;
                this.B.h(this.i, nj0Var, jv3.a);
            }
        }
    }

    public final void i(long j) {
        synchronized (this) {
            try {
                al3.c(this.x, j, 0L, 2);
                long jB = this.x.b();
                if (jB >= this.v.a() / 2) {
                    m(0, jB);
                    al3.c(this.x, 0L, jB, 1);
                }
                hn0 hn0Var = this.u;
                al3 al3Var = this.x;
                hn0Var.getClass();
                al3Var.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.B.h);
        r6 = r2;
        r8.y += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(int r9, boolean r10, defpackage.hp r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            e01 r8 = r8.B
            r8.c(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L68
            monitor-enter(r8)
        L12:
            long r4 = r8.y     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            long r6 = r8.z     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L34
            java.util.LinkedHashMap r2 = r8.g     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            if (r2 == 0) goto L2c
            r8.wait()     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            goto L12
        L2a:
            r9 = move-exception
            goto L66
        L2c:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            throw r9     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
        L34:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2a
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2a
            e01 r4 = r8.B     // Catch: java.lang.Throwable -> L2a
            int r4 = r4.h     // Catch: java.lang.Throwable -> L2a
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2a
            long r4 = r8.y     // Catch: java.lang.Throwable -> L2a
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2a
            long r4 = r4 + r6
            r8.y = r4     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)
            long r12 = r12 - r6
            e01 r4 = r8.B
            if (r10 == 0) goto L54
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L54
            r5 = 1
            goto L55
        L54:
            r5 = r3
        L55:
            r4.c(r5, r9, r11, r2)
            goto Ld
        L59:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2a
            r9.interrupt()     // Catch: java.lang.Throwable -> L2a
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2a
            r9.<init>()     // Catch: java.lang.Throwable -> L2a
            throw r9     // Catch: java.lang.Throwable -> L2a
        L66:
            monitor-exit(r8)
            throw r9
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wz0.j(int, boolean, hp, long):void");
    }

    public final void k(int i, nj0 nj0Var) {
        hd3.b(this.m, this.h + '[' + i + "] writeSynReset", new qz0(this, i, nj0Var));
    }

    public final void m(final int i, final long j) {
        hd3.b(this.m, this.h + '[' + i + "] windowUpdate", new cs0() { // from class: pz0
            @Override // defpackage.cs0
            public final Object a() {
                wz0 wz0Var = this.f;
                try {
                    wz0Var.B.m(i, j);
                } catch (IOException e) {
                    nj0 nj0Var = nj0.i;
                    wz0Var.b(nj0Var, nj0Var, e);
                }
                return dm3.a;
            }
        });
    }
}
