package defpackage;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class zm1 {
    public final tb1 a;
    public boolean c;
    public boolean d;
    public m30 i;
    public final pi b = new pi(6);
    public final a31 e = new a31(21);
    public final qs1 f = new qs1(new tb1[16]);
    public final long g = 1;
    public final qs1 h = new qs1(new ym1[16]);

    public zm1(tb1 tb1Var) {
        this.a = tb1Var;
    }

    public static final boolean a(zm1 zm1Var, tb1 tb1Var, boolean z) {
        m30 m30Var;
        h62 placementScope;
        s21 s21Var;
        tb1 tb1VarU;
        tb1 tb1Var2 = zm1Var.a;
        boolean z2 = tb1Var.W;
        xb1 xb1Var = tb1Var.M;
        if (!z2 && k(tb1Var)) {
            if (tb1Var == tb1Var2) {
                m30Var = zm1Var.i;
                m30Var.getClass();
            } else {
                m30Var = null;
            }
            if (z) {
                zC = xb1Var.e ? c(tb1Var, m30Var) : false;
                if ((zC || xb1Var.f) && s51.n(tb1Var.J(), Boolean.TRUE)) {
                    tb1Var.K();
                }
            } else {
                boolean zD = tb1Var.q() ? d(tb1Var, m30Var) : false;
                if (tb1Var.p() && (tb1Var == tb1Var2 || ((tb1VarU = tb1Var.u()) != null && tb1VarU.I() && xb1Var.p.y))) {
                    if (tb1Var == tb1Var2) {
                        if (tb1Var.I == rb1.h) {
                            tb1Var.d();
                        }
                        tb1 tb1VarU2 = tb1Var.u();
                        if (tb1VarU2 == null || (s21Var = tb1VarU2.L.c) == null || (placementScope = s21Var.u) == null) {
                            placementScope = ((h7) wb1.a(tb1Var)).getPlacementScope();
                        }
                        h62.F(placementScope, xb1Var.p, 0, 0);
                    } else {
                        tb1Var.T();
                    }
                    a31 a31Var = zm1Var.e;
                    a31Var.getClass();
                    if (tb1Var.V > 0) {
                        ((qs1) a31Var.g).b(tb1Var);
                        tb1Var.U = true;
                    }
                }
                zC = zD;
            }
            zm1Var.e();
        }
        return zC;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c(tb1 tb1Var, m30 m30Var) {
        boolean zZ0;
        tb1 tb1Var2 = tb1Var.n;
        xb1 xb1Var = tb1Var.M;
        if (tb1Var2 == null) {
            return false;
        }
        if (m30Var == null) {
            gl1 gl1Var = xb1Var.q;
            m30 m30Var2 = gl1Var != null ? gl1Var.s : null;
            if (m30Var2 != null && tb1Var2 != null) {
                gl1Var.getClass();
                zZ0 = gl1Var.Z0(m30Var2.a);
            }
        } else if (tb1Var2 != null) {
            gl1 gl1Var2 = xb1Var.q;
            gl1Var2.getClass();
            zZ0 = gl1Var2.Z0(m30Var.a);
        } else {
            zZ0 = false;
        }
        tb1 tb1VarU = tb1Var.u();
        if (zZ0 && tb1VarU != null) {
            if (tb1VarU.n == null) {
                tb1.Y(tb1VarU, false, 3);
                return zZ0;
            }
            if (tb1Var.s() == rb1.f) {
                tb1.W(tb1VarU, false, 3);
                return zZ0;
            }
            if (tb1Var.s() == rb1.g) {
                tb1VarU.V(false);
            }
        }
        return zZ0;
    }

    public static boolean d(tb1 tb1Var, m30 m30Var) {
        boolean zP = m30Var != null ? tb1Var.P(m30Var) : tb1.Q(tb1Var);
        tb1 tb1VarU = tb1Var.u();
        if (zP && tb1VarU != null) {
            if (tb1Var.r() == rb1.f) {
                tb1.Y(tb1VarU, false, 3);
                return zP;
            }
            if (tb1Var.r() == rb1.g) {
                tb1VarU.X(false);
            }
        }
        return zP;
    }

    public static boolean i(tb1 tb1Var) {
        gl1 gl1Var;
        ub1 ub1Var;
        if (tb1Var.M.e) {
            return (tb1Var.s() == rb1.h && ((gl1Var = tb1Var.M.q) == null || (ub1Var = gl1Var.w) == null || !ub1Var.e())) ? false : true;
        }
        return false;
    }

    public static boolean j(tb1 tb1Var) {
        if (!tb1Var.q()) {
            return false;
        }
        do {
            if (tb1Var.r() == rb1.h && !tb1Var.M.p.C.e()) {
                tb1 tb1VarU = tb1Var.u();
                if ((tb1VarU != null ? tb1VarU.M.d : null) != pb1.f) {
                    return false;
                }
            }
            tb1Var = tb1Var.u();
            if (tb1Var == null) {
                return false;
            }
        } while (!tb1Var.I());
        return true;
    }

    public static boolean k(tb1 tb1Var) {
        gl1 gl1Var;
        ub1 ub1Var;
        xb1 xb1Var = tb1Var.M;
        return tb1Var.I() || xb1Var.p.y || j(tb1Var) || s51.n(tb1Var.J(), Boolean.TRUE) || i(tb1Var) || xb1Var.p.C.e() || !((gl1Var = xb1Var.q) == null || (ub1Var = gl1Var.w) == null || !ub1Var.e());
    }

    public final void b(boolean z) {
        a31 a31Var = this.e;
        if (z) {
            qs1 qs1Var = (qs1) a31Var.g;
            tb1 tb1Var = this.a;
            if (tb1Var.V > 0) {
                qs1Var.g();
                qs1Var.b(tb1Var);
                tb1Var.U = true;
            }
        }
        if (((qs1) a31Var.g).h != 0) {
            Trace.beginSection("Compose:onPositionedCallbacks");
            try {
                a31Var.o();
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void e() {
        qs1 qs1Var = this.h;
        int i = qs1Var.h;
        if (i != 0) {
            Object[] objArr = qs1Var.f;
            for (int i2 = 0; i2 < i; i2++) {
                ym1 ym1Var = (ym1) objArr[i2];
                if (ym1Var.a.H()) {
                    boolean z = ym1Var.b;
                    tb1 tb1Var = ym1Var.a;
                    boolean z2 = ym1Var.c;
                    if (z) {
                        tb1.W(tb1Var, z2, 2);
                    } else {
                        tb1.Y(tb1Var, z2, 2);
                    }
                }
            }
            qs1Var.g();
        }
    }

    public final void f(tb1 tb1Var) {
        qs1 qs1VarZ = tb1Var.z();
        Object[] objArr = qs1VarZ.f;
        int i = qs1VarZ.h;
        for (int i2 = 0; i2 < i; i2++) {
            tb1 tb1Var2 = (tb1) objArr[i2];
            if (s51.n(tb1Var2.J(), Boolean.TRUE) && !tb1Var2.W) {
                if (this.b.d(tb1Var2)) {
                    tb1Var2.K();
                }
                f(tb1Var2);
            }
        }
    }

    public final void g(tb1 tb1Var, boolean z) {
        if (!this.c) {
            m21.c("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z ? tb1Var.M.e : tb1Var.q()) {
            m21.a("node not yet measured");
        }
        h(tb1Var, z);
    }

    public final void h(tb1 tb1Var, boolean z) {
        gl1 gl1Var;
        ub1 ub1Var;
        qs1 qs1VarZ = tb1Var.z();
        Object[] objArr = qs1VarZ.f;
        int i = qs1VarZ.h;
        for (int i2 = 0; i2 < i; i2++) {
            tb1 tb1Var2 = (tb1) objArr[i2];
            rb1 rb1Var = rb1.f;
            if ((!z && (tb1Var2.r() == rb1Var || tb1Var2.M.p.C.e())) || (z && (tb1Var2.s() == rb1Var || ((gl1Var = tb1Var2.M.q) != null && (ub1Var = gl1Var.w) != null && ub1Var.e())))) {
                boolean zH = pq.H(tb1Var2);
                xb1 xb1Var = tb1Var2.M;
                if (zH && !z) {
                    if (xb1Var.e && this.b.d(tb1Var2)) {
                        o(tb1Var2, true);
                    } else {
                        g(tb1Var2, true);
                    }
                }
                if (z ? xb1Var.e : tb1Var2.q()) {
                    o(tb1Var2, z);
                }
                if (!(z ? xb1Var.e : tb1Var2.q())) {
                    h(tb1Var2, z);
                }
            }
        }
        if (z ? tb1Var.M.e : tb1Var.q()) {
            o(tb1Var, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2, types: [aq1] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [aq1] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [qs1] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [qs1] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    public final boolean l(cs0 cs0Var) {
        boolean z;
        aq1 aq1Var;
        ?? J;
        boolean z2;
        tb1 tb1Var;
        boolean z3;
        boolean zO;
        pi piVar = this.b;
        tb1 tb1Var2 = this.a;
        if (!tb1Var2.H()) {
            m21.a("performMeasureAndLayout called with unattached root");
        }
        if (!tb1Var2.I()) {
            m21.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            m21.a("performMeasureAndLayout called during measure layout");
        }
        boolean z4 = false;
        if (this.i != null) {
            this.c = true;
            this.d = true;
            try {
                boolean zD = piVar.D();
                yl1 yl1Var = (yl1) piVar.g;
                if (zD) {
                    z = false;
                    while (true) {
                        yl1 yl1Var2 = (yl1) piVar.i;
                        yl1 yl1Var3 = (yl1) piVar.h;
                        if (!((x73) yl1Var.g).isEmpty()) {
                            tb1Var = (tb1) ((x73) yl1Var.g).first();
                            yl1Var.E(tb1Var);
                            z3 = tb1Var.n != null;
                            z2 = false;
                        } else if (!((x73) yl1Var3.g).isEmpty()) {
                            tb1Var = (tb1) ((x73) yl1Var3.g).first();
                            yl1Var3.E(tb1Var);
                            z3 = tb1Var.n != null;
                            z2 = true;
                        } else {
                            if (((x73) yl1Var2.g).isEmpty()) {
                                break;
                            }
                            tb1 tb1Var3 = (tb1) ((x73) yl1Var2.g).first();
                            yl1Var2.E(tb1Var3);
                            z2 = true;
                            tb1Var = tb1Var3;
                            z3 = false;
                        }
                        if (z2) {
                            zO = a(this, tb1Var, z3);
                        } else {
                            zO = o(tb1Var, z3);
                            if (tb1Var.M.f) {
                                piVar.b(tb1Var, a61.g);
                            }
                            if (tb1Var.p()) {
                                piVar.b(tb1Var, a61.i);
                            }
                        }
                        if (tb1Var == tb1Var2 && zO) {
                            z = true;
                        }
                    }
                    if (cs0Var != null) {
                        cs0Var.a();
                    }
                } else {
                    z = false;
                }
            } finally {
            }
        } else {
            z = false;
        }
        qs1 qs1Var = this.f;
        Object[] objArr = qs1Var.f;
        int i = qs1Var.h;
        int i2 = 0;
        while (i2 < i) {
            ax1 ax1Var = ((tb1) objArr[i2]).L;
            s21 s21Var = ax1Var.c;
            boolean zG = fx1.g(4194304);
            if (zG) {
                aq1Var = s21Var.i0;
            } else {
                aq1Var = s21Var.i0.j;
                if (aq1Var == null) {
                }
                i2++;
                z4 = false;
            }
            fi1 fi1Var = ex1.b0;
            aq1 aq1VarZ1 = s21Var.z1(zG);
            while (aq1VarZ1 != null && (aq1VarZ1.i & 4194304) != 0) {
                if ((aq1VarZ1.h & 4194304) != 0) {
                    ?? r12 = aq1VarZ1;
                    ?? qs1Var2 = 0;
                    while (r12 != 0) {
                        if (r12 instanceof ya1) {
                            ((ya1) r12).J(ax1Var.c);
                        } else {
                            if ((r12.h & 4194304) != 0 && (r12 instanceof ja0)) {
                                aq1 aq1Var2 = ((ja0) r12).u;
                                ?? r15 = z4;
                                J = r12;
                                qs1Var2 = qs1Var2;
                                while (aq1Var2 != null) {
                                    if ((aq1Var2.h & 4194304) != 0) {
                                        r15++;
                                        qs1Var2 = qs1Var2;
                                        if (r15 == 1) {
                                            J = aq1Var2;
                                        } else {
                                            if (qs1Var2 == 0) {
                                                qs1Var2 = new qs1(new aq1[16]);
                                            }
                                            if (J != 0) {
                                                qs1Var2.b(J);
                                                J = 0;
                                            }
                                            qs1Var2.b(aq1Var2);
                                        }
                                    }
                                    aq1Var2 = aq1Var2.k;
                                    J = J;
                                    qs1Var2 = qs1Var2;
                                    r15 = r15;
                                }
                                if (r15 == 1) {
                                }
                            }
                            z4 = false;
                            r12 = J;
                            qs1Var2 = qs1Var2;
                        }
                        J = vr.j(qs1Var2);
                        z4 = false;
                        r12 = J;
                        qs1Var2 = qs1Var2;
                    }
                }
                if (aq1VarZ1 != aq1Var) {
                    aq1VarZ1 = aq1VarZ1.k;
                    z4 = false;
                }
            }
            i2++;
            z4 = false;
        }
        qs1Var.g();
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [aq1] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [aq1] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
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
    /* JADX WARN: Type inference failed for: r9v5 */
    public final void m(tb1 tb1Var, long j) {
        aq1 aq1Var;
        if (tb1Var.W) {
            return;
        }
        tb1 tb1Var2 = this.a;
        if (tb1Var == tb1Var2) {
            m21.a("measureAndLayout called on root");
        }
        if (!tb1Var2.H()) {
            m21.a("performMeasureAndLayout called with unattached root");
        }
        if (!tb1Var2.I()) {
            m21.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            m21.a("performMeasureAndLayout called during measure layout");
        }
        if (this.i != null) {
            this.c = true;
            this.d = false;
            try {
                pi piVar = this.b;
                ((yl1) piVar.g).E(tb1Var);
                ((yl1) piVar.h).E(tb1Var);
                ((yl1) piVar.i).E(tb1Var);
                if ((c(tb1Var, new m30(j)) || tb1Var.M.f) && s51.n(tb1Var.J(), Boolean.TRUE)) {
                    tb1Var.K();
                }
                f(tb1Var);
                d(tb1Var, new m30(j));
                if (tb1Var.p() && tb1Var.I()) {
                    tb1Var.T();
                    a31 a31Var = this.e;
                    a31Var.getClass();
                    if (tb1Var.V > 0) {
                        ((qs1) a31Var.g).b(tb1Var);
                        tb1Var.U = true;
                    }
                }
                e();
            } finally {
            }
        }
        qs1 qs1Var = this.f;
        Object[] objArr = qs1Var.f;
        int i = qs1Var.h;
        for (int i2 = 0; i2 < i; i2++) {
            ax1 ax1Var = ((tb1) objArr[i2]).L;
            s21 s21Var = ax1Var.c;
            boolean zG = fx1.g(4194304);
            if (zG) {
                aq1Var = s21Var.i0;
            } else {
                aq1Var = s21Var.i0.j;
                if (aq1Var == null) {
                }
            }
            fi1 fi1Var = ex1.b0;
            for (aq1 aq1VarZ1 = s21Var.z1(zG); aq1VarZ1 != null && (aq1VarZ1.i & 4194304) != 0; aq1VarZ1 = aq1VarZ1.k) {
                if ((aq1VarZ1.h & 4194304) != 0) {
                    ?? J = aq1VarZ1;
                    ?? qs1Var2 = 0;
                    while (J != 0) {
                        if (J instanceof ya1) {
                            ((ya1) J).J(ax1Var.c);
                        } else if ((J.h & 4194304) != 0 && (J instanceof ja0)) {
                            aq1 aq1Var2 = ((ja0) J).u;
                            int i3 = 0;
                            J = J;
                            qs1Var2 = qs1Var2;
                            while (aq1Var2 != null) {
                                if ((aq1Var2.h & 4194304) != 0) {
                                    i3++;
                                    qs1Var2 = qs1Var2;
                                    if (i3 == 1) {
                                        J = aq1Var2;
                                    } else {
                                        if (qs1Var2 == 0) {
                                            qs1Var2 = new qs1(new aq1[16]);
                                        }
                                        if (J != 0) {
                                            qs1Var2.b(J);
                                            J = 0;
                                        }
                                        qs1Var2.b(aq1Var2);
                                    }
                                }
                                aq1Var2 = aq1Var2.k;
                                J = J;
                                qs1Var2 = qs1Var2;
                            }
                            if (i3 == 1) {
                            }
                        }
                        J = vr.j(qs1Var2);
                    }
                }
                if (aq1VarZ1 != aq1Var) {
                }
            }
        }
        qs1Var.g();
    }

    public final void n() {
        pi piVar = this.b;
        if (piVar.D()) {
            tb1 tb1Var = this.a;
            if (!tb1Var.H()) {
                m21.a("performMeasureAndLayout called with unattached root");
            }
            if (!tb1Var.I()) {
                m21.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.c) {
                m21.a("performMeasureAndLayout called during measure layout");
            }
            if (this.i != null) {
                this.c = true;
                this.d = false;
                try {
                    if ((((x73) ((yl1) piVar.i).g).isEmpty() || ((x73) ((yl1) piVar.g).g).isEmpty()) ? false : true) {
                        if (tb1Var.n != null) {
                            q(tb1Var, true);
                        } else {
                            p(tb1Var);
                        }
                    }
                    q(tb1Var, false);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        this.c = false;
                        this.d = false;
                    }
                }
            }
        }
    }

    public final boolean o(tb1 tb1Var, boolean z) {
        m30 m30Var;
        boolean zD = false;
        if (!tb1Var.W && k(tb1Var)) {
            if (tb1Var == this.a) {
                m30Var = this.i;
                m30Var.getClass();
            } else {
                m30Var = null;
            }
            if (z) {
                if (tb1Var.M.e) {
                    zD = c(tb1Var, m30Var);
                }
            } else if (tb1Var.q()) {
                zD = d(tb1Var, m30Var);
            }
            e();
        }
        return zD;
    }

    public final void p(tb1 tb1Var) {
        qs1 qs1VarZ = tb1Var.z();
        Object[] objArr = qs1VarZ.f;
        int i = qs1VarZ.h;
        for (int i2 = 0; i2 < i; i2++) {
            tb1 tb1Var2 = (tb1) objArr[i2];
            if (tb1Var2.r() == rb1.f || tb1Var2.M.p.C.e()) {
                if (pq.H(tb1Var2)) {
                    q(tb1Var2, true);
                } else {
                    p(tb1Var2);
                }
            }
        }
    }

    public final void q(tb1 tb1Var, boolean z) {
        m30 m30Var;
        if (tb1Var.W) {
            return;
        }
        if (tb1Var == this.a) {
            m30Var = this.i;
            m30Var.getClass();
        } else {
            m30Var = null;
        }
        if (z) {
            c(tb1Var, m30Var);
        } else {
            d(tb1Var, m30Var);
        }
    }

    public final boolean r(tb1 tb1Var, boolean z) {
        int iOrdinal = tb1Var.M.d.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 || iOrdinal == 3) {
                this.h.b(new ym1(tb1Var, false, z));
            } else {
                if (iOrdinal != 4) {
                    c.k();
                    return false;
                }
                if (!tb1Var.q() || z) {
                    tb1Var.M.p.z = true;
                    if (!tb1Var.W && (tb1Var.I() || j(tb1Var))) {
                        tb1 tb1VarU = tb1Var.u();
                        if (tb1VarU == null || !tb1VarU.q()) {
                            this.b.b(tb1Var, a61.h);
                        }
                        if (!this.d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void s(long j) {
        m30 m30Var = this.i;
        if (m30Var == null ? false : m30.c(m30Var.a, j)) {
            return;
        }
        if (this.c) {
            m21.a("updateRootConstraints called while measuring");
        }
        this.i = new m30(j);
        tb1 tb1Var = this.a;
        boolean zH = tb1Var.H();
        xb1 xb1Var = tb1Var.M;
        if (zH) {
            tb1 tb1Var2 = tb1Var.n;
            if (tb1Var2 != null) {
                xb1Var.e = true;
            }
            xb1Var.p.z = true;
            this.b.b(tb1Var, tb1Var2 != null ? a61.f : a61.h);
        }
    }
}
