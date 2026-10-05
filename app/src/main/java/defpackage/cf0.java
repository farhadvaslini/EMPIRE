package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class cf0 extends mb3 implements rs0 {
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ df0 l;
    public final /* synthetic */ long m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cf0(df0 df0Var, long j, p40 p40Var) {
        super(2, p40Var);
        this.l = df0Var;
        this.m = j;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        return ((cf0) m((p40) obj2, (x50) obj)).o(dm3.a);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        cf0 cf0Var = new cf0(this.l, this.m, p40Var);
        cf0Var.k = obj;
        return cf0Var;
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.j;
        if (i == 0) {
            y02.Q(obj);
            x50 x50Var = (x50) this.k;
            ss0 ss0Var = this.l.Q;
            gy1 gy1Var = new gy1(this.m);
            this.j = 1;
            Object objE = ss0Var.e(x50Var, gy1Var, this);
            y50 y50Var = y50.f;
            if (objE == y50Var) {
                return y50Var;
            }
        } else {
            if (i != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y02.Q(obj);
        }
        return dm3.a;
    }
}
