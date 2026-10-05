package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
final class a22 extends gq1 {
    public final x12 a;

    public a22(x12 x12Var) {
        this.a = x12Var;
    }

    public final boolean equals(Object obj) {
        a22 a22Var = obj instanceof a22 ? (a22) obj : null;
        if (a22Var == null) {
            return false;
        }
        return s51.n(this.a, a22Var.a);
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        d22 d22Var = new d22();
        d22Var.t = this.a;
        return d22Var;
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        ((d22) aq1Var).t = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
