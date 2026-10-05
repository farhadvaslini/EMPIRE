package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class yg {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static yg c;
    public zl2 a;

    public static synchronized yg a() {
        try {
            if (c == null) {
                c();
            }
        } catch (Throwable th) {
            throw th;
        }
        return c;
    }

    public static synchronized void c() {
        if (c == null) {
            yg ygVar = new yg();
            c = ygVar;
            ygVar.a = zl2.c();
            zl2 zl2Var = c.a;
            xg xgVar = new xg(0);
            synchronized (zl2Var) {
                zl2Var.e = xgVar;
            }
        }
    }

    public static void d(Drawable drawable, c30 c30Var, int[] iArr) {
        PorterDuff.Mode mode = zl2.f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = c30Var.b;
        if (!z && !c30Var.a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterF = null;
        ColorStateList colorStateList = z ? (ColorStateList) c30Var.c : null;
        PorterDuff.Mode mode2 = c30Var.a ? (PorterDuff.Mode) c30Var.d : zl2.f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilterF = zl2.f(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilterF);
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.a.d(context, i);
    }
}
