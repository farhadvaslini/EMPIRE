package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class w30 extends mb3 implements rs0 {
    public final /* synthetic */ int j = 1;
    public int k;
    public final /* synthetic */ long l;
    public /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w30(c72 c72Var, String str, long j, yg3 yg3Var, sf3 sf3Var, iy1 iy1Var, p40 p40Var) {
        super(2, p40Var);
        this.m = c72Var;
        this.n = str;
        this.l = j;
        this.o = yg3Var;
        this.p = sf3Var;
        this.q = iy1Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                return ((w30) m((p40) obj2, (us2) obj)).o(dm3Var);
            default:
                return ((w30) m((p40) obj2, (x50) obj)).o(dm3Var);
        }
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        Object obj2 = this.q;
        Object obj3 = this.p;
        Object obj4 = this.o;
        Object obj5 = this.n;
        switch (i) {
            case 0:
                w30 w30Var = new w30((um3) obj5, (y30) obj4, (zo) obj3, this.l, (j61) obj2, p40Var);
                w30Var.m = obj;
                return w30Var;
            default:
                return new w30((c72) this.m, (String) obj5, this.l, (yg3) obj4, (sf3) obj3, (iy1) obj2, p40Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w30.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w30(um3 um3Var, y30 y30Var, zo zoVar, long j, j61 j61Var, p40 p40Var) {
        super(2, p40Var);
        this.n = um3Var;
        this.o = y30Var;
        this.p = zoVar;
        this.l = j;
        this.q = j61Var;
    }
}
