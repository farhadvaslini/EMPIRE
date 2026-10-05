package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class re0 extends mb3 implements rs0 {
    public final /* synthetic */ int j = 0;
    public qk2 k;
    public qk2 l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ se0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public re0(qk2 qk2Var, se0 se0Var, p40 p40Var) {
        super(2, p40Var);
        this.l = qk2Var;
        this.o = se0Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                return ((re0) m((p40) obj2, (ns0) obj)).o(dm3Var);
            default:
                return ((re0) m((p40) obj2, (x50) obj)).o(dm3Var);
        }
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        se0 se0Var = this.o;
        switch (i) {
            case 0:
                re0 re0Var = new re0(this.l, se0Var, p40Var);
                re0Var.n = obj;
                return re0Var;
            default:
                re0 re0Var2 = new re0(se0Var, p40Var);
                re0Var2.n = obj;
                return re0Var2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e7, code lost:
    
        if (defpackage.se0.s1(r5, r8) != r4) goto L12;
     */
    /* JADX WARN: Path cross not found for [B:45:0x00ca, B:41:0x00b8], limit reached: 87 */
    /* JADX WARN: Path cross not found for [B:47:0x00ce, B:20:0x005e], limit reached: 87 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[PHI: r0 r3
      0x003a: PHI (r0v13 qk2) = (r0v5 qk2), (r0v17 qk2) binds: [B:14:0x0037, B:37:0x00af] A[DONT_GENERATE, DONT_INLINE]
      0x003a: PHI (r3v15 x50) = (r3v13 x50), (r3v16 x50) binds: [B:14:0x0037, B:37:0x00af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e A[PHI: r7
      0x005e: PHI (r7v14 x50) = (r7v7 x50), (r7v10 x50), (r7v10 x50), (r7v10 x50), (r7v12 x50), (r7v15 x50) binds: [B:19:0x0056, B:46:0x00cc, B:48:0x00d9, B:42:0x00c5, B:31:0x0089, B:12:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b8 A[Catch: CancellationException -> 0x00c8, TryCatch #2 {CancellationException -> 0x00c8, blocks: (B:39:0x00b2, B:41:0x00b8, B:45:0x00ca, B:47:0x00ce), top: B:85:0x00b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ca A[Catch: CancellationException -> 0x00c8, TryCatch #2 {CancellationException -> 0x00c8, blocks: (B:39:0x00b2, B:41:0x00b8, B:45:0x00ca, B:47:0x00ce), top: B:85:0x00b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0089 -> B:20:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00c5 -> B:20:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00cc -> B:20:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00d9 -> B:20:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00e7 -> B:12:0x002f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x0133 -> B:76:0x0134). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0137 -> B:78:0x0139). Please report as a decompilation issue!!! */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) throws Throwable {
        ns0 ns0Var;
        Object obj2;
        x50 x50Var;
        qk2 qk2Var;
        qk2 qk2Var2;
        qk2 qk2Var3;
        x50 x50Var2;
        x50 x50Var3;
        Object obj3;
        re0 re0Var;
        be0 be0Var;
        Object obj4;
        int i = this.j;
        dm3 dm3Var = dm3.a;
        y50 y50Var = y50.f;
        se0 se0Var = this.o;
        switch (i) {
            case 0:
                qk2 qk2Var4 = this.l;
                int i2 = this.m;
                if (i2 == 0) {
                    y02.Q(obj);
                    ns0Var = (ns0) this.n;
                    obj2 = qk2Var4.f;
                    if (obj2 instanceof ae0) {
                    }
                } else {
                    if (i2 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qk2 qk2Var5 = this.k;
                    ns0Var = (ns0) this.n;
                    y02.Q(obj);
                    be0 be0Var2 = (be0) obj;
                    qk2Var5.f = be0Var2;
                    obj2 = qk2Var4.f;
                    if ((obj2 instanceof ae0) && !(obj2 instanceof xd0)) {
                        yd0 yd0Var = obj2 instanceof yd0 ? (yd0) obj2 : null;
                        if (yd0Var != null) {
                            ns0Var.h(yd0Var);
                        }
                        np npVar = se0Var.z;
                        if (npVar != null) {
                            this.n = ns0Var;
                            this.k = qk2Var4;
                            this.m = 1;
                            obj = np.G(npVar, this);
                            if (obj == y50Var) {
                                return y50Var;
                            }
                            qk2Var5 = qk2Var4;
                            be0 be0Var22 = (be0) obj;
                            qk2Var5.f = be0Var22;
                            obj2 = qk2Var4.f;
                            return obj2 instanceof ae0 ? dm3Var : dm3Var;
                        }
                        qk2Var5 = qk2Var4;
                        be0Var22 = null;
                        qk2Var5.f = be0Var22;
                        obj2 = qk2Var4.f;
                        if (obj2 instanceof ae0) {
                        }
                    }
                }
                break;
            default:
                switch (this.m) {
                    case 0:
                        y02.Q(obj);
                        x50Var = (x50) this.n;
                        if (!ur.H(x50Var)) {
                            qk2Var = new qk2();
                            np npVar2 = se0Var.z;
                            if (npVar2 == null) {
                                qk2Var2 = qk2Var;
                                be0Var = null;
                                qk2Var.f = be0Var;
                                obj4 = qk2Var2.f;
                                if (obj4 instanceof zd0) {
                                }
                                return y50Var;
                            }
                            this.n = x50Var;
                            this.k = qk2Var;
                            this.l = qk2Var;
                            this.m = 1;
                            obj = np.G(npVar2, this);
                            if (obj != y50Var) {
                                qk2Var2 = qk2Var;
                                be0Var = (be0) obj;
                                qk2Var.f = be0Var;
                                obj4 = qk2Var2.f;
                                if (obj4 instanceof zd0) {
                                    this.n = x50Var;
                                    this.k = qk2Var2;
                                    this.l = null;
                                    this.m = 2;
                                    if (se0.t1(se0Var, (zd0) obj4, this) != y50Var) {
                                        qk2Var3 = qk2Var2;
                                        x50Var2 = x50Var;
                                        re0Var = new re0(qk2Var3, se0Var, null);
                                        this.n = x50Var2;
                                        this.k = qk2Var3;
                                        this.m = 3;
                                        if (se0Var.w1(re0Var, this) != y50Var) {
                                            x50Var = x50Var2;
                                            try {
                                            } catch (CancellationException unused) {
                                                x50Var3 = x50Var;
                                                this.n = x50Var3;
                                                this.k = null;
                                                this.m = 6;
                                                break;
                                            }
                                            obj3 = qk2Var3.f;
                                            if (obj3 instanceof ae0) {
                                                this.n = x50Var;
                                                this.k = null;
                                                this.m = 4;
                                                if (se0.u1(se0Var, (ae0) obj3, this) != y50Var) {
                                                    if (!ur.H(x50Var)) {
                                                    }
                                                }
                                            } else {
                                                if (obj3 instanceof xd0) {
                                                    this.n = x50Var;
                                                    this.k = null;
                                                    this.m = 5;
                                                    if (se0.s1(se0Var, this) != y50Var) {
                                                    }
                                                }
                                                if (!ur.H(x50Var)) {
                                                    return dm3Var;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return y50Var;
                        }
                        break;
                    case 1:
                        qk2Var = this.l;
                        qk2Var2 = this.k;
                        x50Var = (x50) this.n;
                        y02.Q(obj);
                        be0Var = (be0) obj;
                        qk2Var.f = be0Var;
                        obj4 = qk2Var2.f;
                        if (obj4 instanceof zd0) {
                        }
                        return y50Var;
                    case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                        qk2Var3 = this.k;
                        x50Var2 = (x50) this.n;
                        y02.Q(obj);
                        re0Var = new re0(qk2Var3, se0Var, null);
                        this.n = x50Var2;
                        this.k = qk2Var3;
                        this.m = 3;
                        if (se0Var.w1(re0Var, this) != y50Var) {
                        }
                        return y50Var;
                    case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                        qk2Var3 = this.k;
                        x50Var2 = (x50) this.n;
                        try {
                            y02.Q(obj);
                        } catch (CancellationException unused2) {
                            x50Var3 = x50Var2;
                            this.n = x50Var3;
                            this.k = null;
                            this.m = 6;
                        }
                        x50Var = x50Var2;
                        obj3 = qk2Var3.f;
                        if (obj3 instanceof ae0) {
                        }
                        break;
                    case oc2.LONG_FIELD_NUMBER /* 4 */:
                        x50Var3 = (x50) this.n;
                        try {
                            y02.Q(obj);
                        } catch (CancellationException unused3) {
                            this.n = x50Var3;
                            this.k = null;
                            this.m = 6;
                        }
                        x50Var = x50Var3;
                        if (!ur.H(x50Var)) {
                        }
                        break;
                    case oc2.STRING_FIELD_NUMBER /* 5 */:
                        x50Var3 = (x50) this.n;
                        y02.Q(obj);
                        x50Var = x50Var3;
                        if (!ur.H(x50Var)) {
                        }
                        break;
                    case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                        x50Var3 = (x50) this.n;
                        y02.Q(obj);
                        x50Var = x50Var3;
                        if (!ur.H(x50Var)) {
                        }
                        break;
                    default:
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public re0(se0 se0Var, p40 p40Var) {
        super(2, p40Var);
        this.o = se0Var;
    }
}
