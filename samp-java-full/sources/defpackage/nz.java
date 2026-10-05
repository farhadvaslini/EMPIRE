package defpackage;

import android.window.OnBackInvokedDispatcher;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nz implements mf1 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ nz(int i, Object obj, Object obj2) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }

    @Override // defpackage.mf1
    public final void i(of1 of1Var, ef1 ef1Var) {
        int i = this.f;
        Object obj = this.h;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                xy1 xy1Var = (xy1) obj2;
                xz xzVar = (xz) obj;
                if (ef1Var == ef1.ON_CREATE) {
                    OnBackInvokedDispatcher onBackInvokedDispatcher = xzVar.getOnBackInvokedDispatcher();
                    onBackInvokedDispatcher.getClass();
                    xy1Var.c(onBackInvokedDispatcher);
                }
                break;
            default:
                sn1 sn1Var = (sn1) obj2;
                qo1 qo1Var = (qo1) obj;
                sn1Var.getClass();
                if (ef1Var == ef1.ON_DESTROY) {
                    sn1Var.d(qo1Var);
                }
                break;
        }
    }
}
