package defpackage;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import top.th1nk.samp.R;
import top.th1nk.samp.feature.game.GameActivity;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ir implements ss0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ir(dt1 dt1Var, ct1 ct1Var) {
        this.f = 7;
        this.g = dt1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x057b  */
    @Override // defpackage.ss0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i = this.f;
        yp1 yp1Var = yp1.a;
        int i2 = 11;
        zj zjVar = c20.a;
        boolean z = true;
        dm3 dm3Var = dm3.a;
        boolean zNativeIsNetworkPacketFilterEnabled = false;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                ((xc1) obj4).h((Throwable) obj);
                return dm3Var;
            case 1:
                bv bvVar = (bv) obj4;
                nv0 nv0Var = (nv0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((nc1) obj).getClass();
                if (nv0Var.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    String str = DateFormat.getDateTimeInstance().format(new Date(((av) bvVar).b.longValue()));
                    str.getClass();
                    mg3.b(oz2.N(R.string.launcher_cleo_catalog_cached, new Object[]{str}, nv0Var), null, ((fy) nv0Var.j(hy.a)).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var.j(ql3.a)).l, nv0Var, 0, 0, 131066);
                } else {
                    nv0Var.U();
                }
                return dm3Var;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                k50 k50Var = (k50) obj4;
                int iIntValue2 = ((Integer) obj).intValue();
                int iIntValue3 = ((Integer) obj2).intValue();
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                if (!zBooleanValue) {
                    iIntValue2 = k50Var.B.n(iIntValue2);
                }
                if (!zBooleanValue) {
                    iIntValue3 = k50Var.B.n(iIntValue3);
                }
                if (k50Var.z) {
                    long j = k50Var.w.b;
                    int i3 = yg3.c;
                    if (iIntValue2 != ((int) (j >> 32)) || iIntValue3 != ((int) (j & 4294967295L))) {
                        int iMin = Math.min(iIntValue2, iIntValue3);
                        hx0 hx0Var = hx0.f;
                        if (iMin < 0 || Math.max(iIntValue2, iIntValue3) > k50Var.w.a.g.length()) {
                            sf3 sf3Var = k50Var.C;
                            sf3Var.t(false);
                            sf3Var.q(hx0Var);
                            z = false;
                        } else {
                            if (zBooleanValue || iIntValue2 == iIntValue3) {
                                sf3 sf3Var2 = k50Var.C;
                                sf3Var2.t(false);
                                sf3Var2.q(hx0Var);
                            } else {
                                k50Var.C.h(true);
                            }
                            k50Var.x.v.h(new bg3(k50Var.w.a, d32.f(iIntValue2, iIntValue3), (yg3) null));
                        }
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                ((uk1) obj4).g.d(((gb2) obj2).c, m22.o);
                return dm3Var;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                GameActivity gameActivity = (GameActivity) obj4;
                int iIntValue4 = ((Integer) obj).intValue();
                int iIntValue5 = ((Integer) obj2).intValue();
                int iIntValue6 = ((Integer) obj3).intValue();
                lu0 lu0Var = GameActivity.Companion;
                try {
                    zNativeIsNetworkPacketFilterEnabled = gameActivity.nativeIsNetworkPacketFilterEnabled(iIntValue4, iIntValue5, iIntValue6);
                    break;
                } catch (UnsatisfiedLinkError unused) {
                }
                return Boolean.valueOf(zNativeIsNetworkPacketFilterEnabled);
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                nm2 nm2Var = (nm2) obj4;
                nv0 nv0Var2 = (nv0) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((ep2) obj).getClass();
                if (nv0Var2.R(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    mg3.b(String.valueOf(((km2) nm2Var).a.size()), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var2, 0, 0, 262142);
                } else {
                    nv0Var2.U();
                }
                return dm3Var;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                en1 en1Var = (en1) obj;
                xm1 xm1Var = (xm1) obj2;
                en1Var.getClass();
                xm1Var.getClass();
                i62 i62VarT = xm1Var.t(((m30) obj3).a);
                return en1Var.I0(Math.round(((z60) obj4).c() * m30.i(r3.a)), i62VarT.g, oi0.f, new z6(i62VarT, 7));
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                dt1 dt1Var = (dt1) obj4;
                dt1.j.set(dt1Var, null);
                dt1Var.i(null);
                return dm3Var;
            case 8:
                c82 c82Var = (c82) obj4;
                nv0 nv0Var3 = (nv0) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((nc1) obj).getClass();
                if (nv0Var3.R(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    String str2 = DateFormat.getDateTimeInstance().format(new Date(((b82) c82Var).b.longValue()));
                    str2.getClass();
                    mg3.b(oz2.N(R.string.plugins_catalog_cached, new Object[]{str2}, nv0Var3), null, ((fy) nv0Var3.j(hy.a)).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var3.j(ql3.a)).l, nv0Var3, 0, 0, 131066);
                } else {
                    nv0Var3.U();
                }
                return dm3Var;
            case vr.g /* 9 */:
                ns0 ns0Var = (ns0) obj4;
                nv0 nv0Var4 = (nv0) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((oo0) obj).getClass();
                if (nv0Var4.R(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    for (l71 l71Var : kh2.a) {
                        boolean zF = nv0Var4.f(ns0Var) | nv0Var4.f(l71Var);
                        Object objO = nv0Var4.O();
                        if (zF || objO == zjVar) {
                            objO = new me1(9, ns0Var, l71Var);
                            nv0Var4.j0(objO);
                        }
                        gq.d((cs0) objO, j43.l(yp1Var, 80.0f, 48.0f), false, uo2.a(12.0f), null, null, null, gq.N(-896561198, new ir(10, l71Var), nv0Var4), nv0Var4, 805306416, 500);
                    }
                } else {
                    nv0Var4.U();
                }
                return dm3Var;
            case vr.h /* 10 */:
                l71 l71Var2 = (l71) obj4;
                nv0 nv0Var5 = (nv0) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((ep2) obj).getClass();
                if (nv0Var5.R(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    String str3 = l71Var2.a;
                    mg3.b(str3, null, 0L, str3.length() <= 2 ? oz2.w(16) : oz2.w(12), xq0.k, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var5, 1572864, 0, 262062);
                } else {
                    nv0Var5.U();
                }
                return dm3Var;
            case 11:
                vl1 vl1Var = (vl1) obj4;
                nv0 nv0Var6 = (nv0) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((ry) obj).getClass();
                if (nv0Var6.R(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    mg3.b(oz2.M(R.string.launcher_resources_local_import_message, nv0Var6), null, ((fy) nv0Var6.j(hy.a)).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var6.j(ql3.a)).k, nv0Var6, 0, 0, 131066);
                    boolean zH = nv0Var6.h(vl1Var);
                    Object objO2 = nv0Var6.O();
                    if (zH || objO2 == zjVar) {
                        objO2 = new mv(vl1Var, 2);
                        nv0Var6.j0(objO2);
                    }
                    gq.i((cs0) objO2, j43.c(yp1Var, 1.0f), false, null, null, null, null, w7.e, nv0Var6, 805306416, 508);
                } else {
                    nv0Var6.U();
                }
                return dm3Var;
            case vr.i /* 12 */:
                ((hv2) obj4).c();
                return dm3Var;
            case 13:
                ArrayList arrayList = (ArrayList) obj4;
                nv0 nv0Var7 = (nv0) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((oo0) obj).getClass();
                if (nv0Var7.R(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    int size = arrayList.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj5 = arrayList.get(i4);
                        i4++;
                        f80.q((String) obj5, null, nv0Var7, 0, 2);
                    }
                } else {
                    nv0Var7.U();
                }
                return dm3Var;
            case 14:
                sz2 sz2Var = (sz2) obj4;
                nv0 nv0Var8 = (nv0) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((he) obj).getClass();
                if (nv0Var8.R(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    l22 l22VarA = sz2Var.a();
                    boolean zH2 = nv0Var8.h(sz2Var);
                    Object objO3 = nv0Var8.O();
                    if (zH2 || objO3 == zjVar) {
                        objO3 = new it1(18, sz2Var);
                        nv0Var8.j0(objO3);
                    }
                    cs0 cs0Var = (cs0) objO3;
                    boolean zH3 = nv0Var8.h(sz2Var);
                    Object objO4 = nv0Var8.O();
                    if (zH3 || objO4 == zjVar) {
                        objO4 = new aw2(4, sz2Var);
                        nv0Var8.j0(objO4);
                    }
                    ns0 ns0Var2 = (ns0) objO4;
                    ot0 ot0Var = sz2Var.c;
                    lf2 lf2Var = sz2Var.a;
                    y92 y92Var = sz2Var.b;
                    String str4 = sz2Var.y;
                    ot0 ot0Var2 = sz2Var.d;
                    qt0 qt0Var = sz2Var.e;
                    ir irVar = sz2Var.f;
                    gt0 gt0Var = sz2Var.g;
                    List list = (List) sz2Var.w.getValue();
                    ot0 ot0Var3 = sz2Var.i;
                    pt0 pt0Var = sz2Var.j;
                    List list2 = (List) sz2Var.t.getValue();
                    List list3 = (List) sz2Var.v.getValue();
                    Set set = (Set) sz2Var.x.getValue();
                    ot0 ot0Var4 = sz2Var.n;
                    boolean zH4 = nv0Var8.h(sz2Var);
                    Object objO5 = nv0Var8.O();
                    if (zH4 || objO5 == zjVar) {
                        objO5 = new qz2(sz2Var, 3);
                        nv0Var8.j0(objO5);
                    }
                    p03.s(l22VarA, cs0Var, ns0Var2, ot0Var, lf2Var, y92Var, str4, ot0Var2, qt0Var, irVar, gt0Var, list, ot0Var3, pt0Var, list2, list3, set, ot0Var4, (rs0) objO5, sz2Var.q, nv0Var8, 0);
                } else {
                    nv0Var8.U();
                }
                return dm3Var;
            case jo3.g /* 15 */:
                aa2 aa2Var = (aa2) obj4;
                nv0 nv0Var9 = (nv0) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((ep2) obj).getClass();
                if (nv0Var9.R(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    mg3.b(oz2.N(R.string.game_plugins_rollback, new Object[]{aa2Var.c}, nv0Var9), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var9, 0, 0, 262142);
                } else {
                    nv0Var9.U();
                }
                return dm3Var;
            case 16:
                h53 h53Var = (h53) obj4;
                en1 en1Var2 = (en1) obj;
                i62 i62VarT2 = ((xm1) obj2).t(((m30) obj3).a);
                int iP0 = jd0.b(Float.NaN, Float.NaN) ? h53Var.r == t02.f ? i62VarT2.f / 2 : i62VarT2.g / 2 : en1Var2.p0(Float.NaN);
                int i5 = i62VarT2.f;
                int i6 = i62VarT2.g;
                Map mapSingletonMap = Collections.singletonMap(g53.f, Integer.valueOf(iP0));
                mapSingletonMap.getClass();
                return en1Var2.I0(i5, i6, mapSingletonMap, new z6(i62VarT2, i2));
            default:
                sf3 sf3Var3 = (sf3) obj4;
                bq1 bq1Var = (bq1) obj;
                nv0 nv0Var10 = (nv0) obj2;
                ((Integer) obj3).getClass();
                nv0Var10.a0(1980580247);
                ua0 ua0Var = (ua0) nv0Var10.j(s20.h);
                Object objO6 = nv0Var10.O();
                Object obj6 = objO6;
                if (objO6 == zjVar) {
                    d42 d42VarW = b32.w(new p41(0L));
                    nv0Var10.j0(d42VarW);
                    obj6 = d42VarW;
                }
                os1 os1Var = (os1) obj6;
                boolean zH5 = nv0Var10.h(sf3Var3);
                Object objO7 = nv0Var10.O();
                Object obj7 = objO7;
                if (zH5 || objO7 == zjVar) {
                    me1 me1Var = new me1(27, sf3Var3, os1Var);
                    nv0Var10.j0(me1Var);
                    obj7 = me1Var;
                }
                cs0 cs0Var2 = (cs0) obj7;
                boolean zF2 = nv0Var10.f(ua0Var);
                Object objO8 = nv0Var10.O();
                Object obj8 = objO8;
                if (zF2 || objO8 == zjVar) {
                    wf3 wf3Var = new wf3(ua0Var, os1Var, z ? 1 : 0);
                    nv0Var10.j0(wf3Var);
                    obj8 = wf3Var;
                }
                re reVar = mu2.a;
                bq1 bq1VarT = lr.t(bq1Var, new w91(i2, cs0Var2, (ns0) obj8));
                nv0Var10.p(false);
                return bq1VarT;
        }
    }

    public /* synthetic */ ir(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }
}
