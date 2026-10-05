package defpackage;

import android.os.Build;
import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class l31 extends kx implements Runnable, oy1, View.OnAttachStateChangeListener {
    public final qt3 h;
    public boolean i;
    public boolean j;
    public mt3 k;

    public l31(qt3 qt3Var) {
        super(!qt3Var.t ? 1 : 0);
        this.h = qt3Var;
    }

    @Override // defpackage.kx
    public final void d(ss3 ss3Var) {
        this.i = false;
        this.j = false;
        mt3 mt3Var = this.k;
        if (ss3Var.a.b() > 0 && mt3Var != null) {
            jt3 jt3Var = mt3Var.a;
            qt3 qt3Var = this.h;
            qt3Var.s.f(t22.M(jt3Var.i(8)));
            qt3Var.r.f(t22.M(jt3Var.i(8)));
            qt3.b(qt3Var, mt3Var);
        }
        this.k = null;
    }

    @Override // defpackage.kx
    public final void e(ss3 ss3Var) {
        this.i = true;
        this.j = true;
    }

    @Override // defpackage.kx
    public final mt3 f(mt3 mt3Var, List list) {
        qt3 qt3Var = this.h;
        qt3.b(qt3Var, mt3Var);
        return qt3Var.t ? mt3.b : mt3Var;
    }

    @Override // defpackage.oy1
    public final mt3 g(View view, mt3 mt3Var) {
        this.k = mt3Var;
        qt3 qt3Var = this.h;
        po3 po3Var = qt3Var.r;
        jt3 jt3Var = mt3Var.a;
        po3Var.f(t22.M(jt3Var.i(8)));
        if (this.i) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.j) {
            qt3Var.s.f(t22.M(jt3Var.i(8)));
            qt3.b(qt3Var, mt3Var);
        }
        return qt3Var.t ? mt3.b : mt3Var;
    }

    @Override // defpackage.kx
    public final ar2 h(ss3 ss3Var, ar2 ar2Var) {
        this.i = false;
        return ar2Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.i) {
            this.i = false;
            this.j = false;
            mt3 mt3Var = this.k;
            if (mt3Var != null) {
                qt3 qt3Var = this.h;
                qt3Var.s.f(t22.M(mt3Var.a.i(8)));
                qt3.b(qt3Var, mt3Var);
                this.k = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
