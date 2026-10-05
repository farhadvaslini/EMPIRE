package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public class uj1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(uj1.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater g;
    public static final /* synthetic */ AtomicReferenceFieldUpdater h;
    public static final /* synthetic */ long i;
    public static final /* synthetic */ long j;
    public static final /* synthetic */ long k;
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    static {
        Unsafe unsafe = kr.a;
        i = unsafe.objectFieldOffset(uj1.class.getDeclaredField("_next$volatile"));
        g = AtomicReferenceFieldUpdater.newUpdater(uj1.class, Object.class, "_prev$volatile");
        j = unsafe.objectFieldOffset(uj1.class.getDeclaredField("_prev$volatile"));
        h = AtomicReferenceFieldUpdater.newUpdater(uj1.class, Object.class, "_removedRef$volatile");
        k = unsafe.objectFieldOffset(uj1.class.getDeclaredField("_removedRef$volatile"));
    }

    public static uj1 i(uj1 uj1Var) {
        while (uj1Var.n()) {
            g.getClass();
            uj1Var = (uj1) kr.a.getObjectVolatile(uj1Var, j);
        }
        return uj1Var;
    }

    public final boolean e(uj1 uj1Var, int i2) {
        uj1 uj1VarM;
        do {
            uj1VarM = m();
            if (uj1VarM instanceof bi1) {
                return (((bi1) uj1VarM).l & i2) == 0 && uj1VarM.e(uj1Var, i2);
            }
        } while (!uj1VarM.f(uj1Var, this));
        return true;
    }

    public final boolean f(uj1 uj1Var, uj1 uj1Var2) {
        g.getClass();
        Unsafe unsafe = kr.a;
        unsafe.putObjectVolatile(uj1Var, j, this);
        f.getClass();
        long j2 = i;
        unsafe.putObjectVolatile(uj1Var, j2, uj1Var2);
        while (true) {
            Unsafe unsafe2 = kr.a;
            uj1 uj1Var3 = this;
            uj1 uj1Var4 = uj1Var;
            uj1 uj1Var5 = uj1Var2;
            if (unsafe2.compareAndSwapObject(uj1Var3, i, uj1Var5, uj1Var4)) {
                uj1Var4.j(uj1Var5);
                return true;
            }
            if (unsafe2.getObjectVolatile(uj1Var3, j2) != uj1Var5) {
                return false;
            }
            this = uj1Var3;
            uj1Var2 = uj1Var5;
            uj1Var = uj1Var4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        r9 = r4;
        r10 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(gx1 gx1Var) {
        g.getClass();
        Unsafe unsafe = kr.a;
        unsafe.putObjectVolatile(gx1Var, j, this);
        f.getClass();
        long j2 = i;
        unsafe.putObjectVolatile(gx1Var, j2, this);
        while (this.k() == this) {
            while (true) {
                Unsafe unsafe2 = kr.a;
                uj1 uj1Var = this;
                gx1 gx1Var2 = gx1Var;
                if (unsafe2.compareAndSwapObject(uj1Var, i, this, gx1Var2)) {
                    gx1Var2.j(uj1Var);
                    return;
                } else {
                    if (unsafe2.getObjectVolatile(uj1Var, j2) != uj1Var) {
                        break;
                    }
                    this = uj1Var;
                    gx1Var = gx1Var2;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final uj1 h() {
        uj1 uj1Var;
        Unsafe unsafe;
        loop0: while (true) {
            g.getClass();
            Unsafe unsafe2 = kr.a;
            long j2 = j;
            uj1 uj1Var2 = (uj1) unsafe2.getObjectVolatile(this, j2);
            uj1 uj1Var3 = null;
            uj1 uj1Var4 = uj1Var2;
            while (true) {
                f.getClass();
                if (uj1Var4 == null) {
                    qn1.b();
                    return null;
                }
                Unsafe unsafe3 = kr.a;
                long j3 = i;
                Object objectVolatile = unsafe3.getObjectVolatile(uj1Var4, j3);
                if (objectVolatile != this) {
                    uj1 uj1Var5 = uj1Var2;
                    uj1Var = this;
                    if (uj1Var.n()) {
                        return null;
                    }
                    if (!(objectVolatile instanceof dl2)) {
                        objectVolatile.getClass();
                        uj1Var3 = uj1Var4;
                        uj1Var4 = (uj1) objectVolatile;
                    } else if (uj1Var3 != null) {
                        uj1 uj1Var6 = ((dl2) objectVolatile).a;
                        do {
                            uj1 uj1Var7 = uj1Var4;
                            unsafe = kr.a;
                            boolean zCompareAndSwapObject = unsafe.compareAndSwapObject(uj1Var3, i, uj1Var7, uj1Var6);
                            uj1Var4 = uj1Var7;
                            if (zCompareAndSwapObject) {
                                this = uj1Var;
                                uj1Var4 = uj1Var3;
                                uj1Var2 = uj1Var5;
                                uj1Var3 = null;
                            }
                        } while (unsafe.getObjectVolatile(uj1Var3, j3) == uj1Var4);
                    } else {
                        if (uj1Var4 == null) {
                            qn1.b();
                            return null;
                        }
                        uj1Var4 = (uj1) unsafe3.getObjectVolatile(uj1Var4, j2);
                    }
                    this = uj1Var;
                    uj1Var2 = uj1Var5;
                } else {
                    if (uj1Var2 == uj1Var4) {
                        break;
                    }
                    while (true) {
                        Unsafe unsafe4 = kr.a;
                        uj1 uj1Var8 = this;
                        boolean zCompareAndSwapObject2 = unsafe4.compareAndSwapObject(uj1Var8, j, uj1Var2, uj1Var4);
                        uj1 uj1Var9 = uj1Var2;
                        uj1Var = uj1Var8;
                        if (zCompareAndSwapObject2) {
                            break loop0;
                        }
                        if (unsafe4.getObjectVolatile(uj1Var, j2) != uj1Var9) {
                            break;
                        }
                        this = uj1Var;
                        uj1Var2 = uj1Var9;
                    }
                }
            }
            this = uj1Var;
        }
    }

    public final void j(uj1 uj1Var) {
        uj1 uj1Var2;
        while (true) {
            g.getClass();
            if (uj1Var == null) {
                qn1.b();
                return;
            }
            Unsafe unsafe = kr.a;
            long j2 = j;
            uj1 uj1Var3 = (uj1) unsafe.getObjectVolatile(uj1Var, j2);
            if (this.k() != uj1Var) {
                return;
            }
            while (uj1Var != null) {
                Unsafe unsafe2 = kr.a;
                uj1Var2 = this;
                uj1 uj1Var4 = uj1Var;
                if (unsafe2.compareAndSwapObject(uj1Var4, j, uj1Var3, uj1Var2)) {
                    if (uj1Var2.n()) {
                        uj1Var4.h();
                        return;
                    }
                    return;
                } else {
                    if (uj1Var4 == null) {
                        qn1.b();
                        return;
                    }
                    uj1Var = uj1Var4;
                    if (unsafe2.getObjectVolatile(uj1Var4, j2) != uj1Var3) {
                        break;
                    } else {
                        this = uj1Var2;
                    }
                }
            }
            qn1.b();
            return;
            this = uj1Var2;
        }
    }

    public final Object k() {
        f.getClass();
        return kr.a.getObjectVolatile(this, i);
    }

    public final uj1 l() {
        Object objK = k();
        dl2 dl2Var = objK instanceof dl2 ? (dl2) objK : null;
        if (dl2Var != null) {
            return dl2Var.a;
        }
        objK.getClass();
        return (uj1) objK;
    }

    public final uj1 m() {
        uj1 uj1VarH = h();
        if (uj1VarH != null) {
            return uj1VarH;
        }
        g.getClass();
        return i((uj1) kr.a.getObjectVolatile(this, j));
    }

    public boolean n() {
        return k() instanceof dl2;
    }

    public final uj1 o() {
        uj1 uj1Var;
        while (true) {
            Object objK = this.k();
            if (objK instanceof dl2) {
                return ((dl2) objK).a;
            }
            if (objK == this) {
                return (uj1) objK;
            }
            objK.getClass();
            uj1 uj1Var2 = (uj1) objK;
            dl2 dl2VarP = uj1Var2.p();
            while (true) {
                f.getClass();
                Unsafe unsafe = kr.a;
                long j2 = i;
                uj1Var = this;
                if (unsafe.compareAndSwapObject(uj1Var, j2, objK, dl2VarP)) {
                    uj1Var2.h();
                    return null;
                }
                if (unsafe.getObjectVolatile(uj1Var, j2) != objK) {
                    break;
                }
                this = uj1Var;
            }
            this = uj1Var;
        }
    }

    public final dl2 p() {
        h.getClass();
        Unsafe unsafe = kr.a;
        long j2 = k;
        dl2 dl2Var = (dl2) unsafe.getObjectVolatile(this, j2);
        if (dl2Var != null) {
            return dl2Var;
        }
        dl2 dl2Var2 = new dl2(this);
        unsafe.putObjectVolatile(this, j2, dl2Var2);
        return dl2Var2;
    }

    public String toString() {
        return new id1(1, 2, f80.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + f80.D(this);
    }
}
