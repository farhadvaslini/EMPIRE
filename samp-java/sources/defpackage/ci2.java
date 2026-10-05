package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class ci2 implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ si2 g;
    public final /* synthetic */ ns0 h;

    public /* synthetic */ ci2(si2 si2Var, ns0 ns0Var, int i, int i2) {
        this.f = i2;
        this.g = si2Var;
        this.h = ns0Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        ns0 ns0Var = this.h;
        si2 si2Var = this.g;
        nv0 nv0Var = (nv0) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                vm1.k(si2Var, ns0Var, nv0Var, jo3.y(1));
                break;
            default:
                vm1.l(si2Var, ns0Var, nv0Var, jo3.y(1));
                break;
        }
        return dm3Var;
    }
}
