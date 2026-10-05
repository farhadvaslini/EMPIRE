package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class lg implements oy1, u30, oo1 {
    public final /* synthetic */ int f;
    public final /* synthetic */ vg g;

    public /* synthetic */ lg(vg vgVar, int i) {
        this.f = i;
        this.g = vgVar;
    }

    @Override // defpackage.oo1
    public void b(nn1 nn1Var, boolean z) {
        ug ugVar;
        int i = this.f;
        vg vgVar = this.g;
        switch (i) {
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                vgVar.s(nn1Var);
                break;
            default:
                nn1 nn1VarK = nn1Var.k();
                int i2 = 0;
                boolean z2 = nn1VarK != nn1Var;
                if (z2) {
                    nn1Var = nn1VarK;
                }
                ug[] ugVarArr = vgVar.Q;
                int length = ugVarArr != null ? ugVarArr.length : 0;
                while (true) {
                    if (i2 >= length) {
                        ugVar = null;
                    } else {
                        ugVar = ugVarArr[i2];
                        if (ugVar == null || ugVar.h != nn1Var) {
                            i2++;
                        }
                    }
                }
                if (ugVar != null) {
                    if (!z2) {
                        vgVar.t(ugVar, z);
                    } else {
                        vgVar.r(ugVar.a, ugVar, nn1VarK);
                        vgVar.t(ugVar, true);
                    }
                }
                break;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // defpackage.oy1
    public mt3 g(View view, mt3 mt3Var) {
        int i;
        boolean z;
        mt3 mt3VarB;
        boolean z2;
        boolean z3;
        jt3 jt3Var = mt3Var.a;
        int i2 = jt3Var.n().b;
        vg vgVar = this.g;
        Context context = vgVar.p;
        int i3 = jt3Var.n().b;
        ActionBarContextView actionBarContextView = vgVar.z;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i = 0;
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) vgVar.z.getLayoutParams();
            if (vgVar.z.isShown()) {
                if (vgVar.h0 == null) {
                    vgVar.h0 = new Rect();
                    vgVar.i0 = new Rect();
                }
                Rect rect = vgVar.h0;
                Rect rect2 = vgVar.i0;
                rect.set(jt3Var.n().a, jt3Var.n().b, jt3Var.n().c, jt3Var.n().d);
                ViewGroup viewGroup = vgVar.F;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z4 = kr3.a;
                    jr3.a(viewGroup, rect, rect2);
                    z3 = true;
                } else {
                    if (kr3.a) {
                        z3 = true;
                    } else {
                        kr3.a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            kr3.b = declaredMethod;
                            if (declaredMethod.isAccessible()) {
                                z3 = true;
                            } else {
                                z3 = true;
                                try {
                                    kr3.b.setAccessible(true);
                                } catch (NoSuchMethodException unused) {
                                    Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                                }
                            }
                        } catch (NoSuchMethodException unused2) {
                            z3 = true;
                        }
                    }
                    Method method = kr3.b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                        }
                    }
                }
                int i4 = rect.top;
                int i5 = rect.left;
                int i6 = rect.right;
                ViewGroup viewGroup2 = vgVar.F;
                WeakHashMap weakHashMap = mq3.a;
                mt3 mt3VarA = gq3.a(viewGroup2);
                int i7 = mt3VarA == null ? 0 : mt3VarA.a.n().a;
                int i8 = mt3VarA == null ? 0 : mt3VarA.a.n().c;
                if (marginLayoutParams.topMargin == i4 && marginLayoutParams.leftMargin == i5 && marginLayoutParams.rightMargin == i6) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i4;
                    marginLayoutParams.leftMargin = i5;
                    marginLayoutParams.rightMargin = i6;
                    z2 = z3;
                }
                if (i4 <= 0 || vgVar.H != null) {
                    View view2 = vgVar.H;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i9 = marginLayoutParams2.height;
                        int i10 = marginLayoutParams.topMargin;
                        if (i9 != i10 || marginLayoutParams2.leftMargin != i7 || marginLayoutParams2.rightMargin != i8) {
                            marginLayoutParams2.height = i10;
                            marginLayoutParams2.leftMargin = i7;
                            marginLayoutParams2.rightMargin = i8;
                            vgVar.H.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    vgVar.H = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = i7;
                    layoutParams.rightMargin = i8;
                    vgVar.F.addView(vgVar.H, -1, layoutParams);
                }
                View view4 = vgVar.H;
                boolean z5 = view4 != null ? z3 : false;
                if (z5 && view4.getVisibility() != 0) {
                    View view5 = vgVar.H;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? context.getColor(2131034118) : context.getColor(2131034117));
                }
                if (!vgVar.M && z5) {
                    i3 = 0;
                }
                z = z5;
                i = 0;
            } else {
                i = 0;
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z2 = true;
                    z = false;
                } else {
                    z = false;
                    z2 = false;
                }
            }
            if (z2) {
                vgVar.z.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = vgVar.H;
        if (view6 != null) {
            view6.setVisibility(z ? i : 8);
        }
        if (i2 != i3) {
            int i11 = jt3Var.n().a;
            int i12 = jt3Var.n().c;
            int i13 = jt3Var.n().d;
            int i14 = Build.VERSION.SDK_INT;
            at3 zs3Var = i14 >= 36 ? new zs3(mt3Var) : i14 >= 35 ? new ys3(mt3Var) : i14 >= 34 ? new xs3(mt3Var) : i14 >= 31 ? new ws3(mt3Var) : i14 >= 30 ? new vs3(mt3Var) : i14 >= 29 ? new us3(mt3Var) : new ts3(mt3Var);
            zs3Var.h(h31.b(i11, i3, i12, i13));
            mt3VarB = zs3Var.b();
        } else {
            mt3VarB = mt3Var;
        }
        WeakHashMap weakHashMap2 = mq3.a;
        WindowInsets windowInsetsB = mt3VarB.b();
        if (windowInsetsB == null) {
            return mt3VarB;
        }
        WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsetsB);
        return !windowInsetsOnApplyWindowInsets.equals(windowInsetsB) ? mt3.c(windowInsetsOnApplyWindowInsets, view) : mt3VarB;
    }

    @Override // defpackage.oo1
    public boolean p(nn1 nn1Var) {
        Window.Callback callback;
        int i = this.f;
        vg vgVar = this.g;
        switch (i) {
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                Window.Callback callback2 = vgVar.q.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, nn1Var);
                }
                break;
            default:
                if (nn1Var == nn1Var.k() && vgVar.K && (callback = vgVar.q.getCallback()) != null && !vgVar.V) {
                    callback.onMenuOpened(108, nn1Var);
                }
                break;
        }
        return true;
    }
}
