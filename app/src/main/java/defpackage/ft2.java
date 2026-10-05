package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ft2 extends mb3 implements ns0 {
    public int j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ it2 m;
    public final /* synthetic */ gk3 n;
    public final /* synthetic */ float o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ft2(Object obj, Object obj2, it2 it2Var, gk3 gk3Var, float f, p40 p40Var) {
        super(1, p40Var);
        this.k = obj;
        this.l = obj2;
        this.m = it2Var;
        this.n = gk3Var;
        this.o = f;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        gk3 gk3Var = this.n;
        float f = this.o;
        return new ft2(this.k, this.l, this.m, gk3Var, f, (p40) obj).o(dm3.a);
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.j;
        if (i == 0) {
            y02.Q(obj);
            et2 et2Var = new et2(this.k, this.l, this.m, this.n, this.o, null);
            this.j = 1;
            Object objW = ur.w(et2Var, this);
            y50 y50Var = y50.f;
            if (objW == y50Var) {
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
