package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class s90 implements z73 {
    public final InputStream f;
    public final s73 g;
    public final /* synthetic */ pl h;

    public s90(pl plVar) {
        this.h = plVar;
        Socket socket = (Socket) plVar.g;
        this.f = socket.getInputStream();
        this.g = new s73(socket);
    }

    @Override // defpackage.z73
    public final ci3 a() {
        return this.g;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i;
        pl plVar = this.h;
        s73 s73Var = this.g;
        s73Var.h();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) plVar.h;
            Socket socket = (Socket) plVar.g;
            atomicInteger.getClass();
            while (true) {
                int i2 = atomicInteger.get();
                if ((i2 & 2) != 0) {
                    i = 0;
                    break;
                }
                int i3 = i2 | 2;
                if (atomicInteger.compareAndSet(i2, i3)) {
                    i = i3;
                    break;
                }
            }
            if (i != 0) {
                if (i == 3) {
                    socket.close();
                } else {
                    if (socket.isClosed() || socket.isInputShutdown()) {
                        return;
                    }
                    try {
                        socket.shutdownInput();
                    } catch (UnsupportedOperationException unused) {
                        this.f.close();
                    }
                }
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

    @Override // defpackage.z73
    public final long d(long j, hp hpVar) throws IOException {
        hpVar.getClass();
        s73 s73Var = this.g;
        s73Var.f();
        jt2 jt2VarO = hpVar.o(1);
        int iMin = (int) Math.min(8192L, 8192 - jt2VarO.c);
        try {
            s73Var.h();
            try {
                int i = this.f.read(jt2VarO.a, jt2VarO.c, iMin);
                if (s73Var.i()) {
                    throw s73Var.j(null);
                }
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
            } catch (IOException e) {
                if (s73Var.i()) {
                    throw s73Var.j(e);
                }
                throw e;
            } finally {
                s73Var.i();
            }
        } catch (AssertionError e2) {
            if (iv3.a(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        }
    }

    public final String toString() {
        return "source(" + ((Socket) this.h.g) + ')';
    }
}
