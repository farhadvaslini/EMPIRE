package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class mt2 {
    public static final jt2 a = new jt2(new byte[0], 0, false, 0);
    public static final int b;
    public static final AtomicReference[] c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final void a(jt2 jt2Var) {
        jt2Var.getClass();
        if (jt2Var.f != null || jt2Var.g != null) {
            c.p("Failed requirement.");
            return;
        }
        if (jt2Var.d) {
            return;
        }
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        jt2 jt2Var2 = a;
        jt2 jt2Var3 = (jt2) atomicReference.getAndSet(jt2Var2);
        if (jt2Var3 == jt2Var2) {
            return;
        }
        int i = jt2Var3 != null ? jt2Var3.c : 0;
        if (i >= 65536) {
            atomicReference.set(jt2Var3);
            return;
        }
        jt2Var.f = jt2Var3;
        jt2Var.b = 0;
        jt2Var.c = i + 8192;
        atomicReference.set(jt2Var);
    }

    public static final jt2 b() {
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        jt2 jt2Var = a;
        jt2 jt2Var2 = (jt2) atomicReference.getAndSet(jt2Var);
        if (jt2Var2 == jt2Var) {
            return new jt2();
        }
        if (jt2Var2 == null) {
            atomicReference.set(null);
            return new jt2();
        }
        atomicReference.set(jt2Var2.f);
        jt2Var2.f = null;
        jt2Var2.c = 0;
        return jt2Var2;
    }
}
