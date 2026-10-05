package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class vb0 extends Exception {
    public final Throwable f;

    public vb0(Throwable th, q50 q50Var, o50 o50Var) {
        super("Coroutine dispatcher " + q50Var + " threw an exception, context = " + o50Var, th);
        this.f = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f;
    }
}
