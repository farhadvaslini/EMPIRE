package defpackage;

import java.io.IOException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class kz0 extends jz0 {
    public long j;
    public boolean k;
    public final /* synthetic */ nz0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz0(nz0 nz0Var, i01 i01Var) {
        super(nz0Var, i01Var);
        i01Var.getClass();
        this.l = nz0Var;
        this.j = -1L;
        this.k = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zG;
        if (this.h) {
            return;
        }
        if (this.k) {
            TimeZone timeZone = lv3.a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                zG = lv3.g(this, 100);
            } catch (IOException unused) {
                zG = false;
            }
            if (!zG) {
                this.l.b.h();
                b(nz0.f);
            }
        }
        this.h = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bf, code lost:
    
        if (r16.k == false) goto L46;
     */
    @Override // defpackage.jz0, defpackage.z73
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long d(long r17, defpackage.hp r19) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kz0.d(long, hp):long");
    }
}
