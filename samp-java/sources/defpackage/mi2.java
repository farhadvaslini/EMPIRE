package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class mi2 implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ mi2(boolean z, vi2 vi2Var, i90 i90Var, lj0 lj0Var, e93 e93Var) {
        this.f = 0;
        this.g = z;
        this.h = vi2Var;
        this.i = i90Var;
        this.j = lj0Var;
        this.k = e93Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        vi2 vi2Var;
        int i = this.f;
        dm3 dm3Var = dm3.a;
        Object obj3 = this.k;
        Object obj4 = this.j;
        Object obj5 = this.i;
        Object obj6 = this.h;
        switch (i) {
            case 0:
                vi2 vi2Var2 = (vi2) obj6;
                i90 i90Var = (i90) obj5;
                lj0 lj0Var = (lj0) obj4;
                e93 e93Var = (e93) obj3;
                nv0 nv0Var = (nv0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    nv0Var.U();
                } else {
                    gm0 gm0Var = j43.c;
                    cn1 cn1VarD = eo.d(f5.h, false);
                    int iHashCode = Long.hashCode(nv0Var.T);
                    n52 n52VarL = nv0Var.l();
                    bq1 bq1VarM = lr.M(nv0Var, gm0Var);
                    w10.c.getClass();
                    nv0Var.d0();
                    boolean z = nv0Var.S;
                    x91 x91Var = tb1.Y;
                    if (z) {
                        nv0Var.k(x91Var);
                    } else {
                        nv0Var.m0();
                    }
                    z00 z00Var = f5.E;
                    y02.F(z00Var, nv0Var, cn1VarD);
                    z00 z00Var2 = f5.D;
                    y02.F(z00Var2, nv0Var, n52VarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    z00 z00Var3 = f5.F;
                    y02.F(z00Var3, nv0Var, numValueOf);
                    y02.C(nv0Var);
                    z00 z00Var4 = f5.C;
                    y02.F(z00Var4, nv0Var, bq1VarM);
                    boolean z2 = this.g;
                    yp1 yp1Var = yp1.a;
                    bq1 bq1VarD = z2 ? j43.q(yp1Var, 0.0f, 640.0f, 1).d(gm0Var) : gm0Var;
                    cn1 cn1VarD2 = eo.d(f5.g, false);
                    int iHashCode2 = Long.hashCode(nv0Var.T);
                    n52 n52VarL2 = nv0Var.l();
                    bq1 bq1VarM2 = lr.M(nv0Var, bq1VarD);
                    nv0Var.d0();
                    if (nv0Var.S) {
                        nv0Var.k(x91Var);
                    } else {
                        nv0Var.m0();
                    }
                    y02.F(z00Var, nv0Var, cn1VarD2);
                    y02.F(z00Var2, nv0Var, n52VarL2);
                    nc2.r(iHashCode2, nv0Var, z00Var3, nv0Var);
                    y02.F(z00Var4, nv0Var, bq1VarM2);
                    jo3.a(48, 16380, null, null, gq.N(-1565575078, new l91(lj0Var, vi2Var2, e93Var, 2), nv0Var), nv0Var, gm0Var, null, null, null, null, i90Var, null, false);
                    nv0Var.p(true);
                    List list = (List) e93Var.getValue();
                    boolean zH = nv0Var.h(vi2Var2);
                    Object objO = nv0Var.O();
                    zj zjVar = c20.a;
                    if (zH || objO == zjVar) {
                        vi2Var = vi2Var2;
                        objO = new e91(1, vi2Var, vi2.class, "showDeferredDialog", "showDeferredDialog(Ltop/th1nk/samp/feature/raksamp/model/DialogData;)V", 0, 0, 22);
                        nv0Var.j0(objO);
                    } else {
                        vi2Var = vi2Var2;
                    }
                    ns0 ns0Var = (ns0) ((ct0) objO);
                    boolean zH2 = nv0Var.h(vi2Var);
                    Object objO2 = nv0Var.O();
                    if (zH2 || objO2 == zjVar) {
                        e91 e91Var = new e91(1, vi2Var, vi2.class, "dismissDeferredDialog", "dismissDeferredDialog(Ltop/th1nk/samp/feature/raksamp/model/DialogData;)V", 0, 0, 23);
                        nv0Var.j0(e91Var);
                        objO2 = e91Var;
                    }
                    d32.d(list, ns0Var, (ns0) ((ct0) objO2), jo.a.a(yp1Var, f5.i), nv0Var, 0);
                    nv0Var.p(true);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                rn.j((y31) obj6, (ns0) obj5, (cs0) obj4, (ns0) obj3, this.g, (nv0) obj, jo3.y(1));
                break;
            default:
                ((Integer) obj2).getClass();
                b32.a((String) obj6, (ns0) obj5, (cs0) obj4, (bq1) obj3, this.g, (nv0) obj, jo3.y(1));
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ mi2(Object obj, ns0 ns0Var, cs0 cs0Var, Object obj2, boolean z, int i, int i2) {
        this.f = i2;
        this.h = obj;
        this.i = ns0Var;
        this.j = cs0Var;
        this.k = obj2;
        this.g = z;
    }
}
