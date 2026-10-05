package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class s33 {
    public final ns0 a;
    public final d6 c;
    public oe b = q33.a;
    public mm0 d = n92.D();
    public mm0 e = n92.D();

    public s33(cs0 cs0Var, cs0 cs0Var2, t33 t33Var, ns0 ns0Var) {
        this.a = ns0Var;
        this.c = new d6(t33Var, new rf(cs0Var, 6), cs0Var2, new it1(21, this), ns0Var);
    }

    public static Object a(s33 s33Var, t33 t33Var, mm0 mm0Var, mb3 mb3Var) {
        Object objB = s33Var.c.b(t33Var, ts1.f, new r33(s33Var, s33Var.c.k.g(), mm0Var, null), mb3Var);
        return objB == y50.f ? objB : dm3.a;
    }

    public final Object b(mb3 mb3Var) {
        Object objA;
        ns0 ns0Var = this.a;
        t33 t33Var = t33.g;
        return (((Boolean) ns0Var.h(t33Var)).booleanValue() && (objA = a(this, t33Var, this.d, mb3Var)) == y50.f) ? objA : dm3.a;
    }

    public final Object c(mb3 mb3Var) {
        Object objA;
        ns0 ns0Var = this.a;
        t33 t33Var = t33.f;
        return (((Boolean) ns0Var.h(t33Var)).booleanValue() && (objA = a(this, t33Var, this.e, mb3Var)) == y50.f) ? objA : dm3.a;
    }

    public final boolean d() {
        return this.c.g.getValue() != t33.f;
    }

    public final Object e(mb3 mb3Var) {
        Object objA;
        ns0 ns0Var = this.a;
        t33 t33Var = t33.h;
        return (((Boolean) ns0Var.h(t33Var)).booleanValue() && (objA = a(this, t33Var, this.e, mb3Var)) == y50.f) ? objA : dm3.a;
    }

    public final Object f(mb3 mb3Var) {
        Object objA;
        Map map = this.c.d().a;
        t33 t33Var = t33.h;
        if (!map.containsKey(t33Var)) {
            t33Var = t33.g;
        }
        return (((Boolean) this.a.h(t33Var)).booleanValue() && (objA = a(this, t33Var, this.d, mb3Var)) == y50.f) ? objA : dm3.a;
    }
}
