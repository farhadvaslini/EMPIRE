package defpackage;

import android.view.MenuItem;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class vi3 implements ti3, ln1 {
    public final /* synthetic */ xi3 f;

    @Override // defpackage.ln1
    public boolean g(nn1 nn1Var, MenuItem menuItem) {
        return false;
    }

    @Override // defpackage.ln1
    public void l(nn1 nn1Var) {
        xi3 xi3Var = this.f;
        boolean zO = xi3Var.a.a.o();
        Window.Callback callback = xi3Var.b;
        if (zO) {
            callback.onPanelClosed(108, nn1Var);
        } else if (callback.onPreparePanel(0, null, nn1Var)) {
            callback.onMenuOpened(108, nn1Var);
        }
    }
}
