package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pu1 implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ ns0 k;
    public final /* synthetic */ ns0 l;
    public final /* synthetic */ ns0 m;
    public final /* synthetic */ zs0 n;
    public final /* synthetic */ int o;

    public /* synthetic */ pu1(vj2 vj2Var, String str, cs0 cs0Var, cs0 cs0Var2, ns0 ns0Var, ns0 ns0Var2, rs0 rs0Var, ns0 ns0Var3, int i) {
        this.f = 3;
        this.g = vj2Var;
        this.h = str;
        this.i = cs0Var;
        this.j = cs0Var2;
        this.k = ns0Var;
        this.l = ns0Var2;
        this.n = rs0Var;
        this.m = ns0Var3;
        this.o = i;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        int i2 = this.o;
        zs0 zs0Var = this.n;
        Object obj3 = this.j;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.g;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = jo3.y(i2 | 1);
                ur.g((nu1) obj6, (iu1) obj5, (bq1) obj4, (h5) obj3, this.k, this.l, this.m, (ns0) zs0Var, (nv0) obj, iY);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iY2 = jo3.y(i2 | 1);
                ur.g((nu1) obj6, (iu1) obj5, (bq1) obj4, (h5) obj3, this.k, this.l, this.m, (ns0) zs0Var, (nv0) obj, iY2);
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ((Integer) obj2).getClass();
                int iY3 = jo3.y(i2 | 1);
                ur.g((nu1) obj6, (iu1) obj5, (bq1) obj4, (h5) obj3, this.k, this.l, this.m, (ns0) zs0Var, (nv0) obj, iY3);
                break;
            default:
                ((Integer) obj2).intValue();
                int iY4 = jo3.y(i2 | 1);
                f80.j((vj2) obj6, (String) obj5, (cs0) obj4, (cs0) obj3, this.k, this.l, (rs0) zs0Var, this.m, (nv0) obj, iY4);
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ pu1(nu1 nu1Var, iu1 iu1Var, bq1 bq1Var, h5 h5Var, ns0 ns0Var, ns0 ns0Var2, ns0 ns0Var3, ns0 ns0Var4, int i, int i2) {
        this.f = i2;
        this.g = nu1Var;
        this.h = iu1Var;
        this.i = bq1Var;
        this.j = h5Var;
        this.k = ns0Var;
        this.l = ns0Var2;
        this.m = ns0Var3;
        this.n = ns0Var4;
        this.o = i;
    }
}
