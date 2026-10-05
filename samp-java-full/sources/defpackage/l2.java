package defpackage;

import android.view.View;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class l2 implements View.OnClickListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ l2(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                ((e3) obj).a();
                break;
            case 1:
                r4 r4Var = (r4) obj;
                r4Var.v.obtainMessage(1, r4Var.b).sendToTarget();
                break;
            default:
                ri3 ri3Var = ((Toolbar) obj).R;
                wn1 wn1Var = ri3Var == null ? null : ri3Var.g;
                if (wn1Var != null) {
                    wn1Var.collapseActionView();
                }
                break;
        }
    }
}
