package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class gg2 implements ss0 {
    public final /* synthetic */ cf2 f;
    public final /* synthetic */ x50 g;
    public final /* synthetic */ lf2 h;
    public final /* synthetic */ String i;
    public final /* synthetic */ os1 j;
    public final /* synthetic */ os1 k;

    public gg2(cf2 cf2Var, x50 x50Var, lf2 lf2Var, String str, os1 os1Var, os1 os1Var2) {
        this.f = cf2Var;
        this.g = x50Var;
        this.h = lf2Var;
        this.i = str;
        this.j = os1Var;
        this.k = os1Var2;
    }

    @Override // defpackage.ss0
    public final Object e(Object obj, Object obj2, Object obj3) {
        gg2 gg2Var;
        nv0 nv0Var = (nv0) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((ry) obj).getClass();
        if (nv0Var.R(iIntValue & 1, (iIntValue & 17) != 16)) {
            yp1 yp1Var = yp1.a;
            bq1 bq1VarK = f80.K(j43.c(yp1Var, 1.0f), 14.0f, 12.0f);
            dp2 dp2VarA = cp2.a(n92.f, f5.q, nv0Var, 54);
            int iHashCode = Long.hashCode(nv0Var.T);
            n52 n52VarL = nv0Var.l();
            bq1 bq1VarM = lr.M(nv0Var, bq1VarK);
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
            y02.F(z00Var, nv0Var, dp2VarA);
            z00 z00Var2 = f5.D;
            y02.F(z00Var2, nv0Var, n52VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z00 z00Var3 = f5.F;
            y02.F(z00Var3, nv0Var, numValueOf);
            y02.C(nv0Var);
            z00 z00Var4 = f5.C;
            y02.F(z00Var4, nv0Var, bq1VarM);
            jc1 jc1Var = new jc1(1.0f, true);
            qy qyVarA = oy.a(n92.d, f5.s, nv0Var, 0);
            int iHashCode2 = Long.hashCode(nv0Var.T);
            n52 n52VarL2 = nv0Var.l();
            bq1 bq1VarM2 = lr.M(nv0Var, jc1Var);
            nv0Var.d0();
            if (nv0Var.S) {
                nv0Var.k(x91Var);
            } else {
                nv0Var.m0();
            }
            y02.F(z00Var, nv0Var, qyVarA);
            y02.F(z00Var2, nv0Var, n52VarL2);
            nc2.r(iHashCode2, nv0Var, z00Var3, nv0Var);
            y02.F(z00Var4, nv0Var, bq1VarM2);
            cf2 cf2Var = this.f;
            String str = cf2Var.b;
            r93 r93Var = ql3.a;
            mg3.b(str, null, 0L, 0L, xq0.j, null, 0L, null, 0L, 2, false, 1, 0, ((ol3) nv0Var.j(r93Var)).k, nv0Var, 1572864, 24960, 110526);
            mg3.b(cf2Var.c, null, ((fy) nv0Var.j(hy.a)).s, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, ((ol3) nv0Var.j(r93Var)).l, nv0Var, 0, 24960, 110586);
            nv0Var.p(true);
            dp2 dp2VarA2 = cp2.a(n92.b, f5.p, nv0Var, 0);
            int iHashCode3 = Long.hashCode(nv0Var.T);
            n52 n52VarL3 = nv0Var.l();
            bq1 bq1VarM3 = lr.M(nv0Var, yp1Var);
            nv0Var.d0();
            if (nv0Var.S) {
                nv0Var.k(x91Var);
            } else {
                nv0Var.m0();
            }
            y02.F(z00Var, nv0Var, dp2VarA2);
            y02.F(z00Var2, nv0Var, n52VarL3);
            nc2.r(iHashCode3, nv0Var, z00Var3, nv0Var);
            y02.F(z00Var4, nv0Var, bq1VarM3);
            boolean zH = nv0Var.h(cf2Var);
            Object objO = nv0Var.O();
            zj zjVar = c20.a;
            if (zH || objO == zjVar) {
                gg2Var = this;
                objO = new eg2(cf2Var, gg2Var.j, gg2Var.k);
                nv0Var.j0(objO);
            } else {
                gg2Var = this;
            }
            gq.m((cs0) objO, null, false, null, null, null, rn.x, nv0Var, 805306368, 510);
            x50 x50Var = gg2Var.g;
            boolean zH2 = nv0Var.h(x50Var);
            lf2 lf2Var = gg2Var.h;
            boolean zH3 = zH2 | nv0Var.h(lf2Var);
            String str2 = gg2Var.i;
            boolean zF = zH3 | nv0Var.f(str2) | nv0Var.h(cf2Var);
            Object objO2 = nv0Var.O();
            if (zF || objO2 == zjVar) {
                objO2 = new fg2(x50Var, lf2Var, str2, cf2Var);
                nv0Var.j0(objO2);
            }
            gq.m((cs0) objO2, null, false, null, null, null, rn.y, nv0Var, 805306368, 510);
            nv0Var.p(true);
            nv0Var.p(true);
        } else {
            nv0Var.U();
        }
        return dm3.a;
    }
}
