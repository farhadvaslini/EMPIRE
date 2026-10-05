package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class p31 implements x12 {
    public final js3 a;
    public final ua0 b;

    public p31(js3 js3Var, sa3 sa3Var) {
        this.a = js3Var;
        this.b = sa3Var;
    }

    @Override // defpackage.x12
    public final float a(bb1 bb1Var) {
        js3 js3Var = this.a;
        ua0 ua0Var = this.b;
        return ua0Var.X0(js3Var.d(ua0Var, bb1Var));
    }

    @Override // defpackage.x12
    public final float b(bb1 bb1Var) {
        js3 js3Var = this.a;
        ua0 ua0Var = this.b;
        return ua0Var.X0(js3Var.c(ua0Var, bb1Var));
    }

    @Override // defpackage.x12
    public final float c() {
        js3 js3Var = this.a;
        ua0 ua0Var = this.b;
        return ua0Var.X0(js3Var.a(ua0Var));
    }

    @Override // defpackage.x12
    public final float d() {
        js3 js3Var = this.a;
        ua0 ua0Var = this.b;
        return ua0Var.X0(js3Var.b(ua0Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p31)) {
            return false;
        }
        p31 p31Var = (p31) obj;
        return s51.n(this.a, p31Var.a) && s51.n(this.b, p31Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.a + ", density=" + this.b + ")";
    }
}
