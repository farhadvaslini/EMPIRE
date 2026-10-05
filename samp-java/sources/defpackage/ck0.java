package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ck0 implements js3 {
    public final js3 a;
    public final js3 b;

    public ck0(js3 js3Var, js3 js3Var2) {
        this.a = js3Var;
        this.b = js3Var2;
    }

    @Override // defpackage.js3
    public final int a(ua0 ua0Var) {
        int iA = this.a.a(ua0Var) - this.b.a(ua0Var);
        if (iA < 0) {
            return 0;
        }
        return iA;
    }

    @Override // defpackage.js3
    public final int b(ua0 ua0Var) {
        int iB = this.a.b(ua0Var) - this.b.b(ua0Var);
        if (iB < 0) {
            return 0;
        }
        return iB;
    }

    @Override // defpackage.js3
    public final int c(ua0 ua0Var, bb1 bb1Var) {
        int iC = this.a.c(ua0Var, bb1Var) - this.b.c(ua0Var, bb1Var);
        if (iC < 0) {
            return 0;
        }
        return iC;
    }

    @Override // defpackage.js3
    public final int d(ua0 ua0Var, bb1 bb1Var) {
        int iD = this.a.d(ua0Var, bb1Var) - this.b.d(ua0Var, bb1Var);
        if (iD < 0) {
            return 0;
        }
        return iD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ck0)) {
            return false;
        }
        ck0 ck0Var = (ck0) obj;
        return s51.n(ck0Var.a, this.a) && s51.n(ck0Var.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.a + " - " + this.b + ")";
    }
}
