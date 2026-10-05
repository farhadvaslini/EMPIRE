package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class hf3 extends mb3 implements ss0 {
    public int j;
    public /* synthetic */ xc2 k;
    public /* synthetic */ long l;
    public final /* synthetic */ x50 m;
    public final /* synthetic */ os1 n;
    public final /* synthetic */ qr1 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf3(x50 x50Var, os1 os1Var, qr1 qr1Var, p40 p40Var) {
        super(3, p40Var);
        this.m = x50Var;
        this.n = os1Var;
        this.o = qr1Var;
    }

    @Override // defpackage.ss0
    public final Object e(Object obj, Object obj2, Object obj3) {
        long j = ((gy1) obj2).a;
        os1 os1Var = this.n;
        qr1 qr1Var = this.o;
        hf3 hf3Var = new hf3(this.m, os1Var, qr1Var, (p40) obj3);
        hf3Var.k = (xc2) obj;
        hf3Var.l = j;
        return hf3Var.o(dm3.a);
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.j;
        x50 x50Var = this.m;
        if (i == 0) {
            y02.Q(obj);
            xc2 xc2Var = this.k;
            cl3.t(x50Var, null, new m(this.n, this.l, this.o, (p40) null, 4), 3);
            this.j = 1;
            obj = xc2Var.y(this);
            y50 y50Var = y50.f;
            if (obj == y50Var) {
                return y50Var;
            }
        } else {
            if (i != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y02.Q(obj);
        }
        cl3.t(x50Var, null, new na2(this.n, ((Boolean) obj).booleanValue(), this.o, (p40) null), 3);
        return dm3.a;
    }
}
