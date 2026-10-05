package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class np2 implements p40, z50 {
    public static final AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(np2.class, Object.class, "result");
    public final p40 f;
    private volatile Object result;

    public np2(p40 p40Var) {
        y50 y50Var = y50.f;
        this.f = p40Var;
        this.result = y50Var;
    }

    @Override // defpackage.z50
    public final z50 d() {
        p40 p40Var = this.f;
        if (p40Var instanceof z50) {
            return (z50) p40Var;
        }
        return null;
    }

    @Override // defpackage.p40
    public final o50 i() {
        return this.f.i();
    }

    @Override // defpackage.p40
    public final void t(Object obj) {
        while (true) {
            Object obj2 = this.result;
            y50 y50Var = y50.g;
            if (obj2 == y50Var) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, y50Var, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != y50Var) {
                        break;
                    }
                }
                return;
            }
            y50 y50Var2 = y50.f;
            if (obj2 != y50Var2) {
                c.q("Already resumed");
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = g;
            y50 y50Var3 = y50.h;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, y50Var2, y50Var3)) {
                if (atomicReferenceFieldUpdater2.get(this) != y50Var2) {
                    break;
                }
            }
            this.f.t(obj);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f;
    }
}
