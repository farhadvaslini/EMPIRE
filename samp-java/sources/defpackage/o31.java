package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public class o31 extends j31 implements kb1 {
    public js3 v;

    public o31(js3 js3Var) {
        this.v = js3Var;
    }

    @Override // defpackage.j31
    public final js3 p1(js3 js3Var) {
        return new am3(js3Var, this.v);
    }

    @Override // defpackage.j31
    public final void q1() {
        super.q1();
        lq.J(this);
    }

    @Override // defpackage.kb1
    public final dn1 t(en1 en1Var, xm1 xm1Var, long j) {
        int iD = this.u.d(en1Var, en1Var.getLayoutDirection()) - this.t.d(en1Var, en1Var.getLayoutDirection());
        int iB = this.u.b(en1Var) - this.t.b(en1Var);
        int iC = (this.u.c(en1Var, en1Var.getLayoutDirection()) - this.t.c(en1Var, en1Var.getLayoutDirection())) + iD;
        int iA = (this.u.a(en1Var) - this.t.a(en1Var)) + iB;
        i62 i62VarT = xm1Var.t(n30.i(j, -iC, -iA));
        return en1Var.I0(n30.g(i62VarT.f + iC, j), n30.f(i62VarT.g + iA, j), oi0.f, new n31(i62VarT, iD, iB, 0));
    }
}
