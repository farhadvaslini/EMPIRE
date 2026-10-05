package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class c43 {
    public final dt1 a = new dt1();
    public final yl1 b = new yl1(8);
    public final p70 c = new p70(3, new dc(2, null, 3));

    public c43(String str) {
    }

    public final Integer a() {
        return new Integer(((AtomicInteger) this.b.g).get());
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        if (r8 == r5) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v0, types: [c43] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v6, types: [dt1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ns0 ns0Var, q40 q40Var) {
        a43 a43Var;
        dt1 dt1Var;
        bt1 bt1Var;
        if (q40Var instanceof a43) {
            a43Var = (a43) q40Var;
            int i = a43Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                a43Var.m = i - Integer.MIN_VALUE;
            } else {
                a43Var = new a43(this, q40Var);
            }
        }
        Object objH = a43Var.k;
        int i2 = a43Var.m;
        y50 y50Var = y50.f;
        try {
            if (i2 == 0) {
                y02.Q(objH);
                a43Var.i = ns0Var;
                dt1 dt1Var2 = this.a;
                a43Var.j = dt1Var2;
                a43Var.m = 1;
                Object objF = dt1Var2.f(a43Var);
                dt1Var = dt1Var2;
                if (objF != y50Var) {
                }
                return y50Var;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bt1 bt1Var2 = (bt1) a43Var.i;
                y02.Q(objH);
                bt1Var = bt1Var2;
                return objH;
            }
            dt1 dt1Var3 = a43Var.j;
            ns0Var = (ns0) a43Var.i;
            y02.Q(objH);
            dt1Var = dt1Var3;
            a43Var.i = dt1Var;
            a43Var.j = null;
            a43Var.m = 2;
            objH = ns0Var.h(a43Var);
            bt1Var = dt1Var;
        } finally {
            ((dt1) this).i(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(rs0 rs0Var, q40 q40Var) throws Throwable {
        b43 b43Var;
        dt1 dt1Var;
        boolean z;
        Throwable th;
        if (q40Var instanceof b43) {
            b43Var = (b43) q40Var;
            int i = b43Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                b43Var.m = i - Integer.MIN_VALUE;
            } else {
                b43Var = new b43(this, q40Var);
            }
        }
        Object obj = b43Var.k;
        int i2 = b43Var.m;
        if (i2 != 0) {
            if (i2 != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = b43Var.j;
            dt1Var = b43Var.i;
            try {
                y02.Q(obj);
                if (z) {
                    dt1Var.i(null);
                }
                return obj;
            } catch (Throwable th2) {
                th = th2;
                if (z) {
                }
                throw th;
            }
        }
        y02.Q(obj);
        dt1 dt1Var2 = this.a;
        boolean zG = dt1Var2.g();
        try {
            Object objValueOf = Boolean.valueOf(zG);
            b43Var.i = dt1Var2;
            b43Var.j = zG;
            b43Var.m = 1;
            Object objF = rs0Var.f(objValueOf, b43Var);
            Object obj2 = y50.f;
            if (objF == obj2) {
                return obj2;
            }
            dt1Var = dt1Var2;
            z = zG;
            obj = objF;
            if (z) {
            }
            return obj;
        } catch (Throwable th3) {
            dt1Var = dt1Var2;
            z = zG;
            th = th3;
            if (z) {
                dt1Var.i(null);
            }
            throw th;
        }
    }
}
