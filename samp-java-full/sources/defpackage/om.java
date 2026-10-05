package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class om extends pn2 implements rs0 {
    public final /* synthetic */ int h;
    public int i;
    public /* synthetic */ Object j;
    public Object k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public om(h9 h9Var, g51 g51Var, qe3 qe3Var, p40 p40Var) {
        super(p40Var);
        this.h = 2;
        this.k = h9Var;
        this.l = g51Var;
        this.m = qe3Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.h;
        dm3 dm3Var = dm3.a;
        rb3 rb3Var = (rb3) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
            case 0:
                ((om) m(p40Var, rb3Var)).o(dm3Var);
                break;
        }
        return ((om) m(p40Var, rb3Var)).o(dm3Var);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.h;
        Object obj2 = this.m;
        switch (i) {
            case 0:
                om omVar = new om((x50) this.l, (jj3) obj2, p40Var);
                omVar.j = obj;
                return omVar;
            case 1:
                om omVar2 = new om((i32) obj2, p40Var, 1);
                omVar2.j = obj;
                return omVar2;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                om omVar3 = new om((h9) this.k, (g51) this.l, (qe3) obj2, p40Var);
                omVar3.j = obj;
                return omVar3;
            default:
                om omVar4 = new om((ia3) obj2, p40Var, 3);
                omVar4.j = obj;
                return omVar4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:245:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:304:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:136:0x0238 -> B:138:0x023c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:222:0x03bf -> B:224:0x03c3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:241:0x0431 -> B:243:0x0434). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00cb -> B:38:0x00cf). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object o(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 1136
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.om.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public om(x50 x50Var, jj3 jj3Var, p40 p40Var) {
        super(p40Var);
        this.h = 0;
        this.l = x50Var;
        this.m = jj3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ om(Object obj, p40 p40Var, int i) {
        super(p40Var);
        this.h = i;
        this.m = obj;
    }
}
