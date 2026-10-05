package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s9 implements rs0 {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ rs0 g;
    public final /* synthetic */ cs0 h;
    public final /* synthetic */ bq1 i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ un1 k;
    public final /* synthetic */ x12 l;
    public final /* synthetic */ int m;

    public /* synthetic */ s9(rs0 rs0Var, cs0 cs0Var, bq1 bq1Var, boolean z, un1 un1Var, x12 x12Var, int i) {
        this.g = rs0Var;
        this.h = cs0Var;
        this.i = bq1Var;
        this.j = z;
        this.k = un1Var;
        this.l = x12Var;
        this.m = i;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = jo3.y(7);
                u9.b(this.g, this.h, this.i, this.j, this.k, this.l, (nv0) obj, iY, this.m);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY2 = jo3.y(this.m | 1);
                lr.e(this.g, this.h, this.i, this.j, this.k, this.l, (nv0) obj, iY2);
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ s9(rs0 rs0Var, cs0 cs0Var, bq1 bq1Var, boolean z, un1 un1Var, x12 x12Var, int i, int i2) {
        this.g = rs0Var;
        this.h = cs0Var;
        this.i = bq1Var;
        this.j = z;
        this.k = un1Var;
        this.l = x12Var;
        this.m = i2;
    }
}
