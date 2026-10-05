package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class cv1 implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ d00 g;
    public final /* synthetic */ d00 h;
    public final /* synthetic */ d00 i;
    public final /* synthetic */ rs0 j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ cs0 l;
    public final /* synthetic */ cs0 m;
    public final /* synthetic */ int n;

    public /* synthetic */ cv1(d00 d00Var, d00 d00Var2, d00 d00Var3, rs0 rs0Var, boolean z, cs0 cs0Var, cs0 cs0Var2, int i, int i2) {
        this.f = i2;
        this.g = d00Var;
        this.h = d00Var2;
        this.i = d00Var3;
        this.j = rs0Var;
        this.k = z;
        this.l = cs0Var;
        this.m = cs0Var2;
        this.n = i;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        int i2 = this.n;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = jo3.y(i2 | 1);
                iv1.c(this.g, this.h, this.i, this.j, this.k, this.l, this.m, (nv0) obj, iY);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY2 = jo3.y(i2 | 1);
                wv1.c(this.g, this.h, this.i, this.j, this.k, this.l, this.m, (nv0) obj, iY2);
                break;
        }
        return dm3Var;
    }
}
