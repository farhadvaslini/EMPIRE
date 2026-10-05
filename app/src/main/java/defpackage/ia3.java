package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ia3 extends ja0 implements jb2, so0, kp0 {
    public cs0 v;
    public boolean w;
    public final sb3 x;

    public ia3(cs0 cs0Var) {
        this.v = cs0Var;
        v8 v8Var = new v8(8, this);
        za2 za2Var = ob3.a;
        sb3 sb3Var = new sb3(null, null, null, v8Var);
        p1(sb3Var);
        this.x = sb3Var;
    }

    @Override // defpackage.jb2
    public final long L() {
        nd0 nd0Var = vm1.i0;
        ua0 ua0Var = vr.X(this).E;
        nd0Var.getClass();
        int i = nj3.b;
        return ak2.k(ua0Var.p0(10.0f), ua0Var.p0(40.0f), ua0Var.p0(10.0f), ua0Var.p0(40.0f));
    }

    @Override // defpackage.jb2
    public final void L0() {
        this.x.L0();
    }

    @Override // defpackage.jb2
    public final void i0(za2 za2Var, ab2 ab2Var, long j) {
        this.x.i0(za2Var, ab2Var, j);
    }

    @Override // defpackage.so0
    public final void x0(mp0 mp0Var) {
        this.w = mp0Var.a();
    }
}
