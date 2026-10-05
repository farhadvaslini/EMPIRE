package defpackage;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class an extends x {
    public final Thread k;
    public final qj0 l;

    public an(o50 o50Var, Thread thread, qj0 qj0Var) {
        super(o50Var, true);
        this.k = thread;
        this.l = qj0Var;
    }

    @Override // defpackage.q61
    public final void w(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.k;
        if (s51.n(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
