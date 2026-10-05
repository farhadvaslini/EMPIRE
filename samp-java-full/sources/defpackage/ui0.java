package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
final class ui0 extends gq1 {
    public final gk3 a;
    public final bk3 b;
    public final bk3 c;
    public final bk3 d;
    public final ij0 e;
    public final ek0 f;
    public final u23 g;
    public final cs0 h;
    public final vi0 i;

    public ui0(gk3 gk3Var, bk3 bk3Var, bk3 bk3Var2, bk3 bk3Var3, ij0 ij0Var, ek0 ek0Var, u23 u23Var, cs0 cs0Var, vi0 vi0Var) {
        this.a = gk3Var;
        this.b = bk3Var;
        this.c = bk3Var2;
        this.d = bk3Var3;
        this.e = ij0Var;
        this.f = ek0Var;
        this.g = u23Var;
        this.h = cs0Var;
        this.i = vi0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ui0)) {
            return false;
        }
        ui0 ui0Var = (ui0) obj;
        return s51.n(ui0Var.a, this.a) && s51.n(ui0Var.b, this.b) && s51.n(ui0Var.c, this.c) && s51.n(ui0Var.d, this.d) && ui0Var.e.equals(this.e) && s51.n(ui0Var.f, this.f) && ui0Var.g == this.g && ui0Var.h == this.h && s51.n(ui0Var.i, this.i);
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        return new hj0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        hj0 hj0Var = (hj0) aq1Var;
        hj0Var.u = this.a;
        hj0Var.v = this.b;
        hj0Var.w = this.c;
        hj0Var.x = this.d;
        hj0Var.y = this.e;
        hj0Var.z = this.f;
        hj0Var.A = this.g;
        hj0Var.B = this.h;
        hj0Var.C = this.i;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        bk3 bk3Var = this.b;
        int iHashCode2 = (iHashCode + (bk3Var != null ? bk3Var.hashCode() : 0)) * 31;
        bk3 bk3Var2 = this.c;
        int iHashCode3 = (iHashCode2 + (bk3Var2 != null ? bk3Var2.hashCode() : 0)) * 31;
        bk3 bk3Var3 = this.d;
        return this.g.hashCode() + (this.i.hashCode() * 31) + ((this.h.hashCode() + ((this.f.a.hashCode() + ((this.e.a.hashCode() + ((iHashCode3 + (bk3Var3 != null ? bk3Var3.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}
