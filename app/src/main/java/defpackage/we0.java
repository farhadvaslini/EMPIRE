package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
final class we0<T> extends gq1 {
    public final d6 a;
    public final rs0 b;

    public we0(d6 d6Var, rs0 rs0Var) {
        this.a = d6Var;
        this.b = rs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof we0)) {
            return false;
        }
        we0 we0Var = (we0) obj;
        return s51.n(this.a, we0Var.a) && this.b == we0Var.b;
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        xe0 xe0Var = new xe0();
        xe0Var.t = this.a;
        xe0Var.u = this.b;
        xe0Var.v = t02.f;
        return xe0Var;
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        xe0 xe0Var = (xe0) aq1Var;
        xe0Var.t = this.a;
        xe0Var.u = this.b;
        xe0Var.v = t02.f;
    }

    public final int hashCode() {
        return t02.f.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
