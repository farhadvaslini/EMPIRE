package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pc2 implements u33 {
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ pc2(Object obj, Object obj2) {
        this.f = obj;
        this.g = obj2;
    }

    @Override // defpackage.u33
    public boolean a() {
        rc2 rc2Var = (rc2) this.f;
        kk kkVar = (kk) this.g;
        if (!rc2Var.q) {
            rc2Var.h();
            kkVar.a = kk.a(rc2Var.o, kkVar.a);
            rc2Var.q = !rc2Var.g(rc2Var.n, r1 + kkVar.b);
        }
        return rc2Var.q;
    }
}
