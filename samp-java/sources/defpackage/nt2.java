package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class nt2 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;

    public nt2(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
        this.k = j11;
        this.l = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nt2.class != obj.getClass()) {
            return false;
        }
        nt2 nt2Var = (nt2) obj;
        return wx.c(this.c, nt2Var.c) && wx.c(this.b, nt2Var.b) && wx.c(this.a, nt2Var.a) && wx.c(this.f, nt2Var.f) && wx.c(this.e, nt2Var.e) && wx.c(this.d, nt2Var.d) && wx.c(this.i, nt2Var.i) && wx.c(this.h, nt2Var.h) && wx.c(this.g, nt2Var.g) && wx.c(this.l, nt2Var.l) && wx.c(this.k, nt2Var.k) && wx.c(this.j, nt2Var.j);
    }

    public final int hashCode() {
        int i = wx.h;
        return Long.hashCode(this.j) + nc2.c(this.k, nc2.c(this.l, nc2.c(this.g, nc2.c(this.h, nc2.c(this.i, nc2.c(this.d, nc2.c(this.e, nc2.c(this.f, nc2.c(this.a, nc2.c(this.b, Long.hashCode(this.c) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
