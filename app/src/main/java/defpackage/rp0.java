package defpackage;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class rp0 extends aq1 implements m20, ey1, dq1, ia0 {
    public final boolean t;
    public final rs0 u;
    public boolean v;
    public boolean w;
    public final int x;
    public fq2 y;

    public rp0(int i, rs0 rs0Var, int i2) {
        i = (i2 & 1) != 0 ? 1 : i;
        boolean z = (i2 & 2) == 0;
        rs0Var = (i2 & 4) != 0 ? null : rs0Var;
        this.t = z;
        this.u = rs0Var;
        this.x = i;
    }

    @Override // defpackage.aq1
    public final boolean e1() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    @Override // defpackage.aq1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i1() {
        int iOrdinal = u1().ordinal();
        if (iOrdinal == 0) {
            ep0 ep0Var = (ep0) ((h7) vr.Y(this)).getFocusOwner();
            ep0Var.b(8, true, false);
            if (this.t) {
                ep0Var.a.F();
            }
            ep0Var.d.a();
        } else if (iOrdinal == 1) {
            bp0 focusOwner = ((h7) vr.Y(this)).getFocusOwner();
            rp0 rp0VarS = br.s(this);
            if (rp0VarS != null && rp0VarS.t) {
                ep0 ep0Var2 = (ep0) focusOwner;
                ep0Var2.a.F();
                ep0Var2.d.a();
            }
        } else if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                c.k();
                return;
            }
        }
        fq2 fq2Var = this.y;
        if (fq2Var != null) {
            ((pi) fq2Var).S();
        }
        this.y = null;
    }

    @Override // defpackage.aq1
    public final void j1() {
        if (u1().a()) {
            ((ep0) ((h7) vr.Y(this)).getFocusOwner()).b(8, true, true);
        }
    }

    @Override // defpackage.ey1
    public final void k0() {
        v1();
    }

    public final boolean p1(int i) {
        int iOrdinal = uq.B(this, i).ordinal();
        if (iOrdinal == 0) {
            return uq.C(this);
        }
        if (iOrdinal == 1) {
            return false;
        }
        if (iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        c.k();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [aq1] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [aq1] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [qs1] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [qs1] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void q1(mp0 mp0Var, mp0 mp0Var2) {
        ax1 ax1Var;
        rs0 rs0Var;
        ep0 ep0Var = (ep0) ((h7) vr.Y(this)).getFocusOwner();
        rp0 rp0VarF = ep0Var.f();
        if (!mp0Var.equals(mp0Var2) && (rs0Var = this.u) != null) {
            rs0Var.f(mp0Var, mp0Var2);
        }
        aq1 aq1Var = this.f;
        if (!aq1Var.s) {
            m21.c("visitAncestors called on an unattached node");
        }
        aq1 aq1Var2 = this.f;
        tb1 tb1VarX = vr.X(this);
        while (tb1VarX != null) {
            if ((tb1VarX.L.f.i & 5120) != 0) {
                while (aq1Var2 != null) {
                    int i = aq1Var2.h;
                    if ((i & 5120) != 0) {
                        if (aq1Var2 != aq1Var && (i & 1024) != 0) {
                            return;
                        }
                        if ((i & 4096) != 0) {
                            ?? J = aq1Var2;
                            ?? qs1Var = 0;
                            while (J != 0) {
                                if (J instanceof so0) {
                                    so0 so0Var = (so0) J;
                                    if (rp0VarF == ep0Var.f()) {
                                        so0Var.x0(mp0Var2);
                                    }
                                } else if ((J.h & 4096) != 0 && (J instanceof ja0)) {
                                    aq1 aq1Var3 = ((ja0) J).u;
                                    int i2 = 0;
                                    J = J;
                                    qs1Var = qs1Var;
                                    while (aq1Var3 != null) {
                                        if ((aq1Var3.h & 4096) != 0) {
                                            i2++;
                                            qs1Var = qs1Var;
                                            if (i2 == 1) {
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
                                    if (i2 == 1) {
                                    }
                                }
                                J = vr.j(qs1Var);
                            }
                        }
                    }
                    aq1Var2 = aq1Var2.j;
                }
            }
            tb1VarX = tb1VarX.u();
            aq1Var2 = (tb1VarX == null || (ax1Var = tb1VarX.L) == null) ? null : ax1Var.e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [aq1] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [aq1] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [qs1] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [qs1] */
    /* JADX WARN: Type inference failed for: r8v4 */
    public final gp0 r1() {
        boolean z;
        ax1 ax1Var;
        gp0 gp0Var = new gp0();
        gp0Var.a = true;
        ip0 ip0Var = ip0.b;
        gp0Var.b = ip0Var;
        gp0Var.c = ip0Var;
        gp0Var.d = ip0Var;
        gp0Var.e = ip0Var;
        gp0Var.f = ip0Var;
        gp0Var.g = ip0Var;
        gp0Var.h = ip0Var;
        gp0Var.i = ip0Var;
        int i = 8;
        gp0Var.j = new n20(i);
        gp0Var.k = new n20(i);
        gp0Var.l = f5.X;
        int i2 = this.x;
        if (i2 == 1) {
            z = true;
        } else if (i2 == 0) {
            z = !(((c31) ((e31) ((d31) ur.z(this, s20.m))).a.getValue()).a == 1);
        } else {
            if (i2 != 2) {
                c.q("Unknown Focusability");
                return null;
            }
            z = false;
        }
        gp0Var.a = z;
        aq1 aq1Var = this.f;
        if (!aq1Var.s) {
            m21.c("visitAncestors called on an unattached node");
        }
        aq1 aq1Var2 = this.f;
        tb1 tb1VarX = vr.X(this);
        loop0: while (tb1VarX != null) {
            if ((tb1VarX.L.f.i & 3072) != 0) {
                while (aq1Var2 != null) {
                    int i3 = aq1Var2.h;
                    if ((i3 & 3072) != 0) {
                        if (aq1Var2 != aq1Var && (i3 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i3 & 2048) != 0) {
                            ?? qs1Var = 0;
                            ?? J = aq1Var2;
                            while (J != 0) {
                                if (J instanceof hp0) {
                                    ((hp0) J).s0(gp0Var);
                                } else if ((J.h & 2048) != 0 && (J instanceof ja0)) {
                                    aq1 aq1Var3 = ((ja0) J).u;
                                    int i4 = 0;
                                    J = J;
                                    qs1Var = qs1Var;
                                    while (aq1Var3 != null) {
                                        if ((aq1Var3.h & 2048) != 0) {
                                            i4++;
                                            qs1Var = qs1Var;
                                            if (i4 == 1) {
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
                                    if (i4 == 1) {
                                    }
                                }
                                J = vr.j(qs1Var);
                            }
                        }
                    }
                    aq1Var2 = aq1Var2.j;
                }
            }
            tb1VarX = tb1VarX.u();
            aq1Var2 = (tb1VarX == null || (ax1Var = tb1VarX.L) == null) ? null : ax1Var.e;
        }
        return gp0Var;
    }

    public final jk2 s1(ab1 ab1Var) {
        jk2 jk2Var = r1().l;
        return jk2Var != f5.X ? ab1Var == null ? jk2Var : jk2Var.i(ab1Var.l0(vr.W(this), 0L, (6 & 4) != 0)) : ab1Var != null ? ab1Var.c0(vr.W(this), false) : b32.b(0L, lr.T(vr.W(this).h));
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x009b, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final sc1 t1() {
        ax1 ax1Var;
        Object obj;
        if (!this.f.s) {
            m21.c("visitAncestors called on an unattached node");
        }
        aq1 aq1Var = this.f.j;
        tb1 tb1VarX = vr.X(this);
        while (true) {
            if (tb1VarX == null) {
                break;
            }
            if ((tb1VarX.L.f.i & 8388640) != 0) {
                while (aq1Var != null) {
                    int i = aq1Var.h;
                    if ((i & 8388640) != 0) {
                        if ((8388608 & i) != 0) {
                            if (!(aq1Var instanceof sc1)) {
                                if (aq1Var instanceof ja0) {
                                    aq1Var = null;
                                    for (aq1 aq1Var2 = ((ja0) aq1Var).u; aq1Var2 != null; aq1Var2 = aq1Var2.k) {
                                        if (aq1Var2 instanceof sc1) {
                                            aq1Var = aq1Var2;
                                        }
                                    }
                                } else {
                                    aq1Var = null;
                                }
                            }
                            sc1 sc1Var = (sc1) aq1Var;
                            if (sc1Var != null) {
                                return sc1Var;
                            }
                        } else if ((i & 32) == 0) {
                            continue;
                        } else {
                            if (aq1Var instanceof dq1) {
                                obj = aq1Var;
                            } else if (aq1Var instanceof ja0) {
                                obj = null;
                                for (aq1 aq1Var3 = ((ja0) aq1Var).u; aq1Var3 != null; aq1Var3 = aq1Var3.k) {
                                    if (aq1Var3 instanceof dq1) {
                                        obj = aq1Var3;
                                    }
                                }
                            } else {
                                obj = null;
                            }
                            dq1 dq1Var = (dq1) obj;
                            if (dq1Var != null) {
                                gq gqVarD = dq1Var.D();
                                fe2 fe2Var = r51.c;
                                if (gqVarD.v(fe2Var)) {
                                    return (sc1) dq1Var.D().A(fe2Var);
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    aq1Var = aq1Var.j;
                }
            }
            tb1VarX = tb1VarX.u();
            aq1Var = (tb1VarX == null || (ax1Var = tb1VarX.L) == null) ? null : ax1Var.e;
        }
    }

    public final mp0 u1() {
        rp0 rp0VarF;
        ax1 ax1Var;
        boolean z = this.s;
        mp0 mp0Var = mp0.h;
        if (!z || (rp0VarF = ((ep0) ((h7) vr.Y(this)).getFocusOwner()).f()) == null) {
            return mp0Var;
        }
        if (this == rp0VarF) {
            return mp0.f;
        }
        if (rp0VarF.s) {
            if (!rp0VarF.f.s) {
                m21.c("visitAncestors called on an unattached node");
            }
            aq1 aq1Var = rp0VarF.f.j;
            tb1 tb1VarX = vr.X(rp0VarF);
            while (tb1VarX != null) {
                if ((tb1VarX.L.f.i & 1024) != 0) {
                    while (aq1Var != null) {
                        if ((aq1Var.h & 1024) != 0) {
                            aq1 aq1VarJ = aq1Var;
                            qs1 qs1Var = null;
                            while (aq1VarJ != null) {
                                if (aq1VarJ instanceof rp0) {
                                    if (this == ((rp0) aq1VarJ)) {
                                        return mp0.g;
                                    }
                                } else if ((aq1VarJ.h & 1024) != 0 && (aq1VarJ instanceof ja0)) {
                                    int i = 0;
                                    for (aq1 aq1Var2 = ((ja0) aq1VarJ).u; aq1Var2 != null; aq1Var2 = aq1Var2.k) {
                                        if ((aq1Var2.h & 1024) != 0) {
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
                        aq1Var = aq1Var.j;
                    }
                }
                tb1VarX = tb1VarX.u();
                aq1Var = (tb1VarX == null || (ax1Var = tb1VarX.L) == null) ? null : ax1Var.e;
            }
        }
        return mp0Var;
    }

    public final void v1() {
        int iOrdinal = u1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return;
                }
                c.k();
                return;
            }
        }
        qk2 qk2Var = new qk2();
        gq.M(this, new u1(17, qk2Var, this));
        Object obj = qk2Var.f;
        if (obj == null) {
            s51.F("focusProperties");
            throw null;
        }
        if (((fp0) obj).b()) {
            return;
        }
        ((ep0) ((h7) vr.Y(this)).getFocusOwner()).b(8, true, true);
    }

    public final boolean x1(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            return r1().a ? p1(i) : g12.I(this, i, new w6(i, 4));
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.aq1
    public final void h1() {
    }

    public final void w1() {
    }
}
