package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class se0 extends ja0 implements jb2, y11, m20, ze0 {
    public ue0 A;
    public boolean B;
    public boolean C;
    public td0 D;
    public long E = 0;
    public bw0 F;
    public bw0 G;
    public wd0 H;
    public vd0 I;
    public ud0 J;
    public ur K;
    public op3 L;
    public vx0 M;
    public x11 N;
    public t02 v;
    public ns0 w;
    public boolean x;
    public qr1 y;
    public np z;

    public se0(ns0 ns0Var, boolean z, qr1 qr1Var, t02 t02Var) {
        this.v = t02Var;
        this.w = ns0Var;
        this.x = z;
        this.y = qr1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s1(defpackage.se0 r5, defpackage.q40 r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof defpackage.oe0
            if (r0 == 0) goto L13
            r0 = r6
            oe0 r0 = (defpackage.oe0) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            oe0 r0 = new oe0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.i
            int r1 = r0.k
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.y02.Q(r6)
            goto L47
        L26:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r5)
            return r2
        L2c:
            defpackage.y02.Q(r6)
            ue0 r6 = r5.A
            if (r6 == 0) goto L49
            qr1 r1 = r5.y
            if (r1 == 0) goto L47
            te0 r4 = new te0
            r4.<init>(r6)
            r0.k = r3
            java.lang.Object r6 = r1.b(r4, r0)
            y50 r0 = defpackage.y50.f
            if (r6 != r0) goto L47
            return r0
        L47:
            r5.A = r2
        L49:
            ae0 r6 = new ae0
            r0 = 0
            r2 = 0
            r6.<init>(r0, r2)
            r5.C1(r6)
            dm3 r5 = defpackage.dm3.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.se0.s1(se0, q40):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object t1(defpackage.se0 r6, defpackage.zd0 r7, defpackage.q40 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.pe0
            if (r0 == 0) goto L13
            r0 = r8
            pe0 r0 = (defpackage.pe0) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            pe0 r0 = new pe0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.k
            int r1 = r0.m
            r2 = 2
            r3 = 1
            y50 r4 = defpackage.y50.f
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2e
            ue0 r7 = r0.j
            zd0 r0 = r0.i
            defpackage.y02.Q(r8)
            goto L6e
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r6)
            r6 = 0
            return r6
        L35:
            zd0 r7 = r0.i
            defpackage.y02.Q(r8)
            goto L56
        L3b:
            defpackage.y02.Q(r8)
            ue0 r8 = r6.A
            if (r8 == 0) goto L56
            qr1 r1 = r6.y
            if (r1 == 0) goto L56
            te0 r5 = new te0
            r5.<init>(r8)
            r0.i = r7
            r0.m = r3
            java.lang.Object r8 = r1.b(r5, r0)
            if (r8 != r4) goto L56
            goto L6b
        L56:
            ue0 r8 = new ue0
            r8.<init>()
            qr1 r1 = r6.y
            if (r1 == 0) goto L70
            r0.i = r7
            r0.j = r8
            r0.m = r2
            java.lang.Object r0 = r1.b(r8, r0)
            if (r0 != r4) goto L6c
        L6b:
            return r4
        L6c:
            r0 = r7
            r7 = r8
        L6e:
            r8 = r7
            r7 = r0
        L70:
            r6.A = r8
            long r7 = r7.a
            r6.B1(r7)
            dm3 r6 = defpackage.dm3.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.se0.t1(se0, zd0, q40):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object u1(defpackage.se0 r5, defpackage.ae0 r6, defpackage.q40 r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof defpackage.qe0
            if (r0 == 0) goto L13
            r0 = r7
            qe0 r0 = (defpackage.qe0) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            qe0 r0 = new qe0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.j
            int r1 = r0.l
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            ae0 r6 = r0.i
            defpackage.y02.Q(r7)
            goto L4b
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r5)
            return r2
        L2e:
            defpackage.y02.Q(r7)
            ue0 r7 = r5.A
            if (r7 == 0) goto L4d
            qr1 r1 = r5.y
            if (r1 == 0) goto L4b
            ve0 r4 = new ve0
            r4.<init>(r7)
            r0.i = r6
            r0.l = r3
            java.lang.Object r7 = r1.b(r4, r0)
            y50 r0 = defpackage.y50.f
            if (r7 != r0) goto L4b
            return r0
        L4b:
            r5.A = r2
        L4d:
            r5.C1(r6)
            dm3 r5 = defpackage.dm3.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.se0.u1(se0, ae0, q40):java.lang.Object");
    }

    public static void z1(se0 se0Var, gb2 gb2Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        vd0 vd0Var = se0Var.I;
        if (vd0Var == null) {
            vd0Var = new vd0();
            vd0Var.d = null;
            vd0Var.e = Long.MAX_VALUE;
            vd0Var.f = false;
            se0Var.I = vd0Var;
        }
        vd0Var.d = gb2Var;
        vd0Var.e = j;
        vx0 vx0Var = se0Var.M;
        t02 t02Var = se0Var.v;
        if (vx0Var == null) {
            se0Var.M = new vx0(t02Var);
        } else {
            vx0Var.b = t02Var;
            vx0Var.a = j2;
        }
        vd0Var.f = false;
        se0Var.K = vd0Var;
    }

    public final void A1(be0 be0Var) {
        if ((be0Var instanceof zd0) && !this.B) {
            this.B = true;
            I1();
        }
        D1().l(be0Var);
    }

    public abstract void B1(long j);

    public abstract void C1(ae0 ae0Var);

    public final js D1() {
        np npVar = this.z;
        if (npVar != null) {
            return npVar;
        }
        c.p("Events channel not initialized.");
        return null;
    }

    @Override // defpackage.ze0
    public final t02 E() {
        return this.v;
    }

    public final op3 E1() {
        op3 op3Var = this.L;
        if (op3Var != null) {
            return op3Var;
        }
        c.p("Velocity Tracker not initialized.");
        return null;
    }

    public final void F1(long j, gb2 gb2Var) {
        this.E = gy1.e(this.E, j);
        n32.g(E1(), gb2Var);
        D1().l(new yd0(j, false));
    }

    public final void G1(gb2 gb2Var, gb2 gb2Var2, long j) {
        if (this.L == null) {
            this.L = new op3();
        }
        n32.g(E1(), gb2Var);
        long jD = gy1.d(gb2Var2.c, j);
        if (((Boolean) this.w.h(new ob2(gb2Var.i))).booleanValue()) {
            if (!this.B) {
                if (this.z == null) {
                    this.z = lr.a(Integer.MAX_VALUE, 6, null);
                }
                I1();
            }
            D1().l(new zd0(jD));
        }
    }

    public abstract boolean H1();

    public final void I1() {
        this.B = true;
        if (this.z == null) {
            this.z = lr.a(Integer.MAX_VALUE, 6, null);
        }
        cl3.t(d1(), null, new re0(this, null), 3);
    }

    public final void J1(ns0 ns0Var, boolean z, qr1 qr1Var, t02 t02Var, boolean z2) {
        this.w = ns0Var;
        boolean z3 = true;
        if (this.x != z) {
            this.x = z;
            if (!z) {
                bw0 bw0Var = this.G;
                if (bw0Var != null) {
                    q1(bw0Var);
                }
                bw0 bw0Var2 = this.F;
                if (bw0Var2 != null) {
                    q1(bw0Var2);
                }
                this.G = null;
                this.F = null;
                v1();
                this.N = null;
            }
            z2 = true;
        }
        if (!s51.n(this.y, qr1Var)) {
            v1();
            this.y = qr1Var;
        }
        if (this.v != t02Var) {
            this.v = t02Var;
        } else {
            z3 = z2;
        }
        if (z3) {
            boolean z4 = this.C;
            xd0 xd0Var = xd0.a;
            if (z4) {
                x1();
                if (this.B) {
                    D1().l(xd0Var);
                }
                this.L = null;
            }
            x11 x11Var = this.N;
            if (x11Var != null) {
                x11Var.a();
                se0 se0Var = x11Var.f;
                if (se0Var.B) {
                    se0Var.A1(xd0Var);
                }
                x11Var.l = null;
                s4 s4Var = x11Var.o;
                s4Var.a = 0;
                ((rr1) s4Var.b).b = 0;
            }
        }
    }

    @Override // defpackage.jb2
    public final void L0() {
        if (this.C) {
            x1();
            if (this.B) {
                D1().l(xd0.a);
            }
            this.L = null;
        }
        this.C = false;
    }

    @Override // defpackage.y11
    public final void V() {
        x11 x11Var = this.N;
        if (x11Var != null) {
            x11Var.a();
            se0 se0Var = x11Var.f;
            if (se0Var.B) {
                se0Var.A1(xd0.a);
            }
            x11Var.l = null;
            s4 s4Var = x11Var.o;
            s4Var.a = 0;
            ((rr1) s4Var.b).b = 0;
        }
    }

    @Override // defpackage.aw0
    public final String V0() {
        if (!this.x) {
            return "idle";
        }
        ur urVar = this.K;
        return urVar instanceof td0 ? ((td0) urVar).f ? "waiting" : "idle" : ((urVar instanceof vd0) || (urVar instanceof ud0)) ? "waiting" : urVar instanceof wd0 ? "recognized" : "idle";
    }

    @Override // defpackage.y11
    public final void c0(h9 h9Var, ab2 ab2Var) {
        Object obj;
        Object obj2;
        char c;
        long j;
        float f;
        float fIntBitsToFloat;
        x11 x11Var;
        Object obj3;
        ab2 ab2Var2;
        x11 x11Var2;
        Object obj4;
        Object obj5;
        int i = h9Var.b;
        ArrayList arrayList = (ArrayList) h9Var.c;
        if (this.x) {
            if (this.N == null) {
                this.N = new x11(this);
            }
            if (this.G == null) {
                x11 x11Var3 = this.N;
                x11Var3.getClass();
                bw0 bw0Var = new bw0(x11Var3);
                p1(bw0Var);
                this.G = bw0Var;
            }
            x11 x11Var4 = this.N;
            if (x11Var4 != null) {
                se0 se0Var = x11Var4.f;
                if (x11Var4.k == null) {
                    s11 s11Var = x11Var4.g;
                    if (s11Var == null) {
                        s11Var = new s11();
                        s11Var.k = r11.h;
                        s11Var.l = false;
                        s11Var.m = false;
                        x11Var4.g = s11Var;
                    }
                    x11Var4.k = s11Var;
                }
                br brVar = x11Var4.k;
                if (brVar == null) {
                    c.p("currentDragState should not be null");
                    return;
                }
                boolean z = brVar instanceof s11;
                ab2 ab2Var3 = ab2.f;
                boolean z2 = true;
                ab2 ab2Var4 = ab2.g;
                if (z) {
                    s11 s11Var2 = (s11) brVar;
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (!lr.q((q11) arrayList.get(i2))) {
                            return;
                        }
                    }
                    q11 q11Var = (q11) qx.q0(arrayList);
                    int i3 = w11.a[s11Var2.k.ordinal()];
                    r11 r11Var = r11.g;
                    r11 r11Var2 = r11.f;
                    r11 r11Var3 = i3 == 1 ? !se0Var.H1() ? r11Var2 : r11Var : s11Var2.k;
                    s11Var2.k = r11Var3;
                    if (ab2Var == ab2Var3) {
                        if (r11Var3 == r11Var) {
                            q11Var.i = true;
                            s11Var2.l = true;
                        }
                        s11Var2.m = true;
                    }
                    if (ab2Var == ab2Var4) {
                        if (r11Var3 == r11Var2) {
                            x11.c(x11Var4, q11Var, q11Var.a, 0L, 12);
                            return;
                        }
                        if (s11Var2.l) {
                            x11Var4.f(q11Var, q11Var, new p11(i), 0L);
                            x11Var4.e(q11Var, new p11(i), 0L);
                            long j2 = q11Var.a;
                            v11 v11Var = x11Var4.h;
                            if (v11Var == null) {
                                v11Var = new v11();
                                v11Var.k = Long.MAX_VALUE;
                                x11Var4.h = v11Var;
                            }
                            v11Var.k = j2;
                            x11Var4.k = v11Var;
                            return;
                        }
                        return;
                    }
                    return;
                }
                boolean z3 = brVar instanceof u11;
                ab2 ab2Var5 = ab2.h;
                if (z3) {
                    u11 u11Var = (u11) brVar;
                    if (ab2Var == ab2Var3) {
                        return;
                    }
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size2) {
                            x11Var = x11Var4;
                            obj3 = null;
                            break;
                        }
                        obj3 = arrayList.get(i4);
                        x11Var = x11Var4;
                        if (d32.l(((q11) obj3).a, u11Var.l)) {
                            break;
                        }
                        i4++;
                        x11Var4 = x11Var;
                    }
                    q11 q11Var2 = (q11) obj3;
                    if (q11Var2 == null) {
                        int size3 = arrayList.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= size3) {
                                obj5 = null;
                                break;
                            }
                            obj5 = arrayList.get(i5);
                            if (((q11) obj5).d) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                        q11Var2 = (q11) obj5;
                        if (q11Var2 == null) {
                            x11Var.a();
                            return;
                        }
                        u11Var.l = q11Var2.a;
                    }
                    q11 q11Var3 = q11Var2;
                    if (ab2Var != ab2Var4) {
                        ab2Var2 = ab2Var5;
                        x11Var2 = x11Var;
                    } else if (q11Var3.i) {
                        ab2Var2 = ab2Var5;
                        x11Var2 = x11Var;
                        q11 q11Var4 = u11Var.k;
                        if (q11Var4 == null) {
                            c.p("AwaitTouchSlop.initialDown was not initialized");
                            return;
                        }
                        long j3 = u11Var.l;
                        vx0 vx0Var = x11Var2.m;
                        if (vx0Var == null) {
                            c.p("AwaitTouchSlop.touchSlopDetector was not initialized");
                            return;
                        }
                        x11Var2.b(q11Var4, j3, vx0Var);
                    } else if (lr.i(q11Var3)) {
                        int size4 = arrayList.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size4) {
                                obj4 = null;
                                break;
                            }
                            Object obj6 = arrayList.get(i6);
                            if (((q11) obj6).d) {
                                obj4 = obj6;
                                break;
                            }
                            i6++;
                        }
                        q11 q11Var5 = (q11) obj4;
                        if (q11Var5 == null) {
                            x11Var.a();
                        } else {
                            u11Var.l = q11Var5.a;
                        }
                        ab2Var2 = ab2Var5;
                        x11Var2 = x11Var;
                    } else {
                        oq3 oq3Var = (oq3) ur.z(se0Var, s20.t);
                        float f2 = le0.a;
                        float fD = oq3Var.d();
                        x11Var2 = x11Var;
                        vx0 vx0Var2 = x11Var2.m;
                        if (vx0Var2 == null) {
                            c.p("Touch slop detector not initialized.");
                            return;
                        }
                        long jA = vx0.a(vx0Var2, lr.N(q11Var3, se0Var.v, new p11(i), true), fD);
                        if ((9223372034707292159L & jA) != 9205357640488583168L) {
                            q11Var3.i = true;
                            q11 q11Var6 = u11Var.k;
                            q11Var6.getClass();
                            ab2Var2 = ab2Var5;
                            x11Var2.f(q11Var6, q11Var3, new p11(i), jA);
                            x11Var2.e(q11Var3, new p11(i), jA);
                            long j4 = q11Var3.a;
                            v11 v11Var2 = x11Var2.h;
                            if (v11Var2 == null) {
                                v11Var2 = new v11();
                                v11Var2.k = Long.MAX_VALUE;
                                x11Var2.h = v11Var2;
                            }
                            v11Var2.k = j4;
                            x11Var2.k = v11Var2;
                        } else {
                            ab2Var2 = ab2Var5;
                            u11Var.m = true;
                        }
                    }
                    if (ab2Var == ab2Var2 && u11Var.m) {
                        if (!q11Var3.i) {
                            u11Var.m = false;
                            return;
                        }
                        q11 q11Var7 = u11Var.k;
                        if (q11Var7 == null) {
                            c.p("AwaitTouchSlop.initialDown was not initialized");
                            return;
                        }
                        long j5 = u11Var.l;
                        vx0 vx0Var3 = x11Var2.m;
                        if (vx0Var3 != null) {
                            x11Var2.b(q11Var7, j5, vx0Var3);
                            return;
                        } else {
                            c.p("AwaitTouchSlop.touchSlopDetector was not initialized");
                            return;
                        }
                    }
                    return;
                }
                if (brVar instanceof t11) {
                    t11 t11Var = (t11) brVar;
                    if (ab2Var != ab2Var5) {
                        return;
                    }
                    int size5 = arrayList.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size5) {
                            break;
                        }
                        if (((q11) arrayList.get(i7)).i) {
                            z2 = false;
                            break;
                        }
                        i7++;
                    }
                    int size6 = arrayList.size();
                    int i8 = 0;
                    while (true) {
                        if (i8 >= size6) {
                            break;
                        }
                        if (!((q11) arrayList.get(i8)).d) {
                            i8++;
                        } else if (!arrayList.isEmpty()) {
                            if (z2) {
                                long jO = lr.O((q11) qx.q0(arrayList), se0Var.v, new p11(i));
                                q11 q11Var8 = t11Var.k;
                                q11Var8.getClass();
                                long jD = gy1.d(jO, lr.O(q11Var8, se0Var.v, new p11(i)));
                                q11 q11Var9 = t11Var.k;
                                if (q11Var9 != null) {
                                    x11.c(x11Var4, q11Var9, t11Var.l, jD, 8);
                                    return;
                                } else {
                                    c.p("AwaitGesturePickup.initialDown was not initialized.");
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    x11Var4.a();
                    return;
                }
                if (!(brVar instanceof v11)) {
                    c.k();
                    return;
                }
                v11 v11Var3 = (v11) brVar;
                if (ab2Var != ab2Var4) {
                    return;
                }
                long j6 = v11Var3.k;
                int size7 = arrayList.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size7) {
                        obj = null;
                        break;
                    }
                    obj = arrayList.get(i9);
                    if (d32.l(((q11) obj).a, j6)) {
                        break;
                    } else {
                        i9++;
                    }
                }
                q11 q11Var10 = (q11) obj;
                if (q11Var10 == null) {
                    return;
                }
                long j7 = q11Var10.c;
                boolean zI = lr.i(q11Var10);
                xd0 xd0Var = xd0.a;
                if (!zI) {
                    if (q11Var10.i) {
                        se0Var.A1(xd0Var);
                        return;
                    } else {
                        if (gy1.c(lr.N(q11Var10, se0Var.v, new p11(i), true)) == 0.0f) {
                            return;
                        }
                        x11Var4.e(q11Var10, new p11(i), lr.N(q11Var10, se0Var.v, new p11(i), false));
                        q11Var10.i = true;
                        return;
                    }
                }
                int size8 = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size8) {
                        obj2 = null;
                        break;
                    }
                    obj2 = arrayList.get(i10);
                    if (((q11) obj2).d) {
                        break;
                    } else {
                        i10++;
                    }
                }
                q11 q11Var11 = (q11) obj2;
                if (q11Var11 != null) {
                    v11Var3.k = q11Var11.a;
                    return;
                }
                if (q11Var10.i || !lr.i(q11Var10)) {
                    se0Var.A1(xd0Var);
                } else {
                    op3 op3VarD = x11Var4.d();
                    t02 t02Var = se0Var.v;
                    s4 s4Var = x11Var4.n;
                    as1 as1Var = (as1) s4Var.b;
                    char c2 = ' ';
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j7 >> 32));
                    long j8 = 4294967295L;
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j7 & 4294967295L));
                    if (lr.q(q11Var10)) {
                        s4Var.a = 0;
                        as1Var.e();
                    }
                    if (lr.i(q11Var10) || lr.q(q11Var10)) {
                        c = ' ';
                        j = 4294967295L;
                        f = 0.0f;
                    } else {
                        if (as1Var.b == 3) {
                            int i11 = s4Var.a;
                            s4Var.a = i11 + 1;
                            as1Var.o(i11, q11Var10);
                        } else {
                            as1Var.b(q11Var10);
                        }
                        if (s4Var.a == 3) {
                            s4Var.a = 0;
                        }
                        Object[] objArr = as1Var.a;
                        int i12 = as1Var.b;
                        int i13 = 0;
                        float fIntBitsToFloat4 = 0.0f;
                        while (i13 < i12) {
                            char c3 = c2;
                            fIntBitsToFloat4 = Float.intBitsToFloat((int) (((q11) objArr[i13]).c >> c3)) + fIntBitsToFloat4;
                            i13++;
                            c2 = c3;
                        }
                        c = c2;
                        f = 0.0f;
                        int i14 = as1Var.b;
                        fIntBitsToFloat2 = fIntBitsToFloat4 / i14;
                        Object[] objArr2 = as1Var.a;
                        float fIntBitsToFloat5 = 0.0f;
                        int i15 = 0;
                        while (i15 < i14) {
                            long j9 = j8;
                            fIntBitsToFloat5 += Float.intBitsToFloat((int) (((q11) objArr2[i15]).c & j9));
                            i15++;
                            j8 = j9;
                        }
                        j = j8;
                        fIntBitsToFloat3 = fIntBitsToFloat5 / as1Var.b;
                    }
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << c) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & j);
                    if (t02Var != null) {
                        if (i == 1) {
                            fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> c));
                        } else if (i == 2) {
                            fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & j));
                        }
                        jFloatToRawIntBits = t02Var == t02.g ? (((long) Float.floatToRawIntBits(f)) & j) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << c) : (((long) Float.floatToRawIntBits(f)) << c) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j);
                    }
                    ((ol1) op3VarD.a).a(q11Var10.b, jFloatToRawIntBits);
                    float fA = ((oq3) ur.z(se0Var, s20.t)).a();
                    long jA2 = x11Var4.d().a(d32.h(fA, fA));
                    ol1 ol1Var = (ol1) x11Var4.d().a;
                    np3 np3Var = ol1Var.a;
                    d70[] d70VarArr = np3Var.d;
                    uj.O(0, d70VarArr.length, null, d70VarArr);
                    np3Var.e = 0;
                    np3 np3Var2 = ol1Var.b;
                    d70[] d70VarArr2 = np3Var2.d;
                    uj.O(0, d70VarArr2.length, null, d70VarArr2);
                    np3Var2.e = 0;
                    ol1Var.c = 0L;
                    se0Var.A1(new ae0(bf0.b(jA2), true));
                }
                x11Var4.a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i0(defpackage.za2 r17, defpackage.ab2 r18, long r19) {
        /*
            Method dump skipped, instruction units count: 959
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.se0.i0(za2, ab2, long):void");
    }

    @Override // defpackage.aq1
    public final void i1() {
        this.B = false;
        v1();
        bw0 bw0Var = this.G;
        if (bw0Var != null) {
            q1(bw0Var);
        }
        bw0 bw0Var2 = this.F;
        if (bw0Var2 != null) {
            q1(bw0Var2);
        }
        this.G = null;
        this.F = null;
    }

    public final void v1() {
        ue0 ue0Var = this.A;
        if (ue0Var != null) {
            qr1 qr1Var = this.y;
            if (qr1Var != null) {
                qr1Var.c(new te0(ue0Var));
            }
            this.A = null;
        }
    }

    public abstract Object w1(re0 re0Var, re0 re0Var2);

    public final void x1() {
        this.E = 0L;
        td0 td0Var = this.D;
        sd0 sd0Var = sd0.h;
        if (td0Var == null) {
            td0Var = new td0();
            td0Var.d = sd0Var;
            td0Var.e = false;
            td0Var.f = false;
            this.D = td0Var;
        }
        td0Var.d = sd0Var;
        td0Var.e = false;
        td0Var.f = false;
        this.K = td0Var;
    }

    public final void y1(gb2 gb2Var, long j, vx0 vx0Var) {
        ud0 ud0Var = this.J;
        if (ud0Var == null) {
            ud0Var = new ud0();
            ud0Var.d = null;
            ud0Var.e = Long.MAX_VALUE;
            this.J = ud0Var;
        }
        ud0Var.d = gb2Var;
        ud0Var.e = j;
        vx0Var.a = 0L;
        this.K = ud0Var;
    }
}
