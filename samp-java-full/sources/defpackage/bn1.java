package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class bn1 extends i62 implements xm1, m5, nq1 {
    public boolean A;
    public boolean B;
    public boolean F;
    public final an1 H;
    public final an1 I;
    public float J;
    public boolean K;
    public ns0 L;
    public float N;
    public final an1 O;
    public boolean P;
    public final xb1 k;
    public boolean l;
    public boolean o;
    public boolean p;
    public boolean r;
    public ns0 t;
    public float u;
    public Object w;
    public boolean x;
    public boolean y;
    public boolean z;
    public int m = Integer.MAX_VALUE;
    public int n = Integer.MAX_VALUE;
    public rb1 q = rb1.h;
    public long s = 0;
    public boolean v = true;
    public final ub1 C = new ub1(this, 0);
    public final qs1 D = new qs1(new bn1[16]);
    public boolean E = true;
    public long G = n30.b(0, 0, 0, 0, 15);
    public long M = 0;

    /* JADX WARN: Type inference failed for: r2v3, types: [an1] */
    /* JADX WARN: Type inference failed for: r2v4, types: [an1] */
    /* JADX WARN: Type inference failed for: r7v4, types: [an1] */
    public bn1(xb1 xb1Var) {
        this.k = xb1Var;
        final int i = 1;
        final int i2 = 0;
        this.H = new cs0(this) { // from class: an1
            public final /* synthetic */ bn1 g;

            {
                this.g = this;
            }

            @Override // defpackage.cs0
            public final Object a() {
                h62 placementScope;
                int i3 = i2;
                dm3 dm3Var = dm3.a;
                bn1 bn1Var = this.g;
                switch (i3) {
                    case 0:
                        bn1Var.k.a().t(bn1Var.G);
                        break;
                    case 1:
                        xb1 xb1Var2 = bn1Var.k;
                        xb1Var2.i = 0;
                        tb1 tb1Var = xb1Var2.a;
                        qs1 qs1VarZ = tb1Var.z();
                        Object[] objArr = qs1VarZ.f;
                        int i4 = qs1VarZ.h;
                        for (int i5 = 0; i5 < i4; i5++) {
                            bn1 bn1Var2 = ((tb1) objArr[i5]).M.p;
                            bn1Var2.m = bn1Var2.n;
                            bn1Var2.n = Integer.MAX_VALUE;
                            bn1Var2.y = false;
                            if (bn1Var2.q == rb1.g) {
                                bn1Var2.q = rb1.h;
                            }
                        }
                        qs1 qs1VarZ2 = tb1Var.z();
                        Object[] objArr2 = qs1VarZ2.f;
                        int i6 = qs1VarZ2.h;
                        for (int i7 = 0; i7 < i6; i7++) {
                            ((tb1) objArr2[i7]).M.p.C.d = false;
                        }
                        if (bn1Var.I().t) {
                            yr1 yr1Var = (yr1) tb1Var.n();
                            int i8 = ((qs1) yr1Var.g).h;
                            for (int i9 = 0; i9 < i8; i9++) {
                                ((tb1) yr1Var.get(i9)).L.d.t = true;
                            }
                        }
                        bn1Var.I().d1().a();
                        if (bn1Var.I().t) {
                            yr1 yr1Var2 = (yr1) tb1Var.n();
                            int i10 = ((qs1) yr1Var2.g).h;
                            for (int i11 = 0; i11 < i10; i11++) {
                                ((tb1) yr1Var2.get(i11)).L.d.t = false;
                            }
                        }
                        qs1 qs1VarZ3 = tb1Var.z();
                        Object[] objArr3 = qs1VarZ3.f;
                        int i12 = qs1VarZ3.h;
                        for (int i13 = 0; i13 < i12; i13++) {
                            tb1 tb1Var2 = (tb1) objArr3[i13];
                            xb1 xb1Var3 = tb1Var2.M;
                            if (xb1Var3.p.m != tb1Var2.v()) {
                                tb1Var.O();
                                tb1Var.C();
                                if (tb1Var2.v() == Integer.MAX_VALUE) {
                                    if (xb1Var3.c || pq.H(tb1Var2)) {
                                        gl1 gl1Var = xb1Var3.q;
                                        gl1Var.getClass();
                                        gl1Var.Q0(false);
                                    }
                                    xb1Var3.p.R0();
                                }
                            }
                        }
                        qs1 qs1VarZ4 = tb1Var.z();
                        Object[] objArr4 = qs1VarZ4.f;
                        int i14 = qs1VarZ4.h;
                        for (int i15 = 0; i15 < i14; i15++) {
                            ub1 ub1Var = ((tb1) objArr4[i15]).M.p.C;
                            ub1Var.e = ub1Var.d;
                        }
                        break;
                    default:
                        xb1 xb1Var4 = bn1Var.k;
                        ex1 ex1Var = xb1Var4.a().D;
                        if (ex1Var == null || (placementScope = ex1Var.u) == null) {
                            placementScope = ((h7) wb1.a(xb1Var4.a)).getPlacementScope();
                        }
                        ns0 ns0Var = bn1Var.L;
                        if (ns0Var == null) {
                            ex1 ex1VarA = xb1Var4.a();
                            long j = bn1Var.M;
                            float f = bn1Var.N;
                            placementScope.getClass();
                            h62.c(placementScope, ex1VarA);
                            ex1VarA.K0(i41.c(j, ex1VarA.j), f, null);
                        } else {
                            ex1 ex1VarA2 = xb1Var4.a();
                            long j2 = bn1Var.M;
                            float f2 = bn1Var.N;
                            placementScope.getClass();
                            h62.c(placementScope, ex1VarA2);
                            ex1VarA2.K0(i41.c(j2, ex1VarA2.j), f2, ns0Var);
                        }
                        break;
                }
                return dm3Var;
            }
        };
        this.I = new cs0(this) { // from class: an1
            public final /* synthetic */ bn1 g;

            {
                this.g = this;
            }

            @Override // defpackage.cs0
            public final Object a() {
                h62 placementScope;
                int i3 = i;
                dm3 dm3Var = dm3.a;
                bn1 bn1Var = this.g;
                switch (i3) {
                    case 0:
                        bn1Var.k.a().t(bn1Var.G);
                        break;
                    case 1:
                        xb1 xb1Var2 = bn1Var.k;
                        xb1Var2.i = 0;
                        tb1 tb1Var = xb1Var2.a;
                        qs1 qs1VarZ = tb1Var.z();
                        Object[] objArr = qs1VarZ.f;
                        int i4 = qs1VarZ.h;
                        for (int i5 = 0; i5 < i4; i5++) {
                            bn1 bn1Var2 = ((tb1) objArr[i5]).M.p;
                            bn1Var2.m = bn1Var2.n;
                            bn1Var2.n = Integer.MAX_VALUE;
                            bn1Var2.y = false;
                            if (bn1Var2.q == rb1.g) {
                                bn1Var2.q = rb1.h;
                            }
                        }
                        qs1 qs1VarZ2 = tb1Var.z();
                        Object[] objArr2 = qs1VarZ2.f;
                        int i6 = qs1VarZ2.h;
                        for (int i7 = 0; i7 < i6; i7++) {
                            ((tb1) objArr2[i7]).M.p.C.d = false;
                        }
                        if (bn1Var.I().t) {
                            yr1 yr1Var = (yr1) tb1Var.n();
                            int i8 = ((qs1) yr1Var.g).h;
                            for (int i9 = 0; i9 < i8; i9++) {
                                ((tb1) yr1Var.get(i9)).L.d.t = true;
                            }
                        }
                        bn1Var.I().d1().a();
                        if (bn1Var.I().t) {
                            yr1 yr1Var2 = (yr1) tb1Var.n();
                            int i10 = ((qs1) yr1Var2.g).h;
                            for (int i11 = 0; i11 < i10; i11++) {
                                ((tb1) yr1Var2.get(i11)).L.d.t = false;
                            }
                        }
                        qs1 qs1VarZ3 = tb1Var.z();
                        Object[] objArr3 = qs1VarZ3.f;
                        int i12 = qs1VarZ3.h;
                        for (int i13 = 0; i13 < i12; i13++) {
                            tb1 tb1Var2 = (tb1) objArr3[i13];
                            xb1 xb1Var3 = tb1Var2.M;
                            if (xb1Var3.p.m != tb1Var2.v()) {
                                tb1Var.O();
                                tb1Var.C();
                                if (tb1Var2.v() == Integer.MAX_VALUE) {
                                    if (xb1Var3.c || pq.H(tb1Var2)) {
                                        gl1 gl1Var = xb1Var3.q;
                                        gl1Var.getClass();
                                        gl1Var.Q0(false);
                                    }
                                    xb1Var3.p.R0();
                                }
                            }
                        }
                        qs1 qs1VarZ4 = tb1Var.z();
                        Object[] objArr4 = qs1VarZ4.f;
                        int i14 = qs1VarZ4.h;
                        for (int i15 = 0; i15 < i14; i15++) {
                            ub1 ub1Var = ((tb1) objArr4[i15]).M.p.C;
                            ub1Var.e = ub1Var.d;
                        }
                        break;
                    default:
                        xb1 xb1Var4 = bn1Var.k;
                        ex1 ex1Var = xb1Var4.a().D;
                        if (ex1Var == null || (placementScope = ex1Var.u) == null) {
                            placementScope = ((h7) wb1.a(xb1Var4.a)).getPlacementScope();
                        }
                        ns0 ns0Var = bn1Var.L;
                        if (ns0Var == null) {
                            ex1 ex1VarA = xb1Var4.a();
                            long j = bn1Var.M;
                            float f = bn1Var.N;
                            placementScope.getClass();
                            h62.c(placementScope, ex1VarA);
                            ex1VarA.K0(i41.c(j, ex1VarA.j), f, null);
                        } else {
                            ex1 ex1VarA2 = xb1Var4.a();
                            long j2 = bn1Var.M;
                            float f2 = bn1Var.N;
                            placementScope.getClass();
                            h62.c(placementScope, ex1VarA2);
                            ex1VarA2.K0(i41.c(j2, ex1VarA2.j), f2, ns0Var);
                        }
                        break;
                }
                return dm3Var;
            }
        };
        final int i3 = 2;
        this.O = new cs0(this) { // from class: an1
            public final /* synthetic */ bn1 g;

            {
                this.g = this;
            }

            @Override // defpackage.cs0
            public final Object a() {
                h62 placementScope;
                int i32 = i3;
                dm3 dm3Var = dm3.a;
                bn1 bn1Var = this.g;
                switch (i32) {
                    case 0:
                        bn1Var.k.a().t(bn1Var.G);
                        break;
                    case 1:
                        xb1 xb1Var2 = bn1Var.k;
                        xb1Var2.i = 0;
                        tb1 tb1Var = xb1Var2.a;
                        qs1 qs1VarZ = tb1Var.z();
                        Object[] objArr = qs1VarZ.f;
                        int i4 = qs1VarZ.h;
                        for (int i5 = 0; i5 < i4; i5++) {
                            bn1 bn1Var2 = ((tb1) objArr[i5]).M.p;
                            bn1Var2.m = bn1Var2.n;
                            bn1Var2.n = Integer.MAX_VALUE;
                            bn1Var2.y = false;
                            if (bn1Var2.q == rb1.g) {
                                bn1Var2.q = rb1.h;
                            }
                        }
                        qs1 qs1VarZ2 = tb1Var.z();
                        Object[] objArr2 = qs1VarZ2.f;
                        int i6 = qs1VarZ2.h;
                        for (int i7 = 0; i7 < i6; i7++) {
                            ((tb1) objArr2[i7]).M.p.C.d = false;
                        }
                        if (bn1Var.I().t) {
                            yr1 yr1Var = (yr1) tb1Var.n();
                            int i8 = ((qs1) yr1Var.g).h;
                            for (int i9 = 0; i9 < i8; i9++) {
                                ((tb1) yr1Var.get(i9)).L.d.t = true;
                            }
                        }
                        bn1Var.I().d1().a();
                        if (bn1Var.I().t) {
                            yr1 yr1Var2 = (yr1) tb1Var.n();
                            int i10 = ((qs1) yr1Var2.g).h;
                            for (int i11 = 0; i11 < i10; i11++) {
                                ((tb1) yr1Var2.get(i11)).L.d.t = false;
                            }
                        }
                        qs1 qs1VarZ3 = tb1Var.z();
                        Object[] objArr3 = qs1VarZ3.f;
                        int i12 = qs1VarZ3.h;
                        for (int i13 = 0; i13 < i12; i13++) {
                            tb1 tb1Var2 = (tb1) objArr3[i13];
                            xb1 xb1Var3 = tb1Var2.M;
                            if (xb1Var3.p.m != tb1Var2.v()) {
                                tb1Var.O();
                                tb1Var.C();
                                if (tb1Var2.v() == Integer.MAX_VALUE) {
                                    if (xb1Var3.c || pq.H(tb1Var2)) {
                                        gl1 gl1Var = xb1Var3.q;
                                        gl1Var.getClass();
                                        gl1Var.Q0(false);
                                    }
                                    xb1Var3.p.R0();
                                }
                            }
                        }
                        qs1 qs1VarZ4 = tb1Var.z();
                        Object[] objArr4 = qs1VarZ4.f;
                        int i14 = qs1VarZ4.h;
                        for (int i15 = 0; i15 < i14; i15++) {
                            ub1 ub1Var = ((tb1) objArr4[i15]).M.p.C;
                            ub1Var.e = ub1Var.d;
                        }
                        break;
                    default:
                        xb1 xb1Var4 = bn1Var.k;
                        ex1 ex1Var = xb1Var4.a().D;
                        if (ex1Var == null || (placementScope = ex1Var.u) == null) {
                            placementScope = ((h7) wb1.a(xb1Var4.a)).getPlacementScope();
                        }
                        ns0 ns0Var = bn1Var.L;
                        if (ns0Var == null) {
                            ex1 ex1VarA = xb1Var4.a();
                            long j = bn1Var.M;
                            float f = bn1Var.N;
                            placementScope.getClass();
                            h62.c(placementScope, ex1VarA);
                            ex1VarA.K0(i41.c(j, ex1VarA.j), f, null);
                        } else {
                            ex1 ex1VarA2 = xb1Var4.a();
                            long j2 = bn1Var.M;
                            float f2 = bn1Var.N;
                            placementScope.getClass();
                            h62.c(placementScope, ex1VarA2);
                            ex1VarA2.K0(i41.c(j2, ex1VarA2.j), f2, ns0Var);
                        }
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
            sVar.h(((tb1) objArr[i2]).M.p);
        }
    }

    @Override // defpackage.i62, defpackage.xm1
    public final Object E() {
        return this.w;
    }

    @Override // defpackage.i62
    public final int F0() {
        return this.k.a().F0();
    }

    @Override // defpackage.i62
    public final int G0() {
        return this.k.a().G0();
    }

    @Override // defpackage.nq1
    public final void H(boolean z) {
        xb1 xb1Var = this.k;
        if (z != xb1Var.a().q) {
            xb1Var.a().q = z;
            this.P = true;
        }
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
        return xb1Var.p;
    }

    @Override // defpackage.i62
    public final void K0(long j, float f, ns0 ns0Var) {
        h62 placementScope;
        xb1 xb1Var = this.k;
        tb1 tb1Var = xb1Var.a;
        tb1 tb1Var2 = xb1Var.a;
        try {
            this.y = true;
            if (!i41.a(j, this.s) || ns0Var != this.t || this.P) {
                if (xb1Var.k || xb1Var.j || this.P) {
                    this.A = true;
                    this.P = false;
                }
            }
            gl1 gl1Var = xb1Var.q;
            if (gl1Var != null) {
                xb1 xb1Var2 = gl1Var.k;
                if (gl1Var.v == fl1.h && !pq.H(xb1Var2.a)) {
                    xb1Var2.c = true;
                }
            }
            gl1 gl1Var2 = xb1Var.q;
            if (gl1Var2 != null && gl1Var2.N0()) {
                ex1 ex1Var = xb1Var.a().D;
                if (ex1Var == null || (placementScope = ex1Var.u) == null) {
                    placementScope = ((h7) wb1.a(tb1Var2)).getPlacementScope();
                }
                gl1 gl1Var3 = xb1Var.q;
                gl1Var3.getClass();
                tb1 tb1VarU = tb1Var2.u();
                if (tb1VarU != null) {
                    tb1VarU.M.h = 0;
                }
                gl1Var3.n = Integer.MAX_VALUE;
                placementScope.C(gl1Var3, (int) (j >> 32), (int) (4294967295L & j), 0.0f);
            }
            gl1 gl1Var4 = xb1Var.q;
            if (gl1Var4 != null && !gl1Var4.q) {
                m21.c("Error: Placement happened before lookahead.");
            }
            V0(j, f, ns0Var);
        } catch (Throwable th) {
            tb1Var.b0(th);
            throw null;
        }
    }

    @Override // defpackage.m5
    public final void L() {
        this.F = true;
        ub1 ub1Var = this.C;
        ub1Var.h();
        boolean z = this.A;
        xb1 xb1Var = this.k;
        if (z) {
            qs1 qs1VarZ = xb1Var.a.z();
            Object[] objArr = qs1VarZ.f;
            int i = qs1VarZ.h;
            for (int i2 = 0; i2 < i; i2++) {
                tb1 tb1Var = (tb1) objArr[i2];
                if (tb1Var.q() && tb1Var.r() == rb1.f && tb1.Q(tb1Var)) {
                    tb1.Y(xb1Var.a, false, 7);
                }
            }
        }
        if (this.B || (!this.r && !I().t && this.A)) {
            this.A = false;
            pb1 pb1Var = xb1Var.d;
            xb1Var.d = pb1.h;
            xb1Var.g(false);
            tb1 tb1Var2 = xb1Var.a;
            t12 snapshotObserver = ((h7) wb1.a(tb1Var2)).getSnapshotObserver();
            snapshotObserver.a.d(tb1Var2, snapshotObserver.e, this.I);
            xb1Var.d = pb1Var;
            this.B = false;
        }
        if (ub1Var.d) {
            ub1Var.e = true;
        }
        if (ub1Var.b && ub1Var.e()) {
            ub1Var.g();
        }
        this.F = false;
    }

    public final List N0() {
        xb1 xb1Var = this.k;
        xb1Var.a.i0();
        boolean z = this.E;
        qs1 qs1Var = this.D;
        if (!z) {
            return qs1Var.f();
        }
        tb1 tb1Var = xb1Var.a;
        qs1 qs1VarZ = tb1Var.z();
        Object[] objArr = qs1VarZ.f;
        int i = qs1VarZ.h;
        for (int i2 = 0; i2 < i; i2++) {
            tb1 tb1Var2 = (tb1) objArr[i2];
            if (qs1Var.h <= i2) {
                qs1Var.b(tb1Var2.M.p);
            } else {
                bn1 bn1Var = tb1Var2.M.p;
                Object[] objArr2 = qs1Var.f;
                Object obj = objArr2[i2];
                objArr2[i2] = bn1Var;
            }
        }
        qs1Var.l(((qs1) ((yr1) tb1Var.n()).g).h, qs1Var.h);
        this.E = false;
        return qs1Var.f();
    }

    public final void Q0() {
        boolean z = this.x;
        this.x = true;
        xb1 xb1Var = this.k;
        tb1 tb1Var = xb1Var.a;
        ax1 ax1Var = tb1Var.L;
        if (!z) {
            ax1Var.c.I1();
            ((h7) wb1.a(tb1Var)).getRectManager().h(xb1Var.a);
            if (tb1Var.q()) {
                tb1.Y(tb1Var, true, 6);
            } else if (tb1Var.M.e) {
                tb1.W(tb1Var, true, 6);
            }
        }
        ex1 ex1Var = ax1Var.c.C;
        for (ex1 ex1Var2 = ax1Var.d; !s51.n(ex1Var2, ex1Var) && ex1Var2 != null; ex1Var2 = ex1Var2.C) {
            if (ex1Var2.Z) {
                ex1Var2.E1();
            }
        }
        qs1 qs1VarZ = tb1Var.z();
        Object[] objArr = qs1VarZ.f;
        int i = qs1VarZ.h;
        for (int i2 = 0; i2 < i; i2++) {
            tb1 tb1Var2 = (tb1) objArr[i2];
            if (tb1Var2.v() != Integer.MAX_VALUE) {
                tb1Var2.M.p.Q0();
                tb1.Z(tb1Var2);
            }
        }
    }

    public final void R0() {
        if (this.x) {
            this.x = false;
            xb1 xb1Var = this.k;
            tb1 tb1Var = xb1Var.a;
            tb1 tb1Var2 = xb1Var.a;
            ((h7) wb1.a(tb1Var)).getRectManager().i(tb1Var2);
            ax1 ax1Var = tb1Var2.L;
            ex1 ex1Var = ax1Var.c.C;
            for (ex1 ex1Var2 = ax1Var.d; !s51.n(ex1Var2, ex1Var) && ex1Var2 != null; ex1Var2 = ex1Var2.C) {
                ex1Var2.K1();
                ex1Var2.P1();
            }
            qs1 qs1VarZ = tb1Var2.z();
            Object[] objArr = qs1VarZ.f;
            int i = qs1VarZ.h;
            for (int i2 = 0; i2 < i; i2++) {
                ((tb1) objArr[i2]).M.p.R0();
            }
        }
    }

    public final void T0() {
        xb1 xb1Var = this.k;
        tb1.Y(xb1Var.a, false, 7);
        tb1 tb1Var = xb1Var.a;
        tb1 tb1VarU = tb1Var.u();
        if (tb1VarU == null || tb1Var.I != rb1.h) {
            return;
        }
        int iOrdinal = tb1VarU.M.d.ordinal();
        tb1Var.I = iOrdinal != 0 ? iOrdinal != 2 ? tb1VarU.I : rb1.g : rb1.f;
    }

    public final void U0() {
        this.K = true;
        xb1 xb1Var = this.k;
        tb1 tb1VarU = xb1Var.a.u();
        float f = I().N;
        tb1 tb1Var = xb1Var.a;
        ax1 ax1Var = tb1Var.L;
        ex1 ex1Var = ax1Var.d;
        s21 s21Var = ax1Var.c;
        while (ex1Var != s21Var) {
            ex1Var.getClass();
            nb1 nb1Var = (nb1) ex1Var;
            f += nb1Var.N;
            ex1Var = nb1Var.C;
        }
        if (f != this.J) {
            this.J = f;
            if (tb1VarU != null) {
                tb1VarU.O();
            }
            if (tb1VarU != null) {
                tb1VarU.C();
            }
        }
        if (!I().t) {
            boolean z = this.x;
            if (!z || this.C.d()) {
                Q0();
            }
            if (z) {
                tb1Var.L.c.I1();
            } else {
                if (tb1VarU != null) {
                    tb1VarU.C();
                }
                if (this.l && tb1VarU != null) {
                    tb1VarU.X(false);
                }
            }
        }
        if (tb1VarU != null) {
            xb1 xb1Var2 = tb1VarU.M;
            if (!this.l && xb1Var2.d == pb1.h) {
                if (this.n != Integer.MAX_VALUE) {
                    m21.c("Place was called on a node which was placed already");
                }
                int i = xb1Var2.i;
                this.n = i;
                xb1Var2.i = i + 1;
            }
        } else {
            this.n = 0;
        }
        L();
    }

    public final void V0(long j, float f, ns0 ns0Var) {
        xb1 xb1Var = this.k;
        tb1 tb1Var = xb1Var.a;
        tb1 tb1Var2 = xb1Var.a;
        if (tb1Var.W) {
            m21.a("place is called on a deactivated node");
        }
        xb1Var.d = pb1.h;
        this.s = j;
        this.u = f;
        this.t = ns0Var;
        this.K = false;
        q12 q12VarA = wb1.a(tb1Var2);
        if (this.A || !this.x) {
            this.C.g = false;
            xb1Var.f(false);
            this.L = ns0Var;
            this.M = j;
            this.N = f;
            t12 snapshotObserver = ((h7) q12VarA).getSnapshotObserver();
            snapshotObserver.a.d(tb1Var2, snapshotObserver.f, this.O);
        } else {
            ex1 ex1VarA = xb1Var.a();
            ex1VarA.N1(i41.c(j, ex1VarA.j), f, ns0Var);
            U0();
        }
        xb1Var.d = pb1.j;
        if (xb1Var.a().t && (xb1Var.k || xb1Var.j)) {
            requestLayout();
        }
        this.p = true;
    }

    public final boolean Y0(long j) {
        xb1 xb1Var = this.k;
        tb1 tb1Var = xb1Var.a;
        tb1 tb1Var2 = xb1Var.a;
        try {
            if (tb1Var.W) {
                m21.a("measure is called on a deactivated node");
            }
            q12 q12VarA = wb1.a(tb1Var2);
            tb1 tb1VarU = tb1Var2.u();
            boolean z = true;
            tb1Var2.K = tb1Var2.K || (tb1VarU != null && tb1VarU.K);
            if (!tb1Var2.q() && m30.c(this.i, j)) {
                ((h7) q12VarA).j(tb1Var2, false);
                tb1Var2.a0();
                return false;
            }
            this.C.f = false;
            qs1 qs1VarZ = tb1Var2.z();
            Object[] objArr = qs1VarZ.f;
            int i = qs1VarZ.h;
            for (int i2 = 0; i2 < i; i2++) {
                ((tb1) objArr[i2]).M.p.C.c = false;
            }
            this.o = true;
            long j2 = xb1Var.a().h;
            M0(j);
            pb1 pb1Var = xb1Var.d;
            pb1 pb1Var2 = pb1.j;
            if (pb1Var != pb1Var2) {
                m21.c("layout state is not idle before measure starts");
            }
            this.G = j;
            pb1 pb1Var3 = pb1.f;
            xb1Var.d = pb1Var3;
            this.z = false;
            t12 snapshotObserver = ((h7) wb1.a(tb1Var2)).getSnapshotObserver();
            snapshotObserver.a.d(tb1Var2, snapshotObserver.c, this.H);
            if (xb1Var.d == pb1Var3) {
                this.A = true;
                this.B = true;
                xb1Var.d = pb1Var2;
            }
            if (p41.b(xb1Var.a().h, j2) && xb1Var.a().f == this.f && xb1Var.a().g == this.g) {
                z = false;
            }
            L0((((long) xb1Var.a().g) & 4294967295L) | (((long) xb1Var.a().f) << 32));
            return z;
        } catch (Throwable th) {
            tb1Var.b0(th);
            throw null;
        }
    }

    public final void Z0() {
        xb1 xb1Var = this.k;
        tb1 tb1Var = xb1Var.a;
        tb1 tb1Var2 = xb1Var.a;
        if (!tb1Var.I() || xb1Var.l <= 0) {
            return;
        }
        xb1 xb1Var2 = tb1Var2.M;
        if ((xb1Var2.j || xb1Var2.k) && !xb1Var2.p.A) {
            tb1Var2.X(false);
        }
        qs1 qs1VarZ = tb1Var2.z();
        Object[] objArr = qs1VarZ.f;
        int i = qs1VarZ.h;
        for (int i2 = 0; i2 < i; i2++) {
            ((tb1) objArr[i2]).M.p.Z0();
        }
    }

    @Override // defpackage.m5
    public final ub1 c() {
        return this.C;
    }

    @Override // defpackage.xm1
    public final int m0(int i) {
        xb1 xb1Var = this.k;
        if (!pq.H(xb1Var.a)) {
            T0();
            return xb1Var.a().m0(i);
        }
        gl1 gl1Var = xb1Var.q;
        gl1Var.getClass();
        return gl1Var.m0(i);
    }

    @Override // defpackage.m5
    public final int r0() {
        return this.n;
    }

    @Override // defpackage.m5
    public final void requestLayout() {
        this.k.a.X(false);
    }

    @Override // defpackage.m5
    public final void s0() {
        tb1.Y(this.k.a, false, 7);
    }

    @Override // defpackage.xm1
    public final i62 t(long j) {
        rb1 rb1Var;
        xb1 xb1Var = this.k;
        tb1 tb1Var = xb1Var.a;
        tb1 tb1Var2 = xb1Var.a;
        rb1 rb1Var2 = tb1Var.I;
        rb1 rb1Var3 = rb1.h;
        if (rb1Var2 == rb1Var3) {
            tb1Var.c();
        }
        if (pq.H(tb1Var2)) {
            gl1 gl1Var = xb1Var.q;
            gl1Var.getClass();
            gl1Var.o = rb1Var3;
            gl1Var.t(j);
        }
        tb1 tb1VarU = tb1Var2.u();
        if (tb1VarU != null) {
            xb1 xb1Var2 = tb1VarU.M;
            if (this.q != rb1Var3 && !tb1Var2.K) {
                m21.c("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = xb1Var2.d.ordinal();
            if (iOrdinal == 0) {
                rb1Var = rb1.f;
            } else {
                if (iOrdinal != 2) {
                    c.o(xb1Var2.d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                rb1Var = rb1.g;
            }
            this.q = rb1Var;
        } else {
            this.q = rb1Var3;
        }
        Y0(j);
        return this;
    }

    @Override // defpackage.xm1
    public final int u0(int i) {
        xb1 xb1Var = this.k;
        if (!pq.H(xb1Var.a)) {
            T0();
            return xb1Var.a().u0(i);
        }
        gl1 gl1Var = xb1Var.q;
        gl1Var.getClass();
        return gl1Var.u0(i);
    }

    @Override // defpackage.xm1
    public final int x0(int i) {
        xb1 xb1Var = this.k;
        if (!pq.H(xb1Var.a)) {
            T0();
            return xb1Var.a().x0(i);
        }
        gl1 gl1Var = xb1Var.q;
        gl1Var.getClass();
        return gl1Var.x0(i);
    }

    @Override // defpackage.xm1
    public final int y(int i) {
        xb1 xb1Var = this.k;
        if (!pq.H(xb1Var.a)) {
            T0();
            return xb1Var.a().y(i);
        }
        gl1 gl1Var = xb1Var.q;
        gl1Var.getClass();
        return gl1Var.y(i);
    }

    @Override // defpackage.i62
    public final int z0(i5 i5Var) {
        xb1 xb1Var = this.k;
        tb1 tb1VarU = xb1Var.a.u();
        pb1 pb1Var = tb1VarU != null ? tb1VarU.M.d : null;
        pb1 pb1Var2 = pb1.f;
        ub1 ub1Var = this.C;
        if (pb1Var == pb1Var2) {
            ub1Var.c = true;
        } else {
            tb1 tb1VarU2 = xb1Var.a.u();
            if ((tb1VarU2 != null ? tb1VarU2.M.d : null) == pb1.h) {
                ub1Var.d = true;
            }
        }
        this.r = true;
        int iZ0 = xb1Var.a().z0(i5Var);
        this.r = false;
        return iZ0;
    }
}
