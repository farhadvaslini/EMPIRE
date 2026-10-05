package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class au implements ss0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ long g;

    public /* synthetic */ au(int i, long j) {
        this.f = i;
        this.g = j;
    }

    @Override // defpackage.ss0
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        x91 x91Var = tb1.Y;
        yp1 yp1Var = yp1.a;
        zj zjVar = c20.a;
        long j = this.g;
        switch (i) {
            case 0:
                nv0 nv0Var = (nv0) obj2;
                ((Number) obj3).intValue();
                rs0 rs0VarG = gu.g(null, j, nv0Var);
                Object objO = nv0Var.O();
                if (objO == zjVar) {
                    objO = b32.w(rs0VarG);
                    nv0Var.j0(objO);
                }
                os1 os1Var = (os1) objO;
                if (rs0VarG != null) {
                    os1Var.setValue(rs0VarG);
                }
                cn1 cn1VarD = eo.d(f5.k, false);
                int iC = lq.C(nv0Var);
                n52 n52VarL = nv0Var.l();
                bq1 bq1VarM = lr.M(nv0Var, yp1Var);
                w10.c.getClass();
                nv0Var.d0();
                if (nv0Var.S) {
                    nv0Var.k(x91Var);
                } else {
                    nv0Var.m0();
                }
                y02.F(f5.E, nv0Var, cn1VarD);
                y02.F(f5.D, nv0Var, n52VarL);
                z00 z00Var = f5.F;
                if (nv0Var.S || !s51.n(nv0Var.O(), Integer.valueOf(iC))) {
                    nc2.q(iC, nv0Var, iC, z00Var);
                }
                y02.F(f5.C, nv0Var, bq1VarM);
                rs0 rs0Var = (rs0) os1Var.getValue();
                if (rs0Var == null) {
                    nv0Var.a0(-1538103400);
                } else {
                    nv0Var.a0(-326710903);
                    rs0Var.f(nv0Var, 0);
                }
                nv0Var.p(false);
                nv0Var.p(true);
                break;
            default:
                nv0 nv0Var2 = (nv0) obj2;
                ((Number) obj3).intValue();
                gu.h(j, nv0Var2);
                Object objO2 = nv0Var2.O();
                if (objO2 == zjVar) {
                    objO2 = b32.w(null);
                    nv0Var2.j0(objO2);
                }
                os1 os1Var2 = (os1) objO2;
                cn1 cn1VarD2 = eo.d(f5.k, false);
                int iC2 = lq.C(nv0Var2);
                n52 n52VarL2 = nv0Var2.l();
                bq1 bq1VarM2 = lr.M(nv0Var2, yp1Var);
                w10.c.getClass();
                nv0Var2.d0();
                if (nv0Var2.S) {
                    nv0Var2.k(x91Var);
                } else {
                    nv0Var2.m0();
                }
                y02.F(f5.E, nv0Var2, cn1VarD2);
                y02.F(f5.D, nv0Var2, n52VarL2);
                z00 z00Var2 = f5.F;
                if (nv0Var2.S || !s51.n(nv0Var2.O(), Integer.valueOf(iC2))) {
                    nc2.q(iC2, nv0Var2, iC2, z00Var2);
                }
                y02.F(f5.C, nv0Var2, bq1VarM2);
                rs0 rs0Var2 = (rs0) os1Var2.getValue();
                if (rs0Var2 == null) {
                    nv0Var2.a0(-2101783313);
                } else {
                    nv0Var2.a0(-344894126);
                    rs0Var2.f(nv0Var2, 0);
                }
                nv0Var2.p(false);
                nv0Var2.p(true);
                break;
        }
        return dm3Var;
    }
}
