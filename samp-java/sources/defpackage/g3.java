package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class g3 extends k33 {
    public final pl a;
    public final d42 b;
    public final d42 c;

    public g3(pl plVar, i23 i23Var, jk2 jk2Var) {
        this.a = plVar;
        this.b = b32.w(i23Var);
        this.c = b32.w(jk2Var);
    }

    @Override // defpackage.k33
    public final k33 a(m23 m23Var, i23 i23Var, long j, long j2, long j3) {
        d42 d42Var = this.b;
        w22.h(this.a, j, j2, j3, !s51.n((i23) d42Var.getValue(), i23Var));
        d42Var.setValue(i23Var);
        return this;
    }

    @Override // defpackage.k33
    public final jk2 c() {
        return (jk2) this.c.getValue();
    }

    @Override // defpackage.k33
    public final boolean d() {
        return true;
    }

    @Override // defpackage.k33
    public final pl e() {
        return this.a;
    }

    @Override // defpackage.k33
    public final k33 h() {
        pl plVar = this.a;
        b32.b(gy1.e(((gy1) ((d42) plVar.j).getValue()).a, ((gy1) ((d42) plVar.i).getValue()).a), ((h43) ((d42) plVar.g).getValue()).a);
        o23 o23Var = ((i23) this.b.getValue()).x;
        v23 v23Var = (v23) o23Var.j().b.getValue();
        o23Var.j();
        ab1 ab1Var = o23Var.f().b.k;
        if (ab1Var == null) {
            c.p("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
            return null;
        }
        lr.T(ab1Var.i0());
        v23Var.getClass();
        return vw1.a;
    }

    @Override // defpackage.k33
    public final void i(jk2 jk2Var) {
        this.c.setValue(jk2Var);
    }

    @Override // defpackage.k33
    public final k33 g(i23 i23Var) {
        return this;
    }
}
