package defpackage;

import android.database.DataSetObserver;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ti1 extends DataSetObserver {
    public final /* synthetic */ wi1 a;

    public ti1(wi1 wi1Var) {
        this.a = wi1Var;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        wi1 wi1Var = this.a;
        if (wi1Var.D.isShowing()) {
            wi1Var.c();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.dismiss();
    }
}
