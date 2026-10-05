package defpackage;

import androidx.appcompat.widget.ActionBarContextView;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class e implements gr3 {
    public boolean a = false;
    public int b;
    public final /* synthetic */ ActionBarContextView c;

    public e(ActionBarContextView actionBarContextView) {
        this.c = actionBarContextView;
    }

    @Override // defpackage.gr3
    public final void a() {
        if (this.a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.c;
        actionBarContextView.k = null;
        super/*android.view.View*/.setVisibility(this.b);
    }

    @Override // defpackage.gr3
    public final void b() {
        this.a = true;
    }

    @Override // defpackage.gr3
    public final void c() {
        super/*android.view.View*/.setVisibility(0);
        this.a = false;
    }
}
