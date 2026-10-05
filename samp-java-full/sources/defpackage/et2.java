package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class et2 extends mb3 implements rs0 {
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ it2 n;
    public final /* synthetic */ gk3 o;
    public final /* synthetic */ float p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et2(Object obj, Object obj2, it2 it2Var, gk3 gk3Var, float f, p40 p40Var) {
        super(2, p40Var);
        this.l = obj;
        this.m = obj2;
        this.n = it2Var;
        this.o = gk3Var;
        this.p = f;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        return ((et2) m((p40) obj2, (x50) obj)).o(dm3.a);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        et2 et2Var = new et2(this.l, this.m, this.n, this.o, this.p, p40Var);
        et2Var.k = obj;
        return et2Var;
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        it2 it2Var = this.n;
        if (i == 0) {
            y02.Q(obj);
            x50 x50Var = (x50) this.k;
            Object obj2 = this.l;
            Object obj3 = this.m;
            if (s51.n(obj2, obj3)) {
                it2Var.o = null;
                if (s51.n(it2Var.c.getValue(), obj2)) {
                    return dm3Var;
                }
            } else {
                it2.p(it2Var);
            }
            boolean zN = s51.n(obj2, obj3);
            float f = this.p;
            if (!zN) {
                gk3 gk3Var = this.o;
                gk3Var.r(obj2);
                gk3Var.n(0L);
                it2Var.b.setValue(obj2);
                gk3Var.j(f);
            }
            it2Var.y(f);
            if (it2Var.n.j()) {
                cl3.t(x50Var, null, new l80(it2Var, null, 11), 3);
            } else {
                it2Var.m = Long.MIN_VALUE;
            }
            this.j = 1;
            Object objS = it2.s(it2Var, this);
            y50 y50Var = y50.f;
            if (objS == y50Var) {
                return y50Var;
            }
        } else {
            if (i != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y02.Q(obj);
        }
        it2Var.x();
        return dm3Var;
    }
}
