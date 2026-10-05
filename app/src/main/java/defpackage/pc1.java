package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
final class pc1 extends gq1 {
    public final tc1 a;
    public final po b;
    public final t02 c;

    public pc1(tc1 tc1Var, po poVar, t02 t02Var) {
        this.a = tc1Var;
        this.b = poVar;
        this.c = t02Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pc1)) {
            return false;
        }
        pc1 pc1Var = (pc1) obj;
        return s51.n(this.a, pc1Var.a) && s51.n(this.b, pc1Var.b) && this.c == pc1Var.c;
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        sc1 sc1Var = new sc1();
        sc1Var.t = this.a;
        sc1Var.u = this.b;
        sc1Var.v = this.c;
        return sc1Var;
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        sc1 sc1Var = (sc1) aq1Var;
        sc1Var.t = this.a;
        sc1Var.u = this.b;
        sc1Var.v = this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + by1.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, false);
    }
}
