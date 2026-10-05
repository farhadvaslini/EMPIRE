package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class cu3 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View f;
    public final /* synthetic */ ek2 g;

    public cu3(View view, ek2 ek2Var) {
        this.f = view;
        this.g = ek2Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f.removeOnAttachStateChangeListener(this);
        this.g.x();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
