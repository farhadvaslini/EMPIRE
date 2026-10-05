package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class o0 extends r51 {
    public final AtomicReferenceFieldUpdater P1;
    public final AtomicReferenceFieldUpdater Q1;
    public final AtomicReferenceFieldUpdater R1;
    public final AtomicReferenceFieldUpdater S1;
    public final AtomicReferenceFieldUpdater T1;

    public o0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.P1 = atomicReferenceFieldUpdater;
        this.Q1 = atomicReferenceFieldUpdater2;
        this.R1 = atomicReferenceFieldUpdater3;
        this.S1 = atomicReferenceFieldUpdater4;
        this.T1 = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.r51
    public final boolean m(r0 r0Var, n0 n0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.S1;
            if (atomicReferenceFieldUpdater.compareAndSet(r0Var, n0Var, n0.b)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(r0Var) == n0Var);
        return false;
    }

    @Override // defpackage.r51
    public final boolean n(r0 r0Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.T1;
            if (atomicReferenceFieldUpdater.compareAndSet(r0Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(r0Var) == obj);
        return false;
    }

    @Override // defpackage.r51
    public final boolean o(r0 r0Var, q0 q0Var, q0 q0Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.R1;
            if (atomicReferenceFieldUpdater.compareAndSet(r0Var, q0Var, q0Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(r0Var) == q0Var);
        return false;
    }

    @Override // defpackage.r51
    public final void y(q0 q0Var, q0 q0Var2) {
        this.Q1.lazySet(q0Var, q0Var2);
    }

    @Override // defpackage.r51
    public final void z(q0 q0Var, Thread thread) {
        this.P1.lazySet(q0Var, thread);
    }
}
