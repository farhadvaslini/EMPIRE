package defpackage;

import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ua2 implements ss0 {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ cs0 i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ ua2(ns0 ns0Var, boolean z, ns0 ns0Var2, boolean z2, cs0 cs0Var) {
        this.j = ns0Var;
        this.g = z;
        this.k = ns0Var2;
        this.h = z2;
        this.i = cs0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0294  */
    @Override // defpackage.ss0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Object obj, Object obj2, Object obj3) {
        es esVar;
        int i = this.f;
        dm3 dm3Var = dm3.a;
        final boolean z = this.h;
        Object obj4 = this.k;
        final boolean z2 = this.g;
        Object obj5 = this.j;
        switch (i) {
            case 0:
                w72 w72Var = (w72) obj5;
                es esVar2 = (es) obj4;
                nv0 nv0Var = (nv0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ry) obj).getClass();
                if (!nv0Var.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    nv0Var.U();
                } else {
                    yp1 yp1Var = yp1.a;
                    bq1 bq1VarJ = f80.J(j43.c(yp1Var, 1.0f), 16.0f);
                    jj jjVar = new jj(8.0f, true, new c(1));
                    tm tmVar = f5.s;
                    qy qyVarA = oy.a(jjVar, tmVar, nv0Var, 6);
                    int iHashCode = Long.hashCode(nv0Var.T);
                    n52 n52VarL = nv0Var.l();
                    bq1 bq1VarM = lr.M(nv0Var, bq1VarJ);
                    w10.c.getClass();
                    nv0Var.d0();
                    boolean z3 = nv0Var.S;
                    x91 x91Var = tb1.Y;
                    if (z3) {
                        nv0Var.k(x91Var);
                    } else {
                        nv0Var.m0();
                    }
                    z00 z00Var = f5.E;
                    y02.F(z00Var, nv0Var, qyVarA);
                    z00 z00Var2 = f5.D;
                    y02.F(z00Var2, nv0Var, n52VarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    z00 z00Var3 = f5.F;
                    y02.F(z00Var3, nv0Var, numValueOf);
                    y02.C(nv0Var);
                    z00 z00Var4 = f5.C;
                    y02.F(z00Var4, nv0Var, bq1VarM);
                    dp2 dp2VarA = cp2.a(n92.b, f5.q, nv0Var, 48);
                    int iHashCode2 = Long.hashCode(nv0Var.T);
                    n52 n52VarL2 = nv0Var.l();
                    bq1 bq1VarM2 = lr.M(nv0Var, yp1Var);
                    nv0Var.d0();
                    if (nv0Var.S) {
                        nv0Var.k(x91Var);
                    } else {
                        nv0Var.m0();
                    }
                    y02.F(z00Var, nv0Var, dp2VarA);
                    y02.F(z00Var2, nv0Var, n52VarL2);
                    nc2.r(iHashCode2, nv0Var, z00Var3, nv0Var);
                    y02.F(z00Var4, nv0Var, bq1VarM2);
                    jc1 jc1Var = new jc1(1.0f, true);
                    qy qyVarA2 = oy.a(n92.d, tmVar, nv0Var, 0);
                    int iHashCode3 = Long.hashCode(nv0Var.T);
                    n52 n52VarL3 = nv0Var.l();
                    bq1 bq1VarM3 = lr.M(nv0Var, jc1Var);
                    nv0Var.d0();
                    if (nv0Var.S) {
                        nv0Var.k(x91Var);
                    } else {
                        nv0Var.m0();
                    }
                    y02.F(z00Var, nv0Var, qyVarA2);
                    y02.F(z00Var2, nv0Var, n52VarL3);
                    nc2.r(iHashCode3, nv0Var, z00Var3, nv0Var);
                    y02.F(z00Var4, nv0Var, bq1VarM3);
                    String str = w72Var.b;
                    r93 r93Var = ql3.a;
                    mg3.b(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var.j(r93Var)).i, nv0Var, 0, 0, 131070);
                    String strN = oz2.N(R.string.plugins_version_format, new Object[]{w72Var.c}, nv0Var);
                    gh3 gh3Var = ((ol3) nv0Var.j(r93Var)).l;
                    r93 r93Var2 = hy.a;
                    mg3.b(strN, null, ((fy) nv0Var.j(r93Var2)).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, gh3Var, nv0Var, 0, 0, 131066);
                    r72 r72Var = w72Var.f;
                    if (r72Var == null) {
                        nv0Var.a0(-843137465);
                        nv0Var.p(false);
                    } else {
                        nv0Var.a0(-843137464);
                        mg3.b(oz2.N(R.string.plugins_author_format, new Object[]{r72Var.a}, nv0Var), null, ((fy) nv0Var.j(r93Var2)).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var.j(r93Var)).l, nv0Var, 0, 0, 131066);
                        nv0Var.p(false);
                    }
                    nv0Var.p(true);
                    if (z2) {
                        esVar = esVar2;
                        boolean z4 = oz2.L(es.f, es.g).contains(esVar);
                        gq.a(this.i, null, z4, null, null, null, null, null, gq.N(-1999535553, new wa2(z, esVar), nv0Var), nv0Var, 805306368, 506);
                        nv0Var.p(true);
                        if (y93.q0(w72Var.e)) {
                            nv0Var.a0(2087574417);
                            mg3.b(w72Var.e, null, ((fy) nv0Var.j(r93Var2)).s, 0L, null, null, 0L, null, 0L, 2, false, 3, 0, ((ol3) nv0Var.j(r93Var)).k, nv0Var, 0, 24960, 110586);
                            nv0Var.p(false);
                        } else {
                            nv0Var.a0(2087870839);
                            nv0Var.p(false);
                        }
                        nv0Var.p(true);
                    } else {
                        esVar = esVar2;
                    }
                    gq.a(this.i, null, z4, null, null, null, null, null, gq.N(-1999535553, new wa2(z, esVar), nv0Var), nv0Var, 805306368, 506);
                    nv0Var.p(true);
                    if (y93.q0(w72Var.e)) {
                    }
                    nv0Var.p(true);
                }
                break;
            default:
                final ns0 ns0Var = (ns0) obj5;
                final ns0 ns0Var2 = (ns0) obj4;
                nv0 nv0Var2 = (nv0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ry) obj).getClass();
                if (!nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    nv0Var2.U();
                } else {
                    gv3.p(gq.N(-1707972212, new ss0() { // from class: m13
                        @Override // defpackage.ss0
                        public final Object e(Object obj6, Object obj7, Object obj8) {
                            nv0 nv0Var3 = (nv0) obj7;
                            int iIntValue3 = ((Integer) obj8).intValue();
                            ((ry) obj6).getClass();
                            if (nv0Var3.R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                long j = wx.f;
                                ei1 ei1VarU = vr.u(j, nv0Var3);
                                ns0 ns0Var3 = ns0Var;
                                boolean zF = nv0Var3.f(ns0Var3);
                                boolean z5 = z2;
                                boolean zG = zF | nv0Var3.g(z5);
                                Object objO = nv0Var3.O();
                                zj zjVar = c20.a;
                                if (zG || objO == zjVar) {
                                    objO = new et(5, ns0Var3, z5);
                                    nv0Var3.j0(objO);
                                }
                                yp1 yp1Var2 = yp1.a;
                                vp.g(r51.a1, rn.y(yp1Var2, false, null, (cs0) objO, 15), r51.b1, r51.c1, gq.N(1304979273, new s03(2, ns0Var3, z5), nv0Var3), ei1VarU, nv0Var3, 224262, 388);
                                gq.g(f80.L(yp1Var2, 16.0f, 0.0f, 2), 0.0f, 0L, nv0Var3, 6, 6);
                                ei1 ei1VarU2 = vr.u(j, nv0Var3);
                                ns0 ns0Var4 = ns0Var2;
                                boolean zF2 = nv0Var3.f(ns0Var4);
                                boolean z6 = z;
                                boolean zG2 = zF2 | nv0Var3.g(z6);
                                Object objO2 = nv0Var3.O();
                                if (zG2 || objO2 == zjVar) {
                                    objO2 = new et(6, ns0Var4, z6);
                                    nv0Var3.j0(objO2);
                                }
                                vp.g(r51.d1, rn.y(yp1Var2, false, null, (cs0) objO2, 15), r51.e1, r51.f1, gq.N(1364430962, new s03(3, ns0Var4, z6), nv0Var3), ei1VarU2, nv0Var3, 224262, 388);
                            } else {
                                nv0Var3.U();
                            }
                            return dm3.a;
                        }
                    }, nv0Var2), nv0Var2, 6);
                    gv3.p(gq.N(1040413187, new vw(this.i, 4), nv0Var2), nv0Var2, 6);
                }
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ ua2(w72 w72Var, cs0 cs0Var, boolean z, es esVar, boolean z2) {
        this.j = w72Var;
        this.i = cs0Var;
        this.g = z;
        this.k = esVar;
        this.h = z2;
    }
}
