package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class xe3 implements rs0 {
    public final /* synthetic */ os1 f;
    public final /* synthetic */ ef3 g;
    public final /* synthetic */ x12 h;
    public final /* synthetic */ d00 i;

    public xe3(os1 os1Var, ef3 ef3Var, x12 x12Var, d00 d00Var) {
        this.f = os1Var;
        this.g = ef3Var;
        this.h = x12Var;
        this.i = d00Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        nv0 nv0Var = (nv0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
            bq1 bq1VarM = w7.M(r51.u(yp1.a, "Container"), new v1(new we3(this.f, os1.class, "value", "getValue()Ljava/lang/Object;", 0), this.h, oz2.s(this.g), 19));
            cn1 cn1VarD = eo.d(f5.g, true);
            int iC = lq.C(nv0Var);
            n52 n52VarL = nv0Var.l();
            bq1 bq1VarM2 = lr.M(nv0Var, bq1VarM);
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
            y02.F(f5.C, nv0Var, bq1VarM2);
            nc2.p(0, this.i, nv0Var, true);
        } else {
            nv0Var.U();
        }
        return dm3.a;
    }
}
