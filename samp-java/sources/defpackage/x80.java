package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class x80 extends dk0 implements Executor {
    public static final x80 h = new x80();
    public static final q50 i;

    static {
        gm3 gm3Var = gm3.h;
        int i2 = cc3.a;
        if (64 >= i2) {
            i2 = 64;
        }
        i = gm3Var.E(b32.E(i2, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // defpackage.q50
    public final void B(o50 o50Var, Runnable runnable) {
        i.B(o50Var, runnable);
    }

    @Override // defpackage.q50
    public final void C(o50 o50Var, Runnable runnable) throws vb0 {
        i.C(o50Var, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        B(li0.f, runnable);
    }

    @Override // defpackage.q50
    public final String toString() {
        return "Dispatchers.IO";
    }
}
