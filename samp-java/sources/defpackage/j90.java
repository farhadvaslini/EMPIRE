package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class j90 extends dk0 {
    public static final j90 i;
    public w50 h;

    static {
        int i2 = kd3.c;
        int i3 = kd3.d;
        long j = kd3.e;
        String str = kd3.a;
        j90 j90Var = new j90();
        j90Var.h = new w50(i2, i3, j, str);
        i = j90Var;
    }

    @Override // defpackage.q50
    public final void B(o50 o50Var, Runnable runnable) {
        w50.f(this.h, runnable, 6);
    }

    @Override // defpackage.q50
    public final void C(o50 o50Var, Runnable runnable) {
        w50.f(this.h, runnable, 2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.q50
    public final String toString() {
        return "Dispatchers.Default";
    }
}
