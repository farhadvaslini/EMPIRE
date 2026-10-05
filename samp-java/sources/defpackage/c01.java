package defpackage;

import java.io.IOException;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class c01 extends yj {
    public final /* synthetic */ d01 n;

    public c01(d01 d01Var) {
        this.n = d01Var;
    }

    @Override // defpackage.yj
    public final IOException j(IOException iOException) {
        return new SocketTimeoutException("timeout");
    }

    @Override // defpackage.yj
    public final void k() {
        this.n.f(nj0.m);
        wz0 wz0Var = this.n.g;
        synchronized (wz0Var) {
            long j = wz0Var.s;
            long j2 = wz0Var.r;
            if (j < j2) {
                return;
            }
            wz0Var.r = j2 + 1;
            wz0Var.t = System.nanoTime() + 1000000000;
            hd3.b(wz0Var.m, nc2.j(new StringBuilder(), wz0Var.h, " ping"), new ja(16, wz0Var));
        }
    }

    public final void l() {
        if (i()) {
            throw j(null);
        }
    }
}
