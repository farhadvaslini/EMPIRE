package defpackage;

import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
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
    */
    public final void F1(qr1 qr1Var, o11 o11Var, boolean z, boolean z2, String str, no2 no2Var, cs0 cs0Var) {
        boolean z3;
        ia0 ia0Var;
        boolean z4 = true;
        if (s51.n(this.M, qr1Var)) {
            z3 = false;
        } else {
            u1();
            this.M = qr1Var;
            this.v = qr1Var;
            z3 = true;
        }
        if (!s51.n(this.w, o11Var)) {
            this.w = o11Var;
            z3 = true;
        }
        if (this.x != z) {
            this.x = z;
            if (z) {
                k0();
            }
            z3 = true;
        }
        boolean z5 = this.A;
        wp0 wp0Var = this.C;
        if (z5 != z2) {
            if (z2) {
                p1(wp0Var);
            } else {
                q1(wp0Var);
                u1();
            }
            y02.w(this);
            if (!z2) {
                ia0 ia0Var2 = this.E;
                if (ia0Var2 != null) {
                    q1(ia0Var2);
                }
                this.E = null;
                this.F = "idle";
            }
            this.A = z2;
        }
        if (!s51.n(this.y, str)) {
            this.y = str;
            y02.w(this);
        }
        if (!s51.n(this.z, no2Var)) {
            this.z = no2Var;
            y02.w(this);
        }
        this.B = cs0Var;
        boolean z6 = this.N;
        qr1 qr1Var2 = this.M;
        if (z6 == (qr1Var2 == null)) {
            z4 = z3;
        } else {
            boolean z7 = qr1Var2 == null;
            this.N = z7;
            if (z7 || this.G != null) {
            }
        }
        if (z4 && ((ia0Var = this.G) != null || !this.N)) {
            if (ia0Var != null) {
                q1(ia0Var);
            }
            this.G = null;
            A1();
        }
        wp0Var.u1(this.v);
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
    */
    public final boolean u0(KeyEvent keyEvent) {
        boolean z;
        A1();
        long jE = ur.E(keyEvent);
        boolean z2 = this.A;
        int i = 3;
        p40 p40Var = null;
        sr1 sr1Var = this.J;
        if (z2) {
            int i2 = 2;
            if (ur.G(keyEvent) == 2 && rn.D(keyEvent)) {
                if (sr1Var.b(jE)) {
                    z = false;
                } else {
                    zc2 zc2Var = new zc2(this.K);
                    sr1Var.g(jE, zc2Var);
                    if (this.v != null) {
                        cl3.t(d1(), null, new p(this, zc2Var, p40Var, i2), 3);
                    }
                    z = true;
                }
                return C1(keyEvent) || z;
            }
        }
        if (this.A && ur.G(keyEvent) == 1 && rn.D(keyEvent)) {
            zc2 zc2Var2 = (zc2) sr1Var.f(jE);
            if (zc2Var2 != null) {
                if (this.v != null) {
                    cl3.t(d1(), null, new p(this, zc2Var2, p40Var, i), 3);
                }
                D1(keyEvent);
            }
            if (zc2Var2 != null) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u1() {
        qr1 qr1Var = this.v;
        sr1 sr1Var = this.J;
        if (qr1Var != null) {
            zc2 zc2Var = this.H;
            if (zc2Var != null) {
                qr1Var.c(new yc2(zc2Var));
            }
            zc2 zc2Var2 = this.L;
            if (zc2Var2 != null) {
                qr1Var.c(new yc2(zc2Var2));
            }
            zy0 zy0Var = this.I;
            if (zy0Var != null) {
                qr1Var.c(new az0(zy0Var));
            }
            Object[] objArr = sr1Var.c;
            long[] jArr = sr1Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                qr1Var.c(new yc2((zc2) objArr[(i << 3) + i3]));
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        this.H = null;
        this.L = null;
        this.I = null;
        sr1Var.a();
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
