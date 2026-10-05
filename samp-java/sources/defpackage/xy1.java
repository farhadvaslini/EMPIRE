package defpackage;

import android.window.OnBackInvokedDispatcher;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class xy1 {
    public final Runnable a;
    public final xb3 b = new xb3(new it1(4, this));

    public xy1(Runnable runnable) {
        this.a = runnable;
    }

    public final void a(of1 of1Var, sy1 sy1Var) {
        sy1Var.getClass();
        final gf1 lifecycle = of1Var.getLifecycle();
        if (((rf1) lifecycle).i == ff1.f) {
            return;
        }
        ry1 ry1Var = new ry1(sy1Var, new ty1(of1Var, sy1Var));
        sy1Var.a.add(ry1Var);
        ry1Var.g(false);
        lv1.a(b().c, ry1Var);
        final c90 c90Var = new c90(ry1Var, this, lifecycle);
        lifecycle.a(c90Var);
        sy1Var.c.add(new AutoCloseable() { // from class: uy1
            @Override // java.lang.AutoCloseable
            public final void close() {
                lifecycle.b(c90Var);
            }
        });
    }

    public final vy1 b() {
        return (vy1) this.b.getValue();
    }

    public final void c(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        b().c.c(new py1(onBackInvokedDispatcher, 0), 1);
        b().c.c(new py1(onBackInvokedDispatcher, 1000000), 0);
    }
}
