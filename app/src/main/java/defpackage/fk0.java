package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
final class fk0 extends gq1 {
    public final yb a;

    public fk0(yb ybVar) {
        this.a = ybVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fk0) {
            return this.a == ((fk0) obj).a;
        }
        return false;
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        gk0 gk0Var = new gk0();
        gk0Var.t = this.a;
        return gk0Var;
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        ((gk0) aq1Var).t = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
