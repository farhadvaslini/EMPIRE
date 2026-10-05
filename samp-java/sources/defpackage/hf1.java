package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class hf1 implements mf1, x50 {
    public final gf1 f;
    public final o50 g;

    public hf1(gf1 gf1Var, o50 o50Var) {
        j61 j61Var;
        o50Var.getClass();
        this.f = gf1Var;
        this.g = o50Var;
        if (((rf1) gf1Var).i != ff1.f || (j61Var = (j61) o50Var.m(f5.b0)) == null) {
            return;
        }
        j61Var.c(null);
    }

    @Override // defpackage.x50
    public final o50 h() {
        return this.g;
    }

    @Override // defpackage.mf1
    public final void i(of1 of1Var, ef1 ef1Var) {
        gf1 gf1Var = this.f;
        if (((rf1) gf1Var).i.compareTo(ff1.f) <= 0) {
            gf1Var.b(this);
            j61 j61Var = (j61) this.g.m(f5.b0);
            if (j61Var != null) {
                j61Var.c(null);
            }
        }
    }
}
