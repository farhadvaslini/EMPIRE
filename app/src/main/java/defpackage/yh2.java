package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yh2 implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ x50 g;
    public final /* synthetic */ i90 h;
    public final /* synthetic */ lj0 i;

    public /* synthetic */ yh2(x50 x50Var, i90 i90Var, lj0 lj0Var, int i) {
        this.f = i;
        this.g = x50Var;
        this.h = i90Var;
        this.i = lj0Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        x50 x50Var = this.g;
        switch (i) {
            case 0:
                si2 si2Var = (si2) obj;
                si2Var.getClass();
                cl3.t(x50Var, null, new pi2(this.h, this.i, si2Var, null, 0), 3);
                break;
            default:
                si2 si2Var2 = (si2) obj;
                si2Var2.getClass();
                cl3.t(x50Var, null, new pi2(this.h, this.i, si2Var2, null, 1), 3);
                break;
        }
        return dm3Var;
    }
}
