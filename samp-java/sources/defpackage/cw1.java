package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class cw1 extends t63 {
    public final ns0 e;
    public final t63 f;

    public cw1(long j, y63 y63Var, ns0 ns0Var, t63 t63Var) {
        super(j, y63Var);
        this.e = ns0Var;
        this.f = t63Var;
        t63Var.k();
    }

    @Override // defpackage.t63
    public final void c() {
        t63 t63Var = this.f;
        if (this.c) {
            return;
        }
        if (this.b != t63Var.g()) {
            a();
        }
        t63Var.l();
        this.c = true;
        synchronized (a73.c) {
            o();
        }
    }

    @Override // defpackage.t63
    public final ns0 e() {
        return this.e;
    }

    @Override // defpackage.t63
    public final boolean f() {
        return true;
    }

    @Override // defpackage.t63
    public final ns0 i() {
        return null;
    }

    @Override // defpackage.t63
    public final void k() {
        rn.J();
        throw null;
    }

    @Override // defpackage.t63
    public final void l() {
        rn.J();
        throw null;
    }

    @Override // defpackage.t63
    public final void n(n93 n93Var) {
        cr2 cr2Var = a73.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // defpackage.t63
    public final t63 u(ns0 ns0Var) {
        return new cw1(this.b, this.a, a73.k(ns0Var, this.e, true), this.f);
    }

    @Override // defpackage.t63
    public final void m() {
    }
}
