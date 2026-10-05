package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class w71 implements al2, r50 {
    public final o50 f;
    public final rs0 g;
    public final n40 h;
    public w83 i;

    public w71(o50 o50Var, rs0 rs0Var) {
        this.f = o50Var;
        this.g = rs0Var;
        this.h = ur.c(o50Var.k(this));
    }

    @Override // defpackage.al2
    public final void a() {
        w83 w83Var = this.i;
        if (w83Var != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            w83Var.c(cancellationException);
        }
        this.i = cl3.t(this.h, null, this.g, 3);
    }

    @Override // defpackage.al2
    public final void d() {
        w83 w83Var = this.i;
        if (w83Var != null) {
            w83Var.G(new cr0(1));
        }
        this.i = null;
    }

    @Override // defpackage.al2
    public final void e() {
        w83 w83Var = this.i;
        if (w83Var != null) {
            w83Var.G(new cr0(1));
        }
        this.i = null;
    }

    @Override // defpackage.m50
    public final n50 getKey() {
        return f5.N;
    }

    @Override // defpackage.o50
    public final o50 k(o50 o50Var) {
        return pq.Q(this, o50Var);
    }

    @Override // defpackage.o50
    public final m50 m(n50 n50Var) {
        return pq.t(this, n50Var);
    }

    @Override // defpackage.r50
    public final void n(o50 o50Var, Throwable th) throws Throwable {
        j20 j20Var = (j20) o50Var.m(j20.g);
        if (j20Var != null) {
            uq.O(th, new u1(12, j20Var, this));
        }
        r50 r50Var = (r50) this.f.m(f5.N);
        if (r50Var == null) {
            throw th;
        }
        r50Var.n(o50Var, th);
    }

    @Override // defpackage.o50
    public final Object p(rs0 rs0Var, Object obj) {
        return rs0Var.f(obj, this);
    }

    @Override // defpackage.o50
    public final o50 u(n50 n50Var) {
        return pq.M(this, n50Var);
    }
}
