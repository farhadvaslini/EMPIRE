package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class y70 extends mb3 implements ns0 {
    public final /* synthetic */ int j = 1;
    public int k;
    public final /* synthetic */ Object l;
    public Object m;
    public Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y70(qk2 qk2Var, b80 b80Var, ok2 ok2Var, p40 p40Var) {
        super(1, p40Var);
        this.n = qk2Var;
        this.l = b80Var;
        this.o = ok2Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        Object obj2 = this.o;
        Object obj3 = this.l;
        p40 p40Var = (p40) obj;
        switch (i) {
            case 0:
                return new y70((qk2) this.n, (b80) obj3, (ok2) obj2, p40Var).o(dm3Var);
            case 1:
                return new y70((b80) obj3, (o50) this.n, (rs0) obj2, p40Var).o(dm3Var);
            default:
                return new y70((dm0) obj3, obj2, p40Var).o(dm3Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x014e, code lost:
    
        if (r12 != r6) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00dd  */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r12) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y70.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y70(dm0 dm0Var, Object obj, p40 p40Var) {
        super(1, p40Var);
        this.l = dm0Var;
        this.o = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y70(b80 b80Var, o50 o50Var, rs0 rs0Var, p40 p40Var) {
        super(1, p40Var);
        this.l = b80Var;
        this.n = o50Var;
        this.o = rs0Var;
    }
}
