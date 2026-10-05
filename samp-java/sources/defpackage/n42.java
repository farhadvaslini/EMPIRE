package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class n42 extends e52 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public n42(float f, float f2, float f3, float f4, float f5, float f6) {
        super(2);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n42)) {
            return false;
        }
        n42 n42Var = (n42) obj;
        return Float.compare(this.c, n42Var.c) == 0 && Float.compare(this.d, n42Var.d) == 0 && Float.compare(this.e, n42Var.e) == 0 && Float.compare(this.f, n42Var.f) == 0 && Float.compare(this.g, n42Var.g) == 0 && Float.compare(this.h, n42Var.h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + nc2.a(nc2.a(nc2.a(nc2.a(Float.hashCode(this.c) * 31, this.d, 31), this.e, 31), this.f, 31), this.g, 31);
    }

    public final String toString() {
        StringBuilder sbK = nc2.k("CurveTo(x1=", this.c, ", y1=", this.d, ", x2=");
        nc2.v(sbK, this.e, ", y2=", this.f, ", x3=");
        sbK.append(this.g);
        sbK.append(", y3=");
        sbK.append(this.h);
        sbK.append(")");
        return sbK.toString();
    }
}
