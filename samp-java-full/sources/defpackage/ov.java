package defpackage;

import java.util.ArrayList;
import java.util.List;
import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ov implements ss0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ ov(cs0 cs0Var, os1 os1Var, os1 os1Var2, boolean z) {
        this.f = 2;
        this.h = os1Var;
        this.g = z;
        this.i = cs0Var;
        this.j = os1Var2;
    }

    @Override // defpackage.ss0
    public final Object e(Object obj, Object obj2, Object obj3) {
        boolean z;
        z00 z00Var;
        r32 r32Var;
        long j;
        String str;
        nv0 nv0Var;
        boolean z2;
        boolean z3;
        int i = this.f;
        yp1 yp1Var = yp1.a;
        dm3 dm3Var = dm3.a;
        zj zjVar = c20.a;
        Object obj4 = this.j;
        Object obj5 = this.i;
        final boolean z4 = this.g;
        Object obj6 = this.h;
        switch (i) {
            case 0:
                ie1 ie1Var = (ie1) obj6;
                List list = (List) obj5;
                ns0 ns0Var = (ns0) obj4;
                nv0 nv0Var2 = (nv0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((io) obj).getClass();
                if (nv0Var2.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    gm0 gm0Var = j43.c;
                    jj jjVar = new jj(12.0f, true, new c(1));
                    boolean zH = nv0Var2.h(list) | nv0Var2.g(z4) | nv0Var2.f(ns0Var);
                    Object objO = nv0Var2.O();
                    if (zH || objO == zjVar) {
                        objO = new vv(list, z4, ns0Var, 0);
                        nv0Var2.j0(objO);
                    }
                    dn0.a(gm0Var, ie1Var, null, jjVar, (ns0) objO, nv0Var2, 3078, 4);
                } else {
                    nv0Var2.U();
                }
                return dm3Var;
            case 1:
                nm2 nm2Var = (nm2) obj6;
                cs0 cs0Var = (cs0) obj5;
                os1 os1Var = (os1) obj4;
                nv0 nv0Var3 = (nv0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ry) obj).getClass();
                if (!nv0Var3.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    nv0Var3.U();
                    return dm3Var;
                }
                bq1 bq1VarJ = f80.J(yp1Var, 20.0f);
                jj jjVar2 = new jj(8.0f, true, new c(1));
                tm tmVar = f5.s;
                qy qyVarA = oy.a(jjVar2, tmVar, nv0Var3, 6);
                int iHashCode = Long.hashCode(nv0Var3.T);
                n52 n52VarL = nv0Var3.l();
                bq1 bq1VarM = lr.M(nv0Var3, bq1VarJ);
                w10.c.getClass();
                nv0Var3.d0();
                boolean z5 = nv0Var3.S;
                x91 x91Var = tb1.Y;
                if (z5) {
                    nv0Var3.k(x91Var);
                } else {
                    nv0Var3.m0();
                }
                z00 z00Var2 = f5.E;
                y02.F(z00Var2, nv0Var3, qyVarA);
                z00 z00Var3 = f5.D;
                y02.F(z00Var3, nv0Var3, n52VarL);
                Integer numValueOf = Integer.valueOf(iHashCode);
                z00 z00Var4 = f5.F;
                y02.F(z00Var4, nv0Var3, numValueOf);
                y02.C(nv0Var3);
                z00 z00Var5 = f5.C;
                y02.F(z00Var5, nv0Var3, bq1VarM);
                bq1 bq1VarC = j43.c(yp1Var, 1.0f);
                m22 m22Var = n92.f;
                um umVar = f5.q;
                dp2 dp2VarA = cp2.a(m22Var, umVar, nv0Var3, 54);
                int iHashCode2 = Long.hashCode(nv0Var3.T);
                n52 n52VarL2 = nv0Var3.l();
                bq1 bq1VarM2 = lr.M(nv0Var3, bq1VarC);
                nv0Var3.d0();
                if (nv0Var3.S) {
                    nv0Var3.k(x91Var);
                } else {
                    nv0Var3.m0();
                }
                y02.F(z00Var2, nv0Var3, dp2VarA);
                y02.F(z00Var3, nv0Var3, n52VarL2);
                nc2.r(iHashCode2, nv0Var3, z00Var4, nv0Var3);
                y02.F(z00Var5, nv0Var3, bq1VarM2);
                mg3.b(oz2.M(R.string.launcher_resources_check_title, nv0Var3), new jc1(1.0f, true), 0L, 0L, xq0.j, null, 0L, null, 0L, 2, false, 2, 0, gq.H(nv0Var3).h, nv0Var3, 1572864, 24960, 110524);
                boolean z6 = nm2Var instanceof km2;
                if (z6) {
                    nv0Var3.a0(1504013593);
                    z = z6;
                    rn.b(null, gq.B(nv0Var3).w, gq.B(nv0Var3).x, gq.N(-653512616, new ir(5, nm2Var), nv0Var3), nv0Var3, 3072);
                    nv0Var3.p(false);
                } else {
                    z = z6;
                    nv0Var3.a0(1504314386);
                    nv0Var3.p(false);
                }
                gq.m(cs0Var, null, !z4, null, null, null, w7.c, nv0Var3, 805306368, 506);
                nv0Var3.p(true);
                bq1 bq1VarC2 = j43.c(yp1Var, 1.0f);
                dp2 dp2VarA2 = cp2.a(new jj(8.0f, true, new c(1)), umVar, nv0Var3, 54);
                int iHashCode3 = Long.hashCode(nv0Var3.T);
                n52 n52VarL3 = nv0Var3.l();
                bq1 bq1VarM3 = lr.M(nv0Var3, bq1VarC2);
                nv0Var3.d0();
                if (nv0Var3.S) {
                    nv0Var3.k(x91Var);
                } else {
                    nv0Var3.m0();
                }
                y02.F(z00Var2, nv0Var3, dp2VarA2);
                y02.F(z00Var3, nv0Var3, n52VarL3);
                nc2.r(iHashCode3, nv0Var3, z00Var4, nv0Var3);
                y02.F(z00Var5, nv0Var3, bq1VarM3);
                lm2 lm2Var = lm2.a;
                boolean zN = s51.n(nm2Var, lm2Var);
                mm2 mm2Var = mm2.a;
                im2 im2Var = im2.a;
                if (zN) {
                    nv0Var3.a0(-1364351382);
                    z00Var = z00Var5;
                    r32Var = new r32(oz2.M(R.string.launcher_value_pending_check, nv0Var3), new wx(gq.B(nv0Var3).s));
                    nv0Var3.p(false);
                } else {
                    z00Var = z00Var5;
                    if (s51.n(nm2Var, im2Var)) {
                        nv0Var3.a0(-1364346715);
                        r32Var = new r32(oz2.M(R.string.launcher_value_checking, nv0Var3), new wx(gq.B(nv0Var3).s));
                        nv0Var3.p(false);
                    } else if (z) {
                        nv0Var3.a0(-1364342108);
                        r32Var = new r32(oz2.N(R.string.launcher_value_resources_missing, new Object[]{Integer.valueOf(((km2) nm2Var).a.size())}, nv0Var3), new wx(gq.B(nv0Var3).w));
                        nv0Var3.p(false);
                    } else if (s51.n(nm2Var, mm2Var)) {
                        nv0Var3.a0(-1364336743);
                        r32Var = new r32(oz2.M(R.string.launcher_value_ready, nv0Var3), new wx(gq.B(nv0Var3).a));
                        nv0Var3.p(false);
                    } else {
                        if (!(nm2Var instanceof jm2)) {
                            throw by1.d(nv0Var3, -1364352997, false);
                        }
                        nv0Var3.a0(-1364332617);
                        r32Var = new r32(oz2.M(R.string.launcher_value_error, nv0Var3), new wx(gq.B(nv0Var3).w));
                        nv0Var3.p(false);
                    }
                }
                String str2 = (String) r32Var.f;
                long j2 = ((wx) r32Var.g).a;
                if (s51.n(nm2Var, im2Var)) {
                    nv0Var3.a0(655547711);
                    xd2.a(j43.k(yp1Var, 16.0f), j2, 2.0f, 0L, 0, 0.0f, nv0Var3, 390, 56);
                    j = j2;
                    nv0Var3.p(false);
                    str = str2;
                } else {
                    j = j2;
                    if (s51.n(nm2Var, mm2Var)) {
                        nv0Var3.a0(-1364318284);
                        w01 w01VarB = vp.d;
                        if (w01VarB != null) {
                            str = str2;
                        } else {
                            v01 v01Var = new v01("Filled.CheckCircle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i2 = vo3.a;
                            w73 w73Var = new w73(wx.b);
                            tx0 tx0Var = new tx0(1);
                            tx0Var.j(12.0f, 2.0f);
                            tx0Var.d(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                            tx0Var.l(4.48f, 10.0f, 10.0f, 10.0f);
                            str = str2;
                            tx0Var.l(10.0f, -4.48f, 10.0f, -10.0f);
                            tx0Var.k(17.52f, 2.0f, 12.0f, 2.0f);
                            tx0Var.c();
                            tx0Var.j(10.0f, 17.0f);
                            tx0Var.i(-5.0f, -5.0f);
                            tx0Var.i(1.41f, -1.41f);
                            tx0Var.h(10.0f, 14.17f);
                            tx0Var.i(7.59f, -7.59f);
                            tx0Var.h(19.0f, 8.0f);
                            tx0Var.i(-9.0f, 9.0f);
                            tx0Var.c();
                            v01.a(v01Var, tx0Var.a, w73Var);
                            w01VarB = v01Var.b();
                            vp.d = w01VarB;
                        }
                        s01.a(w01VarB, null, j43.k(yp1Var, 18.0f), j, nv0Var3, 432, 0);
                        nv0Var3.p(false);
                    } else {
                        str = str2;
                        if (z || (nm2Var instanceof jm2)) {
                            nv0Var3.a0(-1364307499);
                            w01 w01VarB2 = pq.d;
                            if (w01VarB2 != null) {
                                nv0Var = nv0Var3;
                            } else {
                                v01 v01Var2 = new v01("Filled.ErrorOutline", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                int i3 = vo3.a;
                                w73 w73Var2 = new w73(wx.b);
                                tx0 tx0Var2 = new tx0(1);
                                nv0Var = nv0Var3;
                                tx0Var2.j(11.0f, 15.0f);
                                tx0Var2.g(2.0f);
                                tx0Var2.o(2.0f);
                                tx0Var2.g(-2.0f);
                                tx0Var2.c();
                                tx0Var2.j(11.0f, 7.0f);
                                tx0Var2.g(2.0f);
                                tx0Var2.o(6.0f);
                                tx0Var2.g(-2.0f);
                                tx0Var2.c();
                                tx0Var2.j(11.99f, 2.0f);
                                tx0Var2.d(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                                tx0Var2.l(4.47f, 10.0f, 9.99f, 10.0f);
                                tx0Var2.d(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
                                tx0Var2.k(17.52f, 2.0f, 11.99f, 2.0f);
                                tx0Var2.c();
                                tx0Var2.j(12.0f, 20.0f);
                                tx0Var2.e(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
                                tx0Var2.l(3.58f, -8.0f, 8.0f, -8.0f);
                                tx0Var2.l(8.0f, 3.58f, 8.0f, 8.0f);
                                tx0Var2.l(-3.58f, 8.0f, -8.0f, 8.0f);
                                tx0Var2.c();
                                v01.a(v01Var2, tx0Var2.a, w73Var2);
                                w01VarB2 = v01Var2.b();
                                pq.d = w01VarB2;
                            }
                            j = j;
                            nv0 nv0Var4 = nv0Var;
                            s01.a(w01VarB2, null, j43.k(yp1Var, 18.0f), j, nv0Var4, 432, 0);
                            nv0Var3 = nv0Var4;
                            nv0Var3.p(false);
                        } else {
                            if (!s51.n(nm2Var, lm2Var)) {
                                throw by1.d(nv0Var3, -1364327840, false);
                            }
                            nv0Var3.a0(-1364297261);
                            eo.a(gv3.v(j43.k(yp1Var, 10.0f), j, uo2.a), nv0Var3, 0);
                            nv0Var3.p(false);
                            j = j;
                        }
                    }
                }
                mg3.b(str, null, j, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, gq.H(nv0Var3).k, nv0Var3, 0, 0, 131066);
                nv0Var3.p(true);
                if (z) {
                    nv0Var3.a0(448790599);
                    Object objO2 = nv0Var3.O();
                    if (objO2 == zjVar) {
                        objO2 = new yb(os1Var, 8);
                        nv0Var3.j0(objO2);
                    }
                    gq.m((cs0) objO2, j43.c(yp1Var, 1.0f), false, null, null, null, gq.N(-2106524924, new w91(4, nm2Var, os1Var), nv0Var3), nv0Var3, 805306422, 508);
                    if (gv3.l(os1Var)) {
                        nv0Var3.a0(449245679);
                        bq1 bq1VarJ2 = f80.J(gv3.v(j43.c(yp1Var, 1.0f), wx.b(0.5f, gq.B(nv0Var3).p), uo2.a(8.0f)), 12.0f);
                        qy qyVarA2 = oy.a(new jj(2.0f, true, new c(1)), tmVar, nv0Var3, 6);
                        int iHashCode4 = Long.hashCode(nv0Var3.T);
                        n52 n52VarL4 = nv0Var3.l();
                        bq1 bq1VarM4 = lr.M(nv0Var3, bq1VarJ2);
                        nv0Var3.d0();
                        if (nv0Var3.S) {
                            nv0Var3.k(x91Var);
                        } else {
                            nv0Var3.m0();
                        }
                        y02.F(z00Var2, nv0Var3, qyVarA2);
                        y02.F(z00Var3, nv0Var3, n52VarL4);
                        nc2.r(iHashCode4, nv0Var3, z00Var4, nv0Var3);
                        y02.F(z00Var, nv0Var3, bq1VarM4);
                        nv0Var3.a0(-1421903576);
                        ArrayList arrayList = ((km2) nm2Var).a;
                        int size = arrayList.size();
                        int i4 = 0;
                        while (i4 < size) {
                            Object obj7 = arrayList.get(i4);
                            i4++;
                            mg3.b((String) obj7, null, ((fy) nv0Var3.j(hy.a)).w, 0L, null, zb3.c, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var3.j(ql3.a)).l, nv0Var3, 0, 0, 130938);
                        }
                        z3 = false;
                        nv0Var3.p(false);
                        nv0Var3.p(true);
                        nv0Var3.p(false);
                    } else {
                        z3 = false;
                        nv0Var3.a0(450144214);
                        nv0Var3.p(false);
                    }
                    nv0Var3.p(z3);
                } else {
                    nv0Var3.a0(450158102);
                    nv0Var3.p(false);
                }
                if (nm2Var instanceof jm2) {
                    nv0Var3.a0(450235881);
                    Object objO3 = nv0Var3.O();
                    if (objO3 == zjVar) {
                        objO3 = new yb(os1Var, 9);
                        nv0Var3.j0(objO3);
                    }
                    gq.m((cs0) objO3, j43.c(yp1Var, 1.0f), false, null, null, null, gq.N(471231739, new y71(os1Var, 0), nv0Var3), nv0Var3, 805306422, 508);
                    if (gv3.l(os1Var)) {
                        nv0Var3.a0(450687520);
                        mg3.b(((jm2) nm2Var).a, null, ((fy) nv0Var3.j(hy.a)).w, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var3.j(ql3.a)).l, nv0Var3, 0, 0, 131066);
                        z2 = false;
                        nv0Var3.p(false);
                    } else {
                        z2 = false;
                        nv0Var3.a0(450911030);
                        nv0Var3.p(false);
                    }
                    nv0Var3.p(z2);
                } else {
                    nv0Var3.a0(450924918);
                    nv0Var3.p(false);
                }
                nv0Var3.p(true);
                return dm3Var;
            default:
                final os1 os1Var2 = (os1) obj6;
                final cs0 cs0Var2 = (cs0) obj5;
                final os1 os1Var3 = (os1) obj4;
                y33 y33Var = (y33) obj;
                nv0 nv0Var5 = (nv0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                y33Var.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= nv0Var5.f(y33Var) ? 4 : 2;
                }
                if (nv0Var5.R(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    boolean z7 = !((Boolean) os1Var2.getValue()).booleanValue();
                    boolean zF = nv0Var5.f(os1Var2) | nv0Var5.g(z4) | nv0Var5.f(cs0Var2);
                    Object objO4 = nv0Var5.O();
                    if (zF || objO4 == zjVar) {
                        objO4 = new cs0() { // from class: fn2
                            @Override // defpackage.cs0
                            public final Object a() {
                                Boolean bool = Boolean.FALSE;
                                os1Var2.setValue(bool);
                                os1Var3.setValue(bool);
                                if (!z4) {
                                    cs0Var2.a();
                                }
                                return dm3.a;
                            }
                        };
                        nv0Var5.j0(objO4);
                    }
                    qt2 qt2Var = qt2.a;
                    int i5 = iIntValue3 & 14;
                    jo3.c(y33Var, z7, (cs0) objO4, qt2.c(0, nv0Var5), y33Var.a(yp1Var), false, null, null, null, null, w7.h, nv0Var5, i5);
                    boolean zBooleanValue = ((Boolean) os1Var2.getValue()).booleanValue();
                    boolean zF2 = nv0Var5.f(os1Var2);
                    Object objO5 = nv0Var5.O();
                    if (zF2 || objO5 == zjVar) {
                        objO5 = new mh2(os1Var2, 17);
                        nv0Var5.j0(objO5);
                    }
                    jo3.c(y33Var, zBooleanValue, (cs0) objO5, qt2.c(1, nv0Var5), y33Var.a(yp1Var), false, null, null, null, null, w7.i, nv0Var5, i5);
                } else {
                    nv0Var5.U();
                }
                return dm3Var;
        }
    }

    public /* synthetic */ ov(Object obj, Object obj2, boolean z, Object obj3, int i) {
        this.f = i;
        this.h = obj;
        this.i = obj2;
        this.g = z;
        this.j = obj3;
    }
}
