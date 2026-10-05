package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class z81 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ i32 l;
    public final /* synthetic */ lj0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z81(i32 i32Var, lj0 lj0Var, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.l = i32Var;
        this.m = lj0Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        x50 x50Var = (x50) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
        }
        return ((z81) m(p40Var, x50Var)).o(dm3Var);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        switch (this.j) {
            case 0:
                return new z81(this.l, this.m, p40Var, 0);
            case 1:
                return new z81(this.l, this.m, p40Var, 1);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return new z81(this.l, this.m, p40Var, 2);
            default:
                return new z81(this.l, this.m, p40Var, 3);
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        lj0 lj0Var = this.m;
        i32 i32Var = this.l;
        y50 y50Var = y50.f;
        switch (i) {
            case 0:
                int i2 = this.k;
                if (i2 == 0) {
                    y02.Q(obj);
                    int iIndexOf = ((mj0) lj0Var).indexOf(ea1.h);
                    this.k = 1;
                    if (i32Var.f(iIndexOf, n92.F(0.0f, 0.0f, null, 7), this) == y50Var) {
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
                    int iIndexOf2 = ((mj0) lj0Var).indexOf(ea1.i);
                    this.k = 1;
                    if (i32Var.f(iIndexOf2, n92.F(0.0f, 0.0f, null, 7), this) == y50Var) {
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
                    int iIndexOf3 = ((mj0) lj0Var).indexOf(ea1.h);
                    this.k = 1;
                    if (i32Var.f(iIndexOf3, n92.F(0.0f, 0.0f, null, 7), this) == y50Var) {
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
                    int iIndexOf4 = ((mj0) lj0Var).indexOf(ea1.i);
                    this.k = 1;
                    if (i32Var.f(iIndexOf4, n92.F(0.0f, 0.0f, null, 7), this) == y50Var) {
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
