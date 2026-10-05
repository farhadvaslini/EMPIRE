package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class uk1 implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ qe3 g;

    public /* synthetic */ uk1(qe3 qe3Var, int i) {
        this.f = i;
        this.g = qe3Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        qe3 qe3Var = this.g;
        switch (i) {
            case 0:
                qe3Var.d(((gy1) obj).a, m22.o);
                break;
            case 1:
                gb2 gb2Var = (gb2) obj;
                qe3Var.e(w22.D(gb2Var, false));
                gb2Var.a();
                break;
            default:
                gb2 gb2Var2 = (gb2) obj;
                qe3Var.e(w22.D(gb2Var2, false));
                gb2Var2.a();
                break;
        }
        return dm3Var;
    }
}
