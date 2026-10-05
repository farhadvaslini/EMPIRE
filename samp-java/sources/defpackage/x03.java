package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class x03 implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ cs0 g;
    public final /* synthetic */ cs0 h;
    public final /* synthetic */ cs0 i;
    public final /* synthetic */ cs0 j;
    public final /* synthetic */ cs0 k;

    public /* synthetic */ x03(cs0 cs0Var, cs0 cs0Var2, cs0 cs0Var3, cs0 cs0Var4, cs0 cs0Var5, int i, int i2) {
        this.f = i2;
        this.g = cs0Var;
        this.h = cs0Var2;
        this.i = cs0Var3;
        this.j = cs0Var4;
        this.k = cs0Var5;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = jo3.y(1);
                g12.r(this.g, this.h, this.i, this.j, this.k, (nv0) obj, iY);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iY2 = jo3.y(1);
                g12.q(this.g, this.h, this.i, this.j, this.k, (nv0) obj, iY2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY3 = jo3.y(1);
                g12.d(this.g, this.h, this.i, this.j, this.k, (nv0) obj, iY3);
                break;
        }
        return dm3Var;
    }
}
