package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xb implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ bq1 g;
    public final /* synthetic */ d00 h;
    public final /* synthetic */ int i;

    public /* synthetic */ xb(bq1 bq1Var, d00 d00Var, int i, int i2) {
        this.f = i2;
        this.g = bq1Var;
        this.h = d00Var;
        this.i = i;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        int i2 = this.i;
        d00 d00Var = this.h;
        bq1 bq1Var = this.g;
        nv0 nv0Var = (nv0) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                rn.q(bq1Var, d00Var, nv0Var, jo3.y(i2 | 1));
                break;
            case 1:
                rn.r(bq1Var, d00Var, nv0Var, jo3.y(i2 | 1));
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                x90.d(bq1Var, d00Var, nv0Var, jo3.y(i2 | 1));
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                d32.c(bq1Var, d00Var, nv0Var, jo3.y(i2 | 1));
                break;
            default:
                d32.b(bq1Var, d00Var, nv0Var, jo3.y(i2 | 1));
                break;
        }
        return dm3Var;
    }
}
