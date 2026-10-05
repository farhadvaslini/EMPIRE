package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
final class ez1 extends gq1 {
    public final ns0 a;

    public ez1(ns0 ns0Var) {
        this.a = ns0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ez1) {
            return this.a == ((ez1) obj).a;
        }
        return false;
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        fz1 fz1Var = new fz1();
        fz1Var.t = this.a;
        fz1Var.u = -9223372034707292160L;
        return fz1Var;
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        fz1 fz1Var = (fz1) aq1Var;
        fz1Var.t = this.a;
        fz1Var.u = -9223372034707292160L;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
