package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.net.Uri;
import android.os.Trace;
import android.text.format.Formatter;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationResponse;
import android.widget.TextView;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class w7 {
    public static final float A;
    public static final gy B;
    public static final float C;
    public static final gy D;
    public static final float E;
    public static final pl3 F;
    public static final gy G;
    public static final gy H;
    public static final gy I;
    public static final float J;
    public static final gy K;
    public static final gy L;
    public static final gy M;
    public static final float N;
    public static final gy O;
    public static final gy P;
    public static final h01 Q;
    public static final gy R;
    public static final float S;
    public static final gy T;
    public static final float U;
    public static final float V;
    public static final pl3 W;
    public static final gy X;
    public static final float Y;
    public static final gy Z;
    public static final gy a0;
    public static final u0 b;
    public static final b23 b0;
    public static final d00 c;
    public static final gy c0;
    public static final d00 d;
    public static final float d0;
    public static final d00 e;
    public static final StackTraceElement[] e0;
    public static final jk2 f0;
    public static final Object g0;
    public static final db3 h0;
    public static final db3 i0;
    public static final gy u;
    public static final float v;
    public static final float w;
    public static final gy x;
    public static final float y;
    public static final gy z;
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final d00 f = new d00(1350650373, new q00(9), false);
    public static final d00 g = new d00(424476540, new q00(10), false);
    public static final d00 h = new d00(-1283433968, new q00(11), false);
    public static final d00 i = new d00(1856965575, new q00(12), false);
    public static final d00 j = new d00(-719333650, new q00(13), false);
    public static final d00 k = new d00(12841805, new q00(14), false);
    public static final d00 l = new d00(1271630660, new r00(7), false);
    public static final d00 m = new d00(268322199, new q00(8), false);
    public static final d00 n = new d00(-2009966813, new r00(4), false);
    public static final d00 o = new d00(-149038299, new r00(5), false);
    public static final d00 p = new d00(762666655, new r00(6), false);
    public static final int[] q = new int[0];
    public static final long[] r = new long[0];
    public static final Object[] s = new Object[0];
    public static final b23 t = b23.l;

    static {
        int i2 = 15;
        b = new u0(i2);
        c = new d00(1743592141, new z1(i2), false);
        d = new d00(498435626, new p00(i2), false);
        int i3 = 3;
        e = new d00(208576245, new r00(i3), false);
        gy gyVar = gy.m;
        u = gyVar;
        v = 0.38f;
        w = 8.0f;
        x = gyVar;
        y = 0.12f;
        z = gyVar;
        A = 0.12f;
        gy gyVar2 = gy.t;
        B = gyVar2;
        C = 1.0f;
        D = gy.p;
        E = 1.0f;
        pl3 pl3Var = pl3.j;
        F = pl3Var;
        gy gyVar3 = gy.l;
        G = gyVar3;
        gy gyVar4 = gy.n;
        H = gyVar4;
        I = gyVar;
        J = 0.38f;
        K = gyVar3;
        L = gy.q;
        M = gyVar;
        N = 0.38f;
        O = gyVar3;
        P = gyVar4;
        Q = new h01(1);
        R = gy.u;
        S = 80.0f;
        T = gyVar;
        U = 0.38f;
        V = 0.12f;
        W = pl3Var;
        X = gy.o;
        Y = 1.0f;
        Z = gyVar2;
        a0 = gyVar3;
        b0 = b23.i;
        c0 = gyVar;
        d0 = 18.0f;
        e0 = new StackTraceElement[0];
        f0 = new jk2(0.0f, 0.0f, 10.0f, 10.0f);
        g0 = new Object();
        h0 = new db3(i3);
        i0 = new db3(i2);
    }

    public static final void A(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            c.i(nc2.h("index (", i2, ") is out of bound of [0, ", i3, ")"));
        }
    }

    public static final bq1 B(bq1 bq1Var, float f2) {
        return f2 == 1.0f ? bq1Var : vm1.A(bq1Var, 0.0f, 0.0f, f2, 0.0f, 0.0f, 0L, null, true, 0L, 0L, 1044475);
    }

    public static final boolean C(k93 k93Var, int i2, j0 j0Var, boolean z2) {
        boolean z3;
        synchronized (g0) {
            try {
                int i3 = k93Var.d;
                if (i3 == i2) {
                    k93Var.c = j0Var;
                    z3 = true;
                    if (z2) {
                        k93Var.e++;
                    }
                    k93Var.d = i3 + 1;
                } else {
                    z3 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }

    public static final int D(int i2, int i3, int[] iArr) {
        iArr.getClass();
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else {
                if (i7 <= i3) {
                    return i6;
                }
                i4 = i6 - 1;
            }
        }
        return ~i5;
    }

    public static final int E(long[] jArr, int i2, long j2) {
        jArr.getClass();
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            long j3 = jArr[i5];
            if (j3 < j2) {
                i4 = i5 + 1;
            } else {
                if (j3 <= j2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static final gk3 F(gk3 gk3Var, Object obj, Object obj2, String str, nv0 nv0Var, int i2) {
        int i3 = (i2 & 14) ^ 6;
        boolean z2 = true;
        boolean z3 = (i3 > 4 && nv0Var.f(gk3Var)) || (i2 & 6) == 4;
        Object objO = nv0Var.O();
        Object obj3 = c20.a;
        if (z3 || objO == obj3) {
            objO = new gk3(new ps1(obj), gk3Var, gk3Var.c + " > " + str);
            nv0Var.j0(objO);
        }
        gk3 gk3Var2 = (gk3) objO;
        if ((i3 <= 4 || !nv0Var.f(gk3Var)) && (i2 & 6) != 4) {
            z2 = false;
        }
        boolean zF = nv0Var.f(gk3Var2) | z2;
        Object objO2 = nv0Var.O();
        if (zF || objO2 == obj3) {
            objO2 = new er1(29, gk3Var, gk3Var2);
            nv0Var.j0(objO2);
        }
        rn.g(gk3Var2, (ns0) objO2, nv0Var);
        if (gk3Var.g()) {
            gk3Var2.k(obj, obj2);
            return gk3Var2;
        }
        gk3Var2.r(obj2);
        gk3Var2.l.setValue(Boolean.FALSE);
        return gk3Var2;
    }

    public static final bk3 G(gk3 gk3Var, bl3 bl3Var, String str, nv0 nv0Var, int i2, int i3) {
        ak3 ak3Var;
        if ((i3 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean zF = nv0Var.f(gk3Var);
        Object objO = nv0Var.O();
        Object obj = c20.a;
        if (zF || objO == obj) {
            objO = new bk3(gk3Var, bl3Var, str);
            nv0Var.j0(objO);
        }
        bk3 bk3Var = (bk3) objO;
        boolean zF2 = nv0Var.f(gk3Var) | nv0Var.h(bk3Var);
        Object objO2 = nv0Var.O();
        if (zF2 || objO2 == obj) {
            objO2 = new ik3(0, gk3Var, bk3Var);
            nv0Var.j0(objO2);
        }
        rn.g(bk3Var, (ns0) objO2, nv0Var);
        if (gk3Var.g() && (ak3Var = (ak3) bk3Var.b.getValue()) != null) {
            gk3 gk3Var2 = bk3Var.c;
            ak3Var.f.g(ak3Var.h.h(gk3Var2.f().a()), ak3Var.h.h(gk3Var2.f().c()), (mm0) ak3Var.g.h(gk3Var2.f()));
        }
        return bk3Var;
    }

    public static final ek3 H(gk3 gk3Var, Object obj, Object obj2, mm0 mm0Var, bl3 bl3Var, nv0 nv0Var, int i2) {
        boolean zF = nv0Var.f(gk3Var);
        Object objO = nv0Var.O();
        Object obj3 = c20.a;
        if (zF || objO == obj3) {
            t63 t63VarL = jo3.l();
            ns0 ns0VarE = t63VarL != null ? t63VarL.e() : null;
            t63 t63VarS = jo3.s(t63VarL);
            try {
                ue ueVar = (ue) bl3Var.a.h(obj2);
                ueVar.d();
                objO = new ek3(gk3Var, obj, ueVar, bl3Var);
                jo3.v(t63VarL, t63VarS, ns0VarE);
                nv0Var.j0(objO);
            } catch (Throwable th) {
                jo3.v(t63VarL, t63VarS, ns0VarE);
                throw th;
            }
        }
        ek3 ek3Var = (ek3) objO;
        x(gk3Var, ek3Var, obj, obj2, mm0Var, nv0Var, 0);
        boolean zF2 = nv0Var.f(gk3Var) | nv0Var.f(ek3Var);
        Object objO2 = nv0Var.O();
        if (zF2 || objO2 == obj3) {
            objO2 = new er1(28, gk3Var, ek3Var);
            nv0Var.j0(objO2);
        }
        rn.g(ek3Var, (ns0) objO2, nv0Var);
        return ek3Var;
    }

    public static void I(c8 c8Var, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        xu2 xu2Var;
        vu2 vu2Var;
        ns0 ns0Var;
        int size = longSparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            long jKeyAt = longSparseArray.keyAt(i2);
            ViewTranslationResponse viewTranslationResponseP = s7.p(longSparseArray.get(jKeyAt));
            if (viewTranslationResponseP != null && (value = viewTranslationResponseP.getValue("android:text")) != null && (text = value.getText()) != null && (xu2Var = (xu2) c8Var.e().b((int) jKeyAt)) != null && (vu2Var = xu2Var.a) != null) {
                Object objG = vu2Var.d.f.g(pu2.l);
                if (objG == null) {
                    objG = null;
                }
                y0 y0Var = (y0) objG;
                if (y0Var != null && (ns0Var = (ns0) y0Var.b) != null) {
                }
            }
        }
    }

    public static final float J(float[] fArr, int i2, float[] fArr2, int i3) {
        int i4 = i2 * 4;
        return (fArr[i4 + 3] * fArr2[12 + i3]) + (fArr[i4 + 2] * fArr2[8 + i3]) + (fArr[i4 + 1] * fArr2[4 + i3]) + (fArr[i4] * fArr2[i3]);
    }

    public static final bq1 K(bq1 bq1Var, ns0 ns0Var) {
        return bq1Var.d(new kf0(ns0Var));
    }

    public static final bq1 L(bq1 bq1Var, ns0 ns0Var) {
        return bq1Var.d(new tf0(ns0Var));
    }

    public static final bq1 M(bq1 bq1Var, ns0 ns0Var) {
        return bq1Var.d(new uf0(ns0Var));
    }

    public static final or1 N(yu2 yu2Var, ns0 ns0Var) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            vu2 vu2VarA = yu2Var.a();
            tb1 tb1Var = vu2VarA.c;
            if (tb1Var.I() && tb1Var.H()) {
                jk2 jk2VarG = vu2VarA.g();
                or1 or1Var = new or1(48);
                k71 k71Var = new k71(13);
                k71Var.r(br.L(jk2VarG));
                Q(ns0Var, new k71(13), k71Var, or1Var, vu2VarA, vu2VarA);
                return or1Var;
            }
            or1 or1Var2 = h41.a;
            or1Var2.getClass();
            return or1Var2;
        } finally {
            Trace.endSection();
        }
    }

    public static final void O(ns0 ns0Var, k71 k71Var, k71 k71Var2, or1 or1Var, vu2 vu2Var, vu2 vu2Var2) {
        k71 k71Var3 = k71Var;
        Region region = (Region) k71Var3.g;
        k71 k71Var4 = k71Var2;
        Region region2 = (Region) k71Var4.g;
        tb1 tb1Var = vu2Var2.c;
        tb1 tb1Var2 = vu2Var2.c;
        if (!tb1Var.I() || !tb1Var2.H() || region2.isEmpty()) {
            if (vu2Var2.o()) {
                P(or1Var, vu2Var, vu2Var2);
                return;
            }
            return;
        }
        jk2 jk2VarM = vu2Var2.m();
        if (jk2VarM.f()) {
            ia0 ia0VarF = vu2Var2.f();
            if (ia0VarF == null) {
                s21 s21Var = tb1Var2.L.c;
                jk2VarM = vr.y(s21Var).c0(s21Var, false);
            } else {
                aq1 aq1Var = ((aq1) ia0VarF).f;
                Object objG = vu2Var2.d.f.g(pu2.b);
                if (objG == null) {
                    objG = null;
                }
                jk2VarM = y02.q(aq1Var, objG != null, false);
            }
        }
        m41 m41VarL = br.L(jk2VarM);
        k71Var3.r(m41VarL);
        if (region.op(region2, Region.Op.INTERSECT)) {
            int i2 = vu2Var2.f;
            vu2 vu2Var3 = vu2Var;
            if (i2 == vu2Var3.f) {
                i2 = -1;
            }
            Rect bounds = region.getBounds();
            xu2 xu2Var = new xu2(vu2Var2, new m41(bounds.left, bounds.top, bounds.right, bounds.bottom));
            or1 or1Var2 = or1Var;
            or1Var2.i(i2, xu2Var);
            List listI = vu2Var2.i((4 & 1) != 0 ? !vu2Var2.b : false, (4 & 2) == 0);
            int size = listI.size() - 1;
            while (-1 < size) {
                if (!((Boolean) ns0Var.h(listI.get(size))).booleanValue()) {
                    O(ns0Var, k71Var3, k71Var4, or1Var2, vu2Var3, (vu2) listI.get(size));
                }
                size--;
                k71Var3 = k71Var;
                k71Var4 = k71Var2;
                or1Var2 = or1Var;
                vu2Var3 = vu2Var;
            }
            if (U(vu2Var2)) {
                region2.op(m41VarL.a, m41VarL.b, m41VarL.c, m41VarL.d, Region.Op.DIFFERENCE);
            }
        }
    }

    public static final void P(or1 or1Var, vu2 vu2Var, vu2 vu2Var2) {
        tb1 tb1Var;
        vu2 vu2VarL = vu2Var2.l();
        jk2 jk2VarG = (vu2VarL == null || (tb1Var = vu2VarL.c) == null || !tb1Var.I()) ? f0 : vu2VarL.g();
        int i2 = vu2Var2.f;
        if (i2 == vu2Var.f) {
            i2 = -1;
        }
        or1Var.i(i2, new xu2(vu2Var2, br.L(jk2VarG)));
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Q(defpackage.ns0 r17, defpackage.k71 r18, defpackage.k71 r19, defpackage.or1 r20, defpackage.vu2 r21, defpackage.vu2 r22) {
        /*
            Method dump skipped, instruction units count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w7.Q(ns0, k71, k71, or1, vu2, vu2):void");
    }

    public static final k93 R(l73 l73Var) {
        k93 k93Var = l73Var.f;
        k93Var.getClass();
        return (k93) a73.t(k93Var, l73Var);
    }

    public static final int S(l73 l73Var) {
        k93 k93Var = l73Var.f;
        k93Var.getClass();
        return ((k93) a73.h(k93Var)).e;
    }

    public static final boolean T(vu2 vu2Var) {
        ex1 ex1VarD = vu2Var.d();
        is1 is1Var = vu2Var.d.f;
        return (ex1VarD != null ? ex1VarD.F1() : false) || is1Var.c(zu2.q) || is1Var.c(zu2.p);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean U(defpackage.vu2 r14) {
        /*
            boolean r0 = T(r14)
            r1 = 0
            if (r0 == 0) goto L8
            goto L5c
        L8:
            qu2 r14 = r14.d
            boolean r0 = r14.h
            if (r0 == 0) goto Lf
            goto L4f
        Lf:
            is1 r14 = r14.f
            java.lang.Object[] r0 = r14.b
            java.lang.Object[] r2 = r14.c
            long[] r14 = r14.a
            int r3 = r14.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L5c
            r4 = r1
        L1d:
            r5 = r14[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L57
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r1
        L37:
            if (r9 >= r7) goto L55
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L51
            int r10 = r4 << 3
            int r10 = r10 + r9
            r11 = r0[r10]
            r10 = r2[r10]
            cv2 r11 = (defpackage.cv2) r11
            boolean r10 = r11.c
            if (r10 == 0) goto L51
        L4f:
            r14 = 1
            return r14
        L51:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L37
        L55:
            if (r7 != r8) goto L5c
        L57:
            if (r4 == r3) goto L5c
            int r4 = r4 + 1
            goto L1d
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w7.U(vu2):boolean");
    }

    public static final bq1 V(bq1 bq1Var, y61 y61Var, pd1 pd1Var, t02 t02Var, boolean z2) {
        return bq1Var.d(new td1(y61Var, pd1Var, t02Var, z2));
    }

    public static final boolean W(l73 l73Var, ns0 ns0Var) {
        int i2;
        j0 j0Var;
        Object objH;
        t63 t63VarJ;
        boolean zC;
        do {
            synchronized (g0) {
                k93 k93Var = l73Var.f;
                k93Var.getClass();
                k93 k93Var2 = (k93) a73.h(k93Var);
                i2 = k93Var2.d;
                j0Var = k93Var2.c;
            }
            j0Var.getClass();
            z52 z52VarF = j0Var.f();
            objH = ns0Var.h(z52VarF);
            j0 j0VarC = z52VarF.c();
            if (s51.n(j0VarC, j0Var)) {
                break;
            }
            k93 k93Var3 = l73Var.f;
            k93Var3.getClass();
            synchronized (a73.c) {
                t63VarJ = a73.j();
                zC = C((k93) a73.w(k93Var3, l73Var, t63VarJ), i2, j0VarC, true);
            }
            a73.n(t63VarJ, l73Var);
        } while (!zC);
        return ((Boolean) objH).booleanValue();
    }

    public static void X(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static final void Y(float[] fArr, float[] fArr2) {
        float fJ = J(fArr2, 0, fArr, 0);
        float fJ2 = J(fArr2, 0, fArr, 1);
        float fJ3 = J(fArr2, 0, fArr, 2);
        float fJ4 = J(fArr2, 0, fArr, 3);
        float fJ5 = J(fArr2, 1, fArr, 0);
        float fJ6 = J(fArr2, 1, fArr, 1);
        float fJ7 = J(fArr2, 1, fArr, 2);
        float fJ8 = J(fArr2, 1, fArr, 3);
        float fJ9 = J(fArr2, 2, fArr, 0);
        float fJ10 = J(fArr2, 2, fArr, 1);
        float fJ11 = J(fArr2, 2, fArr, 2);
        float fJ12 = J(fArr2, 2, fArr, 3);
        float fJ13 = J(fArr2, 3, fArr, 0);
        float fJ14 = J(fArr2, 3, fArr, 1);
        float fJ15 = J(fArr2, 3, fArr, 2);
        float fJ16 = J(fArr2, 3, fArr, 3);
        fArr[0] = fJ;
        fArr[1] = fJ2;
        fArr[2] = fJ3;
        fArr[3] = fJ4;
        fArr[4] = fJ5;
        fArr[5] = fJ6;
        fArr[6] = fJ7;
        fArr[7] = fJ8;
        fArr[8] = fJ9;
        fArr[9] = fJ10;
        fArr[10] = fJ11;
        fArr[11] = fJ12;
        fArr[12] = fJ13;
        fArr[13] = fJ14;
        fArr[14] = fJ15;
        fArr[15] = fJ16;
    }

    public static final gk3 Z(u10 u10Var, String str, nv0 nv0Var, int i2, int i3) {
        if ((i3 & 2) != 0) {
            str = null;
        }
        int i4 = (i2 & 14) ^ 6;
        int i5 = 1;
        boolean z2 = (i4 > 4 && nv0Var.f(u10Var)) || (i2 & 6) == 4;
        Object objO = nv0Var.O();
        Object obj = c20.a;
        if (z2 || objO == obj) {
            t63 t63VarL = jo3.l();
            ns0 ns0VarE = t63VarL != null ? t63VarL.e() : null;
            t63 t63VarS = jo3.s(t63VarL);
            try {
                Object gk3Var = new gk3(u10Var, null, str);
                jo3.v(t63VarL, t63VarS, ns0VarE);
                nv0Var.j0(gk3Var);
                objO = gk3Var;
            } catch (Throwable th) {
                jo3.v(t63VarL, t63VarS, ns0VarE);
                throw th;
            }
        }
        gk3 gk3Var2 = (gk3) objO;
        if (u10Var instanceof it2) {
            nv0Var.a0(-1357398105);
            Object objO2 = nv0Var.O();
            if (objO2 == obj) {
                objO2 = rn.A(nv0Var);
                nv0Var.j0(objO2);
            }
            Object obj2 = (x50) objO2;
            boolean zH = nv0Var.h(obj2) | ((i4 > 4 && nv0Var.f(u10Var)) || (i2 & 6) == 4);
            Object objO3 = nv0Var.O();
            if (zH || objO3 == obj) {
                objO3 = new ik3(i5, u10Var, obj2);
                nv0Var.j0(objO3);
            }
            rn.g(obj2, (ns0) objO3, nv0Var);
            it2 it2Var = (it2) u10Var;
            Object value = it2Var.c.getValue();
            Object value2 = it2Var.b.getValue();
            boolean z3 = (i4 > 4 && nv0Var.f(u10Var)) || (i2 & 6) == 4;
            Object objO4 = nv0Var.O();
            if (z3 || objO4 == obj) {
                objO4 = new ri2(u10Var, null);
                nv0Var.j0(objO4);
            }
            rn.m(value, value2, (rs0) objO4, nv0Var);
            nv0Var.p(false);
        } else {
            nv0Var.a0(-1356407283);
            gk3Var2.a(u10Var.i(), nv0Var, 0);
            nv0Var.p(false);
        }
        boolean zF = nv0Var.f(gk3Var2);
        Object objO5 = nv0Var.O();
        if (zF || objO5 == obj) {
            objO5 = new hk3(gk3Var2, i5);
            nv0Var.j0(objO5);
        }
        rn.g(gk3Var2, (ns0) objO5, nv0Var);
        return gk3Var2;
    }

    public static final void a(gk3 gk3Var, bq1 bq1Var, ns0 ns0Var, h5 h5Var, ns0 ns0Var2, d00 d00Var, nv0 nv0Var, int i2) {
        int i3;
        nv0Var.b0(511725103);
        if ((i2 & 6) == 0) {
            i3 = (nv0Var.f(gk3Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= nv0Var.f(bq1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= nv0Var.h(ns0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= nv0Var.f(h5Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= nv0Var.h(ns0Var2) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i3 |= nv0Var.h(d00Var) ? 131072 : 65536;
        }
        if (nv0Var.R(i3 & 1, (74899 & i3) != 74898)) {
            Object objO = nv0Var.O();
            if (objO == c20.a) {
                objO = hd.i;
                nv0Var.j0(objO);
            }
            c(gk3Var, bq1Var, ns0Var, h5Var, ns0Var2, (ns0) objO, d00Var, nv0Var, 196608 | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | ((i3 << 3) & 3670016));
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new id(gk3Var, bq1Var, ns0Var, h5Var, ns0Var2, d00Var, i2);
        }
    }

    public static final int a0(tt2 tt2Var, int i2) {
        int i3;
        int[] iArr = tt2Var.k;
        int i4 = i2 + 1;
        int length = tt2Var.j.length;
        iArr.getClass();
        int i5 = length - 1;
        int i6 = 0;
        while (true) {
            if (i6 <= i5) {
                i3 = (i6 + i5) >>> 1;
                int i7 = iArr[i3];
                if (i7 >= i4) {
                    if (i7 <= i4) {
                        break;
                    }
                    i5 = i3 - 1;
                } else {
                    i6 = i3 + 1;
                }
            } else {
                i3 = (-i6) - 1;
                break;
            }
        }
        return i3 >= 0 ? i3 : ~i3;
    }

    public static final void b(Object obj, bq1 bq1Var, ns0 ns0Var, h5 h5Var, String str, ns0 ns0Var2, d00 d00Var, nv0 nv0Var, int i2) {
        bq1 bq1Var2;
        h5 h5Var2;
        ns0 ns0Var3;
        nv0Var.b0(1501828832);
        int i3 = i2 | (nv0Var.f(obj) ? 4 : 2) | 199728;
        if (nv0Var.R(i3 & 1, (599187 & i3) != 599186)) {
            vm vmVar = f5.g;
            Object objO = nv0Var.O();
            if (objO == c20.a) {
                objO = hd.h;
                nv0Var.j0(objO);
            }
            ns0Var3 = (ns0) objO;
            gk3 gk3VarD0 = d0(obj, str, nv0Var, (i3 & 14) | 48, 0);
            yp1 yp1Var = yp1.a;
            a(gk3VarD0, yp1Var, ns0Var, vmVar, ns0Var3, d00Var, nv0Var, 224688);
            bq1Var2 = yp1Var;
            h5Var2 = vmVar;
        } else {
            nv0Var.U();
            bq1Var2 = bq1Var;
            h5Var2 = h5Var;
            ns0Var3 = ns0Var2;
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new od(obj, bq1Var2, ns0Var, h5Var2, str, ns0Var3, d00Var, i2);
        }
    }

    public static String b0(int i2) {
        return i2 == 0 ? "Clear" : i2 == 1 ? "Src" : i2 == 2 ? "Dst" : i2 == 3 ? "SrcOver" : i2 == 4 ? "DstOver" : i2 == 5 ? "SrcIn" : i2 == 6 ? "DstIn" : i2 == 7 ? "SrcOut" : i2 == 8 ? "DstOut" : i2 == 9 ? "SrcAtop" : i2 == 10 ? "DstAtop" : i2 == 11 ? "Xor" : i2 == 12 ? "Plus" : i2 == 13 ? "Modulate" : i2 == 14 ? "Screen" : i2 == 15 ? "Overlay" : i2 == 16 ? "Darken" : i2 == 17 ? "Lighten" : i2 == 18 ? "ColorDodge" : i2 == 19 ? "ColorBurn" : i2 == 20 ? "HardLight" : i2 == 21 ? "Softlight" : i2 == 22 ? "Difference" : i2 == 23 ? "Exclusion" : i2 == 24 ? "Multiply" : i2 == 25 ? "Hue" : i2 == 26 ? "Saturation" : i2 == 27 ? "Color" : i2 == 28 ? "Luminosity" : "Unknown";
    }

    public static final void c(gk3 gk3Var, bq1 bq1Var, ns0 ns0Var, h5 h5Var, ns0 ns0Var2, ns0 ns0Var3, d00 d00Var, nv0 nv0Var, int i2) {
        ns0 ns0Var4;
        nv0 nv0Var2;
        d42 d42Var;
        bk3 bk3Var;
        Object obj;
        is1 is1Var;
        bk3 bk3Var2;
        zd zdVar;
        l73 l73Var;
        l73 l73Var2;
        bk3 bk3VarG;
        nv0 nv0Var3;
        boolean z2;
        int i3;
        int i4;
        nv0Var.b0(1935038908);
        int i5 = (i2 & 6) == 0 ? (nv0Var.f(gk3Var) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i5 |= nv0Var.f(bq1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= nv0Var.h(ns0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= nv0Var.f(h5Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= nv0Var.h(ns0Var2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i5 |= nv0Var.h(ns0Var3) ? 131072 : 65536;
        }
        d00 d00Var2 = d00Var;
        if ((1572864 & i2) == 0) {
            i5 |= nv0Var.h(d00Var2) ? 1048576 : 524288;
        }
        if (nv0Var.R(i5 & 1, (599187 & i5) != 599186)) {
            int i6 = i5 & 14;
            boolean z3 = i6 == 4;
            Object objO = nv0Var.O();
            zj zjVar = c20.a;
            if (z3 || objO == zjVar) {
                objO = new zd(gk3Var, h5Var);
                nv0Var.j0(objO);
            }
            zd zdVar2 = (zd) objO;
            boolean z4 = i6 == 4;
            Object objO2 = nv0Var.O();
            Object obj2 = objO2;
            if (z4 || objO2 == zjVar) {
                Object[] objArr = {gk3Var.a.h()};
                l73 l73Var3 = new l73();
                l73Var3.addAll(uj.Z(objArr));
                nv0Var.j0(l73Var3);
                obj2 = l73Var3;
            }
            l73 l73Var4 = (l73) obj2;
            d42 d42Var2 = gk3Var.e;
            d42 d42Var3 = gk3Var.d;
            int i7 = i5;
            u10 u10Var = gk3Var.a;
            boolean zF = nv0Var.f(d42Var2.getValue()) | (i6 == 4);
            Object objO3 = nv0Var.O();
            if (zF || objO3 == zjVar) {
                long[] jArr = nr2.a;
                objO3 = new is1();
                nv0Var.j0(objO3);
            }
            is1 is1Var2 = (is1) objO3;
            if (!l73Var4.contains(u10Var.h())) {
                l73Var4.clear();
                l73Var4.add(u10Var.h());
            }
            if (s51.n(u10Var.h(), d42Var3.getValue()) && d42Var2.getValue() == null) {
                if (l73Var4.size() != 1 || !s51.n(l73Var4.get(0), u10Var.h())) {
                    l73Var4.clear();
                    l73Var4.add(u10Var.h());
                }
                if (is1Var2.e != 1 || is1Var2.c(u10Var.h())) {
                    is1Var2.a();
                }
                zdVar2.b = h5Var;
            }
            Object value = d42Var2.getValue();
            if (value == null || value.equals(u10Var.h())) {
                d42Var = d42Var3;
            } else {
                ListIterator listIterator = l73Var4.listIterator();
                int i8 = 0;
                while (true) {
                    jy0 jy0Var = (jy0) listIterator;
                    if (!jy0Var.hasNext()) {
                        d42Var = d42Var3;
                        i4 = -1;
                        break;
                    }
                    d42Var = d42Var3;
                    if (s51.n(ns0Var2.h(jy0Var.next()), ns0Var2.h(value))) {
                        i4 = i8;
                        break;
                    } else {
                        i8++;
                        d42Var3 = d42Var;
                    }
                }
                if (i4 == -1) {
                    l73Var4.add(value);
                } else if (!s51.n(l73Var4.get(i4), value)) {
                    l73Var4.set(i4, value);
                }
            }
            if (!s51.n(u10Var.h(), d42Var.getValue())) {
                ListIterator listIterator2 = l73Var4.listIterator();
                int i9 = 0;
                while (true) {
                    jy0 jy0Var2 = (jy0) listIterator2;
                    if (!jy0Var2.hasNext()) {
                        i3 = -1;
                        break;
                    } else {
                        if (s51.n(ns0Var2.h(jy0Var2.next()), ns0Var2.h(d42Var.getValue()))) {
                            i3 = i9;
                            break;
                        }
                        i9++;
                    }
                }
                if (i3 == -1) {
                    l73Var4.add(d42Var.getValue());
                } else if (!s51.n(l73Var4.get(i3), d42Var.getValue()) || i3 != l73Var4.size() - 1) {
                    s51.n(d42Var.getValue(), l73Var4.get(i3));
                    l73Var4.remove(i3);
                    l73Var4.add(d42Var.getValue());
                }
            }
            Object value2 = d42Var2.getValue();
            boolean zF2 = nv0Var.f(value2);
            Object objO4 = nv0Var.O();
            if (zF2 || objO4 == zjVar) {
                objO4 = value2 != null ? new j52(zdVar2, d42Var.getValue(), value2) : null;
                nv0Var.j0(objO4);
            }
            j52 j52Var = (j52) objO4;
            boolean zF3 = nv0Var.f(j52Var) | ((i7 & 458752) == 131072);
            Object objO5 = nv0Var.O();
            if (!zF3 && objO5 != zjVar) {
                obj = objO5;
                bk3Var = null;
            } else if (j52Var != null && ns0Var3.h(j52Var) != null) {
                qn1.b();
                return;
            } else {
                bk3Var = null;
                nv0Var.j0(null);
                obj = null;
            }
            if (obj != null) {
                qn1.b();
                return;
            }
            if (is1Var2.b(d42Var.getValue()) && is1Var2.b(u10Var.h()) && (value2 == null || is1Var2.b(value2))) {
                nv0Var.a0(-297322234);
                nv0Var.p(false);
                is1Var = is1Var2;
                bk3Var2 = bk3Var;
                zdVar = zdVar2;
                l73Var = l73Var4;
                ns0Var4 = ns0Var;
            } else {
                nv0Var.a0(-302069574);
                is1Var2.a();
                int size = l73Var4.size();
                int i10 = 0;
                while (i10 < size) {
                    int i11 = size;
                    Object obj3 = l73Var4.get(i10);
                    is1 is1Var3 = is1Var2;
                    is1Var3.m(obj3, gq.N(427839334, new od(obj3, gk3Var, j52Var, ns0Var, zdVar2, l73Var4, d00Var2), nv0Var));
                    i10++;
                    l73Var4 = l73Var4;
                    is1Var2 = is1Var3;
                    size = i11;
                    bk3Var = bk3Var;
                    d00Var2 = d00Var;
                }
                is1Var = is1Var2;
                bk3Var2 = bk3Var;
                zdVar = zdVar2;
                l73Var = l73Var4;
                ns0Var4 = ns0Var;
                nv0Var.p(false);
            }
            boolean zF4 = nv0Var.f(gk3Var.f()) | nv0Var.f(zdVar) | nv0Var.f(d42Var2.getValue());
            Object objO6 = nv0Var.O();
            if (zF4 || objO6 == zjVar) {
                objO6 = (e40) ns0Var4.h(zdVar);
                nv0Var.j0(objO6);
            }
            e40 e40Var = (e40) objO6;
            gk3 gk3Var2 = zdVar.a;
            boolean zF5 = nv0Var.f(zdVar);
            Object objO7 = nv0Var.O();
            if (zF5 || objO7 == zjVar) {
                objO7 = b32.w(Boolean.FALSE);
                nv0Var.j0(objO7);
            }
            os1 os1Var = (os1) objO7;
            os1 os1VarZ = b32.z(e40Var.d, nv0Var);
            if (s51.n(gk3Var2.a.h(), gk3Var2.d.getValue())) {
                os1Var.setValue(Boolean.FALSE);
            } else if (os1VarZ.getValue() != null) {
                os1Var.setValue(Boolean.TRUE);
            }
            boolean zBooleanValue = ((Boolean) os1Var.getValue()).booleanValue();
            bq1 bq1Var2 = yp1.a;
            if (zBooleanValue) {
                nv0Var.a0(1353077497);
                l73Var2 = l73Var;
                nv0 nv0Var4 = nv0Var;
                bk3VarG = G(zdVar.a, rn.m1, null, nv0Var4, 0, 2);
                boolean zF6 = nv0Var4.f(bk3VarG);
                Object objO8 = nv0Var4.O();
                if (zF6 || objO8 == zjVar) {
                    objO8 = gq.u(bq1Var2);
                    nv0Var4.j0(objO8);
                }
                bq1Var2 = (bq1) objO8;
                nv0Var4.p(false);
                nv0Var3 = nv0Var4;
            } else {
                nv0 nv0Var5 = nv0Var;
                l73Var2 = l73Var;
                nv0Var5.a0(1353343539);
                nv0Var5.p(false);
                bk3VarG = bk3Var2;
                nv0Var3 = nv0Var5;
            }
            bq1 bq1VarD = bq1Var.d(bq1Var2.d(new vd(bk3VarG, os1VarZ, zdVar)));
            Object objO9 = nv0Var3.O();
            if (objO9 == zjVar) {
                objO9 = new rd(zdVar);
                nv0Var3.j0(objO9);
            }
            rd rdVar = (rd) objO9;
            int iHashCode = Long.hashCode(nv0Var3.T);
            n52 n52VarL = nv0Var3.l();
            bq1 bq1VarM = lr.M(nv0Var3, bq1VarD);
            w10.c.getClass();
            nv0Var3.d0();
            if (nv0Var3.S) {
                nv0Var3.k(tb1.Y);
            } else {
                nv0Var3.m0();
            }
            y02.F(f5.E, nv0Var3, rdVar);
            y02.F(f5.D, nv0Var3, n52VarL);
            y02.v(nv0Var3, Integer.valueOf(iHashCode));
            y02.C(nv0Var3);
            y02.F(f5.C, nv0Var3, bq1VarM);
            nv0Var3.a0(758586195);
            int size2 = l73Var2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                Object obj4 = l73Var2.get(i12);
                nv0Var3.Y(1420119555, ns0Var2.h(obj4));
                rs0 rs0Var = (rs0) is1Var.g(obj4);
                if (rs0Var == null) {
                    nv0Var3.a0(1074069702);
                    z2 = false;
                } else {
                    z2 = false;
                    nv0Var3.a0(1420120731);
                    rs0Var.f(nv0Var3, 0);
                }
                nv0Var3.p(z2);
                nv0Var3.p(z2);
            }
            nv0Var3.p(false);
            nv0Var3.p(true);
            nv0Var2 = nv0Var3;
        } else {
            ns0Var4 = ns0Var;
            nv0 nv0Var6 = nv0Var;
            nv0Var6.U();
            nv0Var2 = nv0Var6;
        }
        xj2 xj2VarT = nv0Var2.t();
        if (xj2VarT != null) {
            xj2VarT.d = new jd(gk3Var, bq1Var, ns0Var4, h5Var, ns0Var2, ns0Var3, d00Var, i2);
        }
    }

    public static final e40 c0(ij0 ij0Var, ek0 ek0Var) {
        return new e40(ij0Var, ek0Var, 0.0f, new l43(pd.h));
    }

    public static final void d(boolean z2, cs0 cs0Var, nv0 nv0Var, int i2) {
        int i3;
        nv0Var.b0(-1339183247);
        if ((i2 & 6) == 0) {
            i3 = (nv0Var.g(z2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= nv0Var.h(cs0Var) ? 32 : 16;
        }
        int i4 = 1;
        if (nv0Var.R(i3 & 1, (i3 & 19) != 18)) {
            gv3.b(z2, cs0Var, nv0Var, i3 & 126);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new xk(z2, cs0Var, i2, i4);
        }
    }

    public static final gk3 d0(Object obj, String str, nv0 nv0Var, int i2, int i3) {
        if ((i3 & 2) != 0) {
            str = null;
        }
        Object objO = nv0Var.O();
        zj zjVar = c20.a;
        if (objO == zjVar) {
            objO = new gk3(new ps1(obj), null, str);
            nv0Var.j0(objO);
        }
        gk3 gk3Var = (gk3) objO;
        gk3Var.a(obj, nv0Var, (i2 & 8) | 48 | (i2 & 14));
        Object objO2 = nv0Var.O();
        if (objO2 == zjVar) {
            objO2 = new hk3(gk3Var, 0);
            nv0Var.j0(objO2);
        }
        rn.g(gk3Var, (ns0) objO2, nv0Var);
        return gk3Var;
    }

    public static final void e(final vu vuVar, String str, final boolean z2, final boolean z3, final cs0 cs0Var, nv0 nv0Var, int i2) {
        nv0Var.b0(1061605228);
        int i3 = i2 | (nv0Var.f(vuVar) ? 4 : 2) | (nv0Var.f(str) ? 32 : 16) | (nv0Var.g(z2) ? 256 : 128) | (nv0Var.g(z3) ? 2048 : 1024) | (nv0Var.h(cs0Var) ? 16384 : 8192);
        if (nv0Var.R(i3 & 1, (i3 & 9363) != 9362)) {
            final boolean z4 = str != null;
            final boolean zN = s51.n(str, vuVar.c);
            lq.g(j43.c(yp1.a, 1.0f), null, null, null, null, gq.N(897534174, new ss0() { // from class: aw
                @Override // defpackage.ss0
                public final Object e(Object obj, Object obj2, Object obj3) {
                    int i4;
                    boolean z5;
                    boolean z6;
                    nv0 nv0Var2 = (nv0) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((ry) obj).getClass();
                    if (nv0Var2.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                        yp1 yp1Var = yp1.a;
                        bq1 bq1VarJ = f80.J(j43.c(yp1Var, 1.0f), 16.0f);
                        jj jjVar = new jj(8.0f, true, new c(1));
                        tm tmVar = f5.s;
                        qy qyVarA = oy.a(jjVar, tmVar, nv0Var2, 6);
                        int iHashCode = Long.hashCode(nv0Var2.T);
                        n52 n52VarL = nv0Var2.l();
                        bq1 bq1VarM = lr.M(nv0Var2, bq1VarJ);
                        w10.c.getClass();
                        nv0Var2.d0();
                        boolean z7 = nv0Var2.S;
                        x91 x91Var = tb1.Y;
                        if (z7) {
                            nv0Var2.k(x91Var);
                        } else {
                            nv0Var2.m0();
                        }
                        z00 z00Var = f5.E;
                        y02.F(z00Var, nv0Var2, qyVarA);
                        z00 z00Var2 = f5.D;
                        y02.F(z00Var2, nv0Var2, n52VarL);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        z00 z00Var3 = f5.F;
                        y02.F(z00Var3, nv0Var2, numValueOf);
                        y02.C(nv0Var2);
                        z00 z00Var4 = f5.C;
                        y02.F(z00Var4, nv0Var2, bq1VarM);
                        dp2 dp2VarA = cp2.a(n92.b, f5.q, nv0Var2, 48);
                        int iHashCode2 = Long.hashCode(nv0Var2.T);
                        n52 n52VarL2 = nv0Var2.l();
                        bq1 bq1VarM2 = lr.M(nv0Var2, yp1Var);
                        nv0Var2.d0();
                        if (nv0Var2.S) {
                            nv0Var2.k(x91Var);
                        } else {
                            nv0Var2.m0();
                        }
                        y02.F(z00Var, nv0Var2, dp2VarA);
                        y02.F(z00Var2, nv0Var2, n52VarL2);
                        nc2.r(iHashCode2, nv0Var2, z00Var3, nv0Var2);
                        y02.F(z00Var4, nv0Var2, bq1VarM2);
                        jc1 jc1Var = new jc1(1.0f, true);
                        qy qyVarA2 = oy.a(n92.d, tmVar, nv0Var2, 0);
                        int iHashCode3 = Long.hashCode(nv0Var2.T);
                        n52 n52VarL3 = nv0Var2.l();
                        bq1 bq1VarM3 = lr.M(nv0Var2, jc1Var);
                        nv0Var2.d0();
                        if (nv0Var2.S) {
                            nv0Var2.k(x91Var);
                        } else {
                            nv0Var2.m0();
                        }
                        y02.F(z00Var, nv0Var2, qyVarA2);
                        y02.F(z00Var2, nv0Var2, n52VarL3);
                        nc2.r(iHashCode3, nv0Var2, z00Var3, nv0Var2);
                        y02.F(z00Var4, nv0Var2, bq1VarM3);
                        vu vuVar2 = vuVar;
                        String str2 = vuVar2.b;
                        long j2 = vuVar2.h;
                        mg3.b(str2, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, gq.H(nv0Var2).i, nv0Var2, 0, 0, 131070);
                        int iOrdinal = vuVar2.d.ordinal();
                        if (iOrdinal == 0) {
                            i4 = 2131624181;
                        } else if (iOrdinal == 1) {
                            i4 = 2131624182;
                        } else {
                            if (iOrdinal != 2) {
                                c.k();
                                return null;
                            }
                            i4 = 2131624180;
                        }
                        mg3.b(oz2.N(2131624183, new Object[]{oz2.M(i4, nv0Var2)}, nv0Var2), null, gq.B(nv0Var2).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, gq.H(nv0Var2).l, nv0Var2, 0, 0, 131066);
                        mg3.b(oz2.N(2131624184, new Object[]{vuVar2.c}, nv0Var2), null, gq.B(nv0Var2).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, gq.H(nv0Var2).l, nv0Var2, 0, 0, 131066);
                        nv0 nv0Var3 = nv0Var2;
                        String str3 = vuVar2.f;
                        if (str3 == null) {
                            nv0Var3.a0(-926776099);
                            nv0Var3.p(false);
                            z6 = true;
                            z5 = false;
                        } else {
                            nv0Var3.a0(-926776098);
                            z5 = false;
                            mg3.b(oz2.N(2131624141, new Object[]{str3}, nv0Var3), null, gq.B(nv0Var3).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, gq.H(nv0Var3).l, nv0Var3, 0, 0, 131066);
                            nv0Var3 = nv0Var3;
                            nv0Var3.p(false);
                            z6 = true;
                        }
                        nv0Var3.p(z6);
                        boolean z8 = z3;
                        final boolean z9 = zN;
                        boolean z10 = (!z8 || z9) ? z5 : true;
                        final boolean z11 = z2;
                        final boolean z12 = z4;
                        gq.a(cs0Var, null, z10, null, null, null, null, null, gq.N(1042637864, new ss0() { // from class: cw
                            @Override // defpackage.ss0
                            public final Object e(Object obj4, Object obj5, Object obj6) {
                                nv0 nv0Var4 = (nv0) obj5;
                                int iIntValue2 = ((Integer) obj6).intValue();
                                ((ep2) obj4).getClass();
                                if (!nv0Var4.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    nv0Var4.U();
                                } else if (z11) {
                                    nv0Var4.a0(21165929);
                                    xd2.a(j43.k(yp1.a, 18.0f), 0L, 2.0f, 0L, 0, 0.0f, nv0Var4, 390, 58);
                                    nv0Var4.p(false);
                                } else {
                                    nv0Var4.a0(21387548);
                                    mg3.b(oz2.M(!z12 ? 2131624136 : z9 ? 2131624137 : 2131624140, nv0Var4), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var4, 0, 0, 262142);
                                    nv0Var4.p(false);
                                }
                                return dm3.a;
                            }
                        }, nv0Var3), nv0Var3, 805306368, 506);
                        nv0Var3.p(true);
                        if (y93.q0(vuVar2.e)) {
                            nv0Var3.a0(1775303502);
                            nv0Var3.p(z5);
                        } else {
                            nv0Var3.a0(1775007080);
                            nv0 nv0Var4 = nv0Var3;
                            mg3.b(vuVar2.e, null, gq.B(nv0Var3).s, 0L, null, null, 0L, null, 0L, 2, false, 3, 0, gq.H(nv0Var3).k, nv0Var4, 0, 24960, 110586);
                            nv0Var3 = nv0Var4;
                            nv0Var3.p(z5);
                        }
                        if (j2 > 0) {
                            nv0Var3.a0(1775356109);
                            String fileSize = Formatter.formatFileSize((Context) nv0Var3.j(x7.b), j2);
                            fileSize.getClass();
                            nv0 nv0Var5 = nv0Var3;
                            mg3.b(oz2.N(2131624171, new Object[]{fileSize}, nv0Var3), null, gq.B(nv0Var3).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, gq.H(nv0Var3).l, nv0Var5, 0, 0, 131066);
                            nv0Var3 = nv0Var5;
                            nv0Var3.p(z5);
                        } else {
                            nv0Var3.a0(1775818350);
                            nv0Var3.p(z5);
                        }
                        nv0Var3.p(true);
                    } else {
                        nv0Var2.U();
                    }
                    return dm3.a;
                }
            }, nv0Var), nv0Var, 196614, 30);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new bw(vuVar, str, z2, z3, cs0Var, i2, 0);
        }
    }

    public static final void e0(List list) {
        if (list.size() >= 2) {
            return;
        }
        c.p("colors must have length of at least 2 if colorStops is omitted.");
    }

    public static final void f(bv bvVar, List list, String str, ns0 ns0Var, ie1 ie1Var, boolean z2, hv hvVar, boolean z3, cs0 cs0Var, cs0 cs0Var2, ns0 ns0Var2, nv0 nv0Var, int i2) {
        nv0Var.b0(-1477524006);
        int i3 = i2 | (nv0Var.f(bvVar) ? 4 : 2) | (nv0Var.f(list) ? 32 : 16) | (nv0Var.f(str) ? 256 : 128) | (nv0Var.h(ns0Var) ? 2048 : 1024) | (nv0Var.f(ie1Var) ? 16384 : 8192) | (nv0Var.g(z2) ? 131072 : 65536) | (nv0Var.h(hvVar) ? 1048576 : 524288) | (nv0Var.g(z3) ? 8388608 : 4194304) | (nv0Var.h(cs0Var) ? 67108864 : 33554432) | (nv0Var.h(cs0Var2) ? 536870912 : 268435456);
        if (nv0Var.R(i3 & 1, ((i3 & 306783379) == 306783378 && ((nv0Var.h(ns0Var2) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            boolean z4 = ((i3 & 29360128) == 8388608) | ((i3 & 234881024) == 67108864);
            Object objO = nv0Var.O();
            if (z4 || objO == c20.a) {
                objO = new qv(0, cs0Var, z3);
                nv0Var.j0(objO);
            }
            t22.f(z2, (cs0) objO, j43.c, null, null, null, gq.N(-1774309440, new rv(ie1Var, str, ns0Var, bvVar, cs0Var2, z3, list, hvVar, ns0Var2), nv0Var), nv0Var, ((i3 >> 15) & 14) | 1573248);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new sv(bvVar, list, str, ns0Var, ie1Var, z2, hvVar, z3, cs0Var, cs0Var2, ns0Var2, i2, 0);
        }
    }

    public static final void g(hv hvVar, cs0 cs0Var, nv0 nv0Var, int i2) {
        nv0Var.b0(-1551582934);
        int i3 = 4;
        int i4 = (nv0Var.h(hvVar) ? 4 : 2) | i2 | (nv0Var.h(cs0Var) ? 32 : 16);
        int i5 = 1;
        if (nv0Var.R(i4 & 1, (i4 & 19) != 18)) {
            lq.g(j43.c(yp1.a, 1.0f), null, null, null, null, gq.N(-482023908, new w91(i5, hvVar, cs0Var), nv0Var), nv0Var, 196614, 30);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new y7(i2, i3, hvVar, cs0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(bq1 bq1Var, tw twVar, rs0 rs0Var, nv0 nv0Var, int i2) {
        bq1 bq1Var2;
        tw twVar2;
        int i3;
        final tw twVar3;
        bq1 bq1Var3;
        i90 i90Var;
        Object lVar;
        x50 x50Var;
        tw twVar4;
        i90 i90Var2;
        os1 os1Var;
        zj zjVar;
        hv hvVar;
        vl1 vl1Var;
        bq1 bq1Var4;
        yp1 yp1Var;
        i90 i90Var3;
        tw twVar5;
        boolean z2;
        int i4;
        final tw twVar6;
        boolean z3;
        zj zjVar2;
        boolean z4;
        nv0 nv0Var2 = nv0Var;
        nv0Var2.b0(-996931229);
        int i5 = i2 | 6;
        if ((i2 & 48) == 0) {
            i5 = i2 | 22;
        }
        if ((i2 & 384) == 0) {
            i5 |= (i2 & 512) == 0 ? nv0Var2.f(rs0Var) : nv0Var2.h(rs0Var) ? 256 : 128;
        }
        final int i6 = 0;
        if (nv0Var2.R(i5 & 1, (i5 & 147) != 146)) {
            nv0Var2.W();
            int i7 = i2 & 1;
            yp1 yp1Var2 = yp1.a;
            if (i7 == 0 || nv0Var2.A()) {
                cr3 cr3VarA = oj1.a(nv0Var2);
                if (cr3VarA == null) {
                    c.q("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    i3 = i5 & (-113);
                    twVar3 = (tw) g12.h0(rk2.a(tw.class), cr3VarA, null, jo3.m(cr3VarA), nv0Var2);
                    bq1Var3 = yp1Var2;
                }
            } else {
                nv0Var2.U();
                i3 = i5 & (-113);
                bq1Var3 = bq1Var;
                twVar3 = twVar;
            }
            nv0Var2.q();
            final os1 os1VarO = br.o(twVar3.i, nv0Var2);
            final os1 os1VarO2 = br.o(twVar3.k, nv0Var2);
            final os1 os1VarO3 = br.o(twVar3.m, nv0Var2);
            final os1 os1VarO4 = br.o(twVar3.o, nv0Var2);
            os1 os1VarO5 = br.o(twVar3.q, nv0Var2);
            jv jvVar = (jv) os1VarO5.getValue();
            hv hvVar2 = jvVar instanceof hv ? (hv) jvVar : null;
            boolean z5 = hvVar2 != null;
            Object objO = nv0Var2.O();
            zj zjVar3 = c20.a;
            if (objO == zjVar3) {
                objO = b32.w(null);
                nv0Var2.j0(objO);
            }
            os1 os1Var2 = (os1) objO;
            Object[] objArr = new Object[0];
            Object objO2 = nv0Var2.O();
            if (objO2 == zjVar3) {
                objO2 = new v3(19);
                nv0Var2.j0(objO2);
            }
            final os1 os1Var3 = (os1) oz2.G(objArr, (cs0) objO2, nv0Var2);
            Object objO3 = nv0Var2.O();
            if (objO3 == zjVar3) {
                objO3 = new v3(20);
                nv0Var2.j0(objO3);
            }
            i90 i90VarB = k32.b((cs0) objO3, nv0Var2, 384);
            Object objO4 = nv0Var2.O();
            if (objO4 == zjVar3) {
                objO4 = rn.A(nv0Var2);
                nv0Var2.j0(objO4);
            }
            x50 x50Var2 = (x50) objO4;
            final ie1 ie1VarA = ke1.a(nv0Var2);
            final ie1 ie1VarA2 = ke1.a(nv0Var2);
            r3 r3Var = new r3(i6);
            boolean zH = nv0Var2.h(twVar3);
            Object objO5 = nv0Var2.O();
            if (zH || objO5 == zjVar3) {
                objO5 = new ns0() { // from class: dw
                    @Override // defpackage.ns0
                    public final Object h(Object obj) {
                        int i8 = i6;
                        tw twVar7 = twVar3;
                        switch (i8) {
                            case 0:
                                Uri uri = (Uri) obj;
                                if (uri != null) {
                                    i93 i93Var = twVar7.p;
                                    if (!(i93Var.getValue() instanceof hv)) {
                                        i93Var.j(null, new hv(ev.f, (String) null, 6));
                                        cl3.t(f80.F(twVar7), null, new j(twVar7, uri, null, 11), 3);
                                    }
                                }
                                return dm3.a;
                            default:
                                ((jc0) obj).getClass();
                                return new c4(6, twVar7);
                        }
                    }
                };
                nv0Var2.j0(objO5);
            }
            vl1 vl1VarY = cl3.y(r3Var, (ns0) objO5, nv0Var2);
            boolean zH2 = nv0Var2.h(twVar3);
            Object objO6 = nv0Var2.O();
            if (zH2 || objO6 == zjVar3) {
                final int i8 = 1;
                objO6 = new ns0() { // from class: dw
                    @Override // defpackage.ns0
                    public final Object h(Object obj) {
                        int i82 = i8;
                        tw twVar7 = twVar3;
                        switch (i82) {
                            case 0:
                                Uri uri = (Uri) obj;
                                if (uri != null) {
                                    i93 i93Var = twVar7.p;
                                    if (!(i93Var.getValue() instanceof hv)) {
                                        i93Var.j(null, new hv(ev.f, (String) null, 6));
                                        cl3.t(f80.F(twVar7), null, new j(twVar7, uri, null, 11), 3);
                                    }
                                }
                                return dm3.a;
                            default:
                                ((jc0) obj).getClass();
                                return new c4(6, twVar7);
                        }
                    }
                };
                nv0Var2.j0(objO6);
            }
            rn.g(twVar3, (ns0) objO6, nv0Var2);
            of1 of1Var = (of1) nv0Var2.j(ij1.a);
            boolean zH3 = nv0Var2.h(twVar3) | nv0Var2.h(of1Var);
            Object objO7 = nv0Var2.O();
            if (zH3 || objO7 == zjVar3) {
                i90Var = i90VarB;
                objO7 = new i(12, of1Var, twVar3);
                nv0Var2.j0(objO7);
            } else {
                i90Var = i90VarB;
            }
            rn.h(of1Var, twVar3, (ns0) objO7, nv0Var2);
            jv jvVar2 = (jv) os1VarO5.getValue();
            boolean zF = ((((i3 & 896) ^ 384) > 256 && nv0Var2.h(rs0Var)) || (i3 & 384) == 256) | nv0Var2.f(os1VarO5) | nv0Var2.h(twVar3);
            Object objO8 = nv0Var2.O();
            if (zF || objO8 == zjVar3) {
                x50Var = x50Var2;
                twVar4 = twVar3;
                i90Var2 = i90Var;
                lVar = new l(rs0Var, twVar4, os1VarO5, null, 9);
                nv0Var2.j0(lVar);
            } else {
                lVar = objO8;
                x50Var = x50Var2;
                twVar4 = twVar3;
                i90Var2 = i90Var;
            }
            rn.l((rs0) lVar, nv0Var2, jvVar2);
            x31 x31Var = (x31) os1Var2.getValue();
            if (x31Var == null) {
                nv0Var2.a0(122809888);
                i4 = 0;
                nv0Var2.p(false);
                twVar5 = twVar4;
                vl1Var = vl1VarY;
                yp1Var = yp1Var2;
                bq1Var4 = bq1Var3;
                zjVar = zjVar3;
                os1Var = os1Var2;
                i90Var3 = i90Var2;
                z2 = z5;
                hvVar = hvVar2;
            } else {
                nv0Var2.a0(122809889);
                boolean zG = nv0Var2.g(z5);
                Object objO9 = nv0Var2.O();
                if (zG || objO9 == zjVar3) {
                    objO9 = new ew(0, os1Var2, z5);
                    nv0Var2.j0(objO9);
                }
                tw twVar7 = twVar4;
                boolean z6 = z5;
                os1Var = os1Var2;
                zjVar = zjVar3;
                hvVar = hvVar2;
                vl1Var = vl1VarY;
                bq1Var4 = bq1Var3;
                yp1Var = yp1Var2;
                i90Var3 = i90Var2;
                twVar5 = twVar7;
                z2 = z6;
                rn.a((cs0) objO9, gq.N(-495662696, new fw(twVar7, x31Var, z5, os1Var2, 0), nv0Var2), null, gq.N(-211677158, new lv(os1Var2, z6), nv0Var2), null, vm1.k, gq.N(-1933182499, new u(3, x31Var), nv0Var2), null, 0L, 0L, 0L, 0L, null, nv0Var, 1772592, 16276);
                nv0Var2 = nv0Var;
                i4 = 0;
                nv0Var2.p(false);
            }
            bq1 bq1Var5 = bq1Var4;
            bq1 bq1VarJ = f80.J(bq1Var5.d(j43.c), 16.0f);
            jj jjVar = new jj(12.0f, true, new c(1));
            tm tmVar = f5.s;
            qy qyVarA = oy.a(jjVar, tmVar, nv0Var2, 6);
            int iHashCode = Long.hashCode(nv0Var2.T);
            n52 n52VarL = nv0Var2.l();
            bq1 bq1VarM = lr.M(nv0Var2, bq1VarJ);
            w10.c.getClass();
            nv0Var2.d0();
            boolean z7 = nv0Var2.S;
            x91 x91Var = tb1.Y;
            if (z7) {
                nv0Var2.k(x91Var);
            } else {
                nv0Var2.m0();
            }
            z00 z00Var = f5.E;
            y02.F(z00Var, nv0Var2, qyVarA);
            z00 z00Var2 = f5.D;
            y02.F(z00Var2, nv0Var2, n52VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z00 z00Var3 = f5.F;
            y02.F(z00Var3, nv0Var2, numValueOf);
            y02.C(nv0Var2);
            z00 z00Var4 = f5.C;
            y02.F(z00Var4, nv0Var2, bq1VarM);
            bq1 bq1VarC = j43.c(yp1Var, 1.0f);
            dp2 dp2VarA = cp2.a(n92.f, f5.q, nv0Var2, 54);
            int iHashCode2 = Long.hashCode(nv0Var2.T);
            n52 n52VarL2 = nv0Var2.l();
            bq1 bq1VarM2 = lr.M(nv0Var2, bq1VarC);
            nv0Var2.d0();
            if (nv0Var2.S) {
                nv0Var2.k(x91Var);
            } else {
                nv0Var2.m0();
            }
            y02.F(z00Var, nv0Var2, dp2VarA);
            y02.F(z00Var2, nv0Var2, n52VarL2);
            nc2.r(iHashCode2, nv0Var2, z00Var3, nv0Var2);
            y02.F(z00Var4, nv0Var2, bq1VarM2);
            jc1 jc1Var = new jc1(1.0f, true);
            qy qyVarA2 = oy.a(n92.d, tmVar, nv0Var2, i4);
            int iHashCode3 = Long.hashCode(nv0Var2.T);
            n52 n52VarL3 = nv0Var2.l();
            bq1 bq1VarM3 = lr.M(nv0Var2, jc1Var);
            nv0Var2.d0();
            if (nv0Var2.S) {
                nv0Var2.k(x91Var);
            } else {
                nv0Var2.m0();
            }
            y02.F(z00Var, nv0Var2, qyVarA2);
            y02.F(z00Var2, nv0Var2, n52VarL3);
            nc2.r(iHashCode3, nv0Var2, z00Var3, nv0Var2);
            y02.F(z00Var4, nv0Var2, bq1VarM3);
            String strM = oz2.M(2131624179, nv0Var2);
            r93 r93Var = ql3.a;
            mg3.b(strM, null, 0L, 0L, xq0.j, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var2.j(r93Var)).f, nv0Var, 1572864, 0, 131006);
            mg3.b(oz2.M(2131624148, nv0Var), null, ((fy) nv0Var.j(hy.a)).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var.j(r93Var)).k, nv0Var, 0, 0, 131066);
            nv0 nv0Var3 = nv0Var;
            nv0Var3.p(true);
            int iOrdinal = ((kv) kv.h.get(i90Var3.k())).ordinal();
            if (iOrdinal == 0) {
                twVar6 = twVar5;
                zj zjVar4 = zjVar;
                z3 = false;
                Object[] objArr2 = 0;
                nv0Var3.a0(1503563943);
                vl1 vl1Var2 = vl1Var;
                boolean zH4 = nv0Var3.h(vl1Var2);
                Object objO10 = nv0Var3.O();
                if (zH4 || objO10 == zjVar4) {
                    objO10 = new mv(vl1Var2, objArr2 == true ? 1 : 0);
                    nv0Var3.j0(objO10);
                }
                zjVar2 = zjVar4;
                gq.i((cs0) objO10, null, !z2, null, null, null, null, vm1.l, nv0Var, 805306368, 506);
                nv0Var3 = nv0Var;
                nv0Var3.p(false);
            } else {
                if (iOrdinal != 1) {
                    throw by1.d(nv0Var3, 1503561653, false);
                }
                nv0Var3.a0(1503578348);
                twVar6 = twVar5;
                boolean zH5 = nv0Var3.h(twVar6);
                Object objO11 = nv0Var3.O();
                zj zjVar5 = zjVar;
                if (zH5 || objO11 == zjVar5) {
                    c7 c7Var = new c7(0, twVar6, tw.class, "refreshCatalog", "refreshCatalog()V", 0, 0, 2);
                    nv0Var3.j0(c7Var);
                    objO11 = c7Var;
                }
                gv3.f((cs0) ((ct0) objO11), null, (z2 || ((Boolean) os1VarO4.getValue()).booleanValue()) ? false : true, null, null, vm1.m, nv0Var3, 1572864, 58);
                z3 = false;
                nv0Var3.p(false);
                zjVar2 = zjVar5;
            }
            nv0Var3.p(true);
            final hv hvVar3 = hvVar;
            if (hvVar3 == null) {
                nv0Var3.a0(-1529597394);
                nv0Var3.p(z3);
            } else {
                nv0Var3.a0(-1529597393);
                boolean zH6 = nv0Var3.h(twVar6);
                Object objO12 = nv0Var3.O();
                if (zH6 || objO12 == zjVar2) {
                    z4 = z3;
                    c7 c7Var2 = new c7(0, twVar6, tw.class, "cancelActiveDownload", "cancelActiveDownload()V", 0, 0, 3);
                    nv0Var3.j0(c7Var2);
                    objO12 = c7Var2;
                } else {
                    z4 = z3;
                }
                g(hvVar3, (cs0) ((ct0) objO12), nv0Var3, 8);
                nv0Var3.p(z4);
            }
            i90 i90Var4 = i90Var3;
            d32.a(i90Var3.k(), null, 0L, 0L, null, null, gq.N(-1826662089, new y7(5, i90Var4, x50Var), nv0Var3), nv0Var, 1572864);
            final boolean z8 = z2;
            final os1 os1Var4 = os1Var;
            jo3.a(1572864, 16316, null, f5.p, gq.N(1897723852, new ts0() { // from class: wv
                @Override // defpackage.ts0
                public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
                    int iIntValue = ((Integer) obj2).intValue();
                    nv0 nv0Var4 = (nv0) obj3;
                    int iIntValue2 = ((Integer) obj4).intValue();
                    ((z22) obj).getClass();
                    if ((iIntValue2 & 48) == 0) {
                        iIntValue2 |= nv0Var4.d(iIntValue) ? 32 : 16;
                    }
                    if (nv0Var4.R(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                        int iOrdinal2 = ((kv) kv.h.get(iIntValue)).ordinal();
                        tw twVar8 = twVar6;
                        boolean z9 = z8;
                        e93 e93Var = os1VarO;
                        zj zjVar6 = c20.a;
                        if (iOrdinal2 == 0) {
                            nv0Var4.a0(-1648475722);
                            List list = (List) e93Var.getValue();
                            boolean zBooleanValue = ((Boolean) os1VarO2.getValue()).booleanValue();
                            boolean zH7 = nv0Var4.h(twVar8);
                            Object objO13 = nv0Var4.O();
                            if (zH7 || objO13 == zjVar6) {
                                c7 c7Var3 = new c7(0, twVar8, tw.class, "refreshInstalled", "refreshInstalled()V", 0, 0, 4);
                                nv0Var4.j0(c7Var3);
                                objO13 = c7Var3;
                            }
                            cs0 cs0Var = (cs0) ((ct0) objO13);
                            Object objO14 = nv0Var4.O();
                            if (objO14 == zjVar6) {
                                objO14 = new zb(os1Var4, 4);
                                nv0Var4.j0(objO14);
                            }
                            w7.m(list, ie1VarA, zBooleanValue, cs0Var, z9, (ns0) objO14, nv0Var4, 196608);
                            nv0Var4.p(false);
                        } else {
                            if (iOrdinal2 != 1) {
                                throw by1.d(nv0Var4, -1648477236, false);
                            }
                            nv0Var4.a0(-1648462711);
                            bv bvVar = (bv) os1VarO3.getValue();
                            List list2 = (List) e93Var.getValue();
                            os1 os1Var5 = os1Var3;
                            String str = (String) os1Var5.getValue();
                            boolean zF2 = nv0Var4.f(os1Var5);
                            Object objO15 = nv0Var4.O();
                            if (zF2 || objO15 == zjVar6) {
                                objO15 = new zb(os1Var5, 5);
                                nv0Var4.j0(objO15);
                            }
                            ns0 ns0Var = (ns0) objO15;
                            boolean zBooleanValue2 = ((Boolean) os1VarO4.getValue()).booleanValue();
                            boolean zH8 = nv0Var4.h(twVar8);
                            Object objO16 = nv0Var4.O();
                            if (zH8 || objO16 == zjVar6) {
                                c7 c7Var4 = new c7(0, twVar8, tw.class, "refreshCatalog", "refreshCatalog()V", 0, 0, 5);
                                nv0Var4.j0(c7Var4);
                                objO16 = c7Var4;
                            }
                            cs0 cs0Var2 = (cs0) ((ct0) objO16);
                            boolean zH9 = nv0Var4.h(twVar8);
                            Object objO17 = nv0Var4.O();
                            if (zH9 || objO17 == zjVar6) {
                                c7 c7Var5 = new c7(0, twVar8, tw.class, "refreshCatalog", "refreshCatalog()V", 0, 0, 6);
                                nv0Var4.j0(c7Var5);
                                objO17 = c7Var5;
                            }
                            cs0 cs0Var3 = (cs0) ((ct0) objO17);
                            boolean zH10 = nv0Var4.h(twVar8);
                            Object objO18 = nv0Var4.O();
                            if (zH10 || objO18 == zjVar6) {
                                k kVar = new k(1, twVar8, tw.class, "install", "install(Ltop/th1nk/samp/feature/launcher/CleoCatalogEntry;)V", 0, 0, 1);
                                nv0Var4.j0(kVar);
                                objO18 = kVar;
                            }
                            w7.f(bvVar, list2, str, ns0Var, ie1VarA2, zBooleanValue2, hvVar3, z9, cs0Var2, cs0Var3, (ns0) ((ct0) objO18), nv0Var4, 2097152);
                            nv0Var4.p(false);
                        }
                    } else {
                        nv0Var4.U();
                    }
                    return dm3.a;
                }
            }, nv0Var), nv0Var, j43.c(new jc1(1.0f, true), 1.0f), null, null, null, null, i90Var4, null, false);
            nv0Var2 = nv0Var;
            nv0Var2.p(true);
            twVar2 = twVar6;
            bq1Var2 = bq1Var5;
        } else {
            nv0Var2.U();
            bq1Var2 = bq1Var;
            twVar2 = twVar;
        }
        xj2 xj2VarT = nv0Var2.t();
        if (xj2VarT != null) {
            xj2VarT.d = new eb(bq1Var2, twVar2, rs0Var, i2, 3);
        }
    }

    public static final void i(String str, String str2, nv0 nv0Var, int i2, int i3) {
        String str3;
        int i4;
        String str4;
        nv0 nv0Var2 = nv0Var;
        nv0Var2.b0(461979052);
        int i5 = i2 | (nv0Var2.f(str) ? 4 : 2);
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 = i5 | 48;
            str3 = str2;
        } else {
            str3 = str2;
            i4 = i5 | (nv0Var2.f(str3) ? 32 : 16);
        }
        int i7 = i4;
        if (nv0Var2.R(i7 & 1, (i7 & 19) != 18)) {
            String str5 = i6 != 0 ? null : str3;
            bq1 bq1VarC = j43.c(yp1.a, 1.0f);
            dp2 dp2VarA = cp2.a(n92.f, f5.q, nv0Var2, 54);
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
            mg3.b(str, new jc1(1.0f, true), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var2.j(r93Var)).l, nv0Var, i7 & 14, 0, 131068);
            nv0Var2 = nv0Var;
            if (str5 != null) {
                nv0Var2.a0(777587500);
                str4 = str5;
                mg3.b(str4, null, ((fy) nv0Var2.j(hy.a)).s, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, ((ol3) nv0Var2.j(r93Var)).l, nv0Var, (i7 >> 3) & 14, 24576, 114682);
                nv0Var2 = nv0Var;
                nv0Var2.p(false);
            } else {
                str4 = str5;
                nv0Var2.a0(777795386);
                nv0Var2.p(false);
            }
            nv0Var2.p(true);
        } else {
            nv0Var2.U();
            str4 = str3;
        }
        xj2 xj2VarT = nv0Var2.t();
        if (xj2VarT != null) {
            xj2VarT.d = new gn2(i2, i3, str, str4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(java.lang.String r34, long r35, defpackage.cs0 r37, java.lang.String r38, defpackage.nv0 r39, int r40, int r41) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w7.j(java.lang.String, long, cs0, java.lang.String, nv0, int, int):void");
    }

    public static final void k(final nm2 nm2Var, final g83 g83Var, final hd0 hd0Var, final al0 al0Var, final String str, final cs0 cs0Var, final ns0 ns0Var, final cs0 cs0Var2, final cs0 cs0Var3, final ns0 ns0Var2, final cs0 cs0Var4, final cs0 cs0Var5, final ns0 ns0Var3, final cs0 cs0Var6, final cs0 cs0Var7, final ns0 ns0Var4, nv0 nv0Var, final int i2, final int i3) {
        int i4;
        Object obj;
        cs0 cs0Var8;
        int i5;
        boolean z2;
        boolean z3;
        nv0Var.b0(646809932);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? nv0Var.f(nm2Var) : nv0Var.h(nm2Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= (i2 & 64) == 0 ? nv0Var.f(g83Var) : nv0Var.h(g83Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= (i2 & 512) == 0 ? nv0Var.f(hd0Var) : nv0Var.h(hd0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= (i2 & 4096) == 0 ? nv0Var.f(al0Var) : nv0Var.h(al0Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            obj = str;
            i4 |= nv0Var.f(obj) ? 16384 : 8192;
        } else {
            obj = str;
        }
        if ((i2 & 196608) == 0) {
            i4 |= nv0Var.h(cs0Var) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= nv0Var.h(ns0Var) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= nv0Var.h(cs0Var2) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= nv0Var.h(cs0Var3) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= nv0Var.h(ns0Var2) ? 536870912 : 268435456;
        }
        int i6 = i4;
        if ((i3 & 6) == 0) {
            cs0Var8 = cs0Var4;
            i5 = i3 | (nv0Var.h(cs0Var8) ? 4 : 2);
        } else {
            cs0Var8 = cs0Var4;
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= nv0Var.h(cs0Var5) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= nv0Var.h(ns0Var3) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= nv0Var.h(cs0Var6) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= nv0Var.h(cs0Var7) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i5 |= nv0Var.h(ns0Var4) ? 131072 : 65536;
        }
        if (nv0Var.R(i6 & 1, ((i6 & 306783379) == 306783378 && (i5 & 74899) == 74898) ? false : true)) {
            boolean z4 = nm2Var instanceof im2;
            boolean z5 = (i6 & 57344) == 16384;
            Object objO = nv0Var.O();
            zj zjVar = c20.a;
            if (z5 || objO == zjVar) {
                objO = b32.w(obj);
                nv0Var.j0(objO);
            }
            os1 os1Var = (os1) objO;
            r3 r3Var = new r3(0);
            boolean z6 = (i5 & 458752) == 131072;
            Object objO2 = nv0Var.O();
            if (z6 || objO2 == zjVar) {
                objO2 = new cw0(ns0Var4, 3);
                nv0Var.j0(objO2);
            }
            vl1 vl1VarY = cl3.y(r3Var, (ns0) objO2, nv0Var);
            if (g83Var instanceof e83) {
                z2 = true;
            } else {
                f83 f83Var = g83Var instanceof f83 ? (f83) g83Var : null;
                if (f83Var != null) {
                    z2 = true;
                    if (f83Var.c) {
                    }
                    t22.f(z3, cs0Var3, j43.c, null, null, null, gq.N(709367078, new xm2(hd0Var, al0Var, nm2Var, cs0Var, z4, g83Var, os1Var, ns0Var, cs0Var2, cs0Var3, ns0Var2, cs0Var8, cs0Var5, ns0Var3, cs0Var6, cs0Var7, vl1VarY, 1), nv0Var), nv0Var, ((i6 >> 21) & 112) | 1573248);
                }
                z3 = false;
                t22.f(z3, cs0Var3, j43.c, null, null, null, gq.N(709367078, new xm2(hd0Var, al0Var, nm2Var, cs0Var, z4, g83Var, os1Var, ns0Var, cs0Var2, cs0Var3, ns0Var2, cs0Var8, cs0Var5, ns0Var3, cs0Var6, cs0Var7, vl1VarY, 1), nv0Var), nv0Var, ((i6 >> 21) & 112) | 1573248);
            }
            z3 = z2;
            t22.f(z3, cs0Var3, j43.c, null, null, null, gq.N(709367078, new xm2(hd0Var, al0Var, nm2Var, cs0Var, z4, g83Var, os1Var, ns0Var, cs0Var2, cs0Var3, ns0Var2, cs0Var8, cs0Var5, ns0Var3, cs0Var6, cs0Var7, vl1VarY, 1), nv0Var), nv0Var, ((i6 >> 21) & 112) | 1573248);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new rs0() { // from class: in2
                @Override // defpackage.rs0
                public final Object f(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    int iY = jo3.y(i2 | 1);
                    int iY2 = jo3.y(i3);
                    w7.k(nm2Var, g83Var, hd0Var, al0Var, str, cs0Var, ns0Var, cs0Var2, cs0Var3, ns0Var2, cs0Var4, cs0Var5, ns0Var3, cs0Var6, cs0Var7, ns0Var4, (nv0) obj2, iY, iY2);
                    return dm3.a;
                }
            };
        }
    }

    public static final void l(x31 x31Var, boolean z2, cs0 cs0Var, nv0 nv0Var, int i2) {
        nv0 nv0Var2;
        nv0Var.b0(2045482616);
        int i3 = (nv0Var.h(x31Var) ? 4 : 2) | i2 | (nv0Var.g(z2) ? 32 : 16) | (nv0Var.h(cs0Var) ? 256 : 128);
        if (nv0Var.R(i3 & 1, (i3 & 147) != 146)) {
            nv0Var2 = nv0Var;
            lq.g(j43.c(yp1.a, 1.0f), null, null, null, null, gq.N(-1938434454, new yv(cs0Var, z2, x31Var), nv0Var), nv0Var2, 196614, 30);
        } else {
            nv0Var2 = nv0Var;
            nv0Var2.U();
        }
        xj2 xj2VarT = nv0Var2.t();
        if (xj2VarT != null) {
            xj2VarT.d = new zv(x31Var, z2, cs0Var, i2, 0);
        }
    }

    public static final void m(List list, ie1 ie1Var, boolean z2, cs0 cs0Var, boolean z3, ns0 ns0Var, nv0 nv0Var, int i2) {
        nv0Var.b0(1540871117);
        int i3 = i2 | (nv0Var.f(list) ? 4 : 2) | (nv0Var.f(ie1Var) ? 32 : 16) | (nv0Var.g(z2) ? 256 : 128) | (nv0Var.h(cs0Var) ? 2048 : 1024) | (nv0Var.g(z3) ? 16384 : 8192);
        if (nv0Var.R(i3 & 1, (74899 & i3) != 74898)) {
            int i4 = i3 >> 6;
            t22.f(z2, cs0Var, j43.c, null, null, null, gq.N(1430987571, new ov(ie1Var, list, z3, ns0Var, 0), nv0Var), nv0Var, (i4 & 112) | (i4 & 14) | 1573248);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new pv(list, ie1Var, z2, cs0Var, z3, ns0Var, i2);
        }
    }

    public static final void n(vg2 vg2Var, cs0 cs0Var, cs0 cs0Var2, cs0 cs0Var3, nv0 nv0Var, int i2) {
        nv0Var.b0(904314428);
        int i3 = i2 | (nv0Var.h(vg2Var) ? 4 : 2) | (nv0Var.h(cs0Var) ? 32 : 16) | (nv0Var.h(cs0Var2) ? 256 : 128) | (nv0Var.h(cs0Var3) ? 2048 : 1024);
        if (nv0Var.R(i3 & 1, (i3 & 1171) != 1170)) {
            gv3.h(rn.y(j43.c(yp1.a, 1.0f), false, null, cs0Var, 15), 0L, null, false, gq.N(-1058636373, new u81(!(((mg2) r5.getValue()) instanceof kg2), cs0Var2, cs0Var3, vg2Var, b32.e(vg2Var.g.f, nv0Var)), nv0Var), nv0Var, 27648, 6);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new ul(vg2Var, cs0Var, cs0Var2, cs0Var3, i2, 2);
        }
    }

    public static final void o(cs0 cs0Var, cs0 cs0Var2, final cs0 cs0Var3, final cs0 cs0Var4, final cs0 cs0Var5, final cs0 cs0Var6, final cs0 cs0Var7, final ns0 ns0Var, final us0 us0Var, nv0 nv0Var, int i2) {
        cs0Var.getClass();
        cs0Var2.getClass();
        cs0Var3.getClass();
        cs0Var4.getClass();
        cs0Var5.getClass();
        cs0Var6.getClass();
        cs0Var7.getClass();
        ns0Var.getClass();
        us0Var.getClass();
        nv0Var.b0(-2123878316);
        int i3 = i2 | (nv0Var.h(cs0Var3) ? 256 : 128) | (nv0Var.h(cs0Var4) ? 2048 : 1024) | (nv0Var.h(cs0Var5) ? 16384 : 8192) | (nv0Var.h(cs0Var6) ? 131072 : 65536) | (nv0Var.h(cs0Var7) ? 1048576 : 524288) | (nv0Var.h(ns0Var) ? 8388608 : 4194304) | (nv0Var.h(us0Var) ? 67108864 : 33554432);
        int i4 = 0;
        if (nv0Var.R(i3 & 1, (38347905 & i3) != 38347904)) {
            cr3 cr3VarA = oj1.a(nv0Var);
            if (cr3VarA == null) {
                c.q("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            final sa1 sa1Var = (sa1) g12.h0(rk2.a(sa1.class), cr3VarA, null, jo3.m(cr3VarA), nv0Var);
            cr3 cr3VarA2 = oj1.a(nv0Var);
            if (cr3VarA2 == null) {
                c.q("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            final sm2 sm2Var = (sm2) g12.h0(rk2.a(sm2.class), cr3VarA2, null, jo3.m(cr3VarA2), nv0Var);
            final os1 os1VarO = br.o(sa1Var.j0, nv0Var);
            final os1 os1VarO2 = br.o(sa1Var.k0, nv0Var);
            final os1 os1VarO3 = br.o(sa1Var.l0, nv0Var);
            final os1 os1VarO4 = br.o(sa1Var.T, nv0Var);
            final os1 os1VarO5 = br.o(sa1Var.i0, nv0Var);
            final os1 os1VarO6 = br.o(sm2Var.m, nv0Var);
            final mj0 mj0Var = ea1.k;
            boolean zH = nv0Var.h(mj0Var);
            Object objO = nv0Var.O();
            Object obj = c20.a;
            if (zH || objO == obj) {
                objO = new b81(mj0Var, i4);
                nv0Var.j0(objO);
            }
            final i90 i90VarB = k32.b((cs0) objO, nv0Var, 0);
            Object objO2 = nv0Var.O();
            if (objO2 == obj) {
                objO2 = rn.A(nv0Var);
                nv0Var.j0(objO2);
            }
            final x50 x50Var = (x50) objO2;
            Object objO3 = nv0Var.O();
            if (objO3 == obj) {
                objO3 = new c63();
                nv0Var.j0(objO3);
            }
            final c63 c63Var = (c63) objO3;
            final String strM = oz2.M(2131624309, nv0Var);
            final os1 os1VarO7 = br.o(sa1Var.O, nv0Var);
            final os1 os1VarO8 = br.o(sa1Var.P, nv0Var);
            final os1 os1VarO9 = br.o(sa1Var.Q, nv0Var);
            final os1 os1VarO10 = br.o(sa1Var.R, nv0Var);
            final os1 os1VarO11 = br.o(sa1Var.S, nv0Var);
            final os1 os1VarO12 = br.o(sm2Var.o, nv0Var);
            final os1 os1VarO13 = br.o(sm2Var.q, nv0Var);
            final os1 os1VarO14 = br.o(sm2Var.s, nv0Var);
            final os1 os1VarO15 = br.o(sm2Var.w, nv0Var);
            s51.c(j43.c, null, gq.N(-117396674, new ss0() { // from class: k81
                @Override // defpackage.ss0
                public final Object e(Object obj2, Object obj3, Object obj4) {
                    int iG;
                    boolean z2;
                    lo loVar = (lo) obj2;
                    nv0 nv0Var2 = (nv0) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    loVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= nv0Var2.f(loVar) ? 4 : 2;
                    }
                    if (nv0Var2.R(iIntValue & 1, (iIntValue & 19) != 18)) {
                        float fB = loVar.b();
                        ua0 ua0Var = loVar.a;
                        long j2 = loVar.b;
                        final boolean z3 = jd0.a(loVar.b(), 840.0f) >= 0 || ((jd0.a(fB, m30.d(j2) ? ua0Var.X0(m30.h(j2)) : Float.POSITIVE_INFINITY) > 0) && jd0.a(loVar.b(), 600.0f) >= 0);
                        final boolean z4 = jd0.a(loVar.b(), 600.0f) >= 0 && !z3;
                        ua0 ua0Var2 = (ua0) nv0Var2.j(s20.h);
                        Object objO4 = nv0Var2.O();
                        zj zjVar = c20.a;
                        if (objO4 == zjVar) {
                            objO4 = new a42(0);
                            nv0Var2.j0(objO4);
                        }
                        a42 a42Var = (a42) objO4;
                        Object objO5 = nv0Var2.O();
                        if (objO5 == zjVar) {
                            objO5 = new a42(Integer.MAX_VALUE);
                            nv0Var2.j0(objO5);
                        }
                        a42 a42Var2 = (a42) objO5;
                        if (z3 || (iG = a42Var.g() - a42Var2.g()) < 0) {
                            iG = 0;
                        }
                        final float fX0 = ua0Var2.X0(iG);
                        gm0 gm0Var = j43.c;
                        Object objO6 = nv0Var2.O();
                        if (objO6 == zjVar) {
                            objO6 = new q81(a42Var, 0);
                            nv0Var2.j0(objO6);
                        }
                        bq1 bq1VarW = cl3.w(gm0Var, (ns0) objO6);
                        cn1 cn1VarD = eo.d(f5.g, false);
                        int iHashCode = Long.hashCode(nv0Var2.T);
                        n52 n52VarL = nv0Var2.l();
                        bq1 bq1VarM = lr.M(nv0Var2, bq1VarW);
                        w10.c.getClass();
                        nv0Var2.d0();
                        if (nv0Var2.S) {
                            nv0Var2.k(tb1.Y);
                        } else {
                            nv0Var2.m0();
                        }
                        y02.F(f5.E, nv0Var2, cn1VarD);
                        y02.F(f5.D, nv0Var2, n52VarL);
                        y02.F(f5.F, nv0Var2, Integer.valueOf(iHashCode));
                        y02.C(nv0Var2);
                        y02.F(f5.C, nv0Var2, bq1VarM);
                        he2 he2VarA = dn0.a.a(new jd0(fX0));
                        final c63 c63Var2 = c63Var;
                        final sm2 sm2Var2 = sm2Var;
                        final lj0 lj0Var = mj0Var;
                        final i32 i32Var = i90VarB;
                        final x50 x50Var2 = x50Var;
                        final sa1 sa1Var2 = sa1Var;
                        final e93 e93Var = os1VarO6;
                        final String str = strM;
                        final us0 us0Var2 = us0Var;
                        final cs0 cs0Var8 = cs0Var3;
                        final cs0 cs0Var9 = cs0Var4;
                        final cs0 cs0Var10 = cs0Var5;
                        final cs0 cs0Var11 = cs0Var6;
                        final cs0 cs0Var12 = cs0Var7;
                        final ns0 ns0Var2 = ns0Var;
                        final e93 e93Var2 = os1VarO4;
                        final e93 e93Var3 = os1VarO5;
                        final e93 e93Var4 = os1VarO;
                        final e93 e93Var5 = os1VarO2;
                        final e93 e93Var6 = os1VarO3;
                        final e93 e93Var7 = os1VarO12;
                        final e93 e93Var8 = os1VarO13;
                        final e93 e93Var9 = os1VarO14;
                        final e93 e93Var10 = os1VarO15;
                        final e93 e93Var11 = os1VarO7;
                        final e93 e93Var12 = os1VarO8;
                        final e93 e93Var13 = os1VarO9;
                        final e93 e93Var14 = os1VarO10;
                        final e93 e93Var15 = os1VarO11;
                        vr.c(he2VarA, gq.N(966792888, new rs0() { // from class: s81
                            @Override // defpackage.rs0
                            public final Object f(Object obj5, Object obj6) {
                                nv0 nv0Var3 = (nv0) obj5;
                                int iIntValue2 = ((Integer) obj6).intValue();
                                if (nv0Var3.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    gm0 gm0Var2 = j43.c;
                                    final c63 c63Var3 = c63Var2;
                                    final float f2 = fX0;
                                    final sm2 sm2Var3 = sm2Var2;
                                    final boolean z5 = z3;
                                    final lj0 lj0Var2 = lj0Var;
                                    final i32 i32Var2 = i32Var;
                                    final x50 x50Var3 = x50Var2;
                                    final sa1 sa1Var3 = sa1Var2;
                                    final e93 e93Var16 = e93Var;
                                    final String str2 = str;
                                    final us0 us0Var3 = us0Var2;
                                    final cs0 cs0Var13 = cs0Var8;
                                    final cs0 cs0Var14 = cs0Var9;
                                    final cs0 cs0Var15 = cs0Var10;
                                    final cs0 cs0Var16 = cs0Var11;
                                    final cs0 cs0Var17 = cs0Var12;
                                    final ns0 ns0Var3 = ns0Var2;
                                    final e93 e93Var17 = e93Var2;
                                    final e93 e93Var18 = e93Var3;
                                    final e93 e93Var19 = e93Var4;
                                    final e93 e93Var20 = e93Var5;
                                    final e93 e93Var21 = e93Var6;
                                    final e93 e93Var22 = e93Var7;
                                    final e93 e93Var23 = e93Var8;
                                    final e93 e93Var24 = e93Var9;
                                    final e93 e93Var25 = e93Var10;
                                    final e93 e93Var26 = e93Var11;
                                    final e93 e93Var27 = e93Var12;
                                    final e93 e93Var28 = e93Var13;
                                    final e93 e93Var29 = e93Var14;
                                    final e93 e93Var30 = e93Var15;
                                    final boolean z6 = z4;
                                    yh1.c(gm0Var2, gq.N(2058413664, new ss0() { // from class: v81
                                        @Override // defpackage.ss0
                                        public final Object e(Object obj7, Object obj8, Object obj9) {
                                            nv0 nv0Var4 = (nv0) obj8;
                                            int iIntValue3 = ((Integer) obj9).intValue();
                                            ((io) obj7).getClass();
                                            if (nv0Var4.R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                gm0 gm0Var3 = j43.c;
                                                long j3 = wx.f;
                                                WeakHashMap weakHashMap = qt3.w;
                                                ad adVar = ak2.e(nv0Var4).f;
                                                final c63 c63Var4 = c63Var3;
                                                final float f3 = f2;
                                                d00 d00VarN = gq.N(-1154396198, new rs0() { // from class: e81
                                                    @Override // defpackage.rs0
                                                    public final Object f(Object obj10, Object obj11) {
                                                        nv0 nv0Var5 = (nv0) obj10;
                                                        int iIntValue4 = ((Integer) obj11).intValue();
                                                        if (nv0Var5.R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                            oz2.f(c63Var4, f80.N(n92.J(yp1.a, n92.q0), 0.0f, 0.0f, 0.0f, f3, 7), null, nv0Var5, 6);
                                                        } else {
                                                            nv0Var5.U();
                                                        }
                                                        return dm3.a;
                                                    }
                                                }, nv0Var4);
                                                final sm2 sm2Var4 = sm2Var3;
                                                final boolean z7 = z5;
                                                final lj0 lj0Var3 = lj0Var2;
                                                final i32 i32Var3 = i32Var2;
                                                final x50 x50Var4 = x50Var3;
                                                final sa1 sa1Var4 = sa1Var3;
                                                final e93 e93Var31 = e93Var16;
                                                final String str3 = str2;
                                                final us0 us0Var4 = us0Var3;
                                                final cs0 cs0Var18 = cs0Var13;
                                                final cs0 cs0Var19 = cs0Var14;
                                                final cs0 cs0Var20 = cs0Var15;
                                                final cs0 cs0Var21 = cs0Var16;
                                                final cs0 cs0Var22 = cs0Var17;
                                                final ns0 ns0Var4 = ns0Var3;
                                                final e93 e93Var32 = e93Var17;
                                                final e93 e93Var33 = e93Var18;
                                                final e93 e93Var34 = e93Var19;
                                                final e93 e93Var35 = e93Var20;
                                                final e93 e93Var36 = e93Var21;
                                                final e93 e93Var37 = e93Var22;
                                                final e93 e93Var38 = e93Var23;
                                                final e93 e93Var39 = e93Var24;
                                                final e93 e93Var40 = e93Var25;
                                                final e93 e93Var41 = e93Var26;
                                                final e93 e93Var42 = e93Var27;
                                                final e93 e93Var43 = e93Var28;
                                                final e93 e93Var44 = e93Var29;
                                                final e93 e93Var45 = e93Var30;
                                                final boolean z8 = z6;
                                                w22.c(gm0Var3, null, null, d00VarN, null, 0, j3, 0L, adVar, gq.N(-914149263, new ss0() { // from class: f81
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    /* JADX WARN: Type inference failed for: r10v29 */
                                                    /* JADX WARN: Type inference failed for: r10v30, types: [boolean, int] */
                                                    /* JADX WARN: Type inference failed for: r10v54 */
                                                    @Override // defpackage.ss0
                                                    public final Object e(Object obj10, Object obj11, Object obj12) {
                                                        c63 c63Var5;
                                                        final sm2 sm2Var5;
                                                        boolean z9;
                                                        bq1 bq1VarD;
                                                        boolean z10;
                                                        boolean z11;
                                                        boolean z12;
                                                        ?? r10;
                                                        boolean z13;
                                                        boolean z14;
                                                        final sa1 sa1Var5;
                                                        z00 z00Var = f5.C;
                                                        z00 z00Var2 = f5.F;
                                                        z00 z00Var3 = f5.D;
                                                        z00 z00Var4 = f5.E;
                                                        x12 x12Var = (x12) obj10;
                                                        nv0 nv0Var5 = (nv0) obj11;
                                                        int iIntValue4 = ((Integer) obj12).intValue();
                                                        vm vmVar = f5.g;
                                                        x12Var.getClass();
                                                        if ((iIntValue4 & 6) == 0) {
                                                            iIntValue4 |= nv0Var5.f(x12Var) ? 4 : 2;
                                                        }
                                                        boolean zR = nv0Var5.R(iIntValue4 & 1, (iIntValue4 & 19) != 18);
                                                        dm3 dm3Var = dm3.a;
                                                        if (!zR) {
                                                            nv0Var5.U();
                                                            return dm3Var;
                                                        }
                                                        Context context = (Context) nv0Var5.j(x7.b);
                                                        sm2 sm2Var6 = sm2Var4;
                                                        boolean zH2 = nv0Var5.h(sm2Var6) | nv0Var5.h(context);
                                                        Object objO7 = nv0Var5.O();
                                                        c63 c63Var6 = c63Var4;
                                                        zj zjVar2 = c20.a;
                                                        if (zH2 || objO7 == zjVar2) {
                                                            c63Var5 = c63Var6;
                                                            l lVar = new l(sm2Var6, context, c63Var5, null, 18);
                                                            sm2Var5 = sm2Var6;
                                                            nv0Var5.j0(lVar);
                                                            objO7 = lVar;
                                                        } else {
                                                            c63Var5 = c63Var6;
                                                            sm2Var5 = sm2Var6;
                                                        }
                                                        rn.l((rs0) objO7, nv0Var5, dm3Var);
                                                        boolean z15 = z7;
                                                        final lj0 lj0Var4 = lj0Var3;
                                                        final i32 i32Var4 = i32Var3;
                                                        final x50 x50Var5 = x50Var4;
                                                        final sa1 sa1Var6 = sa1Var4;
                                                        final e93 e93Var46 = e93Var31;
                                                        final String str4 = str3;
                                                        final us0 us0Var5 = us0Var4;
                                                        final cs0 cs0Var23 = cs0Var18;
                                                        final cs0 cs0Var24 = cs0Var19;
                                                        final cs0 cs0Var25 = cs0Var20;
                                                        final cs0 cs0Var26 = cs0Var21;
                                                        final cs0 cs0Var27 = cs0Var22;
                                                        final ns0 ns0Var5 = ns0Var4;
                                                        final e93 e93Var47 = e93Var32;
                                                        final e93 e93Var48 = e93Var33;
                                                        final e93 e93Var49 = e93Var34;
                                                        final e93 e93Var50 = e93Var35;
                                                        final e93 e93Var51 = e93Var36;
                                                        final e93 e93Var52 = e93Var37;
                                                        final e93 e93Var53 = e93Var38;
                                                        final e93 e93Var54 = e93Var39;
                                                        final e93 e93Var55 = e93Var40;
                                                        e93 e93Var56 = e93Var41;
                                                        e93 e93Var57 = e93Var42;
                                                        e93 e93Var58 = e93Var43;
                                                        e93 e93Var59 = e93Var44;
                                                        e93 e93Var60 = e93Var45;
                                                        x91 x91Var = tb1.Y;
                                                        if (z15) {
                                                            nv0Var5.a0(967927981);
                                                            gm0 gm0Var4 = j43.c;
                                                            bq1 bq1VarT = vm1.t(f80.I(gm0Var4, x12Var), x12Var);
                                                            dp2 dp2VarA = cp2.a(n92.b, f5.p, nv0Var5, 0);
                                                            int iHashCode2 = Long.hashCode(nv0Var5.T);
                                                            n52 n52VarL2 = nv0Var5.l();
                                                            bq1 bq1VarM2 = lr.M(nv0Var5, bq1VarT);
                                                            w10.c.getClass();
                                                            nv0Var5.d0();
                                                            if (nv0Var5.S) {
                                                                nv0Var5.k(x91Var);
                                                            } else {
                                                                nv0Var5.m0();
                                                            }
                                                            y02.F(z00Var4, nv0Var5, dp2VarA);
                                                            y02.F(z00Var3, nv0Var5, n52VarL2);
                                                            nc2.r(iHashCode2, nv0Var5, z00Var2, nv0Var5);
                                                            y02.F(z00Var, nv0Var5, bq1VarM2);
                                                            final mj0 mj0Var2 = (mj0) lj0Var4;
                                                            ea1 ea1Var = (ea1) mj0Var2.get(i32Var4.k());
                                                            boolean zH3 = nv0Var5.h(x50Var5) | nv0Var5.f(i32Var4) | nv0Var5.h(mj0Var2);
                                                            Object objO8 = nv0Var5.O();
                                                            if (zH3 || objO8 == zjVar2) {
                                                                r10 = 0;
                                                                objO8 = new g81(x50Var5, i32Var4, mj0Var2, 0);
                                                                nv0Var5.j0(objO8);
                                                            } else {
                                                                r10 = 0;
                                                            }
                                                            w7.q(ea1Var, (ns0) objO8, nv0Var5, r10);
                                                            bq1 bq1VarD2 = new jc1(1.0f, true).d(j43.b);
                                                            cn1 cn1VarD2 = eo.d(vmVar, r10);
                                                            int iHashCode3 = Long.hashCode(nv0Var5.T);
                                                            n52 n52VarL3 = nv0Var5.l();
                                                            bq1 bq1VarM3 = lr.M(nv0Var5, bq1VarD2);
                                                            nv0Var5.d0();
                                                            if (nv0Var5.S) {
                                                                nv0Var5.k(x91Var);
                                                            } else {
                                                                nv0Var5.m0();
                                                            }
                                                            y02.F(z00Var4, nv0Var5, cn1VarD2);
                                                            y02.F(z00Var3, nv0Var5, n52VarL3);
                                                            nc2.r(iHashCode3, nv0Var5, z00Var2, nv0Var5);
                                                            y02.F(z00Var, nv0Var5, bq1VarM3);
                                                            final int i5 = 0;
                                                            final c63 c63Var7 = c63Var5;
                                                            jo3.a(48, 16380, null, null, gq.N(811599351, new ts0() { // from class: h81
                                                                @Override // defpackage.ts0
                                                                public final Object l(Object obj13, Object obj14, Object obj15, Object obj16) {
                                                                    final sa1 sa1Var7;
                                                                    final sa1 sa1Var8;
                                                                    int i6 = i5;
                                                                    zj zjVar3 = c20.a;
                                                                    e93 e93Var61 = e93Var55;
                                                                    e93 e93Var62 = e93Var54;
                                                                    e93 e93Var63 = e93Var53;
                                                                    e93 e93Var64 = e93Var52;
                                                                    e93 e93Var65 = e93Var51;
                                                                    e93 e93Var66 = e93Var50;
                                                                    e93 e93Var67 = e93Var46;
                                                                    e93 e93Var68 = e93Var49;
                                                                    e93 e93Var69 = e93Var48;
                                                                    e93 e93Var70 = e93Var47;
                                                                    us0 us0Var6 = us0Var5;
                                                                    ns0 ns0Var6 = ns0Var5;
                                                                    final i32 i32Var5 = i32Var4;
                                                                    final x50 x50Var6 = x50Var5;
                                                                    lj0 lj0Var5 = mj0Var2;
                                                                    switch (i6) {
                                                                        case 0:
                                                                            int iIntValue5 = ((Integer) obj14).intValue();
                                                                            nv0 nv0Var6 = (nv0) obj15;
                                                                            int iIntValue6 = ((Integer) obj16).intValue();
                                                                            ((z22) obj13).getClass();
                                                                            if ((iIntValue6 & 48) == 0) {
                                                                                iIntValue6 |= nv0Var6.d(iIntValue5) ? 32 : 16;
                                                                            }
                                                                            if (nv0Var6.R(iIntValue6 & 1, (iIntValue6 & 145) != 144)) {
                                                                                final mj0 mj0Var3 = (mj0) lj0Var5;
                                                                                int iOrdinal = ((ea1) mj0Var3.get(iIntValue5)).ordinal();
                                                                                sa1 sa1Var9 = sa1Var6;
                                                                                if (iOrdinal == 0) {
                                                                                    nv0Var6.a0(-1737067268);
                                                                                    String str5 = (String) e93Var70.getValue();
                                                                                    kq2 kq2Var = (kq2) e93Var69.getValue();
                                                                                    List list = (List) e93Var68.getValue();
                                                                                    nm2 nm2Var = (nm2) e93Var67.getValue();
                                                                                    boolean zH4 = nv0Var6.h(sa1Var9);
                                                                                    Object objO9 = nv0Var6.O();
                                                                                    if (zH4 || objO9 == zjVar3) {
                                                                                        objO9 = new k(1, sa1Var9, sa1.class, "saveDefaultServerId", "saveDefaultServerId(Ljava/lang/String;)V", 0, 0, 3);
                                                                                        nv0Var6.j0(objO9);
                                                                                    }
                                                                                    ns0 ns0Var7 = (ns0) ((ct0) objO9);
                                                                                    boolean zH5 = nv0Var6.h(sa1Var9);
                                                                                    Object objO10 = nv0Var6.O();
                                                                                    if (zH5 || objO10 == zjVar3) {
                                                                                        objO10 = new c7(0, sa1Var9, sa1.class, "quickLaunch", "quickLaunch()V", 0, 0, 13);
                                                                                        nv0Var6.j0(objO10);
                                                                                    }
                                                                                    cs0 cs0Var28 = (cs0) ((ct0) objO10);
                                                                                    boolean zH6 = nv0Var6.h(x50Var6) | nv0Var6.f(i32Var5) | nv0Var6.h(mj0Var3);
                                                                                    Object objO11 = nv0Var6.O();
                                                                                    if (zH6 || objO11 == zjVar3) {
                                                                                        final int i7 = 2;
                                                                                        objO11 = new cs0() { // from class: m81
                                                                                            @Override // defpackage.cs0
                                                                                            public final Object a() {
                                                                                                int i8 = i7;
                                                                                                dm3 dm3Var2 = dm3.a;
                                                                                                lj0 lj0Var6 = mj0Var3;
                                                                                                i32 i32Var6 = i32Var5;
                                                                                                x50 x50Var7 = x50Var6;
                                                                                                switch (i8) {
                                                                                                    case 0:
                                                                                                        cl3.t(x50Var7, null, new z81(i32Var6, lj0Var6, null, 2), 3);
                                                                                                        break;
                                                                                                    case 1:
                                                                                                        cl3.t(x50Var7, null, new z81(i32Var6, lj0Var6, null, 3), 3);
                                                                                                        break;
                                                                                                    case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                                                                                                        cl3.t(x50Var7, null, new z81(i32Var6, lj0Var6, null, 0), 3);
                                                                                                        break;
                                                                                                    default:
                                                                                                        cl3.t(x50Var7, null, new z81(i32Var6, lj0Var6, null, 1), 3);
                                                                                                        break;
                                                                                                }
                                                                                                return dm3Var2;
                                                                                            }
                                                                                        };
                                                                                        nv0Var6.j0(objO11);
                                                                                    }
                                                                                    cs0 cs0Var29 = (cs0) objO11;
                                                                                    boolean zH7 = nv0Var6.h(x50Var6) | nv0Var6.f(i32Var5) | nv0Var6.h(mj0Var3);
                                                                                    Object objO12 = nv0Var6.O();
                                                                                    if (zH7 || objO12 == zjVar3) {
                                                                                        final int i8 = 3;
                                                                                        objO12 = new cs0() { // from class: m81
                                                                                            @Override // defpackage.cs0
                                                                                            public final Object a() {
                                                                                                int i82 = i8;
                                                                                                dm3 dm3Var2 = dm3.a;
                                                                                                lj0 lj0Var6 = mj0Var3;
                                                                                                i32 i32Var6 = i32Var5;
                                                                                                x50 x50Var7 = x50Var6;
                                                                                                switch (i82) {
                                                                                                    case 0:
                                                                                                        cl3.t(x50Var7, null, new z81(i32Var6, lj0Var6, null, 2), 3);
                                                                                                        break;
                                                                                                    case 1:
                                                                                                        cl3.t(x50Var7, null, new z81(i32Var6, lj0Var6, null, 3), 3);
                                                                                                        break;
                                                                                                    case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                                                                                                        cl3.t(x50Var7, null, new z81(i32Var6, lj0Var6, null, 0), 3);
                                                                                                        break;
                                                                                                    default:
                                                                                                        cl3.t(x50Var7, null, new z81(i32Var6, lj0Var6, null, 1), 3);
                                                                                                        break;
                                                                                                }
                                                                                                return dm3Var2;
                                                                                            }
                                                                                        };
                                                                                        nv0Var6.j0(objO12);
                                                                                    }
                                                                                    vr.f(str5, kq2Var, list, nm2Var, ns0Var7, cs0Var28, cs0Var29, (cs0) objO12, nv0Var6, 0);
                                                                                    nv0Var6.p(false);
                                                                                } else if (iOrdinal == 1) {
                                                                                    nv0Var6.a0(-1737030343);
                                                                                    List list2 = (List) e93Var68.getValue();
                                                                                    boolean zBooleanValue = ((Boolean) e93Var66.getValue()).booleanValue();
                                                                                    vj2 vj2Var = (vj2) e93Var65.getValue();
                                                                                    boolean zH8 = nv0Var6.h(sa1Var9);
                                                                                    Object objO13 = nv0Var6.O();
                                                                                    if (zH8 || objO13 == zjVar3) {
                                                                                        objO13 = new c7(0, sa1Var9, sa1.class, "showAddServerDialog", "showAddServerDialog()V", 0, 0, 18);
                                                                                        sa1Var7 = sa1Var9;
                                                                                        nv0Var6.j0(objO13);
                                                                                    } else {
                                                                                        sa1Var7 = sa1Var9;
                                                                                    }
                                                                                    cs0 cs0Var30 = (cs0) ((ct0) objO13);
                                                                                    boolean zH9 = nv0Var6.h(sa1Var7);
                                                                                    Object objO14 = nv0Var6.O();
                                                                                    if (zH9 || objO14 == zjVar3) {
                                                                                        objO14 = new c7(0, sa1Var7, sa1.class, "refreshSavedServers", "refreshSavedServers()V", 0, 0, 19);
                                                                                        nv0Var6.j0(objO14);
                                                                                    }
                                                                                    cs0 cs0Var31 = (cs0) ((ct0) objO14);
                                                                                    boolean zH10 = nv0Var6.h(sa1Var7);
                                                                                    Object objO15 = nv0Var6.O();
                                                                                    if (zH10 || objO15 == zjVar3) {
                                                                                        objO15 = new a91(0, sa1Var7, sa1.class, "loadRecommendedServers", "loadRecommendedServers(Z)V", 0, 0);
                                                                                        nv0Var6.j0(objO15);
                                                                                    }
                                                                                    cs0 cs0Var32 = (cs0) objO15;
                                                                                    boolean zH11 = nv0Var6.h(sa1Var7);
                                                                                    Object objO16 = nv0Var6.O();
                                                                                    if (zH11 || objO16 == zjVar3) {
                                                                                        final int i9 = 1;
                                                                                        objO16 = new cs0() { // from class: n81
                                                                                            @Override // defpackage.cs0
                                                                                            public final Object a() {
                                                                                                int i10 = i9;
                                                                                                dm3 dm3Var2 = dm3.a;
                                                                                                sa1 sa1Var10 = sa1Var7;
                                                                                                switch (i10) {
                                                                                                    case 0:
                                                                                                        sa1Var10.l(true);
                                                                                                        break;
                                                                                                    default:
                                                                                                        sa1Var10.l(true);
                                                                                                        break;
                                                                                                }
                                                                                                return dm3Var2;
                                                                                            }
                                                                                        };
                                                                                        nv0Var6.j0(objO16);
                                                                                    }
                                                                                    cs0 cs0Var33 = (cs0) objO16;
                                                                                    boolean zH12 = nv0Var6.h(sa1Var7);
                                                                                    Object objO17 = nv0Var6.O();
                                                                                    if (zH12 || objO17 == zjVar3) {
                                                                                        objO17 = new k(1, sa1Var7, sa1.class, "addRecommendedServer", "addRecommendedServer(Ltop/th1nk/samp/core/config/ServerAddress;)V", 0, 0, 12);
                                                                                        nv0Var6.j0(objO17);
                                                                                    }
                                                                                    ns0 ns0Var8 = (ns0) ((ct0) objO17);
                                                                                    boolean zH13 = nv0Var6.h(sa1Var7);
                                                                                    Object objO18 = nv0Var6.O();
                                                                                    if (zH13 || objO18 == zjVar3) {
                                                                                        objO18 = new k(1, sa1Var7, sa1.class, "refreshServer", "refreshServer(Ltop/th1nk/samp/core/config/ServerAddress;)V", 0, 0, 4);
                                                                                        nv0Var6.j0(objO18);
                                                                                    }
                                                                                    ns0 ns0Var9 = (ns0) ((ct0) objO18);
                                                                                    boolean zH14 = nv0Var6.h(sa1Var7);
                                                                                    Object objO19 = nv0Var6.O();
                                                                                    if (zH14 || objO19 == zjVar3) {
                                                                                        objO19 = new k(1, sa1Var7, sa1.class, "requestRemoveServer", "requestRemoveServer(Ltop/th1nk/samp/core/config/SavedServer;)V", 0, 0, 5);
                                                                                        nv0Var6.j0(objO19);
                                                                                    }
                                                                                    ns0 ns0Var10 = (ns0) ((ct0) objO19);
                                                                                    boolean zH15 = nv0Var6.h(sa1Var7);
                                                                                    Object objO20 = nv0Var6.O();
                                                                                    if (zH15 || objO20 == zjVar3) {
                                                                                        objO20 = new op0(2, sa1Var7, sa1.class, "showRulesDialog", "showRulesDialog(Ltop/th1nk/samp/core/config/ServerAddress;Ljava/util/Map;)V", 0, 0, 2);
                                                                                        nv0Var6.j0(objO20);
                                                                                    }
                                                                                    rs0 rs0Var = (rs0) ((ct0) objO20);
                                                                                    boolean zH16 = nv0Var6.h(sa1Var7);
                                                                                    Object objO21 = nv0Var6.O();
                                                                                    if (zH16 || objO21 == zjVar3) {
                                                                                        objO21 = new k(1, sa1Var7, sa1.class, "showPlayersDialog", "showPlayersDialog(Ltop/th1nk/samp/core/config/ServerAddress;)V", 0, 0, 6);
                                                                                        nv0Var6.j0(objO21);
                                                                                    }
                                                                                    ns0 ns0Var11 = (ns0) ((ct0) objO21);
                                                                                    boolean zH17 = nv0Var6.h(sa1Var7);
                                                                                    Object objO22 = nv0Var6.O();
                                                                                    if (zH17 || objO22 == zjVar3) {
                                                                                        objO22 = new k(1, sa1Var7, sa1.class, "showLaunchDialog", "showLaunchDialog(Ltop/th1nk/samp/core/config/SavedServer;)V", 0, 0, 7);
                                                                                        nv0Var6.j0(objO22);
                                                                                    }
                                                                                    f80.t(list2, zBooleanValue, vj2Var, cs0Var30, cs0Var31, cs0Var32, cs0Var33, ns0Var8, ns0Var9, ns0Var10, rs0Var, ns0Var11, (ns0) ((ct0) objO22), nv0Var6, 0);
                                                                                    nv0Var6.p(false);
                                                                                } else if (iOrdinal == 2) {
                                                                                    nv0Var6.a0(-1736988253);
                                                                                    nm2 nm2Var2 = (nm2) e93Var67.getValue();
                                                                                    g83 g83Var = (g83) e93Var64.getValue();
                                                                                    hd0 hd0Var = (hd0) e93Var63.getValue();
                                                                                    al0 al0Var = (al0) e93Var62.getValue();
                                                                                    String str6 = (String) e93Var61.getValue();
                                                                                    sm2 sm2Var7 = sm2Var5;
                                                                                    boolean zH18 = nv0Var6.h(sm2Var7);
                                                                                    Object objO23 = nv0Var6.O();
                                                                                    if (zH18 || objO23 == zjVar3) {
                                                                                        objO23 = new c7(0, sm2Var7, sm2.class, "checkResources", "checkResources()V", 0, 0, 10);
                                                                                        nv0Var6.j0(objO23);
                                                                                    }
                                                                                    cs0 cs0Var34 = (cs0) ((ct0) objO23);
                                                                                    boolean zH19 = nv0Var6.h(sm2Var7);
                                                                                    Object objO24 = nv0Var6.O();
                                                                                    if (zH19 || objO24 == zjVar3) {
                                                                                        objO24 = new k(1, sm2Var7, sm2.class, "fetchSourceList", "fetchSourceList(Ljava/lang/String;)V", 0, 0, 8);
                                                                                        nv0Var6.j0(objO24);
                                                                                    }
                                                                                    ns0 ns0Var12 = (ns0) ((ct0) objO24);
                                                                                    boolean zH20 = nv0Var6.h(sm2Var7);
                                                                                    Object objO25 = nv0Var6.O();
                                                                                    if (zH20 || objO25 == zjVar3) {
                                                                                        objO25 = new c7(0, sm2Var7, sm2.class, "useOfficialSourceList", "useOfficialSourceList()V", 0, 0, 11);
                                                                                        nv0Var6.j0(objO25);
                                                                                    }
                                                                                    cs0 cs0Var35 = (cs0) ((ct0) objO25);
                                                                                    boolean zH21 = nv0Var6.h(sm2Var7);
                                                                                    Object objO26 = nv0Var6.O();
                                                                                    if (zH21 || objO26 == zjVar3) {
                                                                                        objO26 = new c7(0, sm2Var7, sm2.class, "refreshSourceList", "refreshSourceList()V", 0, 0, 12);
                                                                                        nv0Var6.j0(objO26);
                                                                                    }
                                                                                    cs0 cs0Var36 = (cs0) ((ct0) objO26);
                                                                                    boolean zH22 = nv0Var6.h(sm2Var7);
                                                                                    Object objO27 = nv0Var6.O();
                                                                                    if (zH22 || objO27 == zjVar3) {
                                                                                        objO27 = new k(1, sm2Var7, sm2.class, "startDownload", "startDownload(Ltop/th1nk/samp/feature/download/ResourceSource;)V", 0, 0, 9);
                                                                                        nv0Var6.j0(objO27);
                                                                                    }
                                                                                    ns0 ns0Var13 = (ns0) ((ct0) objO27);
                                                                                    boolean zH23 = nv0Var6.h(sm2Var7);
                                                                                    Object objO28 = nv0Var6.O();
                                                                                    if (zH23 || objO28 == zjVar3) {
                                                                                        objO28 = new c7(0, sm2Var7, sm2.class, "cancelDownload", "cancelDownload()V", 0, 0, 14);
                                                                                        nv0Var6.j0(objO28);
                                                                                    }
                                                                                    cs0 cs0Var37 = (cs0) ((ct0) objO28);
                                                                                    boolean zH24 = nv0Var6.h(sm2Var7);
                                                                                    Object objO29 = nv0Var6.O();
                                                                                    if (zH24 || objO29 == zjVar3) {
                                                                                        objO29 = new c7(0, sm2Var7, sm2.class, "resetDownloadState", "resetDownloadState()V", 0, 0, 15);
                                                                                        nv0Var6.j0(objO29);
                                                                                    }
                                                                                    cs0 cs0Var38 = (cs0) ((ct0) objO29);
                                                                                    boolean zH25 = nv0Var6.h(sm2Var7);
                                                                                    Object objO30 = nv0Var6.O();
                                                                                    if (zH25 || objO30 == zjVar3) {
                                                                                        objO30 = new k(1, sm2Var7, sm2.class, "startExtract", "startExtract(Ljava/io/File;)V", 0, 0, 10);
                                                                                        nv0Var6.j0(objO30);
                                                                                    }
                                                                                    ns0 ns0Var14 = (ns0) ((ct0) objO30);
                                                                                    boolean zH26 = nv0Var6.h(sm2Var7);
                                                                                    Object objO31 = nv0Var6.O();
                                                                                    if (zH26 || objO31 == zjVar3) {
                                                                                        objO31 = new c7(0, sm2Var7, sm2.class, "cancelExtract", "cancelExtract()V", 0, 0, 16);
                                                                                        nv0Var6.j0(objO31);
                                                                                    }
                                                                                    cs0 cs0Var39 = (cs0) ((ct0) objO31);
                                                                                    boolean zH27 = nv0Var6.h(sm2Var7);
                                                                                    Object objO32 = nv0Var6.O();
                                                                                    if (zH27 || objO32 == zjVar3) {
                                                                                        objO32 = new c7(0, sm2Var7, sm2.class, "resetExtractState", "resetExtractState()V", 0, 0, 17);
                                                                                        nv0Var6.j0(objO32);
                                                                                    }
                                                                                    cs0 cs0Var40 = (cs0) ((ct0) objO32);
                                                                                    boolean zH28 = nv0Var6.h(sm2Var7);
                                                                                    Object objO33 = nv0Var6.O();
                                                                                    if (zH28 || objO33 == zjVar3) {
                                                                                        objO33 = new k(1, sm2Var7, sm2.class, "importLocalZip", "importLocalZip(Landroid/net/Uri;)V", 0, 0, 11);
                                                                                        nv0Var6.j0(objO33);
                                                                                    }
                                                                                    ns0 ns0Var15 = (ns0) ((ct0) objO33);
                                                                                    Object objO34 = nv0Var6.O();
                                                                                    if (objO34 == zjVar3) {
                                                                                        c00 c00Var = new c00(2, c63Var7, c63.class, "showSnackbar", "showSnackbar(Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/material3/SnackbarDuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 8, 1);
                                                                                        nv0Var6.j0(c00Var);
                                                                                        objO34 = c00Var;
                                                                                    }
                                                                                    w7.u(nm2Var2, g83Var, hd0Var, al0Var, str6, cs0Var34, ns0Var12, cs0Var35, cs0Var36, ns0Var13, cs0Var37, cs0Var38, ns0Var14, cs0Var39, cs0Var40, ns0Var15, (rs0) objO34, nv0Var6, 0);
                                                                                    nv0Var6.p(false);
                                                                                } else if (iOrdinal == 3) {
                                                                                    nv0Var6.a0(1990103706);
                                                                                    w7.s(ns0Var6, us0Var6, nv0Var6, 0);
                                                                                    nv0Var6.p(false);
                                                                                } else {
                                                                                    if (iOrdinal != 4) {
                                                                                        throw by1.d(nv0Var6, -1737065520, false);
                                                                                    }
                                                                                    nv0Var6.a0(1989440957);
                                                                                    g12.r(cs0Var23, cs0Var24, cs0Var25, cs0Var26, cs0Var27, nv0Var6, 0);
                                                                                    nv0Var6.p(false);
                                                                                }
                                                                            } else {
                                                                                nv0Var6.U();
                                                                            }
                                                                            return dm3.a;
                                                                        default:
                                                                            int iIntValue7 = ((Integer) obj14).intValue();
                                                                            nv0 nv0Var7 = (nv0) obj15;
                                                                            int iIntValue8 = ((Integer) obj16).intValue();
                                                                            ((z22) obj13).getClass();
                                                                            if ((iIntValue8 & 48) == 0) {
                                                                                iIntValue8 |= nv0Var7.d(iIntValue7) ? 32 : 16;
                                                                            }
                                                                            int i10 = iIntValue8;
                                                                            if (nv0Var7.R(i10 & 1, (i10 & 145) != 144)) {
                                                                                final mj0 mj0Var4 = (mj0) lj0Var5;
                                                                                int iOrdinal2 = ((ea1) mj0Var4.get(iIntValue7)).ordinal();
                                                                                sa1 sa1Var10 = sa1Var6;
                                                                                if (iOrdinal2 == 0) {
                                                                                    nv0Var7.a0(1482406509);
                                                                                    String str7 = (String) e93Var70.getValue();
                                                                                    kq2 kq2Var2 = (kq2) e93Var69.getValue();
                                                                                    List list3 = (List) e93Var68.getValue();
                                                                                    nm2 nm2Var3 = (nm2) e93Var67.getValue();
                                                                                    boolean zH29 = nv0Var7.h(sa1Var10);
                                                                                    Object objO35 = nv0Var7.O();
                                                                                    if (zH29 || objO35 == zjVar3) {
                                                                                        objO35 = new k(1, sa1Var10, sa1.class, "saveDefaultServerId", "saveDefaultServerId(Ljava/lang/String;)V", 0, 0, 18);
                                                                                        nv0Var7.j0(objO35);
                                                                                    }
                                                                                    ns0 ns0Var16 = (ns0) ((ct0) objO35);
                                                                                    boolean zH30 = nv0Var7.h(sa1Var10);
                                                                                    Object objO36 = nv0Var7.O();
                                                                                    if (zH30 || objO36 == zjVar3) {
                                                                                        objO36 = new c91(0, sa1Var10, sa1.class, "quickLaunch", "quickLaunch()V", 0, 0, 0);
                                                                                        nv0Var7.j0(objO36);
                                                                                    }
                                                                                    cs0 cs0Var41 = (cs0) ((ct0) objO36);
                                                                                    boolean zH31 = nv0Var7.h(x50Var6) | nv0Var7.f(i32Var5) | nv0Var7.h(mj0Var4);
                                                                                    Object objO37 = nv0Var7.O();
                                                                                    if (zH31 || objO37 == zjVar3) {
                                                                                        final int i11 = 0;
                                                                                        objO37 = new cs0() { // from class: m81
                                                                                            @Override // defpackage.cs0
                                                                                            public final Object a() {
                                                                                                int i82 = i11;
                                                                                                dm3 dm3Var2 = dm3.a;
                                                                                                lj0 lj0Var6 = mj0Var4;
                                                                                                i32 i32Var6 = i32Var5;
                                                                                                x50 x50Var7 = x50Var6;
                                                                                                switch (i82) {
                                                                                                    case 0:
                                                                                                        cl3.t(x50Var7, null, new z81(i32Var6, lj0Var6, null, 2), 3);
                                                                                                        break;
                                                                                                    case 1:
                                                                                                        cl3.t(x50Var7, null, new z81(i32Var6, lj0Var6, null, 3), 3);
                                                                                                        break;
                                                                                                    case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                                                                                                        cl3.t(x50Var7, null, new z81(i32Var6, lj0Var6, null, 0), 3);
                                                                                                        break;
                                                                                                    default:
                                                                                                        cl3.t(x50Var7, null, new z81(i32Var6, lj0Var6, null, 1), 3);
                                                                                                        break;
                                                                                                }
                                                                                                return dm3Var2;
                                                                                            }
                                                                                        };
                                                                                        nv0Var7.j0(objO37);
                                                                                    }
                                                                                    cs0 cs0Var42 = (cs0) objO37;
                                                                                    boolean zH32 = nv0Var7.h(x50Var6) | nv0Var7.f(i32Var5) | nv0Var7.h(mj0Var4);
                                                                                    Object objO38 = nv0Var7.O();
                                                                                    if (zH32 || objO38 == zjVar3) {
                                                                                        final int i12 = 1;
                                                                                        objO38 = new cs0() { // from class: m81
                                                                                            @Override // defpackage.cs0
                                                                                            public final Object a() {
                                                                                                int i82 = i12;
                                                                                                dm3 dm3Var2 = dm3.a;
                                                                                                lj0 lj0Var6 = mj0Var4;
                                                                                                i32 i32Var6 = i32Var5;
                                                                                                x50 x50Var7 = x50Var6;
                                                                                                switch (i82) {
                                                                                                    case 0:
                                                                                                        cl3.t(x50Var7, null, new z81(i32Var6, lj0Var6, null, 2), 3);
                                                                                                        break;
                                                                                                    case 1:
                                                                                                        cl3.t(x50Var7, null, new z81(i32Var6, lj0Var6, null, 3), 3);
                                                                                                        break;
                                                                                                    case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                                                                                                        cl3.t(x50Var7, null, new z81(i32Var6, lj0Var6, null, 0), 3);
                                                                                                        break;
                                                                                                    default:
                                                                                                        cl3.t(x50Var7, null, new z81(i32Var6, lj0Var6, null, 1), 3);
                                                                                                        break;
                                                                                                }
                                                                                                return dm3Var2;
                                                                                            }
                                                                                        };
                                                                                        nv0Var7.j0(objO38);
                                                                                    }
                                                                                    vr.f(str7, kq2Var2, list3, nm2Var3, ns0Var16, cs0Var41, cs0Var42, (cs0) objO38, nv0Var7, 0);
                                                                                    nv0Var7.p(false);
                                                                                } else if (iOrdinal2 == 1) {
                                                                                    nv0Var7.a0(1482443434);
                                                                                    List list4 = (List) e93Var68.getValue();
                                                                                    boolean zBooleanValue2 = ((Boolean) e93Var66.getValue()).booleanValue();
                                                                                    vj2 vj2Var2 = (vj2) e93Var65.getValue();
                                                                                    boolean zH33 = nv0Var7.h(sa1Var10);
                                                                                    Object objO39 = nv0Var7.O();
                                                                                    if (zH33 || objO39 == zjVar3) {
                                                                                        objO39 = new c91(0, sa1Var10, sa1.class, "showAddServerDialog", "showAddServerDialog()V", 0, 0, 5);
                                                                                        sa1Var8 = sa1Var10;
                                                                                        nv0Var7.j0(objO39);
                                                                                    } else {
                                                                                        sa1Var8 = sa1Var10;
                                                                                    }
                                                                                    cs0 cs0Var43 = (cs0) ((ct0) objO39);
                                                                                    boolean zH34 = nv0Var7.h(sa1Var8);
                                                                                    Object objO40 = nv0Var7.O();
                                                                                    if (zH34 || objO40 == zjVar3) {
                                                                                        objO40 = new c91(0, sa1Var8, sa1.class, "refreshSavedServers", "refreshSavedServers()V", 0, 0, 6);
                                                                                        nv0Var7.j0(objO40);
                                                                                    }
                                                                                    cs0 cs0Var44 = (cs0) ((ct0) objO40);
                                                                                    boolean zH35 = nv0Var7.h(sa1Var8);
                                                                                    Object objO41 = nv0Var7.O();
                                                                                    if (zH35 || objO41 == zjVar3) {
                                                                                        objO41 = new a91(0, sa1Var8, sa1.class, "loadRecommendedServers", "loadRecommendedServers(Z)V", 0, 1);
                                                                                        nv0Var7.j0(objO41);
                                                                                    }
                                                                                    cs0 cs0Var45 = (cs0) objO41;
                                                                                    boolean zH36 = nv0Var7.h(sa1Var8);
                                                                                    Object objO42 = nv0Var7.O();
                                                                                    if (zH36 || objO42 == zjVar3) {
                                                                                        final int i13 = 0;
                                                                                        objO42 = new cs0() { // from class: n81
                                                                                            @Override // defpackage.cs0
                                                                                            public final Object a() {
                                                                                                int i102 = i13;
                                                                                                dm3 dm3Var2 = dm3.a;
                                                                                                sa1 sa1Var102 = sa1Var8;
                                                                                                switch (i102) {
                                                                                                    case 0:
                                                                                                        sa1Var102.l(true);
                                                                                                        break;
                                                                                                    default:
                                                                                                        sa1Var102.l(true);
                                                                                                        break;
                                                                                                }
                                                                                                return dm3Var2;
                                                                                            }
                                                                                        };
                                                                                        nv0Var7.j0(objO42);
                                                                                    }
                                                                                    cs0 cs0Var46 = (cs0) objO42;
                                                                                    boolean zH37 = nv0Var7.h(sa1Var8);
                                                                                    Object objO43 = nv0Var7.O();
                                                                                    if (zH37 || objO43 == zjVar3) {
                                                                                        objO43 = new k(1, sa1Var8, sa1.class, "addRecommendedServer", "addRecommendedServer(Ltop/th1nk/samp/core/config/ServerAddress;)V", 0, 0, 27);
                                                                                        nv0Var7.j0(objO43);
                                                                                    }
                                                                                    ns0 ns0Var17 = (ns0) ((ct0) objO43);
                                                                                    boolean zH38 = nv0Var7.h(sa1Var8);
                                                                                    Object objO44 = nv0Var7.O();
                                                                                    if (zH38 || objO44 == zjVar3) {
                                                                                        objO44 = new k(1, sa1Var8, sa1.class, "refreshServer", "refreshServer(Ltop/th1nk/samp/core/config/ServerAddress;)V", 0, 0, 19);
                                                                                        nv0Var7.j0(objO44);
                                                                                    }
                                                                                    ns0 ns0Var18 = (ns0) ((ct0) objO44);
                                                                                    boolean zH39 = nv0Var7.h(sa1Var8);
                                                                                    Object objO45 = nv0Var7.O();
                                                                                    if (zH39 || objO45 == zjVar3) {
                                                                                        objO45 = new k(1, sa1Var8, sa1.class, "requestRemoveServer", "requestRemoveServer(Ltop/th1nk/samp/core/config/SavedServer;)V", 0, 0, 20);
                                                                                        nv0Var7.j0(objO45);
                                                                                    }
                                                                                    ns0 ns0Var19 = (ns0) ((ct0) objO45);
                                                                                    boolean zH40 = nv0Var7.h(sa1Var8);
                                                                                    Object objO46 = nv0Var7.O();
                                                                                    if (zH40 || objO46 == zjVar3) {
                                                                                        objO46 = new op0(2, sa1Var8, sa1.class, "showRulesDialog", "showRulesDialog(Ltop/th1nk/samp/core/config/ServerAddress;Ljava/util/Map;)V", 0, 0, 3);
                                                                                        nv0Var7.j0(objO46);
                                                                                    }
                                                                                    rs0 rs0Var2 = (rs0) ((ct0) objO46);
                                                                                    boolean zH41 = nv0Var7.h(sa1Var8);
                                                                                    Object objO47 = nv0Var7.O();
                                                                                    if (zH41 || objO47 == zjVar3) {
                                                                                        objO47 = new k(1, sa1Var8, sa1.class, "showPlayersDialog", "showPlayersDialog(Ltop/th1nk/samp/core/config/ServerAddress;)V", 0, 0, 21);
                                                                                        nv0Var7.j0(objO47);
                                                                                    }
                                                                                    ns0 ns0Var20 = (ns0) ((ct0) objO47);
                                                                                    boolean zH42 = nv0Var7.h(sa1Var8);
                                                                                    Object objO48 = nv0Var7.O();
                                                                                    if (zH42 || objO48 == zjVar3) {
                                                                                        objO48 = new k(1, sa1Var8, sa1.class, "showLaunchDialog", "showLaunchDialog(Ltop/th1nk/samp/core/config/SavedServer;)V", 0, 0, 22);
                                                                                        nv0Var7.j0(objO48);
                                                                                    }
                                                                                    f80.t(list4, zBooleanValue2, vj2Var2, cs0Var43, cs0Var44, cs0Var45, cs0Var46, ns0Var17, ns0Var18, ns0Var19, rs0Var2, ns0Var20, (ns0) ((ct0) objO48), nv0Var7, 0);
                                                                                    nv0Var7.p(false);
                                                                                } else if (iOrdinal2 == 2) {
                                                                                    nv0Var7.a0(1482485524);
                                                                                    nm2 nm2Var4 = (nm2) e93Var67.getValue();
                                                                                    g83 g83Var2 = (g83) e93Var64.getValue();
                                                                                    hd0 hd0Var2 = (hd0) e93Var63.getValue();
                                                                                    al0 al0Var2 = (al0) e93Var62.getValue();
                                                                                    String str8 = (String) e93Var61.getValue();
                                                                                    sm2 sm2Var8 = sm2Var5;
                                                                                    boolean zH43 = nv0Var7.h(sm2Var8);
                                                                                    Object objO49 = nv0Var7.O();
                                                                                    if (zH43 || objO49 == zjVar3) {
                                                                                        c7 c7Var = new c7(0, sm2Var8, sm2.class, "checkResources", "checkResources()V", 0, 0, 27);
                                                                                        nv0Var7.j0(c7Var);
                                                                                        objO49 = c7Var;
                                                                                    }
                                                                                    cs0 cs0Var47 = (cs0) ((ct0) objO49);
                                                                                    boolean zH44 = nv0Var7.h(sm2Var8);
                                                                                    Object objO50 = nv0Var7.O();
                                                                                    if (zH44 || objO50 == zjVar3) {
                                                                                        k kVar = new k(1, sm2Var8, sm2.class, "fetchSourceList", "fetchSourceList(Ljava/lang/String;)V", 0, 0, 23);
                                                                                        nv0Var7.j0(kVar);
                                                                                        objO50 = kVar;
                                                                                    }
                                                                                    ns0 ns0Var21 = (ns0) ((ct0) objO50);
                                                                                    boolean zH45 = nv0Var7.h(sm2Var8);
                                                                                    Object objO51 = nv0Var7.O();
                                                                                    if (zH45 || objO51 == zjVar3) {
                                                                                        c7 c7Var2 = new c7(0, sm2Var8, sm2.class, "useOfficialSourceList", "useOfficialSourceList()V", 0, 0, 28);
                                                                                        nv0Var7.j0(c7Var2);
                                                                                        objO51 = c7Var2;
                                                                                    }
                                                                                    cs0 cs0Var48 = (cs0) ((ct0) objO51);
                                                                                    boolean zH46 = nv0Var7.h(sm2Var8);
                                                                                    Object objO52 = nv0Var7.O();
                                                                                    if (zH46 || objO52 == zjVar3) {
                                                                                        c7 c7Var3 = new c7(0, sm2Var8, sm2.class, "refreshSourceList", "refreshSourceList()V", 0, 0, 29);
                                                                                        nv0Var7.j0(c7Var3);
                                                                                        objO52 = c7Var3;
                                                                                    }
                                                                                    cs0 cs0Var49 = (cs0) ((ct0) objO52);
                                                                                    boolean zH47 = nv0Var7.h(sm2Var8);
                                                                                    Object objO53 = nv0Var7.O();
                                                                                    if (zH47 || objO53 == zjVar3) {
                                                                                        k kVar2 = new k(1, sm2Var8, sm2.class, "startDownload", "startDownload(Ltop/th1nk/samp/feature/download/ResourceSource;)V", 0, 0, 24);
                                                                                        nv0Var7.j0(kVar2);
                                                                                        objO53 = kVar2;
                                                                                    }
                                                                                    ns0 ns0Var22 = (ns0) ((ct0) objO53);
                                                                                    boolean zH48 = nv0Var7.h(sm2Var8);
                                                                                    Object objO54 = nv0Var7.O();
                                                                                    if (zH48 || objO54 == zjVar3) {
                                                                                        c91 c91Var = new c91(0, sm2Var8, sm2.class, "cancelDownload", "cancelDownload()V", 0, 0, 1);
                                                                                        nv0Var7.j0(c91Var);
                                                                                        objO54 = c91Var;
                                                                                    }
                                                                                    cs0 cs0Var50 = (cs0) ((ct0) objO54);
                                                                                    boolean zH49 = nv0Var7.h(sm2Var8);
                                                                                    Object objO55 = nv0Var7.O();
                                                                                    if (zH49 || objO55 == zjVar3) {
                                                                                        c91 c91Var2 = new c91(0, sm2Var8, sm2.class, "resetDownloadState", "resetDownloadState()V", 0, 0, 2);
                                                                                        nv0Var7.j0(c91Var2);
                                                                                        objO55 = c91Var2;
                                                                                    }
                                                                                    cs0 cs0Var51 = (cs0) ((ct0) objO55);
                                                                                    boolean zH50 = nv0Var7.h(sm2Var8);
                                                                                    Object objO56 = nv0Var7.O();
                                                                                    if (zH50 || objO56 == zjVar3) {
                                                                                        k kVar3 = new k(1, sm2Var8, sm2.class, "startExtract", "startExtract(Ljava/io/File;)V", 0, 0, 25);
                                                                                        nv0Var7.j0(kVar3);
                                                                                        objO56 = kVar3;
                                                                                    }
                                                                                    ns0 ns0Var23 = (ns0) ((ct0) objO56);
                                                                                    boolean zH51 = nv0Var7.h(sm2Var8);
                                                                                    Object objO57 = nv0Var7.O();
                                                                                    if (zH51 || objO57 == zjVar3) {
                                                                                        c91 c91Var3 = new c91(0, sm2Var8, sm2.class, "cancelExtract", "cancelExtract()V", 0, 0, 3);
                                                                                        nv0Var7.j0(c91Var3);
                                                                                        objO57 = c91Var3;
                                                                                    }
                                                                                    cs0 cs0Var52 = (cs0) ((ct0) objO57);
                                                                                    boolean zH52 = nv0Var7.h(sm2Var8);
                                                                                    Object objO58 = nv0Var7.O();
                                                                                    if (zH52 || objO58 == zjVar3) {
                                                                                        c91 c91Var4 = new c91(0, sm2Var8, sm2.class, "resetExtractState", "resetExtractState()V", 0, 0, 4);
                                                                                        nv0Var7.j0(c91Var4);
                                                                                        objO58 = c91Var4;
                                                                                    }
                                                                                    cs0 cs0Var53 = (cs0) ((ct0) objO58);
                                                                                    boolean zH53 = nv0Var7.h(sm2Var8);
                                                                                    Object objO59 = nv0Var7.O();
                                                                                    if (zH53 || objO59 == zjVar3) {
                                                                                        k kVar4 = new k(1, sm2Var8, sm2.class, "importLocalZip", "importLocalZip(Landroid/net/Uri;)V", 0, 0, 26);
                                                                                        nv0Var7.j0(kVar4);
                                                                                        objO59 = kVar4;
                                                                                    }
                                                                                    ns0 ns0Var24 = (ns0) ((ct0) objO59);
                                                                                    Object objO60 = nv0Var7.O();
                                                                                    if (objO60 == zjVar3) {
                                                                                        c00 c00Var2 = new c00(2, c63Var7, c63.class, "showSnackbar", "showSnackbar(Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/material3/SnackbarDuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 8, 2);
                                                                                        nv0Var7.j0(c00Var2);
                                                                                        objO60 = c00Var2;
                                                                                    }
                                                                                    w7.u(nm2Var4, g83Var2, hd0Var2, al0Var2, str8, cs0Var47, ns0Var21, cs0Var48, cs0Var49, ns0Var22, cs0Var50, cs0Var51, ns0Var23, cs0Var52, cs0Var53, ns0Var24, (rs0) objO60, nv0Var7, 0);
                                                                                    nv0Var7.p(false);
                                                                                } else if (iOrdinal2 == 3) {
                                                                                    nv0Var7.a0(-1285424311);
                                                                                    w7.s(ns0Var6, us0Var6, nv0Var7, 0);
                                                                                    nv0Var7.p(false);
                                                                                } else {
                                                                                    if (iOrdinal2 != 4) {
                                                                                        throw by1.d(nv0Var7, 1482408261, false);
                                                                                    }
                                                                                    nv0Var7.a0(-1286087060);
                                                                                    g12.r(cs0Var23, cs0Var24, cs0Var25, cs0Var26, cs0Var27, nv0Var7, 0);
                                                                                    nv0Var7.p(false);
                                                                                }
                                                                            } else {
                                                                                nv0Var7.U();
                                                                            }
                                                                            return dm3.a;
                                                                    }
                                                                }
                                                            }, nv0Var5), nv0Var5, gm0Var4, null, null, null, null, i32Var4, null, false);
                                                            if (((g4) e93Var56.getValue()).a) {
                                                                nv0Var5.a0(1786143686);
                                                                g4 g4Var = (g4) e93Var56.getValue();
                                                                boolean zH4 = nv0Var5.h(sa1Var6);
                                                                Object objO9 = nv0Var5.O();
                                                                if (zH4 || objO9 == zjVar2) {
                                                                    objO9 = new c7(0, sa1Var6, sa1.class, "dismissAddServerDialog", "dismissAddServerDialog()V", 0, 0, 21);
                                                                    nv0Var5.j0(objO9);
                                                                }
                                                                cs0 cs0Var28 = (cs0) ((ct0) objO9);
                                                                boolean zH5 = nv0Var5.h(sa1Var6);
                                                                Object objO10 = nv0Var5.O();
                                                                if (zH5 || objO10 == zjVar2) {
                                                                    objO10 = new k(1, sa1Var6, sa1.class, "onServerHostChange", "onServerHostChange(Ljava/lang/String;)V", 0, 0, 15);
                                                                    nv0Var5.j0(objO10);
                                                                }
                                                                ns0 ns0Var6 = (ns0) ((ct0) objO10);
                                                                boolean zH6 = nv0Var5.h(sa1Var6);
                                                                Object objO11 = nv0Var5.O();
                                                                if (zH6 || objO11 == zjVar2) {
                                                                    objO11 = new k(1, sa1Var6, sa1.class, "onServerPortChange", "onServerPortChange(Ljava/lang/String;)V", 0, 0, 16);
                                                                    nv0Var5.j0(objO11);
                                                                }
                                                                ns0 ns0Var7 = (ns0) ((ct0) objO11);
                                                                boolean zH7 = nv0Var5.h(sa1Var6);
                                                                Object objO12 = nv0Var5.O();
                                                                if (zH7 || objO12 == zjVar2) {
                                                                    objO12 = new c7(0, sa1Var6, sa1.class, "saveServer", "saveServer()V", 0, 0, 22);
                                                                    nv0Var5.j0(objO12);
                                                                }
                                                                f80.a(g4Var, cs0Var28, ns0Var6, ns0Var7, (cs0) ((ct0) objO12), nv0Var5, 0);
                                                                z13 = false;
                                                                nv0Var5.p(false);
                                                            } else {
                                                                z13 = false;
                                                                nv0Var5.a0(1786579980);
                                                                nv0Var5.p(false);
                                                            }
                                                            kq2 kq2Var = (kq2) e93Var57.getValue();
                                                            if (kq2Var == null) {
                                                                nv0Var5.a0(1786635903);
                                                                nv0Var5.p(z13);
                                                            } else {
                                                                nv0Var5.a0(1786635904);
                                                                boolean zH8 = nv0Var5.h(sa1Var6);
                                                                Object objO13 = nv0Var5.O();
                                                                if (zH8 || objO13 == zjVar2) {
                                                                    objO13 = new c7(0, sa1Var6, sa1.class, "dismissRemoveServerConfirmation", "dismissRemoveServerConfirmation()V", 0, 0, 23);
                                                                    nv0Var5.j0(objO13);
                                                                }
                                                                cs0 cs0Var29 = (cs0) ((ct0) objO13);
                                                                boolean zH9 = nv0Var5.h(sa1Var6);
                                                                Object objO14 = nv0Var5.O();
                                                                if (zH9 || objO14 == zjVar2) {
                                                                    objO14 = new c7(0, sa1Var6, sa1.class, "confirmRemoveServer", "confirmRemoveServer()V", 0, 0, 24);
                                                                    nv0Var5.j0(objO14);
                                                                }
                                                                f80.l(kq2Var, cs0Var29, (cs0) ((ct0) objO14), nv0Var5, 0);
                                                                nv0Var5.p(false);
                                                            }
                                                            if (((hp2) e93Var58.getValue()).a) {
                                                                nv0Var5.a0(1787012554);
                                                                hp2 hp2Var = (hp2) e93Var58.getValue();
                                                                boolean zH10 = nv0Var5.h(sa1Var6);
                                                                Object objO15 = nv0Var5.O();
                                                                if (zH10 || objO15 == zjVar2) {
                                                                    objO15 = new c7(0, sa1Var6, sa1.class, "dismissRulesDialog", "dismissRulesDialog()V", 0, 0, 25);
                                                                    nv0Var5.j0(objO15);
                                                                }
                                                                f80.m(hp2Var, (cs0) ((ct0) objO15), nv0Var5, 8);
                                                                nv0Var5.p(false);
                                                            } else {
                                                                nv0Var5.a0(1787229740);
                                                                nv0Var5.p(false);
                                                            }
                                                            if (((o72) e93Var59.getValue()).a) {
                                                                nv0Var5.a0(1787289508);
                                                                o72 o72Var = (o72) e93Var59.getValue();
                                                                boolean zH11 = nv0Var5.h(sa1Var6);
                                                                Object objO16 = nv0Var5.O();
                                                                if (zH11 || objO16 == zjVar2) {
                                                                    objO16 = new c7(0, sa1Var6, sa1.class, "dismissPlayersDialog", "dismissPlayersDialog()V", 0, 0, 26);
                                                                    nv0Var5.j0(objO16);
                                                                }
                                                                f80.h(o72Var, (cs0) ((ct0) objO16), nv0Var5, 8);
                                                                nv0Var5.p(false);
                                                            } else {
                                                                nv0Var5.a0(1787512460);
                                                                nv0Var5.p(false);
                                                            }
                                                            if (((v71) e93Var60.getValue()).a) {
                                                                nv0Var5.a0(1787642629);
                                                                v71 v71Var = (v71) e93Var60.getValue();
                                                                boolean zH12 = nv0Var5.h(sa1Var6);
                                                                Object objO17 = nv0Var5.O();
                                                                if (zH12 || objO17 == zjVar2) {
                                                                    objO17 = new k(1, sa1Var6, sa1.class, "onLaunchNicknameChange", "onLaunchNicknameChange(Ljava/lang/String;)V", 0, 0, 17);
                                                                    nv0Var5.j0(objO17);
                                                                }
                                                                ct0 ct0Var = (ct0) objO17;
                                                                boolean zH13 = nv0Var5.h(sa1Var6);
                                                                Object objO18 = nv0Var5.O();
                                                                if (zH13 || objO18 == zjVar2) {
                                                                    objO18 = new k(1, sa1Var6, sa1.class, "onLaunchTextEncodingChange", "onLaunchTextEncodingChange(Ltop/th1nk/samp/core/config/ServerTextEncoding;)V", 0, 0, 13);
                                                                    nv0Var5.j0(objO18);
                                                                }
                                                                ct0 ct0Var2 = (ct0) objO18;
                                                                boolean zH14 = nv0Var5.h(sa1Var6);
                                                                Object objO19 = nv0Var5.O();
                                                                if (zH14 || objO19 == zjVar2) {
                                                                    objO19 = new k(1, sa1Var6, sa1.class, "onLaunchPasswordChange", "onLaunchPasswordChange(Ljava/lang/String;)V", 0, 0, 14);
                                                                    nv0Var5.j0(objO19);
                                                                }
                                                                ct0 ct0Var3 = (ct0) objO19;
                                                                boolean zH15 = nv0Var5.h(sa1Var6);
                                                                Object objO20 = nv0Var5.O();
                                                                if (zH15 || objO20 == zjVar2) {
                                                                    objO20 = new c7(0, sa1Var6, sa1.class, "dismissLaunchDialog", "dismissLaunchDialog()V", 0, 0, 20);
                                                                    nv0Var5.j0(objO20);
                                                                }
                                                                ns0 ns0Var8 = (ns0) ct0Var;
                                                                ns0 ns0Var9 = (ns0) ct0Var3;
                                                                ns0 ns0Var10 = (ns0) ct0Var2;
                                                                cs0 cs0Var30 = (cs0) ((ct0) objO20);
                                                                boolean zF = nv0Var5.f(e93Var46) | nv0Var5.h(sa1Var6) | nv0Var5.h(x50Var5) | nv0Var5.f(str4);
                                                                Object objO21 = nv0Var5.O();
                                                                if (zF || objO21 == zjVar2) {
                                                                    final int i6 = 0;
                                                                    objO21 = new cs0() { // from class: i81
                                                                        @Override // defpackage.cs0
                                                                        public final Object a() {
                                                                            int i7 = i6;
                                                                            dm3 dm3Var2 = dm3.a;
                                                                            String str5 = str4;
                                                                            c63 c63Var8 = c63Var7;
                                                                            e93 e93Var61 = e93Var46;
                                                                            x50 x50Var6 = x50Var5;
                                                                            sa1 sa1Var7 = sa1Var6;
                                                                            switch (i7) {
                                                                                case 0:
                                                                                    if (!(((nm2) e93Var61.getValue()) instanceof mm2)) {
                                                                                        cl3.t(x50Var6, null, new b91(c63Var8, str5, null, 0), 3);
                                                                                    } else {
                                                                                        sa1Var7.i();
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    if (!(((nm2) e93Var61.getValue()) instanceof mm2)) {
                                                                                        cl3.t(x50Var6, null, new b91(c63Var8, str5, null, 1), 3);
                                                                                    } else {
                                                                                        sa1Var7.i();
                                                                                    }
                                                                                    break;
                                                                            }
                                                                            return dm3Var2;
                                                                        }
                                                                    };
                                                                    sa1Var5 = sa1Var6;
                                                                    nv0Var5.j0(objO21);
                                                                } else {
                                                                    sa1Var5 = sa1Var6;
                                                                }
                                                                cs0 cs0Var31 = (cs0) objO21;
                                                                boolean zH16 = nv0Var5.h(sa1Var5) | nv0Var5.f(us0Var5);
                                                                Object objO22 = nv0Var5.O();
                                                                if (zH16 || objO22 == zjVar2) {
                                                                    z14 = false;
                                                                    final Object[] objArr = 0 == true ? 1 : 0;
                                                                    objO22 = new cs0() { // from class: j81
                                                                        @Override // defpackage.cs0
                                                                        public final Object a() {
                                                                            int i7 = objArr;
                                                                            dm3 dm3Var2 = dm3.a;
                                                                            final us0 us0Var6 = us0Var5;
                                                                            sa1 sa1Var7 = sa1Var5;
                                                                            switch (i7) {
                                                                                case 0:
                                                                                    final int i8 = 1;
                                                                                    sa1Var7.j(new ts0() { // from class: l81
                                                                                        @Override // defpackage.ts0
                                                                                        public final Object l(Object obj13, Object obj14, Object obj15, Object obj16) {
                                                                                            int i9 = i8;
                                                                                            dm3 dm3Var3 = dm3.a;
                                                                                            kq2 kq2Var2 = (kq2) obj13;
                                                                                            String str5 = (String) obj14;
                                                                                            xy2 xy2Var = (xy2) obj15;
                                                                                            String str6 = (String) obj16;
                                                                                            switch (i9) {
                                                                                                case 0:
                                                                                                    kq2Var2.getClass();
                                                                                                    str5.getClass();
                                                                                                    xy2Var.getClass();
                                                                                                    str6.getClass();
                                                                                                    sv2 sv2Var = kq2Var2.a;
                                                                                                    us0Var6.j(sv2Var.a, Integer.valueOf(sv2Var.b), str5, xy2Var, str6);
                                                                                                    break;
                                                                                                default:
                                                                                                    kq2Var2.getClass();
                                                                                                    str5.getClass();
                                                                                                    xy2Var.getClass();
                                                                                                    str6.getClass();
                                                                                                    sv2 sv2Var2 = kq2Var2.a;
                                                                                                    us0Var6.j(sv2Var2.a, Integer.valueOf(sv2Var2.b), str5, xy2Var, str6);
                                                                                                    break;
                                                                                            }
                                                                                            return dm3Var3;
                                                                                        }
                                                                                    });
                                                                                    break;
                                                                                default:
                                                                                    final int i9 = 0;
                                                                                    sa1Var7.j(new ts0() { // from class: l81
                                                                                        @Override // defpackage.ts0
                                                                                        public final Object l(Object obj13, Object obj14, Object obj15, Object obj16) {
                                                                                            int i92 = i9;
                                                                                            dm3 dm3Var3 = dm3.a;
                                                                                            kq2 kq2Var2 = (kq2) obj13;
                                                                                            String str5 = (String) obj14;
                                                                                            xy2 xy2Var = (xy2) obj15;
                                                                                            String str6 = (String) obj16;
                                                                                            switch (i92) {
                                                                                                case 0:
                                                                                                    kq2Var2.getClass();
                                                                                                    str5.getClass();
                                                                                                    xy2Var.getClass();
                                                                                                    str6.getClass();
                                                                                                    sv2 sv2Var = kq2Var2.a;
                                                                                                    us0Var6.j(sv2Var.a, Integer.valueOf(sv2Var.b), str5, xy2Var, str6);
                                                                                                    break;
                                                                                                default:
                                                                                                    kq2Var2.getClass();
                                                                                                    str5.getClass();
                                                                                                    xy2Var.getClass();
                                                                                                    str6.getClass();
                                                                                                    sv2 sv2Var2 = kq2Var2.a;
                                                                                                    us0Var6.j(sv2Var2.a, Integer.valueOf(sv2Var2.b), str5, xy2Var, str6);
                                                                                                    break;
                                                                                            }
                                                                                            return dm3Var3;
                                                                                        }
                                                                                    });
                                                                                    break;
                                                                            }
                                                                            return dm3Var2;
                                                                        }
                                                                    };
                                                                    nv0Var5.j0(objO22);
                                                                } else {
                                                                    z14 = false;
                                                                }
                                                                f80.d(v71Var, ns0Var8, ns0Var9, ns0Var10, cs0Var30, cs0Var31, (cs0) objO22, nv0Var5, 8);
                                                                nv0Var5 = nv0Var5;
                                                                nv0Var5.p(z14);
                                                            } else {
                                                                z14 = false;
                                                                nv0Var5.a0(1789181996);
                                                                nv0Var5.p(false);
                                                            }
                                                            nv0Var5.p(true);
                                                            nv0Var5.p(true);
                                                            nv0Var5.p(z14);
                                                            return dm3Var;
                                                        }
                                                        nv0Var5.a0(977150450);
                                                        gm0 gm0Var5 = j43.c;
                                                        bq1 bq1VarT2 = vm1.t(f80.I(gm0Var5, x12Var), x12Var);
                                                        cn1 cn1VarD3 = eo.d(vmVar, false);
                                                        int iHashCode4 = Long.hashCode(nv0Var5.T);
                                                        n52 n52VarL4 = nv0Var5.l();
                                                        bq1 bq1VarM4 = lr.M(nv0Var5, bq1VarT2);
                                                        w10.c.getClass();
                                                        nv0Var5.d0();
                                                        if (nv0Var5.S) {
                                                            nv0Var5.k(x91Var);
                                                        } else {
                                                            nv0Var5.m0();
                                                        }
                                                        y02.F(z00Var4, nv0Var5, cn1VarD3);
                                                        y02.F(z00Var3, nv0Var5, n52VarL4);
                                                        nc2.r(iHashCode4, nv0Var5, z00Var2, nv0Var5);
                                                        y02.F(z00Var, nv0Var5, bq1VarM4);
                                                        cn1 cn1VarD4 = eo.d(f5.h, false);
                                                        int iHashCode5 = Long.hashCode(nv0Var5.T);
                                                        n52 n52VarL5 = nv0Var5.l();
                                                        bq1 bq1VarM5 = lr.M(nv0Var5, gm0Var5);
                                                        nv0Var5.d0();
                                                        if (nv0Var5.S) {
                                                            nv0Var5.k(x91Var);
                                                        } else {
                                                            nv0Var5.m0();
                                                        }
                                                        y02.F(z00Var4, nv0Var5, cn1VarD4);
                                                        y02.F(z00Var3, nv0Var5, n52VarL5);
                                                        nc2.r(iHashCode5, nv0Var5, z00Var2, nv0Var5);
                                                        y02.F(z00Var, nv0Var5, bq1VarM5);
                                                        if (z8) {
                                                            z9 = true;
                                                            bq1VarD = j43.q(yp1.a, 0.0f, 640.0f, 1).d(gm0Var5);
                                                        } else {
                                                            z9 = true;
                                                            bq1VarD = gm0Var5;
                                                        }
                                                        cn1 cn1VarD5 = eo.d(vmVar, false);
                                                        int iHashCode6 = Long.hashCode(nv0Var5.T);
                                                        n52 n52VarL6 = nv0Var5.l();
                                                        bq1 bq1VarM6 = lr.M(nv0Var5, bq1VarD);
                                                        nv0Var5.d0();
                                                        if (nv0Var5.S) {
                                                            nv0Var5.k(x91Var);
                                                        } else {
                                                            nv0Var5.m0();
                                                        }
                                                        y02.F(z00Var4, nv0Var5, cn1VarD5);
                                                        y02.F(z00Var3, nv0Var5, n52VarL6);
                                                        nc2.r(iHashCode6, nv0Var5, z00Var2, nv0Var5);
                                                        y02.F(z00Var, nv0Var5, bq1VarM6);
                                                        final int i7 = 1;
                                                        final c63 c63Var8 = c63Var5;
                                                        jo3.a(48, 16380, null, null, gq.N(-905719000, new ts0() { // from class: h81
                                                            @Override // defpackage.ts0
                                                            public final Object l(Object obj13, Object obj14, Object obj15, Object obj16) {
                                                                final sa1 sa1Var7;
                                                                final sa1 sa1Var8;
                                                                int i62 = i7;
                                                                zj zjVar3 = c20.a;
                                                                e93 e93Var61 = e93Var55;
                                                                e93 e93Var62 = e93Var54;
                                                                e93 e93Var63 = e93Var53;
                                                                e93 e93Var64 = e93Var52;
                                                                e93 e93Var65 = e93Var51;
                                                                e93 e93Var66 = e93Var50;
                                                                e93 e93Var67 = e93Var46;
                                                                e93 e93Var68 = e93Var49;
                                                                e93 e93Var69 = e93Var48;
                                                                e93 e93Var70 = e93Var47;
                                                                us0 us0Var6 = us0Var5;
                                                                ns0 ns0Var62 = ns0Var5;
                                                                final i32 i32Var5 = i32Var4;
                                                                final x50 x50Var6 = x50Var5;
                                                                lj0 lj0Var5 = lj0Var4;
                                                                switch (i62) {
                                                                    case 0:
                                                                        int iIntValue5 = ((Integer) obj14).intValue();
                                                                        nv0 nv0Var6 = (nv0) obj15;
                                                                        int iIntValue6 = ((Integer) obj16).intValue();
                                                                        ((z22) obj13).getClass();
                                                                        if ((iIntValue6 & 48) == 0) {
                                                                            iIntValue6 |= nv0Var6.d(iIntValue5) ? 32 : 16;
                                                                        }
                                                                        if (nv0Var6.R(iIntValue6 & 1, (iIntValue6 & 145) != 144)) {
                                                                            final lj0 mj0Var3 = (mj0) lj0Var5;
                                                                            int iOrdinal = ((ea1) mj0Var3.get(iIntValue5)).ordinal();
                                                                            sa1 sa1Var9 = sa1Var6;
                                                                            if (iOrdinal == 0) {
                                                                                nv0Var6.a0(-1737067268);
                                                                                String str5 = (String) e93Var70.getValue();
                                                                                kq2 kq2Var2 = (kq2) e93Var69.getValue();
                                                                                List list = (List) e93Var68.getValue();
                                                                                nm2 nm2Var = (nm2) e93Var67.getValue();
                                                                                boolean zH42 = nv0Var6.h(sa1Var9);
                                                                                Object objO92 = nv0Var6.O();
                                                                                if (zH42 || objO92 == zjVar3) {
                                                                                    objO92 = new k(1, sa1Var9, sa1.class, "saveDefaultServerId", "saveDefaultServerId(Ljava/lang/String;)V", 0, 0, 3);
                                                                                    nv0Var6.j0(objO92);
                                                                                }
                                                                                ns0 ns0Var72 = (ns0) ((ct0) objO92);
                                                                                boolean zH52 = nv0Var6.h(sa1Var9);
                                                                                Object objO102 = nv0Var6.O();
                                                                                if (zH52 || objO102 == zjVar3) {
                                                                                    objO102 = new c7(0, sa1Var9, sa1.class, "quickLaunch", "quickLaunch()V", 0, 0, 13);
                                                                                    nv0Var6.j0(objO102);
                                                                                }
                                                                                cs0 cs0Var282 = (cs0) ((ct0) objO102);
                                                                                boolean zH62 = nv0Var6.h(x50Var6) | nv0Var6.f(i32Var5) | nv0Var6.h(mj0Var3);
                                                                                Object objO112 = nv0Var6.O();
                                                                                if (zH62 || objO112 == zjVar3) {
                                                                                    final int i72 = 2;
                                                                                    objO112 = new cs0() { // from class: m81
                                                                                        @Override // defpackage.cs0
                                                                                        public final Object a() {
                                                                                            int i82 = i72;
                                                                                            dm3 dm3Var2 = dm3.a;
                                                                                            lj0 lj0Var6 = mj0Var3;
                                                                                            i32 i32Var6 = i32Var5;
                                                                                            x50 x50Var7 = x50Var6;
                                                                                            switch (i82) {
                                                                                                case 0:
                                                                                                    cl3.t(x50Var7, null, new z81(i32Var6, lj0Var6, null, 2), 3);
                                                                                                    break;
                                                                                                case 1:
                                                                                                    cl3.t(x50Var7, null, new z81(i32Var6, lj0Var6, null, 3), 3);
                                                                                                    break;
                                                                                                case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                                                                                                    cl3.t(x50Var7, null, new z81(i32Var6, lj0Var6, null, 0), 3);
                                                                                                    break;
                                                                                                default:
                                                                                                    cl3.t(x50Var7, null, new z81(i32Var6, lj0Var6, null, 1), 3);
                                                                                                    break;
                                                                                            }
                                                                                            return dm3Var2;
                                                                                        }
                                                                                    };
                                                                                    nv0Var6.j0(objO112);
                                                                                }
                                                                                cs0 cs0Var292 = (cs0) objO112;
                                                                                boolean zH72 = nv0Var6.h(x50Var6) | nv0Var6.f(i32Var5) | nv0Var6.h(mj0Var3);
                                                                                Object objO122 = nv0Var6.O();
                                                                                if (zH72 || objO122 == zjVar3) {
                                                                                    final int i8 = 3;
                                                                                    objO122 = new cs0() { // from class: m81
                                                                                        @Override // defpackage.cs0
                                                                                        public final Object a() {
                                                                                            int i82 = i8;
                                                                                            dm3 dm3Var2 = dm3.a;
                                                                                            lj0 lj0Var6 = mj0Var3;
                                                                                            i32 i32Var6 = i32Var5;
                                                                                            x50 x50Var7 = x50Var6;
                                                                                            switch (i82) {
                                                                                                case 0:
                                                                                                    cl3.t(x50Var7, null, new z81(i32Var6, lj0Var6, null, 2), 3);
                                                                                                    break;
                                                                                                case 1:
                                                                                                    cl3.t(x50Var7, null, new z81(i32Var6, lj0Var6, null, 3), 3);
                                                                                                    break;
                                                                                                case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                                                                                                    cl3.t(x50Var7, null, new z81(i32Var6, lj0Var6, null, 0), 3);
                                                                                                    break;
                                                                                                default:
                                                                                                    cl3.t(x50Var7, null, new z81(i32Var6, lj0Var6, null, 1), 3);
                                                                                                    break;
                                                                                            }
                                                                                            return dm3Var2;
                                                                                        }
                                                                                    };
                                                                                    nv0Var6.j0(objO122);
                                                                                }
                                                                                vr.f(str5, kq2Var2, list, nm2Var, ns0Var72, cs0Var282, cs0Var292, (cs0) objO122, nv0Var6, 0);
                                                                                nv0Var6.p(false);
                                                                            } else if (iOrdinal == 1) {
                                                                                nv0Var6.a0(-1737030343);
                                                                                List list2 = (List) e93Var68.getValue();
                                                                                boolean zBooleanValue = ((Boolean) e93Var66.getValue()).booleanValue();
                                                                                vj2 vj2Var = (vj2) e93Var65.getValue();
                                                                                boolean zH82 = nv0Var6.h(sa1Var9);
                                                                                Object objO132 = nv0Var6.O();
                                                                                if (zH82 || objO132 == zjVar3) {
                                                                                    objO132 = new c7(0, sa1Var9, sa1.class, "showAddServerDialog", "showAddServerDialog()V", 0, 0, 18);
                                                                                    sa1Var7 = sa1Var9;
                                                                                    nv0Var6.j0(objO132);
                                                                                } else {
                                                                                    sa1Var7 = sa1Var9;
                                                                                }
                                                                                cs0 cs0Var302 = (cs0) ((ct0) objO132);
                                                                                boolean zH92 = nv0Var6.h(sa1Var7);
                                                                                Object objO142 = nv0Var6.O();
                                                                                if (zH92 || objO142 == zjVar3) {
                                                                                    objO142 = new c7(0, sa1Var7, sa1.class, "refreshSavedServers", "refreshSavedServers()V", 0, 0, 19);
                                                                                    nv0Var6.j0(objO142);
                                                                                }
                                                                                cs0 cs0Var312 = (cs0) ((ct0) objO142);
                                                                                boolean zH102 = nv0Var6.h(sa1Var7);
                                                                                Object objO152 = nv0Var6.O();
                                                                                if (zH102 || objO152 == zjVar3) {
                                                                                    objO152 = new a91(0, sa1Var7, sa1.class, "loadRecommendedServers", "loadRecommendedServers(Z)V", 0, 0);
                                                                                    nv0Var6.j0(objO152);
                                                                                }
                                                                                cs0 cs0Var32 = (cs0) objO152;
                                                                                boolean zH112 = nv0Var6.h(sa1Var7);
                                                                                Object objO162 = nv0Var6.O();
                                                                                if (zH112 || objO162 == zjVar3) {
                                                                                    final int i9 = 1;
                                                                                    objO162 = new cs0() { // from class: n81
                                                                                        @Override // defpackage.cs0
                                                                                        public final Object a() {
                                                                                            int i102 = i9;
                                                                                            dm3 dm3Var2 = dm3.a;
                                                                                            sa1 sa1Var102 = sa1Var7;
                                                                                            switch (i102) {
                                                                                                case 0:
                                                                                                    sa1Var102.l(true);
                                                                                                    break;
                                                                                                default:
                                                                                                    sa1Var102.l(true);
                                                                                                    break;
                                                                                            }
                                                                                            return dm3Var2;
                                                                                        }
                                                                                    };
                                                                                    nv0Var6.j0(objO162);
                                                                                }
                                                                                cs0 cs0Var33 = (cs0) objO162;
                                                                                boolean zH122 = nv0Var6.h(sa1Var7);
                                                                                Object objO172 = nv0Var6.O();
                                                                                if (zH122 || objO172 == zjVar3) {
                                                                                    objO172 = new k(1, sa1Var7, sa1.class, "addRecommendedServer", "addRecommendedServer(Ltop/th1nk/samp/core/config/ServerAddress;)V", 0, 0, 12);
                                                                                    nv0Var6.j0(objO172);
                                                                                }
                                                                                ns0 ns0Var82 = (ns0) ((ct0) objO172);
                                                                                boolean zH132 = nv0Var6.h(sa1Var7);
                                                                                Object objO182 = nv0Var6.O();
                                                                                if (zH132 || objO182 == zjVar3) {
                                                                                    objO182 = new k(1, sa1Var7, sa1.class, "refreshServer", "refreshServer(Ltop/th1nk/samp/core/config/ServerAddress;)V", 0, 0, 4);
                                                                                    nv0Var6.j0(objO182);
                                                                                }
                                                                                ns0 ns0Var92 = (ns0) ((ct0) objO182);
                                                                                boolean zH142 = nv0Var6.h(sa1Var7);
                                                                                Object objO192 = nv0Var6.O();
                                                                                if (zH142 || objO192 == zjVar3) {
                                                                                    objO192 = new k(1, sa1Var7, sa1.class, "requestRemoveServer", "requestRemoveServer(Ltop/th1nk/samp/core/config/SavedServer;)V", 0, 0, 5);
                                                                                    nv0Var6.j0(objO192);
                                                                                }
                                                                                ns0 ns0Var102 = (ns0) ((ct0) objO192);
                                                                                boolean zH152 = nv0Var6.h(sa1Var7);
                                                                                Object objO202 = nv0Var6.O();
                                                                                if (zH152 || objO202 == zjVar3) {
                                                                                    objO202 = new op0(2, sa1Var7, sa1.class, "showRulesDialog", "showRulesDialog(Ltop/th1nk/samp/core/config/ServerAddress;Ljava/util/Map;)V", 0, 0, 2);
                                                                                    nv0Var6.j0(objO202);
                                                                                }
                                                                                rs0 rs0Var = (rs0) ((ct0) objO202);
                                                                                boolean zH162 = nv0Var6.h(sa1Var7);
                                                                                Object objO212 = nv0Var6.O();
                                                                                if (zH162 || objO212 == zjVar3) {
                                                                                    objO212 = new k(1, sa1Var7, sa1.class, "showPlayersDialog", "showPlayersDialog(Ltop/th1nk/samp/core/config/ServerAddress;)V", 0, 0, 6);
                                                                                    nv0Var6.j0(objO212);
                                                                                }
                                                                                ns0 ns0Var11 = (ns0) ((ct0) objO212);
                                                                                boolean zH17 = nv0Var6.h(sa1Var7);
                                                                                Object objO222 = nv0Var6.O();
                                                                                if (zH17 || objO222 == zjVar3) {
                                                                                    objO222 = new k(1, sa1Var7, sa1.class, "showLaunchDialog", "showLaunchDialog(Ltop/th1nk/samp/core/config/SavedServer;)V", 0, 0, 7);
                                                                                    nv0Var6.j0(objO222);
                                                                                }
                                                                                f80.t(list2, zBooleanValue, vj2Var, cs0Var302, cs0Var312, cs0Var32, cs0Var33, ns0Var82, ns0Var92, ns0Var102, rs0Var, ns0Var11, (ns0) ((ct0) objO222), nv0Var6, 0);
                                                                                nv0Var6.p(false);
                                                                            } else if (iOrdinal == 2) {
                                                                                nv0Var6.a0(-1736988253);
                                                                                nm2 nm2Var2 = (nm2) e93Var67.getValue();
                                                                                g83 g83Var = (g83) e93Var64.getValue();
                                                                                hd0 hd0Var = (hd0) e93Var63.getValue();
                                                                                al0 al0Var = (al0) e93Var62.getValue();
                                                                                String str6 = (String) e93Var61.getValue();
                                                                                sm2 sm2Var7 = sm2Var5;
                                                                                boolean zH18 = nv0Var6.h(sm2Var7);
                                                                                Object objO23 = nv0Var6.O();
                                                                                if (zH18 || objO23 == zjVar3) {
                                                                                    objO23 = new c7(0, sm2Var7, sm2.class, "checkResources", "checkResources()V", 0, 0, 10);
                                                                                    nv0Var6.j0(objO23);
                                                                                }
                                                                                cs0 cs0Var34 = (cs0) ((ct0) objO23);
                                                                                boolean zH19 = nv0Var6.h(sm2Var7);
                                                                                Object objO24 = nv0Var6.O();
                                                                                if (zH19 || objO24 == zjVar3) {
                                                                                    objO24 = new k(1, sm2Var7, sm2.class, "fetchSourceList", "fetchSourceList(Ljava/lang/String;)V", 0, 0, 8);
                                                                                    nv0Var6.j0(objO24);
                                                                                }
                                                                                ns0 ns0Var12 = (ns0) ((ct0) objO24);
                                                                                boolean zH20 = nv0Var6.h(sm2Var7);
                                                                                Object objO25 = nv0Var6.O();
                                                                                if (zH20 || objO25 == zjVar3) {
                                                                                    objO25 = new c7(0, sm2Var7, sm2.class, "useOfficialSourceList", "useOfficialSourceList()V", 0, 0, 11);
                                                                                    nv0Var6.j0(objO25);
                                                                                }
                                                                                cs0 cs0Var35 = (cs0) ((ct0) objO25);
                                                                                boolean zH21 = nv0Var6.h(sm2Var7);
                                                                                Object objO26 = nv0Var6.O();
                                                                                if (zH21 || objO26 == zjVar3) {
                                                                                    objO26 = new c7(0, sm2Var7, sm2.class, "refreshSourceList", "refreshSourceList()V", 0, 0, 12);
                                                                                    nv0Var6.j0(objO26);
                                                                                }
                                                                                cs0 cs0Var36 = (cs0) ((ct0) objO26);
                                                                                boolean zH22 = nv0Var6.h(sm2Var7);
                                                                                Object objO27 = nv0Var6.O();
                                                                                if (zH22 || objO27 == zjVar3) {
                                                                                    objO27 = new k(1, sm2Var7, sm2.class, "startDownload", "startDownload(Ltop/th1nk/samp/feature/download/ResourceSource;)V", 0, 0, 9);
                                                                                    nv0Var6.j0(objO27);
                                                                                }
                                                                                ns0 ns0Var13 = (ns0) ((ct0) objO27);
                                                                                boolean zH23 = nv0Var6.h(sm2Var7);
                                                                                Object objO28 = nv0Var6.O();
                                                                                if (zH23 || objO28 == zjVar3) {
                                                                                    objO28 = new c7(0, sm2Var7, sm2.class, "cancelDownload", "cancelDownload()V", 0, 0, 14);
                                                                                    nv0Var6.j0(objO28);
                                                                                }
                                                                                cs0 cs0Var37 = (cs0) ((ct0) objO28);
                                                                                boolean zH24 = nv0Var6.h(sm2Var7);
                                                                                Object objO29 = nv0Var6.O();
                                                                                if (zH24 || objO29 == zjVar3) {
                                                                                    objO29 = new c7(0, sm2Var7, sm2.class, "resetDownloadState", "resetDownloadState()V", 0, 0, 15);
                                                                                    nv0Var6.j0(objO29);
                                                                                }
                                                                                cs0 cs0Var38 = (cs0) ((ct0) objO29);
                                                                                boolean zH25 = nv0Var6.h(sm2Var7);
                                                                                Object objO30 = nv0Var6.O();
                                                                                if (zH25 || objO30 == zjVar3) {
                                                                                    objO30 = new k(1, sm2Var7, sm2.class, "startExtract", "startExtract(Ljava/io/File;)V", 0, 0, 10);
                                                                                    nv0Var6.j0(objO30);
                                                                                }
                                                                                ns0 ns0Var14 = (ns0) ((ct0) objO30);
                                                                                boolean zH26 = nv0Var6.h(sm2Var7);
                                                                                Object objO31 = nv0Var6.O();
                                                                                if (zH26 || objO31 == zjVar3) {
                                                                                    objO31 = new c7(0, sm2Var7, sm2.class, "cancelExtract", "cancelExtract()V", 0, 0, 16);
                                                                                    nv0Var6.j0(objO31);
                                                                                }
                                                                                cs0 cs0Var39 = (cs0) ((ct0) objO31);
                                                                                boolean zH27 = nv0Var6.h(sm2Var7);
                                                                                Object objO32 = nv0Var6.O();
                                                                                if (zH27 || objO32 == zjVar3) {
                                                                                    objO32 = new c7(0, sm2Var7, sm2.class, "resetExtractState", "resetExtractState()V", 0, 0, 17);
                                                                                    nv0Var6.j0(objO32);
                                                                                }
                                                                                cs0 cs0Var40 = (cs0) ((ct0) objO32);
                                                                                boolean zH28 = nv0Var6.h(sm2Var7);
                                                                                Object objO33 = nv0Var6.O();
                                                                                if (zH28 || objO33 == zjVar3) {
                                                                                    objO33 = new k(1, sm2Var7, sm2.class, "importLocalZip", "importLocalZip(Landroid/net/Uri;)V", 0, 0, 11);
                                                                                    nv0Var6.j0(objO33);
                                                                                }
                                                                                ns0 ns0Var15 = (ns0) ((ct0) objO33);
                                                                                Object objO34 = nv0Var6.O();
                                                                                if (objO34 == zjVar3) {
                                                                                    c00 c00Var = new c00(2, c63Var8, c63.class, "showSnackbar", "showSnackbar(Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/material3/SnackbarDuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 8, 1);
                                                                                    nv0Var6.j0(c00Var);
                                                                                    objO34 = c00Var;
                                                                                }
                                                                                w7.u(nm2Var2, g83Var, hd0Var, al0Var, str6, cs0Var34, ns0Var12, cs0Var35, cs0Var36, ns0Var13, cs0Var37, cs0Var38, ns0Var14, cs0Var39, cs0Var40, ns0Var15, (rs0) objO34, nv0Var6, 0);
                                                                                nv0Var6.p(false);
                                                                            } else if (iOrdinal == 3) {
                                                                                nv0Var6.a0(1990103706);
                                                                                w7.s(ns0Var62, us0Var6, nv0Var6, 0);
                                                                                nv0Var6.p(false);
                                                                            } else {
                                                                                if (iOrdinal != 4) {
                                                                                    throw by1.d(nv0Var6, -1737065520, false);
                                                                                }
                                                                                nv0Var6.a0(1989440957);
                                                                                g12.r(cs0Var23, cs0Var24, cs0Var25, cs0Var26, cs0Var27, nv0Var6, 0);
                                                                                nv0Var6.p(false);
                                                                            }
                                                                        } else {
                                                                            nv0Var6.U();
                                                                        }
                                                                        return dm3.a;
                                                                    default:
                                                                        int iIntValue7 = ((Integer) obj14).intValue();
                                                                        nv0 nv0Var7 = (nv0) obj15;
                                                                        int iIntValue8 = ((Integer) obj16).intValue();
                                                                        ((z22) obj13).getClass();
                                                                        if ((iIntValue8 & 48) == 0) {
                                                                            iIntValue8 |= nv0Var7.d(iIntValue7) ? 32 : 16;
                                                                        }
                                                                        int i10 = iIntValue8;
                                                                        if (nv0Var7.R(i10 & 1, (i10 & 145) != 144)) {
                                                                            final lj0 mj0Var4 = (mj0) lj0Var5;
                                                                            int iOrdinal2 = ((ea1) mj0Var4.get(iIntValue7)).ordinal();
                                                                            sa1 sa1Var10 = sa1Var6;
                                                                            if (iOrdinal2 == 0) {
                                                                                nv0Var7.a0(1482406509);
                                                                                String str7 = (String) e93Var70.getValue();
                                                                                kq2 kq2Var22 = (kq2) e93Var69.getValue();
                                                                                List list3 = (List) e93Var68.getValue();
                                                                                nm2 nm2Var3 = (nm2) e93Var67.getValue();
                                                                                boolean zH29 = nv0Var7.h(sa1Var10);
                                                                                Object objO35 = nv0Var7.O();
                                                                                if (zH29 || objO35 == zjVar3) {
                                                                                    objO35 = new k(1, sa1Var10, sa1.class, "saveDefaultServerId", "saveDefaultServerId(Ljava/lang/String;)V", 0, 0, 18);
                                                                                    nv0Var7.j0(objO35);
                                                                                }
                                                                                ns0 ns0Var16 = (ns0) ((ct0) objO35);
                                                                                boolean zH30 = nv0Var7.h(sa1Var10);
                                                                                Object objO36 = nv0Var7.O();
                                                                                if (zH30 || objO36 == zjVar3) {
                                                                                    objO36 = new c91(0, sa1Var10, sa1.class, "quickLaunch", "quickLaunch()V", 0, 0, 0);
                                                                                    nv0Var7.j0(objO36);
                                                                                }
                                                                                cs0 cs0Var41 = (cs0) ((ct0) objO36);
                                                                                boolean zH31 = nv0Var7.h(x50Var6) | nv0Var7.f(i32Var5) | nv0Var7.h(mj0Var4);
                                                                                Object objO37 = nv0Var7.O();
                                                                                if (zH31 || objO37 == zjVar3) {
                                                                                    final int i11 = 0;
                                                                                    objO37 = new cs0() { // from class: m81
                                                                                        @Override // defpackage.cs0
                                                                                        public final Object a() {
                                                                                            int i82 = i11;
                                                                                            dm3 dm3Var2 = dm3.a;
                                                                                            lj0 lj0Var6 = mj0Var4;
                                                                                            i32 i32Var6 = i32Var5;
                                                                                            x50 x50Var7 = x50Var6;
                                                                                            switch (i82) {
                                                                                                case 0:
                                                                                                    cl3.t(x50Var7, null, new z81(i32Var6, lj0Var6, null, 2), 3);
                                                                                                    break;
                                                                                                case 1:
                                                                                                    cl3.t(x50Var7, null, new z81(i32Var6, lj0Var6, null, 3), 3);
                                                                                                    break;
                                                                                                case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                                                                                                    cl3.t(x50Var7, null, new z81(i32Var6, lj0Var6, null, 0), 3);
                                                                                                    break;
                                                                                                default:
                                                                                                    cl3.t(x50Var7, null, new z81(i32Var6, lj0Var6, null, 1), 3);
                                                                                                    break;
                                                                                            }
                                                                                            return dm3Var2;
                                                                                        }
                                                                                    };
                                                                                    nv0Var7.j0(objO37);
                                                                                }
                                                                                cs0 cs0Var42 = (cs0) objO37;
                                                                                boolean zH32 = nv0Var7.h(x50Var6) | nv0Var7.f(i32Var5) | nv0Var7.h(mj0Var4);
                                                                                Object objO38 = nv0Var7.O();
                                                                                if (zH32 || objO38 == zjVar3) {
                                                                                    final int i12 = 1;
                                                                                    objO38 = new cs0() { // from class: m81
                                                                                        @Override // defpackage.cs0
                                                                                        public final Object a() {
                                                                                            int i82 = i12;
                                                                                            dm3 dm3Var2 = dm3.a;
                                                                                            lj0 lj0Var6 = mj0Var4;
                                                                                            i32 i32Var6 = i32Var5;
                                                                                            x50 x50Var7 = x50Var6;
                                                                                            switch (i82) {
                                                                                                case 0:
                                                                                                    cl3.t(x50Var7, null, new z81(i32Var6, lj0Var6, null, 2), 3);
                                                                                                    break;
                                                                                                case 1:
                                                                                                    cl3.t(x50Var7, null, new z81(i32Var6, lj0Var6, null, 3), 3);
                                                                                                    break;
                                                                                                case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                                                                                                    cl3.t(x50Var7, null, new z81(i32Var6, lj0Var6, null, 0), 3);
                                                                                                    break;
                                                                                                default:
                                                                                                    cl3.t(x50Var7, null, new z81(i32Var6, lj0Var6, null, 1), 3);
                                                                                                    break;
                                                                                            }
                                                                                            return dm3Var2;
                                                                                        }
                                                                                    };
                                                                                    nv0Var7.j0(objO38);
                                                                                }
                                                                                vr.f(str7, kq2Var22, list3, nm2Var3, ns0Var16, cs0Var41, cs0Var42, (cs0) objO38, nv0Var7, 0);
                                                                                nv0Var7.p(false);
                                                                            } else if (iOrdinal2 == 1) {
                                                                                nv0Var7.a0(1482443434);
                                                                                List list4 = (List) e93Var68.getValue();
                                                                                boolean zBooleanValue2 = ((Boolean) e93Var66.getValue()).booleanValue();
                                                                                vj2 vj2Var2 = (vj2) e93Var65.getValue();
                                                                                boolean zH33 = nv0Var7.h(sa1Var10);
                                                                                Object objO39 = nv0Var7.O();
                                                                                if (zH33 || objO39 == zjVar3) {
                                                                                    objO39 = new c91(0, sa1Var10, sa1.class, "showAddServerDialog", "showAddServerDialog()V", 0, 0, 5);
                                                                                    sa1Var8 = sa1Var10;
                                                                                    nv0Var7.j0(objO39);
                                                                                } else {
                                                                                    sa1Var8 = sa1Var10;
                                                                                }
                                                                                cs0 cs0Var43 = (cs0) ((ct0) objO39);
                                                                                boolean zH34 = nv0Var7.h(sa1Var8);
                                                                                Object objO40 = nv0Var7.O();
                                                                                if (zH34 || objO40 == zjVar3) {
                                                                                    objO40 = new c91(0, sa1Var8, sa1.class, "refreshSavedServers", "refreshSavedServers()V", 0, 0, 6);
                                                                                    nv0Var7.j0(objO40);
                                                                                }
                                                                                cs0 cs0Var44 = (cs0) ((ct0) objO40);
                                                                                boolean zH35 = nv0Var7.h(sa1Var8);
                                                                                Object objO41 = nv0Var7.O();
                                                                                if (zH35 || objO41 == zjVar3) {
                                                                                    objO41 = new a91(0, sa1Var8, sa1.class, "loadRecommendedServers", "loadRecommendedServers(Z)V", 0, 1);
                                                                                    nv0Var7.j0(objO41);
                                                                                }
                                                                                cs0 cs0Var45 = (cs0) objO41;
                                                                                boolean zH36 = nv0Var7.h(sa1Var8);
                                                                                Object objO42 = nv0Var7.O();
                                                                                if (zH36 || objO42 == zjVar3) {
                                                                                    final int i13 = 0;
                                                                                    objO42 = new cs0() { // from class: n81
                                                                                        @Override // defpackage.cs0
                                                                                        public final Object a() {
                                                                                            int i102 = i13;
                                                                                            dm3 dm3Var2 = dm3.a;
                                                                                            sa1 sa1Var102 = sa1Var8;
                                                                                            switch (i102) {
                                                                                                case 0:
                                                                                                    sa1Var102.l(true);
                                                                                                    break;
                                                                                                default:
                                                                                                    sa1Var102.l(true);
                                                                                                    break;
                                                                                            }
                                                                                            return dm3Var2;
                                                                                        }
                                                                                    };
                                                                                    nv0Var7.j0(objO42);
                                                                                }
                                                                                cs0 cs0Var46 = (cs0) objO42;
                                                                                boolean zH37 = nv0Var7.h(sa1Var8);
                                                                                Object objO43 = nv0Var7.O();
                                                                                if (zH37 || objO43 == zjVar3) {
                                                                                    objO43 = new k(1, sa1Var8, sa1.class, "addRecommendedServer", "addRecommendedServer(Ltop/th1nk/samp/core/config/ServerAddress;)V", 0, 0, 27);
                                                                                    nv0Var7.j0(objO43);
                                                                                }
                                                                                ns0 ns0Var17 = (ns0) ((ct0) objO43);
                                                                                boolean zH38 = nv0Var7.h(sa1Var8);
                                                                                Object objO44 = nv0Var7.O();
                                                                                if (zH38 || objO44 == zjVar3) {
                                                                                    objO44 = new k(1, sa1Var8, sa1.class, "refreshServer", "refreshServer(Ltop/th1nk/samp/core/config/ServerAddress;)V", 0, 0, 19);
                                                                                    nv0Var7.j0(objO44);
                                                                                }
                                                                                ns0 ns0Var18 = (ns0) ((ct0) objO44);
                                                                                boolean zH39 = nv0Var7.h(sa1Var8);
                                                                                Object objO45 = nv0Var7.O();
                                                                                if (zH39 || objO45 == zjVar3) {
                                                                                    objO45 = new k(1, sa1Var8, sa1.class, "requestRemoveServer", "requestRemoveServer(Ltop/th1nk/samp/core/config/SavedServer;)V", 0, 0, 20);
                                                                                    nv0Var7.j0(objO45);
                                                                                }
                                                                                ns0 ns0Var19 = (ns0) ((ct0) objO45);
                                                                                boolean zH40 = nv0Var7.h(sa1Var8);
                                                                                Object objO46 = nv0Var7.O();
                                                                                if (zH40 || objO46 == zjVar3) {
                                                                                    objO46 = new op0(2, sa1Var8, sa1.class, "showRulesDialog", "showRulesDialog(Ltop/th1nk/samp/core/config/ServerAddress;Ljava/util/Map;)V", 0, 0, 3);
                                                                                    nv0Var7.j0(objO46);
                                                                                }
                                                                                rs0 rs0Var2 = (rs0) ((ct0) objO46);
                                                                                boolean zH41 = nv0Var7.h(sa1Var8);
                                                                                Object objO47 = nv0Var7.O();
                                                                                if (zH41 || objO47 == zjVar3) {
                                                                                    objO47 = new k(1, sa1Var8, sa1.class, "showPlayersDialog", "showPlayersDialog(Ltop/th1nk/samp/core/config/ServerAddress;)V", 0, 0, 21);
                                                                                    nv0Var7.j0(objO47);
                                                                                }
                                                                                ns0 ns0Var20 = (ns0) ((ct0) objO47);
                                                                                boolean zH422 = nv0Var7.h(sa1Var8);
                                                                                Object objO48 = nv0Var7.O();
                                                                                if (zH422 || objO48 == zjVar3) {
                                                                                    objO48 = new k(1, sa1Var8, sa1.class, "showLaunchDialog", "showLaunchDialog(Ltop/th1nk/samp/core/config/SavedServer;)V", 0, 0, 22);
                                                                                    nv0Var7.j0(objO48);
                                                                                }
                                                                                f80.t(list4, zBooleanValue2, vj2Var2, cs0Var43, cs0Var44, cs0Var45, cs0Var46, ns0Var17, ns0Var18, ns0Var19, rs0Var2, ns0Var20, (ns0) ((ct0) objO48), nv0Var7, 0);
                                                                                nv0Var7.p(false);
                                                                            } else if (iOrdinal2 == 2) {
                                                                                nv0Var7.a0(1482485524);
                                                                                nm2 nm2Var4 = (nm2) e93Var67.getValue();
                                                                                g83 g83Var2 = (g83) e93Var64.getValue();
                                                                                hd0 hd0Var2 = (hd0) e93Var63.getValue();
                                                                                al0 al0Var2 = (al0) e93Var62.getValue();
                                                                                String str8 = (String) e93Var61.getValue();
                                                                                sm2 sm2Var8 = sm2Var5;
                                                                                boolean zH43 = nv0Var7.h(sm2Var8);
                                                                                Object objO49 = nv0Var7.O();
                                                                                if (zH43 || objO49 == zjVar3) {
                                                                                    c7 c7Var = new c7(0, sm2Var8, sm2.class, "checkResources", "checkResources()V", 0, 0, 27);
                                                                                    nv0Var7.j0(c7Var);
                                                                                    objO49 = c7Var;
                                                                                }
                                                                                cs0 cs0Var47 = (cs0) ((ct0) objO49);
                                                                                boolean zH44 = nv0Var7.h(sm2Var8);
                                                                                Object objO50 = nv0Var7.O();
                                                                                if (zH44 || objO50 == zjVar3) {
                                                                                    k kVar = new k(1, sm2Var8, sm2.class, "fetchSourceList", "fetchSourceList(Ljava/lang/String;)V", 0, 0, 23);
                                                                                    nv0Var7.j0(kVar);
                                                                                    objO50 = kVar;
                                                                                }
                                                                                ns0 ns0Var21 = (ns0) ((ct0) objO50);
                                                                                boolean zH45 = nv0Var7.h(sm2Var8);
                                                                                Object objO51 = nv0Var7.O();
                                                                                if (zH45 || objO51 == zjVar3) {
                                                                                    c7 c7Var2 = new c7(0, sm2Var8, sm2.class, "useOfficialSourceList", "useOfficialSourceList()V", 0, 0, 28);
                                                                                    nv0Var7.j0(c7Var2);
                                                                                    objO51 = c7Var2;
                                                                                }
                                                                                cs0 cs0Var48 = (cs0) ((ct0) objO51);
                                                                                boolean zH46 = nv0Var7.h(sm2Var8);
                                                                                Object objO52 = nv0Var7.O();
                                                                                if (zH46 || objO52 == zjVar3) {
                                                                                    c7 c7Var3 = new c7(0, sm2Var8, sm2.class, "refreshSourceList", "refreshSourceList()V", 0, 0, 29);
                                                                                    nv0Var7.j0(c7Var3);
                                                                                    objO52 = c7Var3;
                                                                                }
                                                                                cs0 cs0Var49 = (cs0) ((ct0) objO52);
                                                                                boolean zH47 = nv0Var7.h(sm2Var8);
                                                                                Object objO53 = nv0Var7.O();
                                                                                if (zH47 || objO53 == zjVar3) {
                                                                                    k kVar2 = new k(1, sm2Var8, sm2.class, "startDownload", "startDownload(Ltop/th1nk/samp/feature/download/ResourceSource;)V", 0, 0, 24);
                                                                                    nv0Var7.j0(kVar2);
                                                                                    objO53 = kVar2;
                                                                                }
                                                                                ns0 ns0Var22 = (ns0) ((ct0) objO53);
                                                                                boolean zH48 = nv0Var7.h(sm2Var8);
                                                                                Object objO54 = nv0Var7.O();
                                                                                if (zH48 || objO54 == zjVar3) {
                                                                                    c91 c91Var = new c91(0, sm2Var8, sm2.class, "cancelDownload", "cancelDownload()V", 0, 0, 1);
                                                                                    nv0Var7.j0(c91Var);
                                                                                    objO54 = c91Var;
                                                                                }
                                                                                cs0 cs0Var50 = (cs0) ((ct0) objO54);
                                                                                boolean zH49 = nv0Var7.h(sm2Var8);
                                                                                Object objO55 = nv0Var7.O();
                                                                                if (zH49 || objO55 == zjVar3) {
                                                                                    c91 c91Var2 = new c91(0, sm2Var8, sm2.class, "resetDownloadState", "resetDownloadState()V", 0, 0, 2);
                                                                                    nv0Var7.j0(c91Var2);
                                                                                    objO55 = c91Var2;
                                                                                }
                                                                                cs0 cs0Var51 = (cs0) ((ct0) objO55);
                                                                                boolean zH50 = nv0Var7.h(sm2Var8);
                                                                                Object objO56 = nv0Var7.O();
                                                                                if (zH50 || objO56 == zjVar3) {
                                                                                    k kVar3 = new k(1, sm2Var8, sm2.class, "startExtract", "startExtract(Ljava/io/File;)V", 0, 0, 25);
                                                                                    nv0Var7.j0(kVar3);
                                                                                    objO56 = kVar3;
                                                                                }
                                                                                ns0 ns0Var23 = (ns0) ((ct0) objO56);
                                                                                boolean zH51 = nv0Var7.h(sm2Var8);
                                                                                Object objO57 = nv0Var7.O();
                                                                                if (zH51 || objO57 == zjVar3) {
                                                                                    c91 c91Var3 = new c91(0, sm2Var8, sm2.class, "cancelExtract", "cancelExtract()V", 0, 0, 3);
                                                                                    nv0Var7.j0(c91Var3);
                                                                                    objO57 = c91Var3;
                                                                                }
                                                                                cs0 cs0Var52 = (cs0) ((ct0) objO57);
                                                                                boolean zH522 = nv0Var7.h(sm2Var8);
                                                                                Object objO58 = nv0Var7.O();
                                                                                if (zH522 || objO58 == zjVar3) {
                                                                                    c91 c91Var4 = new c91(0, sm2Var8, sm2.class, "resetExtractState", "resetExtractState()V", 0, 0, 4);
                                                                                    nv0Var7.j0(c91Var4);
                                                                                    objO58 = c91Var4;
                                                                                }
                                                                                cs0 cs0Var53 = (cs0) ((ct0) objO58);
                                                                                boolean zH53 = nv0Var7.h(sm2Var8);
                                                                                Object objO59 = nv0Var7.O();
                                                                                if (zH53 || objO59 == zjVar3) {
                                                                                    k kVar4 = new k(1, sm2Var8, sm2.class, "importLocalZip", "importLocalZip(Landroid/net/Uri;)V", 0, 0, 26);
                                                                                    nv0Var7.j0(kVar4);
                                                                                    objO59 = kVar4;
                                                                                }
                                                                                ns0 ns0Var24 = (ns0) ((ct0) objO59);
                                                                                Object objO60 = nv0Var7.O();
                                                                                if (objO60 == zjVar3) {
                                                                                    c00 c00Var2 = new c00(2, c63Var8, c63.class, "showSnackbar", "showSnackbar(Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/material3/SnackbarDuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 8, 2);
                                                                                    nv0Var7.j0(c00Var2);
                                                                                    objO60 = c00Var2;
                                                                                }
                                                                                w7.u(nm2Var4, g83Var2, hd0Var2, al0Var2, str8, cs0Var47, ns0Var21, cs0Var48, cs0Var49, ns0Var22, cs0Var50, cs0Var51, ns0Var23, cs0Var52, cs0Var53, ns0Var24, (rs0) objO60, nv0Var7, 0);
                                                                                nv0Var7.p(false);
                                                                            } else if (iOrdinal2 == 3) {
                                                                                nv0Var7.a0(-1285424311);
                                                                                w7.s(ns0Var62, us0Var6, nv0Var7, 0);
                                                                                nv0Var7.p(false);
                                                                            } else {
                                                                                if (iOrdinal2 != 4) {
                                                                                    throw by1.d(nv0Var7, 1482408261, false);
                                                                                }
                                                                                nv0Var7.a0(-1286087060);
                                                                                g12.r(cs0Var23, cs0Var24, cs0Var25, cs0Var26, cs0Var27, nv0Var7, 0);
                                                                                nv0Var7.p(false);
                                                                            }
                                                                        } else {
                                                                            nv0Var7.U();
                                                                        }
                                                                        return dm3.a;
                                                                }
                                                            }
                                                        }, nv0Var5), nv0Var5, gm0Var5, null, null, null, null, i32Var4, null, false);
                                                        if (((g4) e93Var56.getValue()).a) {
                                                            nv0Var5.a0(-777400491);
                                                            g4 g4Var2 = (g4) e93Var56.getValue();
                                                            boolean zH17 = nv0Var5.h(sa1Var6);
                                                            Object objO23 = nv0Var5.O();
                                                            if (zH17 || objO23 == zjVar2) {
                                                                objO23 = new c91(0, sa1Var6, sa1.class, "dismissAddServerDialog", "dismissAddServerDialog()V", 0, 0, 8);
                                                                nv0Var5.j0(objO23);
                                                            }
                                                            cs0 cs0Var32 = (cs0) ((ct0) objO23);
                                                            boolean zH18 = nv0Var5.h(sa1Var6);
                                                            Object objO24 = nv0Var5.O();
                                                            if (zH18 || objO24 == zjVar2) {
                                                                objO24 = new e91(1, sa1Var6, sa1.class, "onServerHostChange", "onServerHostChange(Ljava/lang/String;)V", 0, 0, 0);
                                                                nv0Var5.j0(objO24);
                                                            }
                                                            ns0 ns0Var11 = (ns0) ((ct0) objO24);
                                                            boolean zH19 = nv0Var5.h(sa1Var6);
                                                            Object objO25 = nv0Var5.O();
                                                            if (zH19 || objO25 == zjVar2) {
                                                                objO25 = new e91(1, sa1Var6, sa1.class, "onServerPortChange", "onServerPortChange(Ljava/lang/String;)V", 0, 0, 1);
                                                                nv0Var5.j0(objO25);
                                                            }
                                                            ns0 ns0Var12 = (ns0) ((ct0) objO25);
                                                            boolean zH20 = nv0Var5.h(sa1Var6);
                                                            Object objO26 = nv0Var5.O();
                                                            if (zH20 || objO26 == zjVar2) {
                                                                objO26 = new c91(0, sa1Var6, sa1.class, "saveServer", "saveServer()V", 0, 0, 9);
                                                                nv0Var5.j0(objO26);
                                                            }
                                                            f80.a(g4Var2, cs0Var32, ns0Var11, ns0Var12, (cs0) ((ct0) objO26), nv0Var5, 0);
                                                            z10 = false;
                                                            nv0Var5.p(false);
                                                        } else {
                                                            z10 = false;
                                                            nv0Var5.a0(-776933445);
                                                            nv0Var5.p(false);
                                                        }
                                                        kq2 kq2Var2 = (kq2) e93Var57.getValue();
                                                        if (kq2Var2 == null) {
                                                            nv0Var5.a0(-776872810);
                                                            nv0Var5.p(z10);
                                                        } else {
                                                            nv0Var5.a0(-776872809);
                                                            boolean zH21 = nv0Var5.h(sa1Var6);
                                                            Object objO27 = nv0Var5.O();
                                                            if (zH21 || objO27 == zjVar2) {
                                                                objO27 = new c91(0, sa1Var6, sa1.class, "dismissRemoveServerConfirmation", "dismissRemoveServerConfirmation()V", 0, 0, 10);
                                                                nv0Var5.j0(objO27);
                                                            }
                                                            cs0 cs0Var33 = (cs0) ((ct0) objO27);
                                                            boolean zH22 = nv0Var5.h(sa1Var6);
                                                            Object objO28 = nv0Var5.O();
                                                            if (zH22 || objO28 == zjVar2) {
                                                                objO28 = new c91(0, sa1Var6, sa1.class, "confirmRemoveServer", "confirmRemoveServer()V", 0, 0, 11);
                                                                nv0Var5.j0(objO28);
                                                            }
                                                            f80.l(kq2Var2, cs0Var33, (cs0) ((ct0) objO28), nv0Var5, 0);
                                                            nv0Var5.p(false);
                                                        }
                                                        if (((hp2) e93Var58.getValue()).a) {
                                                            nv0Var5.a0(-776468507);
                                                            hp2 hp2Var2 = (hp2) e93Var58.getValue();
                                                            boolean zH23 = nv0Var5.h(sa1Var6);
                                                            Object objO29 = nv0Var5.O();
                                                            if (zH23 || objO29 == zjVar2) {
                                                                objO29 = new c91(0, sa1Var6, sa1.class, "dismissRulesDialog", "dismissRulesDialog()V", 0, 0, 12);
                                                                nv0Var5.j0(objO29);
                                                            }
                                                            f80.m(hp2Var2, (cs0) ((ct0) objO29), nv0Var5, 8);
                                                            nv0Var5.p(false);
                                                        } else {
                                                            nv0Var5.a0(-776232101);
                                                            nv0Var5.p(false);
                                                        }
                                                        if (((o72) e93Var59.getValue()).a) {
                                                            nv0Var5.a0(-776167745);
                                                            o72 o72Var2 = (o72) e93Var59.getValue();
                                                            boolean zH24 = nv0Var5.h(sa1Var6);
                                                            Object objO30 = nv0Var5.O();
                                                            if (zH24 || objO30 == zjVar2) {
                                                                objO30 = new c91(0, sa1Var6, sa1.class, "dismissPlayersDialog", "dismissPlayersDialog()V", 0, 0, 13);
                                                                nv0Var5.j0(objO30);
                                                            }
                                                            f80.h(o72Var2, (cs0) ((ct0) objO30), nv0Var5, 8);
                                                            nv0Var5.p(false);
                                                        } else {
                                                            nv0Var5.a0(-775925573);
                                                            nv0Var5.p(false);
                                                        }
                                                        if (((v71) e93Var60.getValue()).a) {
                                                            nv0Var5.a0(-775784244);
                                                            v71 v71Var2 = (v71) e93Var60.getValue();
                                                            boolean zH25 = nv0Var5.h(sa1Var6);
                                                            Object objO31 = nv0Var5.O();
                                                            if (zH25 || objO31 == zjVar2) {
                                                                objO31 = new e91(1, sa1Var6, sa1.class, "onLaunchNicknameChange", "onLaunchNicknameChange(Ljava/lang/String;)V", 0, 0, 2);
                                                                nv0Var5.j0(objO31);
                                                            }
                                                            ct0 ct0Var4 = (ct0) objO31;
                                                            boolean zH26 = nv0Var5.h(sa1Var6);
                                                            Object objO32 = nv0Var5.O();
                                                            if (zH26 || objO32 == zjVar2) {
                                                                objO32 = new k(1, sa1Var6, sa1.class, "onLaunchTextEncodingChange", "onLaunchTextEncodingChange(Ltop/th1nk/samp/core/config/ServerTextEncoding;)V", 0, 0, 28);
                                                                nv0Var5.j0(objO32);
                                                            }
                                                            ct0 ct0Var5 = (ct0) objO32;
                                                            boolean zH27 = nv0Var5.h(sa1Var6);
                                                            Object objO33 = nv0Var5.O();
                                                            if (zH27 || objO33 == zjVar2) {
                                                                objO33 = new k(1, sa1Var6, sa1.class, "onLaunchPasswordChange", "onLaunchPasswordChange(Ljava/lang/String;)V", 0, 0, 29);
                                                                nv0Var5.j0(objO33);
                                                            }
                                                            ct0 ct0Var6 = (ct0) objO33;
                                                            boolean zH28 = nv0Var5.h(sa1Var6);
                                                            Object objO34 = nv0Var5.O();
                                                            if (zH28 || objO34 == zjVar2) {
                                                                objO34 = new c91(0, sa1Var6, sa1.class, "dismissLaunchDialog", "dismissLaunchDialog()V", 0, 0, 7);
                                                                nv0Var5.j0(objO34);
                                                            }
                                                            ns0 ns0Var13 = (ns0) ct0Var4;
                                                            ns0 ns0Var14 = (ns0) ct0Var6;
                                                            ns0 ns0Var15 = (ns0) ct0Var5;
                                                            cs0 cs0Var34 = (cs0) ((ct0) objO34);
                                                            boolean zF2 = nv0Var5.f(e93Var46) | nv0Var5.h(sa1Var6) | nv0Var5.h(x50Var5) | nv0Var5.f(str4);
                                                            Object objO35 = nv0Var5.O();
                                                            if (zF2 || objO35 == zjVar2) {
                                                                final int i8 = 1;
                                                                objO35 = new cs0() { // from class: i81
                                                                    @Override // defpackage.cs0
                                                                    public final Object a() {
                                                                        int i72 = i8;
                                                                        dm3 dm3Var2 = dm3.a;
                                                                        String str5 = str4;
                                                                        c63 c63Var82 = c63Var8;
                                                                        e93 e93Var61 = e93Var46;
                                                                        x50 x50Var6 = x50Var5;
                                                                        sa1 sa1Var7 = sa1Var6;
                                                                        switch (i72) {
                                                                            case 0:
                                                                                if (!(((nm2) e93Var61.getValue()) instanceof mm2)) {
                                                                                    cl3.t(x50Var6, null, new b91(c63Var82, str5, null, 0), 3);
                                                                                } else {
                                                                                    sa1Var7.i();
                                                                                }
                                                                                break;
                                                                            default:
                                                                                if (!(((nm2) e93Var61.getValue()) instanceof mm2)) {
                                                                                    cl3.t(x50Var6, null, new b91(c63Var82, str5, null, 1), 3);
                                                                                } else {
                                                                                    sa1Var7.i();
                                                                                }
                                                                                break;
                                                                        }
                                                                        return dm3Var2;
                                                                    }
                                                                };
                                                                nv0Var5.j0(objO35);
                                                            }
                                                            cs0 cs0Var35 = (cs0) objO35;
                                                            boolean zH29 = nv0Var5.h(sa1Var6) | nv0Var5.f(us0Var5);
                                                            Object objO36 = nv0Var5.O();
                                                            if (zH29 || objO36 == zjVar2) {
                                                                z11 = true;
                                                                final char c2 = 1 == true ? 1 : 0;
                                                                objO36 = new cs0() { // from class: j81
                                                                    @Override // defpackage.cs0
                                                                    public final Object a() {
                                                                        int i72 = c2;
                                                                        dm3 dm3Var2 = dm3.a;
                                                                        final us0 us0Var6 = us0Var5;
                                                                        sa1 sa1Var7 = sa1Var6;
                                                                        switch (i72) {
                                                                            case 0:
                                                                                final int i82 = 1;
                                                                                sa1Var7.j(new ts0() { // from class: l81
                                                                                    @Override // defpackage.ts0
                                                                                    public final Object l(Object obj13, Object obj14, Object obj15, Object obj16) {
                                                                                        int i92 = i82;
                                                                                        dm3 dm3Var3 = dm3.a;
                                                                                        kq2 kq2Var22 = (kq2) obj13;
                                                                                        String str5 = (String) obj14;
                                                                                        xy2 xy2Var = (xy2) obj15;
                                                                                        String str6 = (String) obj16;
                                                                                        switch (i92) {
                                                                                            case 0:
                                                                                                kq2Var22.getClass();
                                                                                                str5.getClass();
                                                                                                xy2Var.getClass();
                                                                                                str6.getClass();
                                                                                                sv2 sv2Var = kq2Var22.a;
                                                                                                us0Var6.j(sv2Var.a, Integer.valueOf(sv2Var.b), str5, xy2Var, str6);
                                                                                                break;
                                                                                            default:
                                                                                                kq2Var22.getClass();
                                                                                                str5.getClass();
                                                                                                xy2Var.getClass();
                                                                                                str6.getClass();
                                                                                                sv2 sv2Var2 = kq2Var22.a;
                                                                                                us0Var6.j(sv2Var2.a, Integer.valueOf(sv2Var2.b), str5, xy2Var, str6);
                                                                                                break;
                                                                                        }
                                                                                        return dm3Var3;
                                                                                    }
                                                                                });
                                                                                break;
                                                                            default:
                                                                                final int i9 = 0;
                                                                                sa1Var7.j(new ts0() { // from class: l81
                                                                                    @Override // defpackage.ts0
                                                                                    public final Object l(Object obj13, Object obj14, Object obj15, Object obj16) {
                                                                                        int i92 = i9;
                                                                                        dm3 dm3Var3 = dm3.a;
                                                                                        kq2 kq2Var22 = (kq2) obj13;
                                                                                        String str5 = (String) obj14;
                                                                                        xy2 xy2Var = (xy2) obj15;
                                                                                        String str6 = (String) obj16;
                                                                                        switch (i92) {
                                                                                            case 0:
                                                                                                kq2Var22.getClass();
                                                                                                str5.getClass();
                                                                                                xy2Var.getClass();
                                                                                                str6.getClass();
                                                                                                sv2 sv2Var = kq2Var22.a;
                                                                                                us0Var6.j(sv2Var.a, Integer.valueOf(sv2Var.b), str5, xy2Var, str6);
                                                                                                break;
                                                                                            default:
                                                                                                kq2Var22.getClass();
                                                                                                str5.getClass();
                                                                                                xy2Var.getClass();
                                                                                                str6.getClass();
                                                                                                sv2 sv2Var2 = kq2Var22.a;
                                                                                                us0Var6.j(sv2Var2.a, Integer.valueOf(sv2Var2.b), str5, xy2Var, str6);
                                                                                                break;
                                                                                        }
                                                                                        return dm3Var3;
                                                                                    }
                                                                                });
                                                                                break;
                                                                        }
                                                                        return dm3Var2;
                                                                    }
                                                                };
                                                                nv0Var5.j0(objO36);
                                                            } else {
                                                                z11 = true;
                                                            }
                                                            f80.d(v71Var2, ns0Var13, ns0Var14, ns0Var15, cs0Var34, cs0Var35, (cs0) objO36, nv0Var5, 8);
                                                            nv0Var5 = nv0Var5;
                                                            z12 = false;
                                                            nv0Var5.p(false);
                                                        } else {
                                                            z11 = true;
                                                            z12 = false;
                                                            nv0Var5.a0(-774140965);
                                                            nv0Var5.p(false);
                                                        }
                                                        nv0Var5.p(z11);
                                                        nv0Var5.p(z11);
                                                        nv0Var5.p(z11);
                                                        nv0Var5.p(z12);
                                                        return dm3Var;
                                                    }
                                                }, nv0Var4), nv0Var4, 806882310, 182);
                                            } else {
                                                nv0Var4.U();
                                            }
                                            return dm3.a;
                                        }
                                    }, nv0Var3), nv0Var3, 54);
                                } else {
                                    nv0Var3.U();
                                }
                                return dm3.a;
                            }
                        }, nv0Var2), nv0Var2, 56);
                        if (z3) {
                            z2 = true;
                            nv0Var2.a0(2033465834);
                            nv0Var2.p(false);
                        } else {
                            nv0Var2.a0(2032730669);
                            bq1 bq1VarA = jo.a.a(yp1.a, f5.n);
                            Object objO7 = nv0Var2.O();
                            if (objO7 == zjVar) {
                                objO7 = new q81(a42Var2, 1);
                                nv0Var2.j0(objO7);
                            }
                            bq1 bq1VarU = n92.u(bq1VarA, (ns0) objO7);
                            mj0 mj0Var2 = (mj0) lj0Var;
                            ea1 ea1Var = (ea1) mj0Var2.get(i32Var.k());
                            boolean zH2 = nv0Var2.h(x50Var2) | nv0Var2.f(i32Var) | nv0Var2.h(mj0Var2);
                            Object objO8 = nv0Var2.O();
                            if (zH2 || objO8 == zjVar) {
                                z2 = true;
                                objO8 = new g81(x50Var2, i32Var, mj0Var2, 1);
                                nv0Var2.j0(objO8);
                            } else {
                                z2 = true;
                            }
                            w7.p(bq1VarU, ea1Var, (ns0) objO8, nv0Var2, 0);
                            nv0Var2.p(false);
                        }
                        nv0Var2.p(z2);
                    } else {
                        nv0Var2.U();
                    }
                    return dm3.a;
                }
            }, nv0Var), nv0Var, 3078, 6);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new o81(cs0Var, cs0Var2, cs0Var3, cs0Var4, cs0Var5, cs0Var6, cs0Var7, ns0Var, us0Var, i2);
        }
    }

    public static final void p(bq1 bq1Var, ea1 ea1Var, ns0 ns0Var, nv0 nv0Var, int i2) {
        ea1Var.getClass();
        ns0Var.getClass();
        nv0Var.b0(1732069455);
        int i3 = i2 | (nv0Var.f(bq1Var) ? 4 : 2) | (nv0Var.d(ea1Var.ordinal()) ? 32 : 16) | (nv0Var.h(ns0Var) ? 256 : 128);
        int i4 = 0;
        int i5 = 1;
        if (nv0Var.R(i3 & 1, (i3 & 147) != 146)) {
            bq1 bq1VarQ = j43.q(f80.K(n92.J(j43.c(bq1Var, 1.0f), n92.q0), 16.0f, 12.0f), 0.0f, 640.0f, 1);
            cn1 cn1VarD = eo.d(f5.g, false);
            int iHashCode = Long.hashCode(nv0Var.T);
            n52 n52VarL = nv0Var.l();
            bq1 bq1VarM = lr.M(nv0Var, bq1VarQ);
            w10.c.getClass();
            nv0Var.d0();
            if (nv0Var.S) {
                nv0Var.k(tb1.Y);
            } else {
                nv0Var.m0();
            }
            y02.F(f5.E, nv0Var, cn1VarD);
            y02.F(f5.D, nv0Var, n52VarL);
            y02.F(f5.F, nv0Var, Integer.valueOf(iHashCode));
            y02.C(nv0Var);
            y02.F(f5.C, nv0Var, bq1VarM);
            bq1 bq1VarC = j43.c(yp1.a, 1.0f);
            ta1 ta1Var = (ta1) nv0Var.j(yh1.b);
            int iA = ea1.k.a();
            boolean z2 = (i3 & 112) == 32;
            Object objO = nv0Var.O();
            zj zjVar = c20.a;
            if (z2 || objO == zjVar) {
                objO = new ja(21, ea1Var);
                nv0Var.j0(objO);
            }
            cs0 cs0Var = (cs0) objO;
            boolean z3 = (i3 & 896) == 256;
            Object objO2 = nv0Var.O();
            if (z3 || objO2 == zjVar) {
                objO2 = new cw0(ns0Var, i5);
                nv0Var.j0(objO2);
            }
            fh1.b(cs0Var, (ns0) objO2, ta1Var, iA, bq1VarC, gq.N(-1125358070, new c81(i4, ns0Var, ea1Var), nv0Var), nv0Var, 221184);
            nv0Var.p(true);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new w1((Object) bq1Var, (Object) ea1Var, (zs0) ns0Var, i2, 6);
        }
    }

    public static final void q(ea1 ea1Var, ns0 ns0Var, nv0 nv0Var, int i2) {
        nv0 nv0Var2 = nv0Var;
        ea1Var.getClass();
        ns0Var.getClass();
        nv0Var2.b0(915099001);
        int i3 = (nv0Var2.d(ea1Var.ordinal()) ? 4 : 2) | i2 | (nv0Var2.h(ns0Var) ? 32 : 16);
        int i4 = 18;
        int i5 = 1;
        if (nv0Var2.R(i3 & 1, (i3 & 19) != 18)) {
            boolean z2 = nv0Var2.j(yh1.a) != null;
            r93 r93Var = hy.a;
            long j2 = ((fy) nv0Var2.j(r93Var)).I;
            to2 to2VarA = uo2.a(28.0f);
            gm0 gm0Var = j43.b;
            bq1 bq1VarD = yh1.d(f80.J(gm0Var, 8.0f), to2VarA, z2, wx.b(0.58f, j2), nv0Var2, 248);
            cn1 cn1VarD = eo.d(f5.g, false);
            int iHashCode = Long.hashCode(nv0Var2.T);
            n52 n52VarL = nv0Var2.l();
            bq1 bq1VarM = lr.M(nv0Var2, bq1VarD);
            w10.c.getClass();
            nv0Var2.d0();
            if (nv0Var2.S) {
                nv0Var2.k(tb1.Y);
            } else {
                nv0Var2.m0();
            }
            y02.F(f5.E, nv0Var2, cn1VarD);
            y02.F(f5.D, nv0Var2, n52VarL);
            y02.F(f5.F, nv0Var2, Integer.valueOf(iHashCode));
            y02.C(nv0Var2);
            y02.F(f5.C, nv0Var2, bq1VarM);
            wv1.a(gm0Var, z2 ? wx.f : j2, ((fy) nv0Var2.j(r93Var)).q, null, gq.N(245623371, new c81(i5, ns0Var, ea1Var), nv0Var2), nv0Var, 196614, 24);
            nv0Var2 = nv0Var;
            nv0Var2.p(true);
        } else {
            nv0Var2.U();
        }
        xj2 xj2VarT = nv0Var2.t();
        if (xj2VarT != null) {
            xj2VarT.d = new y7(i2, i4, ea1Var, ns0Var);
        }
    }

    public static final void r(final hd0 hd0Var, final al0 al0Var, final cs0 cs0Var, final cs0 cs0Var2, final ns0 ns0Var, final ns0 ns0Var2, final cs0 cs0Var3, final cs0 cs0Var4, final ns0 ns0Var3, bq1 bq1Var, nv0 nv0Var, final int i2) {
        final bq1 bq1Var2;
        Context context;
        long j2;
        nv0Var.b0(-180877327);
        int i3 = i2 | (nv0Var.f(hd0Var) ? 4 : 2) | (nv0Var.f(al0Var) ? 32 : 16) | (nv0Var.h(cs0Var) ? 256 : 128) | (nv0Var.h(cs0Var2) ? 2048 : 1024) | (nv0Var.h(ns0Var) ? 16384 : 8192) | (nv0Var.h(ns0Var2) ? 131072 : 65536) | (nv0Var.h(cs0Var3) ? 1048576 : 524288) | (nv0Var.h(cs0Var4) ? 8388608 : 4194304) | (nv0Var.h(ns0Var3) ? 67108864 : 33554432) | 805306368;
        if (nv0Var.R(i3 & 1, (306783379 & i3) != 306783378)) {
            Context context2 = (Context) nv0Var.j(x7.b);
            yp1 yp1Var = yp1.a;
            bq1 bq1VarC = j43.c(yp1Var, 1.0f);
            to2 to2VarA = uo2.a(20.0f);
            if ((al0Var instanceof yk0) || (hd0Var instanceof fd0)) {
                context = context2;
                nv0Var.a0(-2024396961);
                j2 = ((fy) nv0Var.j(hy.a)).y;
                nv0Var.p(false);
            } else if ((al0Var instanceof wk0) || (hd0Var instanceof dd0)) {
                context = context2;
                nv0Var.a0(-2024392319);
                j2 = ((fy) nv0Var.j(hy.a)).c;
                nv0Var.p(false);
            } else {
                nv0Var.a0(-2024390301);
                context = context2;
                j2 = ((fy) nv0Var.j(hy.a)).h;
                nv0Var.p(false);
            }
            final Context context3 = context;
            gv3.h(bq1VarC, j2, to2VarA, false, gq.N(-1306120350, new ss0() { // from class: bn2
                @Override // defpackage.ss0
                public final Object e(Object obj, Object obj2, Object obj3) {
                    boolean z2;
                    boolean z3;
                    boolean z4;
                    nv0 nv0Var2 = (nv0) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((ry) obj).getClass();
                    boolean z5 = true;
                    if (nv0Var2.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                        yp1 yp1Var2 = yp1.a;
                        bq1 bq1VarJ = f80.J(yp1Var2, 16.0f);
                        qy qyVarA = oy.a(new jj(8.0f, true, new c(1)), f5.s, nv0Var2, 6);
                        int iHashCode = Long.hashCode(nv0Var2.T);
                        n52 n52VarL = nv0Var2.l();
                        bq1 bq1VarM = lr.M(nv0Var2, bq1VarJ);
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
                        al0 al0Var2 = al0Var;
                        boolean z6 = al0Var2 instanceof xk0;
                        zj zjVar = c20.a;
                        if (z6) {
                            nv0Var2.a0(1589498326);
                            vk0 vk0Var = ((xk0) al0Var2).a;
                            int i4 = vk0Var.b;
                            w7.j(oz2.M(2131624207, nv0Var2), 0L, cs0Var3, oz2.M(2131624104, nv0Var2), nv0Var2, 0, 2);
                            if (i4 > 0) {
                                nv0Var2.a0(1589882168);
                                boolean zH = nv0Var2.h(vk0Var);
                                Object objO = nv0Var2.O();
                                if (zH || objO == zjVar) {
                                    objO = new it1(10, vk0Var);
                                    nv0Var2.j0(objO);
                                }
                                xd2.b((cs0) objO, j43.c(yp1Var2, 1.0f), 0L, 0L, 0, 0.0f, null, nv0Var2, 48);
                                nv0Var2 = nv0Var2;
                                String strN = oz2.N(2131624209, new Object[]{Integer.valueOf(vk0Var.a), Integer.valueOf(i4)}, nv0Var2);
                                String str = vk0Var.c;
                                w7.i(strN, y93.q0(str) ? null : str, nv0Var2, 0, 0);
                                nv0Var2.p(false);
                            } else {
                                nv0Var2.a0(1590422250);
                                nv0Var2.p(false);
                            }
                            nv0Var2.p(false);
                        } else {
                            boolean z7 = al0Var2 instanceof wk0;
                            cs0 cs0Var5 = cs0Var4;
                            if (z7) {
                                nv0Var2.a0(1590506136);
                                w7.j(oz2.N(2131624206, new Object[]{Integer.valueOf(((wk0) al0Var2).a)}, nv0Var2), ((fy) nv0Var2.j(hy.a)).a, cs0Var5, oz2.M(2131624107, nv0Var2), nv0Var2, 0, 0);
                                nv0Var2.p(false);
                            } else {
                                if (al0Var2 instanceof yk0) {
                                    nv0Var2.a0(1590980343);
                                    String strM = oz2.M(2131624208, nv0Var2);
                                    r93 r93Var = hy.a;
                                    w7.j(strM, ((fy) nv0Var2.j(r93Var)).w, cs0Var5, oz2.M(2131624107, nv0Var2), nv0Var2, 0, 0);
                                    yk0 yk0Var = (yk0) al0Var2;
                                    mg3.b(yk0Var.a, null, ((fy) nv0Var2.j(r93Var)).w, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var2.j(ql3.a)).l, nv0Var2, 0, 0, 131066);
                                    nv0Var2 = nv0Var2;
                                    File file = yk0Var.b;
                                    if (file != null) {
                                        nv0Var2.a0(1591650563);
                                        ns0 ns0Var4 = ns0Var3;
                                        boolean zF = nv0Var2.f(ns0Var4) | nv0Var2.h(file);
                                        Object objO2 = nv0Var2.O();
                                        if (zF || objO2 == zjVar) {
                                            objO2 = new me1(12, ns0Var4, file);
                                            nv0Var2.j0(objO2);
                                        }
                                        gq.a((cs0) objO2, j43.c(yp1Var2, 1.0f), false, null, null, null, null, null, w7.n, nv0Var2, 805306416, 508);
                                        nv0Var2 = nv0Var2;
                                        z4 = false;
                                        nv0Var2.p(false);
                                    } else {
                                        z4 = false;
                                        nv0Var2.a0(1591964810);
                                        nv0Var2.p(false);
                                    }
                                    nv0Var2.p(z4);
                                    z2 = true;
                                } else {
                                    hd0 hd0Var2 = hd0Var;
                                    if (hd0Var2 instanceof ed0) {
                                        nv0Var2.a0(1592079231);
                                        cd0 cd0Var = ((ed0) hd0Var2).b;
                                        w7.j(oz2.M(2131624194, nv0Var2), 0L, cs0Var, oz2.M(2131624104, nv0Var2), nv0Var2, 0, 2);
                                        boolean zH2 = nv0Var2.h(cd0Var);
                                        Object objO3 = nv0Var2.O();
                                        if (zH2 || objO3 == zjVar) {
                                            z5 = true;
                                            objO3 = new tv(cd0Var, 1);
                                            nv0Var2.j0(objO3);
                                        } else {
                                            z5 = true;
                                        }
                                        xd2.b((cs0) objO3, j43.c(yp1Var2, 1.0f), 0L, 0L, 0, 0.0f, null, nv0Var2, 48);
                                        nv0Var2 = nv0Var2;
                                        long j3 = cd0Var.a;
                                        Context context4 = context3;
                                        String fileSize = Formatter.formatFileSize(context4, j3);
                                        fileSize.getClass();
                                        String fileSize2 = Formatter.formatFileSize(context4, cd0Var.b);
                                        fileSize2.getClass();
                                        String fileSize3 = Formatter.formatFileSize(context4, cd0Var.c);
                                        fileSize3.getClass();
                                        w7.i(oz2.N(2131624196, new Object[]{fileSize, fileSize2, fileSize3}, nv0Var2), null, nv0Var2, 0, 2);
                                        nv0Var2.p(false);
                                    } else {
                                        boolean z8 = hd0Var2 instanceof dd0;
                                        cs0 cs0Var6 = cs0Var2;
                                        if (z8 && (al0Var2 instanceof zk0)) {
                                            nv0Var2.a0(1593477300);
                                            w7.j(oz2.M(2131624193, nv0Var2), ((fy) nv0Var2.j(hy.a)).a, cs0Var6, oz2.M(2131624107, nv0Var2), nv0Var2, 0, 0);
                                            ns0 ns0Var5 = ns0Var;
                                            boolean zF2 = nv0Var2.f(ns0Var5) | nv0Var2.h(hd0Var2);
                                            Object objO4 = nv0Var2.O();
                                            if (zF2 || objO4 == zjVar) {
                                                objO4 = new me1(13, ns0Var5, hd0Var2);
                                                nv0Var2.j0(objO4);
                                            }
                                            gq.a((cs0) objO4, j43.c(yp1Var2, 1.0f), false, null, null, null, null, null, w7.o, nv0Var2, 805306416, 508);
                                            nv0Var2 = nv0Var2;
                                            nv0Var2.p(false);
                                            z2 = true;
                                        } else if (hd0Var2 instanceof fd0) {
                                            nv0Var2.a0(1594203382);
                                            String strM2 = oz2.M(2131624195, nv0Var2);
                                            r93 r93Var2 = hy.a;
                                            w7.j(strM2, ((fy) nv0Var2.j(r93Var2)).w, cs0Var6, oz2.M(2131624107, nv0Var2), nv0Var2, 0, 0);
                                            fd0 fd0Var = (fd0) hd0Var2;
                                            mg3.b(fd0Var.a, null, ((fy) nv0Var2.j(r93Var2)).w, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var2.j(ql3.a)).l, nv0Var2, 0, 0, 131066);
                                            nv0Var2 = nv0Var2;
                                            bm2 bm2Var = fd0Var.b;
                                            if (bm2Var != null) {
                                                nv0Var2.a0(1594874563);
                                                ns0 ns0Var6 = ns0Var2;
                                                boolean zF3 = nv0Var2.f(ns0Var6) | nv0Var2.h(bm2Var);
                                                Object objO5 = nv0Var2.O();
                                                if (zF3 || objO5 == zjVar) {
                                                    z2 = true;
                                                    objO5 = new dn2(ns0Var6, bm2Var, 1);
                                                    nv0Var2.j0(objO5);
                                                } else {
                                                    z2 = true;
                                                }
                                                gq.a((cs0) objO5, j43.c(yp1Var2, 1.0f), false, null, null, null, null, null, w7.p, nv0Var2, 805306416, 508);
                                                nv0Var2 = nv0Var2;
                                                z3 = false;
                                                nv0Var2.p(false);
                                            } else {
                                                z3 = false;
                                                z2 = true;
                                                nv0Var2.a0(1595188810);
                                                nv0Var2.p(false);
                                            }
                                            nv0Var2.p(z3);
                                        } else {
                                            z2 = true;
                                            nv0Var2.a0(1595220554);
                                            nv0Var2.p(false);
                                        }
                                    }
                                }
                                nv0Var2.p(z2);
                            }
                        }
                        z2 = z5;
                        nv0Var2.p(z2);
                    } else {
                        nv0Var2.U();
                    }
                    return dm3.a;
                }
            }, nv0Var), nv0Var, 24576, 8);
            bq1Var2 = yp1Var;
        } else {
            nv0Var.U();
            bq1Var2 = bq1Var;
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new rs0(al0Var, cs0Var, cs0Var2, ns0Var, ns0Var2, cs0Var3, cs0Var4, ns0Var3, bq1Var2, i2) { // from class: cn2
                public final /* synthetic */ al0 g;
                public final /* synthetic */ cs0 h;
                public final /* synthetic */ cs0 i;
                public final /* synthetic */ ns0 j;
                public final /* synthetic */ ns0 k;
                public final /* synthetic */ cs0 l;
                public final /* synthetic */ cs0 m;
                public final /* synthetic */ ns0 n;
                public final /* synthetic */ bq1 o;

                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = jo3.y(1);
                    w7.r(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, (nv0) obj, iY);
                    return dm3.a;
                }
            };
        }
    }

    public static final void s(ns0 ns0Var, us0 us0Var, nv0 nv0Var, int i2) {
        os1 os1Var;
        yp1 yp1Var;
        float f2;
        os1 os1Var2;
        boolean z2;
        boolean z3;
        os1 os1Var3;
        zj zjVar;
        os1 os1Var4;
        nv0 nv0Var2 = nv0Var;
        nv0Var2.b0(1158422371);
        int i3 = i2 | (nv0Var2.h(ns0Var) ? 4 : 2) | (nv0Var2.h(us0Var) ? 32 : 16);
        if (nv0Var2.R(i3 & 1, (i3 & 19) != 18)) {
            List listN0 = qx.N0(((Map) b32.e(dh2.c, nv0Var2).getValue()).values());
            Object objO = nv0Var2.O();
            zj zjVar2 = c20.a;
            if (objO == zjVar2) {
                objO = b32.w(Boolean.FALSE);
                nv0Var2.j0(objO);
            }
            os1 os1Var5 = (os1) objO;
            Object objO2 = nv0Var2.O();
            if (objO2 == zjVar2) {
                objO2 = b32.w(null);
                nv0Var2.j0(objO2);
            }
            os1 os1Var6 = (os1) objO2;
            float f3 = ((jd0) nv0Var2.j(dn0.a)).f;
            Object objO3 = nv0Var2.O();
            if (objO3 == zjVar2) {
                objO3 = b32.w("");
                nv0Var2.j0(objO3);
            }
            os1 os1Var7 = (os1) objO3;
            Object objO4 = nv0Var2.O();
            if (objO4 == zjVar2) {
                objO4 = b32.w("7777");
                nv0Var2.j0(objO4);
            }
            os1 os1Var8 = (os1) objO4;
            Object objO5 = nv0Var2.O();
            if (objO5 == zjVar2) {
                objO5 = b32.w("");
                nv0Var2.j0(objO5);
            }
            os1 os1Var9 = (os1) objO5;
            Object objO6 = nv0Var2.O();
            if (objO6 == zjVar2) {
                objO6 = b32.w("");
                nv0Var2.j0(objO6);
            }
            os1 os1Var10 = (os1) objO6;
            Object objO7 = nv0Var2.O();
            if (objO7 == zjVar2) {
                objO7 = b32.w(ak2.n(xy2.h));
                nv0Var2.j0(objO7);
            }
            os1 os1Var11 = (os1) objO7;
            gm0 gm0Var = j43.c;
            cn1 cn1VarD = eo.d(f5.g, false);
            int iHashCode = Long.hashCode(nv0Var2.T);
            n52 n52VarL = nv0Var2.l();
            bq1 bq1VarM = lr.M(nv0Var2, gm0Var);
            w10.c.getClass();
            nv0Var2.d0();
            boolean z4 = nv0Var2.S;
            x91 x91Var = tb1.Y;
            if (z4) {
                nv0Var2.k(x91Var);
            } else {
                nv0Var2.m0();
            }
            z00 z00Var = f5.E;
            y02.F(z00Var, nv0Var2, cn1VarD);
            z00 z00Var2 = f5.D;
            y02.F(z00Var2, nv0Var2, n52VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z00 z00Var3 = f5.F;
            y02.F(z00Var3, nv0Var2, numValueOf);
            y02.C(nv0Var2);
            z00 z00Var4 = f5.C;
            y02.F(z00Var4, nv0Var2, bq1VarM);
            boolean zIsEmpty = listN0.isEmpty();
            yp1 yp1Var2 = yp1.a;
            if (zIsEmpty) {
                nv0Var2.a0(969549310);
                cn1 cn1VarD2 = eo.d(f5.k, false);
                int iHashCode2 = Long.hashCode(nv0Var2.T);
                n52 n52VarL2 = nv0Var2.l();
                bq1 bq1VarM2 = lr.M(nv0Var2, gm0Var);
                nv0Var2.d0();
                if (nv0Var2.S) {
                    nv0Var2.k(x91Var);
                } else {
                    nv0Var2.m0();
                }
                y02.F(z00Var, nv0Var2, cn1VarD2);
                y02.F(z00Var2, nv0Var2, n52VarL2);
                nc2.r(iHashCode2, nv0Var2, z00Var3, nv0Var2);
                y02.F(z00Var4, nv0Var2, bq1VarM2);
                os1Var = os1Var5;
                f2 = f3;
                os1Var2 = os1Var6;
                gv3.h(f80.J(j43.q(yp1Var2, 0.0f, 400.0f, 1), 24.0f), 0L, uo2.a(24.0f), false, gq.N(1438987259, new y71(os1Var5, 1), nv0Var2), nv0Var2, 24582, 10);
                nv0Var2.p(true);
                nv0Var2.p(false);
                yp1Var = yp1Var2;
                z2 = false;
            } else {
                os1Var = os1Var5;
                yp1Var = yp1Var2;
                f2 = f3;
                os1Var2 = os1Var6;
                nv0Var2.a0(971579562);
                bq1 bq1VarJ = f80.J(gm0Var, 16.0f);
                jj jjVar = new jj(8.0f, true, new c(1));
                boolean zH = ((i3 & 14) == 4) | nv0Var2.h(listN0);
                Object objO8 = nv0Var2.O();
                if (zH || objO8 == zjVar2) {
                    objO8 = new v1(listN0, ns0Var, os1Var2, 13);
                    nv0Var2.j0(objO8);
                }
                dn0.a(bq1VarJ, null, null, jjVar, (ns0) objO8, nv0Var, 3078, 6);
                nv0Var2 = nv0Var;
                z2 = false;
                nv0Var2.p(false);
            }
            Object objO9 = nv0Var2.O();
            if (objO9 == zjVar2) {
                objO9 = new yb(os1Var, 10);
                nv0Var2.j0(objO9);
            }
            br.f((cs0) objO9, f80.N(jo.a.a(yp1Var, f5.o), 0.0f, 0.0f, 16.0f, 16.0f + f2, 3), yh1.e(nv0Var2), 0L, rn.j, nv0Var2, 24582);
            nv0Var2.p(true);
            if (((Boolean) os1Var.getValue()).booleanValue()) {
                nv0Var2.a0(503178369);
                Object objO10 = nv0Var2.O();
                if (objO10 == zjVar2) {
                    objO10 = new yb(os1Var, 11);
                    nv0Var2.j0(objO10);
                }
                os1 os1Var12 = os1Var;
                os1Var3 = os1Var2;
                zjVar = zjVar2;
                z3 = z2;
                rn.a((cs0) objO10, gq.N(-969935690, new p81(us0Var, os1Var7, os1Var8, os1Var9, os1Var11, os1Var10, os1Var12), nv0Var2), null, gq.N(-559325324, new l8(os1Var12, 4), nv0Var2), null, rn.m, gq.N(-2090893423, new r81((Object) os1Var7, (Object) os1Var11, (Object) os1Var8, (Object) os1Var9, (Object) os1Var10, 0), nv0Var2), null, 0L, 0L, 0L, 0L, null, nv0Var, 1772598, 16276);
                nv0Var2 = nv0Var;
                nv0Var2.p(z3);
            } else {
                z3 = z2;
                os1Var3 = os1Var2;
                zjVar = zjVar2;
                nv0Var2.a0(507481727);
                nv0Var2.p(z3);
            }
            vg2 vg2Var = (vg2) os1Var3.getValue();
            if (vg2Var == null) {
                nv0Var2.a0(507532349);
                nv0Var2.p(z3);
            } else {
                nv0Var2.a0(507532350);
                Object objO11 = nv0Var2.O();
                if (objO11 == zjVar) {
                    os1Var4 = os1Var3;
                    objO11 = new yb(os1Var4, 12);
                    nv0Var2.j0(objO11);
                } else {
                    os1Var4 = os1Var3;
                }
                rn.a((cs0) objO11, gq.N(-1421171208, new y7(20, vg2Var, os1Var4), nv0Var2), null, gq.N(-934097482, new l8(os1Var4, 5), nv0Var2), null, rn.t, gq.N(-203486893, new u(17, vg2Var), nv0Var2), null, 0L, 0L, 0L, 0L, null, nv0Var, 1772598, 16276);
                nv0Var2 = nv0Var;
                nv0Var2.p(z3);
            }
        } else {
            nv0Var2.U();
        }
        xj2 xj2VarT = nv0Var2.t();
        if (xj2VarT != null) {
            xj2VarT.d = new y7(i2, 19, ns0Var, us0Var);
        }
    }

    public static final void t(final List list, bq1 bq1Var, nv0 nv0Var, int i2) {
        int i3;
        List list2;
        int i4;
        bq1 bq1Var2;
        int i5;
        list.getClass();
        nv0Var.b0(389129055);
        int i6 = i2 | (nv0Var.f(list) ? 4 : 2) | 48;
        if (nv0Var.R(i6 & 1, (i6 & 19) != 18)) {
            ee2 ee2Var = hy.a;
            final long j2 = ((fy) nv0Var.j(ee2Var)).p;
            ie1 ie1VarA = ke1.a(nv0Var);
            Object objO = nv0Var.O();
            Object obj = c20.a;
            if (objO == obj) {
                objO = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
                nv0Var.j0(objO);
            }
            final SimpleDateFormat simpleDateFormat = (SimpleDateFormat) objO;
            bt btVar = (bt) qx.z0(list);
            Object objValueOf = btVar != null ? Long.valueOf(btVar.d) : null;
            boolean zF = nv0Var.f(objValueOf);
            Object objO2 = nv0Var.O();
            if (zF || objO2 == obj) {
                ee1 ee1VarI = ie1VarA.i();
                List list3 = ee1VarI.l;
                int i7 = ee1VarI.o;
                fe1 fe1Var = (fe1) qx.z0(list3);
                Integer numValueOf = fe1Var != null ? Integer.valueOf(fe1Var.a) : null;
                objO2 = Boolean.valueOf(i7 == 0 || numValueOf == null || numValueOf.intValue() >= i7 - 2);
                nv0Var.j0(objO2);
            }
            boolean zBooleanValue = ((Boolean) objO2).booleanValue();
            int i8 = i6 & 14;
            boolean zF2 = nv0Var.f(objValueOf) | nv0Var.g(zBooleanValue) | nv0Var.f(ie1VarA) | (i8 == 4);
            Object objO3 = nv0Var.O();
            if (zF2 || objO3 == obj) {
                i5 = i8;
                Object na2Var = new na2(objValueOf, zBooleanValue, ie1VarA, list, null, 1);
                nv0Var.j0(na2Var);
                objO3 = na2Var;
            } else {
                i5 = i8;
            }
            rn.l((rs0) objO3, nv0Var, objValueOf);
            boolean zIsEmpty = list.isEmpty();
            yp1 yp1Var = yp1.a;
            if (zIsEmpty) {
                nv0Var.a0(427966309);
                gm0 gm0Var = j43.c;
                cn1 cn1VarD = eo.d(f5.k, false);
                int iHashCode = Long.hashCode(nv0Var.T);
                n52 n52VarL = nv0Var.l();
                bq1 bq1VarM = lr.M(nv0Var, gm0Var);
                w10.c.getClass();
                nv0Var.d0();
                if (nv0Var.S) {
                    nv0Var.k(tb1.Y);
                } else {
                    nv0Var.m0();
                }
                y02.F(f5.E, nv0Var, cn1VarD);
                y02.F(f5.D, nv0Var, n52VarL);
                y02.F(f5.F, nv0Var, Integer.valueOf(iHashCode));
                y02.C(nv0Var);
                y02.F(f5.C, nv0Var, bq1VarM);
                mg3.b(oz2.M(2131624547, nv0Var), null, ((fy) nv0Var.j(ee2Var)).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var.j(ql3.a)).k, nv0Var, 0, 0, 131066);
                nv0Var.p(true);
                int i9 = 0;
                nv0Var.p(false);
                xj2 xj2VarT = nv0Var.t();
                if (xj2VarT != null) {
                    xj2VarT.d = new tf2(list, yp1Var, i2, i9);
                    return;
                }
                return;
            }
            nv0Var.a0(428333411);
            nv0Var.p(false);
            bq1 bq1VarK = f80.K(j43.c, 8.0f, 4.0f);
            jj jjVar = new jj(2.0f, true, new c(1));
            boolean zE = nv0Var.e(j2) | (i5 == 4) | nv0Var.h(simpleDateFormat);
            Object objO4 = nv0Var.O();
            if (zE || objO4 == obj) {
                objO4 = new ns0() { // from class: uf2
                    @Override // defpackage.ns0
                    public final Object h(Object obj2) {
                        ae1 ae1Var = (ae1) obj2;
                        ae1Var.getClass();
                        s12 s12Var = new s12(25);
                        List list4 = list;
                        ae1Var.X(list4.size(), new la(16, s12Var, list4), new jw(5, list4), new d00(802480018, new vf2(list4, j2, simpleDateFormat), true));
                        ae1.W(ae1Var, null, w7.d, 3);
                        return dm3.a;
                    }
                };
                nv0Var.j0(objO4);
            }
            i4 = 1;
            i3 = i2;
            bq1Var2 = yp1Var;
            list2 = list;
            lr.g(24576, 492, null, null, jjVar, null, (ns0) objO4, nv0Var, ie1VarA, bq1VarK, null, false);
        } else {
            i3 = i2;
            list2 = list;
            i4 = 1;
            nv0Var.U();
            bq1Var2 = bq1Var;
        }
        xj2 xj2VarT2 = nv0Var.t();
        if (xj2VarT2 != null) {
            xj2VarT2.d = new tf2(list2, bq1Var2, i3, i4);
        }
    }

    public static final void u(final nm2 nm2Var, final g83 g83Var, final hd0 hd0Var, final al0 al0Var, final String str, final cs0 cs0Var, final ns0 ns0Var, final cs0 cs0Var2, final cs0 cs0Var3, final ns0 ns0Var2, final cs0 cs0Var4, final cs0 cs0Var5, final ns0 ns0Var3, final cs0 cs0Var6, final cs0 cs0Var7, final ns0 ns0Var4, rs0 rs0Var, nv0 nv0Var, final int i2) {
        rs0 rs0Var2;
        nv0 nv0Var2 = nv0Var;
        nv0Var2.b0(-87878924);
        int i3 = i2 | (nv0Var2.f(nm2Var) ? 4 : 2) | (nv0Var2.f(g83Var) ? 32 : 16) | (nv0Var2.f(hd0Var) ? 256 : 128) | (nv0Var2.f(al0Var) ? 2048 : 1024) | (nv0Var2.f(str) ? 16384 : 8192) | (nv0Var2.h(cs0Var) ? 131072 : 65536) | (nv0Var2.h(ns0Var) ? 1048576 : 524288) | (nv0Var2.h(cs0Var2) ? 8388608 : 4194304) | (nv0Var2.h(cs0Var3) ? 67108864 : 33554432) | (nv0Var2.h(ns0Var2) ? 536870912 : 268435456);
        int i4 = (nv0Var2.h(cs0Var4) ? 4 : 2) | (nv0Var2.h(cs0Var5) ? 32 : 16) | (nv0Var2.h(ns0Var3) ? 256 : 128) | (nv0Var2.h(cs0Var6) ? 2048 : 1024) | (nv0Var2.h(cs0Var7) ? 16384 : 8192) | (nv0Var2.h(ns0Var4) ? 131072 : 65536) | (nv0Var2.f(rs0Var) ? 1048576 : 524288);
        if (nv0Var2.R(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 599187) == 599186) ? false : true)) {
            nv0Var2.W();
            if ((i2 & 1) != 0 && !nv0Var2.A()) {
                nv0Var2.U();
            }
            nv0Var2.q();
            Object[] objArr = new Object[0];
            Object objO = nv0Var2.O();
            zj zjVar = c20.a;
            if (objO == zjVar) {
                objO = new f62(7);
                nv0Var2.j0(objO);
            }
            a42 a42Var = (a42) oz2.G(objArr, (cs0) objO, nv0Var2);
            gm0 gm0Var = j43.c;
            qy qyVarA = oy.a(n92.d, f5.s, nv0Var2, 0);
            int iHashCode = Long.hashCode(nv0Var2.T);
            n52 n52VarL = nv0Var2.l();
            bq1 bq1VarM = lr.M(nv0Var2, gm0Var);
            w10.c.getClass();
            nv0Var2.d0();
            boolean z2 = nv0Var2.S;
            x91 x91Var = tb1.Y;
            if (z2) {
                nv0Var2.k(x91Var);
            } else {
                nv0Var2.m0();
            }
            z00 z00Var = f5.E;
            y02.F(z00Var, nv0Var2, qyVarA);
            z00 z00Var2 = f5.D;
            y02.F(z00Var2, nv0Var2, n52VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z00 z00Var3 = f5.F;
            y02.F(z00Var3, nv0Var2, numValueOf);
            y02.C(nv0Var2);
            z00 z00Var4 = f5.C;
            y02.F(z00Var4, nv0Var2, bq1VarM);
            yp1 yp1Var = yp1.a;
            bq1 bq1VarK = f80.K(j43.c(yp1Var, 1.0f), 24.0f, 8.0f);
            gl glVarE = yh1.e(nv0Var2);
            boolean zF = nv0Var2.f(a42Var);
            Object objO2 = nv0Var2.O();
            int i5 = 3;
            if (zF || objO2 == zjVar) {
                objO2 = new zg1(a42Var, i5);
                nv0Var2.j0(objO2);
            }
            cs0 cs0Var8 = (cs0) objO2;
            boolean zF2 = nv0Var2.f(a42Var);
            Object objO3 = nv0Var2.O();
            if (zF2 || objO3 == zjVar) {
                objO3 = new q81(a42Var, 3);
                nv0Var2.j0(objO3);
            }
            fh1.b(cs0Var8, (ns0) objO3, glVarE, 3, bq1VarK, gq.N(729382921, new wm2(a42Var, 2), nv0Var2), nv0Var2, 224256);
            bq1 bq1VarD = j43.c(yp1Var, 1.0f).d(new jc1(1.0f, true));
            cn1 cn1VarD = eo.d(f5.g, false);
            int iHashCode2 = Long.hashCode(nv0Var2.T);
            n52 n52VarL2 = nv0Var2.l();
            bq1 bq1VarM2 = lr.M(nv0Var2, bq1VarD);
            nv0Var2.d0();
            if (nv0Var2.S) {
                nv0Var2.k(x91Var);
            } else {
                nv0Var2.m0();
            }
            y02.F(z00Var, nv0Var2, cn1VarD);
            y02.F(z00Var2, nv0Var2, n52VarL2);
            nc2.r(iHashCode2, nv0Var2, z00Var3, nv0Var2);
            y02.F(z00Var4, nv0Var2, bq1VarM2);
            if (a42Var.g() == 0) {
                nv0Var2.a0(1634478577);
                k(nm2Var, g83Var, hd0Var, al0Var, str, cs0Var, ns0Var, cs0Var2, cs0Var3, ns0Var2, cs0Var4, cs0Var5, ns0Var3, cs0Var6, cs0Var7, ns0Var4, nv0Var2, i3 & 2147483646, i4 & 524286);
                nv0Var2 = nv0Var2;
                nv0Var2.p(false);
                rs0Var2 = rs0Var;
            } else if (a42Var.g() == 1) {
                nv0Var2.a0(1635436043);
                rs0Var2 = rs0Var;
                h(null, null, rs0Var2, nv0Var2, (i4 >> 12) & 896);
                nv0Var2.p(false);
            } else {
                rs0Var2 = rs0Var;
                nv0Var2.a0(1635512520);
                rn.p(null, null, rs0Var2, nv0Var2, (i4 >> 12) & 896);
                nv0Var2.p(false);
            }
            nv0Var2.p(true);
            nv0Var2.p(true);
        } else {
            rs0Var2 = rs0Var;
            nv0Var2.U();
        }
        xj2 xj2VarT = nv0Var2.t();
        if (xj2VarT != null) {
            final rs0 rs0Var3 = rs0Var2;
            xj2VarT.d = new rs0(g83Var, hd0Var, al0Var, str, cs0Var, ns0Var, cs0Var2, cs0Var3, ns0Var2, cs0Var4, cs0Var5, ns0Var3, cs0Var6, cs0Var7, ns0Var4, rs0Var3, i2) { // from class: hn2
                public final /* synthetic */ g83 g;
                public final /* synthetic */ hd0 h;
                public final /* synthetic */ al0 i;
                public final /* synthetic */ String j;
                public final /* synthetic */ cs0 k;
                public final /* synthetic */ ns0 l;
                public final /* synthetic */ cs0 m;
                public final /* synthetic */ cs0 n;
                public final /* synthetic */ ns0 o;
                public final /* synthetic */ cs0 p;
                public final /* synthetic */ cs0 q;
                public final /* synthetic */ ns0 r;
                public final /* synthetic */ cs0 s;
                public final /* synthetic */ cs0 t;
                public final /* synthetic */ ns0 u;
                public final /* synthetic */ rs0 v;

                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = jo3.y(1);
                    w7.u(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, (nv0) obj, iY);
                    return dm3.a;
                }
            };
        }
    }

    public static final void v(final g83 g83Var, final String str, final boolean z2, final ns0 ns0Var, final ns0 ns0Var2, final cs0 cs0Var, final cs0 cs0Var2, final ns0 ns0Var3, nv0 nv0Var, int i2) {
        String str2;
        Object oi2Var;
        boolean z3;
        nv0 nv0Var2 = nv0Var;
        nv0Var2.b0(-1007209892);
        int i3 = i2 | (nv0Var2.f(g83Var) ? 4 : 2) | (nv0Var2.f(str) ? 32 : 16) | (nv0Var2.g(z2) ? 256 : 128) | (nv0Var2.h(ns0Var) ? 2048 : 1024) | (nv0Var2.h(ns0Var2) ? 16384 : 8192) | (nv0Var2.h(cs0Var) ? 131072 : 65536) | (nv0Var2.h(cs0Var2) ? 1048576 : 524288) | (nv0Var2.h(ns0Var3) ? 8388608 : 4194304);
        if (nv0Var2.R(i3 & 1, (4793491 & i3) != 4793490)) {
            Object objO = nv0Var2.O();
            zj zjVar = c20.a;
            if (objO == zjVar) {
                objO = b32.w(Boolean.FALSE);
                nv0Var2.j0(objO);
            }
            final os1 os1Var = (os1) objO;
            if (s51.n(g83Var, d83.a)) {
                str2 = "https://sa-mp.th1nk.top/data/sources.json";
            } else if (g83Var instanceof e83) {
                str2 = ((e83) g83Var).a;
            } else if (g83Var instanceof f83) {
                str2 = ((f83) g83Var).b;
            } else {
                if (!(g83Var instanceof c83)) {
                    c.k();
                    return;
                }
                str2 = ((c83) g83Var).b;
            }
            boolean zN = s51.n(str2, "https://sa-mp.th1nk.top/data/sources.json");
            boolean zF = nv0Var2.f(str2);
            Object objO2 = nv0Var2.O();
            if (zF || objO2 == zjVar) {
                objO2 = b32.w(Boolean.valueOf(!zN));
                nv0Var2.j0(objO2);
            }
            final os1 os1Var2 = (os1) objO2;
            boolean zG = ((i3 & 14) == 4) | nv0Var2.g(zN) | ((i3 & 112) == 32);
            Object objO3 = nv0Var2.O();
            if (zG || objO3 == zjVar) {
                z3 = zN;
                oi2Var = new oi2(g83Var, z3, str, os1Var, null);
                nv0Var2.j0(oi2Var);
            } else {
                oi2Var = objO3;
                z3 = zN;
            }
            rn.l((rs0) oi2Var, nv0Var2, g83Var);
            final boolean z4 = z3;
            final String str3 = str2;
            gv3.m(oz2.M(2131624319, nv0Var2), gq.N(110757635, new ss0() { // from class: ym2
                /* JADX WARN: Removed duplicated region for block: B:35:0x031e  */
                /* JADX WARN: Removed duplicated region for block: B:36:0x0322  */
                /* JADX WARN: Removed duplicated region for block: B:39:0x0366  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x036a  */
                /* JADX WARN: Removed duplicated region for block: B:43:0x03d0  */
                /* JADX WARN: Removed duplicated region for block: B:44:0x03d4  */
                /* JADX WARN: Removed duplicated region for block: B:47:0x041b  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x045c  */
                /* JADX WARN: Removed duplicated region for block: B:52:0x0470  */
                /* JADX WARN: Removed duplicated region for block: B:61:0x0482  */
                /* JADX WARN: Removed duplicated region for block: B:64:0x049e  */
                @Override // defpackage.ss0
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object e(java.lang.Object r36, java.lang.Object r37, java.lang.Object r38) {
                    /*
                        Method dump skipped, instruction units count: 1236
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.ym2.e(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, nv0Var2), nv0Var2, 48);
            if (((Boolean) os1Var.getValue()).booleanValue()) {
                nv0Var2.a0(-1142543580);
                Object objO4 = nv0Var2.O();
                if (objO4 == zjVar) {
                    objO4 = new mh2(os1Var, 15);
                    nv0Var2.j0(objO4);
                }
                vp1.a((cs0) objO4, null, null, 0.0f, false, null, 0L, 0L, 0L, null, null, null, gq.N(1144109315, new ss0() { // from class: zm2
                    /* JADX WARN: Removed duplicated region for block: B:29:0x0168  */
                    /* JADX WARN: Removed duplicated region for block: B:33:0x0180  */
                    /* JADX WARN: Removed duplicated region for block: B:37:0x0187  */
                    @Override // defpackage.ss0
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object e(java.lang.Object r30, java.lang.Object r31, java.lang.Object r32) {
                        /*
                            Method dump skipped, instruction units count: 443
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.zm2.e(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }, nv0Var2), nv0Var, 6);
                nv0Var2 = nv0Var;
                nv0Var2.p(false);
            } else {
                nv0Var2.a0(-1139466458);
                nv0Var2.p(false);
            }
        } else {
            nv0Var2.U();
        }
        xj2 xj2VarT = nv0Var2.t();
        if (xj2VarT != null) {
            xj2VarT.d = new ni2(g83Var, str, z2, ns0Var, ns0Var2, cs0Var, cs0Var2, ns0Var3, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x023f  */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r17v0, types: [nv0] */
    /* JADX WARN: Type inference failed for: r26v0, types: [nv0] */
    /* JADX WARN: Type inference failed for: r8v1, types: [nv0] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v4, types: [nv0] */
    /* JADX WARN: Type inference failed for: r8v5, types: [nv0] */
    /* JADX WARN: Type inference failed for: r8v7, types: [nv0] */
    /* JADX WARN: Type inference failed for: r8v9, types: [nv0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void w(java.util.List r33, boolean r34, defpackage.ns0 r35, defpackage.bq1 r36, defpackage.nv0 r37, int r38) {
        /*
            Method dump skipped, instruction units count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w7.w(java.util.List, boolean, ns0, bq1, nv0, int):void");
    }

    public static final void x(gk3 gk3Var, ek3 ek3Var, Object obj, Object obj2, mm0 mm0Var, nv0 nv0Var, int i2) {
        int i3;
        nv0Var.b0(867041821);
        if ((i2 & 6) == 0) {
            i3 = (nv0Var.f(gk3Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= nv0Var.f(ek3Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? nv0Var.f(obj) : nv0Var.h(obj) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= (i2 & 4096) == 0 ? nv0Var.f(obj2) : nv0Var.h(obj2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= (32768 & i2) == 0 ? nv0Var.f(mm0Var) : nv0Var.h(mm0Var) ? 16384 : 8192;
        }
        if (!nv0Var.R(i3 & 1, (i3 & 9363) != 9362)) {
            nv0Var.U();
        } else if (gk3Var.g()) {
            ek3Var.g(obj, obj2, mm0Var);
        } else {
            ek3Var.h(obj2, mm0Var, null, null);
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new tm1(gk3Var, ek3Var, obj, obj2, mm0Var, i2, 1);
        }
    }

    public static final boolean y(View view, View view2) {
        if (view2.equals(view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    public static final void z(float[] fArr, float f2, float f3, float[] fArr2) {
        wm1.d(fArr2);
        wm1.f(fArr2, f2, f3);
        Y(fArr, fArr2);
    }
}
