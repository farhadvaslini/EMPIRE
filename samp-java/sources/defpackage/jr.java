package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public class jr extends yb0 implements hr, z50, or3 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater k = AtomicIntegerFieldUpdater.newUpdater(jr.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater l = AtomicReferenceFieldUpdater.newUpdater(jr.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater m;
    public static final /* synthetic */ long n;
    public static final /* synthetic */ long o;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final p40 i;
    public final o50 j;

    static {
        Unsafe unsafe = kr.a;
        o = unsafe.objectFieldOffset(jr.class.getDeclaredField("_state$volatile"));
        m = AtomicReferenceFieldUpdater.newUpdater(jr.class, Object.class, "_parentHandle$volatile");
        n = unsafe.objectFieldOffset(jr.class.getDeclaredField("_parentHandle$volatile"));
    }

    public jr(int i, p40 p40Var) {
        super(i);
        this.i = p40Var;
        this.j = p40Var.i();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = f3.a;
    }

    public static Object I(qx1 qx1Var, Object obj, int i, ss0 ss0Var) {
        if (obj instanceof jz) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (ss0Var != null || (qx1Var instanceof er)) {
            return new hz(obj, qx1Var instanceof er ? (er) qx1Var : null, ss0Var, (Throwable) null, 16);
        }
        return obj;
    }

    public static void z(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public String A() {
        return "CancellableContinuation";
    }

    @Override // defpackage.hr
    public final ai0 B(Object obj, ss0 ss0Var) {
        return J(obj, ss0Var);
    }

    @Override // defpackage.hr
    public final boolean C(Throwable th) {
        Throwable cancellationException;
        jr jrVar;
        while (true) {
            l.getClass();
            Unsafe unsafe = kr.a;
            long j = o;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof qx1)) {
                return false;
            }
            boolean z = (objectVolatile instanceof er) || (objectVolatile instanceof kt2);
            if (th == null) {
                cancellationException = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                cancellationException = th;
            }
            nr nrVar = new nr(cancellationException, z);
            while (true) {
                Unsafe unsafe2 = kr.a;
                jrVar = this;
                if (unsafe2.compareAndSwapObject(jrVar, o, objectVolatile, nrVar)) {
                    qx1 qx1Var = (qx1) objectVolatile;
                    if (qx1Var instanceof er) {
                        jrVar.j((er) objectVolatile, th);
                    } else if (qx1Var instanceof kt2) {
                        jrVar.l((kt2) objectVolatile, th);
                    }
                    if (!jrVar.x()) {
                        jrVar.m();
                    }
                    jrVar.n(jrVar.h);
                    return true;
                }
                if (unsafe2.getObjectVolatile(jrVar, j) != objectVolatile) {
                    break;
                }
                this = jrVar;
            }
            this = jrVar;
        }
    }

    @Override // defpackage.hr
    public final void D(Object obj) throws vb0 {
        n(this.h);
    }

    public final void E() {
        Throwable thO;
        p40 p40Var = this.i;
        wb0 wb0Var = p40Var instanceof wb0 ? (wb0) p40Var : null;
        if (wb0Var == null || (thO = wb0Var.o(this)) == null) {
            return;
        }
        m();
        C(thO);
    }

    public final boolean F() {
        l.getClass();
        Unsafe unsafe = kr.a;
        long j = o;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if ((objectVolatile instanceof hz) && ((hz) objectVolatile).d != null) {
            m();
            return false;
        }
        k.set(this, 536870911);
        unsafe.putObjectVolatile(this, j, f3.a);
        return true;
    }

    public final void G(Object obj, int i, ss0 ss0Var) throws vb0 {
        jr jrVar;
        while (true) {
            l.getClass();
            Unsafe unsafe = kr.a;
            long j = o;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof qx1)) {
                jr jrVar2 = this;
                if (objectVolatile instanceof nr) {
                    nr nrVar = (nr) objectVolatile;
                    if (nr.c.compareAndSet(nrVar, 0, 1)) {
                        if (ss0Var != null) {
                            jrVar2.k(ss0Var, nrVar.a, obj);
                            return;
                        }
                        return;
                    }
                }
                c.h(obj, "Already resumed, but proposed with update ");
                return;
            }
            Object objI = I((qx1) objectVolatile, obj, i, ss0Var);
            while (true) {
                Unsafe unsafe2 = kr.a;
                jrVar = this;
                if (unsafe2.compareAndSwapObject(jrVar, o, objectVolatile, objI)) {
                    if (!jrVar.x()) {
                        jrVar.m();
                    }
                    jrVar.n(i);
                    return;
                } else if (unsafe2.getObjectVolatile(jrVar, j) != objectVolatile) {
                    break;
                } else {
                    this = jrVar;
                }
            }
            this = jrVar;
        }
    }

    public final void H(q50 q50Var) throws vb0 {
        p40 p40Var = this.i;
        wb0 wb0Var = p40Var instanceof wb0 ? (wb0) p40Var : null;
        G(dm3.a, (wb0Var != null ? wb0Var.i : null) == q50Var ? 4 : this.h, null);
    }

    public final ai0 J(Object obj, ss0 ss0Var) {
        jr jrVar;
        ai0 ai0Var = gv3.i;
        while (true) {
            l.getClass();
            Unsafe unsafe = kr.a;
            long j = o;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof qx1)) {
                return null;
            }
            Object objI = I((qx1) objectVolatile, obj, this.h, ss0Var);
            while (true) {
                Unsafe unsafe2 = kr.a;
                jrVar = this;
                if (unsafe2.compareAndSwapObject(jrVar, o, objectVolatile, objI)) {
                    if (!jrVar.x()) {
                        jrVar.m();
                    }
                    return ai0Var;
                }
                if (unsafe2.getObjectVolatile(jrVar, j) != objectVolatile) {
                    break;
                }
                this = jrVar;
            }
            this = jrVar;
        }
    }

    @Override // defpackage.or3
    public final void a(kt2 kt2Var, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = k;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                c.q("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        w(kt2Var);
    }

    @Override // defpackage.yb0
    public final void b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        jr jrVar;
        while (true) {
            l.getClass();
            Unsafe unsafe = kr.a;
            long j = o;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile instanceof qx1) {
                c.q("Not completed");
                return;
            }
            if (objectVolatile instanceof jz) {
                return;
            }
            if (objectVolatile instanceof hz) {
                hz hzVar = (hz) objectVolatile;
                if (hzVar.e != null) {
                    c.q("Must be called at most once");
                    return;
                }
                hz hzVarA = hz.a(hzVar, null, cancellationException, 15);
                while (true) {
                    Unsafe unsafe2 = kr.a;
                    jr jrVar2 = this;
                    if (unsafe2.compareAndSwapObject(jrVar2, o, objectVolatile, hzVarA)) {
                        er erVar = hzVar.b;
                        if (erVar != null) {
                            jrVar2.j(erVar, cancellationException);
                        }
                        ss0 ss0Var = hzVar.c;
                        if (ss0Var != null) {
                            jrVar2.k(ss0Var, cancellationException, hzVar.a);
                            return;
                        }
                        return;
                    }
                    if (unsafe2.getObjectVolatile(jrVar2, j) != objectVolatile) {
                        cancellationException2 = cancellationException;
                        jrVar = jrVar2;
                        break;
                    }
                    this = jrVar2;
                }
            } else {
                jr jrVar3 = this;
                CancellationException cancellationException3 = cancellationException;
                hz hzVar2 = new hz(objectVolatile, (er) null, (ss0) null, cancellationException3, 14);
                cancellationException2 = cancellationException3;
                while (true) {
                    hz hzVar3 = hzVar2;
                    Unsafe unsafe3 = kr.a;
                    jrVar = jrVar3;
                    boolean zCompareAndSwapObject = unsafe3.compareAndSwapObject(jrVar, o, objectVolatile, hzVar3);
                    hzVar2 = hzVar3;
                    if (zCompareAndSwapObject) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(jrVar, j) != objectVolatile) {
                        break;
                    } else {
                        jrVar3 = jrVar;
                    }
                }
            }
            cancellationException = cancellationException2;
            this = jrVar;
        }
    }

    @Override // defpackage.yb0
    public final p40 c() {
        return this.i;
    }

    @Override // defpackage.z50
    public final z50 d() {
        p40 p40Var = this.i;
        if (p40Var instanceof z50) {
            return (z50) p40Var;
        }
        return null;
    }

    @Override // defpackage.yb0
    public final Throwable e(Object obj) {
        Throwable thE = super.e(obj);
        if (thE != null) {
            return thE;
        }
        return null;
    }

    @Override // defpackage.yb0
    public final Object f(Object obj) {
        return obj instanceof hz ? ((hz) obj).a : obj;
    }

    @Override // defpackage.yb0
    public final Object h() {
        return r();
    }

    @Override // defpackage.p40
    public final o50 i() {
        return this.j;
    }

    public final void j(er erVar, Throwable th) {
        try {
            switch (erVar.a) {
                case 0:
                    ((ns0) erVar.b).h(th);
                    break;
                default:
                    ((kc0) erVar.b).a();
                    break;
            }
        } catch (Throwable th2) {
            lr.K(this.j, new kz("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void k(ss0 ss0Var, Throwable th, Object obj) {
        o50 o50Var = this.j;
        try {
            ss0Var.e(th, obj, o50Var);
        } catch (Throwable th2) {
            lr.K(o50Var, new kz("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void l(kt2 kt2Var, Throwable th) {
        o50 o50Var = this.j;
        int i = k.get(this) & 536870911;
        if (i == 536870911) {
            c.q("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            kt2Var.l(i, o50Var);
        } catch (Throwable th2) {
            lr.K(o50Var, new kz("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void m() {
        kc0 kc0VarP = p();
        if (kc0VarP == null) {
            return;
        }
        kc0VarP.a();
        m.getClass();
        kr.a.putObjectVolatile(this, n, lx1.f);
    }

    public final void n(int i) throws vb0 {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = k;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    c.q("Already resumed");
                    return;
                }
                boolean z = i == 4;
                p40 p40Var = this.i;
                if (!z && (p40Var instanceof wb0)) {
                    boolean z2 = i == 1 || i == 2;
                    int i4 = this.h;
                    if (z2 == (i4 == 1 || i4 == 2)) {
                        wb0 wb0Var = (wb0) p40Var;
                        q50 q50Var = wb0Var.i;
                        o50 o50VarI = wb0Var.j.i();
                        if (s51.C(q50Var, o50VarI)) {
                            s51.B(q50Var, o50VarI, this);
                            return;
                        }
                        qj0 qj0VarA = qh3.a();
                        if (qj0VarA.h >= 4294967296L) {
                            qj0VarA.G(this);
                            return;
                        }
                        qj0VarA.H(true);
                        try {
                            ur.N(this, p40Var, true);
                            do {
                            } while (qj0VarA.J());
                        } finally {
                            try {
                            } finally {
                            }
                        }
                        return;
                    }
                }
                ur.N(this, p40Var, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    public Throwable o(q61 q61Var) {
        return q61Var.o();
    }

    public final kc0 p() {
        m.getClass();
        return (kc0) kr.a.getObjectVolatile(this, n);
    }

    public final Object q() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        j61 j61Var;
        boolean zX = x();
        do {
            atomicIntegerFieldUpdater = k;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    c.q("Already suspended");
                    return null;
                }
                if (zX) {
                    E();
                }
                Object objR = r();
                if (objR instanceof jz) {
                    throw ((jz) objR).a;
                }
                int i3 = this.h;
                if ((i3 != 1 && i3 != 2) || (j61Var = (j61) this.j.m(f5.b0)) == null || j61Var.b()) {
                    return f(objR);
                }
                CancellationException cancellationExceptionO = j61Var.o();
                b(cancellationExceptionO);
                throw cancellationExceptionO;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (p() == null) {
            u();
        }
        if (zX) {
            E();
        }
        return y50.f;
    }

    public final Object r() {
        l.getClass();
        return kr.a.getObjectVolatile(this, o);
    }

    public final void s() {
        kc0 kc0VarU = u();
        if (kc0VarU == null || (r() instanceof qx1)) {
            return;
        }
        kc0VarU.a();
        m.getClass();
        kr.a.putObjectVolatile(this, n, lx1.f);
    }

    @Override // defpackage.p40
    public final void t(Object obj) {
        Throwable thA = rn2.a(obj);
        if (thA != null) {
            obj = new jz(thA, false);
        }
        G(obj, this.h, null);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(A());
        sb.append('(');
        sb.append(f80.T(this.i));
        sb.append("){");
        Object objR = r();
        sb.append(objR instanceof qx1 ? "Active" : objR instanceof nr ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(f80.D(this));
        return sb.toString();
    }

    public final kc0 u() {
        j61 j61Var = (j61) this.j.m(f5.b0);
        if (j61Var == null) {
            return null;
        }
        kc0 kc0VarK = lq.K(j61Var, true, new lt(this));
        while (true) {
            m.getClass();
            Unsafe unsafe = kr.a;
            long j = n;
            jr jrVar = this;
            if (unsafe.compareAndSwapObject(jrVar, j, (Object) null, kc0VarK) || unsafe.getObjectVolatile(jrVar, j) != null) {
                break;
            }
            this = jrVar;
        }
        return kc0VarK;
    }

    public final void v(ns0 ns0Var) {
        w(new er(0, ns0Var));
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ce, code lost:
    
        z(r11, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d1, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(defpackage.qx1 r11) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jr.w(qx1):void");
    }

    public final boolean x() {
        return this.h == 2 && ((wb0) this.i).m();
    }

    @Override // defpackage.hr
    public final void y(Object obj, ss0 ss0Var) throws vb0 {
        G(obj, this.h, ss0Var);
    }
}
