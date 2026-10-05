package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class op2 implements lc1, Serializable {
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(op2.class, Object.class, "g");
    public volatile cs0 f;
    public volatile Object g;

    @Override // defpackage.lc1
    public final Object getValue() {
        Object obj = this.g;
        m22 m22Var = m22.z;
        if (obj != m22Var) {
            return obj;
        }
        cs0 cs0Var = this.f;
        if (cs0Var != null) {
            Object objA = cs0Var.a();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, m22Var, objA)) {
                if (atomicReferenceFieldUpdater.get(this) != m22Var) {
                }
            }
            this.f = null;
            return objA;
        }
        return this.g;
    }

    public final String toString() {
        return this.g != m22.z ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
