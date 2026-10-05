package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class if0 extends aq1 implements kb1, of0, dw0, ey1 {
    public qw0 A;
    public final gf0 B;
    public final d42 C;
    public final z32 D;
    public final gf0 E;
    public final gf0 F;
    public gl t;
    public d23 u;
    public ns0 v;
    public ns0 w;
    public rs0 x;
    public ns0 y;
    public final hf0 z;

    public if0(gl glVar, d23 d23Var, ns0 ns0Var, ns0 ns0Var2, rs0 rs0Var, ns0 ns0Var3) {
        glVar.getClass();
        ns0Var.getClass();
        this.t = glVar;
        this.u = d23Var;
        this.v = ns0Var;
        this.w = ns0Var2;
        this.x = rs0Var;
        this.y = ns0Var3;
        this.z = new hf0(this);
        this.B = new gf0(this, 0);
        this.C = new d42(null, f5.f0);
        this.D = new z32(0.0f);
        this.E = new gf0(this, 1);
        this.F = new gf0(this, 2);
    }

    @Override // defpackage.dw0
    public final void O(ex1 ex1Var) {
        if (ex1Var.w1().s) {
            boolean zA = this.t.a();
            d42 d42Var = this.C;
            if (zA) {
                d42Var.setValue(ex1Var);
            } else if (((ab1) d42Var.getValue()) != null) {
                d42Var.setValue(null);
            }
        }
    }

    @Override // defpackage.aq1
    public final void h1() {
        this.A = vr.V(this).b();
        gq.M(this, new ja(12, this));
    }

    @Override // defpackage.aq1
    public final void i1() {
        ow0 ow0VarV = vr.V(this);
        qw0 qw0Var = this.A;
        if (qw0Var != null) {
            ow0VarV.a(qw0Var);
            this.A = null;
        }
        hf0 hf0Var = this.z;
        hf0Var.f = 1.0f;
        hf0Var.g = 1.0f;
        hf0Var.h = 9205357640488583168L;
        hf0Var.i = bb1.f;
        hf0Var.j = 0.0f;
        hf0Var.k = null;
        hf0Var.l.f.clear();
        this.C.setValue(null);
    }

    @Override // defpackage.ey1
    public final void k0() {
        gq.M(this, new ja(12, this));
    }

    @Override // defpackage.of0
    public final void m0(vb1 vb1Var) {
        hf0 hf0Var = this.z;
        hf0Var.getClass();
        rr rrVar = vb1Var.f;
        float fH = rrVar.h();
        float fG = rrVar.G();
        long jA = rrVar.a();
        bb1 layoutDirection = vb1Var.getLayoutDirection();
        boolean z = (fH == hf0Var.f && fG == hf0Var.g && h43.a(jA, hf0Var.h) && layoutDirection == hf0Var.i) ? false : true;
        if (z) {
            hf0Var.f = fH;
            hf0Var.g = fG;
            hf0Var.h = jA;
            layoutDirection.getClass();
            hf0Var.i = layoutDirection;
        }
        if (z) {
            p1();
        }
        this.F.h(vb1Var);
        ns0 ns0Var = this.y;
        if (ns0Var != null) {
            ns0Var.h(vb1Var);
        }
        vb1Var.c();
    }

    public final void p1() {
        if (Build.VERSION.SDK_INT >= 31) {
            ns0 ns0Var = this.v;
            hf0 hf0Var = this.z;
            hf0Var.getClass();
            ns0Var.getClass();
            hf0Var.j = 0.0f;
            hf0Var.k = null;
            ns0Var.h(hf0Var);
            qw0 qw0Var = this.A;
            if (qw0Var != null) {
                u10 u10Var = hf0Var.k;
                sw0 sw0Var = qw0Var.a;
                if (!s51.n(sw0Var.A(), u10Var)) {
                    sw0Var.r(u10Var);
                }
            }
            this.D.h(hf0Var.j);
        }
    }

    @Override // defpackage.kb1
    public final dn1 t(en1 en1Var, xm1 xm1Var, long j) {
        xm1Var.getClass();
        i62 i62VarT = xm1Var.t(j);
        return en1Var.I0(i62VarT.f, i62VarT.g, oi0.f, new i(14, i62VarT, this));
    }
}
