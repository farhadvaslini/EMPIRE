package defpackage;

import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class gv3 {
    public static final b23 A;
    public static final gy A0;
    public static final float B;
    public static w01 B0;
    public static final gy C;
    public static final float D;
    public static final gy E;
    public static final gy F;
    public static final StackTraceElement[] G;
    public static final gy H;
    public static final gy I;
    public static final float J;
    public static final gy K;
    public static final gy L;
    public static final Object M;
    public static Method N;
    public static boolean O;
    public static final gy P;
    public static final pl3 Q;
    public static final gy R;
    public static final float S;
    public static final b23 T;
    public static final gy U;
    public static final gy V;
    public static final pl3 W;
    public static final float X;
    public static final float Y;
    public static final gy Z;
    public static final float a0;
    public static final gy b0;
    public static final float c0;
    public static final gy d0;
    public static final float e0;
    public static final gy f0;
    public static final float g0;
    public static final gy h0;
    public static final ai0 i;
    public static final float i0;
    public static final gy j0;
    public static final gy k0;
    public static final b23 l0;
    public static final float m0;
    public static final d00 n;
    public static final gy n0;
    public static final float o0;
    public static final gy p0;
    public static final gy q0;
    public static final ai0 r;
    public static final float r0;
    public static final float s0;
    public static final float t0;
    public static final gy u;
    public static final b23 u0;
    public static final float v;
    public static final float v0;
    public static final gy w;
    public static final gy w0;
    public static final float x;
    public static final gy x0;
    public static final gy y;
    public static final float y0;
    public static final ya z;
    public static final gy z0;
    public static final qe a = new qe(Float.POSITIVE_INFINITY);
    public static final re b = new re(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final se c = new se(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final te d = new te(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final qe e = new qe(Float.NEGATIVE_INFINITY);
    public static final re f = new re(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final se g = new se(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final te h = new te(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final d00 j = new d00(-114170463, new wc(16), false);
    public static final d00 k = new d00(-805074432, new wc(17), false);
    public static final d00 l = new d00(509503402, new k00(12), false);
    public static final d00 m = new d00(-1028270683, new k00(13), false);
    public static final d00 o = new d00(1393821989, new r00(2), false);
    public static final d00 p = new d00(-782974812, new q00(6), false);
    public static final d00 q = new d00(1753759355, new q00(7), false);
    public static final xa0 s = new xa0(1.0f, 1.0f);
    public static final gy t = gy.t;

    static {
        int i2 = 1;
        i = new ai0(i2, "RESUME_TOKEN");
        int i3 = 5;
        n = new d00(1231093407, new q00(i3), false);
        r = new ai0(i2, "CLOSED");
        gy gyVar = gy.m;
        u = gyVar;
        v = 0.1f;
        w = gyVar;
        x = 0.38f;
        y = gy.l;
        z = new ya(i3);
        b23 b23Var = b23.i;
        A = b23Var;
        B = 24.0f;
        gy gyVar2 = gy.n;
        C = gyVar2;
        D = 0.38f;
        E = gyVar2;
        F = gy.p;
        G = new StackTraceElement[0];
        H = gyVar;
        I = gyVar;
        J = 20.0f;
        gy gyVar3 = gy.q;
        K = gyVar3;
        L = gyVar2;
        M = new Object();
        P = gy.h;
        Q = pl3.j;
        R = gy.i;
        S = 6.0f;
        T = b23.h;
        gy gyVar4 = gy.g;
        U = gyVar4;
        V = gyVar4;
        W = pl3.g;
        X = 48.0f;
        Y = 68.0f;
        Z = gy.u;
        a0 = 1.0f;
        b0 = gyVar;
        c0 = 0.38f;
        d0 = gyVar;
        e0 = 0.12f;
        f0 = gyVar;
        g0 = 0.38f;
        gy gyVar5 = gy.x;
        h0 = gyVar5;
        i0 = 0.38f;
        j0 = gyVar5;
        k0 = gyVar;
        l0 = b23Var;
        m0 = 28.0f;
        n0 = gy.j;
        o0 = 24.0f;
        p0 = gy.k;
        q0 = gyVar3;
        r0 = 40.0f;
        s0 = 32.0f;
        t0 = 2.0f;
        u0 = b23Var;
        v0 = 52.0f;
        gy gyVar6 = gy.o;
        w0 = gyVar6;
        x0 = gyVar6;
        y0 = 16.0f;
        z0 = gyVar5;
        A0 = gyVar5;
    }

    public static final Object A(kt2 kt2Var, long j2, rs0 rs0Var) {
        while (true) {
            if (kt2Var.e >= j2 && !kt2Var.f()) {
                return kt2Var;
            }
            Object objD = kt2Var.d();
            ai0 ai0Var = r;
            if (objD == ai0Var) {
                return ai0Var;
            }
            kt2 kt2Var2 = (kt2) ((x20) objD);
            if (kt2Var2 == null) {
                kt2Var2 = (kt2) rs0Var.f(Long.valueOf(kt2Var.e + 1), kt2Var);
                if (kt2Var.i(kt2Var2)) {
                    if (kt2Var.f()) {
                        kt2Var.h();
                    }
                }
            }
            kt2Var = kt2Var2;
        }
    }

    public static final w01 B() {
        w01 w01Var = B0;
        if (w01Var != null) {
            return w01Var;
        }
        v01 v01Var = new v01("Filled.Add", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = vo3.a;
        w73 w73Var = new w73(wx.b);
        tx0 tx0Var = new tx0(1);
        tx0Var.j(19.0f, 13.0f);
        tx0Var.g(-6.0f);
        tx0Var.o(6.0f);
        tx0Var.g(-2.0f);
        tx0Var.o(-6.0f);
        tx0Var.f(5.0f);
        tx0Var.o(-2.0f);
        tx0Var.g(6.0f);
        tx0Var.n(5.0f);
        tx0Var.g(2.0f);
        tx0Var.o(6.0f);
        tx0Var.g(6.0f);
        tx0Var.o(2.0f);
        tx0Var.c();
        v01.a(v01Var, tx0Var.a, w73Var);
        w01 w01VarB = v01Var.b();
        B0 = w01VarB;
        return w01VarB;
    }

    public static final boolean C(vu2 vu2Var) {
        Object objG = vu2Var.d.f.g(zu2.L);
        if (objG == null) {
            objG = null;
        }
        mi3 mi3Var = (mi3) objG;
        is1 is1Var = vu2Var.d.f;
        Object objG2 = is1Var.g(zu2.z);
        if (objG2 == null) {
            objG2 = null;
        }
        no2 no2Var = (no2) objG2;
        boolean z2 = mi3Var != null;
        Object objG3 = is1Var.g(zu2.K);
        if (((Boolean) (objG3 != null ? objG3 : null)) == null || (no2Var != null && no2Var.a == 4)) {
            return z2;
        }
        return true;
    }

    public static final String D(vu2 vu2Var, Resources resources) {
        qu2 qu2Var = vu2Var.d;
        qu2 qu2Var2 = vu2Var.d;
        Object objG = qu2Var.f.g(zu2.b);
        String string = null;
        if (objG == null) {
            objG = null;
        }
        is1 is1Var = qu2Var2.f;
        Object objG2 = is1Var.g(zu2.L);
        if (objG2 == null) {
            objG2 = null;
        }
        mi3 mi3Var = (mi3) objG2;
        Object objG3 = is1Var.g(zu2.z);
        if (objG3 == null) {
            objG3 = null;
        }
        no2 no2Var = (no2) objG3;
        if (mi3Var != null) {
            int iOrdinal = mi3Var.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        c.k();
                        return null;
                    }
                    if (objG == null) {
                        objG = resources.getString(2131624087);
                    }
                } else if (no2Var != null && no2Var.a == 2 && objG == null) {
                    objG = resources.getString(2131624615);
                }
            } else if (no2Var != null && no2Var.a == 2 && objG == null) {
                objG = resources.getString(2131624616);
            }
        }
        Object objG4 = is1Var.g(zu2.K);
        if (objG4 == null) {
            objG4 = null;
        }
        Boolean bool = (Boolean) objG4;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if ((no2Var == null || no2Var.a != 4) && objG == null) {
                objG = zBooleanValue ? resources.getString(2131624612) : resources.getString(2131624432);
            }
        }
        Object objG5 = is1Var.g(zu2.c);
        if (objG5 == null) {
            objG5 = null;
        }
        qd2 qd2Var = (qd2) objG5;
        if (qd2Var != null) {
            if (qd2Var != qd2.d) {
                if (objG == null) {
                    ex exVar = qd2Var.b;
                    float f2 = exVar.g;
                    float f3 = exVar.f;
                    float f4 = f2 - f3 == 0.0f ? 0.0f : (qd2Var.a - f3) / (exVar.g - f3);
                    if (f4 < 0.0f) {
                        f4 = 0.0f;
                    }
                    if (f4 > 1.0f) {
                        f4 = 1.0f;
                    }
                    objG = resources.getString(2131624620, Integer.valueOf(f4 == 0.0f ? 0 : f4 == 1.0f ? 100 : y02.h(Math.round(f4 * 100.0f), 1, 99)));
                }
            } else if (objG == null) {
                objG = resources.getString(2131624086);
            }
        }
        cv2 cv2Var = zu2.G;
        if (is1Var.c(cv2Var)) {
            is1 is1Var2 = new vu2(vu2Var.a, true, vu2Var.c, qu2Var2).k().f;
            Object objG6 = is1Var2.g(zu2.a);
            if (objG6 == null) {
                objG6 = null;
            }
            Collection collection = (Collection) objG6;
            if (collection == null || collection.isEmpty()) {
                Object objG7 = is1Var2.g(zu2.C);
                if (objG7 == null) {
                    objG7 = null;
                }
                Collection collection2 = (Collection) objG7;
                if (collection2 == null || collection2.isEmpty()) {
                    Object objG8 = is1Var2.g(cv2Var);
                    if (objG8 == null) {
                        objG8 = null;
                    }
                    CharSequence charSequence = (CharSequence) objG8;
                    if (charSequence == null || charSequence.length() == 0) {
                        string = resources.getString(2131624614);
                    }
                }
            }
            objG = string;
        }
        return (String) objG;
    }

    public static final af E(vu2 vu2Var) {
        Object objG = vu2Var.d.f.g(zu2.G);
        if (objG == null) {
            objG = null;
        }
        af afVar = (af) objG;
        Object objG2 = vu2Var.d.f.g(zu2.C);
        if (objG2 == null) {
            objG2 = null;
        }
        List list = (List) objG2;
        return afVar == null ? list != null ? (af) qx.r0(list) : null : afVar;
    }

    public static Object F(String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 34) {
            return p1.d(str, bundle);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (n3.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static final boolean G(vu2 vu2Var, Resources resources) {
        if (w7.T(vu2Var)) {
            return false;
        }
        qu2 qu2Var = vu2Var.d;
        if (qu2Var.h) {
            return true;
        }
        Object objG = qu2Var.f.g(zu2.a);
        if (objG == null) {
            objG = null;
        }
        List list = (List) objG;
        return !((list != null ? (String) qx.r0(list) : null) == null && E(vu2Var) == null && D(vu2Var, resources) == null && !C(vu2Var)) && H(vu2Var);
    }

    public static final boolean H(vu2 vu2Var) {
        if (!vu2Var.o()) {
            List listI = vu2Var.i((4 & 1) != 0 ? !vu2Var.b : false, (4 & 2) == 0);
            int size = listI.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (jo3.o((vu2) listI.get(i2))) {
                }
            }
            tb1 tb1VarU = vu2Var.c.u();
            while (true) {
                if (tb1VarU == null) {
                    tb1VarU = null;
                    break;
                }
                qu2 qu2VarW = tb1VarU.w();
                if (qu2VarW != null && qu2VarW.h) {
                    break;
                }
                tb1VarU = tb1VarU.u();
            }
            return !(tb1VarU != null);
        }
        return false;
    }

    public static final int I(fe1 fe1Var) {
        return fe1Var.l + fe1Var.m;
    }

    public static final bq1 J(bq1 bq1Var, boolean z2, qr1 qr1Var, o11 o11Var, boolean z3, no2 no2Var, cs0 cs0Var) {
        bq1 bq1VarD;
        if (o11Var != null) {
            bq1VarD = new wt2(z2, qr1Var, o11Var, z3, no2Var, cs0Var);
        } else if (o11Var == null) {
            bq1VarD = new wt2(z2, qr1Var, null, z3, no2Var, cs0Var);
        } else {
            yp1 yp1Var = yp1.a;
            bq1VarD = qr1Var != null ? l11.a(yp1Var, qr1Var, o11Var).d(new wt2(z2, qr1Var, null, z3, no2Var, cs0Var)) : lr.t(yp1Var, new xt2(o11Var, z2, z3, no2Var, cs0Var));
        }
        return bq1Var.d(bq1VarD);
    }

    public static final bq1 K(boolean z2, qr1 qr1Var, boolean z3, no2 no2Var, ns0 ns0Var) {
        return ep1.a.d(new ji3(z2, qr1Var, z3, no2Var, ns0Var));
    }

    public static final bq1 L(mi3 mi3Var, mo2 mo2Var, boolean z2, no2 no2Var, cs0 cs0Var) {
        if (mo2Var != null) {
            return new qk3(mi3Var, null, mo2Var, z2, no2Var, cs0Var);
        }
        if (mo2Var == null) {
            return new qk3(mi3Var, null, null, z2, no2Var, cs0Var);
        }
        return lr.t(yp1.a, new ki3(mo2Var, mi3Var, z2, no2Var, cs0Var));
    }

    public static final int M(float f2, float[] fArr, int i2) {
        float f3 = f2 >= 0.0f ? f2 : 0.0f;
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (Math.abs(f3 - f2) > 1.05E-6f) {
            f3 = Float.NaN;
        }
        fArr[i2] = f3;
        return !Float.isNaN(f3) ? 1 : 0;
    }

    public static final ed a(float f2, float f3) {
        return new ed(Float.valueOf(f2), rn.f1, Float.valueOf(f3), 8);
    }

    public static final void b(boolean z2, cs0 cs0Var, nv0 nv0Var, int i2) {
        int i3;
        nv0Var.b0(-361453782);
        if ((i2 & 6) == 0) {
            i3 = (nv0Var.g(z2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= nv0Var.h(cs0Var) ? 32 : 16;
        }
        int i4 = 0;
        if (nv0Var.R(i3 & 1, (i3 & 19) != 18)) {
            Object objA = jj1.a(nv0Var);
            if (objA == null) {
                nv0Var.a0(535274673);
                objA = kj1.a(nv0Var);
            } else {
                nv0Var.a0(535271790);
            }
            nv0Var.p(false);
            if (objA == null) {
                c.q("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean zF = nv0Var.f(objA);
            Object objO = nv0Var.O();
            Object obj = c20.a;
            if (zF || objO == obj) {
                mv1 mv1Var = objA instanceof mv1 ? (mv1) objA : null;
                lv1 navigationEventDispatcher = mv1Var != null ? mv1Var.getNavigationEventDispatcher() : null;
                yy1 yy1Var = objA instanceof yy1 ? (yy1) objA : null;
                objO = new uk(navigationEventDispatcher, yy1Var != null ? yy1Var.getOnBackPressedDispatcher() : null);
                nv0Var.j0(objO);
            }
            Object obj2 = (uk) objO;
            long j2 = nv0Var.T;
            boolean zF2 = nv0Var.f(obj2) | nv0Var.e(j2);
            Object objO2 = nv0Var.O();
            Object obj3 = objO2;
            if (zF2 || objO2 == obj) {
                c10 c10Var = new c10(new vk(j2, objA));
                c10Var.c = new v3(23);
                nv0Var.j0(c10Var);
                obj3 = c10Var;
            }
            Object obj4 = (c10) obj3;
            nv0Var.a0(-585307852);
            boolean zH = nv0Var.h(obj4) | ((i3 & 112) == 32);
            Object objO3 = nv0Var.O();
            if (zH || objO3 == obj) {
                objO3 = new u1(5, obj4, cs0Var);
                nv0Var.j0(objO3);
            }
            rn.t((cs0) objO3, nv0Var);
            int i5 = i3;
            Boolean boolValueOf = Boolean.valueOf(z2);
            int i6 = i5 & 14;
            boolean zH2 = nv0Var.h(obj4) | (i6 == 4);
            Object objO4 = nv0Var.O();
            if (zH2 || objO4 == obj) {
                objO4 = new wk(i4, obj4, z2);
                nv0Var.j0(objO4);
            }
            lq.i(boolValueOf, obj4, null, (ns0) objO4, nv0Var, i6);
            boolean zH3 = nv0Var.h(obj2) | nv0Var.h(obj4);
            Object objO5 = nv0Var.O();
            if (zH3 || objO5 == obj) {
                objO5 = new i(6, obj2, obj4);
                nv0Var.j0(objO5);
            }
            rn.h(obj2, obj4, (ns0) objO5, nv0Var);
            nv0Var.p(false);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new xk(z2, cs0Var, i2, i4);
        }
    }

    public static final void c(String str, String str2, String str3, cs0 cs0Var, nv0 nv0Var, int i2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        nv0Var.b0(2124104201);
        int i3 = (nv0Var.f(str) ? 4 : 2) | i2 | (nv0Var.f(str2) ? 32 : 16) | (nv0Var.f(str3) ? 256 : 128) | (nv0Var.h(cs0Var) ? 2048 : 1024);
        int i4 = 1;
        if (nv0Var.R(i3 & 1, (i3 & 1171) != 1170)) {
            m(str, gq.N(1464974530, new my0(str2, cs0Var, str3, i4), nv0Var), nv0Var, (i3 & 14) | 48);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new ul(str, str2, str3, cs0Var, i2, 1);
        }
    }

    public static final void d(final cs0 cs0Var, bq1 bq1Var, final boolean z2, z13 z13Var, m01 m01Var, final d00 d00Var, nv0 nv0Var, final int i2) {
        final bq1 bq1Var2;
        final z13 z13Var2;
        final m01 m01Var2;
        z13 z13VarA;
        int i3;
        m01 m01Var3;
        bq1 bq1Var3;
        int i4;
        m01 m01Var4;
        nv0Var.b0(-399178234);
        int i5 = i2 | (nv0Var.h(cs0Var) ? 4 : 2) | 48 | (nv0Var.g(z2) ? 256 : 128) | 205824;
        if (nv0Var.R(i5 & 1, (599187 & i5) != 599186)) {
            nv0Var.W();
            if ((i2 & 1) == 0 || nv0Var.A()) {
                z13VarA = g23.a(cl3.r0, nv0Var);
                fy fyVar = (fy) nv0Var.j(hy.a);
                m01 m01Var5 = fyVar.g0;
                if (m01Var5 == null) {
                    i3 = i5;
                    m01Var3 = new m01(hy.d(fyVar, t), hy.d(fyVar, y), wx.b(v, hy.d(fyVar, u)), wx.b(x, hy.d(fyVar, w)));
                    fyVar.g0 = m01Var3;
                } else {
                    i3 = i5;
                    m01Var3 = m01Var5;
                }
                bq1Var3 = yp1.a;
                i4 = i3 & (-64513);
                m01Var4 = m01Var3;
            } else {
                nv0Var.U();
                z13VarA = z13Var;
                m01Var4 = m01Var;
                i4 = i5 & (-64513);
                bq1Var3 = bq1Var;
            }
            nv0Var.q();
            r(cs0Var, bq1Var3, z2, z13VarA, m01Var4, d00Var, nv0Var, (i4 & 896) | (i4 & 14) | 196656 | 14155776);
            z13Var2 = z13VarA;
            m01Var2 = m01Var4;
            bq1Var2 = bq1Var3;
        } else {
            nv0Var.U();
            bq1Var2 = bq1Var;
            z13Var2 = z13Var;
            m01Var2 = m01Var;
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new rs0(bq1Var2, z2, z13Var2, m01Var2, d00Var, i2) { // from class: o01
                public final /* synthetic */ bq1 g;
                public final /* synthetic */ boolean h;
                public final /* synthetic */ z13 i;
                public final /* synthetic */ m01 j;
                public final /* synthetic */ d00 k;

                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = jo3.y(1572865);
                    gv3.d(this.f, this.g, this.h, this.i, this.j, this.k, (nv0) obj, iY);
                    return dm3.a;
                }
            };
        }
    }

    public static final void e(jy1 jy1Var, h5 h5Var, d00 d00Var, nv0 nv0Var, int i2) {
        int i3;
        nv0Var.b0(-1090171650);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? nv0Var.f(jy1Var) : nv0Var.h(jy1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= nv0Var.f(h5Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= nv0Var.h(d00Var) ? 256 : 128;
        }
        boolean z2 = true;
        if (nv0Var.R(i3 & 1, (i3 & 147) != 146)) {
            boolean z3 = (i3 & 112) == 32;
            if ((i3 & 14) != 4 && ((i3 & 8) == 0 || !nv0Var.f(jy1Var))) {
                z2 = false;
            }
            boolean z4 = z3 | z2;
            Object objO = nv0Var.O();
            if (z4 || objO == c20.a) {
                objO = new gx0(h5Var, jy1Var);
                nv0Var.j0(objO);
            }
            xa.a((gx0) objO, null, new vb2(false, zs2.f, false, 0), d00Var, nv0Var, ((i3 << 3) & 7168) | 384, 2);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new eb(jy1Var, h5Var, d00Var, i2, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(defpackage.cs0 r28, defpackage.bq1 r29, boolean r30, defpackage.m01 r31, defpackage.z13 r32, defpackage.rs0 r33, defpackage.nv0 r34, int r35, int r36) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gv3.f(cs0, bq1, boolean, m01, z13, rs0, nv0, int, int):void");
    }

    public static final void g(bq1 bq1Var, cs0 cs0Var, boolean z2, z13 z13Var, m01 m01Var, rs0 rs0Var, nv0 nv0Var, int i2) {
        int i3;
        nv0Var.b0(-1134296466);
        if ((i2 & 6) == 0) {
            i3 = (nv0Var.f(bq1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= nv0Var.h(cs0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= nv0Var.g(z2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= nv0Var.f(z13Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= nv0Var.f(m01Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= nv0Var.f(null) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= nv0Var.h(rs0Var) ? 1048576 : 524288;
        }
        int i4 = i3;
        if (nv0Var.R(i4 & 1, (599187 & i4) != 599186)) {
            nv0Var.a0(977045485);
            Object objO = nv0Var.O();
            if (objO == c20.a) {
                objO = nc2.e(nv0Var);
            }
            qr1 qr1Var = (qr1) objO;
            nv0Var.p(false);
            ry0 ry0Var = w41.a;
            bq1 bq1VarD = bq1Var.d(ep1.a);
            float f2 = cl3.s0;
            long jB = uq.b(cl3.t0 + f2 + f2, 40.0f);
            gm0 gm0Var = j43.a;
            bq1 bq1VarR = lr.r(rn.x(v(gq.t(j43.l(bq1VarD, md0.b(jB), md0.a(jB)), z13Var), z2 ? m01Var.a : m01Var.c, z13Var), qr1Var, ko2.a(0.0f, 7, 0L, false), z2, new no2(0), cs0Var, 8));
            cn1 cn1VarD = eo.d(f5.k, false);
            int iC = lq.C(nv0Var);
            n52 n52VarL = nv0Var.l();
            bq1 bq1VarM = lr.M(nv0Var, bq1VarR);
            w10.c.getClass();
            nv0Var.d0();
            if (nv0Var.S) {
                nv0Var.k(tb1.Y);
            } else {
                nv0Var.m0();
            }
            y02.F(f5.E, nv0Var, cn1VarD);
            y02.F(f5.D, nv0Var, n52VarL);
            z00 z00Var = f5.F;
            if (nv0Var.S || !s51.n(nv0Var.O(), Integer.valueOf(iC))) {
                nc2.q(iC, nv0Var, iC, z00Var);
            }
            y02.F(f5.C, nv0Var, bq1VarM);
            vr.c(nc2.f(z2 ? m01Var.b : m01Var.d, t30.a), rs0Var, nv0Var, ((i4 >> 15) & 112) | 8);
            nv0Var.p(true);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new gm(bq1Var, cs0Var, z2, z13Var, m01Var, rs0Var, i2, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final defpackage.bq1 r15, long r16, defpackage.z13 r18, boolean r19, final defpackage.d00 r20, defpackage.nv0 r21, final int r22, final int r23) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gv3.h(bq1, long, z13, boolean, d00, nv0, int, int):void");
    }

    public static final void i(String str, d00 d00Var, nv0 nv0Var, int i2) {
        str.getClass();
        nv0Var.b0(1116684773);
        int i3 = (nv0Var.f(str) ? 4 : 2) | i2;
        int i4 = 1;
        if (nv0Var.R(i3 & 1, (i3 & 19) != 18)) {
            gm0 gm0Var = j43.c;
            b22 b22Var = new b22(24.0f, 24.0f, 24.0f, 24.0f);
            jj jjVar = new jj(16.0f, true, new c(i4));
            boolean z2 = (i3 & 14) == 4;
            Object objO = nv0Var.O();
            if (z2 || objO == c20.a) {
                objO = new i(20, str, d00Var);
                nv0Var.j0(objO);
            }
            dn0.a(gm0Var, null, b22Var, jjVar, (ns0) objO, nv0Var, 3462, 2);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new y7(i2, 17, str, d00Var);
        }
    }

    public static final void j(String str, nv0 nv0Var, int i2) {
        str.getClass();
        nv0Var.b0(826132501);
        int i3 = i2 | (nv0Var.f(str) ? 4 : 2);
        if (nv0Var.R(i3 & 1, (i3 & 3) != 2)) {
            mg3.b(str, null, 0L, 0L, xq0.k, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var.j(ql3.a)).d, nv0Var, (i3 & 14) | 1572864, 0, 131006);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new z71(i2, str);
        }
    }

    public static final void k(nm2 nm2Var, cs0 cs0Var, boolean z2, nv0 nv0Var, int i2) {
        nm2 nm2Var2;
        cs0 cs0Var2;
        boolean z3;
        long j2;
        nm2Var.getClass();
        cs0Var.getClass();
        nv0Var.b0(896478853);
        int i3 = (nv0Var.f(nm2Var) ? 4 : 2) | i2 | (nv0Var.h(cs0Var) ? 32 : 16) | (nv0Var.g(z2) ? 256 : 128);
        if (nv0Var.R(i3 & 1, (i3 & 147) != 146)) {
            Object objO = nv0Var.O();
            if (objO == c20.a) {
                objO = b32.w(Boolean.FALSE);
                nv0Var.j0(objO);
            }
            os1 os1Var = (os1) objO;
            bq1 bq1VarC = j43.c(yp1.a, 1.0f);
            to2 to2VarA = uo2.a(24.0f);
            if (nm2Var.equals(mm2.a)) {
                nv0Var.a0(-1772236267);
                j2 = ((fy) nv0Var.j(hy.a)).c;
                nv0Var.p(false);
            } else if ((nm2Var instanceof km2) || (nm2Var instanceof jm2)) {
                nv0Var.a0(-1772232845);
                j2 = ((fy) nv0Var.j(hy.a)).y;
                nv0Var.p(false);
            } else {
                nv0Var.a0(-1772230891);
                j2 = ((fy) nv0Var.j(hy.a)).F;
                nv0Var.p(false);
            }
            nm2Var2 = nm2Var;
            cs0Var2 = cs0Var;
            z3 = z2;
            h(bq1VarC, j2, to2VarA, false, gq.N(-851310922, new ov(nm2Var, cs0Var, z2, os1Var, 1), nv0Var), nv0Var, 24582, 8);
        } else {
            nm2Var2 = nm2Var;
            cs0Var2 = cs0Var;
            z3 = z2;
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new zv(nm2Var2, cs0Var2, z3, i2);
        }
    }

    public static final boolean l(os1 os1Var) {
        return ((Boolean) os1Var.getValue()).booleanValue();
    }

    public static final void m(String str, d00 d00Var, nv0 nv0Var, int i2) {
        int i3;
        nv0 nv0Var2;
        str.getClass();
        nv0Var.b0(-1503666184);
        if ((i2 & 6) == 0) {
            i3 = (nv0Var.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= nv0Var.h(d00Var) ? 32 : 16;
        }
        if (nv0Var.R(i3 & 1, (i3 & 19) != 18)) {
            nv0Var2 = nv0Var;
            h(j43.c(yp1.a, 1.0f), 0L, uo2.a(24.0f), false, gq.N(180501607, new w91(3, str, d00Var), nv0Var), nv0Var2, 24582, 10);
        } else {
            nv0Var2 = nv0Var;
            nv0Var2.U();
        }
        xj2 xj2VarT = nv0Var2.t();
        if (xj2VarT != null) {
            xj2VarT.d = new xc(i2, 5, str, d00Var);
        }
    }

    public static final void n(final jy1 jy1Var, final boolean z2, final sl2 sl2Var, final boolean z3, long j2, final float f2, final bq1 bq1Var, nv0 nv0Var, final int i2) {
        int i3;
        final long j3;
        int i4;
        long j4;
        final boolean z4;
        nv0Var.b0(-466280168);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? nv0Var.f(jy1Var) : nv0Var.h(jy1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= nv0Var.g(z2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= nv0Var.d(sl2Var.ordinal()) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= nv0Var.g(z3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= 8192;
        }
        if ((1572864 & i2) == 0) {
            i3 |= nv0Var.f(bq1Var) ? 1048576 : 524288;
        }
        if (nv0Var.R(i3 & 1, (533651 & i3) != 533650)) {
            nv0Var.W();
            if ((i2 & 1) == 0 || nv0Var.A()) {
                i4 = i3 & (-57345);
                j4 = 9205357640488583168L;
            } else {
                nv0Var.U();
                i4 = i3 & (-57345);
                j4 = j2;
            }
            nv0Var.q();
            sl2 sl2Var2 = sl2.g;
            sl2 sl2Var3 = sl2.f;
            if (z2) {
                cv2 cv2Var = lu2.a;
                z4 = (sl2Var == sl2Var3 && !z3) || (sl2Var == sl2Var2 && z3);
            } else {
                cv2 cv2Var2 = lu2.a;
                z4 = (sl2Var != sl2Var3 || z3) && !(sl2Var == sl2Var2 && z3);
            }
            sm smVar = z4 ? rn.b : rn.a;
            int i5 = i4 & 14;
            boolean zG = (i5 == 4 || ((i4 & 8) != 0 && nv0Var.h(jy1Var))) | ((i4 & 112) == 32) | nv0Var.g(z4);
            Object objO = nv0Var.O();
            if (zG || objO == c20.a) {
                objO = new ns0() { // from class: gb
                    @Override // defpackage.ns0
                    public final Object h(Object obj) {
                        dv2 dv2Var = (dv2) obj;
                        long jA = jy1Var.a();
                        dv2Var.a(lu2.a, new ku2(z2 ? fx0.g : fx0.h, jA, z4 ? ju2.f : ju2.h, (9223372034707292159L & jA) != 9205357640488583168L));
                        return dm3.a;
                    }
                };
                nv0Var.j0(objO);
            }
            final bq1 bq1VarA = su2.a(bq1Var, false, (ns0) objO);
            final oq3 oq3Var = (oq3) nv0Var.j(s20.t);
            long j5 = j4;
            sm smVar2 = smVar;
            j3 = j5;
            e(jy1Var, smVar2, gq.N(1365123137, new rs0() { // from class: hb
                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    nv0 nv0Var2 = (nv0) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (nv0Var2.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                        he2 he2VarA = s20.t.a(oq3Var);
                        final long j6 = j3;
                        final boolean z5 = z4;
                        final bq1 bq1Var2 = bq1VarA;
                        final jy1 jy1Var2 = jy1Var;
                        vr.c(he2VarA, gq.N(1260045569, new rs0() { // from class: jb
                            @Override // defpackage.rs0
                            public final Object f(Object obj3, Object obj4) {
                                nv0 nv0Var3 = (nv0) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                final int i6 = 1;
                                final int i7 = 0;
                                if (nv0Var3.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    long j7 = j6;
                                    boolean z6 = z5;
                                    bq1 bq1Var3 = bq1Var2;
                                    final jy1 jy1Var3 = jy1Var2;
                                    zj zjVar = c20.a;
                                    if (j7 != 9205357640488583168L) {
                                        nv0Var3.a0(3458246);
                                        gj gjVar = z6 ? vm1.f : vm1.e;
                                        bq1 bq1VarJ = j43.j(bq1Var3, md0.b(j7), md0.a(j7), 0.0f, 0.0f, 12);
                                        dp2 dp2VarA = cp2.a(gjVar, f5.p, nv0Var3, 0);
                                        int iHashCode = Long.hashCode(nv0Var3.T);
                                        n52 n52VarL = nv0Var3.l();
                                        bq1 bq1VarM = lr.M(nv0Var3, bq1VarJ);
                                        w10.c.getClass();
                                        nv0Var3.d0();
                                        if (nv0Var3.S) {
                                            nv0Var3.k(tb1.Y);
                                        } else {
                                            nv0Var3.m0();
                                        }
                                        y02.F(f5.E, nv0Var3, dp2VarA);
                                        y02.F(f5.D, nv0Var3, n52VarL);
                                        y02.F(f5.F, nv0Var3, Integer.valueOf(iHashCode));
                                        y02.C(nv0Var3);
                                        y02.F(f5.C, nv0Var3, bq1VarM);
                                        boolean zH = nv0Var3.h(jy1Var3);
                                        Object objO2 = nv0Var3.O();
                                        if (zH || objO2 == zjVar) {
                                            objO2 = new cs0() { // from class: kb
                                                @Override // defpackage.cs0
                                                public final Object a() {
                                                    int i8 = i7;
                                                    jy1 jy1Var4 = jy1Var3;
                                                    switch (i8) {
                                                        case 0:
                                                            return Boolean.valueOf((9223372034707292159L & jy1Var4.a()) != 9205357640488583168L);
                                                        default:
                                                            return Boolean.valueOf((9223372034707292159L & jy1Var4.a()) != 9205357640488583168L);
                                                    }
                                                }
                                            };
                                            nv0Var3.j0(objO2);
                                        }
                                        gv3.o(yp1.a, (cs0) objO2, z6, nv0Var3, 6);
                                        nv0Var3.p(true);
                                        nv0Var3.p(false);
                                    } else {
                                        nv0Var3.a0(4389176);
                                        boolean zH2 = nv0Var3.h(jy1Var3);
                                        Object objO3 = nv0Var3.O();
                                        if (zH2 || objO3 == zjVar) {
                                            objO3 = new cs0() { // from class: kb
                                                @Override // defpackage.cs0
                                                public final Object a() {
                                                    int i8 = i6;
                                                    jy1 jy1Var4 = jy1Var3;
                                                    switch (i8) {
                                                        case 0:
                                                            return Boolean.valueOf((9223372034707292159L & jy1Var4.a()) != 9205357640488583168L);
                                                        default:
                                                            return Boolean.valueOf((9223372034707292159L & jy1Var4.a()) != 9205357640488583168L);
                                                    }
                                                }
                                            };
                                            nv0Var3.j0(objO3);
                                        }
                                        gv3.o(bq1Var3, (cs0) objO3, z6, nv0Var3, 0);
                                        nv0Var3.p(false);
                                    }
                                } else {
                                    nv0Var3.U();
                                }
                                return dm3.a;
                            }
                        }, nv0Var2), nv0Var2, 56);
                    } else {
                        nv0Var2.U();
                    }
                    return dm3.a;
                }
            }, nv0Var), nv0Var, i5 | 384);
        } else {
            nv0Var.U();
            j3 = j2;
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            final long j6 = j3;
            xj2VarT.d = new rs0() { // from class: ib
                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    gv3.n(jy1Var, z2, sl2Var, z3, j6, f2, bq1Var, (nv0) obj, jo3.y(i2 | 1));
                    return dm3.a;
                }
            };
        }
    }

    public static final void o(bq1 bq1Var, cs0 cs0Var, boolean z2, nv0 nv0Var, int i2) {
        int i3;
        nv0Var.b0(2111672474);
        if ((i2 & 6) == 0) {
            i3 = (nv0Var.f(bq1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | (nv0Var.h(cs0Var) ? 32 : 16) | (nv0Var.g(z2) ? 256 : 128);
        int i5 = 0;
        if (nv0Var.R(i4 & 1, (i4 & 147) != 146)) {
            cv2 cv2Var = lu2.a;
            oz2.g(nv0Var, lr.t(j43.l(bq1Var, 25.0f, 25.0f), new mb(i5, cs0Var, z2)));
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new lb(i2, cs0Var, bq1Var, z2);
        }
    }

    public static final void p(d00 d00Var, nv0 nv0Var, int i2) {
        nv0 nv0Var2;
        nv0Var.b0(-196123736);
        int i3 = 2;
        if (nv0Var.R(i2 & 1, (i2 & 3) != 2)) {
            nv0Var2 = nv0Var;
            h(j43.c(yp1.a, 1.0f), 0L, uo2.a(24.0f), false, gq.N(-418890407, new l13(d00Var, i3), nv0Var), nv0Var2, 24582, 10);
        } else {
            nv0Var2 = nv0Var;
            nv0Var2.U();
        }
        xj2 xj2VarT = nv0Var2.t();
        if (xj2VarT != null) {
            xj2VarT.d = new w4(d00Var, i2, i3);
        }
    }

    public static final void q(String str, String str2, nv0 nv0Var, int i2) {
        String str3;
        nv0 nv0Var2 = nv0Var;
        str.getClass();
        str2.getClass();
        nv0Var2.b0(-2111913308);
        int i3 = i2 | (nv0Var2.f(str) ? 4 : 2) | (nv0Var2.f(str2) ? 32 : 16);
        if (nv0Var2.R(i3 & 1, (i3 & 19) != 18)) {
            bq1 bq1VarC = j43.c(yp1.a, 1.0f);
            dp2 dp2VarA = cp2.a(n92.b, f5.p, nv0Var2, 0);
            int iHashCode = Long.hashCode(nv0Var2.T);
            n52 n52VarL = nv0Var2.l();
            bq1 bq1VarM = lr.M(nv0Var2, bq1VarC);
            w10.c.getClass();
            nv0Var2.d0();
            if (nv0Var2.S) {
                nv0Var2.k(tb1.Y);
            } else {
                nv0Var2.m0();
            }
            y02.F(f5.E, nv0Var2, dp2VarA);
            y02.F(f5.D, nv0Var2, n52VarL);
            y02.F(f5.F, nv0Var2, Integer.valueOf(iHashCode));
            y02.C(nv0Var2);
            y02.F(f5.C, nv0Var2, bq1VarM);
            r93 r93Var = ql3.a;
            mg3.b(str, new jc1(1.0f, true), ((fy) nv0Var2.j(hy.a)).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var2.j(r93Var)).k, nv0Var, i3 & 14, 0, 131064);
            str3 = str2;
            mg3.b(str3, null, 0L, 0L, xq0.i, null, 0L, new ld3(6), 0L, 0, false, 0, 0, ((ol3) nv0Var.j(r93Var)).k, nv0Var, ((i3 >> 3) & 14) | 1572864, 0, 129982);
            nv0Var2 = nv0Var;
            nv0Var2.p(true);
        } else {
            str3 = str2;
            nv0Var2.U();
        }
        xj2 xj2VarT = nv0Var2.t();
        if (xj2VarT != null) {
            xj2VarT.d = new a81(str, str3, i2);
        }
    }

    public static final void r(cs0 cs0Var, bq1 bq1Var, boolean z2, z13 z13Var, m01 m01Var, d00 d00Var, nv0 nv0Var, int i2) {
        cs0 cs0Var2;
        int i3;
        nv0Var.b0(-171935091);
        if ((i2 & 6) == 0) {
            cs0Var2 = cs0Var;
            i3 = (nv0Var.h(cs0Var2) ? 4 : 2) | i2;
        } else {
            cs0Var2 = cs0Var;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= nv0Var.f(bq1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= nv0Var.g(z2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= nv0Var.f(z13Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= nv0Var.f(m01Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= nv0Var.f(null) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= nv0Var.f(null) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= nv0Var.h(d00Var) ? 8388608 : 4194304;
        }
        int i4 = 0;
        if (nv0Var.R(i3 & 1, (4793491 & i3) != 4793490)) {
            Object objO = nv0Var.O();
            if (objO == c20.a) {
                objO = new n20(12);
                nv0Var.j0(objO);
            }
            bq1 bq1VarA = su2.a(bq1Var, false, (ns0) objO);
            long j2 = z2 ? m01Var.a : m01Var.c;
            int i5 = i3 & 8078;
            int i6 = i3 << 9;
            cs0 cs0Var3 = cs0Var2;
            hb3.c(cs0Var3, bq1VarA, z2, z13Var, j2, z2 ? m01Var.b : m01Var.d, 0.0f, null, null, gq.N(669231714, new p01(d00Var, i4), nv0Var), nv0Var, (i6 & 1879048192) | i5 | (i6 & 234881024), 192);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new gm(cs0Var, bq1Var, z2, z13Var, m01Var, d00Var, i2, 4);
        }
    }

    public static final int s(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' <= c2 && c2 < 'G') {
            return c2 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c2);
    }

    public static final boolean t(vu2 vu2Var) {
        qu2 qu2VarK = vu2Var.k();
        return !qu2VarK.f.c(zu2.j);
    }

    public static bq1 u(bq1 bq1Var, hg1 hg1Var) {
        return bq1Var.d(new hl(0L, hg1Var, cl3.q0, 1));
    }

    public static final bq1 v(bq1 bq1Var, long j2, z13 z13Var) {
        return bq1Var.d(new hl(j2, null, z13Var, 2));
    }

    public static bq1 x(int i2, cs0 cs0Var, bq1 bq1Var, boolean z2) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        bq1Var.getClass();
        cs0Var.getClass();
        return lr.t(bq1Var, new mb(z2, cs0Var));
    }

    public static final ue y(ue ueVar) {
        ue ueVarC = ueVar.c();
        int iB = ueVarC.b();
        for (int i2 = 0; i2 < iB; i2++) {
            ueVarC.e(ueVar.a(i2), i2);
        }
        return ueVarC;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.g9 z(defpackage.oq r30, float r31) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gv3.z(oq, float):g9");
    }
}
