package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class bw implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ cs0 i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ bw(boolean z, boolean z2, cs0 cs0Var, cs0 cs0Var2, cs0 cs0Var3, int i) {
        this.f = 1;
        this.g = z;
        this.h = z2;
        this.i = cs0Var;
        this.j = cs0Var2;
        this.k = cs0Var3;
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
                int iY = jo3.y(1);
                w7.e((vu) obj4, (String) obj3, this.g, this.h, this.i, (nv0) obj, iY);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iY2 = jo3.y(1);
                vr.e(this.g, this.h, this.i, (cs0) obj4, (cs0) obj3, (nv0) obj, iY2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY3 = jo3.y(9);
                rn.c((w72) obj4, (String) obj3, this.g, this.h, this.i, (nv0) obj, iY3);
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ bw(Object obj, String str, boolean z, boolean z2, cs0 cs0Var, int i, int i2) {
        this.f = i2;
        this.j = obj;
        this.k = str;
        this.g = z;
        this.h = z2;
        this.i = cs0Var;
    }
}
