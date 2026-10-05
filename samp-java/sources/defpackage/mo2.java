package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class mo2 implements o11 {
    public final boolean a;
    public final float b;
    public final long c;

    public mo2(boolean z, float f, long j) {
        this.a = z;
        this.b = f;
        this.c = j;
    }

    @Override // defpackage.o11
    public final ia0 a(t41 t41Var) {
        return new na0(t41Var, this.a, this.b, new ma0(1, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mo2)) {
            return false;
        }
        mo2 mo2Var = (mo2) obj;
        if (this.a == mo2Var.a && jd0.b(this.b, mo2Var.b)) {
            return wx.c(this.c, mo2Var.c);
        }
        return false;
    }

    @Override // defpackage.o11
    public final int hashCode() {
        int iA = nc2.a(Boolean.hashCode(this.a) * 31, this.b, 961);
        int i = wx.h;
        return Long.hashCode(this.c) + iA;
    }
}
