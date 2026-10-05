package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class bf0 {
    public static final af0 a;
    public static final af0 b;

    static {
        int i = 3;
        p40 p40Var = null;
        a = new af0(i, p40Var, 0);
        b = new af0(i, p40Var, 1);
    }

    public static bq1 a(bq1 bq1Var, ef0 ef0Var, t02 t02Var, boolean z, qr1 qr1Var, boolean z2, ss0 ss0Var, boolean z3, int i) {
        if ((i & 8) != 0) {
            qr1Var = null;
        }
        return bq1Var.d(new ye0(ef0Var, t02Var, z, qr1Var, z2, a, ss0Var, (i & 128) != 0 ? false : z3));
    }

    public static final long b(long j) {
        return d32.h(Float.isNaN(lp3.b(j)) ? 0.0f : lp3.b(j), Float.isNaN(lp3.c(j)) ? 0.0f : lp3.c(j));
    }
}
