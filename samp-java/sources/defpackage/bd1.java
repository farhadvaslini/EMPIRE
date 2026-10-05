package defpackage;

import android.os.Build;
import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class bd1 implements ss0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ bd1(rs0 rs0Var, k40 k40Var, ss0 ss0Var, cs0 cs0Var) {
        this.f = 1;
        this.g = rs0Var;
        this.h = k40Var;
        this.i = ss0Var;
        this.j = cs0Var;
    }

    @Override // defpackage.ss0
    public final Object e(Object obj, Object obj2, Object obj3) {
        ra3 ra3Var;
        bq1 bq1VarD;
        Object obj4;
        boolean z;
        String str;
        sv2 sv2Var;
        boolean z2;
        bq1 bq1Var;
        int i = this.f;
        yp1 yp1Var = yp1.a;
        zj zjVar = c20.a;
        dm3 dm3Var = dm3.a;
        Object obj5 = this.j;
        Object obj6 = this.i;
        Object obj7 = this.h;
        Object obj8 = this.g;
        switch (i) {
            case 0:
                nd1 nd1Var = (nd1) obj8;
                bq1 bq1Var2 = (bq1) obj7;
                cd1 cd1Var = (cd1) obj6;
                os1 os1Var = (os1) obj5;
                dq2 dq2Var = (dq2) obj;
                nv0 nv0Var = (nv0) obj2;
                ((Integer) obj3).getClass();
                Object objO = nv0Var.O();
                Object obj9 = objO;
                if (objO == zjVar) {
                    zc1 zc1Var = new zc1(dq2Var, new yb(os1Var, 16));
                    nv0Var.j0(zc1Var);
                    obj9 = zc1Var;
                }
                zc1 zc1Var2 = (zc1) obj9;
                Object objO2 = nv0Var.O();
                Object obj10 = objO2;
                if (objO2 == zjVar) {
                    ra3 ra3Var2 = new ra3(new a31(zc1Var2));
                    nv0Var.j0(ra3Var2);
                    obj10 = ra3Var2;
                }
                ra3 ra3Var3 = (ra3) obj10;
                if (nd1Var != null) {
                    nv0Var.a0(1743490539);
                    nv0Var.a0(887527095);
                    String str2 = Build.FINGERPRINT;
                    if (str2 == null || !str2.equals("robolectric")) {
                        nv0Var.a0(1345729441);
                        View view = (View) nv0Var.j(x7.f);
                        boolean zF = nv0Var.f(view);
                        Object objO3 = nv0Var.O();
                        if (zF || objO3 == zjVar) {
                            Object tag = view.getTag(2131230799);
                            sc2 abVar = tag instanceof sc2 ? (sc2) tag : null;
                            if (abVar == null) {
                                abVar = new ab(view);
                                view.setTag(2131230799, abVar);
                            }
                            objO3 = abVar;
                            nv0Var.j0(objO3);
                        }
                        obj4 = (sc2) objO3;
                        z = false;
                        nv0Var.p(false);
                    } else {
                        nv0Var.a0(1345548711);
                        Object objO4 = nv0Var.O();
                        if (objO4 == zjVar) {
                            objO4 = new tc2();
                            nv0Var.j0(objO4);
                        }
                        obj4 = (tc2) objO4;
                        z = false;
                        nv0Var.p(false);
                    }
                    nv0Var.p(z);
                    Object[] objArr = {nd1Var, zc1Var2, ra3Var3, obj4};
                    boolean zF2 = nv0Var.f(nd1Var) | nv0Var.h(zc1Var2) | nv0Var.h(ra3Var3) | nv0Var.h(obj4);
                    Object objO5 = nv0Var.O();
                    if (zF2 || objO5 == zjVar) {
                        Object obj11 = obj4;
                        ra3Var = ra3Var3;
                        bd bdVar = new bd(nd1Var, zc1Var2, ra3Var, obj11, 4);
                        nv0Var.j0(bdVar);
                        objO5 = bdVar;
                    } else {
                        ra3Var = ra3Var3;
                    }
                    rn.i(objArr, (ns0) objO5, nv0Var);
                    nv0Var.p(false);
                } else {
                    ra3Var = ra3Var3;
                    nv0Var.a0(1744076749);
                    nv0Var.p(false);
                }
                int i2 = od1.a;
                if (nd1Var != null && (bq1VarD = bq1Var2.d(new ok3(nd1Var))) != null) {
                    bq1Var2 = bq1VarD;
                }
                boolean zF3 = nv0Var.f(zc1Var2) | nv0Var.f(cd1Var);
                Object objO6 = nv0Var.O();
                Object obj12 = objO6;
                if (zF3 || objO6 == zjVar) {
                    y7 y7Var = new y7(24, zc1Var2, cd1Var);
                    nv0Var.j0(y7Var);
                    obj12 = y7Var;
                }
                n92.c(ra3Var, bq1Var2, (rs0) obj12, nv0Var, 8);
                return dm3Var;
            case 1:
                rs0 rs0Var = (rs0) obj8;
                k40 k40Var = (k40) obj7;
                ss0 ss0Var = (ss0) obj6;
                cs0 cs0Var = (cs0) obj5;
                j40 j40Var = (j40) obj;
                nv0 nv0Var2 = (nv0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= nv0Var2.f(j40Var) ? 4 : 2;
                }
                if (nv0Var2.R(iIntValue & 1, (iIntValue & 19) != 18)) {
                    String str3 = (String) rs0Var.f(nv0Var2, 0);
                    if (y93.q0(str3)) {
                        p21.c("Label must not be blank");
                    }
                    k40Var.getClass();
                    n92.k.b(str3, Boolean.TRUE, j40Var, ss0Var, cs0Var, nv0Var2, Integer.valueOf((iIntValue << 9) & 7168));
                } else {
                    nv0Var2.U();
                }
                return dm3Var;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                kq2 kq2Var = (kq2) obj8;
                os1 os1Var2 = (os1) obj5;
                List list = (List) obj7;
                ns0 ns0Var = (ns0) obj6;
                ok0 ok0Var = (ok0) obj;
                nv0 nv0Var3 = (nv0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ok0Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= (iIntValue2 & 8) == 0 ? nv0Var3.f(ok0Var) : nv0Var3.h(ok0Var) ? 4 : 2;
                }
                if (nv0Var3.R(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    if (kq2Var == null || (sv2Var = kq2Var.a) == null || (str = sv2Var.c) == null) {
                        str = "";
                    }
                    String str4 = str;
                    bq1 bq1VarB = ok0Var.b(j43.c(yp1Var, 1.0f), true);
                    Object objO7 = nv0Var3.O();
                    if (objO7 == zjVar) {
                        objO7 = new n20(10);
                        nv0Var3.j0(objO7);
                    }
                    g12.m(str4, (ns0) objO7, bq1VarB, false, true, null, gv3.j, gv3.k, null, gq.N(2108084926, new l8(os1Var2, 3), nv0Var3), null, false, null, null, null, false, 0, 0, null, null, nv0Var3, 819486768, 0, 8387880);
                    boolean zBooleanValue = ((Boolean) os1Var2.getValue()).booleanValue();
                    Object objO8 = nv0Var3.O();
                    if (objO8 == zjVar) {
                        objO8 = new yb(os1Var2, 7);
                        nv0Var3.j0(objO8);
                    }
                    u9.a(zBooleanValue, (cs0) objO8, null, 0L, null, null, null, 0L, 0.0f, gq.N(604048876, new my0(list, ns0Var, os1Var2, 0), nv0Var3), nv0Var3, 48);
                } else {
                    nv0Var3.U();
                }
                return dm3Var;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                int i3 = 1;
                bm2 bm2Var = (bm2) obj8;
                os1 os1Var3 = (os1) obj5;
                List list2 = (List) obj7;
                a42 a42Var = (a42) obj6;
                ok0 ok0Var2 = (ok0) obj;
                nv0 nv0Var4 = (nv0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ok0Var2.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= (iIntValue3 & 8) == 0 ? nv0Var4.f(ok0Var2) : nv0Var4.h(ok0Var2) ? 4 : 2;
                }
                if (nv0Var4.R(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    String str5 = bm2Var.a;
                    bq1 bq1VarB2 = ok0Var2.b(j43.c(yp1Var, 1.0f), true);
                    Object objO9 = nv0Var4.O();
                    if (objO9 == zjVar) {
                        objO9 = new rh2(i3);
                        nv0Var4.j0(objO9);
                    }
                    g12.m(str5, (ns0) objO9, bq1VarB2, false, true, null, w7.m, null, null, gq.N(-423221068, new l8(os1Var3, 13), nv0Var4), null, false, null, null, null, false, 0, 0, null, null, nv0Var4, 806903856, 0, 8388008);
                    boolean zBooleanValue2 = ((Boolean) os1Var3.getValue()).booleanValue();
                    Object objO10 = nv0Var4.O();
                    if (objO10 == zjVar) {
                        objO10 = new mh2(os1Var3, 18);
                        nv0Var4.j0(objO10);
                    }
                    u9.a(zBooleanValue2, (cs0) objO10, null, 0L, null, null, null, 0L, 0.0f, gq.N(-1066326046, new my0(list2, a42Var, os1Var3, 5), nv0Var4), nv0Var4, 48);
                } else {
                    nv0Var4.U();
                }
                return dm3Var;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                p03.l((d92) obj8, (ot0) obj7, (String) obj6, (e92) obj5, (he) obj, (nv0) obj2, ((Integer) obj3).intValue());
                return dm3Var;
            default:
                w73 w73Var = (w73) obj8;
                ye1 ye1Var = (ye1) obj7;
                bg3 bg3Var = (bg3) obj6;
                long j = bg3Var.b;
                iy1 iy1Var = (iy1) obj5;
                bq1 bq1Var3 = (bq1) obj;
                nv0 nv0Var5 = (nv0) obj2;
                ((Integer) obj3).getClass();
                nv0Var5.a0(-84507373);
                boolean zBooleanValue3 = ((Boolean) nv0Var5.j(s20.y)).booleanValue();
                boolean zG = nv0Var5.g(zBooleanValue3);
                Object objO11 = nv0Var5.O();
                if (zG || objO11 == zjVar) {
                    objO11 = new n60(zBooleanValue3);
                    nv0Var5.j0(objO11);
                }
                n60 n60Var = (n60) objO11;
                boolean z3 = w73Var.a != 16;
                if (((re1) ((hs3) nv0Var5.j(s20.u))).a() && ye1Var.b() && yg3.c(j) && z3) {
                    nv0Var5.a0(-707487962);
                    af afVar = bg3Var.a;
                    yg3 yg3Var = new yg3(j);
                    boolean zH = nv0Var5.h(n60Var);
                    Object objO12 = nv0Var5.O();
                    if (zH || objO12 == zjVar) {
                        objO12 = new l80(n60Var, false ? 1 : 0, 14);
                        nv0Var5.j0(objO12);
                    }
                    rn.m(afVar, yg3Var, (rs0) objO12, nv0Var5);
                    boolean zH2 = nv0Var5.h(n60Var) | nv0Var5.h(iy1Var) | nv0Var5.f(bg3Var) | nv0Var5.h(ye1Var) | nv0Var5.f(w73Var);
                    Object objO13 = nv0Var5.O();
                    if (zH2 || objO13 == zjVar) {
                        a4 a4Var = new a4(n60Var, iy1Var, bg3Var, ye1Var, w73Var, 6);
                        nv0Var5.j0(a4Var);
                        objO13 = a4Var;
                    }
                    bq1 bq1VarM = w7.M(bq1Var3, (ns0) objO13);
                    z2 = false;
                    nv0Var5.p(false);
                    bq1Var = bq1VarM;
                } else {
                    z2 = false;
                    nv0Var5.a0(-705473241);
                    nv0Var5.p(false);
                    bq1Var = yp1Var;
                }
                nv0Var5.p(z2);
                return bq1Var;
        }
    }

    public /* synthetic */ bd1(Object obj, os1 os1Var, List list, Object obj2, int i) {
        this.f = i;
        this.g = obj;
        this.j = os1Var;
        this.h = list;
        this.i = obj2;
    }

    public /* synthetic */ bd1(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
        this.j = obj4;
    }
}
