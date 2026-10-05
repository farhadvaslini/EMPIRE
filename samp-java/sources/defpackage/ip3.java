package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
final class ip3 extends gq1 {
    public final gk3 a;
    public final bk3 b;
    public final ij0 c;
    public final ek0 d;
    public final u23 e;

    public ip3(gk3 gk3Var, bk3 bk3Var, ij0 ij0Var, ek0 ek0Var, u23 u23Var) {
        this.a = gk3Var;
        this.b = bk3Var;
        this.c = ij0Var;
        this.d = ek0Var;
        this.e = u23Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ip3) {
            ip3 ip3Var = (ip3) obj;
            return s51.n(this.a, ip3Var.a) && s51.n(this.b, ip3Var.b) && this.c.equals(ip3Var.c) && s51.n(this.d, ip3Var.d) && this.e == ip3Var.e;
        }
        return false;
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        kp3 kp3Var = new kp3();
        kp3Var.t = this.b;
        kp3Var.u = this.c;
        kp3Var.v = this.d;
        kp3Var.w = this.e;
        return kp3Var;
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        kp3 kp3Var = (kp3) aq1Var;
        kp3Var.getClass();
        kp3Var.t = this.b;
        kp3Var.u = this.c;
        kp3Var.v = this.d;
        kp3Var.w = this.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.a.hashCode() + ((this.c.a.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "VeilModifierElement(transition=" + this.a + ", veilAnimation=" + this.b + ", enter=" + this.c + ", exit=" + this.d + ", mutableTransformState=" + this.e + ")";
    }
}
