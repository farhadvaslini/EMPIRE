package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public interface ua0 {
    default long C0(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fT = T(md0.b(j));
        float fT2 = T(md0.a(j));
        return (((long) Float.floatToRawIntBits(fT)) << 32) | (((long) Float.floatToRawIntBits(fT2)) & 4294967295L);
    }

    float G();

    default float H0(long j) {
        if (!kh3.a(jh3.b(j), 4294967296L)) {
            o21.b("Only Sp can convert to Px");
        }
        return T(j0(j));
    }

    default long P0(float f) {
        return Q(a1(f));
    }

    default long Q(float f) {
        float[] fArr = tq0.a;
        if (G() < 1.03f) {
            return oz2.D(f / G(), 4294967296L);
        }
        sq0 sq0VarA = tq0.a(G());
        return oz2.D(sq0VarA != null ? sq0VarA.a(f) : f / G(), 4294967296L);
    }

    default long R(long j) {
        if (j != 9205357640488583168L) {
            return uq.b(a1(Float.intBitsToFloat((int) (j >> 32))), a1(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    default float T(float f) {
        return h() * f;
    }

    default float X0(int i) {
        return i / h();
    }

    default float a1(float f) {
        return f / h();
    }

    default int f0(long j) {
        return Math.round(H0(j));
    }

    float h();

    default float j0(long j) {
        if (!kh3.a(jh3.b(j), 4294967296L)) {
            o21.b("Only Sp can convert to Px");
        }
        float[] fArr = tq0.a;
        if (G() < 1.03f) {
            return G() * jh3.c(j);
        }
        sq0 sq0VarA = tq0.a(G());
        if (sq0VarA != null) {
            return sq0VarA.b(jh3.c(j));
        }
        return G() * jh3.c(j);
    }

    default int p0(float f) {
        float fT = T(f);
        if (Float.isInfinite(fT)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fT);
    }
}
