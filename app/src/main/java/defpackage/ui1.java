package defpackage;

import android.widget.AbsListView;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ui1 implements AbsListView.OnScrollListener {
    public final /* synthetic */ wi1 a;

    public ui1(wi1 wi1Var) {
        this.a = wi1Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        wi1 wi1Var = this.a;
        si1 si1Var = wi1Var.v;
        fh fhVar = wi1Var.D;
        if (i != 1 || fhVar.getInputMethodMode() == 2 || fhVar.getContentView() == null) {
            return;
        }
        wi1Var.z.removeCallbacks(si1Var);
        si1Var.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
