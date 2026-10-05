package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class n extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ qr1 l;
    public final /* synthetic */ zc2 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(zc2 zc2Var, qr1 qr1Var, p40 p40Var) {
        super(2, p40Var);
        this.j = 0;
        this.m = zc2Var;
        this.l = qr1Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        x50 x50Var = (x50) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
        }
        return ((n) m(p40Var, x50Var)).o(dm3Var);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        zc2 zc2Var = this.m;
        qr1 qr1Var = this.l;
        switch (i) {
            case 0:
                return new n(zc2Var, qr1Var, p40Var);
            case 1:
                return new n(qr1Var, zc2Var, p40Var, 1);
            default:
                return new n(qr1Var, zc2Var, p40Var, 2);
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        zc2 zc2Var = this.m;
        qr1 qr1Var = this.l;
        y50 y50Var = y50.f;
        switch (i) {
            case 0:
                int i2 = this.k;
                if (i2 == 0) {
                    y02.Q(obj);
                    ad2 ad2Var = new ad2(zc2Var);
                    this.k = 1;
                    if (qr1Var.b(ad2Var, this) == y50Var) {
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
                    if (qr1Var.b(zc2Var, this) == y50Var) {
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
                    this.k = 1;
                    if (qr1Var.b(zc2Var, this) == y50Var) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(qr1 qr1Var, zc2 zc2Var, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.l = qr1Var;
        this.m = zc2Var;
    }
}
