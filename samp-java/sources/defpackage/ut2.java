package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ut2 {
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

    public ut2(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ut2)) {
            return false;
        }
        ut2 ut2Var = (ut2) obj;
        return wx.c(this.a, ut2Var.a) && wx.c(this.b, ut2Var.b) && wx.c(this.c, ut2Var.c) && wx.c(this.d, ut2Var.d) && wx.c(this.e, ut2Var.e) && wx.c(this.f, ut2Var.f) && wx.c(this.g, ut2Var.g) && wx.c(this.h, ut2Var.h) && wx.c(this.i, ut2Var.i) && wx.c(this.j, ut2Var.j) && wx.c(this.k, ut2Var.k) && wx.c(this.l, ut2Var.l) && wx.c(this.m, ut2Var.m);
    }

    public final int hashCode() {
        int i = wx.h;
        return Long.hashCode(this.m) + nc2.c(this.l, nc2.c(this.k, nc2.c(this.j, nc2.c(this.i, nc2.c(this.h, nc2.c(this.g, nc2.c(this.f, nc2.c(this.e, nc2.c(this.d, nc2.c(this.c, nc2.c(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
