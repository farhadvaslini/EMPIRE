package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class q01 implements rs0 {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ String g;
    public final /* synthetic */ long h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ q01(o32 o32Var, String str, bq1 bq1Var, long j, int i) {
        this.j = o32Var;
        this.g = str;
        this.k = bq1Var;
        this.h = j;
        this.i = i;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        Object obj3 = this.k;
        Object obj4 = this.j;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = jo3.y(this.i | 1);
                s01.b((o32) obj4, this.g, (bq1) obj3, this.h, (nv0) obj, iY);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY2 = jo3.y(1);
                w7.j(this.g, this.h, (cs0) obj4, (String) obj3, (nv0) obj, iY2, this.i);
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ q01(String str, long j, cs0 cs0Var, String str2, int i, int i2) {
        this.g = str;
        this.h = j;
        this.j = cs0Var;
        this.k = str2;
        this.i = i2;
    }
}
