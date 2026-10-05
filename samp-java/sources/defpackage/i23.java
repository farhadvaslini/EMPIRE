package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dn1 p1(defpackage.bj r22, defpackage.xm1 r23, long r24) {
        /*
            Method dump skipped, instruction units count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i23.p1(bj, xm1, long):dn1");
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
