package defpackage;

import top.th1nk.samp.feature.game.GameActivity;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rz2 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ sz2 g;

    public /* synthetic */ rz2(sz2 sz2Var, int i) {
        this.f = i;
        this.g = sz2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        sz2 sz2Var = this.g;
        switch (i) {
            case 0:
                sz2Var.z.setVisibility(8);
                break;
            case 1:
                sz2Var.z.setVisibility(0);
                sz2Var.z.bringToFront();
                break;
            default:
                sz2Var.t.setValue(GameActivity.initializePluginRuntimeAndSamp$lambda$10(sz2Var.k.g));
                sz2Var.u = ((Number) sz2Var.l.a()).longValue();
                break;
        }
    }
}
