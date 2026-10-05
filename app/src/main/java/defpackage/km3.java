package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class km3 extends nn2 implements z73 {
    public final jn1 g;
    public final long h;

    public km3(jn1 jn1Var, long j) {
        this.g = jn1Var;
        this.h = j;
    }

    @Override // defpackage.z73
    public final ci3 a() {
        return ci3.d;
    }

    @Override // defpackage.nn2
    public final long b() {
        return this.h;
    }

    @Override // defpackage.nn2
    public final jn1 c() {
        return this.g;
    }

    @Override // defpackage.z73
    public final long d(long j, hp hpVar) {
        hpVar.getClass();
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // defpackage.nn2
    public final rp f() {
        return new ej2(this);
    }

    @Override // defpackage.nn2, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
