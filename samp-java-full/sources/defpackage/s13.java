package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class s13 extends gq1 {
    public final d23 a;
    public final cs0 b;

    public s13(d23 d23Var, cs0 cs0Var) {
        this.a = d23Var;
        this.b = cs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s13) {
            s13 s13Var = (s13) obj;
            if (this.a == s13Var.a && this.b.equals(s13Var.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        return new x13(this.a, this.b);
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        x13 x13Var = (x13) aq1Var;
        x13Var.getClass();
        x13Var.t = this.a;
        x13Var.u = this.b;
        vr.J(x13Var);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
