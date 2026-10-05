package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nh2 implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ nh2(int i, int i2, Object obj, Object obj2) {
        this.f = i2;
        this.g = obj;
        this.h = obj2;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        String strM;
        String str;
        boolean z;
        int i;
        int i2;
        yg3 yg3Var;
        int i3 = this.f;
        float f = 1.0f;
        ud3 ud3Var = null;
        zj zjVar = c20.a;
        x91 x91Var = tb1.Y;
        yp1 yp1Var = yp1.a;
        int i4 = 2;
        int i5 = 0;
        dm3 dm3Var = dm3.a;
        Object obj3 = this.h;
        Object obj4 = this.g;
        switch (i3) {
            case 0:
                ((Integer) obj2).getClass();
                r51.c((zx1) obj4, (ss0) obj3, (nv0) obj, jo3.y(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                n92.d((re3) obj4, (cs0) obj3, (nv0) obj, jo3.y(1));
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ((Integer) obj2).getClass();
                f80.h((o72) obj4, (cs0) obj3, (nv0) obj, jo3.y(9));
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                ((Integer) obj2).getClass();
                f80.m((hp2) obj4, (cs0) obj3, (nv0) obj, jo3.y(9));
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                w01 w01Var = (w01) obj4;
                String str2 = (String) obj3;
                nv0 nv0Var = (nv0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    bq1 bq1VarK = f80.K(yp1Var, 12.0f, 6.0f);
                    dp2 dp2VarA = cp2.a(new jj(6.0f, true, new c(1)), f5.q, nv0Var, 54);
                    int iHashCode = Long.hashCode(nv0Var.T);
                    n52 n52VarL = nv0Var.l();
                    bq1 bq1VarM = lr.M(nv0Var, bq1VarK);
                    w10.c.getClass();
                    nv0Var.d0();
                    if (nv0Var.S) {
                        nv0Var.k(x91Var);
                    } else {
                        nv0Var.m0();
                    }
                    y02.F(f5.E, nv0Var, dp2VarA);
                    y02.F(f5.D, nv0Var, n52VarL);
                    y02.F(f5.F, nv0Var, Integer.valueOf(iHashCode));
                    y02.C(nv0Var);
                    y02.F(f5.C, nv0Var, bq1VarM);
                    if (w01Var == null) {
                        nv0Var.a0(-1518063964);
                        nv0Var.p(false);
                    } else {
                        nv0Var.a0(-1518063963);
                        s01.a(w01Var, null, j43.k(yp1Var, 16.0f), 0L, nv0Var, 432, 8);
                        nv0Var.p(false);
                    }
                    mg3.b(str2, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, ((ol3) nv0Var.j(ql3.a)).n, nv0Var, 0, 24576, 114686);
                    nv0Var.p(true);
                } else {
                    nv0Var.U();
                }
                break;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                z00 z00Var = f5.C;
                z00 z00Var2 = f5.F;
                z00 z00Var3 = f5.D;
                z00 z00Var4 = f5.E;
                y31 y31Var = (y31) obj4;
                y92 y92Var = (y92) obj3;
                nv0 nv0Var2 = (nv0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tm tmVar = f5.s;
                if (nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    bq1 bq1VarC = n92.C(j43.g(yp1Var, 0.0f, 360.0f, 1), n92.A(nv0Var2), true);
                    qy qyVarA = oy.a(new jj(8.0f, true, new c(1)), tmVar, nv0Var2, 6);
                    int iHashCode2 = Long.hashCode(nv0Var2.T);
                    n52 n52VarL2 = nv0Var2.l();
                    bq1 bq1VarM2 = lr.M(nv0Var2, bq1VarC);
                    w10.c.getClass();
                    nv0Var2.d0();
                    if (nv0Var2.S) {
                        nv0Var2.k(x91Var);
                    } else {
                        nv0Var2.m0();
                    }
                    y02.F(z00Var4, nv0Var2, qyVarA);
                    y02.F(z00Var3, nv0Var2, n52VarL2);
                    y02.F(z00Var2, nv0Var2, Integer.valueOf(iHashCode2));
                    y02.C(nv0Var2);
                    y02.F(z00Var, nv0Var2, bq1VarM2);
                    k82 k82Var = y31Var.a;
                    mg3.b(oz2.N(R.string.game_plugins_permission_message, new Object[]{k82Var.c}, nv0Var2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var2, 0, 0, 262142);
                    nv0Var2.a0(-579825381);
                    List list = k82Var.i;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj5 : list) {
                        String str3 = (String) obj5;
                        m92 m92VarH = y92Var.h(k82Var.b);
                        Set set = m92VarH != null ? m92VarH.c : null;
                        if (set == null) {
                            set = si0.f;
                        }
                        if (set.contains(str3)) {
                            arrayList.add(obj5);
                        }
                    }
                    int size = arrayList.size();
                    int i6 = 0;
                    while (i6 < size) {
                        Object obj6 = arrayList.get(i6);
                        int i7 = i6 + 1;
                        String str4 = (String) obj6;
                        Integer numX = n92.x(str4);
                        qy qyVarA2 = oy.a(n92.d, tmVar, nv0Var2, 0);
                        int iHashCode3 = Long.hashCode(nv0Var2.T);
                        n52 n52VarL3 = nv0Var2.l();
                        int i8 = size;
                        bq1 bq1VarM3 = lr.M(nv0Var2, yp1Var);
                        w10.c.getClass();
                        nv0Var2.d0();
                        if (nv0Var2.S) {
                            nv0Var2.k(x91Var);
                        } else {
                            nv0Var2.m0();
                        }
                        y02.F(z00Var4, nv0Var2, qyVarA2);
                        y02.F(z00Var3, nv0Var2, n52VarL3);
                        y02.F(z00Var2, nv0Var2, Integer.valueOf(iHashCode3));
                        y02.C(nv0Var2);
                        y02.F(z00Var, nv0Var2, bq1VarM3);
                        if (numX == null) {
                            nv0Var2.a0(554779393);
                            nv0Var2.p(false);
                            strM = null;
                        } else {
                            nv0Var2.a0(554779394);
                            strM = oz2.M(numX.intValue(), nv0Var2);
                            nv0Var2.p(false);
                        }
                        mg3.b(strM == null ? str4 : strM, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var2, 0, 0, 262142);
                        if (numX != null) {
                            nv0Var2.a0(554885569);
                            str = str4;
                            mg3.b(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var2.j(ql3.a)).l, nv0Var2, 0, 0, 131070);
                            z = false;
                            nv0Var2.p(false);
                        } else {
                            str = str4;
                            z = false;
                            nv0Var2.a0(555219036);
                            nv0Var2.p(false);
                        }
                        p92 p92VarY = n92.y(str);
                        if (p92VarY == null) {
                            nv0Var2.a0(555307850);
                            nv0Var2.p(z);
                        } else {
                            nv0Var2.a0(555307851);
                            int iOrdinal = p92VarY.ordinal();
                            if (iOrdinal == 0) {
                                i = R.string.game_plugins_permission_risk_low;
                            } else if (iOrdinal == 1) {
                                i = R.string.game_plugins_permission_risk_medium;
                            } else if (iOrdinal != 2) {
                                c.k();
                            } else {
                                i = R.string.game_plugins_permission_risk_high;
                            }
                            mg3.b(oz2.M(i, nv0Var2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var2.j(ql3.a)).o, nv0Var2, 0, 0, 131070);
                            nv0Var2.p(false);
                        }
                        nv0Var2.p(true);
                        size = i8;
                        i6 = i7;
                        break;
                    }
                    nv0Var2.p(false);
                    nv0Var2.p(true);
                } else {
                    nv0Var2.U();
                }
                break;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                ns0 ns0Var = (ns0) obj4;
                z32 z32Var = (z32) obj3;
                nv0 nv0Var3 = (nv0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (nv0Var3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    boolean zF = nv0Var3.f(ns0Var) | nv0Var3.f(z32Var);
                    Object objO = nv0Var3.O();
                    if (zF || objO == zjVar) {
                        objO = new me1(21, ns0Var, z32Var);
                        nv0Var3.j0(objO);
                    }
                    gq.m((cs0) objO, null, false, null, null, null, r51.m0, nv0Var3, 805306368, 510);
                } else {
                    nv0Var3.U();
                }
                break;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                z00 z00Var5 = f5.C;
                z00 z00Var6 = f5.F;
                z00 z00Var7 = f5.D;
                z00 z00Var8 = f5.E;
                ns0 ns0Var2 = (ns0) obj4;
                oh3 oh3Var = (oh3) obj3;
                nv0 nv0Var4 = (nv0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (nv0Var4.R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    qy qyVarA3 = oy.a(n92.d, f5.s, nv0Var4, 0);
                    int iHashCode4 = Long.hashCode(nv0Var4.T);
                    n52 n52VarL4 = nv0Var4.l();
                    bq1 bq1VarM4 = lr.M(nv0Var4, yp1Var);
                    w10.c.getClass();
                    nv0Var4.d0();
                    if (nv0Var4.S) {
                        nv0Var4.k(x91Var);
                    } else {
                        nv0Var4.m0();
                    }
                    y02.F(z00Var8, nv0Var4, qyVarA3);
                    y02.F(z00Var7, nv0Var4, n52VarL4);
                    y02.F(z00Var6, nv0Var4, Integer.valueOf(iHashCode4));
                    y02.C(nv0Var4);
                    y02.F(z00Var5, nv0Var4, bq1VarM4);
                    nv0Var4.a0(1186711541);
                    for (oh3 oh3Var2 : oh3.l) {
                        bq1 bq1VarC2 = j43.c(yp1Var, 1.0f);
                        boolean zF2 = nv0Var4.f(ns0Var2) | nv0Var4.d(oh3Var2.ordinal());
                        Object objO2 = nv0Var4.O();
                        if (zF2 || objO2 == zjVar) {
                            objO2 = new me1(23, ns0Var2, oh3Var2);
                            nv0Var4.j0(objO2);
                        }
                        bq1 bq1VarK2 = f80.K(gv3.x(3, (cs0) objO2, bq1VarC2, false), 4.0f, 12.0f);
                        dp2 dp2VarA2 = cp2.a(n92.b, f5.q, nv0Var4, 48);
                        int iHashCode5 = Long.hashCode(nv0Var4.T);
                        n52 n52VarL5 = nv0Var4.l();
                        bq1 bq1VarM5 = lr.M(nv0Var4, bq1VarK2);
                        w10.c.getClass();
                        nv0Var4.d0();
                        ns0 ns0Var3 = ns0Var2;
                        if (nv0Var4.S) {
                            nv0Var4.k(x91Var);
                        } else {
                            nv0Var4.m0();
                        }
                        y02.F(z00Var8, nv0Var4, dp2VarA2);
                        y02.F(z00Var7, nv0Var4, n52VarL5);
                        y02.F(z00Var6, nv0Var4, Integer.valueOf(iHashCode5));
                        y02.C(nv0Var4);
                        y02.F(z00Var5, nv0Var4, bq1VarM5);
                        nv0 nv0Var5 = nv0Var4;
                        w22.a(oh3Var2 == oh3Var, null, false, null, nv0Var5, 48);
                        oz2.g(nv0Var5, j43.o(yp1Var, 16.0f));
                        mg3.b(g12.f0(oh3Var2, nv0Var5), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var5.j(ql3.a)).j, nv0Var5, 0, 0, 131070);
                        nv0Var5.p(true);
                        nv0Var4 = nv0Var5;
                        ns0Var2 = ns0Var3;
                    }
                    nv0 nv0Var6 = nv0Var4;
                    nv0Var6.p(false);
                    nv0Var6.p(true);
                } else {
                    nv0Var4.U();
                }
                break;
            case 8:
                z00 z00Var9 = f5.C;
                z00 z00Var10 = f5.F;
                z00 z00Var11 = f5.D;
                z00 z00Var12 = f5.E;
                ns0 ns0Var4 = (ns0) obj4;
                String str5 = (String) obj3;
                nv0 nv0Var7 = (nv0) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (nv0Var7.R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    qy qyVarA4 = oy.a(n92.d, f5.s, nv0Var7, 0);
                    int iHashCode6 = Long.hashCode(nv0Var7.T);
                    n52 n52VarL6 = nv0Var7.l();
                    bq1 bq1VarM6 = lr.M(nv0Var7, yp1Var);
                    w10.c.getClass();
                    nv0Var7.d0();
                    if (nv0Var7.S) {
                        nv0Var7.k(x91Var);
                    } else {
                        nv0Var7.m0();
                    }
                    y02.F(z00Var12, nv0Var7, qyVarA4);
                    y02.F(z00Var11, nv0Var7, n52VarL6);
                    y02.F(z00Var10, nv0Var7, Integer.valueOf(iHashCode6));
                    y02.C(nv0Var7);
                    y02.F(z00Var9, nv0Var7, bq1VarM6);
                    nv0Var7.a0(1351565975);
                    Iterator it = qi.a.iterator();
                    while (it.hasNext()) {
                        String str6 = (String) it.next();
                        bq1 bq1VarC3 = j43.c(yp1Var, 1.0f);
                        boolean zF3 = nv0Var7.f(ns0Var4) | nv0Var7.f(str6);
                        Object objO3 = nv0Var7.O();
                        if (zF3 || objO3 == zjVar) {
                            objO3 = new an2(i4, ns0Var4, str6);
                            nv0Var7.j0(objO3);
                        }
                        bq1 bq1VarK3 = f80.K(gv3.x(3, (cs0) objO3, bq1VarC3, false), 4.0f, 12.0f);
                        dp2 dp2VarA3 = cp2.a(n92.b, f5.q, nv0Var7, 48);
                        Iterator it2 = it;
                        zj zjVar2 = zjVar;
                        int iHashCode7 = Long.hashCode(nv0Var7.T);
                        n52 n52VarL7 = nv0Var7.l();
                        bq1 bq1VarM7 = lr.M(nv0Var7, bq1VarK3);
                        w10.c.getClass();
                        nv0Var7.d0();
                        if (nv0Var7.S) {
                            nv0Var7.k(x91Var);
                        } else {
                            nv0Var7.m0();
                        }
                        y02.F(z00Var12, nv0Var7, dp2VarA3);
                        y02.F(z00Var11, nv0Var7, n52VarL7);
                        y02.F(z00Var10, nv0Var7, Integer.valueOf(iHashCode7));
                        y02.C(nv0Var7);
                        y02.F(z00Var9, nv0Var7, bq1VarM7);
                        w22.a(s51.n(str6, str5), null, false, null, nv0Var7, 48);
                        oz2.g(nv0Var7, j43.o(yp1Var, 16.0f));
                        mg3.b(g12.Y(str6, nv0Var7), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var7.j(ql3.a)).j, nv0Var7, 0, 0, 131070);
                        nv0Var7.p(true);
                        it = it2;
                        zjVar = zjVar2;
                        i4 = 2;
                    }
                    nv0Var7.p(false);
                    nv0Var7.p(true);
                } else {
                    nv0Var7.U();
                }
                break;
            case vr.g /* 9 */:
                z00 z00Var13 = f5.C;
                z00 z00Var14 = f5.F;
                z00 z00Var15 = f5.D;
                z00 z00Var16 = f5.E;
                ns0 ns0Var5 = (ns0) obj4;
                qf2 qf2Var = (qf2) obj3;
                nv0 nv0Var8 = (nv0) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (nv0Var8.R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    qy qyVarA5 = oy.a(n92.d, f5.s, nv0Var8, 0);
                    int iHashCode8 = Long.hashCode(nv0Var8.T);
                    n52 n52VarL8 = nv0Var8.l();
                    bq1 bq1VarM8 = lr.M(nv0Var8, yp1Var);
                    w10.c.getClass();
                    nv0Var8.d0();
                    if (nv0Var8.S) {
                        nv0Var8.k(x91Var);
                    } else {
                        nv0Var8.m0();
                    }
                    y02.F(z00Var16, nv0Var8, qyVarA5);
                    y02.F(z00Var15, nv0Var8, n52VarL8);
                    y02.F(z00Var14, nv0Var8, Integer.valueOf(iHashCode8));
                    y02.C(nv0Var8);
                    y02.F(z00Var13, nv0Var8, bq1VarM8);
                    nv0Var8.a0(967922385);
                    Iterator it3 = qf2.j.iterator();
                    while (it3.hasNext()) {
                        qf2 qf2Var2 = (qf2) it3.next();
                        bq1 bq1VarC4 = j43.c(yp1Var, 1.0f);
                        boolean zF4 = nv0Var8.f(ns0Var5) | nv0Var8.d(qf2Var2.ordinal());
                        Object objO4 = nv0Var8.O();
                        if (zF4 || objO4 == zjVar) {
                            objO4 = new me1(20, ns0Var5, qf2Var2);
                            nv0Var8.j0(objO4);
                        }
                        bq1 bq1VarK4 = f80.K(gv3.x(3, (cs0) objO4, bq1VarC4, false), 4.0f, 12.0f);
                        dp2 dp2VarA4 = cp2.a(n92.b, f5.q, nv0Var8, 48);
                        yp1 yp1Var2 = yp1Var;
                        Iterator it4 = it3;
                        int iHashCode9 = Long.hashCode(nv0Var8.T);
                        n52 n52VarL9 = nv0Var8.l();
                        bq1 bq1VarM9 = lr.M(nv0Var8, bq1VarK4);
                        w10.c.getClass();
                        nv0Var8.d0();
                        if (nv0Var8.S) {
                            nv0Var8.k(x91Var);
                        } else {
                            nv0Var8.m0();
                        }
                        y02.F(z00Var16, nv0Var8, dp2VarA4);
                        y02.F(z00Var15, nv0Var8, n52VarL9);
                        y02.F(z00Var14, nv0Var8, Integer.valueOf(iHashCode9));
                        y02.C(nv0Var8);
                        y02.F(z00Var13, nv0Var8, bq1VarM9);
                        nv0 nv0Var9 = nv0Var8;
                        w22.a(qf2Var2 == qf2Var, null, false, null, nv0Var9, 48);
                        oz2.g(nv0Var9, j43.o(yp1Var2, 16.0f));
                        int iOrdinal2 = qf2Var2.ordinal();
                        if (iOrdinal2 == 0) {
                            i2 = R.string.launcher_radar_position_top_left;
                        } else if (iOrdinal2 != 1) {
                            c.k();
                        } else {
                            i2 = R.string.launcher_radar_position_bottom_left;
                        }
                        mg3.b(oz2.M(i2, nv0Var9), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var9.j(ql3.a)).j, nv0Var9, 0, 0, 131070);
                        nv0Var9.p(true);
                        it3 = it4;
                        nv0Var8 = nv0Var9;
                        yp1Var = yp1Var2;
                        break;
                    }
                    nv0 nv0Var10 = nv0Var8;
                    nv0Var10.p(false);
                    nv0Var10.p(true);
                } else {
                    nv0Var8.U();
                }
                break;
            case vr.h /* 10 */:
                z00 z00Var17 = f5.C;
                z00 z00Var18 = f5.F;
                z00 z00Var19 = f5.D;
                z00 z00Var20 = f5.E;
                ns0 ns0Var6 = (ns0) obj4;
                qp2 qp2Var = (qp2) obj3;
                nv0 nv0Var11 = (nv0) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (nv0Var11.R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    qy qyVarA6 = oy.a(n92.d, f5.s, nv0Var11, 0);
                    int iHashCode10 = Long.hashCode(nv0Var11.T);
                    n52 n52VarL10 = nv0Var11.l();
                    bq1 bq1VarM10 = lr.M(nv0Var11, yp1Var);
                    w10.c.getClass();
                    nv0Var11.d0();
                    if (nv0Var11.S) {
                        nv0Var11.k(x91Var);
                    } else {
                        nv0Var11.m0();
                    }
                    y02.F(z00Var20, nv0Var11, qyVarA6);
                    y02.F(z00Var19, nv0Var11, n52VarL10);
                    y02.F(z00Var18, nv0Var11, Integer.valueOf(iHashCode10));
                    y02.C(nv0Var11);
                    y02.F(z00Var17, nv0Var11, bq1VarM10);
                    nv0Var11.a0(-518292057);
                    Iterator it5 = qp2.k.iterator();
                    while (it5.hasNext()) {
                        qp2 qp2Var2 = (qp2) it5.next();
                        bq1 bq1VarC5 = j43.c(yp1Var, f);
                        boolean zF5 = nv0Var11.f(ns0Var6) | nv0Var11.d(qp2Var2.ordinal());
                        Object objO5 = nv0Var11.O();
                        if (zF5 || objO5 == zjVar) {
                            objO5 = new me1(22, ns0Var6, qp2Var2);
                            nv0Var11.j0(objO5);
                        }
                        bq1 bq1VarK5 = f80.K(gv3.x(3, (cs0) objO5, bq1VarC5, false), 4.0f, 12.0f);
                        dp2 dp2VarA5 = cp2.a(n92.b, f5.q, nv0Var11, 48);
                        Iterator it6 = it5;
                        int iHashCode11 = Long.hashCode(nv0Var11.T);
                        n52 n52VarL11 = nv0Var11.l();
                        bq1 bq1VarM11 = lr.M(nv0Var11, bq1VarK5);
                        w10.c.getClass();
                        nv0Var11.d0();
                        if (nv0Var11.S) {
                            nv0Var11.k(x91Var);
                        } else {
                            nv0Var11.m0();
                        }
                        y02.F(z00Var20, nv0Var11, dp2VarA5);
                        y02.F(z00Var19, nv0Var11, n52VarL11);
                        y02.F(z00Var18, nv0Var11, Integer.valueOf(iHashCode11));
                        y02.C(nv0Var11);
                        y02.F(z00Var17, nv0Var11, bq1VarM11);
                        nv0 nv0Var12 = nv0Var11;
                        w22.a(qp2Var2 == qp2Var, null, false, null, nv0Var12, 48);
                        oz2.g(nv0Var12, j43.o(yp1Var, 16.0f));
                        mg3.b(qp2Var2.f, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var12.j(ql3.a)).j, nv0Var12, 0, 0, 131070);
                        nv0Var12.p(true);
                        nv0Var11 = nv0Var12;
                        f = 1.0f;
                        it5 = it6;
                    }
                    nv0 nv0Var13 = nv0Var11;
                    nv0Var13.p(false);
                    nv0Var13.p(true);
                } else {
                    nv0Var11.U();
                }
                break;
            case 11:
                ((Integer) obj2).getClass();
                ((m22) obj4).i((Drawable) obj3, (nv0) obj, jo3.y(49));
                break;
            case vr.i /* 12 */:
                sf3 sf3Var = (sf3) obj4;
                x50 x50Var = (x50) obj3;
                vd3 vd3Var = (vd3) obj;
                Context context = (Context) obj2;
                boolean zJ = sf3Var.j();
                af afVarM = sf3Var.m();
                String str7 = afVarM != null ? afVarM.g : null;
                yg3 yg3Var2 = sf3Var.w;
                if (yg3Var2 != null) {
                    long j = yg3Var2.a;
                    iy1 iy1Var = sf3Var.b;
                    yg3Var = new yg3(d32.f(iy1Var.r((int) (j >> 32)), iy1Var.r((int) (j & 4294967295L))));
                } else {
                    yg3Var = null;
                }
                c72 c72Var = sf3Var.j;
                vf3 vf3Var = new vf3(sf3Var, x50Var, context, i5);
                r93 r93Var = e72.a;
                if (Build.VERSION.SDK_INT < 28 || str7 == null || yg3Var == null || c72Var == null || !(c72Var instanceof c72)) {
                    vf3Var.h(vd3Var);
                    if (str7 != null && yg3Var != null) {
                        oz2.o(vd3Var, context, zJ, str7, yg3Var.a);
                    }
                } else {
                    long j2 = yg3Var.a;
                    Object obj7 = c72Var.h;
                    dt1 dt1Var = c72Var.e;
                    if (dt1Var.g()) {
                        ud3 ud3Var2 = (ud3) c72Var.g.getValue();
                        if (ud3Var2 == null || !yg3.b(j2, ud3Var2.b) || !s51.n(str7, ud3Var2.a)) {
                            ud3Var2 = null;
                        }
                        dt1Var.i(null);
                        ud3Var = ud3Var2;
                    }
                    if (ud3Var == null) {
                        vf3Var.h(vd3Var);
                    } else {
                        ArrayList arrayList2 = ud3Var.d;
                        TextClassification textClassification = ud3Var.c;
                        if (!textClassification.getActions().isEmpty()) {
                            vd3Var.a.b(new ke3(obj7, textClassification, 0, (Drawable) arrayList2.get(0)));
                        } else if ((textClassification.getIcon() != null || !TextUtils.isEmpty(textClassification.getLabel())) && (textClassification.getIntent() != null || textClassification.getOnClickListener() != null)) {
                            vd3Var.a.b(new ke3(obj7, textClassification, -1, textClassification.getIcon()));
                        }
                        vf3Var.h(vd3Var);
                        List actions = textClassification.getActions();
                        int size2 = actions.size();
                        for (int i9 = 0; i9 < size2; i9++) {
                            if (i9 > 0) {
                                vd3Var.a.b(new ke3(obj7, textClassification, i9, (Drawable) arrayList2.get(i9)));
                            }
                        }
                    }
                    oz2.o(vd3Var, context, zJ, str7, yg3Var.a);
                }
                break;
            default:
                pn3 pn3Var = (pn3) obj4;
                cs0 cs0Var = (cs0) obj3;
                nv0 nv0Var14 = (nv0) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (!nv0Var14.R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    nv0Var14.U();
                } else if (s51.n(pn3Var, nn3.a)) {
                    nv0Var14.a0(1998403016);
                    gq.m(cs0Var, null, false, null, null, null, vm1.L, nv0Var14, 805306368, 510);
                    nv0Var14.p(false);
                } else if (pn3Var instanceof mn3) {
                    nv0Var14.a0(1998621225);
                    gq.m(cs0Var, null, false, null, null, null, vm1.M, nv0Var14, 805306368, 510);
                    nv0Var14.p(false);
                } else {
                    nv0Var14.a0(1998808496);
                    nv0Var14.p(false);
                }
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ nh2(int i, Object obj, Object obj2) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }
}
