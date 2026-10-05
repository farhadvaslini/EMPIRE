package defpackage;

import java.io.File;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class v72 {
    public static final v72 a = new v72();
    public static final my1 b;
    public static final Set c;

    static {
        ly1 ly1Var = new ly1();
        ly1Var.a(15L);
        ly1Var.b(60L);
        ly1Var.i = false;
        ly1Var.j = false;
        b = new my1(ly1Var);
        c = oz2.L(301, 302, 303, 307, 308);
    }

    public static final void a(int i, jr jrVar, ns0 ns0Var, ll2 ll2Var, AtomicReference atomicReference, boolean z) {
        if (jrVar.r() instanceof qx1) {
            if (!ll2Var.a.f()) {
                d(jrVar, new IllegalArgumentException("Download URL must use HTTPS"));
                return;
            }
            my1 my1Var = b;
            my1Var.getClass();
            ij2 ij2Var = new ij2(my1Var, ll2Var);
            atomicReference.set(ij2Var);
            ij2Var.e(new yw1(i, jrVar, ns0Var, ll2Var, atomicReference, z));
        }
    }

    public static final void d(jr jrVar, Exception exc) {
        if (jrVar.r() instanceof qx1) {
            jrVar.t(new rn2(new qn2(exc)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, File file, q40 q40Var) {
        s72 s72Var;
        Object qn2Var;
        Object objC;
        if (q40Var instanceof s72) {
            s72Var = (s72) q40Var;
            int i = s72Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                s72Var.l = i - Integer.MIN_VALUE;
            } else {
                s72Var = new s72(this, q40Var);
            }
        }
        Object obj = s72Var.j;
        int i2 = s72Var.l;
        if (i2 == 0) {
            y02.Q(obj);
            try {
                pl plVar = new pl(7);
                plVar.E(str);
                plVar.s();
                qn2Var = new ll2(plVar);
            } catch (Throwable th) {
                qn2Var = new qn2(th);
            }
            Throwable thA = rn2.a(qn2Var);
            if (thA != null) {
                return new qn2(thA);
            }
            ns0 xc1Var = new xc1(14, file);
            s72Var.i = file;
            s72Var.l = 1;
            objC = c((ll2) qn2Var, true, xc1Var, s72Var);
            Object obj2 = y50.f;
            if (objC == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            file = s72Var.i;
            y02.Q(obj);
            objC = ((rn2) obj).f;
        }
        if (rn2.a(objC) != null) {
            file.delete();
        }
        return objC;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ll2 ll2Var, boolean z, ns0 ns0Var, q40 q40Var) {
        t72 t72Var;
        if (q40Var instanceof t72) {
            t72Var = (t72) q40Var;
            int i = t72Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                t72Var.k = i - Integer.MIN_VALUE;
            } else {
                t72Var = new t72(this, q40Var);
            }
        }
        Object objQ = t72Var.i;
        int i2 = t72Var.k;
        if (i2 == 0) {
            y02.Q(objQ);
            t72Var.k = 1;
            jr jrVar = new jr(1, vr.I(t72Var));
            jrVar.s();
            AtomicReference atomicReference = new AtomicReference();
            jrVar.v(new ru(atomicReference, 1));
            a(0, jrVar, ns0Var, ll2Var, atomicReference, z);
            objQ = jrVar.q();
            y50 y50Var = y50.f;
            if (objQ == y50Var) {
                return y50Var;
            }
        } else {
            if (i2 != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y02.Q(objQ);
        }
        return ((rn2) objQ).f;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(q40 q40Var) {
        u72 u72Var;
        if (q40Var instanceof u72) {
            u72Var = (u72) q40Var;
            int i = u72Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                u72Var.k = i - Integer.MIN_VALUE;
            } else {
                u72Var = new u72(this, q40Var);
            }
        }
        Object obj = u72Var.i;
        int i2 = u72Var.k;
        if (i2 != 0) {
            if (i2 == 1) {
                y02.Q(obj);
                return ((rn2) obj).f;
            }
            c.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y02.Q(obj);
        pl plVar = new pl(7);
        plVar.E("https://sa-mp.th1nk.top/data/plugins.json");
        plVar.s();
        ll2 ll2Var = new ll2(plVar);
        ns0 s12Var = new s12(9);
        u72Var.k = 1;
        Object objC = c(ll2Var, false, s12Var, u72Var);
        Object obj2 = y50.f;
        return objC == obj2 ? obj2 : objC;
    }
}
