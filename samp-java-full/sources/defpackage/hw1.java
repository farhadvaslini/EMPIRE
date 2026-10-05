package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
final class hw1 extends gq1 {
    public final dw1 a;
    public final gw1 b;

    public hw1(dw1 dw1Var, gw1 gw1Var) {
        this.a = dw1Var;
        this.b = gw1Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hw1)) {
            return false;
        }
        hw1 hw1Var = (hw1) obj;
        return s51.n(hw1Var.a, this.a) && s51.n(hw1Var.b, this.b);
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        return new kw1(this.a, this.b);
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        kw1 kw1Var = (kw1) aq1Var;
        kw1Var.t = this.a;
        gw1 gw1Var = kw1Var.u;
        if (gw1Var.a == kw1Var) {
            gw1Var.a = null;
            gw1Var.d = null;
            gw1Var.c = s51.x;
        }
        gw1 gw1Var2 = this.b;
        if (gw1Var2 == null) {
            kw1Var.u = new gw1();
        } else if (gw1Var2 != gw1Var) {
            kw1Var.u = gw1Var2;
        }
        if (kw1Var.s) {
            gw1 gw1Var3 = kw1Var.u;
            gw1Var3.a = kw1Var;
            gw1Var3.b = null;
            kw1Var.v = null;
            gw1Var3.c = new it1(3, kw1Var);
            gw1Var3.d = kw1Var.d1();
        }
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        gw1 gw1Var = this.b;
        return iHashCode + (gw1Var != null ? gw1Var.hashCode() : 0);
    }
}
