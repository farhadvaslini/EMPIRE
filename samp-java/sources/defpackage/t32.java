package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class t32 {
    public final y9 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;

    public t32(y9 y9Var, int i, int i2, int i3, int i4, float f, float f2) {
        this.a = y9Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = f;
        this.g = f2;
    }

    public final jk2 a(jk2 jk2Var) {
        return jk2Var.i((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(this.f)) & 4294967295L));
    }

    public final long b(long j, boolean z) {
        if (z) {
            long j2 = yg3.b;
            if (yg3.b(j, j2)) {
                return j2;
            }
        }
        int i = yg3.c;
        int i2 = this.b;
        return d32.f(((int) (j >> 32)) + i2, ((int) (j & 4294967295L)) + i2);
    }

    public final jk2 c(jk2 jk2Var) {
        float f = -this.f;
        return jk2Var.i((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
    }

    public final int d(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return y02.h(i, i3, i2) - i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t32) {
            t32 t32Var = (t32) obj;
            if (this.a == t32Var.a && this.b == t32Var.b && this.c == t32Var.c && this.d == t32Var.d && this.e == t32Var.e && Float.compare(this.f, t32Var.f) == 0 && Float.compare(this.g, t32Var.g) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + nc2.a(nc2.b(this.e, nc2.b(this.d, nc2.b(this.c, nc2.b(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), this.f, 31);
    }

    public final String toString() {
        return "ParagraphInfo(paragraph=" + this.a + ", startIndex=" + this.b + ", endIndex=" + this.c + ", startLineIndex=" + this.d + ", endLineIndex=" + this.e + ", top=" + this.f + ", bottom=" + this.g + ")";
    }
}
