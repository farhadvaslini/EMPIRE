package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ll2 r5, defpackage.q40 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.qu
            if (r0 == 0) goto L13
            r0 = r6
            qu r0 = (defpackage.qu) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            qu r0 = new qu
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.i
            int r6 = r0.k
            r1 = 1
            if (r6 == 0) goto L2c
            if (r6 != r1) goto L25
            defpackage.y02.Q(r4)
            goto L57
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.y02.Q(r4)
            r0.k = r1
            jr r4 = new jr
            p40 r6 = defpackage.vr.I(r0)
            r4.<init>(r1, r6)
            r4.s()
            java.util.concurrent.atomic.AtomicReference r6 = new java.util.concurrent.atomic.AtomicReference
            r6.<init>()
            ru r0 = new ru
            r1 = 0
            r0.<init>(r6, r1)
            r4.v(r0)
            a(r1, r4, r5, r6)
            java.lang.Object r4 = r4.q()
            y50 r5 = defpackage.y50.f
            if (r4 != r5) goto L57
            return r5
        L57:
            rn2 r4 = (defpackage.rn2) r4
            java.lang.Object r4 = r4.f
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tu.b(ll2, q40):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.q40 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.su
            if (r0 == 0) goto L13
            r0 = r5
            su r0 = (defpackage.su) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            su r0 = new su
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.i
            int r1 = r0.k
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            defpackage.y02.Q(r5)
            rn2 r5 = (defpackage.rn2) r5
            java.lang.Object r4 = r5.f
            return r4
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r4)
            r4 = 0
            return r4
        L30:
            defpackage.y02.Q(r5)
            pl r5 = new pl
            r1 = 7
            r5.<init>(r1)
            java.lang.String r1 = "https://sa-mp.th1nk.top/data/cleo.json"
            r5.E(r1)
            r5.s()
            ll2 r1 = new ll2
            r1.<init>(r5)
            r0.k = r2
            java.lang.Object r4 = r4.b(r1, r0)
            y50 r5 = defpackage.y50.f
            if (r4 != r5) goto L51
            return r5
        L51:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tu.d(q40):java.lang.Object");
    }
}
