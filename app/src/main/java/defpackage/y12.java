package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
final class y12 extends gq1 {
    public final x12 a;

    public y12(x12 x12Var) {
        this.a = x12Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y12) {
            return s51.n(((y12) obj).a, this.a);
        }
        return false;
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        z12 z12Var = new z12();
        z12Var.v = this.a;
        return z12Var;
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        z12 z12Var = (z12) aq1Var;
        x12 x12Var = z12Var.v;
        x12 x12Var2 = this.a;
        if (s51.n(x12Var2, x12Var)) {
            return;
        }
        z12Var.v = x12Var2;
        z12Var.q1();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
