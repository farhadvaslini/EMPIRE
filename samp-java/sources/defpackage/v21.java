package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class v21 extends gq1 {
    public final d23 a;
    public final cs0 b;

    public v21(d23 d23Var, cs0 cs0Var) {
        this.a = d23Var;
        this.b = cs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v21) {
            v21 v21Var = (v21) obj;
            if (this.a == v21Var.a && this.b.equals(v21Var.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        return new y21(this.a, this.b);
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        y21 y21Var = (y21) aq1Var;
        y21Var.getClass();
        y21Var.t = this.a;
        y21Var.u = this.b;
        vr.J(y21Var);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
