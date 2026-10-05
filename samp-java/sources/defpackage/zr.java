package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class zr implements rs0 {
    public final /* synthetic */ int f = 0;
    public final /* synthetic */ cs0 g;
    public final /* synthetic */ bq1 h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ zs0 m;

    public /* synthetic */ zr(cs0 cs0Var, bq1 bq1Var, boolean z, z13 z13Var, xr xrVar, yr yrVar, d00 d00Var, int i) {
        this.g = cs0Var;
        this.h = bq1Var;
        this.i = z;
        this.j = z13Var;
        this.k = xrVar;
        this.l = yrVar;
        this.m = d00Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        zs0 zs0Var = this.m;
        Object obj3 = this.l;
        Object obj4 = this.k;
        Object obj5 = this.j;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = jo3.y(100663345);
                lq.f(this.g, this.h, this.i, (z13) obj5, (xr) obj4, (yr) obj3, (d00) zs0Var, (nv0) obj, iY);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY2 = jo3.y(1);
                oz2.e((mg2) obj5, this.g, (cs0) obj4, (cs0) obj3, this.h, (cs0) zs0Var, this.i, (nv0) obj, iY2);
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ zr(mg2 mg2Var, cs0 cs0Var, cs0 cs0Var2, cs0 cs0Var3, bq1 bq1Var, cs0 cs0Var4, boolean z, int i) {
        this.j = mg2Var;
        this.g = cs0Var;
        this.k = cs0Var2;
        this.l = cs0Var3;
        this.h = bq1Var;
        this.m = cs0Var4;
        this.i = z;
    }
}
