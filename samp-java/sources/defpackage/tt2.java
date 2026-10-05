package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class tt2 extends kq {
    public final transient byte[][] j;
    public final transient int[] k;

    public tt2(byte[][] bArr, int[] iArr) {
        super(kq.i.f);
        this.j = bArr;
        this.k = iArr;
    }

    @Override // defpackage.kq
    public final String a() {
        return new kq(k()).a();
    }

    @Override // defpackage.kq
    public final int b() {
        return this.k[this.j.length - 1];
    }

    @Override // defpackage.kq
    public final String c() {
        return new kq(k()).c();
    }

    @Override // defpackage.kq
    public final byte[] d() {
        return k();
    }

    @Override // defpackage.kq
    public final byte e(int i) {
        byte[][] bArr = this.j;
        int length = bArr.length - 1;
        int[] iArr = this.k;
        rn.v(iArr[length], i, 1L);
        int iA0 = w7.a0(this, i);
        return bArr[iA0][(i - (iA0 == 0 ? 0 : iArr[iA0 - 1])) + iArr[bArr.length + iA0]];
    }

    @Override // defpackage.kq
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kq)) {
            return false;
        }
        kq kqVar = (kq) obj;
        return kqVar.b() == b() && g(kqVar, b());
    }

    @Override // defpackage.kq
    public final boolean f(int i, int i2, int i3, byte[] bArr) {
        bArr.getClass();
        if (i >= 0 && i <= b() - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
            int i4 = i3 + i;
            int iA0 = w7.a0(this, i);
            while (i < i4) {
                int[] iArr = this.k;
                int i5 = iA0 == 0 ? 0 : iArr[iA0 - 1];
                int i6 = iArr[iA0] - i5;
                byte[][] bArr2 = this.j;
                int i7 = iArr[bArr2.length + iA0];
                int iMin = Math.min(i4, i6 + i5) - i;
                int i8 = (i - i5) + i7;
                byte[] bArr3 = bArr2[iA0];
                bArr3.getClass();
                for (int i9 = 0; i9 < iMin; i9++) {
                    if (bArr3[i9 + i8] == bArr[i9 + i2]) {
                    }
                }
                i2 += iMin;
                i += iMin;
                iA0++;
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.kq
    public final boolean g(kq kqVar, int i) {
        kqVar.getClass();
        if (b() - i >= 0) {
            int iA0 = w7.a0(this, 0);
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int[] iArr = this.k;
                int i4 = iA0 == 0 ? 0 : iArr[iA0 - 1];
                int i5 = iArr[iA0] - i4;
                byte[][] bArr = this.j;
                int i6 = iArr[bArr.length + iA0];
                int iMin = Math.min(i, i5 + i4) - i2;
                if (kqVar.f(i3, (i2 - i4) + i6, iMin, bArr[iA0])) {
                    i3 += iMin;
                    i2 += iMin;
                    iA0++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.kq
    public final String h(Charset charset) {
        charset.getClass();
        return new kq(k()).h(charset);
    }

    @Override // defpackage.kq
    public final int hashCode() {
        int i = this.g;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.j;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.k;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.g = i3;
        return i3;
    }

    @Override // defpackage.kq
    public final kq i(int i, int i2) {
        if (i < 0) {
            c.g(by1.h("beginIndex=", " < 0", i));
            return null;
        }
        if (i2 > b()) {
            StringBuilder sbM = nc2.m("endIndex=", " > length(", i2);
            sbM.append(b());
            sbM.append(')');
            throw new IllegalArgumentException(sbM.toString().toString());
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            c.g(nc2.g(i2, i, "endIndex=", " < beginIndex="));
            return null;
        }
        if (i == 0 && i2 == b()) {
            return this;
        }
        if (i == i2) {
            return kq.i;
        }
        int iA0 = w7.a0(this, i);
        int iA02 = w7.a0(this, i2 - 1);
        byte[][] bArr = this.j;
        byte[][] bArr2 = (byte[][]) uj.N(bArr, iA0, iA02 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.k;
        if (iA0 <= iA02) {
            int i4 = iA0;
            int i5 = 0;
            while (true) {
                iArr[i5] = Math.min(iArr2[i4] - i, i3);
                int i6 = i5 + 1;
                iArr[i5 + bArr2.length] = iArr2[bArr.length + i4];
                if (i4 == iA02) {
                    break;
                }
                i4++;
                i5 = i6;
            }
        }
        int i7 = iA0 != 0 ? iArr2[iA0 - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i - i7) + iArr[length];
        return new tt2(bArr2, iArr);
    }

    @Override // defpackage.kq
    public final kq j() {
        return new kq(k()).j();
    }

    @Override // defpackage.kq
    public final byte[] k() {
        byte[] bArr = new byte[b()];
        byte[][] bArr2 = this.j;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.k;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            uj.H(bArr2[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // defpackage.kq
    public final void m(hp hpVar, int i) {
        int iA0 = w7.a0(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.k;
            int i3 = iA0 == 0 ? 0 : iArr[iA0 - 1];
            int i4 = iArr[iA0] - i3;
            byte[][] bArr = this.j;
            int i5 = iArr[bArr.length + iA0];
            int iMin = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            jt2 jt2Var = new jt2(bArr[iA0], i6, true, i6 + iMin);
            jt2 jt2Var2 = hpVar.f;
            if (jt2Var2 == null) {
                jt2Var.g = jt2Var;
                jt2Var.f = jt2Var;
                hpVar.f = jt2Var;
            } else {
                jt2 jt2Var3 = jt2Var2.g;
                jt2Var3.getClass();
                jt2Var3.b(jt2Var);
            }
            i2 += iMin;
            iA0++;
        }
        hpVar.g += (long) i;
    }

    @Override // defpackage.kq
    public final String toString() {
        return new kq(k()).toString();
    }
}
