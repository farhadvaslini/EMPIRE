package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class il extends aq1 implements of0, ey1, tu2 {
    public z13 A;
    public vr B;
    public long t;
    public dp u;
    public float v;
    public z13 w;
    public long x;
    public bb1 y;
    public vr z;

    @Override // defpackage.tu2
    public final boolean C() {
        return false;
    }

    @Override // defpackage.tu2
    public final void K0(dv2 dv2Var) {
        bv2.j(dv2Var, this.w);
    }

    @Override // defpackage.ey1
    public final void k0() {
        this.x = 9205357640488583168L;
        this.y = null;
        this.z = null;
        this.A = null;
        vr.J(this);
    }

    @Override // defpackage.of0
    public final void m0(vb1 vb1Var) {
        vr vrVar;
        dp dpVar;
        float f;
        da daVar;
        vb1 vb1Var2;
        rr rrVar = vb1Var.f;
        if (this.w == cl3.q0) {
            if (!wx.c(this.t, wx.g)) {
                qf0.h0(vb1Var, this.t, 0L, 0L, 0.0f, null, 0, 126);
            }
            dp dpVar2 = this.u;
            if (dpVar2 != null) {
                qf0.S0(vb1Var, dpVar2, 0L, 0L, this.v, null, 118);
            }
        } else {
            if (h43.a(rrVar.a(), this.x) && vb1Var.getLayoutDirection() == this.y && s51.n(this.A, this.w)) {
                vrVar = this.z;
                vrVar.getClass();
            } else {
                gq.M(this, new u1(6, this, vb1Var));
                vrVar = this.B;
                this.B = null;
            }
            this.z = vrVar;
            this.x = rrVar.a();
            this.y = vb1Var.getLayoutDirection();
            this.A = this.w;
            vrVar.getClass();
            if (!wx.c(this.t, wx.g)) {
                y02.o(vb1Var, vrVar, this.t);
            }
            dp dpVar3 = this.u;
            if (dpVar3 != null) {
                float f2 = this.v;
                boolean z = vrVar instanceof w02;
                fm0 fm0Var = fm0.a;
                if (z) {
                    jk2 jk2Var = ((w02) vrVar).l;
                    float f3 = jk2Var.a;
                    vb1Var.x(dpVar3, (4294967295L & ((long) Float.floatToRawIntBits(jk2Var.b))) | (Float.floatToRawIntBits(f3) << 32), y02.M(jk2Var), f2, fm0Var, 3);
                } else {
                    if (vrVar instanceof x02) {
                        x02 x02Var = (x02) vrVar;
                        dpVar = dpVar3;
                        daVar = x02Var.m;
                        if (daVar != null) {
                            vb1Var2 = vb1Var;
                            f = f2;
                        } else {
                            ro2 ro2Var = x02Var.l;
                            float f4 = ro2Var.b;
                            float f5 = ro2Var.a;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (ro2Var.h >> 32));
                            vb1Var.t(dpVar, (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (((long) Float.floatToRawIntBits(ro2Var.c - f5)) << 32) | (((long) Float.floatToRawIntBits(ro2Var.d - f4)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), f2, fm0Var);
                        }
                    } else {
                        if (!(vrVar instanceof v02)) {
                            c.k();
                            return;
                        }
                        da daVar2 = ((v02) vrVar).l;
                        dpVar = dpVar3;
                        f = f2;
                        daVar = daVar2;
                        vb1Var2 = vb1Var;
                    }
                    vb1Var2.z(daVar, dpVar, f, fm0Var, 3);
                }
            }
        }
        vb1Var.c();
    }
}
