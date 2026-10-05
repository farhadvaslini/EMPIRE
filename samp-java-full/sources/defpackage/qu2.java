package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class qu2 implements dv2, Iterable, t61 {
    public final is1 f;
    public lm1 g;
    public boolean h;
    public boolean i;

    public qu2() {
        long[] jArr = nr2.a;
        this.f = new is1();
    }

    @Override // defpackage.dv2
    public final void a(cv2 cv2Var, Object obj) {
        boolean z = obj instanceof y0;
        is1 is1Var = this.f;
        if (z && is1Var.c(cv2Var)) {
            Object objG = is1Var.g(cv2Var);
            objG.getClass();
            y0 y0Var = (y0) objG;
            y0 y0Var2 = (y0) obj;
            String str = y0Var2.a;
            if (str == null) {
                str = y0Var.a;
            }
            zs0 zs0Var = y0Var2.b;
            if (zs0Var == null) {
                zs0Var = y0Var.b;
            }
            is1Var.m(cv2Var, new y0(str, zs0Var));
        } else {
            is1Var.m(cv2Var, obj);
        }
        cv2Var.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final qu2 b() {
        qu2 qu2Var = new qu2();
        qu2Var.h = this.h;
        qu2Var.i = this.i;
        is1 is1Var = qu2Var.f;
        is1Var.getClass();
        is1 is1Var2 = this.f;
        is1Var2.getClass();
        Object[] objArr = is1Var2.b;
        Object[] objArr2 = is1Var2.c;
        long[] jArr = is1Var2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            is1Var.m(objArr[i4], objArr2[i4]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return qu2Var;
    }

    public final Object c(cv2 cv2Var) {
        Object objG = this.f.g(cv2Var);
        if (objG != null) {
            return objG;
        }
        throw new IllegalStateException("Key not present: " + cv2Var + " - consider getOrElse or getOrNull");
    }

    public final void e(qu2 qu2Var) {
        is1 is1Var = qu2Var.f;
        Object[] objArr = is1Var.b;
        Object[] objArr2 = is1Var.c;
        long[] jArr = is1Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        cv2 cv2Var = (cv2) obj;
                        is1 is1Var2 = this.f;
                        Object objG = is1Var2.g(cv2Var);
                        cv2Var.getClass();
                        Object objF = cv2Var.b.f(objG, obj2);
                        if (objF != null) {
                            is1Var2.m(cv2Var, objF);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qu2)) {
            return false;
        }
        qu2 qu2Var = (qu2) obj;
        return s51.n(this.f, qu2Var.f) && this.h == qu2Var.h && this.i == qu2Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + by1.b(this.f.hashCode() * 31, 31, this.h);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        lm1 lm1Var = this.g;
        if (lm1Var == null) {
            is1 is1Var = this.f;
            is1Var.getClass();
            lm1 lm1Var2 = new lm1(is1Var);
            this.g = lm1Var2;
            lm1Var = lm1Var2;
        }
        return ((kj0) lm1Var.entrySet()).iterator();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[PHI: r2
      0x0078: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.h) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.i) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        is1 is1Var = this.f;
        Object[] objArr = is1Var.b;
        Object[] objArr2 = is1Var.c;
        long[] jArr = is1Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            sb.append(str);
                            sb.append(((cv2) obj).a);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return pq.S(this) + "{ " + ((Object) sb) + " }";
    }
}
