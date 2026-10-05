package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class f5 implements yn, n50, va0, up, un2, h73, ua3 {
    public static final v3 B;
    public static final z00 C;
    public static final z00 D;
    public static final z00 E;
    public static final z00 F;
    public static final u0 G;
    public static final /* synthetic */ f5 L;
    public static final f5 M;
    public static final /* synthetic */ f5 N;
    public static final f5 O;
    public static final /* synthetic */ f5 c0;
    public static final f5 g0;
    public final /* synthetic */ int f;
    public static final vm g = new vm(-1.0f, -1.0f);
    public static final vm h = new vm(0.0f, -1.0f);
    public static final vm i = new vm(1.0f, -1.0f);
    public static final vm j = new vm(-1.0f, 0.0f);
    public static final vm k = new vm(0.0f, 0.0f);
    public static final vm l = new vm(1.0f, 0.0f);
    public static final vm m = new vm(-1.0f, 1.0f);
    public static final vm n = new vm(0.0f, 1.0f);
    public static final vm o = new vm(1.0f, 1.0f);
    public static final um p = new um(-1.0f);
    public static final um q = new um(0.0f);
    public static final um r = new um(1.0f);
    public static final tm s = new tm(-1.0f);
    public static final tm t = new tm(0.0f);
    public static final tm u = new tm(1.0f);
    public static final f5 v = new f5(1);
    public static final f5 w = new f5(2);
    public static final f5 x = new f5(3);
    public static final f5 y = new f5(4);
    public static final c z = new c(10);
    public static final /* synthetic */ f5 A = new f5(6);
    public static final f5 H = new f5(7);
    public static final d8 I = new d8(0);
    public static final d8 J = new d8(1);
    public static final d8 K = new d8(2);
    public static final f5 P = new f5(13);
    public static final f5 Q = new f5(14);
    public static final f5 R = new f5(15);
    public static final bb1 S = bb1.f;
    public static final xa0 T = new xa0(1.0f, 1.0f);
    public static final f5 U = new f5(16);
    public static final f5 V = new f5(17);
    public static final f5 W = new f5(18);
    public static final jk2 X = new jk2(Float.NaN, Float.NaN, Float.NaN, Float.NaN);
    public static final f5 Y = new f5(20);
    public static final /* synthetic */ f5 Z = new f5(21);
    public static final /* synthetic */ f5 a0 = new f5(22);
    public static final /* synthetic */ f5 b0 = new f5(23);
    public static final /* synthetic */ f5 d0 = new f5(25);
    public static final f5 e0 = new f5(26);
    public static final f5 f0 = new f5(27);
    public static final f5 h0 = new f5(29);

    static {
        int i2 = 10;
        int i3 = 24;
        B = new v3(i3);
        int i4 = 9;
        byte b = 0;
        C = new z00(i4, b);
        D = new z00(i2, b);
        int i5 = 11;
        E = new z00(i5, b);
        int i6 = 12;
        F = new z00(i6, b);
        int i7 = 28;
        G = new u0(i7);
        L = new f5(i4);
        M = new f5(i2);
        N = new f5(i5);
        O = new f5(i6);
        c0 = new f5(i3);
        g0 = new f5(i7);
    }

    public /* synthetic */ f5(int i2) {
        this.f = i2;
    }

    public static se3 i(int i2, nv0 nv0Var) {
        return l((fy) nv0Var.j(hy.a), nv0Var);
    }

    public static se3 j(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, nv0 nv0Var, int i2) {
        long j20 = (i2 & 4) != 0 ? wx.g : j4;
        long j21 = wx.g;
        return l((fy) nv0Var.j(hy.a), nv0Var).a(j2, j3, j20, j21, (i2 & 16) != 0 ? j21 : j5, (i2 & 32) != 0 ? j21 : j6, (i2 & 64) != 0 ? j21 : j7, j21, j8, j21, null, j9, j10, (i2 & 8192) != 0 ? j21 : j11, j21, j21, j21, j21, j21, (524288 & i2) != 0 ? j21 : j12, (1048576 & i2) != 0 ? j21 : j13, j21, j21, j14, j15, (33554432 & i2) != 0 ? j21 : j16, j21, (134217728 & i2) != 0 ? j21 : j17, (268435456 & i2) != 0 ? j21 : j18, (i2 & 536870912) != 0 ? j21 : j19, j21, j21, j21, j21, j21, j21, j21, j21, j21, j21, j21, j21, j21);
    }

    public static se3 l(fy fyVar, nv0 nv0Var) {
        boolean z2;
        se3 se3VarA = fyVar.p0;
        if (se3VarA == null) {
            nv0Var.a0(390452338);
            nv0Var.p(false);
            se3VarA = null;
            z2 = false;
        } else {
            nv0Var.a0(390452339);
            ah3 ah3Var = (ah3) nv0Var.j(bh3.a);
            if (s51.n(se3VarA.k, ah3Var)) {
                z2 = false;
            } else {
                se3VarA = se3VarA.a(se3VarA.a, se3VarA.b, se3VarA.c, se3VarA.d, se3VarA.e, se3VarA.f, se3VarA.g, se3VarA.h, se3VarA.i, se3VarA.j, ah3Var, se3VarA.l, se3VarA.m, se3VarA.n, se3VarA.o, se3VarA.p, se3VarA.q, se3VarA.r, se3VarA.s, se3VarA.t, se3VarA.u, se3VarA.v, se3VarA.w, se3VarA.x, se3VarA.y, se3VarA.z, se3VarA.A, se3VarA.B, se3VarA.C, se3VarA.D, se3VarA.E, se3VarA.F, se3VarA.G, se3VarA.H, se3VarA.I, se3VarA.J, se3VarA.K, se3VarA.L, se3VarA.M, se3VarA.N, se3VarA.O, se3VarA.P, se3VarA.Q);
                fyVar.p0 = se3VarA;
                z2 = false;
            }
            nv0Var.p(z2);
        }
        if (se3VarA != null) {
            nv0Var.a0(-1788515437);
            nv0Var.p(z2);
            return se3VarA;
        }
        nv0Var.a0(-1788321191);
        long jD = hy.d(fyVar, rn.J0);
        long jD2 = hy.d(fyVar, rn.P0);
        gy gyVar = rn.w0;
        long jB = wx.b(0.38f, hy.d(fyVar, gyVar));
        long jD3 = hy.d(fyVar, rn.D0);
        long j2 = wx.f;
        long jD4 = hy.d(fyVar, rn.u0);
        long jD5 = hy.d(fyVar, rn.C0);
        ah3 ah3Var2 = (ah3) nv0Var.j(bh3.a);
        long jD6 = hy.d(fyVar, rn.M0);
        long jD7 = hy.d(fyVar, rn.V0);
        long jB2 = wx.b(0.12f, hy.d(fyVar, rn.z0));
        long jD8 = hy.d(fyVar, rn.G0);
        long jD9 = hy.d(fyVar, rn.L0);
        long jD10 = hy.d(fyVar, rn.U0);
        long jB3 = wx.b(0.38f, hy.d(fyVar, rn.y0));
        long jD11 = hy.d(fyVar, rn.F0);
        long jD12 = hy.d(fyVar, rn.O0);
        long jD13 = hy.d(fyVar, rn.X0);
        long jB4 = wx.b(0.38f, hy.d(fyVar, rn.B0));
        long jD14 = hy.d(fyVar, rn.I0);
        long jD15 = hy.d(fyVar, rn.K0);
        long jD16 = hy.d(fyVar, rn.T0);
        long jB5 = wx.b(0.38f, hy.d(fyVar, rn.x0));
        long jD17 = hy.d(fyVar, rn.E0);
        gy gyVar2 = rn.Q0;
        long jD18 = hy.d(fyVar, gyVar2);
        long jD19 = hy.d(fyVar, gyVar2);
        long jB6 = wx.b(0.38f, hy.d(fyVar, gyVar));
        long jD20 = hy.d(fyVar, gyVar2);
        long jD21 = hy.d(fyVar, rn.N0);
        long jD22 = hy.d(fyVar, rn.W0);
        long jB7 = wx.b(0.38f, hy.d(fyVar, rn.A0));
        long jD23 = hy.d(fyVar, rn.H0);
        gy gyVar3 = rn.R0;
        long jD24 = hy.d(fyVar, gyVar3);
        long jD25 = hy.d(fyVar, gyVar3);
        long jB8 = wx.b(0.38f, hy.d(fyVar, gyVar3));
        long jD26 = hy.d(fyVar, gyVar3);
        gy gyVar4 = rn.S0;
        se3 se3Var = new se3(jD, jD2, jB, jD3, j2, j2, j2, j2, jD4, jD5, ah3Var2, jD6, jD7, jB2, jD8, jD9, jD10, jB3, jD11, jD12, jD13, jB4, jD14, jD15, jD16, jB5, jD17, jD18, jD19, jB6, jD20, jD21, jD22, jB7, jD23, jD24, jD25, jB8, jD26, hy.d(fyVar, gyVar4), hy.d(fyVar, gyVar4), wx.b(0.38f, hy.d(fyVar, gyVar4)), hy.d(fyVar, gyVar4));
        fyVar.p0 = se3Var;
        nv0Var.p(z2);
        return se3Var;
    }

    @Override // defpackage.up
    public long a() {
        return 9205357640488583168L;
    }

    @Override // defpackage.ua3
    public void b(ta3 ta3Var) {
        ta3Var.clear();
    }

    @Override // defpackage.yn
    public Rect c(Activity activity) throws Exception {
        int i2 = this.f;
        xn xnVar = yn.a;
        DisplayCutout displayCutoutC = null;
        switch (i2) {
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                Rect rect = new Rect();
                Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
                defaultDisplay.getRectSize(rect);
                if (!activity.isInMultiWindowMode()) {
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    Resources resources = activity.getResources();
                    int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    int i3 = rect.bottom + dimensionPixelSize;
                    if (i3 == point.y) {
                        rect.bottom = i3;
                    } else {
                        int i4 = rect.right + dimensionPixelSize;
                        if (i4 == point.x) {
                            rect.right = i4;
                        }
                    }
                }
                return rect;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                Rect rect2 = new Rect();
                Configuration configuration = activity.getResources().getConfiguration();
                try {
                    Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(configuration);
                    if (activity.isInMultiWindowMode()) {
                        Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                        objInvoke.getClass();
                        rect2.set((Rect) objInvoke);
                    } else {
                        Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                        objInvoke2.getClass();
                        rect2.set((Rect) objInvoke2);
                    }
                    break;
                } catch (Exception e) {
                    if (!(e instanceof NoSuchFieldException) && !(e instanceof NoSuchMethodException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException)) {
                        throw e;
                    }
                    xnVar.getClass();
                    Log.w(xn.b, e);
                    activity.getWindowManager().getDefaultDisplay().getRectSize(rect2);
                }
                Display defaultDisplay2 = activity.getWindowManager().getDefaultDisplay();
                Point point2 = new Point();
                defaultDisplay2.getRealSize(point2);
                if (!activity.isInMultiWindowMode()) {
                    Resources resources2 = activity.getResources();
                    int identifier2 = resources2.getIdentifier("navigation_bar_height", "dimen", "android");
                    int dimensionPixelSize2 = identifier2 > 0 ? resources2.getDimensionPixelSize(identifier2) : 0;
                    int i5 = rect2.bottom + dimensionPixelSize2;
                    if (i5 == point2.y) {
                        rect2.bottom = i5;
                    } else {
                        int i6 = rect2.right + dimensionPixelSize2;
                        if (i6 == point2.x) {
                            rect2.right = i6;
                        } else if (rect2.left == dimensionPixelSize2) {
                            rect2.left = 0;
                        }
                    }
                }
                if ((rect2.width() < point2.x || rect2.height() < point2.y) && !activity.isInMultiWindowMode()) {
                    try {
                        Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                        constructor.setAccessible(true);
                        Object objNewInstance = constructor.newInstance(null);
                        Method declaredMethod = defaultDisplay2.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(defaultDisplay2, objNewInstance);
                        Field declaredField2 = objNewInstance.getClass().getDeclaredField("displayCutout");
                        declaredField2.setAccessible(true);
                        Object obj2 = declaredField2.get(objNewInstance);
                        if (i1.v(obj2)) {
                            displayCutoutC = i1.c(obj2);
                        }
                    } catch (Exception e2) {
                        if (!(e2 instanceof ClassNotFoundException) && !(e2 instanceof NoSuchMethodException) && !(e2 instanceof NoSuchFieldException) && !(e2 instanceof IllegalAccessException) && !(e2 instanceof InvocationTargetException) && !(e2 instanceof InstantiationException)) {
                            throw e2;
                        }
                        xnVar.getClass();
                        Log.w(xn.b, e2);
                    }
                    if (displayCutoutC != null) {
                        if (rect2.left == displayCutoutC.getSafeInsetLeft()) {
                            rect2.left = 0;
                        }
                        if (point2.x - rect2.right == displayCutoutC.getSafeInsetRight()) {
                            rect2.right = displayCutoutC.getSafeInsetRight() + rect2.right;
                        }
                        if (rect2.top == displayCutoutC.getSafeInsetTop()) {
                            rect2.top = 0;
                        }
                        if (point2.y - rect2.bottom == displayCutoutC.getSafeInsetBottom()) {
                            rect2.bottom = displayCutoutC.getSafeInsetBottom() + rect2.bottom;
                        }
                    }
                    break;
                }
                return rect2;
            default:
                Configuration configuration2 = activity.getResources().getConfiguration();
                try {
                    Field declaredField3 = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField3.setAccessible(true);
                    Object obj3 = declaredField3.get(configuration2);
                    Object objInvoke3 = obj3.getClass().getDeclaredMethod("getBounds", null).invoke(obj3, null);
                    objInvoke3.getClass();
                    return new Rect((Rect) objInvoke3);
                } catch (Exception e3) {
                    if (!(e3 instanceof NoSuchFieldException) && !(e3 instanceof NoSuchMethodException) && !(e3 instanceof IllegalAccessException) && !(e3 instanceof InvocationTargetException)) {
                        throw e3;
                    }
                    xnVar.getClass();
                    Log.w(xn.b, e3);
                    return x.c(activity);
                }
        }
    }

    @Override // defpackage.h73
    public boolean d(Object obj, Object obj2) {
        return false;
    }

    @Override // defpackage.va0
    public float e(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(final boolean z2, final boolean z3, final t41 t41Var, bq1 bq1Var, final se3 se3Var, final z13 z13Var, float f, float f2, nv0 nv0Var, final int i2, final int i3) {
        bq1 bq1Var2;
        int i4;
        float f3;
        float f4;
        final bq1 bq1Var3;
        final float f5;
        xj2 xj2VarT;
        boolean z4;
        boolean z5;
        e93 e93VarZ;
        e93 e93VarZ2;
        nv0Var.b0(1035477640);
        int i5 = (nv0Var.g(z2) ? 4 : 2) | i2 | (nv0Var.g(z3) ? 32 : 16) | (nv0Var.f(t41Var) ? 256 : 128);
        int i6 = i3 & 8;
        if (i6 == 0) {
            if ((i2 & 3072) == 0) {
                bq1Var2 = bq1Var;
                i5 |= nv0Var.f(bq1Var2) ? 2048 : 1024;
            }
            i4 = i5 | (!nv0Var.f(se3Var) ? 16384 : 8192) | (!nv0Var.f(z13Var) ? 131072 : 65536);
            if ((1572864 & i2) != 0) {
                if ((i3 & 64) == 0) {
                    f3 = f;
                    int i7 = nv0Var.c(f3) ? 1048576 : 524288;
                    i4 |= i7;
                } else {
                    f3 = f;
                }
                i4 |= i7;
            } else {
                f3 = f;
            }
            if ((12582912 & i2) != 0) {
                if ((i3 & 128) == 0) {
                    f4 = f2;
                    int i8 = nv0Var.c(f4) ? 8388608 : 4194304;
                    i4 |= i8;
                } else {
                    f4 = f2;
                }
                i4 |= i8;
            } else {
                f4 = f2;
            }
            if (nv0Var.R(i4 & 1, (38347923 & i4) == 38347922)) {
                nv0Var.U();
                bq1Var3 = bq1Var2;
                f5 = f3;
            } else {
                nv0Var.W();
                if ((i2 & 1) == 0 || nv0Var.A()) {
                    bq1Var3 = i6 != 0 ? yp1.a : bq1Var2;
                    if ((i3 & 64) != 0) {
                        i4 &= -3670017;
                        f5 = 2.0f;
                    } else {
                        f5 = f3;
                    }
                    if ((i3 & 128) != 0) {
                        i4 &= -29360129;
                        f4 = 1.0f;
                    }
                } else {
                    nv0Var.U();
                    if ((i3 & 64) != 0) {
                        i4 &= -3670017;
                    }
                    if ((i3 & 128) != 0) {
                        i4 &= -29360129;
                    }
                    bq1Var3 = bq1Var2;
                    f5 = f3;
                }
                nv0Var.q();
                boolean zBooleanValue = ((Boolean) pq.o(t41Var, nv0Var, (i4 >> 6) & 14).getValue()).booleanValue();
                long j2 = !z2 ? se3Var.n : z3 ? se3Var.o : zBooleanValue ? se3Var.l : se3Var.m;
                pq1 pq1Var = pq1.i;
                s83 s83VarR = uq.R(pq1Var, nv0Var);
                if (z2) {
                    z4 = zBooleanValue;
                    nv0Var.a0(-1674507999);
                    e93VarZ = f43.a(j2, s83VarR, nv0Var);
                    z5 = false;
                    nv0Var.p(false);
                } else {
                    z4 = zBooleanValue;
                    z5 = false;
                    nv0Var.a0(-1674427244);
                    e93VarZ = b32.z(new wx(j2), nv0Var);
                    nv0Var.p(false);
                }
                s83 s83VarR2 = uq.R(pq1.g, nv0Var);
                if (z2) {
                    nv0Var.a0(-1674245832);
                    e93VarZ2 = gd.a(z4 ? f5 : f4, s83VarR2, nv0Var);
                    nv0Var.p(z5);
                } else {
                    nv0Var.a0(-1674063769);
                    e93VarZ2 = b32.z(new jd0(f4), nv0Var);
                    nv0Var.p(z5);
                }
                os1 os1VarZ = b32.z(r51.a(((jd0) e93VarZ2.getValue()).f, ((wx) e93VarZ.getValue()).a), nv0Var);
                e93 e93VarA = f43.a(!z2 ? se3Var.g : z3 ? se3Var.h : z4 ? se3Var.e : se3Var.f, uq.R(pq1Var, nv0Var), nv0Var);
                ln lnVar = (ln) os1VarZ.getValue();
                eo.a(w7.L(bq1Var3.d(new kn(lnVar.a, lnVar.b, z13Var)), new er1(19, z13Var, new te3(new id1(0, 3, e93.class, e93VarA, "value", "getValue()Ljava/lang/Object;")))), nv0Var, 0);
            }
            final float f6 = f4;
            xj2VarT = nv0Var.t();
            if (xj2VarT == null) {
                xj2VarT.d = new rs0() { // from class: z02
                    @Override // defpackage.rs0
                    public final Object f(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        this.f.f(z2, z3, t41Var, bq1Var3, se3Var, z13Var, f5, f6, (nv0) obj, jo3.y(i2 | 1), i3);
                        return dm3.a;
                    }
                };
                return;
            }
            return;
        }
        i5 |= 3072;
        bq1Var2 = bq1Var;
        i4 = i5 | (!nv0Var.f(se3Var) ? 16384 : 8192) | (!nv0Var.f(z13Var) ? 131072 : 65536);
        if ((1572864 & i2) != 0) {
        }
        if ((12582912 & i2) != 0) {
        }
        if (nv0Var.R(i4 & 1, (38347923 & i4) == 38347922)) {
        }
        final float f62 = f4;
        xj2VarT = nv0Var.t();
        if (xj2VarT == null) {
        }
    }

    public void g(final String str, final rs0 rs0Var, final boolean z2, final boolean z3, final nr3 nr3Var, final t41 t41Var, final boolean z4, final rs0 rs0Var2, final rs0 rs0Var3, final rs0 rs0Var4, final rs0 rs0Var5, final rs0 rs0Var6, final se3 se3Var, x12 x12Var, final d00 d00Var, nv0 nv0Var, final int i2) {
        int i3;
        boolean z5;
        boolean z6;
        final x12 x12Var2;
        x12 b22Var;
        int i4;
        String str2;
        d00 d00VarN;
        nv0Var.b0(-1732281618);
        if ((i2 & 6) == 0) {
            i3 = (nv0Var.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= nv0Var.h(rs0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            z5 = z2;
            i3 |= nv0Var.g(z5) ? 256 : 128;
        } else {
            z5 = z2;
        }
        if ((i2 & 3072) == 0) {
            z6 = z3;
            i3 |= nv0Var.g(z6) ? 2048 : 1024;
        } else {
            z6 = z3;
        }
        if ((i2 & 24576) == 0) {
            i3 |= nv0Var.f(nr3Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= nv0Var.f(t41Var) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= nv0Var.g(z4) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= nv0Var.h(rs0Var2) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= nv0Var.h(rs0Var3) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i3 |= nv0Var.h(rs0Var4) ? 536870912 : 268435456;
        }
        int i5 = 14155776 | (nv0Var.h(rs0Var5) ? 4 : 2) | (nv0Var.h(null) ? 32 : 16) | (nv0Var.h(null) ? 256 : 128) | (nv0Var.h(rs0Var6) ? 2048 : 1024) | (nv0Var.f(se3Var) ? 16384 : 8192) | 65536;
        if (nv0Var.R(i3 & 1, ((i3 & 306783379) == 306783378 && (i5 & 4793491) == 4793490) ? false : true)) {
            nv0Var.W();
            if ((i2 & 1) == 0 || nv0Var.A()) {
                b22Var = new b22(16.0f, 16.0f, 16.0f, 16.0f);
                i4 = i5 & (-458753);
            } else {
                nv0Var.U();
                i4 = i5 & (-458753);
                b22Var = x12Var;
            }
            nv0Var.q();
            x12 x12Var3 = b22Var;
            boolean z7 = ((i3 & 14) == 4) | ((i3 & 57344) == 16384);
            Object objO = nv0Var.O();
            if (z7 || objO == c20.a) {
                objO = nr3Var.a(new af(str));
                nv0Var.j0(objO);
            }
            String str3 = ((xj3) objO).a.g;
            ef3 ef3Var = new ef3();
            if (rs0Var2 == null) {
                nv0Var.a0(1927058812);
                nv0Var.p(false);
                str2 = str3;
                d00VarN = null;
            } else {
                nv0Var.a0(1927058813);
                str2 = str3;
                d00VarN = gq.N(-1459717586, new b12(0, rs0Var2), nv0Var);
                nv0Var.p(false);
            }
            int i6 = i3 >> 9;
            int i7 = i4 << 21;
            oz2.a(str2, rs0Var, ef3Var, d00VarN, rs0Var3, rs0Var4, rs0Var5, rs0Var6, z6, z5, z4, t41Var, x12Var3, se3Var, d00Var, nv0Var, ((i3 << 3) & 896) | 6 | (i6 & 458752) | (i6 & 3670016) | (i7 & 29360128) | (i7 & 234881024) | (i7 & 1879048192), (i3 & 896) | ((i4 >> 9) & 14) | ((i3 >> 6) & 112) | (i6 & 7168) | ((i3 >> 3) & 57344) | ((i4 << 6) & 3670016) | 12582912);
            x12Var2 = x12Var3;
        } else {
            nv0Var.U();
            x12Var2 = x12Var;
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new rs0() { // from class: a12
                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = jo3.y(i2 | 1);
                    this.f.g(str, rs0Var, z2, z3, nr3Var, t41Var, z4, rs0Var2, rs0Var3, rs0Var4, rs0Var5, rs0Var6, se3Var, x12Var2, d00Var, (nv0) obj, iY);
                    return dm3.a;
                }
            };
        }
    }

    @Override // defpackage.up
    public bb1 getLayoutDirection() {
        return S;
    }

    @Override // defpackage.up
    public ua0 h() {
        return T;
    }

    @Override // defpackage.ua3
    public boolean k(Object obj, Object obj2) {
        return false;
    }

    public String toString() {
        switch (this.f) {
            case 16:
                return "{}";
            case 27:
                return "NeverEqualPolicy";
            default:
                return super.toString();
        }
    }
}
