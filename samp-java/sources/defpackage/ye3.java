package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ye3 implements ss0 {
    public final /* synthetic */ e93 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ gh3 h;
    public final /* synthetic */ rs0 i;

    public ye3(ek3 ek3Var, long j, gh3 gh3Var, rs0 rs0Var) {
        this.f = ek3Var;
        this.g = j;
        this.h = gh3Var;
        this.i = rs0Var;
    }

    @Override // defpackage.ss0
    public final Object e(Object obj, Object obj2, Object obj3) {
        bq1 bq1Var = (bq1) obj;
        nv0 nv0Var = (nv0) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= nv0Var.f(bq1Var) ? 4 : 2;
        }
        if (nv0Var.R(iIntValue & 1, (iIntValue & 19) != 18)) {
            e93 e93Var = this.f;
            boolean zF = nv0Var.f(e93Var);
            Object objO = nv0Var.O();
            if (zF || objO == c20.a) {
                objO = new m90(e93Var, 6);
                nv0Var.j0(objO);
            }
            bq1 bq1VarZ = vm1.z(bq1Var, (ns0) objO);
            cn1 cn1VarD = eo.d(f5.g, false);
            int iC = lq.C(nv0Var);
            n52 n52VarL = nv0Var.l();
            bq1 bq1VarM = lr.M(nv0Var, bq1VarZ);
            w10.c.getClass();
            nv0Var.d0();
            if (nv0Var.S) {
                nv0Var.k(tb1.Y);
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
            oz2.b(this.g, this.h, this.i, nv0Var, 0);
            nv0Var.p(true);
        } else {
            nv0Var.U();
        }
        return dm3.a;
    }
}
