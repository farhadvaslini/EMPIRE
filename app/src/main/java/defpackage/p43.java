package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class p43 extends aq1 implements kb1 {
    public final d42 t;
    public final d42 u;
    public m30 v;
    public long w = -9223372034707292160L;

    public p43(mr2 mr2Var, cs0 cs0Var) {
        this.t = b32.w(mr2Var);
        this.u = b32.w(cs0Var);
    }

    @Override // defpackage.kb1
    public final int I(al1 al1Var, xm1 xm1Var, int i) {
        return (al1Var.M() || p41.b(this.w, -9223372034707292160L)) ? xm1Var.y(i) : (int) (this.w & 4294967295L);
    }

    @Override // defpackage.kb1
    public final int Y(al1 al1Var, xm1 xm1Var, int i) {
        return (al1Var.M() || p41.b(this.w, -9223372034707292160L)) ? xm1Var.x0(i) : (int) (this.w & 4294967295L);
    }

    @Override // defpackage.kb1
    public final int r0(al1 al1Var, xm1 xm1Var, int i) {
        return (al1Var.M() || p41.b(this.w, -9223372034707292160L)) ? xm1Var.m0(i) : (int) (this.w >> 32);
    }

    @Override // defpackage.kb1
    public final dn1 t(en1 en1Var, xm1 xm1Var, long j) {
        i62 i62VarT;
        if (en1Var.M()) {
            this.v = new m30(j);
        }
        boolean zBooleanValue = ((Boolean) ((cs0) this.u.getValue()).a()).booleanValue();
        oi0 oi0Var = oi0.f;
        if (!zBooleanValue) {
            i62 i62VarT2 = xm1Var.t(j);
            return en1Var.I0(i62VarT2.f, i62VarT2.g, oi0Var, new fe(i62VarT2, 3));
        }
        if (en1Var.M()) {
            i62VarT = xm1Var.t(j);
            this.w = (((long) i62VarT.f) << 32) | (((long) i62VarT.g) & 4294967295L);
        } else {
            m30 m30Var = this.v;
            m30Var.getClass();
            i62VarT = xm1Var.t(m30Var.a);
        }
        i62 i62Var = i62VarT;
        long jD = n30.d(j, this.w);
        return en1Var.I0((int) (jD >> 32), (int) (jD & 4294967295L), oi0Var, new o43(this, i62Var, jD, en1Var));
    }

    @Override // defpackage.kb1
    public final int y(al1 al1Var, xm1 xm1Var, int i) {
        return (al1Var.M() || p41.b(this.w, -9223372034707292160L)) ? xm1Var.u0(i) : (int) (this.w >> 32);
    }
}
