package defpackage;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class qu0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ ViewGroup f;
    public final /* synthetic */ int g;

    public qu0(ViewGroup viewGroup, int i) {
        this.f = viewGroup;
        this.g = i;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewGroup viewGroup = this.f;
        viewGroup.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        int measuredHeight = viewGroup.getMeasuredHeight();
        int i = this.g;
        if (measuredHeight > i) {
            viewGroup.getLayoutParams().height = i;
            viewGroup.requestLayout();
        }
    }
}
