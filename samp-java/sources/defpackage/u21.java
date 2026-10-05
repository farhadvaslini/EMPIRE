package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class u21 {
    public final float a;
    public final long b;
    public final long c;
    public final float d;
    public final int e;

    static {
        new u21(0.0f, 0.0f, 31);
    }

    public u21(float f, float f2, int i) {
        f = (i & 1) != 0 ? 24.0f : f;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
        long jB = wx.b(0.15f, wx.b);
        f2 = (i & 8) != 0 ? 1.0f : f2;
        this.a = f;
        this.b = jFloatToRawIntBits;
        this.c = jB;
        this.d = f2;
        this.e = 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u21) {
            u21 u21Var = (u21) obj;
            if (jd0.b(this.a, u21Var.a) && this.b == u21Var.b && wx.c(this.c, u21Var.c) && Float.compare(this.d, u21Var.d) == 0 && this.e == u21Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iC = nc2.c(this.b, Float.hashCode(this.a) * 31, 31);
        int i = wx.h;
        return Integer.hashCode(this.e) + nc2.a(nc2.c(this.c, iC, 31), this.d, 31);
    }

    public final String toString() {
        String strC = jd0.c(this.a);
        String strA = ld0.a(this.b);
        String strI = wx.i(this.c);
        String strB0 = w7.b0(this.e);
        StringBuilder sbN = nc2.n("InnerShadow(radius=", strC, ", offset=", strA, ", color=");
        sbN.append(strI);
        sbN.append(", alpha=");
        sbN.append(this.d);
        sbN.append(", blendMode=");
        return nc2.j(sbN, strB0, ")");
    }
}
