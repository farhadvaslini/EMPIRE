package defpackage;

import android.view.View;
import android.view.ViewGroup;
import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class wu3 {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final tu3 a(w wVar, a20 a20Var, d00 d00Var) {
        h7 h7Var;
        tu3 tu3Var;
        Object[] objArr = 0;
        if (iw0.a.compareAndSet(false, true)) {
            np npVarA = lr.a(1, 6, null);
            cl3.t(ur.c((o50) gc.r.getValue()), null, new l(npVarA, objArr == true ? 1 : 0, 17), 3);
            s sVar = new s(26, npVarA);
            synchronized (a73.c) {
                a73.i = qx.E0(a73.i, sVar);
            }
            a73.a();
        }
        if (wVar.getChildCount() > 0) {
            View childAt = wVar.getChildAt(0);
            h7Var = childAt instanceof h7 ? (h7) childAt : null;
            if (h7Var != null) {
                h7Var.setComposeViewContext(a20Var);
            }
            if (h7Var == null) {
                h7Var = new h7(wVar.getContext(), a20Var);
                wVar.addView(h7Var.getView(), a);
            }
            h7Var.setComposeViewContext(a20Var);
            if (wVar.getComposeViewContext$ui() != null) {
                a20Var.e();
                h7Var.setComposeViewContextIncrementedDuringInit$ui(true);
            }
            Object tag = h7Var.getTag(R.id.wrapped_composition_tag);
            tu3Var = tag instanceof tu3 ? (tu3) tag : null;
            if (tu3Var == null) {
                tu3Var = new tu3(h7Var, new l20(a20Var.c(), new tl3(h7Var.getRoot())));
                h7Var.setTag(R.id.wrapped_composition_tag, tu3Var);
            }
            tu3Var.d(d00Var);
            h7Var.setFrameEndScheduler$ui(new vu3(a20Var.c()));
            return tu3Var;
        }
        wVar.removeAllViews();
        h7Var = null;
        if (h7Var == null) {
        }
        h7Var.setComposeViewContext(a20Var);
        if (wVar.getComposeViewContext$ui() != null) {
        }
        Object tag2 = h7Var.getTag(R.id.wrapped_composition_tag);
        if (tag2 instanceof tu3) {
        }
        if (tu3Var == null) {
        }
        tu3Var.d(d00Var);
        h7Var.setFrameEndScheduler$ui(new vu3(a20Var.c()));
        return tu3Var;
    }
}
