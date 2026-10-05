package defpackage;

import android.view.KeyEvent;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class j71 extends aq1 implements i71 {
    public ns0 t;
    public ns0 u;

    @Override // defpackage.i71
    public final boolean F(KeyEvent keyEvent) {
        ns0 ns0Var = this.u;
        if (ns0Var != null) {
            return ((Boolean) ns0Var.h(new e71(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // defpackage.i71
    public final boolean u0(KeyEvent keyEvent) {
        ns0 ns0Var = this.t;
        if (ns0Var != null) {
            return ((Boolean) ns0Var.h(new e71(keyEvent))).booleanValue();
        }
        return false;
    }
}
