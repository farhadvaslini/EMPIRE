package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class ai2 implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ cs0 g;
    public final /* synthetic */ cs0 h;

    public /* synthetic */ ai2(cs0 cs0Var, cs0 cs0Var2, int i) {
        this.f = i;
        this.g = cs0Var;
        this.h = cs0Var2;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        x91 x91Var = tb1.Y;
        yp1 yp1Var = yp1.a;
        switch (i) {
            case 0:
                nv0 nv0Var = (nv0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    nv0Var.U();
                } else {
                    dp2 dp2VarA = cp2.a(n92.b, f5.p, nv0Var, 0);
                    int iHashCode = Long.hashCode(nv0Var.T);
                    n52 n52VarL = nv0Var.l();
                    bq1 bq1VarM = lr.M(nv0Var, yp1Var);
                    w10.c.getClass();
                    nv0Var.d0();
                    if (nv0Var.S) {
                        nv0Var.k(x91Var);
                    } else {
                        nv0Var.m0();
                    }
                    y02.F(f5.E, nv0Var, dp2VarA);
                    y02.F(f5.D, nv0Var, n52VarL);
                    y02.F(f5.F, nv0Var, Integer.valueOf(iHashCode));
                    y02.C(nv0Var);
                    y02.F(f5.C, nv0Var, bq1VarM);
                    gq.m(this.g, null, false, null, null, null, n92.w, nv0Var, 805306368, 510);
                    oz2.g(nv0Var, j43.o(yp1Var, 4.0f));
                    gq.m(this.h, null, false, null, null, null, n92.x, nv0Var, 805306368, 510);
                    nv0Var.p(true);
                }
                break;
            default:
                nv0 nv0Var2 = (nv0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    nv0Var2.U();
                } else {
                    dp2 dp2VarA2 = cp2.a(n92.b, f5.p, nv0Var2, 0);
                    int iHashCode2 = Long.hashCode(nv0Var2.T);
                    n52 n52VarL2 = nv0Var2.l();
                    bq1 bq1VarM2 = lr.M(nv0Var2, yp1Var);
                    w10.c.getClass();
                    nv0Var2.d0();
                    if (nv0Var2.S) {
                        nv0Var2.k(x91Var);
                    } else {
                        nv0Var2.m0();
                    }
                    y02.F(f5.E, nv0Var2, dp2VarA2);
                    y02.F(f5.D, nv0Var2, n52VarL2);
                    y02.F(f5.F, nv0Var2, Integer.valueOf(iHashCode2));
                    y02.C(nv0Var2);
                    y02.F(f5.C, nv0Var2, bq1VarM2);
                    gq.m(this.g, null, false, null, null, null, rn.Q, nv0Var2, 805306368, 510);
                    oz2.g(nv0Var2, j43.o(yp1Var, 4.0f));
                    gq.m(this.h, null, false, null, null, null, rn.R, nv0Var2, 805306368, 510);
                    nv0Var2.p(true);
                }
                break;
        }
        return dm3Var;
    }
}
