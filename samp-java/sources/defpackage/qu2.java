package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.qu2 b() {
        /*
            r17 = this;
            r0 = r17
            qu2 r1 = new qu2
            r1.<init>()
            boolean r2 = r0.h
            r1.h = r2
            boolean r2 = r0.i
            r1.i = r2
            is1 r2 = r1.f
            r2.getClass()
            is1 r0 = r0.f
            r0.getClass()
            java.lang.Object[] r3 = r0.b
            java.lang.Object[] r4 = r0.c
            long[] r0 = r0.a
            int r5 = r0.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L60
            r6 = 0
            r7 = r6
        L26:
            r8 = r0[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L5b
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L40:
            if (r12 >= r10) goto L59
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L55
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r4[r13]
            r2.m(r14, r13)
        L55:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L40
        L59:
            if (r10 != r11) goto L60
        L5b:
            if (r7 == r5) goto L60
            int r7 = r7 + 1
            goto L26
        L60:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qu2.b():qu2");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r19 = this;
            r0 = r19
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            boolean r2 = r0.h
            java.lang.String r3 = ", "
            if (r2 == 0) goto L14
            java.lang.String r2 = "mergeDescendants=true"
            r1.append(r2)
            r2 = r3
            goto L16
        L14:
            java.lang.String r2 = ""
        L16:
            boolean r4 = r0.i
            if (r4 == 0) goto L23
            r1.append(r2)
            java.lang.String r2 = "isClearingSemantics=true"
            r1.append(r2)
            r2 = r3
        L23:
            is1 r4 = r0.f
            java.lang.Object[] r5 = r4.b
            java.lang.Object[] r6 = r4.c
            long[] r4 = r4.a
            int r7 = r4.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7d
            r9 = 0
        L31:
            r10 = r4[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L78
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = 0
        L4b:
            if (r14 >= r12) goto L76
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L72
            int r15 = r9 << 3
            int r15 = r15 + r14
            r16 = r5[r15]
            r15 = r6[r15]
            r8 = r16
            cv2 r8 = (defpackage.cv2) r8
            r1.append(r2)
            java.lang.String r2 = r8.a
            r1.append(r2)
            java.lang.String r2 = " : "
            r1.append(r2)
            r1.append(r15)
            r2 = r3
        L72:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L4b
        L76:
            if (r12 != r13) goto L7d
        L78:
            if (r9 == r7) goto L7d
            int r9 = r9 + 1
            goto L31
        L7d:
            java.lang.String r0 = defpackage.pq.S(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "{ "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = " }"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qu2.toString():java.lang.String");
    }
}
