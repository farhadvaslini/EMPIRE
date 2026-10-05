package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class qg3 {
    public final pg3 a;
    public ab1 b = null;
    public ab1 c;

    public qg3(pg3 pg3Var, ab1 ab1Var) {
        this.a = pg3Var;
        this.c = ab1Var;
    }

    public final long a(long j) {
        jk2 jk2VarC0;
        ab1 ab1Var = this.b;
        jk2 jk2Var = jk2.e;
        if (ab1Var != null) {
            if (ab1Var.t0()) {
                ab1 ab1Var2 = this.c;
                jk2VarC0 = ab1Var2 != null ? ab1Var2.c0(ab1Var, true) : null;
            } else {
                jk2VarC0 = jk2Var;
            }
            if (jk2VarC0 != null) {
                jk2Var = jk2VarC0;
            }
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        float fIntBitsToFloat2 = jk2Var.a;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i);
            fIntBitsToFloat2 = jk2Var.c;
            if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i);
            }
        }
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat5 = jk2Var.b;
        if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
            float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
            fIntBitsToFloat5 = jk2Var.d;
            if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
                fIntBitsToFloat5 = Float.intBitsToFloat(i2);
            }
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L);
    }

    public final int b(long j, boolean z) {
        if (z) {
            j = a(j);
        }
        return this.a.b.g(d(j));
    }

    public final boolean c(long j) {
        long jD = d(a(j));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jD));
        pg3 pg3Var = this.a;
        int iE = pg3Var.b.e(fIntBitsToFloat);
        int i = (int) (jD >> 32);
        return Float.intBitsToFloat(i) >= pg3Var.e(iE) && Float.intBitsToFloat(i) <= pg3Var.f(iE);
    }

    public final long d(long j) {
        ab1 ab1Var;
        ab1 ab1Var2 = this.b;
        if (ab1Var2 != null) {
            if (!ab1Var2.t0()) {
                ab1Var2 = null;
            }
            if (ab1Var2 != null && (ab1Var = this.c) != null) {
                ab1 ab1Var3 = ab1Var.t0() ? ab1Var : null;
                if (ab1Var3 != null) {
                    return ab1Var2.O(ab1Var3, j);
                }
            }
        }
        return j;
    }

    public final long e(long j) {
        ab1 ab1Var;
        ab1 ab1Var2 = this.b;
        if (ab1Var2 != null) {
            if (!ab1Var2.t0()) {
                ab1Var2 = null;
            }
            if (ab1Var2 != null && (ab1Var = this.c) != null) {
                ab1 ab1Var3 = ab1Var.t0() ? ab1Var : null;
                if (ab1Var3 != null) {
                    return ab1Var3.O(ab1Var2, j);
                }
            }
        }
        return j;
    }
}
