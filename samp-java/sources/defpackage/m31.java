package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
final class m31 extends gq1 {
    public final js3 a;

    public m31(js3 js3Var) {
        this.a = js3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m31) {
            return s51.n(((m31) obj).a, this.a);
        }
        return false;
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        return new o31(this.a);
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        o31 o31Var = (o31) aq1Var;
        js3 js3Var = o31Var.v;
        js3 js3Var2 = this.a;
        if (s51.n(js3Var2, js3Var)) {
            return;
        }
        o31Var.v = js3Var2;
        o31Var.q1();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
