package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class wx {
    public static final long b = vp.c(4278190080L);
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final /* synthetic */ int h = 0;
    public final long a;

    static {
        vp.c(4282664004L);
        vp.c(4287137928L);
        vp.c(4291611852L);
        c = vp.c(4294967295L);
        d = vp.c(4294901760L);
        vp.c(4278255360L);
        e = vp.c(4278190335L);
        vp.c(4294967040L);
        vp.c(4278255615L);
        vp.c(4294902015L);
        f = vp.b(0);
        float[] fArr = ky.a;
        g = vp.a(0.0f, 0.0f, 0.0f, 0.0f, ky.u);
    }

    public /* synthetic */ wx(long j) {
        this.a = j;
    }

    public static final long a(long j, iy iyVar) {
        g30 g30VarQ;
        iy iyVarF = f(j);
        int i = iyVarF.c;
        int i2 = iyVar.c;
        if ((i | i2) < 0) {
            g30VarQ = pq.q(iyVarF, iyVar);
        } else {
            or1 or1Var = h30.a;
            int i3 = i | (i2 << 6);
            Object objB = or1Var.b(i3);
            if (objB == null) {
                objB = pq.q(iyVarF, iyVar);
                or1Var.i(i3, objB);
            }
            g30VarQ = (g30) objB;
        }
        return g30VarQ.a(j);
    }

    public static long b(float f2, long j) {
        return vp.a(h(j), g(j), e(j), f2, f(j));
    }

    public static final boolean c(long j, long j2) {
        return j == j2;
    }

    public static final float d(long j) {
        float fG;
        float f2;
        if ((63 & j) == 0) {
            fG = (float) n32.G((j >>> 56) & 255);
            f2 = 255.0f;
        } else {
            fG = (float) n32.G((j >>> 6) & 1023);
            f2 = 1023.0f;
        }
        return fG / f2;
    }

    public static final float e(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) n32.G((j >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 16) & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - vm0.a;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static final iy f(long j) {
        float[] fArr = ky.a;
        return ky.y[(int) (j & 63)];
    }

    public static final float g(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) n32.G((j >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 32) & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - vm0.a;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static final float h(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) n32.G((j >>> 48) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 48) & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - vm0.a;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static String i(long j) {
        float fH = h(j);
        float fG = g(j);
        float fE = e(j);
        float fD = d(j);
        String str = f(j).a;
        StringBuilder sbK = nc2.k("Color(", fH, ", ", fG, ", ");
        nc2.v(sbK, fE, ", ", fD, ", ");
        return nc2.j(sbK, str, ")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wx) {
            return this.a == ((wx) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return i(this.a);
    }
}
