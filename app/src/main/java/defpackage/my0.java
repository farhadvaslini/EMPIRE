package defpackage;

import android.content.ClipboardManager;
import android.content.Context;
import java.util.List;
import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class my0 implements ss0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ my0(ClipboardManager clipboardManager, os1 os1Var, Context context) {
        this.f = 2;
        this.g = clipboardManager;
        this.i = os1Var;
        this.h = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ss0
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i = this.f;
        zj zjVar = c20.a;
        dm3 dm3Var = dm3.a;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.g;
        int i2 = 16;
        Object[] objArr = 0;
        switch (i) {
            case 0:
                List<yv2> list = (List) obj6;
                ns0 ns0Var = (ns0) obj5;
                os1 os1Var = (os1) obj4;
                nv0 nv0Var = (nv0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ry) obj).getClass();
                if (nv0Var.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    for (yv2 yv2Var : list) {
                        d00 d00VarN = gq.N(1450285418, new u(14, yv2Var), nv0Var);
                        boolean zF = nv0Var.f(ns0Var) | nv0Var.h(yv2Var);
                        Object objO = nv0Var.O();
                        if (zF || objO == zjVar) {
                            objO = new ok(ns0Var, yv2Var, os1Var, 7);
                            nv0Var.j0(objO);
                        }
                        u9.b(d00VarN, (cs0) objO, null, false, null, null, nv0Var, 6, 508);
                    }
                } else {
                    nv0Var.U();
                }
                return dm3Var;
            case 1:
                String str = (String) obj6;
                cs0 cs0Var = (cs0) obj5;
                String str2 = (String) obj4;
                nv0 nv0Var2 = (nv0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ry) obj).getClass();
                if (nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    mg3.b(str, null, ((fy) nv0Var2.j(hy.a)).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var2.j(ql3.a)).k, nv0Var2, 0, 0, 131066);
                    byte b = 0;
                    gu.b(cs0Var, gq.N(-308392961, new z71(str2, b, b), nv0Var2), null, false, null, null, null, null, null, nv0Var2, 48, 2044);
                } else {
                    nv0Var2.U();
                }
                return dm3Var;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ClipboardManager clipboardManager = (ClipboardManager) obj6;
                os1 os1Var2 = (os1) obj4;
                Context context = (Context) obj5;
                nv0 nv0Var3 = (nv0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((ep2) obj).getClass();
                if (nv0Var3.R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    String strM = oz2.M(R.string.launcher_log_copied, nv0Var3);
                    boolean zH = nv0Var3.h(clipboardManager) | nv0Var3.f(os1Var2) | nv0Var3.h(context) | nv0Var3.f(strM);
                    Object objO2 = nv0Var3.O();
                    if (zH || objO2 == zjVar) {
                        objO2 = new n8(clipboardManager, context, strM, os1Var2, 3);
                        nv0Var3.j0(objO2);
                    }
                    gv3.f((cs0) objO2, null, false, null, null, vm1.z, nv0Var3, 1572864, 62);
                } else {
                    nv0Var3.U();
                }
                return dm3Var;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                ss0 ss0Var = (ss0) obj6;
                n72 n72Var = (n72) obj5;
                os1 os1Var3 = (os1) obj4;
                nv0 nv0Var4 = (nv0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((ry) obj).getClass();
                if (nv0Var4.R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    d00 d00Var = vm1.E;
                    boolean zF2 = nv0Var4.f(ss0Var) | nv0Var4.h(n72Var);
                    Object objO3 = nv0Var4.O();
                    if (zF2 || objO3 == zjVar) {
                        objO3 = new ok(ss0Var, n72Var, os1Var3, i2);
                        nv0Var4.j0(objO3);
                    }
                    u9.b(d00Var, (cs0) objO3, null, false, null, null, nv0Var4, 6, 508);
                } else {
                    nv0Var4.U();
                }
                return dm3Var;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                ss0 ss0Var2 = (ss0) obj6;
                zx1 zx1Var = (zx1) obj5;
                os1 os1Var4 = (os1) obj4;
                nv0 nv0Var5 = (nv0) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((ry) obj).getClass();
                if (nv0Var5.R(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    d00 d00Var2 = vm1.K;
                    boolean zF3 = nv0Var5.f(ss0Var2) | nv0Var5.h(zx1Var);
                    Object objO4 = nv0Var5.O();
                    if (zF3 || objO4 == zjVar) {
                        objO4 = new ok(ss0Var2, zx1Var, os1Var4, 17);
                        nv0Var5.j0(objO4);
                    }
                    u9.b(d00Var2, (cs0) objO4, null, false, null, null, nv0Var5, 6, 508);
                } else {
                    nv0Var5.U();
                }
                return dm3Var;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                List list2 = (List) obj6;
                a42 a42Var = (a42) obj5;
                os1 os1Var5 = (os1) obj4;
                nv0 nv0Var6 = (nv0) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((ry) obj).getClass();
                if (nv0Var6.R(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    int i3 = 0;
                    for (Object obj7 : list2) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            vr.b0();
                            throw null;
                        }
                        d00 d00VarN2 = gq.N(579811876, new u(28, (bm2) obj7), nv0Var6);
                        boolean zF4 = nv0Var6.f(a42Var) | nv0Var6.d(i3);
                        Object objO5 = nv0Var6.O();
                        if (zF4 || objO5 == zjVar) {
                            objO5 = new qz0(i3, a42Var, os1Var5);
                            nv0Var6.j0(objO5);
                        }
                        u9.b(d00VarN2, (cs0) objO5, null, false, null, null, nv0Var6, 6, 508);
                        i3 = i4;
                    }
                } else {
                    nv0Var6.U();
                }
                return dm3Var;
            default:
                final jc jcVar = (jc) obj6;
                final an3 an3Var = (an3) obj5;
                cs0 cs0Var2 = (cs0) obj4;
                nv0 nv0Var7 = (nv0) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((ry) obj).getClass();
                if (nv0Var7.R(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    long j = wx.f;
                    ei1 ei1VarU = vr.u(j, nv0Var7);
                    boolean zH2 = nv0Var7.h(jcVar);
                    Object objO6 = nv0Var7.O();
                    if (zH2 || objO6 == zjVar) {
                        final Object[] objArr2 = objArr == true ? 1 : 0;
                        objO6 = new cs0() { // from class: v03
                            @Override // defpackage.cs0
                            public final Object a() {
                                int i5 = objArr2;
                                dm3 dm3Var2 = dm3.a;
                                jc jcVar2 = jcVar;
                                switch (i5) {
                                    case 0:
                                        jcVar2.a("https://github.com/SA-MP-Android");
                                        break;
                                    default:
                                        jcVar2.a("https://t.me/samp_android_official");
                                        break;
                                }
                                return dm3Var2;
                            }
                        };
                        nv0Var7.j0(objO6);
                    }
                    yp1 yp1Var = yp1.a;
                    vp.g(r51.l1, gv3.x(3, (cs0) objO6, yp1Var, false), null, r51.m1, r51.n1, ei1VarU, nv0Var7, 221190, 396);
                    gq.g(f80.L(yp1Var, 16.0f, 0.0f, 2), 0.0f, 0L, nv0Var7, 6, 6);
                    ei1 ei1VarU2 = vr.u(j, nv0Var7);
                    boolean zH3 = nv0Var7.h(jcVar);
                    Object objO7 = nv0Var7.O();
                    if (zH3 || objO7 == zjVar) {
                        final int i5 = 1;
                        objO7 = new cs0() { // from class: v03
                            @Override // defpackage.cs0
                            public final Object a() {
                                int i52 = i5;
                                dm3 dm3Var2 = dm3.a;
                                jc jcVar2 = jcVar;
                                switch (i52) {
                                    case 0:
                                        jcVar2.a("https://github.com/SA-MP-Android");
                                        break;
                                    default:
                                        jcVar2.a("https://t.me/samp_android_official");
                                        break;
                                }
                                return dm3Var2;
                            }
                        };
                        nv0Var7.j0(objO7);
                    }
                    vp.g(r51.o1, gv3.x(3, (cs0) objO7, yp1Var, false), null, r51.p1, r51.q1, ei1VarU2, nv0Var7, 221190, 396);
                    gq.g(f80.L(yp1Var, 16.0f, 0.0f, 2), 0.0f, 0L, nv0Var7, 6, 6);
                    ei1 ei1VarU3 = vr.u(j, nv0Var7);
                    boolean z = !(an3Var instanceof wm3);
                    boolean zF5 = nv0Var7.f(cs0Var2);
                    Object objO8 = nv0Var7.O();
                    if (zF5 || objO8 == zjVar) {
                        objO8 = new lx0(cs0Var2, 5);
                        nv0Var7.j0(objO8);
                    }
                    bq1 bq1VarX = gv3.x(2, (cs0) objO8, yp1Var, z);
                    final int i6 = 0;
                    final int i7 = 1;
                    vp.g(gq.N(1950503919, new rs0() { // from class: w03
                        @Override // defpackage.rs0
                        public final Object f(Object obj8, Object obj9) {
                            int i8;
                            int i9;
                            String strN;
                            int i10 = i6;
                            dm3 dm3Var2 = dm3.a;
                            wm3 wm3Var = wm3.a;
                            ym3 ym3Var = ym3.a;
                            an3 an3Var2 = an3Var;
                            switch (i10) {
                                case 0:
                                    nv0 nv0Var8 = (nv0) obj8;
                                    int iIntValue8 = ((Integer) obj9).intValue();
                                    if (nv0Var8.R(1 & iIntValue8, (iIntValue8 & 3) != 2)) {
                                        if (s51.n(an3Var2, ym3Var)) {
                                            i8 = 1828531331;
                                            i9 = R.string.launcher_about_check_update;
                                        } else if (s51.n(an3Var2, wm3Var)) {
                                            i8 = 1828536838;
                                            i9 = R.string.launcher_about_checking_update;
                                        } else if (an3Var2 instanceof vm3) {
                                            nv0Var8.a0(1828542711);
                                            strN = oz2.N(R.string.launcher_about_update_available, new Object[]{((vm3) an3Var2).a.a}, nv0Var8);
                                            nv0Var8.p(false);
                                            mg3.b(strN, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var8, 0, 0, 262142);
                                        } else if (s51.n(an3Var2, zm3.a)) {
                                            i8 = 1828552801;
                                            i9 = R.string.launcher_about_up_to_date;
                                        } else {
                                            if (!s51.n(an3Var2, xm3.a)) {
                                                throw by1.d(nv0Var8, 1828527825, false);
                                            }
                                            i8 = 1828558148;
                                            i9 = R.string.launcher_about_update_failed;
                                        }
                                        strN = by1.f(nv0Var8, i8, i9, nv0Var8, false);
                                        mg3.b(strN, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var8, 0, 0, 262142);
                                    } else {
                                        nv0Var8.U();
                                    }
                                    return dm3Var2;
                                default:
                                    nv0 nv0Var9 = (nv0) obj8;
                                    int iIntValue9 = ((Integer) obj9).intValue();
                                    if (!nv0Var9.R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                                        nv0Var9.U();
                                    } else if (s51.n(an3Var2, ym3Var)) {
                                        nv0Var9.a0(637730167);
                                        s01.a(pq.z(), null, null, 0L, nv0Var9, 48, 12);
                                        nv0Var9.p(false);
                                    } else if (s51.n(an3Var2, wm3Var)) {
                                        nv0Var9.a0(637736197);
                                        mg3.b(oz2.M(R.string.launcher_value_loading_short, nv0Var9), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var9, 0, 0, 262142);
                                        nv0Var9.p(false);
                                    } else {
                                        nv0Var9.a0(-1704924874);
                                        nv0Var9.p(false);
                                    }
                                    return dm3Var2;
                            }
                        }
                    }, nv0Var7), bq1VarX, null, r51.r1, gq.N(-1536764854, new rs0() { // from class: w03
                        @Override // defpackage.rs0
                        public final Object f(Object obj8, Object obj9) {
                            int i8;
                            int i9;
                            String strN;
                            int i10 = i7;
                            dm3 dm3Var2 = dm3.a;
                            wm3 wm3Var = wm3.a;
                            ym3 ym3Var = ym3.a;
                            an3 an3Var2 = an3Var;
                            switch (i10) {
                                case 0:
                                    nv0 nv0Var8 = (nv0) obj8;
                                    int iIntValue8 = ((Integer) obj9).intValue();
                                    if (nv0Var8.R(1 & iIntValue8, (iIntValue8 & 3) != 2)) {
                                        if (s51.n(an3Var2, ym3Var)) {
                                            i8 = 1828531331;
                                            i9 = R.string.launcher_about_check_update;
                                        } else if (s51.n(an3Var2, wm3Var)) {
                                            i8 = 1828536838;
                                            i9 = R.string.launcher_about_checking_update;
                                        } else if (an3Var2 instanceof vm3) {
                                            nv0Var8.a0(1828542711);
                                            strN = oz2.N(R.string.launcher_about_update_available, new Object[]{((vm3) an3Var2).a.a}, nv0Var8);
                                            nv0Var8.p(false);
                                            mg3.b(strN, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var8, 0, 0, 262142);
                                        } else if (s51.n(an3Var2, zm3.a)) {
                                            i8 = 1828552801;
                                            i9 = R.string.launcher_about_up_to_date;
                                        } else {
                                            if (!s51.n(an3Var2, xm3.a)) {
                                                throw by1.d(nv0Var8, 1828527825, false);
                                            }
                                            i8 = 1828558148;
                                            i9 = R.string.launcher_about_update_failed;
                                        }
                                        strN = by1.f(nv0Var8, i8, i9, nv0Var8, false);
                                        mg3.b(strN, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var8, 0, 0, 262142);
                                    } else {
                                        nv0Var8.U();
                                    }
                                    return dm3Var2;
                                default:
                                    nv0 nv0Var9 = (nv0) obj8;
                                    int iIntValue9 = ((Integer) obj9).intValue();
                                    if (!nv0Var9.R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                                        nv0Var9.U();
                                    } else if (s51.n(an3Var2, ym3Var)) {
                                        nv0Var9.a0(637730167);
                                        s01.a(pq.z(), null, null, 0L, nv0Var9, 48, 12);
                                        nv0Var9.p(false);
                                    } else if (s51.n(an3Var2, wm3Var)) {
                                        nv0Var9.a0(637736197);
                                        mg3.b(oz2.M(R.string.launcher_value_loading_short, nv0Var9), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var9, 0, 0, 262142);
                                        nv0Var9.p(false);
                                    } else {
                                        nv0Var9.a0(-1704924874);
                                        nv0Var9.p(false);
                                    }
                                    return dm3Var2;
                            }
                        }
                    }, nv0Var7), ei1VarU3, nv0Var7, 221190, 396);
                } else {
                    nv0Var7.U();
                }
                return dm3Var;
        }
    }

    public /* synthetic */ my0(Object obj, Object obj2, Object obj3, int i) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
    }
}
