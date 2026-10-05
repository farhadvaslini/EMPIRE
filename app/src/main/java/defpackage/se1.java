package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
final class se1 extends gq1 {
    public final o9 a;
    public final ye1 b;
    public final sf3 c;

    public se1(o9 o9Var, ye1 ye1Var, sf3 sf3Var) {
        this.a = o9Var;
        this.b = ye1Var;
        this.c = sf3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof se1) {
            se1 se1Var = (se1) obj;
            return s51.n(this.a, se1Var.a) && this.b == se1Var.b && this.c == se1Var.c;
        }
        return false;
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        return new te1(this.a, this.b, this.c);
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        te1 te1Var = (te1) aq1Var;
        if (te1Var.s) {
            te1Var.t.g();
            te1Var.t.k(te1Var);
        }
        o9 o9Var = this.a;
        te1Var.t = o9Var;
        if (te1Var.s) {
            if (o9Var.a != null) {
                p21.c("Expected textInputModifierNode to be null");
            }
            o9Var.a = te1Var;
        }
        te1Var.u = this.b;
        te1Var.v = this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.a + ", legacyTextFieldState=" + this.b + ", textFieldSelectionManager=" + this.c + ")";
    }
}
