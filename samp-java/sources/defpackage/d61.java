package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class d61 implements uw0 {
    public long f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float[] l;

    @Override // defpackage.ua0
    public final float G() {
        return this.h;
    }

    @Override // defpackage.uw0
    public final void P(z13 z13Var) {
        z13Var.getClass();
    }

    @Override // defpackage.uw0
    public final long a() {
        return this.f;
    }

    public final void c(yl1 yl1Var, ua0 ua0Var, ns0 ns0Var) {
        ua0Var.getClass();
        ns0Var.getClass();
        pi piVar = (pi) yl1Var.g;
        this.f = piVar.A();
        this.g = ua0Var.h();
        this.h = ua0Var.G();
        ns0Var.h(this);
        float f = this.k;
        float f2 = this.i;
        float f3 = this.j;
        if (f == 0.0f) {
            if (f2 == 0.0f || f3 == 0.0f) {
                return;
            }
            yl1Var.G(1.0f / f2, 1.0f / f3, 0L);
            return;
        }
        float[] fArrA = this.l;
        if (fArrA == null) {
            fArrA = wm1.a();
            this.l = fArrA;
        }
        if (fArrA.length < 16) {
            return;
        }
        double d = ((double) f) * 0.017453292519943295d;
        float fSin = (float) Math.sin(d);
        float fCos = (float) Math.cos(d);
        float f4 = fCos * f2;
        float f5 = fSin * f3;
        float f6 = (-fSin) * f2;
        float f7 = fCos * f3;
        float f8 = (f4 * f7) - (f5 * f6);
        if (f8 == 0.0f) {
            return;
        }
        float f9 = 1.0f / f8;
        fArrA[0] = f7 * f9;
        fArrA[1] = (-f5) * f9;
        fArrA[4] = (-f6) * f9;
        fArrA[5] = f4 * f9;
        piVar.k().q(fArrA);
    }

    @Override // defpackage.uw0
    public final float e() {
        return this.i;
    }

    @Override // defpackage.ua0
    public final float h() {
        return this.g;
    }

    @Override // defpackage.uw0
    public final void j(float f) {
        this.k = f;
    }

    @Override // defpackage.uw0
    public final void m(float f) {
        this.i = f;
    }

    @Override // defpackage.uw0
    public final void s(float f) {
        this.j = f;
    }

    @Override // defpackage.uw0
    public final float v() {
        return this.j;
    }

    @Override // defpackage.uw0
    public final void D0(int i) {
    }

    @Override // defpackage.uw0
    public final void b(float f) {
    }

    @Override // defpackage.uw0
    public final void d(float f) {
    }

    @Override // defpackage.uw0
    public final void f(yx yxVar) {
    }

    @Override // defpackage.uw0
    public final void g(float f) {
    }

    @Override // defpackage.uw0
    public final void k(float f) {
    }

    @Override // defpackage.uw0
    public final void l(long j) {
    }

    @Override // defpackage.uw0
    public final void n(int i) {
    }

    @Override // defpackage.uw0
    public final void o(boolean z) {
    }

    @Override // defpackage.uw0
    public final void p(float f) {
    }

    @Override // defpackage.uw0
    public final void q(long j) {
    }

    @Override // defpackage.uw0
    public final void q0(long j) {
    }

    @Override // defpackage.uw0
    public final void r(u10 u10Var) {
    }

    @Override // defpackage.uw0
    public final void u(float f) {
    }

    @Override // defpackage.uw0
    public final void w(float f) {
    }
}
