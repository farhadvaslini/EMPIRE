package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class lo1 extends wi1 implements vn1 {
    public static final Method H;
    public yl1 G;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                H = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // defpackage.vn1
    public final void h(nn1 nn1Var, MenuItem menuItem) {
        yl1 yl1Var = this.G;
        if (yl1Var != null) {
            yl1Var.h(nn1Var, menuItem);
        }
    }

    @Override // defpackage.vn1
    public final void j(nn1 nn1Var, wn1 wn1Var) {
        yl1 yl1Var = this.G;
        if (yl1Var != null) {
            yl1Var.j(nn1Var, wn1Var);
        }
    }

    @Override // defpackage.wi1
    public final cg0 q(Context context, boolean z) {
        ko1 ko1Var = new ko1(context, z);
        ko1Var.setHoverListener(this);
        return ko1Var;
    }
}
