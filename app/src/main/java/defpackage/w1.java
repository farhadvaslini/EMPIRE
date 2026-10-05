package defpackage;

import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w1 implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ w1(cs0 cs0Var, cs0 cs0Var2, os1 os1Var) {
        this.f = 19;
        this.g = cs0Var;
        this.h = cs0Var2;
        this.i = os1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x0688  */
    @Override // defpackage.rs0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Object obj, Object obj2) throws PackageManager.NameNotFoundException {
        String str;
        int i = this.f;
        yp1 yp1Var = yp1.a;
        p40 p40Var = null;
        x91 x91Var = tb1.Y;
        zj zjVar = c20.a;
        int i2 = 1;
        dm3 dm3Var = dm3.a;
        Object obj3 = this.g;
        Object obj4 = this.i;
        Object obj5 = this.h;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                s51.f((of1) obj5, (ns0) obj4, (cs0) obj3, (nv0) obj, jo3.y(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                f80.b((cs0) obj3, (nb0) obj5, (d00) obj4, (nv0) obj, jo3.y(385));
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                bq1 bq1Var = (bq1) obj5;
                os1 os1Var = (os1) obj4;
                d00 d00Var = (d00) obj3;
                nv0 nv0Var = (nv0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objO = nv0Var.O();
                    if (objO == zjVar) {
                        objO = new zb(os1Var, z ? 1 : 0);
                        nv0Var.j0(objO);
                    }
                    bq1 bq1VarU = n92.u(bq1Var, (ns0) objO);
                    cn1 cn1VarD = eo.d(f5.g, true);
                    int iHashCode = Long.hashCode(nv0Var.T);
                    n52 n52VarL = nv0Var.l();
                    bq1 bq1VarM = lr.M(nv0Var, bq1VarU);
                    w10.c.getClass();
                    nv0Var.d0();
                    if (nv0Var.S) {
                        nv0Var.k(x91Var);
                    } else {
                        nv0Var.m0();
                    }
                    y02.F(f5.E, nv0Var, cn1VarD);
                    y02.F(f5.D, nv0Var, n52VarL);
                    y02.F(f5.F, nv0Var, Integer.valueOf(iHashCode));
                    y02.C(nv0Var);
                    y02.F(f5.C, nv0Var, bq1VarM);
                    nc2.p(0, d00Var, nv0Var, true);
                } else {
                    nv0Var.U();
                }
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                ((Integer) obj2).getClass();
                cl3.b((ns0) obj4, (bq1) obj5, (ns0) obj3, (nv0) obj, jo3.y(49));
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                ((Integer) obj2).getClass();
                s20.a((q12) obj5, (jc) obj4, (d00) obj3, (nv0) obj, jo3.y(1));
                break;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                ((Integer) obj2).getClass();
                gq.c((bq1) obj5, (sf3) obj4, (d00) obj3, (nv0) obj, jo3.y(385));
                break;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                ((Integer) obj2).getClass();
                w7.p((bq1) obj5, (ea1) obj3, (ns0) obj4, (nv0) obj, jo3.y(1));
                break;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                nu1 nu1Var = (nu1) obj5;
                go3 go3Var = (go3) obj4;
                os1 os1Var2 = (os1) obj3;
                nv0 nv0Var2 = (nv0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zH = nv0Var2.h(nu1Var);
                    Object objO2 = nv0Var2.O();
                    if (zH || objO2 == zjVar) {
                        objO2 = new q91(nu1Var, 19);
                        nv0Var2.j0(objO2);
                    }
                    cs0 cs0Var = (cs0) objO2;
                    an3 an3Var = (an3) os1Var2.getValue();
                    boolean zH2 = nv0Var2.h(go3Var);
                    Object objO3 = nv0Var2.O();
                    if (zH2 || objO3 == zjVar) {
                        objO3 = new g91(go3Var, i2);
                        nv0Var2.j0(objO3);
                    }
                    g12.a(cs0Var, an3Var, (cs0) objO3, nv0Var2, 0);
                } else {
                    nv0Var2.U();
                }
                break;
            case 8:
                ((Integer) obj2).getClass();
                vp.i((qt1) obj5, (dq2) obj4, (d00) obj3, (nv0) obj, jo3.y(385));
                break;
            case vr.g /* 9 */:
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                cl3.t((x50) obj5, null, new s60(fFloatValue, (it2) obj4, (qt1) obj3, (p40) null), 3);
                break;
            case vr.h /* 10 */:
                oa2 oa2Var = (oa2) obj5;
                y92 y92Var = oa2Var.c;
                os1 os1Var3 = (os1) obj4;
                os1 os1Var4 = (os1) obj3;
                y31 y31Var = (y31) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                y31Var.getClass();
                k82 k82Var = y31Var.a;
                String str2 = k82Var.b;
                if (zBooleanValue) {
                    str2.getClass();
                    if (y92Var.m(str2)) {
                        os1Var3.setValue(y31Var);
                        List list = k82Var.i;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj6 : list) {
                            if (oa2Var.f(str2).contains((String) obj6)) {
                                arrayList.add(obj6);
                            }
                        }
                        os1Var4.setValue(qx.R0(arrayList));
                    } else {
                        str2.getClass();
                        y92Var.s(str2, zBooleanValue);
                    }
                    break;
                }
                break;
            case 11:
                y31 y31Var2 = (y31) obj5;
                oa2 oa2Var2 = (oa2) obj4;
                os1 os1Var5 = (os1) obj3;
                nv0 nv0Var3 = (nv0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (nv0Var3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    bq1 bq1VarC = n92.C(j43.g(yp1Var, 0.0f, 360.0f, 1), n92.A(nv0Var3), true);
                    qy qyVarA = oy.a(new jj(8.0f, true, new c(1)), f5.s, nv0Var3, 6);
                    int iHashCode2 = Long.hashCode(nv0Var3.T);
                    n52 n52VarL2 = nv0Var3.l();
                    bq1 bq1VarM2 = lr.M(nv0Var3, bq1VarC);
                    w10.c.getClass();
                    nv0Var3.d0();
                    if (nv0Var3.S) {
                        nv0Var3.k(x91Var);
                    } else {
                        nv0Var3.m0();
                    }
                    y02.F(f5.E, nv0Var3, qyVarA);
                    y02.F(f5.D, nv0Var3, n52VarL2);
                    y02.F(f5.F, nv0Var3, Integer.valueOf(iHashCode2));
                    y02.C(nv0Var3);
                    y02.F(f5.C, nv0Var3, bq1VarM2);
                    k82 k82Var2 = y31Var2.a;
                    mg3.b(oz2.N(R.string.plugins_permission_message, new Object[]{k82Var2.c}, nv0Var3), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var3, 0, 0, 262142);
                    List list2 = k82Var2.i;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj7 : list2) {
                        if (oa2Var2.f(k82Var2.b).contains((String) obj7)) {
                            arrayList2.add(obj7);
                        }
                    }
                    Set set = (Set) os1Var5.getValue();
                    Object objO4 = nv0Var3.O();
                    if (objO4 == zjVar) {
                        objO4 = new l8(os1Var5, 8);
                        nv0Var3.j0(objO4);
                    }
                    rn.o(arrayList2, set, null, (rs0) objO4, nv0Var3, 3072, 4);
                    nv0Var3.p(true);
                } else {
                    nv0Var3.U();
                }
                break;
            case vr.i /* 12 */:
                ((Integer) obj2).getClass();
                r51.e((gp3) obj5, (ss0) obj4, (rs0) obj3, (nv0) obj, jo3.y(1));
                break;
            case 13:
                nk2 nk2Var = (nk2) obj5;
                ws2 ws2Var = (ws2) obj4;
                float fFloatValue2 = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                long jI = ws2Var.i(ws2Var.e(fFloatValue2 - nk2Var.f));
                ws2 ws2Var2 = ((us2) obj3).a;
                nk2Var.f += ws2Var.e(ws2Var.h(ws2Var2.d(ws2Var2.k, jI, 1)));
                break;
            case 14:
                ((Integer) obj2).getClass();
                jo3.d((rs0) obj5, (d00) obj4, (x12) obj3, (nv0) obj, jo3.y(1));
                break;
            case jo3.g /* 15 */:
                ((Integer) obj2).getClass();
                f80.l((kq2) obj5, (cs0) obj3, (cs0) obj4, (nv0) obj, jo3.y(1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                g12.a((cs0) obj3, (an3) obj5, (cs0) obj4, (nv0) obj, jo3.y(1));
                break;
            case 17:
                cs0 cs0Var2 = (cs0) obj3;
                ns0 ns0Var = (ns0) obj4;
                os1 os1Var6 = (os1) obj5;
                nv0 nv0Var4 = (nv0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (nv0Var4.R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    dp2 dp2VarA = cp2.a(n92.b, f5.p, nv0Var4, 0);
                    int iHashCode3 = Long.hashCode(nv0Var4.T);
                    n52 n52VarL3 = nv0Var4.l();
                    bq1 bq1VarM3 = lr.M(nv0Var4, yp1Var);
                    w10.c.getClass();
                    nv0Var4.d0();
                    if (nv0Var4.S) {
                        nv0Var4.k(x91Var);
                    } else {
                        nv0Var4.m0();
                    }
                    y02.F(f5.E, nv0Var4, dp2VarA);
                    y02.F(f5.D, nv0Var4, n52VarL3);
                    y02.F(f5.F, nv0Var4, Integer.valueOf(iHashCode3));
                    y02.C(nv0Var4);
                    y02.F(f5.C, nv0Var4, bq1VarM3);
                    gq.m(cs0Var2, null, false, null, null, null, r51.i0, nv0Var4, 805306368, 510);
                    boolean zF = nv0Var4.f(ns0Var) | nv0Var4.f(os1Var6);
                    Object objO5 = nv0Var4.O();
                    if (zF || objO5 == zjVar) {
                        objO5 = new ei2(ns0Var, os1Var6, 2);
                        nv0Var4.j0(objO5);
                    }
                    gq.m((cs0) objO5, null, false, null, null, null, r51.j0, nv0Var4, 805306368, 510);
                    nv0Var4.p(true);
                } else {
                    nv0Var4.U();
                }
                break;
            case 18:
                String str3 = (String) obj5;
                String str4 = (String) obj4;
                cs0 cs0Var3 = (cs0) obj3;
                nv0 nv0Var5 = (nv0) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (nv0Var5.R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    br.k(gq.N(95303233, new a81(str3, str4), nv0Var5), null, gq.N(-1835198593, new k91(cs0Var3, 20), nv0Var5), null, nv0Var5, 390, 10);
                } else {
                    nv0Var5.U();
                }
                break;
            case 19:
                cs0 cs0Var4 = (cs0) obj3;
                cs0 cs0Var5 = (cs0) obj5;
                os1 os1Var7 = (os1) obj4;
                nv0 nv0Var6 = (nv0) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (nv0Var6.R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    boolean zF2 = nv0Var6.f(cs0Var4) | nv0Var6.f(cs0Var5);
                    Object objO6 = nv0Var6.O();
                    if (zF2 || objO6 == zjVar) {
                        objO6 = new ok(cs0Var4, cs0Var5, os1Var7, 22);
                        nv0Var6.j0(objO6);
                    }
                    gq.m((cs0) objO6, null, false, null, null, null, r51.Z, nv0Var6, 805306368, 510);
                } else {
                    nv0Var6.U();
                }
                break;
            case 20:
                ((Integer) obj2).getClass();
                oz2.f((c63) obj5, (bq1) obj4, (ss0) obj3, (nv0) obj, jo3.y(7));
                break;
            case 21:
                qn3 qn3Var = (qn3) obj5;
                String str5 = (String) obj4;
                pn3 pn3Var = (pn3) obj3;
                nv0 nv0Var7 = (nv0) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (nv0Var7.R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    yp1 yp1Var2 = yp1.a;
                    bq1 bq1VarC2 = j43.c(yp1Var2, 1.0f);
                    qy qyVarA2 = oy.a(n92.d, f5.s, nv0Var7, 0);
                    int iHashCode4 = Long.hashCode(nv0Var7.T);
                    n52 n52VarL4 = nv0Var7.l();
                    bq1 bq1VarM4 = lr.M(nv0Var7, bq1VarC2);
                    w10.c.getClass();
                    nv0Var7.d0();
                    if (nv0Var7.S) {
                        nv0Var7.k(x91Var);
                    } else {
                        nv0Var7.m0();
                    }
                    y02.F(f5.E, nv0Var7, qyVarA2);
                    y02.F(f5.D, nv0Var7, n52VarL4);
                    y02.F(f5.F, nv0Var7, Integer.valueOf(iHashCode4));
                    y02.C(nv0Var7);
                    y02.F(f5.C, nv0Var7, bq1VarM4);
                    String str6 = qn3Var.a;
                    long j = qn3Var.e;
                    mg3.b(oz2.N(R.string.update_dialog_message, new Object[]{str6, str5}, nv0Var7), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var7, 0, 0, 262142);
                    if (qn3Var.f) {
                        nv0Var7.a0(-1061764447);
                        mg3.b(oz2.M(R.string.update_dialog_prerelease, nv0Var7), f80.N(yp1Var2, 0.0f, 8.0f, 0.0f, 0.0f, 13), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var7, 48, 0, 262140);
                        nv0Var7.p(false);
                    } else {
                        nv0Var7.a0(-1061558793);
                        nv0Var7.p(false);
                    }
                    if (j > 0) {
                        nv0Var7.a0(-1061506186);
                        double d = j / 1024.0d;
                        double d2 = d / 1024.0d;
                        double d3 = d2 / 1024.0d;
                        if (d3 >= 1.0d) {
                            str = String.format("%.1f GB", Arrays.copyOf(new Object[]{Double.valueOf(d3)}, 1));
                        } else if (d2 >= 1.0d) {
                            str = String.format("%.1f MB", Arrays.copyOf(new Object[]{Double.valueOf(d2)}, 1));
                        } else if (d >= 1.0d) {
                            str = String.format("%.0f KB", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
                        } else {
                            str = j + " B";
                        }
                        mg3.b(oz2.N(R.string.update_dialog_size, new Object[]{str}, nv0Var7), f80.N(yp1Var2, 0.0f, 8.0f, 0.0f, 0.0f, 13), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var7, 48, 0, 262140);
                        nv0Var7.p(false);
                    } else {
                        nv0Var7.a0(-1061197705);
                        nv0Var7.p(false);
                    }
                    if (pn3Var instanceof ln3) {
                        nv0Var7.a0(-1061102504);
                        cd0 cd0Var = ((ln3) pn3Var).a;
                        long j2 = cd0Var.b;
                        final int i3 = j2 > 0 ? (int) ((cd0Var.a * 100) / j2) : 0;
                        mg3.b(oz2.N(R.string.update_status_downloading, new Object[]{Integer.valueOf(i3)}, nv0Var7), f80.N(yp1Var2, 0.0f, 16.0f, 0.0f, 0.0f, 13), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var7, 48, 0, 262140);
                        boolean zD = nv0Var7.d(i3);
                        Object objO7 = nv0Var7.O();
                        if (zD || objO7 == zjVar) {
                            objO7 = new cs0() { // from class: jn3
                                @Override // defpackage.cs0
                                public final Object a() {
                                    return Float.valueOf(i3 / 100.0f);
                                }
                            };
                            nv0Var7.j0(objO7);
                        }
                        xd2.b((cs0) objO7, f80.N(j43.c(yp1Var2, 1.0f), 0.0f, 8.0f, 0.0f, 0.0f, 13), 0L, 0L, 0, 0.0f, null, nv0Var7, 48);
                        nv0Var7.p(false);
                    } else if (pn3Var instanceof mn3) {
                        nv0Var7.a0(-1060272851);
                        mg3.b(oz2.N(R.string.update_status_failed, new Object[]{((mn3) pn3Var).a}, nv0Var7), f80.N(yp1Var2, 0.0f, 16.0f, 0.0f, 0.0f, 13), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var7, 48, 0, 262140);
                        nv0Var7.p(false);
                    } else {
                        nv0Var7.a0(-1060047977);
                        nv0Var7.p(false);
                    }
                    nv0Var7.p(true);
                } else {
                    nv0Var7.U();
                }
                break;
            default:
                tu3 tu3Var = (tu3) obj5;
                a20 a20Var = (a20) obj4;
                d00 d00Var2 = (d00) obj3;
                nv0 nv0Var8 = (nv0) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (nv0Var8.R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    h7 h7Var = tu3Var.f;
                    boolean zH3 = nv0Var8.h(tu3Var);
                    Object objO8 = nv0Var8.O();
                    if (zH3 || objO8 == zjVar) {
                        objO8 = new su3(tu3Var, p40Var, z ? 1 : 0);
                        nv0Var8.j0(objO8);
                    }
                    rn.l((rs0) objO8, nv0Var8, h7Var);
                    boolean zH4 = nv0Var8.h(tu3Var);
                    Object objO9 = nv0Var8.O();
                    if (zH4 || objO9 == zjVar) {
                        objO9 = new su3(tu3Var, p40Var, i2);
                        nv0Var8.j0(objO9);
                    }
                    rn.l((rs0) objO9, nv0Var8, h7Var);
                    a20Var.a(h7Var, d00Var2, nv0Var8, 0);
                } else {
                    nv0Var8.U();
                }
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ w1(cs0 cs0Var, ns0 ns0Var, os1 os1Var) {
        this.f = 17;
        this.g = cs0Var;
        this.i = ns0Var;
        this.h = os1Var;
    }

    public /* synthetic */ w1(cs0 cs0Var, Object obj, zs0 zs0Var, int i, int i2) {
        this.f = i2;
        this.g = cs0Var;
        this.h = obj;
        this.i = zs0Var;
    }

    public /* synthetic */ w1(ns0 ns0Var, bq1 bq1Var, ns0 ns0Var2, int i) {
        this.f = 3;
        this.i = ns0Var;
        this.h = bq1Var;
        this.g = ns0Var2;
    }

    public /* synthetic */ w1(Object obj, Object obj2, zs0 zs0Var, int i, int i2) {
        this.f = i2;
        this.h = obj;
        this.g = obj2;
        this.i = zs0Var;
    }

    public /* synthetic */ w1(Object obj, Object obj2, Object obj3, int i) {
        this.f = i;
        this.h = obj;
        this.i = obj2;
        this.g = obj3;
    }

    public /* synthetic */ w1(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.f = i2;
        this.h = obj;
        this.i = obj2;
        this.g = obj3;
    }
}
