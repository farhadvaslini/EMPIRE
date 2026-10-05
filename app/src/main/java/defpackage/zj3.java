package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zj3 implements cs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ gk3 g;

    public /* synthetic */ zj3(gk3 gk3Var, int i) {
        this.f = i;
        this.g = gk3Var;
    }

    @Override // defpackage.cs0
    public final Object a() {
        int i = this.f;
        gk3 gk3Var = this.g;
        switch (i) {
            case 0:
                return Boolean.valueOf((s51.n(gk3Var.d.getValue(), gk3Var.a.h()) && gk3Var.h.g() == Long.MIN_VALUE && !((Boolean) gk3Var.i.getValue()).booleanValue()) ? false : true);
            default:
                return Long.valueOf(gk3Var.b());
        }
    }
}
