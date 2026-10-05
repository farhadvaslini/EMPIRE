package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class lz0 extends jz0 {
    public long j;
    public final /* synthetic */ nz0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lz0(nz0 nz0Var, i01 i01Var, long j) {
        super(nz0Var, i01Var);
        i01Var.getClass();
        this.k = nz0Var;
        this.j = j;
        if (j == 0) {
            b(ux0.g);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zG;
        if (this.h) {
            return;
        }
        if (this.j != 0) {
            TimeZone timeZone = lv3.a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                zG = lv3.g(this, 100);
            } catch (IOException unused) {
                zG = false;
            }
            if (!zG) {
                this.k.b.h();
                b(nz0.f);
            }
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
        long j2 = this.j;
        if (j2 == 0) {
            return -1L;
        }
        long jD = super.d(Math.min(j2, 8192L), hpVar);
        if (jD == -1) {
            this.k.b.h();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            b(nz0.f);
            throw protocolException;
        }
        long j3 = this.j - jD;
        this.j = j3;
        if (j3 == 0) {
            b(ux0.g);
        }
        return jD;
    }
}
