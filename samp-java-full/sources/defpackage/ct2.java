package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ct2 extends mb3 implements ns0 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ it2 l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ gk3 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ct2(it2 it2Var, Object obj, gk3 gk3Var, p40 p40Var, int i) {
        super(1, p40Var);
        this.j = i;
        this.l = it2Var;
        this.m = obj;
        this.n = gk3Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        p40 p40Var = (p40) obj;
        switch (i) {
            case 0:
                return new ct2(this.l, this.m, this.n, p40Var, 0).o(dm3Var);
            default:
                return new ct2(this.l, this.m, this.n, p40Var, 1).o(dm3Var);
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        y50 y50Var = y50.f;
        it2 it2Var = this.l;
        Object obj2 = this.m;
        gk3 gk3Var = this.n;
        switch (i) {
            case 0:
                int i2 = this.k;
                if (i2 == 0) {
                    y02.Q(obj);
                    m9 m9Var = new m9(it2Var, obj2, gk3Var, (p40) null);
                    this.k = 1;
                    return ur.w(m9Var, this) == y50Var ? y50Var : dm3Var;
                }
                if (i2 == 1) {
                    y02.Q(obj);
                    return dm3Var;
                }
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i3 = this.k;
                if (i3 == 0) {
                    y02.Q(obj);
                    it2Var.u();
                    d42 d42Var = it2Var.b;
                    it2Var.m = Long.MIN_VALUE;
                    it2Var.y(0.0f);
                    float f = obj2.equals(it2Var.c.getValue()) ? -4.0f : obj2.equals(d42Var.getValue()) ? -5.0f : -3.0f;
                    gk3Var.r(obj2);
                    gk3Var.n(0L);
                    d42Var.setValue(obj2);
                    it2Var.y(0.0f);
                    it2Var.m(obj2);
                    gk3Var.j(f);
                    if (f == -3.0f) {
                        this.k = 1;
                        if (it2.s(it2Var, this) == y50Var) {
                            return y50Var;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                gk3Var.i();
                return dm3Var;
        }
    }
}
