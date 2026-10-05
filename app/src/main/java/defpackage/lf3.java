package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class lf3 {
    public static final ar2 g = gq.K(new av2(4), new db3(11));
    public final z32 a;
    public final z32 b = new z32(0.0f);
    public final a42 c = new a42(0);
    public jk2 d = jk2.e;
    public long e = yg3.b;
    public final d42 f;

    public lf3(t02 t02Var, float f) {
        this.a = new z32(f);
        this.f = new d42(t02Var, m22.u);
    }

    public final void a(t02 t02Var, jk2 jk2Var, int i, int i2) {
        float f = i2 - i;
        this.b.h(f);
        float f2 = jk2Var.a;
        float f3 = jk2Var.b;
        jk2 jk2Var2 = this.d;
        float f4 = jk2Var2.a;
        z32 z32Var = this.a;
        if (f2 != f4 || f3 != jk2Var2.b) {
            boolean z = t02Var == t02.f;
            if (z) {
                f2 = f3;
            }
            float f5 = z ? jk2Var.d : jk2Var.c;
            float fG = z32Var.g();
            float f6 = i;
            float f7 = fG + f6;
            z32Var.h(z32Var.g() + ((f5 <= f7 && (f2 >= fG || f5 - f2 <= f6)) ? (f2 >= fG || f5 - f2 > f6) ? 0.0f : f2 - fG : f5 - f7));
            this.d = jk2Var;
        }
        z32Var.h(y02.g(z32Var.g(), 0.0f, f));
        this.c.h(i);
    }
}
