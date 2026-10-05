package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
final class az1 extends gq1 {
    public final ns0 a;

    public az1(ns0 ns0Var) {
        this.a = ns0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof az1) {
            return this.a == ((az1) obj).a;
        }
        return false;
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        bz1 bz1Var = new bz1();
        bz1Var.t = this.a;
        return bz1Var;
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        ((bz1) aq1Var).t = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
