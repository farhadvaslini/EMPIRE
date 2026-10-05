package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class r90 implements g43 {
    public final OutputStream f;
    public final s73 g;
    public final /* synthetic */ pl h;

    public r90(pl plVar) {
        this.h = plVar;
        Socket socket = (Socket) plVar.g;
        this.f = socket.getOutputStream();
        this.g = new s73(socket);
    }

    @Override // defpackage.g43
    public final ci3 a() {
        return this.g;
    }

    @Override // defpackage.g43, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i;
        OutputStream outputStream = this.f;
        pl plVar = this.h;
        s73 s73Var = this.g;
        s73Var.h();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) plVar.h;
            Socket socket = (Socket) plVar.g;
            atomicInteger.getClass();
            while (true) {
                int i2 = atomicInteger.get();
                if ((i2 & 1) != 0) {
                    i = 0;
                    break;
                }
                int i3 = i2 | 1;
                if (atomicInteger.compareAndSet(i2, i3)) {
                    i = i3;
                    break;
                }
            }
            if (i != 0) {
                if (i != 3) {
                    if (!socket.isClosed() && !socket.isOutputShutdown()) {
                        outputStream.flush();
                        try {
                            socket.shutdownOutput();
                        } catch (UnsupportedOperationException unused) {
                            outputStream.close();
                        }
                    }
                    return;
                }
                socket.close();
                if (s73Var.i()) {
                    throw s73Var.j(null);
                }
            }
        } catch (IOException e) {
            if (!s73Var.i()) {
                throw e;
            }
            throw s73Var.j(e);
        } finally {
            s73Var.i();
        }
    }

    @Override // defpackage.g43, java.io.Flushable
    public final void flush() throws IOException {
        s73 s73Var = this.g;
        s73Var.h();
        try {
            this.f.flush();
            if (s73Var.i()) {
                throw s73Var.j(null);
            }
        } catch (IOException e) {
            if (!s73Var.i()) {
                throw e;
            }
            throw s73Var.j(e);
        } finally {
            s73Var.i();
        }
    }

    @Override // defpackage.g43
    public final void l(long j, hp hpVar) throws IOException {
        rn.v(hpVar.g, 0L, j);
        while (j > 0) {
            s73 s73Var = this.g;
            s73Var.f();
            jt2 jt2Var = hpVar.f;
            jt2Var.getClass();
            int iMin = (int) Math.min(j, jt2Var.c - jt2Var.b);
            s73Var.h();
            try {
                try {
                    this.f.write(jt2Var.a, jt2Var.b, iMin);
                    if (s73Var.i()) {
                        throw s73Var.j(null);
                    }
                    int i = jt2Var.b + iMin;
                    jt2Var.b = i;
                    long j2 = iMin;
                    j -= j2;
                    hpVar.g -= j2;
                    if (i == jt2Var.c) {
                        hpVar.f = jt2Var.a();
                        mt2.a(jt2Var);
                    }
                } catch (IOException e) {
                    if (!s73Var.i()) {
                        throw e;
                    }
                    throw s73Var.j(e);
                }
            } catch (Throwable th) {
                s73Var.i();
                throw th;
            }
        }
    }

    public final String toString() {
        return "sink(" + ((Socket) this.h.g) + ')';
    }
}
