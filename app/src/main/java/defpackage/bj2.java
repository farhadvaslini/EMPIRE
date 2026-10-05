package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class bj2 extends t63 {
    public final ns0 e;
    public int f;

    public bj2(long j, y63 y63Var, ns0 ns0Var) {
        super(j, y63Var);
        this.e = ns0Var;
        this.f = 1;
    }

    @Override // defpackage.t63
    public final void c() {
        if (this.c) {
            return;
        }
        l();
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
        this.f++;
    }

    @Override // defpackage.t63
    public final void l() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            a();
        }
    }

    @Override // defpackage.t63
    public final void n(n93 n93Var) {
        cr2 cr2Var = a73.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // defpackage.t63
    public final t63 u(ns0 ns0Var) {
        a73.c(this);
        return new cw1(this.b, this.a, a73.k(ns0Var, this.e, true), this);
    }

    @Override // defpackage.t63
    public final void m() {
    }
}
