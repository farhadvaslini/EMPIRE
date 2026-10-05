package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class d6 {
    public final rf a;
    public final cs0 b;
    public final it1 c;
    public final ns0 d;
    public final d42 g;
    public final z32 k;
    public final d42 l;
    public final d42 m;
    public final a6 n;
    public final f51 e = new f51();
    public final a31 f = new a31(this);
    public final cb0 h = b32.j(new v5(this, 0));
    public final cb0 i = b32.j(new v5(this, 1));
    public final z32 j = new z32(Float.NaN);

    public d6(t33 t33Var, rf rfVar, cs0 cs0Var, it1 it1Var, ns0 ns0Var) {
        this.a = rfVar;
        this.b = cs0Var;
        this.c = it1Var;
        this.d = ns0Var;
        this.g = b32.w(t33Var);
        b32.k(new v5(this, 2), m22.u);
        this.k = new z32(0.0f);
        this.l = b32.w(null);
        this.m = b32.w(new fm1(oi0.f));
        this.n = new a6(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ts1 ts1Var, b6 b6Var, q40 q40Var) {
        w5 w5Var;
        if (q40Var instanceof w5) {
            w5Var = (w5) q40Var;
            int i = w5Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                w5Var.k = i - Integer.MIN_VALUE;
            } else {
                w5Var = new w5(this, q40Var);
            }
        }
        Object obj = w5Var.i;
        int i2 = w5Var.k;
        ns0 ns0Var = this.d;
        z32 z32Var = this.j;
        try {
            if (i2 == 0) {
                y02.Q(obj);
                f51 f51Var = this.e;
                p40 p40Var = null;
                x5 x5Var = new x5(this, b6Var, p40Var, 0);
                w5Var.k = 1;
                f51Var.getClass();
                Object objW = ur.w(new e51(ts1Var, f51Var, x5Var, p40Var, 0), w5Var);
                y50 y50Var = y50.f;
                if (objW == y50Var) {
                    return y50Var;
                }
            } else {
                if (i2 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y02.Q(obj);
            }
            Object objA = d().a(z32Var.g());
            if (objA != null && Math.abs(z32Var.g() - d().d(objA)) <= 0.5f && ((Boolean) ns0Var.h(objA)).booleanValue()) {
                g(objA);
            }
            return dm3.a;
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, ts1 ts1Var, ts0 ts0Var, q40 q40Var) {
        y5 y5Var;
        z32 z32Var;
        Object objA;
        z32 z32Var2;
        if (q40Var instanceof y5) {
            y5Var = (y5) q40Var;
            int i = y5Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                y5Var.k = i - Integer.MIN_VALUE;
            } else {
                y5Var = new y5(this, q40Var);
            }
        }
        y5 y5Var2 = y5Var;
        Object obj2 = y5Var2.i;
        int i2 = y5Var2.k;
        ns0 ns0Var = this.d;
        p40 p40Var = null;
        Object obj3 = this.j;
        try {
            if (i2 == 0) {
                y02.Q(obj2);
                if (!d().a.containsKey(obj)) {
                    g(obj);
                    return dm3.a;
                }
                f51 f51Var = this.e;
                try {
                    z5 z5Var = new z5(this, obj, ts0Var, p40Var, 0);
                    y5Var2.k = 1;
                    f51Var.getClass();
                    z32Var = obj3;
                    try {
                        e51 e51Var = new e51(ts1Var, f51Var, z5Var, p40Var, 0);
                        Object objW = ur.w(e51Var, y5Var2);
                        y50 y50Var = y50.f;
                        z32Var2 = z32Var;
                        obj3 = e51Var;
                        if (objW == y50Var) {
                            return y50Var;
                        }
                    } catch (Throwable th) {
                        th = th;
                        h(p40Var);
                        objA = d().a(z32Var.g());
                        if (objA != null && Math.abs(z32Var.g() - d().d(objA)) <= 0.5f && ((Boolean) ns0Var.h(objA)).booleanValue()) {
                            g(objA);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    p40Var = null;
                    z32Var = obj3;
                    h(p40Var);
                    objA = d().a(z32Var.g());
                    if (objA != null) {
                        g(objA);
                    }
                    throw th;
                }
            } else {
                if (i2 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y02.Q(obj2);
                z32Var2 = obj3;
                obj3 = obj3;
            }
            h(null);
            Object objA2 = d().a(z32Var2.g());
            if (objA2 != null && Math.abs(z32Var2.g() - d().d(objA2)) <= 0.5f && ((Boolean) ns0Var.h(objA2)).booleanValue()) {
                g(objA2);
            }
            return dm3.a;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final Object c(float f, float f2, Object obj) {
        fm1 fm1VarD = d();
        float fD = fm1VarD.d(obj);
        float fFloatValue = ((Number) this.b.a()).floatValue();
        if (fD != f && !Float.isNaN(fD)) {
            rf rfVar = this.a;
            if (fD < f) {
                if (f2 >= fFloatValue) {
                    Object objB = fm1VarD.b(f, true);
                    objB.getClass();
                    return objB;
                }
                Object objB2 = fm1VarD.b(f, true);
                objB2.getClass();
                if (f >= Math.abs(Math.abs(((Number) rfVar.h(Float.valueOf(Math.abs(fm1VarD.d(objB2) - fD)))).floatValue()) + fD)) {
                    return objB2;
                }
            } else {
                if (f2 <= (-fFloatValue)) {
                    Object objB3 = fm1VarD.b(f, false);
                    objB3.getClass();
                    return objB3;
                }
                Object objB4 = fm1VarD.b(f, false);
                objB4.getClass();
                float fAbs = Math.abs(fD - Math.abs(((Number) rfVar.h(Float.valueOf(Math.abs(fD - fm1VarD.d(objB4))))).floatValue()));
                if (f >= 0.0f ? f <= fAbs : Math.abs(f) >= fAbs) {
                    return objB4;
                }
            }
        }
        return obj;
    }

    public final fm1 d() {
        return (fm1) this.m.getValue();
    }

    public final float e(float f) {
        Float fValueOf;
        z32 z32Var = this.j;
        float fG = (Float.isNaN(z32Var.g()) ? 0.0f : z32Var.g()) + f;
        float fC = d().c();
        Collection collectionValues = d().a.values();
        collectionValues.getClass();
        Iterator it = collectionValues.iterator();
        if (it.hasNext()) {
            float fFloatValue = ((Number) it.next()).floatValue();
            while (it.hasNext()) {
                fFloatValue = Math.max(fFloatValue, ((Number) it.next()).floatValue());
            }
            fValueOf = Float.valueOf(fFloatValue);
        } else {
            fValueOf = null;
        }
        return y02.g(fG, fC, fValueOf != null ? fValueOf.floatValue() : Float.NaN);
    }

    public final float f() {
        z32 z32Var = this.j;
        if (!Float.isNaN(z32Var.g())) {
            return z32Var.g();
        }
        c.q("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        return 0.0f;
    }

    public final void g(Object obj) {
        this.g.setValue(obj);
    }

    public final void h(Object obj) {
        this.l.setValue(obj);
    }
}
