package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class hc0 implements al2 {
    public final ns0 f;
    public ic0 g;

    public hc0(ns0 ns0Var) {
        this.f = ns0Var;
    }

    @Override // defpackage.al2
    public final void a() {
        this.g = (ic0) this.f.h(rn.i0);
    }

    @Override // defpackage.al2
    public final void e() {
        ic0 ic0Var = this.g;
        if (ic0Var != null) {
            ic0Var.a();
        }
        this.g = null;
    }

    @Override // defpackage.al2
    public final void d() {
    }
}
