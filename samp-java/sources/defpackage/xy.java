package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
final class xy extends gq1 {
    public final qr1 a;
    public final cs0 b;
    public final cs0 c;

    public xy(cs0 cs0Var, cs0 cs0Var2, qr1 qr1Var) {
        this.a = qr1Var;
        this.b = cs0Var;
        this.c = cs0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xy.class != obj.getClass()) {
            return false;
        }
        xy xyVar = (xy) obj;
        return s51.n(this.a, xyVar.a) && this.b == xyVar.b && this.c == xyVar.c;
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        return new az(this.b, this.c, this.a);
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        boolean z;
        az azVar = (az) aq1Var;
        azVar.Q = true;
        boolean z2 = azVar.P == null;
        cs0 cs0Var = this.c;
        if (z2 != (cs0Var == null)) {
            azVar.u1();
            y02.w(azVar);
            z = true;
        } else {
            z = false;
        }
        azVar.P = cs0Var;
        boolean z3 = !azVar.A ? true : z;
        azVar.F1(this.a, null, false, true, null, null, this.b);
        if (z3) {
            azVar.G1(false);
            azVar.G1(true);
        }
    }

    public final int hashCode() {
        qr1 qr1Var = this.a;
        int iHashCode = (this.b.hashCode() + by1.b(by1.b((qr1Var != null ? qr1Var.hashCode() : 0) * 961, 31, false), 29791, true)) * 961;
        cs0 cs0Var = this.c;
        return Boolean.hashCode(true) + ((iHashCode + (cs0Var != null ? cs0Var.hashCode() : 0)) * 961);
    }
}
