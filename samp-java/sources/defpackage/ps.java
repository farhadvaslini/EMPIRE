package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ps extends mb3 implements rs0 {
    public final /* synthetic */ int j = 0;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ ss m;
    public final /* synthetic */ gn0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ps(ss ssVar, gn0 gn0Var, Object obj, p40 p40Var) {
        super(2, p40Var);
        this.m = ssVar;
        this.n = gn0Var;
        this.l = obj;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        x50 x50Var = (x50) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
        }
        return ((ps) m(p40Var, x50Var)).o(dm3Var);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        gn0 gn0Var = this.n;
        ss ssVar = this.m;
        switch (i) {
            case 0:
                return new ps(ssVar, gn0Var, this.l, p40Var);
            default:
                ps psVar = new ps(ssVar, gn0Var, p40Var);
                psVar.l = obj;
                return psVar;
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        y50 y50Var = y50.f;
        switch (i) {
            case 0:
                int i2 = this.k;
                if (i2 == 0) {
                    y02.Q(obj);
                    ss0 ss0Var = this.m.j;
                    Object obj2 = this.l;
                    this.k = 1;
                    if (ss0Var.e(this.n, obj2, this) == y50Var) {
                    }
                } else if (i2 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj);
                }
                break;
            default:
                x50 x50Var = (x50) this.l;
                int i3 = this.k;
                if (i3 == 0) {
                    y02.Q(obj);
                    qk2 qk2Var = new qk2();
                    ss ssVar = this.m;
                    fn0 fn0Var = ssVar.i;
                    rs rsVar = new rs(qk2Var, x50Var, ssVar, this.n, 0);
                    this.l = null;
                    this.k = 1;
                    if (fn0Var.a(rsVar, this) == y50Var) {
                    }
                } else if (i3 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj);
                }
                break;
        }
        return y50Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ps(ss ssVar, gn0 gn0Var, p40 p40Var) {
        super(2, p40Var);
        this.m = ssVar;
        this.n = gn0Var;
    }
}
