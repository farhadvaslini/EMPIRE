package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class q10 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ float l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q10(Object obj, float f, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.m = obj;
        this.l = f;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                return ((q10) m((p40) obj2, Float.valueOf(((Number) obj).floatValue()))).o(dm3Var);
            case 1:
                return ((q10) m((p40) obj2, (x50) obj)).o(dm3Var);
            default:
                return ((q10) m((p40) obj2, (x50) obj)).o(dm3Var);
        }
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        Object obj2 = this.m;
        switch (i) {
            case 0:
                q10 q10Var = new q10((r10) obj2, p40Var);
                q10Var.l = ((Number) obj).floatValue();
                return q10Var;
            case 1:
                return new q10((ed) obj2, this.l, p40Var, 1);
            default:
                return new q10((s33) obj2, this.l, p40Var, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q10.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q10(r10 r10Var, p40 p40Var) {
        super(2, p40Var);
        this.j = 0;
        this.m = r10Var;
    }
}
