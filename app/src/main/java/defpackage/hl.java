package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
final class hl extends gq1 {
    public final long a;
    public final dp b;
    public final float c;
    public final z13 d;

    public hl(long j, hg1 hg1Var, z13 z13Var, int i) {
        j = (i & 1) != 0 ? wx.g : j;
        hg1Var = (i & 2) != 0 ? null : hg1Var;
        this.a = j;
        this.b = hg1Var;
        this.c = 1.0f;
        this.d = z13Var;
    }

    public final boolean equals(Object obj) {
        hl hlVar = obj instanceof hl ? (hl) obj : null;
        return hlVar != null && wx.c(this.a, hlVar.a) && s51.n(this.b, hlVar.b) && this.c == hlVar.c && s51.n(this.d, hlVar.d);
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        il ilVar = new il();
        ilVar.t = this.a;
        ilVar.u = this.b;
        ilVar.v = this.c;
        ilVar.w = this.d;
        ilVar.x = 9205357640488583168L;
        return ilVar;
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        il ilVar = (il) aq1Var;
        ilVar.t = this.a;
        ilVar.u = this.b;
        ilVar.v = this.c;
        z13 z13Var = ilVar.w;
        z13 z13Var2 = this.d;
        if (!s51.n(z13Var, z13Var2)) {
            ilVar.w = z13Var2;
            y02.w(ilVar);
        }
        vr.J(ilVar);
    }

    public final int hashCode() {
        int i = wx.h;
        int iHashCode = Long.hashCode(this.a) * 31;
        dp dpVar = this.b;
        return this.d.hashCode() + nc2.a((iHashCode + (dpVar != null ? dpVar.hashCode() : 0)) * 31, this.c, 31);
    }
}
