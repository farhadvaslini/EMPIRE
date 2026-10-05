package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class dt1 extends hv2 implements bt1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(dt1.class, Object.class, "owner$volatile");
    public static final /* synthetic */ long k = kr.a.objectFieldOffset(dt1.class.getDeclaredField("owner$volatile"));
    private volatile /* synthetic */ Object owner$volatile;

    public dt1() {
        super(1);
        this.owner$volatile = n92.O;
    }

    public final boolean e() {
        return Math.max(hv2.g.get(this), 0) == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        r5 = defpackage.dt1.j;
        r2 = r0.g;
        r5.set(r2, null);
        r5 = r0.f;
        r5.G(r1, r5.h, new defpackage.ir(0, new defpackage.xc1(9, r2, r0)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.p40 r6) {
        /*
            r5 = this;
            boolean r0 = r5.g()
            dm3 r1 = defpackage.dm3.a
            if (r0 == 0) goto L9
            goto L52
        L9:
            p40 r6 = defpackage.vr.I(r6)
            jr r6 = defpackage.lr.H(r6)
            ct1 r0 = new ct1     // Catch: java.lang.Throwable -> L53
            r0.<init>(r5, r6)     // Catch: java.lang.Throwable -> L53
        L16:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = defpackage.hv2.g     // Catch: java.lang.Throwable -> L53
            int r2 = r2.getAndDecrement(r5)     // Catch: java.lang.Throwable -> L53
            int r3 = r5.a     // Catch: java.lang.Throwable -> L53
            if (r2 > r3) goto L16
            if (r2 <= 0) goto L3f
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = defpackage.dt1.j     // Catch: java.lang.Throwable -> L53
            dt1 r2 = r0.g     // Catch: java.lang.Throwable -> L53
            r3 = 0
            r5.set(r2, r3)     // Catch: java.lang.Throwable -> L53
            jr r5 = r0.f     // Catch: java.lang.Throwable -> L53
            xc1 r3 = new xc1     // Catch: java.lang.Throwable -> L53
            r4 = 9
            r3.<init>(r4, r2, r0)     // Catch: java.lang.Throwable -> L53
            int r0 = r5.h     // Catch: java.lang.Throwable -> L53
            ir r2 = new ir     // Catch: java.lang.Throwable -> L53
            r4 = 0
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L53
            r5.G(r1, r0, r2)     // Catch: java.lang.Throwable -> L53
            goto L45
        L3f:
            boolean r2 = r5.b(r0)     // Catch: java.lang.Throwable -> L53
            if (r2 == 0) goto L16
        L45:
            java.lang.Object r5 = r6.q()
            y50 r6 = defpackage.y50.f
            if (r5 != r6) goto L4e
            goto L4f
        L4e:
            r5 = r1
        L4f:
            if (r5 != r6) goto L52
            return r5
        L52:
            return r1
        L53:
            r5 = move-exception
            r6.E()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dt1.f(p40):java.lang.Object");
    }

    public final boolean g() {
        int iH = h();
        if (iH == 0) {
            return true;
        }
        if (iH == 1) {
            return false;
        }
        if (iH != 2) {
            c.q("unexpected");
            return false;
        }
        qn1.e("This mutex is already locked by the specified owner: null");
        return false;
    }

    public final int h() {
        int i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = hv2.g;
            int i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = this.a;
            if (i2 > i3) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i > i3) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i3));
            } else {
                if (i2 <= 0) {
                    return 1;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    j.getClass();
                    kr.a.putObjectVolatile(this, k, (Object) null);
                    return 0;
                }
            }
        }
    }

    public final void i(Object obj) {
        while (this.e()) {
            j.getClass();
            Unsafe unsafe = kr.a;
            long j2 = k;
            Object objectVolatile = unsafe.getObjectVolatile(this, j2);
            ai0 ai0Var = n92.O;
            if (objectVolatile != ai0Var) {
                if (objectVolatile != obj && obj != null) {
                    qn1.k("This mutex is locked by ", objectVolatile, ", but ", obj, " is expected");
                    return;
                }
                while (true) {
                    Unsafe unsafe2 = kr.a;
                    dt1 dt1Var = this;
                    if (unsafe2.compareAndSwapObject(dt1Var, k, objectVolatile, ai0Var)) {
                        dt1Var.c();
                        return;
                    } else {
                        if (unsafe2.getObjectVolatile(dt1Var, j2) != objectVolatile) {
                            this = dt1Var;
                            break;
                        }
                        this = dt1Var;
                    }
                }
            }
        }
        c.q("This mutex is not locked");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(f80.D(this));
        sb.append("[isLocked=");
        sb.append(e());
        sb.append(",owner=");
        j.getClass();
        sb.append(kr.a.getObjectVolatile(this, k));
        sb.append(']');
        return sb.toString();
    }
}
