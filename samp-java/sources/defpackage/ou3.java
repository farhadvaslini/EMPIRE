package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ou3 {
    public final AtomicReferenceArray a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(ou3.class, Object.class, "lastScheduledTask$volatile");
    public static final /* synthetic */ long f = kr.a.objectFieldOffset(ou3.class.getDeclaredField("lastScheduledTask$volatile"));
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(ou3.class, "producerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(ou3.class, "consumerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(ou3.class, "blockingTasksInBuffer$volatile");

    public final fd3 a(fd3 fd3Var, boolean z) {
        if (z) {
            return b(fd3Var);
        }
        b.getClass();
        fd3 fd3Var2 = (fd3) kr.a.getAndSetObject(this, f, fd3Var);
        if (fd3Var2 == null) {
            return null;
        }
        return b(fd3Var2);
    }

    public final fd3 b(fd3 fd3Var) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c;
        if (atomicIntegerFieldUpdater.get(this) - d.get(this) == 127) {
            return fd3Var;
        }
        if (fd3Var.g) {
            e.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.a;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, fd3Var);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final int c() {
        b.getClass();
        Object objectVolatile = kr.a.getObjectVolatile(this, f);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = c;
        return objectVolatile != null ? (atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this)) + 1 : atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this);
    }

    public final void d(ew0 ew0Var) {
        b.getClass();
        fd3 fd3Var = (fd3) kr.a.getAndSetObject(this, f, (Object) null);
        if (fd3Var != null) {
            ew0Var.a(fd3Var);
        }
        while (true) {
            fd3 fd3VarF = f();
            if (fd3VarF == null) {
                return;
            } else {
                ew0Var.a(fd3VarF);
            }
        }
    }

    public final fd3 e() {
        b.getClass();
        fd3 fd3Var = (fd3) kr.a.getAndSetObject(this, f, (Object) null);
        return fd3Var == null ? f() : fd3Var;
    }

    public final fd3 f() {
        fd3 fd3Var;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - c.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (fd3Var = (fd3) this.a.getAndSet(i2, null)) != null) {
                if (fd3Var.g) {
                    e.decrementAndGet(this);
                }
                return fd3Var;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        r9 = defpackage.ou3.d.get(r4);
        r1 = defpackage.ou3.c.get(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (r9 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        if (defpackage.ou3.e.get(r4) != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        r1 = r1 - 1;
        r2 = r4.h(r1, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
        if (r2 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        r4 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.fd3 g() {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.ou3.b
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.kr.a
            long r1 = defpackage.ou3.f
            java.lang.Object r0 = r0.getObjectVolatile(r9, r1)
            r7 = r0
            fd3 r7 = (defpackage.fd3) r7
            r0 = 1
            if (r7 != 0) goto L15
        L13:
            r4 = r9
            goto L30
        L15:
            boolean r3 = r7.g
            if (r3 != r0) goto L13
        L19:
            sun.misc.Unsafe r3 = defpackage.kr.a
            long r5 = defpackage.ou3.f
            r8 = 0
            r4 = r9
            boolean r9 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r9 == 0) goto L26
            return r7
        L26:
            java.lang.Object r9 = r3.getObjectVolatile(r4, r1)
            if (r9 == r7) goto L2e
            r9 = r4
            goto L0
        L2e:
            r9 = r4
            goto L19
        L30:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r9 = defpackage.ou3.d
            int r9 = r9.get(r4)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.ou3.c
            int r1 = r1.get(r4)
        L3c:
            if (r9 == r1) goto L50
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = defpackage.ou3.e
            int r2 = r2.get(r4)
            if (r2 != 0) goto L47
            goto L50
        L47:
            int r1 = r1 + (-1)
            fd3 r2 = r4.h(r1, r0)
            if (r2 == 0) goto L3c
            return r2
        L50:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ou3.g():fd3");
    }

    public final fd3 h(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.a;
        fd3 fd3Var = (fd3) atomicReferenceArray.get(i2);
        if (fd3Var != null && fd3Var.g == z) {
            while (!atomicReferenceArray.compareAndSet(i2, fd3Var, null)) {
                if (atomicReferenceArray.get(i2) != fd3Var) {
                }
            }
            if (z) {
                e.decrementAndGet(this);
            }
            return fd3Var;
        }
        return null;
    }

    public final long i(int i, qk2 qk2Var) {
        ou3 ou3Var;
        while (true) {
            b.getClass();
            Unsafe unsafe = kr.a;
            long j = f;
            fd3 fd3Var = (fd3) unsafe.getObjectVolatile(this, j);
            if (fd3Var == null) {
                return -2L;
            }
            if (((fd3Var.g ? 1 : 2) & i) == 0) {
                return -2L;
            }
            kd3.f.getClass();
            long jNanoTime = System.nanoTime() - fd3Var.f;
            long j2 = kd3.b;
            if (jNanoTime < j2) {
                return j2 - jNanoTime;
            }
            while (true) {
                Unsafe unsafe2 = kr.a;
                ou3Var = this;
                if (unsafe2.compareAndSwapObject(ou3Var, f, fd3Var, (Object) null)) {
                    qk2Var.f = fd3Var;
                    return -1L;
                }
                if (unsafe2.getObjectVolatile(ou3Var, j) != fd3Var) {
                    break;
                }
                this = ou3Var;
            }
            this = ou3Var;
        }
    }
}
