package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class cj2 implements g93, fn0, dt0 {
    public final /* synthetic */ i93 f;
    private final j61 job;

    public cj2(i93 i93Var, w83 w83Var) {
        this.f = i93Var;
        this.job = w83Var;
    }

    @Override // defpackage.fn0
    public final Object a(gn0 gn0Var, p40 p40Var) {
        this.f.a(gn0Var, p40Var);
        return y50.f;
    }

    @Override // defpackage.dt0
    public final fn0 b(o50 o50Var, int i, jp jpVar) {
        return ((((i < 0 || i >= 2) && i != -2) || jpVar != jp.g) && !((i == 0 || i == -3) && jpVar == jp.f)) ? new os(this, o50Var, i, jpVar) : this;
    }

    @Override // defpackage.g93
    public final Object getValue() {
        return this.f.getValue();
    }
}
