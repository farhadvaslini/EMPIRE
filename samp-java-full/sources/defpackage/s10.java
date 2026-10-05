package defpackage;

import android.os.CancellationSignal;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s10 implements CancellationSignal.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s10(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((w83) obj).c(null);
                break;
            default:
                sf3 sf3Var = (sf3) obj;
                if (sf3Var != null) {
                    ye1 ye1Var = sf3Var.d;
                    if (ye1Var != null) {
                        ye1Var.e(yg3.b);
                    }
                    ye1 ye1Var2 = sf3Var.d;
                    if (ye1Var2 != null) {
                        ye1Var2.f(yg3.b);
                    }
                }
                break;
        }
    }
}
