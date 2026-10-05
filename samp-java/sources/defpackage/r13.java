package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class r13 {
    public static final r13 d = new r13(vp.c(4278190080L), 0, 0.0f);
    public final long a;
    public final long b;
    public final float c;

    public r13(long j, long j2, float f) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r13)) {
            return false;
        }
        r13 r13Var = (r13) obj;
        return wx.c(this.a, r13Var.a) && gy1.b(this.b, r13Var.b) && this.c == r13Var.c;
    }

    public final int hashCode() {
        int i = wx.h;
        return Float.hashCode(this.c) + nc2.c(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbN = nc2.n("Shadow(color=", wx.i(this.a), ", offset=", gy1.g(this.b), ", blurRadius=");
        sbN.append(this.c);
        sbN.append(")");
        return sbN.toString();
    }
}
