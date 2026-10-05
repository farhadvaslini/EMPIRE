package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class kj1 {
    public static final t20 a = new t20(new x91(17));

    public static yy1 a(nv0 nv0Var) {
        yy1 yy1Var = (yy1) nv0Var.j(a);
        Object obj = null;
        if (yy1Var == null) {
            nv0Var.a0(1208426157);
            View view = (View) nv0Var.j(x7.f);
            view.getClass();
            while (true) {
                if (view == null) {
                    yy1Var = null;
                    break;
                }
                Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                yy1 yy1Var2 = tag instanceof yy1 ? (yy1) tag : null;
                if (yy1Var2 != null) {
                    yy1Var = yy1Var2;
                    break;
                }
                Object objU = w22.u(view);
                view = objU instanceof View ? (View) objU : null;
            }
        } else {
            nv0Var.a0(1208423708);
        }
        nv0Var.p(false);
        if (yy1Var != null) {
            nv0Var.a0(1208423789);
            nv0Var.p(false);
            return yy1Var;
        }
        nv0Var.a0(1208428160);
        Context baseContext = (Context) nv0Var.j(x7.b);
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
            if (baseContext instanceof yy1) {
                obj = baseContext;
                break;
            }
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
        }
        yy1 yy1Var3 = (yy1) obj;
        nv0Var.p(false);
        return yy1Var3;
    }
}
