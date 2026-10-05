package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class mz0 extends jz0 {
    public boolean j;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.h) {
            return;
        }
        if (!this.j) {
            b(nz0.f);
        }
        this.h = true;
    }

    @Override // defpackage.jz0, defpackage.z73
    public final long d(long j, hp hpVar) throws IOException {
        hpVar.getClass();
        if (this.h) {
            c.q("closed");
            return 0L;
        }
        if (this.j) {
            return -1L;
        }
        long jD = super.d(8192L, hpVar);
        if (jD != -1) {
            return jD;
        }
        this.j = true;
        b(ux0.g);
        return -1L;
    }
}
