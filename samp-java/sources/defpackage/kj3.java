package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class kj3 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public kj3(long j, long j2, long j3, long j4, long j5, long j6) {
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
        if (obj == null || !(obj instanceof kj3)) {
            return false;
        }
        kj3 kj3Var = (kj3) obj;
        return wx.c(this.a, kj3Var.a) && wx.c(this.b, kj3Var.b) && wx.c(this.c, kj3Var.c) && wx.c(this.d, kj3Var.d) && wx.c(this.e, kj3Var.e) && wx.c(this.f, kj3Var.f);
    }

    public final int hashCode() {
        int i = wx.h;
        return Long.hashCode(this.f) + nc2.c(this.e, nc2.c(this.d, nc2.c(this.c, nc2.c(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31);
    }
}
