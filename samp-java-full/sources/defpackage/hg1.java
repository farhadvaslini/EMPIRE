package defpackage;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Build;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class hg1 extends o13 {
    public final List c;

    public hg1(List list) {
        this.c = list;
    }

    @Override // defpackage.o13
    public final Shader b(long j) {
        int i = 0;
        float fIntBitsToFloat = Float.intBitsToFloat(0) == Float.POSITIVE_INFINITY ? Float.intBitsToFloat((int) (j >> 32)) : Float.intBitsToFloat(0);
        float fIntBitsToFloat2 = Float.intBitsToFloat(0) == Float.POSITIVE_INFINITY ? Float.intBitsToFloat((int) (j & 4294967295L)) : Float.intBitsToFloat(0);
        float fIntBitsToFloat3 = Float.intBitsToFloat(2139095040) == Float.POSITIVE_INFINITY ? Float.intBitsToFloat((int) (j >> 32)) : Float.intBitsToFloat(2139095040);
        float fIntBitsToFloat4 = Float.intBitsToFloat(2139095040) == Float.POSITIVE_INFINITY ? Float.intBitsToFloat((int) (j & 4294967295L)) : Float.intBitsToFloat(2139095040);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L);
        List list = this.c;
        w7.e0(list);
        if (Build.VERSION.SDK_INT >= 29) {
            int size = list.size();
            long[] jArr = new long[size];
            while (i < size) {
                jArr[i] = s51.I(((wx) list.get(i)).a);
                i++;
            }
            return lw0.a.a(jFloatToRawIntBits, jFloatToRawIntBits2, jArr, null, 0);
        }
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L));
        int size2 = list.size();
        int[] iArr = new int[size2];
        while (i < size2) {
            iArr[i] = vp.T(((wx) list.get(i)).a);
            i++;
        }
        return new LinearGradient(fIntBitsToFloat5, fIntBitsToFloat6, fIntBitsToFloat7, fIntBitsToFloat8, iArr, (float[]) null, r51.C(0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hg1) {
            return this.c.equals(((hg1) obj).c) && gy1.b(0L, 0L) && gy1.b(9187343241974906880L, 9187343241974906880L);
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + nc2.c(9187343241974906880L, nc2.c(0L, this.c.hashCode() * 961, 31), 31);
    }

    public final String toString() {
        return "LinearGradient(colors=" + this.c + ", stops=null, " + nc2.i("start=", gy1.g(0L), ", ") + "tileMode=" + jo3.x(0) + ")";
    }
}
