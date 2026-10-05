package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class q51 extends n51 {
    public m51 u;
    public boolean v;

    @Override // defpackage.n51
    public final long p1(xm1 xm1Var, long j) {
        int iM0 = this.u == m51.f ? xm1Var.m0(m30.h(j)) : xm1Var.u0(m30.h(j));
        if (iM0 < 0) {
            iM0 = 0;
        }
        if (iM0 < 0) {
            o21.a("width must be >= 0");
        }
        return n30.h(iM0, iM0, 0, Integer.MAX_VALUE);
    }

    @Override // defpackage.n51
    public final boolean q1() {
        return this.v;
    }

    @Override // defpackage.n51, defpackage.kb1
    public final int r0(al1 al1Var, xm1 xm1Var, int i) {
        return this.u == m51.f ? xm1Var.m0(i) : xm1Var.u0(i);
    }

    @Override // defpackage.n51, defpackage.kb1
    public final int y(al1 al1Var, xm1 xm1Var, int i) {
        return this.u == m51.f ? xm1Var.m0(i) : xm1Var.u0(i);
    }
}
