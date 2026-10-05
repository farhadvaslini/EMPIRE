package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class cl1 extends al1 implements xm1 {
    public LinkedHashMap B;
    public dn1 D;
    public final wr1 E;
    public final ex1 z;
    public long A = 0;
    public final dl1 C = new dl1(this);

    public cl1(ex1 ex1Var) {
        this.z = ex1Var;
        wr1 wr1Var = ay1.a;
        this.E = new wr1();
    }

    public static final void l1(cl1 cl1Var, dn1 dn1Var) {
        LinkedHashMap linkedHashMap;
        if (dn1Var != null) {
            cl1Var.L0((((long) dn1Var.d()) & 4294967295L) | (((long) dn1Var.g()) << 32));
        } else {
            cl1Var.L0(0L);
        }
        if (!s51.n(cl1Var.D, dn1Var) && dn1Var != null && ((((linkedHashMap = cl1Var.B) != null && !linkedHashMap.isEmpty()) || !dn1Var.c().isEmpty()) && !s51.n(dn1Var.c(), cl1Var.B))) {
            gl1 gl1Var = cl1Var.z.z.M.q;
            gl1Var.getClass();
            gl1Var.w.f();
            LinkedHashMap linkedHashMap2 = cl1Var.B;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                cl1Var.B = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(dn1Var.c());
        }
        cl1Var.D = dn1Var;
    }

    @Override // defpackage.i62, defpackage.xm1
    public final Object E() {
        return this.z.E();
    }

    @Override // defpackage.ua0
    public final float G() {
        return this.z.G();
    }

    @Override // defpackage.i62
    public final void K0(long j, float f, ns0 ns0Var) {
        o1(j);
        if (this.s) {
            return;
        }
        n1();
    }

    @Override // defpackage.al1, defpackage.k51
    public final boolean M() {
        return true;
    }

    @Override // defpackage.al1
    public final al1 U0() {
        ex1 ex1Var = this.z.C;
        if (ex1Var != null) {
            return ex1Var.u1();
        }
        return null;
    }

    @Override // defpackage.al1
    public final ab1 V0() {
        return this.C;
    }

    @Override // defpackage.al1
    public final boolean Y0() {
        return this.D != null;
    }

    @Override // defpackage.al1
    public final tb1 Z0() {
        return this.z.z;
    }

    @Override // defpackage.al1
    public final dn1 d1() {
        dn1 dn1Var = this.D;
        if (dn1Var != null) {
            return dn1Var;
        }
        throw nc2.d("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // defpackage.al1
    public final al1 e1() {
        ex1 ex1Var = this.z.D;
        if (ex1Var != null) {
            return ex1Var.u1();
        }
        return null;
    }

    @Override // defpackage.al1
    public final long f1() {
        return this.A;
    }

    @Override // defpackage.k51
    public final bb1 getLayoutDirection() {
        return this.z.z.F;
    }

    @Override // defpackage.ua0
    public final float h() {
        return this.z.h();
    }

    @Override // defpackage.al1
    public final void j1() {
        K0(this.A, 0.0f, null);
    }

    public final long m1() {
        return (((long) this.f) << 32) | (((long) this.g) & 4294967295L);
    }

    public void n1() {
        d1().a();
    }

    public final void o1(long j) {
        if (!i41.a(this.A, j)) {
            this.A = j;
            ex1 ex1Var = this.z;
            gl1 gl1Var = ex1Var.z.M.q;
            if (gl1Var != null) {
                gl1Var.T0();
            }
            al1.h1(ex1Var);
        }
        if (this.t) {
            return;
        }
        T0(d1());
    }

    public final long p1(cl1 cl1Var, boolean z) {
        long jC = 0;
        while (!this.equals(cl1Var)) {
            if (!this.q || !z) {
                jC = i41.c(jC, this.A);
            }
            ex1 ex1Var = this.z.D;
            ex1Var.getClass();
            this = ex1Var.u1();
            this.getClass();
        }
        return jC;
    }
}
