package defpackage;

import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vw implements ss0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ cs0 g;

    public /* synthetic */ vw(cs0 cs0Var, int i) {
        this.f = i;
        this.g = cs0Var;
    }

    @Override // defpackage.ss0
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i = this.f;
        qr1 qr1Var = null;
        yp1 yp1Var = yp1.a;
        cs0 cs0Var = this.g;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                nv0 nv0Var = (nv0) obj2;
                ((Integer) obj3).getClass();
                nv0Var.a0(-756081143);
                o11 o11Var = (o11) nv0Var.j(l11.a);
                if (o11Var != null) {
                    nv0Var.a0(-1604682242);
                } else {
                    nv0Var.a0(-1604549624);
                    Object objO = nv0Var.O();
                    if (objO == c20.a) {
                        objO = nc2.e(nv0Var);
                    }
                    qr1Var = (qr1) objO;
                }
                nv0Var.p(false);
                bq1 bq1VarW = rn.w(yp1.a, qr1Var, o11Var, true, null, this.g);
                nv0Var.p(false);
                return bq1VarW;
            case 1:
                nv0 nv0Var2 = (nv0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ry) obj).getClass();
                if (nv0Var2.R(iIntValue & 1, (iIntValue & 17) != 16)) {
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
                    String strM = oz2.M(R.string.raksamp_no_instance_title, nv0Var2);
                    r93 r93Var = ql3.a;
                    mg3.b(strM, null, 0L, 0L, null, null, 0L, new ld3(3), 0L, 0, false, 0, 0, ((ol3) nv0Var2.j(r93Var)).g, nv0Var2, 0, 0, 130046);
                    mg3.b(oz2.M(R.string.raksamp_no_instance_message, nv0Var2), null, ((fy) nv0Var2.j(hy.a)).s, 0L, null, null, 0L, new ld3(3), 0L, 0, false, 0, 0, ((ol3) nv0Var2.j(r93Var)).k, nv0Var2, 0, 0, 130042);
                    oz2.g(nv0Var2, j43.e(yp1Var, 4.0f));
                    gu.b(this.g, n92.t, null, false, n92.u, null, null, null, null, nv0Var2, 24624, 2028);
                    nv0Var2.p(true);
                } else {
                    nv0Var2.U();
                }
                return dm3Var;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                nv0 nv0Var3 = (nv0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((nc1) obj).getClass();
                if (nv0Var3.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    gv3.c(oz2.M(R.string.launcher_recommended_error_title, nv0Var3), oz2.M(R.string.launcher_recommended_error_message, nv0Var3), oz2.M(R.string.launcher_action_retry, nv0Var3), this.g, nv0Var3, 0);
                } else {
                    nv0Var3.U();
                }
                return dm3Var;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                nv0 nv0Var4 = (nv0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((nc1) obj).getClass();
                if (nv0Var4.R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    gv3.c(oz2.M(R.string.launcher_recommended_refresh_failed_title, nv0Var4), oz2.M(R.string.launcher_recommended_refresh_failed_message, nv0Var4), oz2.M(R.string.launcher_action_retry, nv0Var4), this.g, nv0Var4, 0);
                } else {
                    nv0Var4.U();
                }
                return dm3Var;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                nv0 nv0Var5 = (nv0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((ry) obj).getClass();
                if (nv0Var5.R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    vp.g(r51.g1, rn.y(yp1Var, false, null, cs0Var, 15), r51.h1, r51.i1, r51.j1, vr.u(wx.f, nv0Var5), nv0Var5, 224262, 388);
                } else {
                    nv0Var5.U();
                }
                return dm3Var;
            default:
                en1 en1Var = (en1) obj;
                xm1 xm1Var = (xm1) obj2;
                m30 m30Var = (m30) obj3;
                float f = ((jd0) cs0Var.a()).f;
                i62 i62VarT = xm1Var.t(m30.b(m30Var.a, 0, 0, n30.f(jd0.b(f, Float.NaN) ? 0 : en1Var.p0(f), m30Var.a), 0, 11));
                return en1Var.I0(i62VarT.f, i62VarT.g, oi0.f, new z6(i62VarT, 13));
        }
    }
}
