package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ob0 extends ViewOutlineProvider {
    public final /* synthetic */ int a;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        tq3 tq3Var;
        Outline outline2;
        switch (this.a) {
            case 0:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case 1:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                if (!(view instanceof tq3) || (outline2 = (tq3Var = (tq3) view).j) == null) {
                    return;
                }
                outline.set(outline2);
                float f = tq3Var.p;
                if (f == 0.0f && tq3Var.q == 0.0f) {
                    return;
                }
                outline.offset((int) f, (int) tq3Var.q);
                return;
            default:
                view.getClass();
                throw new ClassCastException();
        }
    }
}
