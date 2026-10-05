package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class yf2 implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ x50 g;
    public final /* synthetic */ lf2 h;
    public final /* synthetic */ String i;
    public final /* synthetic */ os1 j;
    public final /* synthetic */ os1 k;

    public /* synthetic */ yf2(x50 x50Var, lf2 lf2Var, String str, os1 os1Var, os1 os1Var2, int i) {
        this.f = i;
        this.g = x50Var;
        this.h = lf2Var;
        this.i = str;
        this.j = os1Var;
        this.k = os1Var2;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        x50 x50Var = this.g;
        switch (i) {
            case 0:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                cl3.t(x50Var, null, new dg2(this.h, this.i, str, str2, this.j, this.k, null, 0), 3);
                break;
            default:
                String str3 = (String) obj;
                String str4 = (String) obj2;
                str3.getClass();
                str4.getClass();
                cl3.t(x50Var, null, new dg2(this.h, this.i, str3, str4, this.j, this.k, null, 1), 3);
                break;
        }
        return dm3Var;
    }
}
