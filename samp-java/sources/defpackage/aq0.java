package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class aq0 implements zp0 {
    public final m22 a;
    public final c9 b;
    public final ar2 c;
    public final eq0 d;
    public final k71 e;

    public aq0(m22 m22Var, c9 c9Var) {
        ar2 ar2Var = bq0.a;
        eq0 eq0Var = new eq0();
        dq0 dq0Var = eq0.a;
        jx0 jx0Var = zb0.a;
        dq0Var.getClass();
        ur.c(pq.Q(dq0Var, jx0Var).k(li0.f).k(new xa3(null)));
        k71 k71Var = new k71(7);
        this.a = m22Var;
        this.b = c9Var;
        this.c = ar2Var;
        this.d = eq0Var;
        this.e = k71Var;
        new s(25, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009a A[Catch: Exception -> 0x00a2, TRY_ENTER, TryCatch #3 {Exception -> 0x00a2, blocks: (B:25:0x0040, B:27:0x0054, B:30:0x0059, B:32:0x005d, B:37:0x0072, B:53:0x009a, B:54:0x00a1, B:33:0x0064, B:34:0x0066, B:35:0x0069, B:36:0x006e), top: B:65:0x0040 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ml3 a(defpackage.ll3 r7) {
        /*
            r6 = this;
            ar2 r0 = r6.c
            java.lang.Object r1 = r0.g
            ak2 r1 = (defpackage.ak2) r1
            monitor-enter(r1)
            java.lang.Object r2 = r0.h     // Catch: java.lang.Throwable -> L3a
            nl1 r2 = (defpackage.nl1) r2     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r2 = r2.a(r7)     // Catch: java.lang.Throwable -> L3a
            ml3 r2 = (defpackage.ml3) r2     // Catch: java.lang.Throwable -> L3a
            if (r2 == 0) goto L3f
            boolean r3 = r2.g     // Catch: java.lang.Throwable -> L3a
            if (r3 == 0) goto L19
            monitor-exit(r1)
            return r2
        L19:
            java.lang.Object r2 = r0.h     // Catch: java.lang.Throwable -> L3a
            nl1 r2 = (defpackage.nl1) r2     // Catch: java.lang.Throwable -> L3a
            h01 r3 = r2.c     // Catch: java.lang.Throwable -> L3a
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L3a
            j21 r4 = r2.b     // Catch: java.lang.Throwable -> L34
            r4.getClass()     // Catch: java.lang.Throwable -> L34
            java.util.LinkedHashMap r4 = r4.f     // Catch: java.lang.Throwable -> L34
            java.lang.Object r4 = r4.remove(r7)     // Catch: java.lang.Throwable -> L34
            if (r4 == 0) goto L36
            int r5 = r2.d     // Catch: java.lang.Throwable -> L34
            int r5 = r5 + (-1)
            r2.d = r5     // Catch: java.lang.Throwable -> L34
            goto L36
        L34:
            r6 = move-exception
            goto L3d
        L36:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3a
            ml3 r4 = (defpackage.ml3) r4     // Catch: java.lang.Throwable -> L3a
            goto L3f
        L3a:
            r6 = move-exception
            goto Lab
        L3d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3a
            throw r6     // Catch: java.lang.Throwable -> L3a
        L3f:
            monitor-exit(r1)
            eq0 r1 = r6.d     // Catch: java.lang.Exception -> La2
            r1.getClass()     // Catch: java.lang.Exception -> La2
            zb3 r1 = r7.a     // Catch: java.lang.Exception -> La2
            k71 r6 = r6.e     // Catch: java.lang.Exception -> La2
            java.lang.Object r6 = r6.g     // Catch: java.lang.Exception -> La2
            h01 r6 = (defpackage.h01) r6     // Catch: java.lang.Exception -> La2
            int r2 = r7.c     // Catch: java.lang.Exception -> La2
            xq0 r3 = r7.b     // Catch: java.lang.Exception -> La2
            r4 = 0
            if (r1 == 0) goto L64
            boolean r5 = r1 instanceof defpackage.t80     // Catch: java.lang.Exception -> La2
            if (r5 == 0) goto L59
            goto L64
        L59:
            boolean r5 = r1 instanceof defpackage.zv0     // Catch: java.lang.Exception -> La2
            if (r5 == 0) goto L77
            zv0 r1 = (defpackage.zv0) r1     // Catch: java.lang.Exception -> La2
            android.graphics.Typeface r6 = r6.q(r1, r3, r2)     // Catch: java.lang.Exception -> La2
            goto L72
        L64:
            int r6 = r6.f     // Catch: java.lang.Exception -> La2
            switch(r6) {
                case 18: goto L6e;
                default: goto L69;
            }     // Catch: java.lang.Exception -> La2
        L69:
            android.graphics.Typeface r6 = defpackage.h01.p(r4, r3, r2)     // Catch: java.lang.Exception -> La2
            goto L72
        L6e:
            android.graphics.Typeface r6 = defpackage.h01.o(r4, r3, r2)     // Catch: java.lang.Exception -> La2
        L72:
            ml3 r4 = new ml3     // Catch: java.lang.Exception -> La2
            r4.<init>(r6)     // Catch: java.lang.Exception -> La2
        L77:
            if (r4 == 0) goto L9a
            java.lang.Object r6 = r0.g
            ak2 r6 = (defpackage.ak2) r6
            monitor-enter(r6)
            java.lang.Object r1 = r0.h     // Catch: java.lang.Throwable -> L94
            nl1 r1 = (defpackage.nl1) r1     // Catch: java.lang.Throwable -> L94
            java.lang.Object r1 = r1.a(r7)     // Catch: java.lang.Throwable -> L94
            if (r1 != 0) goto L96
            boolean r1 = r4.g     // Catch: java.lang.Throwable -> L94
            if (r1 == 0) goto L96
            java.lang.Object r0 = r0.h     // Catch: java.lang.Throwable -> L94
            nl1 r0 = (defpackage.nl1) r0     // Catch: java.lang.Throwable -> L94
            r0.b(r7, r4)     // Catch: java.lang.Throwable -> L94
            goto L96
        L94:
            r7 = move-exception
            goto L98
        L96:
            monitor-exit(r6)
            return r4
        L98:
            monitor-exit(r6)
            throw r7
        L9a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> La2
            java.lang.String r7 = "Could not load font"
            r6.<init>(r7)     // Catch: java.lang.Exception -> La2
            throw r6     // Catch: java.lang.Exception -> La2
        La2:
            r6 = move-exception
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Could not load font"
            r7.<init>(r0, r6)
            throw r7
        Lab:
            monitor-exit(r1)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aq0.a(ll3):ml3");
    }

    public final ml3 b(zb3 zb3Var, xq0 xq0Var, int i, int i2) {
        c9 c9Var = this.b;
        c9Var.getClass();
        int i3 = c9Var.f;
        xq0 xq0Var2 = (i3 == 0 || i3 == Integer.MAX_VALUE) ? xq0Var : new xq0(y02.h(xq0Var.f + i3, 1, 1000));
        this.a.getClass();
        return a(new ll3(zb3Var, xq0Var2, i, i2, null));
    }
}
