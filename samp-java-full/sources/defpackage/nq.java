package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class nq extends aq1 implements ey1, up, of0 {
    public final oq t;
    public boolean u;
    public ns0 v;

    public nq(oq oqVar, ns0 ns0Var) {
        this.t = oqVar;
        this.v = ns0Var;
        oqVar.f = this;
    }

    @Override // defpackage.of0
    public final void R0() {
        p1();
    }

    @Override // defpackage.ia0
    public final void Z0() {
        p1();
    }

    @Override // defpackage.up
    public final long a() {
        return lr.T(vr.U(this, 4).h);
    }

    @Override // defpackage.ia0
    public final void c() {
        p1();
    }

    @Override // defpackage.up
    public final bb1 getLayoutDirection() {
        return vr.X(this).F;
    }

    @Override // defpackage.up
    public final ua0 h() {
        return vr.X(this).E;
    }

    @Override // defpackage.aq1
    public final void j1() {
        p1();
    }

    @Override // defpackage.ey1
    public final void k0() {
        p1();
    }

    @Override // defpackage.of0
    public final void m0(vb1 vb1Var) {
        boolean z = this.u;
        oq oqVar = this.t;
        if (!z) {
            oqVar.g = null;
            gq.M(this, new u1(11, this, oqVar));
            if (oqVar.g == null) {
                throw nc2.d("DrawResult not defined, did you forget to call onDraw?");
            }
            this.u = true;
        }
        yl1 yl1Var = oqVar.g;
        yl1Var.getClass();
        ((ns0) yl1Var.g).h(vb1Var);
    }

    public final void p1() {
        this.u = false;
        this.t.g = null;
        vr.J(this);
    }

    @Override // defpackage.aq1
    public final void i1() {
    }
}
