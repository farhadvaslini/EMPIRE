package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class un0 implements fn0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ fn0 g;
    public final /* synthetic */ rs0 h;

    public /* synthetic */ un0(fn0 fn0Var, rs0 rs0Var, int i) {
        this.f = i;
        this.g = fn0Var;
        this.h = rs0Var;
    }

    @Override // defpackage.fn0
    public final Object a(gn0 gn0Var, p40 p40Var) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        y50 y50Var = y50.f;
        int i2 = 2;
        rs0 rs0Var = this.h;
        fn0 fn0Var = this.g;
        switch (i) {
            case 0:
                Object objA = fn0Var.a(new u5(new mk2(), gn0Var, rs0Var, i2), p40Var);
                return objA == y50Var ? objA : dm3Var;
            default:
                Object objA2 = fn0Var.a(new yn0(gn0Var, rs0Var, i2), p40Var);
                return objA2 == y50Var ? objA2 : dm3Var;
        }
    }
}
