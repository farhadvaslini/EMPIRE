package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class br0 extends pn2 implements rs0 {
    public final /* synthetic */ int h;
    public int i;
    public Object j;
    public Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ br0(Object obj, Object obj2, p40 p40Var, int i) {
        super(p40Var);
        this.h = i;
        this.k = obj;
        this.l = obj2;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.h;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                return ((br0) m((p40) obj2, (rb3) obj)).o(dm3Var);
            case 1:
                return ((br0) m((p40) obj2, (rb3) obj)).o(dm3Var);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return ((br0) m((p40) obj2, (ov2) obj)).o(dm3Var);
            default:
                return ((br0) m((p40) obj2, (rb3) obj)).o(dm3Var);
        }
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.h;
        Object obj2 = this.l;
        switch (i) {
            case 0:
                br0 br0Var = new br0((o50) this.k, (rs0) obj2, p40Var, 0);
                br0Var.j = obj;
                return br0Var;
            case 1:
                br0 br0Var2 = new br0((qe3) obj2, p40Var, 1);
                br0Var2.j = obj;
                return br0Var2;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                br0 br0Var3 = new br0((cs0) obj2, p40Var, 2);
                br0Var3.k = obj;
                return br0Var3;
            default:
                br0 br0Var4 = new br0((ab2) this.k, (qk2) obj2, p40Var, 3);
                br0Var4.j = obj;
                return br0Var4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d5 A[Catch: CancellationException -> 0x01bb, TRY_ENTER, TryCatch #1 {CancellationException -> 0x01bb, blocks: (B:100:0x01d5, B:103:0x01e3, B:90:0x01b6, B:95:0x01c3), top: B:118:0x019a }] */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [rs0] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, rb3] */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, rb3] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x01ec -> B:98:0x01cf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:112:0x01fe -> B:98:0x01cf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00a4 -> B:34:0x00a8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x010c -> B:54:0x010d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0166 -> B:71:0x016a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.br0.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ br0(Object obj, p40 p40Var, int i) {
        super(p40Var);
        this.h = i;
        this.l = obj;
    }
}
