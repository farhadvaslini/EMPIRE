package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ks3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ss3 a;
    public final /* synthetic */ mt3 b;
    public final /* synthetic */ mt3 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public ks3(ss3 ss3Var, mt3 mt3Var, mt3 mt3Var2, int i, View view) {
        this.a = ss3Var;
        this.b = mt3Var;
        this.c = mt3Var2;
        this.d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        ss3 ss3Var = this.a;
        rs3 rs3Var = ss3Var.a;
        rs3Var.e(animatedFraction);
        float fC = rs3Var.c();
        PathInterpolator pathInterpolator = ns3.e;
        int i = Build.VERSION.SDK_INT;
        mt3 mt3Var = this.b;
        at3 zs3Var = i >= 36 ? new zs3(mt3Var) : i >= 35 ? new ys3(mt3Var) : i >= 34 ? new xs3(mt3Var) : i >= 31 ? new ws3(mt3Var) : i >= 30 ? new vs3(mt3Var) : i >= 29 ? new us3(mt3Var) : new ts3(mt3Var);
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.d & i2;
            jt3 jt3Var = mt3Var.a;
            if (i3 == 0) {
                zs3Var.d(i2, jt3Var.i(i2));
            } else {
                h31 h31VarI = jt3Var.i(i2);
                h31 h31VarI2 = this.c.a.i(i2);
                float f = 1.0f - fC;
                zs3Var.d(i2, mt3.a(h31VarI, (int) (((double) ((h31VarI.a - h31VarI2.a) * f)) + 0.5d), (int) (((double) ((h31VarI.b - h31VarI2.b) * f)) + 0.5d), (int) (((double) ((h31VarI.c - h31VarI2.c) * f)) + 0.5d), (int) (((double) ((h31VarI.d - h31VarI2.d) * f)) + 0.5d)));
            }
        }
        ns3.h(this.e, zs3Var.b(), Collections.singletonList(ss3Var));
    }
}
