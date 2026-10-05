package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class nb1 extends ex1 {
    public static final w9 m0;
    public kb1 i0;
    public m30 j0;
    public lb1 k0;
    public dj l0;

    static {
        w9 w9VarD = cl3.d();
        int i = wx.h;
        w9VarD.h(wx.e);
        w9VarD.o(1.0f);
        w9VarD.p(1);
        m0 = w9VarD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public nb1(tb1 tb1Var, kb1 kb1Var) {
        super(tb1Var);
        this.i0 = kb1Var;
        this.k0 = tb1Var.n != null ? new lb1(this) : null;
        this.l0 = (((aq1) kb1Var).f.h & 512) != 0 ? new dj(this, (i23) kb1Var) : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    @Override // defpackage.i62
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K0(long j, float f, ns0 ns0Var) {
        if (this.A) {
            cl1 cl1VarU1 = u1();
            cl1VarU1.getClass();
            N1(cl1VarU1.A, f, ns0Var);
        } else {
            N1(j, f, ns0Var);
        }
        if (this.s) {
            return;
        }
        I1();
        ex1 ex1Var = this.C;
        ex1Var.getClass();
        dj djVar = this.l0;
        if (djVar != null) {
            this.k0.getClass();
            if (!djVar.h) {
                long j2 = this.h;
                lb1 lb1Var = this.k0;
                if (p41.a(j2, lb1Var != null ? new p41(lb1Var.m1()) : null)) {
                    long j3 = ex1Var.h;
                    cl1 cl1VarU12 = ex1Var.u1();
                    boolean z = p41.a(j3, cl1VarU12 != null ? new p41(cl1VarU12.m1()) : null);
                    ex1Var.A = z;
                }
            }
        }
        boolean z2 = ex1Var.t;
        ex1Var.t = this.t;
        d1().a();
        ex1Var.t = z2;
        ex1Var.A = false;
    }

    @Override // defpackage.ex1
    public final void M1(pr prVar, qw0 qw0Var) {
        ex1 ex1Var;
        ex1 ex1Var2 = this.C;
        ex1Var2.getClass();
        ex1Var2.p1(prVar, qw0Var);
        if (!((h7) wb1.a(this.z)).getShowLayoutBounds() || (ex1Var = this.C) == null) {
            return;
        }
        if (p41.b(this.h, ex1Var.h) && i41.a(ex1Var.M, 0L)) {
            return;
        }
        long j = this.h;
        prVar.p(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, m0);
    }

    @Override // defpackage.al1
    public final int Q0(i5 i5Var) {
        lb1 lb1Var = this.k0;
        if (lb1Var == null) {
            return gq.o(this, i5Var);
        }
        wr1 wr1Var = lb1Var.E;
        int iD = wr1Var.d(i5Var);
        if (iD >= 0) {
            return wr1Var.c[iD];
        }
        return Integer.MIN_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Z1(kb1 kb1Var) {
        if (!kb1Var.equals(this.i0)) {
            if ((((aq1) kb1Var).f.h & 512) != 0) {
                i23 i23Var = (i23) kb1Var;
                dj djVar = this.l0;
                if (djVar != null) {
                    djVar.g = i23Var;
                } else {
                    djVar = new dj(this, i23Var);
                }
                this.l0 = djVar;
            } else {
                this.l0 = null;
            }
        }
        this.i0 = kb1Var;
    }

    @Override // defpackage.xm1
    public final int m0(int i) {
        dj djVar = this.l0;
        if (djVar == null) {
            kb1 kb1Var = this.i0;
            ex1 ex1Var = this.C;
            ex1Var.getClass();
            return kb1Var.r0(this, ex1Var, i);
        }
        i23 i23Var = djVar.g;
        ex1 ex1Var2 = this.C;
        ex1Var2.getClass();
        ex1 ex1Var3 = i23Var.f.m;
        ex1Var3.getClass();
        cl1 cl1VarU1 = ex1Var3.u1();
        cl1VarU1.getClass();
        if (!cl1VarU1.Y0()) {
            return ex1Var2.m0(i);
        }
        return i23Var.p1(new aj(djVar, djVar.getLayoutDirection()), new w80(ex1Var2, hx1.f, ix1.f, 2), n30.b(0, 0, 0, i, 7)).g();
    }

    @Override // defpackage.ex1
    public final void r1() {
        if (this.k0 == null) {
            this.k0 = new lb1(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    @Override // defpackage.xm1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final i62 t(long j) {
        dn1 dn1VarT;
        m30 m30Var;
        if (this.B) {
            m30 m30Var2 = this.j0;
            if (m30Var2 == null) {
                c.p("Lookahead constraints cannot be null in approach pass.");
                return null;
            }
            j = m30Var2.a;
        }
        M0(j);
        dj djVar = this.l0;
        if (djVar != null) {
            i23 i23Var = djVar.g;
            lb1 lb1Var = djVar.f.k0;
            lb1Var.getClass();
            dn1 dn1VarD1 = lb1Var.d1();
            dn1VarD1.g();
            dn1VarD1.d();
            boolean z = (i23Var.x.k() && i23Var.x.f().a() && i23Var.x.f().b.a()) || (m30Var = this.j0) == null || j != m30Var.a;
            djVar.h = z;
            if (!z) {
                ex1 ex1Var = this.C;
                ex1Var.getClass();
                ex1Var.B = true;
            }
            ex1 ex1Var2 = this.C;
            ex1Var2.getClass();
            dn1VarT = i23Var.p1(djVar, ex1Var2, j);
            ex1 ex1Var3 = this.C;
            ex1Var3.getClass();
            ex1Var3.B = false;
            int iG = dn1VarT.g();
            lb1 lb1Var2 = this.k0;
            lb1Var2.getClass();
            if (iG == lb1Var2.f) {
                int iD = dn1VarT.d();
                lb1 lb1Var3 = this.k0;
                lb1Var3.getClass();
                boolean z2 = iD == lb1Var3.g;
                if (!djVar.h) {
                    ex1 ex1Var4 = this.C;
                    ex1Var4.getClass();
                    long j2 = ex1Var4.h;
                    ex1 ex1Var5 = this.C;
                    ex1Var5.getClass();
                    cl1 cl1VarU1 = ex1Var5.u1();
                    if (p41.a(j2, cl1VarU1 != null ? new p41(cl1VarU1.m1()) : null) && !z2) {
                        dn1VarT = new mb1(dn1VarT, this);
                    }
                }
            }
        } else {
            kb1 kb1Var = this.i0;
            ex1 ex1Var6 = this.C;
            ex1Var6.getClass();
            dn1VarT = kb1Var.t(this, ex1Var6, j);
        }
        Q1(dn1VarT);
        H1();
        return this;
    }

    @Override // defpackage.xm1
    public final int u0(int i) {
        dj djVar = this.l0;
        if (djVar == null) {
            kb1 kb1Var = this.i0;
            ex1 ex1Var = this.C;
            ex1Var.getClass();
            return kb1Var.y(this, ex1Var, i);
        }
        i23 i23Var = djVar.g;
        ex1 ex1Var2 = this.C;
        ex1Var2.getClass();
        ex1 ex1Var3 = i23Var.f.m;
        ex1Var3.getClass();
        cl1 cl1VarU1 = ex1Var3.u1();
        cl1VarU1.getClass();
        if (!cl1VarU1.Y0()) {
            return ex1Var2.u0(i);
        }
        return i23Var.p1(new aj(djVar, djVar.getLayoutDirection()), new w80(ex1Var2, hx1.g, ix1.f, 2), n30.b(0, 0, 0, i, 7)).g();
    }

    @Override // defpackage.ex1
    public final cl1 u1() {
        return this.k0;
    }

    @Override // defpackage.ex1
    public final aq1 w1() {
        return ((aq1) this.i0).f;
    }

    @Override // defpackage.xm1
    public final int x0(int i) {
        dj djVar = this.l0;
        if (djVar == null) {
            kb1 kb1Var = this.i0;
            ex1 ex1Var = this.C;
            ex1Var.getClass();
            return kb1Var.Y(this, ex1Var, i);
        }
        i23 i23Var = djVar.g;
        ex1 ex1Var2 = this.C;
        ex1Var2.getClass();
        ex1 ex1Var3 = i23Var.f.m;
        ex1Var3.getClass();
        cl1 cl1VarU1 = ex1Var3.u1();
        cl1VarU1.getClass();
        if (!cl1VarU1.Y0()) {
            return ex1Var2.x0(i);
        }
        return i23Var.p1(new aj(djVar, djVar.getLayoutDirection()), new w80(ex1Var2, hx1.f, ix1.g, 2), n30.b(0, i, 0, 0, 13)).d();
    }

    @Override // defpackage.xm1
    public final int y(int i) {
        dj djVar = this.l0;
        if (djVar == null) {
            kb1 kb1Var = this.i0;
            ex1 ex1Var = this.C;
            ex1Var.getClass();
            return kb1Var.I(this, ex1Var, i);
        }
        i23 i23Var = djVar.g;
        ex1 ex1Var2 = this.C;
        ex1Var2.getClass();
        ex1 ex1Var3 = i23Var.f.m;
        ex1Var3.getClass();
        cl1 cl1VarU1 = ex1Var3.u1();
        cl1VarU1.getClass();
        if (!cl1VarU1.Y0()) {
            return ex1Var2.y(i);
        }
        return i23Var.p1(new aj(djVar, djVar.getLayoutDirection()), new w80(ex1Var2, hx1.g, ix1.g, 2), n30.b(0, i, 0, 0, 13)).d();
    }
}
