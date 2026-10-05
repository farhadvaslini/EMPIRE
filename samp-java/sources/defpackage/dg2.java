package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class dg2 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ lf2 l;
    public final /* synthetic */ String m;
    public final /* synthetic */ String n;
    public final /* synthetic */ String o;
    public final /* synthetic */ os1 p;
    public final /* synthetic */ os1 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dg2(lf2 lf2Var, String str, String str2, String str3, os1 os1Var, os1 os1Var2, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.l = lf2Var;
        this.m = str;
        this.n = str2;
        this.o = str3;
        this.p = os1Var;
        this.q = os1Var2;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        x50 x50Var = (x50) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
        }
        return ((dg2) m(p40Var, x50Var)).o(dm3Var);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        switch (this.j) {
            case 0:
                return new dg2(this.l, this.m, this.n, this.o, this.p, this.q, p40Var, 0);
            default:
                return new dg2(this.l, this.m, this.n, this.o, this.p, this.q, p40Var, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dg2.o(java.lang.Object):java.lang.Object");
    }
}
