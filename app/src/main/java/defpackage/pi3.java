package defpackage;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class pi3 implements c3, ln1 {
    public final /* synthetic */ Toolbar f;

    public /* synthetic */ pi3(Toolbar toolbar) {
        this.f = toolbar;
    }

    @Override // defpackage.ln1
    public boolean g(nn1 nn1Var, MenuItem menuItem) {
        return false;
    }

    @Override // defpackage.ln1
    public void l(nn1 nn1Var) {
        Toolbar toolbar = this.f;
        z2 z2Var = toolbar.f.y;
        if (z2Var == null || !z2Var.i()) {
            toolbar.L.c();
        }
        vi3 vi3Var = toolbar.T;
        if (vi3Var != null) {
            vi3Var.l(nn1Var);
        }
    }
}
