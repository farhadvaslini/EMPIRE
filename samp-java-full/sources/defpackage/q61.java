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
/* JADX INFO: loaded from: classes.dex */
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
    */
    public final boolean F(Object obj) {
        ai0 ai0Var;
        Object objN0 = s51.m;
        if (P()) {
            do {
                Object objS = S();
                if (objS instanceof g11) {
                    if (objS instanceof p61) {
                        if (p61.g.get((p61) objS) == 1) {
                        }
                    }
                    objN0 = n0(objS, new jz(L(obj), false));
                }
                objN0 = s51.m;
                break;
            } while (objN0 == s51.o);
            if (objN0 != s51.n) {
                if (objN0 == s51.m) {
                    Throwable thL = null;
                    while (true) {
                        Object objS2 = S();
                        if (!(objS2 instanceof p61)) {
                            if (!(objS2 instanceof g11)) {
                                ai0Var = s51.p;
                                break;
                            }
                            if (thL == null) {
                                thL = L(obj);
                            }
                            g11 g11Var = (g11) objS2;
                            if (!g11Var.b()) {
                                Object objN02 = n0(objS2, new jz(thL, false));
                                if (objN02 == s51.m) {
                                    c.h(objS2, "Cannot happen in ");
                                    return false;
                                }
                                if (objN02 != s51.o) {
                                    objN0 = objN02;
                                    break;
                                }
                            } else if (m0(g11Var, thL)) {
                                ai0Var = s51.m;
                                break;
                            }
                        } else {
                            synchronized (objS2) {
                                if (((p61) objS2).c() == s51.q) {
                                    ai0Var = s51.p;
                                } else {
                                    boolean zF = ((p61) objS2).f();
                                    if (thL == null) {
                                        thL = L(obj);
                                    }
                                    ((p61) objS2).a(thL);
                                    Throwable thE = zF ? null : ((p61) objS2).e();
                                    if (thE != null) {
                                        c0(((p61) objS2).f, thE);
                                    }
                                    ai0Var = s51.m;
                                }
                            }
                        }
                    }
                }
                if (objN0 != s51.m && objN0 != s51.n) {
                    if (objN0 == s51.p) {
                        return false;
                    }
                    w(objN0);
                    return true;
                }
            }
        }
        return true;
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
    */
    public final kc0 W(boolean z, m61 m61Var) {
        q61 q61Var;
        m61 m61Var2;
        boolean zE;
        m61Var.l = this;
        loop0: while (true) {
            Object objS = this.S();
            if (objS instanceof ii0) {
                ii0 ii0Var = (ii0) objS;
                if (ii0Var.f) {
                    while (true) {
                        f.getClass();
                        Unsafe unsafe = kr.a;
                        long j = i;
                        q61Var = this;
                        m61Var2 = m61Var;
                        if (unsafe.compareAndSwapObject(q61Var, j, objS, m61Var2)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(q61Var, j) != objS) {
                            break;
                        }
                        this = q61Var;
                        m61Var = m61Var2;
                    }
                } else {
                    q61Var = this;
                    m61Var2 = m61Var;
                    q61Var.f0(ii0Var);
                }
                this = q61Var;
                m61Var = m61Var2;
            } else {
                q61Var = this;
                m61Var2 = m61Var;
                boolean z2 = objS instanceof g11;
                lx1 lx1Var = lx1.f;
                if (z2) {
                    g11 g11Var = (g11) objS;
                    gx1 gx1VarD = g11Var.d();
                    if (gx1VarD == null) {
                        q61Var.g0((m61) objS);
                    } else {
                        if (m61Var2.r()) {
                            p61 p61Var = g11Var instanceof p61 ? (p61) g11Var : null;
                            Throwable thE = p61Var != null ? p61Var.e() : null;
                            if (thE == null) {
                                zE = gx1VarD.e(m61Var2, 5);
                            } else if (z) {
                                m61Var2.s(thE);
                                return lx1Var;
                            }
                        } else {
                            zE = gx1VarD.e(m61Var2, 1);
                        }
                        if (zE) {
                            break;
                        }
                    }
                    this = q61Var;
                    m61Var = m61Var2;
                } else if (z) {
                    Object objS2 = q61Var.S();
                    jz jzVar = objS2 instanceof jz ? (jz) objS2 : null;
                    m61Var2.s(jzVar != null ? jzVar.a : null);
                }
            }
        }
        return m61Var2;
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
    */
    public final mt j(q61 q61Var) {
        q61 q61Var2;
        nt ntVar = new nt(q61Var);
        ntVar.l = this;
        loop0: while (true) {
            Object objS = this.S();
            if (objS instanceof ii0) {
                ii0 ii0Var = (ii0) objS;
                if (ii0Var.f) {
                    while (true) {
                        f.getClass();
                        Unsafe unsafe = kr.a;
                        long j = i;
                        q61Var2 = this;
                        if (unsafe.compareAndSwapObject(q61Var2, j, objS, ntVar)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(q61Var2, j) != objS) {
                            break;
                        }
                        this = q61Var2;
                    }
                } else {
                    q61Var2 = this;
                    q61Var2.f0(ii0Var);
                }
                this = q61Var2;
            } else {
                q61Var2 = this;
                boolean z = objS instanceof g11;
                lx1 lx1Var = lx1.f;
                if (!z) {
                    Object objS2 = q61Var2.S();
                    jz jzVar = objS2 instanceof jz ? (jz) objS2 : null;
                    ntVar.s(jzVar != null ? jzVar.a : null);
                    return lx1Var;
                }
                gx1 gx1VarD = ((g11) objS).d();
                if (gx1VarD == null) {
                    q61Var2.g0((m61) objS);
                    this = q61Var2;
                } else if (!gx1VarD.e(ntVar, 7)) {
                    boolean zE = gx1VarD.e(ntVar, 3);
                    Object objS3 = q61Var2.S();
                    if (objS3 instanceof p61) {
                        thE = ((p61) objS3).e();
                    } else {
                        jz jzVar2 = objS3 instanceof jz ? (jz) objS3 : null;
                        if (jzVar2 != null) {
                            thE = jzVar2.a;
                        }
                    }
                    ntVar.s(thE);
                    if (zE) {
                        break loop0;
                    }
                    return lx1Var;
                }
            }
        }
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
