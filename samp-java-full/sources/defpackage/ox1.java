package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ox1 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ox1(int i, p40 p40Var, int i2) {
        super(2, p40Var);
        this.j = i2;
        this.l = i;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                break;
            case 1:
                ((ox1) m((p40) obj2, (es1) obj)).o(dm3Var);
                break;
            default:
                ((ox1) m((p40) obj2, (es1) obj)).o(dm3Var);
                break;
        }
        return dm3Var;
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        switch (this.j) {
            case 0:
                ox1 ox1Var = new ox1(2, p40Var);
                ox1Var.k = obj;
                return ox1Var;
            case 1:
                ox1 ox1Var2 = new ox1(this.l, p40Var, 1);
                ox1Var2.k = obj;
                return ox1Var2;
            default:
                ox1 ox1Var3 = new ox1(this.l, p40Var, 2);
                ox1Var3.k = obj;
                return ox1Var3;
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        x50 x50Var;
        int i = this.j;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                int i2 = this.l;
                if (i2 == 0) {
                    y02.Q(obj);
                    x50Var = (x50) this.k;
                } else if (i2 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    x50Var = (x50) this.k;
                    y02.Q(obj);
                }
                while (lq.L(x50Var.h())) {
                    fi1 fi1Var = new fi1(6);
                    this.k = x50Var;
                    this.l = 1;
                    o50 o50Var = this.g;
                    o50Var.getClass();
                    Object objA = lq.I(o50Var).a(fi1Var, this);
                    y50 y50Var = y50.f;
                    if (objA == y50Var) {
                        break;
                    }
                }
                break;
            case 1:
                es1 es1Var = (es1) this.k;
                y02.Q(obj);
                es1Var.d(qy2.K, new Integer(y02.h(this.l, 8, 16)));
                break;
            default:
                es1 es1Var2 = (es1) this.k;
                y02.Q(obj);
                es1Var2.d(qy2.J, new Integer(this.l));
                break;
        }
        return dm3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ox1(int i, p40 p40Var) {
        super(i, p40Var);
        this.j = 0;
    }
}
