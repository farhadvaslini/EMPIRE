package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class xj0 implements z73 {
    public final z73 f;
    public final long g;
    public final boolean h;
    public long i;
    public boolean j;
    public boolean k;
    public boolean l;
    public final /* synthetic */ yj0 m;

    public xj0(yj0 yj0Var, z73 z73Var, long j, boolean z) {
        z73Var.getClass();
        this.m = yj0Var;
        this.f = z73Var;
        this.g = j;
        this.h = z;
        this.j = true;
        if (j == 0) {
            c(null);
        }
    }

    @Override // defpackage.z73
    public final ci3 a() {
        return this.f.a();
    }

    public final void b() throws IOException {
        this.f.close();
    }

    public final IOException c(IOException iOException) {
        if (this.k) {
            return iOException;
        }
        this.k = true;
        if (iOException == null && this.j) {
            this.j = false;
            ((ij2) this.m.b).i.getClass();
        }
        return yj0.a(this.m, this.h, iOException, 8);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.l) {
            return;
        }
        this.l = true;
        try {
            b();
            c(null);
        } catch (IOException e) {
            IOException iOExceptionC = c(e);
            iOExceptionC.getClass();
            throw iOExceptionC;
        }
    }

    @Override // defpackage.z73
    public final long d(long j, hp hpVar) throws IOException {
        hpVar.getClass();
        if (this.l) {
            c.q("closed");
            return 0L;
        }
        try {
            long jD = this.f.d(8192L, hpVar);
            if (this.j) {
                this.j = false;
                ((ij2) this.m.b).i.getClass();
            }
            if (jD == -1) {
                c(null);
                return -1L;
            }
            long j2 = this.i + jD;
            long j3 = this.g;
            if (j3 != -1 && j2 > j3) {
                throw new ProtocolException("expected " + this.g + " bytes but received " + j2);
            }
            this.i = j2;
            if (((ak0) this.m.d).d()) {
                c(null);
            }
            return jD;
        } catch (IOException e) {
            IOException iOExceptionC = c(e);
            iOExceptionC.getClass();
            throw iOExceptionC;
        }
    }

    public final String toString() {
        return xj0.class.getSimpleName() + '(' + this.f + ')';
    }
}
