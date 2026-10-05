package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ko implements rs0 {
    public final /* synthetic */ int f = 0;
    public final /* synthetic */ int g;
    public final /* synthetic */ d00 h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ ko(bq1 bq1Var, h5 h5Var, d00 d00Var, int i, int i2) {
        this.j = bq1Var;
        this.k = h5Var;
        this.h = d00Var;
        this.g = i;
        this.i = i2;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        Object obj3 = this.k;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                s51.c((bq1) this.j, (h5) obj3, this.h, (nv0) obj, jo3.y(this.g | 1), this.i);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY = jo3.y(this.i | 1);
                Object obj4 = this.j;
                int i2 = this.g;
                br.e(obj4, i2, (kd1) obj3, this.h, (nv0) obj, iY);
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ ko(Object obj, int i, kd1 kd1Var, d00 d00Var, int i2) {
        this.j = obj;
        this.g = i;
        this.k = kd1Var;
        this.h = d00Var;
        this.i = i2;
    }
}
