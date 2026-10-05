package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class s21 extends ex1 {
    public static final w9 k0;
    public final rc3 i0;
    public r21 j0;

    static {
        w9 w9VarD = cl3.d();
        int i = wx.h;
        w9VarD.h(wx.d);
        w9VarD.o(1.0f);
        w9VarD.p(1);
        k0 = w9VarD;
    }

    public s21(tb1 tb1Var) {
        super(tb1Var);
        rc3 rc3Var = new rc3();
        rc3Var.i = 0;
        this.i0 = rc3Var;
        rc3Var.m = this;
        this.j0 = tb1Var.n != null ? new r21(this) : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.ex1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D1(dx1 dx1Var, long j, ly0 ly0Var, int i, boolean z) {
        int i2;
        boolean z2;
        tb1 tb1Var = this.z;
        boolean z3 = false;
        if (dx1Var.h(tb1Var)) {
            if (Y1(j)) {
                i2 = i;
                z2 = z;
            } else {
                i2 = i;
                if (i2 == 1 && (Float.floatToRawIntBits(o1(j, v1())) & Integer.MAX_VALUE) < 2139095040) {
                    z2 = false;
                }
            }
            z3 = true;
            if (z3) {
                return;
            }
            int i3 = ly0Var.h;
            qs1 qs1VarY = tb1Var.y();
            Object[] objArr = qs1VarY.f;
            int i4 = qs1VarY.h - 1;
            while (i4 >= 0) {
                tb1 tb1Var2 = (tb1) objArr[i4];
                if (tb1Var2.I()) {
                    dx1Var.d(tb1Var2, j, ly0Var, i2, z2);
                    long jA = ly0Var.a();
                    if (vp.E(jA) < 0.0f && vp.L(jA) && !vp.K(jA) && !dx1Var.e(ly0Var, tb1Var2)) {
                        break;
                    }
                }
                i4--;
                i2 = i;
            }
            ly0Var.h = i3;
            return;
        }
        i2 = i;
        z2 = z;
        if (z3) {
        }
    }

    @Override // defpackage.i62
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
        this.z.M.p.U0();
    }

    @Override // defpackage.ex1
    public final void M1(pr prVar, qw0 qw0Var) {
        tb1 tb1Var = this.z;
        q12 q12VarA = wb1.a(tb1Var);
        qs1 qs1VarY = tb1Var.y();
        Object[] objArr = qs1VarY.f;
        int i = qs1VarY.h;
        for (int i2 = 0; i2 < i; i2++) {
            tb1 tb1Var2 = (tb1) objArr[i2];
            if (tb1Var2.I()) {
                tb1Var2.i(prVar, qw0Var);
            }
        }
        if (((h7) q12VarA).getShowLayoutBounds()) {
            long j = this.h;
            prVar.p(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, k0);
        }
    }

    @Override // defpackage.al1
    public final int Q0(i5 i5Var) {
        r21 r21Var = this.j0;
        if (r21Var != null) {
            return r21Var.Q0(i5Var);
        }
        bn1 bn1Var = this.z.M.p;
        ub1 ub1Var = bn1Var.C;
        if (!bn1Var.r) {
            if (bn1Var.k.d == pb1.f) {
                ub1Var.f = true;
                if (ub1Var.b) {
                    bn1Var.A = true;
                    bn1Var.B = true;
                }
            } else {
                ub1Var.g = true;
            }
        }
        s21 s21VarI = bn1Var.I();
        boolean z = s21VarI.t;
        s21VarI.t = true;
        bn1Var.L();
        s21VarI.t = z;
        Integer num = (Integer) ub1Var.i.get(i5Var);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.xm1
    public final int m0(int i) {
        a31 a31VarT = this.z.t();
        cn1 cn1VarV = a31VarT.v();
        tb1 tb1Var = (tb1) a31VarT.g;
        return cn1VarV.e(tb1Var.L.d, tb1Var.m(), i);
    }

    @Override // defpackage.ex1
    public final void r1() {
        if (this.j0 == null) {
            this.j0 = new r21(this);
        }
    }

    @Override // defpackage.xm1
    public final i62 t(long j) {
        if (this.B) {
            r21 r21Var = this.j0;
            r21Var.getClass();
            j = r21Var.i;
        }
        M0(j);
        tb1 tb1Var = this.z;
        qs1 qs1VarZ = tb1Var.z();
        Object[] objArr = qs1VarZ.f;
        int i = qs1VarZ.h;
        for (int i2 = 0; i2 < i; i2++) {
            ((tb1) objArr[i2]).M.p.q = rb1.h;
        }
        Q1(tb1Var.C.c(this, tb1Var.m(), j));
        H1();
        return this;
    }

    @Override // defpackage.xm1
    public final int u0(int i) {
        a31 a31VarT = this.z.t();
        cn1 cn1VarV = a31VarT.v();
        tb1 tb1Var = (tb1) a31VarT.g;
        return cn1VarV.b(tb1Var.L.d, tb1Var.m(), i);
    }

    @Override // defpackage.ex1
    public final cl1 u1() {
        return this.j0;
    }

    @Override // defpackage.ex1
    public final aq1 w1() {
        return this.i0;
    }

    @Override // defpackage.xm1
    public final int x0(int i) {
        a31 a31VarT = this.z.t();
        cn1 cn1VarV = a31VarT.v();
        tb1 tb1Var = (tb1) a31VarT.g;
        return cn1VarV.d(tb1Var.L.d, tb1Var.m(), i);
    }

    @Override // defpackage.xm1
    public final int y(int i) {
        a31 a31VarT = this.z.t();
        cn1 cn1VarV = a31VarT.v();
        tb1 tb1Var = (tb1) a31VarT.g;
        return cn1VarV.a(tb1Var.L.d, tb1Var.m(), i);
    }
}
