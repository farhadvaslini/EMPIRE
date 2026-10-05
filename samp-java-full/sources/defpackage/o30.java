package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
final class o30 extends gq1 {
    public final ns0 a;

    public o30(ns0 ns0Var) {
        this.a = ns0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o30) && ((o30) obj).a == this.a;
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        p30 p30Var = new p30();
        p30Var.v = this.a;
        return p30Var;
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        p30 p30Var = (p30) aq1Var;
        ns0 ns0Var = p30Var.v;
        ns0 ns0Var2 = this.a;
        if (ns0Var2 != ns0Var) {
            p30Var.v = ns0Var2;
            p30Var.q1();
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
