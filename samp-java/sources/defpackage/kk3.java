package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class kk3 extends ns1 {
    public final ns1 o;
    public final boolean p;
    public final boolean q;
    public ns0 r;
    public ns0 s;
    public final long t;

    /* JADX WARN: Illegal instructions before constructor call */
    public kk3(ns1 ns1Var, ns0 ns0Var, ns0 ns0Var2, boolean z, boolean z2) {
        ns0 ns0VarI;
        ns0 ns0VarE;
        cr2 cr2Var = a73.a;
        super(0L, y63.j, a73.k(ns0Var, (ns1Var == null || (ns0VarE = ns1Var.e()) == null) ? a73.j.e : ns0VarE, z), a73.l(ns0Var2, (ns1Var == null || (ns0VarI = ns1Var.i()) == null) ? a73.j.f : ns0VarI));
        this.o = ns1Var;
        this.p = z;
        this.q = z2;
        this.r = this.e;
        this.s = this.f;
        this.t = g12.G();
    }

    @Override // defpackage.ns1
    public final void B(js1 js1Var) {
        rn.J();
        throw null;
    }

    @Override // defpackage.ns1
    public final ns1 C(ns0 ns0Var, ns0 ns0Var2) {
        ns0 ns0VarK = a73.k(ns0Var, this.r, true);
        ns0 ns0VarL = a73.l(ns0Var2, this.s);
        return !this.p ? new kk3(D().C(null, ns0VarL), ns0VarK, ns0VarL, false, true) : D().C(ns0VarK, ns0VarL);
    }

    public final ns1 D() {
        ns1 ns1Var = this.o;
        return ns1Var == null ? a73.j : ns1Var;
    }

    @Override // defpackage.ns1, defpackage.t63
    public final void c() {
        ns1 ns1Var;
        this.c = true;
        if (!this.q || (ns1Var = this.o) == null) {
            return;
        }
        ns1Var.c();
    }

    @Override // defpackage.t63
    public final y63 d() {
        return D().d();
    }

    @Override // defpackage.ns1, defpackage.t63
    public final ns0 e() {
        return this.r;
    }

    @Override // defpackage.ns1, defpackage.t63
    public final boolean f() {
        return D().f();
    }

    @Override // defpackage.t63
    public final long g() {
        return D().g();
    }

    @Override // defpackage.ns1, defpackage.t63
    public final int h() {
        return D().h();
    }

    @Override // defpackage.ns1, defpackage.t63
    public final ns0 i() {
        return this.s;
    }

    @Override // defpackage.ns1, defpackage.t63
    public final void k() {
        rn.J();
        throw null;
    }

    @Override // defpackage.ns1, defpackage.t63
    public final void l() {
        rn.J();
        throw null;
    }

    @Override // defpackage.ns1, defpackage.t63
    public final void m() {
        D().m();
    }

    @Override // defpackage.ns1, defpackage.t63
    public final void n(n93 n93Var) {
        D().n(n93Var);
    }

    @Override // defpackage.t63
    public final void r(y63 y63Var) {
        rn.J();
        throw null;
    }

    @Override // defpackage.t63
    public final void s(long j) {
        rn.J();
        throw null;
    }

    @Override // defpackage.ns1, defpackage.t63
    public final void t(int i) {
        D().t(i);
    }

    @Override // defpackage.ns1, defpackage.t63
    public final t63 u(ns0 ns0Var) {
        ns0 ns0VarK = a73.k(ns0Var, this.r, true);
        return !this.p ? a73.g(D().u(null), ns0VarK, true) : D().u(ns0VarK);
    }

    @Override // defpackage.ns1
    public final t22 w() {
        return D().w();
    }

    @Override // defpackage.ns1
    public final js1 x() {
        return D().x();
    }

    @Override // defpackage.ns1
    /* JADX INFO: renamed from: y */
    public final ns0 e() {
        return this.r;
    }
}
