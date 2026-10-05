package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class lm extends pn2 implements rs0 {
    public i93 h;
    public ab2 i;
    public long j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ x50 m;
    public final /* synthetic */ jj3 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lm(x50 x50Var, jj3 jj3Var, p40 p40Var) {
        super(p40Var);
        this.m = x50Var;
        this.n = jj3Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        return ((lm) m((p40) obj2, (rb3) obj)).o(dm3.a);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        lm lmVar = new lm(this.m, this.n, p40Var);
        lmVar.l = obj;
        return lmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c2 A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #0 {all -> 0x0019, blocks: (B:8:0x0014, B:41:0x00be, B:43:0x00c2), top: B:50:0x0014 }] */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10, types: [i93, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v14, types: [i93] */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v2, types: [i93, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v8 */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) throws Throwable {
        ?? r13;
        long j;
        rb3 rb3Var;
        ab2 ab2Var;
        i93 i93Var;
        u8 u8Var;
        i93 i93Var2;
        Object obj2;
        ?? r0;
        gb2 gb2Var;
        ?? r02 = this.k;
        int i = 1;
        p40 p40Var = null;
        y50 y50Var = y50.f;
        try {
            if (r02 == 0) {
                y02.Q(obj);
                rb3 rb3Var2 = (rb3) this.l;
                i93 i93VarE = s51.e(Boolean.FALSE);
                long jC = rb3Var2.F().c();
                this.l = rb3Var2;
                this.h = i93VarE;
                ab2 ab2Var2 = ab2.f;
                this.i = ab2Var2;
                this.j = jC;
                this.k = 1;
                Object objB = cd3.b(rb3Var2, this, 1);
                if (objB != y50Var) {
                    j = jC;
                    rb3Var = rb3Var2;
                    obj = objB;
                    i93Var = i93VarE;
                    ab2Var = ab2Var2;
                }
                return y50Var;
            }
            if (r02 != 1) {
                if (r02 != 2) {
                    if (r02 != 3) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r13 = (i93) this.l;
                    try {
                        y02.Q(obj);
                        r0 = r02;
                        r13 = r13;
                        gb2Var = (gb2) obj;
                        if (gb2Var != null) {
                            gb2Var.a();
                        }
                        Boolean bool = Boolean.FALSE;
                        r13.getClass();
                        r13.j(null, bool);
                        r02 = r0;
                        return dm3.a;
                    } catch (Throwable th) {
                        th = th;
                        Boolean bool2 = Boolean.FALSE;
                        r13.getClass();
                        r13.j(null, bool2);
                        throw th;
                    }
                }
                ab2 ab2Var3 = this.i;
                i93 i93Var3 = this.h;
                rb3Var = (rb3) this.l;
                try {
                    y02.Q(obj);
                    obj2 = ab2Var3;
                    i93Var2 = i93Var3;
                    Boolean bool3 = Boolean.FALSE;
                    i93Var2.getClass();
                    i93Var2.j(null, bool3);
                    r02 = obj2;
                } catch (bb2 unused) {
                    ab2Var = ab2Var3;
                    i93Var = i93Var3;
                    cl3.t(this.m, null, new l(i93Var, this.n, p40Var, 6), 1);
                    this.l = i93Var;
                    this.h = null;
                    this.i = null;
                    this.k = 3;
                    obj = cd3.i(rb3Var, ab2Var, this);
                    if (obj != y50Var) {
                    }
                    return y50Var;
                } catch (Throwable th2) {
                    th = th2;
                    r13 = i93Var3;
                    Boolean bool22 = Boolean.FALSE;
                    r13.getClass();
                    r13.j(null, bool22);
                    throw th;
                }
                return dm3.a;
            }
            long j2 = this.j;
            ab2 ab2Var4 = this.i;
            i93 i93Var4 = this.h;
            rb3 rb3Var3 = (rb3) this.l;
            y02.Q(obj);
            ab2Var = ab2Var4;
            i93Var = i93Var4;
            j = j2;
            rb3Var = rb3Var3;
            long j3 = j;
            int i2 = ((gb2) obj).i;
            if (i2 == 1 || i2 == 3) {
                try {
                    u8Var = new u8(ab2Var, p40Var, i);
                    this.l = rb3Var;
                    this.h = i93Var;
                    this.i = ab2Var;
                    this.k = 2;
                } catch (bb2 unused2) {
                    cl3.t(this.m, null, new l(i93Var, this.n, p40Var, 6), 1);
                    this.l = i93Var;
                    this.h = null;
                    this.i = null;
                    this.k = 3;
                    obj = cd3.i(rb3Var, ab2Var, this);
                    if (obj != y50Var) {
                        r13 = i93Var;
                        r0 = i93Var;
                        gb2Var = (gb2) obj;
                        if (gb2Var != null) {
                        }
                        Boolean bool4 = Boolean.FALSE;
                        r13.getClass();
                        r13.j(null, bool4);
                        r02 = r0;
                        return dm3.a;
                    }
                }
                if (rb3Var.H(j3, u8Var, this) != y50Var) {
                    i93Var2 = i93Var;
                    obj2 = i93Var;
                    Boolean bool32 = Boolean.FALSE;
                    i93Var2.getClass();
                    i93Var2.j(null, bool32);
                    r02 = obj2;
                }
                return y50Var;
            }
            return dm3.a;
        } catch (Throwable th3) {
            th = th3;
            r13 = r02;
        }
    }
}
