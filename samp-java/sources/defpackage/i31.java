package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class i31 implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ j31 g;

    public /* synthetic */ i31(j31 j31Var, int i) {
        this.f = i;
        this.g = j31Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.f;
        j31 j31Var = this.g;
        nk3 nk3Var = (nk3) obj;
        switch (i) {
            case 0:
                nk3Var.getClass();
                j31 j31Var2 = (j31) nk3Var;
                js3 js3Var = j31Var.u;
                if (!s51.n(j31Var2.t, js3Var)) {
                    j31Var2.t = js3Var;
                    j31Var2.q1();
                }
                return mk3.g;
            default:
                nk3Var.getClass();
                j31Var.t = ((j31) nk3Var).u;
                return Boolean.FALSE;
        }
    }
}
