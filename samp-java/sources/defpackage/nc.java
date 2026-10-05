package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class nc implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ pq3 g;
    public final /* synthetic */ tb1 h;

    public /* synthetic */ nc(pq3 pq3Var, tb1 tb1Var, int i) {
        this.f = i;
        this.g = pq3Var;
        this.h = tb1Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        WindowInsets windowInsetsB;
        int i = this.f;
        dm3 dm3Var = dm3.a;
        tb1 tb1Var = this.h;
        pq3 pq3Var = this.g;
        switch (i) {
            case 0:
                View view = pq3Var.g;
                q12 q12Var = (q12) obj;
                h7 h7Var = q12Var instanceof h7 ? (h7) q12Var : null;
                if (h7Var != null) {
                    h7Var.getAndroidViewsHandler$ui().getHolderToLayoutNode().put(pq3Var, tb1Var);
                    h7Var.getAndroidViewsHandler$ui().addView(pq3Var);
                    h7Var.getAndroidViewsHandler$ui().getLayoutNodeToHolder().put(tb1Var, pq3Var);
                    pq3Var.setImportantForAccessibility(1);
                    mq3.i(pq3Var, new b7(h7Var, tb1Var, h7Var));
                }
                if (view.getParent() != pq3Var) {
                    pq3Var.addView(view);
                }
                break;
            case 1:
                n92.e(pq3Var, tb1Var);
                ((h7) pq3Var.h).I = true;
                int[] iArr = pq3Var.s;
                int i2 = iArr[0];
                int i3 = iArr[1];
                View view2 = pq3Var.g;
                view2.getLocationOnScreen(iArr);
                long j = pq3Var.t;
                long jI0 = ((ab1) obj).i0();
                pq3Var.t = jI0;
                mt3 mt3Var = pq3Var.u;
                if (mt3Var != null && ((i2 != iArr[0] || i3 != iArr[1] || !p41.b(j, jI0)) && (windowInsetsB = pq3Var.m(mt3Var).b()) != null)) {
                    view2.dispatchApplyWindowInsets(windowInsetsB);
                }
                break;
            default:
                n92.e(pq3Var, tb1Var);
                break;
        }
        return dm3Var;
    }
}
