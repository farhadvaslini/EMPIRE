package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class kh2 {
    public static final List a = vr.L(new l71(0, "Y"), new l71(1, "N"), new l71(2, "2"), new l71(3, "C"), new l71(4, "H"), new l71(5, "ALT"), new l71(6, "SPC"));

    public static final void a(int i, ns0 ns0Var, nv0 nv0Var, bq1 bq1Var) {
        bq1 bq1Var2;
        ns0Var.getClass();
        nv0Var.b0(1064255440);
        int i2 = (nv0Var.h(ns0Var) ? 4 : 2) | i | 48;
        if (nv0Var.R(i2 & 1, (i2 & 19) != 18)) {
            bq1Var2 = yp1.a;
            bq1 bq1VarJ = f80.J(j43.c(bq1Var2, 1.0f), 8.0f);
            qy qyVarA = oy.a(n92.d, f5.s, nv0Var, 0);
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
            y02.F(f5.E, nv0Var, qyVarA);
            y02.F(f5.D, nv0Var, n52VarL);
            y02.F(f5.F, nv0Var, Integer.valueOf(iHashCode));
            y02.C(nv0Var);
            y02.F(f5.C, nv0Var, bq1VarM);
            gq.f(j43.c(bq1Var2, 1.0f), new jj(12.0f, true, new c(1)), new jj(12.0f, true, new c(1)), null, 0, 0, gq.N(-291016213, new ir(9, ns0Var), nv0Var), nv0Var, 1573302, 56);
            nv0Var.p(true);
        } else {
            nv0Var.U();
            bq1Var2 = bq1Var;
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new tr(ns0Var, bq1Var2, i);
        }
    }
}
