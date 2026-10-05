package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class l4 implements js3 {
    public final js3 a;
    public final c22 b;

    public l4(js3 js3Var, c22 c22Var) {
        this.a = js3Var;
        this.b = c22Var;
    }

    @Override // defpackage.js3
    public final int a(ua0 ua0Var) {
        return this.b.a(ua0Var) + this.a.a(ua0Var);
    }

    @Override // defpackage.js3
    public final int b(ua0 ua0Var) {
        return this.b.b(ua0Var) + this.a.b(ua0Var);
    }

    @Override // defpackage.js3
    public final int c(ua0 ua0Var, bb1 bb1Var) {
        return this.b.c(ua0Var, bb1Var) + this.a.c(ua0Var, bb1Var);
    }

    @Override // defpackage.js3
    public final int d(ua0 ua0Var, bb1 bb1Var) {
        return this.b.d(ua0Var, bb1Var) + this.a.d(ua0Var, bb1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4)) {
            return false;
        }
        l4 l4Var = (l4) obj;
        return s51.n(l4Var.a, this.a) && l4Var.b.equals(this.b);
    }

    public final int hashCode() {
        return (this.b.a.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " + " + this.b + ")";
    }
}
