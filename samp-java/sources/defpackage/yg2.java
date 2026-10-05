package defpackage;

import android.app.Application;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class yg2 extends mb3 implements rs0 {
    public int j;
    public int k;
    public int l;
    public Application m;
    public ih2 n;
    public int o;
    public final /* synthetic */ Application p;
    public final /* synthetic */ ih2 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yg2(Application application, ih2 ih2Var, p40 p40Var) {
        super(2, p40Var);
        this.p = application;
        this.q = ih2Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        return ((yg2) m((p40) obj2, (x50) obj)).o(dm3.a);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        return new yg2(this.p, this.q, p40Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0071 -> B:31:0x0092). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008a -> B:30:0x008e). Please report as a decompilation issue!!! */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r15) {
        /*
            r14 = this;
            dm3 r0 = defpackage.dm3.a
            y50 r1 = defpackage.y50.f
            int r2 = r14.o
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L33
            if (r2 == r5) goto L23
            if (r2 != r4) goto L1c
            int r2 = r14.k
            int r6 = r14.j
            ih2 r7 = r14.n
            android.app.Application r8 = r14.m
            defpackage.y02.Q(r15)
            goto L8e
        L1c:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r14)
            r14 = 0
            return r14
        L23:
            int r2 = r14.l
            int r6 = r14.k
            int r7 = r14.j
            ih2 r8 = r14.n
            android.app.Application r9 = r14.m
            defpackage.y02.Q(r15)     // Catch: java.lang.Exception -> L31 java.util.concurrent.CancellationException -> L95
            goto L57
        L31:
            r15 = move-exception
            goto L5e
        L33:
            defpackage.y02.Q(r15)
            android.app.Application r15 = r14.p
            ih2 r2 = r14.q
            r6 = 0
            r9 = r15
            r8 = r2
            r7 = r3
            r2 = r6
        L3f:
            if (r2 >= r7) goto L97
            dh2 r15 = defpackage.dh2.a     // Catch: java.lang.Exception -> L5c java.util.concurrent.CancellationException -> L95
            r14.m = r9     // Catch: java.lang.Exception -> L5c java.util.concurrent.CancellationException -> L95
            r14.n = r8     // Catch: java.lang.Exception -> L5c java.util.concurrent.CancellationException -> L95
            r14.j = r7     // Catch: java.lang.Exception -> L5c java.util.concurrent.CancellationException -> L95
            r14.k = r2     // Catch: java.lang.Exception -> L5c java.util.concurrent.CancellationException -> L95
            r14.l = r2     // Catch: java.lang.Exception -> L5c java.util.concurrent.CancellationException -> L95
            r14.o = r5     // Catch: java.lang.Exception -> L5c java.util.concurrent.CancellationException -> L95
            java.lang.Object r15 = defpackage.dh2.a(r9, r8, r14)     // Catch: java.lang.Exception -> L5c java.util.concurrent.CancellationException -> L95
            if (r15 != r1) goto L56
            goto L89
        L56:
            r6 = r2
        L57:
            dh2 r15 = defpackage.dh2.a     // Catch: java.lang.Exception -> L31 java.util.concurrent.CancellationException -> L95
            defpackage.dh2.g = r5     // Catch: java.lang.Exception -> L31 java.util.concurrent.CancellationException -> L95
            goto L97
        L5c:
            r15 = move-exception
            r6 = r2
        L5e:
            ti r10 = defpackage.ui.a
            int r10 = r2 + 1
            java.lang.String r11 = "Unable to restore persisted RAKSAMP instances (attempt "
            java.lang.String r12 = "/3)"
            java.lang.String r11 = defpackage.by1.h(r11, r12, r10)
            ti r12 = defpackage.ti.i
            java.lang.String r13 = "RaksampInstanceManager"
            defpackage.ui.c(r12, r13, r11, r15)
            if (r10 >= r3) goto L92
            long[] r15 = defpackage.dh2.k
            r10 = r15[r2]
            r14.m = r9
            r14.n = r8
            r14.j = r7
            r14.k = r6
            r14.l = r2
            r14.o = r4
            java.lang.Object r15 = defpackage.ur.A(r10, r14)
            if (r15 != r1) goto L8a
        L89:
            return r1
        L8a:
            r2 = r6
            r6 = r7
            r7 = r8
            r8 = r9
        L8e:
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r2
        L92:
            int r2 = r6 + 1
            goto L3f
        L95:
            r14 = move-exception
            throw r14
        L97:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yg2.o(java.lang.Object):java.lang.Object");
    }
}
