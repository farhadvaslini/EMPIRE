package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class fq3 {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(2131230906);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static mt3 b(View view, mt3 mt3Var, Rect rect) {
        WindowInsets windowInsetsB = mt3Var.b();
        if (windowInsetsB != null) {
            return mt3.c(view.computeSystemWindowInsets(windowInsetsB, rect), view);
        }
        rect.setEmpty();
        return mt3Var;
    }

    public static void c(View view, oy1 oy1Var) {
        eq3 eq3Var = oy1Var != null ? new eq3(view, oy1Var) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(2131230897, eq3Var);
        }
        if (view.getTag(2131230896) != null) {
            return;
        }
        if (eq3Var != null) {
            view.setOnApplyWindowInsetsListener(eq3Var);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(2131230906));
        }
    }
}
