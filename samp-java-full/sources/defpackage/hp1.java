package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class hp1 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ ip1 l;
    public final /* synthetic */ rk m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hp1(ip1 ip1Var, rk rkVar, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.l = ip1Var;
        this.m = rkVar;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        x50 x50Var = (x50) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
        }
        return ((hp1) m(p40Var, x50Var)).o(dm3Var);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        rk rkVar = this.m;
        ip1 ip1Var = this.l;
        switch (i) {
            case 0:
                return new hp1(ip1Var, rkVar, p40Var, 0);
            default:
                return new hp1(ip1Var, rkVar, p40Var, 1);
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        rk rkVar = this.m;
        ip1 ip1Var = this.l;
        y50 y50Var = y50.f;
        switch (i) {
            case 0:
                int i2 = this.k;
                if (i2 == 0) {
                    y02.Q(obj);
                    ed edVar = ip1Var.e;
                    Float f = new Float(al.a.b(rkVar.c));
                    this.k = 1;
                    if (edVar.f(this, f) == y50Var) {
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
                    ed edVar2 = ip1Var.e;
                    Float f2 = new Float(al.a.b(rkVar.c));
                    this.k = 1;
                    if (edVar2.f(this, f2) == y50Var) {
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
