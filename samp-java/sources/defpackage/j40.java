package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class j40 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public j40(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof j40)) {
            return false;
        }
        j40 j40Var = (j40) obj;
        return wx.c(this.a, j40Var.a) && wx.c(this.b, j40Var.b) && wx.c(this.c, j40Var.c) && wx.c(this.d, j40Var.d) && wx.c(this.e, j40Var.e);
    }

    public final int hashCode() {
        int i = wx.h;
        return Long.hashCode(this.e) + nc2.c(this.d, nc2.c(this.c, nc2.c(this.b, Long.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        String strI = wx.i(this.a);
        String strI2 = wx.i(this.b);
        String strI3 = wx.i(this.c);
        String strI4 = wx.i(this.d);
        String strI5 = wx.i(this.e);
        StringBuilder sbN = nc2.n("ContextMenuColors(backgroundColor=", strI, ", textColor=", strI2, ", iconColor=");
        nc2.w(sbN, strI3, ", disabledTextColor=", strI4, ", disabledIconColor=");
        return nc2.j(sbN, strI5, ")");
    }
}
