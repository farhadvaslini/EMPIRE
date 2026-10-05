package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qd1 implements cs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ ie1 g;

    public /* synthetic */ qd1(ie1 ie1Var, int i) {
        this.f = i;
        this.g = ie1Var;
    }

    @Override // defpackage.cs0
    public final Object a() {
        int i;
        int i2 = this.f;
        ie1 ie1Var = this.g;
        switch (i2) {
            case 0:
                i = ie1Var.i().o;
                break;
            default:
                i = ((ee1) ie1Var.f.getValue()).k;
                break;
        }
        return Integer.valueOf(i);
    }
}
