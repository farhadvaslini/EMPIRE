package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class vj0 extends qj0 implements ga0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater l = AtomicReferenceFieldUpdater.newUpdater(vj0.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater m;
    public static final /* synthetic */ AtomicIntegerFieldUpdater n;
    public static final /* synthetic */ long o;
    public static final /* synthetic */ long p;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    static {
        Unsafe unsafe = kr.a;
        p = unsafe.objectFieldOffset(vj0.class.getDeclaredField("_queue$volatile"));
        m = AtomicReferenceFieldUpdater.newUpdater(vj0.class, Object.class, "_delayed$volatile");
        o = unsafe.objectFieldOffset(vj0.class.getDeclaredField("_delayed$volatile"));
        n = AtomicIntegerFieldUpdater.newUpdater(vj0.class, "_isCompleted$volatile");
    }

    @Override // defpackage.q50
    public final void B(o50 o50Var, Runnable runnable) {
        M(runnable);
    }

    @Override // defpackage.qj0
    public final long I() {
        if (J()) {
            return 0L;
        }
        N();
        Runnable runnableL = L();
        if (runnableL == null) {
            return P();
        }
        runnableL.run();
        return 0L;
    }

    public final void K() {
        vj0 vj0Var;
        Unsafe unsafe;
        ai0 ai0Var = r51.C1;
        while (true) {
            l.getClass();
            Unsafe unsafe2 = kr.a;
            long j = p;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe3 = kr.a;
                    vj0Var = this;
                    if (unsafe3.compareAndSwapObject(vj0Var, p, (Object) null, ai0Var)) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(vj0Var, j) != null) {
                        break;
                    } else {
                        this = vj0Var;
                    }
                }
            } else {
                vj0Var = this;
                if (objectVolatile instanceof xj1) {
                    ((xj1) objectVolatile).c();
                    return;
                }
                if (objectVolatile == ai0Var) {
                    return;
                }
                xj1 xj1Var = new xj1(8, true);
                xj1Var.a((Runnable) objectVolatile);
                do {
                    unsafe = kr.a;
                    if (unsafe.compareAndSwapObject(vj0Var, p, objectVolatile, xj1Var)) {
                        return;
                    }
                } while (unsafe.getObjectVolatile(vj0Var, j) == objectVolatile);
            }
            this = vj0Var;
        }
    }

    public final Runnable L() {
        vj0 vj0Var;
        Unsafe unsafe;
        while (true) {
            l.getClass();
            Unsafe unsafe2 = kr.a;
            long j = p;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                return null;
            }
            if (objectVolatile instanceof xj1) {
                xj1 xj1Var = (xj1) objectVolatile;
                Object objE = xj1Var.e();
                if (objE != xj1.g) {
                    return (Runnable) objE;
                }
                xj1 xj1VarD = xj1Var.d();
                while (true) {
                    Unsafe unsafe3 = kr.a;
                    vj0Var = this;
                    if (!unsafe3.compareAndSwapObject(vj0Var, p, objectVolatile, xj1VarD) && unsafe3.getObjectVolatile(vj0Var, j) == objectVolatile) {
                        this = vj0Var;
                    }
                }
            } else {
                vj0Var = this;
                if (objectVolatile == r51.C1) {
                    return null;
                }
                do {
                    unsafe = kr.a;
                    if (unsafe.compareAndSwapObject(vj0Var, p, objectVolatile, (Object) null)) {
                        return (Runnable) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(vj0Var, j) == objectVolatile);
            }
            this = vj0Var;
        }
    }

    public void M(Runnable runnable) {
        N();
        if (!O(runnable)) {
            p80.q.M(runnable);
            return;
        }
        Thread threadQ = Q();
        if (Thread.currentThread() != threadQ) {
            LockSupport.unpark(threadQ);
        }
    }

    public final void N() {
        tj0 tj0VarB;
        m.getClass();
        uj0 uj0Var = (uj0) kr.a.getObjectVolatile(this, o);
        if (uj0Var == null || sh3.b.get(uj0Var) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (uj0Var) {
                try {
                    tj0[] tj0VarArr = uj0Var.a;
                    tj0VarB = null;
                    tj0 tj0Var = tj0VarArr != null ? tj0VarArr[0] : null;
                    if (tj0Var != null) {
                        if (jNanoTime - tj0Var.f >= 0 ? O(tj0Var) : false) {
                            tj0VarB = uj0Var.b(0);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (tj0VarB != null);
    }

    public final boolean O(Runnable runnable) {
        Unsafe unsafe;
        Unsafe unsafe2;
        Unsafe unsafe3;
        loop0: while (true) {
            l.getClass();
            Unsafe unsafe4 = kr.a;
            long j = p;
            Object objectVolatile = unsafe4.getObjectVolatile(this, j);
            if (n.get(this) == 1) {
                return false;
            }
            if (objectVolatile == null) {
                do {
                    unsafe = kr.a;
                    if (unsafe.compareAndSwapObject(this, p, (Object) null, runnable)) {
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(this, j) == null);
            } else if (objectVolatile instanceof xj1) {
                xj1 xj1Var = (xj1) objectVolatile;
                int iA = xj1Var.a(runnable);
                if (iA == 0) {
                    break;
                }
                if (iA == 1) {
                    xj1 xj1VarD = xj1Var.d();
                    do {
                        unsafe2 = kr.a;
                        if (unsafe2.compareAndSwapObject(this, p, objectVolatile, xj1VarD)) {
                            break;
                        }
                    } while (unsafe2.getObjectVolatile(this, j) == objectVolatile);
                } else if (iA == 2) {
                    return false;
                }
            } else {
                if (objectVolatile == r51.C1) {
                    return false;
                }
                xj1 xj1Var2 = new xj1(8, true);
                xj1Var2.a((Runnable) objectVolatile);
                xj1Var2.a(runnable);
                do {
                    unsafe3 = kr.a;
                    if (unsafe3.compareAndSwapObject(this, p, objectVolatile, xj1Var2)) {
                        break loop0;
                    }
                } while (unsafe3.getObjectVolatile(this, j) == objectVolatile);
            }
        }
        return true;
    }

    public final long P() {
        tj0 tj0Var;
        mj mjVar = this.j;
        if (((mjVar == null || mjVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
            l.getClass();
            Unsafe unsafe = kr.a;
            Object objectVolatile = unsafe.getObjectVolatile(this, p);
            if (objectVolatile != null) {
                if (objectVolatile instanceof xj1) {
                    long j = xj1.f.get((xj1) objectVolatile);
                    if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                        return 0L;
                    }
                } else if (objectVolatile == r51.C1) {
                    return Long.MAX_VALUE;
                }
            }
            m.getClass();
            uj0 uj0Var = (uj0) unsafe.getObjectVolatile(this, o);
            if (uj0Var != null) {
                synchronized (uj0Var) {
                    tj0[] tj0VarArr = uj0Var.a;
                    tj0Var = tj0VarArr != null ? tj0VarArr[0] : null;
                }
                if (tj0Var != null) {
                    long jNanoTime = tj0Var.f - System.nanoTime();
                    if (jNanoTime >= 0) {
                        return jNanoTime;
                    }
                }
            }
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    public abstract Thread Q();

    public final boolean R() {
        mj mjVar = this.j;
        if (mjVar != null ? mjVar.isEmpty() : true) {
            m.getClass();
            Unsafe unsafe = kr.a;
            uj0 uj0Var = (uj0) unsafe.getObjectVolatile(this, o);
            if (uj0Var != null && sh3.b.get(uj0Var) != 0) {
                return false;
            }
            l.getClass();
            Object objectVolatile = unsafe.getObjectVolatile(this, p);
            if (objectVolatile != null) {
                if (objectVolatile instanceof xj1) {
                    long j = xj1.f.get((xj1) objectVolatile);
                    return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
                }
                if (objectVolatile == r51.C1) {
                }
            }
            return true;
        }
        return false;
    }

    public void S(long j, tj0 tj0Var) {
        p80.q.V(j, tj0Var);
    }

    public final void T() {
        tj0 tj0VarB;
        long jNanoTime = System.nanoTime();
        while (true) {
            m.getClass();
            uj0 uj0Var = (uj0) kr.a.getObjectVolatile(this, o);
            if (uj0Var == null) {
                return;
            }
            synchronized (uj0Var) {
                tj0VarB = sh3.b.get(uj0Var) > 0 ? uj0Var.b(0) : null;
            }
            if (tj0VarB == null) {
                return;
            } else {
                S(jNanoTime, tj0VarB);
            }
        }
    }

    public final void U() {
        l.getClass();
        Unsafe unsafe = kr.a;
        unsafe.putObjectVolatile(this, p, (Object) null);
        m.getClass();
        unsafe.putObjectVolatile(this, o, (Object) null);
    }

    public final void V(long j, tj0 tj0Var) {
        Thread threadQ;
        int iW = W(j, tj0Var);
        if (iW == 0) {
            if (!X(tj0Var) || Thread.currentThread() == (threadQ = Q())) {
                return;
            }
            LockSupport.unpark(threadQ);
            return;
        }
        if (iW == 1) {
            S(j, tj0Var);
        } else {
            if (iW == 2) {
                return;
            }
            c.q("unexpected result");
        }
    }

    public final int W(long j, tj0 tj0Var) {
        vj0 vj0Var;
        Unsafe unsafe;
        if (n.get(this) == 1) {
            return 1;
        }
        m.getClass();
        Unsafe unsafe2 = kr.a;
        long j2 = o;
        uj0 uj0Var = (uj0) unsafe2.getObjectVolatile(this, j2);
        if (uj0Var == null) {
            uj0 uj0Var2 = new uj0();
            uj0Var2.c = j;
            while (true) {
                unsafe = kr.a;
                vj0Var = this;
                if (unsafe.compareAndSwapObject(vj0Var, o, (Object) null, uj0Var2) || unsafe.getObjectVolatile(vj0Var, j2) != null) {
                    break;
                }
                this = vj0Var;
            }
            Object objectVolatile = unsafe.getObjectVolatile(vj0Var, j2);
            objectVolatile.getClass();
            uj0Var = (uj0) objectVolatile;
        } else {
            vj0Var = this;
        }
        return tj0Var.b(j, uj0Var, vj0Var);
    }

    public final boolean X(tj0 tj0Var) {
        m.getClass();
        uj0 uj0Var = (uj0) kr.a.getObjectVolatile(this, o);
        if (uj0Var != null) {
            synchronized (uj0Var) {
                tj0[] tj0VarArr = uj0Var.a;
                tj0Var = tj0VarArr != null ? tj0VarArr[0] : null;
            }
        }
        return tj0Var == tj0Var;
    }

    @Override // defpackage.ga0
    public final void i(long j, jr jrVar) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            rj0 rj0Var = new rj0(this, j2 + jNanoTime, jrVar);
            V(jNanoTime, rj0Var);
            jrVar.w(new er(1, rj0Var));
        }
    }

    @Override // defpackage.qj0
    public void shutdown() {
        qh3.a.set(null);
        n.set(this, 1);
        K();
        while (I() <= 0) {
        }
        T();
    }
}
