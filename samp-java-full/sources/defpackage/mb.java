package defpackage;

import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mb implements ss0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ cs0 h;

    public /* synthetic */ mb(boolean z, cs0 cs0Var) {
        this.f = 1;
        this.g = z;
        this.h = cs0Var;
    }

    @Override // defpackage.ss0
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i = this.f;
        zj zjVar = c20.a;
        final cs0 cs0Var = this.h;
        final boolean z = this.g;
        switch (i) {
            case 0:
                bq1 bq1Var = (bq1) obj;
                nv0 nv0Var = (nv0) obj2;
                ((Integer) obj3).getClass();
                nv0Var.a0(-196777734);
                final long j = ((ah3) nv0Var.j(bh3.a)).a;
                boolean zE = nv0Var.e(j) | nv0Var.f(cs0Var) | nv0Var.g(z);
                Object objO = nv0Var.O();
                if (zE || objO == zjVar) {
                    objO = new ns0() { // from class: nb
                        @Override // defpackage.ns0
                        public final Object h(Object obj4) {
                            oq oqVar = (oq) obj4;
                            final g9 g9VarZ = gv3.z(oqVar, Float.intBitsToFloat((int) (oqVar.f.a() >> 32)) / 2.0f);
                            final xm xmVar = new xm(5, j);
                            final cs0 cs0Var2 = cs0Var;
                            final boolean z2 = z;
                            return oqVar.c(new ns0() { // from class: fb
                                @Override // defpackage.ns0
                                public final Object h(Object obj5) {
                                    vb1 vb1Var = (vb1) obj5;
                                    vb1Var.c();
                                    rr rrVar = vb1Var.f;
                                    boolean zBooleanValue = ((Boolean) cs0Var2.a()).booleanValue();
                                    dm3 dm3Var = dm3.a;
                                    if (!zBooleanValue) {
                                        return dm3Var;
                                    }
                                    boolean z3 = z2;
                                    g9 g9Var = g9VarZ;
                                    xm xmVar2 = xmVar;
                                    if (!z3) {
                                        rrVar.t(g9Var, xmVar2);
                                        return dm3Var;
                                    }
                                    long jY0 = rrVar.y0();
                                    pi piVar = rrVar.g;
                                    long jA = piVar.A();
                                    piVar.k().l();
                                    try {
                                        ((yl1) piVar.g).G(-1.0f, 1.0f, jY0);
                                        rrVar.t(g9Var, xmVar2);
                                        return dm3Var;
                                    } finally {
                                        nc2.t(piVar, jA);
                                    }
                                }
                            });
                        }
                    };
                    nv0Var.j0(objO);
                }
                bq1 bq1VarL = w7.L(bq1Var, (ns0) objO);
                nv0Var.p(false);
                return bq1VarL;
            case 1:
                bq1 bq1Var2 = (bq1) obj;
                nv0 nv0Var2 = (nv0) obj2;
                ((Integer) obj3).getClass();
                bq1Var2.getClass();
                nv0Var2.a0(-672085858);
                Object objO2 = nv0Var2.O();
                if (objO2 == zjVar) {
                    objO2 = new b42(0L);
                    nv0Var2.j0(objO2);
                }
                b42 b42Var = (b42) objO2;
                boolean zE2 = nv0Var2.e(500L) | nv0Var2.f(cs0Var);
                Object objO3 = nv0Var2.O();
                if (zE2 || objO3 == zjVar) {
                    objO3 = new u1(24, cs0Var, b42Var);
                    nv0Var2.j0(objO3);
                }
                bq1 bq1VarY = rn.y(bq1Var2, z, null, (cs0) objO3, 14);
                nv0Var2.p(false);
                return bq1VarY;
            default:
                nv0 nv0Var3 = (nv0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ry) obj).getClass();
                int i2 = 1;
                if (nv0Var3.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    bq1 bq1VarK = f80.K(yp1.a, 20.0f, 16.0f);
                    dp2 dp2VarA = cp2.a(new jj(16.0f, true, new c(1)), f5.q, nv0Var3, 54);
                    int iHashCode = Long.hashCode(nv0Var3.T);
                    n52 n52VarL = nv0Var3.l();
                    bq1 bq1VarM = lr.M(nv0Var3, bq1VarK);
                    w10.c.getClass();
                    nv0Var3.d0();
                    boolean z2 = nv0Var3.S;
                    x91 x91Var = tb1.Y;
                    if (z2) {
                        nv0Var3.k(x91Var);
                    } else {
                        nv0Var3.m0();
                    }
                    z00 z00Var = f5.E;
                    y02.F(z00Var, nv0Var3, dp2VarA);
                    z00 z00Var2 = f5.D;
                    y02.F(z00Var2, nv0Var3, n52VarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    z00 z00Var3 = f5.F;
                    y02.F(z00Var3, nv0Var3, numValueOf);
                    y02.C(nv0Var3);
                    z00 z00Var4 = f5.C;
                    y02.F(z00Var4, nv0Var3, bq1VarM);
                    jc1 jc1Var = new jc1(1.0f, true);
                    qy qyVarA = oy.a(new jj(4.0f, true, new c(1)), f5.s, nv0Var3, 6);
                    int iHashCode2 = Long.hashCode(nv0Var3.T);
                    n52 n52VarL2 = nv0Var3.l();
                    bq1 bq1VarM2 = lr.M(nv0Var3, jc1Var);
                    nv0Var3.d0();
                    if (nv0Var3.S) {
                        nv0Var3.k(x91Var);
                    } else {
                        nv0Var3.m0();
                    }
                    y02.F(z00Var, nv0Var3, qyVarA);
                    y02.F(z00Var2, nv0Var3, n52VarL2);
                    nc2.r(iHashCode2, nv0Var3, z00Var3, nv0Var3);
                    y02.F(z00Var4, nv0Var3, bq1VarM2);
                    String strM = oz2.M(R.string.launcher_recommended_header_title, nv0Var3);
                    r93 r93Var = ql3.a;
                    gh3 gh3Var = ((ol3) nv0Var3.j(r93Var)).h;
                    xq0 xq0Var = xq0.j;
                    r93 r93Var2 = hy.a;
                    mg3.b(strM, null, ((fy) nv0Var3.j(r93Var2)).d, 0L, xq0Var, null, 0L, null, 0L, 0, false, 0, 0, gh3Var, nv0Var3, 1572864, 0, 131002);
                    mg3.b(oz2.M(R.string.launcher_recommended_header_message, nv0Var3), null, wx.b(0.75f, ((fy) nv0Var3.j(r93Var2)).d), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var3.j(r93Var)).k, nv0Var3, 0, 0, 131066);
                    nv0Var3.p(true);
                    gv3.d(this.h, null, !z, null, null, gq.N(103678001, new ti2(i2, z), nv0Var3), nv0Var3, 1572864);
                    nv0Var3.p(true);
                } else {
                    nv0Var3.U();
                }
                return dm3.a;
        }
    }

    public /* synthetic */ mb(int i, cs0 cs0Var, boolean z) {
        this.f = i;
        this.h = cs0Var;
        this.g = z;
    }
}
