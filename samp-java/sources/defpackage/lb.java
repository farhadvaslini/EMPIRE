package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class lb implements rs0 {
    public final /* synthetic */ int f = 0;
    public final /* synthetic */ int g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ lb(int i, cs0 cs0Var, bq1 bq1Var, boolean z) {
        this.j = bq1Var;
        this.i = cs0Var;
        this.h = z;
        this.g = i;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        int i2 = this.g;
        boolean z = this.h;
        dm3 dm3Var = dm3.a;
        Object obj3 = this.i;
        Object obj4 = this.j;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                gv3.o((bq1) obj4, (cs0) obj3, z, (nv0) obj, jo3.y(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iY = jo3.y(3073);
                r51.h((String) obj4, this.g, this.h, (cs0) obj3, (nv0) obj, iY);
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ((Integer) obj2).getClass();
                g12.v(z, (sl2) obj4, (sf3) obj3, (nv0) obj, jo3.y(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                nh3.a((Boolean) obj4, z, (d00) obj3, (nv0) obj, jo3.y(i2 | 1));
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ lb(Boolean bool, boolean z, d00 d00Var, int i) {
        this.j = bool;
        this.h = z;
        this.i = d00Var;
        this.g = i;
    }

    public /* synthetic */ lb(String str, int i, boolean z, cs0 cs0Var, int i2) {
        this.j = str;
        this.g = i;
        this.h = z;
        this.i = cs0Var;
    }

    public /* synthetic */ lb(boolean z, sl2 sl2Var, sf3 sf3Var, int i) {
        this.h = z;
        this.j = sl2Var;
        this.i = sf3Var;
        this.g = i;
    }
}
