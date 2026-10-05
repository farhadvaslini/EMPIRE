package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class wn2 implements uw0 {
    public u10 A;
    public yx B;
    public int C;
    public vr D;
    public int f;
    public float g = 1.0f;
    public float h = 1.0f;
    public float i = 1.0f;
    public float j;
    public float k;
    public float l;
    public long m;
    public long n;
    public float o;
    public float p;
    public float q;
    public float r;
    public long s;
    public z13 t;
    public boolean u;
    public int v;
    public long w;
    public wa1 x;
    public ua0 y;
    public bb1 z;

    public wn2() {
        long j = vw0.a;
        this.m = j;
        this.n = j;
        this.r = 8.0f;
        this.s = wj3.b;
        this.t = cl3.q0;
        this.v = 0;
        this.w = 9205357640488583168L;
        this.x = wa1.a;
        this.y = lq.h();
        this.z = bb1.f;
        this.C = 3;
    }

    @Override // defpackage.uw0
    public final void D0(int i) {
        if (this.v == i) {
            return;
        }
        this.f |= 32768;
        this.v = i;
    }

    @Override // defpackage.ua0
    public final float G() {
        return this.y.G();
    }

    @Override // defpackage.uw0
    public final void P(z13 z13Var) {
        if (s51.n(this.t, z13Var)) {
            return;
        }
        this.f |= 8192;
        this.t = z13Var;
    }

    @Override // defpackage.uw0
    public final void W0(wa1 wa1Var) {
        if (s51.n(this.x, wa1Var)) {
            return;
        }
        this.f |= 1048576;
        this.x = wa1Var;
    }

    @Override // defpackage.uw0
    public final long a() {
        return this.w;
    }

    @Override // defpackage.uw0
    public final void b(float f) {
        if (this.p == f) {
            return;
        }
        this.f |= 512;
        this.p = f;
    }

    public final void c() {
        m(1.0f);
        s(1.0f);
        d(1.0f);
        p(0.0f);
        k(0.0f);
        g(0.0f);
        long j = vw0.a;
        l(j);
        q(j);
        w(0.0f);
        b(0.0f);
        j(0.0f);
        u(8.0f);
        q0(wj3.b);
        P(cl3.q0);
        o(false);
        r(null);
        f(null);
        n(3);
        D0(0);
        W0(wa1.a);
        this.w = 9205357640488583168L;
        this.D = null;
        this.f = 0;
    }

    @Override // defpackage.uw0
    public final void d(float f) {
        if (this.i == f) {
            return;
        }
        this.f |= 4;
        this.i = f;
    }

    @Override // defpackage.uw0
    public final float e() {
        return this.g;
    }

    @Override // defpackage.uw0
    public final void f(yx yxVar) {
        if (s51.n(this.B, yxVar)) {
            return;
        }
        this.f |= 262144;
        this.B = yxVar;
    }

    @Override // defpackage.uw0
    public final void g(float f) {
        if (this.l == f) {
            return;
        }
        this.f |= 32;
        this.l = f;
    }

    @Override // defpackage.ua0
    public final float h() {
        return this.y.h();
    }

    @Override // defpackage.uw0
    public final void j(float f) {
        if (this.q == f) {
            return;
        }
        this.f |= 1024;
        this.q = f;
    }

    @Override // defpackage.uw0
    public final void k(float f) {
        if (this.k == f) {
            return;
        }
        this.f |= 16;
        this.k = f;
    }

    @Override // defpackage.uw0
    public final void l(long j) {
        if (wx.c(this.m, j)) {
            return;
        }
        this.f |= 64;
        this.m = j;
    }

    @Override // defpackage.uw0
    public final void m(float f) {
        if (this.g == f) {
            return;
        }
        this.f |= 1;
        this.g = f;
    }

    @Override // defpackage.uw0
    public final void n(int i) {
        if (this.C == i) {
            return;
        }
        this.f |= 524288;
        this.C = i;
    }

    @Override // defpackage.uw0
    public final void o(boolean z) {
        if (this.u != z) {
            this.f |= 16384;
            this.u = z;
        }
    }

    @Override // defpackage.uw0
    public final void p(float f) {
        if (this.j == f) {
            return;
        }
        this.f |= 8;
        this.j = f;
    }

    @Override // defpackage.uw0
    public final void q(long j) {
        if (wx.c(this.n, j)) {
            return;
        }
        this.f |= 128;
        this.n = j;
    }

    @Override // defpackage.uw0
    public final void q0(long j) {
        if (wj3.a(this.s, j)) {
            return;
        }
        this.f |= 4096;
        this.s = j;
    }

    @Override // defpackage.uw0
    public final void r(u10 u10Var) {
        if (s51.n(this.A, u10Var)) {
            return;
        }
        this.f |= 131072;
        this.A = u10Var;
    }

    @Override // defpackage.uw0
    public final void s(float f) {
        if (this.h == f) {
            return;
        }
        this.f |= 2;
        this.h = f;
    }

    @Override // defpackage.uw0
    public final void u(float f) {
        if (this.r == f) {
            return;
        }
        this.f |= 2048;
        this.r = f;
    }

    @Override // defpackage.uw0
    public final float v() {
        return this.h;
    }

    @Override // defpackage.uw0
    public final void w(float f) {
        if (this.o == f) {
            return;
        }
        this.f |= 256;
        this.o = f;
    }
}
