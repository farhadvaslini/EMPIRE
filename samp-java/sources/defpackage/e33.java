package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class e33 extends u71 implements ts0 {
    public final /* synthetic */ d00 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e33(d00 d00Var) {
        super(4);
        this.g = d00Var;
    }

    @Override // defpackage.ts0
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        c33 c33Var = (c33) obj;
        bq1 bq1Var = (bq1) obj2;
        nv0 nv0Var = (nv0) obj3;
        int iIntValue = ((Number) obj4).intValue();
        if ((iIntValue & 6) == 0) {
            i = (nv0Var.f(c33Var) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= nv0Var.f(bq1Var) ? 32 : 16;
        }
        if (nv0Var.R(i & 1, (i & 147) != 146)) {
            cn1 cn1VarD = eo.d(f5.g, false);
            int iHashCode = Long.hashCode(nv0Var.T);
            n52 n52VarL = nv0Var.l();
            bq1 bq1VarM = lr.M(nv0Var, bq1Var);
            w10.c.getClass();
            nv0Var.d0();
            if (nv0Var.S) {
                nv0Var.k(tb1.Y);
            } else {
                nv0Var.m0();
            }
            y02.F(f5.E, nv0Var, cn1VarD);
            y02.F(f5.D, nv0Var, n52VarL);
            y02.v(nv0Var, Integer.valueOf(iHashCode));
            y02.C(nv0Var);
            y02.F(f5.C, nv0Var, bq1VarM);
            this.g.e(c33Var, nv0Var, Integer.valueOf(i & 14));
            nv0Var.p(true);
        } else {
            nv0Var.U();
        }
        return dm3.a;
    }
}
