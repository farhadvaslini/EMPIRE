package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class j51 extends n51 {
    public m51 u;
    public boolean v;

    @Override // defpackage.n51, defpackage.kb1
    public final int I(al1 al1Var, xm1 xm1Var, int i) {
        return this.u == m51.f ? xm1Var.x0(i) : xm1Var.y(i);
    }

    @Override // defpackage.n51, defpackage.kb1
    public final int Y(al1 al1Var, xm1 xm1Var, int i) {
        return this.u == m51.f ? xm1Var.x0(i) : xm1Var.y(i);
    }

    @Override // defpackage.n51
    public final long p1(xm1 xm1Var, long j) {
        int iX0 = this.u == m51.f ? xm1Var.x0(m30.i(j)) : xm1Var.y(m30.i(j));
        if (iX0 < 0) {
            iX0 = 0;
        }
        if (iX0 < 0) {
            o21.a("height must be >= 0");
        }
        return n30.h(0, Integer.MAX_VALUE, iX0, iX0);
    }

    @Override // defpackage.n51
    public final boolean q1() {
        return this.v;
    }
}
