package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class xw1 extends jx1 {
    public final aq1 c;
    public final s4 d;
    public final xk1 e;
    public ex1 f;
    public za2 g;
    public boolean h;
    public boolean i;
    public boolean j;

    public xw1(aq1 aq1Var) {
        this.c = aq1Var;
        s4 s4Var = new s4();
        s4Var.b = new long[2];
        this.d = s4Var;
        this.e = new xk1(2);
        this.i = true;
        this.j = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0333  */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [aq1] */
    /* JADX WARN: Type inference failed for: r5v1, types: [aq1] */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35, types: [aq1] */
    /* JADX WARN: Type inference failed for: r5v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18, types: [qs1] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21, types: [qs1] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    @Override // defpackage.jx1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(defpackage.xk1 r58, defpackage.ab1 r59, defpackage.g51 r60, boolean r61) {
        /*
            Method dump skipped, instruction units count: 824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xw1.a(xk1, ab1, g51, boolean):boolean");
    }

    @Override // defpackage.jx1
    public final void b(g51 g51Var) {
        super.b(g51Var);
        za2 za2Var = this.g;
        if (za2Var == null) {
            return;
        }
        this.h = this.i;
        List list = za2Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            gb2 gb2Var = (gb2) list.get(i);
            boolean z = gb2Var.d;
            long j = gb2Var.a;
            boolean zA = g51Var.a(j);
            boolean z2 = this.i;
            if ((!z && !zA) || (!z && !z2)) {
                this.d.f(j);
            }
        }
        this.i = false;
        this.j = za2Var.f == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [qs1] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [qs1] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r8v1, types: [aq1] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [aq1] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [aq1] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void c() {
        qs1 qs1Var = this.a;
        Object[] objArr = qs1Var.f;
        int i = qs1Var.h;
        for (int i2 = 0; i2 < i; i2++) {
            ((xw1) objArr[i2]).c();
        }
        ?? J = this.c;
        ?? qs1Var2 = 0;
        while (J != 0) {
            if (J instanceof jb2) {
                ((jb2) J).L0();
            } else if ((J.h & 16) != 0 && (J instanceof ja0)) {
                aq1 aq1Var = ((ja0) J).u;
                int i3 = 0;
                qs1Var2 = qs1Var2;
                J = J;
                while (aq1Var != null) {
                    if ((aq1Var.h & 16) != 0) {
                        i3++;
                        qs1Var2 = qs1Var2;
                        if (i3 == 1) {
                            J = aq1Var;
                        } else {
                            if (qs1Var2 == 0) {
                                qs1Var2 = new qs1(new aq1[16]);
                            }
                            if (J != 0) {
                                qs1Var2.b(J);
                                J = 0;
                            }
                            qs1Var2.b(aq1Var);
                        }
                    }
                    aq1Var = aq1Var.k;
                    qs1Var2 = qs1Var2;
                    J = J;
                }
                if (i3 == 1) {
                }
            }
            J = vr.j(qs1Var2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r7v0 */
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
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [qs1] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [qs1] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean d(g51 g51Var) {
        tb1 tb1Var;
        xk1 xk1Var = this.e;
        boolean z = false;
        z = false;
        z = false;
        if (xk1Var.f() != 0) {
            aq1 aq1Var = this.c;
            if (aq1Var.s) {
                ex1 ex1Var = aq1Var.m;
                if ((ex1Var == null || (tb1Var = ex1Var.z) == null) ? false : tb1Var.I()) {
                    za2 za2Var = this.g;
                    za2Var.getClass();
                    ex1 ex1Var2 = this.f;
                    ex1Var2.getClass();
                    long j = ex1Var2.h;
                    ?? J = aq1Var;
                    ?? qs1Var = 0;
                    while (J != 0) {
                        if (J instanceof jb2) {
                            ((jb2) J).i0(za2Var, ab2.h, j);
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
                    if (aq1Var.s) {
                        qs1 qs1Var2 = this.a;
                        Object[] objArr = qs1Var2.f;
                        int i2 = qs1Var2.h;
                        for (int i3 = 0; i3 < i2; i3++) {
                            ((xw1) objArr[i3]).d(g51Var);
                        }
                    }
                    z = true;
                }
            }
        }
        b(g51Var);
        xk1Var.a();
        this.f = null;
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [aq1] */
    /* JADX WARN: Type inference failed for: r0v3, types: [aq1] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [aq1] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [qs1] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [qs1] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [aq1] */
    /* JADX WARN: Type inference failed for: r6v10, types: [aq1] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [qs1] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [qs1] */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean e(g51 g51Var, boolean z) {
        tb1 tb1Var;
        if (this.e.f() == 0) {
            return false;
        }
        ?? J = this.c;
        if (J.s) {
            ex1 ex1Var = J.m;
            if ((ex1Var == null || (tb1Var = ex1Var.z) == null) ? false : tb1Var.I()) {
                za2 za2Var = this.g;
                za2Var.getClass();
                ex1 ex1Var2 = this.f;
                ex1Var2.getClass();
                long j = ex1Var2.h;
                ?? J2 = J;
                ?? qs1Var = 0;
                while (J2 != 0) {
                    if (J2 instanceof jb2) {
                        ((jb2) J2).i0(za2Var, ab2.f, j);
                    } else if ((J2.h & 16) != 0 && (J2 instanceof ja0)) {
                        aq1 aq1Var = ((ja0) J2).u;
                        int i = 0;
                        J2 = J2;
                        qs1Var = qs1Var;
                        while (aq1Var != null) {
                            if ((aq1Var.h & 16) != 0) {
                                i++;
                                qs1Var = qs1Var;
                                if (i == 1) {
                                    J2 = aq1Var;
                                } else {
                                    if (qs1Var == 0) {
                                        qs1Var = new qs1(new aq1[16]);
                                    }
                                    if (J2 != 0) {
                                        qs1Var.b(J2);
                                        J2 = 0;
                                    }
                                    qs1Var.b(aq1Var);
                                }
                            }
                            aq1Var = aq1Var.k;
                            J2 = J2;
                            qs1Var = qs1Var;
                        }
                        if (i == 1) {
                        }
                    }
                    J2 = vr.j(qs1Var);
                }
                if (J.s) {
                    qs1 qs1Var2 = this.a;
                    Object[] objArr = qs1Var2.f;
                    int i2 = qs1Var2.h;
                    for (int i3 = 0; i3 < i2; i3++) {
                        xw1 xw1Var = (xw1) objArr[i3];
                        this.f.getClass();
                        xw1Var.e(g51Var, z);
                    }
                }
                if (J.s) {
                    ?? qs1Var3 = 0;
                    while (J != 0) {
                        if (J instanceof jb2) {
                            ((jb2) J).i0(za2Var, ab2.g, j);
                        } else if ((J.h & 16) != 0 && (J instanceof ja0)) {
                            aq1 aq1Var2 = ((ja0) J).u;
                            int i4 = 0;
                            J = J;
                            qs1Var3 = qs1Var3;
                            while (aq1Var2 != null) {
                                if ((aq1Var2.h & 16) != 0) {
                                    i4++;
                                    qs1Var3 = qs1Var3;
                                    if (i4 == 1) {
                                        J = aq1Var2;
                                    } else {
                                        if (qs1Var3 == 0) {
                                            qs1Var3 = new qs1(new aq1[16]);
                                        }
                                        if (J != 0) {
                                            qs1Var3.b(J);
                                            J = 0;
                                        }
                                        qs1Var3.b(aq1Var2);
                                    }
                                }
                                aq1Var2 = aq1Var2.k;
                                J = J;
                                qs1Var3 = qs1Var3;
                            }
                            if (i4 == 1) {
                            }
                        }
                        J = vr.j(qs1Var3);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(long j, as1 as1Var) {
        s4 s4Var = this.d;
        if (s4Var.b(j) && as1Var.h(this) < 0) {
            s4Var.f(j);
            this.e.e(j);
        }
        qs1 qs1Var = this.a;
        Object[] objArr = qs1Var.f;
        int i = qs1Var.h;
        for (int i2 = 0; i2 < i; i2++) {
            ((xw1) objArr[i2]).f(j, as1Var);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.c + ", children=" + this.a + ", pointerIds=" + this.d + ")";
    }
}
