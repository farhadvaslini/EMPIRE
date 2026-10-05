package defpackage;

import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class f80 {
    public static final d00 A;
    public static final na A0;
    public static final d00 B;
    public static final ak2 B0;
    public static final d00 C;
    public static final ak2 C0;
    public static final d00 D;
    public static final ak2 D0;
    public static final d00 E;
    public static final rh3 E0;
    public static final d00 F;
    public static final ak2 F0;
    public static final d00 G;
    public static final float G0 = 24.0f;
    public static final d00 H;
    public static final float H0 = 24.0f;
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
    public static final d00 U;
    public static final d00 V;
    public static final d00 W;
    public static final d00 X;
    public static final d00 Y;
    public static final d00 Z;
    public static final u0 a;
    public static final d00 a0;
    public static final gy b;
    public static final up0 b0;
    public static final gy c;
    public static final c11 c0;
    public static final gy d;
    public static final int[] d0;
    public static final gy e;
    public static final gy e0;
    public static final gy f;
    public static final b23 f0;
    public static final gy g;
    public static final gy g0;
    public static final pl3 h;
    public static final float h0;
    public static final b23 i;
    public static final gy i0;
    public static final float j;
    public static final float j0;
    public static final b23 k;
    public static final gy k0;
    public static final float l;
    public static final float l0;
    public static final Object[] m;
    public static final gy m0;
    public static final d00 n;
    public static final pl3 n0;
    public static final d00 o;
    public static final gy o0;
    public static final d00 p;
    public static final float p0;
    public static final d00 q;
    public static final gy q0;
    public static final d00 r;
    public static final gy r0;
    public static final d00 s;
    public static final pl3 s0;
    public static final d00 t;
    public static final float t0;
    public static final d00 u;
    public static final gy u0;
    public static final d00 v;
    public static final pl3 v0;
    public static final d00 w;
    public static final float w0;
    public static final d00 x;
    public static final pl3 x0;
    public static final d00 y;
    public static final na y0;
    public static final d00 z;
    public static final na z0;

    static {
        int i2 = 0;
        a = new u0(i2);
        gy gyVar = gy.u;
        b = gyVar;
        gy gyVar2 = gy.m;
        c = gyVar2;
        d = gy.v;
        gy gyVar3 = gy.n;
        e = gyVar3;
        f = gyVar2;
        g = gyVar3;
        pl3 pl3Var = pl3.l;
        h = pl3Var;
        b23 b23Var = b23.i;
        i = b23Var;
        j = 16.0f;
        k = b23Var;
        l = 6.0f;
        m = new Object[0];
        int i3 = 22;
        n = new d00(591912949, new z1(i3), false);
        int i4 = 23;
        o = new d00(1695848410, new z1(i4), false);
        int i5 = 24;
        p = new d00(599110865, new z1(i5), false);
        int i6 = 27;
        q = new d00(1723056171, new wc(i6), false);
        int i7 = 28;
        r = new d00(-682249423, new wc(i7), false);
        int i8 = 29;
        s = new d00(1461433297, new wc(i8), false);
        t = new d00(-1726080500, new k00(i2), false);
        int i9 = 17;
        u = new d00(-1800294425, new k00(i9), false);
        v = new d00(1508869541, new u00(3), false);
        w = new d00(1217577385, new u00(4), false);
        x = new d00(-490086880, new u00(9), false);
        y = new d00(1063000481, new u00(12), false);
        z = new d00(1982978863, new u00(13), false);
        A = new d00(-1258695720, new u00(14), false);
        B = new d00(-1905566259, new u00(15), false);
        C = new d00(-1044063754, new u00(16), false);
        D = new d00(1406387591, new u00(18), false);
        int i10 = 19;
        E = new d00(1470941734, new u00(i10), false);
        F = new d00(-1333456857, new u00(8), false);
        G = new d00(1328580592, new u00(i9), false);
        int i11 = 20;
        H = new d00(1698695271, new u00(i11), false);
        I = new d00(-1601421762, new r00(i6), false);
        J = new d00(-2074657412, new r00(i7), false);
        int i12 = 21;
        K = new d00(-730685673, new u00(i12), false);
        L = new d00(1102817569, new u00(i3), false);
        M = new d00(-604846696, new u00(i4), false);
        N = new d00(1343527014, new r00(i8), false);
        O = new d00(-112388193, new r00(i10), false);
        P = new d00(1255591005, new r00(i11), false);
        Q = new d00(-538593637, new r00(i12), false);
        R = new d00(-1202585955, new r00(i3), false);
        int i13 = 5;
        S = new d00(-1325785310, new u00(i13), false);
        T = new d00(-951359185, new u00(6), false);
        U = new d00(572240679, new u00(7), false);
        V = new d00(278990655, new r00(i4), false);
        W = new d00(1725571521, new r00(i5), false);
        X = new d00(1072055564, new r00(25), false);
        Y = new d00(-1063827638, new r00(26), false);
        int i14 = 10;
        Z = new d00(-698520332, new u00(i14), false);
        a0 = new d00(-830158883, new u00(11), false);
        b0 = new up0(i14);
        c0 = new c11(false);
        d0 = new int[]{1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
        e0 = gyVar;
        f0 = b23.k;
        g0 = gyVar2;
        h0 = 0.38f;
        i0 = gyVar2;
        j0 = 0.38f;
        k0 = gyVar2;
        l0 = 0.38f;
        m0 = gyVar2;
        n0 = pl3.f;
        o0 = gyVar3;
        p0 = 56.0f;
        q0 = gyVar3;
        r0 = gyVar3;
        s0 = pl3.g;
        t0 = 88.0f;
        u0 = gyVar3;
        v0 = pl3Var;
        w0 = 72.0f;
        x0 = pl3.k;
        y0 = new na(1000);
        new na(1007);
        z0 = new na(1008);
        A0 = new na(1002);
        B0 = new ak2(3);
        C0 = new ak2(4);
        D0 = new ak2(i13);
        E0 = new rh3(0, new long[0], new Object[0]);
        F0 = new ak2(12);
    }

    public static final void A(wq2 wq2Var) {
        ff1 ff1Var = ((rf1) wq2Var.getLifecycle()).i;
        if (ff1Var == ff1.g || ff1Var == ff1.h) {
            if (wq2Var.getSavedStateRegistry().b("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
                pq2 pq2Var = new pq2(wq2Var.getSavedStateRegistry(), (cr3) wq2Var);
                wq2Var.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", pq2Var);
                wq2Var.getLifecycle().a(new ik2(3, pq2Var));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("Failed to enable `SavedStateHandle` for `" + wq2Var + "`. The `Lifecycle.State` must be `INITIALIZED` or `CREATED`, but was `" + ff1Var + "`. You must call `enableSavedStateHandles()` before the `Lifecycle.State` moves to `STARTED`.").toString());
    }

    public static final bq1 B(bq1 bq1Var, ip0 ip0Var) {
        return bq1Var.d(new jp0(ip0Var));
    }

    public static final void C(StringBuilder sb, StringBuilder sb2, int i2) {
        if (i2 < 10) {
            sb.append('0');
        }
        sb2.append(i2);
    }

    public static final String D(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final qq2 E(cr3 cr3Var) {
        oq2 oq2Var = new oq2();
        e60 e60VarM = jo3.m(cr3Var);
        e60VarM.getClass();
        return (qq2) new pl(cr3Var.getViewModelStore(), oq2Var, e60VarM).y(rk2.a(qq2.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final dx F(vq3 vq3Var) {
        dx dxVar;
        vq3Var.getClass();
        synchronized (F0) {
            dxVar = (dx) vq3Var.c("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (dxVar == null) {
                o50 o50Var = li0.f;
                try {
                    j90 j90Var = ac0.a;
                    o50Var = tl1.a.k;
                } catch (IllegalStateException | rx1 unused) {
                }
                dx dxVar2 = new dx(o50Var.k(jo3.f()));
                vq3Var.a("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", dxVar2);
                dxVar = dxVar2;
            }
        }
        return dxVar;
    }

    public static final int G(tj tjVar, Object obj, int i2) {
        int i3 = tjVar.h;
        if (i3 == 0) {
            return -1;
        }
        try {
            int iD = w7.D(i3, i2, tjVar.f);
            if (iD < 0 || s51.n(obj, tjVar.g[iD])) {
                return iD;
            }
            int i4 = iD + 1;
            while (i4 < i3 && tjVar.f[i4] == i2) {
                if (s51.n(obj, tjVar.g[i4])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = iD - 1; i5 >= 0 && tjVar.f[i5] == i2; i5--) {
                if (s51.n(obj, tjVar.g[i5])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final bq1 H(bq1 bq1Var, ta1 ta1Var) {
        bq1Var.getClass();
        ta1Var.getClass();
        return bq1Var.d(new ua1(ta1Var));
    }

    public static final bq1 I(bq1 bq1Var, x12 x12Var) {
        return bq1Var.d(new a22(x12Var));
    }

    public static final bq1 J(bq1 bq1Var, float f2) {
        return bq1Var.d(new v12(f2, f2, f2, f2));
    }

    public static final bq1 K(bq1 bq1Var, float f2, float f3) {
        return bq1Var.d(new v12(f2, f3, f2, f3));
    }

    public static bq1 L(bq1 bq1Var, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        return K(bq1Var, f2, f3);
    }

    public static final bq1 M(bq1 bq1Var, float f2, float f3, float f4, float f5) {
        return bq1Var.d(new v12(f2, f3, f4, f5));
    }

    public static bq1 N(bq1 bq1Var, float f2, float f3, float f4, float f5, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f5 = 0.0f;
        }
        return M(bq1Var, f2, f3, f4, f5);
    }

    public static final void O(TextPaint textPaint, float f2) {
        if (Float.isNaN(f2)) {
            return;
        }
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f2 * 255.0f));
    }

    public static final bq1 P(mf3 mf3Var) {
        return new ae3(mf3Var);
    }

    public static final long Q(float f2, long j2) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j2 >> 32)) - f2);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j2 & 4294967295L)) - f2);
        return (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }

    public static final Object[] R(Collection collection) {
        collection.getClass();
        int size = collection.size();
        Object[] objArr = m;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArrCopyOf = new Object[size];
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            objArrCopyOf[i2] = it.next();
            if (i3 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i4 = ((i3 * 3) + 1) >>> 1;
                if (i4 <= i3) {
                    i4 = 2147483645;
                    if (i3 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
            } else if (!it.hasNext()) {
                return Arrays.copyOf(objArrCopyOf, i3);
            }
            i2 = i3;
        }
    }

    public static final Object[] S(Collection collection, Object[] objArr) {
        Object[] objArrCopyOf;
        collection.getClass();
        objArr.getClass();
        int size = collection.size();
        int i2 = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArrCopyOf = objArr;
                } else {
                    Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    objNewInstance.getClass();
                    objArrCopyOf = (Object[]) objNewInstance;
                }
                while (true) {
                    int i3 = i2 + 1;
                    objArrCopyOf[i2] = it.next();
                    if (i3 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i4 = ((i3 * 3) + 1) >>> 1;
                        if (i4 <= i3) {
                            i4 = 2147483645;
                            if (i3 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf != objArr) {
                            return Arrays.copyOf(objArrCopyOf, i3);
                        }
                        objArr[i3] = null;
                        return objArr;
                    }
                    i2 = i3;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    public static final String T(p40 p40Var) {
        Object qn2Var;
        if (p40Var instanceof wb0) {
            return ((wb0) p40Var).toString();
        }
        try {
            qn2Var = p40Var + '@' + D(p40Var);
        } catch (Throwable th) {
            qn2Var = new qn2(th);
        }
        if (rn2.a(qn2Var) != null) {
            qn2Var = p40Var.getClass().getName() + '@' + D(p40Var);
        }
        return (String) qn2Var;
    }

    public static final void a(g4 g4Var, cs0 cs0Var, ns0 ns0Var, ns0 ns0Var2, cs0 cs0Var2, nv0 nv0Var, int i2) {
        int i3;
        String strM;
        g4Var.getClass();
        cs0Var.getClass();
        ns0Var.getClass();
        ns0Var2.getClass();
        cs0Var2.getClass();
        nv0Var.b0(1785591093);
        int i4 = i2 | (nv0Var.f(g4Var) ? 4 : 2) | (nv0Var.h(cs0Var) ? 32 : 16) | (nv0Var.h(ns0Var) ? 256 : 128) | (nv0Var.h(ns0Var2) ? 2048 : 1024) | (nv0Var.h(cs0Var2) ? 16384 : 8192);
        if (nv0Var.R(i4 & 1, (i4 & 9363) != 9362)) {
            h4 h4Var = g4Var.d;
            if (h4Var == null) {
                nv0Var.a0(1374519632);
                nv0Var.p(false);
                strM = null;
            } else {
                nv0Var.a0(1374519633);
                int iOrdinal = h4Var.ordinal();
                if (iOrdinal == 0) {
                    i3 = R.string.launcher_error_server_host_empty;
                } else if (iOrdinal == 1) {
                    i3 = R.string.launcher_error_server_host_invalid;
                } else if (iOrdinal == 2) {
                    i3 = R.string.launcher_error_server_port_invalid;
                } else {
                    if (iOrdinal != 3) {
                        c.k();
                        return;
                    }
                    i3 = R.string.launcher_error_server_already_exists;
                }
                strM = oz2.M(i3, nv0Var);
                nv0Var.p(false);
            }
            rn.a(cs0Var, gq.N(-1851366931, new k91(cs0Var2, 7), nv0Var), null, gq.N(718992043, new k91(cs0Var, 8), nv0Var), null, rn.a0, gq.N(-1867920440, new ul(g4Var, ns0Var, ns0Var2, strM, 11), nv0Var), null, 0L, 0L, 0L, 0L, null, nv0Var, ((i4 >> 3) & 14) | 1772592, 16276);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new r81(g4Var, cs0Var, ns0Var, ns0Var2, cs0Var2, i2, 8);
        }
    }

    public static final void b(cs0 cs0Var, nb0 nb0Var, d00 d00Var, nv0 nv0Var, int i2) {
        nv0Var.b0(826668973);
        int i3 = i2 | (nv0Var.h(cs0Var) ? 4 : 2) | (nv0Var.f(nb0Var) ? 32 : 16);
        int i4 = 0;
        if (nv0Var.R(i3 & 1, (i3 & 147) != 146)) {
            View view = (View) nv0Var.j(x7.f);
            ua0 ua0Var = (ua0) nv0Var.j(s20.h);
            bb1 bb1Var = (bb1) nv0Var.j(s20.n);
            lv0 lv0VarW = lq.W(nv0Var);
            os1 os1VarZ = b32.z(d00Var, nv0Var);
            Object[] objArr = new Object[0];
            Object objO = nv0Var.O();
            Object obj = c20.a;
            if (objO == obj) {
                objO = new v3(8);
                nv0Var.j0(objO);
            }
            UUID uuid = (UUID) oz2.G(objArr, (cs0) objO, nv0Var);
            boolean zD = nv0Var.d(nb0Var.g) | nv0Var.f(view) | nv0Var.f(ua0Var) | nv0Var.f(null);
            Object objO2 = nv0Var.O();
            if (zD || objO2 == obj) {
                pb0 pb0Var = new pb0(cs0Var, nb0Var, view, bb1Var, ua0Var, uuid);
                d00 d00Var2 = new d00(-1338939603, new l8(os1VarZ, i4), true);
                kb0 kb0Var = pb0Var.m;
                kb0Var.setParentCompositionContext(lv0VarW);
                kb0Var.p.setValue(d00Var2);
                kb0Var.t = true;
                kb0Var.d();
                nv0Var.j0(pb0Var);
                objO2 = pb0Var;
            }
            pb0 pb0Var2 = (pb0) objO2;
            boolean zH = nv0Var.h(pb0Var2);
            Object objO3 = nv0Var.O();
            if (zH || objO3 == obj) {
                objO3 = new m8(pb0Var2, i4);
                nv0Var.j0(objO3);
            }
            rn.g(pb0Var2, (ns0) objO3, nv0Var);
            boolean zH2 = nv0Var.h(pb0Var2) | ((i3 & 14) == 4) | ((i3 & 112) == 32) | nv0Var.d(bb1Var.ordinal());
            Object objO4 = nv0Var.O();
            if (zH2 || objO4 == obj) {
                Object n8Var = new n8(pb0Var2, cs0Var, nb0Var, bb1Var, 0);
                nv0Var.j0(n8Var);
                objO4 = n8Var;
            }
            rn.t((cs0) objO4, nv0Var);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new w1(cs0Var, (Object) nb0Var, (zs0) d00Var, i2, 1);
        }
    }

    public static final void c(bq1 bq1Var, rs0 rs0Var, nv0 nv0Var, int i2) {
        nv0Var.b0(1090521195);
        int i3 = (nv0Var.f(bq1Var) ? 4 : 2) | i2 | (nv0Var.h(rs0Var) ? 32 : 16);
        int i4 = 1;
        if (nv0Var.R(i3 & 1, (i3 & 19) != 18)) {
            Object objO = nv0Var.O();
            if (objO == c20.a) {
                objO = p8.b;
                nv0Var.j0(objO);
            }
            cn1 cn1Var = (cn1) objO;
            int iHashCode = Long.hashCode(nv0Var.T);
            n52 n52VarL = nv0Var.l();
            bq1 bq1VarM = lr.M(nv0Var, bq1Var);
            w10.c.getClass();
            int i5 = (((((i3 << 3) & 112) | (((i3 >> 3) & 14) | 384)) << 6) & 896) | 6;
            nv0Var.d0();
            if (nv0Var.S) {
                nv0Var.k(tb1.Y);
            } else {
                nv0Var.m0();
            }
            y02.F(f5.E, nv0Var, cn1Var);
            y02.F(f5.D, nv0Var, n52VarL);
            y02.F(f5.F, nv0Var, Integer.valueOf(iHashCode));
            y02.C(nv0Var);
            y02.F(f5.C, nv0Var, bq1VarM);
            rs0Var.f(nv0Var, Integer.valueOf((i5 >> 6) & 14));
            nv0Var.p(true);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new y7(i2, i4, bq1Var, rs0Var);
        }
    }

    public static final void d(final v71 v71Var, final ns0 ns0Var, final ns0 ns0Var2, final ns0 ns0Var3, final cs0 cs0Var, final cs0 cs0Var2, final cs0 cs0Var3, nv0 nv0Var, final int i2) {
        xj2 xj2VarT;
        rs0 rs0Var;
        v71Var.getClass();
        ns0Var.getClass();
        ns0Var2.getClass();
        ns0Var3.getClass();
        cs0Var.getClass();
        cs0Var2.getClass();
        nv0Var.b0(260957268);
        int i3 = (nv0Var.h(cs0Var3) ? 1048576 : 524288) | i2 | (nv0Var.h(v71Var) ? 4 : 2) | (nv0Var.h(ns0Var) ? 32 : 16) | (nv0Var.h(ns0Var2) ? 256 : 128) | (nv0Var.h(ns0Var3) ? 2048 : 1024) | (nv0Var.h(cs0Var) ? 16384 : 8192) | (nv0Var.h(cs0Var2) ? 131072 : 65536);
        int i4 = 1;
        if (nv0Var.R(i3 & 1, (599187 & i3) != 599186)) {
            kq2 kq2Var = v71Var.b;
            if (kq2Var == null) {
                xj2VarT = nv0Var.t();
                if (xj2VarT != null) {
                    final int i5 = 0;
                    rs0Var = new rs0(v71Var, ns0Var, ns0Var2, ns0Var3, cs0Var, cs0Var2, cs0Var3, i2, i5) { // from class: cz2
                        public final /* synthetic */ int f;
                        public final /* synthetic */ v71 g;
                        public final /* synthetic */ ns0 h;
                        public final /* synthetic */ ns0 i;
                        public final /* synthetic */ ns0 j;
                        public final /* synthetic */ cs0 k;
                        public final /* synthetic */ cs0 l;
                        public final /* synthetic */ cs0 m;

                        {
                            this.f = i5;
                        }

                        @Override // defpackage.rs0
                        public final Object f(Object obj, Object obj2) {
                            int i6 = this.f;
                            dm3 dm3Var = dm3.a;
                            switch (i6) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iY = jo3.y(9);
                                    f80.d(this.g, this.h, this.i, this.j, this.k, this.l, this.m, (nv0) obj, iY);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iY2 = jo3.y(9);
                                    f80.d(this.g, this.h, this.i, this.j, this.k, this.l, this.m, (nv0) obj, iY2);
                                    break;
                            }
                            return dm3Var;
                        }
                    };
                    xj2VarT.d = rs0Var;
                }
                return;
            }
            rn.a(cs0Var, gq.N(1531817740, new k91(cs0Var2, 10), nv0Var), null, gq.N(-434169014, new ai2(cs0Var, cs0Var3, i4), nv0Var), rn.S, gq.N(1894811528, new az2(kq2Var, i4), nv0Var), gq.N(911818151, new ul(v71Var, ns0Var, ns0Var2, ns0Var3, 12), nv0Var), null, 0L, 0L, 0L, 0L, null, nv0Var, ((i3 >> 12) & 14) | 1797168, 16260);
        } else {
            nv0Var.U();
        }
        xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            final int i6 = 1;
            rs0Var = new rs0(v71Var, ns0Var, ns0Var2, ns0Var3, cs0Var, cs0Var2, cs0Var3, i2, i6) { // from class: cz2
                public final /* synthetic */ int f;
                public final /* synthetic */ v71 g;
                public final /* synthetic */ ns0 h;
                public final /* synthetic */ ns0 i;
                public final /* synthetic */ ns0 j;
                public final /* synthetic */ cs0 k;
                public final /* synthetic */ cs0 l;
                public final /* synthetic */ cs0 m;

                {
                    this.f = i6;
                }

                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    int i62 = this.f;
                    dm3 dm3Var = dm3.a;
                    switch (i62) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iY = jo3.y(9);
                            f80.d(this.g, this.h, this.i, this.j, this.k, this.l, this.m, (nv0) obj, iY);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iY2 = jo3.y(9);
                            f80.d(this.g, this.h, this.i, this.j, this.k, this.l, this.m, (nv0) obj, iY2);
                            break;
                    }
                    return dm3Var;
                }
            };
            xj2VarT.d = rs0Var;
        }
    }

    public static b22 e(int i2) {
        float f2 = (i2 & 1) != 0 ? 0.0f : 8.0f;
        return new b22(f2, 0.0f, f2, 0.0f);
    }

    public static final b22 f(float f2, float f3, float f4, float f5) {
        return new b22(f2, f3, f4, f5);
    }

    public static b22 g(float f2) {
        return new b22(0.0f, 0.0f, 0.0f, f2);
    }

    public static final void h(o72 o72Var, cs0 cs0Var, nv0 nv0Var, int i2) {
        o72Var.getClass();
        cs0Var.getClass();
        nv0Var.b0(469694967);
        int i3 = i2 | (nv0Var.h(o72Var) ? 4 : 2) | (nv0Var.h(cs0Var) ? 32 : 16);
        if (nv0Var.R(i3 & 1, (i3 & 19) != 18)) {
            vp1.a(cs0Var, null, null, 0.0f, false, null, 0L, 0L, 0L, null, null, null, gq.N(-866330155, new w91(12, o72Var, cs0Var), nv0Var), nv0Var, (i3 >> 3) & 14);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new nh2(i2, 2, o72Var, cs0Var);
        }
    }

    public static final void i(List list, ns0 ns0Var, ns0 ns0Var2, bq1 bq1Var, nv0 nv0Var, int i2) {
        List list2;
        ns0 ns0Var3;
        ns0 ns0Var4;
        bq1 bq1Var2;
        xj2 xj2VarT;
        ng2 ng2Var;
        list.getClass();
        ns0Var.getClass();
        ns0Var2.getClass();
        nv0Var.b0(1379975749);
        int i3 = i2 | (nv0Var.f(list) ? 4 : 2) | (nv0Var.h(ns0Var) ? 32 : 16) | (nv0Var.h(ns0Var2) ? 256 : 128) | 3072;
        if (nv0Var.R(i3 & 1, (i3 & 1171) != 1170)) {
            boolean zIsEmpty = list.isEmpty();
            yp1 yp1Var = yp1.a;
            if (zIsEmpty) {
                nv0Var.a0(-569206563);
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
                mg3.b(oz2.M(R.string.raksamp_dialog_empty, nv0Var), null, ((fy) nv0Var.j(hy.a)).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var.j(ql3.a)).k, nv0Var, 0, 0, 131066);
                nv0Var.p(true);
                nv0Var.p(false);
                xj2VarT = nv0Var.t();
                if (xj2VarT != null) {
                    ng2Var = new ng2(list, ns0Var, ns0Var2, yp1Var, i2, 2);
                    xj2VarT.d = ng2Var;
                }
                return;
            }
            list2 = list;
            ns0Var3 = ns0Var;
            ns0Var4 = ns0Var2;
            boolean z2 = true;
            nv0Var.a0(-568837539);
            nv0Var.p(false);
            Object objO = nv0Var.O();
            Object obj = c20.a;
            if (objO == obj) {
                objO = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
                nv0Var.j0(objO);
            }
            SimpleDateFormat simpleDateFormat = (SimpleDateFormat) objO;
            gm0 gm0Var2 = j43.c;
            jj jjVar = new jj(4.0f, true, new c(1));
            boolean zH = ((i3 & 14) == 4) | ((i3 & 112) == 32) | nv0Var.h(simpleDateFormat);
            if ((i3 & 896) != 256) {
                z2 = false;
            }
            boolean z3 = z2 | zH;
            Object objO2 = nv0Var.O();
            if (z3 || objO2 == obj) {
                objO2 = new bd(list2, ns0Var3, ns0Var4, simpleDateFormat);
                nv0Var.j0(objO2);
            }
            lr.g(24576, 494, null, null, jjVar, null, (ns0) objO2, nv0Var, null, gm0Var2, null, false);
            bq1Var2 = yp1Var;
        } else {
            list2 = list;
            ns0Var3 = ns0Var;
            ns0Var4 = ns0Var2;
            nv0Var.U();
            bq1Var2 = bq1Var;
        }
        xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            ng2Var = new ng2(list2, ns0Var3, ns0Var4, bq1Var2, i2, 3);
            xj2VarT.d = ng2Var;
        }
    }

    public static final void j(vj2 vj2Var, String str, cs0 cs0Var, cs0 cs0Var2, ns0 ns0Var, ns0 ns0Var2, rs0 rs0Var, ns0 ns0Var3, nv0 nv0Var, int i2) {
        int i3;
        cs0 cs0Var3;
        ns0 ns0Var4;
        nv0Var.b0(863630510);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? nv0Var.f(vj2Var) : nv0Var.h(vj2Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= nv0Var.f(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= nv0Var.h(cs0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            cs0Var3 = cs0Var2;
            i3 |= nv0Var.h(cs0Var3) ? 2048 : 1024;
        } else {
            cs0Var3 = cs0Var2;
        }
        if ((i2 & 24576) == 0) {
            i3 |= nv0Var.h(ns0Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= nv0Var.h(ns0Var2) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= nv0Var.h(rs0Var) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            ns0Var4 = ns0Var3;
            i3 |= nv0Var.h(ns0Var4) ? 8388608 : 4194304;
        } else {
            ns0Var4 = ns0Var3;
        }
        int i4 = i3;
        boolean z2 = false;
        if (nv0Var.R(i4 & 1, (4793491 & i4) != 4793490)) {
            String string = y93.G0(str).toString();
            if (s51.n(vj2Var, uj2.a)) {
                z2 = true;
            } else if (!s51.n(vj2Var, tj2.a)) {
                if (!(vj2Var instanceof sj2)) {
                    c.k();
                    return;
                }
                z2 = ((sj2) vj2Var).b;
            }
            t22.f(z2, cs0Var2, j43.c, null, null, null, gq.N(-1639795192, new bz2(vj2Var, cs0Var3, string, cs0Var, ns0Var2, rs0Var, ns0Var4, ns0Var), nv0Var), nv0Var, ((i4 >> 6) & 112) | 1573248);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new pu1(vj2Var, str, cs0Var, cs0Var2, ns0Var, ns0Var2, rs0Var, ns0Var3, i2);
        }
    }

    public static final void k(boolean z2, cs0 cs0Var, nv0 nv0Var, int i2) {
        nv0 nv0Var2;
        nv0Var.b0(-607291034);
        int i3 = 2;
        int i4 = (nv0Var.g(z2) ? 4 : 2) | i2 | (nv0Var.h(cs0Var) ? 32 : 16);
        if (nv0Var.R(i4 & 1, (i4 & 19) != 18)) {
            nv0Var2 = nv0Var;
            gv3.h(j43.c(yp1.a, 1.0f), ((fy) nv0Var.j(hy.a)).c, uo2.a(20.0f), false, gq.N(-1372581225, new mb(i3, cs0Var, z2), nv0Var), nv0Var2, 24582, 8);
        } else {
            nv0Var2 = nv0Var;
            nv0Var2.U();
        }
        xj2 xj2VarT = nv0Var2.t();
        if (xj2VarT != null) {
            xj2VarT.d = new lv(z2, cs0Var, i2, 3);
        }
    }

    public static final void l(kq2 kq2Var, cs0 cs0Var, cs0 cs0Var2, nv0 nv0Var, int i2) {
        cs0Var.getClass();
        cs0Var2.getClass();
        nv0Var.b0(-1727703285);
        int i3 = i2 | (nv0Var.h(kq2Var) ? 4 : 2) | (nv0Var.h(cs0Var) ? 32 : 16) | (nv0Var.h(cs0Var2) ? 256 : 128);
        int i4 = 0;
        if (nv0Var.R(i3 & 1, (i3 & 147) != 146)) {
            rn.a(cs0Var, gq.N(1241089987, new k91(cs0Var2, 6), nv0Var), null, gq.N(1658978689, new k91(cs0Var, 9), nv0Var), null, rn.X, gq.N(138328094, new az2(kq2Var, i4), nv0Var), null, 0L, 0L, 0L, 0L, null, nv0Var, ((i3 >> 3) & 14) | 1772592, 16276);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new w1((Object) kq2Var, (Object) cs0Var, (zs0) cs0Var2, i2, 15);
        }
    }

    public static final void m(hp2 hp2Var, cs0 cs0Var, nv0 nv0Var, int i2) {
        hp2Var.getClass();
        cs0Var.getClass();
        nv0Var.b0(-1102718207);
        int i3 = i2 | (nv0Var.h(hp2Var) ? 4 : 2) | (nv0Var.h(cs0Var) ? 32 : 16);
        if (nv0Var.R(i3 & 1, (i3 & 19) != 18)) {
            vp1.a(cs0Var, null, null, 0.0f, false, null, 0L, 0L, 0L, null, null, null, gq.N(-589669921, new w91(13, hp2Var, cs0Var), nv0Var), nv0Var, (i3 >> 3) & 14);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new nh2(i2, 3, hp2Var, cs0Var);
        }
    }

    public static final void n(List list, boolean z2, String str, cs0 cs0Var, cs0 cs0Var2, cs0 cs0Var3, ns0 ns0Var, ns0 ns0Var2, rs0 rs0Var, ns0 ns0Var3, ns0 ns0Var4, nv0 nv0Var, int i2, int i3) {
        cs0 cs0Var4;
        ns0 ns0Var5;
        ns0 ns0Var6;
        ns0 ns0Var7;
        float f2;
        String str2;
        aq2 aq2Var;
        List list2;
        nv0 nv0Var2 = nv0Var;
        nv0Var2.b0(-1657892289);
        int i4 = (nv0Var2.f(list) ? 4 : 2) | i2 | (nv0Var2.g(z2) ? 32 : 16) | (nv0Var2.f(str) ? 256 : 128) | (nv0Var2.h(cs0Var) ? 2048 : 1024);
        if ((i2 & 24576) == 0) {
            i4 |= nv0Var2.h(cs0Var2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            cs0Var4 = cs0Var3;
            i4 |= nv0Var2.h(cs0Var4) ? 131072 : 65536;
        } else {
            cs0Var4 = cs0Var3;
        }
        if ((1572864 & i2) == 0) {
            ns0Var5 = ns0Var;
            i4 |= nv0Var2.h(ns0Var5) ? 1048576 : 524288;
        } else {
            ns0Var5 = ns0Var;
        }
        if ((12582912 & i2) == 0) {
            ns0Var6 = ns0Var2;
            i4 |= nv0Var2.h(ns0Var6) ? 8388608 : 4194304;
        } else {
            ns0Var6 = ns0Var2;
        }
        if ((100663296 & i2) == 0) {
            i4 |= nv0Var2.h(rs0Var) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            ns0Var7 = ns0Var3;
            i4 |= nv0Var2.h(ns0Var7) ? 536870912 : 268435456;
        } else {
            ns0Var7 = ns0Var3;
        }
        int i5 = i4;
        if (nv0Var2.R(i5 & 1, ((i4 & 306783379) == 306783378 && (((i3 & 6) == 0 ? i3 | (nv0Var2.h(ns0Var4) ? 4 : 2) : i3) & 3) == 2) ? false : true)) {
            float f3 = ((jd0) nv0Var2.j(dn0.a)).f;
            String string = y93.G0(str).toString();
            if (y93.q0(string)) {
                list2 = list;
                f2 = f3;
                str2 = string;
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    float f4 = f3;
                    yv2 yv2Var = (yv2) obj;
                    wy2 wy2Var = yv2Var.b;
                    String str3 = null;
                    vy2 vy2Var = wy2Var instanceof vy2 ? (vy2) wy2Var : null;
                    if (vy2Var != null && (aq2Var = vy2Var.a.a) != null) {
                        str3 = aq2Var.d;
                    }
                    if (str3 == null) {
                        str3 = "";
                    }
                    String str4 = str3;
                    if (y93.h0(yv2Var.a.a.c, string, true) || y93.h0(str4, string, true)) {
                        arrayList.add(obj);
                    }
                    f3 = f4;
                }
                f2 = f3;
                str2 = string;
                list2 = arrayList;
            }
            gm0 gm0Var = j43.c;
            cn1 cn1VarD = eo.d(f5.g, false);
            int iHashCode = Long.hashCode(nv0Var2.T);
            n52 n52VarL = nv0Var2.l();
            bq1 bq1VarM = lr.M(nv0Var2, gm0Var);
            w10.c.getClass();
            nv0Var2.d0();
            List list3 = list2;
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
            d00 d00VarN = gq.N(-1554676385, new aa1(list3, str2, cs0Var2, cs0Var, ns0Var5, ns0Var6, rs0Var, ns0Var7, ns0Var4), nv0Var2);
            int i6 = i5 >> 12;
            t22.f(z2, cs0Var4, gm0Var, null, null, null, d00VarN, nv0Var2, ((i5 >> 3) & 14) | 1573248 | (i6 & 112));
            nv0Var2 = nv0Var;
            br.f(cs0Var2, N(jo.a.a(yp1.a, f5.o), 0.0f, 0.0f, 24.0f, 24.0f + f2, 3), yh1.e(nv0Var), 0L, rn.H, nv0Var2, (i6 & 14) | 24576);
            nv0Var2.p(true);
        } else {
            nv0Var2.U();
        }
        xj2 xj2VarT = nv0Var2.t();
        if (xj2VarT != null) {
            xj2VarT.d = new gd1(list, z2, str, cs0Var, cs0Var2, cs0Var3, ns0Var, ns0Var2, rs0Var, ns0Var3, ns0Var4, i2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void o(final yv2 yv2Var, final ns0 ns0Var, final ns0 ns0Var2, final rs0 rs0Var, final ns0 ns0Var3, final ns0 ns0Var4, final cs0 cs0Var, final boolean z2, nv0 nv0Var, final int i2) {
        String str;
        Object objO;
        aq2 aq2Var;
        String str2;
        nv0Var.b0(-935581866);
        int i3 = (nv0Var.h(yv2Var) ? 4 : 2) | i2 | (nv0Var.h(ns0Var) ? 32 : 16);
        if ((i2 & 384) == 0) {
            i3 |= nv0Var.h(ns0Var2) ? 256 : 128;
        }
        int i4 = i3 | (nv0Var.h(rs0Var) ? 2048 : 1024) | (nv0Var.h(ns0Var3) ? 16384 : 8192);
        if ((196608 & i2) == 0) {
            i4 |= nv0Var.h(ns0Var4) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= nv0Var.h(cs0Var) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i4 |= nv0Var.g(z2) ? 8388608 : 4194304;
        }
        if (nv0Var.R(i4 & 1, (4793491 & i4) != 4793490)) {
            final kq2 kq2Var = yv2Var.a;
            wy2 wy2Var = yv2Var.b;
            vy2 vy2Var = wy2Var instanceof vy2 ? (vy2) wy2Var : null;
            if (vy2Var == null || (aq2Var = vy2Var.a.a) == null || (str2 = aq2Var.d) == null) {
                str = kq2Var.a.c;
                final String str3 = str;
                objO = nv0Var.O();
                if (objO == c20.a) {
                    objO = b32.w(Boolean.FALSE);
                    nv0Var.j0(objO);
                }
                final os1 os1Var = (os1) objO;
                final vy2 vy2Var2 = vy2Var;
                gv3.h(j43.c(yp1.a, 1.0f), 0L, uo2.a(20.0f), false, gq.N(1447670087, new ss0() { // from class: ez2
                    @Override // defpackage.ss0
                    public final Object e(Object obj, Object obj2, Object obj3) {
                        x91 x91Var;
                        yp1 yp1Var;
                        zj zjVar;
                        z00 z00Var;
                        z00 z00Var2;
                        z00 z00Var3;
                        x91 x91Var2;
                        z00 z00Var4;
                        yv2 yv2Var2;
                        float f2;
                        boolean z3;
                        nv0 nv0Var2 = (nv0) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((ry) obj).getClass();
                        if (nv0Var2.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                            yp1 yp1Var2 = yp1.a;
                            bq1 bq1VarJ = f80.J(yp1Var2, 16.0f);
                            jj jjVar = new jj(8.0f, true, new c(1));
                            tm tmVar = f5.s;
                            qy qyVarA = oy.a(jjVar, tmVar, nv0Var2, 6);
                            int iHashCode = Long.hashCode(nv0Var2.T);
                            n52 n52VarL = nv0Var2.l();
                            bq1 bq1VarM = lr.M(nv0Var2, bq1VarJ);
                            w10.c.getClass();
                            nv0Var2.d0();
                            boolean z4 = nv0Var2.S;
                            x91 x91Var3 = tb1.Y;
                            if (z4) {
                                nv0Var2.k(x91Var3);
                            } else {
                                nv0Var2.m0();
                            }
                            z00 z00Var5 = f5.E;
                            y02.F(z00Var5, nv0Var2, qyVarA);
                            z00 z00Var6 = f5.D;
                            y02.F(z00Var6, nv0Var2, n52VarL);
                            Integer numValueOf = Integer.valueOf(iHashCode);
                            z00 z00Var7 = f5.F;
                            y02.F(z00Var7, nv0Var2, numValueOf);
                            y02.C(nv0Var2);
                            z00 z00Var8 = f5.C;
                            y02.F(z00Var8, nv0Var2, bq1VarM);
                            um umVar = f5.q;
                            dp2 dp2VarA = cp2.a(new jj(12.0f, true, new c(1)), umVar, nv0Var2, 54);
                            int iHashCode2 = Long.hashCode(nv0Var2.T);
                            n52 n52VarL2 = nv0Var2.l();
                            bq1 bq1VarM2 = lr.M(nv0Var2, yp1Var2);
                            nv0Var2.d0();
                            if (nv0Var2.S) {
                                nv0Var2.k(x91Var3);
                            } else {
                                nv0Var2.m0();
                            }
                            y02.F(z00Var5, nv0Var2, dp2VarA);
                            y02.F(z00Var6, nv0Var2, n52VarL2);
                            nc2.r(iHashCode2, nv0Var2, z00Var7, nv0Var2);
                            y02.F(z00Var8, nv0Var2, bq1VarM2);
                            yv2 yv2Var3 = yv2Var;
                            f80.u(yv2Var3.b, nv0Var2, 0);
                            jc1 jc1Var = new jc1(1.0f, true);
                            qy qyVarA2 = oy.a(n92.d, tmVar, nv0Var2, 0);
                            int iHashCode3 = Long.hashCode(nv0Var2.T);
                            n52 n52VarL3 = nv0Var2.l();
                            bq1 bq1VarM3 = lr.M(nv0Var2, jc1Var);
                            nv0Var2.d0();
                            if (nv0Var2.S) {
                                nv0Var2.k(x91Var3);
                            } else {
                                nv0Var2.m0();
                            }
                            y02.F(z00Var5, nv0Var2, qyVarA2);
                            y02.F(z00Var6, nv0Var2, n52VarL3);
                            nc2.r(iHashCode3, nv0Var2, z00Var7, nv0Var2);
                            y02.F(z00Var8, nv0Var2, bq1VarM3);
                            r93 r93Var = ql3.a;
                            mg3.b(str3, null, 0L, 0L, xq0.j, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var2.j(r93Var)).h, nv0Var2, 1572864, 0, 131006);
                            kq2 kq2Var2 = kq2Var;
                            mg3.b(kq2Var2.a.c, null, ((fy) nv0Var2.j(hy.a)).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var2.j(r93Var)).l, nv0Var2, 0, 0, 131066);
                            int i5 = 1;
                            nv0Var2.p(true);
                            nv0Var2.p(true);
                            f80.s(yv2Var3.b, nv0Var2, 0);
                            bq1 bq1VarC = j43.c(yp1Var2, 1.0f);
                            dp2 dp2VarA2 = cp2.a(new jj(8.0f, true, new c(1)), umVar, nv0Var2, 54);
                            int iHashCode4 = Long.hashCode(nv0Var2.T);
                            n52 n52VarL4 = nv0Var2.l();
                            bq1 bq1VarM4 = lr.M(nv0Var2, bq1VarC);
                            nv0Var2.d0();
                            if (nv0Var2.S) {
                                x91Var = x91Var3;
                                nv0Var2.k(x91Var);
                            } else {
                                x91Var = x91Var3;
                                nv0Var2.m0();
                            }
                            y02.F(z00Var5, nv0Var2, dp2VarA2);
                            y02.F(z00Var6, nv0Var2, n52VarL4);
                            nc2.r(iHashCode4, nv0Var2, z00Var7, nv0Var2);
                            y02.F(z00Var8, nv0Var2, bq1VarM4);
                            cs0 cs0Var2 = cs0Var;
                            zj zjVar2 = c20.a;
                            if (cs0Var2 != null) {
                                nv0Var2.a0(1947878687);
                                boolean z5 = z2;
                                boolean z6 = !z5;
                                d00 d00VarN = gq.N(-335914875, new en2(i5, z5), nv0Var2);
                                yv2Var2 = yv2Var3;
                                zjVar = zjVar2;
                                z00Var = z00Var6;
                                x91Var2 = x91Var;
                                f2 = 1.0f;
                                z00Var4 = z00Var5;
                                z00Var3 = z00Var7;
                                z00Var2 = z00Var8;
                                yp1Var = yp1Var2;
                                gq.d(cs0Var2, null, z6, null, null, null, null, d00VarN, nv0Var2, 805306368, 506);
                                z3 = false;
                                nv0Var2.p(false);
                            } else {
                                yp1Var = yp1Var2;
                                zjVar = zjVar2;
                                z00Var = z00Var6;
                                z00Var2 = z00Var8;
                                z00Var3 = z00Var7;
                                x91Var2 = x91Var;
                                z00Var4 = z00Var5;
                                yv2Var2 = yv2Var3;
                                f2 = 1.0f;
                                ns0 ns0Var5 = ns0Var4;
                                if (ns0Var5 != null) {
                                    nv0Var2.a0(1948485853);
                                    boolean zF = nv0Var2.f(ns0Var5) | nv0Var2.h(kq2Var2);
                                    Object objO2 = nv0Var2.O();
                                    if (zF || objO2 == zjVar) {
                                        objO2 = new me1(16, ns0Var5, kq2Var2);
                                        nv0Var2.j0(objO2);
                                    }
                                    gq.d((cs0) objO2, null, false, null, null, null, null, rn.J, nv0Var2, 805306368, 510);
                                    z3 = false;
                                    nv0Var2.p(false);
                                } else {
                                    z3 = false;
                                    nv0Var2.a0(1948959626);
                                    nv0Var2.p(false);
                                }
                            }
                            oz2.g(nv0Var2, new jc1(f2, true));
                            cn1 cn1VarD = eo.d(f5.g, z3);
                            int iHashCode5 = Long.hashCode(nv0Var2.T);
                            n52 n52VarL5 = nv0Var2.l();
                            bq1 bq1VarM5 = lr.M(nv0Var2, yp1Var);
                            nv0Var2.d0();
                            if (nv0Var2.S) {
                                nv0Var2.k(x91Var2);
                            } else {
                                nv0Var2.m0();
                            }
                            y02.F(z00Var4, nv0Var2, cn1VarD);
                            y02.F(z00Var, nv0Var2, n52VarL5);
                            nc2.r(iHashCode5, nv0Var2, z00Var3, nv0Var2);
                            y02.F(z00Var2, nv0Var2, bq1VarM5);
                            Object objO3 = nv0Var2.O();
                            os1 os1Var2 = os1Var;
                            if (objO3 == zjVar) {
                                objO3 = new mh2(os1Var2, 23);
                                nv0Var2.j0(objO3);
                            }
                            gv3.f((cs0) objO3, null, false, null, null, rn.K, nv0Var2, 1572870, 62);
                            boolean zBooleanValue = ((Boolean) os1Var2.getValue()).booleanValue();
                            Object objO4 = nv0Var2.O();
                            if (objO4 == zjVar) {
                                objO4 = new mh2(os1Var2, 24);
                                nv0Var2.j0(objO4);
                            }
                            u9.a(zBooleanValue, (cs0) objO4, null, 0L, null, null, null, 0L, 0.0f, gq.N(-838391485, new bz2(vy2Var2, ns0Var3, kq2Var2, rs0Var, ns0Var, yv2Var2, ns0Var2, os1Var2), nv0Var2), nv0Var2, 48);
                            nv0Var2.p(true);
                            nv0Var2.p(true);
                            nv0Var2.p(true);
                        } else {
                            nv0Var2.U();
                        }
                        return dm3.a;
                    }
                }, nv0Var), nv0Var, 27654, 2);
            } else {
                str = y93.q0(str2) ? null : str2;
                if (str == null) {
                }
                final String str32 = str;
                objO = nv0Var.O();
                if (objO == c20.a) {
                }
                final os1 os1Var2 = (os1) objO;
                final vy2 vy2Var22 = vy2Var;
                gv3.h(j43.c(yp1.a, 1.0f), 0L, uo2.a(20.0f), false, gq.N(1447670087, new ss0() { // from class: ez2
                    @Override // defpackage.ss0
                    public final Object e(Object obj, Object obj2, Object obj3) {
                        x91 x91Var;
                        yp1 yp1Var;
                        zj zjVar;
                        z00 z00Var;
                        z00 z00Var2;
                        z00 z00Var3;
                        x91 x91Var2;
                        z00 z00Var4;
                        yv2 yv2Var2;
                        float f2;
                        boolean z3;
                        nv0 nv0Var2 = (nv0) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((ry) obj).getClass();
                        if (nv0Var2.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                            yp1 yp1Var2 = yp1.a;
                            bq1 bq1VarJ = f80.J(yp1Var2, 16.0f);
                            jj jjVar = new jj(8.0f, true, new c(1));
                            tm tmVar = f5.s;
                            qy qyVarA = oy.a(jjVar, tmVar, nv0Var2, 6);
                            int iHashCode = Long.hashCode(nv0Var2.T);
                            n52 n52VarL = nv0Var2.l();
                            bq1 bq1VarM = lr.M(nv0Var2, bq1VarJ);
                            w10.c.getClass();
                            nv0Var2.d0();
                            boolean z4 = nv0Var2.S;
                            x91 x91Var3 = tb1.Y;
                            if (z4) {
                                nv0Var2.k(x91Var3);
                            } else {
                                nv0Var2.m0();
                            }
                            z00 z00Var5 = f5.E;
                            y02.F(z00Var5, nv0Var2, qyVarA);
                            z00 z00Var6 = f5.D;
                            y02.F(z00Var6, nv0Var2, n52VarL);
                            Integer numValueOf = Integer.valueOf(iHashCode);
                            z00 z00Var7 = f5.F;
                            y02.F(z00Var7, nv0Var2, numValueOf);
                            y02.C(nv0Var2);
                            z00 z00Var8 = f5.C;
                            y02.F(z00Var8, nv0Var2, bq1VarM);
                            um umVar = f5.q;
                            dp2 dp2VarA = cp2.a(new jj(12.0f, true, new c(1)), umVar, nv0Var2, 54);
                            int iHashCode2 = Long.hashCode(nv0Var2.T);
                            n52 n52VarL2 = nv0Var2.l();
                            bq1 bq1VarM2 = lr.M(nv0Var2, yp1Var2);
                            nv0Var2.d0();
                            if (nv0Var2.S) {
                                nv0Var2.k(x91Var3);
                            } else {
                                nv0Var2.m0();
                            }
                            y02.F(z00Var5, nv0Var2, dp2VarA);
                            y02.F(z00Var6, nv0Var2, n52VarL2);
                            nc2.r(iHashCode2, nv0Var2, z00Var7, nv0Var2);
                            y02.F(z00Var8, nv0Var2, bq1VarM2);
                            yv2 yv2Var3 = yv2Var;
                            f80.u(yv2Var3.b, nv0Var2, 0);
                            jc1 jc1Var = new jc1(1.0f, true);
                            qy qyVarA2 = oy.a(n92.d, tmVar, nv0Var2, 0);
                            int iHashCode3 = Long.hashCode(nv0Var2.T);
                            n52 n52VarL3 = nv0Var2.l();
                            bq1 bq1VarM3 = lr.M(nv0Var2, jc1Var);
                            nv0Var2.d0();
                            if (nv0Var2.S) {
                                nv0Var2.k(x91Var3);
                            } else {
                                nv0Var2.m0();
                            }
                            y02.F(z00Var5, nv0Var2, qyVarA2);
                            y02.F(z00Var6, nv0Var2, n52VarL3);
                            nc2.r(iHashCode3, nv0Var2, z00Var7, nv0Var2);
                            y02.F(z00Var8, nv0Var2, bq1VarM3);
                            r93 r93Var = ql3.a;
                            mg3.b(str32, null, 0L, 0L, xq0.j, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var2.j(r93Var)).h, nv0Var2, 1572864, 0, 131006);
                            kq2 kq2Var2 = kq2Var;
                            mg3.b(kq2Var2.a.c, null, ((fy) nv0Var2.j(hy.a)).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var2.j(r93Var)).l, nv0Var2, 0, 0, 131066);
                            int i5 = 1;
                            nv0Var2.p(true);
                            nv0Var2.p(true);
                            f80.s(yv2Var3.b, nv0Var2, 0);
                            bq1 bq1VarC = j43.c(yp1Var2, 1.0f);
                            dp2 dp2VarA2 = cp2.a(new jj(8.0f, true, new c(1)), umVar, nv0Var2, 54);
                            int iHashCode4 = Long.hashCode(nv0Var2.T);
                            n52 n52VarL4 = nv0Var2.l();
                            bq1 bq1VarM4 = lr.M(nv0Var2, bq1VarC);
                            nv0Var2.d0();
                            if (nv0Var2.S) {
                                x91Var = x91Var3;
                                nv0Var2.k(x91Var);
                            } else {
                                x91Var = x91Var3;
                                nv0Var2.m0();
                            }
                            y02.F(z00Var5, nv0Var2, dp2VarA2);
                            y02.F(z00Var6, nv0Var2, n52VarL4);
                            nc2.r(iHashCode4, nv0Var2, z00Var7, nv0Var2);
                            y02.F(z00Var8, nv0Var2, bq1VarM4);
                            cs0 cs0Var2 = cs0Var;
                            zj zjVar2 = c20.a;
                            if (cs0Var2 != null) {
                                nv0Var2.a0(1947878687);
                                boolean z5 = z2;
                                boolean z6 = !z5;
                                d00 d00VarN = gq.N(-335914875, new en2(i5, z5), nv0Var2);
                                yv2Var2 = yv2Var3;
                                zjVar = zjVar2;
                                z00Var = z00Var6;
                                x91Var2 = x91Var;
                                f2 = 1.0f;
                                z00Var4 = z00Var5;
                                z00Var3 = z00Var7;
                                z00Var2 = z00Var8;
                                yp1Var = yp1Var2;
                                gq.d(cs0Var2, null, z6, null, null, null, null, d00VarN, nv0Var2, 805306368, 506);
                                z3 = false;
                                nv0Var2.p(false);
                            } else {
                                yp1Var = yp1Var2;
                                zjVar = zjVar2;
                                z00Var = z00Var6;
                                z00Var2 = z00Var8;
                                z00Var3 = z00Var7;
                                x91Var2 = x91Var;
                                z00Var4 = z00Var5;
                                yv2Var2 = yv2Var3;
                                f2 = 1.0f;
                                ns0 ns0Var5 = ns0Var4;
                                if (ns0Var5 != null) {
                                    nv0Var2.a0(1948485853);
                                    boolean zF = nv0Var2.f(ns0Var5) | nv0Var2.h(kq2Var2);
                                    Object objO2 = nv0Var2.O();
                                    if (zF || objO2 == zjVar) {
                                        objO2 = new me1(16, ns0Var5, kq2Var2);
                                        nv0Var2.j0(objO2);
                                    }
                                    gq.d((cs0) objO2, null, false, null, null, null, null, rn.J, nv0Var2, 805306368, 510);
                                    z3 = false;
                                    nv0Var2.p(false);
                                } else {
                                    z3 = false;
                                    nv0Var2.a0(1948959626);
                                    nv0Var2.p(false);
                                }
                            }
                            oz2.g(nv0Var2, new jc1(f2, true));
                            cn1 cn1VarD = eo.d(f5.g, z3);
                            int iHashCode5 = Long.hashCode(nv0Var2.T);
                            n52 n52VarL5 = nv0Var2.l();
                            bq1 bq1VarM5 = lr.M(nv0Var2, yp1Var);
                            nv0Var2.d0();
                            if (nv0Var2.S) {
                                nv0Var2.k(x91Var2);
                            } else {
                                nv0Var2.m0();
                            }
                            y02.F(z00Var4, nv0Var2, cn1VarD);
                            y02.F(z00Var, nv0Var2, n52VarL5);
                            nc2.r(iHashCode5, nv0Var2, z00Var3, nv0Var2);
                            y02.F(z00Var2, nv0Var2, bq1VarM5);
                            Object objO3 = nv0Var2.O();
                            os1 os1Var22 = os1Var2;
                            if (objO3 == zjVar) {
                                objO3 = new mh2(os1Var22, 23);
                                nv0Var2.j0(objO3);
                            }
                            gv3.f((cs0) objO3, null, false, null, null, rn.K, nv0Var2, 1572870, 62);
                            boolean zBooleanValue = ((Boolean) os1Var22.getValue()).booleanValue();
                            Object objO4 = nv0Var2.O();
                            if (objO4 == zjVar) {
                                objO4 = new mh2(os1Var22, 24);
                                nv0Var2.j0(objO4);
                            }
                            u9.a(zBooleanValue, (cs0) objO4, null, 0L, null, null, null, 0L, 0.0f, gq.N(-838391485, new bz2(vy2Var22, ns0Var3, kq2Var2, rs0Var, ns0Var, yv2Var2, ns0Var2, os1Var22), nv0Var2), nv0Var2, 48);
                            nv0Var2.p(true);
                            nv0Var2.p(true);
                            nv0Var2.p(true);
                        } else {
                            nv0Var2.U();
                        }
                        return dm3.a;
                    }
                }, nv0Var), nv0Var, 27654, 2);
            }
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new rs0() { // from class: fz2
                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    f80.o(yv2Var, ns0Var, ns0Var2, rs0Var, ns0Var3, ns0Var4, cs0Var, z2, (nv0) obj, jo3.y(i2 | 1));
                    return dm3.a;
                }
            };
        }
    }

    public static final void p(os1 os1Var, boolean z2) {
        os1Var.setValue(Boolean.valueOf(z2));
    }

    public static final void q(String str, w01 w01Var, nv0 nv0Var, int i2, int i3) {
        w01 w01Var2;
        int i4;
        nv0Var.b0(-1973840561);
        int i5 = 4;
        int i6 = (nv0Var.f(str) ? 4 : 2) | i2;
        int i7 = i3 & 2;
        if (i7 != 0) {
            i4 = i6 | 48;
            w01Var2 = w01Var;
        } else {
            w01Var2 = w01Var;
            i4 = i6 | (nv0Var.f(w01Var2) ? 32 : 16);
        }
        if (nv0Var.R(i4 & 1, (i4 & 19) != 18)) {
            w01 w01Var3 = i7 != 0 ? null : w01Var2;
            to2 to2Var = uo2.a;
            k52 k52Var = new k52(50.0f);
            to2 to2Var2 = new to2(k52Var, k52Var, k52Var, k52Var);
            r93 r93Var = hy.a;
            hb3.a(null, to2Var2, ((fy) nv0Var.j(r93Var)).G, ((fy) nv0Var.j(r93Var)).s, 0.0f, 0.0f, null, gq.N(360095060, new nh2(i5, w01Var3, str), nv0Var), nv0Var, 12582912, 113);
            w01Var2 = w01Var3;
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new xc(i2, i3, w01Var2, str);
        }
    }

    public static final void r(vy2 vy2Var, nv0 nv0Var, int i2) {
        nv0Var.b0(-903911671);
        int i3 = (nv0Var.h(vy2Var) ? 4 : 2) | i2;
        if (nv0Var.R(i3 & 1, (i3 & 3) != 2)) {
            bq2 bq2Var = vy2Var.a;
            aq2 aq2Var = bq2Var.a;
            Long l2 = bq2Var.c;
            String str = (String) bq2Var.b.get("mapname");
            if (str == null) {
                str = "";
            }
            String str2 = str;
            gq.f(null, new jj(8.0f, true, new c(1)), new jj(4.0f, true, new c(1)), null, 0, 0, gq.N(-594989458, new w91(15, aq2Var, l2), nv0Var), nv0Var, 1573296, 57);
            String str3 = aq2Var.e;
            if (y93.q0(str3)) {
                str3 = null;
            }
            String str4 = !y93.q0(str2) ? str2 : null;
            String str5 = aq2Var.f;
            ArrayList arrayListR = uj.R(new String[]{str3, str4, y93.q0(str5) ? null : str5});
            if (arrayListR.isEmpty()) {
                nv0Var.a0(1013817369);
                nv0Var.p(false);
            } else {
                nv0Var.a0(1013516576);
                oz2.g(nv0Var, j43.e(yp1.a, 8.0f));
                gq.f(null, new jj(6.0f, true, new c(1)), new jj(4.0f, true, new c(1)), null, 0, 0, gq.N(414922121, new ir(13, arrayListR), nv0Var), nv0Var, 1573296, 57);
                nv0Var.p(false);
            }
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new pt2(i2, 2, vy2Var);
        }
    }

    public static final void s(wy2 wy2Var, nv0 nv0Var, int i2) {
        wy2 wy2Var2;
        int i3;
        nv0 nv0Var2 = nv0Var;
        nv0Var2.b0(697438239);
        int i4 = i2 | (nv0Var2.f(wy2Var) ? 4 : 2);
        if (nv0Var2.R(i4 & 1, (i4 & 3) != 2)) {
            if (wy2Var.equals(sy2.a)) {
                nv0Var2.a0(-1669079562);
                i3 = 0;
                mg3.b(oz2.M(R.string.launcher_value_checking, nv0Var2), null, ((fy) nv0Var2.j(hy.a)).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var2.j(ql3.a)).k, nv0Var, 0, 0, 131066);
                nv0Var2 = nv0Var;
                nv0Var2.p(false);
            } else {
                i3 = 0;
                if (wy2Var.equals(ty2.a)) {
                    nv0Var2.a0(-1668833453);
                    mg3.b(oz2.M(R.string.launcher_value_not_checked, nv0Var2), null, ((fy) nv0Var2.j(hy.a)).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var2.j(ql3.a)).k, nv0Var, 0, 0, 131066);
                    nv0Var2 = nv0Var;
                    nv0Var2.p(false);
                } else {
                    wy2Var2 = wy2Var;
                    if (wy2Var2.equals(uy2.a)) {
                        nv0Var2.a0(-1668587902);
                        mg3.b(oz2.M(R.string.launcher_value_offline, nv0Var2), null, ((fy) nv0Var2.j(hy.a)).w, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var2.j(ql3.a)).k, nv0Var, 0, 0, 131066);
                        nv0Var2 = nv0Var;
                        nv0Var2.p(false);
                    } else {
                        if (!(wy2Var2 instanceof vy2)) {
                            throw by1.d(nv0Var2, 223252211, false);
                        }
                        nv0Var2.a0(223276602);
                        r((vy2) wy2Var2, nv0Var2, (i4 & 14) | 8);
                        nv0Var2.p(false);
                    }
                }
            }
            wy2Var2 = wy2Var;
        } else {
            wy2Var2 = wy2Var;
            i3 = 0;
            nv0Var2.U();
        }
        xj2 xj2VarT = nv0Var2.t();
        if (xj2VarT != null) {
            xj2VarT.d = new gz2(wy2Var2, i2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(final List list, final boolean z2, final vj2 vj2Var, final cs0 cs0Var, final cs0 cs0Var2, final cs0 cs0Var3, final cs0 cs0Var4, final ns0 ns0Var, final ns0 ns0Var2, final ns0 ns0Var3, final rs0 rs0Var, final ns0 ns0Var4, final ns0 ns0Var5, nv0 nv0Var, final int i2) {
        Object rwVar;
        os1 os1Var;
        yp1 yp1Var;
        zj zjVar;
        boolean zF;
        Object objO;
        int i3;
        os1 os1Var2;
        boolean z3;
        d00 d00VarN;
        boolean zH;
        Object objO2;
        boolean zF2;
        Object objO3;
        int iOrdinal;
        nv0 nv0Var2 = nv0Var;
        list.getClass();
        vj2Var.getClass();
        cs0Var.getClass();
        cs0Var2.getClass();
        cs0Var3.getClass();
        cs0Var4.getClass();
        ns0Var.getClass();
        ns0Var2.getClass();
        ns0Var3.getClass();
        rs0Var.getClass();
        ns0Var4.getClass();
        ns0Var5.getClass();
        nv0Var2.b0(-1600073837);
        int i4 = i2 | (nv0Var2.f(list) ? 4 : 2) | (nv0Var2.g(z2) ? 32 : 16) | (nv0Var2.f(vj2Var) ? 256 : 128) | (nv0Var2.h(cs0Var) ? 2048 : 1024) | (nv0Var2.h(cs0Var2) ? 16384 : 8192) | (nv0Var2.h(cs0Var3) ? 131072 : 65536) | (nv0Var2.h(cs0Var4) ? 1048576 : 524288) | (nv0Var2.h(ns0Var) ? 8388608 : 4194304) | (nv0Var2.h(ns0Var2) ? 67108864 : 33554432) | (nv0Var2.h(ns0Var3) ? 536870912 : 268435456);
        int i5 = (nv0Var2.h(rs0Var) ? 4 : 2) | (nv0Var2.h(ns0Var4) ? 32 : 16) | (nv0Var2.h(ns0Var5) ? 256 : 128);
        if (nv0Var2.R(i4 & 1, ((i4 & 306783379) == 306783378 && (i5 & 147) == 146) ? false : true)) {
            Object[] objArr = new Object[0];
            Object objO4 = nv0Var2.O();
            zj zjVar2 = c20.a;
            if (objO4 == zjVar2) {
                objO4 = new f62(13);
                nv0Var2.j0(objO4);
            }
            os1 os1Var3 = (os1) oz2.G(objArr, (cs0) objO4, nv0Var2);
            Object[] objArr2 = new Object[0];
            Object objO5 = nv0Var2.O();
            int i6 = 14;
            if (objO5 == zjVar2) {
                objO5 = new f62(i6);
                nv0Var2.j0(objO5);
            }
            os1 os1Var4 = (os1) oz2.G(objArr2, (cs0) objO5, nv0Var2);
            bp0 bp0Var = (bp0) nv0Var2.j(s20.i);
            jz2 jz2Var = (jz2) os1Var3.getValue();
            boolean zH2 = nv0Var2.h(bp0Var) | nv0Var2.f(os1Var3) | ((i4 & 458752) == 131072);
            Object objO6 = nv0Var2.O();
            p40 p40Var = null;
            if (zH2 || objO6 == zjVar2) {
                rwVar = new rw(bp0Var, cs0Var3, os1Var3, p40Var, 10);
                os1Var = os1Var3;
                nv0Var2.j0(rwVar);
            } else {
                rwVar = objO6;
                os1Var = os1Var3;
            }
            rn.l((rs0) rwVar, nv0Var2, jz2Var);
            gm0 gm0Var = j43.c;
            qy qyVarA = oy.a(n92.d, f5.s, nv0Var2, 0);
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
            y02.F(z00Var, nv0Var2, qyVarA);
            z00 z00Var2 = f5.D;
            y02.F(z00Var2, nv0Var2, n52VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z00 z00Var3 = f5.F;
            y02.F(z00Var3, nv0Var2, numValueOf);
            y02.C(nv0Var2);
            z00 z00Var4 = f5.C;
            y02.F(z00Var4, nv0Var2, bq1VarM);
            yp1 yp1Var2 = yp1.a;
            bq1 bq1VarM2 = M(yp1Var2, 24.0f, 24.0f, 24.0f, 12.0f);
            vm vmVar = f5.g;
            cn1 cn1VarD = eo.d(vmVar, false);
            int iHashCode2 = Long.hashCode(nv0Var2.T);
            n52 n52VarL2 = nv0Var2.l();
            bq1 bq1VarM3 = lr.M(nv0Var2, bq1VarM2);
            nv0Var2.d0();
            if (nv0Var2.S) {
                nv0Var2.k(x91Var);
            } else {
                nv0Var2.m0();
            }
            y02.F(z00Var, nv0Var2, cn1VarD);
            y02.F(z00Var2, nv0Var2, n52VarL2);
            nc2.r(iHashCode2, nv0Var2, z00Var3, nv0Var2);
            y02.F(z00Var4, nv0Var2, bq1VarM3);
            gv3.j(oz2.M(R.string.launcher_tab_servers, nv0Var2), nv0Var2, 0);
            nv0Var2.p(true);
            bq1 bq1VarK = K(j43.c(yp1Var2, 1.0f), 24.0f, 8.0f);
            gl glVarE = yh1.e(nv0Var2);
            int iA = jz2.i.a();
            boolean zF3 = nv0Var2.f(os1Var);
            Object objO7 = nv0Var2.O();
            if (zF3) {
                yp1Var = yp1Var2;
                zjVar = zjVar2;
            } else {
                yp1Var = yp1Var2;
                zjVar = zjVar2;
                if (objO7 == zjVar) {
                }
                cs0 cs0Var5 = (cs0) objO7;
                zF = nv0Var2.f(os1Var);
                objO = nv0Var2.O();
                if (!zF || objO == zjVar) {
                    objO = new zb(os1Var, 23);
                    nv0Var2.j0(objO);
                }
                zj zjVar3 = zjVar;
                yp1 yp1Var3 = yp1Var;
                i3 = 3;
                fh1.b(cs0Var5, (ns0) objO, glVarE, iA, bq1VarK, gq.N(-1929216088, new y71(os1Var, 3), nv0Var2), nv0Var2, 221184);
                String str = (String) os1Var4.getValue();
                if (((String) os1Var4.getValue()).length() <= 0) {
                    nv0Var2.a0(914808273);
                    os1Var2 = os1Var4;
                    d00VarN = gq.N(-1805458050, new l8(os1Var2, 14), nv0Var2);
                    z3 = false;
                    nv0Var2.p(false);
                } else {
                    os1Var2 = os1Var4;
                    z3 = false;
                    nv0Var2.a0(915161301);
                    nv0Var2.p(false);
                    d00VarN = null;
                }
                o71 o71Var = new o71(1, 3, 115);
                zH = nv0Var2.h(bp0Var);
                objO2 = nv0Var2.O();
                if (!zH || objO2 == zjVar3) {
                    objO2 = new aw2(i3, bp0Var);
                    nv0Var2.j0(objO2);
                }
                n71 n71Var = new n71((ns0) objO2, null, 47);
                bq1 bq1VarK2 = K(j43.c(yp1Var3, 1.0f), 24.0f, 4.0f);
                zF2 = nv0Var2.f(os1Var2);
                objO3 = nv0Var2.O();
                if (!zF2 || objO3 == zjVar3) {
                    objO3 = new zb(os1Var2, 24);
                    nv0Var2.j0(objO3);
                }
                os1 os1Var5 = os1Var2;
                os1 os1Var6 = os1Var;
                g12.m(str, (ns0) objO3, bq1VarK2, false, false, null, rn.F, null, rn.G, d00VarN, null, false, null, o71Var, n71Var, true, 0, 0, null, null, nv0Var, 102236544, 12779520, 8158392);
                jc1 jc1Var = new jc1(1.0f, true);
                cn1 cn1VarD2 = eo.d(vmVar, false);
                int iHashCode3 = Long.hashCode(nv0Var.T);
                n52 n52VarL3 = nv0Var.l();
                bq1 bq1VarM4 = lr.M(nv0Var, jc1Var);
                nv0Var.d0();
                if (nv0Var.S) {
                    nv0Var.m0();
                } else {
                    nv0Var.k(x91Var);
                }
                y02.F(z00Var, nv0Var, cn1VarD2);
                y02.F(z00Var2, nv0Var, n52VarL3);
                nc2.r(iHashCode3, nv0Var, z00Var3, nv0Var);
                y02.F(z00Var4, nv0Var, bq1VarM4);
                iOrdinal = ((jz2) os1Var6.getValue()).ordinal();
                if (iOrdinal != 0) {
                    nv0Var.a0(675215816);
                    String str2 = (String) os1Var5.getValue();
                    boolean zF4 = nv0Var.f(os1Var5);
                    Object objO8 = nv0Var.O();
                    if (zF4 || objO8 == zjVar3) {
                        objO8 = new mh2(os1Var5, 20);
                        nv0Var.j0(objO8);
                    }
                    int i7 = i4 << 3;
                    int i8 = i4 >> 6;
                    int i9 = i5 << 24;
                    n(list, z2, str2, (cs0) objO8, cs0Var, cs0Var2, ns0Var2, ns0Var3, rs0Var, ns0Var4, ns0Var5, nv0Var, (29360128 & i8) | (3670016 & i8) | (57344 & i7) | (i4 & 126) | (i7 & 458752) | (234881024 & i9) | (i9 & 1879048192), (i5 >> 6) & 14);
                    nv0Var2 = nv0Var;
                    nv0Var2.p(false);
                } else {
                    if (iOrdinal != 1) {
                        throw by1.d(nv0Var, 675214604, false);
                    }
                    nv0Var.a0(675236600);
                    String str3 = (String) os1Var5.getValue();
                    boolean zF5 = nv0Var.f(os1Var5);
                    Object objO9 = nv0Var.O();
                    if (zF5 || objO9 == zjVar3) {
                        objO9 = new mh2(os1Var5, 21);
                        nv0Var.j0(objO9);
                    }
                    int i10 = i4 >> 9;
                    int i11 = i5 << 18;
                    j(vj2Var, str3, (cs0) objO9, cs0Var4, ns0Var, ns0Var2, rs0Var, ns0Var4, nv0Var, (3670016 & i11) | (57344 & i10) | ((i4 >> 6) & 14) | (i10 & 7168) | (i10 & 458752) | (29360128 & i11));
                    nv0Var2 = nv0Var;
                    nv0Var2.p(false);
                }
                nv0Var2.p(true);
                nv0Var2.p(true);
            }
            objO7 = new mh2(os1Var, 19);
            nv0Var2.j0(objO7);
            cs0 cs0Var52 = (cs0) objO7;
            zF = nv0Var2.f(os1Var);
            objO = nv0Var2.O();
            if (!zF) {
                objO = new zb(os1Var, 23);
                nv0Var2.j0(objO);
                zj zjVar32 = zjVar;
                yp1 yp1Var32 = yp1Var;
                i3 = 3;
                fh1.b(cs0Var52, (ns0) objO, glVarE, iA, bq1VarK, gq.N(-1929216088, new y71(os1Var, 3), nv0Var2), nv0Var2, 221184);
                String str4 = (String) os1Var4.getValue();
                if (((String) os1Var4.getValue()).length() <= 0) {
                }
                o71 o71Var2 = new o71(1, 3, 115);
                zH = nv0Var2.h(bp0Var);
                objO2 = nv0Var2.O();
                if (!zH) {
                    objO2 = new aw2(i3, bp0Var);
                    nv0Var2.j0(objO2);
                    n71 n71Var2 = new n71((ns0) objO2, null, 47);
                    bq1 bq1VarK22 = K(j43.c(yp1Var32, 1.0f), 24.0f, 4.0f);
                    zF2 = nv0Var2.f(os1Var2);
                    objO3 = nv0Var2.O();
                    if (!zF2) {
                        objO3 = new zb(os1Var2, 24);
                        nv0Var2.j0(objO3);
                        os1 os1Var52 = os1Var2;
                        os1 os1Var62 = os1Var;
                        g12.m(str4, (ns0) objO3, bq1VarK22, false, false, null, rn.F, null, rn.G, d00VarN, null, false, null, o71Var2, n71Var2, true, 0, 0, null, null, nv0Var, 102236544, 12779520, 8158392);
                        jc1 jc1Var2 = new jc1(1.0f, true);
                        cn1 cn1VarD22 = eo.d(vmVar, false);
                        int iHashCode32 = Long.hashCode(nv0Var.T);
                        n52 n52VarL32 = nv0Var.l();
                        bq1 bq1VarM42 = lr.M(nv0Var, jc1Var2);
                        nv0Var.d0();
                        if (nv0Var.S) {
                        }
                        y02.F(z00Var, nv0Var, cn1VarD22);
                        y02.F(z00Var2, nv0Var, n52VarL32);
                        nc2.r(iHashCode32, nv0Var, z00Var3, nv0Var);
                        y02.F(z00Var4, nv0Var, bq1VarM42);
                        iOrdinal = ((jz2) os1Var62.getValue()).ordinal();
                        if (iOrdinal != 0) {
                        }
                        nv0Var2.p(true);
                        nv0Var2.p(true);
                    }
                }
            }
        } else {
            nv0Var2.U();
        }
        xj2 xj2VarT = nv0Var2.t();
        if (xj2VarT != null) {
            xj2VarT.d = new rs0(list, z2, vj2Var, cs0Var, cs0Var2, cs0Var3, cs0Var4, ns0Var, ns0Var2, ns0Var3, rs0Var, ns0Var4, ns0Var5, i2) { // from class: zy2
                public final /* synthetic */ List f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ vj2 h;
                public final /* synthetic */ cs0 i;
                public final /* synthetic */ cs0 j;
                public final /* synthetic */ cs0 k;
                public final /* synthetic */ cs0 l;
                public final /* synthetic */ ns0 m;
                public final /* synthetic */ ns0 n;
                public final /* synthetic */ ns0 o;
                public final /* synthetic */ rs0 p;
                public final /* synthetic */ ns0 q;
                public final /* synthetic */ ns0 r;

                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = jo3.y(1);
                    f80.t(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, (nv0) obj, iY);
                    return dm3.a;
                }
            };
        }
    }

    public static final void u(wy2 wy2Var, nv0 nv0Var, int i2) {
        long j2;
        nv0Var.b0(-161631047);
        int i3 = (nv0Var.f(wy2Var) ? 4 : 2) | i2;
        int i4 = 1;
        if (nv0Var.R(i3 & 1, (i3 & 3) != 2)) {
            if (wy2Var.equals(sy2.a)) {
                nv0Var.a0(-708608927);
                j2 = ((fy) nv0Var.j(hy.a)).j;
                nv0Var.p(false);
            } else if (wy2Var.equals(ty2.a)) {
                nv0Var.a0(-708606457);
                j2 = ((fy) nv0Var.j(hy.a)).B;
                nv0Var.p(false);
            } else if (wy2Var.equals(uy2.a)) {
                nv0Var.a0(-708603906);
                j2 = ((fy) nv0Var.j(hy.a)).w;
                nv0Var.p(false);
            } else {
                if (!(wy2Var instanceof vy2)) {
                    throw by1.d(nv0Var, -708611234, false);
                }
                nv0Var.a0(-708601568);
                j2 = ((fy) nv0Var.j(hy.a)).a;
                nv0Var.p(false);
            }
            eo.a(gv3.v(j43.k(yp1.a, 10.0f), j2, uo2.a), nv0Var, 0);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new gz2(wy2Var, i2, i4);
        }
    }

    public static final boolean v(qu2 qu2Var) {
        cv2 cv2Var = zu2.s;
        is1 is1Var = qu2Var.f;
        Object objG = is1Var.g(cv2Var);
        if (objG == null) {
            objG = null;
        }
        if (s51.n(objG, f5.I)) {
            return false;
        }
        return is1Var.b(pu2.g) || is1Var.b(pu2.h);
    }

    public static final float w(x12 x12Var, bb1 bb1Var) {
        return bb1Var == bb1.f ? x12Var.b(bb1Var) : x12Var.a(bb1Var);
    }

    public static final float x(x12 x12Var, bb1 bb1Var) {
        return bb1Var == bb1.f ? x12Var.a(bb1Var) : x12Var.b(bb1Var);
    }

    public static void y(int i2, int i3, int i4) {
        if (i2 < 0 || i3 > i4) {
            StringBuilder sbL = nc2.l("fromIndex: ", i2, ", toIndex: ", i3, ", size: ");
            sbL.append(i4);
            throw new IndexOutOfBoundsException(sbL.toString());
        }
        if (i2 <= i3) {
            return;
        }
        c.p(nc2.g(i2, i3, "fromIndex: ", " > toIndex: "));
    }

    public static final lq2 z(e60 e60Var) {
        lq2 lq2Var;
        e60Var.getClass();
        wq2 wq2Var = (wq2) e60Var.a(B0);
        Bundle bundle = null;
        if (wq2Var == null) {
            c.p("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        cr3 cr3Var = (cr3) e60Var.a(C0);
        if (cr3Var == null) {
            c.p("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle2 = (Bundle) e60Var.a(D0);
        String str = (String) e60Var.a(r51.O1);
        if (str == null) {
            c.p("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        sq2 sq2VarB = wq2Var.getSavedStateRegistry().b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        pq2 pq2Var = sq2VarB instanceof pq2 ? (pq2) sq2VarB : null;
        if (pq2Var == null) {
            c.q("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        LinkedHashMap linkedHashMap = E(cr3Var).b;
        lq2 lq2Var2 = (lq2) linkedHashMap.get(str);
        if (lq2Var2 != null) {
            return lq2Var2;
        }
        pq2Var.b();
        Bundle bundle3 = pq2Var.c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = vp.u((r32[]) Arrays.copyOf(new r32[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                pq2Var.c = null;
            }
            bundle = bundle4;
        }
        if (bundle != null) {
            bundle2 = bundle;
        }
        if (bundle2 == null) {
            lq2Var = new lq2();
        } else {
            ClassLoader classLoader = lq2.class.getClassLoader();
            classLoader.getClass();
            bundle2.setClassLoader(classLoader);
            cm1 cm1Var = new cm1(bundle2.size());
            for (String str2 : bundle2.keySet()) {
                str2.getClass();
                cm1Var.put(str2, bundle2.get(str2));
            }
            lq2Var = new lq2(om1.W(cm1Var));
        }
        linkedHashMap.put(str, lq2Var);
        return lq2Var;
    }
}
