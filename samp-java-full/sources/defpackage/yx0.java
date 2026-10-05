package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class yx0 extends aq1 implements m20, kb1, ey1 {
    public ml3 A;
    public gh3 t;
    public int u;
    public int v;
    public boolean w;
    public int x;
    public int y;
    public gh3 z;

    @Override // defpackage.kb1
    public final int I(al1 al1Var, xm1 xm1Var, int i) {
        q1(al1Var);
        int i2 = this.x;
        int i3 = this.y;
        if (i2 == i3) {
            return i3;
        }
        int iY = xm1Var.y(i);
        int i4 = this.x;
        int i5 = this.y;
        if (iY < i4) {
            iY = i4;
        }
        return iY > i5 ? i5 : iY;
    }

    @Override // defpackage.kb1
    public final int Y(al1 al1Var, xm1 xm1Var, int i) {
        q1(al1Var);
        int i2 = this.x;
        if (i2 == this.y) {
            return i2;
        }
        int iX0 = xm1Var.x0(i);
        int i3 = this.x;
        int i4 = this.y;
        if (iX0 < i3) {
            iX0 = i3;
        }
        return iX0 > i4 ? i4 : iX0;
    }

    @Override // defpackage.ia0
    public final void Z0() {
        this.z = n32.y(this.t, vr.X(this).F);
        this.w = true;
        lq.J(this);
    }

    @Override // defpackage.ia0
    public final void c() {
        this.w = true;
        lq.J(this);
    }

    @Override // defpackage.aq1
    public final boolean e1() {
        return false;
    }

    @Override // defpackage.aq1
    public final void h1() {
        zp0 zp0Var = (zp0) ur.z(this, s20.k);
        this.z = n32.y(this.t, vr.X(this).F);
        zb3 zb3Var = r1().a.f;
        xq0 xq0Var = r1().a.c;
        if (xq0Var == null) {
            xq0Var = xq0.h;
        }
        vq0 vq0Var = r1().a.d;
        int i = vq0Var != null ? vq0Var.a : 0;
        wq0 wq0Var = r1().a.e;
        this.A = ((aq0) zp0Var).b(zb3Var, xq0Var, i, wq0Var != null ? wq0Var.a : 65535);
        gq.M(this, new xx0(this, 0));
        this.w = true;
    }

    @Override // defpackage.aq1
    public final void i1() {
        this.z = null;
        this.A = null;
        this.w = false;
    }

    @Override // defpackage.ey1
    public final void k0() {
        if (this.A != null) {
            gq.M(this, new xx0(this, 1));
        }
        this.w = true;
        lq.J(this);
    }

    public final void p1(en1 en1Var, gh3 gh3Var, zp0 zp0Var) {
        ng3 ng3Var = ue3.b(gh3Var, en1Var, zp0Var, 3, true).d;
        float fH = ng3Var.h(0);
        float fH2 = ng3Var.h(1);
        float fH3 = ng3Var.h(2);
        this.x = uq.n(this.u, 1, fH, fH2, fH3);
        this.y = uq.n(this.v, Integer.MAX_VALUE, fH, fH2, fH3);
    }

    public final void q1(al1 al1Var) {
        if (this.w) {
            p1(al1Var, r1(), (zp0) ur.z(this, s20.k));
            this.w = false;
        }
        int i = this.x;
        this.x = i >= 0 ? i : 0;
        int i2 = this.y;
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        this.y = i2;
    }

    public final gh3 r1() {
        gh3 gh3Var = this.z;
        if (gh3Var != null) {
            return gh3Var;
        }
        throw nc2.y("Resolved style is not set.");
    }

    @Override // defpackage.kb1
    public final dn1 t(en1 en1Var, xm1 xm1Var, long j) {
        if (this.w) {
            p1(en1Var, r1(), (zp0) ur.z(this, s20.k));
            this.w = false;
        }
        int i = this.x;
        int iH = i != -1 ? y02.h(i, m30.j(j), m30.h(j)) : m30.j(j);
        int i2 = this.y;
        i62 i62VarT = xm1Var.t(m30.b(j, 0, 0, iH, i2 != -1 ? y02.h(i2, m30.j(j), m30.h(j)) : m30.h(j), 3));
        return en1Var.I0(i62VarT.f, i62VarT.g, oi0.f, new z6(i62VarT, 4));
    }
}
