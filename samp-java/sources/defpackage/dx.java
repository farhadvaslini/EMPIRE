package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class dx implements AutoCloseable, x50 {
    public final o50 f;

    public dx(o50 o50Var) {
        o50Var.getClass();
        this.f = o50Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        j61 j61Var = (j61) this.f.m(f5.b0);
        if (j61Var != null) {
            j61Var.c(null);
        }
    }

    @Override // defpackage.x50
    public final o50 h() {
        return this.f;
    }
}
