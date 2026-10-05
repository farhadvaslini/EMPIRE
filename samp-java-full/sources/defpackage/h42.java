package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class h42 extends gq1 {
    public final v1 a;

    public h42(v1 v1Var) {
        this.a = v1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h42) {
            return this.a == ((h42) obj).a;
        }
        return false;
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        g42 g42Var = new g42();
        g42Var.t = this.a;
        return g42Var;
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        g42 g42Var = (g42) aq1Var;
        g42Var.t = this.a;
        y02.w(g42Var);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
