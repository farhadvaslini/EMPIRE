package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ls3 extends AnimatorListenerAdapter {
    public final /* synthetic */ ss3 a;
    public final /* synthetic */ View b;

    public ls3(ss3 ss3Var, View view) {
        this.a = ss3Var;
        this.b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ss3 ss3Var = this.a;
        ss3Var.a.e(1.0f);
        ns3.f(ss3Var, this.b);
    }
}
