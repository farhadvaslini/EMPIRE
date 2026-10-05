package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ye1 {
    public final d42 A;
    public final d42 B;
    public db0 a;
    public final xj2 b;
    public final t73 c;
    public final a31 d;
    public jg3 e;
    public final d42 f;
    public final d42 g;
    public ab1 h;
    public final d42 i;
    public af j;
    public final d42 k;
    public final d42 l;
    public final d42 m;
    public final d42 n;
    public final d42 o;
    public boolean p;
    public final d42 q;
    public final m71 r;
    public final d42 s;
    public final d42 t;
    public ns0 u;
    public final w40 v;
    public final w40 w;
    public final w40 x;
    public final w9 y;
    public long z;

    public ye1(db0 db0Var, xj2 xj2Var, t73 t73Var) {
        this.a = db0Var;
        this.b = xj2Var;
        this.c = t73Var;
        a31 a31Var = new a31(11, false);
        af afVar = bf.a;
        long j = yg3.b;
        bg3 bg3Var = new bg3(afVar, j, (yg3) null);
        a31Var.g = bg3Var;
        a31Var.h = new fh0(afVar, bg3Var.b);
        this.d = a31Var;
        Boolean bool = Boolean.FALSE;
        this.f = b32.w(bool);
        this.g = b32.w(new jd0(0.0f));
        this.i = b32.w(null);
        this.k = b32.w(hx0.f);
        this.l = b32.w(bool);
        this.m = b32.w(bool);
        this.n = b32.w(bool);
        this.o = b32.w(bool);
        this.p = true;
        this.q = b32.w(Boolean.TRUE);
        this.r = new m71(t73Var);
        this.s = b32.w(bool);
        this.t = b32.w(bool);
        this.u = new n20(23);
        this.v = new w40(this, 1);
        this.w = new w40(this, 2);
        this.x = new w40(this, 3);
        this.y = cl3.d();
        this.z = wx.g;
        this.A = b32.w(new yg3(j));
        this.B = b32.w(new yg3(j));
    }

    public final hx0 a() {
        return (hx0) this.k.getValue();
    }

    public final boolean b() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    public final ab1 c() {
        ab1 ab1Var = this.h;
        if (ab1Var == null || !ab1Var.t0()) {
            return null;
        }
        return ab1Var;
    }

    public final qg3 d() {
        return (qg3) this.i.getValue();
    }

    public final void e(long j) {
        this.B.setValue(new yg3(j));
    }

    public final void f(long j) {
        this.A.setValue(new yg3(j));
    }
}
