package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class zc3 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ ss0 l;
    public final /* synthetic */ xc2 m;
    public final /* synthetic */ gb2 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zc3(ss0 ss0Var, xc2 xc2Var, gb2 gb2Var, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.l = ss0Var;
        this.m = xc2Var;
        this.n = gb2Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        x50 x50Var = (x50) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
        }
        return ((zc3) m(p40Var, x50Var)).o(dm3Var);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        switch (this.j) {
            case 0:
                return new zc3(this.l, this.m, this.n, p40Var, 0);
            default:
                return new zc3(this.l, this.m, this.n, p40Var, 1);
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        gb2 gb2Var = this.n;
        xc2 xc2Var = this.m;
        ss0 ss0Var = this.l;
        y50 y50Var = y50.f;
        switch (i) {
            case 0:
                int i2 = this.k;
                if (i2 == 0) {
                    y02.Q(obj);
                    gy1 gy1Var = new gy1(gb2Var.c);
                    this.k = 1;
                    if (ss0Var.e(xc2Var, gy1Var, this) == y50Var) {
                    }
                } else if (i2 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj);
                }
                break;
            default:
                int i3 = this.k;
                if (i3 == 0) {
                    y02.Q(obj);
                    gy1 gy1Var2 = new gy1(gb2Var.c);
                    this.k = 1;
                    if (ss0Var.e(xc2Var, gy1Var2, this) == y50Var) {
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
}
