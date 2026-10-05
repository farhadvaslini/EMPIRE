package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
final class pu3 extends gq1 {
    public final tb0 a;
    public final rs0 b;
    public final Object c;

    public pu3(tb0 tb0Var, rs0 rs0Var, Object obj) {
        this.a = tb0Var;
        this.b = rs0Var;
        this.c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pu3.class != obj.getClass()) {
            return false;
        }
        pu3 pu3Var = (pu3) obj;
        return this.a == pu3Var.a && this.c.equals(pu3Var.c);
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        ru3 ru3Var = new ru3();
        ru3Var.t = this.a;
        ru3Var.u = this.b;
        return ru3Var;
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        ru3 ru3Var = (ru3) aq1Var;
        ru3Var.t = this.a;
        ru3Var.u = this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + by1.b(this.a.hashCode() * 31, 31, false);
    }
}
