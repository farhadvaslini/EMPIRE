package defpackage;

import android.window.OnBackInvokedCallback;
import top.th1nk.samp.feature.game.GameActivity;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mf implements OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mf(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onBackInvoked() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                cs0 cs0Var = (cs0) obj;
                if (cs0Var != null) {
                    cs0Var.a();
                }
                break;
            case 1:
                ((vg) obj).E();
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                GameActivity.d1((GameActivity) obj);
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                ((py1) obj).a();
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }
}
