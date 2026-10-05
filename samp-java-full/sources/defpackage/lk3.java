package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class lk3 extends t63 {
    public final t63 e;
    public final boolean f;
    public final boolean g;
    public ns0 h;
    public final long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk3(t63 t63Var, ns0 ns0Var, boolean z, boolean z2) {
        ns0 ns0VarE;
        super(0L, y63.j);
        cr2 cr2Var = a73.a;
        this.e = t63Var;
        this.f = z;
        this.g = z2;
        this.h = a73.k(ns0Var, (t63Var == null || (ns0VarE = t63Var.e()) == null) ? a73.j.e : ns0VarE, z);
        this.i = g12.G();
    }

    @Override // defpackage.t63
    public final void c() {
        t63 t63Var;
        this.c = true;
        if (!this.g || (t63Var = this.e) == null) {
            return;
        }
        t63Var.c();
    }

    @Override // defpackage.t63
    public final y63 d() {
        return v().d();
    }

    @Override // defpackage.t63
    public final ns0 e() {
        return this.h;
    }

    @Override // defpackage.t63
    public final boolean f() {
        return v().f();
    }

    @Override // defpackage.t63
    public final long g() {
        return v().g();
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
    public final void m() {
        v().m();
    }

    @Override // defpackage.t63
    public final void n(n93 n93Var) {
        v().n(n93Var);
    }

    @Override // defpackage.t63
    public final t63 u(ns0 ns0Var) {
        ns0 ns0VarK = a73.k(ns0Var, this.h, true);
        return !this.f ? a73.g(v().u(null), ns0VarK, true) : v().u(ns0VarK);
    }

    public final t63 v() {
        t63 t63Var = this.e;
        return t63Var == null ? a73.j : t63Var;
    }
}
