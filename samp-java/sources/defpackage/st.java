package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class st {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    public st(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof st)) {
            return false;
        }
        st stVar = (st) obj;
        return wx.c(this.a, stVar.a) && wx.c(this.b, stVar.b) && wx.c(this.c, stVar.c) && wx.c(this.d, stVar.d) && wx.c(this.e, stVar.e) && wx.c(this.f, stVar.f) && wx.c(this.g, stVar.g) && wx.c(this.h, stVar.h);
    }

    public final int hashCode() {
        int i = wx.h;
        return Long.hashCode(this.h) + nc2.c(this.g, nc2.c(this.f, nc2.c(this.e, nc2.c(this.d, nc2.c(this.c, nc2.c(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31);
    }
}
