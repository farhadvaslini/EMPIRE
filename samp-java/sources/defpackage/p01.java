package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class p01 implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ d00 g;

    public /* synthetic */ p01(d00 d00Var, int i) {
        this.f = i;
        this.g = d00Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        ry ryVar = ry.a;
        dm3 dm3Var = dm3.a;
        x91 x91Var = tb1.Y;
        yp1 yp1Var = yp1.a;
        d00 d00Var = this.g;
        switch (i) {
            case 0:
                nv0 nv0Var = (nv0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    nv0Var.U();
                } else {
                    float f = cl3.s0;
                    long jB = uq.b(cl3.t0 + f + f, 40.0f);
                    gm0 gm0Var = j43.a;
                    bq1 bq1VarL = j43.l(yp1Var, md0.b(jB), md0.a(jB));
                    cn1 cn1VarD = eo.d(f5.k, false);
                    int iC = lq.C(nv0Var);
                    n52 n52VarL = nv0Var.l();
                    bq1 bq1VarM = lr.M(nv0Var, bq1VarL);
                    w10.c.getClass();
                    nv0Var.d0();
                    if (nv0Var.S) {
                        nv0Var.k(x91Var);
                    } else {
                        nv0Var.m0();
                    }
                    y02.F(f5.E, nv0Var, cn1VarD);
                    y02.F(f5.D, nv0Var, n52VarL);
                    z00 z00Var = f5.F;
                    if (nv0Var.S || !s51.n(nv0Var.O(), Integer.valueOf(iC))) {
                        nc2.q(iC, nv0Var, iC, z00Var);
                    }
                    y02.F(f5.C, nv0Var, bq1VarM);
                    nc2.p(0, d00Var, nv0Var, true);
                }
                break;
            case 1:
                nv0 nv0Var2 = (nv0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    nv0Var2.U();
                } else {
                    qy qyVarA = oy.a(n92.d, f5.s, nv0Var2, 0);
                    int iC2 = lq.C(nv0Var2);
                    n52 n52VarL2 = nv0Var2.l();
                    bq1 bq1VarM2 = lr.M(nv0Var2, yp1Var);
                    w10.c.getClass();
                    nv0Var2.d0();
                    if (nv0Var2.S) {
                        nv0Var2.k(x91Var);
                    } else {
                        nv0Var2.m0();
                    }
                    y02.F(f5.E, nv0Var2, qyVarA);
                    y02.F(f5.D, nv0Var2, n52VarL2);
                    z00 z00Var2 = f5.F;
                    if (nv0Var2.S || !s51.n(nv0Var2.O(), Integer.valueOf(iC2))) {
                        nc2.q(iC2, nv0Var2, iC2, z00Var2);
                    }
                    y02.F(f5.C, nv0Var2, bq1VarM2);
                    d00Var.e(ryVar, nv0Var2, 6);
                    nv0Var2.p(true);
                }
                break;
            default:
                nv0 nv0Var3 = (nv0) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (!nv0Var3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    nv0Var3.U();
                } else {
                    qy qyVarA2 = oy.a(n92.d, f5.s, nv0Var3, 0);
                    int iC3 = lq.C(nv0Var3);
                    n52 n52VarL3 = nv0Var3.l();
                    bq1 bq1VarM3 = lr.M(nv0Var3, yp1Var);
                    w10.c.getClass();
                    nv0Var3.d0();
                    if (nv0Var3.S) {
                        nv0Var3.k(x91Var);
                    } else {
                        nv0Var3.m0();
                    }
                    y02.F(f5.E, nv0Var3, qyVarA2);
                    y02.F(f5.D, nv0Var3, n52VarL3);
                    z00 z00Var3 = f5.F;
                    if (nv0Var3.S || !s51.n(nv0Var3.O(), Integer.valueOf(iC3))) {
                        nc2.q(iC3, nv0Var3, iC3, z00Var3);
                    }
                    y02.F(f5.C, nv0Var3, bq1VarM3);
                    d00Var.e(ryVar, nv0Var3, 6);
                    nv0Var3.p(true);
                }
                break;
        }
        return dm3Var;
    }
}
