package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
final class td1 extends gq1 {
    public final cs0 a;
    public final pd1 b;
    public final t02 c;
    public final boolean d;

    public td1(cs0 cs0Var, pd1 pd1Var, t02 t02Var, boolean z) {
        this.a = cs0Var;
        this.b = pd1Var;
        this.c = t02Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof td1)) {
            return false;
        }
        td1 td1Var = (td1) obj;
        return this.a == td1Var.a && s51.n(this.b, td1Var.b) && this.c == td1Var.c && this.d == td1Var.d;
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        return new xd1(this.a, this.b, this.c, this.d);
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        xd1 xd1Var = (xd1) aq1Var;
        xd1Var.t = this.a;
        xd1Var.u = this.b;
        t02 t02Var = xd1Var.v;
        t02 t02Var2 = this.c;
        if (t02Var != t02Var2) {
            xd1Var.v = t02Var2;
            y02.w(xd1Var);
        }
        boolean z = xd1Var.w;
        boolean z2 = this.d;
        if (z == z2) {
            return;
        }
        xd1Var.w = z2;
        xd1Var.p1();
        y02.w(xd1Var);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + by1.b((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }
}
