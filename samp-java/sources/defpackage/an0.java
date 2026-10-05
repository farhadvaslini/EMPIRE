package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class an0 implements wm0 {
    public final float a;
    public final r83 b;

    public an0(float f, float f2, float f3) {
        this.a = f3;
        r83 r83Var = new r83();
        r83Var.a = 1.0f;
        r83Var.b = Math.sqrt(50.0d);
        r83Var.c = 1.0f;
        if (f < 0.0f) {
            ac2.a("Damping ratio must be non-negative");
        }
        r83Var.c = f;
        double d = r83Var.b;
        if (((float) (d * d)) <= 0.0f) {
            ac2.a("Spring stiffness constant must be positive.");
        }
        r83Var.b = Math.sqrt(f2);
        this.b = r83Var;
    }

    @Override // defpackage.wm0
    public final float b(long j, float f, float f2, float f3) {
        r83 r83Var = this.b;
        r83Var.a = f2;
        return Float.intBitsToFloat((int) (r83Var.a(f, f3, j / 1000000) >> 32));
    }

    @Override // defpackage.wm0
    public final float c(long j, float f, float f2, float f3) {
        r83 r83Var = this.b;
        r83Var.a = f2;
        return Float.intBitsToFloat((int) (r83Var.a(f, f3, j / 1000000) & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0132  */
    @Override // defpackage.wm0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long d(float r34, float r35, float r36) {
        /*
            Method dump skipped, instruction units count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.an0.d(float, float, float):long");
    }

    @Override // defpackage.wm0
    public final float e(float f, float f2, float f3) {
        return 0.0f;
    }

    public /* synthetic */ an0(float f, float f2) {
        this(f, f2, 0.01f);
    }
}
