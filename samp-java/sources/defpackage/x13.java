package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class x13 extends aq1 implements of0 {
    public d23 t;
    public cs0 u;
    public qw0 v;
    public final w9 w = cl3.d();

    public x13(d23 d23Var, cs0 cs0Var) {
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
        rr rrVar = vb1Var.f;
        q13 q13Var = (q13) this.u.a();
        if (q13Var == null) {
            vb1Var.c();
            return;
        }
        long j = q13Var.b;
        float f = q13Var.a;
        qw0 qw0Var = this.v;
        if (qw0Var != null) {
            long jA = rrVar.a();
            bb1 layoutDirection = vb1Var.getLayoutDirection();
            final float fT = vb1Var.T(f);
            final float fT2 = vb1Var.T(Float.intBitsToFloat((int) (j >> 32)));
            final float fT3 = vb1Var.T(Float.intBitsToFloat((int) (j & 4294967295L)));
            float f2 = 4.0f * fT;
            long jCeil = (((long) ((int) Math.ceil((Float.intBitsToFloat((int) (jA >> 32)) + f2) + fT2))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (jA & 4294967295L)) + f2 + fT3))) & 4294967295L);
            final vr vrVarA = ((c23) this.t.g).a(jA, layoutDirection, vb1Var);
            long j2 = q13Var.c;
            w9 w9Var = this.w;
            w9Var.h(j2);
            float fT4 = vb1Var.T(f);
            ((Paint) w9Var.b).setMaskFilter(fT4 > 0.0f ? new BlurMaskFilter(fT4, BlurMaskFilter.Blur.NORMAL) : null);
            qw0Var.f(q13Var.d);
            int i = q13Var.e;
            sw0 sw0Var = qw0Var.a;
            if (sw0Var.x() != i) {
                sw0Var.n(i);
            }
            vb1Var.g0(qw0Var, jCeil, new ns0() { // from class: w13
                @Override // defpackage.ns0
                public final Object h(Object obj) {
                    vr vrVar = vrVarA;
                    x13 x13Var = this;
                    qf0 qf0Var = (qf0) obj;
                    qf0Var.getClass();
                    float f3 = fT * 2.0f;
                    float f4 = fT2;
                    float f5 = f3 + f4;
                    float f6 = fT3;
                    float f7 = f3 + f6;
                    ((yl1) qf0Var.Z().g).H(f5, f7);
                    try {
                        pr prVarK = qf0Var.Z().k();
                        y02.n(prVarK, vrVar, x13Var.w);
                        prVarK.g(-f4, -f6);
                        y02.n(prVarK, vrVar, v13.a);
                        prVarK.g(f4, f6);
                        ((yl1) qf0Var.Z().g).H(-f5, -f7);
                        return dm3.a;
                    } catch (Throwable th) {
                        ((yl1) qf0Var.Z().g).H(-f5, -f7);
                        throw th;
                    }
                }
            });
            float f3 = 2.0f * (-fT);
            ((yl1) rrVar.g.g).H(f3, f3);
            try {
                lr.z(vb1Var, qw0Var);
            } finally {
                float f4 = -f3;
                ((yl1) rrVar.g.g).H(f4, f4);
            }
        }
        vb1Var.c();
    }
}
