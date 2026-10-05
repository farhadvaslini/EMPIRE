package defpackage;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class lr {
    public static w01 a = null;
    public static w01 b = null;
    public static w01 c = null;
    public static boolean d = false;
    public static Method e = null;
    public static boolean f = false;
    public static Field g;
    public static w01 h;

    public static final int A(int i, List list) {
        int i2;
        int i3 = ((t32) qx.y0(list)).c;
        if (i > ((t32) qx.y0(list)).c) {
            n21.a("Index " + i + " should be less or equal than last line's end " + i3);
        }
        int size = list.size() - 1;
        int i4 = 0;
        while (true) {
            if (i4 > size) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + size) >>> 1;
            t32 t32Var = (t32) list.get(i2);
            byte b2 = t32Var.b > i ? (byte) 1 : t32Var.c <= i ? (byte) -1 : (byte) 0;
            if (b2 >= 0) {
                if (b2 <= 0) {
                    break;
                }
                size = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        if (i2 >= 0 && i2 < list.size()) {
            return i2;
        }
        int size2 = list.size();
        String strA = yi1.a(list, null, new fi1(10), 31);
        StringBuilder sbL = nc2.l("Found paragraph index ", i2, " should be in range [0, ", size2, ").\nDebug info: index=");
        sbL.append(i);
        sbL.append(", paragraphs=[");
        sbL.append(strA);
        sbL.append("]");
        n21.a(sbL.toString());
        return i2;
    }

    public static final int B(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            t32 t32Var = (t32) list.get(i3);
            byte b2 = t32Var.d > i ? (byte) 1 : t32Var.e <= i ? (byte) -1 : (byte) 0;
            if (b2 < 0) {
                i2 = i3 + 1;
            } else {
                if (b2 <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final int C(ArrayList arrayList, float f2) {
        if (f2 <= 0.0f) {
            return 0;
        }
        if (f2 >= ((t32) qx.y0(arrayList)).g) {
            return arrayList.size() - 1;
        }
        int size = arrayList.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            t32 t32Var = (t32) arrayList.get(i2);
            byte b2 = t32Var.f > f2 ? (byte) 1 : t32Var.g <= f2 ? (byte) -1 : (byte) 0;
            if (b2 < 0) {
                i = i2 + 1;
            } else {
                if (b2 <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final void D(ArrayList arrayList, long j, ns0 ns0Var) {
        int size = arrayList.size();
        for (int iA = A(yg3.f(j), arrayList); iA < size; iA++) {
            t32 t32Var = (t32) arrayList.get(iA);
            if (t32Var.b >= yg3.e(j)) {
                return;
            }
            if (t32Var.b != t32Var.c) {
                ns0Var.h(t32Var);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object E(defpackage.fn0 r7, defpackage.q40 r8) {
        /*
            ai0 r0 = defpackage.vm1.b0
            boolean r1 = r8 instanceof defpackage.co0
            if (r1 == 0) goto L15
            r1 = r8
            co0 r1 = (defpackage.co0) r1
            int r2 = r1.l
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.l = r2
            goto L1a
        L15:
            co0 r1 = new co0
            r1.<init>(r8)
        L1a:
            java.lang.Object r8 = r1.k
            int r2 = r1.l
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2e
            k9 r7 = r1.j
            qk2 r2 = r1.i
            defpackage.y02.Q(r8)     // Catch: defpackage.d -> L2c
            goto L63
        L2c:
            r8 = move-exception
            goto L57
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r7)
            return r3
        L34:
            defpackage.y02.Q(r8)
            qk2 r2 = new qk2
            r2.<init>()
            r2.f = r0
            k9 r8 = new k9
            r5 = 2
            r8.<init>(r5, r2)
            r1.i = r2     // Catch: defpackage.d -> L53
            r1.j = r8     // Catch: defpackage.d -> L53
            r1.l = r4     // Catch: defpackage.d -> L53
            java.lang.Object r7 = r7.a(r8, r1)     // Catch: defpackage.d -> L53
            y50 r8 = defpackage.y50.f
            if (r7 != r8) goto L63
            return r8
        L53:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L57:
            gn0 r4 = r8.f
            if (r4 != r7) goto L6e
            o50 r7 = r1.g
            r7.getClass()
            defpackage.lq.r(r7)
        L63:
            java.lang.Object r7 = r2.f
            if (r7 == r0) goto L68
            return r7
        L68:
            java.lang.String r7 = "Expected at least one element"
            defpackage.c.m(r7)
            return r3
        L6e:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lr.E(fn0, q40):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object F(defpackage.fn0 r5, defpackage.rs0 r6, defpackage.q40 r7) {
        /*
            ai0 r0 = defpackage.vm1.b0
            boolean r1 = r7 instanceof defpackage.do0
            if (r1 == 0) goto L15
            r1 = r7
            do0 r1 = (defpackage.do0) r1
            int r2 = r1.l
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.l = r2
            goto L1a
        L15:
            do0 r1 = new do0
            r1.<init>(r7)
        L1a:
            java.lang.Object r7 = r1.k
            int r2 = r1.l
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2e
            yn0 r5 = r1.j
            qk2 r6 = r1.i
            defpackage.y02.Q(r7)     // Catch: defpackage.d -> L2c
            goto L64
        L2c:
            r7 = move-exception
            goto L58
        L2e:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r5)
            return r3
        L34:
            defpackage.y02.Q(r7)
            qk2 r7 = new qk2
            r7.<init>()
            r7.f = r0
            yn0 r2 = new yn0
            r2.<init>(r4, r6, r7)
            r1.i = r7     // Catch: defpackage.d -> L54
            r1.j = r2     // Catch: defpackage.d -> L54
            r1.l = r4     // Catch: defpackage.d -> L54
            java.lang.Object r5 = r5.a(r2, r1)     // Catch: defpackage.d -> L54
            y50 r6 = defpackage.y50.f
            if (r5 != r6) goto L52
            return r6
        L52:
            r6 = r7
            goto L64
        L54:
            r5 = move-exception
            r6 = r7
            r7 = r5
            r5 = r2
        L58:
            gn0 r2 = r7.f
            if (r2 != r5) goto L6f
            o50 r5 = r1.g
            r5.getClass()
            defpackage.lq.r(r5)
        L64:
            java.lang.Object r5 = r6.f
            if (r5 == r0) goto L69
            return r5
        L69:
            java.lang.String r5 = "Expected at least one element matching the predicate"
            defpackage.c.m(r5)
            return r3
        L6f:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lr.F(fn0, rs0, q40):java.lang.Object");
    }

    public static final w01 G() {
        w01 w01Var = a;
        if (w01Var != null) {
            return w01Var;
        }
        v01 v01Var = new v01("Filled.Code", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = vo3.a;
        w73 w73Var = new w73(wx.b);
        tx0 tx0Var = new tx0(1);
        tx0Var.j(9.4f, 16.6f);
        tx0Var.h(4.8f, 12.0f);
        tx0Var.i(4.6f, -4.6f);
        tx0Var.h(8.0f, 6.0f);
        tx0Var.i(-6.0f, 6.0f);
        tx0Var.i(6.0f, 6.0f);
        tx0Var.i(1.4f, -1.4f);
        tx0Var.c();
        tx0Var.j(14.6f, 16.6f);
        tx0Var.i(4.6f, -4.6f);
        tx0Var.i(-4.6f, -4.6f);
        tx0Var.h(16.0f, 6.0f);
        tx0Var.i(6.0f, 6.0f);
        tx0Var.i(-6.0f, 6.0f);
        tx0Var.i(-1.4f, -1.4f);
        tx0Var.c();
        v01.a(v01Var, tx0Var.a, w73Var);
        w01 w01VarB = v01Var.b();
        a = w01VarB;
        return w01VarB;
    }

    public static final jr H(p40 p40Var) {
        if (!(p40Var instanceof wb0)) {
            return new jr(1, p40Var);
        }
        jr jrVarK = ((wb0) p40Var).k();
        if (jrVarK != null) {
            if (!jrVarK.F()) {
                jrVarK = null;
            }
            if (jrVarK != null) {
                return jrVarK;
            }
        }
        return new jr(2, p40Var);
    }

    public static final long I(yl1 yl1Var) {
        DragEvent dragEvent = (DragEvent) yl1Var.g;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        return (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L);
    }

    public static final cl1 J(cl1 cl1Var) {
        tb1 tb1VarU = cl1Var.z.z;
        while (true) {
            tb1 tb1VarU2 = tb1VarU.u();
            if ((tb1VarU2 != null ? tb1VarU2.n : null) == null) {
                cl1 cl1VarU1 = tb1VarU.L.d.u1();
                cl1VarU1.getClass();
                return cl1VarU1;
            }
            tb1 tb1VarU3 = tb1VarU.u();
            tb1 tb1Var = tb1VarU3 != null ? tb1VarU3.n : null;
            tb1Var.getClass();
            if (tb1Var.m) {
                tb1VarU = tb1VarU.u();
                tb1VarU.getClass();
            } else {
                tb1 tb1VarU4 = tb1VarU.u();
                tb1VarU4.getClass();
                tb1VarU = tb1VarU4.n;
                tb1VarU.getClass();
            }
        }
    }

    public static final void K(o50 o50Var, Throwable th) {
        if (th instanceof vb0) {
            th = ((vb0) th).f;
        }
        try {
            r50 r50Var = (r50) o50Var.m(f5.N);
            if (r50Var != null) {
                r50Var.n(o50Var, th);
            } else {
                br.E(o50Var, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                uq.j(runtimeException, th);
                th = runtimeException;
            }
            br.E(o50Var, th);
        }
    }

    public static final bq1 L(nv0 nv0Var, bq1 bq1Var) {
        if (bq1Var.b(new u0(29))) {
            return bq1Var;
        }
        nv0Var.V(1219399079, 0, null, null);
        bq1 bq1Var2 = (bq1) bq1Var.a(new u(6, nv0Var), yp1.a);
        nv0Var.p(false);
        return bq1Var2;
    }

    public static final bq1 M(nv0 nv0Var, bq1 bq1Var) {
        nv0Var.a0(439770924);
        bq1 bq1VarL = L(nv0Var, bq1Var);
        nv0Var.p(false);
        return bq1VarL;
    }

    public static final long N(q11 q11Var, t02 t02Var, p11 p11Var, boolean z) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j;
        long j2 = q11Var.g;
        if (t02Var != null) {
            int i = p11Var.a;
            if (i == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            } else if (i == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j2 & 4294967295L));
            }
            if (t02Var == t02.g) {
                long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
                jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
                j = jFloatToRawIntBits2 << 32;
            } else {
                long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
                jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                j = jFloatToRawIntBits3 << 32;
            }
            j2 = j | (jFloatToRawIntBits & 4294967295L);
        }
        long jD = gy1.d(O(q11Var, t02Var, p11Var), j2);
        if (z || !q11Var.i) {
            return jD;
        }
        return 0L;
    }

    public static final long O(q11 q11Var, t02 t02Var, p11 p11Var) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j;
        if (t02Var == null) {
            return q11Var.c;
        }
        int i = p11Var.a;
        if (i == 1) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (q11Var.c >> 32));
        } else {
            if (i != 2) {
                return q11Var.c;
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (q11Var.c & 4294967295L));
        }
        if (t02Var == t02.g) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
            j = jFloatToRawIntBits3 << 32;
        }
        return j | (4294967295L & jFloatToRawIntBits);
    }

    public static final void P(Object[] objArr, int i, int i2) {
        objArr.getClass();
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    public static final long Q(long j) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    public static final cj2 R(fn0 fn0Var, x50 x50Var, c93 c93Var, Object obj) throws IllegalAccessException, InvocationTargetException {
        ar2 ar2Var;
        ls lsVar;
        fn0 fn0VarF;
        js.b.getClass();
        is isVar = is.a;
        int i = 1;
        if (!(fn0Var instanceof ls) || (fn0VarF = (lsVar = (ls) fn0Var).f()) == null) {
            ar2Var = new ar2(i, fn0Var, li0.f);
        } else {
            if (lsVar.g != -3) {
            }
            ar2Var = new ar2(i, fn0VarF, lsVar.f);
        }
        i93 i93VarE = s51.e(obj);
        o50 o50Var = (o50) ar2Var.h;
        fn0 fn0Var2 = (fn0) ar2Var.g;
        a60 a60Var = c93Var.equals(n33.a) ? a60.f : a60.i;
        rs0 n9Var = new n9(c93Var, fn0Var2, i93VarE, obj, (p40) null);
        o50 o50VarY = uq.y(x50Var, o50Var);
        w83 ne1Var = a60Var == a60.g ? new ne1(o50VarY, n9Var) : new w83(o50VarY, true);
        ne1Var.r0(a60Var, ne1Var, n9Var);
        return new cj2(i93VarE, ne1Var);
    }

    public static final long S(long j) {
        int iIntBitsToFloat = (int) Float.intBitsToFloat((int) (j >> 32));
        return (((long) ((int) Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iIntBitsToFloat) << 32);
    }

    public static final long T(long j) {
        return (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
    }

    public static final long U(long j, long j2) {
        int iD;
        int iF = yg3.f(j);
        int iE = yg3.e(j);
        if ((yg3.f(j2) < yg3.e(j)) && (yg3.f(j) < yg3.e(j2))) {
            if ((yg3.f(j2) <= yg3.f(j)) && (yg3.e(j) <= yg3.e(j2))) {
                iF = yg3.f(j2);
                iE = iF;
            } else {
                if ((yg3.f(j) <= yg3.f(j2)) && (yg3.e(j2) <= yg3.e(j))) {
                    iD = yg3.d(j2);
                } else {
                    int iF2 = yg3.f(j2);
                    if (iF >= yg3.e(j2) || iF2 > iF) {
                        iE = yg3.f(j2);
                    } else {
                        iF = yg3.f(j2);
                        iD = yg3.d(j2);
                    }
                }
                iE -= iD;
            }
        } else if (iE > yg3.f(j2)) {
            iF -= yg3.d(j2);
            iD = yg3.d(j2);
            iE -= iD;
        }
        return d32.f(iF, iE);
    }

    public static np a(int i, int i2, jp jpVar) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        int i3 = i2 & 2;
        jp jpVar2 = jp.f;
        if (i3 != 0) {
            jpVar = jpVar2;
        }
        if (i == -2) {
            if (jpVar != jpVar2) {
                return new y20(1, jpVar);
            }
            js.b.getClass();
            return new np(is.b);
        }
        if (i != -1) {
            return i != 0 ? i != Integer.MAX_VALUE ? jpVar == jpVar2 ? new np(i) : new y20(i, jpVar) : new np(Integer.MAX_VALUE) : jpVar == jpVar2 ? new np(0) : new y20(1, jpVar);
        }
        if (jpVar == jpVar2) {
            return new y20(1, jp.g);
        }
        c.p("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        return null;
    }

    public static final void b(sf3 sf3Var, d00 d00Var, nv0 nv0Var, int i) {
        int i2;
        bq1 bq1VarS;
        nv0Var.b0(1533506138);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (nv0Var.h(sf3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= nv0Var.h(d00Var) ? 32 : 16;
        }
        int i4 = 1;
        int i5 = 0;
        if (nv0Var.R(i2 & 1, (i2 & 19) != 18)) {
            nv0Var.a0(-885604480);
            if (sf3Var.k()) {
                p40 p40Var = null;
                bq1VarS = vm1.S(f80.P(new mf3(sf3Var, p40Var, i5)), sf3Var.y, new r70(sf3Var, p40Var, i4), new nf3(sf3Var, p40Var, i5), new b50(sf3Var, i3));
            } else {
                bq1VarS = yp1.a;
            }
            d32.c(bq1VarS, d00Var, nv0Var, i2 & 112);
            nv0Var.p(false);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new ez(sf3Var, d00Var, i, i5);
        }
    }

    public static final long c(float f2, boolean z, boolean z2) {
        return (((z ? 1L : 0L) | (z2 ? 2L : 0L)) & 4294967295L) | (((long) Float.floatToRawIntBits(f2)) << 32);
    }

    public static final void d(final bq1 bq1Var, final ps1 ps1Var, final os1 os1Var, final es2 es2Var, final z13 z13Var, final long j, final float f2, final d00 d00Var, nv0 nv0Var, final int i) {
        int i2;
        float f3;
        nv0Var.b0(848986741);
        int i3 = i | (nv0Var.f(bq1Var) ? 4 : 2) | (nv0Var.f(ps1Var) ? 32 : 16) | (nv0Var.f(es2Var) ? 2048 : 1024) | (nv0Var.f(z13Var) ? 16384 : 8192) | (nv0Var.e(j) ? 131072 : 65536) | (nv0Var.c(0.0f) ? 1048576 : 524288) | (nv0Var.c(f2) ? 8388608 : 4194304) | (nv0Var.f(null) ? 67108864 : 33554432) | (nv0Var.h(d00Var) ? 536870912 : 268435456);
        if (nv0Var.R(i3 & 1, (i3 & 306783379) != 306783378)) {
            gk3 gk3VarZ = w7.Z(ps1Var, "DropDownMenu", nv0Var, (((i3 >> 3) & 14) | 48) & 126, 0);
            s83 s83VarR = uq.R(pq1.g, nv0Var);
            s83 s83VarR2 = uq.R(pq1.i, nv0Var);
            bl3 bl3Var = rn.f1;
            u10 u10Var = gk3VarZ.a;
            d42 d42Var = gk3VarZ.d;
            boolean zBooleanValue = ((Boolean) u10Var.h()).booleanValue();
            nv0Var.a0(143964305);
            float f4 = zBooleanValue ? 1.0f : 0.8f;
            nv0Var.p(false);
            Float fValueOf = Float.valueOf(f4);
            boolean zBooleanValue2 = ((Boolean) d42Var.getValue()).booleanValue();
            nv0Var.a0(143964305);
            float f5 = zBooleanValue2 ? 1.0f : 0.8f;
            nv0Var.p(false);
            Float fValueOf2 = Float.valueOf(f5);
            gk3VarZ.f();
            nv0Var.a0(-745957716);
            nv0Var.p(false);
            boolean z = true;
            ek3 ek3VarH = w7.H(gk3VarZ, fValueOf, fValueOf2, s83VarR, bl3Var, nv0Var, 0);
            boolean zBooleanValue3 = ((Boolean) gk3VarZ.a.h()).booleanValue();
            nv0Var.a0(892761509);
            float f6 = zBooleanValue3 ? 1.0f : 0.0f;
            nv0Var.p(false);
            Float fValueOf3 = Float.valueOf(f6);
            boolean zBooleanValue4 = ((Boolean) d42Var.getValue()).booleanValue();
            nv0Var.a0(892761509);
            float f7 = zBooleanValue4 ? 1.0f : 0.0f;
            nv0Var.p(false);
            Float fValueOf4 = Float.valueOf(f7);
            gk3VarZ.f();
            nv0Var.a0(2839488);
            nv0Var.p(false);
            ek3 ek3VarH2 = w7.H(gk3VarZ, fValueOf3, fValueOf4, s83VarR2, bl3Var, nv0Var, 0);
            boolean zBooleanValue5 = ((Boolean) nv0Var.j(r31.a)).booleanValue();
            boolean zG = nv0Var.g(zBooleanValue5) | nv0Var.f(ek3VarH);
            if ((i3 & 112) != 32) {
                z = false;
            }
            boolean zF = z | zG | nv0Var.f(ek3VarH2);
            Object objO = nv0Var.O();
            if (zF || objO == c20.a) {
                i2 = 0;
                f3 = 0.0f;
                Object bo1Var = new bo1(zBooleanValue5, ps1Var, os1Var, ek3VarH, ek3VarH2);
                nv0Var.j0(bo1Var);
                objO = bo1Var;
            } else {
                i2 = 0;
                f3 = 0.0f;
            }
            int i4 = i3 >> 9;
            int i5 = i3 >> 6;
            hb3.a(vm1.z(yp1.a, (ns0) objO), z13Var, j, 0L, f3, f2, null, gq.N(-1463404422, new do1(bq1Var, es2Var, d00Var, i2), nv0Var), nv0Var, (i4 & 896) | (i4 & 112) | 12582912 | (57344 & i5) | (458752 & i5) | (i5 & 3670016), 8);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new rs0(ps1Var, os1Var, es2Var, z13Var, j, f2, d00Var, i) { // from class: co1
                public final /* synthetic */ ps1 g;
                public final /* synthetic */ os1 h;
                public final /* synthetic */ es2 i;
                public final /* synthetic */ z13 j;
                public final /* synthetic */ long k;
                public final /* synthetic */ float l;
                public final /* synthetic */ d00 m;

                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = jo3.y(385);
                    lr.d(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (nv0) obj, iY);
                    return dm3.a;
                }
            };
        }
    }

    public static final void e(rs0 rs0Var, cs0 cs0Var, bq1 bq1Var, boolean z, un1 un1Var, x12 x12Var, nv0 nv0Var, int i) {
        int i2;
        nv0Var.b0(-1325192924);
        if ((i & 6) == 0) {
            i2 = (nv0Var.h(rs0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= nv0Var.h(cs0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= nv0Var.f(bq1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= nv0Var.h(null) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= nv0Var.h(null) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= nv0Var.g(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= nv0Var.f(un1Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= nv0Var.f(x12Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= nv0Var.f(null) ? 67108864 : 33554432;
        }
        if (nv0Var.R(i2 & 1, (38347923 & i2) != 38347922)) {
            bq1 bq1VarI = f80.I(j43.n(j43.c(rn.x(bq1Var, null, ko2.a(0.0f, 6, 0L, true), z, null, cs0Var, 24), 1.0f), 112.0f, 48.0f, 280.0f, 8), x12Var);
            dp2 dp2VarA = cp2.a(n92.b, f5.q, nv0Var, 48);
            int iC = lq.C(nv0Var);
            n52 n52VarL = nv0Var.l();
            bq1 bq1VarM = M(nv0Var, bq1VarI);
            w10.c.getClass();
            nv0Var.d0();
            if (nv0Var.S) {
                nv0Var.k(tb1.Y);
            } else {
                nv0Var.m0();
            }
            y02.F(f5.E, nv0Var, dp2VarA);
            y02.F(f5.D, nv0Var, n52VarL);
            z00 z00Var = f5.F;
            if (nv0Var.S || !s51.n(nv0Var.O(), Integer.valueOf(iC))) {
                nc2.q(iC, nv0Var, iC, z00Var);
            }
            y02.F(f5.C, nv0Var, bq1VarM);
            mg3.a(((ol3) nv0Var.j(ql3.a)).m, gq.N(865999929, new eo1(un1Var, z, rs0Var), nv0Var), nv0Var, 48);
            nv0Var.p(true);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new s9(rs0Var, cs0Var, bq1Var, z, un1Var, x12Var, i);
        }
    }

    public static final void f(boolean z, ns0 ns0Var, bq1 bq1Var, d00 d00Var, nv0 nv0Var, final int i) {
        d00 d00Var2;
        final bq1 bq1Var2;
        int i2;
        int i3;
        final int i4;
        Object obj;
        final as3 as3Var;
        final os1 os1Var;
        final boolean z2 = z;
        final ns0 ns0Var2 = ns0Var;
        nv0Var.b0(1597265892);
        int i5 = i | (nv0Var.g(z2) ? 4 : 2);
        if ((i & 48) == 0) {
            i5 |= nv0Var.h(ns0Var2) ? 32 : 16;
        }
        int i6 = i5 | 384;
        if (nv0Var.R(i6 & 1, (i6 & 1171) != 1170)) {
            Object obj2 = (Configuration) nv0Var.j(x7.a);
            View view = (View) nv0Var.j(x7.f);
            boolean zF = nv0Var.f(obj2) | nv0Var.f(view);
            Object objO = nv0Var.O();
            Object obj3 = c20.a;
            if (zF || objO == obj3) {
                objO = new as3(view);
                nv0Var.j0(objO);
            }
            as3 as3Var2 = (as3) objO;
            ua0 ua0Var = (ua0) nv0Var.j(s20.h);
            int iP0 = ua0Var.p0(48.0f);
            Object objO2 = nv0Var.O();
            if (objO2 == obj3) {
                objO2 = b32.w(null);
                nv0Var.j0(objO2);
            }
            os1 os1Var2 = (os1) objO2;
            Object objO3 = nv0Var.O();
            if (objO3 == obj3) {
                objO3 = new a42(0);
                nv0Var.j0(objO3);
            }
            a42 a42Var = (a42) objO3;
            Object objO4 = nv0Var.O();
            if (objO4 == obj3) {
                objO4 = new a42(0);
                nv0Var.j0(objO4);
            }
            final a42 a42Var2 = (a42) objO4;
            Object objO5 = nv0Var.O();
            if (objO5 == obj3) {
                objO5 = new ip0();
                nv0Var.j0(objO5);
            }
            ip0 ip0Var = (ip0) objO5;
            t73 t73Var = (t73) nv0Var.j(s20.q);
            String strP = g12.P(2131624403, nv0Var);
            String strP2 = g12.P(2131624402, nv0Var);
            String strP3 = g12.P(2131624404, nv0Var);
            Object objO6 = nv0Var.O();
            if (objO6 == obj3) {
                objO6 = b32.w(new hk0());
                nv0Var.j0(objO6);
            }
            os1 os1Var3 = (os1) objO6;
            Object objO7 = nv0Var.O();
            if (objO7 == obj3) {
                objO7 = b32.w(Boolean.FALSE);
                nv0Var.j0(objO7);
            }
            os1 os1Var4 = (os1) objO7;
            int i7 = i6 & 14;
            int i8 = i6 & 112;
            boolean zF2 = (i7 == 4) | (i8 == 32) | nv0Var.f(as3Var2) | nv0Var.f(ua0Var);
            Object objO8 = nv0Var.O();
            if (zF2 || objO8 == obj3) {
                i2 = i7;
                i3 = i8;
                i4 = iP0;
                obj = obj3;
                as3Var = as3Var2;
                Object ok0Var = new ok0(ip0Var, z2, os1Var4, strP, strP2, strP3, t73Var, os1Var3, ns0Var2, a42Var, a42Var2);
                ip0Var = ip0Var;
                z2 = z2;
                ns0Var2 = ns0Var2;
                nv0Var.j0(ok0Var);
                objO8 = ok0Var;
            } else {
                as3Var = as3Var2;
                i2 = i7;
                i3 = i8;
                i4 = iP0;
                obj = obj3;
            }
            ok0 ok0Var2 = (ok0) objO8;
            boolean zH = nv0Var.h(as3Var) | nv0Var.d(i4);
            Object objO9 = nv0Var.O();
            if (zH || objO9 == obj) {
                objO9 = new py(as3Var, i4, os1Var2, a42Var, a42Var2);
                os1Var = os1Var2;
                nv0Var.j0(objO9);
            } else {
                os1Var = os1Var2;
            }
            yp1 yp1Var = yp1.a;
            bq1 bq1VarU = n92.u(yp1Var, (ns0) objO9);
            cn1 cn1VarD = eo.d(f5.g, false);
            int iC = lq.C(nv0Var);
            n52 n52VarL = nv0Var.l();
            bq1 bq1VarM = M(nv0Var, bq1VarU);
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
            d00Var2 = d00Var;
            d00Var2.e(ok0Var2, nv0Var, 48);
            nv0Var.p(true);
            if (z2) {
                nv0Var.a0(209894723);
                boolean zH2 = nv0Var.h(as3Var) | nv0Var.d(i4);
                Object objO10 = nv0Var.O();
                if (zH2 || objO10 == obj) {
                    objO10 = new cs0() { // from class: lk0
                        /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
                        @Override // defpackage.cs0
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object a() {
                            /*
                                r7 = this;
                                as3 r0 = r1
                                android.view.View r0 = r0.a
                                android.graphics.Rect r1 = new android.graphics.Rect
                                r1.<init>()
                                r0.getWindowVisibleDisplayFrame(r1)
                                int r0 = r1.top
                                int r1 = r1.bottom
                                os1 r2 = r3
                                java.lang.Object r2 = r2.getValue()
                                ab1 r2 = (defpackage.ab1) r2
                                if (r2 == 0) goto L34
                                boolean r3 = r2.t0()
                                if (r3 != 0) goto L21
                                goto L34
                            L21:
                                r3 = 0
                                long r3 = r2.D(r3)
                                long r5 = r2.i0()
                                long r5 = defpackage.lr.T(r5)
                                jk2 r2 = defpackage.b32.b(r3, r5)
                                goto L36
                            L34:
                                jk2 r2 = defpackage.jk2.e
                            L36:
                                int r3 = r2
                                int r4 = r0 + r3
                                int r3 = r1 - r3
                                float r5 = r2.b
                                float r1 = (float) r1
                                int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                                if (r1 > 0) goto L58
                                float r1 = r2.d
                                float r0 = (float) r0
                                int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                                if (r0 >= 0) goto L4b
                                goto L58
                            L4b:
                                float r0 = (float) r4
                                float r5 = r5 - r0
                                float r0 = (float) r3
                                float r0 = r0 - r1
                                float r0 = java.lang.Math.max(r5, r0)
                                int r0 = defpackage.vm1.M(r0)
                                goto L5a
                            L58:
                                int r0 = r3 - r4
                            L5a:
                                r1 = 0
                                int r0 = java.lang.Math.max(r0, r1)
                                a42 r7 = r4
                                r7.h(r0)
                                dm3 r7 = defpackage.dm3.a
                                return r7
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.lk0.a():java.lang.Object");
                        }
                    };
                    nv0Var.j0(objO10);
                }
                ur.h((cs0) objO10, nv0Var, 0);
                nv0Var.p(false);
            } else {
                nv0Var.a0(210228190);
                nv0Var.p(false);
            }
            int i9 = i2;
            boolean z3 = i9 == 4;
            Object objO11 = nv0Var.O();
            if (z3 || objO11 == obj) {
                objO11 = new ew(2, ip0Var, z2);
                nv0Var.j0(objO11);
            }
            rn.t((cs0) objO11, nv0Var);
            boolean z4 = i3 == 32;
            Object objO12 = nv0Var.O();
            if (z4 || objO12 == obj) {
                objO12 = new mk0(ns0Var2, 0);
                nv0Var.j0(objO12);
            }
            w7.d(z2, (cs0) objO12, nv0Var, i9);
            bq1Var2 = yp1Var;
        } else {
            d00Var2 = d00Var;
            nv0Var.U();
            bq1Var2 = bq1Var;
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            final d00 d00Var3 = d00Var2;
            xj2VarT.d = new rs0() { // from class: nk0
                @Override // defpackage.rs0
                public final Object f(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    lr.f(z2, ns0Var2, bq1Var2, d00Var3, (nv0) obj4, jo3.y(i | 1));
                    return dm3.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(int r23, int r24, defpackage.g5 r25, defpackage.w8 r26, defpackage.kj r27, defpackage.rm0 r28, defpackage.ns0 r29, defpackage.nv0 r30, defpackage.ie1 r31, defpackage.bq1 r32, defpackage.x12 r33, boolean r34) {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lr.g(int, int, g5, w8, kj, rm0, ns0, nv0, ie1, bq1, x12, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x030b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x03ee A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03f0  */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r26v4 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r47v0, types: [nv0] */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(int r40, int r41, defpackage.g5 r42, defpackage.w8 r43, defpackage.kj r44, defpackage.rm0 r45, defpackage.ns0 r46, defpackage.nv0 r47, defpackage.ie1 r48, defpackage.bq1 r49, defpackage.x12 r50, boolean r51) {
        /*
            Method dump skipped, instruction units count: 1106
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lr.h(int, int, g5, w8, kj, rm0, ns0, nv0, ie1, bq1, x12, boolean):void");
    }

    public static final boolean i(q11 q11Var) {
        return q11Var.h && !q11Var.d;
    }

    public static final aq1 j(ia0 ia0Var, int i) {
        aq1 aq1Var = ((aq1) ia0Var).f.k;
        if (aq1Var == null || (aq1Var.i & i) == 0) {
            return null;
        }
        while (aq1Var != null) {
            int i2 = aq1Var.h;
            if ((i2 & 2) != 0) {
                return null;
            }
            if ((i2 & i) != 0) {
                return aq1Var;
            }
            aq1Var = aq1Var.k;
        }
        return null;
    }

    public static final String k(Object[] objArr, int i, int i2, g0 g0Var) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == g0Var) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0011, code lost:
    
        if (r5 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0015, code lost:
    
        return r2 - r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0026 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int l(int r2, int r3, int r4, boolean r5) {
        /*
            r0 = 0
            if (r3 < r4) goto L8
            if (r5 == 0) goto L6
            return r0
        L6:
            int r4 = r4 - r3
            return r4
        L8:
            if (r5 != 0) goto Ld
            if (r3 > r2) goto L16
            goto L11
        Ld:
            int r1 = r4 - r3
            if (r1 <= r2) goto L16
        L11:
            if (r5 == 0) goto L14
            goto L21
        L14:
            int r2 = r2 - r3
            return r2
        L16:
            if (r5 == 0) goto L1b
            if (r3 > r2) goto L24
            goto L1f
        L1b:
            int r1 = r4 - r3
            if (r1 <= r2) goto L24
        L1f:
            if (r5 != 0) goto L22
        L21:
            return r2
        L22:
            int r2 = r2 - r3
            return r2
        L24:
            if (r5 != 0) goto L27
            return r0
        L27:
            int r4 = r4 - r3
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lr.l(int, int, int, boolean):int");
    }

    public static fn0 m(fn0 fn0Var, int i) {
        jp jpVar;
        if (i < 0 && i != -2 && i != -1) {
            c.g(by1.e(i, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was "));
            return null;
        }
        if (i == -1) {
            i = 0;
            jpVar = jp.g;
        } else {
            jpVar = jp.f;
        }
        boolean z = fn0Var instanceof dt0;
        li0 li0Var = li0.f;
        return z ? ((dt0) fn0Var).b(li0Var, i, jpVar) : new os(fn0Var, li0Var, i, jpVar);
    }

    public static void n(long j, hp hpVar, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        ArrayList arrayList3;
        long j2;
        int i6;
        int i7 = i;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i2 >= i3) {
            c.p("Failed requirement.");
            return;
        }
        for (int i8 = i2; i8 < i3; i8++) {
            if (((kq) arrayList4.get(i8)).b() < i7) {
                c.p("Failed requirement.");
                return;
            }
        }
        kq kqVar = (kq) arrayList.get(i2);
        kq kqVar2 = (kq) arrayList4.get(i3 - 1);
        if (i7 == kqVar.b()) {
            int iIntValue = ((Number) arrayList5.get(i2)).intValue();
            int i9 = i2 + 1;
            kq kqVar3 = (kq) arrayList4.get(i9);
            i4 = i9;
            i5 = iIntValue;
            kqVar = kqVar3;
        } else {
            i4 = i2;
            i5 = -1;
        }
        if (kqVar.e(i7) == kqVar2.e(i7)) {
            int iMin = Math.min(kqVar.b(), kqVar2.b());
            int i10 = 0;
            for (int i11 = i7; i11 < iMin && kqVar.e(i11) == kqVar2.e(i11); i11++) {
                i10++;
            }
            long j3 = (hpVar.g / 4) + j + 2 + ((long) i10) + 1;
            hpVar.B(-i10);
            hpVar.B(i5);
            int i12 = i7 + i10;
            while (i7 < i12) {
                hpVar.B(kqVar.e(i7) & 255);
                i7++;
            }
            if (i4 + 1 == i3) {
                if (i12 == ((kq) arrayList4.get(i4)).b()) {
                    hpVar.B(((Number) arrayList5.get(i4)).intValue());
                    return;
                } else {
                    c.q("Check failed.");
                    return;
                }
            }
            hp hpVar2 = new hp();
            hpVar.B(((int) ((hpVar2.g / 4) + j3)) * (-1));
            n(j3, hpVar2, i12, arrayList4, i4, i3, arrayList5);
            hpVar.u(hpVar2);
            return;
        }
        int i13 = 1;
        for (int i14 = i4 + 1; i14 < i3; i14++) {
            if (((kq) arrayList4.get(i14 - 1)).e(i7) != ((kq) arrayList4.get(i14)).e(i7)) {
                i13++;
            }
        }
        long j4 = (hpVar.g / 4) + j + 2 + ((long) (i13 * 2));
        hpVar.B(i13);
        hpVar.B(i5);
        for (int i15 = i4; i15 < i3; i15++) {
            int iE = ((kq) arrayList4.get(i15)).e(i7);
            if (i15 == i4 || iE != ((kq) arrayList4.get(i15 - 1)).e(i7)) {
                hpVar.B(iE & 255);
            }
        }
        hp hpVar3 = new hp();
        int i16 = i4;
        while (i16 < i3) {
            byte bE = ((kq) arrayList4.get(i16)).e(i7);
            int i17 = i16 + 1;
            int i18 = i17;
            while (true) {
                if (i18 >= i3) {
                    i18 = i3;
                    break;
                } else if (bE != ((kq) arrayList4.get(i18)).e(i7)) {
                    break;
                } else {
                    i18++;
                }
            }
            if (i17 == i18 && i7 + 1 == ((kq) arrayList4.get(i16)).b()) {
                hpVar.B(((Number) arrayList5.get(i16)).intValue());
                arrayList3 = arrayList5;
                j2 = j4;
                i6 = i18;
            } else {
                hpVar.B(((int) ((hpVar3.g / 4) + j4)) * (-1));
                arrayList3 = arrayList5;
                j2 = j4;
                i6 = i18;
                n(j2, hpVar3, i7 + 1, arrayList, i16, i6, arrayList3);
                arrayList4 = arrayList;
            }
            j4 = j2;
            i16 = i6;
            arrayList5 = arrayList3;
        }
        hpVar.u(hpVar3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long o(defpackage.m41 r11, defpackage.m41 r12) {
        /*
            int r0 = r12.a
            int r1 = r12.d
            int r2 = r12.a
            int r3 = r12.c
            int r4 = r12.b
            int r5 = r11.c
            int r6 = r11.b
            int r7 = r11.d
            int r8 = r11.a
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = 0
            if (r0 < r5) goto L19
        L17:
            r11 = r10
            goto L39
        L19:
            if (r3 > r8) goto L1d
            r11 = r9
            goto L39
        L1d:
            int r0 = r12.d()
            if (r0 != 0) goto L24
            goto L17
        L24:
            int r0 = java.lang.Math.max(r8, r2)
            int r11 = r11.c
            int r11 = java.lang.Math.min(r11, r3)
            int r11 = r11 + r0
            int r11 = r11 / 2
            int r11 = r11 - r2
            float r11 = (float) r11
            int r0 = r12.d()
            float r0 = (float) r0
            float r11 = r11 / r0
        L39:
            if (r4 < r7) goto L3d
        L3b:
            r9 = r10
            goto L5b
        L3d:
            if (r1 > r6) goto L40
            goto L5b
        L40:
            int r0 = r12.b()
            if (r0 != 0) goto L47
            goto L3b
        L47:
            int r0 = java.lang.Math.max(r6, r4)
            int r1 = java.lang.Math.min(r7, r1)
            int r1 = r1 + r0
            int r1 = r1 / 2
            int r1 = r1 - r4
            float r0 = (float) r1
            int r12 = r12.b()
            float r12 = (float) r12
            float r9 = r0 / r12
        L5b:
            long r11 = defpackage.d32.g(r11, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lr.o(m41, m41):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable p(defpackage.fn0 r4, defpackage.gn0 r5, defpackage.q40 r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof defpackage.sn0
            if (r0 == 0) goto L13
            r0 = r6
            sn0 r0 = (defpackage.sn0) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            sn0 r0 = new sn0
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.j
            int r1 = r0.k
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L30
            if (r1 != r2) goto L2a
            qk2 r4 = r0.i
            defpackage.y02.Q(r6)     // Catch: java.lang.Throwable -> L28
            return r3
        L28:
            r5 = move-exception
            goto L4d
        L2a:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r4)
            return r3
        L30:
            defpackage.y02.Q(r6)
            qk2 r6 = new qk2
            r6.<init>()
            pc0 r1 = new pc0     // Catch: java.lang.Throwable -> L4b
            r1.<init>(r5, r6)     // Catch: java.lang.Throwable -> L4b
            r0.i = r6     // Catch: java.lang.Throwable -> L4b
            r0.k = r2     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r4 = r4.a(r1, r0)     // Catch: java.lang.Throwable -> L4b
            y50 r5 = defpackage.y50.f
            if (r4 != r5) goto L4a
            return r5
        L4a:
            return r3
        L4b:
            r5 = move-exception
            r4 = r6
        L4d:
            java.lang.Object r4 = r4.f
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            if (r4 == 0) goto L59
            boolean r6 = r4.equals(r5)
            if (r6 != 0) goto L7c
        L59:
            o50 r6 = r0.g
            r6.getClass()
            f5 r0 = defpackage.f5.b0
            m50 r6 = r6.m(r0)
            j61 r6 = (defpackage.j61) r6
            if (r6 == 0) goto L7d
            boolean r0 = r6.isCancelled()
            if (r0 != 0) goto L6f
            goto L7d
        L6f:
            java.util.concurrent.CancellationException r6 = r6.o()
            if (r6 == 0) goto L7d
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L7c
            goto L7d
        L7c:
            throw r5
        L7d:
            if (r4 != 0) goto L80
            return r5
        L80:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L88
            defpackage.uq.j(r4, r5)
            throw r4
        L88:
            defpackage.uq.j(r5, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lr.p(fn0, gn0, q40):java.io.Serializable");
    }

    public static final boolean q(q11 q11Var) {
        return !q11Var.h && q11Var.d;
    }

    public static bq1 r(bq1 bq1Var) {
        return bq1Var.d(new rt(new fi1(0)));
    }

    public static final Object s(fn0 fn0Var, rs0 rs0Var, mb3 mb3Var) {
        int i = ao0.a;
        Object objA = m(new ss(new zn0(rs0Var, null, 0), fn0Var, li0.f, -2, jp.f), 0).a(px1.f, mb3Var);
        dm3 dm3Var = dm3.a;
        y50 y50Var = y50.f;
        if (objA != y50Var) {
            objA = dm3Var;
        }
        return objA == y50Var ? objA : dm3Var;
    }

    public static bq1 t(bq1 bq1Var, ss0 ss0Var) {
        return bq1Var.d(new b20(ss0Var));
    }

    public static jq0 u(Context context) {
        ProviderInfo providerInfo;
        hq0 hq0Var;
        ApplicationInfo applicationInfo;
        int i = 19;
        zj o80Var = Build.VERSION.SDK_INT >= 28 ? new o80(i) : new zj(i);
        PackageManager packageManager = context.getPackageManager();
        jo3.h(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            hq0Var = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrH = o80Var.h(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrH) {
                    arrayList.add(signature.toByteArray());
                }
                hq0Var = new hq0(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException e2) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e2);
                hq0Var = null;
            }
        }
        if (hq0Var == null) {
            return null;
        }
        return new jq0(new iq0(context, hq0Var));
    }

    public static final nu1 v(Context context) {
        context.getClass();
        nu1 nu1Var = new nu1(context);
        wt1 wt1Var = nu1Var.b;
        zv1 zv1Var = wt1Var.s;
        zv1Var.a(new f10(zv1Var));
        zv1 zv1Var2 = wt1Var.s;
        zv1Var2.a(new h10());
        zv1Var2.a(new mb0());
        return nu1Var;
    }

    public static boolean w(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        WeakHashMap weakHashMap = mq3.a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList2 = lq3.d;
            lq3 lq3Var = (lq3) view.getTag(2131230904);
            WeakReference weakReference = null;
            if (lq3Var == null) {
                lq3Var = new lq3();
                lq3Var.a = null;
                lq3Var.b = null;
                lq3Var.c = null;
                view.setTag(2131230904, lq3Var);
            }
            WeakReference weakReference2 = lq3Var.c;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                lq3Var.c = new WeakReference(keyEvent);
                if (lq3Var.b == null) {
                    lq3Var.b = new SparseArray();
                }
                SparseArray sparseArray = lq3Var.b;
                if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
                    sparseArray.removeAt(iIndexOfKey);
                }
                if (weakReference == null) {
                    weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    View view2 = (View) weakReference.get();
                    if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(2131230905)) == null || (size = arrayList.size() - 1) < 0) {
                        return true;
                    }
                    arrayList.get(size).getClass();
                    qn1.b();
                    return false;
                }
            }
        }
        return false;
    }

    public static boolean x(f71 f71Var, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (f71Var != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return f71Var.superDispatchKeyEvent(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window = activity.getWindow();
                if (window.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!d) {
                            try {
                                e = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            d = true;
                        }
                        Method method = e;
                        if (method != null) {
                            try {
                                Object objInvoke = method.invoke(actionBar, keyEvent);
                                if (objInvoke != null) {
                                    zBooleanValue = ((Boolean) objInvoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (zBooleanValue) {
                            return true;
                        }
                    }
                }
                if (window.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window.getDecorView();
                if (mq3.c(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!f) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        g = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    f = true;
                }
                Field field = g;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                        onKeyListener = null;
                    }
                } else {
                    onKeyListener = null;
                }
                if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                    return true;
                }
                Window window2 = dialog.getWindow();
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView2 = window2.getDecorView();
                if (mq3.c(decorView2, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
            }
            if ((view != null && mq3.c(view, keyEvent)) || f71Var.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public static final fn0 y(fn0 fn0Var) {
        return ((fn0Var instanceof g93) || (fn0Var instanceof qc0)) ? fn0Var : new qc0(fn0Var);
    }

    public static final void z(qf0 qf0Var, qw0 qw0Var) {
        long j;
        Canvas canvas;
        boolean z;
        boolean z2;
        Canvas canvas2;
        float f2;
        pr prVarK = qf0Var.Z().k();
        qw0 qw0Var2 = (qw0) qf0Var.Z().h;
        sw0 sw0Var = qw0Var.a;
        if (qw0Var.s) {
            return;
        }
        long j2 = qw0Var.h;
        Canvas canvasA = o6.a(prVarK);
        boolean zIsHardwareAccelerated = canvasA.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            long j3 = qw0Var.t;
            float f3 = (int) (j3 >> 32);
            float f4 = f3 - qw0Var.v;
            float f5 = (int) (j3 & 4294967295L);
            float f6 = f5 - qw0Var.w;
            long j4 = qw0Var.u;
            float f7 = f3 + ((int) (j4 >> 32)) + qw0Var.x;
            float f8 = f5 + ((int) (j4 & 4294967295L)) + qw0Var.y;
            float fT = sw0Var.t();
            yx yxVarL = sw0Var.L();
            int iX = sw0Var.x();
            if (fT >= 1.0f && iX == 3 && yxVarL == null) {
                canvas2 = canvasA;
                if (sw0Var.J() != 1) {
                    canvas2.save();
                    f2 = f4;
                    canvasA = canvas2;
                }
                canvasA.translate(f2, f6);
                Matrix matrixN = sw0Var.N();
                matrixN.preTranslate(qw0Var.v, qw0Var.w);
                canvasA.concat(matrixN);
                qw0Var.h = gy1.d(qw0Var.h, (((long) Float.floatToRawIntBits(qw0Var.w)) & 4294967295L) | (((long) Float.floatToRawIntBits(qw0Var.v)) << 32));
            } else {
                canvas2 = canvasA;
            }
            w9 w9VarD = qw0Var.p;
            if (w9VarD == null) {
                w9VarD = cl3.d();
                qw0Var.p = w9VarD;
            }
            w9VarD.f(fT);
            w9VarD.g(iX);
            w9VarD.i(yxVarL);
            Paint paint = (Paint) w9VarD.b;
            f2 = f4;
            canvasA = canvas2;
            canvasA.saveLayer(f2, f6, f7, f8, paint);
            canvasA.translate(f2, f6);
            Matrix matrixN2 = sw0Var.N();
            matrixN2.preTranslate(qw0Var.v, qw0Var.w);
            canvasA.concat(matrixN2);
            qw0Var.h = gy1.d(qw0Var.h, (((long) Float.floatToRawIntBits(qw0Var.w)) & 4294967295L) | (((long) Float.floatToRawIntBits(qw0Var.v)) << 32));
        }
        qw0Var.a();
        if (!sw0Var.Q()) {
            try {
                qw0Var.a.F(qw0Var.b, qw0Var.c, qw0Var, qw0Var.e);
            } catch (Throwable unused) {
            }
        }
        boolean z3 = sw0Var.P() > 0.0f;
        if (z3) {
            prVarK.r();
        }
        boolean z4 = !zIsHardwareAccelerated && qw0Var.A;
        if (z4) {
            prVarK.l();
            vr vrVarD = qw0Var.d();
            if (vrVarD instanceof w02) {
                pr.k(prVarK, ((w02) vrVarD).l);
            } else if (vrVarD instanceof x02) {
                da daVarA = qw0Var.m;
                if (daVarA != null) {
                    daVarA.h();
                } else {
                    daVarA = ga.a();
                    qw0Var.m = daVarA;
                }
                da.b(daVarA, ((x02) vrVarD).l);
                prVarK.s(daVarA);
            } else {
                if (!(vrVarD instanceof v02)) {
                    c.k();
                    return;
                }
                prVarK.s(((v02) vrVarD).l);
            }
        }
        if (qw0Var2 != null) {
            ot otVar = qw0Var2.r;
            if (!otVar.a) {
                l21.a("Only add dependencies during a tracking");
            }
            js1 js1Var = (js1) otVar.d;
            if (js1Var != null) {
                js1Var.a(qw0Var);
            } else if (((qw0) otVar.b) != null) {
                js1 js1Var2 = or2.a;
                js1 js1Var3 = new js1();
                qw0 qw0Var3 = (qw0) otVar.b;
                qw0Var3.getClass();
                js1Var3.a(qw0Var3);
                js1Var3.a(qw0Var);
                otVar.d = js1Var3;
                otVar.b = null;
            } else {
                otVar.b = qw0Var;
            }
            js1 js1Var4 = (js1) otVar.e;
            if (js1Var4 != null) {
                z2 = !js1Var4.l(qw0Var);
            } else if (((qw0) otVar.c) != qw0Var) {
                z2 = true;
            } else {
                otVar.c = null;
                z2 = false;
            }
            if (z2) {
                qw0Var.q++;
            }
        }
        if (((n6) prVarK).a.isHardwareAccelerated()) {
            j = j2;
            canvas = canvasA;
            z = z3;
            sw0Var.I(prVarK);
        } else {
            rr rrVar = qw0Var.o;
            if (rrVar == null) {
                rrVar = new rr();
                qw0Var.o = rrVar;
            }
            pi piVar = rrVar.g;
            ua0 ua0Var = qw0Var.b;
            bb1 bb1Var = qw0Var.c;
            long jT = T(qw0Var.u);
            ua0 ua0VarO = piVar.o();
            bb1 bb1VarW = piVar.w();
            canvas = canvasA;
            pr prVarK2 = piVar.k();
            j = j2;
            long jA = piVar.A();
            z = z3;
            qw0 qw0Var4 = (qw0) piVar.h;
            piVar.N(ua0Var);
            piVar.O(bb1Var);
            piVar.M(prVarK);
            piVar.Q(jT);
            piVar.h = qw0Var;
            prVarK.l();
            try {
                qw0Var.c(rrVar);
            } finally {
                prVarK.i();
                piVar.N(ua0VarO);
                piVar.O(bb1VarW);
                piVar.M(prVarK2);
                piVar.Q(jA);
                piVar.h = qw0Var4;
            }
        }
        if (z4) {
            prVarK.i();
        }
        if (z) {
            prVarK.n();
        }
        if (!zIsHardwareAccelerated) {
            canvas.restore();
        }
        qw0Var.h = j;
    }
}
