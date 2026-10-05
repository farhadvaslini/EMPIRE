package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public class ht3 extends gt3 {
    public static final mt3 x = mt3.c(WindowInsets.CONSUMED, null);

    public ht3(mt3 mt3Var, WindowInsets windowInsets) {
        super(mt3Var, windowInsets);
    }

    @Override // defpackage.ft3, defpackage.bt3, defpackage.jt3
    public h31 i(int i) {
        return h31.c(this.c.getInsets(lt3.a(i)));
    }

    @Override // defpackage.ft3, defpackage.bt3, defpackage.jt3
    public h31 j(int i) {
        return h31.c(this.c.getInsetsIgnoringVisibility(lt3.a(i)));
    }

    @Override // defpackage.ft3, defpackage.bt3, defpackage.jt3
    public boolean u(int i) {
        return this.c.isVisible(lt3.a(i));
    }

    public ht3(mt3 mt3Var, ht3 ht3Var) {
        super(mt3Var, ht3Var);
    }

    @Override // defpackage.bt3, defpackage.jt3
    public void p(View view) {
    }
}
