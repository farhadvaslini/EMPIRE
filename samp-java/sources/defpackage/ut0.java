package defpackage;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import top.th1nk.samp.feature.game.GameActivity;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class ut0 implements View.OnTouchListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ KeyEvent.Callback g;

    public /* synthetic */ ut0(KeyEvent.Callback callback, int i) {
        this.f = i;
        this.g = callback;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.f;
        KeyEvent.Callback callback = this.g;
        switch (i) {
            case 0:
                GameActivity.setupNativeChatOverlay$lambda$0$0((GameActivity) callback, view, motionEvent);
                return true;
            case 1:
                GameActivity.showDlModelProgress$lambda$0$6$0((GameActivity) callback, view, motionEvent);
                return false;
            default:
                return GameActivity.showNativeDialog$lambda$5$0((FrameLayout) callback, view, motionEvent);
        }
    }
}
