package defpackage;

import android.view.ActionProvider;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class xn1 implements ActionProvider.VisibilityListener {
    public k71 a;
    public final ActionProvider b;

    public xn1(ao1 ao1Var, ActionProvider actionProvider) {
        this.b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        k71 k71Var = this.a;
        if (k71Var != null) {
            nn1 nn1Var = ((wn1) k71Var.g).n;
            nn1Var.h = true;
            nn1Var.p(true);
        }
    }
}
