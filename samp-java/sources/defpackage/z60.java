package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class z60 {
    public final x50 a;
    public final fx b;
    public final float c;
    public final float d;
    public final rs0 e;
    public final ns0 f;
    public final ss0 g;
    public final ed h;
    public final ed i;
    public final ed j;
    public final ed k;
    public final ed l;
    public final zs1 m;
    public final op3 n;
    public final bq1 o;

    public z60(x50 x50Var, float f, fx fxVar, float f2, float f3, rs0 rs0Var, ns0 ns0Var, ss0 ss0Var) {
        x50Var.getClass();
        this.a = x50Var;
        this.b = fxVar;
        this.c = f2;
        this.d = f3;
        this.e = rs0Var;
        this.f = ns0Var;
        this.g = ss0Var;
        this.h = gv3.a(f, f2);
        this.i = gv3.a(0.0f, 5.0f);
        this.j = gv3.a(0.0f, 0.001f);
        this.k = gv3.a(1.0f, 0.001f);
        this.l = gv3.a(1.0f, 0.001f);
        this.m = new zs1();
        this.n = new op3();
        this.o = ob3.a(yp1.a, dm3.a, new v8(1, this));
    }

    public final void a(float f) {
        cl3.t(this.a, null, new s60(this, f, null), 3);
    }

    public final float b() {
        return ((Number) this.j.d()).floatValue();
    }

    public final float c() {
        float fE = e();
        fx fxVar = this.b;
        return y02.g((fE - ((Number) fxVar.a()).floatValue()) / (((Number) fxVar.b()).floatValue() - ((Number) fxVar.a()).floatValue()), 0.0f, 1.0f);
    }

    public final float d() {
        return ((Number) this.h.e.getValue()).floatValue();
    }

    public final float e() {
        return ((Number) this.h.d()).floatValue();
    }

    public final void f() {
        ol1 ol1Var = (ol1) this.n.a;
        np3 np3Var = ol1Var.a;
        d70[] d70VarArr = np3Var.d;
        uj.O(0, d70VarArr.length, null, d70VarArr);
        np3Var.e = 0;
        np3 np3Var2 = ol1Var.b;
        d70[] d70VarArr2 = np3Var2.d;
        uj.O(0, d70VarArr2.length, null, d70VarArr2);
        np3Var2.e = 0;
        ol1Var.c = 0L;
        cl3.t(this.a, null, new pw(this, null, 4), 3);
    }

    public final void g() {
        cl3.t(this.a, null, new j(this, null, 17), 3);
    }

    public final void h(float f) {
        cl3.t(this.a, null, new p60(this, ((Number) y02.k(Float.valueOf(f), this.b)).floatValue(), null, 1), 3);
    }
}
