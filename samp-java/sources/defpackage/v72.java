package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r5, java.io.File r6, defpackage.q40 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.s72
            if (r0 == 0) goto L13
            r0 = r7
            s72 r0 = (defpackage.s72) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            s72 r0 = new s72
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.j
            int r1 = r0.l
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            java.io.File r6 = r0.i
            defpackage.y02.Q(r7)
            rn2 r7 = (defpackage.rn2) r7
            java.lang.Object r4 = r7.f
            goto L6a
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r4)
            r4 = 0
            return r4
        L32:
            defpackage.y02.Q(r7)
            pl r7 = new pl     // Catch: java.lang.Throwable -> L47
            r1 = 7
            r7.<init>(r1)     // Catch: java.lang.Throwable -> L47
            r7.E(r5)     // Catch: java.lang.Throwable -> L47
            r7.s()     // Catch: java.lang.Throwable -> L47
            ll2 r5 = new ll2     // Catch: java.lang.Throwable -> L47
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L47
            goto L4e
        L47:
            r5 = move-exception
            qn2 r7 = new qn2
            r7.<init>(r5)
            r5 = r7
        L4e:
            java.lang.Throwable r7 = defpackage.rn2.a(r5)
            if (r7 != 0) goto L74
            ll2 r5 = (defpackage.ll2) r5
            xc1 r7 = new xc1
            r1 = 14
            r7.<init>(r1, r6)
            r0.i = r6
            r0.l = r2
            java.lang.Object r4 = r4.c(r5, r2, r7, r0)
            y50 r5 = defpackage.y50.f
            if (r4 != r5) goto L6a
            return r5
        L6a:
            java.lang.Throwable r5 = defpackage.rn2.a(r4)
            if (r5 == 0) goto L73
            r6.delete()
        L73:
            return r4
        L74:
            qn2 r4 = new qn2
            r4.<init>(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v72.b(java.lang.String, java.io.File, q40):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ll2 r7, boolean r8, defpackage.ns0 r9, defpackage.q40 r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof defpackage.t72
            if (r0 == 0) goto L13
            r0 = r10
            t72 r0 = (defpackage.t72) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            t72 r0 = new t72
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r6 = r0.i
            int r10 = r0.k
            r1 = 1
            if (r10 == 0) goto L2c
            if (r10 != r1) goto L25
            defpackage.y02.Q(r6)
            goto L5b
        L25:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r6)
            r6 = 0
            return r6
        L2c:
            defpackage.y02.Q(r6)
            r0.k = r1
            r6 = r1
            jr r1 = new jr
            p40 r10 = defpackage.vr.I(r0)
            r1.<init>(r6, r10)
            r1.s()
            java.util.concurrent.atomic.AtomicReference r4 = new java.util.concurrent.atomic.AtomicReference
            r4.<init>()
            ru r10 = new ru
            r10.<init>(r4, r6)
            r1.v(r10)
            r0 = 0
            r3 = r7
            r5 = r8
            r2 = r9
            a(r0, r1, r2, r3, r4, r5)
            java.lang.Object r6 = r1.q()
            y50 r7 = defpackage.y50.f
            if (r6 != r7) goto L5b
            return r7
        L5b:
            rn2 r6 = (defpackage.rn2) r6
            java.lang.Object r6 = r6.f
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v72.c(ll2, boolean, ns0, q40):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.q40 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.u72
            if (r0 == 0) goto L13
            r0 = r5
            u72 r0 = (defpackage.u72) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            u72 r0 = new u72
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
            java.lang.String r1 = "https://sa-mp.th1nk.top/data/plugins.json"
            r5.E(r1)
            r5.s()
            ll2 r1 = new ll2
            r1.<init>(r5)
            s12 r5 = new s12
            r3 = 9
            r5.<init>(r3)
            r0.k = r2
            r2 = 0
            java.lang.Object r4 = r4.c(r1, r2, r5, r0)
            y50 r5 = defpackage.y50.f
            if (r4 != r5) goto L59
            return r5
        L59:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v72.e(q40):java.lang.Object");
    }
}
