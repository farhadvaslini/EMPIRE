package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class fv1 implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ s83 i;
    public final /* synthetic */ rs0 j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ d00 l;
    public final /* synthetic */ Object m;

    public /* synthetic */ fv1(Object obj, boolean z, boolean z2, s83 s83Var, rs0 rs0Var, boolean z3, d00 d00Var, int i) {
        this.f = i;
        this.m = obj;
        this.g = z;
        this.h = z2;
        this.i = s83Var;
        this.j = rs0Var;
        this.k = z3;
        this.l = d00Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        x91 x91Var = tb1.Y;
        d00 d00Var = this.l;
        bq1 puVar = yp1.a;
        zj zjVar = c20.a;
        boolean z = this.k;
        rs0 rs0Var = this.j;
        s83 s83Var = this.i;
        boolean z2 = this.h;
        Object obj3 = this.m;
        boolean z3 = this.g;
        switch (i) {
            case 0:
                nv0 nv0Var = (nv0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    nv0Var.U();
                } else {
                    yu1 yu1Var = (yu1) obj3;
                    e93 e93VarA = f43.a(!z2 ? yu1Var.f : z3 ? yu1Var.a : yu1Var.d, s83Var, nv0Var);
                    if (rs0Var == null || !(z || z3)) {
                        nv0Var.a0(-634793532);
                    } else {
                        nv0Var.a0(-634794445);
                        Object objO = nv0Var.O();
                        if (objO == zjVar) {
                            objO = new fi1(0);
                            nv0Var.j0(objO);
                        }
                        AtomicInteger atomicInteger = su2.a;
                        puVar = new pu((ns0) objO);
                    }
                    nv0Var.p(false);
                    cn1 cn1VarD = eo.d(f5.g, false);
                    int iC = lq.C(nv0Var);
                    n52 n52VarL = nv0Var.l();
                    bq1 bq1VarM = lr.M(nv0Var, puVar);
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
                    vr.c(nc2.f(((wx) e93VarA.getValue()).a, t30.a), d00Var, nv0Var, 8);
                    nv0Var.p(true);
                }
                break;
            default:
                nv0 nv0Var2 = (nv0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    nv0Var2.U();
                } else {
                    tv1 tv1Var = (tv1) obj3;
                    e93 e93VarA2 = f43.a(!z2 ? tv1Var.f : z3 ? tv1Var.a : tv1Var.d, s83Var, nv0Var2);
                    if (rs0Var == null || !(z || z3)) {
                        nv0Var2.a0(453016797);
                    } else {
                        nv0Var2.a0(453015884);
                        Object objO2 = nv0Var2.O();
                        if (objO2 == zjVar) {
                            objO2 = new fi1(0);
                            nv0Var2.j0(objO2);
                        }
                        AtomicInteger atomicInteger2 = su2.a;
                        puVar = new pu((ns0) objO2);
                    }
                    nv0Var2.p(false);
                    cn1 cn1VarD2 = eo.d(f5.g, false);
                    int iC2 = lq.C(nv0Var2);
                    n52 n52VarL2 = nv0Var2.l();
                    bq1 bq1VarM2 = lr.M(nv0Var2, puVar);
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
                    vr.c(nc2.f(((wx) e93VarA2.getValue()).a, t30.a), d00Var, nv0Var2, 8);
                    nv0Var2.p(true);
                }
                break;
        }
        return dm3Var;
    }
}
