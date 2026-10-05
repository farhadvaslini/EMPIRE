package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class h62 implements ua0 {
    public boolean f;

    public static void E(h62 h62Var, i62 i62Var, long j) {
        h62Var.getClass();
        c(h62Var, i62Var);
        i62Var.K0(i41.c(j, i62Var.j), 0.0f, null);
    }

    public static void F(h62 h62Var, i62 i62Var, int i, int i2) {
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (h62Var.y() == bb1.f || h62Var.B() == 0) {
            c(h62Var, i62Var);
            i62Var.K0(i41.c(j, i62Var.j), 0.0f, null);
        } else {
            int iB = (h62Var.B() - i62Var.f) - ((int) (j >> 32));
            c(h62Var, i62Var);
            i62Var.K0(i41.c((((long) iB) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), i62Var.j), 0.0f, null);
        }
    }

    public static void H(h62 h62Var, i62 i62Var, int i, int i2) {
        s12 s12Var = j62.a;
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (h62Var.y() == bb1.f || h62Var.B() == 0) {
            c(h62Var, i62Var);
            i62Var.K0(i41.c(j, i62Var.j), 0.0f, s12Var);
        } else {
            int iB = (h62Var.B() - i62Var.f) - ((int) (j >> 32));
            c(h62Var, i62Var);
            i62Var.K0(i41.c((((long) iB) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), i62Var.j), 0.0f, s12Var);
        }
    }

    public static void I(h62 h62Var, i62 i62Var, int i, int i2, ns0 ns0Var) {
        h62Var.getClass();
        c(h62Var, i62Var);
        i62Var.K0(i41.c((((long) i2) & 4294967295L) | (((long) i) << 32), i62Var.j), 0.0f, ns0Var);
    }

    public static void J(h62 h62Var, i62 i62Var, long j, gf0 gf0Var, int i) {
        ns0 ns0Var = gf0Var;
        if ((i & 4) != 0) {
            ns0Var = j62.a;
        }
        h62Var.getClass();
        c(h62Var, i62Var);
        i62Var.K0(i41.c(j, i62Var.j), 0.0f, ns0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(h62 h62Var, i62 i62Var) {
        h62Var.getClass();
        if (i62Var instanceof nq1) {
            ((nq1) i62Var).H(h62Var.f);
        }
    }

    public abstract int B();

    public final void C(i62 i62Var, int i, int i2, float f) {
        c(this, i62Var);
        i62Var.K0(i41.c((((long) i2) & 4294967295L) | (((long) i) << 32), i62Var.j), f, null);
    }

    public float i(uy0 uy0Var) {
        return Float.NaN;
    }

    public abstract ab1 t();

    public abstract bb1 y();
}
