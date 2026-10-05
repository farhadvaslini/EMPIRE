package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
final class m11 extends gq1 {
    public final t41 a;
    public final o11 b;

    public m11(t41 t41Var, o11 o11Var) {
        this.a = t41Var;
        this.b = o11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m11)) {
            return false;
        }
        m11 m11Var = (m11) obj;
        return s51.n(this.a, m11Var.a) && s51.n(this.b, m11Var.b);
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        ia0 ia0VarA = this.b.a(this.a);
        n11 n11Var = new n11();
        n11Var.v = ia0VarA;
        n11Var.p1(ia0VarA);
        return n11Var;
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        n11 n11Var = (n11) aq1Var;
        ia0 ia0VarA = this.b.a(this.a);
        n11Var.q1(n11Var.v);
        n11Var.v = ia0VarA;
        n11Var.p1(ia0VarA);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
