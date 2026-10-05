package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class tp0 extends aq1 implements hp0 {
    @Override // defpackage.hp0
    public final void s0(fp0 fp0Var) {
        View viewL = lq.l(this);
        fp0Var.c(this.f.s && lq.l(this).hasFocusable());
        View viewFindFocus = viewL.findFocus();
        if (viewFindFocus != null) {
            fp0Var.d(yo0.a(viewFindFocus, viewL));
        }
    }
}
