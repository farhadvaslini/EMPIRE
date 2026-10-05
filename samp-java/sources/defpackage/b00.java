package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class b00 implements rs0 {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ int g;
    public final /* synthetic */ d00 h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    public /* synthetic */ b00(int i, rs0 rs0Var, d00 d00Var, rs0 rs0Var2, rs0 rs0Var3, js3 js3Var, rs0 rs0Var4, int i2) {
        this.g = i;
        this.i = rs0Var;
        this.h = d00Var;
        this.j = rs0Var2;
        this.k = rs0Var3;
        this.l = js3Var;
        this.m = rs0Var4;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        Object obj3 = this.m;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = jo3.y(this.g) | 1;
                this.h.k(this.i, (Boolean) obj3, this.j, this.k, this.l, (nv0) obj, iY);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY2 = jo3.y(1);
                w22.d(this.g, (rs0) this.i, this.h, (rs0) this.j, (rs0) this.k, (js3) this.l, (rs0) obj3, (nv0) obj, iY2);
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ b00(d00 d00Var, Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, int i) {
        this.h = d00Var;
        this.i = obj;
        this.m = bool;
        this.j = obj2;
        this.k = obj3;
        this.l = obj4;
        this.g = i;
    }
}
