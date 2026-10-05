package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class sc extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ long l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sc(long j, rb3 rb3Var, p40 p40Var) {
        super(2, p40Var);
        this.j = 2;
        this.l = j;
        this.m = rb3Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        x50 x50Var = (x50) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
        }
        return ((sc) m(p40Var, x50Var)).o(dm3Var);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        Object obj2 = this.m;
        switch (i) {
            case 0:
                return new sc((tc) obj2, this.l, p40Var, 0);
            case 1:
                return new sc((ed) obj2, this.l, p40Var, 1);
            default:
                return new sc(this.l, (rb3) obj2, p40Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (defpackage.ur.A(8, r13) == r7) goto L16;
     */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        Object obj2 = this.m;
        y50 y50Var = y50.f;
        long j = this.l;
        switch (i) {
            case 0:
                int i2 = this.k;
                if (i2 == 0) {
                    y02.Q(obj);
                    gw1 gw1Var = ((tc) obj2).f;
                    this.k = 1;
                    return gw1Var.b(j, this) == y50Var ? y50Var : dm3Var;
                }
                if (i2 == 1) {
                    y02.Q(obj);
                    return dm3Var;
                }
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                int i3 = this.k;
                if (i3 != 0) {
                    if (i3 == 1) {
                        y02.Q(obj);
                        return dm3Var;
                    }
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y02.Q(obj);
                ed edVar = (ed) obj2;
                gy1 gy1Var = new gy1(j);
                s83 s83Var = mu2.d;
                this.k = 1;
                return ed.c(edVar, gy1Var, s83Var, null, this, 12) == y50Var ? y50Var : dm3Var;
            default:
                int i4 = this.k;
                if (i4 == 0) {
                    y02.Q(obj);
                    this.k = 1;
                    if (ur.A(j - 8, this) != y50Var) {
                    }
                    return y50Var;
                }
                if (i4 != 1) {
                    if (i4 != 2) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                    jr jrVar = ((rb3) obj2).h;
                    if (jrVar == null) {
                        return dm3Var;
                    }
                    jrVar.t(new qn2(new bb2(j)));
                    return dm3Var;
                }
                y02.Q(obj);
                this.k = 2;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sc(Object obj, long j, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.m = obj;
        this.l = j;
    }
}
