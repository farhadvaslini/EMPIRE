package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class qf3 implements qe3 {
    public yg3 b;
    public final /* synthetic */ sf3 d;
    public boolean a = true;
    public qn1 c = m22.o;

    public qf3(sf3 sf3Var) {
        this.d = sf3Var;
    }

    @Override // defpackage.qe3
    public final void a() {
        f();
    }

    @Override // defpackage.qe3
    public final void d(long j, qn1 qn1Var) {
        long j2;
        qg3 qg3VarD;
        qg3 qg3VarD2;
        sf3 sf3Var = this.d;
        d42 d42Var = sf3Var.r;
        if (sf3Var.k() && ((fx0) d42Var.getValue()) == null) {
            d42Var.setValue(fx0.h);
            sf3Var.t = -1;
            this.a = true;
            this.c = qn1Var;
            sf3Var.o();
            ye1 ye1Var = sf3Var.d;
            if (ye1Var == null || (qg3VarD2 = ye1Var.d()) == null || !qg3VarD2.c(j)) {
                j2 = j;
                ye1 ye1Var2 = sf3Var.d;
                if (ye1Var2 != null && (qg3VarD = ye1Var2.d()) != null) {
                    int iN = sf3Var.b.n(qg3VarD.b(j2, true));
                    bg3 bg3VarE = sf3.e(sf3Var.n().a, d32.f(iN, iN));
                    sf3Var.h(false);
                    px0 px0Var = sf3Var.k;
                    if (px0Var != null) {
                        ((n62) px0Var).a(0);
                    }
                    sf3Var.c.h(bg3VarE);
                    sf3Var.w = new yg3(bg3VarE.b);
                }
                this.a = false;
            } else {
                if (sf3Var.n().a.g.length() == 0) {
                    return;
                }
                sf3Var.h(false);
                long jC = sf3.c(sf3Var, bg3.a(sf3Var.n(), null, yg3.b, 5), j, true, false, this.c, true, new qx0(0));
                j2 = j;
                sf3Var.p = new yg3(jC);
                this.b = new yg3(jC);
            }
            sf3Var.q(hx0.f);
            sf3Var.o = j2;
            sf3Var.s.setValue(new gy1(j2));
            sf3Var.q = 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0096  */
    @Override // defpackage.qe3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(long r10) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qf3.e(long):void");
    }

    public final void f() {
        sf3 sf3Var = this.d;
        sf3Var.r.setValue(null);
        sf3Var.s.setValue(null);
        this.c = m22.o;
        sf3Var.t(true);
        yg3 yg3Var = this.b;
        boolean zC = yg3.c(yg3Var != null ? yg3Var.a : sf3Var.n().b);
        sf3Var.q(zC ? hx0.h : hx0.g);
        ye1 ye1Var = sf3Var.d;
        if (ye1Var != null) {
            ye1Var.m.setValue(Boolean.valueOf(!zC && jo3.p(sf3Var, true)));
        }
        ye1 ye1Var2 = sf3Var.d;
        if (ye1Var2 != null) {
            ye1Var2.n.setValue(Boolean.valueOf(!zC && jo3.p(sf3Var, false)));
        }
        ye1 ye1Var3 = sf3Var.d;
        if (ye1Var3 != null) {
            ye1Var3.o.setValue(Boolean.valueOf(zC && jo3.p(sf3Var, true)));
        }
        if (this.a) {
            sf3.b(sf3Var, sf3Var.p);
        }
        sf3Var.p = null;
    }

    @Override // defpackage.qe3
    public final void onCancel() {
        f();
    }

    @Override // defpackage.qe3
    public final void b() {
    }

    @Override // defpackage.qe3
    public final void c() {
    }
}
