package defpackage;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Paint;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import java.io.EOFException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class cl3 {
    public static final d00 A;
    public static final d00 B;
    public static final d00 C;
    public static final d00 D;
    public static final d00 E;
    public static final d00 F;
    public static final d00 G;
    public static final d00 H;
    public static final d00 I;
    public static final d00 J;
    public static final d00 K;
    public static final d00 L;
    public static final d00 M;
    public static final d00 N;
    public static final d00 O;
    public static final d00 P;
    public static final d00 Q;
    public static final d00 R;
    public static final d00 S;
    public static final d00 T;
    public static final Object U;
    public static final q20 V;
    public static final q20 W;
    public static final z00 X;
    public static final gy Y;
    public static final gy Z;
    public static final u0 a;
    public static final gy a0;
    public static final b23 b = b23.l;
    public static final float b0;
    public static final gy c;
    public static final gy c0;
    public static final float d;
    public static final h01 d0;
    public static final float e;
    public static final gy e0;
    public static final gy f;
    public static final gy f0;
    public static final float g;
    public static final gy g0;
    public static final gy h;
    public static final b23 h0;
    public static final float i;
    public static final gy i0;
    public static final gy j;
    public static final gy j0;
    public static final pl3 k;
    public static final gy k0;
    public static final gy l;
    public static final float l0;
    public static final float m;
    public static final pl3 m0;
    public static final gy n;
    public static final StackTraceElement[] n0;
    public static final float[][] o;
    public static final gy o0;
    public static final float[][] p;
    public static final gy p0;
    public static final float[] q;
    public static final wy0 q0;
    public static final double[][] r;
    public static final b23 r0;
    public static final double[][] s;
    public static final float s0;
    public static final d00 t;
    public static final float t0;
    public static final d00 u;
    public static final StackTraceElement[] u0;
    public static final d00 v;
    public static final ai0 v0;
    public static final d00 w;
    public static final av2 w0;
    public static final d00 x;
    public static final av2 x0;
    public static final d00 y;
    public static final av2 y0;
    public static final d00 z;
    public static final char[] z0;

    static {
        int i2 = 12;
        a = new u0(i2);
        gy gyVar = gy.m;
        c = gyVar;
        d = 0.38f;
        e = 8.0f;
        f = gyVar;
        g = 0.12f;
        h = gy.p;
        i = 1.0f;
        j = gyVar;
        k = pl3.j;
        l = gyVar;
        m = 0.38f;
        gy gyVar2 = gy.q;
        n = gyVar2;
        o = new float[][]{new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
        p = new float[][]{new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
        q = new float[]{95.047f, 100.0f, 108.883f};
        r = new double[][]{new double[]{0.41233895d, 0.35762064d, 0.18051042d}, new double[]{0.2126d, 0.7152d, 0.0722d}, new double[]{0.01932141d, 0.11916382d, 0.95034478d}};
        s = new double[][]{new double[]{3.2413774792388685d, -1.5376652402851851d, -0.49885366846268053d}, new double[]{-0.9691452513005321d, 1.8758853451067872d, 0.04156585616912061d}, new double[]{0.05562093689691305d, -0.20395524564742123d, 1.0571799111220335d}};
        byte b2 = 0;
        t = new d00(636288403, new h00(b2), false);
        int i3 = 1;
        u = new d00(-1357803046, new h00(i3), false);
        v = new d00(1071627023, new z1(29), false);
        int i4 = 5;
        w = new d00(-566985884, new k00(i4), false);
        x = new d00(2138007374, new p00(3), false);
        y = new d00(1265596812, new p00(4), false);
        int i5 = 7;
        z = new d00(1507216039, new k00(i5), false);
        A = new d00(-428144827, new p00(i4), false);
        int i6 = 6;
        B = new d00(-1296072189, new p00(i6), false);
        int i7 = 9;
        C = new d00(-1028229026, new k00(i7), false);
        D = new d00(2771974, new p00(i5), false);
        int i8 = 8;
        E = new d00(-865155388, new p00(i8), false);
        F = new d00(-597312225, new k00(i8), false);
        G = new d00(1149537547, new p00(i7), false);
        int i9 = 10;
        H = new d00(-376403390, new p00(i9), false);
        int i10 = 11;
        I = new d00(817257391, new p00(i10), false);
        J = new d00(-97475761, new k00(i9), false);
        K = new d00(-689561331, new k00(i10), false);
        L = new d00(75495597, new p00(i2), false);
        M = new d00(591000190, new p00(13), false);
        N = new d00(-151087097, new p00(14), false);
        O = new d00(-233603536, new p00(b2), false);
        P = new d00(-81889940, new p00(i3), false);
        int i11 = 2;
        Q = new d00(-657484345, new p00(i11), false);
        R = new d00(-1405196705, new k00(i6), false);
        S = new d00(1605463585, new r00(b2), false);
        T = new d00(1736694538, new r00(i3), false);
        U = new Object();
        V = new q20(20);
        W = new q20(21);
        X = new z00(19, b2);
        gy gyVar3 = gy.t;
        Y = gyVar3;
        Z = gyVar;
        a0 = gyVar;
        b0 = 1.0f;
        gy gyVar4 = gy.l;
        c0 = gyVar4;
        d0 = new h01(i6);
        e0 = gy.v;
        f0 = gyVar4;
        g0 = gyVar3;
        b23 b23Var = b23.i;
        h0 = b23Var;
        i0 = gy.s;
        gy gyVar5 = gy.n;
        j0 = gyVar5;
        k0 = gyVar5;
        l0 = 80.0f;
        m0 = pl3.k;
        n0 = new StackTraceElement[0];
        o0 = gyVar2;
        p0 = gyVar3;
        q0 = new wy0(i11);
        r0 = b23Var;
        s0 = 8.0f;
        t0 = 24.0f;
        u0 = new StackTraceElement[0];
        v0 = new ai0(1, "NO_THREAD_ELEMENTS");
        w0 = new av2(i4);
        x0 = new av2(i6);
        y0 = new av2(i5);
        z0 = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public static final void A(o50 o50Var, Object obj) {
        if (obj == v0) {
            return;
        }
        if (!(obj instanceof th3)) {
            Object objP = o50Var.p(x0, null);
            objP.getClass();
            Trace.endSection();
            return;
        }
        th3 th3Var = (th3) obj;
        qj3[] qj3VarArr = th3Var.c;
        int length = qj3VarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i2 = length - 1;
            qj3VarArr[length].getClass();
            Trace.endSection();
            if (i2 < 0) {
                return;
            } else {
                length = i2;
            }
        }
    }

    public static final bq1 B(bq1 bq1Var, qs2 qs2Var, t02 t02Var, w8 w8Var, boolean z2, rm0 rm0Var, qr1 qr1Var, zo zoVar) {
        t02 t02Var2 = t02.f;
        yp1 yp1Var = yp1.a;
        return bq1Var.d(t02Var == t02Var2 ? gq.t(yp1Var, wy0.c) : gq.t(yp1Var, wy0.b)).d(new fs2(w8Var, zoVar, rm0Var, qr1Var, t02Var, qs2Var, z2, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00a1 A[PHI: r0
      0x00a1: PHI (r0v11 int) = (r0v5 int), (r0v6 int), (r0v7 int), (r0v8 int) binds: [B:54:0x009f, B:57:0x00a4, B:60:0x00a8, B:63:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object C(rp0 rp0Var, int i2, ns0 ns0Var) {
        int i3;
        int i4;
        Object objH;
        aq1 aq1VarJ;
        sc1 sc1VarT1;
        ax1 ax1Var;
        if (!rp0Var.f.s) {
            m21.c("visitAncestors called on an unattached node");
        }
        aq1 aq1Var = rp0Var.f.j;
        tb1 tb1VarX = vr.X(rp0Var);
        loop0: while (true) {
            i3 = 0;
            i4 = 1;
            objH = null;
            if (tb1VarX == null) {
                aq1VarJ = null;
                break;
            }
            if ((tb1VarX.L.f.i & 1024) != 0) {
                while (aq1Var != null) {
                    if ((aq1Var.h & 1024) != 0) {
                        aq1VarJ = aq1Var;
                        qs1 qs1Var = null;
                        while (aq1VarJ != null) {
                            if (aq1VarJ instanceof rp0) {
                                break loop0;
                            }
                            if ((aq1VarJ.h & 1024) != 0 && (aq1VarJ instanceof ja0)) {
                                int i5 = 0;
                                for (aq1 aq1Var2 = ((ja0) aq1VarJ).u; aq1Var2 != null; aq1Var2 = aq1Var2.k) {
                                    if ((aq1Var2.h & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            aq1VarJ = aq1Var2;
                                        } else {
                                            if (qs1Var == null) {
                                                qs1Var = new qs1(new aq1[16]);
                                            }
                                            if (aq1VarJ != null) {
                                                qs1Var.b(aq1VarJ);
                                                aq1VarJ = null;
                                            }
                                            qs1Var.b(aq1Var2);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            aq1VarJ = vr.j(qs1Var);
                        }
                    }
                    aq1Var = aq1Var.j;
                }
            }
            tb1VarX = tb1VarX.u();
            aq1Var = (tb1VarX == null || (ax1Var = tb1VarX.L) == null) ? null : ax1Var.e;
        }
        rp0 rp0Var2 = (rp0) aq1VarJ;
        if ((rp0Var2 == null || !s51.n(rp0Var2.t1(), rp0Var.t1())) && (sc1VarT1 = rp0Var.t1()) != null) {
            int i6 = 5;
            if (i2 == 5) {
                i4 = i6;
            } else {
                i6 = 6;
                if (i2 != 6) {
                    i6 = 3;
                    if (i2 != 3) {
                        i6 = 4;
                        if (i2 != 4) {
                            if (i2 == 1) {
                                i4 = 2;
                            } else if (i2 != 2) {
                                c.q("Unsupported direction for beyond bounds layout");
                            }
                        }
                    }
                }
            }
            if (sc1VarT1.t.a() <= 0 || !sc1VarT1.t.c() || !sc1VarT1.s) {
                return ns0Var.h(sc1.w);
            }
            boolean zQ1 = sc1VarT1.q1(i4);
            tc1 tc1Var = sc1VarT1.t;
            int iB = zQ1 ? tc1Var.b() : tc1Var.e();
            qk2 qk2Var = new qk2();
            po poVar = sc1VarT1.u;
            poVar.getClass();
            oc1 oc1Var = new oc1(iB, iB);
            poVar.a.b(oc1Var);
            qk2Var.f = oc1Var;
            int iD = sc1VarT1.t.d() * 2;
            int iA = sc1VarT1.t.a();
            if (iD > iA) {
                iD = iA;
            }
            while (objH == null && sc1VarT1.p1((oc1) qk2Var.f, i4) && i3 < iD) {
                oc1 oc1Var2 = (oc1) qk2Var.f;
                int i7 = oc1Var2.a;
                int i8 = oc1Var2.b;
                if (sc1VarT1.q1(i4)) {
                    i8++;
                } else {
                    i7--;
                }
                po poVar2 = sc1VarT1.u;
                poVar2.getClass();
                oc1 oc1Var3 = new oc1(i7, i8);
                poVar2.a.b(oc1Var3);
                sc1VarT1.u.a.j((oc1) qk2Var.f);
                qk2Var.f = oc1Var3;
                i3++;
                vr.X(sc1VarT1).k();
                objH = ns0Var.h(new rc1(sc1VarT1, qk2Var, i4));
            }
            sc1VarT1.u.a.j((oc1) qk2Var.f);
            vr.X(sc1VarT1).k();
            return objH;
        }
        return null;
    }

    public static final Object D(o50 o50Var) {
        Object objP = o50Var.p(w0, 0);
        objP.getClass();
        return objP;
    }

    public static void E(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        s51.D(classCastException, cl3.class.getName());
        throw classCastException;
    }

    public static final Object F(o50 o50Var, Object obj) {
        if (obj == null) {
            obj = D(o50Var);
        }
        if (obj == 0) {
            return v0;
        }
        if (obj instanceof Integer) {
            return o50Var.p(y0, new th3(((Number) obj).intValue(), o50Var));
        }
        Trace.beginSection(null);
        return dm3.a;
    }

    public static final Object G(o50 o50Var, rs0 rs0Var, p40 p40Var) {
        o50 o50VarI = p40Var.i();
        o50 o50VarK = !((Boolean) o50Var.p(new z00(14, (byte) 0), Boolean.FALSE)).booleanValue() ? o50VarI.k(o50Var) : uq.p(o50VarI, o50Var, false);
        lq.r(o50VarK);
        if (o50VarK == o50VarI) {
            sr2 sr2Var = new sr2(p40Var, o50VarK);
            return b32.C(sr2Var, true, sr2Var, rs0Var);
        }
        f5 f5Var = f5.L;
        if (s51.n(o50VarK.m(f5Var), o50VarI.m(f5Var))) {
            xl3 xl3Var = new xl3(p40Var, o50VarK);
            o50 o50Var2 = xl3Var.j;
            Object objF = F(o50Var2, null);
            try {
                return b32.C(xl3Var, true, xl3Var, rs0Var);
            } finally {
                A(o50Var2, objF);
            }
        }
        xb0 xb0Var = new xb0(p40Var, o50VarK);
        try {
            s51.A(vr.I(vr.w(xb0Var, xb0Var, rs0Var)), dm3.a);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = xb0.l;
            do {
                int i2 = atomicIntegerFieldUpdater.get(xb0Var);
                if (i2 != 0) {
                    if (i2 != 2) {
                        c.q("Already suspended");
                        return null;
                    }
                    Object objK = s51.K(xb0Var.S());
                    if (objK instanceof jz) {
                        throw ((jz) objK).a;
                    }
                    return objK;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(xb0Var, 0, 1));
            return y50.f;
        } catch (Throwable th) {
            th = th;
            if (th instanceof vb0) {
                th = ((vb0) th).f;
            }
            xb0Var.t(y02.l(th));
            throw th;
        }
    }

    public static final void a(int i2, final ns0 ns0Var, nv0 nv0Var, bq1 bq1Var) {
        int i3;
        int i4;
        Object obj;
        n52 n52Var;
        ua0 ua0Var;
        bb1 bb1Var;
        of1 of1Var;
        bq1 bq1Var2;
        nv0Var.b0(-180024211);
        if ((i2 & 6) == 0) {
            i3 = (nv0Var.h(ns0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= nv0Var.f(bq1Var) ? 32 : 16;
        }
        int i5 = i3 | 384;
        int i6 = i2 & 3072;
        Object obj2 = a;
        if (i6 == 0) {
            i5 |= nv0Var.h(obj2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= nv0Var.h(obj2) ? 16384 : 8192;
        }
        if (nv0Var.R(i5 & 1, (i5 & 9363) != 9362)) {
            int iHashCode = Long.hashCode(nv0Var.T);
            bq1 bq1VarM = lr.M(nv0Var, bq1Var.d(to0.a).d(qp0.a).d(sp0.a).d(np0.a));
            ua0 ua0Var2 = (ua0) nv0Var.j(s20.h);
            bb1 bb1Var2 = (bb1) nv0Var.j(s20.n);
            n52 n52VarL = nv0Var.l();
            of1 of1Var2 = (of1) nv0Var.j(ij1.a);
            wq2 wq2Var = (wq2) nv0Var.j(nj1.a);
            nv0Var.a0(1314774735);
            int i7 = i5 & 14;
            final int iHashCode2 = Long.hashCode(nv0Var.T);
            final Context context = (Context) nv0Var.j(x7.b);
            final lv0 lv0VarW = lq.W(nv0Var);
            final gq2 gq2Var = (gq2) nv0Var.j(iq2.a);
            final View view = (View) nv0Var.j(x7.f);
            int i8 = 6;
            boolean zH = nv0Var.h(context) | ((((i7 & 14) ^ 6) > 4 && nv0Var.f(ns0Var)) || (i7 & 6) == 4) | nv0Var.h(lv0VarW) | nv0Var.h(gq2Var) | nv0Var.d(iHashCode2) | nv0Var.h(view);
            Object objO = nv0Var.O();
            if (zH || objO == c20.a) {
                n52Var = n52VarL;
                ua0Var = ua0Var2;
                bb1Var = bb1Var2;
                of1Var = of1Var2;
                bq1Var2 = bq1VarM;
                obj = new cs0() { // from class: yc
                    @Override // defpackage.cs0
                    public final Object a() {
                        KeyEvent.Callback callback = view;
                        callback.getClass();
                        return new pq3(context, ns0Var, lv0VarW, gq2Var, iHashCode2, (q12) callback).getLayoutNode();
                    }
                };
                nv0Var.j0(obj);
            } else {
                bq1Var2 = bq1VarM;
                of1Var = of1Var2;
                obj = objO;
                ua0Var = ua0Var2;
                bb1Var = bb1Var2;
                n52Var = n52VarL;
            }
            cs0 cs0Var = (cs0) obj;
            nv0Var.V(125, 1, null, null);
            nv0Var.r = true;
            n52 n52Var2 = n52Var;
            if (nv0Var.S) {
                nv0Var.k(cs0Var);
            } else {
                nv0Var.m0();
            }
            w10.c.getClass();
            y02.F(f5.D, nv0Var, n52Var2);
            y02.F(new wc(3), nv0Var, bq1Var2);
            y02.F(new wc(4), nv0Var, ua0Var);
            y02.F(new wc(5), nv0Var, of1Var);
            y02.F(new wc(i8), nv0Var, wq2Var);
            y02.F(new wc(0), nv0Var, bb1Var);
            y02.F(f5.F, nv0Var, Integer.valueOf(iHashCode));
            y02.F(new wc(1), nv0Var, obj2);
            y02.F(new wc(2), nv0Var, obj2);
            nv0Var.p(true);
            i4 = 0;
            nv0Var.p(false);
        } else {
            i4 = 0;
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new xc(i2, i4, ns0Var, bq1Var);
        }
    }

    public static final void b(ns0 ns0Var, bq1 bq1Var, ns0 ns0Var2, nv0 nv0Var, int i2) {
        nv0Var.b0(-1783766393);
        int i3 = (nv0Var.h(ns0Var) ? 4 : 2) | i2 | 384;
        if (nv0Var.R(i3 & 1, (i3 & 147) != 146)) {
            a((i3 & 14) | 27696, ns0Var, nv0Var, bq1Var);
            ns0Var2 = a;
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new w1(ns0Var, bq1Var, ns0Var2, i2);
        }
    }

    public static pe c(float f2, float f3, int i2) {
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        return new pe(rn.f1, Float.valueOf(f2), new qe(f3), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static final w9 d() {
        return new w9(new Paint(7));
    }

    public static final void e(s1 s1Var, vu2 vu2Var) {
        qu2 qu2Var = vu2Var.d;
        is1 is1Var = qu2Var.f;
        Object objG = qu2Var.f.g(zu2.z);
        if (objG == null) {
            objG = null;
        }
        no2 no2Var = (no2) objG;
        if (gv3.t(vu2Var)) {
            if (no2Var != null && no2Var.a == 8) {
                return;
            }
            Object objG2 = is1Var.g(pu2.y);
            if (objG2 == null) {
                objG2 = null;
            }
            y0 y0Var = (y0) objG2;
            if (y0Var != null) {
                s1Var.a(new n1(null, R.id.accessibilityActionPageUp, y0Var.a, null));
            }
            Object objG3 = is1Var.g(pu2.A);
            if (objG3 == null) {
                objG3 = null;
            }
            y0 y0Var2 = (y0) objG3;
            if (y0Var2 != null) {
                s1Var.a(new n1(null, R.id.accessibilityActionPageDown, y0Var2.a, null));
            }
            Object objG4 = is1Var.g(pu2.z);
            if (objG4 == null) {
                objG4 = null;
            }
            y0 y0Var3 = (y0) objG4;
            if (y0Var3 != null) {
                s1Var.a(new n1(null, R.id.accessibilityActionPageLeft, y0Var3.a, null));
            }
            Object objG5 = is1Var.g(pu2.B);
            if (objG5 == null) {
                objG5 = null;
            }
            y0 y0Var4 = (y0) objG5;
            if (y0Var4 != null) {
                s1Var.a(new n1(null, R.id.accessibilityActionPageRight, y0Var4.a, null));
            }
        }
    }

    public static int f(double d2) {
        double d3 = (d2 + 16.0d) / 116.0d;
        double d4 = d2 > 8.0d ? d3 * d3 * d3 : d2 / 903.2962962962963d;
        double d5 = d3 * d3 * d3;
        boolean z2 = d5 > 0.008856451679035631d;
        double d6 = z2 ? d5 : d2 / 903.2962962962963d;
        if (!z2) {
            d5 = d2 / 903.2962962962963d;
        }
        float[] fArr = q;
        double d7 = d6 * ((double) fArr[0]);
        double d8 = d4 * ((double) fArr[1]);
        double d9 = d5 * ((double) fArr[2]);
        double[][] dArr = s;
        double[] dArr2 = dArr[0];
        double d10 = (dArr2[2] * d9) + (dArr2[1] * d8) + (dArr2[0] * d7);
        double[] dArr3 = dArr[1];
        double d11 = (dArr3[2] * d9) + (dArr3[1] * d8) + (dArr3[0] * d7);
        double[] dArr4 = dArr[2];
        return ((l(d10) & 255) << 16) | (-16777216) | ((l(d11) & 255) << 8) | (l((dArr4[2] * d9) + (dArr4[1] * d8) + (dArr4[0] * d7)) & 255);
    }

    public static Map g(Object obj) {
        if ((obj instanceof t61) && !(obj instanceof w61)) {
            E(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e2) {
            s51.D(e2, cl3.class.getName());
            throw e2;
        }
    }

    public static ba0 h(x50 x50Var, rs0 rs0Var) throws IllegalAccessException, InvocationTargetException {
        ba0 ba0Var = new ba0(uq.y(x50Var, li0.f), true);
        ba0Var.r0(a60.f, ba0Var, rs0Var);
        return ba0Var;
    }

    public static void i(int i2, Object obj) {
        if (obj == null || q(i2, obj)) {
            return;
        }
        E(obj, "kotlin.jvm.functions.Function" + i2);
        throw null;
    }

    public static String j(int i2, String str, String str2, int i3, int i4) throws EOFException {
        int i5 = (i4 & 1) != 0 ? 0 : i2;
        int length = (i4 & 2) != 0 ? str.length() : i3;
        boolean z2 = (i4 & 8) == 0;
        boolean z3 = (i4 & 16) == 0;
        boolean z4 = (i4 & 32) == 0;
        boolean z5 = (i4 & 64) == 0;
        str.getClass();
        int iCharCount = i5;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i6 = 32;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z5) || y93.i0(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z2 || (z3 && !r(iCharCount, length, str)))) || (iCodePointAt == 43 && z4)))) {
                hp hpVar = new hp();
                hpVar.D(i5, iCharCount, str);
                hp hpVar2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z2 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == i6 && str2 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                            hpVar.E("+");
                        } else if (iCodePointAt2 == 43 && z4) {
                            hpVar.E(z2 ? "+" : "%2B");
                        } else {
                            if (iCodePointAt2 >= i6 && iCodePointAt2 != 127) {
                                if ((iCodePointAt2 < 128 || z5) && !y93.i0(str2, (char) iCodePointAt2) && (iCodePointAt2 != 37 || (z2 && (!z3 || r(iCharCount, length, str))))) {
                                    hpVar.F(iCodePointAt2);
                                }
                            }
                            if (hpVar2 == null) {
                                hpVar2 = new hp();
                            }
                            hpVar2.F(iCodePointAt2);
                            while (!hpVar2.c()) {
                                byte b2 = hpVar2.readByte();
                                hpVar.v(37);
                                char[] cArr = z0;
                                hpVar.v(cArr[((b2 & 255) >> 4) & 15]);
                                hpVar.v(cArr[b2 & 15]);
                            }
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i6 = 32;
                }
                return hpVar.m();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.substring(i5, length);
    }

    public static pe k(pe peVar, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = ((Number) peVar.g.getValue()).floatValue();
        }
        if ((i2 & 2) != 0) {
            f3 = ((qe) peVar.h).a;
        }
        return new pe(peVar.f, Float.valueOf(f2), new qe(f3), peVar.i, peVar.j, peVar.k);
    }

    public static int l(double d2) {
        double d3 = d2 / 100.0d;
        int iRound = (int) Math.round((d3 <= 0.0031308d ? d3 * 12.92d : (Math.pow(d3, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d);
        if (iRound < 0) {
            return 0;
        }
        if (iRound > 255) {
            return 255;
        }
        return iRound;
    }

    public static bq1 m(bq1 bq1Var, gl glVar, cs0 cs0Var, ns0 ns0Var, cs0 cs0Var2, cs0 cs0Var3, cs0 cs0Var4, ns0 ns0Var2, ns0 ns0Var3, int i2) {
        cs0 cs0Var5 = (i2 & 8) != 0 ? V : cs0Var2;
        cs0 cs0Var6 = (i2 & 16) != 0 ? W : cs0Var3;
        cs0 cs0Var7 = (i2 & 32) != 0 ? null : cs0Var4;
        ns0 ns0Var4 = (i2 & 64) != 0 ? null : ns0Var2;
        bq1Var.getClass();
        glVar.getClass();
        cs0Var.getClass();
        ns0Var.getClass();
        d23 d23Var = new d23(cs0Var);
        bq1 ay0Var = yp1.a;
        bq1 bq1VarD = bq1Var.d(ns0Var4 != null ? vm1.z(ay0Var, ns0Var4) : ay0Var).d(cs0Var7 != null ? new v21(d23Var, cs0Var7) : ay0Var).d(cs0Var6 != null ? new s13(d23Var, cs0Var6) : ay0Var);
        if (cs0Var5 != null) {
            ay0Var = new ay0(d23Var, cs0Var5);
        }
        return bq1VarD.d(ay0Var).d(new ff0(glVar, d23Var, ns0Var, ns0Var4, X, ns0Var3));
    }

    public static final Paint n(w9 w9Var) {
        if (w9Var == null) {
            l21.a("Extracting native reference is only supported from androidx.compose.ui.graphics.AndroidPaint instances but received " + rk2.a(w9Var.getClass()).b());
        }
        return (Paint) w9Var.b;
    }

    public static bq1 o(bq1 bq1Var, qr1 qr1Var) {
        return bq1Var.d(new bz0(qr1Var));
    }

    public static int p(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (f2 + 16.0f) / 116.0f;
        float f4 = f2 > 8.0f ? f3 * f3 * f3 : f2 / 903.2963f;
        float f5 = f3 * f3 * f3;
        boolean z2 = f5 > 0.008856452f;
        float f6 = z2 ? f5 : ((f3 * 116.0f) - 16.0f) / 903.2963f;
        if (!z2) {
            f5 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = q;
        return ny.a(f6 * fArr[0], f4 * fArr[1], f5 * fArr[2]);
    }

    public static boolean q(int i2, Object obj) {
        if (obj instanceof zs0) {
            if ((obj instanceof bt0 ? ((bt0) obj).c() : obj instanceof cs0 ? 0 : obj instanceof ns0 ? 1 : obj instanceof rs0 ? 2 : obj instanceof ss0 ? 3 : obj instanceof ts0 ? 4 : obj instanceof us0 ? 5 : obj instanceof vs0 ? 6 : obj instanceof ws0 ? 7 : obj instanceof xs0 ? 8 : obj instanceof ys0 ? 9 : obj instanceof ds0 ? 10 : obj instanceof es0 ? 11 : obj instanceof gs0 ? 13 : obj instanceof hs0 ? 14 : obj instanceof is0 ? 15 : obj instanceof js0 ? 16 : obj instanceof ks0 ? 17 : obj instanceof ls0 ? 18 : obj instanceof ms0 ? 19 : obj instanceof os0 ? 20 : obj instanceof ps0 ? 21 : -1) == i2) {
                return true;
            }
        }
        return false;
    }

    public static final boolean r(int i2, int i3, String str) {
        str.getClass();
        int i4 = i2 + 2;
        return i4 < i3 && str.charAt(i2) == '%' && jv3.j(str.charAt(i2 + 1)) != -1 && jv3.j(str.charAt(i4)) != -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object s(ArrayList arrayList, q40 q40Var) {
        nk nkVar;
        Iterator it;
        int i2;
        if (q40Var instanceof nk) {
            nkVar = (nk) q40Var;
            int i3 = nkVar.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                nkVar.l = i3 - Integer.MIN_VALUE;
            } else {
                nkVar = new nk(q40Var);
            }
        }
        Object obj = nkVar.k;
        int i4 = nkVar.l;
        if (i4 == 0) {
            y02.Q(obj);
            it = arrayList.iterator();
            i2 = 0;
        } else {
            if (i4 != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = nkVar.j;
            it = nkVar.i;
            y02.Q(obj);
        }
        while (it.hasNext()) {
            j61 j61Var = (j61) it.next();
            nkVar.i = it;
            nkVar.j = i2;
            nkVar.l = 1;
            Object objX = j61Var.x(nkVar);
            y50 y50Var = y50.f;
            if (objX == y50Var) {
                return y50Var;
            }
        }
        return dm3.a;
    }

    public static w83 t(x50 x50Var, o50 o50Var, rs0 rs0Var, int i2) {
        if ((i2 & 1) != 0) {
            o50Var = li0.f;
        }
        a60 a60Var = (i2 & 2) != 0 ? a60.f : a60.i;
        o50 o50VarY = uq.y(x50Var, o50Var);
        w83 ne1Var = a60Var == a60.g ? new ne1(o50VarY, rs0Var) : new w83(o50VarY, true);
        ne1Var.r0(a60Var, ne1Var, rs0Var);
        return ne1Var;
    }

    public static final bq1 u(bq1 bq1Var, wc1 wc1Var) {
        return bq1Var.d(new fc0(wc1Var));
    }

    public static float v(int i2) {
        float f2 = i2 / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static final bq1 w(bq1 bq1Var, ns0 ns0Var) {
        return bq1Var.d(new ez1(ns0Var));
    }

    public static String x(String str, int i2, int i3, int i4) {
        int i5;
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        boolean z2 = (i4 & 4) == 0;
        str.getClass();
        int iCharCount = i2;
        while (iCharCount < i3) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z2)) {
                hp hpVar = new hp();
                hpVar.D(i2, iCharCount, str);
                while (iCharCount < i3) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i5 = iCharCount + 2) < i3) {
                        int iJ = jv3.j(str.charAt(iCharCount + 1));
                        int iJ2 = jv3.j(str.charAt(i5));
                        if (iJ == -1 || iJ2 == -1) {
                            hpVar.F(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            hpVar.v((iJ << 4) + iJ2);
                            iCharCount = Character.charCount(iCodePointAt) + i5;
                        }
                    } else if (iCodePointAt == 43 && z2) {
                        hpVar.v(32);
                        iCharCount++;
                    } else {
                        hpVar.F(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return hpVar.m();
            }
            iCharCount++;
        }
        return str.substring(i2, i3);
    }

    public static final vl1 y(r3 r3Var, ns0 ns0Var, nv0 nv0Var) {
        Object a4Var;
        Object obj;
        b32.z(r3Var, nv0Var);
        Object objZ = b32.z(ns0Var, nv0Var);
        Object[] objArr = new Object[0];
        Object objO = nv0Var.O();
        Object obj2 = c20.a;
        if (objO == obj2) {
            objO = new v3(1);
            nv0Var.j0(objO);
        }
        Object obj3 = (String) oz2.G(objArr, (cs0) objO, nv0Var);
        d4 d4Var = (d4) nv0Var.j(hj1.a);
        if (d4Var == null) {
            nv0Var.a0(1213380307);
            Object baseContext = (Context) nv0Var.j(x7.b);
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof d4) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            d4Var = (d4) baseContext;
        } else {
            nv0Var.a0(1213379439);
        }
        nv0Var.p(false);
        if (d4Var == null) {
            c.q("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
            return null;
        }
        Object activityResultRegistry = d4Var.getActivityResultRegistry();
        Object objO2 = nv0Var.O();
        if (objO2 == obj2) {
            objO2 = new t3();
            nv0Var.j0(objO2);
        }
        t3 t3Var = (t3) objO2;
        Object objO3 = nv0Var.O();
        if (objO3 == obj2) {
            objO3 = new vl1(t3Var);
            nv0Var.j0(objO3);
        }
        vl1 vl1Var = (vl1) objO3;
        boolean zH = nv0Var.h(t3Var) | nv0Var.h(activityResultRegistry) | nv0Var.f(obj3) | nv0Var.h(r3Var) | nv0Var.f(objZ);
        Object objO4 = nv0Var.O();
        if (zH || objO4 == obj2) {
            obj = r3Var;
            a4Var = new a4(t3Var, activityResultRegistry, obj3, obj, objZ, 0);
            nv0Var.j0(a4Var);
        } else {
            a4Var = objO4;
            obj = r3Var;
        }
        ns0 ns0Var2 = (ns0) a4Var;
        boolean zF = nv0Var.f(activityResultRegistry) | nv0Var.f(obj3) | nv0Var.f(obj);
        Object objO5 = nv0Var.O();
        if (zF || objO5 == obj2) {
            objO5 = new hc0(ns0Var2);
            nv0Var.j0(objO5);
        }
        return vl1Var;
    }

    public static final pq3 z(tb1 tb1Var) {
        pq3 pq3Var = tb1Var.u;
        if (pq3Var != null) {
            return pq3Var;
        }
        throw nc2.d("Required value was null.");
    }
}
