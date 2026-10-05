package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
final class i43 extends gq1 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final boolean e;

    public /* synthetic */ i43(float f, float f2, float f3, float f4, boolean z, int i) {
        this((i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i43)) {
            return false;
        }
        i43 i43Var = (i43) obj;
        return jd0.b(this.a, i43Var.a) && jd0.b(this.b, i43Var.b) && jd0.b(this.c, i43Var.c) && jd0.b(this.d, i43Var.d) && this.e == i43Var.e;
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        k43 k43Var = new k43();
        k43Var.t = this.a;
        k43Var.u = this.b;
        k43Var.v = this.c;
        k43Var.w = this.d;
        k43Var.x = this.e;
        return k43Var;
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        k43 k43Var = (k43) aq1Var;
        k43Var.t = this.a;
        k43Var.u = this.b;
        k43Var.v = this.c;
        k43Var.w = this.d;
        k43Var.x = this.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + nc2.a(nc2.a(nc2.a(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31);
    }

    public i43(float f, float f2, float f3, float f4, boolean z) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = z;
    }
}
