package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class am3 implements js3 {
    public final js3 a;
    public final js3 b;

    public am3(js3 js3Var, js3 js3Var2) {
        this.a = js3Var;
        this.b = js3Var2;
    }

    @Override // defpackage.js3
    public final int a(ua0 ua0Var) {
        return Math.max(this.a.a(ua0Var), this.b.a(ua0Var));
    }

    @Override // defpackage.js3
    public final int b(ua0 ua0Var) {
        return Math.max(this.a.b(ua0Var), this.b.b(ua0Var));
    }

    @Override // defpackage.js3
    public final int c(ua0 ua0Var, bb1 bb1Var) {
        return Math.max(this.a.c(ua0Var, bb1Var), this.b.c(ua0Var, bb1Var));
    }

    @Override // defpackage.js3
    public final int d(ua0 ua0Var, bb1 bb1Var) {
        return Math.max(this.a.d(ua0Var, bb1Var), this.b.d(ua0Var, bb1Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof am3)) {
            return false;
        }
        am3 am3Var = (am3) obj;
        return s51.n(am3Var.a, this.a) && s51.n(am3Var.b, this.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " ∪ " + this.b + ")";
    }
}
