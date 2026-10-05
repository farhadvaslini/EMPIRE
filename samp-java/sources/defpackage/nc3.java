package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class nc3 implements rs0 {
    public final /* synthetic */ int f = 0;
    public final /* synthetic */ bq1 g;
    public final /* synthetic */ long h;
    public final /* synthetic */ long i;
    public final /* synthetic */ ss0 j;
    public final /* synthetic */ rs0 k;
    public final /* synthetic */ d00 l;
    public final /* synthetic */ int m;

    public /* synthetic */ nc3(int i, bq1 bq1Var, long j, long j2, ss0 ss0Var, rs0 rs0Var, d00 d00Var, int i2) {
        this.m = i;
        this.g = bq1Var;
        this.h = j;
        this.i = j2;
        this.j = ss0Var;
        this.k = rs0Var;
        this.l = d00Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = jo3.y(1572865);
                d32.a(this.m, this.g, this.h, this.i, this.j, this.k, this.l, (nv0) obj, iY);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY2 = jo3.y(this.m | 1);
                d32.e(this.g, this.h, this.i, this.j, this.k, this.l, (nv0) obj, iY2);
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ nc3(bq1 bq1Var, long j, long j2, ss0 ss0Var, rs0 rs0Var, d00 d00Var, int i) {
        this.g = bq1Var;
        this.h = j;
        this.i = j2;
        this.j = ss0Var;
        this.k = rs0Var;
        this.l = d00Var;
        this.m = i;
    }
}
