package defpackage;

import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y71 implements ss0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ os1 g;

    public /* synthetic */ y71(os1 os1Var, int i) {
        this.f = i;
        this.g = os1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ss0
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.f;
        int i6 = 3;
        int i7 = 15;
        zj zjVar = c20.a;
        int i8 = 2;
        dm3 dm3Var = dm3.a;
        os1 os1Var = this.g;
        Object[] objArr = 0;
        switch (i5) {
            case 0:
                nv0 nv0Var = (nv0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ep2) obj).getClass();
                if (nv0Var.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    if (gv3.l(os1Var)) {
                        i = 1882137488;
                        i2 = R.string.launcher_action_hide_details;
                    } else {
                        i = 1882140152;
                        i2 = R.string.launcher_action_show_details_generic;
                    }
                    mg3.b(by1.f(nv0Var, i, i2, nv0Var, false), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var, 0, 0, 262142);
                } else {
                    nv0Var.U();
                }
                return dm3Var;
            case 1:
                nv0 nv0Var2 = (nv0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ry) obj).getClass();
                if (nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    yp1 yp1Var = yp1.a;
                    bq1 bq1VarJ = f80.J(yp1Var, 24.0f);
                    qy qyVarA = oy.a(new jj(12.0f, true, new c(1)), f5.t, nv0Var2, 54);
                    int iHashCode = Long.hashCode(nv0Var2.T);
                    n52 n52VarL = nv0Var2.l();
                    bq1 bq1VarM = lr.M(nv0Var2, bq1VarJ);
                    w10.c.getClass();
                    nv0Var2.d0();
                    if (nv0Var2.S) {
                        nv0Var2.k(tb1.Y);
                    } else {
                        nv0Var2.m0();
                    }
                    y02.F(f5.E, nv0Var2, qyVarA);
                    y02.F(f5.D, nv0Var2, n52VarL);
                    y02.F(f5.F, nv0Var2, Integer.valueOf(iHashCode));
                    y02.C(nv0Var2);
                    y02.F(f5.C, nv0Var2, bq1VarM);
                    w01 w01VarE = lq.E();
                    bq1 bq1VarK = j43.k(yp1Var, 48.0f);
                    r93 r93Var = hy.a;
                    s01.a(w01VarE, null, bq1VarK, ((fy) nv0Var2.j(r93Var)).s, nv0Var2, 432, 0);
                    String strM = oz2.M(R.string.launcher_tab_raksamp, nv0Var2);
                    r93 r93Var2 = ql3.a;
                    mg3.b(strM, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var2.j(r93Var2)).f, nv0Var2, 0, 0, 131070);
                    mg3.b(oz2.M(R.string.launcher_raksamp_no_instances, nv0Var2), null, ((fy) nv0Var2.j(r93Var)).s, 0L, null, null, 0L, new ld3(3), 0L, 0, false, 0, 0, ((ol3) nv0Var2.j(r93Var2)).k, nv0Var2, 0, 0, 130042);
                    Object objO = nv0Var2.O();
                    if (objO == zjVar) {
                        objO = new yb(os1Var, 15);
                        nv0Var2.j0(objO);
                    }
                    gq.a((cs0) objO, null, false, null, null, null, null, null, rn.h, nv0Var2, 805306374, 510);
                    nv0Var2.p(true);
                } else {
                    nv0Var2.U();
                }
                return dm3Var;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                nv0 nv0Var3 = (nv0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((oo0) obj).getClass();
                if (nv0Var3.R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    for (xy2 xy2Var : xy2.l) {
                        int iOrdinal = xy2Var.ordinal();
                        if (iOrdinal == 0) {
                            i3 = -1371559389;
                            i4 = R.string.launcher_encoding_utf8;
                        } else if (iOrdinal == 1) {
                            i3 = -1371555998;
                            i4 = R.string.launcher_encoding_gbk;
                        } else {
                            if (iOrdinal != 2) {
                                throw by1.d(nv0Var3, -1371561520, false);
                            }
                            i3 = -1371552374;
                            i4 = R.string.launcher_encoding_windows1251;
                        }
                        String strF = by1.f(nv0Var3, i3, i4, nv0Var3, false);
                        boolean z = ((xy2) os1Var.getValue()) == xy2Var;
                        boolean zD = nv0Var3.d(xy2Var.ordinal());
                        Object objO2 = nv0Var3.O();
                        if (zD || objO2 == zjVar) {
                            objO2 = new u1(26, xy2Var, os1Var);
                            nv0Var3.j0(objO2);
                        }
                        gu.e(z, (cs0) objO2, gq.N(341736071, new z71(strF, i6, objArr == true ? 1 : 0), nv0Var3), null, false, null, null, null, null, nv0Var3, 384);
                    }
                } else {
                    nv0Var3.U();
                }
                return dm3Var;
            default:
                ep2 ep2Var = (ep2) obj;
                nv0 nv0Var4 = (nv0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ep2Var.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= nv0Var4.f(ep2Var) ? 4 : 2;
                }
                if (nv0Var4.R(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    for (jz2 jz2Var : jz2.i) {
                        boolean z2 = ((jz2) os1Var.getValue()) == jz2Var;
                        boolean zF = nv0Var4.f(os1Var) | nv0Var4.d(jz2Var.ordinal());
                        Object objO3 = nv0Var4.O();
                        if (zF || objO3 == zjVar) {
                            objO3 = new me1(i7, jz2Var, os1Var);
                            nv0Var4.j0(objO3);
                        }
                        fh1.a(ep2Var, (cs0) objO3, null, gq.N(-1089841451, new wa2(i8, jz2Var, z2), nv0Var4), nv0Var4, (iIntValue4 & 14) | 3072);
                    }
                } else {
                    nv0Var4.U();
                }
                return dm3Var;
        }
    }
}
