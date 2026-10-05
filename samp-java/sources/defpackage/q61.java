package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public class q61 implements j61 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(q61.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater g;
    public static final /* synthetic */ long h;
    public static final /* synthetic */ long i;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Unsafe unsafe = kr.a;
        i = unsafe.objectFieldOffset(q61.class.getDeclaredField("_state$volatile"));
        g = AtomicReferenceFieldUpdater.newUpdater(q61.class, Object.class, "_parentHandle$volatile");
        h = unsafe.objectFieldOffset(q61.class.getDeclaredField("_parentHandle$volatile"));
    }

    public q61(boolean z) {
        this._state$volatile = z ? s51.s : s51.r;
    }

    public static nt b0(uj1 uj1Var) {
        while (uj1Var.n()) {
            uj1Var = uj1Var.m();
        }
        while (true) {
            uj1Var = uj1Var.l();
            if (!uj1Var.n()) {
                if (uj1Var instanceof nt) {
                    return (nt) uj1Var;
                }
                if (uj1Var instanceof gx1) {
                    return null;
                }
            }
        }
    }

    public static String k0(Object obj) {
        if (!(obj instanceof p61)) {
            return obj instanceof g11 ? ((g11) obj).b() ? "Active" : "New" : obj instanceof jz ? "Cancelled" : "Completed";
        }
        p61 p61Var = (p61) obj;
        return p61Var.f() ? "Cancelling" : p61.g.get(p61Var) == 1 ? "Completing" : "Active";
    }

    public void A(Object obj) {
        w(obj);
    }

    public final Object E(q40 q40Var) throws Throwable {
        Object objS;
        do {
            objS = S();
            if (!(objS instanceof g11)) {
                if (objS instanceof jz) {
                    throw ((jz) objS).a;
                }
                return s51.K(objS);
            }
        } while (j0(objS) < 0);
        n61 n61Var = new n61(vr.I(q40Var), this);
        n61Var.s();
        n61Var.w(new er(1, lq.K(this, true, new sn2(n61Var))));
        return n61Var.q();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
    
        r0 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c A[PHI: r0
      0x003c: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v9 java.lang.Object) binds: [B:3:0x0008, B:16:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean F(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q61.F(java.lang.Object):boolean");
    }

    public void G(CancellationException cancellationException) {
        F(cancellationException);
    }

    public final boolean H(Throwable th) {
        if (X()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        mt mtVarR = R();
        return (mtVarR == null || mtVarR == lx1.f) ? z : mtVarR.c(th) || z;
    }

    public String I() {
        return "Job was cancelled";
    }

    public boolean J(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return F(th) && O();
    }

    public final void K(g11 g11Var, Object obj) throws IllegalAccessException, InvocationTargetException {
        mt mtVarR = R();
        if (mtVarR != null) {
            mtVarR.a();
            i0(lx1.f);
        }
        kz kzVar = null;
        jz jzVar = obj instanceof jz ? (jz) obj : null;
        Throwable th = jzVar != null ? jzVar.a : null;
        if (g11Var instanceof m61) {
            try {
                ((m61) g11Var).s(th);
                return;
            } catch (Throwable th2) {
                U(new kz("Exception in completion handler " + g11Var + " for " + this, th2));
                return;
            }
        }
        gx1 gx1VarD = g11Var.d();
        if (gx1VarD != null) {
            gx1VarD.e(new bi1(1), 1);
            Object objK = gx1VarD.k();
            objK.getClass();
            for (uj1 uj1VarL = (uj1) objK; !uj1VarL.equals(gx1VarD); uj1VarL = uj1VarL.l()) {
                if (uj1VarL instanceof m61) {
                    try {
                        ((m61) uj1VarL).s(th);
                    } catch (Throwable th3) {
                        if (kzVar != null) {
                            uq.j(kzVar, th3);
                        } else {
                            kzVar = new kz("Exception in completion handler " + uj1VarL + " for " + this, th3);
                        }
                    }
                }
            }
            if (kzVar != null) {
                U(kzVar);
            }
        }
    }

    public final Throwable L(Object obj) {
        Throwable thE;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        q61 q61Var = (q61) obj;
        Object objS = q61Var.S();
        if (objS instanceof p61) {
            thE = ((p61) objS).e();
        } else if (objS instanceof jz) {
            thE = ((jz) objS).a;
        } else {
            if (objS instanceof g11) {
                c.h(objS, "Cannot be cancelling child in this state: ");
                return null;
            }
            thE = null;
        }
        CancellationException cancellationException = thE instanceof CancellationException ? (CancellationException) thE : null;
        return cancellationException == null ? new k61("Parent job is ".concat(k0(objS)), thE, q61Var) : cancellationException;
    }

    public final Object M(p61 p61Var, Object obj) throws Throwable {
        p61 p61Var2;
        Throwable th;
        Throwable thN;
        q61 q61Var;
        p61 p61Var3;
        jz jzVar = obj instanceof jz ? (jz) obj : null;
        Throwable th2 = jzVar != null ? jzVar.a : null;
        synchronized (p61Var) {
            try {
                p61Var.f();
                ArrayList arrayListG = p61Var.g(th2);
                thN = N(p61Var, arrayListG);
                if (thN != null) {
                    try {
                        if (arrayListG.size() > 1) {
                            Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListG.size()));
                            int size = arrayListG.size();
                            int i2 = 0;
                            while (i2 < size) {
                                Object obj2 = arrayListG.get(i2);
                                i2++;
                                Throwable th3 = (Throwable) obj2;
                                if (th3 != thN && th3 != thN && !(th3 instanceof CancellationException) && setNewSetFromMap.add(th3)) {
                                    uq.j(thN, th3);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        p61Var2 = p61Var;
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                p61Var2 = p61Var;
                th = th5;
            }
        }
        if (thN != null && thN != th2) {
            obj = new jz(thN, false);
        }
        if (thN != null && (H(thN) || T(thN))) {
            obj.getClass();
            jz.b.compareAndSet((jz) obj, 0, 1);
        }
        d0(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
        Object h11Var = obj instanceof g11 ? new h11((g11) obj) : obj;
        while (true) {
            atomicReferenceFieldUpdater.getClass();
            Unsafe unsafe = kr.a;
            long j = i;
            q61Var = this;
            p61Var3 = p61Var;
            if (unsafe.compareAndSwapObject(q61Var, j, p61Var3, h11Var) || unsafe.getObjectVolatile(q61Var, j) != p61Var3) {
                break;
            }
            this = q61Var;
            p61Var = p61Var3;
        }
        q61Var.K(p61Var3, obj);
        return obj;
    }

    public final Throwable N(p61 p61Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (p61Var.f()) {
                return new k61(I(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i3);
            i3++;
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof di3) {
            int size2 = arrayList.size();
            while (true) {
                if (i2 >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i2);
                i2++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof di3)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean O() {
        return true;
    }

    public boolean P() {
        return this instanceof gz;
    }

    public final gx1 Q(g11 g11Var) {
        gx1 gx1VarD = g11Var.d();
        if (gx1VarD != null) {
            return gx1VarD;
        }
        if (g11Var instanceof ii0) {
            return new gx1();
        }
        if (g11Var instanceof m61) {
            g0((m61) g11Var);
            return null;
        }
        c.h(g11Var, "State should have list: ");
        return null;
    }

    public final mt R() {
        g.getClass();
        return (mt) kr.a.getObjectVolatile(this, h);
    }

    public final Object S() {
        f.getClass();
        return kr.a.getObjectVolatile(this, i);
    }

    public boolean T(Throwable th) {
        return false;
    }

    public final void V(j61 j61Var) {
        lx1 lx1Var = lx1.f;
        if (j61Var == null) {
            i0(lx1Var);
            return;
        }
        j61Var.start();
        mt mtVarJ = j61Var.j(this);
        i0(mtVarJ);
        if (S() instanceof g11) {
            return;
        }
        mtVarJ.a();
        i0(lx1Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x008d, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.kc0 W(boolean r7, defpackage.m61 r8) {
        /*
            r6 = this;
            r8.l = r6
        L2:
            java.lang.Object r4 = r6.S()
            boolean r0 = r4 instanceof defpackage.ii0
            if (r0 == 0) goto L33
            r0 = r4
            ii0 r0 = (defpackage.ii0) r0
            boolean r1 = r0.f
            if (r1 == 0) goto L2d
        L11:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.q61.f
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.kr.a
            long r2 = defpackage.q61.i
            r1 = r6
            r5 = r8
            boolean r6 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r6 == 0) goto L23
            goto L74
        L23:
            java.lang.Object r6 = r0.getObjectVolatile(r1, r2)
            if (r6 == r4) goto L2a
            goto L75
        L2a:
            r6 = r1
            r8 = r5
            goto L11
        L2d:
            r1 = r6
            r5 = r8
            r1.f0(r0)
            goto L75
        L33:
            r1 = r6
            r5 = r8
            boolean r6 = r4 instanceof defpackage.g11
            lx1 r8 = defpackage.lx1.f
            r0 = 0
            if (r6 == 0) goto L78
            r6 = r4
            g11 r6 = (defpackage.g11) r6
            gx1 r2 = r6.d()
            if (r2 != 0) goto L4b
            m61 r4 = (defpackage.m61) r4
            r1.g0(r4)
            goto L75
        L4b:
            boolean r3 = r5.r()
            if (r3 == 0) goto L6d
            boolean r3 = r6 instanceof defpackage.p61
            if (r3 == 0) goto L58
            p61 r6 = (defpackage.p61) r6
            goto L59
        L58:
            r6 = r0
        L59:
            if (r6 == 0) goto L5f
            java.lang.Throwable r0 = r6.e()
        L5f:
            if (r0 != 0) goto L67
            r6 = 5
            boolean r6 = r2.e(r5, r6)
            goto L72
        L67:
            if (r7 == 0) goto L8d
            r5.s(r0)
            return r8
        L6d:
            r6 = 1
            boolean r6 = r2.e(r5, r6)
        L72:
            if (r6 == 0) goto L75
        L74:
            return r5
        L75:
            r6 = r1
            r8 = r5
            goto L2
        L78:
            if (r7 == 0) goto L8d
            java.lang.Object r6 = r1.S()
            boolean r7 = r6 instanceof defpackage.jz
            if (r7 == 0) goto L85
            jz r6 = (defpackage.jz) r6
            goto L86
        L85:
            r6 = r0
        L86:
            if (r6 == 0) goto L8a
            java.lang.Throwable r0 = r6.a
        L8a:
            r5.s(r0)
        L8d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q61.W(boolean, m61):kc0");
    }

    public boolean X() {
        return this instanceof an;
    }

    public final boolean Y(Object obj) throws IllegalAccessException, InvocationTargetException {
        Object objN0;
        do {
            objN0 = n0(S(), obj);
            if (objN0 == s51.m) {
                return false;
            }
            if (objN0 == s51.n) {
                return true;
            }
        } while (objN0 == s51.o);
        w(objN0);
        return true;
    }

    public final Object Z(Object obj) throws IllegalAccessException, InvocationTargetException {
        Object objN0;
        do {
            objN0 = n0(S(), obj);
            if (objN0 == s51.m) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                jz jzVar = obj instanceof jz ? (jz) obj : null;
                throw new IllegalStateException(str, jzVar != null ? jzVar.a : null);
            }
        } while (objN0 == s51.o);
        return objN0;
    }

    public String a0() {
        return getClass().getSimpleName();
    }

    @Override // defpackage.j61
    public boolean b() {
        Object objS = S();
        return (objS instanceof g11) && ((g11) objS).b();
    }

    @Override // defpackage.j61, defpackage.js
    public void c(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new k61(I(), null, this);
        }
        G(cancellationException);
    }

    public final void c0(gx1 gx1Var, Throwable th) throws IllegalAccessException, InvocationTargetException {
        gx1Var.e(new bi1(4), 4);
        Object objK = gx1Var.k();
        objK.getClass();
        kz kzVar = null;
        for (uj1 uj1VarL = (uj1) objK; !uj1VarL.equals(gx1Var); uj1VarL = uj1VarL.l()) {
            if ((uj1VarL instanceof m61) && ((m61) uj1VarL).r()) {
                try {
                    ((m61) uj1VarL).s(th);
                } catch (Throwable th2) {
                    if (kzVar != null) {
                        uq.j(kzVar, th2);
                    } else {
                        kzVar = new kz("Exception in completion handler " + uj1VarL + " for " + this, th2);
                    }
                }
            }
        }
        if (kzVar != null) {
            U(kzVar);
        }
        H(th);
    }

    public Object f(ys1 ys1Var) {
        return E(ys1Var);
    }

    public final void f0(ii0 ii0Var) {
        gx1 gx1Var = new gx1();
        Object f11Var = ii0Var.f ? gx1Var : new f11(gx1Var);
        while (true) {
            f.getClass();
            Unsafe unsafe = kr.a;
            long j = i;
            q61 q61Var = this;
            ii0 ii0Var2 = ii0Var;
            if (unsafe.compareAndSwapObject(q61Var, j, ii0Var2, f11Var) || unsafe.getObjectVolatile(q61Var, j) != ii0Var2) {
                return;
            }
            this = q61Var;
            ii0Var = ii0Var2;
        }
    }

    public final void g0(m61 m61Var) {
        m61Var.g(new gx1());
        uj1 uj1VarL = m61Var.l();
        while (true) {
            f.getClass();
            Unsafe unsafe = kr.a;
            long j = i;
            q61 q61Var = this;
            m61 m61Var2 = m61Var;
            if (unsafe.compareAndSwapObject(q61Var, j, m61Var2, uj1VarL) || unsafe.getObjectVolatile(q61Var, j) != m61Var2) {
                return;
            }
            this = q61Var;
            m61Var = m61Var2;
        }
    }

    @Override // defpackage.m50
    public final n50 getKey() {
        return f5.b0;
    }

    public final void h0(m61 m61Var) {
        q61 q61Var;
        while (true) {
            Object objS = this.S();
            if (!(objS instanceof m61)) {
                if (!(objS instanceof g11) || ((g11) objS).d() == null) {
                    return;
                }
                m61Var.o();
                return;
            }
            if (objS != m61Var) {
                return;
            }
            ii0 ii0Var = s51.s;
            while (true) {
                f.getClass();
                Unsafe unsafe = kr.a;
                long j = i;
                q61Var = this;
                if (unsafe.compareAndSwapObject(q61Var, j, objS, ii0Var)) {
                    return;
                }
                if (unsafe.getObjectVolatile(q61Var, j) != objS) {
                    break;
                } else {
                    this = q61Var;
                }
            }
            this = q61Var;
        }
    }

    public final void i0(mt mtVar) {
        g.getClass();
        kr.a.putObjectVolatile(this, h, mtVar);
    }

    @Override // defpackage.j61
    public final boolean isCancelled() {
        Object objS = S();
        if (objS instanceof jz) {
            return true;
        }
        return (objS instanceof p61) && ((p61) objS).f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        return r5;
     */
    @Override // defpackage.j61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.mt j(defpackage.q61 r7) {
        /*
            r6 = this;
            nt r5 = new nt
            r5.<init>(r7)
            r5.l = r6
        L7:
            java.lang.Object r4 = r6.S()
            boolean r7 = r4 instanceof defpackage.ii0
            if (r7 == 0) goto L35
            r7 = r4
            ii0 r7 = (defpackage.ii0) r7
            boolean r0 = r7.f
            if (r0 == 0) goto L30
        L16:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = defpackage.q61.f
            r7.getClass()
            sun.misc.Unsafe r0 = defpackage.kr.a
            long r2 = defpackage.q61.i
            r1 = r6
            boolean r6 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r6 == 0) goto L27
            goto L7a
        L27:
            java.lang.Object r6 = r0.getObjectVolatile(r1, r2)
            if (r6 == r4) goto L2e
            goto L4b
        L2e:
            r6 = r1
            goto L16
        L30:
            r1 = r6
            r1.f0(r7)
            goto L4b
        L35:
            r1 = r6
            boolean r6 = r4 instanceof defpackage.g11
            lx1 r7 = defpackage.lx1.f
            r0 = 0
            if (r6 == 0) goto L7c
            r6 = r4
            g11 r6 = (defpackage.g11) r6
            gx1 r6 = r6.d()
            if (r6 != 0) goto L4d
            m61 r4 = (defpackage.m61) r4
            r1.g0(r4)
        L4b:
            r6 = r1
            goto L7
        L4d:
            r2 = 7
            boolean r2 = r6.e(r5, r2)
            if (r2 == 0) goto L55
            goto L7a
        L55:
            r2 = 3
            boolean r6 = r6.e(r5, r2)
            java.lang.Object r1 = r1.S()
            boolean r2 = r1 instanceof defpackage.p61
            if (r2 == 0) goto L69
            p61 r1 = (defpackage.p61) r1
            java.lang.Throwable r0 = r1.e()
            goto L75
        L69:
            boolean r2 = r1 instanceof defpackage.jz
            if (r2 == 0) goto L70
            jz r1 = (defpackage.jz) r1
            goto L71
        L70:
            r1 = r0
        L71:
            if (r1 == 0) goto L75
            java.lang.Throwable r0 = r1.a
        L75:
            r5.s(r0)
            if (r6 == 0) goto L7b
        L7a:
            return r5
        L7b:
            return r7
        L7c:
            java.lang.Object r6 = r1.S()
            boolean r1 = r6 instanceof defpackage.jz
            if (r1 == 0) goto L87
            jz r6 = (defpackage.jz) r6
            goto L88
        L87:
            r6 = r0
        L88:
            if (r6 == 0) goto L8c
            java.lang.Throwable r0 = r6.a
        L8c:
            r5.s(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q61.j(q61):mt");
    }

    public final int j0(Object obj) {
        Unsafe unsafe;
        Unsafe unsafe2;
        boolean z = obj instanceof ii0;
        long j = i;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
        if (z) {
            if (((ii0) obj).f) {
                return 0;
            }
            ii0 ii0Var = s51.s;
            do {
                atomicReferenceFieldUpdater.getClass();
                unsafe2 = kr.a;
                if (unsafe2.compareAndSwapObject(this, i, obj, ii0Var)) {
                    e0();
                    return 1;
                }
            } while (unsafe2.getObjectVolatile(this, j) == obj);
            return -1;
        }
        if (!(obj instanceof f11)) {
            return 0;
        }
        gx1 gx1Var = ((f11) obj).f;
        do {
            atomicReferenceFieldUpdater.getClass();
            unsafe = kr.a;
            if (unsafe.compareAndSwapObject(this, i, obj, gx1Var)) {
                e0();
                return 1;
            }
        } while (unsafe.getObjectVolatile(this, j) == obj);
        return -1;
    }

    @Override // defpackage.o50
    public final o50 k(o50 o50Var) {
        return pq.Q(this, o50Var);
    }

    public final boolean l0(g11 g11Var, Object obj) throws IllegalAccessException, InvocationTargetException {
        Object h11Var = obj instanceof g11 ? new h11((g11) obj) : obj;
        while (true) {
            f.getClass();
            Unsafe unsafe = kr.a;
            long j = i;
            q61 q61Var = this;
            g11 g11Var2 = g11Var;
            if (unsafe.compareAndSwapObject(q61Var, j, g11Var2, h11Var)) {
                q61Var.d0(obj);
                q61Var.K(g11Var2, obj);
                return true;
            }
            if (unsafe.getObjectVolatile(q61Var, j) != g11Var2) {
                return false;
            }
            this = q61Var;
            g11Var = g11Var2;
        }
    }

    @Override // defpackage.o50
    public final m50 m(n50 n50Var) {
        return pq.t(this, n50Var);
    }

    public final boolean m0(g11 g11Var, Throwable th) throws IllegalAccessException, InvocationTargetException {
        gx1 gx1VarQ = Q(g11Var);
        if (gx1VarQ == null) {
            return false;
        }
        p61 p61Var = new p61(gx1VarQ, th);
        while (true) {
            f.getClass();
            Unsafe unsafe = kr.a;
            long j = i;
            q61 q61Var = this;
            g11 g11Var2 = g11Var;
            if (unsafe.compareAndSwapObject(q61Var, j, g11Var2, p61Var)) {
                q61Var.c0(gx1VarQ, th);
                return true;
            }
            if (unsafe.getObjectVolatile(q61Var, j) != g11Var2) {
                return false;
            }
            this = q61Var;
            g11Var = g11Var2;
        }
    }

    public final Object n0(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
        if (!(obj instanceof g11)) {
            return s51.m;
        }
        if (((obj instanceof ii0) || (obj instanceof m61)) && !(obj instanceof nt) && !(obj2 instanceof jz)) {
            return l0((g11) obj, obj2) ? obj2 : s51.o;
        }
        g11 g11Var = (g11) obj;
        gx1 gx1VarQ = Q(g11Var);
        if (gx1VarQ == null) {
            return s51.o;
        }
        p61 p61Var = g11Var instanceof p61 ? (p61) g11Var : null;
        if (p61Var == null) {
            p61Var = new p61(gx1VarQ, null);
        }
        synchronized (p61Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = p61.g;
            if (atomicIntegerFieldUpdater.get(p61Var) == 1) {
                return s51.m;
            }
            atomicIntegerFieldUpdater.set(p61Var, 1);
            if (p61Var != g11Var) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, g11Var, p61Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != g11Var) {
                        return s51.o;
                    }
                }
            }
            boolean zF = p61Var.f();
            jz jzVar = obj2 instanceof jz ? (jz) obj2 : null;
            if (jzVar != null) {
                p61Var.a(jzVar.a);
            }
            Throwable thE = zF ? null : p61Var.e();
            if (thE != null) {
                c0(gx1VarQ, thE);
            }
            nt ntVarB0 = b0(gx1VarQ);
            if (ntVarB0 != null && o0(p61Var, ntVarB0, obj2)) {
                return s51.n;
            }
            gx1VarQ.e(new bi1(2), 2);
            nt ntVarB02 = b0(gx1VarQ);
            return (ntVarB02 == null || !o0(p61Var, ntVarB02, obj2)) ? M(p61Var, obj2) : s51.n;
        }
    }

    @Override // defpackage.j61
    public final CancellationException o() {
        CancellationException cancellationException;
        Object objS = S();
        if (objS instanceof p61) {
            Throwable thE = ((p61) objS).e();
            if (thE == null) {
                c.h(this, "Job is still new or active: ");
                return null;
            }
            String strConcat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = thE instanceof CancellationException ? (CancellationException) thE : null;
            return cancellationException == null ? new k61(strConcat, thE, this) : cancellationException;
        }
        if (objS instanceof g11) {
            c.h(this, "Job is still new or active: ");
            return null;
        }
        if (!(objS instanceof jz)) {
            return new k61(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        Throwable th = ((jz) objS).a;
        cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new k61(I(), th, this) : cancellationException;
    }

    public final boolean o0(p61 p61Var, nt ntVar, Object obj) {
        while (lq.K(ntVar.m, false, new o61(this, p61Var, ntVar, obj)) == lx1.f) {
            ntVar = b0(ntVar);
            if (ntVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.o50
    public final Object p(rs0 rs0Var, Object obj) {
        return rs0Var.f(obj, this);
    }

    @Override // defpackage.j61
    public final kc0 r(ns0 ns0Var) {
        return W(true, new f61(ns0Var));
    }

    @Override // defpackage.j61
    public final boolean start() {
        int iJ0;
        do {
            iJ0 = j0(S());
            if (iJ0 == 0) {
                return false;
            }
        } while (iJ0 != 1);
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(a0() + '{' + k0(S()) + '}');
        sb.append('@');
        sb.append(f80.D(this));
        return sb.toString();
    }

    @Override // defpackage.o50
    public final o50 u(n50 n50Var) {
        return pq.M(this, n50Var);
    }

    @Override // defpackage.j61
    public final Object x(q40 q40Var) {
        Object objS;
        dm3 dm3Var;
        do {
            objS = S();
            boolean z = objS instanceof g11;
            dm3Var = dm3.a;
            if (!z) {
                lq.r(q40Var.i());
                return dm3Var;
            }
        } while (j0(objS) < 0);
        jr jrVar = new jr(1, vr.I(q40Var));
        jrVar.s();
        jrVar.w(new er(1, lq.K(this, true, new tn2(jrVar))));
        Object objQ = jrVar.q();
        y50 y50Var = y50.f;
        if (objQ != y50Var) {
            objQ = dm3Var;
        }
        return objQ == y50Var ? objQ : dm3Var;
    }

    @Override // defpackage.j61
    public final kc0 z(boolean z, boolean z2, k kVar) {
        return W(z2, z ? new e61(kVar) : new f61(kVar));
    }

    public void e0() {
    }

    public void U(kz kzVar) {
        throw kzVar;
    }

    public void d0(Object obj) {
    }

    public void w(Object obj) {
    }
}
