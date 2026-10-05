package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class zh2 implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ ns0 g;
    public final /* synthetic */ os1 h;

    public /* synthetic */ zh2(ns0 ns0Var, os1 os1Var, int i) {
        this.f = i;
        this.g = ns0Var;
        this.h = os1Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        zj zjVar = c20.a;
        os1 os1Var = this.h;
        ns0 ns0Var = this.g;
        switch (i) {
            case 0:
                nv0 nv0Var = (nv0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    nv0Var.U();
                } else {
                    boolean zF = nv0Var.f(ns0Var);
                    Object objO = nv0Var.O();
                    if (zF || objO == zjVar) {
                        objO = new ei2(ns0Var, os1Var, 0);
                        nv0Var.j0(objO);
                    }
                    gq.m((cs0) objO, null, false, null, null, null, n92.v, nv0Var, 805306368, 510);
                }
                break;
            default:
                nv0 nv0Var2 = (nv0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    nv0Var2.U();
                } else {
                    boolean zF2 = nv0Var2.f(ns0Var) | nv0Var2.f(os1Var);
                    Object objO2 = nv0Var2.O();
                    if (zF2 || objO2 == zjVar) {
                        objO2 = new ei2(ns0Var, os1Var, 1);
                        nv0Var2.j0(objO2);
                    }
                    gq.m((cs0) objO2, null, false, null, null, null, r51.f0, nv0Var2, 805306368, 510);
                }
                break;
        }
        return dm3Var;
    }
}
