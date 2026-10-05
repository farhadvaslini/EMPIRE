package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class gu3 {
    public static final is1 a;

    static {
        long[] jArr = nr2.a;
        a = new is1();
    }

    public static final g20 a(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof g20) {
            return (g20) tag;
        }
        return null;
    }

    public static final ek2 b(View view) {
        o50 o50Var;
        ic icVar;
        if (!view.isAttachedToWindow()) {
            m21.c("Cannot locate windowRecomposer; View " + view + " is not attached to a window");
        }
        Object objU = w22.u(view);
        while (objU instanceof View) {
            View view2 = (View) objU;
            if (view2.getId() == 16908290) {
                break;
            }
            objU = view2.getParent();
            view = view2;
        }
        g20 g20VarA = a(view);
        p40 p40Var = null;
        if (g20VarA != null) {
            if (g20VarA instanceof ek2) {
                return (ek2) g20VarA;
            }
            c.q("root viewTreeParentCompositionContext is not a Recomposer");
            return null;
        }
        ((au3) bu3.a.get()).getClass();
        o50 o50Var2 = li0.f;
        xb3 xb3Var = gc.r;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            o50Var = (o50) gc.r.getValue();
        } else {
            o50Var = (o50) gc.s.get();
            if (o50Var == null) {
                c.q("no AndroidUiDispatcher for this thread");
                return null;
            }
        }
        o50 o50VarK = o50Var.k(o50Var2);
        ic icVar2 = (ic) o50VarK.m(f5.c0);
        if (icVar2 != null) {
            icVar = new ic(icVar2);
            yj0 yj0Var = (yj0) icVar.h;
            synchronized (yj0Var.b) {
                yj0Var.a = false;
            }
        } else {
            icVar = null;
        }
        qk2 qk2Var = new qk2();
        o50 jq1Var = (iq1) o50VarK.m(f5.d0);
        if (jq1Var == null) {
            jq1Var = new jq1(view.getContext().getApplicationContext());
            qk2Var.f = jq1Var;
        }
        if (icVar != null) {
            o50Var2 = icVar;
        }
        o50 o50VarK2 = o50VarK.k(o50Var2).k(jq1Var);
        ek2 ek2Var = new ek2(o50VarK2);
        synchronized (ek2Var.c) {
            ek2Var.t = true;
        }
        n40 n40VarC = ur.c(o50VarK2);
        of1 of1VarM = b32.m(view);
        gf1 lifecycle = of1VarM != null ? of1VarM.getLifecycle() : null;
        if (lifecycle == null) {
            m21.d("ViewTreeLifecycleOwner not found from " + view);
            c.d();
            return null;
        }
        view.addOnAttachStateChangeListener(new cu3(view, ek2Var));
        lifecycle.a(new eu3(n40VarC, icVar, ek2Var, qk2Var));
        view.setTag(R.id.androidx_compose_ui_view_composition_context, ek2Var);
        fw0 fw0Var = fw0.f;
        Handler handler = view.getHandler();
        int i = kx0.a;
        view.addOnAttachStateChangeListener(new e9(4, cl3.t(fw0Var, new jx0(handler, "windowRecomposer cleanup", false).k, new hd1(ek2Var, view, p40Var, 29), 2)));
        return ek2Var;
    }
}
