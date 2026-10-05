package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class xx0 implements cs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ yx0 g;

    public /* synthetic */ xx0(yx0 yx0Var, int i) {
        this.f = i;
        this.g = yx0Var;
    }

    @Override // defpackage.cs0
    public final Object a() {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        yx0 yx0Var = this.g;
        switch (i) {
            case 0:
                if (yx0Var.A != null) {
                    return dm3Var;
                }
                throw nc2.y("Font resolution state is not set.");
            default:
                if (yx0Var.A != null) {
                    return dm3Var;
                }
                throw nc2.y("Font resolution state is not set.");
        }
    }
}
