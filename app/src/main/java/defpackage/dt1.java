package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
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
    */
    public final Object f(p40 p40Var) {
        boolean zG = g();
        dm3 dm3Var = dm3.a;
        if (!zG) {
            jr jrVarH = lr.H(vr.I(p40Var));
            try {
                ct1 ct1Var = new ct1(this, jrVarH);
                while (true) {
                    int andDecrement = hv2.g.getAndDecrement(this);
                    if (andDecrement <= this.a) {
                        if (andDecrement > 0) {
                            break;
                        }
                        if (b(ct1Var)) {
                            break;
                        }
                    }
                }
                Object objQ = jrVarH.q();
                y50 y50Var = y50.f;
                if (objQ != y50Var) {
                    objQ = dm3Var;
                }
                if (objQ == y50Var) {
                    return objQ;
                }
            } catch (Throwable th) {
                jrVarH.E();
                throw th;
            }
        }
        return dm3Var;
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
