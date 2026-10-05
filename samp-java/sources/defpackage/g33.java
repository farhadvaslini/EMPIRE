package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class g33 extends u71 implements ss0 {
    public final /* synthetic */ d00 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g33(d00 d00Var) {
        super(3);
        this.g = d00Var;
    }

    @Override // defpackage.ss0
    public final Object e(Object obj, Object obj2, Object obj3) {
        hl1 hl1Var = (hl1) obj;
        nv0 nv0Var = (nv0) obj2;
        ((Number) obj3).intValue();
        Object objO = nv0Var.O();
        zj zjVar = c20.a;
        if (objO == zjVar) {
            objO = rn.A(nv0Var);
            nv0Var.j0(objO);
        }
        x50 x50Var = (x50) objO;
        Object objO2 = nv0Var.O();
        if (objO2 == zjVar) {
            objO2 = new c33(hl1Var, x50Var);
            nv0Var.j0(objO2);
        }
        c33 c33Var = (c33) objO2;
        this.g.l(c33Var, new i33(c33Var), nv0Var, 6);
        return dm3.a;
    }
}
