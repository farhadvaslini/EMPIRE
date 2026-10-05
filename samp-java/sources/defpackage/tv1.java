package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class tv1 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;

    public tv1(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof tv1)) {
            return false;
        }
        tv1 tv1Var = (tv1) obj;
        return wx.c(this.a, tv1Var.a) && wx.c(this.d, tv1Var.d) && wx.c(this.b, tv1Var.b) && wx.c(this.e, tv1Var.e) && wx.c(this.c, tv1Var.c) && wx.c(this.f, tv1Var.f) && wx.c(this.g, tv1Var.g);
    }

    public final int hashCode() {
        int i = wx.h;
        return Long.hashCode(this.g) + nc2.c(this.f, nc2.c(this.c, nc2.c(this.e, nc2.c(this.b, nc2.c(this.d, Long.hashCode(this.a) * 31, 31), 31), 31), 31), 31);
    }
}
