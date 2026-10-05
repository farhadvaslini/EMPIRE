package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class e13 implements rs0 {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ int g;
    public final /* synthetic */ zs0 h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ int j;

    public /* synthetic */ e13(int i, cs0 cs0Var, ns0 ns0Var, int i2) {
        this.g = i;
        this.h = cs0Var;
        this.i = ns0Var;
        this.j = i2;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        int i2 = this.j;
        int i3 = this.g;
        zs0 zs0Var = this.h;
        Object obj3 = this.i;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                int iY = jo3.y(i2 | 1);
                g12.e(i3, iY, (cs0) zs0Var, (ns0) obj3, (nv0) obj);
                break;
            case 1:
                ((Integer) obj2).intValue();
                g12.f(i3, jo3.y(i2 | 1), (cs0) zs0Var, (ns0) obj3, (nv0) obj);
                break;
            default:
                ((Integer) obj2).getClass();
                n92.b((bq1) obj3, (rs0) zs0Var, (nv0) obj, jo3.y(i3 | 1), i2);
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ e13(int i, ns0 ns0Var, cs0 cs0Var, int i2) {
        this.g = i;
        this.i = ns0Var;
        this.h = cs0Var;
        this.j = i2;
    }

    public /* synthetic */ e13(bq1 bq1Var, rs0 rs0Var, int i, int i2) {
        this.i = bq1Var;
        this.h = rs0Var;
        this.g = i;
        this.j = i2;
    }
}
