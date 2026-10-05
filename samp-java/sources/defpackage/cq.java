package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class cq implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ cs0 g;
    public final /* synthetic */ bq1 h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ z13 j;
    public final /* synthetic */ wp k;
    public final /* synthetic */ x12 l;
    public final /* synthetic */ d00 m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ Object p;

    public /* synthetic */ cq(cs0 cs0Var, bq1 bq1Var, boolean z, z13 z13Var, wp wpVar, Object obj, x12 x12Var, d00 d00Var, int i, int i2, int i3) {
        this.f = i3;
        this.g = cs0Var;
        this.h = bq1Var;
        this.i = z;
        this.j = z13Var;
        this.k = wpVar;
        this.p = obj;
        this.l = x12Var;
        this.m = d00Var;
        this.n = i;
        this.o = i2;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        int i2 = this.n;
        Object obj3 = this.p;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = jo3.y(i2 | 1);
                gq.i(this.g, this.h, this.i, this.j, this.k, (ln) obj3, this.l, this.m, (nv0) obj, iY, this.o);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY2 = jo3.y(i2 | 1);
                gq.d(this.g, this.h, this.i, this.j, this.k, (bq) obj3, this.l, this.m, (nv0) obj, iY2, this.o);
                break;
        }
        return dm3Var;
    }
}
