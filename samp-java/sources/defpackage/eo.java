package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class eo {
    public static final is1 a = c(true);
    public static final is1 b = c(false);
    public static final p8 c = p8.e;

    public static final void a(bq1 bq1Var, nv0 nv0Var, int i) {
        nv0Var.b0(-211209833);
        int i2 = (nv0Var.f(bq1Var) ? 4 : 2) | i;
        int i3 = 0;
        if (nv0Var.R(i2 & 1, (i2 & 3) != 2)) {
            int iHashCode = Long.hashCode(nv0Var.T);
            bq1 bq1VarM = lr.M(nv0Var, bq1Var);
            n52 n52VarL = nv0Var.l();
            w10.c.getClass();
            nv0Var.d0();
            if (nv0Var.S) {
                nv0Var.k(tb1.Y);
            } else {
                nv0Var.m0();
            }
            y02.F(f5.E, nv0Var, c);
            y02.F(f5.D, nv0Var, n52VarL);
            y02.C(nv0Var);
            y02.F(f5.C, nv0Var, bq1VarM);
            y02.F(f5.F, nv0Var, Integer.valueOf(iHashCode));
            nv0Var.p(true);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new co(bq1Var, i, i3);
        }
    }

    public static final void b(h62 h62Var, i62 i62Var, xm1 xm1Var, bb1 bb1Var, int i, int i2, h5 h5Var) {
        vm vmVar;
        Object objE = xm1Var.E();
        bo boVar = objE instanceof bo ? (bo) objE : null;
        h62.E(h62Var, i62Var, ((boVar == null || (vmVar = boVar.t) == null) ? h5Var : vmVar).a((((long) i62Var.f) << 32) | (((long) i62Var.g) & 4294967295L), (((long) i) << 32) | (((long) i2) & 4294967295L), bb1Var));
    }

    public static final is1 c(boolean z) {
        is1 is1Var = new is1(9);
        vm vmVar = f5.g;
        is1Var.m(vmVar, new ho(vmVar, z));
        vm vmVar2 = f5.h;
        is1Var.m(vmVar2, new ho(vmVar2, z));
        vm vmVar3 = f5.i;
        is1Var.m(vmVar3, new ho(vmVar3, z));
        vm vmVar4 = f5.j;
        is1Var.m(vmVar4, new ho(vmVar4, z));
        vm vmVar5 = f5.k;
        is1Var.m(vmVar5, new ho(vmVar5, z));
        vm vmVar6 = f5.l;
        is1Var.m(vmVar6, new ho(vmVar6, z));
        vm vmVar7 = f5.m;
        is1Var.m(vmVar7, new ho(vmVar7, z));
        vm vmVar8 = f5.n;
        is1Var.m(vmVar8, new ho(vmVar8, z));
        vm vmVar9 = f5.o;
        is1Var.m(vmVar9, new ho(vmVar9, z));
        return is1Var;
    }

    public static final cn1 d(h5 h5Var, boolean z) {
        cn1 cn1Var = (cn1) (z ? a : b).g(h5Var);
        return cn1Var == null ? new ho(h5Var, z) : cn1Var;
    }
}
