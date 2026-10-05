package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ho2 {
    public final long a = wx.g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ho2) {
            return wx.c(this.a, ((ho2) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int i = wx.h;
        return Long.hashCode(this.a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) wx.i(this.a)) + ", rippleAlpha=null)";
    }
}
