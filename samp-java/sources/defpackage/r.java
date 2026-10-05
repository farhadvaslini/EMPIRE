package defpackage;

import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class r extends ja0 implements jb2, i71, tu2, m20, ey1, y11, aw0 {
    public boolean A;
    public cs0 B;
    public final wp0 C;
    public o11 D;
    public bw0 E;
    public String F = "idle";
    public ia0 G;
    public zc2 H;
    public zy0 I;
    public final sr1 J;
    public long K;
    public zc2 L;
    public qr1 M;
    public boolean N;
    public w83 O;
    public qr1 v;
    public o11 w;
    public boolean x;
    public String y;
    public no2 z;

    public r(qr1 qr1Var, o11 o11Var, boolean z, boolean z2, String str, no2 no2Var, cs0 cs0Var) {
        this.v = qr1Var;
        this.w = o11Var;
        this.x = z;
        this.y = str;
        this.z = no2Var;
        this.A = z2;
        this.B = cs0Var;
        this.C = new wp0(qr1Var, 0, new k(1, this, r.class, "onFocusChange", "onFocusChange(Z)V", 0, 0, 0));
        int i = pk1.a;
        this.J = new sr1(6);
        this.K = 0L;
        qr1 qr1Var2 = this.v;
        this.M = qr1Var2;
        this.N = qr1Var2 == null;
    }

    public final void A1() {
        if (this.G != null) {
            return;
        }
        o11 o11Var = this.x ? this.D : this.w;
        if (o11Var != null) {
            if (this.v == null) {
                this.v = new qr1();
            }
            this.C.u1(this.v);
            qr1 qr1Var = this.v;
            qr1Var.getClass();
            ia0 ia0VarA = o11Var.a(qr1Var);
            p1(ia0VarA);
            this.G = ia0VarA;
        }
    }

    public abstract boolean C1(KeyEvent keyEvent);

    public abstract void D1(KeyEvent keyEvent);

    public final void E1() {
        y73 y73Var = (y73) ur.z(this, s20.v);
        if (y73Var != null) {
            y73Var.a();
        }
        this.B.a();
    }

    @Override // defpackage.i71
    public final boolean F(KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F1(defpackage.qr1 r4, defpackage.o11 r5, boolean r6, boolean r7, java.lang.String r8, defpackage.no2 r9, defpackage.cs0 r10) {
        /*
            r3 = this;
            qr1 r0 = r3.M
            boolean r0 = defpackage.s51.n(r0, r4)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L13
            r3.u1()
            r3.M = r4
            r3.v = r4
            r4 = r1
            goto L14
        L13:
            r4 = r2
        L14:
            o11 r0 = r3.w
            boolean r0 = defpackage.s51.n(r0, r5)
            if (r0 != 0) goto L1f
            r3.w = r5
            r4 = r1
        L1f:
            boolean r5 = r3.x
            if (r5 == r6) goto L2b
            r3.x = r6
            if (r6 == 0) goto L2a
            r3.k0()
        L2a:
            r4 = r1
        L2b:
            boolean r5 = r3.A
            r6 = 0
            wp0 r0 = r3.C
            if (r5 == r7) goto L52
            if (r7 == 0) goto L38
            r3.p1(r0)
            goto L3e
        L38:
            r3.q1(r0)
            r3.u1()
        L3e:
            defpackage.y02.w(r3)
            if (r7 != 0) goto L50
            bw0 r5 = r3.E
            if (r5 == 0) goto L4a
            r3.q1(r5)
        L4a:
            r3.E = r6
            java.lang.String r5 = "idle"
            r3.F = r5
        L50:
            r3.A = r7
        L52:
            java.lang.String r5 = r3.y
            boolean r5 = defpackage.s51.n(r5, r8)
            if (r5 != 0) goto L5f
            r3.y = r8
            defpackage.y02.w(r3)
        L5f:
            no2 r5 = r3.z
            boolean r5 = defpackage.s51.n(r5, r9)
            if (r5 != 0) goto L6c
            r3.z = r9
            defpackage.y02.w(r3)
        L6c:
            r3.B = r10
            boolean r5 = r3.N
            qr1 r7 = r3.M
            if (r7 != 0) goto L76
            r8 = r1
            goto L77
        L76:
            r8 = r2
        L77:
            if (r5 == r8) goto L85
            if (r7 != 0) goto L7c
            r2 = r1
        L7c:
            r3.N = r2
            if (r2 != 0) goto L85
            ia0 r5 = r3.G
            if (r5 != 0) goto L85
            goto L86
        L85:
            r1 = r4
        L86:
            if (r1 == 0) goto L9a
            ia0 r4 = r3.G
            if (r4 != 0) goto L90
            boolean r5 = r3.N
            if (r5 != 0) goto L9a
        L90:
            if (r4 == 0) goto L95
            r3.q1(r4)
        L95:
            r3.G = r6
            r3.A1()
        L9a:
            qr1 r3 = r3.v
            r0.u1(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r.F1(qr1, o11, boolean, boolean, java.lang.String, no2, cs0):void");
    }

    @Override // defpackage.tu2
    public final void K0(dv2 dv2Var) {
        no2 no2Var = this.z;
        if (no2Var != null) {
            bv2.i(dv2Var, no2Var.a);
        }
        String str = this.y;
        h hVar = new h(this, 1);
        a71[] a71VarArr = bv2.a;
        dv2Var.a(pu2.b, new y0(str, hVar));
        if (this.A) {
            this.C.K0(dv2Var);
        } else {
            dv2Var.a(zu2.j, dm3.a);
        }
        s1(dv2Var);
    }

    @Override // defpackage.tu2
    public final boolean N0() {
        return true;
    }

    @Override // defpackage.aw0
    public final String V0() {
        return this.F;
    }

    @Override // defpackage.aq1
    public final boolean e1() {
        return false;
    }

    @Override // defpackage.aq1
    public final void h1() {
        k0();
        if (!this.N) {
            A1();
        }
        if (this.A) {
            p1(this.C);
        }
    }

    public void i0(za2 za2Var, ab2 ab2Var, long j) {
        long j2 = (((j << 32) >> 33) & 4294967295L) | ((j >> 33) << 32);
        this.K = (((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32);
        A1();
        if (this.A) {
            if (this.E == null) {
                bw0 bw0Var = new bw0(this);
                p1(bw0Var);
                this.E = bw0Var;
            }
            if (ab2Var == ab2.g) {
                int i = za2Var.f;
                p40 p40Var = null;
                if (i == 4) {
                    cl3.t(d1(), null, new q(this, p40Var, 0), 3);
                } else if (i == 5) {
                    cl3.t(d1(), null, new q(this, p40Var, 1), 3);
                }
            }
        }
    }

    @Override // defpackage.aq1
    public final void i1() {
        u1();
        if (this.M == null) {
            this.v = null;
        }
        ia0 ia0Var = this.G;
        if (ia0Var != null) {
            q1(ia0Var);
        }
        this.G = null;
        bw0 bw0Var = this.E;
        if (bw0Var != null) {
            q1(bw0Var);
        }
        this.E = null;
    }

    @Override // defpackage.ey1
    public final void k0() {
        if (this.x) {
            gq.M(this, new h(this, 0));
        }
    }

    public final boolean t1() {
        qk2 qk2Var = new qk2();
        n32.B(this, bw0.u, new cw0(new t6(1, qk2Var), 0));
        if (qk2Var.f == null) {
            int i = yw.b;
            ViewParent parent = vp.S(this).getParent();
            while (parent != null && (parent instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if (!viewGroup.shouldDelayChildPressedState()) {
                    parent = viewGroup.getParent();
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0077 A[RETURN] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.i71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean u0(android.view.KeyEvent r12) {
        /*
            r11 = this;
            r11.A1()
            long r0 = defpackage.ur.E(r12)
            boolean r2 = r11.A
            r3 = 3
            r4 = 0
            sr1 r5 = r11.J
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L4a
            int r2 = defpackage.ur.G(r12)
            r8 = 2
            if (r2 != r8) goto L4a
            boolean r2 = defpackage.rn.D(r12)
            if (r2 == 0) goto L4a
            boolean r2 = r5.b(r0)
            if (r2 != 0) goto L40
            zc2 r2 = new zc2
            long r9 = r11.K
            r2.<init>(r9)
            r5.g(r0, r2)
            qr1 r0 = r11.v
            if (r0 == 0) goto L3e
            x50 r0 = r11.d1()
            p r1 = new p
            r1.<init>(r11, r2, r4, r8)
            defpackage.cl3.t(r0, r4, r1, r3)
        L3e:
            r0 = r6
            goto L41
        L40:
            r0 = r7
        L41:
            boolean r11 = r11.C1(r12)
            if (r11 != 0) goto L77
            if (r0 == 0) goto L78
            goto L77
        L4a:
            boolean r2 = r11.A
            if (r2 == 0) goto L78
            int r2 = defpackage.ur.G(r12)
            if (r2 != r6) goto L78
            boolean r2 = defpackage.rn.D(r12)
            if (r2 == 0) goto L78
            java.lang.Object r0 = r5.f(r0)
            zc2 r0 = (defpackage.zc2) r0
            if (r0 == 0) goto L75
            qr1 r1 = r11.v
            if (r1 == 0) goto L72
            x50 r1 = r11.d1()
            p r2 = new p
            r2.<init>(r11, r0, r4, r3)
            defpackage.cl3.t(r1, r4, r2, r3)
        L72:
            r11.D1(r12)
        L75:
            if (r0 == 0) goto L78
        L77:
            return r6
        L78:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r.u0(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u1() {
        /*
            r17 = this;
            r0 = r17
            qr1 r1 = r0.v
            sr1 r2 = r0.J
            if (r1 == 0) goto L76
            zc2 r3 = r0.H
            if (r3 == 0) goto L14
            yc2 r4 = new yc2
            r4.<init>(r3)
            r1.c(r4)
        L14:
            zc2 r3 = r0.L
            if (r3 == 0) goto L20
            yc2 r4 = new yc2
            r4.<init>(r3)
            r1.c(r4)
        L20:
            zy0 r3 = r0.I
            if (r3 == 0) goto L2c
            az0 r4 = new az0
            r4.<init>(r3)
            r1.c(r4)
        L2c:
            java.lang.Object[] r3 = r2.c
            long[] r4 = r2.a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L76
            r6 = 0
            r7 = r6
        L37:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L71
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L51:
            if (r12 >= r10) goto L6f
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L6b
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            zc2 r13 = (defpackage.zc2) r13
            yc2 r14 = new yc2
            r14.<init>(r13)
            r1.c(r14)
        L6b:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L51
        L6f:
            if (r10 != r11) goto L76
        L71:
            if (r7 == r5) goto L76
            int r7 = r7 + 1
            goto L37
        L76:
            r1 = 0
            r0.H = r1
            r0.L = r1
            r0.I = r1
            r2.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r.u1():void");
    }

    public final long v1(long j) {
        long jC0 = vr.X(this).E.C0(((oq3) ur.z(this, s20.t)).g());
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (jC0 >> 32)) - ((int) (j >> 32))) / 2.0f;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jC0 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
    }

    public final void w1(boolean z) {
        qr1 qr1Var = this.v;
        if (qr1Var != null) {
            w83 w83Var = this.O;
            p40 p40Var = null;
            if (w83Var == null || !w83Var.b()) {
                zc2 zc2Var = z ? this.L : this.H;
                if (zc2Var != null) {
                    yc2 yc2Var = new yc2(zc2Var);
                    j61 j61Var = (j61) ((n40) d1()).f.m(f5.b0);
                    cl3.t(d1(), null, new l(qr1Var, yc2Var, j61Var != null ? j61Var.r(new i(0, qr1Var, yc2Var)) : null, p40Var, 0), 3);
                }
            } else {
                w83 w83Var2 = this.O;
                if (w83Var2 != null) {
                    w83Var2.c(null);
                }
            }
            if (z) {
                this.L = null;
            } else {
                this.H = null;
            }
        }
    }

    public final void x1(long j, boolean z) {
        qr1 qr1Var = this.v;
        if (qr1Var != null) {
            w83 w83Var = this.O;
            if (w83Var == null || !w83Var.b()) {
                zc2 zc2Var = z ? this.L : this.H;
                if (zc2Var != null) {
                    cl3.t(d1(), null, new n(zc2Var, qr1Var, null), 3);
                }
            } else {
                w83Var.c(null);
                cl3.t(d1(), null, new m(w83Var, j, qr1Var, (p40) null, 0), 3);
            }
            if (z) {
                this.L = null;
            } else {
                this.H = null;
            }
        }
    }

    public final void y1(q11 q11Var) {
        qr1 qr1Var = this.v;
        if (qr1Var != null) {
            zc2 zc2Var = new zc2(q11Var.c);
            p40 p40Var = null;
            if (t1()) {
                this.O = cl3.t(d1(), null, new o(qr1Var, zc2Var, this, p40Var, 0), 3);
            } else {
                this.L = zc2Var;
                cl3.t(d1(), null, new n(qr1Var, zc2Var, p40Var, 1), 3);
            }
        }
    }

    public final void z1(gb2 gb2Var) {
        qr1 qr1Var = this.v;
        if (qr1Var != null) {
            zc2 zc2Var = new zc2(gb2Var.c);
            p40 p40Var = null;
            if (t1()) {
                this.O = cl3.t(d1(), null, new o(qr1Var, zc2Var, this, p40Var, 1), 3);
            } else {
                this.H = zc2Var;
                cl3.t(d1(), null, new n(qr1Var, zc2Var, p40Var, 2), 3);
            }
        }
    }

    public void B1() {
    }

    public void s1(dv2 dv2Var) {
    }
}
