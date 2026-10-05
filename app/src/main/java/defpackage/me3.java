package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class me3 extends ja0 implements m20, yd3 {
    public final cb0 A = b32.j(new it1(28, this));
    public jk2 B = jk2.e;
    public ar2 v;
    public r70 w;
    public nf3 x;
    public b50 y;
    public w83 z;

    public me3(ar2 ar2Var, r70 r70Var, nf3 nf3Var, b50 b50Var) {
        this.v = ar2Var;
        this.w = r70Var;
        this.x = nf3Var;
        this.y = b50Var;
    }

    @Override // defpackage.yd3
    public final long B(ab1 ab1Var) {
        return H(ab1Var).d();
    }

    @Override // defpackage.yd3
    public final jk2 H(ab1 ab1Var) {
        if (!this.s) {
            return this.B;
        }
        jk2 jk2Var = (jk2) this.y.h(ab1Var);
        if (jk2Var == null) {
            return this.B;
        }
        this.B = jk2Var;
        return jk2Var;
    }

    @Override // defpackage.yd3
    public final xd3 Y0() {
        return (xd3) this.A.getValue();
    }

    @Override // defpackage.aq1
    public final void h1() {
        ar2 ar2Var = this.v;
        ar2Var.h = yi3.h;
        ar2Var.g = this;
    }

    @Override // defpackage.aq1
    public final void i1() {
        ar2 ar2Var = this.v;
        ar2Var.h = yi3.g;
        ar2Var.g = null;
    }
}
