package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class va1 extends aq1 implements of0, dw0 {
    public ta1 t;

    @Override // defpackage.dw0
    public final void O(ex1 ex1Var) {
        if (ex1Var.w1().s) {
            this.t.d(ex1Var);
        }
    }

    @Override // defpackage.aq1
    public final void i1() {
        this.t.d(null);
    }

    @Override // defpackage.of0
    public final void m0(vb1 vb1Var) {
        vb1Var.c();
        qw0 qw0Var = this.t.a;
        i iVar = new i(23, this, vb1Var);
        long jS = lr.S(vb1Var.f.a());
        qw0Var.getClass();
        vb1Var.g0(qw0Var, jS, new i(24, vr.X(this).E, iVar));
    }
}
