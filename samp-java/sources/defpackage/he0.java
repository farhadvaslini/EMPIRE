package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class he0 extends pn2 implements rs0 {
    public final /* synthetic */ int h;
    public int i;
    public /* synthetic */ Object j;
    public Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ zs0 m;
    public final /* synthetic */ zs0 n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public he0(q20 q20Var, ir irVar, u uVar, vk1 vk1Var, s sVar, p40 p40Var) {
        super(p40Var);
        this.h = 0;
        this.k = q20Var;
        this.l = irVar;
        this.m = uVar;
        this.n = vk1Var;
        this.o = sVar;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.h;
        dm3 dm3Var = dm3.a;
        rb3 rb3Var = (rb3) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
        }
        return ((he0) m(p40Var, rb3Var)).o(dm3Var);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.h;
        Object obj2 = this.o;
        zs0 zs0Var = this.n;
        zs0 zs0Var2 = this.m;
        Object obj3 = this.l;
        switch (i) {
            case 0:
                he0 he0Var = new he0((q20) this.k, (ir) obj3, (u) zs0Var2, (vk1) zs0Var, (s) obj2, p40Var);
                he0Var.j = obj;
                return he0Var;
            case 1:
                he0 he0Var2 = new he0((t60) obj3, (bh1) zs0Var2, (ch1) zs0Var, (ch1) obj2, p40Var, 1);
                he0Var2.j = obj;
                return he0Var2;
            default:
                he0 he0Var3 = new he0((x50) obj3, (hf3) zs0Var2, (zb) zs0Var, (xc2) obj2, p40Var, 2);
                he0Var3.j = obj;
                return he0Var3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0090, code lost:
    
        if (r3 == r9) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x014e, code lost:
    
        if (r0 == r9) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0129  */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.he0.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ he0(Object obj, zs0 zs0Var, zs0 zs0Var2, Object obj2, p40 p40Var, int i) {
        super(p40Var);
        this.h = i;
        this.l = obj;
        this.m = zs0Var;
        this.n = zs0Var2;
        this.o = obj2;
    }
}
