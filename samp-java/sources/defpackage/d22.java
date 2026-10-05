package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class d22 extends aq1 implements kb1 {
    public x12 t;

    @Override // defpackage.kb1
    public final dn1 t(en1 en1Var, xm1 xm1Var, long j) {
        float fA = this.t.a(en1Var.getLayoutDirection());
        float fD = this.t.d();
        float fB = this.t.b(en1Var.getLayoutDirection());
        float fC = this.t.c();
        if (!((jd0.a(fA, 0.0f) >= 0) & (jd0.a(fD, 0.0f) >= 0) & (jd0.a(fB, 0.0f) >= 0) & (jd0.a(fC, 0.0f) >= 0))) {
            k21.a("Padding must be non-negative");
        }
        int iP0 = en1Var.p0(fA);
        int iP02 = en1Var.p0(fB) + iP0;
        int iP03 = en1Var.p0(fD);
        int iP04 = en1Var.p0(fC) + iP03;
        i62 i62VarT = xm1Var.t(n30.i(j, -iP02, -iP04));
        return en1Var.I0(n30.g(i62VarT.f + iP02, j), n30.f(i62VarT.g + iP04, j), oi0.f, new n31(i62VarT, iP0, iP03, 2));
    }
}
