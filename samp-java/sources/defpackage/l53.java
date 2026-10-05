package defpackage;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class l53 {
    public static final int a(ArrayList arrayList, int i, int i2) {
        int iE = e(arrayList, i, i2);
        return iE >= 0 ? iE : -(iE + 1);
    }

    public static final int b(int[] iArr, int i) {
        int i2 = i * 5;
        return Integer.bitCount(iArr[i2 + 1] >> 28) + iArr[i2 + 4];
    }

    public static final void c(int i, int i2, int[] iArr) {
        if (i2 >= 0) {
        }
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }

    public static final j53 d(j53 j53Var) {
        if (!(j53Var instanceof j53)) {
            j53Var = null;
        }
        if (j53Var != null) {
            return j53Var;
        }
        e20.b("Inconsistent composition");
        c.d();
        return null;
    }

    public static final int e(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((iv0) arrayList.get(i4)).a;
            if (i5 < 0) {
                i5 += i2;
            }
            int iR = s51.r(i5, i);
            if (iR < 0) {
                i3 = i4 + 1;
            } else {
                if (iR <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final void f() {
        throw new ConcurrentModificationException();
    }
}
