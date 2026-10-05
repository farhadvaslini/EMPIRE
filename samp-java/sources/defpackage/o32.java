package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class o32 {
    public w9 a;
    public yx b;
    public float c = 1.0f;
    public bb1 d = bb1.f;

    public abstract void a(float f);

    public abstract void b(yx yxVar);

    public final void c(vb1 vb1Var, long j, float f, yx yxVar) {
        rr rrVar = vb1Var.f;
        if (this.c != f) {
            a(f);
            this.c = f;
        }
        if (!s51.n(this.b, yxVar)) {
            b(yxVar);
            this.b = yxVar;
        }
        bb1 layoutDirection = vb1Var.getLayoutDirection();
        if (this.d != layoutDirection) {
            this.d = layoutDirection;
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (rrVar.a() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (rrVar.a() & 4294967295L)) - Float.intBitsToFloat(i2);
        ((yl1) rrVar.g.g).C(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i2) > 0.0f) {
                    e(vb1Var);
                }
            } finally {
                ((yl1) rrVar.g.g).C(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
            }
        }
    }

    public abstract long d();

    public abstract void e(vb1 vb1Var);
}
