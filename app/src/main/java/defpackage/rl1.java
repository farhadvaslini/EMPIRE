package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class rl1 extends aq1 implements dw0, of0, tu2, ey1 {
    public cb0 A;
    public p41 C;
    public np D;
    public rf t;
    public wf3 u;
    public r62 v;
    public View w;
    public ua0 x;
    public q62 y;
    public final d42 z = new d42(null, f5.f0);
    public long B = 9205357640488583168L;

    public rl1(rf rfVar, wf3 wf3Var, r62 r62Var) {
        this.t = rfVar;
        this.u = wf3Var;
        this.v = r62Var;
    }

    @Override // defpackage.tu2
    public final void K0(dv2 dv2Var) {
        dv2Var.a(sl1.a, new ql1(this, 1));
    }

    @Override // defpackage.dw0
    public final void O(ex1 ex1Var) {
        this.z.setValue(ex1Var);
    }

    @Override // defpackage.aq1
    public final void h1() {
        k0();
        this.D = lr.a(0, 7, null);
        cl3.t(d1(), null, new l80(this, null, 5), 1);
    }

    @Override // defpackage.aq1
    public final void i1() {
        q62 q62Var = this.y;
        if (q62Var != null) {
            ((s62) q62Var).b();
        }
        this.y = null;
    }

    @Override // defpackage.ey1
    public final void k0() {
        gq.M(this, new ql1(this, 0));
    }

    @Override // defpackage.of0
    public final void m0(vb1 vb1Var) {
        vb1Var.c();
        np npVar = this.D;
        if (npVar != null) {
            npVar.l(dm3.a);
        }
    }

    public final long p1() {
        if (this.A == null) {
            this.A = b32.j(new ql1(this, 2));
        }
        cb0 cb0Var = this.A;
        if (cb0Var != null) {
            return ((gy1) cb0Var.getValue()).a;
        }
        return 9205357640488583168L;
    }

    public final void q1() {
        q62 q62Var = this.y;
        if (q62Var != null) {
            ((s62) q62Var).b();
        }
        View viewS = this.w;
        if (viewS == null) {
            viewS = vp.S(this);
        }
        this.w = viewS;
        ua0 ua0Var = this.x;
        if (ua0Var == null) {
            ua0Var = vr.X(this).E;
        }
        this.x = ua0Var;
        this.y = this.v.b(viewS, ua0Var);
        s1();
    }

    public final void r1() {
        ua0 ua0Var = this.x;
        if (ua0Var == null) {
            ua0Var = vr.X(this).E;
            this.x = ua0Var;
        }
        long j = ((gy1) this.t.h(ua0Var)).a;
        if ((j & 9223372034707292159L) == 9205357640488583168L || (9223372034707292159L & p1()) == 9205357640488583168L) {
            this.B = 9205357640488583168L;
            q62 q62Var = this.y;
            if (q62Var != null) {
                ((s62) q62Var).b();
                return;
            }
            return;
        }
        this.B = gy1.e(p1(), j);
        if (this.y == null) {
            q1();
        }
        q62 q62Var2 = this.y;
        if (q62Var2 != null) {
            q62Var2.a(this.B, 9205357640488583168L);
        }
        s1();
    }

    public final void s1() {
        ua0 ua0Var;
        q62 q62Var = this.y;
        if (q62Var == null || (ua0Var = this.x) == null) {
            return;
        }
        s62 s62Var = (s62) q62Var;
        if (p41.a(s62Var.c(), this.C)) {
            return;
        }
        this.u.h(new md0(ua0Var.R(lr.T(s62Var.c()))));
        this.C = new p41(s62Var.c());
    }
}
