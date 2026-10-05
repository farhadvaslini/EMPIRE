package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class yb0 extends fd3 {
    public int h;

    public yb0(int i) {
        super(0L, false);
        this.h = i;
    }

    public abstract p40 c();

    public Throwable e(Object obj) {
        jz jzVar = obj instanceof jz ? (jz) obj : null;
        if (jzVar != null) {
            return jzVar.a;
        }
        return null;
    }

    public final void g(Throwable th) {
        lr.K(c().i(), new b60("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object h();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            p40 p40VarC = c();
            p40VarC.getClass();
            wb0 wb0Var = (wb0) p40VarC;
            q40 q40Var = wb0Var.j;
            Object obj = wb0Var.l;
            o50 o50VarI = q40Var.i();
            Object objF = cl3.F(o50VarI, obj);
            j61 j61Var = null;
            xl3 xl3VarP = objF != cl3.v0 ? uq.P(q40Var, o50VarI, objF) : null;
            try {
                o50 o50VarI2 = q40Var.i();
                Object objH = h();
                Throwable thE = e(objH);
                if (thE == null) {
                    int i = this.h;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                    if (z) {
                        j61Var = (j61) o50VarI2.m(f5.b0);
                    }
                }
                if (j61Var != null && !j61Var.b()) {
                    CancellationException cancellationExceptionO = j61Var.o();
                    b(cancellationExceptionO);
                    q40Var.t(y02.l(cancellationExceptionO));
                } else if (thE != null) {
                    q40Var.t(new qn2(thE));
                } else {
                    q40Var.t(f(objH));
                }
                if (xl3VarP == null || xl3VarP.t0()) {
                    cl3.A(o50VarI, objF);
                }
            } catch (Throwable th) {
                if (xl3VarP == null || xl3VarP.t0()) {
                    cl3.A(o50VarI, objF);
                }
                throw th;
            }
        } catch (vb0 e) {
            lr.K(c().i(), e.f);
        } catch (Throwable th2) {
            g(th2);
        }
    }

    public void b(CancellationException cancellationException) {
    }

    public Object f(Object obj) {
        return obj;
    }
}
