package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class jc3 implements rs0 {
    public final /* synthetic */ bq1 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ o11 h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ cs0 j;
    public final /* synthetic */ d00 k;

    public jc3(bq1 bq1Var, boolean z, mo2 mo2Var, boolean z2, cs0 cs0Var, d00 d00Var) {
        this.f = bq1Var;
        this.g = z;
        this.h = mo2Var;
        this.i = z2;
        this.j = cs0Var;
        this.k = d00Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        nv0 nv0Var = (nv0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
            bq1 bq1VarC = j43.c(gv3.J(this.f, this.g, null, this.h, this.i, new no2(4), this.j), 1.0f);
            qy qyVarA = oy.a(n92.e, f5.t, nv0Var, 54);
            int iC = lq.C(nv0Var);
            n52 n52VarL = nv0Var.l();
            bq1 bq1VarM = lr.M(nv0Var, bq1VarC);
            w10.c.getClass();
            nv0Var.d0();
            if (nv0Var.S) {
                nv0Var.k(tb1.Y);
            } else {
                nv0Var.m0();
            }
            y02.F(f5.E, nv0Var, qyVarA);
            y02.F(f5.D, nv0Var, n52VarL);
            z00 z00Var = f5.F;
            if (nv0Var.S || !s51.n(nv0Var.O(), Integer.valueOf(iC))) {
                nc2.q(iC, nv0Var, iC, z00Var);
            }
            y02.F(f5.C, nv0Var, bq1VarM);
            this.k.e(ry.a, nv0Var, 6);
            nv0Var.p(true);
        } else {
            nv0Var.U();
        }
        return dm3.a;
    }
}
