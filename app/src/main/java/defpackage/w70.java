package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class w70 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ boolean l;
    public final /* synthetic */ b80 m;
    public final /* synthetic */ int n;
    public Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w70(b80 b80Var, int i, p40 p40Var, int i2) {
        super(2, p40Var);
        this.j = i2;
        this.m = b80Var;
        this.n = i;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        p40 p40Var = (p40) obj2;
        switch (i) {
        }
        return ((w70) m(p40Var, bool)).o(dm3Var);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        int i2 = this.n;
        b80 b80Var = this.m;
        switch (i) {
            case 0:
                w70 w70Var = new w70(b80Var, i2, p40Var, 0);
                w70Var.l = ((Boolean) obj).booleanValue();
                return w70Var;
            default:
                w70 w70Var2 = new w70(b80Var, i2, p40Var, 1);
                w70Var2.l = ((Boolean) obj).booleanValue();
                return w70Var2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) {
        Throwable th;
        d93 zi2Var;
        boolean z;
        boolean z2;
        Object obj2;
        int i = this.j;
        int iIntValue = this.n;
        y50 y50Var = y50.f;
        b80 b80Var = this.m;
        switch (i) {
            case 0:
                boolean z3 = this.k;
                try {
                } catch (Throwable th2) {
                    th = th2;
                    if (z3 != 0) {
                        c43 c43VarI = b80Var.i();
                        this.o = th;
                        this.l = z3;
                        this.k = 2;
                        Integer numA = c43VarI.a();
                        if (numA != y50Var) {
                            obj = numA;
                            th = th;
                            z3 = z3;
                        }
                        return y50Var;
                    }
                }
                if (z3 == 0) {
                    y02.Q(obj);
                    boolean z4 = this.l;
                    this.l = z4;
                    this.k = 1;
                    obj = b80.h(b80Var, z4, this);
                    z3 = z4;
                    if (obj == y50Var) {
                        return y50Var;
                    }
                } else {
                    if (z3 != 1) {
                        if (z3 != 2) {
                            c.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        boolean z5 = this.l;
                        th = (Throwable) this.o;
                        y02.Q(obj);
                        z3 = z5;
                        iIntValue = ((Number) obj).intValue();
                        th = th;
                        zi2Var = new zi2(th, iIntValue);
                        z = z3;
                        return new r32(zi2Var, Boolean.valueOf(z));
                    }
                    boolean z6 = this.l;
                    y02.Q(obj);
                    z3 = z6;
                }
                zi2Var = (d93) obj;
                z = z3;
                return new r32(zi2Var, Boolean.valueOf(z));
            default:
                int i2 = this.k;
                if (i2 == 0) {
                    y02.Q(obj);
                    z2 = this.l;
                    this.l = z2;
                    this.k = 1;
                    obj = b80Var.j(this);
                    if (obj != y50Var) {
                    }
                    return y50Var;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj2 = this.o;
                    y02.Q(obj);
                    iIntValue = ((Number) obj).intValue();
                    obj = obj2;
                    return new a70(obj == null ? obj.hashCode() : 0, iIntValue, obj);
                }
                z2 = this.l;
                y02.Q(obj);
                if (z2) {
                    c43 c43VarI2 = b80Var.i();
                    this.o = obj;
                    this.k = 2;
                    Integer numA2 = c43VarI2.a();
                    if (numA2 != y50Var) {
                        Object obj3 = obj;
                        obj = numA2;
                        obj2 = obj3;
                        iIntValue = ((Number) obj).intValue();
                        obj = obj2;
                    }
                    return y50Var;
                }
                return new a70(obj == null ? obj.hashCode() : 0, iIntValue, obj);
        }
    }
}
