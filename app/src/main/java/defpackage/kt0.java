package defpackage;

import android.view.View;
import top.th1nk.samp.feature.game.GameActivity;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kt0 implements View.OnClickListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ GameActivity g;

    public /* synthetic */ kt0(int i, GameActivity gameActivity) {
        this.f = i;
        this.g = gameActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f;
        GameActivity gameActivity = this.g;
        switch (i) {
            case 0:
                GameActivity.setupEditObjectOverlay$lambda$9$0(gameActivity, view);
                break;
            case 1:
                GameActivity.setupEditObjectOverlay$lambda$10$0(gameActivity, view);
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                GameActivity.T0(gameActivity);
                break;
            default:
                GameActivity.B(gameActivity);
                break;
        }
    }
}
