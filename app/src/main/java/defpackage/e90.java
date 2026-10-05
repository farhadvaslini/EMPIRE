package defpackage;

import android.os.Build;
import android.view.SoundEffectConstants;
import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class e90 implements rs0 {
    public final /* synthetic */ int f;
    public final Object g;

    public /* synthetic */ e90(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        fp2 fp2Var = fp2.a;
        zj zjVar = c20.a;
        x91 x91Var = tb1.Y;
        yp1 yp1Var = yp1.a;
        dm3 dm3Var = dm3.a;
        Object obj3 = this.g;
        switch (i) {
            case 0:
                nv0 nv0Var = (nv0) obj;
                int iIntValue = ((Number) obj2).intValue();
                jv1 jv1Var = (jv1) obj3;
                if (!nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    nv0Var.U();
                } else {
                    bq1 bq1VarQ = j43.q(vm1.U(j43.b, jv1Var.d), w7.S, 0.0f, 2);
                    float f = wv1.a;
                    bq1 bq1VarA = su2.a(f80.L(bq1VarQ, 0.0f, 4.0f, 1), false, new cr2(14));
                    Object objO = nv0Var.O();
                    if (objO == zjVar) {
                        objO = new n20(2);
                        nv0Var.j0(objO);
                    }
                    bq1 bq1VarA2 = su2.a(bq1VarA, false, (ns0) objO);
                    qy qyVarA = oy.a(new jj(4.0f, true, new c(1)), f5.t, nv0Var, 54);
                    int iC = lq.C(nv0Var);
                    n52 n52VarL = nv0Var.l();
                    bq1 bq1VarM = lr.M(nv0Var, bq1VarA2);
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
                    nv0Var.a0(-548182273);
                    nv0Var.p(false);
                    jv1Var.e.e(ry.a, nv0Var, 6);
                    nv0Var.p(true);
                }
                break;
            case 1:
                int i2 = ((ro0) obj).a;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                Integer numC = yo0.c(i2);
                if (numC != null) {
                    int iIntValue2 = numC.intValue();
                    ((h7) obj3).playSoundEffect(Build.VERSION.SDK_INT >= 31 ? kf.a.a(iIntValue2, zBooleanValue) : SoundEffectConstants.getContantForFocusDirection(iIntValue2));
                }
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                nv0 nv0Var2 = (nv0) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (!nv0Var2.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    nv0Var2.U();
                } else {
                    ((ss0) obj3).e(fp2Var, nv0Var2, 0);
                }
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                nv0 nv0Var3 = (nv0) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                pl plVar = (pl) obj3;
                if (!nv0Var3.R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    nv0Var3.U();
                } else {
                    String strP = g12.P(R.string.m3c_dialog, nv0Var3);
                    bq1 bq1Var = (bq1) plVar.h;
                    b22 b22Var = e5.a;
                    bq1 bq1VarN = j43.n(bq1Var, 280.0f, 0.0f, 560.0f, 10);
                    boolean zF = nv0Var3.f(strP);
                    Object objO2 = nv0Var3.O();
                    if (zF || objO2 == zjVar) {
                        objO2 = new im(3, strP);
                        nv0Var3.j0(objO2);
                    }
                    bq1 bq1VarD = bq1VarN.d(su2.a(yp1Var, false, (ns0) objO2));
                    cn1 cn1VarD = eo.d(f5.g, true);
                    int iC2 = lq.C(nv0Var3);
                    n52 n52VarL2 = nv0Var3.l();
                    bq1 bq1VarM2 = lr.M(nv0Var3, bq1VarD);
                    w10.c.getClass();
                    nv0Var3.d0();
                    if (nv0Var3.S) {
                        nv0Var3.k(x91Var);
                    } else {
                        nv0Var3.m0();
                    }
                    y02.F(f5.E, nv0Var3, cn1VarD);
                    y02.F(f5.D, nv0Var3, n52VarL2);
                    z00 z00Var2 = f5.F;
                    if (nv0Var3.S || !s51.n(nv0Var3.O(), Integer.valueOf(iC2))) {
                        nc2.q(iC2, nv0Var3, iC2, z00Var2);
                    }
                    y02.F(f5.C, nv0Var3, bq1VarM2);
                    nc2.p(0, (d00) plVar.j, nv0Var3, true);
                }
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                nv0 nv0Var4 = (nv0) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                jv1 jv1Var2 = (jv1) obj3;
                if (!nv0Var4.R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    nv0Var4.U();
                } else {
                    bq1 bq1VarA3 = su2.a(j43.b(vm1.U(j43.c(yp1Var, 1.0f), jv1Var2.d), 0.0f, iv1.a, 1), false, new cr2(14));
                    jj jjVar = new jj(iv1.b, true, new c(1));
                    um umVar = f5.q;
                    d00 d00Var = jv1Var2.e;
                    dp2 dp2VarA = cp2.a(jjVar, umVar, nv0Var4, 54);
                    int iC3 = lq.C(nv0Var4);
                    n52 n52VarL3 = nv0Var4.l();
                    bq1 bq1VarM3 = lr.M(nv0Var4, bq1VarA3);
                    w10.c.getClass();
                    nv0Var4.d0();
                    if (nv0Var4.S) {
                        nv0Var4.k(x91Var);
                    } else {
                        nv0Var4.m0();
                    }
                    y02.F(f5.E, nv0Var4, dp2VarA);
                    y02.F(f5.D, nv0Var4, n52VarL3);
                    z00 z00Var3 = f5.F;
                    if (nv0Var4.S || !s51.n(nv0Var4.O(), Integer.valueOf(iC3))) {
                        nc2.q(iC3, nv0Var4, iC3, z00Var3);
                    }
                    y02.F(f5.C, nv0Var4, bq1VarM3);
                    d00Var.e(fp2Var, nv0Var4, 6);
                    nv0Var4.p(true);
                }
                break;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                nv0 nv0Var5 = (nv0) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                if (!nv0Var5.R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    nv0Var5.U();
                } else {
                    gj gjVar = n92.c;
                    um umVar2 = f5.q;
                    ss0 ss0Var = ((d43) obj3).f;
                    dp2 dp2VarA2 = cp2.a(gjVar, umVar2, nv0Var5, 54);
                    int iC4 = lq.C(nv0Var5);
                    n52 n52VarL4 = nv0Var5.l();
                    bq1 bq1VarM4 = lr.M(nv0Var5, yp1Var);
                    w10.c.getClass();
                    nv0Var5.d0();
                    if (nv0Var5.S) {
                        nv0Var5.k(x91Var);
                    } else {
                        nv0Var5.m0();
                    }
                    y02.F(f5.E, nv0Var5, dp2VarA2);
                    y02.F(f5.D, nv0Var5, n52VarL4);
                    z00 z00Var4 = f5.F;
                    if (nv0Var5.S || !s51.n(nv0Var5.O(), Integer.valueOf(iC4))) {
                        nc2.q(iC4, nv0Var5, iC4, z00Var4);
                    }
                    y02.F(f5.C, nv0Var5, bq1VarM4);
                    ss0Var.e(fp2Var, nv0Var5, 6);
                    nv0Var5.p(true);
                }
                break;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                nv0 nv0Var6 = (nv0) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                if (!nv0Var6.R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    nv0Var6.U();
                } else {
                    Object objO3 = nv0Var6.O();
                    if (objO3 == zjVar) {
                        objO3 = new fi1(9);
                        nv0Var6.j0(objO3);
                    }
                    bq1 bq1VarA4 = su2.a(yp1Var, false, (ns0) objO3);
                    os1 os1Var = (os1) obj3;
                    cn1 cn1VarD2 = eo.d(f5.g, false);
                    int iC5 = lq.C(nv0Var6);
                    n52 n52VarL5 = nv0Var6.l();
                    bq1 bq1VarM5 = lr.M(nv0Var6, bq1VarA4);
                    w10.c.getClass();
                    nv0Var6.d0();
                    if (nv0Var6.S) {
                        nv0Var6.k(x91Var);
                    } else {
                        nv0Var6.m0();
                    }
                    y02.F(f5.E, nv0Var6, cn1VarD2);
                    y02.F(f5.D, nv0Var6, n52VarL5);
                    z00 z00Var5 = f5.F;
                    if (nv0Var6.S || !s51.n(nv0Var6.O(), Integer.valueOf(iC5))) {
                        nc2.q(iC5, nv0Var6, iC5, z00Var5);
                    }
                    y02.F(f5.C, nv0Var6, bq1VarM5);
                    ((rs0) os1Var.getValue()).f(nv0Var6, 0);
                    nv0Var6.p(true);
                }
                break;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                nv0 nv0Var7 = (nv0) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                if (!nv0Var7.R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    nv0Var7.U();
                } else {
                    eo.a(l11.a(gq.t(r51.u(yp1Var, "indicatorRipple"), g23.a(cl3.h0, nv0Var7)), (nm1) obj3, ko2.a(0.0f, 7, 0L, false)), nv0Var7, 0);
                }
                break;
            default:
                nv0 nv0Var8 = (nv0) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                if (!nv0Var8.R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    nv0Var8.U();
                } else {
                    mg3.b((String) obj3, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var8, 0, 0, 262142);
                }
                break;
        }
        return dm3Var;
    }
}
