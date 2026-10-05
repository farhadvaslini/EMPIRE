package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class qh1 implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ cs0 g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ long j;
    public final /* synthetic */ d00 k;
    public final /* synthetic */ int l;

    public /* synthetic */ qh1(cs0 cs0Var, long j, wp1 wp1Var, ed edVar, d00 d00Var, int i) {
        this.f = 2;
        this.g = cs0Var;
        this.j = j;
        this.h = wp1Var;
        this.i = edVar;
        this.k = d00Var;
        this.l = i;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        int i2 = this.l;
        Object obj3 = this.i;
        Object obj4 = this.h;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = jo3.y(i2 | 1);
                br.f(this.g, (bq1) obj4, (gl) obj3, this.j, this.k, (nv0) obj, iY);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iY2 = jo3.y(i2 | 1);
                br.f(this.g, (bq1) obj4, (gl) obj3, this.j, this.k, (nv0) obj, iY2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY3 = jo3.y(i2 | 1);
                vp.j(this.g, this.j, (wp1) obj4, (ed) obj3, this.k, (nv0) obj, iY3);
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ qh1(cs0 cs0Var, bq1 bq1Var, gl glVar, long j, d00 d00Var, int i, int i2) {
        this.f = i2;
        this.g = cs0Var;
        this.h = bq1Var;
        this.i = glVar;
        this.j = j;
        this.k = d00Var;
        this.l = i;
    }
}
