package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
final class ac3 extends gq1 {
    public final ns0 a;

    public ac3(ns0 ns0Var) {
        this.a = ns0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ac3) {
            return this.a == ((ac3) obj).a;
        }
        return false;
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        bc3 bc3Var = new bc3(s51.Q);
        bc3Var.w = this.a;
        return bc3Var;
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        bc3 bc3Var = (bc3) aq1Var;
        ns0 ns0Var = bc3Var.w;
        ns0 ns0Var2 = this.a;
        if (ns0Var != ns0Var2) {
            bc3Var.w = ns0Var2;
            qt3 qt3Var = bc3Var.x;
            if (qt3Var != null) {
                js3 js3Var = (js3) ns0Var2.h(qt3Var);
                if (s51.n(js3Var, bc3Var.v)) {
                    return;
                }
                bc3Var.v = js3Var;
                bc3Var.q1();
            }
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
