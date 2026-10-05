package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class hi1 implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ ei1 g;
    public final /* synthetic */ rs0 h;

    public /* synthetic */ hi1(ei1 ei1Var, rs0 rs0Var, int i) {
        this.f = i;
        this.g = ei1Var;
        this.h = rs0Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        x91 x91Var = tb1.Y;
        dm3 dm3Var = dm3.a;
        ei1 ei1Var = this.g;
        switch (i) {
            case 0:
                nv0 nv0Var = (nv0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    nv0Var.U();
                } else {
                    vp.k(ei1Var.b, f80.n0, this.h, nv0Var, 48);
                }
                break;
            case 1:
                nv0 nv0Var2 = (nv0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    nv0Var2.U();
                } else {
                    bq1 bq1VarN = f80.N(yp1.a, 0.0f, 0.0f, 16.0f, 0.0f, 11);
                    cn1 cn1VarD = eo.d(f5.g, false);
                    int iC = lq.C(nv0Var2);
                    n52 n52VarL = nv0Var2.l();
                    bq1 bq1VarM = lr.M(nv0Var2, bq1VarN);
                    w10.c.getClass();
                    nv0Var2.d0();
                    if (nv0Var2.S) {
                        nv0Var2.k(x91Var);
                    } else {
                        nv0Var2.m0();
                    }
                    y02.F(f5.E, nv0Var2, cn1VarD);
                    y02.F(f5.D, nv0Var2, n52VarL);
                    z00 z00Var = f5.F;
                    if (nv0Var2.S || !s51.n(nv0Var2.O(), Integer.valueOf(iC))) {
                        nc2.q(iC, nv0Var2, iC, z00Var);
                    }
                    y02.F(f5.C, nv0Var2, bq1VarM);
                    vr.c(nc2.f(ei1Var.c, t30.a), this.h, nv0Var2, 8);
                    nv0Var2.p(true);
                }
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                nv0 nv0Var3 = (nv0) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (!nv0Var3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    nv0Var3.U();
                } else {
                    vp.k(ei1Var.e, f80.s0, this.h, nv0Var3, 48);
                }
                break;
            default:
                nv0 nv0Var4 = (nv0) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (!nv0Var4.R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    nv0Var4.U();
                } else {
                    bq1 bq1VarN2 = f80.N(yp1.a, 16.0f, 0.0f, 0.0f, 0.0f, 14);
                    cn1 cn1VarD2 = eo.d(f5.g, false);
                    int iC2 = lq.C(nv0Var4);
                    n52 n52VarL2 = nv0Var4.l();
                    bq1 bq1VarM2 = lr.M(nv0Var4, bq1VarN2);
                    w10.c.getClass();
                    nv0Var4.d0();
                    if (nv0Var4.S) {
                        nv0Var4.k(x91Var);
                    } else {
                        nv0Var4.m0();
                    }
                    y02.F(f5.E, nv0Var4, cn1VarD2);
                    y02.F(f5.D, nv0Var4, n52VarL2);
                    z00 z00Var2 = f5.F;
                    if (nv0Var4.S || !s51.n(nv0Var4.O(), Integer.valueOf(iC2))) {
                        nc2.q(iC2, nv0Var4, iC2, z00Var2);
                    }
                    y02.F(f5.C, nv0Var4, bq1VarM2);
                    vp.k(ei1Var.f, f80.v0, this.h, nv0Var4, 48);
                    nv0Var4.p(true);
                }
                break;
        }
        return dm3Var;
    }
}
