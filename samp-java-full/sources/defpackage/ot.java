package defpackage;

import android.util.Log;
import android.view.ViewParent;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ot {
    public boolean a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public boolean a(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent viewParentB;
        int i6;
        int i7;
        int[] iArr3;
        NestedScrollView nestedScrollView = (NestedScrollView) this.d;
        if (this.a && (viewParentB = b(i5)) != null) {
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                if (iArr != null) {
                    nestedScrollView.getLocationInWindow(iArr);
                    i6 = iArr[0];
                    i7 = iArr[1];
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                if (iArr2 == null) {
                    if (((int[]) this.e) == null) {
                        this.e = new int[2];
                    }
                    int[] iArr4 = (int[]) this.e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (viewParentB instanceof pw1) {
                    ((pw1) viewParentB).c(nestedScrollView, i, i2, i3, i4, i5, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i3;
                    iArr3[1] = iArr3[1] + i4;
                    if (viewParentB instanceof ow1) {
                        ((ow1) viewParentB).e(nestedScrollView, i, i2, i3, i4, i5);
                    } else if (i5 == 0) {
                        try {
                            viewParentB.onNestedScroll(nestedScrollView, i, i2, i3, i4);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + viewParentB + " does not implement interface method onNestedScroll", e);
                        }
                    }
                }
                if (iArr != null) {
                    nestedScrollView.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i6;
                    iArr[1] = iArr[1] - i7;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public ViewParent b(int i) {
        if (i == 0) {
            return (ViewParent) this.b;
        }
        if (i != 1) {
            return null;
        }
        return (ViewParent) this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int c(a31 a31Var, h7 h7Var, boolean z) {
        Object[] objArr;
        int i;
        int i2;
        iy0 iy0Var = (iy0) this.c;
        ly0 ly0Var = (ly0) this.e;
        if (this.a) {
            return 0;
        }
        try {
            this.a = true;
            g51 g51VarJ = ((k71) this.d).j(a31Var, h7Var);
            xk1 xk1Var = (xk1) g51VarJ.c;
            int iF = xk1Var.f();
            for (int i3 = 0; i3 < iF; i3++) {
                gb2 gb2Var = (gb2) xk1Var.g(i3);
                if (!gb2Var.d && !gb2Var.h) {
                }
                objArr = false;
                break;
            }
            objArr = true;
            int iF2 = xk1Var.f();
            for (int i4 = 0; i4 < iF2; i4++) {
                gb2 gb2Var2 = (gb2) xk1Var.g(i4);
                if (objArr != false || w22.l(gb2Var2)) {
                    ((tb1) this.b).A(gb2Var2.c, (ly0) this.e, gb2Var2.i, true);
                    if (!ly0Var.f.i()) {
                        iy0Var.a(gb2Var2.a, ly0Var, w22.l(gb2Var2));
                        ly0Var.clear();
                    }
                }
            }
            boolean zB = iy0Var.b(g51VarJ, z);
            if (g51VarJ.b) {
                i = 0;
            } else {
                int iF3 = xk1Var.f();
                for (int i5 = 0; i5 < iF3; i5++) {
                    gb2 gb2Var3 = (gb2) xk1Var.g(i5);
                    if (!gy1.b(w22.D(gb2Var3, true), 0L) && gb2Var3.c()) {
                        i = 1;
                        break;
                    }
                }
                i = 0;
            }
            int iF4 = xk1Var.f();
            int i6 = 0;
            while (true) {
                if (i6 >= iF4) {
                    i2 = 0;
                    break;
                }
                if (((gb2) xk1Var.g(i6)).c()) {
                    i2 = 1;
                    break;
                }
                i6++;
            }
            int i7 = (zB ? 1 : 0) | (i << 1) | (i2 << 2);
            this.a = false;
            return i7;
        } catch (Throwable th) {
            this.a = false;
            throw th;
        }
    }

    public void d(int i, int i2) {
        if (i < 0.0f) {
            p21.a("Index should be non-negative (" + i + ")");
        }
        ((a42) this.b).h(i);
        ((ed1) this.e).a(i);
        ((a42) this.c).h(i2);
    }
}
