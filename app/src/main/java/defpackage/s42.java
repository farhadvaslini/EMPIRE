package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class s42 extends e52 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public s42(float f, float f2, float f3, float f4) {
        super(2);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s42)) {
            return false;
        }
        s42 s42Var = (s42) obj;
        return Float.compare(this.c, s42Var.c) == 0 && Float.compare(this.d, s42Var.d) == 0 && Float.compare(this.e, s42Var.e) == 0 && Float.compare(this.f, s42Var.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + nc2.a(nc2.a(Float.hashCode(this.c) * 31, this.d, 31), this.e, 31);
    }

    public final String toString() {
        StringBuilder sbK = nc2.k("ReflectiveCurveTo(x1=", this.c, ", y1=", this.d, ", x2=");
        sbK.append(this.e);
        sbK.append(", y2=");
        sbK.append(this.f);
        sbK.append(")");
        return sbK.toString();
    }
}
