package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class m01 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public m01(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof m01)) {
            return false;
        }
        m01 m01Var = (m01) obj;
        return wx.c(this.a, m01Var.a) && wx.c(this.b, m01Var.b) && wx.c(this.c, m01Var.c) && wx.c(this.d, m01Var.d);
    }

    public final int hashCode() {
        int i = wx.h;
        return Long.hashCode(this.d) + nc2.c(this.c, nc2.c(this.b, Long.hashCode(this.a) * 31, 31), 31);
    }
}
