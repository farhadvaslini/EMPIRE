package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
final class ff0 extends gq1 {
    public final gl a;
    public final d23 b;
    public final ns0 c;
    public final ns0 d;
    public final rs0 e;
    public final ns0 f;

    public ff0(gl glVar, d23 d23Var, ns0 ns0Var, ns0 ns0Var2, rs0 rs0Var, ns0 ns0Var3) {
        glVar.getClass();
        ns0Var.getClass();
        this.a = glVar;
        this.b = d23Var;
        this.c = ns0Var;
        this.d = ns0Var2;
        this.e = rs0Var;
        this.f = ns0Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ff0) {
            ff0 ff0Var = (ff0) obj;
            if (s51.n(this.a, ff0Var.a) && this.b == ff0Var.b && s51.n(this.c, ff0Var.c) && s51.n(this.d, ff0Var.d) && this.e.equals(ff0Var.e) && s51.n(this.f, ff0Var.f)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        return new if0(this.a, this.b, this.c, this.d, this.e, this.f);
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        if0 if0Var = (if0) aq1Var;
        if0Var.getClass();
        gl glVar = this.a;
        glVar.getClass();
        if0Var.t = glVar;
        if0Var.u = this.b;
        ns0 ns0Var = this.c;
        ns0Var.getClass();
        if0Var.v = ns0Var;
        if0Var.w = this.d;
        if0Var.x = this.e;
        if0Var.y = this.f;
        gq.M(if0Var, new ja(12, if0Var));
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        ns0 ns0Var = this.d;
        int iHashCode2 = (this.e.hashCode() + ((iHashCode + (ns0Var != null ? ns0Var.hashCode() : 0)) * 29791)) * 31;
        ns0 ns0Var2 = this.f;
        return (iHashCode2 + (ns0Var2 != null ? ns0Var2.hashCode() : 0)) * 31;
    }
}
