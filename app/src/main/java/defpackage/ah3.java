package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ah3 {
    public final long a;
    public final long b;

    public ah3(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ah3)) {
            return false;
        }
        ah3 ah3Var = (ah3) obj;
        return wx.c(this.a, ah3Var.a) && wx.c(this.b, ah3Var.b);
    }

    public final int hashCode() {
        int i = wx.h;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return by1.i("SelectionColors(selectionHandleColor=", wx.i(this.a), ", selectionBackgroundColor=", wx.i(this.b), ")");
    }
}
