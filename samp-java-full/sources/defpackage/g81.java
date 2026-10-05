package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g81 implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ x50 g;
    public final /* synthetic */ i32 h;
    public final /* synthetic */ lj0 i;

    public /* synthetic */ g81(x50 x50Var, i32 i32Var, lj0 lj0Var, int i) {
        this.f = i;
        this.g = x50Var;
        this.h = i32Var;
        this.i = lj0Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        x50 x50Var = this.g;
        switch (i) {
            case 0:
                ea1 ea1Var = (ea1) obj;
                ea1Var.getClass();
                cl3.t(x50Var, null, new x81(this.h, this.i, ea1Var, null, 0), 3);
                break;
            default:
                ea1 ea1Var2 = (ea1) obj;
                ea1Var2.getClass();
                cl3.t(x50Var, null, new x81(this.h, this.i, ea1Var2, null, 1), 3);
                break;
        }
        return dm3Var;
    }
}
