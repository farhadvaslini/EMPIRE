package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class hp implements rp, qp, Cloneable, ByteChannel {
    public jt2 f;
    public long g;

    @Override // defpackage.rp
    public final InputStream A() {
        return new gp(this, 0);
    }

    public final void B(int i) {
        jt2 jt2VarO = o(4);
        byte[] bArr = jt2VarO.a;
        int i2 = jt2VarO.c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        jt2VarO.c = i2 + 4;
        this.g += 4;
    }

    public final void C(int i) {
        jt2 jt2VarO = o(2);
        byte[] bArr = jt2VarO.a;
        int i2 = jt2VarO.c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        jt2VarO.c = i2 + 2;
        this.g += 2;
    }

    public final void D(int i, int i2, String str) {
        char cCharAt;
        str.getClass();
        if (i < 0) {
            c.g(by1.e(i, "beginIndex < 0: "));
            return;
        }
        if (i2 < i) {
            c.g(nc2.g(i2, i, "endIndex < beginIndex: ", " < "));
            return;
        }
        if (i2 > str.length()) {
            StringBuilder sbM = nc2.m("endIndex > string.length: ", " > ", i2);
            sbM.append(str.length());
            throw new IllegalArgumentException(sbM.toString().toString());
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                jt2 jt2VarO = o(1);
                byte[] bArr = jt2VarO.a;
                int i3 = jt2VarO.c - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = jt2VarO.c;
                int i6 = (i3 + i) - i5;
                jt2VarO.c = i5 + i6;
                this.g += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    jt2 jt2VarO2 = o(2);
                    byte[] bArr2 = jt2VarO2.a;
                    int i7 = jt2VarO2.c;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    jt2VarO2.c = i7 + 2;
                    this.g += 2;
                } else if (55296 <= cCharAt2 && cCharAt2 < 56320) {
                    int i8 = i + 1;
                    char cCharAt3 = i8 < i2 ? str.charAt(i8) : (char) 0;
                    if (56320 > cCharAt3 || cCharAt3 >= 57344) {
                        v(63);
                        i = i8;
                    } else {
                        int i9 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        jt2 jt2VarO3 = o(4);
                        byte[] bArr3 = jt2VarO3.a;
                        int i10 = jt2VarO3.c;
                        bArr3[i10] = (byte) ((i9 >> 18) | 240);
                        bArr3[i10 + 1] = (byte) (((i9 >> 12) & 63) | 128);
                        bArr3[i10 + 2] = (byte) (((i9 >> 6) & 63) | 128);
                        bArr3[i10 + 3] = (byte) ((i9 & 63) | 128);
                        jt2VarO3.c = i10 + 4;
                        this.g += 4;
                        i += 2;
                    }
                } else if (56320 > cCharAt2 || cCharAt2 >= 57344) {
                    jt2 jt2VarO4 = o(3);
                    byte[] bArr4 = jt2VarO4.a;
                    int i11 = jt2VarO4.c;
                    bArr4[i11] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr4[i11 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr4[i11 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    jt2VarO4.c = i11 + 3;
                    this.g += 3;
                } else {
                    v(63);
                }
                i++;
            }
        }
    }

    public final void E(String str) {
        str.getClass();
        D(0, str.length(), str);
    }

    public final void F(int i) {
        if (i < 128) {
            v(i);
            return;
        }
        if (i < 2048) {
            jt2 jt2VarO = o(2);
            byte[] bArr = jt2VarO.a;
            int i2 = jt2VarO.c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            jt2VarO.c = i2 + 2;
            this.g += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            v(63);
            return;
        }
        if (i < 65536) {
            jt2 jt2VarO2 = o(3);
            byte[] bArr2 = jt2VarO2.a;
            int i3 = jt2VarO2.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            jt2VarO2.c = i3 + 3;
            this.g += 3;
            return;
        }
        if (i > 1114111) {
            c.p("Unexpected code point: 0x".concat(rn.I(i)));
            return;
        }
        jt2 jt2VarO3 = o(4);
        byte[] bArr3 = jt2VarO3.a;
        int i4 = jt2VarO3.c;
        bArr3[i4] = (byte) ((i >> 18) | 240);
        bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i4 + 3] = (byte) ((i & 63) | 128);
        jt2VarO3.c = i4 + 4;
        this.g += 4;
    }

    @Override // defpackage.z73
    public final ci3 a() {
        return ci3.d;
    }

    public final void b(hp hpVar, long j, long j2) {
        hpVar.getClass();
        long j3 = j;
        rn.v(this.g, j3, j2);
        if (j2 == 0) {
            return;
        }
        hpVar.g += j2;
        jt2 jt2Var = this.f;
        while (true) {
            jt2Var.getClass();
            long j4 = jt2Var.c - jt2Var.b;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            jt2Var = jt2Var.f;
        }
        long j5 = j2;
        while (j5 > 0) {
            jt2Var.getClass();
            jt2 jt2VarC = jt2Var.c();
            int i = jt2VarC.b + ((int) j3);
            jt2VarC.b = i;
            jt2VarC.c = Math.min(i + ((int) j5), jt2VarC.c);
            jt2 jt2Var2 = hpVar.f;
            if (jt2Var2 == null) {
                jt2VarC.g = jt2VarC;
                jt2VarC.f = jt2VarC;
                hpVar.f = jt2VarC;
            } else {
                jt2 jt2Var3 = jt2Var2.g;
                jt2Var3.getClass();
                jt2Var3.b(jt2VarC);
            }
            j5 -= (long) (jt2VarC.c - jt2VarC.b);
            jt2Var = jt2Var.f;
            j3 = 0;
        }
    }

    public final boolean c() {
        return this.g == 0;
    }

    public final Object clone() {
        hp hpVar = new hp();
        if (this.g == 0) {
            return hpVar;
        }
        jt2 jt2Var = this.f;
        jt2Var.getClass();
        jt2 jt2VarC = jt2Var.c();
        hpVar.f = jt2VarC;
        jt2VarC.g = jt2VarC;
        jt2VarC.f = jt2VarC;
        for (jt2 jt2Var2 = jt2Var.f; jt2Var2 != jt2Var; jt2Var2 = jt2Var2.f) {
            jt2 jt2Var3 = jt2VarC.g;
            jt2Var3.getClass();
            jt2Var2.getClass();
            jt2Var3.b(jt2Var2.c());
        }
        hpVar.g = this.g;
        return hpVar;
    }

    @Override // defpackage.z73
    public final long d(long j, hp hpVar) {
        hpVar.getClass();
        if (j < 0) {
            c.f(j, "byteCount < 0: ");
            return 0L;
        }
        long j2 = this.g;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        hpVar.l(j, this);
        return j;
    }

    @Override // defpackage.qp
    public final /* bridge */ /* synthetic */ qp e(kq kqVar) {
        p(kqVar);
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hp)) {
            return false;
        }
        long j = this.g;
        hp hpVar = (hp) obj;
        if (j != hpVar.g) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        jt2 jt2Var = this.f;
        jt2Var.getClass();
        jt2 jt2Var2 = hpVar.f;
        jt2Var2.getClass();
        int i = jt2Var.b;
        int i2 = jt2Var2.b;
        long j2 = 0;
        while (j2 < this.g) {
            long jMin = Math.min(jt2Var.c - i, jt2Var2.c - i2);
            long j3 = 0;
            while (j3 < jMin) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (jt2Var.a[i] != jt2Var2.a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == jt2Var.c) {
                jt2Var = jt2Var.f;
                jt2Var.getClass();
                i = jt2Var.b;
            }
            if (i2 == jt2Var2.c) {
                jt2Var2 = jt2Var2.f;
                jt2Var2.getClass();
                i2 = jt2Var2.b;
            }
            j2 += jMin;
        }
        return true;
    }

    public final byte f(long j) {
        rn.v(this.g, j, 1L);
        jt2 jt2Var = this.f;
        jt2Var.getClass();
        long j2 = this.g;
        if (j2 - j < j) {
            while (j2 > j) {
                jt2Var = jt2Var.g;
                jt2Var.getClass();
                j2 -= (long) (jt2Var.c - jt2Var.b);
            }
            return jt2Var.a[(int) ((((long) jt2Var.b) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = jt2Var.c;
            int i2 = jt2Var.b;
            long j4 = ((long) (i - i2)) + j3;
            if (j4 > j) {
                return jt2Var.a[(int) ((((long) i2) + j) - j3)];
            }
            jt2Var = jt2Var.f;
            jt2Var.getClass();
            j3 = j4;
        }
    }

    @Override // defpackage.rp
    public final kq g(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            c.f(j, "byteCount: ");
            return null;
        }
        if (this.g < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new kq(i(j));
        }
        kq kqVarN = n((int) j);
        skip(j);
        return kqVarN;
    }

    public final long h(byte b, long j, long j2) {
        jt2 jt2Var;
        long j3 = 0;
        if (0 > j || j > j2) {
            throw new IllegalArgumentException(("size=" + this.g + " fromIndex=" + j + " toIndex=" + j2).toString());
        }
        long j4 = this.g;
        if (j2 > j4) {
            j2 = j4;
        }
        if (j == j2 || (jt2Var = this.f) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                jt2Var = jt2Var.g;
                jt2Var.getClass();
                j4 -= (long) (jt2Var.c - jt2Var.b);
            }
            while (j4 < j2) {
                byte[] bArr = jt2Var.a;
                int iMin = (int) Math.min(jt2Var.c, (((long) jt2Var.b) + j2) - j4);
                for (int i = (int) ((((long) jt2Var.b) + j) - j4); i < iMin; i++) {
                    if (bArr[i] == b) {
                        return ((long) (i - jt2Var.b)) + j4;
                    }
                }
                j4 += (long) (jt2Var.c - jt2Var.b);
                jt2Var = jt2Var.f;
                jt2Var.getClass();
                j = j4;
            }
            return -1L;
        }
        while (true) {
            long j5 = ((long) (jt2Var.c - jt2Var.b)) + j3;
            if (j5 > j) {
                break;
            }
            jt2Var = jt2Var.f;
            jt2Var.getClass();
            j3 = j5;
        }
        while (j3 < j2) {
            byte[] bArr2 = jt2Var.a;
            int iMin2 = (int) Math.min(jt2Var.c, (((long) jt2Var.b) + j2) - j3);
            for (int i2 = (int) ((((long) jt2Var.b) + j) - j3); i2 < iMin2; i2++) {
                if (bArr2[i2] == b) {
                    return ((long) (i2 - jt2Var.b)) + j3;
                }
            }
            j3 += (long) (jt2Var.c - jt2Var.b);
            jt2Var = jt2Var.f;
            jt2Var.getClass();
            j = j3;
        }
        return -1L;
    }

    public final int hashCode() {
        jt2 jt2Var = this.f;
        if (jt2Var == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = jt2Var.c;
            for (int i3 = jt2Var.b; i3 < i2; i3++) {
                i = (i * 31) + jt2Var.a[i3];
            }
            jt2Var = jt2Var.f;
            jt2Var.getClass();
        } while (jt2Var != this.f);
        return i;
    }

    public final byte[] i(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            c.f(j, "byteCount: ");
            return null;
        }
        if (this.g < j) {
            throw new EOFException();
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = read(bArr, i2, i - i2);
            if (i3 == -1) {
                throw new EOFException();
            }
            i2 += i3;
        }
        return bArr;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2 A[EDGE_INSN: B:44:0x00a2->B:38:0x00a2 BREAK  A[LOOP:0: B:5:0x000c->B:46:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long j() throws EOFException {
        int i;
        if (this.g == 0) {
            throw new EOFException();
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            jt2 jt2Var = this.f;
            jt2Var.getClass();
            byte[] bArr = jt2Var.a;
            int i3 = jt2Var.b;
            int i4 = jt2Var.c;
            while (i3 < i4) {
                byte b = bArr[i3];
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else if (b < 65 || b > 70) {
                    z = true;
                    if (i2 == 0) {
                        char[] cArr = w7.a;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b >> 4) & 15], cArr[b & 15]})));
                    }
                    if (i3 != i4) {
                        this.f = jt2Var.a();
                        mt2.a(jt2Var);
                    } else {
                        jt2Var.b = i3;
                    }
                    if (!z) {
                        break;
                    }
                } else {
                    i = b - 55;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    hp hpVar = new hp();
                    hpVar.z(j);
                    hpVar.v(b);
                    throw new NumberFormatException("Number too large: ".concat(hpVar.m()));
                }
                j = (j << 4) | ((long) i);
                i3++;
                i2++;
            }
            if (i3 != i4) {
            }
            if (!z) {
            }
        } while (this.f != null);
        this.g -= (long) i2;
        return j;
    }

    public final String k(long j, Charset charset) throws EOFException {
        charset.getClass();
        if (j < 0 || j > 2147483647L) {
            c.f(j, "byteCount: ");
            return null;
        }
        if (this.g < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        jt2 jt2Var = this.f;
        jt2Var.getClass();
        int i = jt2Var.b;
        if (((long) i) + j > jt2Var.c) {
            return new String(i(j), charset);
        }
        int i2 = (int) j;
        String str = new String(jt2Var.a, i, i2, charset);
        int i3 = jt2Var.b + i2;
        jt2Var.b = i3;
        this.g -= j;
        if (i3 == jt2Var.c) {
            this.f = jt2Var.a();
            mt2.a(jt2Var);
        }
        return str;
    }

    @Override // defpackage.g43
    public final void l(long j, hp hpVar) {
        jt2 jt2VarB;
        hpVar.getClass();
        if (hpVar == this) {
            c.p("source == this");
            return;
        }
        rn.v(hpVar.g, 0L, j);
        while (j > 0) {
            jt2 jt2Var = hpVar.f;
            jt2Var.getClass();
            int i = jt2Var.c;
            jt2 jt2Var2 = hpVar.f;
            jt2Var2.getClass();
            long j2 = i - jt2Var2.b;
            int i2 = 0;
            if (j < j2) {
                jt2 jt2Var3 = this.f;
                jt2 jt2Var4 = jt2Var3 != null ? jt2Var3.g : null;
                if (jt2Var4 != null && jt2Var4.e) {
                    if ((((long) jt2Var4.c) + j) - ((long) (jt2Var4.d ? 0 : jt2Var4.b)) <= 8192) {
                        jt2 jt2Var5 = hpVar.f;
                        jt2Var5.getClass();
                        jt2Var5.d(jt2Var4, (int) j);
                        hpVar.g -= j;
                        this.g += j;
                        return;
                    }
                }
                jt2 jt2Var6 = hpVar.f;
                jt2Var6.getClass();
                int i3 = (int) j;
                if (i3 <= 0 || i3 > jt2Var6.c - jt2Var6.b) {
                    c.p("byteCount out of range");
                    return;
                }
                if (i3 >= 1024) {
                    jt2VarB = jt2Var6.c();
                } else {
                    jt2VarB = mt2.b();
                    byte[] bArr = jt2Var6.a;
                    byte[] bArr2 = jt2VarB.a;
                    int i4 = jt2Var6.b;
                    uj.H(bArr, bArr2, 0, i4, i4 + i3);
                }
                jt2VarB.c = jt2VarB.b + i3;
                jt2Var6.b += i3;
                jt2 jt2Var7 = jt2Var6.g;
                jt2Var7.getClass();
                jt2Var7.b(jt2VarB);
                hpVar.f = jt2VarB;
            }
            jt2 jt2Var8 = hpVar.f;
            jt2Var8.getClass();
            long j3 = jt2Var8.c - jt2Var8.b;
            hpVar.f = jt2Var8.a();
            jt2 jt2Var9 = this.f;
            if (jt2Var9 == null) {
                this.f = jt2Var8;
                jt2Var8.g = jt2Var8;
                jt2Var8.f = jt2Var8;
            } else {
                jt2 jt2Var10 = jt2Var9.g;
                jt2Var10.getClass();
                jt2Var10.b(jt2Var8);
                jt2 jt2Var11 = jt2Var8.g;
                if (jt2Var11 == jt2Var8) {
                    c.q("cannot compact");
                    return;
                }
                jt2Var11.getClass();
                if (jt2Var11.e) {
                    int i5 = jt2Var8.c - jt2Var8.b;
                    jt2 jt2Var12 = jt2Var8.g;
                    jt2Var12.getClass();
                    int i6 = 8192 - jt2Var12.c;
                    jt2 jt2Var13 = jt2Var8.g;
                    jt2Var13.getClass();
                    if (!jt2Var13.d) {
                        jt2 jt2Var14 = jt2Var8.g;
                        jt2Var14.getClass();
                        i2 = jt2Var14.b;
                    }
                    if (i5 <= i6 + i2) {
                        jt2 jt2Var15 = jt2Var8.g;
                        jt2Var15.getClass();
                        jt2Var8.d(jt2Var15, i5);
                        jt2Var8.a();
                        mt2.a(jt2Var8);
                    }
                }
            }
            hpVar.g -= j3;
            this.g += j3;
            j -= j3;
        }
    }

    public final String m() {
        return k(this.g, ys.a);
    }

    public final kq n(int i) {
        if (i == 0) {
            return kq.i;
        }
        rn.v(this.g, 0L, i);
        jt2 jt2Var = this.f;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            jt2Var.getClass();
            int i5 = jt2Var.c;
            int i6 = jt2Var.b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            jt2Var = jt2Var.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        jt2 jt2Var2 = this.f;
        int i7 = 0;
        while (i2 < i) {
            jt2Var2.getClass();
            bArr[i7] = jt2Var2.a;
            i2 += jt2Var2.c - jt2Var2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = jt2Var2.b;
            jt2Var2.d = true;
            i7++;
            jt2Var2 = jt2Var2.f;
        }
        return new tt2(bArr, iArr);
    }

    public final jt2 o(int i) {
        if (i < 1 || i > 8192) {
            c.p("unexpected capacity");
            return null;
        }
        jt2 jt2Var = this.f;
        if (jt2Var == null) {
            jt2 jt2VarB = mt2.b();
            this.f = jt2VarB;
            jt2VarB.g = jt2VarB;
            jt2VarB.f = jt2VarB;
            return jt2VarB;
        }
        jt2 jt2Var2 = jt2Var.g;
        jt2Var2.getClass();
        if (jt2Var2.c + i <= 8192 && jt2Var2.e) {
            return jt2Var2;
        }
        jt2 jt2VarB2 = mt2.b();
        jt2Var2.b(jt2VarB2);
        return jt2VarB2;
    }

    public final void p(kq kqVar) {
        kqVar.getClass();
        kqVar.m(this, kqVar.b());
    }

    @Override // defpackage.rp
    public final String q(long j) throws EOFException {
        if (j < 0) {
            c.f(j, "limit < 0: ");
            return null;
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long jH = h((byte) 10, 0L, j2);
        if (jH != -1) {
            return b.a(jH, this);
        }
        if (j2 < this.g && f(j2 - 1) == 13 && f(j2) == 10) {
            return b.a(j2, this);
        }
        hp hpVar = new hp();
        b(hpVar, 0L, Math.min(32L, this.g));
        throw new EOFException("\\n not found: limit=" + Math.min(this.g, j) + " content=" + hpVar.g(hpVar.g).c() + (char) 8230);
    }

    public final void r(byte[] bArr, int i) {
        bArr.getClass();
        long j = i;
        rn.v(bArr.length, 0L, j);
        int i2 = 0;
        while (i2 < i) {
            jt2 jt2VarO = o(1);
            int iMin = Math.min(i - i2, 8192 - jt2VarO.c);
            int i3 = i2 + iMin;
            uj.H(bArr, jt2VarO.a, jt2VarO.c, i2, i3);
            jt2VarO.c += iMin;
            i2 = i3;
        }
        this.g += j;
    }

    public final int read(byte[] bArr, int i, int i2) {
        rn.v(bArr.length, i, i2);
        jt2 jt2Var = this.f;
        if (jt2Var == null) {
            return -1;
        }
        int iMin = Math.min(i2, jt2Var.c - jt2Var.b);
        byte[] bArr2 = jt2Var.a;
        int i3 = jt2Var.b;
        uj.H(bArr2, bArr, i, i3, i3 + iMin);
        int i4 = jt2Var.b + iMin;
        jt2Var.b = i4;
        this.g -= (long) iMin;
        if (i4 == jt2Var.c) {
            this.f = jt2Var.a();
            mt2.a(jt2Var);
        }
        return iMin;
    }

    @Override // defpackage.rp
    public final byte readByte() throws EOFException {
        if (this.g == 0) {
            throw new EOFException();
        }
        jt2 jt2Var = this.f;
        jt2Var.getClass();
        int i = jt2Var.b;
        int i2 = jt2Var.c;
        int i3 = i + 1;
        byte b = jt2Var.a[i];
        this.g--;
        if (i3 != i2) {
            jt2Var.b = i3;
            return b;
        }
        this.f = jt2Var.a();
        mt2.a(jt2Var);
        return b;
    }

    @Override // defpackage.rp
    public final int readInt() throws EOFException {
        if (this.g < 4) {
            throw new EOFException();
        }
        jt2 jt2Var = this.f;
        jt2Var.getClass();
        int i = jt2Var.b;
        int i2 = jt2Var.c;
        if (i2 - i < 4) {
            return (readByte() & 255) | ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8);
        }
        byte[] bArr = jt2Var.a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.g -= 4;
        if (i5 != i2) {
            jt2Var.b = i5;
            return i6;
        }
        this.f = jt2Var.a();
        mt2.a(jt2Var);
        return i6;
    }

    @Override // defpackage.rp
    public final short readShort() throws EOFException {
        if (this.g < 2) {
            throw new EOFException();
        }
        jt2 jt2Var = this.f;
        jt2Var.getClass();
        int i = jt2Var.b;
        int i2 = jt2Var.c;
        if (i2 - i < 2) {
            return (short) ((readByte() & 255) | ((readByte() & 255) << 8));
        }
        byte[] bArr = jt2Var.a;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.g -= 2;
        if (i5 == i2) {
            this.f = jt2Var.a();
            mt2.a(jt2Var);
        } else {
            jt2Var.b = i5;
        }
        return (short) i6;
    }

    @Override // defpackage.rp
    public final int s(r02 r02Var) throws EOFException {
        r02Var.getClass();
        int iB = b.b(this, r02Var, false);
        if (iB == -1) {
            return -1;
        }
        skip(r02Var.f[iB].b());
        return iB;
    }

    @Override // defpackage.rp
    public final void skip(long j) throws EOFException {
        while (j > 0) {
            jt2 jt2Var = this.f;
            if (jt2Var == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, jt2Var.c - jt2Var.b);
            long j2 = iMin;
            this.g -= j2;
            j -= j2;
            int i = jt2Var.b + iMin;
            jt2Var.b = i;
            if (i == jt2Var.c) {
                this.f = jt2Var.a();
                mt2.a(jt2Var);
            }
        }
    }

    @Override // defpackage.rp
    public final void t(long j) throws EOFException {
        if (this.g < j) {
            throw new EOFException();
        }
    }

    public final String toString() {
        long j = this.g;
        if (j <= 2147483647L) {
            return n((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.g).toString());
    }

    public final void u(z73 z73Var) {
        z73Var.getClass();
        while (z73Var.d(8192L, this) != -1) {
        }
    }

    public final void v(int i) {
        jt2 jt2VarO = o(1);
        byte[] bArr = jt2VarO.a;
        int i2 = jt2VarO.c;
        jt2VarO.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.g++;
    }

    @Override // defpackage.qp
    public final /* bridge */ /* synthetic */ qp w(String str) {
        E(str);
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            jt2 jt2VarO = o(1);
            int iMin = Math.min(i, 8192 - jt2VarO.c);
            byteBuffer.get(jt2VarO.a, jt2VarO.c, iMin);
            i -= iMin;
            jt2VarO.c += iMin;
        }
        this.g += (long) iRemaining;
        return iRemaining;
    }

    @Override // defpackage.qp
    public final /* bridge */ /* synthetic */ qp writeByte(int i) {
        v(i);
        return this;
    }

    @Override // defpackage.qp
    public final /* bridge */ /* synthetic */ qp writeInt(int i) {
        B(i);
        return this;
    }

    @Override // defpackage.qp
    public final /* bridge */ /* synthetic */ qp writeShort(int i) {
        C(i);
        return this;
    }

    public final void x(long j) {
        boolean z;
        if (j == 0) {
            v(48);
            return;
        }
        if (j < 0) {
            j = -j;
            if (j < 0) {
                E("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        byte[] bArr = b.a;
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j)) * 10) >>> 5;
        int i = iNumberOfLeadingZeros + (j > b.b[iNumberOfLeadingZeros] ? 1 : 0);
        if (z) {
            i++;
        }
        jt2 jt2VarO = o(i);
        byte[] bArr2 = jt2VarO.a;
        int i2 = jt2VarO.c + i;
        while (j != 0) {
            i2--;
            bArr2[i2] = b.a[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr2[i2 - 1] = 45;
        }
        jt2VarO.c += i;
        this.g += (long) i;
    }

    @Override // defpackage.rp
    public final String y(Charset charset) {
        charset.getClass();
        return k(this.g, charset);
    }

    public final void z(long j) {
        if (j == 0) {
            v(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        jt2 jt2VarO = o(i);
        byte[] bArr = jt2VarO.a;
        int i2 = jt2VarO.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = b.a[(int) (15 & j)];
            j >>>= 4;
        }
        jt2VarO.c += i;
        this.g += (long) i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.g43
    public final void close() {
    }

    @Override // defpackage.qp, defpackage.g43, java.io.Flushable
    public final void flush() {
    }

    @Override // defpackage.qp
    public final qp write(byte[] bArr) {
        r(bArr, bArr.length);
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        jt2 jt2Var = this.f;
        if (jt2Var == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), jt2Var.c - jt2Var.b);
        byteBuffer.put(jt2Var.a, jt2Var.b, iMin);
        int i = jt2Var.b + iMin;
        jt2Var.b = i;
        this.g -= (long) iMin;
        if (i == jt2Var.c) {
            this.f = jt2Var.a();
            mt2.a(jt2Var);
        }
        return iMin;
    }
}
