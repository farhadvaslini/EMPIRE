package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class nf3 extends mb3 implements ns0 {
    public final /* synthetic */ int j;
    public final /* synthetic */ sf3 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nf3(sf3 sf3Var, p40 p40Var, int i) {
        super(1, p40Var);
        this.j = i;
        this.k = sf3Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        sf3 sf3Var = this.k;
        p40 p40Var = (p40) obj;
        switch (i) {
            case 0:
                new nf3(sf3Var, p40Var, 0).o(dm3Var);
                break;
            case 1:
                new nf3(sf3Var, p40Var, 1).o(dm3Var);
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                new nf3(sf3Var, p40Var, 2).o(dm3Var);
                break;
            default:
                new nf3(sf3Var, p40Var, 3).o(dm3Var);
                break;
        }
        return dm3Var;
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        sf3 sf3Var = this.k;
        switch (i) {
            case 0:
                y02.Q(obj);
                sf3Var.B = false;
                break;
            case 1:
                y02.Q(obj);
                sf3Var.f();
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                y02.Q(obj);
                sf3Var.d(sf3Var.B);
                break;
            default:
                y02.Q(obj);
                sf3Var.p();
                break;
        }
        return dm3Var;
    }
}
