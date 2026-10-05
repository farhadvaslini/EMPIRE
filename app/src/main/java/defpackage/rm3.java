package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
final class rm3 extends gq1 {
    public final float a;
    public final float b;

    public rm3(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rm3)) {
            return false;
        }
        rm3 rm3Var = (rm3) obj;
        return jd0.b(this.a, rm3Var.a) && jd0.b(this.b, rm3Var.b);
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        sm3 sm3Var = new sm3();
        sm3Var.t = this.a;
        sm3Var.u = this.b;
        return sm3Var;
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        sm3 sm3Var = (sm3) aq1Var;
        sm3Var.t = this.a;
        sm3Var.u = this.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
