package defpackage;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class d01 implements q73 {
    public final int f;
    public final wz0 g;
    public final al3 h;
    public long i;
    public long j;
    public final ArrayDeque k;
    public boolean l;
    public final b01 m;
    public final a01 n;
    public final c01 o;
    public final c01 p;
    public nj0 q;
    public IOException r;

    public d01(int i, wz0 wz0Var, boolean z, boolean z2, ux0 ux0Var) {
        wz0Var.getClass();
        this.f = i;
        this.g = wz0Var;
        this.h = new al3(i);
        this.j = wz0Var.w.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.k = arrayDeque;
        this.m = new b01(this, wz0Var.v.a(), z2);
        this.n = new a01(this, z);
        this.o = new c01(this);
        this.p = new c01(this);
        if (ux0Var == null) {
            if (h()) {
                return;
            }
            c.q("remotely-initiated streams should have headers");
            throw null;
        }
        if (h()) {
            c.q("locally-initiated streams shouldn't have headers yet");
            throw null;
        }
        arrayDeque.add(ux0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r2 = this;
            java.util.TimeZone r0 = defpackage.lv3.a
            monitor-enter(r2)
            b01 r0 = r2.m     // Catch: java.lang.Throwable -> L18
            boolean r1 = r0.g     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1c
            boolean r0 = r0.j     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1c
            a01 r0 = r2.n     // Catch: java.lang.Throwable -> L18
            boolean r1 = r0.f     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1a
            boolean r0 = r0.h     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1c
            goto L1a
        L18:
            r0 = move-exception
            goto L35
        L1a:
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            boolean r1 = r2.i()     // Catch: java.lang.Throwable -> L18
            monitor-exit(r2)
            if (r0 == 0) goto L2b
            nj0 r0 = defpackage.nj0.m
            r1 = 0
            r2.d(r0, r1)
            return
        L2b:
            if (r1 != 0) goto L34
            wz0 r0 = r2.g
            int r2 = r2.f
            r0.f(r2)
        L34:
            return
        L35:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d01.a():void");
    }

    public final void b() throws IOException {
        a01 a01Var = this.n;
        if (a01Var.h) {
            c.r("stream closed");
            return;
        }
        if (a01Var.f) {
            c.r("stream finished");
            return;
        }
        if (g() != null) {
            IOException iOException = this.r;
            if (iOException != null) {
                throw iOException;
            }
            nj0 nj0VarG = g();
            nj0VarG.getClass();
            throw new v93(nj0VarG);
        }
    }

    @Override // defpackage.q73
    public final z73 c() {
        return this.m;
    }

    public final void d(nj0 nj0Var, IOException iOException) {
        if (e(nj0Var, iOException)) {
            wz0 wz0Var = this.g;
            wz0Var.getClass();
            wz0Var.B.k(this.f, nj0Var);
        }
    }

    public final boolean e(nj0 nj0Var, IOException iOException) {
        TimeZone timeZone = lv3.a;
        synchronized (this) {
            if (g() != null) {
                return false;
            }
            this.q = nj0Var;
            this.r = iOException;
            notifyAll();
            if (this.m.g) {
                if (this.n.f) {
                    return false;
                }
            }
            this.g.f(this.f);
            return true;
        }
    }

    public final void f(nj0 nj0Var) {
        if (e(nj0Var, null)) {
            this.g.k(this.f, nj0Var);
        }
    }

    public final nj0 g() {
        nj0 nj0Var;
        synchronized (this) {
            nj0Var = this.q;
        }
        return nj0Var;
    }

    public final boolean h() {
        boolean z = (this.f & 1) == 1;
        this.g.getClass();
        return true == z;
    }

    public final boolean i() {
        synchronized (this) {
            try {
                if (g() != null) {
                    return false;
                }
                b01 b01Var = this.m;
                if (b01Var.g || b01Var.j) {
                    a01 a01Var = this.n;
                    if (a01Var.f || a01Var.h) {
                        if (this.l) {
                            return false;
                        }
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(ux0 ux0Var, boolean z) {
        boolean zI;
        ux0Var.getClass();
        TimeZone timeZone = lv3.a;
        synchronized (this) {
            try {
                if (this.l && ux0Var.a(":status") == null && ux0Var.a(":method") == null) {
                    this.m.getClass();
                } else {
                    this.l = true;
                    this.k.add(ux0Var);
                }
                if (z) {
                    this.m.g = true;
                }
                zI = i();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zI) {
            return;
        }
        this.g.f(this.f);
    }

    @Override // defpackage.q73
    public final g43 m() {
        return this.n;
    }
}
