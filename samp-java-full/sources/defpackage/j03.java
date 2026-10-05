package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j03 implements cs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ cs0 g;
    public final /* synthetic */ os1 h;

    public /* synthetic */ j03(cs0 cs0Var, os1 os1Var, int i) {
        this.f = i;
        this.g = cs0Var;
        this.h = os1Var;
    }

    @Override // defpackage.cs0
    public final Object a() {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        os1 os1Var = this.h;
        cs0 cs0Var = this.g;
        switch (i) {
            case 0:
                if (((qw1) os1Var.getValue()) != null) {
                    os1Var.setValue(null);
                } else {
                    cs0Var.a();
                }
                break;
            case 1:
                os1Var.setValue(Boolean.FALSE);
                cs0Var.a();
                break;
            default:
                os1Var.setValue(Boolean.FALSE);
                cs0Var.a();
                break;
        }
        return dm3Var;
    }
}
