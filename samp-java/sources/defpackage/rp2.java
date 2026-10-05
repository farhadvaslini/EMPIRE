package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class rp2 {
    public final long a;
    public final float b;

    public rp2(float f, long j) {
        this.a = j;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rp2)) {
            return false;
        }
        rp2 rp2Var = (rp2) obj;
        return wx.c(this.a, rp2Var.a) && Float.compare(this.b, rp2Var.b) == 0;
    }

    public final int hashCode() {
        int i = wx.h;
        return Float.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ChatBackgroundDecision(color=" + wx.i(this.a) + ", minimumContrast=" + this.b + ")";
    }
}
