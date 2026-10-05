package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class mq2 implements mf1, AutoCloseable {
    public final String f;
    public final lq2 g;
    public boolean h;

    public mq2(String str, lq2 lq2Var) {
        this.f = str;
        this.g = lq2Var;
    }

    public final void h(gf1 gf1Var, tq2 tq2Var) {
        tq2Var.getClass();
        gf1Var.getClass();
        if (this.h) {
            c.q("Already attached to lifecycleOwner");
            return;
        }
        this.h = true;
        gf1Var.a(this);
        tq2Var.c(this.f, (hr0) this.g.b.e);
    }

    @Override // defpackage.mf1
    public final void i(of1 of1Var, ef1 ef1Var) {
        if (ef1Var == ef1.ON_DESTROY) {
            this.h = false;
            of1Var.getLifecycle().b(this);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
