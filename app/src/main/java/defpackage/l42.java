package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class l42 extends e52 {
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final float h;
    public final float i;

    public l42(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        super(3);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = z;
        this.g = z2;
        this.h = f4;
        this.i = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l42)) {
            return false;
        }
        l42 l42Var = (l42) obj;
        return Float.compare(this.c, l42Var.c) == 0 && Float.compare(this.d, l42Var.d) == 0 && Float.compare(this.e, l42Var.e) == 0 && this.f == l42Var.f && this.g == l42Var.g && Float.compare(this.h, l42Var.h) == 0 && Float.compare(this.i, l42Var.i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.i) + nc2.a(by1.b(by1.b(nc2.a(nc2.a(Float.hashCode(this.c) * 31, this.d, 31), this.e, 31), 31, this.f), 31, this.g), this.h, 31);
    }

    public final String toString() {
        StringBuilder sbK = nc2.k("ArcTo(horizontalEllipseRadius=", this.c, ", verticalEllipseRadius=", this.d, ", theta=");
        sbK.append(this.e);
        sbK.append(", isMoreThanHalf=");
        sbK.append(this.f);
        sbK.append(", isPositiveArc=");
        sbK.append(this.g);
        sbK.append(", arcStartX=");
        sbK.append(this.h);
        sbK.append(", arcStartY=");
        sbK.append(this.i);
        sbK.append(")");
        return sbK.toString();
    }
}
