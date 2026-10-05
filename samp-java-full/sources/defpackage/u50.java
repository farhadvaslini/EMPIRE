package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class u50 extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater n = AtomicIntegerFieldUpdater.newUpdater(u50.class, "workerCtl$volatile");
    public final ou3 f;
    public final qk2 g;
    public v50 h;
    public long i;
    private volatile int indexInArray;
    public long j;
    public int k;
    public boolean l;
    public final /* synthetic */ w50 m;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public u50(w50 w50Var, int i) {
        this.m = w50Var;
        setDaemon(true);
        setContextClassLoader(w50.class.getClassLoader());
        this.f = new ou3();
        this.g = new qk2();
        this.h = v50.i;
        this.nextParkedWorker = w50.p;
        int iNanoTime = (int) System.nanoTime();
        this.k = iNanoTime == 0 ? 42 : iNanoTime;
        f(i);
    }

    public final fd3 a(boolean z) {
        fd3 fd3VarE;
        fd3 fd3VarE2;
        long j;
        v50 v50Var = this.h;
        w50 w50Var = this.m;
        ou3 ou3Var = this.f;
        v50 v50Var2 = v50.f;
        if (v50Var != v50Var2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = w50.n;
            do {
                j = atomicLongFieldUpdater.get(w50Var);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    fd3 fd3VarG = ou3Var.g();
                    return (fd3VarG == null && (fd3VarG = (fd3) w50Var.k.d()) == null) ? i(1) : fd3VarG;
                }
            } while (!w50.n.compareAndSet(w50Var, j, j - 4398046511104L));
            this.h = v50Var2;
        }
        if (z) {
            boolean z2 = d(w50Var.f * 2) == 0;
            if (z2 && (fd3VarE2 = e()) != null) {
                return fd3VarE2;
            }
            fd3 fd3VarE3 = ou3Var.e();
            if (fd3VarE3 != null) {
                return fd3VarE3;
            }
            if (!z2 && (fd3VarE = e()) != null) {
                return fd3VarE;
            }
        } else {
            fd3 fd3VarE4 = e();
            if (fd3VarE4 != null) {
                return fd3VarE4;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i) {
        int i2 = this.k;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.k = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
    }

    public final fd3 e() {
        int iD = d(2);
        w50 w50Var = this.m;
        ew0 ew0Var = w50Var.k;
        ew0 ew0Var2 = w50Var.j;
        if (iD == 0) {
            fd3 fd3Var = (fd3) ew0Var2.d();
            return fd3Var != null ? fd3Var : (fd3) ew0Var.d();
        }
        fd3 fd3Var2 = (fd3) ew0Var.d();
        return fd3Var2 != null ? fd3Var2 : (fd3) ew0Var2.d();
    }

    public final void f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.m.i);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(v50 v50Var) {
        v50 v50Var2 = this.h;
        boolean z = v50Var2 == v50.f;
        if (z) {
            w50.n.addAndGet(this.m, 4398046511104L);
        }
        if (v50Var2 != v50Var) {
            this.h = v50Var;
        }
        return z;
    }

    public final fd3 i(int i) {
        fd3 fd3VarH;
        long jI;
        AtomicLongFieldUpdater atomicLongFieldUpdater = w50.n;
        w50 w50Var = this.m;
        int i2 = (int) (atomicLongFieldUpdater.get(w50Var) & 2097151);
        if (i2 < 2) {
            return null;
        }
        int iD = d(i2);
        long jMin = Long.MAX_VALUE;
        for (int i3 = 0; i3 < i2; i3++) {
            iD++;
            if (iD > i2) {
                iD = 1;
            }
            u50 u50Var = (u50) w50Var.l.b(iD);
            if (u50Var != null && u50Var != this) {
                ou3 ou3Var = u50Var.f;
                ou3Var.getClass();
                if (i == 3) {
                    fd3VarH = ou3Var.f();
                } else {
                    boolean z = i == 1;
                    int i4 = ou3.d.get(ou3Var);
                    int i5 = ou3.c.get(ou3Var);
                    while (i4 != i5 && (!z || ou3.e.get(ou3Var) != 0)) {
                        int i6 = i4 + 1;
                        fd3VarH = ou3Var.h(i4, z);
                        if (fd3VarH != null) {
                            break;
                        }
                        i4 = i6;
                    }
                    fd3VarH = null;
                }
                qk2 qk2Var = this.g;
                if (fd3VarH != null) {
                    qk2Var.f = fd3VarH;
                    jI = -1;
                } else {
                    jI = ou3Var.i(i, qk2Var);
                }
                if (jI == -1) {
                    fd3 fd3Var = (fd3) qk2Var.f;
                    qk2Var.f = null;
                    return fd3Var;
                }
                if (jI > 0) {
                    jMin = Math.min(jMin, jI);
                }
            }
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.j = jMin;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j;
        loop0: while (true) {
            boolean z = false;
            while (w50.o.get(this.m) != 1) {
                v50 v50Var = this.h;
                v50 v50Var2 = v50.j;
                if (v50Var == v50Var2) {
                    break loop0;
                }
                fd3 fd3VarA = a(this.l);
                if (fd3VarA != null) {
                    this.j = 0L;
                    w50 w50Var = this.m;
                    this.i = 0L;
                    if (this.h == v50.h) {
                        this.h = v50.g;
                    }
                    if (fd3VarA.g) {
                        if (h(v50.g) && !w50Var.j() && !w50Var.i(w50.n.get(w50Var))) {
                            w50Var.j();
                        }
                        try {
                            fd3VarA.run();
                        } catch (Throwable th) {
                            Thread threadCurrentThread = Thread.currentThread();
                            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                        }
                        w50.n.addAndGet(w50Var, -2097152L);
                        if (this.h != v50Var2) {
                            this.h = v50.i;
                        }
                    } else {
                        try {
                            fd3VarA.run();
                        } catch (Throwable th2) {
                            Thread threadCurrentThread2 = Thread.currentThread();
                            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                        }
                    }
                } else {
                    this.l = false;
                    if (this.j == 0) {
                        Object obj = this.nextParkedWorker;
                        ai0 ai0Var = w50.p;
                        if (obj != ai0Var) {
                            n.set(this, -1);
                            while (this.nextParkedWorker != w50.p) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = n;
                                if (atomicIntegerFieldUpdater.get(this) == -1) {
                                    w50 w50Var2 = this.m;
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = w50.o;
                                    if (atomicIntegerFieldUpdater2.get(w50Var2) == 1) {
                                        break;
                                    }
                                    v50 v50Var3 = this.h;
                                    v50 v50Var4 = v50.j;
                                    if (v50Var3 == v50Var4) {
                                        break;
                                    }
                                    h(v50.h);
                                    Thread.interrupted();
                                    if (this.i == 0) {
                                        j = 2097151;
                                        this.i = System.nanoTime() + this.m.h;
                                    } else {
                                        j = 2097151;
                                    }
                                    LockSupport.parkNanos(this.m.h);
                                    if (System.nanoTime() - this.i >= 0) {
                                        this.i = 0L;
                                        w50 w50Var3 = this.m;
                                        synchronized (w50Var3.l) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater2.get(w50Var3) == 1)) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = w50.n;
                                                    if (((int) (atomicLongFieldUpdater.get(w50Var3) & j)) > w50Var3.f && atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                        int i = this.indexInArray;
                                                        f(0);
                                                        w50Var3.h(this, i, 0);
                                                        int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(w50Var3) & j);
                                                        if (andDecrement != i) {
                                                            Object objB = w50Var3.l.b(andDecrement);
                                                            objB.getClass();
                                                            u50 u50Var = (u50) objB;
                                                            w50Var3.l.c(i, u50Var);
                                                            u50Var.f(i);
                                                            w50Var3.h(u50Var, andDecrement, i);
                                                        }
                                                        w50Var3.l.c(andDecrement, null);
                                                        this.h = v50Var4;
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                throw th3;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            w50 w50Var4 = this.m;
                            if (this.nextParkedWorker == ai0Var) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = w50.m;
                                while (true) {
                                    long j2 = atomicLongFieldUpdater2.get(w50Var4);
                                    int i2 = this.indexInArray;
                                    this.nextParkedWorker = w50Var4.l.b((int) (j2 & 2097151));
                                    w50 w50Var5 = w50Var4;
                                    if (w50.m.compareAndSet(w50Var5, j2, ((j2 + 2097152) & (-2097152)) | ((long) i2))) {
                                        break;
                                    } else {
                                        w50Var4 = w50Var5;
                                    }
                                }
                            }
                        }
                    } else if (z) {
                        h(v50.h);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.j);
                        this.j = 0L;
                    } else {
                        z = true;
                    }
                }
            }
            break loop0;
        }
        h(v50.j);
    }
}
