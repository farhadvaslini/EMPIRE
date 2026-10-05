package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class s22 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ i32 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s22(int i, p40 p40Var, i32 i32Var) {
        super(2, p40Var);
        this.j = i;
        this.l = i32Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        x50 x50Var = (x50) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
        }
        return ((s22) m(p40Var, x50Var)).o(dm3Var);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        switch (this.j) {
            case 0:
                return new s22(0, p40Var, this.l);
            case 1:
                return new s22(1, p40Var, this.l);
            default:
                return new s22(2, p40Var, this.l);
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        Object objF;
        Object objF2;
        int i = this.j;
        i32 i32Var = this.l;
        y50 y50Var = y50.f;
        dm3 dm3Var = dm3.a;
        p40 p40Var = null;
        switch (i) {
            case 0:
                int i2 = this.k;
                if (i2 != 0) {
                    if (i2 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        y02.Q(obj);
                    }
                    break;
                } else {
                    y02.Q(obj);
                    this.k = 1;
                    j32 j32Var = k32.a;
                    if (i32Var.k() - 1 < 0 || (objF = i32Var.f(i32Var.k() - 1, n92.F(0.0f, 0.0f, null, 7), this)) != y50Var) {
                        objF = dm3Var;
                    }
                    if (objF == y50Var) {
                    }
                }
                break;
            case 1:
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
                    this.k = 1;
                    j32 j32Var2 = k32.a;
                    if (i32Var.k() + 1 >= i32Var.n() || (objF2 = i32Var.f(i32Var.k() + 1, n92.F(0.0f, 0.0f, null, 7), this)) != y50Var) {
                        objF2 = dm3Var;
                    }
                    if (objF2 == y50Var) {
                    }
                }
                break;
            default:
                int i4 = this.k;
                if (i4 != 0) {
                    if (i4 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        y02.Q(obj);
                    }
                    break;
                } else {
                    y02.Q(obj);
                    this.k = 1;
                    int i5 = 2;
                    dc dcVar = new dc(i5, p40Var, i5);
                    i32Var.getClass();
                    Object objS = i32.s(i32Var, ts1.f, dcVar, this);
                    if (objS != y50Var) {
                        objS = dm3Var;
                    }
                    if (objS == y50Var) {
                    }
                }
                break;
        }
        return dm3Var;
    }
}
