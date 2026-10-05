package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
final class h71 extends gq1 {
    public final ns0 a;
    public final ns0 b;

    public h71(ns0 ns0Var, ns0 ns0Var2) {
        this.a = ns0Var;
        this.b = ns0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h71)) {
            return false;
        }
        h71 h71Var = (h71) obj;
        return this.a == h71Var.a && this.b == h71Var.b;
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        j71 j71Var = new j71();
        j71Var.t = this.a;
        j71Var.u = this.b;
        return j71Var;
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        j71 j71Var = (j71) aq1Var;
        j71Var.t = this.a;
        j71Var.u = this.b;
    }

    public final int hashCode() {
        ns0 ns0Var = this.a;
        int iHashCode = (ns0Var != null ? ns0Var.hashCode() : 0) * 31;
        ns0 ns0Var2 = this.b;
        return iHashCode + (ns0Var2 != null ? ns0Var2.hashCode() : 0);
    }
}
