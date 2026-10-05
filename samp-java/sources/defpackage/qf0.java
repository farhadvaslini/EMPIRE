package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public interface qf0 extends ua0 {
    static void E0(qf0 qf0Var, g9 g9Var, long j, long j2, float f, yx yxVar, int i, int i2) {
        qf0Var.w0(g9Var, 0L, j, (i2 & 16) != 0 ? j : j2, (i2 & 32) != 0 ? 1.0f : f, yxVar, (i2 & 512) != 0 ? 1 : i);
    }

    static /* synthetic */ void N(qf0 qf0Var, da daVar, dp dpVar, float f, ga3 ga3Var, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        rf0 rf0Var = ga3Var;
        if ((i & 8) != 0) {
            rf0Var = fm0.a;
        }
        qf0Var.z(daVar, dpVar, f2, rf0Var, (i & 32) != 0 ? 3 : 0);
    }

    static /* synthetic */ void S0(qf0 qf0Var, dp dpVar, long j, long j2, float f, rf0 rf0Var, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        qf0Var.x(dpVar, j3, (i & 4) != 0 ? c1(qf0Var.a(), j3) : j2, (i & 8) != 0 ? 1.0f : f, (i & 16) != 0 ? fm0.a : rf0Var, (i & 64) != 0 ? 3 : 12);
    }

    static /* synthetic */ void a0(qf0 qf0Var, long j, float f, long j2, rf0 rf0Var, int i) {
        if ((i & 4) != 0) {
            j2 = qf0Var.y0();
        }
        long j3 = j2;
        if ((i & 16) != 0) {
            rf0Var = fm0.a;
        }
        qf0Var.O0(j, f, j3, rf0Var);
    }

    static /* synthetic */ void b1(qf0 qf0Var, da daVar, long j, float f, rf0 rf0Var, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 8) != 0) {
            rf0Var = fm0.a;
        }
        qf0Var.A(daVar, j, f2, rf0Var);
    }

    static long c1(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    static void d0(vb1 vb1Var, dp dpVar, long j, long j2, long j3, rf0 rf0Var, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j4 = j;
        vb1Var.t(dpVar, j4, (i & 4) != 0 ? c1(vb1Var.f.a(), j4) : j2, j3, 1.0f, (i & 32) != 0 ? fm0.a : rf0Var);
    }

    static /* synthetic */ void h0(qf0 qf0Var, long j, long j2, long j3, float f, ga3 ga3Var, int i, int i2) {
        long j4 = (i2 & 2) != 0 ? 0L : j2;
        qf0Var.W(j, j4, (i2 & 4) != 0 ? c1(qf0Var.a(), j4) : j3, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? fm0.a : ga3Var, (i2 & 64) != 0 ? 3 : i);
    }

    void A(da daVar, long j, float f, rf0 rf0Var);

    void O0(long j, float f, long j2, rf0 rf0Var);

    void S(long j, long j2, long j3, long j4, rf0 rf0Var);

    void W(long j, long j2, long j3, float f, rf0 rf0Var, int i);

    void X(long j, float f, float f2, long j2, long j3, float f3, ga3 ga3Var);

    pi Z();

    default long a() {
        return Z().A();
    }

    default void g0(qw0 qw0Var, long j, ns0 ns0Var) {
        qw0Var.e(this, getLayoutDirection(), j, new pf0(0, this, ns0Var));
    }

    bb1 getLayoutDirection();

    void v0(long j, long j2, long j3, float f, int i);

    void w0(g9 g9Var, long j, long j2, long j3, float f, yx yxVar, int i);

    void x(dp dpVar, long j, long j2, float f, rf0 rf0Var, int i);

    default long y0() {
        return d32.p(Z().A());
    }

    void z(da daVar, dp dpVar, float f, rf0 rf0Var, int i);
}
