package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qq implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ p22 g;
    public final /* synthetic */ pi h;

    public /* synthetic */ qq(p22 p22Var, pi piVar, int i) {
        this.f = i;
        this.g = p22Var;
        this.h = piVar;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        pi piVar = this.h;
        p22 p22Var = this.g;
        int iIntValue = ((Integer) obj).intValue();
        int iIntValue2 = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                p22Var.b(piVar, iIntValue, iIntValue2);
                break;
            default:
                p22Var.b(piVar, iIntValue, iIntValue2);
                break;
        }
        return dm3Var;
    }
}
