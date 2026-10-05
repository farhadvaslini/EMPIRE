package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class bs implements Runnable {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public bs(yl1 yl1Var, cs csVar, wn1 wn1Var, nn1 nn1Var) {
        this.j = yl1Var;
        this.g = csVar;
        this.h = wn1Var;
        this.i = nn1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        Object obj = this.j;
        Object obj2 = this.i;
        Object obj3 = this.h;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                ds dsVar = (ds) ((yl1) obj).g;
                wn1 wn1Var = (wn1) obj3;
                cs csVar = (cs) obj4;
                if (csVar != null) {
                    dsVar.E = true;
                    csVar.b.c(false);
                    dsVar.E = false;
                }
                if (wn1Var.isEnabled() && wn1Var.hasSubMenu()) {
                    ((nn1) obj2).q(wn1Var, null, 4);
                    break;
                }
                break;
            default:
                ns3.i((View) obj4, (ss3) obj3, (ar2) obj2);
                ((ValueAnimator) obj).start();
                break;
        }
    }

    public bs(View view, ss3 ss3Var, ar2 ar2Var, ValueAnimator valueAnimator) {
        this.g = view;
        this.h = ss3Var;
        this.i = ar2Var;
        this.j = valueAnimator;
    }
}
