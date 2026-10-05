package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nv implements cs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ x50 g;
    public final /* synthetic */ i90 h;
    public final /* synthetic */ int i;

    public /* synthetic */ nv(x50 x50Var, i90 i90Var, int i, int i2) {
        this.f = i2;
        this.g = x50Var;
        this.h = i90Var;
        this.i = i;
    }

    @Override // defpackage.cs0
    public final Object a() {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        p40 p40Var = null;
        int i2 = this.i;
        i90 i90Var = this.h;
        x50 x50Var = this.g;
        switch (i) {
            case 0:
                cl3.t(x50Var, null, new iw(i90Var, i2, p40Var, 0), 3);
                break;
            default:
                cl3.t(x50Var, null, new iw(i90Var, i2, p40Var, 1), 3);
                break;
        }
        return dm3Var;
    }
}
