package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class cx1 implements dx1 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [qs1] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [qs1] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r7v0, types: [aq1] */
    /* JADX WARN: Type inference failed for: r7v1, types: [aq1] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [aq1] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // defpackage.dx1
    public final boolean a(aq1 aq1Var) {
        ?? qs1Var = 0;
        while (true) {
            int i = 0;
            if (aq1Var == 0) {
                return false;
            }
            if (aq1Var instanceof jb2) {
                ((jb2) aq1Var).T0();
            } else if ((aq1Var.h & 16) != 0 && (aq1Var instanceof ja0)) {
                aq1 aq1Var2 = ((ja0) aq1Var).u;
                qs1Var = qs1Var;
                aq1Var = aq1Var;
                while (aq1Var2 != null) {
                    if ((aq1Var2.h & 16) != 0) {
                        i++;
                        qs1Var = qs1Var;
                        if (i == 1) {
                            aq1Var = aq1Var2;
                        } else {
                            if (qs1Var == 0) {
                                qs1Var = new qs1(new aq1[16]);
                            }
                            if (aq1Var != 0) {
                                qs1Var.b(aq1Var);
                                aq1Var = 0;
                            }
                            qs1Var.b(aq1Var2);
                        }
                    }
                    aq1Var2 = aq1Var2.k;
                    qs1Var = qs1Var;
                    aq1Var = aq1Var;
                }
                if (i == 1) {
                }
            }
            aq1Var = vr.j(qs1Var);
        }
    }

    @Override // defpackage.dx1
    public final int b() {
        return 16;
    }

    @Override // defpackage.dx1
    public final void d(tb1 tb1Var, long j, ly0 ly0Var, int i, boolean z) {
        tb1Var.A(j, ly0Var, i, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [aq1] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [aq1] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
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
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // defpackage.dx1
    public final boolean e(ly0 ly0Var, tb1 tb1Var) {
        ex1 ex1Var = tb1Var.L.d;
        ex1Var.getClass();
        aq1 aq1VarZ1 = ex1Var.z1(fx1.g(16));
        if (aq1VarZ1 != null && aq1VarZ1.s) {
            if (!aq1VarZ1.f.s) {
                m21.c("visitLocalDescendants called on an unattached node");
            }
            aq1 aq1Var = aq1VarZ1.f;
            if ((aq1Var.i & 16) != 0) {
                while (aq1Var != null) {
                    if ((aq1Var.h & 16) != 0) {
                        ?? J = aq1Var;
                        ?? qs1Var = 0;
                        while (J != 0) {
                            if (J instanceof jb2) {
                                if (((jb2) J).z0()) {
                                    ly0Var.h = ly0Var.f.b - 1;
                                    return true;
                                }
                            } else if ((J.h & 16) != 0 && (J instanceof ja0)) {
                                aq1 aq1Var2 = ((ja0) J).u;
                                int i = 0;
                                J = J;
                                qs1Var = qs1Var;
                                while (aq1Var2 != null) {
                                    if ((aq1Var2.h & 16) != 0) {
                                        i++;
                                        qs1Var = qs1Var;
                                        if (i == 1) {
                                            J = aq1Var2;
                                        } else {
                                            if (qs1Var == 0) {
                                                qs1Var = new qs1(new aq1[16]);
                                            }
                                            if (J != 0) {
                                                qs1Var.b(J);
                                                J = 0;
                                            }
                                            qs1Var.b(aq1Var2);
                                        }
                                    }
                                    aq1Var2 = aq1Var2.k;
                                    J = J;
                                    qs1Var = qs1Var;
                                }
                                if (i == 1) {
                                }
                            }
                            J = vr.j(qs1Var);
                        }
                    }
                    aq1Var = aq1Var.k;
                }
            }
        }
        return false;
    }

    @Override // defpackage.dx1
    public final boolean h(tb1 tb1Var) {
        return true;
    }
}
