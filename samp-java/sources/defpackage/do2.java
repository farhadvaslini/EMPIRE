package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class do2 extends u71 implements ns0 {
    public final /* synthetic */ int g;
    public final /* synthetic */ eo2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ do2(eo2 eo2Var, int i) {
        super(1);
        this.g = i;
        this.h = eo2Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.g;
        eo2 eo2Var = this.h;
        switch (i) {
            case 0:
                return Double.valueOf(eo2Var.n.c(y02.f(((Number) obj).doubleValue(), eo2Var.e, eo2Var.f)));
            default:
                return Double.valueOf(y02.f(eo2Var.k.c(((Number) obj).doubleValue()), eo2Var.e, eo2Var.f));
        }
    }
}
