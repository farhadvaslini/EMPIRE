package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class d10 extends ClickableSpan {
    public final og1 f;

    public d10(og1 og1Var) {
        this.f = og1Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.f.getClass();
    }
}
