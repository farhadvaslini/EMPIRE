package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class vu2 {
    public final aq1 a;
    public final boolean b;
    public final tb1 c;
    public final qu2 d;
    public vu2 e;
    public final int f;

    public vu2(aq1 aq1Var, boolean z, tb1 tb1Var, qu2 qu2Var) {
        this.a = aq1Var;
        this.b = z;
        this.c = tb1Var;
        this.d = qu2Var;
        this.f = tb1Var.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [aq1] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [aq1] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v9 */
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
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public final jk2 a(ex1 ex1Var) {
        ?? J;
        vu2 vu2VarL = l();
        if (vu2VarL == null) {
            return jk2.e;
        }
        aq1 aq1Var = vu2VarL.c.L.f;
        if ((aq1Var.i & 8) != 0) {
            loop0: while (aq1Var != null) {
                if ((aq1Var.h & 8) != 0) {
                    J = aq1Var;
                    ?? qs1Var = 0;
                    while (J != 0) {
                        if (J instanceof tu2) {
                            if (((tu2) J).C()) {
                                break loop0;
                            }
                        } else if ((J.h & 8) != 0 && (J instanceof ja0)) {
                            aq1 aq1Var2 = ((ja0) J).u;
                            int i = 0;
                            J = J;
                            qs1Var = qs1Var;
                            while (aq1Var2 != null) {
                                if ((aq1Var2.h & 8) != 0) {
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
                if ((aq1Var.i & 8) == 0) {
                    break;
                }
                aq1Var = aq1Var.k;
            }
            J = 0;
        } else {
            J = 0;
        }
        tu2 tu2Var = (tu2) J;
        ex1 ex1VarU = tu2Var != null ? vr.U(tu2Var, 8) : null;
        return ex1VarU == null ? vu2VarL.a(ex1Var) : ex1VarU.c0(ex1Var, true);
    }

    public final vu2 b(no2 no2Var, ns0 ns0Var) {
        qu2 qu2Var = new qu2();
        qu2Var.h = false;
        qu2Var.i = false;
        ns0Var.h(qu2Var);
        vu2 vu2Var = new vu2(new uu2(ns0Var), false, new tb1(this.f + (no2Var != null ? 1000000000 : 2000000000), true), qu2Var);
        vu2Var.e = this;
        return vu2Var;
    }

    public final void c(tb1 tb1Var, ArrayList arrayList) {
        qs1 qs1VarY = tb1Var.y();
        Object[] objArr = qs1VarY.f;
        int i = qs1VarY.h;
        for (int i2 = 0; i2 < i; i2++) {
            tb1 tb1Var2 = (tb1) objArr[i2];
            if (tb1Var2.H() && !tb1Var2.W) {
                if (tb1Var2.L.d(8)) {
                    arrayList.add(g12.p(tb1Var2, this.b));
                } else {
                    c(tb1Var2, arrayList);
                }
            }
        }
    }

    public final ex1 d() {
        if (!o()) {
            tu2 tu2VarF = f();
            return tu2VarF != null ? vr.U(tu2VarF, 8) : this.c.L.c;
        }
        vu2 vu2VarL = l();
        if (vu2VarL != null) {
            return vu2VarL.d();
        }
        return null;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        r(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            vu2 vu2Var = (vu2) arrayList.get(size2);
            if (vu2Var.p()) {
                arrayList2.add(vu2Var);
            } else if (!vu2Var.d.i) {
                vu2Var.e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [aq1] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [aq1] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v3, types: [qs1] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [qs1] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public final tu2 f() {
        ?? J;
        boolean z;
        boolean z2 = this.d.h;
        ?? r4 = 0;
        r4 = 0;
        r4 = 0;
        r4 = 0;
        tb1 tb1Var = this.c;
        if (z2) {
            aq1 aq1Var = tb1Var.L.f;
            if ((aq1Var.i & 8) != 0) {
                J = 0;
                while (aq1Var != null) {
                    if ((aq1Var.h & 8) != 0) {
                        aq1 aq1VarJ = aq1Var;
                        qs1 qs1Var = null;
                        while (aq1VarJ != null) {
                            if (aq1VarJ instanceof tu2) {
                                tu2 tu2Var = (tu2) aq1VarJ;
                                ?? r0 = J;
                                if (tu2Var.C()) {
                                    r0 = J;
                                    if (tu2Var.N0()) {
                                        return tu2Var;
                                    }
                                    if (J == 0) {
                                        r0 = tu2Var;
                                    }
                                }
                                z = false;
                                J = r0;
                            } else {
                                z = true;
                                J = J;
                            }
                            if (z && (aq1VarJ.h & 8) != 0 && (aq1VarJ instanceof ja0)) {
                                int i = 0;
                                for (aq1 aq1Var2 = ((ja0) aq1VarJ).u; aq1Var2 != null; aq1Var2 = aq1Var2.k) {
                                    if ((aq1Var2.h & 8) != 0) {
                                        i++;
                                        if (i == 1) {
                                            aq1VarJ = aq1Var2;
                                        } else {
                                            if (qs1Var == null) {
                                                qs1Var = new qs1(new aq1[16]);
                                            }
                                            if (aq1VarJ != null) {
                                                qs1Var.b(aq1VarJ);
                                                aq1VarJ = null;
                                            }
                                            qs1Var.b(aq1Var2);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            aq1VarJ = vr.j(qs1Var);
                        }
                    }
                    if ((aq1Var.i & 8) == 0) {
                        break;
                    }
                    aq1Var = aq1Var.k;
                    J = J;
                }
                r4 = J;
            }
        } else {
            aq1 aq1Var3 = tb1Var.L.f;
            if ((aq1Var3.i & 8) != 0) {
                loop3: while (aq1Var3 != null) {
                    if ((aq1Var3.h & 8) != 0) {
                        J = aq1Var3;
                        ?? qs1Var2 = 0;
                        while (J != 0) {
                            if (J instanceof tu2) {
                                if (((tu2) J).C()) {
                                    r4 = J;
                                }
                            } else if ((J.h & 8) != 0 && (J instanceof ja0)) {
                                aq1 aq1Var4 = ((ja0) J).u;
                                int i2 = 0;
                                J = J;
                                qs1Var2 = qs1Var2;
                                while (aq1Var4 != null) {
                                    if ((aq1Var4.h & 8) != 0) {
                                        i2++;
                                        qs1Var2 = qs1Var2;
                                        if (i2 == 1) {
                                            J = aq1Var4;
                                        } else {
                                            if (qs1Var2 == 0) {
                                                qs1Var2 = new qs1(new aq1[16]);
                                            }
                                            if (J != 0) {
                                                qs1Var2.b(J);
                                                J = 0;
                                            }
                                            qs1Var2.b(aq1Var4);
                                        }
                                    }
                                    aq1Var4 = aq1Var4.k;
                                    J = J;
                                    qs1Var2 = qs1Var2;
                                }
                                if (i2 == 1) {
                                }
                            }
                            J = vr.j(qs1Var2);
                        }
                    }
                    if ((aq1Var3.i & 8) == 0) {
                        break;
                    }
                    aq1Var3 = aq1Var3.k;
                }
            }
        }
        return (tu2) r4;
    }

    public final jk2 g() {
        ex1 ex1VarD = d();
        if (ex1VarD != null) {
            if (!ex1VarD.w1().s) {
                ex1VarD = null;
            }
            if (ex1VarD != null) {
                return vr.y(ex1VarD).c0(ex1VarD, true);
            }
        }
        return jk2.e;
    }

    public final jk2 h() {
        ex1 ex1VarD = d();
        if (ex1VarD != null) {
            if (!ex1VarD.w1().s) {
                ex1VarD = null;
            }
            if (ex1VarD != null) {
                return vr.q(ex1VarD, true);
            }
        }
        return jk2.e;
    }

    public final List i(boolean z, boolean z2) {
        if (!z && this.d.i) {
            return ni0.f;
        }
        ArrayList arrayList = new ArrayList();
        if (!p()) {
            return r(arrayList, z2);
        }
        ArrayList arrayList2 = new ArrayList();
        e(arrayList, arrayList2);
        return arrayList2;
    }

    public final qu2 k() {
        boolean zP = p();
        qu2 qu2Var = this.d;
        if (!zP) {
            return qu2Var;
        }
        qu2 qu2VarB = qu2Var.b();
        q(new ArrayList(), qu2VarB);
        return qu2VarB;
    }

    public final vu2 l() {
        tb1 tb1VarU;
        vu2 vu2Var = this.e;
        if (vu2Var != null) {
            return vu2Var;
        }
        tb1 tb1Var = this.c;
        boolean z = this.b;
        if (z) {
            tb1VarU = tb1Var.u();
            while (tb1VarU != null) {
                qu2 qu2VarW = tb1VarU.w();
                if (qu2VarW != null && qu2VarW.h) {
                    break;
                }
                tb1VarU = tb1VarU.u();
            }
            tb1VarU = null;
        } else {
            tb1VarU = null;
        }
        if (tb1VarU == null) {
            tb1 tb1VarU2 = tb1Var.u();
            while (true) {
                if (tb1VarU2 == null) {
                    tb1VarU = null;
                    break;
                }
                if (tb1VarU2.L.d(8)) {
                    tb1VarU = tb1VarU2;
                    break;
                }
                tb1VarU2 = tb1VarU2.u();
            }
        }
        if (tb1VarU == null) {
            return null;
        }
        return g12.p(tb1VarU, z);
    }

    public final jk2 m() {
        ia0 ia0VarF = f();
        if (ia0VarF == null) {
            return this.c.L.c.T1();
        }
        aq1 aq1Var = ((aq1) ia0VarF).f;
        Object objG = this.d.f.g(pu2.b);
        if (objG == null) {
            objG = null;
        }
        return y02.q(aq1Var, objG != null, true);
    }

    public final qu2 n() {
        return this.d;
    }

    public final boolean o() {
        return this.e != null;
    }

    public final boolean p() {
        return this.b && this.d.h;
    }

    public final void q(ArrayList arrayList, qu2 qu2Var) {
        if (this.d.i) {
            return;
        }
        r(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            vu2 vu2Var = (vu2) arrayList.get(size2);
            if (!vu2Var.p()) {
                qu2Var.e(vu2Var.d);
                vu2Var.q(arrayList, qu2Var);
            }
        }
    }

    public final List r(ArrayList arrayList, boolean z) {
        if (o()) {
            return ni0.f;
        }
        c(this.c, arrayList);
        if (z) {
            qu2 qu2Var = this.d;
            is1 is1Var = qu2Var.f;
            Object objG = is1Var.g(zu2.z);
            if (objG == null) {
                objG = null;
            }
            no2 no2Var = (no2) objG;
            if (no2Var != null && qu2Var.h && !arrayList.isEmpty()) {
                arrayList.add(b(no2Var, new xc1(27, no2Var)));
            }
            cv2 cv2Var = zu2.a;
            if (is1Var.c(cv2Var) && !arrayList.isEmpty() && qu2Var.h) {
                Object objG2 = is1Var.g(cv2Var);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                String str = list != null ? (String) qx.r0(list) : null;
                if (str != null) {
                    arrayList.add(0, b(null, new im(7, str)));
                }
            }
        }
        return arrayList;
    }
}
