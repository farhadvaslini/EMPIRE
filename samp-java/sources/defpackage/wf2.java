package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class wf2 implements cs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ os1 g;
    public final /* synthetic */ os1 h;

    public /* synthetic */ wf2(os1 os1Var, os1 os1Var2, int i) {
        this.f = i;
        this.g = os1Var;
        this.h = os1Var2;
    }

    @Override // defpackage.cs0
    public final Object a() {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        os1 os1Var = this.h;
        os1 os1Var2 = this.g;
        switch (i) {
            case 0:
                os1Var2.setValue(Boolean.FALSE);
                os1Var.setValue(null);
                break;
            case 1:
                os1Var2.setValue(Boolean.FALSE);
                os1Var.setValue(null);
                break;
            default:
                os1Var2.setValue(null);
                os1Var.setValue(Boolean.TRUE);
                break;
        }
        return dm3Var;
    }
}
