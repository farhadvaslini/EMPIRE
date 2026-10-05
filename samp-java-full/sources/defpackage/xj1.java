package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class xj1 {
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(xj1.class, Object.class, "_next$volatile");
    public static final /* synthetic */ long h = kr.a.objectFieldOffset(xj1.class.getDeclaredField("_next$volatile"));
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(xj1.class, "_state$volatile");
    public static final ai0 g = new ai0(1, "REMOVE_FROZEN");

    public xj1(int i, boolean z) {
        this.a = i;
        this.b = z;
        int i2 = i - 1;
        this.c = i2;
        this.d = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            c.q("Check failed.");
            throw null;
        }
        if ((i & i2) == 0) {
            return;
        }
        c.q("Check failed.");
        throw null;
    }

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.c;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = this.b;
            AtomicReferenceArray atomicReferenceArray = this.d;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                xj1 xj1Var = this;
                if (f.compareAndSet(xj1Var, j, ((-1152921503533105153L) & j) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    xj1 xj1VarD = xj1Var;
                    while ((atomicLongFieldUpdater.get(xj1VarD) & 1152921504606846976L) != 0) {
                        xj1VarD = xj1VarD.d();
                        AtomicReferenceArray atomicReferenceArray2 = xj1VarD.d;
                        int i4 = xj1VarD.c & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof wj1) && ((wj1) obj2).a == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            xj1VarD = null;
                        }
                        if (xj1VarD == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
                this = xj1Var;
            } else {
                int i5 = this.a;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final xj1 b(long j) {
        xj1 xj1Var;
        while (true) {
            e.getClass();
            Unsafe unsafe = kr.a;
            long j2 = h;
            xj1 xj1Var2 = (xj1) unsafe.getObjectVolatile(this, j2);
            if (xj1Var2 != null) {
                return xj1Var2;
            }
            xj1 xj1Var3 = new xj1(this.a * 2, this.b);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.c;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object wj1Var = this.d.get(i4);
                if (wj1Var == null) {
                    wj1Var = new wj1(i);
                }
                xj1Var3.d.set(xj1Var3.c & i, wj1Var);
                i++;
            }
            f.set(xj1Var3, (-1152921504606846977L) & j);
            while (true) {
                Unsafe unsafe2 = kr.a;
                xj1Var = this;
                if (!unsafe2.compareAndSwapObject(xj1Var, h, (Object) null, xj1Var3) && unsafe2.getObjectVolatile(xj1Var, j2) == null) {
                    this = xj1Var;
                }
            }
            this = xj1Var;
        }
    }

    public final boolean c() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
            xj1 xj1Var = this;
            if (atomicLongFieldUpdater.compareAndSet(xj1Var, j, 2305843009213693952L | j)) {
                return true;
            }
            this = xj1Var;
        }
    }

    public final xj1 d() {
        long j;
        xj1 xj1Var;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                xj1Var = this;
                break;
            }
            long j2 = 1152921504606846976L | j;
            xj1Var = this;
            if (atomicLongFieldUpdater.compareAndSet(xj1Var, j, j2)) {
                j = j2;
                break;
            }
            this = xj1Var;
        }
        return xj1Var.b(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e() {
        xj1 xj1VarD = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(xj1VarD);
            if ((j & 1152921504606846976L) != 0) {
                return g;
            }
            int i = (int) (j & 1073741823);
            int i2 = xj1VarD.c;
            int i3 = i & i2;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) == i3) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = xj1VarD.d;
            Object obj = atomicReferenceArray.get(i3);
            boolean z = xj1VarD.b;
            if (obj == null) {
                if (z) {
                    break;
                }
            } else {
                if (obj instanceof wj1) {
                    break;
                }
                long j2 = (i + 1) & 1073741823;
                if (f.compareAndSet(xj1VarD, j, (j & (-1073741824)) | j2)) {
                    atomicReferenceArray.set(i3, null);
                    return obj;
                }
                xj1VarD = this;
                if (z) {
                    while (true) {
                        long j3 = atomicLongFieldUpdater.get(xj1VarD);
                        int i4 = (int) (j3 & 1073741823);
                        if ((j3 & 1152921504606846976L) != 0) {
                            xj1VarD = xj1VarD.d();
                        } else {
                            xj1 xj1Var = xj1VarD;
                            if (f.compareAndSet(xj1Var, j3, (j3 & (-1073741824)) | j2)) {
                                xj1Var.d.set(i4 & xj1Var.c, null);
                                xj1VarD = null;
                            } else {
                                xj1VarD = xj1Var;
                            }
                        }
                        if (xj1VarD == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
