package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r70.o(java.lang.Object):java.lang.Object");
    }
}
