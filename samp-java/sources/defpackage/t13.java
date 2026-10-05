package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class t13 extends gq1 {
    public final z13 a;
    public final boolean b;
    public final long c;
    public final long d;

    public t13(z13 z13Var, boolean z, long j, long j2) {
        this.a = z13Var;
        this.b = z;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t13)) {
            return false;
        }
        t13 t13Var = (t13) obj;
        return jd0.b(3.0f, 3.0f) && s51.n(this.a, t13Var.a) && this.b == t13Var.b && wx.c(this.c, t13Var.c) && wx.c(this.d, t13Var.d);
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        return new zm(new aw2(5, this));
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        ex1 ex1Var;
        zm zmVar = (zm) aq1Var;
        aw2 aw2Var = new aw2(5, this);
        zmVar.t = aw2Var;
        if (zmVar.f.s && (ex1Var = vr.U(zmVar, 2).C) != null) {
            ex1Var.W1(aw2Var, true);
        }
    }

    public final int hashCode() {
        int iB = by1.b((this.a.hashCode() + (Float.hashCode(3.0f) * 31)) * 31, 31, this.b);
        int i = wx.h;
        return Long.hashCode(this.d) + nc2.c(this.c, iB, 31);
    }

    public final String toString() {
        String strC = jd0.c(3.0f);
        String strI = wx.i(this.c);
        String strI2 = wx.i(this.d);
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb.append(strC);
        sb.append(", shape=");
        sb.append(this.a);
        sb.append(", clip=");
        sb.append(this.b);
        sb.append(", ambientColor=");
        sb.append(strI);
        sb.append(", spotColor=");
        return nc2.j(sb, strI2, ")");
    }
}
