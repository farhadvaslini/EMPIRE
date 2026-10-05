package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class ig0 implements Comparable {
    public static final zj f = new zj(20);
    public static final long g = vp.B(4611686018427387903L);
    public static final long h = vp.B(-4611686018427387903L);

    public static final long a(long j, long j2) {
        long j3 = j2 / 1000000;
        long jN = vp.n(j, j3);
        if (-4611686018426L > jN || jN >= 4611686018427L) {
            return vp.B(jN);
        }
        long j4 = ((jN * 1000000) + (j2 - (j3 * 1000000))) << 1;
        int i = kg0.a;
        return j4;
    }

    public static final long b(long j, long j2) {
        int i = ((int) j) & 1;
        if (i != (((int) j2) & 1)) {
            return i == 1 ? a(j >> 1, j2 >> 1) : a(j2 >> 1, j >> 1);
        }
        if (i == 0) {
            long j3 = (j >> 1) + (j2 >> 1);
            if (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) {
                return vp.B(j3 / 1000000);
            }
            long j4 = j3 << 1;
            int i2 = kg0.a;
            return j4;
        }
        long jN = vp.n(j >> 1, j2 >> 1);
        if (jN == 9223372036854759646L) {
            c.p("Summing infinite durations of different signs yields an undefined result.");
            return 0L;
        }
        if (jN == 4611686018427387903L || jN == -4611686018427387903L) {
            return vp.B(jN);
        }
        if (-4611686018426L > jN || jN >= 4611686018427L) {
            return vp.B(y02.i(jN, -4611686018427387903L, 4611686018427387903L));
        }
        long j5 = (jN * 1000000) << 1;
        int i3 = kg0.a;
        return j5;
    }

    public static final long c(long j, lg0 lg0Var) {
        if (j == g) {
            return Long.MAX_VALUE;
        }
        if (j == h) {
            return Long.MIN_VALUE;
        }
        return lg0Var.f.convert(j >> 1, ((((int) j) & 1) == 0 ? lg0.NANOSECONDS : lg0.MILLISECONDS).f);
    }
}
