package defpackage;

import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u81 implements ss0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ zs0 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ u81(y31 y31Var, cs0 cs0Var, boolean z, ns0 ns0Var, ns0 ns0Var2) {
        this.f = 1;
        this.i = y31Var;
        this.g = cs0Var;
        this.h = z;
        this.j = ns0Var;
        this.k = ns0Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0888  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x089d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0940  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x095e  */
    @Override // defpackage.ss0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Object obj, Object obj2, Object obj3) {
        boolean z;
        String strN;
        int i;
        int i2;
        mg2 mg2Var;
        long jC;
        z00 z00Var;
        yp1 yp1Var;
        cs0 cs0Var;
        w01 w01VarB;
        int i3 = this.f;
        zj zjVar = c20.a;
        boolean z2 = this.h;
        dm3 dm3Var = dm3.a;
        Object obj4 = this.k;
        Object obj5 = this.j;
        Object obj6 = this.i;
        zs0 zs0Var = this.g;
        final int i4 = 1;
        switch (i3) {
            case 0:
                cs0 cs0Var2 = (cs0) zs0Var;
                cs0 cs0Var3 = (cs0) obj6;
                vg2 vg2Var = (vg2) obj5;
                os1 os1Var = (os1) obj4;
                nv0 nv0Var = (nv0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ry) obj).getClass();
                if (nv0Var.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    yp1 yp1Var2 = yp1.a;
                    bq1 bq1VarM = f80.M(j43.c(yp1Var2, 1.0f), 16.0f, 8.0f, 4.0f, 8.0f);
                    dp2 dp2VarA = cp2.a(n92.b, f5.q, nv0Var, 48);
                    int iHashCode = Long.hashCode(nv0Var.T);
                    n52 n52VarL = nv0Var.l();
                    bq1 bq1VarM2 = lr.M(nv0Var, bq1VarM);
                    w10.c.getClass();
                    nv0Var.d0();
                    boolean z3 = nv0Var.S;
                    x91 x91Var = tb1.Y;
                    if (z3) {
                        nv0Var.k(x91Var);
                    } else {
                        nv0Var.m0();
                    }
                    z00 z00Var2 = f5.E;
                    y02.F(z00Var2, nv0Var, dp2VarA);
                    z00 z00Var3 = f5.D;
                    y02.F(z00Var3, nv0Var, n52VarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    z00 z00Var4 = f5.F;
                    y02.F(z00Var4, nv0Var, numValueOf);
                    y02.C(nv0Var);
                    z00 z00Var5 = f5.C;
                    y02.F(z00Var5, nv0Var, bq1VarM2);
                    jc1 jc1Var = new jc1(1.0f, true);
                    qy qyVarA = oy.a(n92.d, f5.s, nv0Var, 0);
                    int iHashCode2 = Long.hashCode(nv0Var.T);
                    n52 n52VarL2 = nv0Var.l();
                    bq1 bq1VarM3 = lr.M(nv0Var, jc1Var);
                    nv0Var.d0();
                    if (nv0Var.S) {
                        nv0Var.k(x91Var);
                    } else {
                        nv0Var.m0();
                    }
                    y02.F(z00Var2, nv0Var, qyVarA);
                    y02.F(z00Var3, nv0Var, n52VarL2);
                    nc2.r(iHashCode2, nv0Var, z00Var4, nv0Var);
                    y02.F(z00Var5, nv0Var, bq1VarM3);
                    String str = vg2Var.b + ":" + vg2Var.c;
                    r93 r93Var = ql3.a;
                    mg3.b(str, null, 0L, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, ((ol3) nv0Var.j(r93Var)).i, nv0Var, 0, 24960, 110590);
                    oz2.g(nv0Var, j43.e(yp1Var2, 4.0f));
                    mg2 mg2Var2 = (mg2) os1Var.getValue();
                    if (mg2Var2 instanceof kg2) {
                        i = 748505895;
                        i2 = R.string.launcher_raksamp_disconnected;
                        z = false;
                    } else {
                        z = false;
                        if (mg2Var2 instanceof jg2) {
                            i = 748511525;
                            i2 = R.string.launcher_raksamp_connecting;
                        } else {
                            if (mg2Var2 instanceof ig2) {
                                nv0Var.a0(1729174340);
                                mg2 mg2Var3 = (mg2) os1Var.getValue();
                                mg2Var3.getClass();
                                strN = oz2.N(R.string.launcher_raksamp_connected_to, new Object[]{((ig2) mg2Var3).b}, nv0Var);
                                z = false;
                                nv0Var.p(false);
                            } else {
                                if (!(mg2Var2 instanceof lg2)) {
                                    throw by1.d(nv0Var, 748502149, false);
                                }
                                nv0Var.a0(1729501266);
                                mg2 mg2Var4 = (mg2) os1Var.getValue();
                                mg2Var4.getClass();
                                strN = oz2.N(R.string.launcher_raksamp_error, new Object[]{((lg2) mg2Var4).a}, nv0Var);
                                z = false;
                                nv0Var.p(false);
                            }
                            String str2 = strN;
                            mg2Var = (mg2) os1Var.getValue();
                            if (!(mg2Var instanceof ig2)) {
                                nv0Var.a0(748539522);
                                nv0Var.p(z);
                                jC = vp.c(4283215696L);
                            } else if (mg2Var instanceof jg2) {
                                nv0Var.a0(748543202);
                                nv0Var.p(z);
                                jC = vp.c(4294951175L);
                            } else if (mg2Var instanceof lg2) {
                                nv0Var.a0(748546722);
                                nv0Var.p(z);
                                jC = vp.c(4294198070L);
                            } else {
                                nv0Var.a0(748549025);
                                jC = ((fy) nv0Var.j(hy.a)).s;
                                nv0Var.p(z);
                            }
                            mg3.b(str2, null, jC, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, ((ol3) nv0Var.j(r93Var)).l, nv0Var, 0, 24960, 110586);
                            oz2.g(nv0Var, j43.e(yp1Var2, 2.0f));
                            mg3.b(oz2.N(R.string.launcher_raksamp_nick_label, new Object[]{vg2Var.d}, nv0Var), null, ((fy) nv0Var.j(hy.a)).s, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, ((ol3) nv0Var.j(r93Var)).l, nv0Var, 0, 24960, 110586);
                            nv0Var.p(true);
                            if (z2) {
                                nv0Var.a0(-369096581);
                                nv0Var.p(false);
                            } else {
                                nv0Var.a0(-369467527);
                                gv3.f(cs0Var2, null, false, null, null, rn.u, nv0Var, 1572864, 62);
                                nv0Var.p(false);
                            }
                            gv3.f(cs0Var3, null, false, null, null, rn.v, nv0Var, 1572864, 62);
                            nv0Var.p(true);
                        }
                    }
                    strN = by1.f(nv0Var, i, i2, nv0Var, z);
                    String str22 = strN;
                    mg2Var = (mg2) os1Var.getValue();
                    if (!(mg2Var instanceof ig2)) {
                    }
                    mg3.b(str22, null, jC, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, ((ol3) nv0Var.j(r93Var)).l, nv0Var, 0, 24960, 110586);
                    oz2.g(nv0Var, j43.e(yp1Var2, 2.0f));
                    mg3.b(oz2.N(R.string.launcher_raksamp_nick_label, new Object[]{vg2Var.d}, nv0Var), null, ((fy) nv0Var.j(hy.a)).s, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, ((ol3) nv0Var.j(r93Var)).l, nv0Var, 0, 24960, 110586);
                    nv0Var.p(true);
                    if (z2) {
                    }
                    gv3.f(cs0Var3, null, false, null, null, rn.v, nv0Var, 1572864, 62);
                    nv0Var.p(true);
                } else {
                    nv0Var.U();
                }
                return dm3Var;
            case 1:
                y31 y31Var = (y31) obj6;
                cs0 cs0Var4 = (cs0) zs0Var;
                ns0 ns0Var = (ns0) obj5;
                ns0 ns0Var2 = (ns0) obj4;
                nv0 nv0Var2 = (nv0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ry) obj).getClass();
                if (nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    yp1 yp1Var3 = yp1.a;
                    bq1 bq1VarJ = f80.J(j43.c(yp1Var3, 1.0f), 16.0f);
                    dp2 dp2VarA2 = cp2.a(n92.b, f5.q, nv0Var2, 48);
                    int iHashCode3 = Long.hashCode(nv0Var2.T);
                    n52 n52VarL3 = nv0Var2.l();
                    bq1 bq1VarM4 = lr.M(nv0Var2, bq1VarJ);
                    w10.c.getClass();
                    nv0Var2.d0();
                    boolean z4 = nv0Var2.S;
                    x91 x91Var2 = tb1.Y;
                    if (z4) {
                        nv0Var2.k(x91Var2);
                    } else {
                        nv0Var2.m0();
                    }
                    z00 z00Var6 = f5.E;
                    y02.F(z00Var6, nv0Var2, dp2VarA2);
                    z00 z00Var7 = f5.D;
                    y02.F(z00Var7, nv0Var2, n52VarL3);
                    Integer numValueOf2 = Integer.valueOf(iHashCode3);
                    z00 z00Var8 = f5.F;
                    y02.F(z00Var8, nv0Var2, numValueOf2);
                    y02.C(nv0Var2);
                    z00 z00Var9 = f5.C;
                    y02.F(z00Var9, nv0Var2, bq1VarM4);
                    w01 w01VarB2 = vr.b;
                    if (w01VarB2 != null) {
                        yp1Var = yp1Var3;
                        z00Var = z00Var6;
                    } else {
                        v01 v01Var = new v01("Filled.Extension", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i5 = vo3.a;
                        z00Var = z00Var6;
                        w73 w73Var = new w73(wx.b);
                        tx0 tx0Var = new tx0(1);
                        tx0Var.j(20.5f, 11.0f);
                        tx0Var.f(19.0f);
                        tx0Var.n(7.0f);
                        tx0Var.e(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                        tx0Var.g(-4.0f);
                        tx0Var.n(3.5f);
                        tx0Var.d(13.0f, 2.12f, 11.88f, 1.0f, 10.5f, 1.0f);
                        yp1Var = yp1Var3;
                        tx0Var.k(8.0f, 2.12f, 8.0f, 3.5f);
                        tx0Var.n(5.0f);
                        tx0Var.f(4.0f);
                        tx0Var.e(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
                        tx0Var.o(3.8f);
                        tx0Var.f(3.5f);
                        tx0Var.e(1.49f, 0.0f, 2.7f, 1.21f, 2.7f, 2.7f);
                        tx0Var.l(-1.21f, 2.7f, -2.7f, 2.7f);
                        tx0Var.f(2.0f);
                        tx0Var.n(20.0f);
                        tx0Var.e(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                        tx0Var.g(3.8f);
                        tx0Var.o(-1.5f);
                        tx0Var.e(0.0f, -1.49f, 1.21f, -2.7f, 2.7f, -2.7f);
                        tx0Var.e(1.49f, 0.0f, 2.7f, 1.21f, 2.7f, 2.7f);
                        tx0Var.n(22.0f);
                        tx0Var.f(17.0f);
                        tx0Var.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        tx0Var.o(-4.0f);
                        tx0Var.g(1.5f);
                        tx0Var.e(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
                        tx0Var.k(21.88f, 11.0f, 20.5f, 11.0f);
                        tx0Var.c();
                        v01.a(v01Var, tx0Var.a, w73Var);
                        w01VarB2 = v01Var.b();
                        vr.b = w01VarB2;
                    }
                    s01.a(w01VarB2, null, null, gq.B(nv0Var2).a, nv0Var2, 48, 4);
                    bq1 bq1VarL = f80.L(new jc1(1.0f, true), 12.0f, 0.0f, 2);
                    hj hjVar = n92.d;
                    qy qyVarA2 = oy.a(hjVar, f5.s, nv0Var2, 0);
                    int iHashCode4 = Long.hashCode(nv0Var2.T);
                    n52 n52VarL4 = nv0Var2.l();
                    bq1 bq1VarM5 = lr.M(nv0Var2, bq1VarL);
                    nv0Var2.d0();
                    if (nv0Var2.S) {
                        nv0Var2.k(x91Var2);
                    } else {
                        nv0Var2.m0();
                    }
                    z00 z00Var10 = z00Var;
                    y02.F(z00Var10, nv0Var2, qyVarA2);
                    y02.F(z00Var7, nv0Var2, n52VarL4);
                    nc2.r(iHashCode4, nv0Var2, z00Var8, nv0Var2);
                    y02.F(z00Var9, nv0Var2, bq1VarM5);
                    k82 k82Var = y31Var.a;
                    String str3 = k82Var.g;
                    mg3.b(k82Var.c, null, 0L, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, gq.H(nv0Var2).i, nv0Var2, 0, 24960, 110590);
                    mg3.b(oz2.N(R.string.plugins_version_format, new Object[]{k82Var.d}, nv0Var2), null, gq.B(nv0Var2).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, gq.H(nv0Var2).l, nv0Var2, 0, 0, 131066);
                    r72 r72Var = k82Var.k;
                    if (r72Var == null) {
                        nv0Var2.a0(-1075584422);
                        nv0Var2.p(false);
                    } else {
                        nv0Var2.a0(-1075584421);
                        mg3.b(oz2.N(R.string.plugins_author_format, new Object[]{r72Var.a}, nv0Var2), null, gq.B(nv0Var2).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, gq.H(nv0Var2).l, nv0Var2, 0, 0, 131066);
                        nv0Var2.p(false);
                    }
                    if (y93.q0(str3)) {
                        nv0Var2.a0(-1074787752);
                        nv0Var2.p(false);
                    } else {
                        nv0Var2.a0(-1075183281);
                        mg3.b(str3, f80.N(yp1Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), gq.B(nv0Var2).s, 0L, null, null, 0L, null, 0L, 2, false, 3, 0, gq.H(nv0Var2).k, nv0Var2, 48, 24960, 110584);
                        nv0Var2.p(false);
                    }
                    boolean z5 = !z2;
                    gq.m(cs0Var4, null, z5, null, null, null, cl3.Q, nv0Var2, 805306368, 506);
                    yp1 yp1Var4 = yp1Var;
                    mg3.b(oz2.M(y31Var.c ? R.string.plugins_global_enabled : R.string.plugins_global_disabled, nv0Var2), f80.N(yp1Var4, 0.0f, 4.0f, 0.0f, 0.0f, 13), gq.B(nv0Var2).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, gq.H(nv0Var2).l, nv0Var2, 48, 0, 131064);
                    nv0Var2.p(true);
                    qy qyVarA3 = oy.a(hjVar, f5.t, nv0Var2, 48);
                    int iHashCode5 = Long.hashCode(nv0Var2.T);
                    n52 n52VarL5 = nv0Var2.l();
                    bq1 bq1VarM6 = lr.M(nv0Var2, yp1Var4);
                    nv0Var2.d0();
                    if (nv0Var2.S) {
                        nv0Var2.k(x91Var2);
                    } else {
                        nv0Var2.m0();
                    }
                    y02.F(z00Var10, nv0Var2, qyVarA3);
                    y02.F(z00Var7, nv0Var2, n52VarL5);
                    nc2.r(iHashCode5, nv0Var2, z00Var8, nv0Var2);
                    y02.F(z00Var9, nv0Var2, bq1VarM6);
                    wb3.a(y31Var.c, ns0Var, null, z5, null, nv0Var2, 0, 108);
                    boolean zF = nv0Var2.f(ns0Var2) | nv0Var2.h(y31Var);
                    Object objO = nv0Var2.O();
                    if (zF || objO == zjVar) {
                        objO = new va2(ns0Var2, y31Var, 0);
                        nv0Var2.j0(objO);
                    }
                    gv3.f((cs0) objO, null, z5, null, null, cl3.R, nv0Var2, 1572864, 58);
                    nv0Var2.p(true);
                    nv0Var2.p(true);
                } else {
                    nv0Var2.U();
                }
                return dm3Var;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ss0 ss0Var = (ss0) zs0Var;
                final gp3 gp3Var = (gp3) obj6;
                final rs0 rs0Var = (rs0) obj5;
                final os1 os1Var2 = (os1) obj4;
                nv0 nv0Var3 = (nv0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((ry) obj).getClass();
                if (nv0Var3.R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    d00 d00Var = vm1.G;
                    boolean zF2 = nv0Var3.f(ss0Var) | nv0Var3.h(gp3Var);
                    Object objO2 = nv0Var3.O();
                    if (zF2 || objO2 == zjVar) {
                        objO2 = new ok(ss0Var, gp3Var, os1Var2, 15);
                        nv0Var3.j0(objO2);
                    }
                    u9.b(d00Var, (cs0) objO2, null, false, null, null, nv0Var3, 6, 508);
                    boolean z6 = !z2;
                    d00 d00Var2 = vm1.H;
                    boolean zF3 = nv0Var3.f(rs0Var) | nv0Var3.h(gp3Var);
                    Object objO3 = nv0Var3.O();
                    if (zF3 || objO3 == zjVar) {
                        final int i6 = 0;
                        objO3 = new cs0() { // from class: ph2
                            @Override // defpackage.cs0
                            public final Object a() {
                                int i7 = i6;
                                dm3 dm3Var2 = dm3.a;
                                os1 os1Var3 = os1Var2;
                                gp3 gp3Var2 = gp3Var;
                                rs0 rs0Var2 = rs0Var;
                                switch (i7) {
                                    case 0:
                                        Boolean bool = Boolean.FALSE;
                                        os1Var3.setValue(bool);
                                        rs0Var2.f(Integer.valueOf(gp3Var2.a), bool);
                                        break;
                                    default:
                                        os1Var3.setValue(Boolean.FALSE);
                                        rs0Var2.f(Integer.valueOf(gp3Var2.a), Boolean.TRUE);
                                        break;
                                }
                                return dm3Var2;
                            }
                        };
                        nv0Var3.j0(objO3);
                    }
                    u9.b(d00Var2, (cs0) objO3, null, z6, null, null, nv0Var3, 6, 476);
                    d00 d00Var3 = vm1.I;
                    boolean zF4 = nv0Var3.f(rs0Var) | nv0Var3.h(gp3Var);
                    Object objO4 = nv0Var3.O();
                    if (zF4 || objO4 == zjVar) {
                        objO4 = new cs0() { // from class: ph2
                            @Override // defpackage.cs0
                            public final Object a() {
                                int i7 = i4;
                                dm3 dm3Var2 = dm3.a;
                                os1 os1Var3 = os1Var2;
                                gp3 gp3Var2 = gp3Var;
                                rs0 rs0Var2 = rs0Var;
                                switch (i7) {
                                    case 0:
                                        Boolean bool = Boolean.FALSE;
                                        os1Var3.setValue(bool);
                                        rs0Var2.f(Integer.valueOf(gp3Var2.a), bool);
                                        break;
                                    default:
                                        os1Var3.setValue(Boolean.FALSE);
                                        rs0Var2.f(Integer.valueOf(gp3Var2.a), Boolean.TRUE);
                                        break;
                                }
                                return dm3Var2;
                            }
                        };
                        nv0Var3.j0(objO4);
                    }
                    u9.b(d00Var3, (cs0) objO4, null, false, null, null, nv0Var3, 6, 508);
                } else {
                    nv0Var3.U();
                }
                return dm3Var;
            default:
                cs0 cs0Var5 = (cs0) zs0Var;
                cs0 cs0Var6 = (cs0) obj6;
                String str4 = (String) obj5;
                cs0 cs0Var7 = (cs0) obj4;
                nv0 nv0Var4 = (nv0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((oo0) obj).getClass();
                if (nv0Var4.R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    w01 w01VarB3 = y02.c;
                    if (w01VarB3 != null) {
                        cs0Var = cs0Var7;
                    } else {
                        v01 v01Var2 = new v01("Filled.Terminal", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i7 = vo3.a;
                        cs0Var = cs0Var7;
                        w73 w73Var2 = new w73(wx.b);
                        tx0 tx0Var2 = new tx0(1);
                        tx0Var2.j(20.0f, 4.0f);
                        tx0Var2.f(4.0f);
                        tx0Var2.d(2.89f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f);
                        tx0Var2.o(12.0f);
                        tx0Var2.e(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
                        tx0Var2.g(16.0f);
                        tx0Var2.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        tx0Var2.n(6.0f);
                        tx0Var2.d(22.0f, 4.9f, 21.11f, 4.0f, 20.0f, 4.0f);
                        tx0Var2.c();
                        tx0Var2.j(20.0f, 18.0f);
                        tx0Var2.f(4.0f);
                        tx0Var2.n(8.0f);
                        tx0Var2.g(16.0f);
                        tx0Var2.n(18.0f);
                        tx0Var2.c();
                        tx0Var2.j(18.0f, 17.0f);
                        tx0Var2.g(-6.0f);
                        tx0Var2.o(-2.0f);
                        tx0Var2.g(6.0f);
                        tx0Var2.n(17.0f);
                        tx0Var2.c();
                        tx0Var2.j(7.5f, 17.0f);
                        tx0Var2.i(-1.41f, -1.41f);
                        tx0Var2.h(8.67f, 13.0f);
                        tx0Var2.i(-2.59f, -2.59f);
                        tx0Var2.h(7.5f, 9.0f);
                        tx0Var2.i(4.0f, 4.0f);
                        tx0Var2.h(7.5f, 17.0f);
                        tx0Var2.c();
                        v01.a(v01Var2, tx0Var2.a, w73Var2);
                        w01VarB3 = v01Var2.b();
                        y02.c = w01VarB3;
                    }
                    vm1.i(w01VarB3, oz2.M(R.string.raksamp_bottom_commands, nv0Var4), cs0Var5, null, false, nv0Var4, 0, 24);
                    vm1.i(br.D(), oz2.M(R.string.raksamp_bottom_keys, nv0Var4), cs0Var6, null, false, nv0Var4, 0, 24);
                    boolean z7 = this.h;
                    if (z7) {
                        w01VarB = n32.q();
                    } else {
                        w01VarB = g12.a;
                        if (w01VarB == null) {
                            v01 v01Var3 = new v01("Filled.Pause", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i8 = vo3.a;
                            w73 w73Var3 = new w73(wx.b);
                            tx0 tx0Var3 = new tx0(1);
                            tx0Var3.j(6.0f, 19.0f);
                            tx0Var3.g(4.0f);
                            tx0Var3.h(10.0f, 5.0f);
                            tx0Var3.h(6.0f, 5.0f);
                            tx0Var3.o(14.0f);
                            tx0Var3.c();
                            tx0Var3.j(14.0f, 5.0f);
                            tx0Var3.o(14.0f);
                            tx0Var3.g(4.0f);
                            tx0Var3.h(18.0f, 5.0f);
                            tx0Var3.g(-4.0f);
                            tx0Var3.c();
                            v01.a(v01Var3, tx0Var3.a, w73Var3);
                            w01VarB = v01Var3.b();
                            g12.a = w01VarB;
                        }
                    }
                    vm1.i(w01VarB, str4, cs0Var, null, z7, nv0Var4, 0, 8);
                } else {
                    nv0Var4.U();
                }
                return dm3Var;
        }
    }

    public /* synthetic */ u81(zs0 zs0Var, Object obj, boolean z, Object obj2, Object obj3, int i) {
        this.f = i;
        this.g = zs0Var;
        this.i = obj;
        this.h = z;
        this.j = obj2;
        this.k = obj3;
    }

    public /* synthetic */ u81(boolean z, cs0 cs0Var, cs0 cs0Var2, vg2 vg2Var, os1 os1Var) {
        this.f = 0;
        this.h = z;
        this.g = cs0Var;
        this.i = cs0Var2;
        this.j = vg2Var;
        this.k = os1Var;
    }
}
