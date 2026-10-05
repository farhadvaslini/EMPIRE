package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public class np implements js {
    public static final /* synthetic */ AtomicLongFieldUpdater g = AtomicLongFieldUpdater.newUpdater(np.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater h = AtomicLongFieldUpdater.newUpdater(np.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater i = AtomicLongFieldUpdater.newUpdater(np.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater j = AtomicLongFieldUpdater.newUpdater(np.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(np.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater l;
    public static final /* synthetic */ AtomicReferenceFieldUpdater m;
    public static final /* synthetic */ AtomicReferenceFieldUpdater n;
    public static final /* synthetic */ AtomicReferenceFieldUpdater o;
    public static final /* synthetic */ long p;
    public static final /* synthetic */ long q;
    public static final /* synthetic */ long r;
    public static final /* synthetic */ long s;
    public static final /* synthetic */ long t;
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    public final int f;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    static {
        Unsafe unsafe = kr.a;
        t = unsafe.objectFieldOffset(np.class.getDeclaredField("sendSegment$volatile"));
        l = AtomicReferenceFieldUpdater.newUpdater(np.class, Object.class, "receiveSegment$volatile");
        s = unsafe.objectFieldOffset(np.class.getDeclaredField("receiveSegment$volatile"));
        m = AtomicReferenceFieldUpdater.newUpdater(np.class, Object.class, "bufferEndSegment$volatile");
        q = unsafe.objectFieldOffset(np.class.getDeclaredField("bufferEndSegment$volatile"));
        n = AtomicReferenceFieldUpdater.newUpdater(np.class, Object.class, "_closeCause$volatile");
        p = unsafe.objectFieldOffset(np.class.getDeclaredField("_closeCause$volatile"));
        o = AtomicReferenceFieldUpdater.newUpdater(np.class, Object.class, "closeHandler$volatile");
        r = unsafe.objectFieldOffset(np.class.getDeclaredField("closeHandler$volatile"));
    }

    public np(int i2) {
        this.f = i2;
        if (i2 < 0) {
            c.g(by1.h("Invalid channel capacity: ", ", should be >=0", i2));
            throw null;
        }
        ws wsVar = pp.a;
        this.bufferEnd$volatile = i2 != 0 ? i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = i.get(this);
        ws wsVar2 = new ws(0L, null, this, 3);
        this.sendSegment$volatile = wsVar2;
        this.receiveSegment$volatile = wsVar2;
        if (D()) {
            wsVar2 = pp.a;
            wsVar2.getClass();
        }
        this.bufferEndSegment$volatile = wsVar2;
        this._closeCause$volatile = pp.s;
    }

    public static Object G(np npVar, mb3 mb3Var) throws Throwable {
        ws wsVar;
        Throwable th;
        ws wsVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l;
        atomicReferenceFieldUpdater.getClass();
        if (npVar == null) {
            qn1.b();
            return null;
        }
        ws wsVar3 = (ws) kr.a.getObjectVolatile(npVar, s);
        while (!npVar.A()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = h;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(npVar);
            long j2 = pp.b;
            long j3 = andIncrement / j2;
            int i2 = (int) (andIncrement % j2);
            if (wsVar3.e != j3) {
                ws wsVarO = npVar.o(j3, wsVar3);
                if (wsVarO == null) {
                    continue;
                } else {
                    wsVar = wsVarO;
                }
            } else {
                wsVar = wsVar3;
            }
            np npVar2 = npVar;
            Object objN = npVar2.N(wsVar, i2, andIncrement, null);
            ai0 ai0Var = pp.m;
            if (objN == ai0Var) {
                c.q("unexpected");
                return null;
            }
            ai0 ai0Var2 = pp.o;
            if (objN == ai0Var2) {
                if (andIncrement < npVar2.v()) {
                    wsVar.a();
                }
                npVar = npVar2;
                wsVar3 = wsVar;
            } else {
                if (objN != pp.n) {
                    wsVar.a();
                    return objN;
                }
                jr jrVarH = lr.H(vr.I(mb3Var));
                try {
                    Object objN2 = npVar2.N(wsVar, i2, andIncrement, jrVarH);
                    if (objN2 == ai0Var) {
                        jrVarH.a(wsVar, i2);
                    } else {
                        if (objN2 == ai0Var2) {
                            if (andIncrement < npVar2.v()) {
                                wsVar.a();
                            }
                            ws wsVar4 = (ws) atomicReferenceFieldUpdater.get(npVar2);
                            while (true) {
                                if (npVar2.A()) {
                                    jrVarH.t(new qn2(npVar2.t()));
                                    break;
                                }
                                jr jrVar = jrVarH;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(npVar2);
                                    long j4 = pp.b;
                                    long j5 = andIncrement2 / j4;
                                    int i3 = (int) (andIncrement2 % j4);
                                    if (wsVar4.e != j5) {
                                        try {
                                            ws wsVarO2 = npVar2.o(j5, wsVar4);
                                            if (wsVarO2 == null) {
                                                jrVarH = jrVar;
                                            } else {
                                                wsVar2 = wsVarO2;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            jrVarH = jrVar;
                                            jrVarH.E();
                                            throw th;
                                        }
                                    } else {
                                        wsVar2 = wsVar4;
                                    }
                                    np npVar3 = npVar2;
                                    objN2 = npVar3.N(wsVar2, i3, andIncrement2, jrVar);
                                    npVar2 = npVar3;
                                    ws wsVar5 = wsVar2;
                                    jrVarH = jrVar;
                                    if (objN2 == pp.m) {
                                        jrVarH.a(wsVar5, i3);
                                        break;
                                    }
                                    if (objN2 == pp.o) {
                                        if (andIncrement2 < npVar2.v()) {
                                            wsVar5.a();
                                        }
                                        wsVar4 = wsVar5;
                                    } else {
                                        if (objN2 == pp.n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        wsVar5.a();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    jrVarH = jrVar;
                                    th = th;
                                    jrVarH.E();
                                    throw th;
                                }
                            }
                        } else {
                            wsVar.a();
                        }
                        jrVarH.y(objN2, null);
                    }
                    return jrVarH.q();
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        Throwable thT = npVar.t();
        int i4 = u83.a;
        throw thT;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object H(np npVar, q40 q40Var) {
        lp lpVar;
        ws wsVar;
        if (q40Var instanceof lp) {
            lpVar = (lp) q40Var;
            int i2 = lpVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lpVar.k = i2 - Integer.MIN_VALUE;
            } else {
                lpVar = new lp(npVar, q40Var);
            }
        }
        lp lpVar2 = lpVar;
        Object obj = lpVar2.i;
        int i3 = lpVar2.k;
        if (i3 != 0) {
            if (i3 == 1) {
                y02.Q(obj);
                return ((vs) obj).a;
            }
            c.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y02.Q(obj);
        l.getClass();
        ws wsVar2 = (ws) kr.a.getObjectVolatile(npVar, s);
        while (!npVar.A()) {
            long andIncrement = h.getAndIncrement(npVar);
            long j2 = pp.b;
            long j3 = andIncrement / j2;
            int i4 = (int) (andIncrement % j2);
            if (wsVar2.e != j3) {
                ws wsVarO = npVar.o(j3, wsVar2);
                if (wsVarO == null) {
                    continue;
                } else {
                    wsVar = wsVarO;
                }
            } else {
                wsVar = wsVar2;
            }
            np npVar2 = npVar;
            Object objN = npVar2.N(wsVar, i4, andIncrement, null);
            if (objN == pp.m) {
                c.q("unexpected");
                return null;
            }
            if (objN != pp.o) {
                if (objN != pp.n) {
                    wsVar.a();
                    return objN;
                }
                lpVar2.k = 1;
                Object objI = npVar2.I(wsVar, i4, andIncrement, lpVar2);
                y50 y50Var = y50.f;
                return objI == y50Var ? y50Var : objI;
            }
            if (andIncrement < npVar2.v()) {
                wsVar.a();
            }
            npVar = npVar2;
            wsVar2 = wsVar;
        }
        return new ts(npVar.r());
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0158 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object K(np npVar, Object obj, p40 p40Var) {
        dm3 dm3Var;
        y50 y50Var;
        Object objQ;
        y50 y50Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
        atomicReferenceFieldUpdater.getClass();
        ws wsVar = (ws) kr.a.getObjectVolatile(npVar, t);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = g;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(npVar);
            long j2 = andIncrement & 1152921504606846975L;
            boolean z = npVar.z(andIncrement, false);
            int i2 = pp.b;
            long j3 = i2;
            long j4 = j2 / j3;
            int i3 = (int) (j2 % j3);
            long j5 = wsVar.e;
            y50 y50Var3 = y50.f;
            dm3Var = dm3.a;
            if (j5 != j4) {
                ws wsVarP = npVar.p(j4, wsVar);
                if (wsVarP != null) {
                    wsVar = wsVarP;
                } else if (z) {
                    Object objF = npVar.F(p40Var, obj);
                    if (objF == y50Var3) {
                        return objF;
                    }
                }
            }
            int iD = d(npVar, wsVar, i3, obj, j2, null, z);
            if (iD == 0) {
                wsVar.a();
                return dm3Var;
            }
            if (iD == 1) {
                break;
            }
            if (iD != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = h;
                if (iD == 3) {
                    jr jrVarH = lr.H(vr.I(p40Var));
                    try {
                        int iD2 = d(npVar, wsVar, i3, obj, j2, jrVarH, false);
                        if (iD2 != 0) {
                            if (iD2 == 1) {
                                y50Var = y50Var3;
                                jrVarH.t(dm3Var);
                            } else if (iD2 != 2) {
                                if (iD2 == 4) {
                                    y50Var = y50Var3;
                                    if (j2 < atomicLongFieldUpdater2.get(npVar)) {
                                        wsVar.a();
                                    }
                                } else {
                                    if (iD2 != 5) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    wsVar.a();
                                    ws wsVar2 = (ws) atomicReferenceFieldUpdater.get(npVar);
                                    while (true) {
                                        long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(npVar);
                                        long j6 = andIncrement2 & 1152921504606846975L;
                                        boolean z2 = npVar.z(andIncrement2, false);
                                        int i4 = pp.b;
                                        long j7 = i4;
                                        AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater;
                                        long j8 = j6 / j7;
                                        int i5 = (int) (j6 % j7);
                                        y50Var = y50Var3;
                                        if (wsVar2.e != j8) {
                                            ws wsVarP2 = npVar.p(j8, wsVar2);
                                            if (wsVarP2 != null) {
                                                wsVar2 = wsVarP2;
                                            } else {
                                                if (z2) {
                                                    break;
                                                }
                                                atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                y50Var3 = y50Var;
                                            }
                                        }
                                        int iD3 = d(npVar, wsVar2, i5, obj, j6, jrVarH, z2);
                                        if (iD3 == 0) {
                                            wsVar2.a();
                                            break;
                                        }
                                        if (iD3 == 1) {
                                            break;
                                        }
                                        if (iD3 != 2) {
                                            if (iD3 == 3) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            if (iD3 != 4) {
                                                if (iD3 == 5) {
                                                    wsVar2.a();
                                                }
                                                atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                y50Var3 = y50Var;
                                            } else if (j6 < atomicLongFieldUpdater2.get(npVar)) {
                                                wsVar2.a();
                                            }
                                        } else if (z2) {
                                            wsVar2.m();
                                        } else {
                                            jrVarH.a(wsVar2, i5 + i4);
                                        }
                                    }
                                }
                                b(npVar, obj, jrVarH);
                            } else {
                                y50Var = y50Var3;
                                jrVarH.a(wsVar, i3 + i2);
                            }
                            objQ = jrVarH.q();
                            y50Var2 = y50Var;
                            if (objQ != y50Var2) {
                                objQ = dm3Var;
                            }
                            if (objQ != y50Var2) {
                                return objQ;
                            }
                        } else {
                            y50Var = y50Var3;
                            wsVar.a();
                        }
                        jrVarH.t(dm3Var);
                        objQ = jrVarH.q();
                        y50Var2 = y50Var;
                        if (objQ != y50Var2) {
                        }
                        if (objQ != y50Var2) {
                            break;
                        }
                    } catch (Throwable th) {
                        jrVarH.E();
                        throw th;
                    }
                } else if (iD == 4) {
                    if (j2 < atomicLongFieldUpdater2.get(npVar)) {
                        wsVar.a();
                    }
                    Object objF2 = npVar.F(p40Var, obj);
                    if (objF2 == y50Var3) {
                        return objF2;
                    }
                } else if (iD == 5) {
                    wsVar.a();
                }
            } else if (z) {
                wsVar.m();
                Object objF3 = npVar.F(p40Var, obj);
                if (objF3 == y50Var3) {
                    return objF3;
                }
            }
        }
        return dm3Var;
    }

    public static boolean M(Object obj) {
        if (obj instanceof hr) {
            return pp.a((hr) obj, dm3.a, null);
        }
        c.h(obj, "Unexpected waiter: ");
        return false;
    }

    public static final void b(np npVar, Object obj, jr jrVar) {
        jrVar.t(new qn2(npVar.u()));
    }

    public static final int d(np npVar, ws wsVar, int i2, Object obj, long j2, Object obj2, boolean z) {
        wsVar.r(i2, obj);
        if (z) {
            return npVar.O(wsVar, i2, obj, j2, obj2, z);
        }
        Object objP = wsVar.p(i2);
        if (objP == null) {
            if (npVar.f(j2)) {
                if (wsVar.o(i2, null, pp.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (wsVar.o(i2, null, obj2)) {
                    return 2;
                }
            }
        } else if (objP instanceof or3) {
            wsVar.r(i2, null);
            if (npVar.L(objP, obj)) {
                wsVar.s(i2, pp.i);
                return 0;
            }
            ai0 ai0Var = pp.k;
            if (wsVar.h.getAndSet((i2 * 2) + 1, ai0Var) == ai0Var) {
                return 5;
            }
            wsVar.q(i2, true);
            return 5;
        }
        return npVar.O(wsVar, i2, obj, j2, obj2, z);
    }

    public static void x(np npVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = j;
        if ((atomicLongFieldUpdater.addAndGet(npVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(npVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final boolean A() {
        return z(g.get(this), true);
    }

    public final boolean B() {
        return z(g.get(this), false);
    }

    public boolean C() {
        return false;
    }

    public final boolean D() {
        long j2 = i.get(this);
        return j2 == 0 || j2 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0063, code lost:
    
        if (r5.j() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0065, code lost:
    
        r5.h();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(long j2, ws wsVar) {
        np npVar;
        ws wsVar2;
        ws wsVar3;
        while (wsVar.e < j2 && (wsVar3 = (ws) wsVar.c()) != null) {
            wsVar = wsVar3;
        }
        while (true) {
            ws wsVar4 = wsVar;
            while (wsVar4.f() && (wsVar2 = (ws) wsVar4.c()) != null) {
                wsVar4 = wsVar2;
            }
            while (true) {
                m.getClass();
                Unsafe unsafe = kr.a;
                long j3 = q;
                kt2 kt2Var = (kt2) unsafe.getObjectVolatile(this, j3);
                if (kt2Var.e >= wsVar4.e) {
                    return;
                }
                if (!wsVar4.n()) {
                    break;
                }
                while (true) {
                    Unsafe unsafe2 = kr.a;
                    npVar = this;
                    if (unsafe2.compareAndSwapObject(npVar, q, kt2Var, wsVar4)) {
                        if (kt2Var.j()) {
                            kt2Var.h();
                            return;
                        }
                        return;
                    } else if (unsafe2.getObjectVolatile(npVar, j3) != kt2Var) {
                        break;
                    } else {
                        this = npVar;
                    }
                }
                this = npVar;
            }
            wsVar = wsVar4;
        }
    }

    public final Object F(p40 p40Var, Object obj) {
        jr jrVar = new jr(1, vr.I(p40Var));
        jrVar.s();
        jrVar.t(new qn2(u()));
        Object objQ = jrVar.q();
        return objQ == y50.f ? objQ : dm3.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object I(ws wsVar, int i2, long j2, q40 q40Var) {
        mp mpVar;
        vs vsVar;
        ws wsVar2;
        if (q40Var instanceof mp) {
            mpVar = (mp) q40Var;
            int i3 = mpVar.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mpVar.k = i3 - Integer.MIN_VALUE;
            } else {
                mpVar = new mp(this, q40Var);
            }
        }
        Object objQ = mpVar.i;
        int i4 = mpVar.k;
        if (i4 == 0) {
            y02.Q(objQ);
            mpVar.k = 1;
            jr jrVarH = lr.H(vr.I(mpVar));
            try {
                pj2 pj2Var = new pj2(jrVarH);
                Object objN = N(wsVar, i2, j2, pj2Var);
                if (objN == pp.m) {
                    pj2Var.a(wsVar, i2);
                } else {
                    if (objN == pp.o) {
                        if (j2 < v()) {
                            wsVar.a();
                        }
                        ws wsVar3 = (ws) l.get(this);
                        while (true) {
                            if (A()) {
                                jrVarH.t(new vs(new ts(r())));
                                break;
                            }
                            long andIncrement = h.getAndIncrement(this);
                            long j3 = pp.b;
                            long j4 = andIncrement / j3;
                            int i5 = (int) (andIncrement % j3);
                            if (wsVar3.e != j4) {
                                ws wsVarO = o(j4, wsVar3);
                                if (wsVarO != null) {
                                    wsVar2 = wsVarO;
                                }
                            } else {
                                wsVar2 = wsVar3;
                            }
                            Object objN2 = N(wsVar2, i5, andIncrement, pj2Var);
                            ws wsVar4 = wsVar2;
                            if (objN2 == pp.m) {
                                pj2Var.a(wsVar4, i5);
                                break;
                            }
                            if (objN2 == pp.o) {
                                if (andIncrement < v()) {
                                    wsVar4.a();
                                }
                                wsVar3 = wsVar4;
                            } else {
                                if (objN2 == pp.n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                wsVar4.a();
                                vsVar = new vs(objN2);
                            }
                        }
                    } else {
                        wsVar.a();
                        vsVar = new vs(objN);
                    }
                    jrVarH.y(vsVar, null);
                }
                objQ = jrVarH.q();
                y50 y50Var = y50.f;
                if (objQ == y50Var) {
                    return y50Var;
                }
            } catch (Throwable th) {
                jrVarH.E();
                throw th;
            }
        } else {
            if (i4 != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y02.Q(objQ);
        }
        return ((vs) objQ).a;
    }

    public final void J(or3 or3Var, boolean z) {
        if (or3Var instanceof hr) {
            ((p40) or3Var).t(new qn2(z ? t() : u()));
            return;
        }
        if (or3Var instanceof pj2) {
            ((pj2) or3Var).f.t(new vs(new ts(r())));
            return;
        }
        if (!(or3Var instanceof kp)) {
            c.h(or3Var, "Unexpected waiter: ");
            return;
        }
        kp kpVar = (kp) or3Var;
        jr jrVar = kpVar.g;
        jrVar.getClass();
        kpVar.g = null;
        kpVar.f = pp.l;
        Throwable thR = kpVar.h.r();
        if (thR == null) {
            jrVar.t(Boolean.FALSE);
        } else {
            jrVar.t(new qn2(thR));
        }
    }

    public final boolean L(Object obj, Object obj2) {
        if (obj instanceof pj2) {
            return pp.a(((pj2) obj).f, new vs(obj2), null);
        }
        if (!(obj instanceof kp)) {
            if (obj instanceof hr) {
                return pp.a((hr) obj, obj2, null);
            }
            c.h(obj, "Unexpected receiver type: ");
            return false;
        }
        kp kpVar = (kp) obj;
        jr jrVar = kpVar.g;
        jrVar.getClass();
        kpVar.g = null;
        kpVar.f = obj2;
        Boolean bool = Boolean.TRUE;
        kpVar.h.getClass();
        return pp.a(jrVar, bool, null);
    }

    public final Object N(ws wsVar, int i2, long j2, Object obj) {
        Object objP = wsVar.p(i2);
        AtomicReferenceArray atomicReferenceArray = wsVar.h;
        AtomicLongFieldUpdater atomicLongFieldUpdater = g;
        if (objP == null) {
            if (j2 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return pp.n;
                }
                if (wsVar.o(i2, objP, obj)) {
                    m();
                    return pp.m;
                }
            }
        } else if (objP == pp.d && wsVar.o(i2, objP, pp.i)) {
            m();
            Object obj2 = atomicReferenceArray.get(i2 * 2);
            wsVar.r(i2, null);
            return obj2;
        }
        while (true) {
            Object objP2 = wsVar.p(i2);
            if (objP2 == null || objP2 == pp.e) {
                if (j2 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (wsVar.o(i2, objP2, pp.h)) {
                        m();
                        return pp.o;
                    }
                } else {
                    if (obj == null) {
                        return pp.n;
                    }
                    if (wsVar.o(i2, objP2, obj)) {
                        m();
                        return pp.m;
                    }
                }
            } else if (objP2 != pp.d) {
                ai0 ai0Var = pp.j;
                if (objP2 == ai0Var) {
                    return pp.o;
                }
                if (objP2 == pp.h) {
                    return pp.o;
                }
                if (objP2 == pp.l) {
                    m();
                    return pp.o;
                }
                if (objP2 != pp.g && wsVar.o(i2, objP2, pp.f)) {
                    boolean z = objP2 instanceof pr3;
                    if (z) {
                        objP2 = ((pr3) objP2).a;
                    }
                    if (M(objP2)) {
                        wsVar.s(i2, pp.i);
                        m();
                        Object obj3 = atomicReferenceArray.get(i2 * 2);
                        wsVar.r(i2, null);
                        return obj3;
                    }
                    wsVar.s(i2, ai0Var);
                    wsVar.m();
                    if (z) {
                        m();
                    }
                    return pp.o;
                }
            } else if (wsVar.o(i2, objP2, pp.i)) {
                m();
                Object obj4 = atomicReferenceArray.get(i2 * 2);
                wsVar.r(i2, null);
                return obj4;
            }
        }
    }

    public final int O(ws wsVar, int i2, Object obj, long j2, Object obj2, boolean z) {
        while (true) {
            Object objP = wsVar.p(i2);
            if (objP == null) {
                if (!f(j2) || z) {
                    if (z) {
                        if (wsVar.o(i2, null, pp.j)) {
                            wsVar.m();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (wsVar.o(i2, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (wsVar.o(i2, null, pp.d)) {
                    break;
                }
            } else {
                if (objP != pp.e) {
                    ai0 ai0Var = pp.k;
                    if (objP == ai0Var) {
                        wsVar.r(i2, null);
                        return 5;
                    }
                    if (objP == pp.h) {
                        wsVar.r(i2, null);
                        return 5;
                    }
                    if (objP == pp.l) {
                        wsVar.r(i2, null);
                        B();
                        return 4;
                    }
                    wsVar.r(i2, null);
                    if (objP instanceof pr3) {
                        objP = ((pr3) objP).a;
                    }
                    if (L(objP, obj)) {
                        wsVar.s(i2, pp.i);
                        return 0;
                    }
                    if (wsVar.h.getAndSet((i2 * 2) + 1, ai0Var) != ai0Var) {
                        wsVar.q(i2, true);
                    }
                    return 5;
                }
                if (wsVar.o(i2, objP, pp.d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void P(long j2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        np npVar = this;
        if (npVar.D()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = i;
            if (atomicLongFieldUpdater.get(npVar) > j2) {
                break;
            } else {
                npVar = this;
            }
        }
        int i2 = pp.c;
        int i3 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = j;
            if (i3 < i2) {
                long j3 = atomicLongFieldUpdater.get(npVar);
                if (j3 == (4611686018427387903L & atomicLongFieldUpdater2.get(npVar)) && j3 == atomicLongFieldUpdater.get(npVar)) {
                    return;
                } else {
                    i3++;
                }
            } else {
                while (true) {
                    long j4 = atomicLongFieldUpdater2.get(npVar);
                    if (atomicLongFieldUpdater2.compareAndSet(npVar, j4, (j4 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        npVar = this;
                    }
                }
                while (true) {
                    long j5 = atomicLongFieldUpdater.get(npVar);
                    long j6 = atomicLongFieldUpdater2.get(npVar);
                    long j7 = j6 & 4611686018427387903L;
                    boolean z = (j6 & 4611686018427387904L) != 0;
                    if (j5 == j7 && j5 == atomicLongFieldUpdater.get(npVar)) {
                        break;
                    }
                    if (z) {
                        npVar = this;
                    } else {
                        npVar = this;
                        atomicLongFieldUpdater2.compareAndSet(npVar, j6, 4611686018427387904L + j7);
                    }
                }
                while (true) {
                    long j8 = atomicLongFieldUpdater2.get(npVar);
                    if (atomicLongFieldUpdater2.compareAndSet(npVar, j8, j8 & 4611686018427387903L)) {
                        return;
                    } else {
                        npVar = this;
                    }
                }
            }
        }
    }

    @Override // defpackage.lv2
    public Object a(p40 p40Var, Object obj) {
        return K(this, obj, p40Var);
    }

    @Override // defpackage.js
    public final void c(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        i(cancellationException, true);
    }

    @Override // defpackage.js
    public final Object e(mb3 mb3Var) {
        return G(this, mb3Var);
    }

    public final boolean f(long j2) {
        return j2 < i.get(this) || j2 < h.get(this) + ((long) this.f);
    }

    @Override // defpackage.js
    public final Object g() {
        ws wsVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = h;
        long j2 = atomicLongFieldUpdater.get(this);
        long j3 = g.get(this);
        if (z(j3, true)) {
            return new ts(r());
        }
        long j4 = j3 & 1152921504606846975L;
        us usVar = vs.b;
        if (j2 >= j4) {
            return usVar;
        }
        Object obj = pp.k;
        l.getClass();
        ws wsVar2 = (ws) kr.a.getObjectVolatile(this, s);
        while (!this.A()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j5 = pp.b;
            long j6 = andIncrement / j5;
            int i2 = (int) (andIncrement % j5);
            if (wsVar2.e != j6) {
                ws wsVarO = this.o(j6, wsVar2);
                if (wsVarO == null) {
                    continue;
                } else {
                    wsVar = wsVarO;
                }
            } else {
                wsVar = wsVar2;
            }
            np npVar = this;
            Object objN = npVar.N(wsVar, i2, andIncrement, obj);
            wsVar2 = wsVar;
            if (objN == pp.m) {
                or3 or3Var = obj instanceof or3 ? (or3) obj : null;
                if (or3Var != null) {
                    or3Var.a(wsVar2, i2);
                }
                npVar.P(andIncrement);
                wsVar2.m();
                return usVar;
            }
            if (objN != pp.o) {
                if (objN != pp.n) {
                    wsVar2.a();
                    return objN;
                }
                c.q("unexpected");
                return null;
            }
            if (andIncrement < npVar.v()) {
                wsVar2.a();
            }
            this = npVar;
        }
        return new ts(this.r());
    }

    public final ws h() {
        m.getClass();
        Unsafe unsafe = kr.a;
        Object objectVolatile = unsafe.getObjectVolatile(this, q);
        k.getClass();
        ws wsVar = (ws) unsafe.getObjectVolatile(this, t);
        if (wsVar.e > ((ws) objectVolatile).e) {
            objectVolatile = wsVar;
        }
        l.getClass();
        ws wsVar2 = (ws) unsafe.getObjectVolatile(this, s);
        if (wsVar2.e > ((ws) objectVolatile).e) {
            objectVolatile = wsVar2;
        }
        x20 x20Var = (x20) objectVolatile;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = x20.a;
            Object objD = x20Var.d();
            if (objD == gv3.r) {
                break;
            }
            x20 x20Var2 = (x20) objD;
            if (x20Var2 != null) {
                x20Var = x20Var2;
            } else if (x20Var.g()) {
                break;
            }
        }
        return (ws) x20Var;
    }

    public final boolean i(Throwable th, boolean z) {
        np npVar;
        boolean z2;
        long j2;
        long j3;
        long j4;
        AtomicLongFieldUpdater atomicLongFieldUpdater = g;
        if (z) {
            while (true) {
                long j5 = atomicLongFieldUpdater.get(this);
                if (((int) (j5 >> 60)) != 0) {
                    break;
                }
                ws wsVar = pp.a;
                npVar = this;
                if (atomicLongFieldUpdater.compareAndSet(npVar, j5, (j5 & 1152921504606846975L) + 1152921504606846976L)) {
                    break;
                }
                this = npVar;
            }
        } else {
            npVar = this;
        }
        ai0 ai0Var = pp.s;
        while (true) {
            n.getClass();
            np npVar2 = npVar;
            Unsafe unsafe = kr.a;
            long j6 = p;
            Throwable th2 = th;
            boolean zCompareAndSwapObject = unsafe.compareAndSwapObject(npVar2, j6, ai0Var, th2);
            npVar = npVar2;
            if (zCompareAndSwapObject) {
                z2 = true;
                break;
            }
            if (unsafe.getObjectVolatile(npVar, j6) != ai0Var) {
                z2 = false;
                break;
            }
            th = th2;
        }
        if (z) {
            do {
                j4 = atomicLongFieldUpdater.get(npVar);
            } while (!atomicLongFieldUpdater.compareAndSet(npVar, j4, 3458764513820540928L + (j4 & 1152921504606846975L)));
        } else {
            do {
                j2 = atomicLongFieldUpdater.get(npVar);
                int i2 = (int) (j2 >> 60);
                if (i2 == 0) {
                    j3 = (j2 & 1152921504606846975L) + 2305843009213693952L;
                } else {
                    if (i2 != 1) {
                        break;
                    }
                    j3 = (j2 & 1152921504606846975L) + 3458764513820540928L;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(npVar, j2, j3));
        }
        npVar.B();
        if (z2) {
            npVar.y();
        }
        return z2;
    }

    @Override // defpackage.js
    public final kp iterator() {
        return new kp(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        r1 = (defpackage.ws) r1.e();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ws j(long j2) {
        long j3;
        ws wsVarH = h();
        if (C()) {
            ws wsVar = wsVarH;
            loop0: do {
                int i2 = pp.b - 1;
                while (true) {
                    if (-1 >= i2) {
                        break;
                    }
                    j3 = (wsVar.e * ((long) pp.b)) + ((long) i2);
                    if (j3 < h.get(this)) {
                        break loop0;
                    }
                    while (true) {
                        Object objP = wsVar.p(i2);
                        if (objP != null && objP != pp.e) {
                            if (objP == pp.d) {
                                break loop0;
                            }
                        } else {
                            if (wsVar.o(i2, objP, pp.l)) {
                                wsVar.m();
                                break;
                            }
                        }
                    }
                    i2--;
                }
            } while (wsVar != null);
            j3 = -1;
            if (j3 != -1) {
                k(j3);
            }
        }
        Object objP2 = null;
        loop3: for (ws wsVar2 = wsVarH; wsVar2 != null; wsVar2 = (ws) wsVar2.e()) {
            for (int i3 = pp.b - 1; -1 < i3; i3--) {
                if ((wsVar2.e * ((long) pp.b)) + ((long) i3) < j2) {
                    break loop3;
                }
                while (true) {
                    Object objP3 = wsVar2.p(i3);
                    if (objP3 != null && objP3 != pp.e) {
                        if (!(objP3 instanceof pr3)) {
                            if (!(objP3 instanceof or3)) {
                                break;
                            }
                            if (wsVar2.o(i3, objP3, pp.l)) {
                                objP2 = vp.P(objP2, objP3);
                                wsVar2.q(i3, true);
                                break;
                            }
                        } else {
                            if (wsVar2.o(i3, objP3, pp.l)) {
                                objP2 = vp.P(objP2, ((pr3) objP3).a);
                                wsVar2.q(i3, true);
                                break;
                            }
                        }
                    } else {
                        if (wsVar2.o(i3, objP3, pp.l)) {
                            wsVar2.m();
                            break;
                        }
                    }
                }
            }
        }
        if (objP2 != null) {
            if (!(objP2 instanceof ArrayList)) {
                J((or3) objP2, true);
                return wsVarH;
            }
            ArrayList arrayList = (ArrayList) objP2;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                J((or3) arrayList.get(size), true);
            }
        }
        return wsVarH;
    }

    public final void k(long j2) {
        l.getClass();
        ws wsVar = (ws) kr.a.getObjectVolatile(this, s);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = h;
            long j3 = atomicLongFieldUpdater.get(this);
            if (j2 < Math.max(((long) this.f) + j3, i.get(this))) {
                return;
            }
            np npVar = this;
            if (atomicLongFieldUpdater.compareAndSet(npVar, j3, 1 + j3)) {
                long j4 = pp.b;
                long j5 = j3 / j4;
                int i2 = (int) (j3 % j4);
                if (wsVar.e != j5) {
                    ws wsVarO = npVar.o(j5, wsVar);
                    if (wsVarO != null) {
                        wsVar = wsVarO;
                    }
                }
                ws wsVar2 = wsVar;
                if (npVar.N(wsVar2, i2, j3, null) != pp.o || j3 < npVar.v()) {
                    wsVar2.a();
                }
                this = npVar;
                wsVar = wsVar2;
            }
            this = npVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c3 A[SYNTHETIC] */
    @Override // defpackage.lv2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object l(Object obj) {
        int iD;
        AtomicLongFieldUpdater atomicLongFieldUpdater = g;
        boolean z = false;
        long j2 = 1152921504606846975L;
        boolean z2 = z(atomicLongFieldUpdater.get(this), false) ? false : !f(r1 & 1152921504606846975L);
        us usVar = vs.b;
        if (z2) {
            return usVar;
        }
        yh0 yh0Var = pp.j;
        k.getClass();
        ws wsVar = (ws) kr.a.getObjectVolatile(this, t);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = andIncrement & j2;
            boolean z3 = z(andIncrement, z);
            int i2 = pp.b;
            long j4 = i2;
            long j5 = j3 / j4;
            int i3 = (int) (j3 % j4);
            if (wsVar.e == j5) {
                iD = d(this, wsVar, i3, obj, j3, yh0Var, z3);
                dm3 dm3Var = dm3.a;
                if (iD != 0) {
                    wsVar.a();
                    return dm3Var;
                }
                if (iD == 1) {
                    return dm3Var;
                }
                if (iD == 2) {
                    if (z3) {
                        wsVar.m();
                        return new ts(u());
                    }
                    or3 or3Var = yh0Var instanceof or3 ? (or3) yh0Var : null;
                    if (or3Var != null) {
                        or3Var.a(wsVar, i3 + i2);
                    }
                    wsVar.m();
                    return usVar;
                }
                if (iD == 3) {
                    c.q("unexpected");
                    return null;
                }
                if (iD == 4) {
                    if (j3 < h.get(this)) {
                        wsVar.a();
                    }
                    return new ts(u());
                }
                if (iD == 5) {
                    wsVar.a();
                }
                z = false;
            } else {
                ws wsVarP = p(j5, wsVar);
                if (wsVarP != null) {
                    wsVar = wsVarP;
                    iD = d(this, wsVar, i3, obj, j3, yh0Var, z3);
                    dm3 dm3Var2 = dm3.a;
                    if (iD != 0) {
                    }
                } else {
                    if (z3) {
                        return new ts(u());
                    }
                    z = false;
                }
            }
            j2 = 1152921504606846975L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f1, code lost:
    
        x(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f4, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m() {
        int i2;
        boolean z;
        Object objP;
        if (D()) {
            return;
        }
        m.getClass();
        ws wsVar = (ws) kr.a.getObjectVolatile(this, q);
        loop0: while (true) {
            long andIncrement = i.getAndIncrement(this);
            long j2 = pp.b;
            long j3 = andIncrement / j2;
            if (this.v() <= andIncrement) {
                if (wsVar.e < j3 && wsVar.c() != null) {
                    this.E(j3, wsVar);
                }
                x(this);
                return;
            }
            np npVar = this;
            if (wsVar.e == j3) {
                i2 = (int) (andIncrement % j2);
                Object objP2 = wsVar.p(i2);
                z = objP2 instanceof or3;
                AtomicLongFieldUpdater atomicLongFieldUpdater = h;
                if (z || andIncrement < atomicLongFieldUpdater.get(npVar) || !wsVar.o(i2, objP2, pp.g)) {
                    while (true) {
                        objP = wsVar.p(i2);
                        if (objP instanceof or3) {
                            if (objP != pp.j) {
                                if (objP != null) {
                                    if (objP == pp.d || objP == pp.h || objP == pp.i || objP == pp.k || objP == pp.l) {
                                        break loop0;
                                    } else if (objP != pp.f) {
                                        c.h(objP, "Unexpected cell state: ");
                                        return;
                                    }
                                } else if (wsVar.o(i2, objP, pp.e)) {
                                    break loop0;
                                }
                            } else {
                                break;
                            }
                        } else if (andIncrement < atomicLongFieldUpdater.get(npVar)) {
                            if (wsVar.o(i2, objP, new pr3((or3) objP))) {
                                break loop0;
                            }
                        } else if (wsVar.o(i2, objP, pp.g)) {
                            if (M(objP)) {
                                wsVar.s(i2, pp.d);
                                break;
                            } else {
                                wsVar.s(i2, pp.j);
                                wsVar.m();
                            }
                        }
                    }
                } else if (M(objP2)) {
                    wsVar.s(i2, pp.d);
                    break;
                } else {
                    wsVar.s(i2, pp.j);
                    wsVar.m();
                    x(npVar);
                }
            } else {
                ws wsVarN = npVar.n(j3, wsVar, andIncrement);
                if (wsVarN == null) {
                    continue;
                } else {
                    wsVar = wsVarN;
                    i2 = (int) (andIncrement % j2);
                    Object objP22 = wsVar.p(i2);
                    z = objP22 instanceof or3;
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = h;
                    if (z) {
                        while (true) {
                            objP = wsVar.p(i2);
                            if (objP instanceof or3) {
                            }
                        }
                    }
                }
            }
            this = npVar;
        }
    }

    public final ws n(long j2, ws wsVar, long j3) {
        Object objA;
        Unsafe unsafe;
        ws wsVar2 = pp.a;
        op opVar = op.m;
        loop0: while (true) {
            objA = gv3.A(wsVar, j2, opVar);
            if (!g12.V(objA)) {
                kt2 kt2VarO = g12.O(objA);
                while (true) {
                    m.getClass();
                    Unsafe unsafe2 = kr.a;
                    long j4 = q;
                    kt2 kt2Var = (kt2) unsafe2.getObjectVolatile(this, j4);
                    if (kt2Var.e >= kt2VarO.e) {
                        break loop0;
                    }
                    if (!kt2VarO.n()) {
                        break;
                    }
                    do {
                        unsafe = kr.a;
                        if (unsafe.compareAndSwapObject(this, q, kt2Var, kt2VarO)) {
                            if (kt2Var.j()) {
                                kt2Var.h();
                            }
                        }
                    } while (unsafe.getObjectVolatile(this, j4) == kt2Var);
                    if (kt2VarO.j()) {
                        kt2VarO.h();
                    }
                }
            } else {
                break;
            }
        }
        if (g12.V(objA)) {
            B();
            E(j2, wsVar);
            x(this);
            return null;
        }
        ws wsVar3 = (ws) g12.O(objA);
        long j5 = wsVar3.e;
        if (j5 <= j2) {
            return wsVar3;
        }
        long j6 = j5 * ((long) pp.b);
        if (!i.compareAndSet(this, j3 + 1, j6)) {
            x(this);
            return null;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = j;
        if ((atomicLongFieldUpdater.addAndGet(this, j6 - j3) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d0, code lost:
    
        if (r8.j() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d2, code lost:
    
        r8.h();
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0107 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ws o(long j2, ws wsVar) {
        Object objA;
        ws wsVar2;
        long j3;
        Unsafe unsafe;
        ws wsVar3 = pp.a;
        op opVar = op.m;
        loop0: while (true) {
            objA = gv3.A(wsVar, j2, opVar);
            if (!g12.V(objA)) {
                kt2 kt2VarO = g12.O(objA);
                while (true) {
                    l.getClass();
                    Unsafe unsafe2 = kr.a;
                    long j4 = s;
                    kt2 kt2Var = (kt2) unsafe2.getObjectVolatile(this, j4);
                    if (kt2Var.e >= kt2VarO.e) {
                        break loop0;
                    }
                    if (!kt2VarO.n()) {
                        break;
                    }
                    do {
                        unsafe = kr.a;
                        if (unsafe.compareAndSwapObject(this, s, kt2Var, kt2VarO)) {
                            if (kt2Var.j()) {
                                kt2Var.h();
                            }
                        }
                    } while (unsafe.getObjectVolatile(this, j4) == kt2Var);
                    if (kt2VarO.j()) {
                        kt2VarO.h();
                    }
                }
            } else {
                break;
            }
        }
        if (g12.V(objA)) {
            B();
            if (wsVar.e * ((long) pp.b) < v()) {
                wsVar.a();
                return null;
            }
        } else {
            ws wsVar4 = (ws) g12.O(objA);
            long j5 = wsVar4.e;
            if (D() || j2 > i.get(this) / ((long) pp.b)) {
                wsVar2 = wsVar4;
                if (j5 > j2) {
                    return wsVar2;
                }
                long j6 = j5 * ((long) pp.b);
                do {
                    j3 = h.get(this);
                    if (j3 >= j6) {
                        break;
                    }
                } while (!h.compareAndSet(this, j3, j6));
                if (j5 * ((long) pp.b) < v()) {
                    wsVar2.a();
                }
            } else {
                while (true) {
                    m.getClass();
                    Unsafe unsafe3 = kr.a;
                    long j7 = q;
                    kt2 kt2Var2 = (kt2) unsafe3.getObjectVolatile(this, j7);
                    if (kt2Var2.e >= j5 || !wsVar4.n()) {
                        break;
                    }
                    while (true) {
                        Unsafe unsafe4 = kr.a;
                        wsVar2 = wsVar4;
                        if (unsafe4.compareAndSwapObject(this, q, kt2Var2, wsVar4)) {
                            if (kt2Var2.j()) {
                                kt2Var2.h();
                            }
                        } else {
                            if (unsafe4.getObjectVolatile(this, j7) != kt2Var2) {
                                break;
                            }
                            wsVar4 = wsVar2;
                        }
                    }
                    wsVar4 = wsVar2;
                }
                if (j5 > j2) {
                }
            }
        }
        return null;
    }

    public final ws p(long j2, ws wsVar) {
        Object objA;
        long j3;
        long j4;
        Unsafe unsafe;
        ws wsVar2 = pp.a;
        op opVar = op.m;
        loop0: while (true) {
            objA = gv3.A(wsVar, j2, opVar);
            if (!g12.V(objA)) {
                kt2 kt2VarO = g12.O(objA);
                while (true) {
                    k.getClass();
                    Unsafe unsafe2 = kr.a;
                    long j5 = t;
                    kt2 kt2Var = (kt2) unsafe2.getObjectVolatile(this, j5);
                    if (kt2Var.e >= kt2VarO.e) {
                        break loop0;
                    }
                    if (!kt2VarO.n()) {
                        break;
                    }
                    do {
                        unsafe = kr.a;
                        if (unsafe.compareAndSwapObject(this, t, kt2Var, kt2VarO)) {
                            if (kt2Var.j()) {
                                kt2Var.h();
                            }
                        }
                    } while (unsafe.getObjectVolatile(this, j5) == kt2Var);
                    if (kt2VarO.j()) {
                        kt2VarO.h();
                    }
                }
            } else {
                break;
            }
        }
        boolean zV = g12.V(objA);
        AtomicLongFieldUpdater atomicLongFieldUpdater = h;
        if (zV) {
            B();
            if (wsVar.e * ((long) pp.b) < atomicLongFieldUpdater.get(this)) {
                wsVar.a();
                return null;
            }
        } else {
            ws wsVar3 = (ws) g12.O(objA);
            long j6 = wsVar3.e;
            if (j6 <= j2) {
                return wsVar3;
            }
            long j7 = j6 * ((long) pp.b);
            do {
                j3 = g.get(this);
                j4 = 1152921504606846975L & j3;
                if (j4 >= j7) {
                    break;
                }
            } while (!g.compareAndSet(this, j3, j4 + (((long) ((int) (j3 >> 60))) << 60)));
            if (j6 * ((long) pp.b) < atomicLongFieldUpdater.get(this)) {
                wsVar3.a();
            }
        }
        return null;
    }

    public final Throwable r() {
        n.getClass();
        return (Throwable) kr.a.getObjectVolatile(this, p);
    }

    @Override // defpackage.js
    public final Object s(vy vyVar) {
        return H(this, vyVar);
    }

    public final Throwable t() {
        Throwable thR = r();
        return thR == null ? new gx("Channel was closed") : thR;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x01b2, code lost:
    
        r15 = r8;
        r16 = null;
        r3 = (defpackage.ws) r3.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01bc, code lost:
    
        if (r3 != null) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        int i2;
        String str;
        String string;
        StringBuilder sb = new StringBuilder();
        int i3 = (int) (g.get(this) >> 60);
        if (i3 == 2) {
            sb.append("closed,");
        } else if (i3 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f + ',');
        sb.append("data=[");
        l.getClass();
        Unsafe unsafe = kr.a;
        int i4 = 0;
        k.getClass();
        Object objectVolatile = unsafe.getObjectVolatile(this, t);
        int i5 = 1;
        m.getClass();
        List listL = vr.L(unsafe.getObjectVolatile(this, s), objectVolatile, unsafe.getObjectVolatile(this, q));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listL) {
            if (((ws) obj) != pp.a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            c.n();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j2 = ((ws) next).e;
            do {
                Object next2 = it.next();
                long j3 = ((ws) next2).e;
                if (j2 > j3) {
                    next = next2;
                    j2 = j3;
                }
            } while (it.hasNext());
        }
        ws wsVar = (ws) next;
        long j4 = h.get(this);
        long jV = v();
        loop2: while (true) {
            int i6 = pp.b;
            int i7 = i4;
            while (true) {
                if (i7 >= i6) {
                    break;
                }
                i2 = i5;
                long j5 = (wsVar.e * ((long) pp.b)) + ((long) i7);
                if (j5 >= jV && j5 >= j4) {
                    str = null;
                    break loop2;
                }
                Object objP = wsVar.p(i7);
                Object obj2 = wsVar.h.get(i7 * 2);
                if (objP instanceof hr) {
                    string = (jV > j5 || j5 >= j4) ? (j4 > j5 || j5 >= jV) ? "cont" : "send" : "receive";
                } else if (objP instanceof pj2) {
                    string = "receiveCatching";
                } else if (objP instanceof pr3) {
                    string = "EB(" + objP + ')';
                } else if (s51.n(objP, pp.f) || s51.n(objP, pp.g)) {
                    string = "resuming_sender";
                } else if (objP == null || objP.equals(pp.e) || objP.equals(pp.i) || objP.equals(pp.h) || objP.equals(pp.k) || objP.equals(pp.j) || objP.equals(pp.l)) {
                    i7++;
                    i5 = i2;
                } else {
                    string = objP.toString();
                }
                if (obj2 != null) {
                    sb.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb.append(string + ',');
                }
                i7++;
                i5 = i2;
            }
            i5 = i2;
            i4 = 0;
        }
        if (sb.length() == 0) {
            c.m("Char sequence is empty.");
            return str;
        }
        if (sb.charAt(sb.length() - i2) == ',') {
            sb.deleteCharAt(sb.length() - i2).getClass();
        }
        sb.append("]");
        return sb.toString();
    }

    public final Throwable u() {
        Throwable thR = r();
        return thR == null ? new hx("Channel was closed") : thR;
    }

    public final long v() {
        return g.get(this) & 1152921504606846975L;
    }

    public final boolean w() {
        while (true) {
            l.getClass();
            Unsafe unsafe = kr.a;
            long j2 = s;
            ws wsVarO = (ws) unsafe.getObjectVolatile(this, j2);
            AtomicLongFieldUpdater atomicLongFieldUpdater = h;
            long j3 = atomicLongFieldUpdater.get(this);
            if (v() <= j3) {
                return false;
            }
            long j4 = pp.b;
            long j5 = j3 / j4;
            if (wsVarO.e == j5 || (wsVarO = o(j5, wsVarO)) != null) {
                wsVarO.a();
                int i2 = (int) (j3 % j4);
                while (true) {
                    Object objP = wsVarO.p(i2);
                    if (objP == null || objP == pp.e) {
                        if (wsVarO.o(i2, objP, pp.h)) {
                            m();
                            break;
                        }
                    } else {
                        if (objP == pp.d) {
                            return true;
                        }
                        if (objP != pp.j && objP != pp.l && objP != pp.i && objP != pp.h) {
                            if (objP == pp.g) {
                                return true;
                            }
                            if (objP != pp.f && j3 == atomicLongFieldUpdater.get(this)) {
                                return true;
                            }
                        }
                    }
                }
                h.compareAndSet(this, j3, j3 + 1);
            } else if (((ws) unsafe.getObjectVolatile(this, j2)).e < j5) {
                return false;
            }
        }
    }

    public final void y() {
        Object objectVolatile;
        np npVar;
        loop0: while (true) {
            o.getClass();
            Unsafe unsafe = kr.a;
            long j2 = r;
            objectVolatile = unsafe.getObjectVolatile(this, j2);
            ai0 ai0Var = objectVolatile == null ? pp.q : pp.r;
            while (true) {
                Unsafe unsafe2 = kr.a;
                npVar = this;
                if (unsafe2.compareAndSwapObject(npVar, r, objectVolatile, ai0Var)) {
                    break loop0;
                } else if (unsafe2.getObjectVolatile(npVar, j2) != objectVolatile) {
                    break;
                } else {
                    this = npVar;
                }
            }
            this = npVar;
        }
        if (objectVolatile == null) {
            return;
        }
        cl3.i(1, objectVolatile);
        ((ns0) objectVolatile).h(npVar.r());
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a3, code lost:
    
        r10 = (defpackage.ws) r10.e();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean z(long j2, boolean z) {
        int i2 = (int) (j2 >> 60);
        if (i2 != 0 && i2 != 1) {
            if (i2 == 2) {
                j(j2 & 1152921504606846975L);
                if (!z || !w()) {
                }
            } else {
                if (i2 != 3) {
                    qn1.e(by1.e(i2, "unexpected close status: "));
                    return false;
                }
                ws wsVarJ = j(j2 & 1152921504606846975L);
                Object objP = null;
                loop0: do {
                    int i3 = pp.b - 1;
                    while (true) {
                        if (-1 >= i3) {
                            break;
                        }
                        long j3 = (wsVarJ.e * ((long) pp.b)) + ((long) i3);
                        while (true) {
                            Object objP2 = wsVarJ.p(i3);
                            if (objP2 == pp.i) {
                                break loop0;
                            }
                            ai0 ai0Var = pp.d;
                            AtomicLongFieldUpdater atomicLongFieldUpdater = h;
                            if (objP2 != ai0Var) {
                                if (objP2 != pp.e && objP2 != null) {
                                    if (!(objP2 instanceof or3) && !(objP2 instanceof pr3)) {
                                        ai0 ai0Var2 = pp.g;
                                        if (objP2 == ai0Var2 || objP2 == pp.f) {
                                            break loop0;
                                        }
                                        if (objP2 != ai0Var2) {
                                            break;
                                        }
                                    } else {
                                        if (j3 < atomicLongFieldUpdater.get(this)) {
                                            break loop0;
                                        }
                                        or3 or3Var = objP2 instanceof pr3 ? ((pr3) objP2).a : (or3) objP2;
                                        if (wsVarJ.o(i3, objP2, pp.l)) {
                                            objP = vp.P(objP, or3Var);
                                            wsVarJ.r(i3, null);
                                            wsVarJ.m();
                                            break;
                                        }
                                    }
                                } else {
                                    if (wsVarJ.o(i3, objP2, pp.l)) {
                                        wsVarJ.m();
                                        break;
                                    }
                                }
                            } else {
                                if (j3 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (wsVarJ.o(i3, objP2, pp.l)) {
                                    wsVarJ.r(i3, null);
                                    wsVarJ.m();
                                    break;
                                }
                            }
                        }
                        i3--;
                    }
                } while (wsVarJ != null);
                if (objP != null) {
                    if (objP instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) objP;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            J((or3) arrayList.get(size), false);
                        }
                    } else {
                        J((or3) objP, false);
                    }
                }
            }
            return true;
        }
        return false;
    }
}
