package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class wj0 implements g43 {
    public final g43 f;
    public boolean g;
    public long h;
    public boolean i;
    public boolean j;
    public final /* synthetic */ yj0 k;

    public wj0(yj0 yj0Var, g43 g43Var) {
        g43Var.getClass();
        this.k = yj0Var;
        this.f = g43Var;
        this.i = true;
    }

    @Override // defpackage.g43
    public final ci3 a() {
        return this.f.a();
    }

    public final void b() {
        this.f.close();
    }

    public final IOException c(IOException iOException) {
        if (this.g) {
            return iOException;
        }
        this.g = true;
        return yj0.a(this.k, true, iOException, 4);
    }

    @Override // defpackage.g43, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.j) {
            return;
        }
        this.j = true;
        try {
            b();
            c(null);
        } catch (IOException e) {
            IOException iOExceptionC = c(e);
            iOExceptionC.getClass();
            throw iOExceptionC;
        }
    }

    public final void f() {
        this.f.flush();
    }

    @Override // defpackage.g43, java.io.Flushable
    public final void flush() throws IOException {
        try {
            f();
        } catch (IOException e) {
            IOException iOExceptionC = c(e);
            iOExceptionC.getClass();
            throw iOExceptionC;
        }
    }

    @Override // defpackage.g43
    public final void l(long j, hp hpVar) throws IOException {
        if (this.j) {
            c.q("closed");
            return;
        }
        try {
            if (this.i) {
                this.i = false;
                ((ij2) this.k.b).i.getClass();
            }
            this.f.l(j, hpVar);
            this.h += j;
        } catch (IOException e) {
            IOException iOExceptionC = c(e);
            iOExceptionC.getClass();
            throw iOExceptionC;
        }
    }

    public final String toString() {
        return wj0.class.getSimpleName() + '(' + this.f + ')';
    }
}
