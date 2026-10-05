package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class pc0 implements gn0 {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ gn0 g;
    public final /* synthetic */ qk2 h;

    public pc0(qc0 qc0Var, qk2 qk2Var, gn0 gn0Var) {
        this.h = qk2Var;
        this.g = gn0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // defpackage.gn0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.Object r12, defpackage.p40 r13) {
        /*
            r11 = this;
            int r0 = r11.f
            qk2 r1 = r11.h
            dm3 r2 = defpackage.dm3.a
            gn0 r3 = r11.g
            r4 = 0
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            y50 r6 = defpackage.y50.f
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = 1
            switch(r0) {
                case 0: goto L4c;
                default: goto L13;
            }
        L13:
            boolean r0 = r13 instanceof defpackage.tn0
            if (r0 == 0) goto L24
            r0 = r13
            tn0 r0 = (defpackage.tn0) r0
            int r9 = r0.k
            r10 = r9 & r7
            if (r10 == 0) goto L24
            int r9 = r9 - r7
            r0.k = r9
            goto L29
        L24:
            tn0 r0 = new tn0
            r0.<init>(r11, r13)
        L29:
            java.lang.Object r11 = r0.i
            int r13 = r0.k
            if (r13 == 0) goto L3c
            if (r13 != r8) goto L37
            defpackage.y02.Q(r11)     // Catch: java.lang.Throwable -> L35
            goto L48
        L35:
            r11 = move-exception
            goto L49
        L37:
            defpackage.c.q(r5)
            r2 = r4
            goto L48
        L3c:
            defpackage.y02.Q(r11)
            r0.k = r8     // Catch: java.lang.Throwable -> L35
            java.lang.Object r11 = r3.k(r12, r0)     // Catch: java.lang.Throwable -> L35
            if (r11 != r6) goto L48
            r2 = r6
        L48:
            return r2
        L49:
            r1.f = r11
            throw r11
        L4c:
            boolean r0 = r13 instanceof defpackage.oc0
            if (r0 == 0) goto L5d
            r0 = r13
            oc0 r0 = (defpackage.oc0) r0
            int r9 = r0.k
            r10 = r9 & r7
            if (r10 == 0) goto L5d
            int r9 = r9 - r7
            r0.k = r9
            goto L62
        L5d:
            oc0 r0 = new oc0
            r0.<init>(r11, r13)
        L62:
            java.lang.Object r11 = r0.i
            int r13 = r0.k
            if (r13 == 0) goto L73
            if (r13 != r8) goto L6e
            defpackage.y02.Q(r11)
            goto L8d
        L6e:
            defpackage.c.q(r5)
            r2 = r4
            goto L8d
        L73:
            defpackage.y02.Q(r11)
            java.lang.Object r11 = r1.f
            ai0 r13 = defpackage.vm1.b0
            if (r11 == r13) goto L82
            boolean r11 = defpackage.s51.n(r11, r12)
            if (r11 != 0) goto L8d
        L82:
            r1.f = r12
            r0.k = r8
            java.lang.Object r11 = r3.k(r12, r0)
            if (r11 != r6) goto L8d
            r2 = r6
        L8d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pc0.k(java.lang.Object, p40):java.lang.Object");
    }

    public pc0(gn0 gn0Var, qk2 qk2Var) {
        this.g = gn0Var;
        this.h = qk2Var;
    }
}
