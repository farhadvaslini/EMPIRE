package defpackage;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class r0 implements Future {
    public static final boolean i = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger j = Logger.getLogger(r0.class.getName());
    public static final r51 k;
    public static final Object l;
    public volatile Object f;
    public volatile n0 g;
    public volatile q0 h;

    static {
        r51 p0Var;
        try {
            p0Var = new o0(AtomicReferenceFieldUpdater.newUpdater(q0.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(q0.class, q0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(r0.class, q0.class, "h"), AtomicReferenceFieldUpdater.newUpdater(r0.class, n0.class, "g"), AtomicReferenceFieldUpdater.newUpdater(r0.class, Object.class, "f"));
            th = null;
        } catch (Throwable th) {
            th = th;
            p0Var = new p0();
        }
        k = p0Var;
        if (th != null) {
            j.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        l = new Object();
    }

    public static void b(r0 r0Var) {
        q0 q0Var;
        n0 n0Var;
        do {
            q0Var = r0Var.h;
        } while (!k.o(r0Var, q0Var, q0.c));
        while (q0Var != null) {
            Thread thread = q0Var.a;
            if (thread != null) {
                q0Var.a = null;
                LockSupport.unpark(thread);
            }
            q0Var = q0Var.b;
        }
        do {
            n0Var = r0Var.g;
        } while (!k.m(r0Var, n0Var));
        n0 n0Var2 = null;
        while (n0Var != null) {
            n0 n0Var3 = n0Var.a;
            n0Var.a = n0Var2;
            n0Var2 = n0Var;
            n0Var = n0Var3;
        }
        while (n0Var2 != null) {
            n0Var2 = n0Var2.a;
            try {
                throw null;
            } catch (RuntimeException e) {
                j.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e);
            }
        }
    }

    public static Object c(Object obj) throws ExecutionException {
        if (obj instanceof l0) {
            Throwable th = ((l0) obj).a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof m0) {
            throw new ExecutionException((Throwable) null);
        }
        if (obj == l) {
            return null;
        }
        return obj;
    }

    public static Object d(r0 r0Var) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = r0Var.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        try {
            Object objD = d(this);
            sb.append("SUCCESS, result=[");
            sb.append(objD == this ? "this future" : String.valueOf(objD));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.f;
        if (obj != null) {
            return false;
        }
        if (!k.n(this, obj, i ? new l0(new CancellationException("Future.cancel() was called."), z) : z ? l0.b : l0.c)) {
            return false;
        }
        b(this);
        return true;
    }

    public final void e(q0 q0Var) {
        q0Var.a = null;
        while (true) {
            q0 q0Var2 = this.h;
            if (q0Var2 == q0.c) {
                return;
            }
            q0 q0Var3 = null;
            while (q0Var2 != null) {
                q0 q0Var4 = q0Var2.b;
                if (q0Var2.a != null) {
                    q0Var3 = q0Var2;
                } else if (q0Var3 != null) {
                    q0Var3.b = q0Var4;
                    if (q0Var3.a == null) {
                        break;
                    }
                } else if (!k.o(this, q0Var2, q0Var4)) {
                    break;
                }
                q0Var2 = q0Var4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        q0 q0Var = q0.c;
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f;
        if (obj != null) {
            return c(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            q0 q0Var2 = this.h;
            if (q0Var2 != q0Var) {
                q0 q0Var3 = new q0();
                do {
                    r51 r51Var = k;
                    r51Var.y(q0Var3, q0Var2);
                    if (r51Var.o(this, q0Var2, q0Var3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                e(q0Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f;
                            if (obj2 != null) {
                                return c(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        e(q0Var3);
                    } else {
                        q0Var2 = this.h;
                    }
                } while (q0Var2 != q0Var);
            }
            return c(this.f);
        }
        while (nanos > 0) {
            Object obj3 = this.f;
            if (obj3 != null) {
                return c(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String strConcat = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strConcat2 = strConcat.concat(" (plus ");
            long j3 = -nanos;
            long jConvert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                if (z) {
                    strConcat3 = strConcat3.concat(",");
                }
                strConcat2 = strConcat3.concat(" ");
            }
            if (z) {
                strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
            }
            strConcat = strConcat2.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(strConcat + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f instanceof l0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f instanceof l0) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        q0 q0Var = q0.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f;
            if (obj2 != null) {
                return c(obj2);
            }
            q0 q0Var2 = this.h;
            if (q0Var2 != q0Var) {
                q0 q0Var3 = new q0();
                do {
                    r51 r51Var = k;
                    r51Var.y(q0Var3, q0Var2);
                    if (r51Var.o(this, q0Var2, q0Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f;
                            } else {
                                e(q0Var3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return c(obj);
                    }
                    q0Var2 = this.h;
                } while (q0Var2 != q0Var);
            }
            return c(this.f);
        }
        throw new InterruptedException();
    }
}
