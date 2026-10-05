package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class rs2 extends gq1 {
    public final es2 a;
    public final boolean b;

    public rs2(es2 es2Var, boolean z) {
        this.a = es2Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rs2)) {
            return false;
        }
        rs2 rs2Var = (rs2) obj;
        return s51.n(this.a, rs2Var.a) && this.b == rs2Var.b;
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        as2 as2Var = new as2();
        as2Var.t = this.a;
        as2Var.u = this.b;
        return as2Var;
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        as2 as2Var = (as2) aq1Var;
        as2Var.t = this.a;
        as2Var.u = this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + by1.b(this.a.hashCode() * 31, 31, false);
    }
}
