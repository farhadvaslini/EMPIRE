package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import top.th1nk.samp.feature.game.GameActivity;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cu0 implements View.OnClickListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ GameActivity g;
    public final /* synthetic */ TextView h;

    public /* synthetic */ cu0(GameActivity gameActivity, TextView textView, int i) {
        this.f = i;
        this.g = gameActivity;
        this.h = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f;
        TextView textView = this.h;
        GameActivity gameActivity = this.g;
        switch (i) {
            case 0:
                GameActivity.w0(gameActivity, (Button) textView, view);
                break;
            default:
                GameActivity.showCleoMenuInternal$lambda$0$6$1(gameActivity, textView, view);
                break;
        }
    }
}
