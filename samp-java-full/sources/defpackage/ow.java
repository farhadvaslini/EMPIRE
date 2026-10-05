package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ow implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ tw g;
    public final /* synthetic */ w83 h;

    public /* synthetic */ ow(tw twVar, w83 w83Var, int i) {
        this.f = i;
        this.g = twVar;
        this.h = w83Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        w83 w83Var = this.h;
        tw twVar = this.g;
        Throwable th = (Throwable) obj;
        switch (i) {
            case 0:
                if (twVar.f == w83Var) {
                    twVar.f = null;
                }
                break;
            default:
                if (twVar.g == w83Var) {
                    twVar.g = null;
                    if (th instanceof CancellationException) {
                        i93 i93Var = twVar.p;
                        i93Var.getClass();
                        i93Var.j(null, gv.a);
                    }
                }
                break;
        }
        return dm3Var;
    }
}
