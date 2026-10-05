package defpackage;

import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class jj2 extends uz0 implements zj0 {
    public final id3 b;
    public final wo2 c;
    public final Socket d;
    public final Socket e;
    public final mx0 f;
    public final de2 g;
    public final pi h;
    public wz0 i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final ArrayList p;
    public long q;

    public jj2(id3 id3Var, lj2 lj2Var, wo2 wo2Var, Socket socket, Socket socket2, mx0 mx0Var, de2 de2Var, pi piVar) {
        id3Var.getClass();
        lj2Var.getClass();
        wo2Var.getClass();
        socket.getClass();
        socket2.getClass();
        de2Var.getClass();
        piVar.getClass();
        this.b = id3Var;
        this.c = wo2Var;
        this.d = socket;
        this.e = socket2;
        this.f = mx0Var;
        this.g = de2Var;
        this.h = piVar;
        this.o = 1;
        this.p = new ArrayList();
        this.q = Long.MAX_VALUE;
    }

    public static void d(my1 my1Var, wo2 wo2Var, IOException iOException) {
        my1Var.getClass();
        wo2Var.getClass();
        iOException.getClass();
        if (wo2Var.b.type() != Proxy.Type.DIRECT) {
            m4 m4Var = wo2Var.a;
            m4Var.g.connectFailed(m4Var.h.i(), wo2Var.b.address(), iOException);
        }
        k71 k71Var = my1Var.A;
        synchronized (k71Var) {
            ((LinkedHashSet) k71Var.g).add(wo2Var);
        }
    }

    @Override // defpackage.uz0
    public final void a(wz0 wz0Var, pz2 pz2Var) {
        pz2Var.getClass();
        synchronized (this) {
            this.o = (pz2Var.a & 8) != 0 ? pz2Var.b[3] : Integer.MAX_VALUE;
        }
    }

    @Override // defpackage.zj0
    public final void b(ij2 ij2Var, IOException iOException) {
        synchronized (this) {
            try {
                if (!(iOException instanceof v93)) {
                    if (!(this.i != null) || (iOException instanceof b30)) {
                        this.j = true;
                        if (this.m == 0) {
                            if (iOException != null) {
                                d(ij2Var.f, this.c, iOException);
                            }
                            this.l++;
                        }
                    }
                } else if (((v93) iOException).f == nj0.l) {
                    int i = this.n + 1;
                    this.n = i;
                    if (i > 1) {
                        this.j = true;
                        this.l++;
                    }
                } else if (((v93) iOException).f != nj0.m || !ij2Var.v) {
                    this.j = true;
                    this.l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.uz0
    public final void c(d01 d01Var) {
        d01Var.d(nj0.l, null);
    }

    @Override // defpackage.zj0
    public final void cancel() {
        lv3.c(this.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(defpackage.m4 r9, java.util.List r10) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jj2.e(m4, java.util.List):boolean");
    }

    @Override // defpackage.zj0
    public final wo2 f() {
        return this.c;
    }

    public final boolean g(boolean z) {
        long j;
        TimeZone timeZone = lv3.a;
        long jNanoTime = System.nanoTime();
        if (this.d.isClosed() || this.e.isClosed() || this.e.isInputShutdown() || this.e.isOutputShutdown()) {
            return false;
        }
        wz0 wz0Var = this.i;
        if (wz0Var != null) {
            synchronized (wz0Var) {
                if (wz0Var.k) {
                    return false;
                }
                if (wz0Var.s < wz0Var.r) {
                    if (jNanoTime >= wz0Var.t) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j = jNanoTime - this.q;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        Socket socket = this.e;
        ej2 ej2Var = (ej2) this.h.h;
        socket.getClass();
        ej2Var.getClass();
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !ej2Var.b();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    @Override // defpackage.zj0
    public final void h() {
        synchronized (this) {
            this.j = true;
        }
    }

    public final void i() throws SocketException {
        this.q = System.nanoTime();
        de2 de2Var = this.g;
        if (de2Var == de2.HTTP_2 || de2Var == de2.H2_PRIOR_KNOWLEDGE) {
            this.e.setSoTimeout(0);
            f5 f5Var = f5.H;
            hn0 hn0Var = hn0.a;
            qk qkVar = new qk(this.b);
            pi piVar = this.h;
            String str = this.c.a.h.d;
            piVar.getClass();
            str.getClass();
            qkVar.b = piVar;
            qkVar.c = lv3.b + ' ' + str;
            qkVar.d = this;
            qkVar.e = hn0Var;
            wz0 wz0Var = new wz0(qkVar);
            this.i = wz0Var;
            pz2 pz2Var = wz0.E;
            this.o = (pz2Var.a & 8) != 0 ? pz2Var.b[3] : Integer.MAX_VALUE;
            e01 e01Var = wz0Var.B;
            synchronized (e01Var) {
                try {
                    if (e01Var.i) {
                        throw new IOException("closed");
                    }
                    Logger logger = e01.k;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(lv3.d(">> CONNECTION " + oz0.a.c(), new Object[0]));
                    }
                    e01Var.f.e(oz0.a);
                    e01Var.f.flush();
                } catch (Throwable th) {
                    throw th;
                }
            }
            e01 e01Var2 = wz0Var.B;
            pz2 pz2Var2 = wz0Var.v;
            e01Var2.getClass();
            pz2Var2.getClass();
            synchronized (e01Var2) {
                try {
                    if (e01Var2.i) {
                        throw new IOException("closed");
                    }
                    e01Var2.f(0, Integer.bitCount(pz2Var2.a) * 6, 4, 0);
                    for (int i = 0; i < 10; i++) {
                        boolean z = true;
                        if (((1 << i) & pz2Var2.a) == 0) {
                            z = false;
                        }
                        if (z) {
                            e01Var2.f.writeShort(i);
                            e01Var2.f.writeInt(pz2Var2.b[i]);
                        }
                    }
                    e01Var2.f.flush();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (wz0Var.v.a() != 65535) {
                wz0Var.B.m(0, r7 - 65535);
            }
            hd3.b(wz0Var.l.d(), wz0Var.h, wz0Var.C);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        wo2 wo2Var = this.c;
        sb.append(wo2Var.a.h.d);
        sb.append(':');
        sb.append(wo2Var.a.h.e);
        sb.append(", proxy=");
        sb.append(wo2Var.b);
        sb.append(" hostAddress=");
        sb.append(wo2Var.c);
        sb.append(" cipherSuite=");
        mx0 mx0Var = this.f;
        sb.append(mx0Var != null ? mx0Var.b : "none");
        sb.append(" protocol=");
        sb.append(this.g);
        sb.append('}');
        return sb.toString();
    }
}
