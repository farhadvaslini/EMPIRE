package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class kw1 extends aq1 implements nk3, dw1 {
    public dw1 t;
    public gw1 u;
    public kw1 v;
    public final String w;

    public kw1(dw1 dw1Var, gw1 gw1Var) {
        this.t = dw1Var;
        this.u = gw1Var == null ? new gw1() : gw1Var;
        this.w = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (r9 == r5) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dw1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object G0(long j, p40 p40Var) {
        jw1 jw1Var;
        long j2;
        long j3;
        if (p40Var instanceof jw1) {
            jw1Var = (jw1) p40Var;
            int i = jw1Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                jw1Var.l = i - Integer.MIN_VALUE;
            } else {
                jw1Var = new jw1(this, (q40) p40Var);
            }
        }
        Object objG0 = jw1Var.j;
        int i2 = jw1Var.l;
        y50 y50Var = y50.f;
        if (i2 == 0) {
            y02.Q(objG0);
            kw1 kw1VarQ1 = this.s ? q1() : null;
            if (kw1VarQ1 == null) {
                j2 = 0;
                dw1 dw1Var = this.t;
                long jD = lp3.d(j, j2);
                jw1Var.i = j2;
                jw1Var.l = 2;
                objG0 = dw1Var.G0(jD, jw1Var);
                if (objG0 != y50Var) {
                    j3 = j2;
                    return new lp3(lp3.e(j3, ((lp3) objG0).a));
                }
                return y50Var;
            }
            jw1Var.i = j;
            jw1Var.l = 1;
            objG0 = kw1VarQ1.G0(j, jw1Var);
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j3 = jw1Var.i;
                y02.Q(objG0);
                return new lp3(lp3.e(j3, ((lp3) objG0).a));
            }
            j = jw1Var.i;
            y02.Q(objG0);
        }
        j2 = ((lp3) objG0).a;
        dw1 dw1Var2 = this.t;
        long jD2 = lp3.d(j, j2);
        jw1Var.i = j2;
        jw1Var.l = 2;
        objG0 = dw1Var2.G0(jD2, jw1Var);
        if (objG0 != y50Var) {
        }
        return y50Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @Override // defpackage.dw1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object J0(long j, long j2, p40 p40Var) {
        iw1 iw1Var;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        if (p40Var instanceof iw1) {
            iw1Var = (iw1) p40Var;
            int i = iw1Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                iw1Var.m = i - Integer.MIN_VALUE;
            } else {
                iw1Var = new iw1(this, (q40) p40Var);
            }
        }
        iw1 iw1Var2 = iw1Var;
        Object objJ0 = iw1Var2.k;
        int i2 = iw1Var2.m;
        kw1 kw1VarQ1 = null;
        y50 y50Var = y50.f;
        if (i2 == 0) {
            y02.Q(objJ0);
            dw1 dw1Var = this.t;
            iw1Var2.i = j;
            iw1Var2.j = j2;
            iw1Var2.m = 1;
            objJ0 = dw1Var.J0(j, j2, iw1Var2);
            if (objJ0 != y50Var) {
                j3 = j;
                j4 = j2;
            }
            return y50Var;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j7 = iw1Var2.i;
            y02.Q(objJ0);
            j6 = ((lp3) objJ0).a;
            j5 = j7;
            return new lp3(lp3.e(j5, j6));
        }
        j4 = iw1Var2.j;
        j3 = iw1Var2.i;
        y02.Q(objJ0);
        j5 = ((lp3) objJ0).a;
        boolean z = this.s;
        if (!z) {
            kw1VarQ1 = this.v;
        } else if (z) {
            kw1VarQ1 = q1();
        }
        if (kw1VarQ1 == null) {
            j6 = 0;
            return new lp3(lp3.e(j5, j6));
        }
        long jE = lp3.e(j3, j5);
        long jD = lp3.d(j4, j5);
        iw1Var2.i = j5;
        iw1Var2.m = 2;
        objJ0 = kw1VarQ1.J0(jE, jD, iw1Var2);
        if (objJ0 != y50Var) {
            j7 = j5;
            j6 = ((lp3) objJ0).a;
            j5 = j7;
            return new lp3(lp3.e(j5, j6));
        }
        return y50Var;
    }

    @Override // defpackage.nk3
    public final Object K() {
        return this.w;
    }

    @Override // defpackage.dw1
    public final long Q0(int i, long j) {
        kw1 kw1VarQ1 = this.s ? q1() : null;
        long jQ0 = kw1VarQ1 != null ? kw1VarQ1.Q0(i, j) : 0L;
        return gy1.e(jQ0, this.t.Q0(i, gy1.d(j, jQ0)));
    }

    @Override // defpackage.aq1
    public final void h1() {
        gw1 gw1Var = this.u;
        gw1Var.a = this;
        gw1Var.b = null;
        this.v = null;
        gw1Var.c = new it1(3, this);
        gw1Var.d = d1();
    }

    @Override // defpackage.aq1
    public final void i1() {
        qk2 qk2Var = new qk2();
        n32.C(this, new t6(4, qk2Var));
        kw1 kw1Var = (kw1) ((nk3) qk2Var.f);
        this.v = kw1Var;
        gw1 gw1Var = this.u;
        gw1Var.b = kw1Var;
        if (gw1Var.a == this) {
            gw1Var.a = null;
            gw1Var.d = null;
            gw1Var.c = s51.x;
        }
    }

    @Override // defpackage.dw1
    public final long l0(long j, int i, long j2) {
        long jL0 = this.t.l0(j, i, j2);
        kw1 kw1VarQ1 = this.s ? q1() : null;
        return gy1.e(jL0, kw1VarQ1 != null ? kw1VarQ1.l0(gy1.e(j, jL0), i, gy1.d(j2, jL0)) : 0L);
    }

    public final x50 p1() {
        kw1 kw1VarQ1 = q1();
        x50 x50VarP1 = kw1VarQ1 != null ? kw1VarQ1.p1() : null;
        if (x50VarP1 != null && ur.H(x50VarP1)) {
            return x50VarP1;
        }
        x50 x50Var = this.u.d;
        if (x50Var != null) {
            return x50Var;
        }
        c.q("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    public final kw1 q1() {
        ax1 ax1Var;
        nk3 nk3Var = null;
        if (!this.s) {
            return null;
        }
        if (!this.f.s) {
            m21.c("visitAncestors called on an unattached node");
        }
        aq1 aq1Var = this.f.j;
        tb1 tb1VarX = vr.X(this);
        loop0: while (true) {
            if (tb1VarX == null) {
                break;
            }
            if ((tb1VarX.L.f.i & 262144) != 0) {
                while (aq1Var != null) {
                    if ((aq1Var.h & 262144) != 0) {
                        aq1 aq1VarJ = aq1Var;
                        qs1 qs1Var = null;
                        while (aq1VarJ != null) {
                            if (aq1VarJ instanceof nk3) {
                                nk3 nk3Var2 = (nk3) aq1VarJ;
                                if (s51.n(this.w, nk3Var2.K()) && kw1.class == nk3Var2.getClass()) {
                                    nk3Var = nk3Var2;
                                    break loop0;
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
        return (kw1) nk3Var;
    }
}
