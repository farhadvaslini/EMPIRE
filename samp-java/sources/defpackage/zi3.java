package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class zi3 implements View.OnClickListener {
    public final s2 f;
    public final /* synthetic */ bj3 g;

    public zi3(bj3 bj3Var) {
        this.g = bj3Var;
        Context context = bj3Var.a.getContext();
        CharSequence charSequence = bj3Var.h;
        s2 s2Var = new s2();
        s2Var.e = 4096;
        s2Var.g = 4096;
        s2Var.l = null;
        s2Var.m = null;
        s2Var.n = false;
        s2Var.o = false;
        s2Var.p = 16;
        s2Var.i = context;
        s2Var.a = charSequence;
        this.f = s2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        bj3 bj3Var = this.g;
        Window.Callback callback = bj3Var.k;
        if (callback == null || !bj3Var.l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f);
    }
}
