package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import top.th1nk.samp.feature.game.GameActivity;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ht0 implements View.OnClickListener {
    public final /* synthetic */ int f = 0;
    public final /* synthetic */ GameActivity g;
    public final /* synthetic */ int h;
    public final /* synthetic */ View i;
    public final /* synthetic */ Object j;

    public /* synthetic */ ht0(int i, GameActivity gameActivity, LinearLayout linearLayout, View view) {
        this.g = gameActivity;
        this.h = i;
        this.i = view;
        this.j = linearLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f;
        Object obj = this.j;
        int i2 = this.h;
        View view2 = this.i;
        GameActivity gameActivity = this.g;
        switch (i) {
            case 0:
                GameActivity.buildListDialogView$lambda$9$0$0(gameActivity, i2, view2, (LinearLayout) obj, view);
                break;
            default:
                GameActivity.showCleoMenuInternal$lambda$0$4$0$0(gameActivity, (TextView) view2, i2, (String) obj, view);
                break;
        }
    }

    public /* synthetic */ ht0(GameActivity gameActivity, TextView textView, int i, String str) {
        this.g = gameActivity;
        this.i = textView;
        this.h = i;
        this.j = str;
    }
}
