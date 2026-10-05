package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class y21 extends aq1 implements of0 {
    public d23 t;
    public cs0 u;
    public qw0 v;
    public da x;
    public final w9 w = cl3.d();
    public float y = Float.NaN;

    public y21(d23 d23Var, cs0 cs0Var) {
        this.t = d23Var;
        this.u = cs0Var;
    }

    @Override // defpackage.aq1
    public final boolean e1() {
        return false;
    }

    @Override // defpackage.aq1
    public final void h1() {
        qw0 qw0VarB = vr.V(this).b();
        sw0 sw0Var = qw0VarB.a;
        if (sw0Var.J() != 1) {
            sw0Var.M(1);
        }
        this.v = qw0VarB;
    }

    @Override // defpackage.aq1
    public final void i1() {
        ow0 ow0VarV = vr.V(this);
        qw0 qw0Var = this.v;
        if (qw0Var != null) {
            ow0VarV.a(qw0Var);
            this.v = null;
        }
    }

    @Override // defpackage.of0
    public final void m0(vb1 vb1Var) {
        u21 u21Var;
        da daVarA;
        rr rrVar = vb1Var.f;
        vb1Var.c();
        if (Build.VERSION.SDK_INT < 31 || (u21Var = (u21) this.u.a()) == null) {
            return;
        }
        long j = u21Var.b;
        qw0 qw0Var = this.v;
        if (qw0Var != null) {
            sw0 sw0Var = qw0Var.a;
            long jA = rrVar.a();
            bb1 layoutDirection = vb1Var.getLayoutDirection();
            float fT = vb1Var.T(u21Var.a);
            final float fT2 = vb1Var.T(Float.intBitsToFloat((int) (j >> 32)));
            final float fT3 = vb1Var.T(Float.intBitsToFloat((int) (j & 4294967295L)));
            final vr vrVarA = ((c23) this.t.g).a(jA, layoutDirection, vb1Var);
            if (vrVarA instanceof x02) {
                daVarA = this.x;
                if (daVarA == null) {
                    daVarA = ga.a();
                    this.x = daVarA;
                }
            } else {
                daVarA = null;
            }
            this.w.h(u21Var.c);
            qw0Var.f(u21Var.d);
            int i = u21Var.e;
            if (sw0Var.x() != i) {
                sw0Var.n(i);
            }
            if (this.y != fT) {
                cn cnVar = fT > 0.0f ? new cn(null, fT, fT, 3) : null;
                if (!s51.n(sw0Var.A(), cnVar)) {
                    sw0Var.r(cnVar);
                }
                this.y = fT;
            }
            final da daVar = daVarA;
            vb1Var.g0(qw0Var, lr.S(rrVar.a()), new ns0() { // from class: x21
                @Override // defpackage.ns0
                public final Object h(Object obj) {
                    qf0 qf0Var = (qf0) obj;
                    qf0Var.getClass();
                    pr prVarK = qf0Var.Z().k();
                    prVarK.l();
                    vr vrVar = vrVarA;
                    oz2.p(prVarK, vrVar, daVar);
                    y02.n(prVarK, vrVar, this.w);
                    float f = fT2;
                    float f2 = fT3;
                    prVarK.g(f, f2);
                    y02.n(prVarK, vrVar, w21.a);
                    prVarK.g(-f, -f2);
                    prVarK.i();
                    return dm3.a;
                }
            });
            pr prVarK = rrVar.g.k();
            prVarK.l();
            oz2.p(prVarK, vrVarA, daVar);
            lr.z(vb1Var, qw0Var);
            prVarK.i();
        }
    }
}
