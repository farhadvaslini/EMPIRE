package defpackage;

import android.widget.EditText;
import top.th1nk.samp.feature.game.GameActivity;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class zt0 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ EditText g;
    public final /* synthetic */ GameActivity h;

    public /* synthetic */ zt0(EditText editText, GameActivity gameActivity, int i) {
        this.f = i;
        this.g = editText;
        this.h = gameActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        GameActivity gameActivity = this.h;
        EditText editText = this.g;
        switch (i) {
            case 0:
                GameActivity.showNativeDialog$lambda$12(editText, gameActivity);
                break;
            default:
                GameActivity.showChatInput$lambda$0$0$0(editText, gameActivity);
                break;
        }
    }
}
