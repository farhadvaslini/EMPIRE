package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class jr1 {
    public final is1 a;

    public static final Object a(is1 is1Var) {
        Object objG = is1Var.g(null);
        if (objG == null) {
            return null;
        }
        if (!(objG instanceof as1)) {
            is1Var.k(null);
            return objG;
        }
        as1 as1Var = (as1) objG;
        if (as1Var.i()) {
            c.m("List is empty.");
            return null;
        }
        int i = as1Var.b - 1;
        Object objG2 = as1Var.g(i);
        as1Var.l(i);
        objG2.getClass();
        if (as1Var.i()) {
            is1Var.k(null);
        }
        if (as1Var.b == 1) {
            is1Var.m(null, as1Var.f());
        }
        return objG2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.as1 b(defpackage.is1 r14) {
        /*
            boolean r0 = r14.i()
            if (r0 == 0) goto Lc
            as1 r14 = defpackage.cy1.b
            r14.getClass()
            return r14
        Lc:
            as1 r0 = new as1
            r0.<init>()
            java.lang.Object[] r1 = r14.c
            long[] r14 = r14.a
            int r2 = r14.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L61
            r3 = 0
            r4 = r3
        L1c:
            r5 = r14[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L5c
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L36:
            if (r9 >= r7) goto L5a
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L56
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            boolean r11 = r10 instanceof defpackage.as1
            if (r11 == 0) goto L50
            as1 r10 = (defpackage.as1) r10
            r0.c(r10)
            goto L56
        L50:
            r10.getClass()
            r0.b(r10)
        L56:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L36
        L5a:
            if (r7 != r8) goto L61
        L5c:
            if (r4 == r2) goto L61
            int r4 = r4 + 1
            goto L1c
        L61:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jr1.b(is1):as1");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jr1) {
            return this.a.equals(((jr1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.a + ")";
    }
}
