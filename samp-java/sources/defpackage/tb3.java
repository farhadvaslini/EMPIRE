package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class tb3 {
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
    public final long m;
    public final long n;
    public final long o;
    public final long p;

    public tb3(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
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
        this.m = j13;
        this.n = j14;
        this.o = j15;
        this.p = j16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof tb3)) {
            return false;
        }
        tb3 tb3Var = (tb3) obj;
        return wx.c(this.a, tb3Var.a) && wx.c(this.b, tb3Var.b) && wx.c(this.c, tb3Var.c) && wx.c(this.d, tb3Var.d) && wx.c(this.e, tb3Var.e) && wx.c(this.f, tb3Var.f) && wx.c(this.g, tb3Var.g) && wx.c(this.h, tb3Var.h) && wx.c(this.i, tb3Var.i) && wx.c(this.j, tb3Var.j) && wx.c(this.k, tb3Var.k) && wx.c(this.l, tb3Var.l) && wx.c(this.m, tb3Var.m) && wx.c(this.n, tb3Var.n) && wx.c(this.o, tb3Var.o) && wx.c(this.p, tb3Var.p);
    }

    public final int hashCode() {
        int i = wx.h;
        return Long.hashCode(this.p) + nc2.c(this.o, nc2.c(this.n, nc2.c(this.m, nc2.c(this.l, nc2.c(this.k, nc2.c(this.j, nc2.c(this.i, nc2.c(this.h, nc2.c(this.g, nc2.c(this.f, nc2.c(this.e, nc2.c(this.d, nc2.c(this.c, nc2.c(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
