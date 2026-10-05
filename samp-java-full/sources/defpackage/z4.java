package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class z4 implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ z4(int i, Object obj, Object obj2) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        zj zjVar = c20.a;
        x91 x91Var = tb1.Y;
        yp1 yp1Var = yp1.a;
        dm3 dm3Var = dm3.a;
        Object obj3 = this.h;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                nv0 nv0Var = (nv0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    nv0Var.U();
                } else {
                    bq1 bq1VarD = f80.I(yp1Var, e5.c).d(new py0(((rs0) obj4) == null ? f5.s : f5.t));
                    rs0 rs0Var = (rs0) obj3;
                    cn1 cn1VarD = eo.d(f5.g, false);
                    int iC = lq.C(nv0Var);
                    n52 n52VarL = nv0Var.l();
                    bq1 bq1VarM = lr.M(nv0Var, bq1VarD);
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
                    rs0Var.f(nv0Var, 0);
                    nv0Var.p(true);
                }
                break;
            case 1:
                nv0 nv0Var2 = (nv0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                String str = (String) obj4;
                if (!nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    nv0Var2.U();
                } else {
                    boolean zF = nv0Var2.f(str);
                    Object objO = nv0Var2.O();
                    Object obj5 = objO;
                    if (zF || objO == zjVar) {
                        im imVar = new im(false ? 1 : 0, str);
                        nv0Var2.j0(imVar);
                        obj5 = imVar;
                    }
                    bq1 bq1VarA = su2.a(yp1Var, false, (ns0) obj5);
                    d00 d00Var = (d00) obj3;
                    cn1 cn1VarD2 = eo.d(f5.g, false);
                    int iC2 = lq.C(nv0Var2);
                    n52 n52VarL2 = nv0Var2.l();
                    bq1 bq1VarM2 = lr.M(nv0Var2, bq1VarA);
                    w10.c.getClass();
                    nv0Var2.d0();
                    if (nv0Var2.S) {
                        nv0Var2.k(x91Var);
                    } else {
                        nv0Var2.m0();
                    }
                    y02.F(f5.E, nv0Var2, cn1VarD2);
                    y02.F(f5.D, nv0Var2, n52VarL2);
                    z00 z00Var2 = f5.F;
                    if (nv0Var2.S || !s51.n(nv0Var2.O(), Integer.valueOf(iC2))) {
                        nc2.q(iC2, nv0Var2, iC2, z00Var2);
                    }
                    y02.F(f5.C, nv0Var2, bq1VarM2);
                    nc2.p(0, d00Var, nv0Var2, true);
                }
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                nv0 nv0Var3 = (nv0) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (!nv0Var3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    nv0Var3.U();
                } else {
                    bq1 bq1VarI = f80.I(j43.a(yp1Var, xp.c, xp.d), (x12) obj4);
                    ss0 ss0Var = (ss0) obj3;
                    dp2 dp2VarA = cp2.a(n92.e, f5.q, nv0Var3, 54);
                    int iC3 = lq.C(nv0Var3);
                    n52 n52VarL3 = nv0Var3.l();
                    bq1 bq1VarM3 = lr.M(nv0Var3, bq1VarI);
                    w10.c.getClass();
                    nv0Var3.d0();
                    if (nv0Var3.S) {
                        nv0Var3.k(x91Var);
                    } else {
                        nv0Var3.m0();
                    }
                    y02.F(f5.E, nv0Var3, dp2VarA);
                    y02.F(f5.D, nv0Var3, n52VarL3);
                    z00 z00Var3 = f5.F;
                    if (nv0Var3.S || !s51.n(nv0Var3.O(), Integer.valueOf(iC3))) {
                        nc2.q(iC3, nv0Var3, iC3, z00Var3);
                    }
                    y02.F(f5.C, nv0Var3, bq1VarM3);
                    ss0Var.e(fp2.a, nv0Var3, 6);
                    nv0Var3.p(true);
                }
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                nv0 nv0Var4 = (nv0) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && nv0Var4.D()) {
                    nv0Var4.U();
                } else {
                    ((lb0) obj4).l.e((qt1) obj3, nv0Var4, 0);
                }
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                nv0 nv0Var5 = (nv0) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (!nv0Var5.R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    nv0Var5.U();
                } else {
                    mg3.a(((ol3) obj4).j, (d00) obj3, nv0Var5, 0);
                }
                break;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                nv0 nv0Var6 = (nv0) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && nv0Var6.D()) {
                    nv0Var6.U();
                } else {
                    vp.l((dq2) obj4, (d00) obj3, nv0Var6, 0);
                }
                break;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                nv0 nv0Var7 = (nv0) obj;
                qt1 qt1Var = (qt1) obj4;
                if ((((Number) obj2).intValue() & 3) == 2 && nv0Var7.D()) {
                    nv0Var7.U();
                } else {
                    fu1 fu1Var = qt1Var.g;
                    fu1Var.getClass();
                    ((g10) fu1Var).k.l((sd) obj3, qt1Var, nv0Var7, 0);
                }
                break;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                nv0 nv0Var8 = (nv0) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                e93 e93Var = (e93) obj4;
                if (!nv0Var8.R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    nv0Var8.U();
                } else {
                    bq1 bq1VarU = r51.u(yp1Var, "indicator");
                    boolean zF2 = nv0Var8.f(e93Var);
                    Object objO2 = nv0Var8.O();
                    Object obj6 = objO2;
                    if (zF2 || objO2 == zjVar) {
                        m90 m90Var = new m90(e93Var, 3);
                        nv0Var8.j0(m90Var);
                        obj6 = m90Var;
                    }
                    eo.a(gv3.v(vm1.z(bq1VarU, (ns0) obj6), ((yu1) obj3).c, g23.a(cl3.h0, nv0Var8)), nv0Var8, 0);
                }
                break;
            case 8:
                nv0 nv0Var9 = (nv0) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                if (!nv0Var9.R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    nv0Var9.U();
                } else {
                    eo.a(l11.a(gq.t(r51.u(yp1Var, "indicatorRipple"), (z13) obj4), (nm1) obj3, ko2.a(0.0f, 7, 0L, false)), nv0Var9, 0);
                }
                break;
            case vr.g /* 9 */:
                nv0 nv0Var10 = (nv0) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                if (!nv0Var10.R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    nv0Var10.U();
                } else {
                    d00 d00Var2 = (d00) obj4;
                    ir2 ir2Var = (ir2) obj3;
                    cn1 cn1VarD3 = eo.d(f5.g, false);
                    int iC4 = lq.C(nv0Var10);
                    n52 n52VarL4 = nv0Var10.l();
                    bq1 bq1VarM4 = lr.M(nv0Var10, yp1Var);
                    w10.c.getClass();
                    nv0Var10.d0();
                    if (nv0Var10.S) {
                        nv0Var10.k(x91Var);
                    } else {
                        nv0Var10.m0();
                    }
                    y02.F(f5.E, nv0Var10, cn1VarD3);
                    y02.F(f5.D, nv0Var10, n52VarL4);
                    z00 z00Var4 = f5.F;
                    if (nv0Var10.S || !s51.n(nv0Var10.O(), Integer.valueOf(iC4))) {
                        nc2.q(iC4, nv0Var10, iC4, z00Var4);
                    }
                    y02.F(f5.C, nv0Var10, bq1VarM4);
                    d00Var2.e(ir2Var, nv0Var10, 6);
                    nv0Var10.p(true);
                }
                break;
            case vr.h /* 10 */:
                nv0 nv0Var11 = (nv0) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                if (!nv0Var11.R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    nv0Var11.U();
                } else {
                    ((ss0) obj4).e((qc3) obj3, nv0Var11, 6);
                }
                break;
            case 11:
                nv0 nv0Var12 = (nv0) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                if (!nv0Var12.R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    nv0Var12.U();
                } else {
                    ((ss0) obj4).e((ze3) obj3, nv0Var12, 6);
                }
                break;
            default:
                nv0 nv0Var13 = (nv0) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                if (!nv0Var13.R(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    nv0Var13.U();
                } else {
                    os1 os1Var = (os1) obj4;
                    Object objO3 = nv0Var13.O();
                    if (objO3 == zjVar) {
                        objO3 = new zb(os1Var, 29);
                        nv0Var13.j0(objO3);
                    }
                    bq1 bq1VarU2 = n92.u(yp1Var, (ns0) objO3);
                    d00 d00Var3 = (d00) obj3;
                    cn1 cn1VarD4 = eo.d(f5.g, false);
                    int iC5 = lq.C(nv0Var13);
                    n52 n52VarL5 = nv0Var13.l();
                    bq1 bq1VarM5 = lr.M(nv0Var13, bq1VarU2);
                    w10.c.getClass();
                    nv0Var13.d0();
                    if (nv0Var13.S) {
                        nv0Var13.k(x91Var);
                    } else {
                        nv0Var13.m0();
                    }
                    y02.F(f5.E, nv0Var13, cn1VarD4);
                    y02.F(f5.D, nv0Var13, n52VarL5);
                    z00 z00Var5 = f5.F;
                    if (nv0Var13.S || !s51.n(nv0Var13.O(), Integer.valueOf(iC5))) {
                        nc2.q(iC5, nv0Var13, iC5, z00Var5);
                    }
                    y02.F(f5.C, nv0Var13, bq1VarM5);
                    nc2.p(0, d00Var3, nv0Var13, true);
                }
                break;
        }
        return dm3Var;
    }
}
