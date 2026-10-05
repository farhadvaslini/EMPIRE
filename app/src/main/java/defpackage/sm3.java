package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class sm3 extends aq1 implements kb1 {
    public float t;
    public float u;

    @Override // defpackage.kb1
    public final int I(al1 al1Var, xm1 xm1Var, int i) {
        int iY = xm1Var.y(i);
        int iP0 = !Float.isNaN(this.u) ? al1Var.p0(this.u) : 0;
        return iY < iP0 ? iP0 : iY;
    }

    @Override // defpackage.kb1
    public final int Y(al1 al1Var, xm1 xm1Var, int i) {
        int iX0 = xm1Var.x0(i);
        int iP0 = !Float.isNaN(this.u) ? al1Var.p0(this.u) : 0;
        return iX0 < iP0 ? iP0 : iX0;
    }

    @Override // defpackage.kb1
    public final int r0(al1 al1Var, xm1 xm1Var, int i) {
        int iM0 = xm1Var.m0(i);
        int iP0 = !Float.isNaN(this.t) ? al1Var.p0(this.t) : 0;
        return iM0 < iP0 ? iP0 : iM0;
    }

    @Override // defpackage.kb1
    public final dn1 t(en1 en1Var, xm1 xm1Var, long j) {
        int iK;
        int iJ;
        if (Float.isNaN(this.t) || m30.k(j) != 0) {
            iK = m30.k(j);
        } else {
            int iP0 = en1Var.p0(this.t);
            iK = m30.i(j);
            if (iP0 < 0) {
                iP0 = 0;
            }
            if (iP0 <= iK) {
                iK = iP0;
            }
        }
        int i = m30.i(j);
        if (Float.isNaN(this.u) || m30.j(j) != 0) {
            iJ = m30.j(j);
        } else {
            int iP02 = en1Var.p0(this.u);
            iJ = m30.h(j);
            int i2 = iP02 >= 0 ? iP02 : 0;
            if (i2 <= iJ) {
                iJ = i2;
            }
        }
        i62 i62VarT = xm1Var.t(n30.a(iK, i, iJ, m30.h(j)));
        return en1Var.I0(i62VarT.f, i62VarT.g, oi0.f, new z6(i62VarT, 16));
    }

    @Override // defpackage.kb1
    public final int y(al1 al1Var, xm1 xm1Var, int i) {
        int iU0 = xm1Var.u0(i);
        int iP0 = !Float.isNaN(this.t) ? al1Var.p0(this.t) : 0;
        return iU0 < iP0 ? iP0 : iU0;
    }
}
