package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class du implements rs0 {
    public final /* synthetic */ float f;
    public final /* synthetic */ x12 g;
    public final /* synthetic */ rs0 h;
    public final /* synthetic */ long i;
    public final /* synthetic */ d00 j;

    public du(float f, x12 x12Var, rs0 rs0Var, long j, d00 d00Var, long j2) {
        this.f = f;
        this.g = x12Var;
        this.h = rs0Var;
        this.i = j;
        this.j = d00Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        nv0 nv0Var = (nv0) obj;
        int iIntValue = ((Number) obj2).intValue();
        vm vmVar = f5.k;
        if (nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
            float f = this.f;
            yp1 yp1Var = yp1.a;
            bq1 bq1VarI = f80.I(j43.b(yp1Var, 0.0f, f, 1), this.g);
            Object objO = nv0Var.O();
            if (objO == c20.a) {
                objO = new iu();
                nv0Var.j0(objO);
            }
            iu iuVar = (iu) objO;
            int iC = lq.C(nv0Var);
            n52 n52VarL = nv0Var.l();
            bq1 bq1VarM = lr.M(nv0Var, bq1VarI);
            w10.c.getClass();
            nv0Var.d0();
            boolean z = nv0Var.S;
            x91 x91Var = tb1.Y;
            if (z) {
                nv0Var.k(x91Var);
            } else {
                nv0Var.m0();
            }
            z00 z00Var = f5.E;
            y02.F(z00Var, nv0Var, iuVar);
            z00 z00Var2 = f5.D;
            y02.F(z00Var2, nv0Var, n52VarL);
            z00 z00Var3 = f5.F;
            if (nv0Var.S || !s51.n(nv0Var.O(), Integer.valueOf(iC))) {
                nc2.q(iC, nv0Var, iC, z00Var3);
            }
            z00 z00Var4 = f5.C;
            y02.F(z00Var4, nv0Var, bq1VarM);
            rs0 rs0Var = this.h;
            if (rs0Var != null) {
                nv0Var.a0(-410987750);
                bq1 bq1VarU = r51.u(yp1Var, "leadingIcon");
                cn1 cn1VarD = eo.d(vmVar, false);
                int iC2 = lq.C(nv0Var);
                n52 n52VarL2 = nv0Var.l();
                bq1 bq1VarM2 = lr.M(nv0Var, bq1VarU);
                nv0Var.d0();
                if (nv0Var.S) {
                    nv0Var.k(x91Var);
                } else {
                    nv0Var.m0();
                }
                y02.F(z00Var, nv0Var, cn1VarD);
                y02.F(z00Var2, nv0Var, n52VarL2);
                if (nv0Var.S || !s51.n(nv0Var.O(), Integer.valueOf(iC2))) {
                    nc2.q(iC2, nv0Var, iC2, z00Var3);
                }
                y02.F(z00Var4, nv0Var, bq1VarM2);
                rs0 rs0VarG = gu.g(rs0Var, this.i, nv0Var);
                if (rs0VarG != null) {
                    nv0Var.a0(-1737425918);
                    ((d00) rs0VarG).f(nv0Var, 0);
                    nv0Var.p(false);
                } else {
                    nv0Var.a0(-1737349038);
                    nv0Var.p(false);
                }
                nv0Var.p(true);
                nv0Var.p(false);
            } else {
                nv0Var.a0(-410471693);
                nv0Var.p(false);
            }
            bq1 bq1VarU2 = r51.u(yp1Var, "label");
            b22 b22Var = gu.a;
            bq1 bq1VarK = f80.K(bq1VarU2, 8.0f, 0.0f);
            dp2 dp2VarA = cp2.a(n92.b, f5.q, nv0Var, 54);
            int iC3 = lq.C(nv0Var);
            n52 n52VarL3 = nv0Var.l();
            bq1 bq1VarM3 = lr.M(nv0Var, bq1VarK);
            nv0Var.d0();
            if (nv0Var.S) {
                nv0Var.k(x91Var);
            } else {
                nv0Var.m0();
            }
            y02.F(z00Var, nv0Var, dp2VarA);
            y02.F(z00Var2, nv0Var, n52VarL3);
            if (nv0Var.S || !s51.n(nv0Var.O(), Integer.valueOf(iC3))) {
                nc2.q(iC3, nv0Var, iC3, z00Var3);
            }
            y02.F(z00Var4, nv0Var, bq1VarM3);
            this.j.f(nv0Var, 0);
            nv0Var.p(true);
            nv0Var.a0(-409588813);
            nv0Var.p(false);
            nv0Var.p(true);
        } else {
            nv0Var.U();
        }
        return dm3.a;
    }
}
