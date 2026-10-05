package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class jd extends u71 implements rs0 {
    public final /* synthetic */ int g = 0;
    public final /* synthetic */ gk3 h;
    public final /* synthetic */ ns0 i;
    public final /* synthetic */ bq1 j;
    public final /* synthetic */ d00 k;
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jd(gk3 gk3Var, ns0 ns0Var, bq1 bq1Var, ij0 ij0Var, ek0 ek0Var, rs0 rs0Var, d00 d00Var, int i) {
        super(2);
        this.h = gk3Var;
        this.i = ns0Var;
        this.j = bq1Var;
        this.m = ij0Var;
        this.n = ek0Var;
        this.o = rs0Var;
        this.k = d00Var;
        this.l = i;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.g;
        dm3 dm3Var = dm3.a;
        int i2 = this.l;
        Object obj3 = this.o;
        Object obj4 = this.n;
        Object obj5 = this.m;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int iY = jo3.y(i2 | 1);
                gk3 gk3Var = this.h;
                bq1 bq1Var = this.j;
                ns0 ns0Var = this.i;
                w7.c(gk3Var, bq1Var, ns0Var, (h5) obj3, (ns0) obj5, (ns0) obj4, this.k, (nv0) obj, iY);
                break;
            default:
                ((Number) obj2).intValue();
                int iY2 = jo3.y(i2 | 1);
                gk3 gk3Var2 = this.h;
                ns0 ns0Var2 = this.i;
                bq1 bq1Var2 = this.j;
                vm1.a(gk3Var2, ns0Var2, bq1Var2, (ij0) obj5, (ek0) obj4, (rs0) obj3, this.k, (nv0) obj, iY2);
                break;
        }
        return dm3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jd(gk3 gk3Var, bq1 bq1Var, ns0 ns0Var, h5 h5Var, ns0 ns0Var2, ns0 ns0Var3, d00 d00Var, int i) {
        super(2);
        this.h = gk3Var;
        this.j = bq1Var;
        this.i = ns0Var;
        this.o = h5Var;
        this.m = ns0Var2;
        this.n = ns0Var3;
        this.k = d00Var;
        this.l = i;
    }
}
