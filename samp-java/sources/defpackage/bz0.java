package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
final class bz0 extends gq1 {
    public final qr1 a;

    public bz0(qr1 qr1Var) {
        this.a = qr1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bz0) && s51.n(((bz0) obj).a, this.a);
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        fz0 fz0Var = new fz0();
        fz0Var.t = this.a;
        return fz0Var;
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        fz0 fz0Var = (fz0) aq1Var;
        qr1 qr1Var = fz0Var.t;
        qr1 qr1Var2 = this.a;
        if (s51.n(qr1Var, qr1Var2)) {
            return;
        }
        fz0Var.r1();
        fz0Var.t = qr1Var2;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
