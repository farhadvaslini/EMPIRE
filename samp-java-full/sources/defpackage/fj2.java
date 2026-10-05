package defpackage;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class fj2 implements Runnable {
    public final zq f;
    public volatile AtomicInteger g = new AtomicInteger(0);
    public final /* synthetic */ ij2 h;

    public fj2(ij2 ij2Var, zq zqVar) {
        this.h = ij2Var;
        this.f = zqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pl plVar;
        String strConcat = "OkHttp ".concat(this.h.g.a.g());
        ij2 ij2Var = this.h;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(strConcat);
        try {
            ij2Var.j.h();
            boolean z = false;
            try {
                try {
                    try {
                        this.f.a(ij2Var, ij2Var.h());
                        plVar = ij2Var.f.a;
                    } catch (IOException e) {
                        e = e;
                        z = true;
                        if (z) {
                            m62 m62Var = m62.a;
                            m62.a.j("Callback failure for ".concat(ij2.a(ij2Var)), 4, e);
                        } else {
                            this.f.b(ij2Var, e);
                        }
                        plVar = ij2Var.f.a;
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        ij2Var.d();
                        if (!z) {
                            IOException iOException = new IOException("canceled due to " + th);
                            iOException.initCause(th);
                            this.f.b(ij2Var, iOException);
                        }
                        if (!(th instanceof InterruptedException)) {
                            throw th;
                        }
                        Thread.currentThread().interrupt();
                        plVar = ij2Var.f.a;
                    }
                } catch (Throwable th2) {
                    pl plVar2 = ij2Var.f.a;
                    plVar2.getClass();
                    pl.B(plVar2, null, null, this, 3);
                    throw th2;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th3) {
                th = th3;
            }
            plVar.getClass();
            pl.B(plVar, null, null, this, 3);
        } finally {
            threadCurrentThread.setName(name);
        }
    }
}
