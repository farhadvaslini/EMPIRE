package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class zp extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ t41 l;
    public final /* synthetic */ l73 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zp(t41 t41Var, l73 l73Var, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.l = t41Var;
        this.m = l73Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        x50 x50Var = (x50) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
        }
        return ((zp) m(p40Var, x50Var)).o(dm3Var);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        switch (this.j) {
            case 0:
                return new zp(this.l, this.m, p40Var, 0);
            case 1:
                return new zp(this.l, this.m, p40Var, 1);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return new zp(this.l, this.m, p40Var, 2);
            default:
                return new zp(this.l, this.m, p40Var, 3);
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        l73 l73Var = this.m;
        t41 t41Var = this.l;
        y50 y50Var = y50.f;
        switch (i) {
            case 0:
                int i2 = this.k;
                if (i2 == 0) {
                    y02.Q(obj);
                    fn0 fn0VarA = t41Var.a();
                    yp ypVar = new yp(l73Var, 0);
                    this.k = 1;
                    if (fn0VarA.a(ypVar, this) == y50Var) {
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
                    fn0 fn0VarA2 = t41Var.a();
                    yp ypVar2 = new yp(l73Var, 1);
                    this.k = 1;
                    if (fn0VarA2.a(ypVar2, this) == y50Var) {
                    }
                } else if (i3 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj);
                }
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                int i4 = this.k;
                if (i4 == 0) {
                    y02.Q(obj);
                    fn0 fn0VarA3 = t41Var.a();
                    yp ypVar3 = new yp(l73Var, 2);
                    this.k = 1;
                    if (fn0VarA3.a(ypVar3, this) == y50Var) {
                    }
                } else if (i4 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj);
                }
                break;
            default:
                int i5 = this.k;
                if (i5 == 0) {
                    y02.Q(obj);
                    fn0 fn0VarA4 = t41Var.a();
                    yp ypVar4 = new yp(l73Var, 3);
                    this.k = 1;
                    if (fn0VarA4.a(ypVar4, this) == y50Var) {
                    }
                } else if (i5 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj);
                }
                break;
        }
        return y50Var;
    }
}
