package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class ak1 implements ss0 {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ ns0 g;
    public final /* synthetic */ os1 h;
    public final /* synthetic */ os1 i;

    public /* synthetic */ ak1(ns0 ns0Var, os1 os1Var, os1 os1Var2) {
        this.g = ns0Var;
        this.h = os1Var;
        this.i = os1Var2;
    }

    @Override // defpackage.ss0
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        zj zjVar = c20.a;
        switch (i) {
            case 0:
                ok0 ok0Var = (ok0) obj;
                nv0 nv0Var = (nv0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ok0Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? nv0Var.f(ok0Var) : nv0Var.h(ok0Var) ? 4 : 2;
                }
                if (nv0Var.R(iIntValue & 1, (iIntValue & 19) != 18)) {
                    os1 os1Var = this.h;
                    String strName = ((ti) os1Var.getValue()).name();
                    bq1 bq1VarB = ok0Var.b(j43.c(yp1.a, 1.0f), true);
                    Object objO = nv0Var.O();
                    if (objO == zjVar) {
                        objO = new fi1(1);
                        nv0Var.j0(objO);
                    }
                    os1 os1Var2 = this.i;
                    g12.m(strName, (ns0) objO, bq1VarB, false, true, null, null, null, null, gq.N(1221049037, new l8(os1Var2, 6), nv0Var), null, false, null, null, null, false, 0, 0, null, null, nv0Var, 805330992, 0, 8388072);
                    boolean zBooleanValue = ((Boolean) os1Var2.getValue()).booleanValue();
                    Object objO2 = nv0Var.O();
                    if (objO2 == zjVar) {
                        objO2 = new yb(os1Var2, 21);
                        nv0Var.j0(objO2);
                    }
                    u9.a(zBooleanValue, (cs0) objO2, null, 0L, null, null, null, 0L, 0.0f, gq.N(2009164283, new ak1(this.g, os1Var, os1Var2), nv0Var), nv0Var, 48);
                } else {
                    nv0Var.U();
                }
                break;
            default:
                nv0 nv0Var2 = (nv0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ry) obj).getClass();
                if (nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    for (ti tiVar : ti.l) {
                        d00 d00VarN = gq.N(1082737950, new u(18, tiVar), nv0Var2);
                        boolean zD = nv0Var2.d(tiVar.ordinal());
                        ns0 ns0Var = this.g;
                        boolean zF = zD | nv0Var2.f(ns0Var);
                        Object objO3 = nv0Var2.O();
                        if (zF || objO3 == zjVar) {
                            n8 n8Var = new n8(tiVar, ns0Var, this.h, this.i, 2);
                            nv0Var2.j0(n8Var);
                            objO3 = n8Var;
                        }
                        u9.b(d00VarN, (cs0) objO3, null, false, null, null, nv0Var2, 6, 508);
                    }
                } else {
                    nv0Var2.U();
                }
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ ak1(os1 os1Var, os1 os1Var2, ns0 ns0Var) {
        this.h = os1Var;
        this.i = os1Var2;
        this.g = ns0Var;
    }
}
