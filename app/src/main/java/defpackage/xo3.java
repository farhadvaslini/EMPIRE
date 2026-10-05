package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class xo3 extends o32 {
    public final d42 e = b32.w(new h43(0));
    public final d42 f = b32.w(Boolean.FALSE);
    public final ro3 g;
    public final d42 h;
    public float i;
    public yx j;

    public xo3(bx0 bx0Var) {
        ro3 ro3Var = new ro3(bx0Var);
        ro3Var.f = new sg3(3, this);
        this.g = ro3Var;
        this.h = new d42(dm3.a, f5.f0);
        this.i = 1.0f;
    }

    @Override // defpackage.o32
    public final void a(float f) {
        this.i = f;
    }

    @Override // defpackage.o32
    public final void b(yx yxVar) {
        this.j = yxVar;
    }

    @Override // defpackage.o32
    public final long d() {
        return ((h43) this.e.getValue()).a;
    }

    @Override // defpackage.o32
    public final void e(vb1 vb1Var) {
        rr rrVar = vb1Var.f;
        yx yxVar = this.j;
        ro3 ro3Var = this.g;
        if (yxVar == null) {
            yxVar = (yx) ro3Var.g.getValue();
        }
        if (((Boolean) this.f.getValue()).booleanValue() && vb1Var.getLayoutDirection() == bb1.g) {
            long jY0 = rrVar.y0();
            pi piVar = rrVar.g;
            long jA = piVar.A();
            piVar.k().l();
            try {
                ((yl1) piVar.g).G(-1.0f, 1.0f, jY0);
                ro3Var.e(vb1Var, this.i, yxVar);
            } finally {
                nc2.t(piVar, jA);
            }
        } else {
            ro3Var.e(vb1Var, this.i, yxVar);
        }
        this.h.getValue();
    }
}
