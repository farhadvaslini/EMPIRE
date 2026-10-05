package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ug2 implements ts0 {
    public final /* synthetic */ List f;
    public final /* synthetic */ ns0 g;
    public final /* synthetic */ ns0 h;
    public final /* synthetic */ SimpleDateFormat i;

    public ug2(List list, ns0 ns0Var, ns0 ns0Var2, SimpleDateFormat simpleDateFormat) {
        this.f = list;
        this.g = ns0Var;
        this.h = ns0Var2;
        this.i = simpleDateFormat;
    }

    @Override // defpackage.ts0
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        String strF0;
        hb0 hb0Var;
        String str;
        boolean z;
        String str2;
        nc1 nc1Var = (nc1) obj;
        int iIntValue = ((Number) obj2).intValue();
        nv0 nv0Var = (nv0) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (nv0Var.f(nc1Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= nv0Var.d(iIntValue) ? 32 : 16;
        }
        if (nv0Var.R(i & 1, (i & 147) != 146)) {
            hb0 hb0Var2 = (hb0) this.f.get(iIntValue);
            nv0Var.a0(-1863047399);
            int i2 = hb0Var2.b;
            String str3 = hb0Var2.f;
            String str4 = hb0Var2.e;
            String strF = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? by1.f(nv0Var, 1325391809, R.string.raksamp_dialog_style_unknown, nv0Var, false) : by1.f(nv0Var, 1325389065, R.string.raksamp_dialog_style_tablist_headers, nv0Var, false) : by1.f(nv0Var, 1325385665, R.string.raksamp_dialog_style_tablist, nv0Var, false) : by1.f(nv0Var, 1325379554, R.string.raksamp_dialog_style_password, nv0Var, false) : by1.f(nv0Var, 1325382622, R.string.raksamp_dialog_style_list, nv0Var, false) : by1.f(nv0Var, 1325376447, R.string.raksamp_dialog_style_input, nv0Var, false) : by1.f(nv0Var, 1325373408, R.string.raksamp_dialog_style_msgbox, nv0Var, false);
            uk2 uk2Var = tp2.a;
            String strD = tp2.d(hb0Var2.c);
            boolean zA = hb0Var2.a();
            String str5 = hb0Var2.d;
            if (zA) {
                String str6 = (String) qx.r0(y93.s0(str5));
                strF0 = str6 != null ? tp2.d(str6) : "";
            } else {
                strF0 = y93.F0(100, tp2.d(str5));
            }
            String str7 = strF0;
            yp1 yp1Var = yp1.a;
            bq1 bq1VarC = j43.c(yp1Var, 1.0f);
            ns0 ns0Var = this.g;
            boolean zF = nv0Var.f(ns0Var) | nv0Var.h(hb0Var2);
            Object objO = nv0Var.O();
            zj zjVar = c20.a;
            if (zF || objO == zjVar) {
                objO = new tg2(ns0Var, hb0Var2, 0);
                nv0Var.j0(objO);
            }
            bq1 bq1VarK = f80.K(rn.y(bq1VarC, false, null, (cs0) objO, 15), 8.0f, 6.0f);
            um umVar = f5.p;
            gj gjVar = n92.b;
            dp2 dp2VarA = cp2.a(gjVar, umVar, nv0Var, 48);
            int iHashCode = Long.hashCode(nv0Var.T);
            n52 n52VarL = nv0Var.l();
            bq1 bq1VarM = lr.M(nv0Var, bq1VarK);
            w10.c.getClass();
            nv0Var.d0();
            boolean z2 = nv0Var.S;
            x91 x91Var = tb1.Y;
            if (z2) {
                nv0Var.k(x91Var);
            } else {
                nv0Var.m0();
            }
            z00 z00Var = f5.E;
            y02.F(z00Var, nv0Var, dp2VarA);
            z00 z00Var2 = f5.D;
            y02.F(z00Var2, nv0Var, n52VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z00 z00Var3 = f5.F;
            y02.F(z00Var3, nv0Var, numValueOf);
            y02.C(nv0Var);
            z00 z00Var4 = f5.C;
            y02.F(z00Var4, nv0Var, bq1VarM);
            jc1 jc1Var = new jc1(1.0f, true);
            String str8 = strF;
            qy qyVarA = oy.a(n92.d, f5.s, nv0Var, 0);
            int iHashCode2 = Long.hashCode(nv0Var.T);
            n52 n52VarL2 = nv0Var.l();
            bq1 bq1VarM2 = lr.M(nv0Var, jc1Var);
            nv0Var.d0();
            if (nv0Var.S) {
                nv0Var.k(x91Var);
            } else {
                nv0Var.m0();
            }
            y02.F(z00Var, nv0Var, qyVarA);
            y02.F(z00Var2, nv0Var, n52VarL2);
            nc2.r(iHashCode2, nv0Var, z00Var3, nv0Var);
            y02.F(z00Var4, nv0Var, bq1VarM2);
            dp2 dp2VarA2 = cp2.a(gjVar, f5.q, nv0Var, 48);
            int iHashCode3 = Long.hashCode(nv0Var.T);
            n52 n52VarL3 = nv0Var.l();
            bq1 bq1VarM3 = lr.M(nv0Var, yp1Var);
            nv0Var.d0();
            if (nv0Var.S) {
                nv0Var.k(x91Var);
            } else {
                nv0Var.m0();
            }
            y02.F(z00Var, nv0Var, dp2VarA2);
            y02.F(z00Var2, nv0Var, n52VarL3);
            nc2.r(iHashCode3, nv0Var, z00Var3, nv0Var);
            y02.F(z00Var4, nv0Var, bq1VarM3);
            String strH = by1.h("[#", "]", hb0Var2.a);
            gh3 gh3Var = gq.H(nv0Var).n;
            xq0 xq0Var = xq0.j;
            mg3.b(strH, null, gq.B(nv0Var).a, 0L, xq0Var, null, 0L, null, 0L, 0, false, 0, 0, gh3Var, nv0Var, 1572864, 0, 131002);
            oz2.g(nv0Var, j43.o(yp1Var, 8.0f));
            mg3.b(str8, null, gq.B(nv0Var).A, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, gq.H(nv0Var).o, nv0Var, 0, 0, 131066);
            oz2.g(nv0Var, j43.o(yp1Var, 8.0f));
            String str9 = this.i.format(new Date(hb0Var2.g));
            str9.getClass();
            mg3.b(str9, null, gq.B(nv0Var).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, gq.H(nv0Var).o, nv0Var, 0, 0, 131066);
            nv0Var.p(true);
            oz2.g(nv0Var, j43.e(yp1Var, 4.0f));
            mg3.b(strD, null, 0L, 0L, xq0Var, null, 0L, null, 0L, 0, false, 0, 0, gq.H(nv0Var).i, nv0Var, 1572864, 0, 131006);
            oz2.g(nv0Var, j43.e(yp1Var, 2.0f));
            mg3.b(str7, null, gq.B(nv0Var).s, 0L, null, null, 0L, null, 0L, 2, false, 2, 0, gq.H(nv0Var).l, nv0Var, 0, 24960, 110586);
            nv0 nv0Var2 = nv0Var;
            dp2 dp2VarA3 = cp2.a(gjVar, umVar, nv0Var2, 0);
            int iHashCode4 = Long.hashCode(nv0Var2.T);
            n52 n52VarL4 = nv0Var2.l();
            bq1 bq1VarM4 = lr.M(nv0Var2, yp1Var);
            nv0Var2.d0();
            if (nv0Var2.S) {
                nv0Var2.k(x91Var);
            } else {
                nv0Var2.m0();
            }
            y02.F(z00Var, nv0Var2, dp2VarA3);
            y02.F(z00Var2, nv0Var2, n52VarL4);
            nc2.r(iHashCode4, nv0Var2, z00Var3, nv0Var2);
            y02.F(z00Var4, nv0Var2, bq1VarM4);
            if (str4.length() > 0) {
                nv0Var2.a0(-1200624948);
                str = "[";
                hb0Var = hb0Var2;
                str2 = "]";
                z = false;
                mg3.b("[" + str4 + "]", null, gq.B(nv0Var2).a, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, gq.H(nv0Var2).o, nv0Var2, 0, 0, 131066);
                nv0Var2 = nv0Var2;
                oz2.g(nv0Var2, j43.o(yp1Var, 8.0f));
                nv0Var2.p(false);
            } else {
                hb0Var = hb0Var2;
                str = "[";
                z = false;
                str2 = "]";
                nv0Var2.a0(-1200266495);
                nv0Var2.p(false);
            }
            if (str3.length() > 0) {
                nv0Var2.a0(-1200171449);
                nv0 nv0Var3 = nv0Var2;
                mg3.b(str + str3 + str2, null, gq.B(nv0Var2).j, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, gq.H(nv0Var2).o, nv0Var3, 0, 0, 131066);
                nv0Var2 = nv0Var3;
                nv0Var2.p(z);
            } else {
                nv0Var2.a0(-1199905407);
                nv0Var2.p(z);
            }
            nv0Var2.p(true);
            nv0Var2.p(true);
            ns0 ns0Var2 = this.h;
            hb0 hb0Var3 = hb0Var;
            boolean zF2 = nv0Var2.f(ns0Var2) | nv0Var2.h(hb0Var3);
            Object objO2 = nv0Var2.O();
            if (zF2 || objO2 == zjVar) {
                objO2 = new tg2(ns0Var2, hb0Var3, 1);
                nv0Var2.j0(objO2);
            }
            nv0 nv0Var4 = nv0Var2;
            gv3.f((cs0) objO2, null, false, null, null, s51.e, nv0Var4, 1572864, 62);
            nv0Var4.p(true);
            gq.g(null, 0.0f, 0L, nv0Var4, 0, 7);
            nv0Var4.p(z);
        } else {
            nv0Var.U();
        }
        return dm3.a;
    }
}
