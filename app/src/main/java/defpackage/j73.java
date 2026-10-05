package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class j73 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ rs0 m;
    public final /* synthetic */ os1 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j73(rs0 rs0Var, os1 os1Var, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.m = rs0Var;
        this.n = os1Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        x50 x50Var = (x50) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
        }
        return ((j73) m(p40Var, x50Var)).o(dm3Var);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        switch (this.j) {
            case 0:
                j73 j73Var = new j73(this.m, this.n, p40Var, 0);
                j73Var.l = obj;
                return j73Var;
            case 1:
                j73 j73Var2 = new j73(this.m, this.n, p40Var, 1);
                j73Var2.l = obj;
                return j73Var2;
            default:
                j73 j73Var3 = new j73(this.m, this.n, p40Var, 2);
                j73Var3.l = obj;
                return j73Var3;
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        os1 os1Var = this.n;
        rs0 rs0Var = this.m;
        y50 y50Var = y50.f;
        switch (i) {
            case 0:
                int i2 = this.k;
                if (i2 == 0) {
                    y02.Q(obj);
                    jd2 jd2Var = new jd2(os1Var, ((x50) this.l).h());
                    this.k = 1;
                    if (rs0Var.f(jd2Var, this) == y50Var) {
                    }
                } else if (i2 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj);
                }
                break;
            case 1:
                int i3 = this.k;
                if (i3 == 0) {
                    y02.Q(obj);
                    jd2 jd2Var2 = new jd2(os1Var, ((x50) this.l).h());
                    this.k = 1;
                    if (rs0Var.f(jd2Var2, this) == y50Var) {
                    }
                } else if (i3 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj);
                }
                break;
            default:
                int i4 = this.k;
                if (i4 == 0) {
                    y02.Q(obj);
                    jd2 jd2Var3 = new jd2(os1Var, ((x50) this.l).h());
                    this.k = 1;
                    if (rs0Var.f(jd2Var3, this) == y50Var) {
                    }
                } else if (i4 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj);
                }
                break;
        }
        return y50Var;
    }
}
