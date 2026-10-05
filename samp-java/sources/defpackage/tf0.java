package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
final class tf0 extends gq1 {
    public final ns0 a;

    public tf0(ns0 ns0Var) {
        this.a = ns0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tf0) {
            return this.a == ((tf0) obj).a;
        }
        return false;
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        return new nq(new oq(), this.a);
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        nq nqVar = (nq) aq1Var;
        nqVar.v = this.a;
        nqVar.p1();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
