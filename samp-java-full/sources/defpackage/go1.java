package defpackage;

import android.widget.PopupWindow;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class go1 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ ho1 f;

    public go1(ho1 ho1Var) {
        this.f = ho1Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f.c();
    }
}
