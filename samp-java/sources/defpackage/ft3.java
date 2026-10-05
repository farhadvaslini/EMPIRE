package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public class ft3 extends et3 {
    public static final mt3 w = mt3.c(WindowInsets.CONSUMED, null);

    public ft3(mt3 mt3Var, WindowInsets windowInsets) {
        super(mt3Var, windowInsets);
    }

    @Override // defpackage.bt3, defpackage.jt3
    public h31 i(int i) {
        return h31.c(this.c.getInsets(kt3.a(i)));
    }

    @Override // defpackage.bt3, defpackage.jt3
    public h31 j(int i) {
        return h31.c(this.c.getInsetsIgnoringVisibility(kt3.a(i)));
    }

    @Override // defpackage.bt3, defpackage.jt3
    public boolean u(int i) {
        return this.c.isVisible(kt3.a(i));
    }

    public ft3(mt3 mt3Var, ft3 ft3Var) {
        super(mt3Var, ft3Var);
    }

    @Override // defpackage.bt3, defpackage.jt3
    public final void d(View view) {
    }
}
