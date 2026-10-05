package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class m43 extends gq1 {
    public final mr2 a;
    public final cs0 b;

    public m43(mr2 mr2Var, cs0 cs0Var) {
        this.a = mr2Var;
        this.b = cs0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m43)) {
            return false;
        }
        m43 m43Var = (m43) obj;
        return m43Var.b == this.b && m43Var.a == this.a;
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        return new p43(this.a, this.b);
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        p43 p43Var = (p43) aq1Var;
        p43Var.t.setValue(this.a);
        p43Var.u.setValue(this.b);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }
}
