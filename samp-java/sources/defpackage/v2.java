package defpackage;

import android.content.Context;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class v2 extends ho1 {
    public final /* synthetic */ int l = 0;
    public final /* synthetic */ z2 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(z2 z2Var, Context context, na3 na3Var, View view) {
        super(context, na3Var, view, false, 2130903073, 0);
        this.m = z2Var;
        if ((na3Var.A.x & 32) != 32) {
            View view2 = z2Var.n;
            this.e = view2 == null ? (View) z2Var.m : view2;
        }
        yl1 yl1Var = z2Var.B;
        this.h = yl1Var;
        fo1 fo1Var = this.i;
        if (fo1Var != null) {
            fo1Var.e(yl1Var);
        }
    }

    @Override // defpackage.ho1
    public final void c() {
        int i = this.l;
        z2 z2Var = this.m;
        switch (i) {
            case 0:
                z2Var.y = null;
                super.c();
                break;
            default:
                nn1 nn1Var = z2Var.h;
                if (nn1Var != null) {
                    nn1Var.c(true);
                }
                z2Var.x = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(z2 z2Var, Context context, nn1 nn1Var, View view) {
        super(context, nn1Var, view, true, 2130903073, 0);
        this.m = z2Var;
        this.f = 8388613;
        yl1 yl1Var = z2Var.B;
        this.h = yl1Var;
        fo1 fo1Var = this.i;
        if (fo1Var != null) {
            fo1Var.e(yl1Var);
        }
    }
}
