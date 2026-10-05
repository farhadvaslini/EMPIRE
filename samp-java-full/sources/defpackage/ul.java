package defpackage;

import android.content.Context;
import android.widget.Toast;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ul implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ ul(y92 y92Var, y31 y31Var, rs0 rs0Var, os1 os1Var) {
        this.f = 13;
        this.g = y92Var;
        this.i = y31Var;
        this.j = rs0Var;
        this.h = os1Var;
    }

    private final Object d(Object obj, Object obj2) {
        y92 y92Var = (y92) this.g;
        y31 y31Var = (y31) this.i;
        rs0 rs0Var = (rs0) this.j;
        os1 os1Var = (os1) this.h;
        nv0 nv0Var = (nv0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
            boolean zH = nv0Var.h(y92Var) | nv0Var.h(y31Var) | nv0Var.f(rs0Var);
            Object objO = nv0Var.O();
            if (zH || objO == c20.a) {
                n8 n8Var = new n8(y92Var, y31Var, rs0Var, os1Var, 10);
                nv0Var.j0(n8Var);
                objO = n8Var;
            }
            gq.m((cs0) objO, null, false, null, null, null, f80.I, nv0Var, 805306368, 510);
        } else {
            nv0Var.U();
        }
        return dm3.a;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        boolean z;
        os1 os1Var;
        Object obj3;
        String strN;
        boolean z2;
        String strF0;
        String str;
        boolean z3;
        Object obj4;
        zj zjVar;
        String strF;
        long j;
        int i = this.f;
        yp1 yp1Var = yp1.a;
        x91 x91Var = tb1.Y;
        zj zjVar2 = c20.a;
        dm3 dm3Var = dm3.a;
        Object obj5 = this.j;
        Object obj6 = this.i;
        Object obj7 = this.h;
        Object obj8 = this.g;
        final int i2 = 1;
        switch (i) {
            case 0:
                bq1 bq1Var = (bq1) obj8;
                os1 os1Var2 = (os1) obj7;
                d00 d00Var = (d00) obj6;
                tl tlVar = (tl) obj5;
                nv0 nv0Var = (nv0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i3 = 1;
                if (nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objO = nv0Var.O();
                    if (objO == zjVar2) {
                        objO = new zb(os1Var2, i3);
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
                    d00Var.f(nv0Var, 0);
                    Object objO2 = nv0Var.O();
                    if (objO2 == zjVar2) {
                        z = true;
                        objO2 = new yb(os1Var2, 1);
                        nv0Var.j0(objO2);
                    } else {
                        z = true;
                    }
                    tlVar.b((cs0) objO2, nv0Var, 6);
                    nv0Var.p(z);
                } else {
                    nv0Var.U();
                }
                return dm3Var;
            case 1:
                ((Integer) obj2).getClass();
                gv3.c((String) obj8, (String) obj7, (String) obj6, (cs0) obj5, (nv0) obj, jo3.y(1));
                return dm3Var;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ((Integer) obj2).getClass();
                w7.n((vg2) obj8, (cs0) obj7, (cs0) obj6, (cs0) obj5, (nv0) obj, jo3.y(9));
                return dm3Var;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                sa1 sa1Var = (sa1) obj8;
                go3 go3Var = (go3) obj7;
                nu1 nu1Var = (nu1) obj6;
                final Context context = (Context) obj5;
                nv0 nv0Var2 = (nv0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    os1 os1VarO = br.o(sa1Var.T, nv0Var2);
                    os1 os1VarO2 = br.o(sa1Var.U, nv0Var2);
                    os1 os1VarO3 = br.o(sa1Var.V, nv0Var2);
                    os1 os1VarO4 = br.o(sa1Var.Y, nv0Var2);
                    os1 os1VarO5 = br.o(sa1Var.Z, nv0Var2);
                    os1 os1VarO6 = br.o(go3Var.f, nv0Var2);
                    os1 os1VarO7 = br.o(go3Var.h, nv0Var2);
                    final String strM = oz2.M(R.string.launcher_nickname_saved, nv0Var2);
                    final String strM2 = oz2.M(R.string.launcher_client_version_name_saved, nv0Var2);
                    final String strM3 = oz2.M(R.string.launcher_gpci_refreshed, nv0Var2);
                    boolean zH = nv0Var2.h(nu1Var);
                    Object objO3 = nv0Var2.O();
                    if (zH || objO3 == zjVar2) {
                        os1Var = os1VarO2;
                        q91 q91Var = new q91(nu1Var, 20);
                        nv0Var2.j0(q91Var);
                        obj3 = q91Var;
                    } else {
                        os1Var = os1VarO2;
                        obj3 = objO3;
                    }
                    cs0 cs0Var = (cs0) obj3;
                    String str2 = (String) os1VarO.getValue();
                    qp2 qp2Var = (qp2) os1Var.getValue();
                    String str3 = (String) os1VarO3.getValue();
                    String str4 = (String) os1VarO4.getValue();
                    oh3 oh3Var = (oh3) os1VarO5.getValue();
                    boolean zBooleanValue = ((Boolean) os1VarO6.getValue()).booleanValue();
                    boolean zBooleanValue2 = ((Boolean) os1VarO7.getValue()).booleanValue();
                    boolean zH2 = nv0Var2.h(sa1Var);
                    Object objO4 = nv0Var2.O();
                    if (zH2 || objO4 == zjVar2) {
                        objO4 = new e91(1, sa1Var, sa1.class, "saveNickname", "saveNickname(Ljava/lang/String;)V", 0, 0, 5);
                        nv0Var2.j0(objO4);
                    }
                    ns0 ns0Var = (ns0) ((ct0) objO4);
                    boolean zH3 = nv0Var2.h(sa1Var);
                    Object objO5 = nv0Var2.O();
                    if (zH3 || objO5 == zjVar2) {
                        objO5 = new e91(1, sa1Var, sa1.class, "saveClientVersion", "saveClientVersion(Ltop/th1nk/samp/core/config/SampClientVersion;)V", 0, 0, 6);
                        nv0Var2.j0(objO5);
                    }
                    ns0 ns0Var2 = (ns0) ((ct0) objO5);
                    boolean zH4 = nv0Var2.h(sa1Var);
                    Object objO6 = nv0Var2.O();
                    if (zH4 || objO6 == zjVar2) {
                        objO6 = new e91(1, sa1Var, sa1.class, "saveClientVersionName", "saveClientVersionName(Ljava/lang/String;)V", 0, 0, 7);
                        nv0Var2.j0(objO6);
                    }
                    ns0 ns0Var3 = (ns0) ((ct0) objO6);
                    boolean zH5 = nv0Var2.h(sa1Var);
                    Object objO7 = nv0Var2.O();
                    if (zH5 || objO7 == zjVar2) {
                        objO7 = new op0(2, sa1Var, sa1.class, "saveLanguageTag", "saveLanguageTag(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", 0, 0, 4);
                        nv0Var2.j0(objO7);
                    }
                    rs0 rs0Var = (rs0) ((ct0) objO7);
                    boolean zH6 = nv0Var2.h(sa1Var);
                    Object objO8 = nv0Var2.O();
                    if (zH6 || objO8 == zjVar2) {
                        objO8 = new e91(1, sa1Var, sa1.class, "saveThemeMode", "saveThemeMode(Ltop/th1nk/samp/core/config/ThemeMode;)V", 0, 0, 8);
                        nv0Var2.j0(objO8);
                    }
                    ns0 ns0Var4 = (ns0) ((ct0) objO8);
                    boolean zH7 = nv0Var2.h(go3Var);
                    Object objO9 = nv0Var2.O();
                    if (zH7 || objO9 == zjVar2) {
                        objO9 = new e91(1, go3Var, go3.class, "setAutoCheckEnabled", "setAutoCheckEnabled(Z)V", 0, 0, 9);
                        nv0Var2.j0(objO9);
                    }
                    ns0 ns0Var5 = (ns0) ((ct0) objO9);
                    boolean zH8 = nv0Var2.h(go3Var);
                    Object objO10 = nv0Var2.O();
                    if (zH8 || objO10 == zjVar2) {
                        objO10 = new e91(1, go3Var, go3.class, "setPreReleaseEnabled", "setPreReleaseEnabled(Z)V", 0, 0, 10);
                        nv0Var2.j0(objO10);
                    }
                    ns0 ns0Var6 = (ns0) ((ct0) objO10);
                    boolean zH9 = nv0Var2.h(sa1Var);
                    Object objO11 = nv0Var2.O();
                    if (zH9 || objO11 == zjVar2) {
                        objO11 = new c91(0, sa1Var, sa1.class, "refreshGpci", "refreshGpci()V", 0, 0, 14);
                        nv0Var2.j0(objO11);
                    }
                    cs0 cs0Var2 = (cs0) ((ct0) objO11);
                    boolean zH10 = nv0Var2.h(context) | nv0Var2.f(strM);
                    Object objO12 = nv0Var2.O();
                    Object obj9 = objO12;
                    if (zH10 || objO12 == zjVar2) {
                        final int i4 = 0;
                        cs0 cs0Var3 = new cs0() { // from class: z91
                            @Override // defpackage.cs0
                            public final Object a() {
                                int i5 = i4;
                                dm3 dm3Var2 = dm3.a;
                                String str5 = strM;
                                Context context2 = context;
                                switch (i5) {
                                    case 0:
                                        Toast.makeText(context2, str5, 0).show();
                                        break;
                                    case 1:
                                        Toast.makeText(context2, str5, 0).show();
                                        break;
                                    default:
                                        Toast.makeText(context2, str5, 0).show();
                                        break;
                                }
                                return dm3Var2;
                            }
                        };
                        nv0Var2.j0(cs0Var3);
                        obj9 = cs0Var3;
                    }
                    cs0 cs0Var4 = (cs0) obj9;
                    boolean zH11 = nv0Var2.h(context) | nv0Var2.f(strM2);
                    Object objO13 = nv0Var2.O();
                    Object obj10 = objO13;
                    if (zH11 || objO13 == zjVar2) {
                        final int i5 = 1;
                        cs0 cs0Var5 = new cs0() { // from class: z91
                            @Override // defpackage.cs0
                            public final Object a() {
                                int i52 = i5;
                                dm3 dm3Var2 = dm3.a;
                                String str5 = strM2;
                                Context context2 = context;
                                switch (i52) {
                                    case 0:
                                        Toast.makeText(context2, str5, 0).show();
                                        break;
                                    case 1:
                                        Toast.makeText(context2, str5, 0).show();
                                        break;
                                    default:
                                        Toast.makeText(context2, str5, 0).show();
                                        break;
                                }
                                return dm3Var2;
                            }
                        };
                        nv0Var2.j0(cs0Var5);
                        obj10 = cs0Var5;
                    }
                    cs0 cs0Var6 = (cs0) obj10;
                    boolean zH12 = nv0Var2.h(context) | nv0Var2.f(strM3);
                    Object objO14 = nv0Var2.O();
                    Object obj11 = objO14;
                    if (zH12 || objO14 == zjVar2) {
                        final int i6 = 2;
                        cs0 cs0Var7 = new cs0() { // from class: z91
                            @Override // defpackage.cs0
                            public final Object a() {
                                int i52 = i6;
                                dm3 dm3Var2 = dm3.a;
                                String str5 = strM3;
                                Context context2 = context;
                                switch (i52) {
                                    case 0:
                                        Toast.makeText(context2, str5, 0).show();
                                        break;
                                    case 1:
                                        Toast.makeText(context2, str5, 0).show();
                                        break;
                                    default:
                                        Toast.makeText(context2, str5, 0).show();
                                        break;
                                }
                                return dm3Var2;
                            }
                        };
                        nv0Var2.j0(cs0Var7);
                        obj11 = cs0Var7;
                    }
                    g12.h(cs0Var, str2, qp2Var, str3, str4, oh3Var, zBooleanValue, zBooleanValue2, ns0Var, ns0Var2, ns0Var3, rs0Var, ns0Var4, ns0Var5, ns0Var6, cs0Var2, cs0Var4, cs0Var6, (cs0) obj11, nv0Var2, 0);
                } else {
                    nv0Var2.U();
                }
                return dm3Var;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                ((Integer) obj2).getClass();
                da1.c((List) obj8, (Map) obj7, (cs0) obj6, (ns0) obj5, (nv0) obj, jo3.y(1));
                return dm3Var;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                ((Integer) obj2).getClass();
                pq.d((cs0) obj7, (bq1) obj8, (nd1) obj6, (cd1) obj5, (nv0) obj, jo3.y(1));
                return dm3Var;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                i90 i90Var = (i90) obj8;
                x50 x50Var = (x50) obj7;
                e93 e93Var = (e93) obj6;
                e93 e93Var2 = (e93) obj5;
                nv0 nv0Var3 = (nv0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (nv0Var3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    int i7 = 0;
                    for (Object obj12 : l92.g) {
                        int i8 = i7 + 1;
                        if (i7 < 0) {
                            vr.b0();
                            throw null;
                        }
                        int iOrdinal = ((l92) obj12).ordinal();
                        if (iOrdinal == 0) {
                            nv0Var3.a0(-112668147);
                            strN = oz2.N(R.string.plugins_tab_installed_count, new Object[]{Integer.valueOf(((List) e93Var.getValue()).size())}, nv0Var3);
                            nv0Var3.p(false);
                        } else {
                            if (iOrdinal != 1) {
                                throw by1.d(nv0Var3, -112669365, false);
                            }
                            nv0Var3.a0(802447065);
                            c82 c82Var = (c82) e93Var2.getValue();
                            b82 b82Var = c82Var instanceof b82 ? (b82) c82Var : null;
                            Integer numValueOf = b82Var != null ? Integer.valueOf(b82Var.a.a()) : null;
                            if (numValueOf == null) {
                                z2 = false;
                                strN = by1.f(nv0Var3, 802607738, R.string.plugins_catalog_title, nv0Var3, false);
                            } else {
                                z2 = false;
                                nv0Var3.a0(802718346);
                                strN = oz2.N(R.string.plugins_tab_catalog_count, new Object[]{numValueOf}, nv0Var3);
                                nv0Var3.p(false);
                            }
                            nv0Var3.p(z2);
                        }
                        boolean z4 = i90Var.k() == i7;
                        boolean zH13 = nv0Var3.h(x50Var) | nv0Var3.f(i90Var) | nv0Var3.d(i7);
                        Object objO15 = nv0Var3.O();
                        if (zH13 || objO15 == zjVar2) {
                            objO15 = new nv(x50Var, i90Var, i7, 1);
                            nv0Var3.j0(objO15);
                        }
                        lc3.b(z4, (cs0) objO15, null, false, gq.N(180859516, new z71(strN, 6, (byte) 0), nv0Var3), 0L, 0L, nv0Var3, 24576);
                        i7 = i8;
                    }
                } else {
                    nv0Var3.U();
                }
                return dm3Var;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                oa2 oa2Var = (oa2) obj8;
                y31 y31Var = (y31) obj6;
                os1 os1Var3 = (os1) obj7;
                os1 os1Var4 = (os1) obj5;
                nv0 nv0Var4 = (nv0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (nv0Var4.R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    boolean zH14 = nv0Var4.h(oa2Var) | nv0Var4.h(y31Var) | nv0Var4.f(os1Var3);
                    Object objO16 = nv0Var4.O();
                    if (zH14 || objO16 == zjVar2) {
                        n8 n8Var = new n8(oa2Var, y31Var, os1Var3, os1Var4, 6);
                        nv0Var4.j0(n8Var);
                        objO16 = n8Var;
                    }
                    gq.m((cs0) objO16, null, false, null, null, null, cl3.x, nv0Var4, 805306368, 510);
                } else {
                    nv0Var4.U();
                }
                return dm3Var;
            case 8:
                z00 z00Var = f5.C;
                z00 z00Var2 = f5.F;
                z00 z00Var3 = f5.D;
                z00 z00Var4 = f5.E;
                List list = (List) obj8;
                final ns0 ns0Var7 = (ns0) obj7;
                ns0 ns0Var8 = (ns0) obj6;
                SimpleDateFormat simpleDateFormat = (SimpleDateFormat) obj5;
                nv0 nv0Var5 = (nv0) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                tm tmVar = f5.s;
                if (!nv0Var5.R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    nv0Var5.U();
                    return dm3Var;
                }
                yp1 yp1Var2 = yp1.a;
                bq1 bq1VarO = j43.o(yp1Var2, 280.0f);
                ns0 ns0Var9 = ns0Var8;
                qy qyVarA = oy.a(new jj(4.0f, true, new c(1)), tmVar, nv0Var5, 6);
                int iHashCode2 = Long.hashCode(nv0Var5.T);
                n52 n52VarL2 = nv0Var5.l();
                bq1 bq1VarM2 = lr.M(nv0Var5, bq1VarO);
                w10.c.getClass();
                nv0Var5.d0();
                if (nv0Var5.S) {
                    nv0Var5.k(x91Var);
                } else {
                    nv0Var5.m0();
                }
                y02.F(z00Var4, nv0Var5, qyVarA);
                y02.F(z00Var3, nv0Var5, n52VarL2);
                nc2.r(iHashCode2, nv0Var5, z00Var2, nv0Var5);
                y02.F(z00Var, nv0Var5, bq1VarM2);
                mg3.b(by1.h("Dialogs (", ")", list.size()), f80.K(yp1Var2, 8.0f, 4.0f), 0L, 0L, xq0.j, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var5.j(ql3.a)).m, nv0Var5, 1572912, 0, 131004);
                nv0Var5.a0(-1670412014);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    final hb0 hb0Var = (hb0) it.next();
                    boolean zF = nv0Var5.f(hb0Var);
                    Object objO17 = nv0Var5.O();
                    Object obj13 = objO17;
                    if (zF || objO17 == zjVar2) {
                        uk2 uk2Var = tp2.a;
                        String strD = tp2.d(hb0Var.c);
                        boolean zA = hb0Var.a();
                        String str5 = hb0Var.d;
                        if (zA) {
                            String str6 = (String) qx.r0(y93.s0(str5));
                            strF0 = str6 != null ? tp2.d(str6) : "";
                        } else {
                            strF0 = y93.F0(60, tp2.d(str5));
                        }
                        String str7 = strD + ": " + strF0;
                        nv0Var5.j0(str7);
                        obj13 = str7;
                    }
                    String str8 = (String) obj13;
                    int i9 = hb0Var.b;
                    String str9 = i9 != 0 ? i9 != 1 ? i9 != 2 ? i9 != 3 ? i9 != 4 ? i9 != 5 ? "?" : "TAB+" : "TAB" : "PW" : "LIST" : "IN" : "MSG";
                    Iterator it2 = it;
                    bq1 bq1VarC = j43.c(yp1Var2, 1.0f);
                    boolean zF2 = nv0Var5.f(ns0Var7) | nv0Var5.h(hb0Var);
                    Object objO18 = nv0Var5.O();
                    if (zF2 || objO18 == zjVar2) {
                        str = str8;
                        z3 = false;
                        final boolean z5 = false ? 1 : 0;
                        cs0 cs0Var8 = new cs0() { // from class: og2
                            @Override // defpackage.cs0
                            public final Object a() {
                                int i10 = z5;
                                dm3 dm3Var2 = dm3.a;
                                hb0 hb0Var2 = hb0Var;
                                ns0 ns0Var10 = ns0Var7;
                                switch (i10) {
                                    case 0:
                                        ns0Var10.h(hb0Var2);
                                        break;
                                    default:
                                        ns0Var10.h(hb0Var2);
                                        break;
                                }
                                return dm3Var2;
                            }
                        };
                        nv0Var5.j0(cs0Var8);
                        obj4 = cs0Var8;
                    } else {
                        str = str8;
                        z3 = false;
                        obj4 = objO18;
                    }
                    ns0 ns0Var10 = ns0Var7;
                    zj zjVar3 = zjVar2;
                    bq1 bq1VarK = f80.K(rn.y(bq1VarC, z3, null, (cs0) obj4, 15), 8.0f, 6.0f);
                    um umVar = f5.q;
                    gj gjVar = n92.b;
                    dp2 dp2VarA = cp2.a(gjVar, umVar, nv0Var5, 48);
                    yp1 yp1Var3 = yp1Var2;
                    int iHashCode3 = Long.hashCode(nv0Var5.T);
                    n52 n52VarL3 = nv0Var5.l();
                    bq1 bq1VarM3 = lr.M(nv0Var5, bq1VarK);
                    w10.c.getClass();
                    nv0Var5.d0();
                    if (nv0Var5.S) {
                        nv0Var5.k(x91Var);
                    } else {
                        nv0Var5.m0();
                    }
                    y02.F(z00Var4, nv0Var5, dp2VarA);
                    y02.F(z00Var3, nv0Var5, n52VarL3);
                    nc2.r(iHashCode3, nv0Var5, z00Var2, nv0Var5);
                    y02.F(z00Var, nv0Var5, bq1VarM3);
                    jc1 jc1Var = new jc1(1.0f, true);
                    qy qyVarA2 = oy.a(n92.d, tmVar, nv0Var5, 0);
                    int iHashCode4 = Long.hashCode(nv0Var5.T);
                    n52 n52VarL4 = nv0Var5.l();
                    bq1 bq1VarM4 = lr.M(nv0Var5, jc1Var);
                    nv0Var5.d0();
                    if (nv0Var5.S) {
                        nv0Var5.k(x91Var);
                    } else {
                        nv0Var5.m0();
                    }
                    y02.F(z00Var4, nv0Var5, qyVarA2);
                    y02.F(z00Var3, nv0Var5, n52VarL4);
                    nc2.r(iHashCode4, nv0Var5, z00Var2, nv0Var5);
                    y02.F(z00Var, nv0Var5, bq1VarM4);
                    dp2 dp2VarA2 = cp2.a(gjVar, umVar, nv0Var5, 48);
                    int iHashCode5 = Long.hashCode(nv0Var5.T);
                    n52 n52VarL5 = nv0Var5.l();
                    yp1Var2 = yp1Var3;
                    bq1 bq1VarM5 = lr.M(nv0Var5, yp1Var2);
                    nv0Var5.d0();
                    if (nv0Var5.S) {
                        nv0Var5.k(x91Var);
                    } else {
                        nv0Var5.m0();
                    }
                    y02.F(z00Var4, nv0Var5, dp2VarA2);
                    y02.F(z00Var3, nv0Var5, n52VarL5);
                    nc2.r(iHashCode5, nv0Var5, z00Var2, nv0Var5);
                    y02.F(z00Var, nv0Var5, bq1VarM5);
                    r93 r93Var = ql3.a;
                    gh3 gh3Var = ((ol3) nv0Var5.j(r93Var)).o;
                    r93 r93Var2 = hy.a;
                    mg3.b("[" + str9 + "]", null, ((fy) nv0Var5.j(r93Var2)).a, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, gh3Var, nv0Var5, 0, 0, 131066);
                    oz2.g(nv0Var5, j43.o(yp1Var2, 6.0f));
                    String str10 = simpleDateFormat.format(new Date(hb0Var.g));
                    str10.getClass();
                    mg3.b(str10, null, ((fy) nv0Var5.j(r93Var2)).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var5.j(r93Var)).o, nv0Var5, 0, 0, 131066);
                    nv0Var5.p(true);
                    oz2.g(nv0Var5, j43.e(yp1Var2, 2.0f));
                    mg3.b(str, null, 0L, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, ((ol3) nv0Var5.j(r93Var)).l, nv0Var5, 0, 24960, 110590);
                    final int i10 = 1;
                    nv0Var5.p(true);
                    final ns0 ns0Var11 = ns0Var9;
                    boolean zF3 = nv0Var5.f(ns0Var11) | nv0Var5.h(hb0Var);
                    Object objO19 = nv0Var5.O();
                    if (zF3) {
                        zjVar = zjVar3;
                    } else {
                        zjVar = zjVar3;
                        if (objO19 == zjVar) {
                        }
                        gv3.f((cs0) objO19, f80.N(yp1Var2, 4.0f, 0.0f, 0.0f, 0.0f, 14), false, null, null, f80.u, nv0Var5, 1572912, 60);
                        nv0Var5.p(true);
                        gq.g(null, 0.0f, 0L, nv0Var5, 0, 7);
                        zjVar2 = zjVar;
                        ns0Var9 = ns0Var11;
                        ns0Var7 = ns0Var10;
                        it = it2;
                    }
                    objO19 = new cs0() { // from class: og2
                        @Override // defpackage.cs0
                        public final Object a() {
                            int i102 = i10;
                            dm3 dm3Var2 = dm3.a;
                            hb0 hb0Var2 = hb0Var;
                            ns0 ns0Var102 = ns0Var11;
                            switch (i102) {
                                case 0:
                                    ns0Var102.h(hb0Var2);
                                    break;
                                default:
                                    ns0Var102.h(hb0Var2);
                                    break;
                            }
                            return dm3Var2;
                        }
                    };
                    nv0Var5.j0(objO19);
                    gv3.f((cs0) objO19, f80.N(yp1Var2, 4.0f, 0.0f, 0.0f, 0.0f, 14), false, null, null, f80.u, nv0Var5, 1572912, 60);
                    nv0Var5.p(true);
                    gq.g(null, 0.0f, 0L, nv0Var5, 0, 7);
                    zjVar2 = zjVar;
                    ns0Var9 = ns0Var11;
                    ns0Var7 = ns0Var10;
                    it = it2;
                }
                nv0Var5.p(false);
                oz2.g(nv0Var5, j43.e(yp1Var2, 8.0f));
                nv0Var5.p(true);
                return dm3Var;
            case vr.g /* 9 */:
                ((Integer) obj2).getClass();
                n32.a((hb0) obj8, (ts0) obj7, (cs0) obj6, (cs0) obj5, (nv0) obj, jo3.y(1));
                return dm3Var;
            case vr.h /* 10 */:
                ((Integer) obj2).getClass();
                vm1.h(jo3.y(49), (cs0) obj7, (cs0) obj5, (ns0) obj6, (nv0) obj, (String) obj8);
                return dm3Var;
            case 11:
                g4 g4Var = (g4) obj8;
                ns0 ns0Var12 = (ns0) obj7;
                ns0 ns0Var13 = (ns0) obj6;
                String str11 = (String) obj5;
                nv0 nv0Var6 = (nv0) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (nv0Var6.R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    qy qyVarA3 = oy.a(new jj(12.0f, true, new c(1)), f5.s, nv0Var6, 6);
                    int iHashCode6 = Long.hashCode(nv0Var6.T);
                    n52 n52VarL6 = nv0Var6.l();
                    bq1 bq1VarM6 = lr.M(nv0Var6, yp1Var);
                    w10.c.getClass();
                    nv0Var6.d0();
                    if (nv0Var6.S) {
                        nv0Var6.k(x91Var);
                    } else {
                        nv0Var6.m0();
                    }
                    y02.F(f5.E, nv0Var6, qyVarA3);
                    y02.F(f5.D, nv0Var6, n52VarL6);
                    y02.F(f5.F, nv0Var6, Integer.valueOf(iHashCode6));
                    y02.C(nv0Var6);
                    y02.F(f5.C, nv0Var6, bq1VarM6);
                    String str12 = g4Var.b;
                    h4 h4Var = g4Var.d;
                    g12.m(str12, ns0Var12, j43.c(yp1Var, 1.0f), false, false, null, rn.b0, rn.c0, null, null, null, h4Var == h4.f || h4Var == h4.g, null, null, null, true, 0, 0, null, null, nv0Var6, 14156160, 12582912, 8249144);
                    g12.m(g4Var.c, ns0Var13, j43.c(yp1Var, 1.0f), false, false, null, rn.d0, rn.e0, null, null, null, h4Var == h4.h, null, null, null, true, 0, 0, null, null, nv0Var6, 14156160, 12582912, 8249144);
                    if (str11 == null) {
                        strF = by1.f(nv0Var6, 1664783792, R.string.launcher_add_server_default_port_help, nv0Var6, false);
                    } else {
                        nv0Var6.a0(1664783389);
                        nv0Var6.p(false);
                        strF = str11;
                    }
                    gh3 gh3Var2 = ((ol3) nv0Var6.j(ql3.a)).l;
                    if (str11 == null) {
                        nv0Var6.a0(68868438);
                        j = ((fy) nv0Var6.j(hy.a)).s;
                        nv0Var6.p(false);
                    } else {
                        nv0Var6.a0(68963329);
                        j = ((fy) nv0Var6.j(hy.a)).w;
                        nv0Var6.p(false);
                    }
                    mg3.b(strF, null, j, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, gh3Var2, nv0Var6, 0, 0, 131066);
                    nv0Var6.p(true);
                } else {
                    nv0Var6.U();
                }
                return dm3Var;
            case vr.i /* 12 */:
                final v71 v71Var = (v71) obj8;
                final ns0 ns0Var14 = (ns0) obj7;
                ns0 ns0Var15 = (ns0) obj6;
                final ns0 ns0Var16 = (ns0) obj5;
                nv0 nv0Var7 = (nv0) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (nv0Var7.R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    qy qyVarA4 = oy.a(new jj(12.0f, true, new c(1)), f5.s, nv0Var7, 6);
                    int iHashCode7 = Long.hashCode(nv0Var7.T);
                    n52 n52VarL7 = nv0Var7.l();
                    bq1 bq1VarM7 = lr.M(nv0Var7, yp1Var);
                    w10.c.getClass();
                    nv0Var7.d0();
                    if (nv0Var7.S) {
                        nv0Var7.k(x91Var);
                    } else {
                        nv0Var7.m0();
                    }
                    y02.F(f5.E, nv0Var7, qyVarA4);
                    y02.F(f5.D, nv0Var7, n52VarL7);
                    y02.F(f5.F, nv0Var7, Integer.valueOf(iHashCode7));
                    y02.C(nv0Var7);
                    y02.F(f5.C, nv0Var7, bq1VarM7);
                    g12.m(v71Var.c, ns0Var14, j43.c(yp1Var, 1.0f), false, false, null, rn.T, null, null, null, null, false, null, null, null, true, 0, 0, null, null, nv0Var7, 1573248, 12582912, 8257464);
                    if (v71Var.d.isEmpty()) {
                        nv0Var7.a0(-936881551);
                        nv0Var7.p(false);
                    } else {
                        nv0Var7.a0(-937608067);
                        mg3.b(oz2.M(R.string.launcher_recent_nicknames, nv0Var7), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var7.j(ql3.a)).m, nv0Var7, 0, 0, 131070);
                        final int i11 = 0;
                        gq.f(null, new jj(8.0f, true, new c(1)), new jj(8.0f, true, new c(1)), null, 0, 0, gq.N(2143981041, new ss0() { // from class: yy2
                            @Override // defpackage.ss0
                            public final Object e(Object obj14, Object obj15, Object obj16) {
                                int i12;
                                int i13;
                                int i14 = i11;
                                dm3 dm3Var2 = dm3.a;
                                zj zjVar4 = c20.a;
                                ns0 ns0Var17 = ns0Var14;
                                v71 v71Var2 = v71Var;
                                switch (i14) {
                                    case 0:
                                        nv0 nv0Var8 = (nv0) obj15;
                                        int iIntValue8 = ((Integer) obj16).intValue();
                                        ((oo0) obj14).getClass();
                                        if (nv0Var8.R(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                                            for (String str13 : v71Var2.d) {
                                                boolean zF4 = nv0Var8.f(ns0Var17) | nv0Var8.f(str13);
                                                Object objO20 = nv0Var8.O();
                                                if (zF4 || objO20 == zjVar4) {
                                                    objO20 = new an2(1, ns0Var17, str13);
                                                    nv0Var8.j0(objO20);
                                                }
                                                nv0 nv0Var9 = nv0Var8;
                                                gu.b((cs0) objO20, gq.N(-189203836, new z71(str13, 11, (byte) 0), nv0Var8), null, false, null, null, null, null, null, nv0Var9, 48, 2044);
                                                nv0Var8 = nv0Var9;
                                            }
                                        } else {
                                            nv0Var8.U();
                                        }
                                        return dm3Var2;
                                    default:
                                        nv0 nv0Var10 = (nv0) obj15;
                                        int iIntValue9 = ((Integer) obj16).intValue();
                                        ((oo0) obj14).getClass();
                                        if (nv0Var10.R(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                                            for (xy2 xy2Var : xy2.l) {
                                                int iOrdinal2 = xy2Var.ordinal();
                                                if (iOrdinal2 == 0) {
                                                    i12 = 1072131961;
                                                    i13 = R.string.launcher_encoding_utf8;
                                                } else if (iOrdinal2 == 1) {
                                                    i12 = 1072135224;
                                                    i13 = R.string.launcher_encoding_gbk;
                                                } else {
                                                    if (iOrdinal2 != 2) {
                                                        throw by1.d(nv0Var10, 1072129942, false);
                                                    }
                                                    i12 = 1072138720;
                                                    i13 = R.string.launcher_encoding_windows1251;
                                                }
                                                String strF2 = by1.f(nv0Var10, i12, i13, nv0Var10, false);
                                                boolean z6 = v71Var2.g == xy2Var;
                                                boolean zF5 = nv0Var10.f(ns0Var17) | nv0Var10.d(xy2Var.ordinal());
                                                Object objO21 = nv0Var10.O();
                                                if (zF5 || objO21 == zjVar4) {
                                                    objO21 = new me1(14, ns0Var17, xy2Var);
                                                    nv0Var10.j0(objO21);
                                                }
                                                nv0 nv0Var11 = nv0Var10;
                                                gu.e(z6, (cs0) objO21, gq.N(825905181, new z71(strF2, 12, (byte) 0), nv0Var10), null, false, null, null, null, null, nv0Var11, 384);
                                                nv0Var10 = nv0Var11;
                                            }
                                        } else {
                                            nv0Var10.U();
                                        }
                                        return dm3Var2;
                                }
                            }
                        }, nv0Var7), nv0Var7, 1573296, 57);
                        nv0Var7.p(false);
                    }
                    if (v71Var.f) {
                        nv0Var7.a0(-936810127);
                        g12.m(v71Var.e, ns0Var15, j43.c(yp1Var, 1.0f), false, false, null, rn.U, null, null, null, null, false, new j42(), new o71(7, 0, 123), null, true, 0, 0, null, null, nv0Var7, 1573248, 12779520, 8208312);
                        mg3.b(oz2.M(R.string.launcher_password_locked_hint, nv0Var7), null, ((fy) nv0Var7.j(hy.a)).w, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var7.j(ql3.a)).l, nv0Var7, 0, 0, 131066);
                        nv0Var7.p(false);
                    } else {
                        nv0Var7.a0(-936010575);
                        nv0Var7.p(false);
                    }
                    String strM4 = oz2.M(R.string.launcher_label_server_encoding, nv0Var7);
                    r93 r93Var3 = ql3.a;
                    mg3.b(strM4, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var7.j(r93Var3)).m, nv0Var7, 0, 0, 131070);
                    gq.f(null, new jj(8.0f, true, new c(1)), new jj(8.0f, true, new c(1)), null, 0, 0, gq.N(1291604716, new ss0() { // from class: yy2
                        @Override // defpackage.ss0
                        public final Object e(Object obj14, Object obj15, Object obj16) {
                            int i12;
                            int i13;
                            int i14 = i2;
                            dm3 dm3Var2 = dm3.a;
                            zj zjVar4 = c20.a;
                            ns0 ns0Var17 = ns0Var16;
                            v71 v71Var2 = v71Var;
                            switch (i14) {
                                case 0:
                                    nv0 nv0Var8 = (nv0) obj15;
                                    int iIntValue8 = ((Integer) obj16).intValue();
                                    ((oo0) obj14).getClass();
                                    if (nv0Var8.R(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                                        for (String str13 : v71Var2.d) {
                                            boolean zF4 = nv0Var8.f(ns0Var17) | nv0Var8.f(str13);
                                            Object objO20 = nv0Var8.O();
                                            if (zF4 || objO20 == zjVar4) {
                                                objO20 = new an2(1, ns0Var17, str13);
                                                nv0Var8.j0(objO20);
                                            }
                                            nv0 nv0Var9 = nv0Var8;
                                            gu.b((cs0) objO20, gq.N(-189203836, new z71(str13, 11, (byte) 0), nv0Var8), null, false, null, null, null, null, null, nv0Var9, 48, 2044);
                                            nv0Var8 = nv0Var9;
                                        }
                                    } else {
                                        nv0Var8.U();
                                    }
                                    return dm3Var2;
                                default:
                                    nv0 nv0Var10 = (nv0) obj15;
                                    int iIntValue9 = ((Integer) obj16).intValue();
                                    ((oo0) obj14).getClass();
                                    if (nv0Var10.R(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                                        for (xy2 xy2Var : xy2.l) {
                                            int iOrdinal2 = xy2Var.ordinal();
                                            if (iOrdinal2 == 0) {
                                                i12 = 1072131961;
                                                i13 = R.string.launcher_encoding_utf8;
                                            } else if (iOrdinal2 == 1) {
                                                i12 = 1072135224;
                                                i13 = R.string.launcher_encoding_gbk;
                                            } else {
                                                if (iOrdinal2 != 2) {
                                                    throw by1.d(nv0Var10, 1072129942, false);
                                                }
                                                i12 = 1072138720;
                                                i13 = R.string.launcher_encoding_windows1251;
                                            }
                                            String strF2 = by1.f(nv0Var10, i12, i13, nv0Var10, false);
                                            boolean z6 = v71Var2.g == xy2Var;
                                            boolean zF5 = nv0Var10.f(ns0Var17) | nv0Var10.d(xy2Var.ordinal());
                                            Object objO21 = nv0Var10.O();
                                            if (zF5 || objO21 == zjVar4) {
                                                objO21 = new me1(14, ns0Var17, xy2Var);
                                                nv0Var10.j0(objO21);
                                            }
                                            nv0 nv0Var11 = nv0Var10;
                                            gu.e(z6, (cs0) objO21, gq.N(825905181, new z71(strF2, 12, (byte) 0), nv0Var10), null, false, null, null, null, null, nv0Var11, 384);
                                            nv0Var10 = nv0Var11;
                                        }
                                    } else {
                                        nv0Var10.U();
                                    }
                                    return dm3Var2;
                            }
                        }
                    }, nv0Var7), nv0Var7, 1573296, 57);
                    mg3.b(oz2.M(R.string.launcher_encoding_persist_hint, nv0Var7), null, ((fy) nv0Var7.j(hy.a)).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var7.j(r93Var3)).l, nv0Var7, 0, 0, 131066);
                    nv0Var7.p(true);
                } else {
                    nv0Var7.U();
                }
                return dm3Var;
            case 13:
                return d(obj, obj2);
            default:
                ((Integer) obj2).getClass();
                p03.c((cf2) obj8, (cs0) obj7, (cs0) obj6, (cs0) obj5, (nv0) obj, jo3.y(1));
                return dm3Var;
        }
    }

    public /* synthetic */ ul(cs0 cs0Var, bq1 bq1Var, nd1 nd1Var, cd1 cd1Var, int i) {
        this.f = 5;
        this.h = cs0Var;
        this.g = bq1Var;
        this.i = nd1Var;
        this.j = cd1Var;
    }

    public /* synthetic */ ul(oa2 oa2Var, y31 y31Var, os1 os1Var, os1 os1Var2) {
        this.f = 7;
        this.g = oa2Var;
        this.i = y31Var;
        this.h = os1Var;
        this.j = os1Var2;
    }

    public /* synthetic */ ul(Object obj, Object obj2, Object obj3, zs0 zs0Var, int i, int i2) {
        this.f = i2;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
        this.j = zs0Var;
    }

    public /* synthetic */ ul(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
        this.j = obj4;
    }
}
