package defpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class jx extends kx {
    public final FileInputStream h;
    public final byte[] i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o = Integer.MAX_VALUE;

    public jx(FileInputStream fileInputStream) {
        Charset charset = c51.a;
        this.h = fileInputStream;
        this.i = new byte[4096];
        this.j = 0;
        this.l = 0;
        this.n = 0;
    }

    @Override // defpackage.kx
    public final int A() {
        return J();
    }

    @Override // defpackage.kx
    public final long B() {
        return K();
    }

    @Override // defpackage.kx
    public final boolean C(int i) throws z51 {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                O(8);
                return true;
            }
            if (i2 == 2) {
                O(J());
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
            O(4);
            return true;
        }
        int i4 = this.j - this.l;
        byte[] bArr = this.i;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.l;
                this.l = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw z51.c();
        }
        while (i3 < 10) {
            if (this.l == this.j) {
                N(1);
            }
            int i6 = this.l;
            this.l = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw z51.c();
        return true;
    }

    public final byte[] E(int i) throws IOException {
        byte[] bArrF = F(i);
        if (bArrF != null) {
            return bArrF;
        }
        int i2 = this.l;
        int i3 = this.j;
        int length = i3 - i2;
        this.n += i3;
        this.l = 0;
        this.j = 0;
        ArrayList arrayListG = G(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.i, i2, bArr, 0, length);
        int size = arrayListG.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayListG.get(i4);
            i4++;
            byte[] bArr2 = (byte[]) obj;
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] F(int i) throws IOException {
        if (i == 0) {
            return c51.b;
        }
        if (i < 0) {
            throw z51.d();
        }
        int i2 = this.n;
        int i3 = this.l;
        int i4 = i2 + i3 + i;
        if (i4 - Integer.MAX_VALUE > 0) {
            throw new z51("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.o;
        if (i4 > i5) {
            O((i5 - i2) - i3);
            throw z51.e();
        }
        int i6 = this.j - i3;
        int i7 = i - i6;
        FileInputStream fileInputStream = this.h;
        if (i7 >= 4096) {
            try {
                if (i7 > fileInputStream.available()) {
                    return null;
                }
            } catch (z51 e) {
                e.f = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.i, this.l, bArr, 0, i6);
        this.n += this.j;
        this.l = 0;
        this.j = 0;
        while (i6 < i) {
            try {
                int i8 = fileInputStream.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw z51.e();
                }
                this.n += i8;
                i6 += i8;
            } catch (z51 e2) {
                e2.f = true;
                throw e2;
            }
        }
        return bArr;
    }

    public final ArrayList G(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.h.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw z51.e();
                }
                this.n += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int H() throws z51 {
        int i = this.l;
        if (this.j - i < 4) {
            N(4);
            i = this.l;
        }
        this.l = i + 4;
        byte[] bArr = this.i;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long I() throws z51 {
        int i = this.l;
        if (this.j - i < 8) {
            N(8);
            i = this.l;
        }
        this.l = i + 8;
        byte[] bArr = this.i;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public final int J() {
        int i;
        int i2 = this.l;
        int i3 = this.j;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.i;
            byte b = bArr[i2];
            if (b >= 0) {
                this.l = i4;
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
                this.l = i5;
                return i;
            }
        }
        return (int) L();
    }

    public final long K() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.l;
        int i2 = this.j;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.i;
            byte b = bArr[i];
            if (b >= 0) {
                this.l = i3;
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
                this.l = i4;
                return j;
            }
        }
        return L();
    }

    public final long L() throws z51 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.l == this.j) {
                N(1);
            }
            int i2 = this.l;
            this.l = i2 + 1;
            byte b = this.i[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw z51.c();
    }

    public final void M() {
        int i = this.j + this.k;
        this.j = i;
        int i2 = this.n + i;
        int i3 = this.o;
        if (i2 <= i3) {
            this.k = 0;
            return;
        }
        int i4 = i2 - i3;
        this.k = i4;
        this.j = i - i4;
    }

    public final void N(int i) throws z51 {
        if (P(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.n) - this.l) {
            throw z51.e();
        }
        throw new z51("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void O(int i) throws z51 {
        int i2 = this.j;
        int i3 = this.l;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.l = i3 + i;
            return;
        }
        FileInputStream fileInputStream = this.h;
        if (i < 0) {
            throw z51.d();
        }
        int i5 = this.n;
        int i6 = i5 + i3;
        int i7 = i6 + i;
        int i8 = this.o;
        if (i7 > i8) {
            O((i8 - i5) - i3);
            throw z51.e();
        }
        this.n = i6;
        this.j = 0;
        this.l = 0;
        while (i4 < i) {
            long j = i - i4;
            try {
                try {
                    long jSkip = fileInputStream.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i4 += (int) jSkip;
                    }
                } catch (z51 e) {
                    e.f = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.n += i4;
                M();
                throw th;
            }
        }
        this.n += i4;
        M();
        if (i4 >= i) {
            return;
        }
        int i9 = this.j;
        int i10 = i9 - this.l;
        this.l = i9;
        N(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.j;
            if (i11 <= i12) {
                this.l = i11;
                return;
            } else {
                i10 += i12;
                this.l = i12;
                N(1);
            }
        }
    }

    public final boolean P(int i) throws IOException {
        FileInputStream fileInputStream = this.h;
        int i2 = this.l;
        int i3 = i2 + i;
        int i4 = this.j;
        if (i3 <= i4) {
            c.q(by1.h("refillBuffer() called when ", " bytes were already available in buffer", i));
            return false;
        }
        int i5 = this.n;
        if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.o) {
            byte[] bArr = this.i;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.n += i2;
                this.j -= i2;
                this.l = 0;
            }
            int i6 = this.j;
            try {
                int i7 = fileInputStream.read(bArr, i6, Math.min(bArr.length - i6, (Integer.MAX_VALUE - this.n) - i6));
                if (i7 == 0 || i7 < -1 || i7 > bArr.length) {
                    throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + i7 + "\nThe InputStream implementation is buggy.");
                }
                if (i7 > 0) {
                    this.j += i7;
                    M();
                    if (this.j >= i) {
                        return true;
                    }
                    return P(i);
                }
            } catch (z51 e) {
                e.f = true;
                throw e;
            }
        }
        return false;
    }

    @Override // defpackage.kx
    public final void a(int i) throws z51 {
        if (this.m != i) {
            throw new z51("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.kx
    public final int b() {
        return this.n + this.l;
    }

    @Override // defpackage.kx
    public final boolean c() {
        return this.l == this.j && !P(1);
    }

    @Override // defpackage.kx
    public final void i(int i) {
        this.o = i;
        M();
    }

    @Override // defpackage.kx
    public final int j(int i) throws z51 {
        if (i < 0) {
            throw z51.d();
        }
        int i2 = this.n + this.l + i;
        if (i2 < 0) {
            throw new z51("Failed to parse the message.");
        }
        int i3 = this.o;
        if (i2 > i3) {
            throw z51.e();
        }
        this.o = i2;
        M();
        return i3;
    }

    @Override // defpackage.kx
    public final boolean k() {
        return K() != 0;
    }

    @Override // defpackage.kx
    public final jq l() throws IOException {
        int iJ = J();
        int i = this.j;
        int i2 = this.l;
        int i3 = i - i2;
        byte[] bArr = this.i;
        if (iJ <= i3 && iJ > 0) {
            jq jqVarC = jq.c(bArr, i2, iJ);
            this.l += iJ;
            return jqVarC;
        }
        if (iJ == 0) {
            return jq.h;
        }
        if (iJ < 0) {
            throw z51.d();
        }
        byte[] bArrF = F(iJ);
        if (bArrF != null) {
            return jq.c(bArrF, 0, bArrF.length);
        }
        int i4 = this.l;
        int i5 = this.j;
        int length = i5 - i4;
        this.n += i5;
        this.l = 0;
        this.j = 0;
        ArrayList arrayListG = G(iJ - length);
        byte[] bArr2 = new byte[iJ];
        System.arraycopy(bArr, i4, bArr2, 0, length);
        int size = arrayListG.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayListG.get(i6);
            i6++;
            byte[] bArr3 = (byte[]) obj;
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        jq jqVar = jq.h;
        return new jq(bArr2);
    }

    @Override // defpackage.kx
    public final double m() {
        return Double.longBitsToDouble(I());
    }

    @Override // defpackage.kx
    public final int n() {
        return J();
    }

    @Override // defpackage.kx
    public final int o() {
        return H();
    }

    @Override // defpackage.kx
    public final long p() {
        return I();
    }

    @Override // defpackage.kx
    public final float q() {
        return Float.intBitsToFloat(H());
    }

    @Override // defpackage.kx
    public final int r() {
        return J();
    }

    @Override // defpackage.kx
    public final long s() {
        return K();
    }

    @Override // defpackage.kx
    public final int t() {
        return H();
    }

    @Override // defpackage.kx
    public final long u() {
        return I();
    }

    @Override // defpackage.kx
    public final int v() {
        int iJ = J();
        return (-(iJ & 1)) ^ (iJ >>> 1);
    }

    @Override // defpackage.kx
    public final long w() {
        long jK = K();
        return (-(jK & 1)) ^ (jK >>> 1);
    }

    @Override // defpackage.kx
    public final String x() throws z51 {
        int iJ = J();
        byte[] bArr = this.i;
        if (iJ > 0) {
            int i = this.j;
            int i2 = this.l;
            if (iJ <= i - i2) {
                String str = new String(bArr, i2, iJ, c51.a);
                this.l += iJ;
                return str;
            }
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ < 0) {
            throw z51.d();
        }
        if (iJ > this.j) {
            return new String(E(iJ), c51.a);
        }
        N(iJ);
        String str2 = new String(bArr, this.l, iJ, c51.a);
        this.l += iJ;
        return str2;
    }

    @Override // defpackage.kx
    public final String y() throws IOException {
        int iJ = J();
        int i = this.l;
        int i2 = this.j;
        int i3 = i2 - i;
        byte[] bArrE = this.i;
        if (iJ <= i3 && iJ > 0) {
            this.l = i + iJ;
        } else {
            if (iJ == 0) {
                return "";
            }
            if (iJ < 0) {
                throw z51.d();
            }
            i = 0;
            if (iJ <= i2) {
                N(iJ);
                this.l = iJ;
            } else {
                bArrE = E(iJ);
            }
        }
        return lo3.a.j(bArrE, i, iJ);
    }

    @Override // defpackage.kx
    public final int z() throws z51 {
        if (c()) {
            this.m = 0;
            return 0;
        }
        int iJ = J();
        this.m = iJ;
        if ((iJ >>> 3) != 0) {
            return iJ;
        }
        throw new z51("Protocol message contained an invalid tag (zero).");
    }
}
