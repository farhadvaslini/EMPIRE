package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vk1 implements cs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ qe3 g;

    public /* synthetic */ vk1(qe3 qe3Var, int i) {
        this.f = i;
        this.g = qe3Var;
    }

    @Override // defpackage.cs0
    public final Object a() {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        qe3 qe3Var = this.g;
        switch (i) {
            case 0:
                qe3Var.a();
                break;
            default:
                qe3Var.onCancel();
                break;
        }
        return dm3Var;
    }
}
