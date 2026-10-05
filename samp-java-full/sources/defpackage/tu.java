package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class tu {
    public static final tu a = new tu();
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

    public static final void a(int i, jr jrVar, ll2 ll2Var, AtomicReference atomicReference) {
        if (jrVar.r() instanceof qx1) {
            if (!ll2Var.a.f()) {
                c(jrVar, new IllegalArgumentException("Catalog URL must use HTTPS"));
                return;
            }
            my1 my1Var = b;
            my1Var.getClass();
            ij2 ij2Var = new ij2(my1Var, ll2Var);
            atomicReference.set(ij2Var);
            ij2Var.e(new w9(i, jrVar, ll2Var, atomicReference));
        }
    }

    public static final void c(jr jrVar, Exception exc) {
        if (jrVar.r() instanceof qx1) {
            jrVar.t(new rn2(new qn2(exc)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ll2 ll2Var, q40 q40Var) {
        qu quVar;
        if (q40Var instanceof qu) {
            quVar = (qu) q40Var;
            int i = quVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                quVar.k = i - Integer.MIN_VALUE;
            } else {
                quVar = new qu(this, q40Var);
            }
        }
        Object objQ = quVar.i;
        int i2 = quVar.k;
        if (i2 == 0) {
            y02.Q(objQ);
            quVar.k = 1;
            jr jrVar = new jr(1, vr.I(quVar));
            jrVar.s();
            AtomicReference atomicReference = new AtomicReference();
            jrVar.v(new ru(atomicReference, 0));
            a(0, jrVar, ll2Var, atomicReference);
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
    public final Object d(q40 q40Var) {
        su suVar;
        if (q40Var instanceof su) {
            suVar = (su) q40Var;
            int i = suVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                suVar.k = i - Integer.MIN_VALUE;
            } else {
                suVar = new su(this, q40Var);
            }
        }
        Object obj = suVar.i;
        int i2 = suVar.k;
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
        plVar.E("https://sa-mp.th1nk.top/data/cleo.json");
        plVar.s();
        ll2 ll2Var = new ll2(plVar);
        suVar.k = 1;
        Object objB = b(ll2Var, suVar);
        Object obj2 = y50.f;
        return objB == obj2 ? obj2 : objB;
    }
}
