package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class q extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public final /* synthetic */ r k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(r rVar, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.k = rVar;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        x50 x50Var = (x50) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
            case 0:
                ((q) m(p40Var, x50Var)).o(dm3Var);
                break;
            default:
                ((q) m(p40Var, x50Var)).o(dm3Var);
                break;
        }
        return dm3Var;
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        r rVar = this.k;
        switch (i) {
            case 0:
                return new q(rVar, p40Var, 0);
            default:
                return new q(rVar, p40Var, 1);
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        p40 p40Var = null;
        r rVar = this.k;
        switch (i) {
            case 0:
                y02.Q(obj);
                if (rVar.I == null) {
                    zy0 zy0Var = new zy0();
                    qr1 qr1Var = rVar.v;
                    if (qr1Var != null) {
                        cl3.t(rVar.d1(), null, new j(qr1Var, zy0Var, p40Var, 0), 3);
                    }
                    rVar.I = zy0Var;
                }
                break;
            default:
                y02.Q(obj);
                zy0 zy0Var2 = rVar.I;
                if (zy0Var2 != null) {
                    az0 az0Var = new az0(zy0Var2);
                    qr1 qr1Var2 = rVar.v;
                    if (qr1Var2 != null) {
                        cl3.t(rVar.d1(), null, new j(qr1Var2, az0Var, p40Var, 1), 3);
                    }
                    rVar.I = null;
                }
                break;
        }
        return dm3Var;
    }
}
