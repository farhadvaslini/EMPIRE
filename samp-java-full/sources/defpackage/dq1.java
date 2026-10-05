package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public interface dq1 extends ia0 {
    default gq D() {
        return pi0.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [aq1] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [aq1] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [qs1] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [qs1] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r8v0, types: [dq1, ia0] */
    default Object t0(fe2 fe2Var) {
        ax1 ax1Var;
        aq1 aq1Var = (aq1) this;
        if (!aq1Var.f.s) {
            m21.a("ModifierLocal accessed from an unattached node");
        }
        if (!aq1Var.f.s) {
            m21.c("visitAncestors called on an unattached node");
        }
        aq1 aq1Var2 = aq1Var.f.j;
        tb1 tb1VarX = vr.X(this);
        while (tb1VarX != null) {
            if ((tb1VarX.L.f.i & 32) != 0) {
                while (aq1Var2 != null) {
                    if ((aq1Var2.h & 32) != 0) {
                        ?? J = aq1Var2;
                        ?? qs1Var = 0;
                        while (J != 0) {
                            if (J instanceof dq1) {
                                dq1 dq1Var = (dq1) J;
                                if (dq1Var.D().v(fe2Var)) {
                                    return dq1Var.D().A(fe2Var);
                                }
                            } else if ((J.h & 32) != 0 && (J instanceof ja0)) {
                                aq1 aq1Var3 = ((ja0) J).u;
                                int i = 0;
                                J = J;
                                qs1Var = qs1Var;
                                while (aq1Var3 != null) {
                                    if ((aq1Var3.h & 32) != 0) {
                                        i++;
                                        qs1Var = qs1Var;
                                        if (i == 1) {
                                            J = aq1Var3;
                                        } else {
                                            if (qs1Var == 0) {
                                                qs1Var = new qs1(new aq1[16]);
                                            }
                                            if (J != 0) {
                                                qs1Var.b(J);
                                                J = 0;
                                            }
                                            qs1Var.b(aq1Var3);
                                        }
                                    }
                                    aq1Var3 = aq1Var3.k;
                                    J = J;
                                    qs1Var = qs1Var;
                                }
                                if (i == 1) {
                                }
                            }
                            J = vr.j(qs1Var);
                        }
                    }
                    aq1Var2 = aq1Var2.j;
                }
            }
            tb1VarX = tb1VarX.u();
            aq1Var2 = (tb1VarX == null || (ax1Var = tb1VarX.L) == null) ? null : ax1Var.e;
        }
        return fe2Var.a.a();
    }
}
