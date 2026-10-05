package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
final class i33 extends gq1 {
    public final c33 a;

    public i33(c33 c33Var) {
        this.a = c33Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i33) && s51.n(this.a, ((i33) obj).a);
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        j33 j33Var = new j33();
        j33Var.t = this.a;
        return j33Var;
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        j33 j33Var = (j33) aq1Var;
        c33 c33Var = j33Var.t;
        c33 c33Var2 = this.a;
        if (!s51.n(c33Var2, c33Var)) {
            gq.M(j33Var, c33Var2.i);
        }
        j33Var.t = c33Var2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SharedTransitionScopeRootModifierElement(sharedTransitionScope=" + this.a + ")";
    }
}
