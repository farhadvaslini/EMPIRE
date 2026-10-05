package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
final class bm3 extends gq1 {
    public final om0 a;

    public bm3(om0 om0Var) {
        this.a = om0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bm3) {
            return ((bm3) obj).a.equals(this.a);
        }
        return false;
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        cm3 cm3Var = new cm3();
        cm3Var.v = this.a;
        return cm3Var;
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        cm3 cm3Var = (cm3) aq1Var;
        om0 om0Var = cm3Var.v;
        om0 om0Var2 = this.a;
        if (om0Var2.equals(om0Var)) {
            return;
        }
        cm3Var.v = om0Var2;
        cm3Var.q1();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
