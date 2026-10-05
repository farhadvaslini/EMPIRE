package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class my implements dg3 {
    public final long a;

    public my(long j) {
        this.a = j;
        if (j != 16) {
            return;
        }
        n21.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // defpackage.dg3
    public final long a() {
        return this.a;
    }

    @Override // defpackage.dg3
    public final dp b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof my) && wx.c(this.a, ((my) obj).a);
    }

    public final int hashCode() {
        int i = wx.h;
        return Long.hashCode(this.a);
    }

    @Override // defpackage.dg3
    public final float t() {
        return wx.d(this.a);
    }

    public final String toString() {
        return nc2.i("ColorStyle(value=", wx.i(this.a), ")");
    }
}
