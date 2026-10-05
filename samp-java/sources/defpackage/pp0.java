package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class pp0 extends ja0 implements ey1, m20 {
    public final rp0 v;
    public jd1 w;

    public pp0() {
        rp0 rp0Var = new rp0(0, new op0(2, this, pp0.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 0, 0), 9);
        p1(rp0Var);
        this.v = rp0Var;
    }

    @Override // defpackage.ey1
    public final void k0() {
        qk2 qk2Var = new qk2();
        gq.M(this, new u1(16, qk2Var, this));
        jd1 jd1Var = (jd1) qk2Var.f;
        if (this.v.u1().a()) {
            jd1 jd1Var2 = this.w;
            if (jd1Var2 != null) {
                jd1Var2.b();
            }
            if (jd1Var != null) {
                jd1Var.a();
            } else {
                jd1Var = null;
            }
            this.w = jd1Var;
        }
    }
}
