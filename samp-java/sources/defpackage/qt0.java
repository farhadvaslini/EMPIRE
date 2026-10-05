package defpackage;

import top.th1nk.samp.feature.game.GameActivity;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class qt0 implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ GameActivity g;

    public /* synthetic */ qt0(int i, GameActivity gameActivity) {
        this.f = i;
        this.g = gameActivity;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        GameActivity gameActivity = this.g;
        switch (i) {
            case 0:
                GameActivity.initializePluginRuntimeAndSamp$lambda$14(gameActivity, (String) obj, ((Boolean) obj2).booleanValue());
                break;
            case 1:
                GameActivity.initializePluginRuntimeAndSamp$lambda$15(gameActivity, (String) obj, ((Boolean) obj2).booleanValue());
                break;
            default:
                GameActivity.initializePluginRuntimeAndSamp$lambda$4(gameActivity, ((Integer) obj).intValue(), ((Boolean) obj2).booleanValue());
                break;
        }
        return dm3Var;
    }
}
