package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class k23 {
    public static final fe2 a = new fe2(ca0.j);

    public static final long a(ab1 ab1Var, ab1 ab1Var2, long j) {
        jk2 jk2VarC0 = ab1Var2.c0(ab1Var, false);
        float f = jk2VarC0.a;
        float f2 = jk2VarC0.c - f;
        int i = wj3.c;
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (j >> 32)) * f2) + f;
        float f3 = jk2VarC0.b;
        float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (j & 4294967295L)) * (jk2VarC0.d - f3)) + f3;
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public static final long b(long j, long j2, float f) {
        int i = (int) (j2 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i) + ((Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat(i)) * f) + 0.0f;
        int i2 = (int) (j2 & 4294967295L);
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i2) + ((Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat(i2)) * f) + 0.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }
}
