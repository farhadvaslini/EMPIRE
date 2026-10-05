package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public class vj1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(vj1.class, Object.class, "_cur$volatile");
    public static final /* synthetic */ long b = kr.a.objectFieldOffset(vj1.class.getDeclaredField("_cur$volatile"));
    private volatile /* synthetic */ Object _cur$volatile = new xj1(8, false);

    public final boolean a(Runnable runnable) {
        vj1 vj1Var;
        while (true) {
            a.getClass();
            Unsafe unsafe = kr.a;
            long j = b;
            xj1 xj1Var = (xj1) unsafe.getObjectVolatile(this, j);
            int iA = xj1Var.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                xj1 xj1VarD = xj1Var.d();
                while (true) {
                    Unsafe unsafe2 = kr.a;
                    vj1Var = this;
                    if (!unsafe2.compareAndSwapObject(vj1Var, b, xj1Var, xj1VarD) && unsafe2.getObjectVolatile(vj1Var, j) == xj1Var) {
                        this = vj1Var;
                    }
                }
            } else {
                if (iA == 2) {
                    return false;
                }
                vj1Var = this;
            }
            this = vj1Var;
        }
    }

    public final void b() {
        vj1 vj1Var;
        while (true) {
            a.getClass();
            Unsafe unsafe = kr.a;
            long j = b;
            xj1 xj1Var = (xj1) unsafe.getObjectVolatile(this, j);
            if (xj1Var.c()) {
                return;
            }
            xj1 xj1VarD = xj1Var.d();
            while (true) {
                Unsafe unsafe2 = kr.a;
                vj1Var = this;
                if (!unsafe2.compareAndSwapObject(vj1Var, b, xj1Var, xj1VarD) && unsafe2.getObjectVolatile(vj1Var, j) == xj1Var) {
                    this = vj1Var;
                }
            }
            this = vj1Var;
        }
    }

    public final int c() {
        a.getClass();
        xj1 xj1Var = (xj1) kr.a.getObjectVolatile(this, b);
        xj1Var.getClass();
        long j = xj1.f.get(xj1Var);
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    public final Object d() {
        vj1 vj1Var;
        while (true) {
            a.getClass();
            Unsafe unsafe = kr.a;
            long j = b;
            xj1 xj1Var = (xj1) unsafe.getObjectVolatile(this, j);
            Object objE = xj1Var.e();
            if (objE != xj1.g) {
                return objE;
            }
            xj1 xj1VarD = xj1Var.d();
            while (true) {
                Unsafe unsafe2 = kr.a;
                vj1Var = this;
                if (!unsafe2.compareAndSwapObject(vj1Var, b, xj1Var, xj1VarD) && unsafe2.getObjectVolatile(vj1Var, j) == xj1Var) {
                    this = vj1Var;
                }
            }
            this = vj1Var;
        }
    }
}
