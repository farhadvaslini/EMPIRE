package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class z5 extends mb3 implements ns0 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z5(Object obj, Object obj2, Object obj3, p40 p40Var, int i) {
        super(1, p40Var);
        this.j = i;
        this.l = obj;
        this.m = obj2;
        this.n = obj3;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        Object obj2 = this.n;
        Object obj3 = this.l;
        switch (i) {
            case 0:
                ts0 ts0Var = (ts0) obj2;
                return new z5((d6) obj3, this.m, ts0Var, (p40) obj, 0).o(dm3Var);
            default:
                return new z5((jj3) obj3, (r70) this.m, (ts1) obj2, (p40) obj, 1).o(dm3Var);
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        y50 y50Var = y50.f;
        Object obj2 = this.l;
        Object obj3 = this.m;
        Object obj4 = this.n;
        p40 p40Var = null;
        switch (i) {
            case 0:
                d6 d6Var = (d6) obj2;
                int i2 = this.k;
                if (i2 != 0) {
                    if (i2 == 1) {
                        y02.Q(obj);
                        return dm3Var;
                    }
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y02.Q(obj);
                d6Var.h(obj3);
                int i3 = 4;
                v5 v5Var = new v5(d6Var, i3);
                l lVar = new l((ts0) obj4, d6Var, p40Var, i3);
                this.k = 1;
                return s51.l(v5Var, lVar, this) == y50Var ? y50Var : dm3Var;
            default:
                ts1 ts1Var = (ts1) obj4;
                r70 r70Var = (r70) obj3;
                jj3 jj3Var = (jj3) obj2;
                int i4 = this.k;
                ts1 ts1Var2 = ts1.h;
                try {
                    if (i4 == 0) {
                        y02.Q(obj);
                        l80 l80Var = new l80(r70Var, p40Var, 18);
                        this.k = 2;
                        if (t22.L(new ei3(1500L, this), l80Var) == y50Var) {
                            return y50Var;
                        }
                    } else {
                        if (i4 != 1 && i4 != 2) {
                            c.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y02.Q(obj);
                    }
                    if (ts1Var == ts1Var2) {
                        return dm3Var;
                    }
                    jj3Var.a();
                    return dm3Var;
                } catch (Throwable th) {
                    if (ts1Var != ts1Var2) {
                        jj3Var.a();
                    }
                    throw th;
                }
        }
    }
}
