package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ah1 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ ed l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ah1(ed edVar, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.l = edVar;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        x50 x50Var = (x50) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
        }
        return ((ah1) m(p40Var, x50Var)).o(dm3Var);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        switch (this.j) {
            case 0:
                return new ah1(this.l, p40Var, 0);
            case 1:
                return new ah1(this.l, p40Var, 1);
            default:
                return new ah1(this.l, p40Var, 2);
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
                    Float f = new Float(0.0f);
                    s83 s83Var = new s83(1.0f, 300.0f, new Float(0.5f));
                    this.k = 1;
                    if (ed.c(this.l, f, s83Var, null, this, 12) == y50Var) {
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
                    Float f2 = new Float(0.0f);
                    s83 s83Var2 = new s83(1.0f, 300.0f, new Float(0.5f));
                    this.k = 1;
                    if (ed.c(this.l, f2, s83Var2, null, this, 12) == y50Var) {
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
                    Float f3 = new Float(0.0f);
                    this.k = 1;
                    if (ed.c(this.l, f3, null, null, this, 14) == y50Var) {
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
