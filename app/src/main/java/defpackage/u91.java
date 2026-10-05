package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u91 implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ nu1 g;

    public /* synthetic */ u91(nu1 nu1Var, int i) {
        this.f = i;
        this.g = nu1Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        nu1 nu1Var = this.g;
        switch (i) {
            case 0:
                nu1.b(nu1Var, "log_raksamp_instance/" + ((Integer) obj).intValue());
                break;
            default:
                String str = (String) obj;
                str.getClass();
                nu1.b(nu1Var, "raksamp/".concat(str));
                break;
        }
        return dm3Var;
    }
}
