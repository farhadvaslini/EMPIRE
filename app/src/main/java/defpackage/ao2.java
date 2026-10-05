package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ao2 implements yc0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ eo2 g;

    public /* synthetic */ ao2(eo2 eo2Var, int i) {
        this.f = i;
        this.g = eo2Var;
    }

    @Override // defpackage.yc0
    public final double c(double d) {
        int i = this.f;
        eo2 eo2Var = this.g;
        switch (i) {
            case 0:
                return y02.f(eo2Var.k.c(d), eo2Var.e, eo2Var.f);
            default:
                return eo2Var.n.c(y02.f(d, eo2Var.e, eo2Var.f));
        }
    }
}
