package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
final class o51 extends gq1 {
    public final m51 a;

    public o51(m51 m51Var) {
        this.a = m51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        o51 o51Var = obj instanceof o51 ? (o51) obj : null;
        return o51Var != null && this.a == o51Var.a;
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        q51 q51Var = new q51(0);
        q51Var.u = this.a;
        q51Var.v = true;
        return q51Var;
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        q51 q51Var = (q51) aq1Var;
        q51Var.u = this.a;
        q51Var.v = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }
}
