package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class qp1 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ s33 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qp1(s33 s33Var, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.l = s33Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        x50 x50Var = (x50) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
        }
        return ((qp1) m(p40Var, x50Var)).o(dm3Var);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        s33 s33Var = this.l;
        switch (i) {
            case 0:
                return new qp1(s33Var, p40Var, 0);
            case 1:
                return new qp1(s33Var, p40Var, 1);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return new qp1(s33Var, p40Var, 2);
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                return new qp1(s33Var, p40Var, 3);
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                return new qp1(s33Var, p40Var, 4);
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                return new qp1(s33Var, p40Var, 5);
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                return new qp1(s33Var, p40Var, 6);
            default:
                return new qp1(s33Var, p40Var, 7);
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        s33 s33Var = this.l;
        y50 y50Var = y50.f;
        switch (i) {
            case 0:
                int i2 = this.k;
                if (i2 == 0) {
                    y02.Q(obj);
                    this.k = 1;
                    if (s33Var.e(this) == y50Var) {
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
                    this.k = 1;
                    if (s33Var.c(this) == y50Var) {
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
                    this.k = 1;
                    if (s33Var.f(this) == y50Var) {
                    }
                } else if (i4 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj);
                }
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                int i5 = this.k;
                if (i5 == 0) {
                    y02.Q(obj);
                    this.k = 1;
                    if (s33Var.c(this) == y50Var) {
                    }
                } else if (i5 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj);
                }
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                int i6 = this.k;
                if (i6 == 0) {
                    y02.Q(obj);
                    this.k = 1;
                    if (s33Var.b(this) == y50Var) {
                    }
                } else if (i6 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj);
                }
                break;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                int i7 = this.k;
                if (i7 == 0) {
                    y02.Q(obj);
                    this.k = 1;
                    if (s33Var.f(this) == y50Var) {
                    }
                } else if (i7 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj);
                }
                break;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                int i8 = this.k;
                if (i8 == 0) {
                    y02.Q(obj);
                    this.k = 1;
                    if (s33Var.b(this) == y50Var) {
                    }
                } else if (i8 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj);
                }
                break;
            default:
                int i9 = this.k;
                if (i9 == 0) {
                    y02.Q(obj);
                    this.k = 1;
                    if (s33Var.e(this) == y50Var) {
                    }
                } else if (i9 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj);
                }
                break;
        }
        return y50Var;
    }
}
