package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class gl1 extends i62 implements xm1, m5, nq1 {
    public final el1 A;
    public Object C;
    public final el1 E;
    public final el1 F;
    public boolean G;
    public final xb1 k;
    public boolean l;
    public boolean p;
    public boolean q;
    public boolean r;
    public m30 s;
    public ns0 u;
    public boolean z;
    public int m = Integer.MAX_VALUE;
    public int n = Integer.MAX_VALUE;
    public rb1 o = rb1.h;
    public long t = 0;
    public fl1 v = fl1.h;
    public final ub1 w = new ub1(this, 1);
    public final qs1 x = new qs1(new gl1[16]);
    public boolean y = true;
    public boolean B = true;
    public long D = n30.b(0, 0, 0, 0, 15);

    /* JADX WARN: Type inference failed for: r0v6, types: [el1] */
    /* JADX WARN: Type inference failed for: r5v4, types: [el1] */
    /* JADX WARN: Type inference failed for: r5v5, types: [el1] */
    public gl1(xb1 xb1Var) {
        this.k = xb1Var;
        final int i = 1;
        final int i2 = 0;
        this.A = new cs0(this) { // from class: el1
            public final /* synthetic */ gl1 g;

            {
                this.g = this;
            }

            @Override // defpackage.cs0
            public final Object a() {
                cl1 cl1VarU1;
                int i3 = i2;
                dm3 dm3Var = dm3.a;
                as1 as1Var = null;
                placementScope = null;
                placementScope = null;
                h62 placementScope = null;
                gl1 gl1Var = this.g;
                switch (i3) {
                    case 0:
                        xb1 xb1Var2 = gl1Var.k;
                        xb1Var2.h = 0;
                        tb1 tb1Var = xb1Var2.a;
                        qs1 qs1VarZ = tb1Var.z();
                        Object[] objArr = qs1VarZ.f;
                        int i4 = qs1VarZ.h;
                        for (int i5 = 0; i5 < i4; i5++) {
                            gl1 gl1Var2 = ((tb1) objArr[i5]).M.q;
                            gl1Var2.getClass();
                            gl1Var2.m = gl1Var2.n;
                            gl1Var2.n = Integer.MAX_VALUE;
                            if (gl1Var2.o == rb1.g) {
                                gl1Var2.o = rb1.h;
                            }
                        }
                        qs1 qs1VarZ2 = tb1Var.z();
                        Object[] objArr2 = qs1VarZ2.f;
                        int i6 = qs1VarZ2.h;
                        for (int i7 = 0; i7 < i6; i7++) {
                            gl1 gl1Var3 = ((tb1) objArr2[i7]).M.q;
                            gl1Var3.getClass();
                            gl1Var3.w.d = false;
                        }
                        r21 r21Var = gl1Var.I().j0;
                        if (r21Var == null) {
                            c.q("Expected lookahead delegate");
                        } else {
                            yr1 yr1Var = (yr1) tb1Var.n();
                            int i8 = ((qs1) yr1Var.g).h;
                            for (int i9 = 0; i9 < i8; i9++) {
                                tb1 tb1Var2 = (tb1) yr1Var.get(i9);
                                cl1 cl1VarU12 = tb1Var2.L.d.u1();
                                if (cl1VarU12 != null) {
                                    if (cl1VarU12.t) {
                                        if (as1Var == null) {
                                            as1Var = new as1();
                                        }
                                        as1Var.b(tb1Var2);
                                    }
                                    cl1VarU12.t = r21Var.t;
                                }
                            }
                            r21Var.d1().a();
                            yr1 yr1Var2 = (yr1) tb1Var.n();
                            int i10 = ((qs1) yr1Var2.g).h;
                            int i11 = 0;
                            while (true) {
                                if (i11 >= i10) {
                                    qs1 qs1VarZ3 = tb1Var.z();
                                    Object[] objArr3 = qs1VarZ3.f;
                                    int i12 = qs1VarZ3.h;
                                    for (int i13 = 0; i13 < i12; i13++) {
                                        gl1 gl1Var4 = ((tb1) objArr3[i13]).M.q;
                                        gl1Var4.getClass();
                                        int i14 = gl1Var4.m;
                                        int i15 = gl1Var4.n;
                                        if (i14 != i15 && i15 == Integer.MAX_VALUE) {
                                            gl1Var4.Q0(true);
                                        }
                                    }
                                    qs1 qs1VarZ4 = tb1Var.z();
                                    Object[] objArr4 = qs1VarZ4.f;
                                    int i16 = qs1VarZ4.h;
                                    for (int i17 = 0; i17 < i16; i17++) {
                                        gl1 gl1Var5 = ((tb1) objArr4[i17]).M.q;
                                        gl1Var5.getClass();
                                        ub1 ub1Var = gl1Var5.w;
                                        ub1Var.e = ub1Var.d;
                                    }
                                } else {
                                    tb1 tb1Var3 = (tb1) yr1Var2.get(i11);
                                    boolean z = as1Var != null && as1Var.h(tb1Var3) >= 0;
                                    cl1 cl1VarU13 = tb1Var3.L.d.u1();
                                    if (cl1VarU13 != null) {
                                        cl1VarU13.t = z;
                                    }
                                    i11++;
                                }
                            }
                        }
                        break;
                    case 1:
                        cl1 cl1VarU14 = gl1Var.k.a().u1();
                        cl1VarU14.getClass();
                        cl1VarU14.t(gl1Var.D);
                        break;
                    default:
                        xb1 xb1Var3 = gl1Var.k;
                        if (pq.H(xb1Var3.a) || xb1Var3.c) {
                            ex1 ex1Var = xb1Var3.a().D;
                            if (ex1Var != null) {
                                placementScope = ex1Var.u;
                            }
                        } else {
                            ex1 ex1Var2 = xb1Var3.a().D;
                            if (ex1Var2 != null && (cl1VarU1 = ex1Var2.u1()) != null) {
                                placementScope = cl1VarU1.u;
                            }
                        }
                        if (placementScope == null) {
                            placementScope = ((h7) wb1.a(xb1Var3.a)).getPlacementScope();
                        }
                        cl1 cl1VarU15 = xb1Var3.a().u1();
                        cl1VarU15.getClass();
                        h62.E(placementScope, cl1VarU15, gl1Var.t);
                        break;
                }
                return dm3Var;
            }
        };
        this.C = xb1Var.p.w;
        this.E = new cs0(this) { // from class: el1
            public final /* synthetic */ gl1 g;

            {
                this.g = this;
            }

            @Override // defpackage.cs0
            public final Object a() {
                cl1 cl1VarU1;
                int i3 = i;
                dm3 dm3Var = dm3.a;
                as1 as1Var = null;
                placementScope = null;
                placementScope = null;
                h62 placementScope = null;
                gl1 gl1Var = this.g;
                switch (i3) {
                    case 0:
                        xb1 xb1Var2 = gl1Var.k;
                        xb1Var2.h = 0;
                        tb1 tb1Var = xb1Var2.a;
                        qs1 qs1VarZ = tb1Var.z();
                        Object[] objArr = qs1VarZ.f;
                        int i4 = qs1VarZ.h;
                        for (int i5 = 0; i5 < i4; i5++) {
                            gl1 gl1Var2 = ((tb1) objArr[i5]).M.q;
                            gl1Var2.getClass();
                            gl1Var2.m = gl1Var2.n;
                            gl1Var2.n = Integer.MAX_VALUE;
                            if (gl1Var2.o == rb1.g) {
                                gl1Var2.o = rb1.h;
                            }
                        }
                        qs1 qs1VarZ2 = tb1Var.z();
                        Object[] objArr2 = qs1VarZ2.f;
                        int i6 = qs1VarZ2.h;
                        for (int i7 = 0; i7 < i6; i7++) {
                            gl1 gl1Var3 = ((tb1) objArr2[i7]).M.q;
                            gl1Var3.getClass();
                            gl1Var3.w.d = false;
                        }
                        r21 r21Var = gl1Var.I().j0;
                        if (r21Var == null) {
                            c.q("Expected lookahead delegate");
                        } else {
                            yr1 yr1Var = (yr1) tb1Var.n();
                            int i8 = ((qs1) yr1Var.g).h;
                            for (int i9 = 0; i9 < i8; i9++) {
                                tb1 tb1Var2 = (tb1) yr1Var.get(i9);
                                cl1 cl1VarU12 = tb1Var2.L.d.u1();
                                if (cl1VarU12 != null) {
                                    if (cl1VarU12.t) {
                                        if (as1Var == null) {
                                            as1Var = new as1();
                                        }
                                        as1Var.b(tb1Var2);
                                    }
                                    cl1VarU12.t = r21Var.t;
                                }
                            }
                            r21Var.d1().a();
                            yr1 yr1Var2 = (yr1) tb1Var.n();
                            int i10 = ((qs1) yr1Var2.g).h;
                            int i11 = 0;
                            while (true) {
                                if (i11 >= i10) {
                                    qs1 qs1VarZ3 = tb1Var.z();
                                    Object[] objArr3 = qs1VarZ3.f;
                                    int i12 = qs1VarZ3.h;
                                    for (int i13 = 0; i13 < i12; i13++) {
                                        gl1 gl1Var4 = ((tb1) objArr3[i13]).M.q;
                                        gl1Var4.getClass();
                                        int i14 = gl1Var4.m;
                                        int i15 = gl1Var4.n;
                                        if (i14 != i15 && i15 == Integer.MAX_VALUE) {
                                            gl1Var4.Q0(true);
                                        }
                                    }
                                    qs1 qs1VarZ4 = tb1Var.z();
                                    Object[] objArr4 = qs1VarZ4.f;
                                    int i16 = qs1VarZ4.h;
                                    for (int i17 = 0; i17 < i16; i17++) {
                                        gl1 gl1Var5 = ((tb1) objArr4[i17]).M.q;
                                        gl1Var5.getClass();
                                        ub1 ub1Var = gl1Var5.w;
                                        ub1Var.e = ub1Var.d;
                                    }
                                } else {
                                    tb1 tb1Var3 = (tb1) yr1Var2.get(i11);
                                    boolean z = as1Var != null && as1Var.h(tb1Var3) >= 0;
                                    cl1 cl1VarU13 = tb1Var3.L.d.u1();
                                    if (cl1VarU13 != null) {
                                        cl1VarU13.t = z;
                                    }
                                    i11++;
                                }
                            }
                        }
                        break;
                    case 1:
                        cl1 cl1VarU14 = gl1Var.k.a().u1();
                        cl1VarU14.getClass();
                        cl1VarU14.t(gl1Var.D);
                        break;
                    default:
                        xb1 xb1Var3 = gl1Var.k;
                        if (pq.H(xb1Var3.a) || xb1Var3.c) {
                            ex1 ex1Var = xb1Var3.a().D;
                            if (ex1Var != null) {
                                placementScope = ex1Var.u;
                            }
                        } else {
                            ex1 ex1Var2 = xb1Var3.a().D;
                            if (ex1Var2 != null && (cl1VarU1 = ex1Var2.u1()) != null) {
                                placementScope = cl1VarU1.u;
                            }
                        }
                        if (placementScope == null) {
                            placementScope = ((h7) wb1.a(xb1Var3.a)).getPlacementScope();
                        }
                        cl1 cl1VarU15 = xb1Var3.a().u1();
                        cl1VarU15.getClass();
                        h62.E(placementScope, cl1VarU15, gl1Var.t);
                        break;
                }
                return dm3Var;
            }
        };
        final int i3 = 2;
        this.F = new cs0(this) { // from class: el1
            public final /* synthetic */ gl1 g;

            {
                this.g = this;
            }

            @Override // defpackage.cs0
            public final Object a() {
                cl1 cl1VarU1;
                int i32 = i3;
                dm3 dm3Var = dm3.a;
                as1 as1Var = null;
                placementScope = null;
                placementScope = null;
                h62 placementScope = null;
                gl1 gl1Var = this.g;
                switch (i32) {
                    case 0:
                        xb1 xb1Var2 = gl1Var.k;
                        xb1Var2.h = 0;
                        tb1 tb1Var = xb1Var2.a;
                        qs1 qs1VarZ = tb1Var.z();
                        Object[] objArr = qs1VarZ.f;
                        int i4 = qs1VarZ.h;
                        for (int i5 = 0; i5 < i4; i5++) {
                            gl1 gl1Var2 = ((tb1) objArr[i5]).M.q;
                            gl1Var2.getClass();
                            gl1Var2.m = gl1Var2.n;
                            gl1Var2.n = Integer.MAX_VALUE;
                            if (gl1Var2.o == rb1.g) {
                                gl1Var2.o = rb1.h;
                            }
                        }
                        qs1 qs1VarZ2 = tb1Var.z();
                        Object[] objArr2 = qs1VarZ2.f;
                        int i6 = qs1VarZ2.h;
                        for (int i7 = 0; i7 < i6; i7++) {
                            gl1 gl1Var3 = ((tb1) objArr2[i7]).M.q;
                            gl1Var3.getClass();
                            gl1Var3.w.d = false;
                        }
                        r21 r21Var = gl1Var.I().j0;
                        if (r21Var == null) {
                            c.q("Expected lookahead delegate");
                        } else {
                            yr1 yr1Var = (yr1) tb1Var.n();
                            int i8 = ((qs1) yr1Var.g).h;
                            for (int i9 = 0; i9 < i8; i9++) {
                                tb1 tb1Var2 = (tb1) yr1Var.get(i9);
                                cl1 cl1VarU12 = tb1Var2.L.d.u1();
                                if (cl1VarU12 != null) {
                                    if (cl1VarU12.t) {
                                        if (as1Var == null) {
                                            as1Var = new as1();
                                        }
                                        as1Var.b(tb1Var2);
                                    }
                                    cl1VarU12.t = r21Var.t;
                                }
                            }
                            r21Var.d1().a();
                            yr1 yr1Var2 = (yr1) tb1Var.n();
                            int i10 = ((qs1) yr1Var2.g).h;
                            int i11 = 0;
                            while (true) {
                                if (i11 >= i10) {
                                    qs1 qs1VarZ3 = tb1Var.z();
                                    Object[] objArr3 = qs1VarZ3.f;
                                    int i12 = qs1VarZ3.h;
                                    for (int i13 = 0; i13 < i12; i13++) {
                                        gl1 gl1Var4 = ((tb1) objArr3[i13]).M.q;
                                        gl1Var4.getClass();
                                        int i14 = gl1Var4.m;
                                        int i15 = gl1Var4.n;
                                        if (i14 != i15 && i15 == Integer.MAX_VALUE) {
                                            gl1Var4.Q0(true);
                                        }
                                    }
                                    qs1 qs1VarZ4 = tb1Var.z();
                                    Object[] objArr4 = qs1VarZ4.f;
                                    int i16 = qs1VarZ4.h;
                                    for (int i17 = 0; i17 < i16; i17++) {
                                        gl1 gl1Var5 = ((tb1) objArr4[i17]).M.q;
                                        gl1Var5.getClass();
                                        ub1 ub1Var = gl1Var5.w;
                                        ub1Var.e = ub1Var.d;
                                    }
                                } else {
                                    tb1 tb1Var3 = (tb1) yr1Var2.get(i11);
                                    boolean z = as1Var != null && as1Var.h(tb1Var3) >= 0;
                                    cl1 cl1VarU13 = tb1Var3.L.d.u1();
                                    if (cl1VarU13 != null) {
                                        cl1VarU13.t = z;
                                    }
                                    i11++;
                                }
                            }
                        }
                        break;
                    case 1:
                        cl1 cl1VarU14 = gl1Var.k.a().u1();
                        cl1VarU14.getClass();
                        cl1VarU14.t(gl1Var.D);
                        break;
                    default:
                        xb1 xb1Var3 = gl1Var.k;
                        if (pq.H(xb1Var3.a) || xb1Var3.c) {
                            ex1 ex1Var = xb1Var3.a().D;
                            if (ex1Var != null) {
                                placementScope = ex1Var.u;
                            }
                        } else {
                            ex1 ex1Var2 = xb1Var3.a().D;
                            if (ex1Var2 != null && (cl1VarU1 = ex1Var2.u1()) != null) {
                                placementScope = cl1VarU1.u;
                            }
                        }
                        if (placementScope == null) {
                            placementScope = ((h7) wb1.a(xb1Var3.a)).getPlacementScope();
                        }
                        cl1 cl1VarU15 = xb1Var3.a().u1();
                        cl1VarU15.getClass();
                        h62.E(placementScope, cl1VarU15, gl1Var.t);
                        break;
                }
                return dm3Var;
            }
        };
    }

    @Override // defpackage.m5
    public final void C(s sVar) {
        qs1 qs1VarZ = this.k.a.z();
        Object[] objArr = qs1VarZ.f;
        int i = qs1VarZ.h;
        for (int i2 = 0; i2 < i; i2++) {
            gl1 gl1Var = ((tb1) objArr[i2]).M.q;
            gl1Var.getClass();
            sVar.h(gl1Var);
        }
    }

    @Override // defpackage.i62, defpackage.xm1
    public final Object E() {
        return this.C;
    }

    @Override // defpackage.i62
    public final int F0() {
        cl1 cl1VarU1 = this.k.a().u1();
        cl1VarU1.getClass();
        return cl1VarU1.F0();
    }

    @Override // defpackage.i62
    public final int G0() {
        cl1 cl1VarU1 = this.k.a().u1();
        cl1VarU1.getClass();
        return cl1VarU1.G0();
    }

    @Override // defpackage.nq1
    public final void H(boolean z) {
        cl1 cl1VarU1;
        xb1 xb1Var = this.k;
        cl1 cl1VarU12 = xb1Var.a().u1();
        if (Boolean.valueOf(z).equals(cl1VarU12 != null ? Boolean.valueOf(cl1VarU12.q) : null) || (cl1VarU1 = xb1Var.a().u1()) == null) {
            return;
        }
        cl1VarU1.q = z;
    }

    @Override // defpackage.m5
    public final s21 I() {
        return this.k.a.L.c;
    }

    @Override // defpackage.m5
    public final m5 K() {
        xb1 xb1Var;
        tb1 tb1VarU = this.k.a.u();
        if (tb1VarU == null || (xb1Var = tb1VarU.M) == null) {
            return null;
        }
        return xb1Var.q;
    }

    @Override // defpackage.i62
    public final void K0(long j, float f, ns0 ns0Var) {
        Y0(j, ns0Var);
    }

    @Override // defpackage.m5
    public final void L() {
        this.z = true;
        ub1 ub1Var = this.w;
        ub1Var.h();
        xb1 xb1Var = this.k;
        boolean z = xb1Var.f;
        tb1 tb1Var = xb1Var.a;
        if (z) {
            qs1 qs1VarZ = tb1Var.z();
            Object[] objArr = qs1VarZ.f;
            int i = qs1VarZ.h;
            for (int i2 = 0; i2 < i; i2++) {
                tb1 tb1Var2 = (tb1) objArr[i2];
                xb1 xb1Var2 = tb1Var2.M;
                if (xb1Var2.e && tb1Var2.s() == rb1.f) {
                    gl1 gl1Var = xb1Var2.q;
                    gl1Var.getClass();
                    gl1 gl1Var2 = xb1Var2.q;
                    m30 m30Var = gl1Var2 != null ? gl1Var2.s : null;
                    m30Var.getClass();
                    if (gl1Var.Z0(m30Var.a)) {
                        tb1.W(tb1Var, false, 7);
                    }
                }
            }
        }
        r21 r21Var = I().j0;
        r21Var.getClass();
        if (xb1Var.g || (!this.p && !r21Var.t && xb1Var.f)) {
            xb1Var.f = false;
            pb1 pb1Var = xb1Var.d;
            xb1Var.d = pb1.i;
            xb1Var.i(false);
            t12 snapshotObserver = ((h7) wb1.a(tb1Var)).getSnapshotObserver();
            snapshotObserver.a.d(tb1Var, snapshotObserver.h, this.A);
            xb1Var.d = pb1Var;
            if (xb1Var.m && r21Var.t) {
                requestLayout();
            }
            xb1Var.g = false;
        }
        if (ub1Var.d) {
            ub1Var.e = true;
        }
        if (ub1Var.b && ub1Var.e()) {
            ub1Var.g();
        }
        this.z = false;
    }

    public final boolean N0() {
        xb1 xb1Var = this.k;
        return pq.H(xb1Var.a) || xb1Var.c;
    }

    public final void Q0(boolean z) {
        if (z && N0()) {
            return;
        }
        if (z || N0()) {
            this.v = fl1.h;
            qs1 qs1VarZ = this.k.a.z();
            Object[] objArr = qs1VarZ.f;
            int i = qs1VarZ.h;
            for (int i2 = 0; i2 < i; i2++) {
                gl1 gl1Var = ((tb1) objArr[i2]).M.q;
                gl1Var.getClass();
                gl1Var.Q0(true);
            }
        }
    }

    public final void R0() {
        fl1 fl1Var = this.v;
        xb1 xb1Var = this.k;
        boolean z = xb1Var.c;
        tb1 tb1Var = xb1Var.a;
        fl1 fl1Var2 = fl1.f;
        if (z) {
            this.v = fl1.g;
        } else {
            this.v = fl1Var2;
        }
        if (fl1Var != fl1Var2 && xb1Var.e) {
            tb1.W(tb1Var, true, 6);
        }
        qs1 qs1VarZ = tb1Var.z();
        Object[] objArr = qs1VarZ.f;
        int i = qs1VarZ.h;
        for (int i2 = 0; i2 < i; i2++) {
            tb1 tb1Var2 = (tb1) objArr[i2];
            gl1 gl1Var = tb1Var2.M.q;
            if (gl1Var == null) {
                c.p("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                return;
            }
            if (gl1Var.n != Integer.MAX_VALUE) {
                gl1Var.R0();
                tb1.Z(tb1Var2);
            }
        }
    }

    public final void T0() {
        xb1 xb1Var = this.k;
        if (xb1Var.o > 0) {
            qs1 qs1VarZ = xb1Var.a.z();
            Object[] objArr = qs1VarZ.f;
            int i = qs1VarZ.h;
            for (int i2 = 0; i2 < i; i2++) {
                tb1 tb1Var = (tb1) objArr[i2];
                xb1 xb1Var2 = tb1Var.M;
                if ((xb1Var2.m || xb1Var2.n) && !xb1Var2.f) {
                    tb1Var.V(false);
                }
                gl1 gl1Var = xb1Var2.q;
                if (gl1Var != null) {
                    gl1Var.T0();
                }
            }
        }
    }

    public final void U0() {
        xb1 xb1Var = this.k;
        tb1.W(xb1Var.a, false, 7);
        tb1 tb1Var = xb1Var.a;
        tb1 tb1VarU = tb1Var.u();
        if (tb1VarU == null || tb1Var.I != rb1.h) {
            return;
        }
        int iOrdinal = tb1VarU.M.d.ordinal();
        tb1Var.I = iOrdinal != 0 ? iOrdinal != 2 ? tb1VarU.I : rb1.g : rb1.f;
    }

    public final void V0() {
        pb1 pb1Var;
        this.G = true;
        xb1 xb1Var = this.k;
        tb1 tb1VarU = xb1Var.a.u();
        fl1 fl1Var = this.v;
        if ((fl1Var != fl1.f && !xb1Var.c) || (fl1Var != fl1.g && xb1Var.c)) {
            R0();
            if (this.l && tb1VarU != null) {
                tb1VarU.V(false);
            }
        }
        if (tb1VarU != null) {
            xb1 xb1Var2 = tb1VarU.M;
            if (!this.l && ((pb1Var = xb1Var2.d) == pb1.h || pb1Var == pb1.i)) {
                if (this.n != Integer.MAX_VALUE) {
                    m21.c("Place was called on a node which was placed already");
                }
                int i = xb1Var2.h;
                this.n = i;
                xb1Var2.h = i + 1;
            }
        } else {
            this.n = 0;
        }
        L();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006e A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x000d, B:7:0x0013, B:9:0x0018, B:12:0x001d, B:14:0x0021, B:15:0x0026, B:17:0x0035, B:19:0x0039, B:22:0x003f, B:21:0x003d, B:23:0x0042, B:25:0x004c, B:30:0x0056, B:32:0x0084, B:31:0x006e), top: B:36:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y0(long r10, defpackage.ns0 r12) {
        /*
            r9 = this;
            xb1 r0 = r9.k
            tb1 r1 = r0.a
            tb1 r2 = r0.a
            r3 = 0
            tb1 r4 = r1.u()     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L12
            xb1 r4 = r4.M     // Catch: java.lang.Throwable -> L1b
            pb1 r4 = r4.d     // Catch: java.lang.Throwable -> L1b
            goto L13
        L12:
            r4 = r3
        L13:
            pb1 r5 = defpackage.pb1.i     // Catch: java.lang.Throwable -> L1b
            r6 = 0
            if (r4 != r5) goto L1d
            r0.c = r6     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r9 = move-exception
            goto L8b
        L1d:
            boolean r4 = r2.W     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L26
            java.lang.String r4 = "place is called on a deactivated node"
            defpackage.m21.a(r4)     // Catch: java.lang.Throwable -> L1b
        L26:
            r0.d = r5     // Catch: java.lang.Throwable -> L1b
            r4 = 1
            r9.q = r4     // Catch: java.lang.Throwable -> L1b
            r9.G = r6     // Catch: java.lang.Throwable -> L1b
            long r7 = r9.t     // Catch: java.lang.Throwable -> L1b
            boolean r5 = defpackage.i41.a(r10, r7)     // Catch: java.lang.Throwable -> L1b
            if (r5 != 0) goto L42
            boolean r5 = r0.n     // Catch: java.lang.Throwable -> L1b
            if (r5 != 0) goto L3d
            boolean r5 = r0.m     // Catch: java.lang.Throwable -> L1b
            if (r5 == 0) goto L3f
        L3d:
            r0.f = r4     // Catch: java.lang.Throwable -> L1b
        L3f:
            r9.T0()     // Catch: java.lang.Throwable -> L1b
        L42:
            q12 r5 = defpackage.wb1.a(r2)     // Catch: java.lang.Throwable -> L1b
            r9.t = r10     // Catch: java.lang.Throwable -> L1b
            boolean r7 = r0.f     // Catch: java.lang.Throwable -> L1b
            if (r7 != 0) goto L6e
            fl1 r7 = r9.v     // Catch: java.lang.Throwable -> L1b
            fl1 r8 = defpackage.fl1.h     // Catch: java.lang.Throwable -> L1b
            if (r7 == r8) goto L53
            goto L54
        L53:
            r4 = r6
        L54:
            if (r4 == 0) goto L6e
            ex1 r2 = r0.a()     // Catch: java.lang.Throwable -> L1b
            cl1 r2 = r2.u1()     // Catch: java.lang.Throwable -> L1b
            r2.getClass()     // Catch: java.lang.Throwable -> L1b
            long r4 = r2.j     // Catch: java.lang.Throwable -> L1b
            long r10 = defpackage.i41.c(r10, r4)     // Catch: java.lang.Throwable -> L1b
            r2.o1(r10)     // Catch: java.lang.Throwable -> L1b
            r9.V0()     // Catch: java.lang.Throwable -> L1b
            goto L84
        L6e:
            r0.h(r6)     // Catch: java.lang.Throwable -> L1b
            ub1 r10 = r9.w     // Catch: java.lang.Throwable -> L1b
            r10.g = r6     // Catch: java.lang.Throwable -> L1b
            h7 r5 = (defpackage.h7) r5     // Catch: java.lang.Throwable -> L1b
            t12 r10 = r5.getSnapshotObserver()     // Catch: java.lang.Throwable -> L1b
            el1 r11 = r9.F     // Catch: java.lang.Throwable -> L1b
            s12 r4 = r10.g     // Catch: java.lang.Throwable -> L1b
            p73 r10 = r10.a     // Catch: java.lang.Throwable -> L1b
            r10.d(r2, r4, r11)     // Catch: java.lang.Throwable -> L1b
        L84:
            r9.u = r12     // Catch: java.lang.Throwable -> L1b
            pb1 r9 = defpackage.pb1.j     // Catch: java.lang.Throwable -> L1b
            r0.d = r9     // Catch: java.lang.Throwable -> L1b
            return
        L8b:
            r1.b0(r9)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gl1.Y0(long, ns0):void");
    }

    public final boolean Z0(long j) {
        xb1 xb1Var = this.k;
        tb1 tb1Var = xb1Var.a;
        tb1 tb1Var2 = xb1Var.a;
        try {
            if (tb1Var.W) {
                m21.a("measure is called on a deactivated node");
            }
            tb1 tb1VarU = tb1Var2.u();
            tb1Var2.K = tb1Var2.K || (tb1VarU != null && tb1VarU.K);
            if (!tb1Var2.M.e) {
                m30 m30Var = this.s;
                if (m30Var == null ? false : m30.c(m30Var.a, j)) {
                    q12 q12Var = tb1Var2.t;
                    if (q12Var != null) {
                        ((h7) q12Var).j(tb1Var2, true);
                    }
                    tb1Var2.a0();
                    return false;
                }
            }
            this.s = new m30(j);
            M0(j);
            this.w.f = false;
            qs1 qs1VarZ = tb1Var2.z();
            Object[] objArr = qs1VarZ.f;
            int i = qs1VarZ.h;
            for (int i2 = 0; i2 < i; i2++) {
                gl1 gl1Var = ((tb1) objArr[i2]).M.q;
                gl1Var.getClass();
                gl1Var.w.c = false;
            }
            long j2 = this.r ? this.h : -9223372034707292160L;
            this.r = true;
            cl1 cl1VarU1 = xb1Var.a().u1();
            if (cl1VarU1 == null) {
                m21.c("Lookahead result from lookaheadRemeasure cannot be null");
            }
            xb1Var.c(j);
            L0((((long) cl1VarU1.f) << 32) | (((long) cl1VarU1.g) & 4294967295L));
            return (((int) (j2 >> 32)) == cl1VarU1.f && ((int) (j2 & 4294967295L)) == cl1VarU1.g) ? false : true;
        } catch (Throwable th) {
            tb1Var.b0(th);
            throw null;
        }
    }

    @Override // defpackage.m5
    public final ub1 c() {
        return this.w;
    }

    @Override // defpackage.xm1
    public final int m0(int i) {
        U0();
        cl1 cl1VarU1 = this.k.a().u1();
        cl1VarU1.getClass();
        return cl1VarU1.m0(i);
    }

    @Override // defpackage.m5
    public final int r0() {
        return this.n;
    }

    @Override // defpackage.m5
    public final void requestLayout() {
        this.k.a.V(false);
    }

    @Override // defpackage.m5
    public final void s0() {
        tb1.W(this.k.a, false, 7);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    @Override // defpackage.xm1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.i62 t(long r7) {
        /*
            r6 = this;
            xb1 r0 = r6.k
            tb1 r1 = r0.a
            tb1 r2 = r0.a
            tb1 r1 = r1.u()
            r3 = 0
            if (r1 == 0) goto L12
            xb1 r1 = r1.M
            pb1 r1 = r1.d
            goto L13
        L12:
            r1 = r3
        L13:
            pb1 r4 = defpackage.pb1.g
            if (r1 == r4) goto L27
            tb1 r1 = r2.u()
            if (r1 == 0) goto L22
            xb1 r1 = r1.M
            pb1 r1 = r1.d
            goto L23
        L22:
            r1 = r3
        L23:
            pb1 r4 = defpackage.pb1.i
            if (r1 != r4) goto L2a
        L27:
            r1 = 0
            r0.b = r1
        L2a:
            tb1 r0 = r2.u()
            rb1 r1 = defpackage.rb1.h
            if (r0 == 0) goto L64
            xb1 r0 = r0.M
            rb1 r4 = r6.o
            if (r4 == r1) goto L42
            boolean r4 = r2.K
            if (r4 == 0) goto L3d
            goto L42
        L3d:
            java.lang.String r4 = "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"
            defpackage.m21.c(r4)
        L42:
            pb1 r4 = r0.d
            int r4 = r4.ordinal()
            if (r4 == 0) goto L5f
            r5 = 1
            if (r4 == r5) goto L5f
            r5 = 2
            if (r4 == r5) goto L5c
            r5 = 3
            if (r4 != r5) goto L54
            goto L5c
        L54:
            pb1 r6 = r0.d
            java.lang.String r7 = "Measurable could be only measured from the parent's measure or layout block. Parents state is "
            defpackage.c.o(r6, r7)
            return r3
        L5c:
            rb1 r0 = defpackage.rb1.g
            goto L61
        L5f:
            rb1 r0 = defpackage.rb1.f
        L61:
            r6.o = r0
            goto L66
        L64:
            r6.o = r1
        L66:
            rb1 r0 = r2.I
            if (r0 != r1) goto L6d
            r2.c()
        L6d:
            r6.Z0(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gl1.t(long):i62");
    }

    @Override // defpackage.xm1
    public final int u0(int i) {
        U0();
        cl1 cl1VarU1 = this.k.a().u1();
        cl1VarU1.getClass();
        return cl1VarU1.u0(i);
    }

    @Override // defpackage.xm1
    public final int x0(int i) {
        U0();
        cl1 cl1VarU1 = this.k.a().u1();
        cl1VarU1.getClass();
        return cl1VarU1.x0(i);
    }

    @Override // defpackage.xm1
    public final int y(int i) {
        U0();
        cl1 cl1VarU1 = this.k.a().u1();
        cl1VarU1.getClass();
        return cl1VarU1.y(i);
    }

    @Override // defpackage.i62
    public final int z0(i5 i5Var) {
        xb1 xb1Var = this.k;
        tb1 tb1VarU = xb1Var.a.u();
        pb1 pb1Var = tb1VarU != null ? tb1VarU.M.d : null;
        pb1 pb1Var2 = pb1.g;
        ub1 ub1Var = this.w;
        if (pb1Var == pb1Var2) {
            ub1Var.c = true;
        } else {
            tb1 tb1VarU2 = xb1Var.a.u();
            if ((tb1VarU2 != null ? tb1VarU2.M.d : null) == pb1.i) {
                ub1Var.d = true;
            }
        }
        this.p = true;
        cl1 cl1VarU1 = xb1Var.a().u1();
        cl1VarU1.getClass();
        int iZ0 = cl1VarU1.z0(i5Var);
        this.p = false;
        return iZ0;
    }
}
