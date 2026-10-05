package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class wd1 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wd1(ie1 ie1Var, int i, int i2, p40 p40Var) {
        super(2, p40Var);
        this.j = 1;
        this.m = ie1Var;
        this.k = i;
        this.l = i2;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                return ((wd1) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 1:
                ((wd1) m((p40) obj2, (cs2) obj)).o(dm3Var);
                return dm3Var;
            default:
                return ((wd1) m((p40) obj2, (cs2) obj)).o(dm3Var);
        }
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        int i2 = this.l;
        Object obj2 = this.m;
        switch (i) {
            case 0:
                return new wd1((xd1) obj2, i2, p40Var, 0);
            case 1:
                return new wd1((ie1) obj2, this.k, i2, p40Var);
            default:
                return new wd1((i32) obj2, i2, p40Var, 2);
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.j;
        y50 y50Var = y50.f;
        dm3 dm3Var = dm3.a;
        int i2 = this.l;
        Object obj2 = this.m;
        switch (i) {
            case 0:
                int i3 = this.k;
                if (i3 != 0) {
                    if (i3 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        y02.Q(obj);
                    }
                    break;
                } else {
                    y02.Q(obj);
                    pd1 pd1Var = ((xd1) obj2).u;
                    this.k = 1;
                    if (pd1Var.d(i2, this) == y50Var) {
                    }
                }
                break;
            case 1:
                y02.Q(obj);
                ie1 ie1Var = (ie1) obj2;
                int i4 = this.k;
                ot otVar = ie1Var.e;
                if (((a42) otVar.b).g() != i4 || ((a42) otVar.c).g() != i2) {
                    wc1 wc1Var = ie1Var.n;
                    wc1Var.c();
                    wc1Var.b = null;
                    z80 z80Var = ie1Var.a;
                }
                otVar.d(i4, i2);
                otVar.d = null;
                tb1 tb1Var = ie1Var.k;
                if (tb1Var != null) {
                    tb1Var.k();
                }
                break;
            default:
                i32 i32Var = (i32) obj2;
                int i5 = this.k;
                if (i5 != 0) {
                    if (i5 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        y02.Q(obj);
                    }
                    break;
                } else {
                    y02.Q(obj);
                    this.k = 1;
                    if (i32Var.i(this) == y50Var) {
                    }
                }
                i32Var.t(i32Var.j(i2), 0.0f, true);
                break;
        }
        return dm3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wd1(Object obj, int i, p40 p40Var, int i2) {
        super(2, p40Var);
        this.j = i2;
        this.m = obj;
        this.l = i;
    }
}
