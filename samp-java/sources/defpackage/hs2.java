package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
final class hs2 extends gq1 {
    public final qs2 a;
    public final t02 b;
    public final boolean c;
    public final boolean d;
    public final qr1 e;

    public hs2(qs2 qs2Var, t02 t02Var, boolean z, boolean z2, qr1 qr1Var) {
        this.a = qs2Var;
        this.b = t02Var;
        this.c = z;
        this.d = z2;
        this.e = qr1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hs2)) {
            return false;
        }
        hs2 hs2Var = (hs2) obj;
        return s51.n(this.a, hs2Var.a) && this.b == hs2Var.b && this.c == hs2Var.c && this.d == hs2Var.d && s51.n(this.e, hs2Var.e);
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        return new ps2(null, null, null, this.e, this.b, this.a, this.c, this.d);
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        ((ps2) aq1Var).K1(null, null, null, this.e, this.b, this.a, this.c, this.d);
    }

    public final int hashCode() {
        int iB = by1.b(by1.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 961, 31, this.c), 961, this.d);
        qr1 qr1Var = this.e;
        return (iB + (qr1Var != null ? qr1Var.hashCode() : 0)) * 31;
    }
}
