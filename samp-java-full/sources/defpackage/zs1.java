package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class zs1 {
    public final AtomicReference a = new AtomicReference(null);
    public final dt1 b = new dt1();

    public static final void a(zs1 zs1Var, ws1 ws1Var) {
        AtomicReference atomicReference = zs1Var.a;
        while (true) {
            ws1 ws1Var2 = (ws1) atomicReference.get();
            if (ws1Var2 != null && ws1Var.a.compareTo(ws1Var2.a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            while (!atomicReference.compareAndSet(ws1Var2, ws1Var)) {
                if (atomicReference.get() != ws1Var2) {
                    break;
                }
            }
            if (ws1Var2 != null) {
                ws1Var2.b.c(new um0(0, "Mutation interrupted"));
                return;
            }
            return;
        }
    }
}
