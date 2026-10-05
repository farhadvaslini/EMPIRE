package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
final class vp0 extends gq1 {
    public final qr1 a;

    public vp0(qr1 qr1Var) {
        this.a = qr1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vp0) {
            return s51.n(this.a, ((vp0) obj).a);
        }
        return false;
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        return new wp0(this.a, 1, null);
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        ((wp0) aq1Var).u1(this.a);
    }

    public final int hashCode() {
        qr1 qr1Var = this.a;
        if (qr1Var != null) {
            return qr1Var.hashCode();
        }
        return 0;
    }
}
