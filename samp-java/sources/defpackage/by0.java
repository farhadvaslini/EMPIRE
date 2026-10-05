package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class by0 extends aq1 implements of0 {
    public d23 t;
    public cs0 u;
    public qw0 v;
    public final w9 w;
    public da x;
    public final j21 y;

    public by0(d23 d23Var, cs0 cs0Var) {
        this.t = d23Var;
        this.u = cs0Var;
        w9 w9VarD = cl3.d();
        w9VarD.p(1);
        this.w = w9VarD;
        this.y = new j21(2);
    }

    @Override // defpackage.aq1
    public final boolean e1() {
        return false;
    }

    @Override // defpackage.aq1
    public final void h1() {
        this.v = vr.V(this).b();
    }

    @Override // defpackage.aq1
    public final void i1() {
        ow0 ow0VarV = vr.V(this);
        qw0 qw0Var = this.v;
        if (qw0Var != null) {
            ow0VarV.a(qw0Var);
            this.v = null;
        }
        this.x = null;
        this.y.f.clear();
    }

    @Override // defpackage.of0
    public final void m0(vb1 vb1Var) {
        da daVarA;
        rr rrVar = vb1Var.f;
        zx0 zx0Var = (zx0) this.u.a();
        if (zx0Var != null) {
            float f = zx0Var.a;
            gy0 gy0Var = zx0Var.d;
            if (f > 0.0f) {
                vb1Var.c();
                qw0 qw0Var = this.v;
                if (qw0Var != null) {
                    long jCeil = (((long) (((int) Math.ceil(Float.intBitsToFloat((int) (r8 >> 32)))) + 2)) << 32) | (((long) (((int) Math.ceil(Float.intBitsToFloat((int) (r8 & 4294967295L)))) + 2)) & 4294967295L);
                    vr vrVarA = ((c23) this.t.g).a(rrVar.a(), vb1Var.getLayoutDirection(), vb1Var);
                    if (vrVarA instanceof x02) {
                        daVarA = this.x;
                        if (daVarA == null) {
                            daVarA = ga.a();
                            this.x = daVarA;
                        }
                    } else {
                        daVarA = null;
                    }
                    long jA = gy0Var.a();
                    w9 w9Var = this.w;
                    w9Var.h(jA);
                    Paint paint = (Paint) w9Var.b;
                    float fT = vb1Var.T(f);
                    float fB = h43.b(rrVar.a()) / 2.0f;
                    if (fT > fB) {
                        fT = fB;
                    }
                    w9Var.o(((float) Math.ceil(fT)) * 2.0f);
                    float fT2 = vb1Var.T(zx0Var.b);
                    paint.setMaskFilter(fT2 > 0.0f ? new BlurMaskFilter(fT2, BlurMaskFilter.Blur.NORMAL) : null);
                    if (Build.VERSION.SDK_INT >= 33) {
                        db dbVarB = gy0Var.b(vb1Var, (c23) this.t.g, this.y);
                        paint.setShader(dbVarB != null ? dbVarB.a : null);
                    }
                    qw0Var.f(zx0Var.c);
                    int iX = gy0Var.x();
                    sw0 sw0Var = qw0Var.a;
                    if (sw0Var.x() != iX) {
                        sw0Var.n(iX);
                    }
                    vb1Var.g0(qw0Var, jCeil, new v1(vrVarA, daVarA, this, 12));
                    ((yl1) rrVar.g.g).H(-1.0f, -1.0f);
                    try {
                        lr.z(vb1Var, qw0Var);
                        return;
                    } finally {
                        ((yl1) rrVar.g.g).H(1.0f, 1.0f);
                    }
                }
                return;
            }
        }
        vb1Var.c();
    }
}
