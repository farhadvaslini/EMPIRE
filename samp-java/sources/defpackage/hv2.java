package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public class hv2 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(hv2.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater d;
    public static final /* synthetic */ AtomicReferenceFieldUpdater e;
    public static final /* synthetic */ AtomicLongFieldUpdater f;
    public static final /* synthetic */ AtomicIntegerFieldUpdater g;
    public static final /* synthetic */ long h;
    public static final /* synthetic */ long i;
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final int a;
    public final ir b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    static {
        Unsafe unsafe = kr.a;
        h = unsafe.objectFieldOffset(hv2.class.getDeclaredField("head$volatile"));
        d = AtomicLongFieldUpdater.newUpdater(hv2.class, "deqIdx$volatile");
        e = AtomicReferenceFieldUpdater.newUpdater(hv2.class, Object.class, "tail$volatile");
        i = unsafe.objectFieldOffset(hv2.class.getDeclaredField("tail$volatile"));
        f = AtomicLongFieldUpdater.newUpdater(hv2.class, "enqIdx$volatile");
        g = AtomicIntegerFieldUpdater.newUpdater(hv2.class, "_availablePermits$volatile");
    }

    public hv2(int i2) {
        this.a = i2;
        if (i2 <= 0) {
            c.g(by1.e(i2, "Semaphore should have at least 1 permit, but had "));
            throw null;
        }
        if (i2 < 0) {
            c.g(by1.e(i2, "The number of acquired permits should be in 0.."));
            throw null;
        }
        kv2 kv2Var = new kv2(0L, null, 2);
        this.head$volatile = kv2Var;
        this.tail$volatile = kv2Var;
        this._availablePermits$volatile = i2;
        this.b = new ir(12, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r5.y(r3, r4.b);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.q40 r5) {
        /*
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.hv2.g
            int r1 = r0.getAndDecrement(r4)
            int r2 = r4.a
            if (r1 > r2) goto L0
            dm3 r3 = defpackage.dm3.a
            if (r1 <= 0) goto Lf
            goto L3e
        Lf:
            p40 r5 = defpackage.vr.I(r5)
            jr r5 = defpackage.lr.H(r5)
            boolean r1 = r4.b(r5)     // Catch: java.lang.Throwable -> L3f
            if (r1 != 0) goto L31
        L1d:
            int r1 = r0.getAndDecrement(r4)     // Catch: java.lang.Throwable -> L3f
            if (r1 > r2) goto L1d
            if (r1 <= 0) goto L2b
            ir r4 = r4.b     // Catch: java.lang.Throwable -> L3f
            r5.y(r3, r4)     // Catch: java.lang.Throwable -> L3f
            goto L31
        L2b:
            boolean r1 = r4.b(r5)     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L1d
        L31:
            java.lang.Object r4 = r5.q()
            y50 r5 = defpackage.y50.f
            if (r4 != r5) goto L3a
            goto L3b
        L3a:
            r4 = r3
        L3b:
            if (r4 != r5) goto L3e
            return r4
        L3e:
            return r3
        L3f:
            r4 = move-exception
            r5.E()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv2.a(q40):java.lang.Object");
    }

    public final boolean b(or3 or3Var) {
        Object objA;
        Unsafe unsafe;
        hv2 hv2Var = this;
        e.getClass();
        Unsafe unsafe2 = kr.a;
        long j = i;
        kv2 kv2Var = (kv2) unsafe2.getObjectVolatile(hv2Var, j);
        long andIncrement = f.getAndIncrement(hv2Var);
        fv2 fv2Var = fv2.m;
        long j2 = andIncrement / ((long) jv2.f);
        loop0: while (true) {
            objA = gv3.A(kv2Var, j2, fv2Var);
            if (g12.V(objA)) {
                break;
            }
            kt2 kt2VarO = g12.O(objA);
            while (true) {
                kt2 kt2Var = (kt2) kr.a.getObjectVolatile(hv2Var, j);
                if (kt2Var.e >= kt2VarO.e) {
                    hv2Var = this;
                    break loop0;
                }
                if (!kt2VarO.n()) {
                    break;
                }
                do {
                    unsafe = kr.a;
                    hv2Var = this;
                    if (unsafe.compareAndSwapObject(hv2Var, i, kt2Var, kt2VarO)) {
                        if (kt2Var.j()) {
                            kt2Var.h();
                        }
                    }
                } while (unsafe.getObjectVolatile(hv2Var, j) == kt2Var);
                if (kt2VarO.j()) {
                    kt2VarO.h();
                }
            }
            hv2Var = this;
        }
        kv2 kv2Var2 = (kv2) g12.O(objA);
        AtomicReferenceArray atomicReferenceArray = kv2Var2.g;
        int i2 = (int) (andIncrement % ((long) jv2.f));
        while (!atomicReferenceArray.compareAndSet(i2, null, or3Var)) {
            if (atomicReferenceArray.get(i2) != null) {
                ai0 ai0Var = jv2.b;
                ai0 ai0Var2 = jv2.c;
                while (!atomicReferenceArray.compareAndSet(i2, ai0Var, ai0Var2)) {
                    if (atomicReferenceArray.get(i2) != ai0Var) {
                        return false;
                    }
                }
                ((hr) or3Var).y(dm3.a, hv2Var.b);
                return true;
            }
        }
        or3Var.a(kv2Var2, i2);
        return true;
    }

    public final void c() {
        int i2;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i3 = this.a;
            if (andIncrement >= i3) {
                do {
                    i2 = atomicIntegerFieldUpdater.get(this);
                    if (i2 <= i3) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, i3));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i3).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!d());
    }

    public final boolean d() {
        Object objA;
        Unsafe unsafe;
        c.getClass();
        Unsafe unsafe2 = kr.a;
        long j = h;
        kv2 kv2Var = (kv2) unsafe2.getObjectVolatile(this, j);
        long andIncrement = d.getAndIncrement(this);
        long j2 = andIncrement / ((long) jv2.f);
        gv2 gv2Var = gv2.m;
        loop0: while (true) {
            objA = gv3.A(kv2Var, j2, gv2Var);
            if (g12.V(objA)) {
                break;
            }
            kt2 kt2VarO = g12.O(objA);
            while (true) {
                kt2 kt2Var = (kt2) kr.a.getObjectVolatile(this, j);
                if (kt2Var.e >= kt2VarO.e) {
                    break loop0;
                }
                if (!kt2VarO.n()) {
                    break;
                }
                do {
                    unsafe = kr.a;
                    if (unsafe.compareAndSwapObject(this, h, kt2Var, kt2VarO)) {
                        if (kt2Var.j()) {
                            kt2Var.h();
                        }
                    }
                } while (unsafe.getObjectVolatile(this, j) == kt2Var);
                if (kt2VarO.j()) {
                    kt2VarO.h();
                }
            }
        }
        kv2 kv2Var2 = (kv2) g12.O(objA);
        AtomicReferenceArray atomicReferenceArray = kv2Var2.g;
        kv2Var2.a();
        boolean z = false;
        if (kv2Var2.e <= j2) {
            int i2 = (int) (andIncrement % ((long) jv2.f));
            Object andSet = atomicReferenceArray.getAndSet(i2, jv2.b);
            if (andSet == null) {
                int i3 = jv2.a;
                for (int i4 = 0; i4 < i3; i4++) {
                    if (atomicReferenceArray.get(i2) == jv2.c) {
                        return true;
                    }
                }
                ai0 ai0Var = jv2.b;
                ai0 ai0Var2 = jv2.d;
                while (true) {
                    if (atomicReferenceArray.compareAndSet(i2, ai0Var, ai0Var2)) {
                        z = true;
                        break;
                    }
                    if (atomicReferenceArray.get(i2) != ai0Var) {
                        break;
                    }
                }
                return !z;
            }
            if (andSet != jv2.e) {
                if (!(andSet instanceof hr)) {
                    c.h(andSet, "unexpected: ");
                    return false;
                }
                hr hrVar = (hr) andSet;
                ai0 ai0VarB = hrVar.B(dm3.a, this.b);
                if (ai0VarB != null) {
                    hrVar.D(ai0VarB);
                    return true;
                }
            }
        }
        return false;
    }
}
