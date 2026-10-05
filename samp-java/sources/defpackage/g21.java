package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class g21 implements z73 {
    public final ej2 f;
    public final Inflater g;
    public int h;
    public boolean i;

    public g21(ej2 ej2Var, Inflater inflater) {
        this.f = ej2Var;
        this.g = inflater;
    }

    @Override // defpackage.z73
    public final ci3 a() {
        return this.f.f.a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.i) {
            return;
        }
        this.g.end();
        this.i = true;
        this.f.close();
    }

    @Override // defpackage.z73
    public final long d(long j, hp hpVar) throws IOException {
        long j2;
        Inflater inflater = this.g;
        hpVar.getClass();
        while (!this.i) {
            try {
                jt2 jt2VarO = hpVar.o(1);
                int iMin = (int) Math.min(8192L, 8192 - jt2VarO.c);
                boolean zNeedsInput = inflater.needsInput();
                ej2 ej2Var = this.f;
                if (zNeedsInput && !ej2Var.b()) {
                    jt2 jt2Var = ej2Var.g.f;
                    jt2Var.getClass();
                    int i = jt2Var.c;
                    int i2 = jt2Var.b;
                    int i3 = i - i2;
                    this.h = i3;
                    inflater.setInput(jt2Var.a, i2, i3);
                }
                int iInflate = inflater.inflate(jt2VarO.a, jt2VarO.c, iMin);
                int i4 = this.h;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.h -= remaining;
                    ej2Var.skip(remaining);
                }
                if (iInflate > 0) {
                    jt2VarO.c += iInflate;
                    j2 = iInflate;
                    hpVar.g += j2;
                } else {
                    if (jt2VarO.b == jt2VarO.c) {
                        hpVar.f = jt2VarO.a();
                        mt2.a(jt2VarO);
                    }
                    j2 = 0;
                }
                if (j2 > 0) {
                    return j2;
                }
                if (inflater.finished() || inflater.needsDictionary()) {
                    return -1L;
                }
                if (ej2Var.b()) {
                    throw new EOFException("source exhausted prematurely");
                }
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
        c.q("closed");
        return 0L;
    }
}
