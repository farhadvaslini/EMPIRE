package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
final class vd<S> extends gq1 {
    public final bk3 a;
    public final os1 b;
    public final zd c;

    public vd(bk3 bk3Var, os1 os1Var, zd zdVar) {
        this.a = bk3Var;
        this.b = os1Var;
        this.c = zdVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vd)) {
            return false;
        }
        vd vdVar = (vd) obj;
        return s51.n(vdVar.a, this.a) && vdVar.b.equals(this.b);
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        return new yd(this.a, this.b, this.c);
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        yd ydVar = (yd) aq1Var;
        ydVar.u = this.a;
        ydVar.v = this.b;
        ydVar.w = this.c;
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        bk3 bk3Var = this.a;
        return this.b.hashCode() + ((iHashCode + (bk3Var != null ? bk3Var.hashCode() : 0)) * 31);
    }
}
