package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class m80 extends aq1 implements of0 {
    public final t41 t;
    public boolean u;
    public boolean v;
    public boolean w;

    public m80(t41 t41Var) {
        this.t = t41Var;
    }

    @Override // defpackage.aq1
    public final void h1() {
        cl3.t(d1(), null, new l80(this, null, 0), 3);
    }

    @Override // defpackage.of0
    public final void m0(vb1 vb1Var) {
        vb1Var.c();
        rr rrVar = vb1Var.f;
        if (this.u) {
            qf0.h0(vb1Var, wx.b(0.3f, wx.b), 0L, rrVar.a(), 0.0f, null, 0, 122);
        } else if (this.v || this.w) {
            qf0.h0(vb1Var, wx.b(0.1f, wx.b), 0L, rrVar.a(), 0.0f, null, 0, 122);
        }
    }
}
