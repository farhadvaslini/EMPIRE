package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class u8 extends pn2 implements rs0 {
    public final /* synthetic */ int h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u8(Object obj, p40 p40Var, int i) {
        super(p40Var);
        this.h = i;
        this.k = obj;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.h;
        dm3 dm3Var = dm3.a;
        rb3 rb3Var = (rb3) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
            case 0:
                return ((u8) m(p40Var, rb3Var)).o(dm3Var);
            case 1:
                return ((u8) m(p40Var, rb3Var)).o(dm3Var);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return ((u8) m(p40Var, rb3Var)).o(dm3Var);
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                return ((u8) m(p40Var, rb3Var)).o(dm3Var);
            default:
                ((u8) m(p40Var, rb3Var)).o(dm3Var);
                return y50.f;
        }
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.h;
        Object obj2 = this.k;
        switch (i) {
            case 0:
                u8 u8Var = new u8((w8) obj2, p40Var, 0);
                u8Var.j = obj;
                return u8Var;
            case 1:
                u8 u8Var2 = new u8((ab2) obj2, p40Var, 1);
                u8Var2.j = obj;
                return u8Var2;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                u8 u8Var3 = new u8((mc0) obj2, p40Var, 2);
                u8Var3.j = obj;
                return u8Var3;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                u8 u8Var4 = new u8((ns0) obj2, p40Var, 3);
                u8Var4.j = obj;
                return u8Var4;
            default:
                u8 u8Var5 = new u8((w40) obj2, p40Var, 4);
                u8Var5.j = obj;
                return u8Var5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0037 -> B:13:0x003a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0148 -> B:71:0x014c). Please report as a decompilation issue!!! */
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
    public final java.lang.Object o(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u8.o(java.lang.Object):java.lang.Object");
    }
}
