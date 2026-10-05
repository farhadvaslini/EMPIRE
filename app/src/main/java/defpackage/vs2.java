package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class vs2 extends mb3 implements rs0 {
    public long j;
    public int k;
    public /* synthetic */ long l;
    public final /* synthetic */ ws2 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs2(ws2 ws2Var, p40 p40Var) {
        super(2, p40Var);
        this.m = ws2Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        long j = ((lp3) obj).a;
        vs2 vs2Var = new vs2(this.m, (p40) obj2);
        vs2Var.l = j;
        return vs2Var.o(dm3.a);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        vs2 vs2Var = new vs2(this.m, p40Var);
        vs2Var.l = ((lp3) obj).a;
        return vs2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.k;
        ws2 ws2Var = this.m;
        y50 y50Var = y50.f;
        if (i == 0) {
            y02.Q(obj);
            j = this.l;
            gw1 gw1Var = ws2Var.f;
            this.l = j;
            this.k = 1;
            obj = gw1Var.b(j, this);
            if (obj != y50Var) {
            }
            return y50Var;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j4 = this.j;
                j3 = this.l;
                y02.Q(obj);
                return new lp3(lp3.d(j3, lp3.d(j4, ((lp3) obj).a)));
            }
            j2 = this.j;
            j = this.l;
            y02.Q(obj);
            long j5 = ((lp3) obj).a;
            gw1 gw1Var2 = ws2Var.f;
            long jD = lp3.d(j2, j5);
            this.l = j;
            this.j = j5;
            this.k = 3;
            obj = gw1Var2.a(jD, j5, this);
            if (obj != y50Var) {
                j3 = j;
                j4 = j5;
                return new lp3(lp3.d(j3, lp3.d(j4, ((lp3) obj).a)));
            }
            return y50Var;
        }
        j = this.l;
        y02.Q(obj);
        long jD2 = lp3.d(j, ((lp3) obj).a);
        this.l = j;
        this.j = jD2;
        this.k = 2;
        obj = ws2Var.a(jD2, this);
        if (obj != y50Var) {
            j2 = jD2;
            long j52 = ((lp3) obj).a;
            gw1 gw1Var22 = ws2Var.f;
            long jD3 = lp3.d(j2, j52);
            this.l = j;
            this.j = j52;
            this.k = 3;
            obj = gw1Var22.a(jD3, j52, this);
            if (obj != y50Var) {
            }
        }
        return y50Var;
    }
}
