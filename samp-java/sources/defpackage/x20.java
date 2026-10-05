package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class x20 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(x20.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b;
    public static final /* synthetic */ long c;
    public static final /* synthetic */ long d;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        Unsafe unsafe = kr.a;
        c = unsafe.objectFieldOffset(x20.class.getDeclaredField("_next$volatile"));
        b = AtomicReferenceFieldUpdater.newUpdater(x20.class, Object.class, "_prev$volatile");
        d = unsafe.objectFieldOffset(x20.class.getDeclaredField("_prev$volatile"));
    }

    public x20(kt2 kt2Var) {
        this._prev$volatile = kt2Var;
    }

    public final void a() {
        b.getClass();
        kr.a.putObjectVolatile(this, d, (Object) null);
    }

    public final x20 b() {
        x20 x20VarE = e();
        while (x20VarE != null && x20VarE.f()) {
            b.getClass();
            x20VarE = (x20) kr.a.getObjectVolatile(x20VarE, d);
        }
        return x20VarE;
    }

    public final x20 c() {
        Object objD = d();
        if (objD == gv3.r) {
            return null;
        }
        return (x20) objD;
    }

    public final Object d() {
        a.getClass();
        return kr.a.getObjectVolatile(this, c);
    }

    public final x20 e() {
        b.getClass();
        return (x20) kr.a.getObjectVolatile(this, d);
    }

    public abstract boolean f();

    public final boolean g() {
        ai0 ai0Var = gv3.r;
        while (true) {
            a.getClass();
            Unsafe unsafe = kr.a;
            long j = c;
            x20 x20Var = this;
            if (unsafe.compareAndSwapObject(x20Var, j, (Object) null, ai0Var)) {
                return true;
            }
            if (unsafe.getObjectVolatile(x20Var, j) != null) {
                return false;
            }
            this = x20Var;
        }
    }

    public final void h() {
        x20 x20Var;
        Unsafe unsafe;
        if (c() == null) {
            return;
        }
        while (true) {
            x20 x20VarB = b();
            x20 x20VarC = c();
            x20VarC.getClass();
            do {
                x20Var = x20VarC;
                if (!x20Var.f()) {
                    break;
                } else {
                    x20VarC = x20Var.c();
                }
            } while (x20VarC != null);
            while (true) {
                b.getClass();
                Unsafe unsafe2 = kr.a;
                long j = d;
                Object objectVolatile = unsafe2.getObjectVolatile(x20Var, j);
                x20 x20Var2 = ((x20) objectVolatile) == null ? null : x20VarB;
                do {
                    unsafe = kr.a;
                    if (unsafe.compareAndSwapObject(x20Var, d, objectVolatile, x20Var2)) {
                        break;
                    }
                } while (unsafe.getObjectVolatile(x20Var, j) == objectVolatile);
            }
            if (x20VarB != null) {
                a.getClass();
                unsafe.putObjectVolatile(x20VarB, c, x20Var);
            }
            if (!x20Var.f() || x20Var.c() == null) {
                if (x20VarB == null || !x20VarB.f()) {
                    return;
                }
            }
        }
    }

    public final boolean i(kt2 kt2Var) {
        while (true) {
            a.getClass();
            Unsafe unsafe = kr.a;
            long j = c;
            x20 x20Var = this;
            kt2 kt2Var2 = kt2Var;
            if (unsafe.compareAndSwapObject(x20Var, j, (Object) null, kt2Var2)) {
                return true;
            }
            if (unsafe.getObjectVolatile(x20Var, j) != null) {
                return false;
            }
            this = x20Var;
            kt2Var = kt2Var2;
        }
    }
}
