package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.format.Formatter;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.Arrays;
import java.util.List;
import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w91 implements ss0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ w91(ns0 ns0Var, j40 j40Var) {
        this.f = 2;
        this.h = ns0Var;
        this.g = j40Var;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        boolean z;
        nv0 nv0Var;
        hp2 hp2Var = (hp2) this.g;
        cs0 cs0Var = (cs0) this.h;
        nv0 nv0Var2 = (nv0) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ry) obj).getClass();
        if (nv0Var2.R(iIntValue & 1, (iIntValue & 17) != 16)) {
            yp1 yp1Var = yp1.a;
            bq1 bq1VarK = f80.K(n92.J(j43.c(yp1Var, 1.0f), n92.q0), 24.0f, 8.0f);
            qy qyVarA = oy.a(new jj(12.0f, true, new c(1)), f5.s, nv0Var2, 6);
            int iHashCode = Long.hashCode(nv0Var2.T);
            n52 n52VarL = nv0Var2.l();
            bq1 bq1VarM = lr.M(nv0Var2, bq1VarK);
            w10.c.getClass();
            nv0Var2.d0();
            if (nv0Var2.S) {
                nv0Var2.k(tb1.Y);
            } else {
                nv0Var2.m0();
            }
            y02.F(f5.E, nv0Var2, qyVarA);
            y02.F(f5.D, nv0Var2, n52VarL);
            y02.F(f5.F, nv0Var2, Integer.valueOf(iHashCode));
            y02.C(nv0Var2);
            y02.F(f5.C, nv0Var2, bq1VarM);
            mg3.b(oz2.M(R.string.launcher_rules_title, nv0Var2), null, 0L, 0L, xq0.j, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var2.j(ql3.a)).g, nv0Var2, 1572864, 0, 131006);
            if (hp2Var.c.isEmpty()) {
                nv0Var2.a0(-641345266);
                mg3.b(oz2.M(R.string.launcher_value_no_data, nv0Var2), null, ((fy) nv0Var2.j(hy.a)).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var2, 0, 0, 262138);
                nv0Var = nv0Var2;
                nv0Var.p(false);
                z = true;
            } else {
                nv0Var2.a0(-641130033);
                z = true;
                char c = 1;
                bq1 bq1VarG = j43.g(j43.c(yp1Var, 1.0f), 0.0f, 420.0f, 1);
                jj jjVar = new jj(4.0f, true, new c(1));
                boolean zH = nv0Var2.h(hp2Var);
                Object objO = nv0Var2.O();
                if (zH || objO == c20.a) {
                    objO = new aw2(c == true ? 1 : 0, hp2Var);
                    nv0Var2.j0(objO);
                }
                lr.g(24582, 494, null, null, jjVar, null, (ns0) objO, nv0Var2, null, bq1VarG, null, false);
                nv0Var = nv0Var2;
                nv0Var.p(false);
            }
            gq.m(cs0Var, new py0(f5.u), false, null, null, null, rn.f0, nv0Var, 805306368, 508);
            nv0Var.p(z);
        } else {
            nv0Var2.U();
        }
        return dm3.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        Typeface typeface;
        Spannable spannable = (Spannable) this.g;
        ba baVar = (ba) this.h;
        h83 h83Var = (h83) obj;
        int iIntValue = ((Integer) obj2).intValue();
        int iIntValue2 = ((Integer) obj3).intValue();
        zb3 zb3Var = h83Var.f;
        xq0 xq0Var = h83Var.c;
        if (xq0Var == null) {
            xq0Var = xq0.h;
        }
        vq0 vq0Var = h83Var.d;
        int i = vq0Var != null ? vq0Var.a : 0;
        wq0 wq0Var = h83Var.e;
        int i2 = wq0Var != null ? wq0Var.a : 65535;
        ca caVar = (ca) baVar.g;
        ml3 ml3VarB = ((aq0) caVar.e).b(zb3Var, xq0Var, i, i2);
        if (ml3VarB instanceof ml3) {
            Object obj4 = ml3VarB.f;
            obj4.getClass();
            typeface = (Typeface) obj4;
        } else {
            pi piVar = new pi(ml3VarB, caVar.j);
            caVar.j = piVar;
            Object obj5 = piVar.i;
            obj5.getClass();
            typeface = (Typeface) obj5;
        }
        spannable.setSpan(new cq0(1, typeface), iIntValue, iIntValue2, 33);
        return dm3.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x069e  */
    @Override // defpackage.ss0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i;
        String strN;
        float f;
        float f2;
        String strN2;
        int i2 = this.f;
        int i3 = 21;
        p40 p40Var = null;
        int i4 = 2;
        x91 x91Var = tb1.Y;
        yp1 yp1Var = yp1.a;
        zj zjVar = c20.a;
        dm3 dm3Var = dm3.a;
        Object obj4 = this.h;
        Object obj5 = this.g;
        char c = 0;
        switch (i2) {
            case 0:
                List list = (List) obj5;
                ns0 ns0Var = (ns0) obj4;
                x12 x12Var = (x12) obj;
                nv0 nv0Var = (nv0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                x12Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= nv0Var.f(x12Var) ? 4 : 2;
                }
                if (!nv0Var.R(iIntValue & 1, (iIntValue & 19) != 18)) {
                    nv0Var.U();
                } else if (list.isEmpty()) {
                    nv0Var.a0(-1095146487);
                    bq1 bq1VarI = f80.I(j43.c, x12Var);
                    cn1 cn1VarD = eo.d(f5.k, false);
                    int iHashCode = Long.hashCode(nv0Var.T);
                    n52 n52VarL = nv0Var.l();
                    bq1 bq1VarM = lr.M(nv0Var, bq1VarI);
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
                    mg3.b(oz2.M(R.string.launcher_log_raksamp_empty, nv0Var), null, ((fy) nv0Var.j(hy.a)).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var.j(ql3.a)).j, nv0Var, 0, 0, 131066);
                    nv0Var.p(true);
                    nv0Var.p(false);
                } else {
                    nv0Var.a0(-1094689919);
                    bq1 bq1VarI2 = f80.I(j43.c, x12Var);
                    boolean zH = nv0Var.h(list) | nv0Var.f(ns0Var);
                    Object objO = nv0Var.O();
                    if (zH || objO == zjVar) {
                        objO = new i(i3, list, ns0Var);
                        nv0Var.j0(objO);
                    }
                    lr.g(0, 510, null, null, null, null, (ns0) objO, nv0Var, null, bq1VarI2, null, false);
                    nv0Var.p(false);
                }
                return dm3Var;
            case 1:
                hv hvVar = (hv) obj5;
                cs0 cs0Var = (cs0) obj4;
                nv0 nv0Var2 = (nv0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ry) obj).getClass();
                if (nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    bq1 bq1VarJ = f80.J(yp1Var, 16.0f);
                    qy qyVarA = oy.a(new jj(8.0f, true, new c(1)), f5.s, nv0Var2, 6);
                    int iHashCode2 = Long.hashCode(nv0Var2.T);
                    n52 n52VarL2 = nv0Var2.l();
                    bq1 bq1VarM2 = lr.M(nv0Var2, bq1VarJ);
                    w10.c.getClass();
                    nv0Var2.d0();
                    if (nv0Var2.S) {
                        nv0Var2.k(x91Var);
                    } else {
                        nv0Var2.m0();
                    }
                    z00 z00Var = f5.E;
                    y02.F(z00Var, nv0Var2, qyVarA);
                    z00 z00Var2 = f5.D;
                    y02.F(z00Var2, nv0Var2, n52VarL2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    z00 z00Var3 = f5.F;
                    y02.F(z00Var3, nv0Var2, numValueOf);
                    y02.C(nv0Var2);
                    z00 z00Var4 = f5.C;
                    y02.F(z00Var4, nv0Var2, bq1VarM2);
                    bq1 bq1VarC = j43.c(yp1Var, 1.0f);
                    dp2 dp2VarA = cp2.a(n92.f, f5.q, nv0Var2, 54);
                    int iHashCode3 = Long.hashCode(nv0Var2.T);
                    n52 n52VarL3 = nv0Var2.l();
                    bq1 bq1VarM3 = lr.M(nv0Var2, bq1VarC);
                    nv0Var2.d0();
                    if (nv0Var2.S) {
                        nv0Var2.k(x91Var);
                    } else {
                        nv0Var2.m0();
                    }
                    y02.F(z00Var, nv0Var2, dp2VarA);
                    y02.F(z00Var2, nv0Var2, n52VarL3);
                    nc2.r(iHashCode3, nv0Var2, z00Var3, nv0Var2);
                    y02.F(z00Var4, nv0Var2, bq1VarM3);
                    ev evVar = hvVar.a;
                    int iOrdinal = evVar.ordinal();
                    if (iOrdinal == 0) {
                        i = R.string.launcher_cleo_operation_importing;
                    } else if (iOrdinal == 1) {
                        i = R.string.launcher_cleo_operation_downloading;
                    } else if (iOrdinal == 2) {
                        i = R.string.launcher_cleo_operation_installing;
                    } else {
                        if (iOrdinal != 3) {
                            c.k();
                            return null;
                        }
                        i = R.string.launcher_cleo_operation_deleting;
                    }
                    mg3.b(oz2.M(i, nv0Var2), null, 0L, 0L, xq0.j, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var2, 1572864, 0, 262078);
                    ev evVar2 = ev.g;
                    if (evVar == evVar2) {
                        nv0Var2.a0(1379701792);
                        gq.m(cs0Var, null, false, null, null, null, vm1.n, nv0Var2, 805306368, 510);
                        nv0Var2.p(false);
                    } else {
                        nv0Var2.a0(1379867084);
                        nv0Var2.p(false);
                    }
                    nv0Var2.p(true);
                    cd0 cd0Var = hvVar.c;
                    if (evVar == evVar2 && cd0Var != null) {
                        nv0Var2.a0(1244046814);
                        boolean zH2 = nv0Var2.h(cd0Var);
                        Object objO2 = nv0Var2.O();
                        Object obj6 = objO2;
                        if (zH2 || objO2 == zjVar) {
                            tv tvVar = new tv(cd0Var, 0);
                            nv0Var2.j0(tvVar);
                            obj6 = tvVar;
                        }
                        xd2.b((cs0) obj6, j43.c(yp1Var, 1.0f), 0L, 0L, 0, 0.0f, null, nv0Var2, 48);
                        Context context = (Context) nv0Var2.j(x7.b);
                        String fileSize = Formatter.formatFileSize(context, cd0Var.a);
                        fileSize.getClass();
                        String fileSize2 = Formatter.formatFileSize(context, cd0Var.b);
                        fileSize2.getClass();
                        String fileSize3 = Formatter.formatFileSize(context, cd0Var.c);
                        fileSize3.getClass();
                        mg3.b(oz2.N(R.string.launcher_cleo_download_progress, new Object[]{fileSize, fileSize2, fileSize3}, nv0Var2), null, ((fy) nv0Var2.j(hy.a)).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var2.j(ql3.a)).l, nv0Var2, 0, 0, 131066);
                        nv0Var2.p(false);
                    } else if (evVar != evVar2) {
                        nv0Var2.a0(1245140277);
                        xd2.c(j43.c(yp1Var, 1.0f), 0L, 0L, 0, 0.0f, nv0Var2, 6);
                        nv0Var2.p(false);
                    } else {
                        nv0Var2.a0(1245227728);
                        nv0Var2.p(false);
                    }
                    nv0Var2.p(true);
                } else {
                    nv0Var2.U();
                }
                return dm3Var;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ns0 ns0Var2 = (ns0) obj4;
                j40 j40Var = (j40) obj5;
                nv0 nv0Var3 = (nv0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if (nv0Var3.R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    Object objO3 = nv0Var3.O();
                    if (objO3 == zjVar) {
                        objO3 = new k40();
                        nv0Var3.j0(objO3);
                    }
                    k40 k40Var = (k40) objO3;
                    k40Var.a.clear();
                    ns0Var2.h(k40Var);
                    k40Var.a(j40Var, nv0Var3, 0);
                } else {
                    nv0Var3.U();
                }
                return dm3Var;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                String str = (String) obj5;
                d00 d00Var = (d00) obj4;
                nv0 nv0Var4 = (nv0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((ry) obj).getClass();
                if (nv0Var4.R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    bq1 bq1VarJ2 = f80.J(yp1Var, 20.0f);
                    qy qyVarA2 = oy.a(new jj(12.0f, true, new c(1)), f5.s, nv0Var4, 6);
                    int iHashCode4 = Long.hashCode(nv0Var4.T);
                    n52 n52VarL4 = nv0Var4.l();
                    bq1 bq1VarM4 = lr.M(nv0Var4, bq1VarJ2);
                    w10.c.getClass();
                    nv0Var4.d0();
                    if (nv0Var4.S) {
                        nv0Var4.k(x91Var);
                    } else {
                        nv0Var4.m0();
                    }
                    y02.F(f5.E, nv0Var4, qyVarA2);
                    y02.F(f5.D, nv0Var4, n52VarL4);
                    y02.F(f5.F, nv0Var4, Integer.valueOf(iHashCode4));
                    y02.C(nv0Var4);
                    y02.F(f5.C, nv0Var4, bq1VarM4);
                    mg3.b(str, null, 0L, 0L, xq0.j, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var4.j(ql3.a)).g, nv0Var4, 1572864, 0, 131006);
                    d00Var.e(ry.a, nv0Var4, 6);
                    nv0Var4.p(true);
                } else {
                    nv0Var4.U();
                }
                return dm3Var;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                nm2 nm2Var = (nm2) obj5;
                os1 os1Var = (os1) obj4;
                nv0 nv0Var5 = (nv0) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((ep2) obj).getClass();
                if (nv0Var5.R(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    if (gv3.l(os1Var)) {
                        strN = by1.f(nv0Var5, -1440853159, R.string.launcher_action_hide_details, nv0Var5, false);
                    } else {
                        nv0Var5.a0(-1440850470);
                        strN = oz2.N(R.string.launcher_action_show_details, new Object[]{Integer.valueOf(((km2) nm2Var).a.size())}, nv0Var5);
                        nv0Var5.p(false);
                    }
                    mg3.b(strN, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var5, 0, 0, 262142);
                } else {
                    nv0Var5.U();
                }
                return dm3Var;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                os1 os1Var2 = (os1) obj5;
                ns0 ns0Var3 = (ns0) obj4;
                nv0 nv0Var6 = (nv0) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((ry) obj).getClass();
                if (nv0Var6.R(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    Object objO4 = nv0Var6.O();
                    if (objO4 == zjVar) {
                        objO4 = b32.w(Boolean.FALSE);
                        nv0Var6.j0(objO4);
                    }
                    os1 os1Var3 = (os1) objO4;
                    bq1 bq1VarJ3 = f80.J(yp1Var, 12.0f);
                    qy qyVarA3 = oy.a(n92.d, f5.s, nv0Var6, 0);
                    int iHashCode5 = Long.hashCode(nv0Var6.T);
                    n52 n52VarL5 = nv0Var6.l();
                    bq1 bq1VarM5 = lr.M(nv0Var6, bq1VarJ3);
                    w10.c.getClass();
                    nv0Var6.d0();
                    if (nv0Var6.S) {
                        nv0Var6.k(x91Var);
                    } else {
                        nv0Var6.m0();
                    }
                    y02.F(f5.E, nv0Var6, qyVarA3);
                    y02.F(f5.D, nv0Var6, n52VarL5);
                    y02.F(f5.F, nv0Var6, Integer.valueOf(iHashCode5));
                    y02.C(nv0Var6);
                    y02.F(f5.C, nv0Var6, bq1VarM5);
                    mg3.b(oz2.M(R.string.launcher_log_level, nv0Var6), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var6.j(ql3.a)).n, nv0Var6, 0, 0, 131070);
                    oz2.g(nv0Var6, j43.e(yp1Var, 4.0f));
                    boolean zBooleanValue = ((Boolean) os1Var3.getValue()).booleanValue();
                    Object objO5 = nv0Var6.O();
                    if (objO5 == zjVar) {
                        objO5 = new zb(os1Var3, 12);
                        nv0Var6.j0(objO5);
                    }
                    lr.f(zBooleanValue, (ns0) objO5, null, gq.N(1787161622, new ak1(os1Var2, os1Var3, ns0Var3), nv0Var6), nv0Var6, 3120);
                    nv0Var6.p(true);
                } else {
                    nv0Var6.U();
                }
                return dm3Var;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                ie1 ie1Var = (ie1) obj5;
                os1 os1Var4 = (os1) obj4;
                nv0 nv0Var7 = (nv0) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((ry) obj).getClass();
                if (nv0Var7.R(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    bq1 bq1VarJ4 = f80.J(yp1Var, 8.0f);
                    boolean zF = nv0Var7.f(os1Var4);
                    Object objO6 = nv0Var7.O();
                    if (zF || objO6 == zjVar) {
                        objO6 = new zb(os1Var4, 11);
                        nv0Var7.j0(objO6);
                    }
                    lr.g(6, 508, null, null, null, null, (ns0) objO6, nv0Var7, ie1Var, bq1VarJ4, null, false);
                } else {
                    nv0Var7.U();
                }
                return dm3Var;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                i32 i32Var = (i32) obj5;
                bb1 bb1Var = (bb1) obj4;
                float fFloatValue = ((Float) obj).floatValue();
                float fFloatValue2 = ((Float) obj2).floatValue();
                float fFloatValue3 = ((Float) obj3).floatValue();
                boolean zT = d32.t(i32Var, fFloatValue);
                if (i32Var.m().e != t02.f && bb1Var != bb1.f) {
                    zT = !zT;
                }
                int i5 = i32Var.m().b;
                float fK = i5 == 0 ? 0.0f : d32.k(i32Var) / i5;
                float f3 = fK - ((int) fK);
                if (Math.abs(fFloatValue) < i32Var.n.T(400.0f)) {
                    f = 0.0f;
                } else {
                    f = 0.0f;
                    c = fFloatValue > 0.0f ? (char) 1 : (char) 2;
                }
                if (c == 0) {
                    if (Math.abs(f3) > 0.5f) {
                        f2 = zT ? fFloatValue3 : fFloatValue2;
                    } else {
                        float fAbs = Math.abs(fK);
                        ua0 ua0Var = i32Var.n;
                        j32 j32Var = k32.a;
                        if (fAbs < Math.abs(Math.min(ua0Var.T(56.0f), i32Var.o() / 2.0f) / i32Var.o()) ? Math.abs(fFloatValue2) >= Math.abs(fFloatValue3) : !zT) {
                        }
                    }
                } else if (c != 1) {
                    if (c != 2) {
                        f2 = f;
                    }
                }
                return Float.valueOf(f2);
            case 8:
                c82 c82Var = (c82) obj5;
                cs0 cs0Var2 = (cs0) obj4;
                nv0 nv0Var8 = (nv0) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((nc1) obj).getClass();
                if (nv0Var8.R(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    qy qyVarA4 = oy.a(new jj(8.0f, true, new c(1)), f5.s, nv0Var8, 6);
                    int iHashCode6 = Long.hashCode(nv0Var8.T);
                    n52 n52VarL6 = nv0Var8.l();
                    bq1 bq1VarM6 = lr.M(nv0Var8, yp1Var);
                    w10.c.getClass();
                    nv0Var8.d0();
                    if (nv0Var8.S) {
                        nv0Var8.k(x91Var);
                    } else {
                        nv0Var8.m0();
                    }
                    y02.F(f5.E, nv0Var8, qyVarA4);
                    y02.F(f5.D, nv0Var8, n52VarL6);
                    y02.F(f5.F, nv0Var8, Integer.valueOf(iHashCode6));
                    y02.C(nv0Var8);
                    y02.F(f5.C, nv0Var8, bq1VarM6);
                    mg3.b(((z72) c82Var).a, null, ((fy) nv0Var8.j(hy.a)).w, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var8, 0, 0, 262138);
                    gq.i(cs0Var2, null, false, null, null, null, null, cl3.M, nv0Var8, 805306368, 510);
                    nv0Var8.p(true);
                } else {
                    nv0Var8.U();
                }
                return dm3Var;
            case vr.g /* 9 */:
                z31 z31Var = (z31) obj5;
                ns0 ns0Var4 = (ns0) obj4;
                nv0 nv0Var9 = (nv0) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((nc1) obj).getClass();
                if (nv0Var9.R(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    bq1 bq1VarC2 = n92.C(j43.c(yp1Var, 1.0f), n92.A(nv0Var9), false);
                    dp2 dp2VarA2 = cp2.a(new jj(8.0f, true, new c(1)), f5.p, nv0Var9, 6);
                    int iHashCode7 = Long.hashCode(nv0Var9.T);
                    n52 n52VarL7 = nv0Var9.l();
                    bq1 bq1VarM7 = lr.M(nv0Var9, bq1VarC2);
                    w10.c.getClass();
                    nv0Var9.d0();
                    if (nv0Var9.S) {
                        nv0Var9.k(x91Var);
                    } else {
                        nv0Var9.m0();
                    }
                    y02.F(f5.E, nv0Var9, dp2VarA2);
                    y02.F(f5.D, nv0Var9, n52VarL7);
                    y02.F(f5.F, nv0Var9, Integer.valueOf(iHashCode7));
                    y02.C(nv0Var9);
                    y02.F(f5.C, nv0Var9, bq1VarM7);
                    nv0Var9.a0(-2070536069);
                    for (z31 z31Var2 : z31.h) {
                        boolean z = z31Var == z31Var2;
                        boolean zF2 = nv0Var9.f(ns0Var4) | nv0Var9.d(z31Var2.ordinal());
                        Object objO7 = nv0Var9.O();
                        if (zF2 || objO7 == zjVar) {
                            objO7 = new me1(5, ns0Var4, z31Var2);
                            nv0Var9.j0(objO7);
                        }
                        gu.e(z, (cs0) objO7, gq.N(221495233, new u(23, z31Var2), nv0Var9), null, false, null, null, null, null, nv0Var9, 384);
                    }
                    nv0Var9.p(false);
                    nv0Var9.p(true);
                } else {
                    nv0Var9.U();
                }
                return dm3Var;
            case vr.h /* 10 */:
                hp3 hp3Var = (hp3) obj5;
                cs0 cs0Var3 = (cs0) obj4;
                nv0 nv0Var10 = (nv0) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((nc1) obj).getClass();
                if (nv0Var10.R(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    r51.i(hp3Var.b, hp3Var.c, cs0Var3, nv0Var10, 0);
                } else {
                    nv0Var10.U();
                }
                return dm3Var;
            case 11:
                cs0 cs0Var4 = (cs0) obj5;
                ns0 ns0Var5 = (ns0) obj4;
                nv0 nv0Var11 = (nv0) obj2;
                ((Integer) obj3).getClass();
                nv0Var11.a0(759876635);
                Object objO8 = nv0Var11.O();
                Object obj7 = objO8;
                if (objO8 == zjVar) {
                    cb0 cb0VarJ = b32.j(cs0Var4);
                    nv0Var11.j0(cb0VarJ);
                    obj7 = cb0VarJ;
                }
                e93 e93Var = (e93) obj7;
                Object objO9 = nv0Var11.O();
                Object obj8 = objO9;
                if (objO9 == zjVar) {
                    ed edVar = new ed(new gy1(((gy1) e93Var.getValue()).a), mu2.b, new gy1(mu2.c), 8);
                    nv0Var11.j0(edVar);
                    obj8 = edVar;
                }
                ed edVar2 = (ed) obj8;
                boolean zH3 = nv0Var11.h(edVar2);
                Object objO10 = nv0Var11.O();
                Object obj9 = objO10;
                if (zH3 || objO10 == zjVar) {
                    ri2 ri2Var = new ri2(e93Var, edVar2, p40Var, 5);
                    nv0Var11.j0(ri2Var);
                    obj9 = ri2Var;
                }
                rn.l((rs0) obj9, nv0Var11, dm3Var);
                pe peVar = edVar2.c;
                boolean zF3 = nv0Var11.f(peVar);
                Object objO11 = nv0Var11.O();
                if (zF3 || objO11 == zjVar) {
                    objO11 = new qu1(peVar, 5);
                    nv0Var11.j0(objO11);
                }
                bq1 bq1Var = (bq1) ns0Var5.h((cs0) objO11);
                nv0Var11.p(false);
                return bq1Var;
            case vr.i /* 12 */:
                o72 o72Var = (o72) obj5;
                cs0 cs0Var5 = (cs0) obj4;
                nv0 nv0Var12 = (nv0) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((ry) obj).getClass();
                if (nv0Var12.R(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    bq1 bq1VarK = f80.K(n92.J(j43.c(yp1Var, 1.0f), n92.q0), 24.0f, 8.0f);
                    qy qyVarA5 = oy.a(new jj(12.0f, true, new c(1)), f5.s, nv0Var12, 6);
                    int iHashCode8 = Long.hashCode(nv0Var12.T);
                    n52 n52VarL8 = nv0Var12.l();
                    bq1 bq1VarM8 = lr.M(nv0Var12, bq1VarK);
                    w10.c.getClass();
                    nv0Var12.d0();
                    if (nv0Var12.S) {
                        nv0Var12.k(x91Var);
                    } else {
                        nv0Var12.m0();
                    }
                    z00 z00Var5 = f5.E;
                    y02.F(z00Var5, nv0Var12, qyVarA5);
                    z00 z00Var6 = f5.D;
                    y02.F(z00Var6, nv0Var12, n52VarL8);
                    Integer numValueOf2 = Integer.valueOf(iHashCode8);
                    z00 z00Var7 = f5.F;
                    y02.F(z00Var7, nv0Var12, numValueOf2);
                    y02.C(nv0Var12);
                    z00 z00Var8 = f5.C;
                    y02.F(z00Var8, nv0Var12, bq1VarM8);
                    if (o72Var.d) {
                        strN2 = by1.f(nv0Var12, 588885316, R.string.launcher_players_loading_title, nv0Var12, false);
                    } else {
                        nv0Var12.a0(588985880);
                        strN2 = oz2.N(R.string.launcher_players_title, new Object[]{Integer.valueOf(o72Var.c.size())}, nv0Var12);
                        nv0Var12.p(false);
                    }
                    String str2 = strN2;
                    r93 r93Var = ql3.a;
                    mg3.b(str2, null, 0L, 0L, xq0.j, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var12.j(r93Var)).g, nv0Var12, 1572864, 0, 131006);
                    if (o72Var.d) {
                        nv0Var12.a0(1681576843);
                        bq1 bq1VarE = j43.e(j43.c(yp1Var, 1.0f), 160.0f);
                        cn1 cn1VarD2 = eo.d(f5.k, false);
                        int iHashCode9 = Long.hashCode(nv0Var12.T);
                        n52 n52VarL9 = nv0Var12.l();
                        bq1 bq1VarM9 = lr.M(nv0Var12, bq1VarE);
                        nv0Var12.d0();
                        if (nv0Var12.S) {
                            nv0Var12.k(x91Var);
                        } else {
                            nv0Var12.m0();
                        }
                        y02.F(z00Var5, nv0Var12, cn1VarD2);
                        y02.F(z00Var6, nv0Var12, n52VarL9);
                        nc2.r(iHashCode9, nv0Var12, z00Var7, nv0Var12);
                        y02.F(z00Var8, nv0Var12, bq1VarM9);
                        xd2.a(null, 0L, 0.0f, 0L, 0, 0.0f, nv0Var12, 0, 63);
                        nv0Var12.p(true);
                        nv0Var12.p(false);
                    } else if (o72Var.e) {
                        nv0Var12.a0(589570850);
                        mg3.b(oz2.M(R.string.launcher_players_error, nv0Var12), null, ((fy) nv0Var12.j(hy.a)).w, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var12.j(r93Var)).k, nv0Var12, 0, 0, 131066);
                        nv0Var12.p(false);
                    } else {
                        nv0Var12.a0(589847742);
                        bq1 bq1VarG = j43.g(j43.c(yp1Var, 1.0f), 0.0f, 420.0f, 1);
                        jj jjVar = new jj(4.0f, true, new c(1));
                        boolean zH4 = nv0Var12.h(o72Var);
                        Object objO12 = nv0Var12.O();
                        if (zH4 || objO12 == zjVar) {
                            objO12 = new aw2(i4, o72Var);
                            nv0Var12.j0(objO12);
                        }
                        lr.g(24582, 494, null, null, jjVar, null, (ns0) objO12, nv0Var12, null, bq1VarG, null, false);
                        nv0Var12.p(false);
                    }
                    gq.m(cs0Var5, new py0(f5.u), false, null, null, null, rn.g0, nv0Var12, 805306368, 508);
                    nv0Var12.p(true);
                } else {
                    nv0Var12.U();
                }
                return dm3Var;
            case 13:
                return d(obj, obj2, obj3);
            case 14:
                vj2 vj2Var = (vj2) obj5;
                cs0 cs0Var6 = (cs0) obj4;
                nv0 nv0Var13 = (nv0) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((nc1) obj).getClass();
                if (nv0Var13.R(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    f80.k(((sj2) vj2Var).b, cs0Var6, nv0Var13, 0);
                } else {
                    nv0Var13.U();
                }
                return dm3Var;
            case jo3.g /* 15 */:
                aq2 aq2Var = (aq2) obj5;
                Long l = (Long) obj4;
                nv0 nv0Var14 = (nv0) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((oo0) obj).getClass();
                if (nv0Var14.R(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    if (aq2Var.a) {
                        nv0Var14.a0(-876662);
                        f80.q(oz2.M(R.string.launcher_server_password, nv0Var14), lq.H(), nv0Var14, 0, 0);
                        nv0Var14.p(false);
                    } else {
                        nv0Var14.a0(-713292);
                        nv0Var14.p(false);
                    }
                    int i6 = aq2Var.b;
                    f80.q(((Resources) nv0Var14.j(x7.c)).getQuantityString(R.plurals.launcher_server_summary, i6, Arrays.copyOf(new Object[]{Integer.valueOf(i6), Integer.valueOf(aq2Var.c)}, 2)), null, nv0Var14, 0, 2);
                    if (l != null) {
                        nv0Var14.a0(-443158);
                        f80.q(oz2.N(R.string.launcher_value_ping_ms, new Object[]{l}, nv0Var14), null, nv0Var14, 0, 2);
                        nv0Var14.p(false);
                    } else {
                        nv0Var14.a0(-310540);
                        nv0Var14.p(false);
                    }
                } else {
                    nv0Var14.U();
                }
                return dm3Var;
            case 16:
                return i(obj, obj2, obj3);
            default:
                ff3 ff3Var = (ff3) obj5;
                qr1 qr1Var = (qr1) obj4;
                nv0 nv0Var15 = (nv0) obj2;
                ((Integer) obj3).getClass();
                nv0Var15.a0(-102778667);
                Object objO13 = nv0Var15.O();
                Object obj10 = objO13;
                if (objO13 == zjVar) {
                    x50 x50VarA = rn.A(nv0Var15);
                    nv0Var15.j0(x50VarA);
                    obj10 = x50VarA;
                }
                x50 x50Var = (x50) obj10;
                Object objO14 = nv0Var15.O();
                Object obj11 = objO14;
                if (objO14 == zjVar) {
                    d42 d42VarW = b32.w(null);
                    nv0Var15.j0(d42VarW);
                    obj11 = d42VarW;
                }
                os1 os1Var5 = (os1) obj11;
                os1 os1VarZ = b32.z(ff3Var, nv0Var15);
                boolean zF4 = nv0Var15.f(qr1Var);
                Object objO15 = nv0Var15.O();
                Object obj12 = objO15;
                if (zF4 || objO15 == zjVar) {
                    er1 er1Var = new er1(i3, os1Var5, qr1Var);
                    nv0Var15.j0(er1Var);
                    obj12 = er1Var;
                }
                rn.g(qr1Var, (ns0) obj12, nv0Var15);
                boolean zH5 = nv0Var15.h(x50Var) | nv0Var15.f(qr1Var) | nv0Var15.f(os1VarZ);
                Object objO16 = nv0Var15.O();
                Object obj13 = objO16;
                if (zH5 || objO16 == zjVar) {
                    if3 if3Var = new if3(x50Var, os1Var5, qr1Var, os1VarZ);
                    nv0Var15.j0(if3Var);
                    obj13 = if3Var;
                }
                bq1 bq1VarA = ob3.a(yp1Var, qr1Var, (PointerInputEventHandler) obj13);
                nv0Var15.p(false);
                return bq1VarA;
        }
    }

    public /* synthetic */ w91(int i, Object obj, Object obj2) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }
}
