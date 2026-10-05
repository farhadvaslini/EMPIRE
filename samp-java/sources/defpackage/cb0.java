package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class cb0 extends o93 implements e93 {
    public final cs0 g;
    public final h73 h;
    public bb0 i = new bb0(a73.j().g());

    public cb0(cs0 cs0Var, h73 h73Var) {
        this.g = cs0Var;
        this.h = h73Var;
    }

    @Override // defpackage.n93
    public final p93 a() {
        return this.i;
    }

    @Override // defpackage.n93
    public final void c(p93 p93Var) {
        p93Var.getClass();
        this.i = (bb0) p93Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.bb0 g(defpackage.bb0 r21, defpackage.t63 r22, boolean r23, defpackage.cs0 r24) {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cb0.g(bb0, t63, boolean, cs0):bb0");
    }

    @Override // defpackage.e93
    public final Object getValue() {
        ns0 ns0VarE = a73.j().e();
        if (ns0VarE != null) {
            ns0VarE.h(this);
        }
        t63 t63VarJ = a73.j();
        return g((bb0) a73.i(this.i, t63VarJ), t63VarJ, true, this.g).f;
    }

    public final bb0 h() {
        t63 t63VarJ = a73.j();
        return g((bb0) a73.i(this.i, t63VarJ), t63VarJ, false, this.g);
    }

    public final String toString() {
        bb0 bb0Var = (bb0) a73.h(this.i);
        return "DerivedState(value=" + (bb0Var.c(this, a73.j()) ? String.valueOf(bb0Var.f) : "<Not calculated>") + ")@" + hashCode();
    }
}
