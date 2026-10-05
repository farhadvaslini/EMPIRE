package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ay0 extends gq1 {
    public final d23 a;
    public final cs0 b;

    public ay0(d23 d23Var, cs0 cs0Var) {
        this.a = d23Var;
        this.b = cs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ay0) {
            ay0 ay0Var = (ay0) obj;
            if (this.a == ay0Var.a && this.b.equals(ay0Var.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        return new by0(this.a, this.b);
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        by0 by0Var = (by0) aq1Var;
        by0Var.getClass();
        by0Var.t = this.a;
        by0Var.u = this.b;
        vr.J(by0Var);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
