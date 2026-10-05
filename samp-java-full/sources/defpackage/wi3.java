package defpackage;

import androidx.appcompat.widget.ActionMenuView;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class wi3 implements oo1 {
    public boolean f;
    public final /* synthetic */ xi3 g;

    public wi3(xi3 xi3Var) {
        this.g = xi3Var;
    }

    @Override // defpackage.oo1
    public final void b(nn1 nn1Var, boolean z) {
        z2 z2Var;
        if (this.f) {
            return;
        }
        this.f = true;
        xi3 xi3Var = this.g;
        ActionMenuView actionMenuView = xi3Var.a.a.f;
        if (actionMenuView != null && (z2Var = actionMenuView.y) != null) {
            z2Var.c();
            v2 v2Var = z2Var.y;
            if (v2Var != null && v2Var.b()) {
                v2Var.i.dismiss();
            }
        }
        xi3Var.b.onPanelClosed(108, nn1Var);
        this.f = false;
    }

    @Override // defpackage.oo1
    public final boolean p(nn1 nn1Var) {
        this.g.b.onMenuOpened(108, nn1Var);
        return true;
    }
}
