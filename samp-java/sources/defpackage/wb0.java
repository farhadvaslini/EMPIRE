package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class wb0 extends yb0 implements z50, p40 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater m = AtomicReferenceFieldUpdater.newUpdater(wb0.class, Object.class, "_reusableCancellableContinuation$volatile");
    public static final /* synthetic */ long n = kr.a.objectFieldOffset(wb0.class.getDeclaredField("_reusableCancellableContinuation$volatile"));
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final q50 i;
    public final q40 j;
    public Object k;
    public final Object l;

    public wb0(q50 q50Var, q40 q40Var) {
        super(-1);
        this.i = q50Var;
        this.j = q40Var;
        this.k = s51.h;
        this.l = cl3.D(q40Var.i());
    }

    @Override // defpackage.z50
    public final z50 d() {
        return this.j;
    }

    @Override // defpackage.yb0
    public final Object h() {
        Object obj = this.k;
        this.k = s51.h;
        return obj;
    }

    @Override // defpackage.p40
    public final o50 i() {
        return this.j.i();
    }

    public final void j() {
        do {
            m.getClass();
        } while (kr.a.getObjectVolatile(this, n) == s51.i);
    }

    public final jr k() {
        wb0 wb0Var;
        ai0 ai0Var = s51.i;
        while (true) {
            m.getClass();
            Unsafe unsafe = kr.a;
            long j = n;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                unsafe.putObjectVolatile(this, j, ai0Var);
                return null;
            }
            if (objectVolatile instanceof jr) {
                while (true) {
                    Unsafe unsafe2 = kr.a;
                    wb0 wb0Var2 = this;
                    boolean zCompareAndSwapObject = unsafe2.compareAndSwapObject(wb0Var2, n, objectVolatile, ai0Var);
                    wb0Var = wb0Var2;
                    if (zCompareAndSwapObject) {
                        return (jr) objectVolatile;
                    }
                    if (unsafe2.getObjectVolatile(wb0Var, j) != objectVolatile) {
                        break;
                    }
                    this = wb0Var;
                }
            } else {
                wb0Var = this;
                if (objectVolatile != ai0Var && !(objectVolatile instanceof Throwable)) {
                    c.h(objectVolatile, "Inconsistent state ");
                    return null;
                }
            }
            this = wb0Var;
        }
    }

    public final jr l() {
        m.getClass();
        Object objectVolatile = kr.a.getObjectVolatile(this, n);
        if (objectVolatile instanceof jr) {
            return (jr) objectVolatile;
        }
        return null;
    }

    public final boolean m() {
        m.getClass();
        return kr.a.getObjectVolatile(this, n) != null;
    }

    public final boolean n(Throwable th) {
        wb0 wb0Var;
        Throwable th2;
        Unsafe unsafe;
        while (true) {
            m.getClass();
            Unsafe unsafe2 = kr.a;
            long j = n;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            ai0 ai0Var = s51.i;
            if (s51.n(objectVolatile, ai0Var)) {
                while (true) {
                    Unsafe unsafe3 = kr.a;
                    wb0 wb0Var2 = this;
                    th2 = th;
                    wb0Var = wb0Var2;
                    if (unsafe3.compareAndSwapObject(wb0Var2, n, ai0Var, th2)) {
                        return true;
                    }
                    if (unsafe3.getObjectVolatile(wb0Var, j) != ai0Var) {
                        break;
                    }
                    this = wb0Var;
                    th = th2;
                }
            } else {
                wb0Var = this;
                th2 = th;
                if (objectVolatile instanceof Throwable) {
                    return true;
                }
                do {
                    unsafe = kr.a;
                    if (unsafe.compareAndSwapObject(wb0Var, n, objectVolatile, (Object) null)) {
                        return false;
                    }
                } while (unsafe.getObjectVolatile(wb0Var, j) == objectVolatile);
            }
            this = wb0Var;
            th = th2;
        }
    }

    public final Throwable o(jr jrVar) {
        Unsafe unsafe;
        wb0 wb0Var;
        jr jrVar2;
        while (true) {
            m.getClass();
            Unsafe unsafe2 = kr.a;
            long j = n;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            ai0 ai0Var = s51.i;
            if (objectVolatile != ai0Var) {
                wb0 wb0Var2 = this;
                if (!(objectVolatile instanceof Throwable)) {
                    c.h(objectVolatile, "Inconsistent state ");
                    return null;
                }
                do {
                    unsafe = kr.a;
                    if (unsafe.compareAndSwapObject(wb0Var2, n, objectVolatile, (Object) null)) {
                        return (Throwable) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(wb0Var2, j) == objectVolatile);
                c.p("Failed requirement.");
                return null;
            }
            while (true) {
                Unsafe unsafe3 = kr.a;
                wb0Var = this;
                jrVar2 = jrVar;
                if (unsafe3.compareAndSwapObject(wb0Var, n, ai0Var, jrVar2)) {
                    return null;
                }
                if (unsafe3.getObjectVolatile(wb0Var, j) != ai0Var) {
                    break;
                }
                this = wb0Var;
                jrVar = jrVar2;
            }
            this = wb0Var;
            jrVar = jrVar2;
        }
    }

    @Override // defpackage.p40
    public final void t(Object obj) throws vb0 {
        Throwable thA = rn2.a(obj);
        Object jzVar = thA == null ? obj : new jz(thA, false);
        q40 q40Var = this.j;
        o50 o50VarI = q40Var.i();
        q50 q50Var = this.i;
        if (s51.C(q50Var, o50VarI)) {
            this.k = jzVar;
            this.h = 0;
            s51.B(q50Var, q40Var.i(), this);
            return;
        }
        qj0 qj0VarA = qh3.a();
        if (qj0VarA.h >= 4294967296L) {
            this.k = jzVar;
            this.h = 0;
            qj0VarA.G(this);
            return;
        }
        qj0VarA.H(true);
        try {
            o50 o50VarI2 = q40Var.i();
            Object objF = cl3.F(o50VarI2, this.l);
            try {
                q40Var.t(obj);
                while (qj0VarA.J()) {
                }
            } finally {
                cl3.A(o50VarI2, objF);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.i + ", " + f80.T(this.j) + ']';
    }

    @Override // defpackage.yb0
    public final p40 c() {
        return this;
    }
}
