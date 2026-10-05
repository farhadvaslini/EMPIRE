package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class cn0 implements rs0 {
    public final /* synthetic */ int f = 0;
    public final /* synthetic */ bq1 g;
    public final /* synthetic */ kj h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ zs0 m;

    public /* synthetic */ cn0(bq1 bq1Var, ij ijVar, kj kjVar, int i, f5 f5Var, d00 d00Var, int i2) {
        this.g = bq1Var;
        this.k = ijVar;
        this.h = kjVar;
        this.i = i;
        this.l = f5Var;
        this.m = d00Var;
        this.j = i2;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        zs0 zs0Var = this.m;
        Object obj3 = this.l;
        Object obj4 = this.k;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = jo3.y(this.i | 1);
                dn0.a(this.g, (ie1) obj4, (x12) obj3, this.h, (ns0) zs0Var, (nv0) obj, iY, this.j);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY2 = jo3.y(this.j | 1);
                gq.e(this.g, (ij) obj4, this.h, this.i, (f5) obj3, (d00) zs0Var, (nv0) obj, iY2);
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ cn0(bq1 bq1Var, ie1 ie1Var, x12 x12Var, kj kjVar, ns0 ns0Var, int i, int i2) {
        this.g = bq1Var;
        this.k = ie1Var;
        this.l = x12Var;
        this.h = kjVar;
        this.m = ns0Var;
        this.i = i;
        this.j = i2;
    }
}
