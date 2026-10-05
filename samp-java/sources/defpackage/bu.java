package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class bu implements rs0 {
    public final /* synthetic */ float f;
    public final /* synthetic */ x12 g;
    public final /* synthetic */ long h;
    public final /* synthetic */ d00 i;
    public final /* synthetic */ long j;

    public bu(float f, x12 x12Var, long j, d00 d00Var, long j2) {
        this.f = f;
        this.g = x12Var;
        this.h = j;
        this.i = d00Var;
        this.j = j2;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        nv0 nv0Var = (nv0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
            s83 s83VarR = uq.R(pq1.j, nv0Var);
            s83 s83VarR2 = uq.R(pq1.i, nv0Var);
            s83 s83VarR3 = uq.R(pq1.g, nv0Var);
            s83 s83VarR4 = uq.R(pq1.h, nv0Var);
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
            bq1 bq1VarU = r51.u(yp1Var, "leadingIcon");
            tm tmVar = f5.s;
            vm1.c(false, bq1VarU, dj0.c(s83VarR3, tmVar, 12).a(dj0.f(s83VarR, 2)), dj0.h(s83VarR4, tmVar, 12).a(dj0.g(s83VarR2, 2)), null, gq.N(687705959, new au(0, this.h), nv0Var), nv0Var, 196656, 16);
            bq1 bq1VarU2 = r51.u(yp1Var, "label");
            b22 b22Var = gu.a;
            bq1 bq1VarL = f80.L(bq1VarU2, 8.0f, 0.0f, 2);
            dp2 dp2VarA = cp2.a(n92.b, f5.q, nv0Var, 54);
            int iC2 = lq.C(nv0Var);
            n52 n52VarL2 = nv0Var.l();
            bq1 bq1VarM2 = lr.M(nv0Var, bq1VarL);
            nv0Var.d0();
            if (nv0Var.S) {
                nv0Var.k(x91Var);
            } else {
                nv0Var.m0();
            }
            y02.F(z00Var, nv0Var, dp2VarA);
            y02.F(z00Var2, nv0Var, n52VarL2);
            if (nv0Var.S || !s51.n(nv0Var.O(), Integer.valueOf(iC2))) {
                nc2.q(iC2, nv0Var, iC2, z00Var3);
            }
            y02.F(z00Var4, nv0Var, bq1VarM2);
            nc2.p(0, this.i, nv0Var, true);
            bq1 bq1VarU3 = r51.u(yp1Var, "trailingIcon");
            tm tmVar2 = f5.u;
            vm1.c(false, bq1VarU3, dj0.c(s83VarR3, tmVar2, 12).a(dj0.f(s83VarR, 2)), dj0.h(s83VarR4, tmVar2, 12).a(dj0.g(s83VarR2, 2)), null, gq.N(1905252304, new au(1, this.j), nv0Var), nv0Var, 196656, 16);
            nv0Var.p(true);
        } else {
            nv0Var.U();
        }
        return dm3.a;
    }
}
