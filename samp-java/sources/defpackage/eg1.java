package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class eg1 {
    public static final eg1 d = new eg1(17, bg1.c, 0);
    public final float a;
    public final int b;
    public final int c;

    public eg1(int i, float f, int i2) {
        this.a = f;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eg1)) {
            return false;
        }
        eg1 eg1Var = (eg1) obj;
        float f = eg1Var.a;
        float f2 = bg1.b;
        return Float.compare(this.a, f) == 0 && this.b == eg1Var.b && this.c == eg1Var.c;
    }

    public final int hashCode() {
        float f = bg1.b;
        return Integer.hashCode(this.c) + nc2.b(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        String strB = bg1.b(this.a);
        String str = "Invalid";
        int i = this.b;
        String str2 = i == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i == 17 ? "LineHeightStyle.Trim.Both" : i == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
        int i2 = this.c;
        if (i2 == 0) {
            str = "LineHeightStyle.Mode.Fixed";
        } else if (i2 == 1) {
            str = "LineHeightStyle.Mode.Minimum";
        } else if (i2 == 2) {
            str = "LineHeightStyle.Mode.Tight";
        }
        return nc2.j(nc2.n("LineHeightStyle(alignment=", strB, ", trim=", str2, ",mode="), str, ")");
    }
}
