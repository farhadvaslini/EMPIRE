package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class r70 extends mb3 implements ns0 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r70(Object obj, p40 p40Var, int i) {
        super(1, p40Var);
        this.j = i;
        this.l = obj;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        Object obj2 = this.l;
        p40 p40Var = (p40) obj;
        switch (i) {
            case 0:
                return new r70((y70) obj2, p40Var, 0).o(dm3Var);
            case 1:
                return new r70((sf3) obj2, p40Var, 1).o(dm3Var);
            default:
                return new r70((jj3) obj2, p40Var, 2).o(dm3Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a5, code lost:
    
        if (r14 == r4) goto L38;
     */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        Object obj2 = this.l;
        y50 y50Var = y50.f;
        p40 p40Var = null;
        switch (i) {
            case 0:
                int i2 = this.k;
                if (i2 == 0) {
                    y02.Q(obj);
                    this.k = 1;
                    Object objH = ((y70) obj2).h(this);
                    return objH == y50Var ? y50Var : objH;
                }
                if (i2 == 1) {
                    y02.Q(obj);
                    return obj;
                }
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                sf3 sf3Var = (sf3) obj2;
                int i3 = this.k;
                if (i3 == 0) {
                    y02.Q(obj);
                    this.k = 1;
                    if (sf3Var.s(this) != y50Var) {
                    }
                    return y50Var;
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                    sf3Var.B = true;
                    return dm3Var;
                }
                y02.Q(obj);
                r32 r32VarA = sf3.a(sf3Var);
                if (r32VarA != null) {
                    String str = (String) r32VarA.f;
                    long j = ((yg3) r32VarA.g).a;
                    c72 c72Var = sf3Var.j;
                    if (c72Var != null) {
                        this.k = 2;
                        Object objG = (str.length() == 0 || yg3.c(j)) ? dm3Var : cl3.G(c72Var.a, new n9(c72Var, new m(j, null, c72Var, str), p40Var, 10), this);
                        if (objG != y50Var) {
                            objG = dm3Var;
                        }
                    }
                    break;
                }
                sf3Var.B = true;
                return dm3Var;
            default:
                int i4 = this.k;
                if (i4 != 0) {
                    if (i4 == 1) {
                        y02.Q(obj);
                        return dm3Var;
                    }
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y02.Q(obj);
                jj3 jj3Var = (jj3) obj2;
                this.k = 1;
                jr jrVar = new jr(1, vr.I(this));
                jrVar.s();
                jj3Var.b.c.setValue(Boolean.TRUE);
                jj3Var.c = jrVar;
                return jrVar.q() == y50Var ? y50Var : dm3Var;
        }
    }
}
