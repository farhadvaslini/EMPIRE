package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class l13 implements ss0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ d00 g;

    public /* synthetic */ l13(d00 d00Var, int i) {
        this.f = i;
        this.g = d00Var;
    }

    @Override // defpackage.ss0
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i = this.f;
        ry ryVar = ry.a;
        x91 x91Var = tb1.Y;
        dm3 dm3Var = dm3.a;
        d00 d00Var = this.g;
        switch (i) {
            case 0:
                x12 x12Var = (x12) obj;
                nv0 nv0Var = (nv0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                x12Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= nv0Var.f(x12Var) ? 4 : 2;
                }
                if (!nv0Var.R(iIntValue & 1, (iIntValue & 19) != 18)) {
                    nv0Var.U();
                } else {
                    bq1 bq1VarK = f80.K(n92.C(f80.I(j43.c, x12Var), n92.A(nv0Var), true), 24.0f, 24.0f);
                    qy qyVarA = oy.a(new jj(16.0f, true, new c(1)), f5.s, nv0Var, 6);
                    int iHashCode = Long.hashCode(nv0Var.T);
                    n52 n52VarL = nv0Var.l();
                    bq1 bq1VarM = lr.M(nv0Var, bq1VarK);
                    w10.c.getClass();
                    nv0Var.d0();
                    if (nv0Var.S) {
                        nv0Var.k(x91Var);
                    } else {
                        nv0Var.m0();
                    }
                    y02.F(f5.E, nv0Var, qyVarA);
                    y02.F(f5.D, nv0Var, n52VarL);
                    y02.F(f5.F, nv0Var, Integer.valueOf(iHashCode));
                    y02.C(nv0Var);
                    y02.F(f5.C, nv0Var, bq1VarM);
                    d00Var.e(ryVar, nv0Var, 6);
                    nv0Var.p(true);
                }
                break;
            case 1:
                nv0 nv0Var2 = (nv0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((nc1) obj).getClass();
                if (!nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    nv0Var2.U();
                } else {
                    qy qyVarA2 = oy.a(new jj(16.0f, true, new c(1)), f5.s, nv0Var2, 6);
                    int iHashCode2 = Long.hashCode(nv0Var2.T);
                    n52 n52VarL2 = nv0Var2.l();
                    bq1 bq1VarM2 = lr.M(nv0Var2, yp1.a);
                    w10.c.getClass();
                    nv0Var2.d0();
                    if (nv0Var2.S) {
                        nv0Var2.k(x91Var);
                    } else {
                        nv0Var2.m0();
                    }
                    y02.F(f5.E, nv0Var2, qyVarA2);
                    y02.F(f5.D, nv0Var2, n52VarL2);
                    y02.F(f5.F, nv0Var2, Integer.valueOf(iHashCode2));
                    y02.C(nv0Var2);
                    y02.F(f5.C, nv0Var2, bq1VarM2);
                    d00Var.e(ryVar, nv0Var2, 6);
                    nv0Var2.p(true);
                }
                break;
            default:
                ry ryVar2 = (ry) obj;
                nv0 nv0Var3 = (nv0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ryVar2.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= nv0Var3.f(ryVar2) ? 4 : 2;
                }
                if (!nv0Var3.R(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    nv0Var3.U();
                } else {
                    d00Var.e(ryVar2, nv0Var3, Integer.valueOf(iIntValue3 & 14));
                }
                break;
        }
        return dm3Var;
    }
}
