package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import top.th1nk.samp.feature.game.GameActivity;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ou0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ GameActivity f;
    public final /* synthetic */ ScrollView g;

    public ou0(GameActivity gameActivity, ScrollView scrollView) {
        this.f = gameActivity;
        this.g = scrollView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        GameActivity gameActivity = this.f;
        ScrollView scrollView = gameActivity.dlModelProgressScroll;
        ScrollView scrollView2 = this.g;
        if (scrollView != scrollView2 || !gameActivity.dlModelProgressAutoScroll) {
            if (scrollView2.getViewTreeObserver().isAlive()) {
                scrollView2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
            if (gameActivity.dlModelProgressScrollLayoutListener == this) {
                gameActivity.dlModelProgressScrollLayoutListener = null;
                return;
            }
            return;
        }
        gameActivity.dlModelProgressProgrammaticScroll = true;
        scrollView2.fullScroll(130);
        gameActivity.dlModelProgressProgrammaticScroll = false;
        View childAt = scrollView2.getChildAt(0);
        gameActivity.dlModelProgressContentHeight = childAt != null ? childAt.getHeight() : 0;
        if (scrollView2.getViewTreeObserver().isAlive()) {
            scrollView2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
        if (gameActivity.dlModelProgressScrollLayoutListener == this) {
            gameActivity.dlModelProgressScrollLayoutListener = null;
        }
    }
}
