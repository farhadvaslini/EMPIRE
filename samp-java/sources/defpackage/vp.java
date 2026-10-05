package defpackage;

import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import android.view.KeyEvent;
import android.view.View;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class vp {
    public static Method a;
    public static Method b;
    public static boolean c;
    public static w01 d;
    public static w01 e;
    public static w01 f;

    public static int A(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final long B(long j) {
        long j2 = (j << 1) + 1;
        ig0.f.getClass();
        int i = kg0.a;
        return j2;
    }

    public static void C(Canvas canvas, boolean z) {
        Method method;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            if (z) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (!c) {
            try {
                if (i == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    a = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    b = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    a = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    b = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = a;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = b;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            c = true;
        }
        if (z) {
            try {
                Method method4 = a;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z || (method = b) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    public static final w01 D() {
        w01 w01Var = e;
        if (w01Var != null) {
            return w01Var;
        }
        v01 v01Var = new v01("Filled.Clear", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = vo3.a;
        w73 w73Var = new w73(wx.b);
        tx0 tx0Var = new tx0(1);
        tx0Var.j(19.0f, 6.41f);
        tx0Var.h(17.59f, 5.0f);
        tx0Var.h(12.0f, 10.59f);
        tx0Var.h(6.41f, 5.0f);
        tx0Var.h(5.0f, 6.41f);
        tx0Var.h(10.59f, 12.0f);
        tx0Var.h(5.0f, 17.59f);
        tx0Var.h(6.41f, 19.0f);
        tx0Var.h(12.0f, 13.41f);
        tx0Var.h(17.59f, 19.0f);
        tx0Var.h(19.0f, 17.59f);
        tx0Var.h(13.41f, 12.0f);
        tx0Var.c();
        v01.a(v01Var, tx0Var.a, w73Var);
        w01 w01VarB = v01Var.b();
        e = w01VarB;
        return w01VarB;
    }

    public static final float E(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static Set F() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static final int I(KeyEvent keyEvent) {
        return (keyEvent.isAltPressed() ? 1 : 0) | (keyEvent.isCtrlPressed() ? 2 : 0) | (keyEvent.isMetaPressed() ? 4 : 0) | (keyEvent.isShiftPressed() ? 8 : 0);
    }

    public static final boolean J(long j) {
        if (wx.c(j, wx.f)) {
            return false;
        }
        iy iyVarF = wx.f(j);
        if (!gq.y(iyVarF.b, 12884901888L)) {
            l21.a("The specified color must be encoded in an RGB color space. The supplied color space is ".concat(gq.S(iyVarF.b)));
        }
        ao2 ao2Var = ((eo2) iyVarF).p;
        float fC = (float) ((ao2Var.c(wx.e(j)) * 0.0722d) + (ao2Var.c(wx.g(j)) * 0.7152d) + (ao2Var.c(wx.h(j)) * 0.2126d));
        if (fC < 0.0f) {
            fC = 0.0f;
        }
        if (fC > 1.0f) {
            fC = 1.0f;
        }
        return ((double) fC) <= 0.5d;
    }

    public static final boolean K(long j) {
        return (j & 2) != 0;
    }

    public static final boolean L(long j) {
        return (j & 1) != 0;
    }

    public static int M(int i, int i2, int i3) throws IOException {
        if ((i2 & 8) != 0) {
            i--;
        }
        if (i3 <= i) {
            return i - i3;
        }
        c.r(nc2.g(i3, i, "PROTOCOL_ERROR padding ", " > remaining length "));
        return 0;
    }

    public static final long N(long j, long j2, float f2) {
        ny1 ny1Var = ky.x;
        long jA = wx.a(j, ny1Var);
        long jA2 = wx.a(j2, ny1Var);
        float fD = wx.d(jA);
        float fH = wx.h(jA);
        float fG = wx.g(jA);
        float fE = wx.e(jA);
        float fD2 = wx.d(jA2);
        float fH2 = wx.h(jA2);
        float fG2 = wx.g(jA2);
        float fE2 = wx.e(jA2);
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        return wx.a(m(lq.N(fH, fH2, f2), lq.N(fG, fG2, f2), lq.N(fE, fE2, f2), lq.N(fD, fD2, f2), ny1Var), wx.f(j2));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long O(int r13, java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vp.O(int, java.lang.String):long");
    }

    public static final Object P(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final Object Q(n52 n52Var, ee2 ee2Var) {
        ee2Var.getClass();
        Object objB = n52Var.get(ee2Var);
        if (objB == null) {
            objB = ee2Var.b();
        }
        return ((oo3) objB).a(n52Var);
    }

    public static final Object R(Object obj) {
        return obj instanceof jz ? y02.l(((jz) obj).a) : obj;
    }

    public static final View S(ia0 ia0Var) {
        if (!((aq1) ia0Var).f.s) {
            m21.c("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) wb1.a(vr.X(ia0Var));
    }

    public static final int T(long j) {
        float[] fArr = ky.a;
        return (int) (wx.a(j, ky.e) >>> 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006d A[PHI: r4
      0x006d: PHI (r4v5 long) = (r4v3 long), (r4v4 long), (r4v4 long), (r4v4 long), (r4v4 long) binds: [B:31:0x006b, B:47:0x0099, B:50:0x009f, B:42:0x0085, B:36:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long U(long r8, defpackage.lg0 r10) {
        /*
            java.util.concurrent.TimeUnit r0 = r10.f
            r1 = 4611686018426999999(0x3ffffffffffa14bf, double:1.9999999999138678)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r1 = r0.convert(r1, r3)
            long r4 = -r1
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 > 0) goto L21
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 > 0) goto L21
            long r8 = r3.convert(r8, r0)
            zj r10 = defpackage.ig0.f
            r10 = 1
            long r8 = r8 << r10
            int r10 = defpackage.kg0.a
            return r8
        L21:
            lg0 r1 = defpackage.lg0.MILLISECONDS
            int r1 = r10.compareTo(r1)
            if (r1 < 0) goto La8
            int r0 = java.lang.Long.signum(r8)
            long r0 = (long) r0
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 >= 0) goto L38
            r8 = r2
        L38:
            long r8 = java.lang.Math.abs(r8)
            int r2 = r10.ordinal()
            r3 = 2
            r4 = 0
            r6 = 1
            if (r2 == r3) goto L68
            r3 = 3
            if (r2 == r3) goto L65
            r3 = 4
            if (r2 == r3) goto L61
            r3 = 5
            if (r2 == r3) goto L5d
            r3 = 6
            if (r2 != r3) goto L57
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            goto L69
        L57:
            java.lang.String r8 = "Wrong unit for millisMultiplier: "
            defpackage.c.h(r10, r8)
            return r4
        L5d:
            r2 = 3600000(0x36ee80, double:1.7786363E-317)
            goto L69
        L61:
            r2 = 60000(0xea60, double:2.9644E-319)
            goto L69
        L65:
            r2 = 1000(0x3e8, double:4.94E-321)
            goto L69
        L68:
            r2 = r6
        L69:
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 != 0) goto L6f
        L6d:
            r8 = r4
            goto La2
        L6f:
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            r4 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            if (r10 != 0) goto L7f
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 <= 0) goto L7d
            goto La1
        L7d:
            r8 = r2
            goto La2
        L7f:
            int r10 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r10 != 0) goto L88
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 <= 0) goto La2
            goto La1
        L88:
            int r10 = java.lang.Long.numberOfLeadingZeros(r8)
            int r10 = 128 - r10
            int r6 = java.lang.Long.numberOfLeadingZeros(r2)
            int r10 = r10 - r6
            r6 = 63
            if (r10 >= r6) goto L99
            long r8 = r8 * r2
            goto La2
        L99:
            if (r10 <= r6) goto L9c
            goto La1
        L9c:
            long r8 = r8 * r2
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 <= 0) goto La2
        La1:
            goto L6d
        La2:
            long r0 = r0 * r8
            long r8 = B(r0)
            return r8
        La8:
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r1 = r10.convert(r8, r0)
            r3 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            r5 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            long r8 = defpackage.y02.i(r1, r3, r5)
            long r8 = B(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vp.U(long, lg0):long");
    }

    public static final n52 V(he2[] he2VarArr, n52 n52Var, n52 n52Var2) {
        n52 n52Var3 = n52.i;
        m52 m52Var = new m52(n52Var3);
        m52Var.l = n52Var3;
        for (he2 he2Var : he2VarArr) {
            ee2 ee2Var = he2Var.a;
            if (he2Var.g || !n52Var.containsKey(ee2Var)) {
                m52Var.put(ee2Var, ee2Var.d(he2Var, (oo3) n52Var2.get(ee2Var)));
            }
        }
        return m52Var.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long a(float r21, float r22, float r23, float r24, defpackage.iy r25) {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vp.a(float, float, float, float, iy):long");
    }

    public static final long b(int i) {
        long j = ((long) i) << 32;
        int i2 = wx.h;
        return j;
    }

    public static final long c(long j) {
        long j2 = j << 32;
        int i = wx.h;
        return j2;
    }

    public static long d(int i, int i2, int i3) {
        return b(((i & 255) << 16) | (-16777216) | ((i2 & 255) << 8) | (i3 & 255));
    }

    public static final void e(gk3 gk3Var, bq1 bq1Var, mm0 mm0Var, ns0 ns0Var, d00 d00Var, nv0 nv0Var, int i) {
        ns0 ns0Var2;
        u10 u10Var = gk3Var.a;
        nv0Var.b0(-1877370462);
        int i2 = (i & 6) == 0 ? (nv0Var.f(gk3Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= nv0Var.f(bq1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= nv0Var.h(mm0Var) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 |= nv0Var.h(d00Var) ? 16384 : 8192;
        }
        if (nv0Var.R(i3 & 1, (i3 & 9363) != 9362)) {
            Object objO = nv0Var.O();
            Object obj = c20.a;
            if (objO == obj) {
                objO = hd.n;
                nv0Var.j0(objO);
            }
            ns0 ns0Var3 = (ns0) objO;
            Object objO2 = nv0Var.O();
            Object obj2 = objO2;
            if (objO2 == obj) {
                l73 l73Var = new l73();
                l73Var.add(u10Var.h());
                nv0Var.j0(l73Var);
                obj2 = l73Var;
            }
            l73 l73Var2 = (l73) obj2;
            Object objO3 = nv0Var.O();
            if (objO3 == obj) {
                long[] jArr = nr2.a;
                objO3 = new is1();
                nv0Var.j0(objO3);
            }
            is1 is1Var = (is1) objO3;
            d42 d42Var = gk3Var.d;
            if (s51.n(u10Var.h(), d42Var.getValue())) {
                nv0Var.a0(321145192);
                if (l73Var2.size() == 1 && s51.n(l73Var2.get(0), d42Var.getValue())) {
                    nv0Var.a0(321469824);
                    nv0Var.p(false);
                } else {
                    nv0Var.a0(321279546);
                    boolean z = (i3 & 14) == 4;
                    Object objO4 = nv0Var.O();
                    if (z || objO4 == obj) {
                        objO4 = new kd(3, gk3Var);
                        nv0Var.j0(objO4);
                    }
                    vx.g0(l73Var2, (ns0) objO4);
                    is1Var.a();
                    nv0Var.p(false);
                }
                nv0Var.p(false);
            } else {
                nv0Var.a0(321475776);
                nv0Var.p(false);
            }
            if (is1Var.b(d42Var.getValue())) {
                nv0Var.a0(322279296);
                nv0Var.p(false);
            } else {
                nv0Var.a0(321536443);
                ListIterator listIterator = l73Var2.listIterator();
                int i4 = 0;
                while (true) {
                    jy0 jy0Var = (jy0) listIterator;
                    if (!jy0Var.hasNext()) {
                        i4 = -1;
                        break;
                    } else if (s51.n(ns0Var3.h(jy0Var.next()), ns0Var3.h(d42Var.getValue()))) {
                        break;
                    } else {
                        i4++;
                    }
                }
                if (i4 == -1) {
                    l73Var2.add(d42Var.getValue());
                } else {
                    l73Var2.set(i4, d42Var.getValue());
                }
                is1Var.a();
                int size = l73Var2.size();
                for (int i5 = 0; i5 < size; i5++) {
                    Object obj3 = l73Var2.get(i5);
                    is1Var.m(obj3, gq.N(-934471669, new k60(gk3Var, mm0Var, obj3, d00Var), nv0Var));
                }
                nv0Var.p(false);
            }
            cn1 cn1VarD = eo.d(f5.g, false);
            int iHashCode = Long.hashCode(nv0Var.T);
            n52 n52VarL = nv0Var.l();
            bq1 bq1VarM = lr.M(nv0Var, bq1Var);
            w10.c.getClass();
            nv0Var.d0();
            if (nv0Var.S) {
                nv0Var.k(tb1.Y);
            } else {
                nv0Var.m0();
            }
            y02.F(f5.E, nv0Var, cn1VarD);
            y02.F(f5.D, nv0Var, n52VarL);
            y02.v(nv0Var, Integer.valueOf(iHashCode));
            y02.C(nv0Var);
            y02.F(f5.C, nv0Var, bq1VarM);
            nv0Var.a0(-1312707512);
            int size2 = l73Var2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                Object obj4 = l73Var2.get(i6);
                nv0Var.Y(1171574969, ns0Var3.h(obj4));
                rs0 rs0Var = (rs0) is1Var.g(obj4);
                if (rs0Var == null) {
                    nv0Var.a0(1959122128);
                } else {
                    nv0Var.a0(1171576145);
                    rs0Var.f(nv0Var, 0);
                }
                nv0Var.p(false);
                nv0Var.p(false);
            }
            nv0Var.p(false);
            nv0Var.p(true);
            ns0Var2 = ns0Var3;
        } else {
            nv0Var.U();
            ns0Var2 = ns0Var;
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new i60(gk3Var, bq1Var, mm0Var, ns0Var2, d00Var, i, 1);
        }
    }

    public static final void f(Boolean bool, bq1 bq1Var, mm0 mm0Var, String str, d00 d00Var, nv0 nv0Var, int i) {
        int i2;
        bq1 bq1Var2;
        String str2;
        nv0Var.b0(-513216493);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? nv0Var.f(bool) : nv0Var.h(bool) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= nv0Var.h(mm0Var) ? 256 : 128;
        }
        int i4 = i3 | 3072;
        if ((i & 24576) == 0) {
            i4 |= nv0Var.h(d00Var) ? 16384 : 8192;
        }
        if (nv0Var.R(i4 & 1, (i4 & 9363) != 9362)) {
            yp1 yp1Var = yp1.a;
            e(w7.d0(bool, "Crossfade", nv0Var, (i4 & 14) | ((i4 >> 6) & 112), 0), yp1Var, mm0Var, null, d00Var, nv0Var, i4 & 58352);
            bq1Var2 = yp1Var;
            str2 = "Crossfade";
        } else {
            nv0Var.U();
            bq1Var2 = bq1Var;
            str2 = str;
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new i60(bool, bq1Var2, mm0Var, str2, d00Var, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(defpackage.rs0 r23, defpackage.bq1 r24, defpackage.rs0 r25, defpackage.rs0 r26, defpackage.rs0 r27, defpackage.ei1 r28, defpackage.nv0 r29, int r30, int r31) {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vp.g(rs0, bq1, rs0, rs0, rs0, ei1, nv0, int, int):void");
    }

    public static final void h(rs0 rs0Var, rs0 rs0Var2, d00 d00Var, rs0 rs0Var3, rs0 rs0Var4, nv0 nv0Var, int i) {
        nv0Var.b0(-61277522);
        int i2 = i | (nv0Var.h(rs0Var) ? 4 : 2) | (nv0Var.h(rs0Var2) ? 32 : 16) | (nv0Var.h(rs0Var3) ? 2048 : 1024) | (nv0Var.h(rs0Var4) ? 16384 : 8192);
        if (nv0Var.R(i2 & 1, (i2 & 9363) != 9362)) {
            Object objO = nv0Var.O();
            zj zjVar = c20.a;
            if (objO == zjVar) {
                objO = new mi1();
                nv0Var.j0(objO);
            }
            mi1 mi1Var = (mi1) objO;
            d00 d00VarV = v(vr.L(d00Var, rs0Var3 == null ? m00.a : rs0Var3, rs0Var4 == null ? m00.b : rs0Var4, rs0Var == null ? m00.c : rs0Var, rs0Var2 == null ? m00.d : rs0Var2));
            Object objO2 = nv0Var.O();
            if (objO2 == zjVar) {
                objO2 = new ar1(mi1Var);
                nv0Var.j0(objO2);
            }
            cn1 cn1Var = (cn1) objO2;
            int iC = lq.C(nv0Var);
            n52 n52VarL = nv0Var.l();
            bq1 bq1VarM = lr.M(nv0Var, yp1.a);
            w10.c.getClass();
            nv0Var.d0();
            if (nv0Var.S) {
                nv0Var.k(tb1.Y);
            } else {
                nv0Var.m0();
            }
            y02.F(f5.E, nv0Var, cn1Var);
            y02.F(f5.D, nv0Var, n52VarL);
            z00 z00Var = f5.F;
            if (nv0Var.S || !s51.n(nv0Var.O(), Integer.valueOf(iC))) {
                nc2.q(iC, nv0Var, iC, z00Var);
            }
            y02.F(f5.C, nv0Var, bq1VarM);
            nc2.p(0, d00VarV, nv0Var, true);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new r81(rs0Var, rs0Var2, d00Var, rs0Var3, rs0Var4, i, 2);
        }
    }

    public static final void i(qt1 qt1Var, dq2 dq2Var, d00 d00Var, nv0 nv0Var, int i) {
        nv0Var.b0(233973821);
        if ((((nv0Var.h(qt1Var) ? 4 : 2) | i | (nv0Var.h(dq2Var) ? 32 : 16)) & 147) == 146 && nv0Var.D()) {
            nv0Var.U();
        } else {
            vr.d(new he2[]{oj1.a.a(qt1Var), ij1.a.a(qt1Var), nj1.a.a(qt1Var)}, gq.N(1808964477, new z4(5, dq2Var, d00Var), nv0Var), nv0Var, 56);
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new w1((Object) qt1Var, (Object) dq2Var, (Object) d00Var, i, 8);
        }
    }

    public static final void j(final cs0 cs0Var, final long j, final wp1 wp1Var, ed edVar, d00 d00Var, nv0 nv0Var, int i) {
        int i2;
        long j2;
        wp1 wp1Var2;
        int i3;
        bb1 bb1Var;
        int i4;
        boolean z;
        boolean z2;
        Object obj;
        nv0Var.b0(766784632);
        if ((i & 6) == 0) {
            i2 = (nv0Var.h(cs0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            j2 = j;
            i2 |= nv0Var.e(j2) ? 32 : 16;
        } else {
            j2 = j;
        }
        if ((i & 384) == 0) {
            wp1Var2 = wp1Var;
            i2 |= nv0Var.f(wp1Var2) ? 256 : 128;
        } else {
            wp1Var2 = wp1Var;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? nv0Var.f(edVar) : nv0Var.h(edVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= nv0Var.h(d00Var) ? 16384 : 8192;
        }
        if (nv0Var.R(i2 & 1, (i2 & 9363) != 9362)) {
            View view = (View) nv0Var.j(x7.f);
            ua0 ua0Var = (ua0) nv0Var.j(s20.h);
            bb1 bb1Var2 = (bb1) nv0Var.j(s20.n);
            lv0 lv0VarW = lq.W(nv0Var);
            os1 os1VarZ = b32.z(d00Var, nv0Var);
            Object[] objArr = new Object[0];
            Object objO = nv0Var.O();
            Object obj2 = c20.a;
            if (objO == obj2) {
                i3 = i2;
                objO = new x91(22);
                nv0Var.j0(objO);
            } else {
                i3 = i2;
            }
            UUID uuid = (UUID) oz2.G(objArr, (cs0) objO, nv0Var);
            Object objO2 = nv0Var.O();
            if (objO2 == obj2) {
                objO2 = rn.A(nv0Var);
                nv0Var.j0(objO2);
            }
            x50 x50Var = (x50) objO2;
            boolean zF = nv0Var.f(view) | nv0Var.f(ua0Var);
            Object objO3 = nv0Var.O();
            if (zF || objO3 == obj2) {
                bb1Var = bb1Var2;
                i4 = i3;
                z = true;
                z2 = false;
                jp1 jp1Var = new jp1(cs0Var, wp1Var2, j2, view, bb1Var, ua0Var, uuid, edVar, x50Var);
                d00 d00Var2 = new d00(-1051373467, new e90(6, os1VarZ), true);
                gp1 gp1Var = jp1Var.n;
                gp1Var.setParentCompositionContext(lv0VarW);
                gp1Var.o.setValue(d00Var2);
                gp1Var.p = true;
                gp1Var.d();
                nv0Var.j0(jp1Var);
                obj = jp1Var;
            } else {
                bb1Var = bb1Var2;
                i4 = i3;
                z = true;
                z2 = false;
                obj = objO3;
            }
            final jp1 jp1Var2 = (jp1) obj;
            boolean zH = nv0Var.h(jp1Var2);
            Object objO4 = nv0Var.O();
            if (zH || objO4 == obj2) {
                objO4 = new xc1(8, jp1Var2);
                nv0Var.j0(objO4);
            }
            rn.g(jp1Var2, (ns0) objO4, nv0Var);
            int i5 = i4;
            boolean zH2 = nv0Var.h(jp1Var2) | ((i5 & 14) == 4 ? z : z2) | ((i5 & 896) == 256 ? z : z2) | ((i5 & 112) == 32 ? z : z2) | nv0Var.d(bb1Var.ordinal());
            Object objO5 = nv0Var.O();
            if (zH2 || objO5 == obj2) {
                final bb1 bb1Var3 = bb1Var;
                objO5 = new cs0() { // from class: xp1
                    @Override // defpackage.cs0
                    public final Object a() {
                        jp1Var2.d(cs0Var, wp1Var, j, bb1Var3);
                        return dm3.a;
                    }
                };
                nv0Var.j0(objO5);
            }
            rn.t((cs0) objO5, nv0Var);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new qh1(cs0Var, j, wp1Var, edVar, d00Var, i);
        }
    }

    public static final void k(long j, pl3 pl3Var, rs0 rs0Var, nv0 nv0Var, int i) {
        long j2;
        nv0 nv0Var2;
        rs0 rs0Var2;
        nv0Var.b0(-285397024);
        int i2 = (nv0Var.e(j) ? 4 : 2) | i | (nv0Var.h(rs0Var) ? 256 : 128);
        if (nv0Var.R(i2 & 1, (i2 & 147) != 146)) {
            j2 = j;
            nv0Var2 = nv0Var;
            jo3.b(j2, ql3.a(pl3Var, nv0Var), rs0Var, nv0Var2, i2 & 910);
            rs0Var2 = rs0Var;
        } else {
            j2 = j;
            nv0Var2 = nv0Var;
            rs0Var2 = rs0Var;
            nv0Var2.U();
        }
        xj2 xj2VarT = nv0Var2.t();
        if (xj2VarT != null) {
            xj2VarT.d = new g8(j2, pl3Var, rs0Var2, i);
        }
    }

    public static final void l(dq2 dq2Var, d00 d00Var, nv0 nv0Var, int i) {
        nv0Var.b0(832919318);
        int i2 = (nv0Var.h(dq2Var) ? 4 : 2) | i | (nv0Var.h(d00Var) ? 32 : 16);
        if ((i2 & 19) == 18 && nv0Var.D()) {
            nv0Var.U();
        } else {
            Object objO = nv0Var.O();
            if (objO == c20.a) {
                objO = new fi1(13);
                nv0Var.j0(objO);
            }
            ns0 ns0Var = (ns0) objO;
            cr3 cr3VarA = oj1.a(nv0Var);
            if (cr3VarA == null) {
                c.q("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            lu luVarA = rk2.a(bl.class);
            j21 j21Var = new j21(0);
            j21Var.a(rk2.a(bl.class), ns0Var);
            bl blVar = (bl) g12.h0(luVarA, cr3VarA, j21Var.b(), cr3VarA instanceof rx0 ? ((rx0) cr3VarA).getDefaultViewModelCreationExtras() : d60.b, nv0Var);
            blVar.d = new vr3(dq2Var);
            dq2Var.e(blVar.c, d00Var, nv0Var, ((i2 << 6) & 896) | (i2 & 112));
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new y7(i, 26, dq2Var, d00Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long m(float r17, float r18, float r19, float r20, defpackage.iy r21) {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vp.m(float, float, float, float, iy):long");
    }

    public static final long n(long j, long j2) {
        if (j != 4611686018427387903L && j != -4611686018427387903L) {
            return (j2 == 4611686018427387903L || j2 == -4611686018427387903L) ? j2 : y02.i(j + j2, -4611686018427387903L, 4611686018427387903L);
        }
        if ((-4611686018427387903L >= j2 || j2 >= 4611686018427387903L) && (j2 ^ j) < 0) {
            return 9223372036854759646L;
        }
        return j;
    }

    public static final int o(k51 k51Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j) {
        int iMax = Math.max(Math.max(m30.j(j), k51Var.p0(i6 == 1 ? f80.p0 : i6 == 2 ? f80.w0 : f80.t0)), Math.max(i, Math.max(i3 + i4 + i5, i2)) + i7);
        int iH = m30.h(j);
        return iMax > iH ? iH : iMax;
    }

    public static IOException p(File file, IOException iOException) {
        StringBuilder sb = new StringBuilder("Inoperable file:");
        try {
            sb.append(" canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + ']');
        } catch (IOException unused) {
            sb.append(" failed to attach additional metadata");
        }
        return new IOException(sb.toString(), iOException);
    }

    public static final void q(vq3 vq3Var, tq2 tq2Var, gf1 gf1Var) {
        tq2Var.getClass();
        gf1Var.getClass();
        mq2 mq2Var = (mq2) vq3Var.c("androidx.lifecycle.savedstate.vm.tag");
        if (mq2Var == null || mq2Var.h) {
            return;
        }
        mq2Var.h(gf1Var, tq2Var);
        ff1 ff1Var = ((rf1) gf1Var).i;
        if (ff1Var == ff1.g || ff1Var.compareTo(ff1.i) >= 0) {
            tq2Var.d();
        } else {
            gf1Var.a(new c90(gf1Var, tq2Var));
        }
    }

    public static IOException r(File file, IOException iOException) {
        File parentFile = file.getParentFile();
        return parentFile == null ? p(file, iOException) : parentFile.exists() ? parentFile.isFile() ? parentFile.canRead() ? parentFile.canWrite() ? p(file, iOException) : p(file, iOException) : parentFile.canWrite() ? p(file, iOException) : p(file, iOException) : parentFile.canRead() ? parentFile.canWrite() ? p(file, iOException) : p(file, iOException) : parentFile.canWrite() ? p(file, iOException) : p(file, iOException) : p(file, iOException);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005a -> B:21:0x005d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s(defpackage.rb3 r7, defpackage.ab2 r8, defpackage.ml r9) {
        /*
            boolean r0 = r9 instanceof defpackage.ar0
            if (r0 == 0) goto L13
            r0 = r9
            ar0 r0 = (defpackage.ar0) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ar0 r0 = new ar0
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.k
            int r1 = r0.l
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2d
            ab2 r7 = r0.j
            rb3 r8 = r0.i
            defpackage.y02.Q(r9)
            r6 = r8
            r8 = r7
            r7 = r6
            goto L5d
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r7)
            r7 = 0
            return r7
        L34:
            defpackage.y02.Q(r9)
            sb3 r9 = r7.k
            za2 r9 = r9.y
            java.util.List r9 = r9.a
            int r1 = r9.size()
            r4 = r2
        L42:
            if (r4 >= r1) goto L79
            java.lang.Object r5 = r9.get(r4)
            gb2 r5 = (defpackage.gb2) r5
            boolean r5 = r5.d
            if (r5 == 0) goto L76
        L4e:
            r0.i = r7
            r0.j = r8
            r0.l = r3
            java.lang.Object r9 = r7.c(r8, r0)
            y50 r1 = defpackage.y50.f
            if (r9 != r1) goto L5d
            return r1
        L5d:
            za2 r9 = (defpackage.za2) r9
            java.util.List r9 = r9.a
            int r1 = r9.size()
            r4 = r2
        L66:
            if (r4 >= r1) goto L79
            java.lang.Object r5 = r9.get(r4)
            gb2 r5 = (defpackage.gb2) r5
            boolean r5 = r5.d
            if (r5 == 0) goto L73
            goto L4e
        L73:
            int r4 = r4 + 1
            goto L66
        L76:
            int r4 = r4 + 1
            goto L42
        L79:
            dm3 r7 = defpackage.dm3.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vp.s(rb3, ab2, ml):java.lang.Object");
    }

    public static final Object t(kb2 kb2Var, rs0 rs0Var, p40 p40Var) {
        Object objP1 = ((sb3) kb2Var).p1(new br0(p40Var.i(), rs0Var, null, 0), p40Var);
        return objP1 == y50.f ? objP1 : dm3.a;
    }

    public static final Bundle u(r32... r32VarArr) {
        Bundle bundle = new Bundle(r32VarArr.length);
        for (r32 r32Var : r32VarArr) {
            String str = (String) r32Var.f;
            Object obj = r32Var.g;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        c.p(by1.i("Illegal value array type ", componentType.getCanonicalName(), " for key \"", str, "\""));
                        return null;
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    c.p(by1.i("Illegal value type ", obj.getClass().getCanonicalName(), " for key \"", str, "\""));
                    return null;
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static final d00 v(List list) {
        return new d00(1271844412, new hb1(0, list), true);
    }

    public static final int w(long j, long j2) {
        boolean zL = L(j);
        if (zL != L(j2)) {
            return zL ? -1 : 1;
        }
        return (Math.min(E(j), E(j2)) >= 0.0f && K(j) != K(j2)) ? K(j) ? -1 : 1 : (int) Math.signum(E(j) - E(j2));
    }

    public static final long x(long j, long j2) {
        float f2;
        float f3;
        long jA = wx.a(j, wx.f(j2));
        float fD = wx.d(j2);
        float fD2 = wx.d(jA);
        float f4 = 1.0f - fD2;
        float f5 = (fD * f4) + fD2;
        float fH = wx.h(jA);
        float fH2 = wx.h(j2);
        float f6 = 0.0f;
        if (f5 == 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = (((fH2 * fD) * f4) + (fH * fD2)) / f5;
        }
        float fG = wx.g(jA);
        float fG2 = wx.g(j2);
        if (f5 == 0.0f) {
            f3 = 0.0f;
        } else {
            f3 = (((fG2 * fD) * f4) + (fG * fD2)) / f5;
        }
        float fE = wx.e(jA);
        float fE2 = wx.e(j2);
        if (f5 != 0.0f) {
            f6 = (((fE2 * fD) * f4) + (fE * fD2)) / f5;
        }
        return m(f2, f3, f6, f5, wx.f(j2));
    }

    public static os1 y() {
        return new d42(dm3.a, f5.f0);
    }

    public static Handler z(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return bc0.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e2) {
            e = e2;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e3) {
            e = e3;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e4) {
            e = e4;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e5) {
            Throwable cause = e5.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public abstract h9 G();

    public Object H(int i) {
        Object objH;
        h51 h51VarD = G().d(i);
        int i2 = i - h51VarD.a;
        ns0 key = h51VarD.c.getKey();
        return (key == null || (objH = key.h(Integer.valueOf(i2))) == null) ? new y80(i) : objH;
    }
}
