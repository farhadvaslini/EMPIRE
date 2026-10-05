package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n01 implements rs0 {
    public final /* synthetic */ int f = 0;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ cs0 h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ zs0 n;

    public /* synthetic */ n01(cs0 cs0Var, bq1 bq1Var, boolean z, m01 m01Var, z13 z13Var, rs0 rs0Var, int i, int i2) {
        this.h = cs0Var;
        this.k = bq1Var;
        this.g = z;
        this.l = m01Var;
        this.m = z13Var;
        this.n = rs0Var;
        this.i = i;
        this.j = i2;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        int i2 = this.i;
        zs0 zs0Var = this.n;
        Object obj3 = this.m;
        Object obj4 = this.l;
        Object obj5 = this.k;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = jo3.y(i2 | 1);
                gv3.f(this.h, (bq1) obj5, this.g, (m01) obj4, (z13) obj3, (rs0) zs0Var, (nv0) obj, iY, this.j);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY2 = jo3.y(i2 | 1);
                uq.c((String) obj5, (String) obj4, this.g, (ti) obj3, this.h, (ns0) zs0Var, (nv0) obj, iY2, this.j);
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ n01(String str, String str2, boolean z, ti tiVar, cs0 cs0Var, ns0 ns0Var, int i, int i2) {
        this.k = str;
        this.l = str2;
        this.g = z;
        this.m = tiVar;
        this.h = cs0Var;
        this.n = ns0Var;
        this.i = i;
        this.j = i2;
    }
}
