package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class g31 implements z73 {
    public final InputStream f;
    public final ci3 g;

    public g31(InputStream inputStream, ci3 ci3Var) {
        this.f = inputStream;
        this.g = ci3Var;
    }

    @Override // defpackage.z73
    public final ci3 a() {
        return this.g;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f.close();
    }

    @Override // defpackage.z73
    public final long d(long j, hp hpVar) throws IOException {
        hpVar.getClass();
        try {
            this.g.f();
            jt2 jt2VarO = hpVar.o(1);
            int i = this.f.read(jt2VarO.a, jt2VarO.c, (int) Math.min(8192L, 8192 - jt2VarO.c));
            if (i != -1) {
                jt2VarO.c += i;
                long j2 = i;
                hpVar.g += j2;
                return j2;
            }
            if (jt2VarO.b != jt2VarO.c) {
                return -1L;
            }
            hpVar.f = jt2VarO.a();
            mt2.a(jt2VarO);
            return -1L;
        } catch (AssertionError e) {
            if (iv3.a(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    public final String toString() {
        return "source(" + this.f + ')';
    }
}
