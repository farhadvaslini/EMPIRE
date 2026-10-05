package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class hm0 extends aq1 implements kb1 {
    public tb0 t;
    public float u;

    @Override // defpackage.kb1
    public final dn1 t(en1 en1Var, xm1 xm1Var, long j) {
        int iK;
        int i;
        int iH;
        int i2;
        if (!m30.e(j) || this.t == tb0.f) {
            iK = m30.k(j);
            i = m30.i(j);
        } else {
            int iRound = Math.round(m30.i(j) * this.u);
            int iK2 = m30.k(j);
            iK = m30.i(j);
            if (iRound < iK2) {
                iRound = iK2;
            }
            if (iRound <= iK) {
                iK = iRound;
            }
            i = iK;
        }
        if (!m30.d(j) || this.t == tb0.g) {
            int iJ = m30.j(j);
            int iH2 = m30.h(j);
            iH = iJ;
            i2 = iH2;
        } else {
            int iRound2 = Math.round(m30.h(j) * this.u);
            int iJ2 = m30.j(j);
            iH = m30.h(j);
            if (iRound2 < iJ2) {
                iRound2 = iJ2;
            }
            if (iRound2 <= iH) {
                iH = iRound2;
            }
            i2 = iH;
        }
        i62 i62VarT = xm1Var.t(n30.a(iK, i, iH, i2));
        return en1Var.I0(i62VarT.f, i62VarT.g, oi0.f, new z6(i62VarT, 3));
    }
}
