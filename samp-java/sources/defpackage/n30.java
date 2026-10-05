package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class n30 {
    public static final long a(int i, int i2, int i3, int i4) {
        if (!((i3 >= 0) & (i2 >= i) & (i4 >= i3) & (i >= 0))) {
            o21.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return h(i, i2, i3, i4);
    }

    public static /* synthetic */ long b(int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return a(i, i2, i3, i4);
    }

    public static final int c(int i) {
        if (i < 8191) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        return i < 262143 ? 18 : 255;
    }

    public static final long d(long j, long j2) {
        int i = (int) (j2 >> 32);
        int iK = m30.k(j);
        int i2 = m30.i(j);
        if (i < iK) {
            i = iK;
        }
        if (i <= i2) {
            i2 = i;
        }
        int i3 = (int) (j2 & 4294967295L);
        int iJ = m30.j(j);
        int iH = m30.h(j);
        if (i3 < iJ) {
            i3 = iJ;
        }
        if (i3 <= iH) {
            iH = i3;
        }
        return (((long) i2) << 32) | (((long) iH) & 4294967295L);
    }

    public static final long e(long j, long j2) {
        int iK = m30.k(j);
        int i = m30.i(j);
        int iJ = m30.j(j);
        int iH = m30.h(j);
        int iK2 = m30.k(j2);
        if (iK2 < iK) {
            iK2 = iK;
        }
        if (iK2 > i) {
            iK2 = i;
        }
        int i2 = m30.i(j2);
        if (i2 >= iK) {
            iK = i2;
        }
        if (iK <= i) {
            i = iK;
        }
        int iJ2 = m30.j(j2);
        if (iJ2 < iJ) {
            iJ2 = iJ;
        }
        if (iJ2 > iH) {
            iJ2 = iH;
        }
        int iH2 = m30.h(j2);
        if (iH2 >= iJ) {
            iJ = iH2;
        }
        if (iJ <= iH) {
            iH = iJ;
        }
        return a(iK2, i, iJ2, iH);
    }

    public static final int f(int i, long j) {
        int iJ = m30.j(j);
        int iH = m30.h(j);
        if (i < iJ) {
            i = iJ;
        }
        return i > iH ? iH : i;
    }

    public static final int g(int i, long j) {
        int iK = m30.k(j);
        int i2 = m30.i(j);
        if (i < iK) {
            i = iK;
        }
        return i > i2 ? i2 : i;
    }

    public static final long h(int i, int i2, int i3, int i4) {
        int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
        int iC = c(i5);
        int i6 = i2 == Integer.MAX_VALUE ? i : i2;
        int iC2 = c(i6);
        if (iC + iC2 > 31) {
            k(i6, i5);
        }
        int i7 = i2 + 1;
        int i8 = i4 + 1;
        int i9 = iC2 - 13;
        return (((long) (i7 & (~(i7 >> 31)))) << 33) | ((long) ((i9 >> 1) + (i9 & 1))) | (((long) i) << 2) | (((long) i3) << (iC2 + 2)) | (((long) (i8 & (~(i8 >> 31)))) << (iC2 + 33));
    }

    public static final long i(long j, int i, int i2) {
        int iK = m30.k(j) + i;
        if (iK < 0) {
            iK = 0;
        }
        int i3 = m30.i(j);
        if (i3 != Integer.MAX_VALUE && (i3 = i3 + i) < 0) {
            i3 = 0;
        }
        int iJ = m30.j(j) + i2;
        if (iJ < 0) {
            iJ = 0;
        }
        int iH = m30.h(j);
        return a(iK, i3, iJ, (iH == Integer.MAX_VALUE || (iH = iH + i2) >= 0) ? iH : 0);
    }

    public static /* synthetic */ long j(int i, int i2, int i3, long j) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return i(j, i, i2);
    }

    public static final void k(int i, int i2) {
        throw new IllegalArgumentException(nc2.h("Can't represent a width of ", i, " and height of ", i2, " in Constraints"));
    }

    public static final Void l(int i) {
        throw new IllegalArgumentException(by1.h("Can't represent a size of ", " in Constraints", i));
    }
}
