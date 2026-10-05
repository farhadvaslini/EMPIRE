package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class p80 extends vj0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final p80 q;
    public static final long r;

    static {
        Long l;
        p80 p80Var = new p80();
        q = p80Var;
        p80Var.H(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        r = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // defpackage.vj0
    public final void M(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.M(runnable);
    }

    @Override // defpackage.vj0
    public final Thread Q() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(q.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // defpackage.vj0
    public final void S(long j, tj0 tj0Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void Y() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            U();
            notifyAll();
        }
    }

    @Override // defpackage.ga0
    public final kc0 h(long j, ei3 ei3Var, o50 o50Var) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 >= 4611686018427387903L) {
            return lx1.f;
        }
        long jNanoTime = System.nanoTime();
        sj0 sj0Var = new sj0(j2 + jNanoTime, ei3Var);
        V(jNanoTime, sj0Var);
        return sj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zR;
        qh3.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (zR) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jI = I();
                    if (jI == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = r + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            Y();
                            if (R()) {
                                return;
                            }
                            Q();
                            return;
                        }
                        if (jI > j2) {
                            jI = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jI > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            Y();
                            if (R()) {
                                return;
                            }
                            Q();
                            return;
                        }
                        LockSupport.parkNanos(this, jI);
                    }
                }
            }
        } finally {
            _thread = null;
            Y();
            if (!R()) {
                Q();
            }
        }
    }

    @Override // defpackage.vj0, defpackage.qj0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // defpackage.q50
    public final String toString() {
        return "DefaultExecutor";
    }
}
