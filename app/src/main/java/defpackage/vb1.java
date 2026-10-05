package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class vb1 implements qf0 {
    public final rr f = new rr();
    public of0 g;

    @Override // defpackage.qf0
    public final void A(da daVar, long j, float f, rf0 rf0Var) {
        this.f.A(daVar, j, f, rf0Var);
    }

    @Override // defpackage.ua0
    public final long C0(long j) {
        return this.f.C0(j);
    }

    @Override // defpackage.ua0
    public final float G() {
        return this.f.G();
    }

    @Override // defpackage.ua0
    public final float H0(long j) {
        return this.f.H0(j);
    }

    @Override // defpackage.qf0
    public final void O0(long j, float f, long j2, rf0 rf0Var) {
        this.f.O0(j, f, j2, rf0Var);
    }

    @Override // defpackage.ua0
    public final long P0(float f) {
        return this.f.P0(f);
    }

    @Override // defpackage.ua0
    public final long Q(float f) {
        return this.f.Q(f);
    }

    @Override // defpackage.ua0
    public final long R(long j) {
        return this.f.R(j);
    }

    @Override // defpackage.qf0
    public final void S(long j, long j2, long j3, long j4, rf0 rf0Var) {
        this.f.S(j, j2, j3, j4, rf0Var);
    }

    @Override // defpackage.ua0
    public final float T(float f) {
        return this.f.h() * f;
    }

    @Override // defpackage.qf0
    public final void W(long j, long j2, long j3, float f, rf0 rf0Var, int i) {
        this.f.W(j, j2, j3, f, rf0Var, i);
    }

    @Override // defpackage.qf0
    public final void X(long j, float f, float f2, long j2, long j3, float f3, ga3 ga3Var) {
        this.f.X(j, f, f2, j2, j3, f3, ga3Var);
    }

    @Override // defpackage.ua0
    public final float X0(int i) {
        return this.f.X0(i);
    }

    @Override // defpackage.qf0
    public final pi Z() {
        return this.f.g;
    }

    @Override // defpackage.qf0
    public final long a() {
        return this.f.a();
    }

    @Override // defpackage.ua0
    public final float a1(float f) {
        return f / this.f.h();
    }

    public final void c() {
        rr rrVar = this.f;
        pr prVarK = rrVar.g.k();
        ia0 ia0Var = this.g;
        if (ia0Var == null) {
            throw nc2.d("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        aq1 aq1Var = (aq1) ia0Var;
        aq1 aq1VarJ = aq1Var.f.k;
        if (aq1VarJ == null || (aq1VarJ.i & 4) == 0) {
            aq1VarJ = null;
        } else {
            while (aq1VarJ != null) {
                int i = aq1VarJ.h;
                if ((i & 2) != 0) {
                    break;
                } else if ((i & 4) != 0) {
                    break;
                } else {
                    aq1VarJ = aq1VarJ.k;
                }
            }
            aq1VarJ = null;
        }
        if (aq1VarJ == null) {
            ex1 ex1VarU = vr.U(ia0Var, 4);
            if (ex1VarU.w1() == aq1Var.f) {
                ex1VarU = ex1VarU.C;
                ex1VarU.getClass();
            }
            ex1VarU.M1(prVarK, (qw0) rrVar.g.h);
            return;
        }
        qs1 qs1Var = null;
        while (aq1VarJ != null) {
            if (aq1VarJ instanceof of0) {
                of0 of0Var = (of0) aq1VarJ;
                qw0 qw0Var = (qw0) rrVar.g.h;
                ex1 ex1VarU2 = vr.U(of0Var, 4);
                long jT = lr.T(ex1VarU2.h);
                tb1 tb1Var = ex1VarU2.z;
                tb1Var.getClass();
                ((h7) wb1.a(tb1Var)).getSharedDrawScope().i(prVarK, jT, ex1VarU2, of0Var, qw0Var);
            } else if ((aq1VarJ.h & 4) != 0 && (aq1VarJ instanceof ja0)) {
                int i2 = 0;
                for (aq1 aq1Var2 = ((ja0) aq1VarJ).u; aq1Var2 != null; aq1Var2 = aq1Var2.k) {
                    if ((aq1Var2.h & 4) != 0) {
                        i2++;
                        if (i2 == 1) {
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
                if (i2 == 1) {
                }
            }
            aq1VarJ = vr.j(qs1Var);
        }
    }

    @Override // defpackage.ua0
    public final int f0(long j) {
        return this.f.f0(j);
    }

    @Override // defpackage.qf0
    public final void g0(qw0 qw0Var, long j, ns0 ns0Var) {
        qw0Var.e(this, getLayoutDirection(), j, new v1((Object) this, (Object) this.g, ns0Var, 14));
    }

    @Override // defpackage.qf0
    public final bb1 getLayoutDirection() {
        return this.f.f.b;
    }

    @Override // defpackage.ua0
    public final float h() {
        return this.f.h();
    }

    public final void i(pr prVar, long j, ex1 ex1Var, of0 of0Var, qw0 qw0Var) {
        of0 of0Var2 = this.g;
        this.g = of0Var;
        bb1 bb1Var = ex1Var.z.F;
        rr rrVar = this.f;
        ua0 ua0VarO = rrVar.g.o();
        pi piVar = rrVar.g;
        bb1 bb1VarW = piVar.w();
        pr prVarK = piVar.k();
        long jA = piVar.A();
        qw0 qw0Var2 = (qw0) piVar.h;
        piVar.N(ex1Var);
        piVar.O(bb1Var);
        piVar.M(prVar);
        piVar.Q(j);
        piVar.h = qw0Var;
        prVar.l();
        try {
            of0Var.m0(this);
            prVar.i();
            piVar.N(ua0VarO);
            piVar.O(bb1VarW);
            piVar.M(prVarK);
            piVar.Q(jA);
            piVar.h = qw0Var2;
            this.g = of0Var2;
        } catch (Throwable th) {
            prVar.i();
            piVar.N(ua0VarO);
            piVar.O(bb1VarW);
            piVar.M(prVarK);
            piVar.Q(jA);
            piVar.h = qw0Var2;
            throw th;
        }
    }

    @Override // defpackage.ua0
    public final float j0(long j) {
        return this.f.j0(j);
    }

    @Override // defpackage.ua0
    public final int p0(float f) {
        return this.f.p0(f);
    }

    public final void t(dp dpVar, long j, long j2, long j3, float f, rf0 rf0Var) {
        rr rrVar = this.f;
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        rrVar.f.c.j(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), rrVar.i(dpVar, rf0Var, f, null, 3, 1));
    }

    @Override // defpackage.qf0
    public final void v0(long j, long j2, long j3, float f, int i) {
        this.f.v0(j, j2, j3, f, i);
    }

    @Override // defpackage.qf0
    public final void w0(g9 g9Var, long j, long j2, long j3, float f, yx yxVar, int i) {
        this.f.w0(g9Var, j, j2, j3, f, yxVar, i);
    }

    @Override // defpackage.qf0
    public final void x(dp dpVar, long j, long j2, float f, rf0 rf0Var, int i) {
        this.f.x(dpVar, j, j2, f, rf0Var, i);
    }

    @Override // defpackage.qf0
    public final long y0() {
        return this.f.y0();
    }

    @Override // defpackage.qf0
    public final void z(da daVar, dp dpVar, float f, rf0 rf0Var, int i) {
        this.f.z(daVar, dpVar, f, rf0Var, i);
    }
}
