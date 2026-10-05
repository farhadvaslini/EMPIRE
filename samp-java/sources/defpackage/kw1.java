package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G0(long r7, defpackage.p40 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.jw1
            if (r0 == 0) goto L13
            r0 = r9
            jw1 r0 = (defpackage.jw1) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L1a
        L13:
            jw1 r0 = new jw1
            q40 r9 = (defpackage.q40) r9
            r0.<init>(r6, r9)
        L1a:
            java.lang.Object r9 = r0.j
            int r1 = r0.l
            r2 = 0
            r3 = 2
            r4 = 1
            y50 r5 = defpackage.y50.f
            if (r1 == 0) goto L3b
            if (r1 == r4) goto L35
            if (r1 != r3) goto L2f
            long r6 = r0.i
            defpackage.y02.Q(r9)
            goto L6c
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r6)
            return r2
        L35:
            long r7 = r0.i
            defpackage.y02.Q(r9)
            goto L53
        L3b:
            defpackage.y02.Q(r9)
            boolean r9 = r6.s
            if (r9 == 0) goto L46
            kw1 r2 = r6.q1()
        L46:
            if (r2 == 0) goto L58
            r0.i = r7
            r0.l = r4
            java.lang.Object r9 = r2.G0(r7, r0)
            if (r9 != r5) goto L53
            goto L6a
        L53:
            lp3 r9 = (defpackage.lp3) r9
            long r1 = r9.a
            goto L5a
        L58:
            r1 = 0
        L5a:
            dw1 r6 = r6.t
            long r7 = defpackage.lp3.d(r7, r1)
            r0.i = r1
            r0.l = r3
            java.lang.Object r9 = r6.G0(r7, r0)
            if (r9 != r5) goto L6b
        L6a:
            return r5
        L6b:
            r6 = r1
        L6c:
            lp3 r9 = (defpackage.lp3) r9
            long r8 = r9.a
            long r6 = defpackage.lp3.e(r6, r8)
            lp3 r8 = new lp3
            r8.<init>(r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kw1.G0(long, p40):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @Override // defpackage.dw1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J0(long r13, long r15, defpackage.p40 r17) {
        /*
            r12 = this;
            r1 = r17
            boolean r2 = r1 instanceof defpackage.iw1
            if (r2 == 0) goto L16
            r2 = r1
            iw1 r2 = (defpackage.iw1) r2
            int r3 = r2.m
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.m = r3
        L14:
            r8 = r2
            goto L1e
        L16:
            iw1 r2 = new iw1
            q40 r1 = (defpackage.q40) r1
            r2.<init>(r12, r1)
            goto L14
        L1e:
            java.lang.Object r1 = r8.k
            int r2 = r8.m
            r9 = 0
            r10 = 2
            r3 = 1
            y50 r11 = defpackage.y50.f
            if (r2 == 0) goto L41
            if (r2 == r3) goto L39
            if (r2 != r10) goto L33
            long r2 = r8.i
            defpackage.y02.Q(r1)
            goto L84
        L33:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r0)
            return r9
        L39:
            long r2 = r8.j
            long r4 = r8.i
            defpackage.y02.Q(r1)
            goto L58
        L41:
            defpackage.y02.Q(r1)
            dw1 r1 = r12.t
            r8.i = r13
            r6 = r15
            r8.j = r6
            r8.m = r3
            r4 = r13
            r3 = r1
            java.lang.Object r1 = r3.J0(r4, r6, r8)
            if (r1 != r11) goto L56
            goto L82
        L56:
            r4 = r13
            r2 = r15
        L58:
            lp3 r1 = (defpackage.lp3) r1
            long r6 = r1.a
            boolean r1 = r12.s
            if (r1 == 0) goto L67
            if (r1 == 0) goto L69
            kw1 r9 = r12.q1()
            goto L69
        L67:
            kw1 r9 = r12.v
        L69:
            if (r9 == 0) goto L8a
            long r0 = defpackage.lp3.e(r4, r6)
            long r2 = defpackage.lp3.d(r2, r6)
            r8.i = r6
            r8.m = r10
            r13 = r0
            r15 = r2
            r17 = r8
            r12 = r9
            java.lang.Object r1 = r12.J0(r13, r15, r17)
            if (r1 != r11) goto L83
        L82:
            return r11
        L83:
            r2 = r6
        L84:
            lp3 r1 = (defpackage.lp3) r1
            long r0 = r1.a
            r6 = r2
            goto L8c
        L8a:
            r0 = 0
        L8c:
            long r0 = defpackage.lp3.e(r6, r0)
            lp3 r2 = new lp3
            r2.<init>(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kw1.J0(long, long, p40):java.lang.Object");
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
