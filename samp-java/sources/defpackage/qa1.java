package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class qa1 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ sa1 l;
    public final /* synthetic */ String m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qa1(sa1 sa1Var, String str, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.l = sa1Var;
        this.m = str;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        x50 x50Var = (x50) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
        }
        return ((qa1) m(p40Var, x50Var)).o(dm3Var);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        String str = this.m;
        sa1 sa1Var = this.l;
        switch (i) {
            case 0:
                return new qa1(sa1Var, str, p40Var, 0);
            case 1:
                return new qa1(sa1Var, str, p40Var, 1);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return new qa1(sa1Var, str, p40Var, 2);
            default:
                return new qa1(sa1Var, str, p40Var, 3);
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        String str = this.m;
        sa1 sa1Var = this.l;
        y50 y50Var = y50.f;
        switch (i) {
            case 0:
                int i2 = this.k;
                if (i2 == 0) {
                    y02.Q(obj);
                    qy2 qy2Var = sa1Var.c;
                    this.k = 1;
                    if (qy2Var.k(str, this) == y50Var) {
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
                    qy2 qy2Var2 = sa1Var.c;
                    this.k = 1;
                    if (qy2Var2.l(str, this) == y50Var) {
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
                    qy2 qy2Var3 = sa1Var.c;
                    this.k = 1;
                    if (qy2Var3.q(str, this) == y50Var) {
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
                    qy2 qy2Var4 = sa1Var.c;
                    this.k = 1;
                    if (qy2Var4.s(str, this) == y50Var) {
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
