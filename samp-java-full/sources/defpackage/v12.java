package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
final class v12 extends gq1 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public v12(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        boolean z = true;
        boolean z2 = (f >= 0.0f || Float.isNaN(f)) & (f2 >= 0.0f || Float.isNaN(f2)) & (f3 >= 0.0f || Float.isNaN(f3));
        if (f4 < 0.0f && !Float.isNaN(f4)) {
            z = false;
        }
        if (!z2 || !z) {
            k21.a("Padding must be non-negative");
        }
    }

    public final boolean equals(Object obj) {
        v12 v12Var = obj instanceof v12 ? (v12) obj : null;
        return v12Var != null && jd0.b(this.a, v12Var.a) && jd0.b(this.b, v12Var.b) && jd0.b(this.c, v12Var.c) && jd0.b(this.d, v12Var.d);
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        w12 w12Var = new w12();
        w12Var.t = this.a;
        w12Var.u = this.b;
        w12Var.v = this.c;
        w12Var.w = this.d;
        w12Var.x = true;
        return w12Var;
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        w12 w12Var = (w12) aq1Var;
        w12Var.t = this.a;
        w12Var.u = this.b;
        w12Var.v = this.c;
        w12Var.w = this.d;
        w12Var.x = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + nc2.a(nc2.a(nc2.a(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31);
    }
}
