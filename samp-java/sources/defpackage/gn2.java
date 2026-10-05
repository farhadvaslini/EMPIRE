package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class gn2 implements rs0 {
    public final /* synthetic */ int f = 0;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;
    public final /* synthetic */ int i;

    public /* synthetic */ gn2(int i, int i2, String str, String str2) {
        this.g = str;
        this.h = str2;
        this.i = i2;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        int i2 = this.i;
        String str = this.h;
        String str2 = this.g;
        nv0 nv0Var = (nv0) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                w7.i(str2, str, nv0Var, jo3.y(1), i2);
                break;
            default:
                g12.u(str2, str, nv0Var, jo3.y(i2 | 1));
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ gn2(String str, String str2, int i) {
        this.g = str;
        this.h = str2;
        this.i = i;
    }
}
