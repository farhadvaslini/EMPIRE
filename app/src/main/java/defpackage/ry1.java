package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ry1 extends nv1 {
    public final sy1 d;
    public boolean e;

    public ry1(sy1 sy1Var, ty1 ty1Var) {
        boolean z = sy1Var.b;
        this.a = ty1Var;
        this.b = z;
        this.d = sy1Var;
        this.e = true;
    }

    @Override // defpackage.nv1
    public final void a() {
        this.d.a();
    }

    @Override // defpackage.nv1
    public final void b() {
        this.d.b();
    }

    @Override // defpackage.nv1
    public final void c(kv1 kv1Var) {
        this.d.c(new rk(kv1Var));
    }

    @Override // defpackage.nv1
    public final void d(kv1 kv1Var) {
        kv1Var.getClass();
        this.d.d(new rk(kv1Var));
    }

    public final void g(boolean z) {
        this.e = z;
        f(z && this.d.b);
    }
}
