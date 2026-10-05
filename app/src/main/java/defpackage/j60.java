package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class j60 implements cs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ gk3 g;

    public /* synthetic */ j60(gk3 gk3Var, int i) {
        this.f = i;
        this.g = gk3Var;
    }

    @Override // defpackage.cs0
    public final Object a() {
        int i = this.f;
        gk3 gk3Var = this.g;
        switch (i) {
            case 0:
                return gk3Var.d.getValue();
            default:
                return gk3Var.f();
        }
    }
}
