package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class am implements cs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ tg3 g;

    public /* synthetic */ am(tg3 tg3Var, int i) {
        this.f = i;
        this.g = tg3Var;
    }

    @Override // defpackage.cs0
    public final Object a() {
        og3 og3Var;
        int i = this.f;
        int i2 = 2;
        tg3 tg3Var = this.g;
        switch (i) {
            case 0:
                return Boolean.valueOf(tg3Var != null ? ((Boolean) new am(tg3Var, i2).a()).booleanValue() : false);
            case 1:
                return Boolean.valueOf(tg3Var != null ? ((Boolean) new am(tg3Var, i2).a()).booleanValue() : false);
            default:
                af afVar = tg3Var.b;
                pg3 pg3Var = (pg3) tg3Var.a.getValue();
                return Boolean.valueOf(s51.n(afVar, (pg3Var == null || (og3Var = pg3Var.a) == null) ? null : og3Var.a));
        }
    }
}
