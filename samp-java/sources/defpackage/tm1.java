package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class tm1 implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ tm1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        this.f = i2;
        this.h = obj;
        this.i = obj2;
        this.j = obj3;
        this.k = obj4;
        this.l = obj5;
        this.g = i;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        int i2 = this.g;
        Object obj3 = this.l;
        Object obj4 = this.i;
        Object obj5 = this.h;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                um1.a((fy) obj5, (oq1) obj4, (f23) this.j, (ol3) this.k, (d00) obj3, (nv0) obj, jo3.y(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int iY = jo3.y(i2 | 1);
                w7.x((gk3) obj5, (ek3) obj4, this.j, this.k, (mm0) obj3, (nv0) obj, iY);
                break;
        }
        return dm3Var;
    }
}
