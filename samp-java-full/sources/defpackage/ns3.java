package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.List;
import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ns3 extends rs3 {
    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final jl0 f = new jl0();
    public static final DecelerateInterpolator g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public static void f(ss3 ss3Var, View view) {
        kx kxVarJ = j(view);
        if (kxVarJ != null) {
            kxVarJ.d(ss3Var);
            if (kxVarJ.f == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(ss3Var, viewGroup.getChildAt(i));
            }
        }
    }

    public static void g(View view, ss3 ss3Var, mt3 mt3Var, boolean z) {
        kx kxVarJ = j(view);
        if (kxVarJ != null) {
            kxVarJ.g = mt3Var;
            if (!z) {
                kxVarJ.e(ss3Var);
                z = kxVarJ.f == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), ss3Var, mt3Var, z);
            }
        }
    }

    public static void h(View view, mt3 mt3Var, List list) {
        kx kxVarJ = j(view);
        if (kxVarJ != null) {
            mt3Var = kxVarJ.f(mt3Var, list);
            if (kxVarJ.f == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                h(viewGroup.getChildAt(i), mt3Var, list);
            }
        }
    }

    public static void i(View view, ss3 ss3Var, ar2 ar2Var) {
        kx kxVarJ = j(view);
        if (kxVarJ != null) {
            kxVarJ.h(ss3Var, ar2Var);
            if (kxVarJ.f == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                i(viewGroup.getChildAt(i), ss3Var, ar2Var);
            }
        }
    }

    public static kx j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof ms3) {
            return ((ms3) tag).a;
        }
        return null;
    }
}
