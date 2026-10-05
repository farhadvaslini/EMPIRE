package defpackage;

import top.th1nk.samp.feature.game.GameActivity;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class rt0 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ GameActivity g;
    public final /* synthetic */ String h;
    public final /* synthetic */ int i;

    public /* synthetic */ rt0(GameActivity gameActivity, int i, String str) {
        this.f = 2;
        this.g = gameActivity;
        this.i = i;
        this.h = str;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = this.f;
        String str = this.h;
        int i2 = this.i;
        GameActivity gameActivity = this.g;
        switch (i) {
            case 0:
                GameActivity.setTabHeader$lambda$1(gameActivity, str, i2);
                break;
            case 1:
                GameActivity.addNativeChatLine$lambda$0(gameActivity, str, i2);
                break;
            default:
                GameActivity.updateNativeTextDrawText$lambda$0(gameActivity, i2, str);
                break;
        }
    }

    public /* synthetic */ rt0(GameActivity gameActivity, String str, int i, int i2) {
        this.f = i2;
        this.g = gameActivity;
        this.h = str;
        this.i = i;
    }
}
