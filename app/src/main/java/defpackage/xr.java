package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class xr {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public xr(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof xr)) {
            return false;
        }
        xr xrVar = (xr) obj;
        return wx.c(this.a, xrVar.a) && wx.c(this.b, xrVar.b) && wx.c(this.c, xrVar.c) && wx.c(this.d, xrVar.d);
    }

    public final int hashCode() {
        int i = wx.h;
        return Long.hashCode(this.d) + nc2.c(this.c, nc2.c(this.b, Long.hashCode(this.a) * 31, 31), 31);
    }
}
