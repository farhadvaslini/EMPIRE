package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class bc3 extends o31 {
    public ns0 w;
    public qt3 x;

    @Override // defpackage.j31, defpackage.aq1
    public final void h1() {
        View viewS = vp.S(this);
        WeakHashMap weakHashMap = qt3.w;
        qt3 qt3VarI = ak2.i(viewS);
        qt3VarI.a(viewS);
        js3 js3Var = (js3) this.w.h(qt3VarI);
        if (!s51.n(js3Var, this.v)) {
            this.v = js3Var;
            q1();
        }
        this.x = qt3VarI;
        super.h1();
    }

    @Override // defpackage.j31, defpackage.aq1
    public final void i1() {
        View viewS = vp.S(this);
        qt3 qt3Var = this.x;
        if (qt3Var != null) {
            int i = qt3Var.u - 1;
            qt3Var.u = i;
            if (i == 0) {
                WeakHashMap weakHashMap = mq3.a;
                fq3.c(viewS, null);
                mq3.k(viewS, null);
                viewS.removeOnAttachStateChangeListener(qt3Var.v);
            }
        }
        super.i1();
    }
}
