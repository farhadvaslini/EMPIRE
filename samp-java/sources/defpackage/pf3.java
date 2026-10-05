package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class pf3 implements qe3 {
    public final /* synthetic */ sf3 a;
    public final /* synthetic */ boolean b;

    public pf3(sf3 sf3Var, boolean z) {
        this.a = sf3Var;
        this.b = z;
    }

    @Override // defpackage.qe3
    public final void a() {
        sf3 sf3Var = this.a;
        sf3Var.r.setValue(null);
        sf3Var.s.setValue(null);
        sf3Var.t(true);
    }

    @Override // defpackage.qe3
    public final void b() {
        sf3 sf3Var = this.a;
        sf3Var.r.setValue(null);
        sf3Var.s.setValue(null);
        sf3Var.t(true);
    }

    @Override // defpackage.qe3
    public final void c() {
        qg3 qg3VarD;
        boolean z = this.b;
        fx0 fx0Var = z ? fx0.g : fx0.h;
        sf3 sf3Var = this.a;
        sf3Var.r.setValue(fx0Var);
        long jA = lu2.a(sf3Var.l(z));
        ye1 ye1Var = sf3Var.d;
        if (ye1Var == null || (qg3VarD = ye1Var.d()) == null) {
            return;
        }
        long jE = qg3VarD.e(jA);
        sf3Var.o = jE;
        sf3Var.s.setValue(new gy1(jE));
        sf3Var.q = 0L;
        sf3Var.t = -1;
        ye1 ye1Var2 = sf3Var.d;
        if (ye1Var2 != null) {
            ye1Var2.q.setValue(Boolean.TRUE);
        }
        sf3Var.t(false);
    }

    @Override // defpackage.qe3
    public final void e(long j) {
        sf3 sf3Var = this.a;
        long jE = gy1.e(sf3Var.q, j);
        sf3Var.q = jE;
        sf3Var.s.setValue(new gy1(gy1.e(sf3Var.o, jE)));
        bg3 bg3VarN = sf3Var.n();
        gy1 gy1VarI = sf3Var.i();
        gy1VarI.getClass();
        sf3.c(sf3Var, bg3VarN, gy1VarI.a, false, this.b, m22.r, true, new qx0(9));
        sf3Var.t(false);
    }

    @Override // defpackage.qe3
    public final void onCancel() {
    }

    @Override // defpackage.qe3
    public final void d(long j, qn1 qn1Var) {
    }
}
