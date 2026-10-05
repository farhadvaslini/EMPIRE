package defpackage;

import android.text.InputFilter;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ei0 extends gq {
    public final di0 h;

    public ei0(TextView textView) {
        this.h = new di0(textView);
    }

    @Override // defpackage.gq
    public final InputFilter[] G(InputFilter[] inputFilterArr) {
        return !nh0.d() ? inputFilterArr : this.h.G(inputFilterArr);
    }

    @Override // defpackage.gq
    public final void O(boolean z) {
        if (nh0.d()) {
            this.h.O(z);
        }
    }

    @Override // defpackage.gq
    public final void P(boolean z) {
        boolean zD = nh0.d();
        di0 di0Var = this.h;
        if (zD) {
            di0Var.P(z);
        } else {
            di0Var.j = z;
        }
    }
}
