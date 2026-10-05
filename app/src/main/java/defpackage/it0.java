package defpackage;

import android.view.View;
import top.th1nk.samp.feature.game.GameActivity;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class it0 implements View.OnClickListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ cs0 g;

    public /* synthetic */ it0(cs0 cs0Var, int i) {
        this.f = i;
        this.g = cs0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f;
        cs0 cs0Var = this.g;
        switch (i) {
            case 0:
                lu0 lu0Var = GameActivity.Companion;
                cs0Var.a();
                break;
            default:
                lu0 lu0Var2 = GameActivity.Companion;
                cs0Var.a();
                break;
        }
    }
}
