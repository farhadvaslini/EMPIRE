package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class w12 extends aq1 implements kb1 {
    public float t;
    public float u;
    public float v;
    public float w;
    public boolean x;

    @Override // defpackage.kb1
    public final dn1 t(en1 en1Var, xm1 xm1Var, long j) {
        int iP0 = en1Var.p0(this.v) + en1Var.p0(this.t);
        int iP02 = en1Var.p0(this.w) + en1Var.p0(this.u);
        i62 i62VarT = xm1Var.t(n30.i(j, -iP0, -iP02));
        return en1Var.I0(n30.g(i62VarT.f + iP0, j), n30.f(i62VarT.g + iP02, j), oi0.f, new er1(4, this, i62VarT));
    }
}
