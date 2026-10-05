package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class py0 extends gq1 {
    public final tm a;

    public py0(tm tmVar) {
        this.a = tmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        py0 py0Var = obj instanceof py0 ? (py0) obj : null;
        if (py0Var == null) {
            return false;
        }
        return this.a.equals(py0Var.a);
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        qy0 qy0Var = new qy0();
        qy0Var.t = this.a;
        return qy0Var;
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        ((qy0) aq1Var).t = this.a;
    }

    public final int hashCode() {
        return Float.hashCode(this.a.a);
    }
}
