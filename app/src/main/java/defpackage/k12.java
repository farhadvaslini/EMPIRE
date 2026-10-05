package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class k12 {
    public final long a;
    public final b22 b;

    public k12() {
        long jC = vp.c(4284900966L);
        b22 b22VarE = f80.e(3);
        this.a = jC;
        this.b = b22VarE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!k12.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        k12 k12Var = (k12) obj;
        return wx.c(this.a, k12Var.a) && s51.n(this.b, k12Var.b);
    }

    public final int hashCode() {
        int i = wx.h;
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "OverscrollConfiguration(glowColor=" + wx.i(this.a) + ", drawPadding=" + this.b + ")";
    }
}
