package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class m8 implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ pb0 g;

    public /* synthetic */ m8(pb0 pb0Var, int i) {
        this.f = i;
        this.g = pb0Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.f;
        pb0 pb0Var = this.g;
        switch (i) {
            case 0:
                pb0Var.show();
                return new c4(1, pb0Var);
            default:
                if (pb0Var.k.a) {
                    pb0Var.j.a();
                }
                return dm3.a;
        }
    }
}
