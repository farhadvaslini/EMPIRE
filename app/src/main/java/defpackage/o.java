package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class o extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ qr1 l;
    public final /* synthetic */ zc2 m;
    public final /* synthetic */ r n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(qr1 qr1Var, zc2 zc2Var, r rVar, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.l = qr1Var;
        this.m = zc2Var;
        this.n = rVar;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        x50 x50Var = (x50) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
        }
        return ((o) m(p40Var, x50Var)).o(dm3Var);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        switch (this.j) {
            case 0:
                return new o(this.l, this.m, this.n, p40Var, 0);
            default:
                return new o(this.l, this.m, this.n, p40Var, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r3.b(r9, r10) == r6) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
    
        if (r3.b(r9, r10) == r6) goto L31;
     */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        r rVar = this.n;
        qr1 qr1Var = this.l;
        y50 y50Var = y50.f;
        zc2 zc2Var = this.m;
        switch (i) {
            case 0:
                int i2 = this.k;
                if (i2 == 0) {
                    y02.Q(obj);
                    long j = yw.a;
                    this.k = 1;
                    if (ur.A(j, this) != y50Var) {
                    }
                } else if (i2 == 1) {
                    y02.Q(obj);
                } else if (i2 != 2) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj);
                    rVar.L = zc2Var;
                }
                this.k = 2;
                break;
            default:
                int i3 = this.k;
                if (i3 == 0) {
                    y02.Q(obj);
                    long j2 = yw.a;
                    this.k = 1;
                    if (ur.A(j2, this) != y50Var) {
                    }
                } else if (i3 == 1) {
                    y02.Q(obj);
                } else if (i3 != 2) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj);
                    rVar.H = zc2Var;
                }
                this.k = 2;
                break;
        }
        return dm3Var;
    }
}
