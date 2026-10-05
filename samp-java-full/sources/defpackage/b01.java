package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class b01 implements z73 {
    public final long f;
    public boolean g;
    public final hp h = new hp();
    public final hp i = new hp();
    public boolean j;
    public final /* synthetic */ d01 k;

    public b01(d01 d01Var, long j, boolean z) {
        this.k = d01Var;
        this.f = j;
        this.g = z;
    }

    @Override // defpackage.z73
    public final ci3 a() {
        return this.k.o;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        d01 d01Var = this.k;
        synchronized (d01Var) {
            this.j = true;
            hp hpVar = this.i;
            j = hpVar.g;
            hpVar.skip(j);
            d01Var.notifyAll();
        }
        if (j > 0) {
            d01 d01Var2 = this.k;
            TimeZone timeZone = lv3.a;
            d01Var2.g.i(j);
        }
        this.k.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00bc A[Catch: all -> 0x0025, DONT_GENERATE, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x0008, B:7:0x0015, B:13:0x001f, B:47:0x00bc, B:61:0x00e2, B:62:0x00e7, B:17:0x0028, B:19:0x002e, B:21:0x0032, B:23:0x0036, B:27:0x0047, B:29:0x004b, B:31:0x0055, B:33:0x0072, B:35:0x0083, B:38:0x009a, B:41:0x00a4, B:43:0x00aa, B:44:0x00b6, B:58:0x00d8, B:59:0x00df), top: B:66:0x0008, inners: #0 }] */
    @Override // defpackage.z73
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long d(long j, hp hpVar) throws Throwable {
        boolean z;
        Throwable v93Var;
        long j2;
        long jD;
        hpVar.getClass();
        do {
            d01 d01Var = this.k;
            synchronized (d01Var) {
                d01Var.g.getClass();
                a01 a01Var = d01Var.n;
                z = true;
                boolean z2 = a01Var.h || a01Var.f;
                if (z2) {
                    d01Var.o.h();
                }
                try {
                    if (d01Var.g() == null || this.g) {
                        v93Var = null;
                    } else {
                        v93Var = d01Var.r;
                        if (v93Var == null) {
                            nj0 nj0VarG = d01Var.g();
                            nj0VarG.getClass();
                            v93Var = new v93(nj0VarG);
                        }
                    }
                    if (this.j) {
                        throw new IOException("stream closed");
                    }
                    hp hpVar2 = this.i;
                    long j3 = hpVar2.g;
                    if (j3 > 0) {
                        jD = hpVar2.d(Math.min(8192L, j3), hpVar);
                        al3.c(d01Var.h, jD, 0L, 2);
                        long jB = d01Var.h.b();
                        if (v93Var == null) {
                            j2 = -1;
                            if (jB >= d01Var.g.v.a() / 2) {
                                d01Var.g.m(d01Var.f, jB);
                                al3.c(d01Var.h, 0L, jB, 1);
                            }
                        } else {
                            j2 = -1;
                        }
                    } else {
                        j2 = -1;
                        if (this.g || v93Var != null) {
                            jD = -1;
                        } else {
                            try {
                                d01Var.wait();
                                jD = -1;
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                throw new InterruptedIOException();
                            }
                        }
                    }
                    z = false;
                } finally {
                    if (z2) {
                        d01Var.o.l();
                    }
                }
            }
            this.k.g.u.getClass();
        } while (z);
        if (jD != j2) {
            return jD;
        }
        if (v93Var == null) {
            return j2;
        }
        throw v93Var;
    }
}
