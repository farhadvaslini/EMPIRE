package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class jk2 {
    public static final jk2 e = new jk2(0.0f, 0.0f, 0.0f, 0.0f);
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public jk2(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean a(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (fIntBitsToFloat >= this.a) & (fIntBitsToFloat < this.c) & (fIntBitsToFloat2 >= this.b) & (fIntBitsToFloat2 < this.d);
    }

    public final long b() {
        float f = this.c;
        float f2 = this.a;
        float f3 = ((f - f2) / 2.0f) + f2;
        float f4 = this.d;
        float f5 = this.b;
        return (((long) Float.floatToRawIntBits(((f4 - f5) / 2.0f) + f5)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public final long c() {
        float f = this.c - this.a;
        return (((long) Float.floatToRawIntBits(this.d - this.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public final long d() {
        return (((long) Float.floatToRawIntBits(this.a)) << 32) | (((long) Float.floatToRawIntBits(this.b)) & 4294967295L);
    }

    public final jk2 e(jk2 jk2Var) {
        return new jk2(Math.max(this.a, jk2Var.a), Math.max(this.b, jk2Var.b), Math.min(this.c, jk2Var.c), Math.min(this.d, jk2Var.d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jk2)) {
            return false;
        }
        jk2 jk2Var = (jk2) obj;
        return Float.compare(this.a, jk2Var.a) == 0 && Float.compare(this.b, jk2Var.b) == 0 && Float.compare(this.c, jk2Var.c) == 0 && Float.compare(this.d, jk2Var.d) == 0;
    }

    public final boolean f() {
        return (this.a >= this.c) | (this.b >= this.d);
    }

    public final boolean g(jk2 jk2Var) {
        return (this.a < jk2Var.c) & (jk2Var.a < this.c) & (this.b < jk2Var.d) & (jk2Var.b < this.d);
    }

    public final jk2 h(float f, float f2) {
        return new jk2(this.a + f, this.b + f2, this.c + f, this.d + f2);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + nc2.a(nc2.a(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final jk2 i(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new jk2(Float.intBitsToFloat(i) + this.a, Float.intBitsToFloat(i2) + this.b, Float.intBitsToFloat(i) + this.c, Float.intBitsToFloat(i2) + this.d);
    }

    public final String toString() {
        String strM = uq.M(this.a);
        String strM2 = uq.M(this.b);
        String strM3 = uq.M(this.c);
        String strM4 = uq.M(this.d);
        StringBuilder sbN = nc2.n("Rect.fromLTRB(", strM, ", ", strM2, ", ");
        sbN.append(strM3);
        sbN.append(", ");
        sbN.append(strM4);
        sbN.append(")");
        return sbN.toString();
    }
}
