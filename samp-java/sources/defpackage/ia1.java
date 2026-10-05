package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ia1 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ int l;
    public Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia1(ed edVar, int i, ot2 ot2Var, p40 p40Var) {
        super(2, p40Var);
        this.j = 5;
        this.m = edVar;
        this.l = i;
        this.n = ot2Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                return ((ia1) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 1:
                return ((ia1) m((p40) obj2, (x50) obj)).o(dm3Var);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ((ia1) m((p40) obj2, Integer.valueOf(((Number) obj).intValue()))).o(dm3Var);
                return dm3Var;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                ((ia1) m((p40) obj2, Integer.valueOf(((Number) obj).intValue()))).o(dm3Var);
                return dm3Var;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                return ((ia1) m((p40) obj2, (x50) obj)).o(dm3Var);
            default:
                return ((ia1) m((p40) obj2, (x50) obj)).o(dm3Var);
        }
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        int i2 = this.l;
        Object obj2 = this.n;
        switch (i) {
            case 0:
                return new ia1(this.l, (sa1) this.m, (kq2) obj2, p40Var, 0);
            case 1:
                return new ia1(this.l, (sa1) this.m, (sv2) obj2, p40Var, 1);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ia1 ia1Var = new ia1(this.l, (z60) this.m, (a42) obj2, p40Var, 2);
                ia1Var.k = ((Number) obj).intValue();
                return ia1Var;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                ia1 ia1Var2 = new ia1(this.l, (ns0) this.m, (os1) obj2, p40Var, 3);
                ia1Var2.k = ((Number) obj).intValue();
                return ia1Var2;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                return new ia1((oa2) obj2, i2, p40Var);
            default:
                return new ia1((ed) this.m, i2, (ot2) obj2, p40Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fc A[Catch: all -> 0x0067, TryCatch #0 {all -> 0x0067, blocks: (B:20:0x0062, B:51:0x00f8, B:53:0x00fc, B:55:0x0120, B:54:0x010c, B:26:0x0074, B:46:0x00cd, B:27:0x0078, B:36:0x009e, B:41:0x00af, B:43:0x00b5, B:47:0x00d5, B:30:0x0083, B:32:0x008b, B:33:0x0093), top: B:107:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010c A[Catch: all -> 0x0067, TryCatch #0 {all -> 0x0067, blocks: (B:20:0x0062, B:51:0x00f8, B:53:0x00fc, B:55:0x0120, B:54:0x010c, B:26:0x0074, B:46:0x00cd, B:27:0x0078, B:36:0x009e, B:41:0x00af, B:43:0x00b5, B:47:0x00d5, B:30:0x0083, B:32:0x008b, B:33:0x0093), top: B:107:0x0056 }] */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ia1.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ia1(int i, Object obj, Object obj2, p40 p40Var, int i2) {
        super(2, p40Var);
        this.j = i2;
        this.l = i;
        this.m = obj;
        this.n = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia1(oa2 oa2Var, int i, p40 p40Var) {
        super(2, p40Var);
        this.j = 4;
        this.n = oa2Var;
        this.l = i;
    }
}
