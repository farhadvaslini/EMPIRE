package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class c22 implements js3 {
    public final x12 a;

    public c22(x12 x12Var) {
        this.a = x12Var;
    }

    @Override // defpackage.js3
    public final int a(ua0 ua0Var) {
        return ua0Var.p0(this.a.c());
    }

    @Override // defpackage.js3
    public final int b(ua0 ua0Var) {
        return ua0Var.p0(this.a.d());
    }

    @Override // defpackage.js3
    public final int c(ua0 ua0Var, bb1 bb1Var) {
        return ua0Var.p0(this.a.b(bb1Var));
    }

    @Override // defpackage.js3
    public final int d(ua0 ua0Var, bb1 bb1Var) {
        return ua0Var.p0(this.a.a(bb1Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c22) {
            return s51.n(((c22) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        x12 x12Var = this.a;
        bb1 bb1Var = bb1.f;
        float fA = x12Var.a(bb1Var);
        float fD = x12Var.d();
        float fB = x12Var.b(bb1Var);
        float fC = x12Var.c();
        String strC = jd0.c(fA);
        String strC2 = jd0.c(fD);
        String strC3 = jd0.c(fB);
        String strC4 = jd0.c(fC);
        StringBuilder sbN = nc2.n("PaddingValues(", strC, ", ", strC2, ", ");
        sbN.append(strC3);
        sbN.append(", ");
        sbN.append(strC4);
        sbN.append(")");
        return sbN.toString();
    }
}
