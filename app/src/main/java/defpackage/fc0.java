package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
final class fc0 extends gq1 {
    public final wc1 a;

    public fc0(wc1 wc1Var) {
        this.a = wc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fc0) && s51.n(this.a, ((fc0) obj).a);
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        gc0 gc0Var = new gc0();
        gc0Var.t = this.a;
        return gc0Var;
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        gc0 gc0Var = (gc0) aq1Var;
        wc1 wc1Var = gc0Var.t;
        wc1 wc1Var2 = this.a;
        if (s51.n(wc1Var, wc1Var2) || !gc0Var.f.s) {
            return;
        }
        wc1 wc1Var3 = gc0Var.t;
        wc1Var3.c();
        wc1Var3.b = null;
        wc1Var2.getClass();
        gc0Var.t = wc1Var2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsElement(animator=" + this.a + ")";
    }
}
