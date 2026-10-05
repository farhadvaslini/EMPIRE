package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
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
    */
    public static final Object s1(se0 se0Var, q40 q40Var) throws Throwable {
        oe0 oe0Var;
        if (q40Var instanceof oe0) {
            oe0Var = (oe0) q40Var;
            int i = oe0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                oe0Var.k = i - Integer.MIN_VALUE;
            } else {
                oe0Var = new oe0(se0Var, q40Var);
            }
        }
        Object obj = oe0Var.i;
        int i2 = oe0Var.k;
        if (i2 == 0) {
            y02.Q(obj);
            ue0 ue0Var = se0Var.A;
            if (ue0Var != null) {
                qr1 qr1Var = se0Var.y;
                if (qr1Var != null) {
                    te0 te0Var = new te0(ue0Var);
                    oe0Var.k = 1;
                    Object objB = qr1Var.b(te0Var, oe0Var);
                    y50 y50Var = y50.f;
                    if (objB == y50Var) {
                        return y50Var;
                    }
                }
            }
            se0Var.C1(new ae0(0L, false));
            return dm3.a;
        }
        if (i2 != 1) {
            c.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y02.Q(obj);
        se0Var.A = null;
        se0Var.C1(new ae0(0L, false));
        return dm3.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object t1(se0 se0Var, zd0 zd0Var, q40 q40Var) {
        pe0 pe0Var;
        qr1 qr1Var;
        ue0 ue0Var;
        zd0 zd0Var2;
        ue0 ue0Var2;
        if (q40Var instanceof pe0) {
            pe0Var = (pe0) q40Var;
            int i = pe0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                pe0Var.m = i - Integer.MIN_VALUE;
            } else {
                pe0Var = new pe0(se0Var, q40Var);
            }
        }
        Object obj = pe0Var.k;
        int i2 = pe0Var.m;
        y50 y50Var = y50.f;
        if (i2 == 0) {
            y02.Q(obj);
            ue0 ue0Var3 = se0Var.A;
            if (ue0Var3 != null && (qr1Var = se0Var.y) != null) {
                te0 te0Var = new te0(ue0Var3);
                pe0Var.i = zd0Var;
                pe0Var.m = 1;
                if (qr1Var.b(te0Var, pe0Var) != y50Var) {
                }
                return y50Var;
            }
            se0Var.A = ue0Var;
            se0Var.B1(zd0Var.a);
            return dm3.a;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ue0Var2 = pe0Var.j;
            zd0Var2 = pe0Var.i;
            y02.Q(obj);
            ue0Var = ue0Var2;
            zd0Var = zd0Var2;
            se0Var.A = ue0Var;
            se0Var.B1(zd0Var.a);
            return dm3.a;
        }
        zd0Var = pe0Var.i;
        y02.Q(obj);
        ue0Var = new ue0();
        qr1 qr1Var2 = se0Var.y;
        if (qr1Var2 != null) {
            pe0Var.i = zd0Var;
            pe0Var.j = ue0Var;
            pe0Var.m = 2;
            if (qr1Var2.b(ue0Var, pe0Var) != y50Var) {
                zd0Var2 = zd0Var;
                ue0Var2 = ue0Var;
                ue0Var = ue0Var2;
                zd0Var = zd0Var2;
            }
            return y50Var;
        }
        se0Var.A = ue0Var;
        se0Var.B1(zd0Var.a);
        return dm3.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object u1(se0 se0Var, ae0 ae0Var, q40 q40Var) throws Throwable {
        qe0 qe0Var;
        if (q40Var instanceof qe0) {
            qe0Var = (qe0) q40Var;
            int i = qe0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                qe0Var.l = i - Integer.MIN_VALUE;
            } else {
                qe0Var = new qe0(se0Var, q40Var);
            }
        }
        Object obj = qe0Var.j;
        int i2 = qe0Var.l;
        if (i2 == 0) {
            y02.Q(obj);
            ue0 ue0Var = se0Var.A;
            if (ue0Var != null) {
                qr1 qr1Var = se0Var.y;
                if (qr1Var != null) {
                    ve0 ve0Var = new ve0(ue0Var);
                    qe0Var.i = ae0Var;
                    qe0Var.l = 1;
                    Object objB = qr1Var.b(ve0Var, qe0Var);
                    y50 y50Var = y50.f;
                    if (objB == y50Var) {
                        return y50Var;
                    }
                }
            }
            se0Var.C1(ae0Var);
            return dm3.a;
        }
        if (i2 != 1) {
            c.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ae0Var = qe0Var.i;
        y02.Q(obj);
        se0Var.A = null;
        se0Var.C1(ae0Var);
        return dm3.a;
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
    */
    public void i0(za2 za2Var, ab2 ab2Var, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        boolean z;
        wd0 wd0Var;
        Object obj4;
        Object obj5;
        boolean z2 = true;
        this.C = true;
        if (this.x) {
            if (this.F == null) {
                bw0 bw0Var = new bw0(this);
                p1(bw0Var);
                this.F = bw0Var;
            }
            int i = 0;
            if (this.K == null) {
                td0 td0Var = this.D;
                if (td0Var == null) {
                    td0Var = new td0();
                    td0Var.d = sd0.h;
                    td0Var.e = false;
                    td0Var.f = false;
                    this.D = td0Var;
                }
                this.K = td0Var;
            }
            ur urVar = this.K;
            if (urVar == null) {
                c.p("currentDragState should not be null");
                return;
            }
            boolean z3 = urVar instanceof td0;
            ab2 ab2Var2 = ab2.f;
            ab2 ab2Var3 = ab2.g;
            if (z3) {
                td0 td0Var2 = (td0) urVar;
                if (!za2Var.a.isEmpty() && cd3.e(za2Var, false)) {
                    gb2 gb2Var = (gb2) qx.q0(za2Var.a);
                    int i2 = ne0.a[td0Var2.d.ordinal()];
                    sd0 sd0Var = sd0.g;
                    sd0 sd0Var2 = sd0.f;
                    sd0 sd0Var3 = i2 == 1 ? !H1() ? sd0Var2 : sd0Var : td0Var2.d;
                    td0Var2.d = sd0Var3;
                    if (ab2Var == ab2Var2) {
                        if (sd0Var3 == sd0Var) {
                            gb2Var.a();
                            td0Var2.e = true;
                        }
                        td0Var2.f = true;
                    }
                    if (ab2Var == ab2Var3) {
                        if (sd0Var3 == sd0Var2) {
                            z1(this, gb2Var, gb2Var.a, 0L, 12);
                            return;
                        }
                        if (td0Var2.e) {
                            G1(gb2Var, gb2Var, 0L);
                            F1(0L, gb2Var);
                            long j2 = gb2Var.a;
                            wd0 wd0Var2 = this.H;
                            if (wd0Var2 == null) {
                                wd0Var2 = new wd0();
                                wd0Var2.d = Long.MAX_VALUE;
                                this.H = wd0Var2;
                            }
                            wd0Var2.d = j2;
                            this.K = wd0Var2;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            boolean z4 = urVar instanceof vd0;
            ab2 ab2Var4 = ab2.h;
            if (!z4) {
                if (urVar instanceof ud0) {
                    ud0 ud0Var = (ud0) urVar;
                    if (ab2Var != ab2Var4) {
                        return;
                    }
                    List list = za2Var.a;
                    int size = list.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            break;
                        }
                        if (((gb2) list.get(i3)).c()) {
                            z2 = false;
                            break;
                        }
                        i3++;
                    }
                    int size2 = list.size();
                    while (true) {
                        if (i >= size2) {
                            break;
                        }
                        if (!((gb2) list.get(i)).d) {
                            i++;
                        } else if (!list.isEmpty()) {
                            if (z2) {
                                long j3 = ((gb2) qx.q0(list)).c;
                                gb2 gb2Var2 = ud0Var.d;
                                gb2Var2.getClass();
                                long jD = gy1.d(j3, gb2Var2.c);
                                gb2 gb2Var3 = ud0Var.d;
                                if (gb2Var3 != null) {
                                    z1(this, gb2Var3, ud0Var.e, jD, 8);
                                    return;
                                } else {
                                    c.p("AwaitGesturePickup.initialDown was not initialized.");
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    x1();
                    return;
                }
                if (!(urVar instanceof wd0)) {
                    c.k();
                    return;
                }
                wd0 wd0Var3 = (wd0) urVar;
                if (ab2Var != ab2Var3) {
                    return;
                }
                long j4 = wd0Var3.d;
                List list2 = za2Var.a;
                int size3 = list2.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        obj = null;
                        break;
                    }
                    obj = list2.get(i4);
                    if (d32.l(((gb2) obj).a, j4)) {
                        break;
                    } else {
                        i4++;
                    }
                }
                gb2 gb2Var4 = (gb2) obj;
                if (gb2Var4 == null) {
                    return;
                }
                boolean zN = w22.n(gb2Var4);
                Object obj6 = xd0.a;
                if (!zN) {
                    if (gb2Var4.c()) {
                        D1().l(obj6);
                        return;
                    } else {
                        if (gy1.c(w22.D(gb2Var4, true)) == 0.0f) {
                            return;
                        }
                        F1(w22.D(gb2Var4, false), gb2Var4);
                        gb2Var4.a();
                        return;
                    }
                }
                List list3 = za2Var.a;
                int size4 = list3.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list3.get(i5);
                    if (((gb2) obj2).d) {
                        break;
                    } else {
                        i5++;
                    }
                }
                gb2 gb2Var5 = (gb2) obj2;
                if (gb2Var5 != null) {
                    wd0Var3.d = gb2Var5.a;
                    return;
                }
                if (gb2Var4.c() || !w22.n(gb2Var4)) {
                    D1().l(obj6);
                } else {
                    float fA = ((oq3) ur.z(this, s20.t)).a();
                    n32.g(E1(), gb2Var4);
                    long jA = E1().a(d32.h(fA, fA));
                    ol1 ol1Var = (ol1) E1().a;
                    np3 np3Var = ol1Var.a;
                    d70[] d70VarArr = np3Var.d;
                    uj.O(0, d70VarArr.length, null, d70VarArr);
                    np3Var.e = 0;
                    np3 np3Var2 = ol1Var.b;
                    d70[] d70VarArr2 = np3Var2.d;
                    uj.O(0, d70VarArr2.length, null, d70VarArr2);
                    np3Var2.e = 0;
                    ol1Var.c = 0L;
                    D1().l(new ae0(bf0.b(jA), false));
                    this.C = false;
                }
                x1();
                return;
            }
            vd0 vd0Var = (vd0) urVar;
            if (ab2Var == ab2Var2) {
                return;
            }
            List list4 = za2Var.a;
            int size5 = list4.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size5) {
                    obj3 = null;
                    break;
                }
                obj3 = list4.get(i6);
                if (d32.l(((gb2) obj3).a, vd0Var.e)) {
                    break;
                } else {
                    i6++;
                }
            }
            gb2 gb2Var6 = (gb2) obj3;
            if (gb2Var6 == null) {
                int size6 = list4.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list4.get(i7);
                    if (((gb2) obj5).d) {
                        break;
                    } else {
                        i7++;
                    }
                }
                gb2Var6 = (gb2) obj5;
                if (gb2Var6 == null) {
                    x1();
                    return;
                }
                vd0Var.e = gb2Var6.a;
            }
            if (ab2Var == ab2Var3) {
                if (gb2Var6.c()) {
                    gb2 gb2Var7 = vd0Var.d;
                    if (gb2Var7 == null) {
                        c.p("AwaitTouchSlop.initialDown was not initialized");
                        return;
                    }
                    long j5 = vd0Var.e;
                    vx0 vx0Var = this.M;
                    if (vx0Var == null) {
                        c.p("AwaitTouchSlop.touchSlopDetector was not initialized");
                        return;
                    }
                    y1(gb2Var7, j5, vx0Var);
                } else if (w22.n(gb2Var6)) {
                    int size7 = list4.size();
                    int i8 = 0;
                    while (true) {
                        if (i8 >= size7) {
                            obj4 = null;
                            break;
                        }
                        Object obj7 = list4.get(i8);
                        if (((gb2) obj7).d) {
                            obj4 = obj7;
                            break;
                        }
                        i8++;
                    }
                    gb2 gb2Var8 = (gb2) obj4;
                    if (gb2Var8 == null) {
                        x1();
                    } else {
                        vd0Var.e = gb2Var8.a;
                    }
                } else {
                    float fH = le0.h((oq3) ur.z(this, s20.t), gb2Var6.i);
                    vx0 vx0Var2 = this.M;
                    if (vx0Var2 == null) {
                        c.p("Touch slop detector not initialized.");
                        return;
                    }
                    long jA2 = vx0.a(vx0Var2, w22.D(gb2Var6, true), fH);
                    if ((9223372034707292159L & jA2) != 9205357640488583168L) {
                        this.E = gy1.e(this.E, w22.D(gb2Var6, false));
                        float fAtan2 = ((float) Math.atan2(Math.abs(Float.intBitsToFloat((int) (this.E & 4294967295L))), Math.abs(Float.intBitsToFloat((int) (r11 >> 32))))) * 57.29578f;
                        t02 t02Var = this.v;
                        if (t02Var == null) {
                            z = true;
                            mk2 mk2Var = new mk2();
                            me0 me0Var = new me0(fAtan2, mk2Var);
                            af0 af0Var = bf0.a;
                            n32.B(this, bw0.u, new cw0(new s(22, me0Var), 0));
                            if (z && mk2Var.f) {
                                vd0Var.f = true;
                            } else {
                                gb2Var6.a();
                                gb2 gb2Var9 = vd0Var.d;
                                gb2Var9.getClass();
                                G1(gb2Var9, gb2Var6, jA2);
                                F1(jA2, gb2Var6);
                                long j6 = gb2Var6.a;
                                wd0Var = this.H;
                                if (wd0Var == null) {
                                    wd0Var = new wd0();
                                    wd0Var.d = Long.MAX_VALUE;
                                    this.H = wd0Var;
                                }
                                wd0Var.d = j6;
                                this.K = wd0Var;
                            }
                        } else {
                            af0 af0Var2 = bf0.a;
                            if (t02Var != t02.g ? fAtan2 <= 30.0f || fAtan2 > 90.0f : fAtan2 > 30.0f) {
                                z = false;
                            }
                            mk2 mk2Var2 = new mk2();
                            me0 me0Var2 = new me0(fAtan2, mk2Var2);
                            af0 af0Var3 = bf0.a;
                            n32.B(this, bw0.u, new cw0(new s(22, me0Var2), 0));
                            if (z) {
                                gb2Var6.a();
                                gb2 gb2Var92 = vd0Var.d;
                                gb2Var92.getClass();
                                G1(gb2Var92, gb2Var6, jA2);
                                F1(jA2, gb2Var6);
                                long j62 = gb2Var6.a;
                                wd0Var = this.H;
                                if (wd0Var == null) {
                                }
                                wd0Var.d = j62;
                                this.K = wd0Var;
                            }
                        }
                    } else {
                        vd0Var.f = true;
                        this.E = gy1.e(this.E, w22.D(gb2Var6, true));
                    }
                }
            }
            if (ab2Var == ab2Var4 && vd0Var.f) {
                if (!gb2Var6.c()) {
                    vd0Var.f = false;
                    return;
                }
                gb2 gb2Var10 = vd0Var.d;
                if (gb2Var10 == null) {
                    c.p("AwaitTouchSlop.initialDown was not initialized");
                    return;
                }
                long j7 = vd0Var.e;
                vx0 vx0Var3 = this.M;
                if (vx0Var3 != null) {
                    y1(gb2Var10, j7, vx0Var3);
                } else {
                    c.p("AwaitTouchSlop.touchSlopDetector was not initialized");
                }
            }
        }
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
