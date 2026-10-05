package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class zf3 extends aq1 implements m20, kb1 {
    public final gh3 t;
    public ml3 u;
    public d23 v;

    public zf3(gh3 gh3Var) {
        this.t = gh3Var;
    }

    @Override // defpackage.ia0
    public final void Z0() {
        d23 d23Var = this.v;
        if (d23Var != null) {
            d23.a(d23Var, vr.X(this).F, null, null, 30);
        }
        lq.J(this);
    }

    @Override // defpackage.ia0
    public final void c() {
        d23 d23Var = this.v;
        if (d23Var != null) {
            d23.a(d23Var, null, vr.X(this).E, null, 29);
        }
        lq.J(this);
    }

    @Override // defpackage.aq1
    public final boolean e1() {
        return false;
    }

    @Override // defpackage.aq1
    public final void h1() {
        gh3 gh3VarY = n32.y(this.t, vr.X(this).F);
        zp0 zp0Var = (zp0) ur.z(this, s20.k);
        p1(gh3VarY, zp0Var);
        bb1 bb1Var = vr.X(this).F;
        ua0 ua0Var = vr.X(this).E;
        ml3 ml3Var = this.u;
        if (ml3Var == null) {
            throw nc2.y("Font resolution state is not set.");
        }
        this.v = new d23(bb1Var, ua0Var, zp0Var, gh3VarY, ml3Var.f);
    }

    @Override // defpackage.aq1
    public final void i1() {
        this.u = null;
        this.v = null;
    }

    public final void p1(gh3 gh3Var, zp0 zp0Var) {
        h83 h83Var = gh3Var.a;
        zb3 zb3Var = h83Var.f;
        xq0 xq0Var = h83Var.c;
        if (xq0Var == null) {
            xq0Var = xq0.h;
        }
        vq0 vq0Var = h83Var.d;
        int i = vq0Var != null ? vq0Var.a : 0;
        wq0 wq0Var = h83Var.e;
        this.u = ((aq0) zp0Var).b(zb3Var, xq0Var, i, wq0Var != null ? wq0Var.a : 65535);
        lq.J(this);
    }

    @Override // defpackage.kb1
    public final dn1 t(en1 en1Var, xm1 xm1Var, long j) {
        d23 d23Var = this.v;
        if (d23Var == null) {
            throw nc2.y("Min size state is not set.");
        }
        d42 d42Var = (d42) d23Var.g;
        ml3 ml3Var = this.u;
        if (ml3Var == null) {
            throw nc2.y("Font resolution state is not set.");
        }
        Object obj = ml3Var.f;
        if (!s51.n(obj, d23Var.f)) {
            d23Var.f = obj;
            d42Var.setValue(Boolean.TRUE);
        }
        if (((Boolean) d42Var.getValue()).booleanValue()) {
            d23Var.b = ue3.a((gh3) d23Var.e, (ua0) d23Var.c, (zp0) d23Var.d);
            d42Var.setValue(Boolean.FALSE);
        }
        long j2 = d23Var.b;
        i62 i62VarT = xm1Var.t(n30.e(j, n30.b((int) (j2 >> 32), 0, (int) (j2 & 4294967295L), 0, 10)));
        return en1Var.I0(i62VarT.f, i62VarT.g, oi0.f, new z6(i62VarT, 14));
    }
}
