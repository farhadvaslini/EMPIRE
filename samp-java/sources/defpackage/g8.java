package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class g8 implements rs0 {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ long g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ g8(long j, pl3 pl3Var, rs0 rs0Var, int i) {
        this.g = j;
        this.h = pl3Var;
        this.i = rs0Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        Object obj3 = this.i;
        Object obj4 = this.h;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = jo3.y(1);
                k8.a((jy1) obj4, (bq1) obj3, this.g, (nv0) obj, iY);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY2 = jo3.y(49);
                vp.k(this.g, (pl3) obj4, (rs0) obj3, (nv0) obj, iY2);
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ g8(jy1 jy1Var, bq1 bq1Var, long j, int i) {
        this.h = jy1Var;
        this.i = bq1Var;
        this.g = j;
    }
}
