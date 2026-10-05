package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class f8 implements rs0 {
    public final /* synthetic */ int f = 0;
    public final /* synthetic */ long g;
    public final /* synthetic */ Object h;

    public /* synthetic */ f8(long j, rs0 rs0Var, int i) {
        this.g = j;
        this.h = rs0Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        Object obj3 = this.h;
        long j = this.g;
        switch (i) {
            case 0:
                bq1 bq1Var = (bq1) obj3;
                nv0 nv0Var = (nv0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    nv0Var.U();
                } else if (j == 9205357640488583168L) {
                    nv0Var.a0(-1243644858);
                    k8.b(bq1Var, nv0Var, 0, 0);
                    nv0Var.p(false);
                } else {
                    nv0Var.a0(-1244013944);
                    bq1 bq1VarJ = j43.j(bq1Var, md0.b(j), md0.a(j), 0.0f, 0.0f, 12);
                    cn1 cn1VarD = eo.d(f5.h, false);
                    int iHashCode = Long.hashCode(nv0Var.T);
                    n52 n52VarL = nv0Var.l();
                    bq1 bq1VarM = lr.M(nv0Var, bq1VarJ);
                    w10.c.getClass();
                    nv0Var.d0();
                    if (nv0Var.S) {
                        nv0Var.k(tb1.Y);
                    } else {
                        nv0Var.m0();
                    }
                    y02.F(f5.E, nv0Var, cn1VarD);
                    y02.F(f5.D, nv0Var, n52VarL);
                    y02.F(f5.F, nv0Var, Integer.valueOf(iHashCode));
                    y02.C(nv0Var);
                    y02.F(f5.C, nv0Var, bq1VarM);
                    k8.b(null, nv0Var, 0, 1);
                    nv0Var.p(true);
                    nv0Var.p(false);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                t22.d((ym0) obj3, j, (nv0) obj, jo3.y(1));
                break;
            default:
                ((Integer) obj2).getClass();
                oz2.c(j, (rs0) obj3, (nv0) obj, jo3.y(1));
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ f8(long j, bq1 bq1Var) {
        this.g = j;
        this.h = bq1Var;
    }

    public /* synthetic */ f8(ym0 ym0Var, long j, int i) {
        this.h = ym0Var;
        this.g = j;
    }
}
