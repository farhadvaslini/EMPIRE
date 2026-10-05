package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class dc3 extends gq1 {
    public final e93 a;
    public final int b;
    public final s83 c;

    public dc3(d42 d42Var, int i, s83 s83Var) {
        this.a = d42Var;
        this.b = i;
        this.c = s83Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dc3)) {
            return false;
        }
        dc3 dc3Var = (dc3) obj;
        return s51.n(this.a, dc3Var.a) && this.b == dc3Var.b && this.c.equals(dc3Var.c);
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        fc3 fc3Var = new fc3();
        fc3Var.t = this.a;
        fc3Var.u = this.b;
        fc3Var.v = true;
        fc3Var.w = this.c;
        return fc3Var;
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        fc3 fc3Var = (fc3) aq1Var;
        fc3Var.t = this.a;
        fc3Var.u = this.b;
        fc3Var.v = true;
        fc3Var.w = this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + by1.b(nc2.b(this.b, this.a.hashCode() * 31, 31), 31, true);
    }

    public final String toString() {
        return "TabIndicatorModifier(tabPositionsState=" + this.a + ", selectedTabIndex=" + this.b + ", followContentSize=true, animationSpec=" + this.c + ')';
    }
}
