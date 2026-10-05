package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class q13 {
    public static final q13 f = new q13(0, 0.0f, 31);
    public final float a;
    public final long b;
    public final long c;
    public final float d;
    public final int e;

    public q13(long j, float f2, int i) {
        float f3 = (i & 1) != 0 ? 24.0f : 4.0f;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f3 / 6.0f)) & 4294967295L);
        j = (i & 4) != 0 ? wx.b(0.1f, wx.b) : j;
        f2 = (i & 8) != 0 ? 1.0f : f2;
        this.a = f3;
        this.b = jFloatToRawIntBits;
        this.c = j;
        this.d = f2;
        this.e = 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q13) {
            q13 q13Var = (q13) obj;
            if (jd0.b(this.a, q13Var.a) && this.b == q13Var.b && wx.c(this.c, q13Var.c) && Float.compare(this.d, q13Var.d) == 0 && this.e == q13Var.e) {
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
        StringBuilder sbN = nc2.n("Shadow(radius=", strC, ", offset=", strA, ", color=");
        sbN.append(strI);
        sbN.append(", alpha=");
        sbN.append(this.d);
        sbN.append(", blendMode=");
        return nc2.j(sbN, strB0, ")");
    }
}
