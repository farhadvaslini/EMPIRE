package defpackage;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class hz0 {
    public final hp a;
    public boolean c;
    public int g;
    public int h;
    public int b = Integer.MAX_VALUE;
    public int d = 4096;
    public sx0[] e = new sx0[8];
    public int f = 7;

    public hz0(hp hpVar) {
        this.a = hpVar;
    }

    public final void a(int i) {
        int i2;
        if (i > 0) {
            int length = this.e.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f;
                if (length < i2 || i <= 0) {
                    break;
                }
                sx0 sx0Var = this.e[length];
                sx0Var.getClass();
                i -= sx0Var.c;
                int i4 = this.h;
                sx0 sx0Var2 = this.e[length];
                sx0Var2.getClass();
                this.h = i4 - sx0Var2.c;
                this.g--;
                i3++;
                length--;
            }
            sx0[] sx0VarArr = this.e;
            int i5 = i2 + 1;
            System.arraycopy(sx0VarArr, i5, sx0VarArr, i5 + i3, this.g);
            sx0[] sx0VarArr2 = this.e;
            int i6 = this.f + 1;
            Arrays.fill(sx0VarArr2, i6, i6 + i3, (Object) null);
            this.f += i3;
        }
    }

    public final void b(sx0 sx0Var) {
        int i = sx0Var.c;
        int i2 = this.d;
        if (i > i2) {
            sx0[] sx0VarArr = this.e;
            uj.O(0, sx0VarArr.length, null, sx0VarArr);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
            return;
        }
        a((this.h + i) - i2);
        int i3 = this.g + 1;
        sx0[] sx0VarArr2 = this.e;
        if (i3 > sx0VarArr2.length) {
            sx0[] sx0VarArr3 = new sx0[sx0VarArr2.length * 2];
            System.arraycopy(sx0VarArr2, 0, sx0VarArr3, sx0VarArr2.length, sx0VarArr2.length);
            this.f = this.e.length - 1;
            this.e = sx0VarArr3;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        this.e[i4] = sx0Var;
        this.g++;
        this.h += i;
    }

    public final void c(kq kqVar) throws EOFException {
        kqVar.getClass();
        int[] iArr = k01.a;
        int iB = kqVar.b();
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < iB; i++) {
            byte bE = kqVar.e(i);
            byte[] bArr = jv3.a;
            j2 += (long) k01.b[bE & 255];
        }
        int i2 = (int) ((j2 + 7) >> 3);
        int iB2 = kqVar.b();
        hp hpVar = this.a;
        if (i2 >= iB2) {
            e(kqVar.b(), 127, 0);
            hpVar.p(kqVar);
            return;
        }
        hp hpVar2 = new hp();
        int[] iArr2 = k01.a;
        int iB3 = kqVar.b();
        int i3 = 0;
        for (int i4 = 0; i4 < iB3; i4++) {
            byte bE2 = kqVar.e(i4);
            byte[] bArr2 = jv3.a;
            int i5 = bE2 & 255;
            int i6 = k01.a[i5];
            byte b = k01.b[i5];
            j = (j << b) | ((long) i6);
            i3 += b;
            while (i3 >= 8) {
                i3 -= 8;
                hpVar2.v((int) (j >> i3));
            }
        }
        if (i3 > 0) {
            hpVar2.v((int) ((j << (8 - i3)) | (255 >>> i3)));
        }
        kq kqVarG = hpVar2.g(hpVar2.g);
        e(kqVarG.b(), 127, 128);
        hpVar.p(kqVarG);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(ArrayList arrayList) throws EOFException {
        int length;
        int length2;
        if (this.c) {
            int i = this.b;
            if (i < this.d) {
                e(i, 31, 32);
            }
            this.c = false;
            this.b = Integer.MAX_VALUE;
            e(this.d, 31, 32);
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            sx0 sx0Var = (sx0) arrayList.get(i2);
            kq kqVarJ = sx0Var.a.j();
            kq kqVar = sx0Var.b;
            Integer num = (Integer) iz0.b.get(kqVarJ);
            if (num != null) {
                int iIntValue = num.intValue();
                length2 = iIntValue + 1;
                if (2 > length2 || length2 >= 8) {
                    length = length2;
                    length2 = -1;
                } else {
                    sx0[] sx0VarArr = iz0.a;
                    if (s51.n(sx0VarArr[iIntValue].b, kqVar)) {
                        length = length2;
                    } else if (s51.n(sx0VarArr[length2].b, kqVar)) {
                        length2 = iIntValue + 2;
                        length = length2;
                    }
                }
            } else {
                length = -1;
                length2 = -1;
            }
            if (length2 == -1) {
                int i3 = this.f + 1;
                int length3 = this.e.length;
                while (true) {
                    if (i3 >= length3) {
                        break;
                    }
                    sx0 sx0Var2 = this.e[i3];
                    sx0Var2.getClass();
                    if (s51.n(sx0Var2.a, kqVarJ)) {
                        sx0 sx0Var3 = this.e[i3];
                        sx0Var3.getClass();
                        if (s51.n(sx0Var3.b, kqVar)) {
                            length2 = iz0.a.length + (i3 - this.f);
                            break;
                        } else if (length == -1) {
                            length = (i3 - this.f) + iz0.a.length;
                        }
                    }
                    i3++;
                }
            }
            if (length2 != -1) {
                e(length2, 127, 128);
            } else if (length == -1) {
                this.a.v(64);
                c(kqVarJ);
                c(kqVar);
                b(sx0Var);
            } else {
                kq kqVar2 = sx0.d;
                kqVarJ.getClass();
                kqVar2.getClass();
                if (!kqVarJ.g(kqVar2, kqVar2.b()) || s51.n(sx0.i, kqVarJ)) {
                    e(length, 63, 64);
                    c(kqVar);
                    b(sx0Var);
                } else {
                    e(length, 15, 0);
                    c(kqVar);
                }
            }
        }
    }

    public final void e(int i, int i2, int i3) {
        hp hpVar = this.a;
        if (i < i2) {
            hpVar.v(i | i3);
            return;
        }
        hpVar.v(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            hpVar.v(128 | (i4 & 127));
            i4 >>>= 7;
        }
        hpVar.v(i4);
    }
}
