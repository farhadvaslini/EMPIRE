package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class dl1 implements ab1 {
    public final cl1 f;

    public dl1(cl1 cl1Var) {
        this.f = cl1Var;
    }

    @Override // defpackage.ab1
    public final long B(long j) {
        return gy1.e(this.f.z.B(j), a());
    }

    @Override // defpackage.ab1
    public final long D(long j) {
        return this.f.z.D(gy1.e(j, a()));
    }

    @Override // defpackage.ab1
    public final ab1 F() {
        cl1 cl1VarU1;
        if (!t0()) {
            m21.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        ex1 ex1Var = this.f.z.z.L.d.D;
        if (ex1Var == null || (cl1VarU1 = ex1Var.u1()) == null) {
            return null;
        }
        return cl1VarU1.C;
    }

    @Override // defpackage.ab1
    public final long O(ab1 ab1Var, long j) {
        return l0(ab1Var, j, true);
    }

    @Override // defpackage.ab1
    public final long V(long j) {
        return gy1.e(this.f.z.V(j), a());
    }

    @Override // defpackage.ab1
    public final void Y(float[] fArr) {
        this.f.z.Y(fArr);
    }

    public final long a() {
        cl1 cl1Var = this.f;
        cl1 cl1VarJ = lr.J(cl1Var);
        return gy1.d(l0(cl1VarJ.C, 0L, true), cl1Var.z.l0(cl1VarJ.z, 0L, true));
    }

    @Override // defpackage.ab1
    public final void b0(ab1 ab1Var, float[] fArr) {
        this.f.z.b0(ab1Var, fArr);
    }

    @Override // defpackage.ab1
    public final jk2 c0(ab1 ab1Var, boolean z) {
        return this.f.z.c0(ab1Var, z);
    }

    @Override // defpackage.ab1
    public final long i(long j) {
        return this.f.z.i(gy1.e(j, a()));
    }

    @Override // defpackage.ab1
    public final long i0() {
        cl1 cl1Var = this.f;
        return (((long) cl1Var.f) << 32) | (((long) cl1Var.g) & 4294967295L);
    }

    @Override // defpackage.ab1
    public final long k0(long j) {
        return this.f.z.k0(gy1.e(j, a()));
    }

    @Override // defpackage.ab1
    public final long l0(ab1 ab1Var, long j, boolean z) {
        boolean z2 = ab1Var instanceof dl1;
        cl1 cl1Var = this.f;
        if (!z2) {
            cl1 cl1VarJ = lr.J(cl1Var);
            ex1 ex1Var = cl1VarJ.z;
            long jD = gy1.d(l0(cl1VarJ.C, j, z), (4294967295L & ((long) Float.floatToRawIntBits((int) (cl1VarJ.A & 4294967295L)))) | (Float.floatToRawIntBits((int) (r5 >> 32)) << 32));
            if (!ex1Var.w1().s) {
                m21.c("LayoutCoordinate operations are only valid when isAttached is true");
            }
            ex1Var.G1();
            ex1 ex1Var2 = ex1Var.D;
            if (ex1Var2 != null) {
                ex1Var = ex1Var2;
            }
            return gy1.e(jD, ex1Var.l0(ab1Var, 0L, z));
        }
        cl1 cl1Var2 = ((dl1) ab1Var).f;
        ex1 ex1Var3 = cl1Var2.z;
        ex1Var3.G1();
        cl1 cl1VarU1 = cl1Var.z.s1(ex1Var3).u1();
        if (cl1VarU1 != null) {
            boolean z3 = !z;
            long jB = i41.b(i41.c(cl1Var2.p1(cl1VarU1, z3), uq.H(j)), cl1Var.p1(cl1VarU1, z3));
            return (((long) Float.floatToRawIntBits((int) (jB >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jB & 4294967295L))) & 4294967295L);
        }
        cl1 cl1VarJ2 = lr.J(cl1Var2);
        boolean z4 = !z;
        long jC = i41.c(i41.c(cl1Var2.p1(cl1VarJ2, z4), cl1VarJ2.A), uq.H(j));
        cl1 cl1VarJ3 = lr.J(cl1Var);
        long jB2 = i41.b(jC, i41.c(cl1Var.p1(cl1VarJ3, z4), cl1VarJ3.A));
        long jFloatToRawIntBits = Float.floatToRawIntBits((int) (jB2 >> 32));
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits((int) (jB2 & 4294967295L))) & 4294967295L;
        ex1 ex1Var4 = cl1VarJ3.z.D;
        ex1Var4.getClass();
        ex1 ex1Var5 = cl1VarJ2.z.D;
        ex1Var5.getClass();
        return ex1Var4.l0(ex1Var5, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32), z);
    }

    @Override // defpackage.ab1
    public final boolean t0() {
        return this.f.z.w1().s;
    }
}
