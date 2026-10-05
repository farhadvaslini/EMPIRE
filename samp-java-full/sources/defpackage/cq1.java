package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class cq1 {
    public final h7 a;
    public as1 b;
    public as1 c;
    public as1 d;
    public as1 e;
    public boolean f;

    public cq1(h7 h7Var) {
        this.a = h7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [aq1] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [aq1] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [qs1] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [qs1] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    public static void b(aq1 aq1Var, fe2 fe2Var) {
        if (!aq1Var.f.s) {
            m21.c("visitSubtreeIf called on an unattached node");
        }
        qs1 qs1Var = new qs1(new aq1[16]);
        aq1 aq1Var2 = aq1Var.f;
        aq1 aq1Var3 = aq1Var2.k;
        if (aq1Var3 == null) {
            vr.h(qs1Var, aq1Var2);
        } else {
            qs1Var.b(aq1Var3);
        }
        while (true) {
            int i = qs1Var.h;
            if (i == 0) {
                return;
            }
            aq1 aq1Var4 = (aq1) qs1Var.k(i - 1);
            if ((aq1Var4.i & 32) != 0) {
                for (aq1 aq1Var5 = aq1Var4; aq1Var5 != null && aq1Var5.s; aq1Var5 = aq1Var5.k) {
                    if ((aq1Var5.h & 32) != 0) {
                        ?? J = aq1Var5;
                        ?? qs1Var2 = 0;
                        while (J != 0) {
                            if (J instanceof dq1) {
                                if (((dq1) J).D().v(fe2Var)) {
                                    break;
                                }
                            } else if ((J.h & 32) != 0 && (J instanceof ja0)) {
                                aq1 aq1Var6 = ((ja0) J).u;
                                int i2 = 0;
                                J = J;
                                qs1Var2 = qs1Var2;
                                while (aq1Var6 != null) {
                                    if ((aq1Var6.h & 32) != 0) {
                                        i2++;
                                        qs1Var2 = qs1Var2;
                                        if (i2 == 1) {
                                            J = aq1Var6;
                                        } else {
                                            if (qs1Var2 == 0) {
                                                qs1Var2 = new qs1(new aq1[16]);
                                            }
                                            if (J != 0) {
                                                qs1Var2.b(J);
                                                J = 0;
                                            }
                                            qs1Var2.b(aq1Var6);
                                        }
                                    }
                                    aq1Var6 = aq1Var6.k;
                                    J = J;
                                    qs1Var2 = qs1Var2;
                                }
                                if (i2 == 1) {
                                }
                            }
                            J = vr.j(qs1Var2);
                        }
                    }
                }
            }
            vr.h(qs1Var, aq1Var4);
        }
    }

    public final void a() {
        if (this.f) {
            return;
        }
        this.f = true;
        ja jaVar = new ja(29, this);
        as1 as1Var = this.a.v0;
        if (as1Var.h(jaVar) >= 0) {
            return;
        }
        as1Var.b(jaVar);
    }
}
