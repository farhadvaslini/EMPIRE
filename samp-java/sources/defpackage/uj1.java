package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.gx1 r10) {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.uj1.g
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.kr.a
            long r1 = defpackage.uj1.j
            r0.putObjectVolatile(r10, r1, r9)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = defpackage.uj1.f
            r1.getClass()
            long r1 = defpackage.uj1.i
            r0.putObjectVolatile(r10, r1, r9)
        L16:
            java.lang.Object r0 = r9.k()
            if (r0 == r9) goto L1d
            return
        L1d:
            sun.misc.Unsafe r3 = defpackage.kr.a
            long r5 = defpackage.uj1.i
            r7 = r9
            r4 = r9
            r8 = r10
            boolean r9 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r9 == 0) goto L2e
            r8.j(r4)
            return
        L2e:
            java.lang.Object r9 = r3.getObjectVolatile(r4, r1)
            if (r9 == r4) goto L37
            r9 = r4
            r10 = r8
            goto L16
        L37:
            r9 = r4
            r10 = r8
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uj1.g(gx1):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.uj1 h() {
        /*
            r15 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.uj1.g
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.kr.a
            long r1 = defpackage.uj1.j
            java.lang.Object r0 = r0.getObjectVolatile(r15, r1)
            r7 = r0
            uj1 r7 = (defpackage.uj1) r7
            r0 = 0
            r9 = r0
            r8 = r7
        L13:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = defpackage.uj1.f
            r3.getClass()
            if (r8 == 0) goto L85
            sun.misc.Unsafe r3 = defpackage.kr.a
            long r4 = defpackage.uj1.i
            java.lang.Object r6 = r3.getObjectVolatile(r8, r4)
            if (r6 != r15) goto L40
            if (r7 != r8) goto L27
            goto L34
        L27:
            sun.misc.Unsafe r3 = defpackage.kr.a
            long r5 = defpackage.uj1.j
            r4 = r15
            boolean r15 = r3.compareAndSwapObject(r4, r5, r7, r8)
            r14 = r7
            r7 = r4
            if (r15 == 0) goto L35
        L34:
            return r8
        L35:
            java.lang.Object r15 = r3.getObjectVolatile(r7, r1)
            if (r15 == r14) goto L3d
        L3b:
            r15 = r7
            goto L0
        L3d:
            r15 = r7
            r7 = r14
            goto L27
        L40:
            r14 = r7
            r7 = r15
            boolean r15 = r7.n()
            if (r15 == 0) goto L49
            return r0
        L49:
            boolean r15 = r6 instanceof defpackage.dl2
            if (r15 == 0) goto L7c
            if (r9 == 0) goto L6c
            dl2 r6 = (defpackage.dl2) r6
            uj1 r13 = r6.a
        L53:
            r12 = r8
            sun.misc.Unsafe r8 = defpackage.kr.a
            long r10 = defpackage.uj1.i
            boolean r15 = r8.compareAndSwapObject(r9, r10, r12, r13)
            r3 = r8
            r8 = r12
            if (r15 == 0) goto L65
            r15 = r7
            r8 = r9
            r7 = r14
            r9 = r0
            goto L13
        L65:
            java.lang.Object r15 = r3.getObjectVolatile(r9, r4)
            if (r15 == r8) goto L53
            goto L3b
        L6c:
            if (r8 == 0) goto L78
            java.lang.Object r15 = r3.getObjectVolatile(r8, r1)
            r8 = r15
            uj1 r8 = (defpackage.uj1) r8
        L75:
            r15 = r7
            r7 = r14
            goto L13
        L78:
            defpackage.qn1.b()
            return r0
        L7c:
            r6.getClass()
            r15 = r6
            uj1 r15 = (defpackage.uj1) r15
            r9 = r8
            r8 = r15
            goto L75
        L85:
            defpackage.qn1.b()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uj1.h():uj1");
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
