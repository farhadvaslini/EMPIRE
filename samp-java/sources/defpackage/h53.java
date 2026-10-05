package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class h53 implements ef0 {
    public final int f;
    public cs0 g;
    public final ex h;
    public final z32 i;
    public ns0 j;
    public final boolean k = true;
    public final float[] l;
    public final a42 m;
    public final a42 n;
    public boolean o;
    public final a42 p;
    public final a42 q;
    public final t02 r;
    public final d42 s;
    public final it1 t;
    public final z32 u;
    public final z32 v;
    public final c6 w;
    public final zs1 x;

    public h53(float f, int i, cs0 cs0Var, ex exVar) {
        float[] fArr;
        this.f = i;
        this.g = cs0Var;
        this.h = exVar;
        this.i = new z32(f);
        if (i == 0) {
            fArr = new float[0];
        } else {
            int i2 = i + 2;
            float[] fArr2 = new float[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                fArr2[i3] = i3 / (i + 1);
            }
            fArr = fArr2;
        }
        this.l = fArr;
        this.m = new a42(0);
        this.n = new a42(0);
        this.p = new a42(0);
        this.q = new a42(0);
        this.r = t02.g;
        this.s = b32.w(Boolean.FALSE);
        this.t = new it1(22, this);
        ex exVar2 = this.h;
        float f2 = exVar2.f;
        float f3 = exVar2.g - f2;
        this.u = new z32(lq.N(0.0f, 0.0f, y02.g(f3 == 0.0f ? 0.0f : (f - f2) / f3, 0.0f, 1.0f)));
        this.v = new z32(0.0f);
        this.w = new c6(1, this);
        this.x = new zs1();
    }

    public final void a(float f) {
        float fMax;
        float fMin;
        if (this.r == t02.f) {
            float fG = this.n.g();
            a42 a42Var = this.q;
            fMax = Math.max(fG - (a42Var.g() / 2.0f), 0.0f);
            fMin = Math.min(a42Var.g() / 2.0f, fMax);
        } else {
            float fG2 = this.m.g();
            a42 a42Var2 = this.p;
            fMax = Math.max(fG2 - (a42Var2.g() / 2.0f), 0.0f);
            fMin = Math.min(a42Var2.g() / 2.0f, fMax);
        }
        z32 z32Var = this.u;
        float fG3 = z32Var.g() + f;
        z32 z32Var2 = this.v;
        z32Var.h(z32Var2.g() + fG3);
        z32Var2.h(0.0f);
        float fE = g53.e(z32Var.g(), this.l, fMin, fMax);
        ex exVar = this.h;
        float f2 = fMax - fMin;
        float fN = lq.N(exVar.f, exVar.g, y02.g(f2 == 0.0f ? 0.0f : (fE - fMin) / f2, 0.0f, 1.0f));
        if (fN == this.i.g()) {
            return;
        }
        ns0 ns0Var = this.j;
        if (ns0Var != null) {
            ns0Var.h(Float.valueOf(fN));
        } else {
            c(fN);
        }
    }

    public final float b() {
        ex exVar = this.h;
        float f = exVar.f;
        float f2 = exVar.g;
        float fG = y02.g(this.i.g(), f, f2);
        float f3 = f2 - f;
        return y02.g(f3 == 0.0f ? 0.0f : (fG - f) / f3, 0.0f, 1.0f);
    }

    public final void c(float f) {
        if (this.k) {
            ex exVar = this.h;
            float f2 = exVar.f;
            float f3 = exVar.g;
            f = g53.e(y02.g(f, f2, f3), this.l, f2, f3);
        }
        this.i.h(f);
    }

    @Override // defpackage.ef0
    public final Object f(n9 n9Var, re0 re0Var) {
        Object objW = ur.w(new hd1(this, n9Var, null, 24), re0Var);
        return objW == y50.f ? objW : dm3.a;
    }
}
