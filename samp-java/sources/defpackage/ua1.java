package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
final class ua1 extends gq1 {
    public final ta1 a;

    public ua1(ta1 ta1Var) {
        ta1Var.getClass();
        this.a = ta1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ua1) {
            return s51.n(this.a, ((ua1) obj).a);
        }
        return false;
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        ta1 ta1Var = this.a;
        ta1Var.getClass();
        va1 va1Var = new va1();
        va1Var.t = ta1Var;
        return va1Var;
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        va1 va1Var = (va1) aq1Var;
        va1Var.getClass();
        ta1 ta1Var = va1Var.t;
        ta1 ta1Var2 = this.a;
        if (!s51.n(ta1Var, ta1Var2)) {
            va1Var.t.d(null);
            ta1Var2.getClass();
            va1Var.t = ta1Var2;
        }
        vr.J(va1Var);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
