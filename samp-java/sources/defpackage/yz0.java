package defpackage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class yz0 implements z73 {
    public final rp f;
    public int g;
    public int h;
    public int i;
    public int j;

    public yz0(rp rpVar) {
        rpVar.getClass();
        this.f = rpVar;
    }

    @Override // defpackage.z73
    public final ci3 a() {
        return this.f.a();
    }

    @Override // defpackage.z73
    public final long d(long j, hp hpVar) throws IOException {
        int i;
        int i2;
        hpVar.getClass();
        do {
            int i3 = this.i;
            rp rpVar = this.f;
            if (i3 == 0) {
                rpVar.skip(this.j);
                this.j = 0;
                if ((this.g & 4) == 0) {
                    i = this.h;
                    int iK = jv3.k(rpVar);
                    this.i = iK;
                    int i4 = rpVar.readByte() & 255;
                    this.g = rpVar.readByte() & 255;
                    Logger logger = zz0.i;
                    if (logger.isLoggable(Level.FINE)) {
                        kq kqVar = oz0.a;
                        logger.fine(oz0.b(true, this.h, iK, i4, this.g));
                    }
                    i2 = rpVar.readInt() & Integer.MAX_VALUE;
                    this.h = i2;
                    if (i4 != 9) {
                        throw new IOException(i4 + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long jD = rpVar.d(Math.min(8192L, i3), hpVar);
                if (jD != -1) {
                    this.i -= (int) jD;
                    return jD;
                }
            }
            return -1L;
        } while (i2 == i);
        c.r("TYPE_CONTINUATION streamId changed");
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
