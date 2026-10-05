package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class it2 extends u10 {
    public static final qe s = new qe(0.0f);
    public static final qe t = new qe(1.0f);
    public final d42 b;
    public final d42 c;
    public Object d;
    public gk3 e;
    public long f;
    public final it1 g;
    public p73 h;
    public final z32 i;
    public jr j;
    public final dt1 k;
    public final at1 l;
    public long m;
    public final as1 n;
    public bt2 o;
    public final at2 p;
    public float q;
    public final at2 r;

    /* JADX WARN: Type inference failed for: r3v6, types: [at2] */
    /* JADX WARN: Type inference failed for: r3v7, types: [at2] */
    public it2(qt1 qt1Var) {
        super(3);
        this.b = b32.w(qt1Var);
        this.c = b32.w(qt1Var);
        this.d = qt1Var;
        this.g = new it1(16, this);
        this.i = new z32(0.0f);
        this.k = new dt1();
        this.l = new at1();
        this.m = Long.MIN_VALUE;
        this.n = new as1();
        final int i = 0;
        this.p = new ns0(this) { // from class: at2
            public final /* synthetic */ it2 g;

            {
                this.g = this;
            }

            @Override // defpackage.ns0
            public final Object h(Object obj) {
                int i2 = i;
                dm3 dm3Var = dm3.a;
                it2 it2Var = this.g;
                long jLongValue = ((Long) obj).longValue();
                switch (i2) {
                    case 0:
                        it2Var.m = jLongValue;
                        break;
                    default:
                        long j = jLongValue - it2Var.m;
                        it2Var.m = jLongValue;
                        long jN = vm1.N(j / ((double) it2Var.q));
                        as1 as1Var = it2Var.n;
                        if (as1Var.j()) {
                            Object[] objArr = as1Var.a;
                            int i3 = as1Var.b;
                            int i4 = 0;
                            for (int i5 = 0; i5 < i3; i5++) {
                                bt2 bt2Var = (bt2) objArr[i5];
                                it2.v(bt2Var, jN);
                                bt2Var.c = true;
                            }
                            gk3 gk3Var = it2Var.e;
                            if (gk3Var != null) {
                                gk3Var.p();
                            }
                            int i6 = as1Var.b;
                            Object[] objArr2 = as1Var.a;
                            l41 l41VarS = y02.S(0, i6);
                            int i7 = l41VarS.f;
                            int i8 = l41VarS.g;
                            if (i7 <= i8) {
                                while (true) {
                                    objArr2[i7 - i4] = objArr2[i7];
                                    if (((bt2) objArr2[i7]).c) {
                                        i4++;
                                    }
                                    if (i7 != i8) {
                                        i7++;
                                    }
                                }
                            }
                            uj.O(i6 - i4, i6, null, objArr2);
                            as1Var.b -= i4;
                        }
                        bt2 bt2Var2 = it2Var.o;
                        if (bt2Var2 != null) {
                            bt2Var2.g = it2Var.f;
                            it2.v(bt2Var2, jN);
                            it2Var.y(bt2Var2.d);
                            if (bt2Var2.d == 1.0f) {
                                it2Var.o = null;
                            }
                            it2Var.x();
                        }
                        break;
                }
                return dm3Var;
            }
        };
        final int i2 = 1;
        this.r = new ns0(this) { // from class: at2
            public final /* synthetic */ it2 g;

            {
                this.g = this;
            }

            @Override // defpackage.ns0
            public final Object h(Object obj) {
                int i22 = i2;
                dm3 dm3Var = dm3.a;
                it2 it2Var = this.g;
                long jLongValue = ((Long) obj).longValue();
                switch (i22) {
                    case 0:
                        it2Var.m = jLongValue;
                        break;
                    default:
                        long j = jLongValue - it2Var.m;
                        it2Var.m = jLongValue;
                        long jN = vm1.N(j / ((double) it2Var.q));
                        as1 as1Var = it2Var.n;
                        if (as1Var.j()) {
                            Object[] objArr = as1Var.a;
                            int i3 = as1Var.b;
                            int i4 = 0;
                            for (int i5 = 0; i5 < i3; i5++) {
                                bt2 bt2Var = (bt2) objArr[i5];
                                it2.v(bt2Var, jN);
                                bt2Var.c = true;
                            }
                            gk3 gk3Var = it2Var.e;
                            if (gk3Var != null) {
                                gk3Var.p();
                            }
                            int i6 = as1Var.b;
                            Object[] objArr2 = as1Var.a;
                            l41 l41VarS = y02.S(0, i6);
                            int i7 = l41VarS.f;
                            int i8 = l41VarS.g;
                            if (i7 <= i8) {
                                while (true) {
                                    objArr2[i7 - i4] = objArr2[i7];
                                    if (((bt2) objArr2[i7]).c) {
                                        i4++;
                                    }
                                    if (i7 != i8) {
                                        i7++;
                                    }
                                }
                            }
                            uj.O(i6 - i4, i6, null, objArr2);
                            as1Var.b -= i4;
                        }
                        bt2 bt2Var2 = it2Var.o;
                        if (bt2Var2 != null) {
                            bt2Var2.g = it2Var.f;
                            it2.v(bt2Var2, jN);
                            it2Var.y(bt2Var2.d);
                            if (bt2Var2.d == 1.0f) {
                                it2Var.o = null;
                            }
                            it2Var.x();
                        }
                        break;
                }
                return dm3Var;
            }
        };
    }

    public static final void p(it2 it2Var) {
        z32 z32Var = it2Var.i;
        gk3 gk3Var = it2Var.e;
        if (gk3Var == null) {
            return;
        }
        bt2 bt2Var = it2Var.o;
        if (bt2Var == null) {
            if (it2Var.f <= 0 || z32Var.g() == 1.0f || s51.n(it2Var.c.getValue(), it2Var.b.getValue())) {
                bt2Var = null;
            } else {
                bt2Var = new bt2();
                bt2Var.d = z32Var.g();
                long j = it2Var.f;
                bt2Var.g = j;
                bt2Var.h = vm1.N((1.0d - ((double) z32Var.g())) * j);
                bt2Var.e.e(z32Var.g(), 0);
            }
        }
        if (bt2Var != null) {
            bt2Var.g = it2Var.f;
            it2Var.n.b(bt2Var);
            gk3Var.m(bt2Var);
        }
        it2Var.o = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q(defpackage.it2 r10, defpackage.q40 r11) {
        /*
            as1 r0 = r10.n
            boolean r1 = r11 instanceof defpackage.dt2
            if (r1 == 0) goto L15
            r1 = r11
            dt2 r1 = (defpackage.dt2) r1
            int r2 = r1.k
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.k = r2
            goto L1a
        L15:
            dt2 r1 = new dt2
            r1.<init>(r10, r11)
        L1a:
            o50 r11 = r1.g
            java.lang.Object r2 = r1.i
            int r3 = r1.k
            r4 = 2
            r5 = 1
            r6 = -9223372036854775808
            dm3 r8 = defpackage.dm3.a
            y50 r9 = defpackage.y50.f
            if (r3 == 0) goto L3a
            if (r3 == r5) goto L36
            if (r3 != r4) goto L2f
            goto L36
        L2f:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r10)
            r10 = 0
            return r10
        L36:
            defpackage.y02.Q(r2)
            goto L72
        L3a:
            defpackage.y02.Q(r2)
            boolean r2 = r0.i()
            if (r2 == 0) goto L48
            bt2 r2 = r10.o
            if (r2 != 0) goto L48
            return r8
        L48:
            r11.getClass()
            float r2 = defpackage.t22.y(r11)
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L5a
            r10.u()
            r10.m = r6
            return r8
        L5a:
            long r2 = r10.m
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 != 0) goto L72
            at2 r2 = r10.p
            r1.k = r5
            r11.getClass()
            ic r11 = defpackage.lq.I(r11)
            java.lang.Object r11 = r11.a(r2, r1)
            if (r11 != r9) goto L72
            goto L88
        L72:
            boolean r11 = r0.j()
            if (r11 != 0) goto L80
            bt2 r11 = r10.o
            if (r11 == 0) goto L7d
            goto L80
        L7d:
            r10.m = r6
            return r8
        L80:
            r1.k = r4
            java.lang.Object r11 = r10.t(r1)
            if (r11 != r9) goto L72
        L88:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.it2.q(it2, q40):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object r(defpackage.it2 r8, defpackage.q40 r9) {
        /*
            dt1 r0 = r8.k
            boolean r1 = r9 instanceof defpackage.gt2
            if (r1 == 0) goto L15
            r1 = r9
            gt2 r1 = (defpackage.gt2) r1
            int r2 = r1.l
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.l = r2
            goto L1a
        L15:
            gt2 r1 = new gt2
            r1.<init>(r8, r9)
        L1a:
            java.lang.Object r9 = r1.j
            int r2 = r1.l
            r3 = 0
            r4 = 2
            r5 = 1
            y50 r6 = defpackage.y50.f
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2f
            java.lang.Object r0 = r1.i
            defpackage.y02.Q(r9)
            goto L6f
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r8)
            return r3
        L35:
            java.lang.Object r2 = r1.i
            defpackage.y02.Q(r9)
            r9 = r2
            goto L50
        L3c:
            defpackage.y02.Q(r9)
            d42 r9 = r8.b
            java.lang.Object r9 = r9.getValue()
            r1.i = r9
            r1.l = r5
            java.lang.Object r2 = r0.f(r1)
            if (r2 != r6) goto L50
            goto L6b
        L50:
            r1.i = r9
            r1.l = r4
            jr r2 = new jr
            p40 r1 = defpackage.vr.I(r1)
            r2.<init>(r5, r1)
            r2.s()
            r8.j = r2
            r0.i(r3)
            java.lang.Object r0 = r2.q()
            if (r0 != r6) goto L6c
        L6b:
            return r6
        L6c:
            r7 = r0
            r0 = r9
            r9 = r7
        L6f:
            boolean r9 = defpackage.s51.n(r9, r0)
            if (r9 == 0) goto L78
            dm3 r8 = defpackage.dm3.a
            return r8
        L78:
            r0 = -9223372036854775808
            r8.m = r0
            java.util.concurrent.CancellationException r8 = new java.util.concurrent.CancellationException
            java.lang.String r9 = "targetState while waiting for composition"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.it2.r(it2, q40):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s(defpackage.it2 r8, defpackage.q40 r9) {
        /*
            dt1 r0 = r8.k
            boolean r1 = r9 instanceof defpackage.ht2
            if (r1 == 0) goto L15
            r1 = r9
            ht2 r1 = (defpackage.ht2) r1
            int r2 = r1.l
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.l = r2
            goto L1a
        L15:
            ht2 r1 = new ht2
            r1.<init>(r8, r9)
        L1a:
            java.lang.Object r9 = r1.j
            int r2 = r1.l
            r3 = 0
            r4 = 2
            r5 = 1
            y50 r6 = defpackage.y50.f
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2f
            java.lang.Object r0 = r1.i
            defpackage.y02.Q(r9)
            goto L7b
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r8)
            return r3
        L35:
            java.lang.Object r2 = r1.i
            defpackage.y02.Q(r9)
            r9 = r2
            goto L50
        L3c:
            defpackage.y02.Q(r9)
            d42 r9 = r8.b
            java.lang.Object r9 = r9.getValue()
            r1.i = r9
            r1.l = r5
            java.lang.Object r2 = r0.f(r1)
            if (r2 != r6) goto L50
            goto L77
        L50:
            java.lang.Object r2 = r8.d
            boolean r2 = defpackage.s51.n(r9, r2)
            if (r2 == 0) goto L5c
            r0.i(r3)
            goto L81
        L5c:
            r1.i = r9
            r1.l = r4
            jr r2 = new jr
            p40 r1 = defpackage.vr.I(r1)
            r2.<init>(r5, r1)
            r2.s()
            r8.j = r2
            r0.i(r3)
            java.lang.Object r0 = r2.q()
            if (r0 != r6) goto L78
        L77:
            return r6
        L78:
            r7 = r0
            r0 = r9
            r9 = r7
        L7b:
            boolean r1 = defpackage.s51.n(r9, r0)
            if (r1 == 0) goto L84
        L81:
            dm3 r8 = defpackage.dm3.a
            return r8
        L84:
            r1 = -9223372036854775808
            r8.m = r1
            java.util.concurrent.CancellationException r8 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "snapTo() was canceled because state was changed to "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r9 = " instead of "
            r1.append(r9)
            r1.append(r0)
            java.lang.String r9 = r1.toString()
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.it2.s(it2, q40):java.lang.Object");
    }

    public static void v(bt2 bt2Var, long j) {
        long j2 = bt2Var.a + j;
        bt2Var.a = j2;
        long j3 = bt2Var.h;
        if (j2 >= j3) {
            bt2Var.d = 1.0f;
            return;
        }
        cp3 cp3Var = bt2Var.b;
        qe qeVar = bt2Var.e;
        if (cp3Var == null) {
            float f = j2 / j3;
            bt2Var.d = (f * 1.0f) + ((1.0f - f) * qeVar.a(0));
            return;
        }
        qe qeVar2 = bt2Var.f;
        if (qeVar2 == null) {
            qeVar2 = s;
        }
        bt2Var.d = y02.g(((qe) cp3Var.p(j2, qeVar, t, qeVar2)).a(0), 0.0f, 1.0f);
    }

    @Override // defpackage.u10
    public final Object h() {
        return this.c.getValue();
    }

    @Override // defpackage.u10
    public final Object i() {
        return this.b.getValue();
    }

    @Override // defpackage.u10
    public final void m(Object obj) {
        this.c.setValue(obj);
    }

    @Override // defpackage.u10
    public final void n(gk3 gk3Var) {
        gk3 gk3Var2 = this.e;
        if (gk3Var2 != null && !gk3Var.equals(gk3Var2)) {
            ac2.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.e + ", new instance: " + gk3Var);
        }
        this.e = gk3Var;
    }

    @Override // defpackage.u10
    public final void o() {
        this.e = null;
        p73 p73Var = this.h;
        if (p73Var != null) {
            p73Var.b(this);
        }
    }

    public final Object t(q40 q40Var) {
        float fY = t22.y(q40Var.i());
        dm3 dm3Var = dm3.a;
        if (fY <= 0.0f) {
            u();
            return dm3Var;
        }
        this.q = fY;
        Object objA = lq.I(q40Var.i()).a(this.r, q40Var);
        return objA == y50.f ? objA : dm3Var;
    }

    public final void u() {
        gk3 gk3Var = this.e;
        if (gk3Var != null) {
            gk3Var.c();
        }
        this.n.e();
        if (this.o != null) {
            this.o = null;
            y(1.0f);
            x();
        }
    }

    public final Object w(float f, Object obj, mb3 mb3Var) {
        if (0.0f > f || f > 1.0f) {
            ac2.a("Expecting fraction between 0 and 1. Got " + f);
        }
        gk3 gk3Var = this.e;
        if (gk3Var != null) {
            Object objA = at1.a(this.l, new ft2(obj, this.b.getValue(), this, gk3Var, f, null), mb3Var);
            if (objA == y50.f) {
                return objA;
            }
        }
        return dm3.a;
    }

    public final void x() {
        gk3 gk3Var = this.e;
        if (gk3Var == null) {
            return;
        }
        gk3Var.l(vm1.N(((double) this.i.g()) * ((Number) gk3Var.m.getValue()).longValue()));
    }

    public final void y(float f) {
        this.i.h(f);
    }

    public final void z(p73 p73Var) {
        b4 b4Var;
        if (s51.n(this.h, p73Var)) {
            return;
        }
        p73 p73Var2 = this.h;
        if (p73Var2 != null) {
            p73Var2.b(this);
        }
        p73 p73Var3 = this.h;
        if (p73Var3 != null && (b4Var = p73Var3.h) != null) {
            b4Var.b();
        }
        this.h = p73Var;
        if (p73Var != null) {
            p73Var.e();
        }
        p73 p73Var4 = this.h;
        if (p73Var4 != null) {
            p73Var4.d(this, w7.i0, this.g);
        }
    }
}
