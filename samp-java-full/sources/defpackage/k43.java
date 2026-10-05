package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
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
    */
    public final long p1(en1 en1Var) {
        int iP0;
        int iP02;
        int iP03;
        int i = 0;
        if (Float.isNaN(this.v)) {
            iP0 = Integer.MAX_VALUE;
        } else {
            iP0 = en1Var.p0(this.v);
            if (iP0 < 0) {
                iP0 = 0;
            }
        }
        if (Float.isNaN(this.w)) {
            iP02 = Integer.MAX_VALUE;
        } else {
            iP02 = en1Var.p0(this.w);
            if (iP02 < 0) {
                iP02 = 0;
            }
        }
        if (Float.isNaN(this.t)) {
            iP03 = 0;
        } else {
            iP03 = en1Var.p0(this.t);
            if (iP03 < 0) {
                iP03 = 0;
            }
            if (iP03 > iP0) {
                iP03 = iP0;
            }
            if (iP03 == Integer.MAX_VALUE) {
            }
        }
        if (!Float.isNaN(this.u)) {
            int iP04 = en1Var.p0(this.u);
            if (iP04 < 0) {
                iP04 = 0;
            }
            if (iP04 > iP02) {
                iP04 = iP02;
            }
            if (iP04 != Integer.MAX_VALUE) {
                i = iP04;
            }
        }
        return n30.a(iP03, iP0, i, iP02);
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
