package defpackage;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public class ct3 extends bt3 {
    public h31 s;

    public ct3(mt3 mt3Var, ct3 ct3Var) {
        super(mt3Var, ct3Var);
        this.s = null;
        this.s = ct3Var.s;
    }

    @Override // defpackage.jt3
    public mt3 b() {
        return mt3.c(this.c.consumeStableInsets(), null);
    }

    @Override // defpackage.jt3
    public mt3 c() {
        return mt3.c(this.c.consumeSystemWindowInsets(), null);
    }

    @Override // defpackage.jt3
    public final h31 l() {
        if (this.s == null) {
            WindowInsets windowInsets = this.c;
            this.s = h31.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.s;
    }

    @Override // defpackage.jt3
    public boolean s() {
        return this.c.isConsumed();
    }

    @Override // defpackage.jt3
    public void z(h31 h31Var) {
        this.s = h31Var;
    }

    public ct3(mt3 mt3Var, WindowInsets windowInsets) {
        super(mt3Var, windowInsets);
        this.s = null;
    }
}
