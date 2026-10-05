package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class bg2 implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ os1 g;
    public final /* synthetic */ os1 h;
    public final /* synthetic */ os1 i;

    public /* synthetic */ bg2(os1 os1Var, os1 os1Var2, os1 os1Var3, int i) {
        this.f = i;
        this.g = os1Var;
        this.h = os1Var2;
        this.i = os1Var3;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        zj zjVar = c20.a;
        x91 x91Var = tb1.Y;
        os1 os1Var = this.i;
        os1 os1Var2 = this.h;
        os1 os1Var3 = this.g;
        switch (i) {
            case 0:
                nv0 nv0Var = (nv0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    nv0Var.U();
                } else {
                    qy qyVarA = oy.a(n92.d, f5.s, nv0Var, 0);
                    int iHashCode = Long.hashCode(nv0Var.T);
                    n52 n52VarL = nv0Var.l();
                    yp1 yp1Var = yp1.a;
                    bq1 bq1VarM = lr.M(nv0Var, yp1Var);
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
                    String str = (String) os1Var3.getValue();
                    bq1 bq1VarC = j43.c(yp1Var, 1.0f);
                    Object objO = nv0Var.O();
                    if (objO == zjVar) {
                        objO = new mh1(os1Var3, os1Var2, 1);
                        nv0Var.j0(objO);
                    }
                    g12.m(str, (ns0) objO, bq1VarC, false, false, null, rn.C, null, null, null, null, false, null, null, null, true, 0, 0, null, null, nv0Var, 1573296, 12582912, 8257464);
                    oz2.g(nv0Var, j43.e(yp1Var, 8.0f));
                    String str2 = (String) os1Var.getValue();
                    bq1 bq1VarC2 = j43.c(yp1Var, 1.0f);
                    Object objO2 = nv0Var.O();
                    if (objO2 == zjVar) {
                        objO2 = new mh1(os1Var, os1Var2, 2);
                        nv0Var.j0(objO2);
                    }
                    g12.m(str2, (ns0) objO2, bq1VarC2, false, false, null, rn.D, null, null, null, null, false, null, null, null, true, 0, 0, null, null, nv0Var, 1573296, 12582912, 8257464);
                    if (((Boolean) os1Var2.getValue()).booleanValue()) {
                        nv0Var.a0(-483613320);
                        mg3.b(oz2.M(2131624556, nv0Var), null, ((fy) nv0Var.j(hy.a)).w, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var.j(ql3.a)).l, nv0Var, 0, 0, 131066);
                        nv0Var.p(false);
                    } else {
                        nv0Var.a0(-483334630);
                        nv0Var.p(false);
                    }
                    nv0Var.p(true);
                }
                break;
            default:
                nv0 nv0Var2 = (nv0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    nv0Var2.U();
                } else {
                    qy qyVarA2 = oy.a(n92.d, f5.s, nv0Var2, 0);
                    int iHashCode2 = Long.hashCode(nv0Var2.T);
                    n52 n52VarL2 = nv0Var2.l();
                    yp1 yp1Var2 = yp1.a;
                    bq1 bq1VarM2 = lr.M(nv0Var2, yp1Var2);
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
                    String str3 = (String) os1Var3.getValue();
                    se3 se3VarJ = f5.j(gq.B(nv0Var2).q, gq.B(nv0Var2).q, 0L, 0L, 0L, 0L, gq.B(nv0Var2).a, gq.B(nv0Var2).a, wx.b(0.2f, gq.B(nv0Var2).q), 0L, 0L, 0L, gq.B(nv0Var2).a, wx.b(0.5f, gq.B(nv0Var2).q), 0L, 0L, 0L, 0L, nv0Var2, 2122311420);
                    bq1 bq1VarC3 = j43.c(yp1Var2, 1.0f);
                    Object objO3 = nv0Var2.O();
                    if (objO3 == zjVar) {
                        objO3 = new mh1(os1Var3, os1Var2, 3);
                        nv0Var2.j0(objO3);
                    }
                    g12.m(str3, (ns0) objO3, bq1VarC3, false, false, null, f80.Z, null, null, null, null, false, null, null, null, true, 0, 0, null, se3VarJ, nv0Var2, 1573296, 12582912, 4063160);
                    oz2.g(nv0Var2, j43.e(yp1Var2, 8.0f));
                    String str4 = (String) os1Var.getValue();
                    se3 se3VarJ2 = f5.j(gq.B(nv0Var2).q, gq.B(nv0Var2).q, 0L, 0L, 0L, 0L, gq.B(nv0Var2).a, gq.B(nv0Var2).a, wx.b(0.2f, gq.B(nv0Var2).q), 0L, 0L, 0L, gq.B(nv0Var2).a, wx.b(0.5f, gq.B(nv0Var2).q), 0L, 0L, 0L, 0L, nv0Var2, 2122311420);
                    bq1 bq1VarC4 = j43.c(yp1Var2, 1.0f);
                    Object objO4 = nv0Var2.O();
                    if (objO4 == zjVar) {
                        objO4 = new mh1(os1Var, os1Var2, 4);
                        nv0Var2.j0(objO4);
                    }
                    g12.m(str4, (ns0) objO4, bq1VarC4, false, false, null, f80.a0, null, null, null, null, false, null, null, null, true, 0, 0, null, se3VarJ2, nv0Var2, 1573296, 12582912, 4063160);
                    if (((Boolean) os1Var2.getValue()).booleanValue()) {
                        nv0Var2.a0(-426215600);
                        mg3.b(oz2.M(2131624079, nv0Var2), f80.N(yp1Var2, 0.0f, 4.0f, 0.0f, 0.0f, 13), gq.B(nv0Var2).w, oz2.w(12), null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var2, 24624, 0, 262120);
                        nv0Var2.p(false);
                    } else {
                        nv0Var2.a0(-425917132);
                        nv0Var2.p(false);
                    }
                    nv0Var2.p(true);
                }
                break;
        }
        return dm3Var;
    }
}
