package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ix extends kx {
    public final byte[] h;
    public int i;
    public int j;
    public int k;
    public final int l;
    public int m;
    public int n = Integer.MAX_VALUE;

    public ix(byte[] bArr, int i, boolean z, int i2) {
        this.h = bArr;
        this.i = i2 + i;
        this.k = i;
        this.l = i;
    }

    @Override // defpackage.kx
    public final int A() {
        return G();
    }

    @Override // defpackage.kx
    public final long B() {
        return H();
    }

    @Override // defpackage.kx
    public final boolean C(int i) throws z51 {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                K(8);
                return true;
            }
            if (i2 == 2) {
                K(G());
                return true;
            }
            if (i2 == 3) {
                D();
                a(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw z51.b();
            }
            K(4);
            return true;
        }
        int i4 = this.i - this.k;
        byte[] bArr = this.h;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.k;
                this.k = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw z51.c();
        }
        while (i3 < 10) {
            int i6 = this.k;
            if (i6 == this.i) {
                throw z51.e();
            }
            this.k = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw z51.c();
        return true;
    }

    public final int E() throws z51 {
        int i = this.k;
        if (this.i - i < 4) {
            throw z51.e();
        }
        this.k = i + 4;
        byte[] bArr = this.h;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long F() throws z51 {
        int i = this.k;
        if (this.i - i < 8) {
            throw z51.e();
        }
        this.k = i + 8;
        byte[] bArr = this.h;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public final int G() {
        int i;
        int i2 = this.k;
        int i3 = this.i;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.h;
            byte b = bArr[i2];
            if (b >= 0) {
                this.k = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.k = i5;
                return i;
            }
        }
        return (int) I();
    }

    public final long H() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.k;
        int i2 = this.i;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.h;
            byte b = bArr[i];
            if (b >= 0) {
                this.k = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j4 = (-2080896) ^ i9;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (((long) bArr[i8]) << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (((long) bArr[i8]) << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (((long) bArr[i4]) << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i10 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i10;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j4 = j2 ^ j7;
                            }
                            j = j3 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.k = i4;
                return j;
            }
        }
        return I();
    }

    public final long I() throws z51 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.k;
            if (i2 == this.i) {
                throw z51.e();
            }
            this.k = i2 + 1;
            byte b = this.h[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw z51.c();
    }

    public final void J() {
        int i = this.i + this.j;
        this.i = i;
        int i2 = i - this.l;
        int i3 = this.n;
        if (i2 <= i3) {
            this.j = 0;
            return;
        }
        int i4 = i2 - i3;
        this.j = i4;
        this.i = i - i4;
    }

    public final void K(int i) throws z51 {
        if (i >= 0) {
            int i2 = this.i;
            int i3 = this.k;
            if (i <= i2 - i3) {
                this.k = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw z51.e();
        }
        throw z51.d();
    }

    @Override // defpackage.kx
    public final void a(int i) throws z51 {
        if (this.m != i) {
            throw new z51("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.kx
    public final int b() {
        return this.k - this.l;
    }

    @Override // defpackage.kx
    public final boolean c() {
        return this.k == this.i;
    }

    @Override // defpackage.kx
    public final void i(int i) {
        this.n = i;
        J();
    }

    @Override // defpackage.kx
    public final int j(int i) throws z51 {
        if (i < 0) {
            throw z51.d();
        }
        int iB = b() + i;
        if (iB < 0) {
            throw new z51("Failed to parse the message.");
        }
        int i2 = this.n;
        if (iB > i2) {
            throw z51.e();
        }
        this.n = iB;
        J();
        return i2;
    }

    @Override // defpackage.kx
    public final boolean k() {
        return H() != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    @Override // defpackage.kx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.jq l() throws defpackage.z51 {
        /*
            r4 = this;
            int r0 = r4.G()
            byte[] r1 = r4.h
            if (r0 <= 0) goto L19
            int r2 = r4.i
            int r3 = r4.k
            int r2 = r2 - r3
            if (r0 > r2) goto L19
            jq r1 = defpackage.jq.c(r1, r3, r0)
            int r2 = r4.k
            int r2 = r2 + r0
            r4.k = r2
            return r1
        L19:
            if (r0 != 0) goto L1e
            jq r4 = defpackage.jq.h
            return r4
        L1e:
            if (r0 <= 0) goto L2f
            int r2 = r4.i
            int r3 = r4.k
            int r2 = r2 - r3
            if (r0 > r2) goto L2f
            int r0 = r0 + r3
            r4.k = r0
            byte[] r4 = java.util.Arrays.copyOfRange(r1, r3, r0)
            goto L35
        L2f:
            if (r0 > 0) goto L42
            if (r0 != 0) goto L3d
            byte[] r4 = defpackage.c51.b
        L35:
            jq r0 = defpackage.jq.h
            jq r0 = new jq
            r0.<init>(r4)
            return r0
        L3d:
            z51 r4 = defpackage.z51.d()
            throw r4
        L42:
            z51 r4 = defpackage.z51.e()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ix.l():jq");
    }

    @Override // defpackage.kx
    public final double m() {
        return Double.longBitsToDouble(F());
    }

    @Override // defpackage.kx
    public final int n() {
        return G();
    }

    @Override // defpackage.kx
    public final int o() {
        return E();
    }

    @Override // defpackage.kx
    public final long p() {
        return F();
    }

    @Override // defpackage.kx
    public final float q() {
        return Float.intBitsToFloat(E());
    }

    @Override // defpackage.kx
    public final int r() {
        return G();
    }

    @Override // defpackage.kx
    public final long s() {
        return H();
    }

    @Override // defpackage.kx
    public final int t() {
        return E();
    }

    @Override // defpackage.kx
    public final long u() {
        return F();
    }

    @Override // defpackage.kx
    public final int v() {
        int iG = G();
        return (-(iG & 1)) ^ (iG >>> 1);
    }

    @Override // defpackage.kx
    public final long w() {
        long jH = H();
        return (-(jH & 1)) ^ (jH >>> 1);
    }

    @Override // defpackage.kx
    public final String x() throws z51 {
        int iG = G();
        if (iG > 0) {
            int i = this.i;
            int i2 = this.k;
            if (iG <= i - i2) {
                String str = new String(this.h, i2, iG, c51.a);
                this.k += iG;
                return str;
            }
        }
        if (iG == 0) {
            return "";
        }
        if (iG < 0) {
            throw z51.d();
        }
        throw z51.e();
    }

    @Override // defpackage.kx
    public final String y() throws z51 {
        int iG = G();
        if (iG > 0) {
            int i = this.i;
            int i2 = this.k;
            if (iG <= i - i2) {
                String strJ = lo3.a.j(this.h, i2, iG);
                this.k += iG;
                return strJ;
            }
        }
        if (iG == 0) {
            return "";
        }
        if (iG <= 0) {
            throw z51.d();
        }
        throw z51.e();
    }

    @Override // defpackage.kx
    public final int z() throws z51 {
        if (c()) {
            this.m = 0;
            return 0;
        }
        int iG = G();
        this.m = iG;
        if ((iG >>> 3) != 0) {
            return iG;
        }
        throw new z51("Protocol message contained an invalid tag (zero).");
    }
}
