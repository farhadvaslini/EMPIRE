package defpackage;

import android.view.View;
import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class jj1 {
    public static final t20 a = new t20(new x91(16));

    public static mv1 a(nv0 nv0Var) {
        mv1 mv1Var;
        mv1 mv1Var2 = (mv1) nv0Var.j(a);
        if (mv1Var2 != null) {
            nv0Var.a0(950834231);
            nv0Var.p(false);
            return mv1Var2;
        }
        nv0Var.a0(950836184);
        View view = (View) nv0Var.j(x7.f);
        view.getClass();
        while (true) {
            mv1Var = null;
            if (view == null) {
                break;
            }
            Object tag = view.getTag(R.id.view_tree_navigation_event_dispatcher_owner);
            mv1 mv1Var3 = tag instanceof mv1 ? (mv1) tag : null;
            if (mv1Var3 != null) {
                mv1Var = mv1Var3;
                break;
            }
            Object objU = w22.u(view);
            view = objU instanceof View ? (View) objU : null;
        }
        nv0Var.p(false);
        return mv1Var;
    }
}
