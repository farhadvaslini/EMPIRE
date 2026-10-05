package defpackage;

import java.io.InterruptedIOException;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class a01 implements g43 {
    public final boolean f;
    public final hp g = new hp();
    public boolean h;
    public final /* synthetic */ d01 i;

    public a01(d01 d01Var, boolean z) {
        this.i = d01Var;
        this.f = z;
    }

    @Override // defpackage.g43
    public final ci3 a() {
        return this.i.p;
    }

    /* JADX WARN: Finally extract failed */
    public final void b(boolean z) {
        long jMin;
        boolean z2;
        d01 d01Var = this.i;
        synchronized (d01Var) {
            d01Var.p.h();
            while (d01Var.i >= d01Var.j && !this.f && !this.h && d01Var.g() == null) {
                try {
                    try {
                        d01Var.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    d01Var.p.l();
                    throw th;
                }
            }
            d01Var.p.l();
            d01Var.b();
            jMin = Math.min(d01Var.j - d01Var.i, this.g.g);
            d01Var.i += jMin;
            z2 = z && jMin == this.g.g;
        }
        this.i.p.h();
        try {
            d01 d01Var2 = this.i;
            d01Var2.g.j(d01Var2.f, z2, this.g, jMin);
        } finally {
            this.i.p.l();
        }
    }

    @Override // defpackage.g43, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        d01 d01Var = this.i;
        TimeZone timeZone = lv3.a;
        synchronized (d01Var) {
            if (this.h) {
                return;
            }
            boolean z = d01Var.g() == null;
            d01 d01Var2 = this.i;
            if (!d01Var2.n.f) {
                if (this.g.g > 0) {
                    while (this.g.g > 0) {
                        b(true);
                    }
                } else if (z) {
                    d01Var2.g.j(d01Var2.f, true, null, 0L);
                }
            }
            d01 d01Var3 = this.i;
            synchronized (d01Var3) {
                this.h = true;
                d01Var3.notifyAll();
            }
            this.i.g.B.flush();
            this.i.a();
        }
    }

    @Override // defpackage.g43, java.io.Flushable
    public final void flush() {
        d01 d01Var = this.i;
        TimeZone timeZone = lv3.a;
        synchronized (d01Var) {
            d01Var.b();
        }
        while (this.g.g > 0) {
            b(false);
            this.i.g.B.flush();
        }
    }

    @Override // defpackage.g43
    public final void l(long j, hp hpVar) {
        TimeZone timeZone = lv3.a;
        hp hpVar2 = this.g;
        hpVar2.l(j, hpVar);
        while (hpVar2.g >= 16384) {
            b(false);
        }
    }
}
