package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bv1 implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ cs0 h;

    public /* synthetic */ bv1(int i, cs0 cs0Var, boolean z) {
        this.f = i;
        this.g = z;
        this.h = cs0Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        cs0 cs0Var = this.h;
        boolean z = this.g;
        uw0 uw0Var = (uw0) obj;
        switch (i) {
            case 0:
                uw0Var.d(z ? 1.0f : ((Number) cs0Var.a()).floatValue());
                break;
            default:
                uw0Var.d(z ? 1.0f : ((Number) cs0Var.a()).floatValue());
                break;
        }
        return dm3Var;
    }
}
