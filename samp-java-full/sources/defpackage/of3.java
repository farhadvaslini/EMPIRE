package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class of3 implements qe3 {
    public final /* synthetic */ sf3 a;

    public of3(sf3 sf3Var) {
        this.a = sf3Var;
    }

    @Override // defpackage.qe3
    public final void a() {
        sf3 sf3Var = this.a;
        sf3Var.r.setValue(null);
        sf3Var.s.setValue(null);
    }

    @Override // defpackage.qe3
    public final void b() {
        sf3 sf3Var = this.a;
        sf3Var.r.setValue(null);
        sf3Var.s.setValue(null);
    }

    @Override // defpackage.qe3
    public final void d(long j, qn1 qn1Var) {
        qg3 qg3VarD;
        sf3 sf3Var = this.a;
        long jA = lu2.a(sf3Var.l(true));
        ye1 ye1Var = sf3Var.d;
        if (ye1Var == null || (qg3VarD = ye1Var.d()) == null) {
            return;
        }
        long jE = qg3VarD.e(jA);
        sf3Var.o = jE;
        sf3Var.s.setValue(new gy1(jE));
        sf3Var.q = 0L;
        sf3Var.r.setValue(fx0.f);
        sf3Var.t(false);
    }

    @Override // defpackage.qe3
    public final void e(long j) {
        qg3 qg3VarD;
        px0 px0Var;
        sf3 sf3Var = this.a;
        sf3Var.q = gy1.e(sf3Var.q, j);
        ye1 ye1Var = sf3Var.d;
        if (ye1Var == null || (qg3VarD = ye1Var.d()) == null) {
            return;
        }
        sf3Var.s.setValue(new gy1(gy1.e(sf3Var.o, sf3Var.q)));
        iy1 iy1Var = sf3Var.b;
        gy1 gy1VarI = sf3Var.i();
        gy1VarI.getClass();
        int iN = iy1Var.n(qg3VarD.b(gy1VarI.a, true));
        long jF = d32.f(iN, iN);
        if (yg3.b(jF, sf3Var.n().b)) {
            return;
        }
        ye1 ye1Var2 = sf3Var.d;
        if ((ye1Var2 == null || ((Boolean) ye1Var2.q.getValue()).booleanValue()) && (px0Var = sf3Var.k) != null) {
            ((n62) px0Var).a(9);
        }
        sf3Var.c.h(sf3.e(sf3Var.n().a, jF));
        sf3Var.w = new yg3(jF);
    }

    @Override // defpackage.qe3
    public final void c() {
    }

    @Override // defpackage.qe3
    public final void onCancel() {
    }
}
