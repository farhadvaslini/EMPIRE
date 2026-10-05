package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class gz0 {
    public long c;
    public final ej2 d;
    public int g;
    public int h;
    public int a = 4096;
    public final ArrayList b = new ArrayList();
    public sx0[] e = new sx0[8];
    public int f = 7;

    public gz0(yz0 yz0Var) {
        this.d = new ej2(yz0Var);
    }

    public final void a(sx0 sx0Var) throws IOException {
        this.b.add(sx0Var);
        long jB = this.c + ((long) (sx0Var.b.b() + sx0Var.a.b()));
        this.c = jB;
        if (jB <= 262144) {
            return;
        }
        c.r("header byte count limit of 262144 exceeded");
    }

    public final int b(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.e.length;
            while (true) {
                length--;
                i2 = this.f;
                if (length < i2 || i <= 0) {
                    break;
                }
                sx0 sx0Var = this.e[length];
                sx0Var.getClass();
                int i4 = sx0Var.c;
                i -= i4;
                this.h -= i4;
                this.g--;
                i3++;
            }
            sx0[] sx0VarArr = this.e;
            System.arraycopy(sx0VarArr, i2 + 1, sx0VarArr, i2 + 1 + i3, this.g);
            this.f += i3;
        }
        return i3;
    }

    public final kq c(int i) throws IOException {
        if (i >= 0) {
            sx0[] sx0VarArr = iz0.a;
            if (i <= sx0VarArr.length - 1) {
                return sx0VarArr[i].a;
            }
        }
        int length = this.f + 1 + (i - iz0.a.length);
        if (length >= 0) {
            sx0[] sx0VarArr2 = this.e;
            if (length < sx0VarArr2.length) {
                sx0 sx0Var = sx0VarArr2[length];
                sx0Var.getClass();
                return sx0Var.a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void d(sx0 sx0Var) throws IOException {
        a(sx0Var);
        int i = sx0Var.c;
        int i2 = this.a;
        if (i > i2) {
            sx0[] sx0VarArr = this.e;
            uj.O(0, sx0VarArr.length, null, sx0VarArr);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
            return;
        }
        b((this.h + i) - i2);
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

    public final kq e() throws IOException {
        ej2 ej2Var = this.d;
        byte b = ej2Var.readByte();
        byte[] bArr = jv3.a;
        int i = b & 255;
        int i2 = 0;
        boolean z = (b & 128) == 128;
        long jF = f(i, 127);
        if (this.c + jF > 262144) {
            c.r("header byte count limit of 262144 exceeded");
            return null;
        }
        if (!z) {
            return ej2Var.g(jF);
        }
        hp hpVar = new hp();
        int[] iArr = k01.a;
        ej2Var.getClass();
        j01 j01Var = k01.c;
        j01 j01Var2 = j01Var;
        int i3 = 0;
        for (long j = 0; j < jF; j++) {
            byte b2 = ej2Var.readByte();
            byte[] bArr2 = jv3.a;
            i2 = (i2 << 8) | (b2 & 255);
            i3 += 8;
            while (i3 >= 8) {
                j01[] j01VarArr = (j01[]) j01Var2.h;
                j01VarArr.getClass();
                j01Var2 = j01VarArr[(i2 >>> (i3 - 8)) & 255];
                j01Var2.getClass();
                if (((j01[]) j01Var2.h) == null) {
                    hpVar.v(j01Var2.f);
                    i3 -= j01Var2.g;
                    j01Var2 = j01Var;
                } else {
                    i3 -= 8;
                }
            }
        }
        while (i3 > 0) {
            j01[] j01VarArr2 = (j01[]) j01Var2.h;
            j01VarArr2.getClass();
            j01 j01Var3 = j01VarArr2[(i2 << (8 - i3)) & 255];
            j01Var3.getClass();
            int i4 = j01Var3.g;
            if (((j01[]) j01Var3.h) != null || i4 > i3) {
                break;
            }
            hpVar.v(j01Var3.f);
            i3 -= i4;
            j01Var2 = j01Var;
        }
        return hpVar.g(hpVar.g);
    }

    public final int f(int i, int i2) throws IOException {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        long j = i2;
        int i4 = 0;
        int i5 = 0;
        while (i4 != 5) {
            byte b = this.d.readByte();
            byte[] bArr = jv3.a;
            i4++;
            long j2 = ((long) (b & 127)) << i5;
            if (j2 > 2147483647L - j) {
                c.r("HPACK integer overflow");
                return 0;
            }
            j += j2;
            if ((b & 128) == 0) {
                return (int) j;
            }
            i5 += 7;
        }
        c.r("HPACK integer overflow");
        return 0;
    }
}
