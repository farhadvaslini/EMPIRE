package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class wp {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public wp(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final wp a(long j, long j2, long j3, long j4) {
        return new wp(j != 16 ? j : this.a, j2 != 16 ? j2 : this.b, j3 != 16 ? j3 : this.c, j4 != 16 ? j4 : this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof wp)) {
            return false;
        }
        wp wpVar = (wp) obj;
        return wx.c(this.a, wpVar.a) && wx.c(this.b, wpVar.b) && wx.c(this.c, wpVar.c) && wx.c(this.d, wpVar.d);
    }

    public final int hashCode() {
        int i = wx.h;
        return Long.hashCode(this.d) + nc2.c(this.c, nc2.c(this.b, Long.hashCode(this.a) * 31, 31), 31);
    }
}
