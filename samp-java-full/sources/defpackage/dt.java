package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class dt {
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

    public dt(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
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

    public static s83 a(mi3 mi3Var, nv0 nv0Var) {
        if (mi3Var == mi3.g) {
            nv0Var.a0(1539262271);
            s83 s83VarR = uq.R(pq1.i, nv0Var);
            nv0Var.p(false);
            return s83VarR;
        }
        nv0Var.a0(1539355581);
        s83 s83VarR2 = uq.R(pq1.h, nv0Var);
        nv0Var.p(false);
        return s83VarR2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof dt)) {
            return false;
        }
        dt dtVar = (dt) obj;
        return wx.c(this.a, dtVar.a) && wx.c(this.b, dtVar.b) && wx.c(this.c, dtVar.c) && wx.c(this.d, dtVar.d) && wx.c(this.e, dtVar.e) && wx.c(this.f, dtVar.f) && wx.c(this.g, dtVar.g) && wx.c(this.h, dtVar.h) && wx.c(this.i, dtVar.i) && wx.c(this.j, dtVar.j) && wx.c(this.k, dtVar.k) && wx.c(this.l, dtVar.l);
    }

    public final int hashCode() {
        int i = wx.h;
        return Long.hashCode(this.l) + nc2.c(this.k, nc2.c(this.j, nc2.c(this.i, nc2.c(this.h, nc2.c(this.g, nc2.c(this.f, nc2.c(this.e, nc2.c(this.d, nc2.c(this.c, nc2.c(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
