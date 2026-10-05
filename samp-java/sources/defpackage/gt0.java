package defpackage;

import top.th1nk.samp.feature.game.GameActivity;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class gt0 implements ts0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ GameActivity g;

    public /* synthetic */ gt0(int i, GameActivity gameActivity) {
        this.f = i;
        this.g = gameActivity;
    }

    @Override // defpackage.ts0
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.f;
        GameActivity gameActivity = this.g;
        int iIntValue = ((Integer) obj).intValue();
        int iIntValue2 = ((Integer) obj2).intValue();
        int iIntValue3 = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                return Boolean.valueOf(GameActivity.setupSampButtonOverlay$lambda$0(gameActivity, iIntValue, iIntValue2, iIntValue3, ((Integer) obj4).intValue()));
            default:
                GameActivity.initializePluginRuntimeAndSamp$lambda$6(gameActivity, iIntValue, iIntValue2, iIntValue3, ((Boolean) obj4).booleanValue());
                return dm3.a;
        }
    }
}
