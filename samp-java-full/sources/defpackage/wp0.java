package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class wp0 extends ja0 implements tu2, dw0, m20, ey1, nk3 {
    public static final zj B = new zj(25);
    public final rp0 A;
    public qr1 v;
    public final ns0 w;
    public wo0 x;
    public jd1 y;
    public ex1 z;

    public wp0(qr1 qr1Var, int i, k kVar) {
        this.v = qr1Var;
        this.w = kVar;
        rp0 rp0Var = new rp0(i, new op0(2, this, wp0.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 0, 1), 10);
        p1(rp0Var);
        this.A = rp0Var;
    }

    @Override // defpackage.nk3
    public final Object K() {
        return B;
    }

    @Override // defpackage.tu2
    public final void K0(dv2 dv2Var) {
        boolean zA = this.A.u1().a();
        a71[] a71VarArr = bv2.a;
        cv2 cv2Var = zu2.l;
        a71 a71Var = bv2.a[4];
        Boolean boolValueOf = Boolean.valueOf(zA);
        cv2Var.getClass();
        dv2Var.a(cv2Var, boolValueOf);
        dv2Var.a(pu2.w, new y0(null, new c7(0, this, wp0.class, "requestFocus", "requestFocus()Z", 0, 0, 9)));
    }

    @Override // defpackage.dw0
    public final void O(ex1 ex1Var) {
        this.z = ex1Var;
        if (this.A.u1().a()) {
            if (!ex1Var.w1().s) {
                t1();
                return;
            }
            ex1 ex1Var2 = this.z;
            if (ex1Var2 == null || !ex1Var2.w1().s) {
                return;
            }
            t1();
        }
    }

    @Override // defpackage.aq1
    public final boolean e1() {
        return false;
    }

    @Override // defpackage.aq1
    public final void j1() {
        jd1 jd1Var = this.y;
        if (jd1Var != null) {
            jd1Var.b();
        }
        this.y = null;
    }

    @Override // defpackage.ey1
    public final void k0() {
        qk2 qk2Var = new qk2();
        gq.M(this, new u1(18, qk2Var, this));
        jd1 jd1Var = (jd1) qk2Var.f;
        if (this.A.u1().a()) {
            jd1 jd1Var2 = this.y;
            if (jd1Var2 != null) {
                jd1Var2.b();
            }
            if (jd1Var != null) {
                jd1Var.a();
            } else {
                jd1Var = null;
            }
            this.y = jd1Var;
        }
    }

    public final void s1(qr1 qr1Var, s41 s41Var) {
        if (!this.s) {
            qr1Var.c(s41Var);
            return;
        }
        j61 j61Var = (j61) ((n40) d1()).f.m(f5.b0);
        cl3.t(d1(), null, new l(qr1Var, s41Var, j61Var != null ? j61Var.r(new i(17, qr1Var, s41Var)) : null, null, 16), 3);
    }

    public final void t1() {
        ax1 ax1Var;
        if (this.s) {
            if (!this.f.s) {
                m21.c("visitAncestors called on an unattached node");
            }
            aq1 aq1Var = this.f.j;
            tb1 tb1VarX = vr.X(this);
            while (tb1VarX != null) {
                if ((tb1VarX.L.f.i & 262144) != 0) {
                    while (aq1Var != null) {
                        if ((aq1Var.h & 262144) != 0) {
                            aq1 aq1VarJ = aq1Var;
                            qs1 qs1Var = null;
                            while (aq1VarJ != null) {
                                if (aq1VarJ instanceof nk3) {
                                    if (xp0.t == ((nk3) aq1VarJ).K()) {
                                        return;
                                    }
                                }
                                if ((aq1VarJ.h & 262144) != 0 && (aq1VarJ instanceof ja0)) {
                                    int i = 0;
                                    for (aq1 aq1Var2 = ((ja0) aq1VarJ).u; aq1Var2 != null; aq1Var2 = aq1Var2.k) {
                                        if ((aq1Var2.h & 262144) != 0) {
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
    }

    public final void u1(qr1 qr1Var) {
        wo0 wo0Var;
        if (s51.n(this.v, qr1Var)) {
            return;
        }
        qr1 qr1Var2 = this.v;
        if (qr1Var2 != null && (wo0Var = this.x) != null) {
            qr1Var2.c(new xo0(wo0Var));
        }
        this.x = null;
        this.v = qr1Var;
    }
}
