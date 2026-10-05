package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class i60 extends u71 implements rs0 {
    public final /* synthetic */ int g;
    public final /* synthetic */ bq1 h;
    public final /* synthetic */ mm0 i;
    public final /* synthetic */ d00 j;
    public final /* synthetic */ int k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i60(Object obj, bq1 bq1Var, mm0 mm0Var, Object obj2, d00 d00Var, int i, int i2) {
        super(2);
        this.g = i2;
        this.l = obj;
        this.h = bq1Var;
        this.i = mm0Var;
        this.m = obj2;
        this.j = d00Var;
        this.k = i;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.g;
        dm3 dm3Var = dm3.a;
        int i2 = this.k;
        Object obj3 = this.m;
        Object obj4 = this.l;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int iY = jo3.y(i2 | 1);
                bq1 bq1Var = this.h;
                mm0 mm0Var = this.i;
                vp.f((Boolean) obj4, bq1Var, mm0Var, (String) obj3, this.j, (nv0) obj, iY);
                break;
            default:
                ((Number) obj2).intValue();
                int iY2 = jo3.y(i2 | 1);
                bq1 bq1Var2 = this.h;
                mm0 mm0Var2 = this.i;
                vp.e((gk3) obj4, bq1Var2, mm0Var2, (ns0) obj3, this.j, (nv0) obj, iY2);
                break;
        }
        return dm3Var;
    }
}
