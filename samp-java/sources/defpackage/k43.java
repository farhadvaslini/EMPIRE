package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class k43 extends aq1 implements kb1 {
    public float t;
    public float u;
    public float v;
    public float w;
    public boolean x;

    @Override // defpackage.kb1
    public final int I(al1 al1Var, xm1 xm1Var, int i) {
        long jP1 = p1(al1Var);
        if (m30.f(jP1)) {
            return m30.h(jP1);
        }
        if (!this.x) {
            i = n30.g(i, jP1);
        }
        return n30.f(xm1Var.y(i), jP1);
    }

    @Override // defpackage.kb1
    public final int Y(al1 al1Var, xm1 xm1Var, int i) {
        long jP1 = p1(al1Var);
        if (m30.f(jP1)) {
            return m30.h(jP1);
        }
        if (!this.x) {
            i = n30.g(i, jP1);
        }
        return n30.f(xm1Var.x0(i), jP1);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long p1(defpackage.en1 r7) {
        /*
            r6 = this;
            float r0 = r6.v
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
            if (r0 != 0) goto L16
            float r0 = r6.v
            int r0 = r7.p0(r0)
            if (r0 >= 0) goto L17
            r0 = r2
            goto L17
        L16:
            r0 = r1
        L17:
            float r3 = r6.w
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L29
            float r3 = r6.w
            int r3 = r7.p0(r3)
            if (r3 >= 0) goto L2a
            r3 = r2
            goto L2a
        L29:
            r3 = r1
        L2a:
            float r4 = r6.t
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L41
            float r4 = r6.t
            int r4 = r7.p0(r4)
            if (r4 >= 0) goto L3b
            r4 = r2
        L3b:
            if (r4 <= r0) goto L3e
            r4 = r0
        L3e:
            if (r4 == r1) goto L41
            goto L42
        L41:
            r4 = r2
        L42:
            float r5 = r6.u
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L59
            float r6 = r6.u
            int r6 = r7.p0(r6)
            if (r6 >= 0) goto L53
            r6 = r2
        L53:
            if (r6 <= r3) goto L56
            r6 = r3
        L56:
            if (r6 == r1) goto L59
            r2 = r6
        L59:
            long r6 = defpackage.n30.a(r4, r0, r2, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k43.p1(en1):long");
    }

    @Override // defpackage.kb1
    public final int r0(al1 al1Var, xm1 xm1Var, int i) {
        long jP1 = p1(al1Var);
        if (m30.g(jP1)) {
            return m30.i(jP1);
        }
        if (!this.x) {
            i = n30.f(i, jP1);
        }
        return n30.g(xm1Var.m0(i), jP1);
    }

    @Override // defpackage.kb1
    public final dn1 t(en1 en1Var, xm1 xm1Var, long j) {
        int iK;
        int i;
        int iJ;
        int iH;
        long jA;
        long jP1 = p1(en1Var);
        if (this.x) {
            jA = n30.e(j, jP1);
        } else {
            if (Float.isNaN(this.t)) {
                iK = m30.k(j);
                int i2 = m30.i(jP1);
                if (iK > i2) {
                    iK = i2;
                }
            } else {
                iK = m30.k(jP1);
            }
            if (Float.isNaN(this.v)) {
                i = m30.i(j);
                int iK2 = m30.k(jP1);
                if (i < iK2) {
                    i = iK2;
                }
            } else {
                i = m30.i(jP1);
            }
            if (Float.isNaN(this.u)) {
                iJ = m30.j(j);
                int iH2 = m30.h(jP1);
                if (iJ > iH2) {
                    iJ = iH2;
                }
            } else {
                iJ = m30.j(jP1);
            }
            if (Float.isNaN(this.w)) {
                iH = m30.h(j);
                int iJ2 = m30.j(jP1);
                if (iH < iJ2) {
                    iH = iJ2;
                }
            } else {
                iH = m30.h(jP1);
            }
            jA = n30.a(iK, i, iJ, iH);
        }
        i62 i62VarT = xm1Var.t(jA);
        return en1Var.I0(i62VarT.f, i62VarT.g, oi0.f, new z6(i62VarT, 10));
    }

    @Override // defpackage.kb1
    public final int y(al1 al1Var, xm1 xm1Var, int i) {
        long jP1 = p1(al1Var);
        if (m30.g(jP1)) {
            return m30.i(jP1);
        }
        if (!this.x) {
            i = n30.f(i, jP1);
        }
        return n30.g(xm1Var.u0(i), jP1);
    }
}
