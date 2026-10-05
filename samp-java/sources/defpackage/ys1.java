package defpackage;

import java.io.Serializable;
import java.net.Inet4Address;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ys1.o(java.lang.Object):java.lang.Object");
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
