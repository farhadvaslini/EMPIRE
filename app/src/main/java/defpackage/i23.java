package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class i23 extends aq1 implements of0, dq1, ey1, m20, kb1 {
    public jk2 t;
    public te u;
    public jk2 v;
    public boolean w;
    public o23 x;
    public final z33 y;

    public i23(o23 o23Var) {
        this.x = o23Var;
        z33 z33Var = new z33(k23.a);
        z33Var.i.setValue(o23Var);
        this.y = z33Var;
    }

    @Override // defpackage.dq1
    public final gq D() {
        return this.y;
    }

    @Override // defpackage.aq1
    public final void h1() {
        gq.M(this, this.x.f().i);
        t1();
        this.x.f.setValue(Boolean.TRUE);
    }

    @Override // defpackage.aq1
    public final void i1() {
        ab1 ab1Var = this.x.f().b.j;
        if (ab1Var != null) {
            this.v = (ab1Var.t0() && this.w) ? b32.b(gy1.d(vr.W(this).k0(0L), ab1Var.k0(0L)), lr.T(vr.W(this).h)) : null;
        }
        s1(null);
        o23 o23Var = this.x;
        if (!s51.n(o23Var.q, null)) {
            o23Var.q = null;
            a42 a42Var = o23Var.f().b.l;
            a42Var.h(a42Var.g() + 1);
        }
        o23 o23Var2 = this.x;
        o23Var2.r = null;
        o23Var2.f.setValue(Boolean.FALSE);
        this.w = false;
    }

    @Override // defpackage.aq1
    public final void j1() {
        this.v = null;
        s1(null);
    }

    @Override // defpackage.ey1
    public final void k0() {
        this.x.f().f();
        gq.M(this, this.x.f().i);
    }

    @Override // defpackage.of0
    public final void m0(vb1 vb1Var) {
        jk2 jk2VarC = this.x.f().c.a().c();
        boolean zH = this.x.h();
        o23 o23Var = this.x;
        da daVar = null;
        if (!zH) {
            o23Var.p = null;
            s1(null);
            o23 o23Var2 = this.x;
            if (!o23Var2.f().c.a().d() || (!o23Var2.h() && o23Var2.g())) {
                vb1Var.c();
                return;
            }
            return;
        }
        if (jk2VarC != null) {
            d33 d33Var = (d33) o23Var.m.getValue();
            y23 y23VarJ = this.x.j();
            vb1Var.getLayoutDirection();
            ua0 ua0Var = vr.X(this).E;
            d33Var.getClass();
            o23 o23Var3 = (o23) y23VarJ.c.getValue();
            if (o23Var3 == null) {
                c.p("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not been initialized.");
                return;
            }
            o23 o23Var4 = o23Var3.q;
            y23 y23VarJ2 = o23Var4 != null ? o23Var4.j() : null;
            if (y23VarJ2 != null) {
                o23 o23Var5 = (o23) y23VarJ2.c.getValue();
                if (o23Var5 == null) {
                    c.p("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not been initialized.");
                    return;
                }
                daVar = o23Var5.p;
            }
        }
        o23Var.p = daVar;
        if (((qw0) this.x.s.getValue()) == null) {
            s1(vr.V(this).b());
        }
        qw0 qw0Var = (qw0) this.x.s.getValue();
        if (qw0Var == null) {
            c.q("Error: shared element does not have a layer for rendering in the overlay.");
            return;
        }
        vb1Var.g0(qw0Var, lr.S(vb1Var.f.a()), new kd(vb1Var, jk2VarC, this));
        o23 o23Var6 = this.x;
        if (!o23Var6.f().c.a().d() || (!o23Var6.h() && o23Var6.g())) {
            lr.z(vb1Var, qw0Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final dn1 p1(bj bjVar, xm1 xm1Var, long j) {
        jk2 jk2VarC;
        int i;
        long j2;
        char c;
        int i2;
        ab1 ab1Var;
        long jH;
        long jI0;
        if (this.x.f().c.a().e() != null && (jk2VarC = this.x.f().c.a().c()) != null) {
            float f = jk2VarC.b;
            float f2 = jk2VarC.d;
            float f3 = jk2VarC.a;
            float f4 = jk2VarC.c;
            u23 u23VarB = this.x.b();
            if (u23VarB == null || !u23VarB.c()) {
                i = 1;
                j2 = 4294967295L;
                c = ' ';
                i2 = 0;
                this.x.o = false;
            } else {
                if (!this.x.o && (ab1Var = u23VarB.e) != null && ab1Var.t0() && r1().t0()) {
                    float f5 = u23VarB.k;
                    j2 = 4294967295L;
                    c = ' ';
                    long jA = k23.a(ab1Var, r1(), u23VarB.i);
                    long jB = k23.b(jk2VarC.d(), jA, f5);
                    i23 i23Var = this.x.r;
                    boolean z = !this.x.h() && ((i23Var != null ? i23Var.q1() : null) == u23VarB);
                    if (z) {
                        f5 = 1.0f;
                    }
                    float f6 = f5;
                    int i3 = (int) (jB >> 32);
                    int i4 = (int) (jB & 4294967295L);
                    this.t = new jk2(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4), ((f4 - f3) * f6) + Float.intBitsToFloat(i3), ((f2 - f) * f6) + Float.intBitsToFloat(i4));
                    if (z) {
                        this.u = null;
                    } else {
                        qe qeVarA = u23VarB.a();
                        float f7 = qeVarA != null ? qeVarA.a : 0.0f;
                        re reVarB = u23VarB.b();
                        float f8 = reVarB != null ? reVarB.a : 0.0f;
                        float f9 = reVarB != null ? reVarB.b : 0.0f;
                        int i5 = (int) (jA >> 32);
                        int i6 = (int) (jA & 4294967295L);
                        this.u = new te(((f3 - Float.intBitsToFloat(i5)) * f7) + f8, ((f - Float.intBitsToFloat(i6)) * f7) + f9, ((f4 - Float.intBitsToFloat(i5)) * f7) + f8, ((f2 - Float.intBitsToFloat(i6)) * f7) + f9);
                    }
                    i = 1;
                    this.x.o = true;
                } else {
                    i = 1;
                    j2 = 4294967295L;
                    c = ' ';
                }
                i2 = 0;
            }
        }
        jk2 jk2VarC2 = this.t;
        if (jk2VarC2 == null && (jk2VarC2 = this.x.c().c()) == null) {
            l33 l33Var = this.x.f().c;
            l33Var.c();
            jk2VarC2 = l33Var.a().f(l33Var.a);
        }
        if (jk2VarC2 != null) {
            long jQ = lr.Q(jk2VarC2.c());
            int i7 = (int) (jQ >> c);
            int i8 = (int) (jQ & j2);
            if (i7 == Integer.MAX_VALUE || i8 == Integer.MAX_VALUE) {
                qn1.j("Error: Infinite width/height is invalid. animated bounds: ", this.x.c().c(), ", current bounds: ", this.x.f().c.a().c());
                return null;
            }
            if (i7 < 0) {
                i7 = i2;
            }
            if (i8 < 0) {
                i8 = i2;
            }
            if (((i7 >= 0 ? i : i2) & (i8 >= 0 ? i : i2)) == 0) {
                o21.a("width and height must be >= 0");
            }
            jH = n30.h(i7, i7, i8, i8);
        } else {
            jH = j;
        }
        i62 i62VarT = xm1Var.t(jH);
        if (this.x.f().c.a().d()) {
            x23 x23Var = (x23) this.x.k.getValue();
            jI0 = this.x.f().b.f.c(vr.W(this)).i0();
            int i9 = i62VarT.f;
            int i10 = i62VarT.g;
            x23Var.getClass();
        } else {
            jI0 = (((long) i62VarT.f) << c) | (((long) i62VarT.g) & j2);
        }
        return bjVar.I0((int) (jI0 >> c), (int) (jI0 & j2), oi0.f, new h23(this, i62VarT));
    }

    public final u23 q1() {
        if (this.s) {
            return (u23) t0(da0.a);
        }
        return null;
    }

    public final ab1 r1() {
        ab1 ab1Var = this.x.f().b.j;
        if (ab1Var != null) {
            return ab1Var;
        }
        c.p("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
        return null;
    }

    public final void s1(qw0 qw0Var) {
        qw0 qw0Var2 = (qw0) this.x.s.getValue();
        if (s51.n(qw0Var, qw0Var2)) {
            return;
        }
        if (qw0Var2 != null) {
            vr.V(this).a(qw0Var2);
        }
        this.x.s.setValue(qw0Var);
    }

    @Override // defpackage.kb1
    public final dn1 t(en1 en1Var, xm1 xm1Var, long j) {
        i62 i62VarT = xm1Var.t(j);
        return en1Var.I0(i62VarT.f, i62VarT.g, oi0.f, new h23(i62VarT, this));
    }

    public final void t1() {
        fe2 fe2Var = k23.a;
        o23 o23Var = this.x;
        pi0 pi0Var = pi0.h;
        z33 z33Var = this.y;
        if (z33Var == pi0Var) {
            m21.a("In order to provide locals you must override providedValues: ModifierLocalMap");
        }
        if (!z33Var.v(fe2Var)) {
            m21.a("Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key " + fe2Var + " was not found.");
        }
        if (fe2Var != z33Var.h) {
            m21.c("Check failed.");
        }
        z33Var.i.setValue(o23Var);
        o23 o23Var2 = this.x;
        o23 o23Var3 = (o23) t0(fe2Var);
        if (!s51.n(o23Var2.q, o23Var3)) {
            o23Var2.q = o23Var3;
            a42 a42Var = o23Var2.f().b.l;
            a42Var.h(a42Var.g() + 1);
        }
        s1(null);
        this.w = false;
        this.x.r = this;
    }
}
