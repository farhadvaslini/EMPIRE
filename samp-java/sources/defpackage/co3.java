package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class co3 implements gn0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ go3 g;

    public /* synthetic */ co3(go3 go3Var, int i) {
        this.f = i;
        this.g = go3Var;
    }

    @Override // defpackage.gn0
    public final Object k(Object obj, p40 p40Var) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        go3 go3Var = this.g;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                i93 i93Var = go3Var.e;
                i93Var.getClass();
                i93Var.j(null, bool);
                break;
            default:
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                i93 i93Var2 = go3Var.g;
                i93Var2.getClass();
                i93Var2.j(null, bool2);
                break;
        }
        return dm3Var;
    }
}
