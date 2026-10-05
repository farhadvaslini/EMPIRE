package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class kp implements or3 {
    public Object f = pp.p;
    public jr g;
    public final /* synthetic */ np h;

    public kp(np npVar) {
        this.h = npVar;
    }

    @Override // defpackage.or3
    public final void a(kt2 kt2Var, int i) {
        jr jrVar = this.g;
        if (jrVar != null) {
            jrVar.a(kt2Var, i);
        }
    }

    public final Object b(q40 q40Var) {
        ws wsVarO;
        Object obj = this.f;
        boolean z = true;
        if (obj == pp.p || obj == pp.l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = np.l;
            np npVar = this.h;
            ws wsVar = (ws) atomicReferenceFieldUpdater.get(npVar);
            while (true) {
                if (npVar.A()) {
                    this.f = pp.l;
                    Throwable thR = npVar.r();
                    if (thR != null) {
                        int i = u83.a;
                        throw thR;
                    }
                    z = false;
                } else {
                    long andIncrement = np.h.getAndIncrement(npVar);
                    long j = pp.b;
                    long j2 = andIncrement / j;
                    int i2 = (int) (andIncrement % j);
                    if (wsVar.e != j2) {
                        wsVarO = npVar.o(j2, wsVar);
                        if (wsVarO == null) {
                            continue;
                        }
                    } else {
                        wsVarO = wsVar;
                    }
                    Object objN = npVar.N(wsVarO, i2, andIncrement, null);
                    ai0 ai0Var = pp.m;
                    if (objN == ai0Var) {
                        c.q("unreachable");
                        return null;
                    }
                    ai0 ai0Var2 = pp.o;
                    if (objN == ai0Var2) {
                        if (andIncrement < npVar.v()) {
                            wsVarO.a();
                        }
                        wsVar = wsVarO;
                    } else {
                        if (objN == pp.n) {
                            np npVar2 = this.h;
                            jr jrVarH = lr.H(vr.I(q40Var));
                            try {
                                this.g = jrVarH;
                                Object objN2 = npVar2.N(wsVarO, i2, andIncrement, this);
                                if (objN2 == ai0Var) {
                                    a(wsVarO, i2);
                                } else {
                                    if (objN2 == ai0Var2) {
                                        if (andIncrement < npVar2.v()) {
                                            wsVarO.a();
                                        }
                                        ws wsVar2 = (ws) np.l.get(npVar2);
                                        while (true) {
                                            if (npVar2.A()) {
                                                jr jrVar = this.g;
                                                jrVar.getClass();
                                                this.g = null;
                                                this.f = pp.l;
                                                Throwable thR2 = npVar.r();
                                                if (thR2 == null) {
                                                    jrVar.t(Boolean.FALSE);
                                                } else {
                                                    jrVar.t(new qn2(thR2));
                                                }
                                            } else {
                                                long andIncrement2 = np.h.getAndIncrement(npVar2);
                                                long j3 = pp.b;
                                                long j4 = andIncrement2 / j3;
                                                int i3 = (int) (andIncrement2 % j3);
                                                if (wsVar2.e != j4) {
                                                    ws wsVarO2 = npVar2.o(j4, wsVar2);
                                                    if (wsVarO2 != null) {
                                                        wsVar2 = wsVarO2;
                                                    }
                                                }
                                                Object objN3 = npVar2.N(wsVar2, i3, andIncrement2, this);
                                                if (objN3 == pp.m) {
                                                    a(wsVar2, i3);
                                                    break;
                                                }
                                                if (objN3 == pp.o) {
                                                    if (andIncrement2 < npVar2.v()) {
                                                        wsVar2.a();
                                                    }
                                                } else {
                                                    if (objN3 == pp.n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    wsVar2.a();
                                                    this.f = objN3;
                                                    this.g = null;
                                                }
                                            }
                                        }
                                    } else {
                                        wsVarO.a();
                                        this.f = objN2;
                                        this.g = null;
                                    }
                                    jrVarH.y(Boolean.TRUE, null);
                                }
                                return jrVarH.q();
                            } catch (Throwable th) {
                                jrVarH.E();
                                throw th;
                            }
                        }
                        wsVarO.a();
                        this.f = objN;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }

    public final Object c() {
        Object obj = this.f;
        ai0 ai0Var = pp.p;
        if (obj == ai0Var) {
            c.q("`hasNext()` has not been invoked");
            return null;
        }
        this.f = ai0Var;
        if (obj != pp.l) {
            return obj;
        }
        Throwable thT = this.h.t();
        int i = u83.a;
        throw thT;
    }
}
