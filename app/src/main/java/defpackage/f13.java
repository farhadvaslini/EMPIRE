package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f13 implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ String g;
    public final /* synthetic */ ns0 h;
    public final /* synthetic */ cs0 i;
    public final /* synthetic */ int j;

    public /* synthetic */ f13(String str, ns0 ns0Var, cs0 cs0Var, int i, int i2) {
        this.f = i2;
        this.g = str;
        this.h = ns0Var;
        this.i = cs0Var;
        this.j = i;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        int i2 = this.j;
        cs0 cs0Var = this.i;
        ns0 ns0Var = this.h;
        String str = this.g;
        nv0 nv0Var = (nv0) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                g12.k(str, ns0Var, cs0Var, nv0Var, jo3.y(i2 | 1));
                break;
            default:
                g12.j(str, ns0Var, cs0Var, nv0Var, jo3.y(i2 | 1));
                break;
        }
        return dm3Var;
    }
}
