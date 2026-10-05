package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class l30 implements nv2 {
    public final AtomicReference a;

    public l30(nv2 nv2Var) {
        this.a = new AtomicReference(nv2Var);
    }

    @Override // defpackage.nv2
    public final Iterator iterator() {
        nv2 nv2Var = (nv2) this.a.getAndSet(null);
        if (nv2Var != null) {
            return nv2Var.iterator();
        }
        c.q("This sequence can be consumed only once.");
        return null;
    }
}
