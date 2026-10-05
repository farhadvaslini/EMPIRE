package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class do1 implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public do1(d00 d00Var, rs0 rs0Var, ss0 ss0Var) {
        this.f = 4;
        this.i = d00Var;
        this.g = rs0Var;
        this.h = ss0Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        yp1 yp1Var = yp1.a;
        zj zjVar = c20.a;
        x91 x91Var = tb1.Y;
        dm3 dm3Var = dm3.a;
        Object obj3 = this.h;
        Object obj4 = this.i;
        Object obj5 = this.g;
        int i2 = 3;
        switch (i) {
            case 0:
                nv0 nv0Var = (nv0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    nv0Var.U();
                } else {
                    bq1 bq1VarC = n92.C(r51.E(f80.L((bq1) obj5, 0.0f, 8.0f, 1), m51.g), (es2) obj3, true);
                    d00 d00Var = (d00) obj4;
                    qy qyVarA = oy.a(n92.d, f5.s, nv0Var, 0);
                    int iC = lq.C(nv0Var);
                    n52 n52VarL = nv0Var.l();
                    bq1 bq1VarM = lr.M(nv0Var, bq1VarC);
                    w10.c.getClass();
                    nv0Var.d0();
                    if (nv0Var.S) {
                        nv0Var.k(x91Var);
                    } else {
                        nv0Var.m0();
                    }
                    y02.F(f5.E, nv0Var, qyVarA);
                    y02.F(f5.D, nv0Var, n52VarL);
                    z00 z00Var = f5.F;
                    if (nv0Var.S || !s51.n(nv0Var.O(), Integer.valueOf(iC))) {
                        nc2.q(iC, nv0Var, iC, z00Var);
                    }
                    y02.F(f5.C, nv0Var, bq1VarM);
                    d00Var.e(ry.a, nv0Var, 6);
                    nv0Var.p(true);
                }
                break;
            case 1:
                nv0 nv0Var2 = (nv0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                e93 e93Var = (e93) obj5;
                if (!nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    nv0Var2.U();
                } else {
                    bq1 bq1VarU = r51.u(yp1Var, "indicator");
                    boolean zF = nv0Var2.f(e93Var);
                    Object objO = nv0Var2.O();
                    if (zF || objO == zjVar) {
                        objO = new m90(e93Var, 4);
                        nv0Var2.j0(objO);
                    }
                    eo.a(gv3.v(vm1.z(bq1VarU, (ns0) objO), ((tv1) obj3).c, (z13) obj4), nv0Var2, 0);
                }
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                nv0 nv0Var3 = (nv0) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (!nv0Var3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    nv0Var3.U();
                } else {
                    jo3.d((rs0) obj5, (d00) obj4, (x12) obj3, nv0Var3, 0);
                }
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                nv0 nv0Var4 = (nv0) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (!nv0Var4.R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    nv0Var4.U();
                } else {
                    Object objO2 = nv0Var4.O();
                    if (objO2 == zjVar) {
                        objO2 = rn.A(nv0Var4);
                        nv0Var4.j0(objO2);
                    }
                    x50 x50Var = (x50) objO2;
                    s83 s83Var = (s83) obj3;
                    Object objO3 = nv0Var4.O();
                    if (objO3 == zjVar) {
                        objO3 = new ot2(x50Var, s83Var);
                        nv0Var4.j0(objO3);
                    }
                    ot2 ot2Var = (ot2) objO3;
                    bq1 bq1VarT = r51.t();
                    d00 d00VarV = vp.v(vr.L((rs0) obj5, (d00) obj4));
                    Object objO4 = nv0Var4.O();
                    if (objO4 == zjVar) {
                        objO4 = new ar1(ot2Var);
                        nv0Var4.j0(objO4);
                    }
                    cn1 cn1Var = (cn1) objO4;
                    int iC2 = lq.C(nv0Var4);
                    n52 n52VarL2 = nv0Var4.l();
                    bq1 bq1VarM2 = lr.M(nv0Var4, bq1VarT);
                    w10.c.getClass();
                    nv0Var4.d0();
                    if (nv0Var4.S) {
                        nv0Var4.k(x91Var);
                    } else {
                        nv0Var4.m0();
                    }
                    y02.F(f5.E, nv0Var4, cn1Var);
                    y02.F(f5.D, nv0Var4, n52VarL2);
                    z00 z00Var2 = f5.F;
                    if (nv0Var4.S || !s51.n(nv0Var4.O(), Integer.valueOf(iC2))) {
                        nc2.q(iC2, nv0Var4, iC2, z00Var2);
                    }
                    y02.F(f5.C, nv0Var4, bq1VarM2);
                    nc2.p(0, d00VarV, nv0Var4, true);
                }
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                nv0 nv0Var5 = (nv0) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                if (!nv0Var5.R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    nv0Var5.U();
                } else {
                    s83 s83VarR = uq.R(pq1.f, nv0Var5);
                    Object objO5 = nv0Var5.O();
                    if (objO5 == zjVar) {
                        objO5 = new qc3(s83VarR);
                        nv0Var5.j0(objO5);
                    }
                    qc3 qc3Var = (qc3) objO5;
                    bq1 bq1VarC2 = j43.c(yp1Var, 1.0f);
                    List listL = vr.L((d00) obj4, (rs0) obj5, gq.N(-1333331860, new z4(10, (ss0) obj3, qc3Var), nv0Var5));
                    Object objO6 = nv0Var5.O();
                    if (objO6 == zjVar) {
                        objO6 = new pc3(qc3Var);
                        nv0Var5.j0(objO6);
                    }
                    zq1 zq1Var = (zq1) objO6;
                    d00 d00VarV2 = vp.v(listL);
                    Object objO7 = nv0Var5.O();
                    if (objO7 == zjVar) {
                        objO7 = new ar1(zq1Var);
                        nv0Var5.j0(objO7);
                    }
                    cn1 cn1Var2 = (cn1) objO7;
                    int iC3 = lq.C(nv0Var5);
                    n52 n52VarL3 = nv0Var5.l();
                    bq1 bq1VarM3 = lr.M(nv0Var5, bq1VarC2);
                    w10.c.getClass();
                    nv0Var5.d0();
                    if (nv0Var5.S) {
                        nv0Var5.k(x91Var);
                    } else {
                        nv0Var5.m0();
                    }
                    y02.F(f5.E, nv0Var5, cn1Var2);
                    y02.F(f5.D, nv0Var5, n52VarL3);
                    z00 z00Var3 = f5.F;
                    if (nv0Var5.S || !s51.n(nv0Var5.O(), Integer.valueOf(iC3))) {
                        nc2.q(iC3, nv0Var5, iC3, z00Var3);
                    }
                    y02.F(f5.C, nv0Var5, bq1VarM3);
                    nc2.p(0, d00VarV2, nv0Var5, true);
                }
                break;
            default:
                nv0 nv0Var6 = (nv0) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                if (!nv0Var6.R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    nv0Var6.U();
                } else {
                    b20 b20Var = new b20(new w90(i2, (gk3) obj5));
                    d00 d00Var2 = (d00) obj4;
                    ij3 ij3Var = (ij3) obj3;
                    cn1 cn1VarD = eo.d(f5.g, false);
                    int iC4 = lq.C(nv0Var6);
                    n52 n52VarL4 = nv0Var6.l();
                    bq1 bq1VarM4 = lr.M(nv0Var6, b20Var);
                    w10.c.getClass();
                    nv0Var6.d0();
                    if (nv0Var6.S) {
                        nv0Var6.k(x91Var);
                    } else {
                        nv0Var6.m0();
                    }
                    y02.F(f5.E, nv0Var6, cn1VarD);
                    y02.F(f5.D, nv0Var6, n52VarL4);
                    z00 z00Var4 = f5.F;
                    if (nv0Var6.S || !s51.n(nv0Var6.O(), Integer.valueOf(iC4))) {
                        nc2.q(iC4, nv0Var6, iC4, z00Var4);
                    }
                    y02.F(f5.C, nv0Var6, bq1VarM4);
                    d00Var2.e(ij3Var, nv0Var6, 6);
                    nv0Var6.p(true);
                }
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ do1(int i, d00 d00Var, Object obj, Object obj2) {
        this.f = i;
        this.g = obj;
        this.i = d00Var;
        this.h = obj2;
    }

    public /* synthetic */ do1(Object obj, Object obj2, Object obj3, int i) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
    }
}
