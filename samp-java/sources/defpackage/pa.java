package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class pa implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ rb2 g;
    public final /* synthetic */ os1 h;

    public /* synthetic */ pa(rb2 rb2Var, os1 os1Var, int i) {
        this.f = i;
        this.g = rb2Var;
        this.h = os1Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        os1 os1Var = this.h;
        rb2 rb2Var = this.g;
        int i2 = 1;
        nv0 nv0Var = (nv0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if (!nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    nv0Var.U();
                } else {
                    vr.c(xa.b.a(Boolean.TRUE), gq.N(1022273628, new pa(rb2Var, os1Var, i2), nv0Var), nv0Var, 56);
                }
                break;
            default:
                if (!nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    nv0Var.U();
                } else {
                    Object objO = nv0Var.O();
                    zj zjVar = c20.a;
                    if (objO == zjVar) {
                        objO = new u0(9);
                        nv0Var.j0(objO);
                    }
                    bq1 bq1VarA = su2.a(yp1.a, false, (ns0) objO);
                    boolean zH = nv0Var.h(rb2Var);
                    Object objO2 = nv0Var.O();
                    if (zH || objO2 == zjVar) {
                        objO2 = new oa(rb2Var, 0);
                        nv0Var.j0(objO2);
                    }
                    bq1 bq1VarB = w7.B(cl3.w(bq1VarA, (ns0) objO2), rb2Var.getCanCalculatePosition() ? 1.0f : 0.0f);
                    rs0 rs0Var = (rs0) os1Var.getValue();
                    Object objO3 = nv0Var.O();
                    if (objO3 == zjVar) {
                        objO3 = p8.c;
                        nv0Var.j0(objO3);
                    }
                    cn1 cn1Var = (cn1) objO3;
                    int iHashCode = Long.hashCode(nv0Var.T);
                    n52 n52VarL = nv0Var.l();
                    bq1 bq1VarM = lr.M(nv0Var, bq1VarB);
                    w10.c.getClass();
                    nv0Var.d0();
                    if (nv0Var.S) {
                        nv0Var.k(tb1.Y);
                    } else {
                        nv0Var.m0();
                    }
                    y02.F(f5.E, nv0Var, cn1Var);
                    y02.F(f5.D, nv0Var, n52VarL);
                    y02.F(f5.F, nv0Var, Integer.valueOf(iHashCode));
                    y02.C(nv0Var);
                    y02.F(f5.C, nv0Var, bq1VarM);
                    rs0Var.f(nv0Var, 0);
                    nv0Var.p(true);
                }
                break;
        }
        return dm3Var;
    }
}
