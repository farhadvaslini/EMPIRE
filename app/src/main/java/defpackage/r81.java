package defpackage;

import android.content.ClipboardManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r81 implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ r81(bq1 bq1Var, os1 os1Var, d00 d00Var, tl tlVar, cs0 cs0Var) {
        this.f = 4;
        this.h = bq1Var;
        this.g = os1Var;
        this.i = d00Var;
        this.j = tlVar;
        this.k = cs0Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        final hb0 hb0Var;
        int i = this.f;
        int i2 = 5;
        yp1 yp1Var = yp1.a;
        x91 x91Var = tb1.Y;
        zj zjVar = c20.a;
        int i3 = 2;
        dm3 dm3Var = dm3.a;
        Object obj3 = this.g;
        Object obj4 = this.k;
        Object obj5 = this.j;
        Object obj6 = this.i;
        Object obj7 = this.h;
        switch (i) {
            case 0:
                os1 os1Var = (os1) obj3;
                os1 os1Var2 = (os1) obj7;
                os1 os1Var3 = (os1) obj6;
                os1 os1Var4 = (os1) obj5;
                os1 os1Var5 = (os1) obj4;
                nv0 nv0Var = (nv0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    qy qyVarA = oy.a(new jj(8.0f, true, new c(1)), f5.s, nv0Var, 6);
                    int iHashCode = Long.hashCode(nv0Var.T);
                    n52 n52VarL = nv0Var.l();
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
                    String str = (String) os1Var.getValue();
                    bq1 bq1VarC = j43.c(yp1Var, 1.0f);
                    Object objO = nv0Var.O();
                    if (objO == zjVar) {
                        objO = new zb(os1Var, 7);
                        nv0Var.j0(objO);
                    }
                    g12.m(str, (ns0) objO, bq1VarC, false, false, null, rn.n, null, null, null, null, false, null, null, null, true, 0, 0, null, null, nv0Var, 1573296, 12582912, 8257464);
                    mg3.b(oz2.M(R.string.launcher_label_server_encoding, nv0Var), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var.j(ql3.a)).m, nv0Var, 0, 0, 131070);
                    gq.f(null, new jj(8.0f, true, new c(1)), new jj(8.0f, true, new c(1)), null, 0, 0, gq.N(1363574934, new y71(os1Var2, 2), nv0Var), nv0Var, 1573296, 57);
                    String str2 = (String) os1Var3.getValue();
                    bq1 bq1VarC2 = j43.c(yp1Var, 1.0f);
                    Object objO2 = nv0Var.O();
                    if (objO2 == zjVar) {
                        objO2 = new zb(os1Var3, 8);
                        nv0Var.j0(objO2);
                    }
                    g12.m(str2, (ns0) objO2, bq1VarC2, false, false, null, rn.o, null, null, null, null, false, null, null, null, true, 0, 0, null, null, nv0Var, 1573296, 12582912, 8257464);
                    String str3 = (String) os1Var4.getValue();
                    bq1 bq1VarC3 = j43.c(yp1Var, 1.0f);
                    Object objO3 = nv0Var.O();
                    if (objO3 == zjVar) {
                        objO3 = new zb(os1Var4, 9);
                        nv0Var.j0(objO3);
                    }
                    g12.m(str3, (ns0) objO3, bq1VarC3, false, false, null, rn.p, null, null, null, null, false, null, null, null, true, 0, 0, null, null, nv0Var, 1573296, 12582912, 8257464);
                    String str4 = (String) os1Var5.getValue();
                    bq1 bq1VarC4 = j43.c(yp1Var, 1.0f);
                    Object objO4 = nv0Var.O();
                    if (objO4 == zjVar) {
                        objO4 = new zb(os1Var5, 10);
                        nv0Var.j0(objO4);
                    }
                    g12.m(str4, (ns0) objO4, bq1VarC4, false, false, null, rn.q, null, null, null, null, false, null, null, null, true, 0, 0, null, null, nv0Var, 1573296, 12582912, 8257464);
                    nv0Var.p(true);
                } else {
                    nv0Var.U();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                da1.b((q92) obj3, (cs0) obj7, (cs0) obj6, (cs0) obj5, (cs0) obj4, (nv0) obj, jo3.y(1));
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ((Integer) obj2).getClass();
                vp.h((rs0) obj3, (rs0) obj7, (d00) obj6, (rs0) obj5, (rs0) obj4, (nv0) obj, jo3.y(385));
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                String str5 = (String) obj7;
                cs0 cs0Var = (cs0) obj6;
                ClipboardManager clipboardManager = (ClipboardManager) obj5;
                os1 os1Var6 = (os1) obj3;
                Context context = (Context) obj4;
                nv0 nv0Var2 = (nv0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    br.k(gq.N(889992467, new z71(str5, i2, false ? (byte) 1 : (byte) 0), nv0Var2), null, gq.N(-834849771, new k91(cs0Var, i3), nv0Var2), gq.N(7084862, new my0(clipboardManager, os1Var6, context), nv0Var2), nv0Var2, 3462, 2);
                } else {
                    nv0Var2.U();
                }
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                bq1 bq1Var = (bq1) obj7;
                os1 os1Var7 = (os1) obj3;
                d00 d00Var = (d00) obj6;
                tl tlVar = (tl) obj5;
                cs0 cs0Var2 = (cs0) obj4;
                nv0 nv0Var3 = (nv0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (nv0Var3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    Object objO5 = nv0Var3.O();
                    if (objO5 == zjVar) {
                        objO5 = new zb(os1Var7, 13);
                        nv0Var3.j0(objO5);
                    }
                    bq1 bq1VarU = n92.u(bq1Var, (ns0) objO5);
                    cn1 cn1VarD = eo.d(f5.g, true);
                    int iHashCode2 = Long.hashCode(nv0Var3.T);
                    n52 n52VarL2 = nv0Var3.l();
                    bq1 bq1VarM2 = lr.M(nv0Var3, bq1VarU);
                    w10.c.getClass();
                    nv0Var3.d0();
                    if (nv0Var3.S) {
                        nv0Var3.k(x91Var);
                    } else {
                        nv0Var3.m0();
                    }
                    y02.F(f5.E, nv0Var3, cn1VarD);
                    y02.F(f5.D, nv0Var3, n52VarL2);
                    y02.F(f5.F, nv0Var3, Integer.valueOf(iHashCode2));
                    y02.C(nv0Var3);
                    y02.F(f5.C, nv0Var3, bq1VarM2);
                    d00Var.f(nv0Var3, 0);
                    tlVar.b(cs0Var2, nv0Var3, 6);
                    nv0Var3.p(true);
                } else {
                    nv0Var3.U();
                }
                break;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                final ts0 ts0Var = (ts0) obj3;
                hb0 hb0Var2 = (hb0) obj7;
                final e93 e93Var = (e93) obj6;
                final e93 e93Var2 = (e93) obj5;
                a42 a42Var = (a42) obj4;
                nv0 nv0Var4 = (nv0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (nv0Var4.R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    boolean zF = nv0Var4.f(ts0Var) | nv0Var4.h(hb0Var2) | nv0Var4.f(e93Var) | nv0Var4.f(e93Var2);
                    Object objO6 = nv0Var4.O();
                    if (zF || objO6 == zjVar) {
                        final int i4 = 1;
                        hb0Var = hb0Var2;
                        cs0 cs0Var3 = new cs0() { // from class: pg2
                            @Override // defpackage.cs0
                            public final Object a() {
                                int i5 = i4;
                                dm3 dm3Var2 = dm3.a;
                                e93 e93Var3 = e93Var2;
                                e93 e93Var4 = e93Var;
                                hb0 hb0Var3 = hb0Var;
                                ts0 ts0Var2 = ts0Var;
                                switch (i5) {
                                    case 0:
                                        ts0Var2.l(Integer.valueOf(hb0Var3.a), 0, Integer.valueOf(((Number) e93Var4.getValue()).intValue()), (String) e93Var3.getValue());
                                        break;
                                    default:
                                        ts0Var2.l(Integer.valueOf(hb0Var3.a), 1, Integer.valueOf(((Number) e93Var4.getValue()).intValue()), (String) e93Var3.getValue());
                                        break;
                                }
                                return dm3Var2;
                            }
                        };
                        nv0Var4.j0(cs0Var3);
                        objO6 = cs0Var3;
                    } else {
                        hb0Var = hb0Var2;
                    }
                    final int i5 = 1;
                    gq.m((cs0) objO6, null, !hb0Var.a() || (a42Var.g() >= 0 && !(hb0Var.b == 5 && a42Var.g() == 0)), null, null, null, gq.N(1644493965, new ss0() { // from class: qg2
                        @Override // defpackage.ss0
                        public final Object e(Object obj8, Object obj9, Object obj10) {
                            int i6 = i5;
                            dm3 dm3Var2 = dm3.a;
                            hb0 hb0Var3 = hb0Var;
                            switch (i6) {
                                case 0:
                                    nv0 nv0Var5 = (nv0) obj9;
                                    int iIntValue5 = ((Integer) obj10).intValue();
                                    ((ep2) obj8).getClass();
                                    if (!nv0Var5.R(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                        nv0Var5.U();
                                    } else {
                                        mg3.b(hb0Var3.f, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var5, 0, 0, 262142);
                                    }
                                    break;
                                default:
                                    nv0 nv0Var6 = (nv0) obj9;
                                    int iIntValue6 = ((Integer) obj10).intValue();
                                    ((ep2) obj8).getClass();
                                    if (!nv0Var6.R(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                        nv0Var6.U();
                                    } else {
                                        nv0Var6.a0(-189263288);
                                        String strM = hb0Var3.e;
                                        if (strM.length() == 0) {
                                            strM = oz2.M(R.string.raksamp_action_respond, nv0Var6);
                                        }
                                        nv0Var6.p(false);
                                        mg3.b(strM, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var6, 0, 0, 262142);
                                    }
                                    break;
                            }
                            return dm3Var2;
                        }
                    }, nv0Var4), nv0Var4, 805306368, 506);
                } else {
                    nv0Var4.U();
                }
                break;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                cs0 cs0Var4 = (cs0) obj3;
                final hb0 hb0Var3 = (hb0) obj7;
                final ts0 ts0Var2 = (ts0) obj6;
                final e93 e93Var3 = (e93) obj5;
                final e93 e93Var4 = (e93) obj4;
                nv0 nv0Var5 = (nv0) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (nv0Var5.R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    dp2 dp2VarA = cp2.a(n92.b, f5.p, nv0Var5, 0);
                    int iHashCode3 = Long.hashCode(nv0Var5.T);
                    n52 n52VarL3 = nv0Var5.l();
                    bq1 bq1VarM3 = lr.M(nv0Var5, yp1Var);
                    w10.c.getClass();
                    nv0Var5.d0();
                    if (nv0Var5.S) {
                        nv0Var5.k(x91Var);
                    } else {
                        nv0Var5.m0();
                    }
                    y02.F(f5.E, nv0Var5, dp2VarA);
                    y02.F(f5.D, nv0Var5, n52VarL3);
                    y02.F(f5.F, nv0Var5, Integer.valueOf(iHashCode3));
                    y02.C(nv0Var5);
                    y02.F(f5.C, nv0Var5, bq1VarM3);
                    b22 b22Var = xp.a;
                    gq.m(cs0Var4, null, false, null, xp.e(0L, ((fy) nv0Var5.j(hy.a)).s, nv0Var5, 13), null, r51.f, nv0Var5, 805306368, 494);
                    if (hb0Var3.f.length() > 0) {
                        nv0Var5.a0(381958771);
                        oz2.g(nv0Var5, j43.o(yp1Var, 4.0f));
                        boolean zF2 = nv0Var5.f(ts0Var2) | nv0Var5.h(hb0Var3) | nv0Var5.f(e93Var3) | nv0Var5.f(e93Var4);
                        Object objO7 = nv0Var5.O();
                        if (zF2 || objO7 == zjVar) {
                            final int i6 = 0;
                            objO7 = new cs0() { // from class: pg2
                                @Override // defpackage.cs0
                                public final Object a() {
                                    int i52 = i6;
                                    dm3 dm3Var2 = dm3.a;
                                    e93 e93Var32 = e93Var4;
                                    e93 e93Var42 = e93Var3;
                                    hb0 hb0Var32 = hb0Var3;
                                    ts0 ts0Var22 = ts0Var2;
                                    switch (i52) {
                                        case 0:
                                            ts0Var22.l(Integer.valueOf(hb0Var32.a), 0, Integer.valueOf(((Number) e93Var42.getValue()).intValue()), (String) e93Var32.getValue());
                                            break;
                                        default:
                                            ts0Var22.l(Integer.valueOf(hb0Var32.a), 1, Integer.valueOf(((Number) e93Var42.getValue()).intValue()), (String) e93Var32.getValue());
                                            break;
                                    }
                                    return dm3Var2;
                                }
                            };
                            nv0Var5.j0(objO7);
                        }
                        final int i7 = false ? 1 : 0;
                        gq.m((cs0) objO7, null, false, null, null, null, gq.N(517650284, new ss0() { // from class: qg2
                            @Override // defpackage.ss0
                            public final Object e(Object obj8, Object obj9, Object obj10) {
                                int i62 = i7;
                                dm3 dm3Var2 = dm3.a;
                                hb0 hb0Var32 = hb0Var3;
                                switch (i62) {
                                    case 0:
                                        nv0 nv0Var52 = (nv0) obj9;
                                        int iIntValue52 = ((Integer) obj10).intValue();
                                        ((ep2) obj8).getClass();
                                        if (!nv0Var52.R(iIntValue52 & 1, (iIntValue52 & 17) != 16)) {
                                            nv0Var52.U();
                                        } else {
                                            mg3.b(hb0Var32.f, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var52, 0, 0, 262142);
                                        }
                                        break;
                                    default:
                                        nv0 nv0Var6 = (nv0) obj9;
                                        int iIntValue6 = ((Integer) obj10).intValue();
                                        ((ep2) obj8).getClass();
                                        if (!nv0Var6.R(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                            nv0Var6.U();
                                        } else {
                                            nv0Var6.a0(-189263288);
                                            String strM = hb0Var32.e;
                                            if (strM.length() == 0) {
                                                strM = oz2.M(R.string.raksamp_action_respond, nv0Var6);
                                            }
                                            nv0Var6.p(false);
                                            mg3.b(strM, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var6, 0, 0, 262142);
                                        }
                                        break;
                                }
                                return dm3Var2;
                            }
                        }, nv0Var5), nv0Var5, 805306368, 510);
                        nv0Var5.p(false);
                    } else {
                        nv0Var5.a0(382246110);
                        nv0Var5.p(false);
                    }
                    nv0Var5.p(true);
                } else {
                    nv0Var5.U();
                }
                break;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                List list = (List) obj3;
                lf2 lf2Var = (lf2) obj7;
                String str6 = (String) obj6;
                ns0 ns0Var = (ns0) obj5;
                cs0 cs0Var5 = (cs0) obj4;
                nv0 nv0Var6 = (nv0) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (nv0Var6.R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    rn.s(list, lf2Var, str6, ns0Var, cs0Var5, null, nv0Var6, 0);
                } else {
                    nv0Var6.U();
                }
                break;
            case 8:
                ((Integer) obj2).getClass();
                f80.a((g4) obj3, (cs0) obj7, (ns0) obj6, (ns0) obj5, (cs0) obj4, (nv0) obj, jo3.y(1));
                break;
            case vr.g /* 9 */:
                l22 l22Var = (l22) obj3;
                List list2 = (List) obj7;
                ot0 ot0Var = (ot0) obj6;
                ns0 ns0Var2 = (ns0) obj5;
                cs0 cs0Var6 = (cs0) obj4;
                nv0 nv0Var7 = (nv0) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (nv0Var7.R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    h22 h22Var = (h22) l22Var;
                    String str7 = h22Var.a;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj8 : list2) {
                        if (((e92) obj8).a.equals(h22Var.a)) {
                            arrayList.add(obj8);
                        }
                    }
                    boolean zF3 = nv0Var7.f(ns0Var2);
                    Object objO8 = nv0Var7.O();
                    if (zF3 || objO8 == zjVar) {
                        objO8 = new mk0(ns0Var2, 11);
                        nv0Var7.j0(objO8);
                    }
                    p03.k(str7, arrayList, ot0Var, (cs0) objO8, cs0Var6, nv0Var7, 0);
                } else {
                    nv0Var7.U();
                }
                break;
            case vr.h /* 10 */:
                ((Integer) obj2).getClass();
                p03.r((String) obj3, (cs0) obj7, (cs0) obj6, (lf2) obj5, (ot0) obj4, (nv0) obj, jo3.y(1));
                break;
            case 11:
                x50 x50Var = (x50) obj7;
                lf2 lf2Var2 = (lf2) obj6;
                String str8 = (String) obj5;
                cf2 cf2Var = (cf2) obj4;
                os1 os1Var8 = (os1) obj3;
                nv0 nv0Var8 = (nv0) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (nv0Var8.R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    boolean zH = nv0Var8.h(x50Var) | nv0Var8.h(lf2Var2) | nv0Var8.f(str8) | nv0Var8.h(cf2Var);
                    Object objO9 = nv0Var8.O();
                    if (zH || objO9 == zjVar) {
                        qa qaVar = new qa(x50Var, lf2Var2, str8, cf2Var, os1Var8);
                        nv0Var8.j0(qaVar);
                        objO9 = qaVar;
                    }
                    gq.m((cs0) objO9, null, false, null, null, null, f80.Q, nv0Var8, 805306368, 510);
                } else {
                    nv0Var8.U();
                }
                break;
            case vr.i /* 12 */:
                ((Integer) obj2).getClass();
                p03.a((List) obj3, (ot0) obj7, (pt0) obj6, (cs0) obj5, (cs0) obj4, (nv0) obj, jo3.y(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                p03.k((String) obj3, (ArrayList) obj7, (ot0) obj6, (cs0) obj5, (cs0) obj4, (nv0) obj, jo3.y(1));
                break;
            default:
                ot0 ot0Var2 = (ot0) obj7;
                String str9 = (String) obj6;
                e92 e92Var = (e92) obj5;
                d92 d92Var = (d92) obj4;
                os1 os1Var9 = (os1) obj3;
                nv0 nv0Var9 = (nv0) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (nv0Var9.R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    boolean zF4 = nv0Var9.f(ot0Var2) | nv0Var9.f(str9) | nv0Var9.h(e92Var) | nv0Var9.h(d92Var);
                    Object objO10 = nv0Var9.O();
                    if (zF4 || objO10 == zjVar) {
                        zz2 zz2Var = new zz2(ot0Var2, str9, e92Var, d92Var, os1Var9, 0);
                        nv0Var9.j0(zz2Var);
                        objO10 = zz2Var;
                    }
                    gq.m((cs0) objO10, null, false, null, null, null, f80.O, nv0Var9, 805306368, 510);
                } else {
                    nv0Var9.U();
                }
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ r81(Object obj, Object obj2, zs0 zs0Var, Object obj3, zs0 zs0Var2, int i, int i2) {
        this.f = i2;
        this.g = obj;
        this.h = obj2;
        this.i = zs0Var;
        this.j = obj3;
        this.k = zs0Var2;
    }

    public /* synthetic */ r81(Object obj, Object obj2, Object obj3, Object obj4, os1 os1Var, int i) {
        this.f = i;
        this.h = obj;
        this.i = obj2;
        this.j = obj3;
        this.k = obj4;
        this.g = os1Var;
    }

    public /* synthetic */ r81(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
        this.j = obj4;
        this.k = obj5;
    }

    public /* synthetic */ r81(String str, cs0 cs0Var, ClipboardManager clipboardManager, os1 os1Var, Context context) {
        this.f = 3;
        this.h = str;
        this.i = cs0Var;
        this.j = clipboardManager;
        this.g = os1Var;
        this.k = context;
    }
}
