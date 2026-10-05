package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class r43 {
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

    public r43(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
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
    }

    public final long a(boolean z, boolean z2) {
        return z ? z2 ? this.b : this.d : z2 ? this.g : this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof r43)) {
            return false;
        }
        r43 r43Var = (r43) obj;
        return wx.c(this.a, r43Var.a) && wx.c(this.b, r43Var.b) && wx.c(this.c, r43Var.c) && wx.c(this.d, r43Var.d) && wx.c(this.e, r43Var.e) && wx.c(this.f, r43Var.f) && wx.c(this.g, r43Var.g) && wx.c(this.h, r43Var.h) && wx.c(this.i, r43Var.i) && wx.c(this.j, r43Var.j);
    }

    public final int hashCode() {
        int i = wx.h;
        return Long.hashCode(this.j) + nc2.c(this.i, nc2.c(this.h, nc2.c(this.g, nc2.c(this.f, nc2.c(this.e, nc2.c(this.d, nc2.c(this.c, nc2.c(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
