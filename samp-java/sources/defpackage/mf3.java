package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class mf3 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ sf3 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mf3(sf3 sf3Var, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.l = sf3Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                long j = ((gy1) obj).a;
                return new mf3(this.l, (p40) obj2, 0).o(dm3Var);
            case 1:
                return ((mf3) m((p40) obj2, (x50) obj)).o(dm3Var);
            default:
                return ((mf3) m((p40) obj2, (x50) obj)).o(dm3Var);
        }
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        sf3 sf3Var = this.l;
        switch (i) {
            case 0:
                return new mf3(sf3Var, p40Var, 0);
            case 1:
                return new mf3(sf3Var, p40Var, 1);
            default:
                return new mf3(sf3Var, p40Var, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0117, code lost:
    
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0118, code lost:
    
        r49 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:184:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01bb  */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r51) {
        /*
            Method dump skipped, instruction units count: 1256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mf3.o(java.lang.Object):java.lang.Object");
    }
}
