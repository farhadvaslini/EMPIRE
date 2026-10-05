package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class q5 implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ a6 g;
    public final /* synthetic */ nk2 h;

    public /* synthetic */ q5(a6 a6Var, nk2 nk2Var, int i) {
        this.f = i;
        this.g = a6Var;
        this.h = nk2Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        nk2 nk2Var = this.h;
        a6 a6Var = this.g;
        float fFloatValue = ((Float) obj).floatValue();
        float fFloatValue2 = ((Float) obj2).floatValue();
        switch (i) {
            case 0:
                d6 d6Var = a6Var.a;
                d6Var.j.h(fFloatValue);
                d6Var.k.h(fFloatValue2);
                nk2Var.f = fFloatValue;
                break;
            default:
                d6 d6Var2 = a6Var.a;
                d6Var2.j.h(fFloatValue);
                d6Var2.k.h(fFloatValue2);
                nk2Var.f = fFloatValue;
                break;
        }
        return dm3Var;
    }
}
