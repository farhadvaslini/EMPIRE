package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ma2 implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ oa2 g;
    public final /* synthetic */ w83 h;

    public /* synthetic */ ma2(oa2 oa2Var, w83 w83Var, int i) {
        this.f = i;
        this.g = oa2Var;
        this.h = w83Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        w83 w83Var = this.h;
        oa2 oa2Var = this.g;
        Throwable th = (Throwable) obj;
        switch (i) {
            case 0:
                if (oa2Var.f == w83Var) {
                    oa2Var.f = null;
                }
                break;
            default:
                if (oa2Var.g == w83Var) {
                    oa2Var.g = null;
                    if (th instanceof CancellationException) {
                        i93 i93Var = oa2Var.o;
                        i93Var.getClass();
                        i93Var.j(null, h92.a);
                    }
                }
                break;
        }
        return dm3Var;
    }
}
