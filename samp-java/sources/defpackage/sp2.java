package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class sp2 {
    public final String a;
    public final long b;

    public sp2(long j, String str) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sp2)) {
            return false;
        }
        sp2 sp2Var = (sp2) obj;
        return this.a.equals(sp2Var.a) && wx.c(this.b, sp2Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = wx.h;
        return Long.hashCode(this.b) + iHashCode;
    }

    public final String toString() {
        return by1.i("ColorSegment(text=", this.a, ", color=", wx.i(this.b), ")");
    }
}
