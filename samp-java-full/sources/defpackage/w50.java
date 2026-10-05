package defpackage;

import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class w50 implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater m = AtomicLongFieldUpdater.newUpdater(w50.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater n = AtomicLongFieldUpdater.newUpdater(w50.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater o = AtomicIntegerFieldUpdater.newUpdater(w50.class, "_isTerminated$volatile");
    public static final ai0 p = new ai0(1, "NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    public final int f;
    public final int g;
    public final long h;
    public final String i;
    public final ew0 j;
    public final ew0 k;
    public final ql2 l;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public w50(int i, int i2, long j, String str) {
        this.f = i;
        this.g = i2;
        this.h = j;
        this.i = str;
        if (i < 1) {
            c.g(by1.h("Core pool size ", " should be at least 1", i));
            throw null;
        }
        if (i2 < i) {
            c.g(nc2.g(i2, i, "Max pool size ", " should be greater than or equals to core pool size "));
            throw null;
        }
        if (i2 > 2097150) {
            c.g(by1.h("Max pool size ", " should not exceed maximal supported number of threads 2097150", i2));
            throw null;
        }
        if (j <= 0) {
            qn1.h("Idle worker keep alive time ", j, " must be positive");
            throw null;
        }
        this.j = new ew0();
        this.k = new ew0();
        this.l = new ql2((i + 1) * 2);
        this.controlState$volatile = ((long) i) << 42;
    }

    public static /* synthetic */ void f(w50 w50Var, Runnable runnable, int i) {
        w50Var.c(runnable, false, (i & 4) == 0);
    }

    public final int b() {
        synchronized (this.l) {
            try {
                if (o.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = n;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.f) {
                    return 0;
                }
                if (i >= this.g) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.l.b(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                u50 u50Var = new u50(this, i3);
                this.l.c(i3, u50Var);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                u50Var.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Runnable runnable, boolean z, boolean z2) {
        fd3 gd3Var;
        v50 v50Var;
        kd3.f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof fd3) {
            gd3Var = (fd3) runnable;
            gd3Var.f = jNanoTime;
            gd3Var.g = z;
        } else {
            gd3Var = new gd3(runnable, jNanoTime, z);
        }
        boolean z3 = gd3Var.g;
        AtomicLongFieldUpdater atomicLongFieldUpdater = n;
        long jAddAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        u50 u50Var = null;
        u50 u50Var2 = threadCurrentThread instanceof u50 ? (u50) threadCurrentThread : null;
        if (u50Var2 != null && u50Var2.m == this) {
            u50Var = u50Var2;
        }
        if (u50Var != null && (v50Var = u50Var.h) != v50.j && (gd3Var.g || v50Var != v50.g)) {
            u50Var.l = true;
            gd3Var = u50Var.f.a(gd3Var, z2);
        }
        if (gd3Var != null) {
            if (!(gd3Var.g ? this.k.a(gd3Var) : this.j.a(gd3Var))) {
                throw new RejectedExecutionException(nc2.j(new StringBuilder(), this.i, " was terminated"));
            }
        }
        if (z3) {
            if (j() || i(jAddAndGet)) {
                return;
            }
            j();
            return;
        }
        if (j() || i(atomicLongFieldUpdater.get(this))) {
            return;
        }
        j();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() throws InterruptedException {
        int i;
        fd3 fd3VarA;
        if (o.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            u50 u50Var = null;
            u50 u50Var2 = threadCurrentThread instanceof u50 ? (u50) threadCurrentThread : null;
            if (u50Var2 != null && u50Var2.m == this) {
                u50Var = u50Var2;
            }
            synchronized (this.l) {
                i = (int) (n.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    Object objB = this.l.b(i2);
                    objB.getClass();
                    u50 u50Var3 = (u50) objB;
                    if (u50Var3 != u50Var) {
                        while (u50Var3.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(u50Var3);
                            u50Var3.join(10000L);
                        }
                        u50Var3.f.d(this.k);
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.k.b();
            this.j.b();
            while (true) {
                if (u50Var == null) {
                    fd3VarA = (fd3) this.j.d();
                    if (fd3VarA == null && (fd3VarA = (fd3) this.k.d()) == null) {
                        break;
                    }
                } else {
                    fd3VarA = u50Var.a(true);
                    if (fd3VarA == null) {
                    }
                }
                try {
                    fd3VarA.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (u50Var != null) {
                u50Var.h(v50.j);
            }
            m.set(this, 0L);
            n.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f(this, runnable, 6);
    }

    public final void h(u50 u50Var, int i, int i2) {
        while (true) {
            long j = m.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object objC = u50Var.c();
                    while (true) {
                        if (objC == p) {
                            i3 = -1;
                            break;
                        }
                        if (objC == null) {
                            i3 = 0;
                            break;
                        }
                        u50 u50Var2 = (u50) objC;
                        int iB = u50Var2.b();
                        if (iB != 0) {
                            i3 = iB;
                            break;
                        }
                        objC = u50Var2.c();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                w50 w50Var = this;
                if (m.compareAndSet(w50Var, j, ((long) i3) | j2)) {
                    return;
                } else {
                    this = w50Var;
                }
            }
        }
    }

    public final boolean i(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.f;
        if (i < i2) {
            int iB = b();
            if (iB == 1 && i2 > 1) {
                b();
            }
            if (iB > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean j() {
        w50 w50Var;
        ai0 ai0Var;
        int iB;
        while (true) {
            long j = m.get(this);
            u50 u50Var = (u50) this.l.b((int) (2097151 & j));
            if (u50Var == null) {
                u50Var = null;
                w50Var = this;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object objC = u50Var.c();
                while (true) {
                    ai0Var = p;
                    if (objC == ai0Var) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    u50 u50Var2 = (u50) objC;
                    iB = u50Var2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = u50Var2.c();
                    j = j;
                }
                if (iB >= 0) {
                    w50 w50Var2 = this;
                    boolean zCompareAndSet = m.compareAndSet(w50Var2, j, ((long) iB) | j2);
                    w50Var = w50Var2;
                    if (zCompareAndSet) {
                        u50Var.g(ai0Var);
                    }
                    this = w50Var;
                } else {
                    continue;
                }
            }
            if (u50Var == null) {
                return false;
            }
            if (u50.n.compareAndSet(u50Var, -1, 0)) {
                LockSupport.unpark(u50Var);
                return true;
            }
            this = w50Var;
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ql2 ql2Var = this.l;
        int iA = ql2Var.a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iA; i6++) {
            u50 u50Var = (u50) ql2Var.b(i6);
            if (u50Var != null) {
                int iC = u50Var.f.c();
                int iOrdinal = u50Var.h.ordinal();
                if (iOrdinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(iC);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iOrdinal == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iC);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 2) {
                    i3++;
                } else if (iOrdinal == 3) {
                    i4++;
                    if (iC > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(iC);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        c.k();
                        return null;
                    }
                    i5++;
                }
            }
        }
        long j = n.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.i);
        sb4.append('@');
        sb4.append(f80.D(this));
        sb4.append("[Pool Size {core = ");
        int i7 = this.f;
        sb4.append(i7);
        sb4.append(", max = ");
        sb4.append(this.g);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i2);
        sb4.append(", parked = ");
        sb4.append(i3);
        sb4.append(", dormant = ");
        sb4.append(i4);
        sb4.append(", terminated = ");
        sb4.append(i5);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.j.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.k.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i7 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
