package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class kp3 extends aq1 implements of0 {
    public bk3 t;
    public ij0 u;
    public ek0 v;
    public u23 w;

    @Override // defpackage.of0
    public final void m0(vb1 vb1Var) {
        vb1Var.c();
        bk3 bk3Var = this.t;
        jp3 jp3Var = new jp3(this, 0);
        u23 u23Var = this.w;
        ak3 ak3VarA = bk3Var.a(jp3Var, u23Var.c() ? new wx(u23Var.f) : null, null, new jp3(this, 1));
        u23 u23Var2 = this.w;
        long j = ((wx) ak3VarA.getValue()).a;
        wc1 wc1Var = u23Var2.c;
        if (u23Var2.d() && ((Boolean) ((d42) wc1Var.g).getValue()).booleanValue()) {
            j = ((wx) ((d42) wc1Var.h).getValue()).a;
        }
        long j2 = j;
        if (u23Var2.d()) {
            u23Var2.f = j2;
        }
        if (wx.d(j2) == 0.0f) {
            return;
        }
        fk3 fk3Var = this.u.a;
        fk3 fk3Var2 = this.v.a;
        qf0.h0(vb1Var, j2, 0L, 0L, 0.0f, null, 0, 126);
    }
}
