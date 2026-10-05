package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class y20 extends np {
    public final jp u;

    public y20(int i, jp jpVar) {
        super(i);
        this.u = jpVar;
        if (jpVar == jp.f) {
            qn1.m(rk2.a(np.class).c(), " instead", "This implementation does not support suspension for senders, use ");
            throw null;
        }
        if (i >= 1) {
            return;
        }
        c.g(by1.h("Buffered channel capacity must be at least 1, but ", " was specified", i));
        throw null;
    }

    @Override // defpackage.np
    public final boolean C() {
        return this.u == jp.g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b4, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Q(Object obj, boolean z) {
        jp jpVar = this.u;
        jp jpVar2 = jp.h;
        dm3 dm3Var = dm3.a;
        if (jpVar == jpVar2) {
            Object objL = super.l(obj);
            return (!(objL instanceof us) || (objL instanceof ts)) ? objL : dm3Var;
        }
        yh0 yh0Var = pp.d;
        ws wsVar = (ws) np.k.get(this);
        while (true) {
            long andIncrement = np.g.getAndIncrement(this);
            long j = 1152921504606846975L & andIncrement;
            boolean z2 = z(andIncrement, false);
            int i = pp.b;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (wsVar.e != j3) {
                ws wsVarP = p(j3, wsVar);
                if (wsVarP != null) {
                    wsVar = wsVarP;
                } else if (z2) {
                    return new ts(u());
                }
            }
            int iD = np.d(this, wsVar, i2, obj, j, yh0Var, z2);
            if (iD == 0) {
                wsVar.a();
                return dm3Var;
            }
            if (iD == 1) {
                break;
            }
            if (iD != 2) {
                if (iD == 3) {
                    c.q("unexpected");
                    return null;
                }
                if (iD == 4) {
                    if (j < np.h.get(this)) {
                        wsVar.a();
                    }
                    return new ts(u());
                }
                if (iD == 5) {
                    wsVar.a();
                }
            } else {
                if (z2) {
                    wsVar.m();
                    return new ts(u());
                }
                or3 or3Var = yh0Var instanceof or3 ? (or3) yh0Var : null;
                if (or3Var != null) {
                    or3Var.a(wsVar, i2 + i);
                }
                k((wsVar.e * j2) + ((long) i2));
            }
        }
    }

    @Override // defpackage.np, defpackage.lv2
    public final Object a(p40 p40Var, Object obj) throws Throwable {
        if (Q(obj, true) instanceof ts) {
            throw u();
        }
        return dm3.a;
    }

    @Override // defpackage.np, defpackage.lv2
    public final Object l(Object obj) {
        return Q(obj, false);
    }
}
