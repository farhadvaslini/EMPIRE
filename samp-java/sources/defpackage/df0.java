package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class df0 extends se0 {
    public ef0 O;
    public boolean P;
    public ss0 Q;
    public ss0 R;
    public boolean S;

    @Override // defpackage.se0
    public final void B1(long j) {
        if (!this.s || s51.n(this.Q, bf0.a)) {
            return;
        }
        cl3.t(d1(), null, new cf0(this, j, null), 1);
    }

    @Override // defpackage.se0
    public final void C1(ae0 ae0Var) {
        t02 t02Var;
        if (!this.s || s51.n(this.R, bf0.b) || (t02Var = this.v) == null) {
            return;
        }
        cl3.t(d1(), null, new n9(this, ae0Var, t02Var, (p40) null, 4), 1);
    }

    @Override // defpackage.se0
    public final boolean H1() {
        return this.P;
    }

    @Override // defpackage.se0
    public final Object w1(re0 re0Var, re0 re0Var2) {
        Object objF;
        t02 t02Var = this.v;
        return (t02Var != null && (objF = this.O.f(new n9(re0Var, this, t02Var, (p40) null, 3), re0Var2)) == y50.f) ? objF : dm3.a;
    }
}
