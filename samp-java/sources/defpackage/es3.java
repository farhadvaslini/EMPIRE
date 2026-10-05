package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class es3 extends t22 {
    public final /* synthetic */ int c;
    public final /* synthetic */ gs3 d;

    public /* synthetic */ es3(gs3 gs3Var, int i) {
        this.c = i;
        this.d = gs3Var;
    }

    @Override // defpackage.gr3
    public final void a() {
        View view;
        int i = this.c;
        gs3 gs3Var = this.d;
        switch (i) {
            case 0:
                if (gs3Var.o && (view = gs3Var.g) != null) {
                    view.setTranslationY(0.0f);
                    gs3Var.d.setTranslationY(0.0f);
                }
                gs3Var.d.setVisibility(8);
                gs3Var.d.setTransitioning(false);
                gs3Var.s = null;
                a31 a31Var = gs3Var.k;
                if (a31Var != null) {
                    a31Var.i(gs3Var.j);
                    gs3Var.j = null;
                    gs3Var.k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = gs3Var.c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = mq3.a;
                    actionBarOverlayLayout.requestApplyInsets();
                }
                break;
            default:
                gs3Var.s = null;
                gs3Var.d.requestLayout();
                break;
        }
    }
}
