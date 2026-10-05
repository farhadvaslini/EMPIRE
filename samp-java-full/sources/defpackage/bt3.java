package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public class bt3 extends jt3 {
    public static boolean n = false;
    public static Method o;
    public static Class p;
    public static Field q;
    public static Field r;
    public final WindowInsets c;
    public h31[] d;
    public h31 e;
    public mt3 f;
    public h31 g;
    public int h;
    public ec0 i;
    public int j;
    public int k;
    public Rect[][] l;
    public Rect[][] m;

    public bt3(mt3 mt3Var, WindowInsets windowInsets) {
        super(mt3Var);
        this.e = null;
        this.l = new Rect[10][];
        this.m = new Rect[10][];
        this.c = windowInsets;
    }

    private ec0 D(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.a.a.t()) {
            return ec0.a(point.x, point.y, true, 0, 0, 0, 0);
        }
        so2 so2VarH = vr.H(display, 0);
        so2 so2VarH2 = vr.H(display, 1);
        so2 so2VarH3 = vr.H(display, 2);
        so2 so2VarH4 = vr.H(display, 3);
        return ec0.a(point.x, point.y, false, so2VarH != null ? so2VarH.b : 0, so2VarH2 != null ? so2VarH2.b : 0, so2VarH3 != null ? so2VarH3.b : 0, so2VarH4 != null ? so2VarH4.b : 0);
    }

    private static List<Rect> E(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[y02.u(i2)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                    System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                    System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                    rectArr3 = rectArr4;
                }
            }
        }
        return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
    }

    private Rect[] F(h31 h31Var) {
        ArrayList arrayList = new ArrayList();
        int i = h31Var.a;
        int i2 = h31Var.d;
        int i3 = h31Var.c;
        int i4 = h31Var.b;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, h31Var.a, this.j));
        }
        if (i4 != 0) {
            arrayList.add(new Rect(0, 0, this.k, i4));
        }
        if (i3 != 0) {
            int i5 = this.k;
            arrayList.add(new Rect(i5 - i3, 0, i5, this.j));
        }
        if (i2 != 0) {
            int i6 = this.j;
            arrayList.add(new Rect(0, i6 - i2, this.k, i6));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    private h31 G(int i, boolean z) {
        h31 h31VarA = h31.e;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                h31VarA = h31.a(h31VarA, H(i2, z));
            }
        }
        return h31VarA;
    }

    private h31 I() {
        mt3 mt3Var = this.f;
        return mt3Var != null ? mt3Var.a.l() : h31.e;
    }

    private h31 J(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!n) {
            L();
        }
        Method method = o;
        if (method != null && p != null && q != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) q.get(r.get(objInvoke));
                if (rect != null) {
                    return h31.b(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    private static void L() {
        try {
            o = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            p = cls;
            q = cls.getDeclaredField("mVisibleInsets");
            r = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            q.setAccessible(true);
            r.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        n = true;
    }

    public static boolean M(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    @Override // defpackage.jt3
    public void A(int i) {
        this.h = i;
    }

    @Override // defpackage.jt3
    public void B(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.l = (Rect[][]) rectArr.clone();
    }

    @Override // defpackage.jt3
    public void C(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.m = (Rect[][]) rectArr.clone();
    }

    public h31 H(int i, boolean z) {
        h31 h31VarL;
        int i2;
        h31 h31Var = h31.e;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    h31[] h31VarArr = this.d;
                    h31VarL = h31VarArr != null ? h31VarArr[y02.u(8)] : null;
                    if (h31VarL != null) {
                        return h31VarL;
                    }
                    h31 h31VarN = n();
                    h31 h31VarI = I();
                    int i3 = h31VarN.d;
                    if (i3 > h31VarI.d) {
                        return h31.b(0, 0, 0, i3);
                    }
                    h31 h31Var2 = this.g;
                    if (h31Var2 != null && !h31Var2.equals(h31Var) && (i2 = this.g.d) > h31VarI.d) {
                        return h31.b(0, 0, 0, i2);
                    }
                } else {
                    if (i == 16) {
                        return m();
                    }
                    if (i == 32) {
                        return k();
                    }
                    if (i == 64) {
                        return o();
                    }
                    if (i == 128) {
                        mt3 mt3Var = this.f;
                        cc0 cc0VarH = mt3Var != null ? mt3Var.a.h() : h();
                        if (cc0VarH != null) {
                            int i4 = Build.VERSION.SDK_INT;
                            return h31.b(i4 >= 28 ? bc0.f(cc0VarH.a) : 0, i4 >= 28 ? bc0.h(cc0VarH.a) : 0, i4 >= 28 ? bc0.g(cc0VarH.a) : 0, i4 >= 28 ? bc0.e(cc0VarH.a) : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    h31 h31VarI2 = I();
                    h31 h31VarL2 = l();
                    return h31.b(Math.max(h31VarI2.a, h31VarL2.a), 0, Math.max(h31VarI2.c, h31VarL2.c), Math.max(h31VarI2.d, h31VarL2.d));
                }
                if ((this.h & 2) == 0) {
                    h31 h31VarN2 = n();
                    mt3 mt3Var2 = this.f;
                    h31VarL = mt3Var2 != null ? mt3Var2.a.l() : null;
                    int iMin = h31VarN2.d;
                    if (h31VarL != null) {
                        iMin = Math.min(iMin, h31VarL.d);
                    }
                    return h31.b(h31VarN2.a, 0, h31VarN2.c, iMin);
                }
            }
        } else {
            if (z) {
                return h31.b(0, Math.max(I().b, n().b), 0, 0);
            }
            if ((this.h & 4) == 0) {
                return h31.b(0, n().b, 0, 0);
            }
        }
        return h31Var;
    }

    public boolean K(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !H(i, false).equals(h31.e);
    }

    @Override // defpackage.jt3
    public void d(View view) {
        this.k = view.getWidth();
        this.j = view.getHeight();
        h31 h31VarJ = J(view);
        if (h31VarJ == null) {
            h31VarJ = h31.e;
        }
        x(h31VarJ);
    }

    @Override // defpackage.jt3
    public void e(mt3 mt3Var) {
        mt3Var.a.y(this.f);
        h31 h31Var = this.g;
        jt3 jt3Var = mt3Var.a;
        jt3Var.x(h31Var);
        jt3Var.A(this.h);
        jt3Var.v(this.i);
        jt3Var.B(this.l);
        jt3Var.C(this.m);
    }

    @Override // defpackage.jt3
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        bt3 bt3Var = (bt3) obj;
        return Objects.equals(this.g, bt3Var.g) && M(this.h, bt3Var.h);
    }

    @Override // defpackage.jt3
    public List<Rect> f(int i) {
        return E(this.l, i);
    }

    @Override // defpackage.jt3
    public List<Rect> g(int i) {
        return E(this.m, i);
    }

    @Override // defpackage.jt3
    public h31 i(int i) {
        return G(i, false);
    }

    @Override // defpackage.jt3
    public h31 j(int i) {
        return G(i, true);
    }

    @Override // defpackage.jt3
    public final h31 n() {
        if (this.e == null) {
            WindowInsets windowInsets = this.c;
            this.e = h31.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    @Override // defpackage.jt3
    public void p(View view) {
        this.i = D(view);
    }

    @Override // defpackage.jt3
    public void q() {
        for (int i = 1; i <= 512; i <<= 1) {
            int iU = y02.u(i);
            this.l[iU] = F(i(i));
            if (i != 8) {
                this.m[iU] = F(j(i));
            }
        }
    }

    @Override // defpackage.jt3
    public mt3 r(int i, int i2, int i3, int i4) {
        mt3 mt3VarC = mt3.c(this.c, null);
        int i5 = Build.VERSION.SDK_INT;
        at3 zs3Var = i5 >= 36 ? new zs3(mt3VarC) : i5 >= 35 ? new ys3(mt3VarC) : i5 >= 34 ? new xs3(mt3VarC) : i5 >= 31 ? new ws3(mt3VarC) : i5 >= 30 ? new vs3(mt3VarC) : i5 >= 29 ? new us3(mt3VarC) : new ts3(mt3VarC);
        zs3Var.h(mt3.a(n(), i, i2, i3, i4));
        zs3Var.f(mt3.a(l(), i, i2, i3, i4));
        return zs3Var.b();
    }

    @Override // defpackage.jt3
    public boolean t() {
        return this.c.isRound();
    }

    @Override // defpackage.jt3
    public boolean u(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && !K(i2)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.jt3
    public void v(ec0 ec0Var) {
        this.i = ec0Var;
    }

    @Override // defpackage.jt3
    public void w(h31[] h31VarArr) {
        this.d = h31VarArr;
    }

    @Override // defpackage.jt3
    public void x(h31 h31Var) {
        this.g = h31Var;
    }

    @Override // defpackage.jt3
    public void y(mt3 mt3Var) {
        this.f = mt3Var;
    }

    public bt3(mt3 mt3Var, bt3 bt3Var) {
        this(mt3Var, new WindowInsets(bt3Var.c));
    }
}
