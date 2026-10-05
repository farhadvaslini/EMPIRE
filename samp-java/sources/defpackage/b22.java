package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class b22 implements x12 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public b22(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (!((f >= 0.0f) & (f2 >= 0.0f) & (f3 >= 0.0f)) || !(f4 >= 0.0f)) {
            k21.a("Padding must be non-negative");
        }
    }

    @Override // defpackage.x12
    public final float a(bb1 bb1Var) {
        return bb1Var == bb1.f ? this.a : this.c;
    }

    @Override // defpackage.x12
    public final float b(bb1 bb1Var) {
        return bb1Var == bb1.f ? this.c : this.a;
    }

    @Override // defpackage.x12
    public final float c() {
        return this.d;
    }

    @Override // defpackage.x12
    public final float d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b22)) {
            return false;
        }
        b22 b22Var = (b22) obj;
        return jd0.b(this.a, b22Var.a) && jd0.b(this.b, b22Var.b) && jd0.b(this.c, b22Var.c) && jd0.b(this.d, b22Var.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + nc2.a(nc2.a(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        String strC = jd0.c(this.a);
        String strC2 = jd0.c(this.b);
        String strC3 = jd0.c(this.c);
        String strC4 = jd0.c(this.d);
        StringBuilder sbN = nc2.n("PaddingValues(start=", strC, ", top=", strC2, ", end=");
        sbN.append(strC3);
        sbN.append(", bottom=");
        sbN.append(strC4);
        sbN.append(")");
        return sbN.toString();
    }
}
