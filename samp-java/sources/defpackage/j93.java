package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class j93 extends x0 {
    public final AtomicReference a = new AtomicReference(null);

    @Override // defpackage.x0
    public final boolean a(w0 w0Var) {
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(s51.O);
        return true;
    }

    @Override // defpackage.x0
    public final p40[] b(w0 w0Var) {
        this.a.set(null);
        return r51.a;
    }
}
