package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object H(defpackage.np r13, defpackage.q40 r14) {
        /*
            boolean r0 = r14 instanceof defpackage.lp
            if (r0 == 0) goto L14
            r0 = r14
            lp r0 = (defpackage.lp) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.k = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            lp r0 = new lp
            r0.<init>(r13, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.i
            int r0 = r6.k
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L32
            if (r0 != r2) goto L2c
            defpackage.y02.Q(r14)
            vs r14 = (defpackage.vs) r14
            java.lang.Object r13 = r14.a
            return r13
        L2c:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r13)
            return r1
        L32:
            defpackage.y02.Q(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = defpackage.np.l
            r14.getClass()
            sun.misc.Unsafe r14 = defpackage.kr.a
            long r3 = defpackage.np.s
            java.lang.Object r14 = r14.getObjectVolatile(r13, r3)
            ws r14 = (defpackage.ws) r14
        L44:
            boolean r0 = r13.A()
            if (r0 == 0) goto L54
            java.lang.Throwable r13 = r13.r()
            ts r14 = new ts
            r14.<init>(r13)
            return r14
        L54:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.np.h
            long r4 = r0.getAndIncrement(r13)
            int r0 = defpackage.pp.b
            long r7 = (long) r0
            long r9 = r4 / r7
            long r7 = r4 % r7
            int r3 = (int) r7
            long r7 = r14.e
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 == 0) goto L71
            ws r0 = r13.o(r9, r14)
            if (r0 != 0) goto L6f
            goto L44
        L6f:
            r8 = r0
            goto L72
        L71:
            r8 = r14
        L72:
            r12 = 0
            r7 = r13
            r9 = r3
            r10 = r4
            java.lang.Object r13 = r7.N(r8, r9, r10, r12)
            ai0 r14 = defpackage.pp.m
            if (r13 == r14) goto La6
            ai0 r14 = defpackage.pp.o
            if (r13 != r14) goto L90
            long r13 = r7.v()
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 >= 0) goto L8d
            r8.a()
        L8d:
            r13 = r7
            r14 = r8
            goto L44
        L90:
            ai0 r14 = defpackage.pp.n
            if (r13 != r14) goto La2
            r6.k = r2
            r1 = r7
            r2 = r8
            java.lang.Object r13 = r1.I(r2, r3, r4, r6)
            y50 r14 = defpackage.y50.f
            if (r13 != r14) goto La1
            return r14
        La1:
            return r13
        La2:
            r8.a()
            return r13
        La6:
            java.lang.String r13 = "unexpected"
            defpackage.c.q(r13)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.np.H(np, q40):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0158 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object K(defpackage.np r26, java.lang.Object r27, defpackage.p40 r28) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.np.K(np, java.lang.Object, p40):java.lang.Object");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(long r7, defpackage.ws r9) {
        /*
            r6 = this;
        L0:
            long r0 = r9.e
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 >= 0) goto L11
            x20 r0 = r9.c()
            ws r0 = (defpackage.ws) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r9 = r0
            goto L0
        L11:
            r5 = r9
        L12:
            boolean r7 = r5.f()
            if (r7 == 0) goto L23
            x20 r7 = r5.c()
            ws r7 = (defpackage.ws) r7
            if (r7 != 0) goto L21
            goto L23
        L21:
            r5 = r7
            goto L12
        L23:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = defpackage.np.m
            r7.getClass()
            sun.misc.Unsafe r7 = defpackage.kr.a
            long r8 = defpackage.np.q
            java.lang.Object r7 = r7.getObjectVolatile(r6, r8)
            r4 = r7
            kt2 r4 = (defpackage.kt2) r4
            long r0 = r4.e
            long r2 = r5.e
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 < 0) goto L3c
            goto L58
        L3c:
            boolean r7 = r5.n()
            if (r7 != 0) goto L44
            r9 = r5
            goto L11
        L44:
            sun.misc.Unsafe r0 = defpackage.kr.a
            long r2 = defpackage.np.q
            r1 = r6
            boolean r6 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r6 == 0) goto L59
            boolean r6 = r4.j()
            if (r6 == 0) goto L58
            r4.h()
        L58:
            return
        L59:
            java.lang.Object r6 = r0.getObjectVolatile(r1, r8)
            if (r6 == r4) goto L6a
            boolean r6 = r5.j()
            if (r6 == 0) goto L68
            r5.h()
        L68:
            r6 = r1
            goto L23
        L6a:
            r6 = r1
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.np.E(long, ws):void");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I(defpackage.ws r10, int r11, long r12, defpackage.q40 r14) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.np.I(ws, int, long, q40):java.lang.Object");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ws j(long r12) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.np.j(long):ws");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object l(java.lang.Object r16) {
        /*
            r15 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = defpackage.np.g
            long r1 = r8.get(r15)
            r9 = 0
            boolean r3 = r15.z(r1, r9)
            r10 = 1
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            if (r3 == 0) goto L15
            r1 = r9
            goto L1b
        L15:
            long r1 = r1 & r11
            boolean r1 = r15.f(r1)
            r1 = r1 ^ r10
        L1b:
            us r13 = defpackage.vs.b
            if (r1 == 0) goto L20
            return r13
        L20:
            ai0 r6 = defpackage.pp.j
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = defpackage.np.k
            r1.getClass()
            sun.misc.Unsafe r1 = defpackage.kr.a
            long r2 = defpackage.np.t
            java.lang.Object r1 = r1.getObjectVolatile(r15, r2)
            ws r1 = (defpackage.ws) r1
        L31:
            long r2 = r8.getAndIncrement(r15)
            long r4 = r2 & r11
            boolean r7 = r15.z(r2, r9)
            int r14 = defpackage.pp.b
            long r2 = (long) r14
            long r11 = r4 / r2
            long r2 = r4 % r2
            int r2 = (int) r2
            long r9 = r1.e
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 == 0) goto L64
            ws r3 = r15.p(r11, r1)
            if (r3 != 0) goto L63
            if (r7 == 0) goto L5b
            java.lang.Throwable r0 = r15.u()
            ts r1 = new ts
            r1.<init>(r0)
            return r1
        L5b:
            r9 = 0
            r10 = 1
        L5d:
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            goto L31
        L63:
            r1 = r3
        L64:
            r0 = r15
            r3 = r16
            int r9 = d(r0, r1, r2, r3, r4, r6, r7)
            dm3 r3 = defpackage.dm3.a
            if (r9 == 0) goto Lc3
            r10 = 1
            if (r9 == r10) goto Lc2
            r3 = 2
            r11 = 0
            if (r9 == r3) goto La2
            r2 = 3
            if (r9 == r2) goto L9c
            r2 = 4
            if (r9 == r2) goto L85
            r2 = 5
            if (r9 == r2) goto L80
            goto L83
        L80:
            r1.a()
        L83:
            r9 = 0
            goto L5d
        L85:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = defpackage.np.h
            long r2 = r2.get(r15)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L92
            r1.a()
        L92:
            java.lang.Throwable r0 = r15.u()
            ts r1 = new ts
            r1.<init>(r0)
            return r1
        L9c:
            java.lang.String r0 = "unexpected"
            defpackage.c.q(r0)
            return r11
        La2:
            if (r7 == 0) goto Lb1
            r1.m()
            java.lang.Throwable r0 = r15.u()
            ts r1 = new ts
            r1.<init>(r0)
            return r1
        Lb1:
            boolean r0 = r6 instanceof defpackage.or3
            if (r0 == 0) goto Lb8
            r11 = r6
            or3 r11 = (defpackage.or3) r11
        Lb8:
            if (r11 == 0) goto Lbe
            int r2 = r2 + r14
            r11.a(r1, r2)
        Lbe:
            r1.m()
            return r13
        Lc2:
            return r3
        Lc3:
            r1.a()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.np.l(java.lang.Object):java.lang.Object");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m() {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.np.m():void");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ws o(long r16, defpackage.ws r18) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.np.o(long, ws):ws");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.np.toString():java.lang.String");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean z(long r10, boolean r12) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.np.z(long, boolean):boolean");
    }
}
