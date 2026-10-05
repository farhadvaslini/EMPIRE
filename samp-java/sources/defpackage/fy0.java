package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class fy0 implements gy0 {
    public final long b = wx.b(0.38f, wx.c);
    public final int c = 12;

    @Override // defpackage.gy0
    public final long a() {
        return this.b;
    }

    @Override // defpackage.gy0
    public final db b(vb1 vb1Var, c23 c23Var, jp2 jp2Var) {
        jp2Var.getClass();
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fy0)) {
            return false;
        }
        fy0 fy0Var = (fy0) obj;
        return wx.c(this.b, fy0Var.b) && this.c == fy0Var.c;
    }

    public final int hashCode() {
        int i = wx.h;
        return Integer.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return by1.i("Plain(color=", wx.i(this.b), ", blendMode=", w7.b0(this.c), ")");
    }

    @Override // defpackage.gy0
    public final int x() {
        return this.c;
    }
}
