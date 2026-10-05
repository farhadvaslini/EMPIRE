package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class be3 implements yd3 {
    public final long f;
    public final /* synthetic */ ce3 g;

    public be3(ce3 ce3Var, long j) {
        this.g = ce3Var;
        this.f = j;
    }

    @Override // defpackage.yd3
    public final long B(ab1 ab1Var) {
        ab1 ab1Var2 = (ab1) this.g.w.getValue();
        if (ab1Var2 != null) {
            if (ab1Var2.t0()) {
                return ab1Var.V(ab1Var2.i(this.f));
            }
            return 0L;
        }
        p21.d("Tried to open context menu before the anchor was placed.");
        c.d();
        return 0L;
    }

    @Override // defpackage.yd3
    public final jk2 H(ab1 ab1Var) {
        return b32.b(B(ab1Var), 0L);
    }

    @Override // defpackage.yd3
    public final xd3 Y0() {
        return t22.r(this.g);
    }
}
