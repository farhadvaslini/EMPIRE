package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class wg2 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public Object l;
    public final /* synthetic */ int m;
    public Object n;
    public final /* synthetic */ Object o;
    public Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wg2(String str, int i, String str2, xy2 xy2Var, String str3, p40 p40Var, int i2) {
        super(2, p40Var);
        this.j = i2;
        this.l = str;
        this.m = i;
        this.n = str2;
        this.o = xy2Var;
        this.p = str3;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        x50 x50Var = (x50) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
        }
        return ((wg2) m(p40Var, x50Var)).o(dm3Var);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        Object obj2 = this.o;
        switch (i) {
            case 0:
                return new wg2((String) this.l, this.m, (String) this.n, (xy2) obj2, (String) this.p, p40Var, 0);
            case 1:
                return new wg2((String) this.l, this.m, (String) this.n, (xy2) obj2, (String) this.p, p40Var, 1);
            default:
                return new wg2((tw) obj2, this.m, p40Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d5 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:10:0x0032, B:42:0x00d1, B:44:0x00d5, B:46:0x00f9, B:45:0x00e5, B:16:0x0049, B:37:0x00a3, B:17:0x004d, B:26:0x0073, B:31:0x0084, B:33:0x008a, B:38:0x00ac, B:20:0x0058, B:22:0x0060, B:23:0x0068), top: B:79:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e5 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:10:0x0032, B:42:0x00d1, B:44:0x00d5, B:46:0x00f9, B:45:0x00e5, B:16:0x0049, B:37:0x00a3, B:17:0x004d, B:26:0x0073, B:31:0x0084, B:33:0x008a, B:38:0x00ac, B:20:0x0058, B:22:0x0060, B:23:0x0068), top: B:79:0x001b }] */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wg2.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg2(tw twVar, int i, p40 p40Var) {
        super(2, p40Var);
        this.j = 2;
        this.o = twVar;
        this.m = i;
    }
}
