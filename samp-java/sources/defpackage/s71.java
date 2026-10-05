package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class s71 implements jg0 {
    public final r71 a;

    public s71(r71 r71Var) {
        this.a = r71Var;
    }

    @Override // defpackage.oe
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final fp3 a(bl3 bl3Var) {
        int[] iArr;
        Object[] objArr;
        int[] iArr2;
        Object[] objArr2;
        int i;
        r71 r71Var = this.a;
        or1 or1Var = r71Var.b;
        nr1 nr1Var = new nr1(or1Var.e + 2);
        or1 or1Var2 = new or1(or1Var.e);
        int[] iArr3 = or1Var.b;
        Object[] objArr3 = or1Var.c;
        long[] jArr = or1Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((255 & j) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr3[i6];
                            q71 q71Var = (q71) objArr3[i6];
                            nr1Var.a(i7);
                            i = i3;
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            or1Var2.i(i7, new ep3((ue) bl3Var.a.h(q71Var.a), q71Var.b));
                        } else {
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            i = i3;
                        }
                        j >>= i;
                        i5++;
                        i3 = i;
                        iArr3 = iArr2;
                        objArr3 = objArr2;
                    }
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    iArr = iArr3;
                    objArr = objArr3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                iArr3 = iArr;
                objArr3 = objArr;
            }
        }
        if (!or1Var.a(0)) {
            int i8 = nr1Var.b;
            if (i8 < 0) {
                c.i("Index must be between 0 and size");
                return null;
            }
            nr1Var.b(i8 + 1);
            int[] iArr4 = nr1Var.a;
            int i9 = nr1Var.b;
            if (i9 != 0) {
                uj.G(1, 0, i9, iArr4, iArr4);
            }
            iArr4[0] = 0;
            nr1Var.b++;
        }
        if (!or1Var.a(r71Var.a)) {
            nr1Var.a(r71Var.a);
        }
        int i10 = nr1Var.b;
        if (i10 != 0) {
            int[] iArr5 = nr1Var.a;
            iArr5.getClass();
            Arrays.sort(iArr5, 0, i10);
        }
        return new fp3(nr1Var, or1Var2, r71Var.a, pg0.c);
    }
}
