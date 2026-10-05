package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
final class ok3 extends gq1 {
    public final nd1 a;

    public ok3(nd1 nd1Var) {
        this.a = nd1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ok3) && s51.n(this.a, ((ok3) obj).a);
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        pk3 pk3Var = new pk3();
        pk3Var.t = this.a;
        return pk3Var;
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        ((pk3) aq1Var).t = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.a + ")";
    }
}
