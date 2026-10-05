package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class jj3 {
    public final zs1 a;
    public final ps1 b = new ps1(Boolean.FALSE);
    public jr c;

    public jj3(zs1 zs1Var) {
        this.a = zs1Var;
    }

    public final void a() {
        this.b.c.setValue(Boolean.FALSE);
    }

    public final boolean b() {
        ps1 ps1Var = this.b;
        return ((Boolean) ps1Var.b.getValue()).booleanValue() || ((Boolean) ps1Var.c.getValue()).booleanValue();
    }

    public final Object c(ts1 ts1Var, mb3 mb3Var) {
        p40 p40Var = null;
        z5 z5Var = new z5(this, new r70(this, p40Var, 2), ts1Var, p40Var, 1);
        zs1 zs1Var = this.a;
        zs1Var.getClass();
        Object objW = ur.w(new e51(ts1Var, zs1Var, z5Var, p40Var, 1), mb3Var);
        return objW == y50.f ? objW : dm3.a;
    }
}
