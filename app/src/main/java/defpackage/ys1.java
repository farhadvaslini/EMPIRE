package defpackage;

import java.io.Serializable;
import java.net.Inet4Address;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ys1 extends mb3 implements rs0 {
    public final /* synthetic */ int j = 1;
    public int k;
    public Object l;
    public Object m;
    public Object n;
    public Object o;
    public Object p;
    public Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Serializable s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ys1(ts1 ts1Var, zs1 zs1Var, rs0 rs0Var, Object obj, p40 p40Var) {
        super(2, p40Var);
        this.s = ts1Var;
        this.r = zs1Var;
        this.t = rs0Var;
        this.p = obj;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        x50 x50Var = (x50) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
        }
        return ((ys1) m(p40Var, x50Var)).o(dm3Var);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        Object obj2 = this.t;
        Serializable serializable = this.s;
        Object obj3 = this.r;
        switch (i) {
            case 0:
                ys1 ys1Var = new ys1((ts1) serializable, (zs1) obj3, (rs0) obj2, this.p, p40Var);
                ys1Var.o = obj;
                return ys1Var;
            default:
                ys1 ys1Var2 = new ys1((ak2) this.q, (sv2) obj3, (Inet4Address) serializable, (xy2) obj2, p40Var);
                ys1Var2.l = obj;
                return ys1Var2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) throws Throwable {
        ws1 ws1Var;
        rs0 rs0Var;
        bt1 bt1Var;
        Object obj2;
        zs1 zs1Var;
        ws1 ws1Var2;
        Object objF;
        bt1 bt1Var2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        ba0 ba0VarH;
        Object obj3;
        aa0 aa0VarH;
        Object objE;
        Object objF2;
        aa0 aa0Var;
        aq2 aq2Var;
        Map map;
        Object objF3;
        int i = this.j;
        y50 y50Var = y50.f;
        Object obj4 = this.r;
        Serializable serializable = this.s;
        Object obj5 = this.t;
        switch (i) {
            case 0:
                zs1 zs1Var2 = (zs1) obj4;
                int i2 = this.k;
                try {
                    try {
                        if (i2 == 0) {
                            y02.Q(obj);
                            m50 m50VarM = ((x50) this.o).h().m(f5.b0);
                            m50VarM.getClass();
                            ws1 ws1Var3 = new ws1((ts1) serializable, (j61) m50VarM);
                            zs1.a(zs1Var2, ws1Var3);
                            dt1 dt1Var = zs1Var2.b;
                            rs0 rs0Var2 = (rs0) obj5;
                            Object obj6 = this.p;
                            this.o = ws1Var3;
                            this.m = dt1Var;
                            this.l = rs0Var2;
                            this.n = obj6;
                            this.q = zs1Var2;
                            this.k = 1;
                            if (dt1Var.f(this) == y50Var) {
                                return y50Var;
                            }
                            ws1Var = ws1Var3;
                            rs0Var = rs0Var2;
                            bt1Var = dt1Var;
                            obj2 = obj6;
                        } else {
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    c.q("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                zs1Var = (zs1) this.l;
                                bt1Var2 = (bt1) this.m;
                                ws1Var2 = (ws1) this.o;
                                try {
                                    y02.Q(obj);
                                    objF = obj;
                                    atomicReference2 = zs1Var.a;
                                    while (!atomicReference2.compareAndSet(ws1Var2, null) && atomicReference2.get() == ws1Var2) {
                                    }
                                    ((dt1) bt1Var2).i(null);
                                    return objF;
                                } catch (Throwable th) {
                                    th = th;
                                    atomicReference = zs1Var.a;
                                    while (!atomicReference.compareAndSet(ws1Var2, null)) {
                                    }
                                    throw th;
                                }
                            }
                            zs1Var2 = (zs1) this.q;
                            obj2 = this.n;
                            rs0Var = (rs0) this.l;
                            bt1Var = (bt1) this.m;
                            ws1Var = (ws1) this.o;
                            y02.Q(obj);
                        }
                        this.o = ws1Var;
                        this.m = bt1Var;
                        this.l = zs1Var2;
                        this.n = null;
                        this.q = null;
                        this.k = 2;
                        objF = rs0Var.f(obj2, this);
                        if (objF == y50Var) {
                            return y50Var;
                        }
                        bt1Var2 = bt1Var;
                        zs1Var = zs1Var2;
                        ws1Var2 = ws1Var;
                        atomicReference2 = zs1Var.a;
                        while (!atomicReference2.compareAndSet(ws1Var2, null)) {
                        }
                        ((dt1) bt1Var2).i(null);
                        return objF;
                    } catch (Throwable th2) {
                        th = th2;
                        zs1Var = zs1Var2;
                        ws1Var2 = ws1Var;
                        atomicReference = zs1Var.a;
                        while (!atomicReference.compareAndSet(ws1Var2, null) && atomicReference.get() == ws1Var2) {
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    ((dt1) "call to 'resume' before 'invoke' with coroutine").i(null);
                    throw th3;
                }
            default:
                xy2 xy2Var = (xy2) obj5;
                Inet4Address inet4Address = (Inet4Address) serializable;
                sv2 sv2Var = (sv2) obj4;
                x50 x50Var = (x50) this.l;
                int i3 = this.k;
                p40 p40Var = null;
                if (i3 == 0) {
                    y02.Q(obj);
                    p40 p40Var2 = null;
                    ba0 ba0VarH2 = cl3.h(x50Var, new wp2((ak2) this.q, sv2Var, inet4Address, xy2Var, p40Var2, 0));
                    ba0VarH = cl3.h(x50Var, new wp2((ak2) this.q, sv2Var, inet4Address, xy2Var, p40Var2, 1));
                    obj3 = null;
                    aa0VarH = cl3.h(x50Var, new f50((ak2) this.q, sv2Var, inet4Address, p40Var, 2));
                    this.l = null;
                    this.m = ba0VarH;
                    this.n = aa0VarH;
                    this.k = 1;
                    objE = ba0VarH2.E(this);
                    if (objE == y50Var) {
                        return y50Var;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                c.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Map map2 = (Map) this.p;
                            aq2 aq2Var2 = (aq2) this.o;
                            y02.Q(obj);
                            map = map2;
                            aq2Var = aq2Var2;
                            objF3 = obj;
                            return new yp2(new bq2(aq2Var, map, (Long) objF3));
                        }
                        aq2Var = (aq2) this.o;
                        aa0Var = (aa0) this.n;
                        y02.Q(obj);
                        objF2 = obj;
                        obj3 = null;
                        map = (Map) objF2;
                        this.l = obj3;
                        this.m = obj3;
                        this.n = obj3;
                        this.o = aq2Var;
                        this.p = map;
                        this.k = 3;
                        objF3 = aa0Var.f(this);
                        if (objF3 == y50Var) {
                            return y50Var;
                        }
                        return new yp2(new bq2(aq2Var, map, (Long) objF3));
                    }
                    aa0VarH = (aa0) this.n;
                    ba0 ba0Var = (ba0) this.m;
                    y02.Q(obj);
                    ba0VarH = ba0Var;
                    obj3 = null;
                    objE = obj;
                }
                aq2 aq2Var3 = (aq2) objE;
                this.l = obj3;
                this.m = obj3;
                this.n = aa0VarH;
                this.o = aq2Var3;
                this.k = 2;
                objF2 = ba0VarH.f(this);
                if (objF2 == y50Var) {
                    return y50Var;
                }
                aa0Var = aa0VarH;
                aq2Var = aq2Var3;
                map = (Map) objF2;
                this.l = obj3;
                this.m = obj3;
                this.n = obj3;
                this.o = aq2Var;
                this.p = map;
                this.k = 3;
                objF3 = aa0Var.f(this);
                if (objF3 == y50Var) {
                }
                return new yp2(new bq2(aq2Var, map, (Long) objF3));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ys1(ak2 ak2Var, sv2 sv2Var, Inet4Address inet4Address, xy2 xy2Var, p40 p40Var) {
        super(2, p40Var);
        this.q = ak2Var;
        this.r = sv2Var;
        this.s = inet4Address;
        this.t = xy2Var;
    }
}
