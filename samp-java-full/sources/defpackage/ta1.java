package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ta1 implements gl {
    public final qw0 a;
    public final ns0 b;
    public final d42 c;
    public d61 d;

    public ta1(qw0 qw0Var, ns0 ns0Var) {
        qw0Var.getClass();
        ns0Var.getClass();
        this.a = qw0Var;
        this.b = ns0Var;
        this.c = b32.w(null);
    }

    @Override // defpackage.gl
    public final boolean a() {
        return true;
    }

    @Override // defpackage.gl
    public final void b(qf0 qf0Var, ua0 ua0Var, ab1 ab1Var, ns0 ns0Var) {
        ab1 ab1Var2;
        long jD;
        qf0Var.getClass();
        ua0Var.getClass();
        if (ab1Var == null || (ab1Var2 = (ab1) this.c.getValue()) == null) {
            return;
        }
        pi piVarZ = qf0Var.Z();
        long jA = piVarZ.A();
        piVarZ.k().l();
        try {
            yl1 yl1Var = (yl1) piVarZ.g;
            if (ns0Var != null) {
                c().c(yl1Var, ua0Var, ns0Var);
            }
            try {
                jD = ab1Var2.l0(ab1Var, 0L, (6 & 4) != 0);
            } catch (Exception unused) {
                jD = gy1.d(ab1Var.D(0L), ab1Var2.D(0L));
            }
            yl1Var.H(-Float.intBitsToFloat((int) (jD >> 32)), -Float.intBitsToFloat((int) (jD & 4294967295L)));
            lr.z(qf0Var, this.a);
        } finally {
            nc2.t(piVarZ, jA);
        }
    }

    public final d61 c() {
        d61 d61Var = this.d;
        if (d61Var != null) {
            d61Var.f = 9205357640488583168L;
            d61Var.g = 1.0f;
            d61Var.h = 1.0f;
            d61Var.i = 1.0f;
            d61Var.j = 1.0f;
            int i = vw0.b;
            d61Var.k = 0.0f;
            long j = wj3.b;
            d61Var.l = null;
            return d61Var;
        }
        d61 d61Var2 = new d61();
        d61Var2.f = 9205357640488583168L;
        d61Var2.g = 1.0f;
        d61Var2.h = 1.0f;
        d61Var2.i = 1.0f;
        d61Var2.j = 1.0f;
        int i2 = vw0.b;
        long j2 = wj3.b;
        this.d = d61Var2;
        return d61Var2;
    }

    public final void d(ex1 ex1Var) {
        this.c.setValue(ex1Var);
    }
}
