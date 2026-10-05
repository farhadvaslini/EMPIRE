package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class bx1 implements cs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ ex1 g;

    public /* synthetic */ bx1(ex1 ex1Var, int i) {
        this.f = i;
        this.g = ex1Var;
    }

    @Override // defpackage.cs0
    public final Object a() {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        ex1 ex1Var = this.g;
        switch (i) {
            case 0:
                pr prVar = ex1Var.W;
                prVar.getClass();
                ex1Var.q1(prVar, ex1Var.V);
                break;
            default:
                ex1 ex1Var2 = ex1Var.D;
                if (ex1Var2 != null) {
                    ex1Var2.E1();
                }
                break;
        }
        return dm3Var;
    }
}
