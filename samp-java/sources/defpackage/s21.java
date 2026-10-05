package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D1(defpackage.dx1 r12, long r13, defpackage.ly0 r15, int r16, boolean r17) {
        /*
            r11 = this;
            tb1 r0 = r11.z
            boolean r1 = r12.h(r0)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L30
            boolean r1 = r11.Y1(r13)
            if (r1 == 0) goto L16
            r9 = r16
            r10 = r17
        L14:
            r3 = r2
            goto L34
        L16:
            r9 = r16
            if (r9 != r2) goto L32
            long r4 = r11.v1()
            float r11 = r11.o1(r13, r4)
            int r11 = java.lang.Float.floatToRawIntBits(r11)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r11 = r11 & r1
            r1 = 2139095040(0x7f800000, float:Infinity)
            if (r11 >= r1) goto L32
            r10 = r3
            goto L14
        L30:
            r9 = r16
        L32:
            r10 = r17
        L34:
            if (r3 == 0) goto L7a
            int r11 = r15.h
            qs1 r0 = r0.y()
            java.lang.Object[] r1 = r0.f
            int r0 = r0.h
            int r0 = r0 - r2
        L41:
            if (r0 < 0) goto L78
            r2 = r1[r0]
            r5 = r2
            tb1 r5 = (defpackage.tb1) r5
            boolean r2 = r5.I()
            if (r2 == 0) goto L73
            r4 = r12
            r6 = r13
            r8 = r15
            r4.d(r5, r6, r8, r9, r10)
            long r2 = r15.a()
            float r6 = defpackage.vp.E(r2)
            r7 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L73
            boolean r6 = defpackage.vp.L(r2)
            if (r6 == 0) goto L73
            boolean r2 = defpackage.vp.K(r2)
            if (r2 != 0) goto L73
            boolean r2 = r12.e(r15, r5)
            if (r2 == 0) goto L78
        L73:
            int r0 = r0 + (-1)
            r9 = r16
            goto L41
        L78:
            r15.h = r11
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s21.D1(dx1, long, ly0, int, boolean):void");
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
