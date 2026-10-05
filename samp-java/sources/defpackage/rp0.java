package defpackage;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i1() {
        /*
            r4 = this;
            mp0 r0 = r4.u1()
            int r0 = r0.ordinal()
            r1 = 1
            if (r0 == 0) goto L39
            if (r0 == r1) goto L18
            r2 = 2
            if (r0 == r2) goto L39
            r1 = 3
            if (r0 != r1) goto L14
            goto L59
        L14:
            defpackage.c.k()
            return
        L18:
            q12 r0 = defpackage.vr.Y(r4)
            h7 r0 = (defpackage.h7) r0
            bp0 r0 = r0.getFocusOwner()
            rp0 r2 = defpackage.br.s(r4)
            if (r2 == 0) goto L59
            boolean r2 = r2.t
            if (r2 != r1) goto L59
            ep0 r0 = (defpackage.ep0) r0
            h7 r1 = r0.a
            r1.F()
            zo0 r0 = r0.d
            r0.a()
            goto L59
        L39:
            q12 r0 = defpackage.vr.Y(r4)
            h7 r0 = (defpackage.h7) r0
            bp0 r0 = r0.getFocusOwner()
            ep0 r0 = (defpackage.ep0) r0
            r2 = 8
            r3 = 0
            r0.b(r2, r1, r3)
            boolean r1 = r4.t
            if (r1 == 0) goto L54
            h7 r1 = r0.a
            r1.F()
        L54:
            zo0 r0 = r0.d
            r0.a()
        L59:
            fq2 r0 = r4.y
            if (r0 == 0) goto L62
            pi r0 = (defpackage.pi) r0
            r0.S()
        L62:
            r0 = 0
            r4.y = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rp0.i1():void");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.sc1 t1() {
        /*
            r6 = this;
            aq1 r0 = r6.f
            boolean r0 = r0.s
            if (r0 != 0) goto Lb
            java.lang.String r0 = "visitAncestors called on an unattached node"
            defpackage.m21.c(r0)
        Lb:
            aq1 r0 = r6.f
            aq1 r0 = r0.j
            tb1 r6 = defpackage.vr.X(r6)
        L13:
            r1 = 0
            if (r6 == 0) goto L9b
            ax1 r2 = r6.L
            aq1 r2 = r2.f
            int r2 = r2.i
            r3 = 8388640(0x800020, float:1.1754988E-38)
            r2 = r2 & r3
            if (r2 == 0) goto L8a
        L22:
            if (r0 == 0) goto L8a
            int r2 = r0.h
            r4 = r2 & r3
            if (r4 == 0) goto L87
            r4 = 8388608(0x800000, float:1.1754944E-38)
            r4 = r4 & r2
            if (r4 == 0) goto L4d
            boolean r6 = r0 instanceof defpackage.sc1
            if (r6 == 0) goto L34
            goto L48
        L34:
            boolean r6 = r0 instanceof defpackage.ja0
            if (r6 == 0) goto L47
            ja0 r0 = (defpackage.ja0) r0
            aq1 r6 = r0.u
            r0 = r1
        L3d:
            if (r6 == 0) goto L48
            boolean r2 = r6 instanceof defpackage.sc1
            if (r2 == 0) goto L44
            r0 = r6
        L44:
            aq1 r6 = r6.k
            goto L3d
        L47:
            r0 = r1
        L48:
            sc1 r0 = (defpackage.sc1) r0
            if (r0 == 0) goto L9b
            return r0
        L4d:
            r2 = r2 & 32
            if (r2 == 0) goto L87
            boolean r2 = r0 instanceof defpackage.dq1
            if (r2 == 0) goto L57
            r4 = r0
            goto L6c
        L57:
            boolean r2 = r0 instanceof defpackage.ja0
            if (r2 == 0) goto L6b
            r2 = r0
            ja0 r2 = (defpackage.ja0) r2
            aq1 r2 = r2.u
            r4 = r1
        L61:
            if (r2 == 0) goto L6c
            boolean r5 = r2 instanceof defpackage.dq1
            if (r5 == 0) goto L68
            r4 = r2
        L68:
            aq1 r2 = r2.k
            goto L61
        L6b:
            r4 = r1
        L6c:
            dq1 r4 = (defpackage.dq1) r4
            if (r4 == 0) goto L87
            gq r2 = r4.D()
            fe2 r5 = defpackage.r51.c
            boolean r2 = r2.v(r5)
            if (r2 == 0) goto L87
            gq r6 = r4.D()
            java.lang.Object r6 = r6.A(r5)
            sc1 r6 = (defpackage.sc1) r6
            return r6
        L87:
            aq1 r0 = r0.j
            goto L22
        L8a:
            tb1 r6 = r6.u()
            if (r6 == 0) goto L98
            ax1 r0 = r6.L
            if (r0 == 0) goto L98
            rc3 r0 = r0.e
            goto L13
        L98:
            r0 = r1
            goto L13
        L9b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rp0.t1():sc1");
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
