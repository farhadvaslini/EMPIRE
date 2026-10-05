package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class un1 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public un1(long j, long j2, long j3, long j4, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof un1)) {
            return false;
        }
        un1 un1Var = (un1) obj;
        return wx.c(this.a, un1Var.a) && wx.c(this.b, un1Var.b) && wx.c(this.c, un1Var.c) && wx.c(this.d, un1Var.d) && wx.c(this.e, un1Var.e) && wx.c(this.f, un1Var.f);
    }

    public final int hashCode() {
        int i = wx.h;
        return Long.hashCode(this.f) + nc2.c(this.e, nc2.c(this.d, nc2.c(this.c, nc2.c(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31);
    }
}
