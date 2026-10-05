package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class yf1 extends q50 implements ga0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater m = AtomicIntegerFieldUpdater.newUpdater(yf1.class, "runningWorkers$volatile");
    public final /* synthetic */ ga0 h;
    public final q50 i;
    public final int j;
    public final vj1 k;
    public final Object l;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public yf1(q50 q50Var, int i) {
        ga0 ga0Var = q50Var instanceof ga0 ? (ga0) q50Var : null;
        this.h = ga0Var == null ? q80.a : ga0Var;
        this.i = q50Var;
        this.j = i;
        this.k = new vj1();
        this.l = new Object();
    }

    @Override // defpackage.q50
    public final void B(o50 o50Var, Runnable runnable) {
        Runnable runnableF;
        this.k.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = m;
        if (atomicIntegerFieldUpdater.get(this) >= this.j || !G() || (runnableF = F()) == null) {
            return;
        }
        try {
            s51.B(this.i, this, new x2(5, this, runnableF));
        } catch (Throwable th) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th;
        }
    }

    @Override // defpackage.q50
    public final void C(o50 o50Var, Runnable runnable) {
        Runnable runnableF;
        this.k.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = m;
        if (atomicIntegerFieldUpdater.get(this) >= this.j || !G() || (runnableF = F()) == null) {
            return;
        }
        try {
            this.i.C(this, new x2(5, this, runnableF));
        } catch (Throwable th) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th;
        }
    }

    public final Runnable F() {
        while (true) {
            Runnable runnable = (Runnable) this.k.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.l) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = m;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.k.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean G() {
        synchronized (this.l) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = m;
            if (atomicIntegerFieldUpdater.get(this) >= this.j) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // defpackage.ga0
    public final kc0 h(long j, ei3 ei3Var, o50 o50Var) {
        return this.h.h(j, ei3Var, o50Var);
    }

    @Override // defpackage.ga0
    public final void i(long j, jr jrVar) {
        this.h.i(j, jrVar);
    }

    @Override // defpackage.q50
    public final String toString() {
        return this.i + ".limitedParallelism(" + this.j + ')';
    }
}
