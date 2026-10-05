package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ro2 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    static {
        w22.b(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public ro2(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ro2)) {
            return false;
        }
        ro2 ro2Var = (ro2) obj;
        return Float.compare(this.a, ro2Var.a) == 0 && Float.compare(this.b, ro2Var.b) == 0 && Float.compare(this.c, ro2Var.c) == 0 && Float.compare(this.d, ro2Var.d) == 0 && lq.s(this.e, ro2Var.e) && lq.s(this.f, ro2Var.f) && lq.s(this.g, ro2Var.g) && lq.s(this.h, ro2Var.h);
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + nc2.c(this.g, nc2.c(this.f, nc2.c(this.e, nc2.a(nc2.a(nc2.a(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), 31), 31), 31);
    }

    public final String toString() {
        String strM = uq.M(this.a);
        String strM2 = uq.M(this.b);
        String strM3 = uq.M(this.c);
        String strM4 = uq.M(this.d);
        StringBuilder sb = new StringBuilder();
        sb.append(strM);
        sb.append(", ");
        sb.append(strM2);
        sb.append(", ");
        sb.append(strM3);
        String strJ = nc2.j(sb, ", ", strM4);
        long j = this.e;
        long j2 = this.f;
        boolean zS = lq.s(j, j2);
        long j3 = this.g;
        long j4 = this.h;
        if (zS && lq.s(j2, j3) && lq.s(j3, j4)) {
            int i = (int) (j >> 32);
            int i2 = (int) (j & 4294967295L);
            if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
                return by1.i("RoundRect(rect=", strJ, ", radius=", uq.M(Float.intBitsToFloat(i)), ")");
            }
            String strM5 = uq.M(Float.intBitsToFloat(i));
            return nc2.j(nc2.n("RoundRect(rect=", strJ, ", x=", strM5, ", y="), uq.M(Float.intBitsToFloat(i2)), ")");
        }
        String strB0 = lq.b0(j);
        String strB02 = lq.b0(j2);
        String strB03 = lq.b0(j3);
        String strB04 = lq.b0(j4);
        StringBuilder sbN = nc2.n("RoundRect(rect=", strJ, ", topLeft=", strB0, ", topRight=");
        nc2.w(sbN, strB02, ", bottomRight=", strB03, ", bottomLeft=");
        return nc2.j(sbN, strB04, ")");
    }
}
