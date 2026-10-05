package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class mn implements rs0 {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ bq1 g;
    public final /* synthetic */ float h;
    public final /* synthetic */ float i;
    public final /* synthetic */ long j;
    public final /* synthetic */ z13 k;
    public final /* synthetic */ Object l;

    public /* synthetic */ mn(on onVar, bq1 bq1Var, float f, float f2, z13 z13Var, long j, int i) {
        this.l = onVar;
        this.g = bq1Var;
        this.h = f;
        this.i = f2;
        this.k = z13Var;
        this.j = j;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        Object obj3 = this.l;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = jo3.y(196609);
                ((on) obj3).a(this.h, this.i, iY, this.j, (nv0) obj, this.g, this.k);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY2 = jo3.y(196657);
                ((m22) obj3).j(this.h, this.i, iY2, this.j, (nv0) obj, this.g, this.k);
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ mn(m22 m22Var, bq1 bq1Var, float f, float f2, long j, z13 z13Var, int i) {
        this.l = m22Var;
        this.g = bq1Var;
        this.h = f;
        this.i = f2;
        this.j = j;
        this.k = z13Var;
    }
}
