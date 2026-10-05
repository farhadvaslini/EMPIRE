package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hk3 implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ gk3 g;

    public /* synthetic */ hk3(gk3 gk3Var, int i) {
        this.f = i;
        this.g = gk3Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.f;
        gk3 gk3Var = this.g;
        switch (i) {
            case 0:
                return new jk3(gk3Var, 1);
            default:
                return new jk3(gk3Var, 0);
        }
    }
}
