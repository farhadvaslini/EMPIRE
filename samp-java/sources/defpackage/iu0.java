package defpackage;

import android.widget.FrameLayout;
import top.th1nk.samp.feature.game.GameActivity;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class iu0 implements Runnable {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ FrameLayout g;
    public final /* synthetic */ GameActivity h;

    public /* synthetic */ iu0(FrameLayout frameLayout, GameActivity gameActivity) {
        this.g = frameLayout;
        this.h = gameActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        GameActivity gameActivity = this.h;
        FrameLayout frameLayout = this.g;
        switch (i) {
            case 0:
                GameActivity.N0(frameLayout, gameActivity);
                break;
            default:
                GameActivity.showChatInput$lambda$0$1(frameLayout, gameActivity);
                break;
        }
    }

    public /* synthetic */ iu0(GameActivity gameActivity, FrameLayout frameLayout) {
        this.h = gameActivity;
        this.g = frameLayout;
    }
}
