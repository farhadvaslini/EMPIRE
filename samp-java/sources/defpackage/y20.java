package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class y20 extends np {
    public final jp u;

    public y20(int i, jp jpVar) {
        super(i);
        this.u = jpVar;
        if (jpVar == jp.f) {
            qn1.m(rk2.a(np.class).c(), " instead", "This implementation does not support suspension for senders, use ");
            throw null;
        }
        if (i >= 1) {
            return;
        }
        c.g(by1.h("Buffered channel capacity must be at least 1, but ", " was specified", i));
        throw null;
    }

    @Override // defpackage.np
    public final boolean C() {
        return this.u == jp.g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b4, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q(java.lang.Object r16, boolean r17) {
        /*
            r15 = this;
            jp r1 = r15.u
            jp r2 = defpackage.jp.h
            dm3 r8 = defpackage.dm3.a
            if (r1 != r2) goto L17
            java.lang.Object r0 = super.l(r16)
            boolean r1 = r0 instanceof defpackage.us
            if (r1 == 0) goto L16
            boolean r1 = r0 instanceof defpackage.ts
            if (r1 == 0) goto L15
            goto L16
        L15:
            return r8
        L16:
            return r0
        L17:
            ai0 r6 = defpackage.pp.d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = defpackage.np.k
            java.lang.Object r1 = r1.get(r15)
            ws r1 = (defpackage.ws) r1
        L21:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = defpackage.np.g
            long r2 = r2.getAndIncrement(r15)
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r4 = r4 & r2
            r7 = 0
            boolean r7 = r15.z(r2, r7)
            int r9 = defpackage.pp.b
            long r10 = (long) r9
            long r2 = r4 / r10
            long r12 = r4 % r10
            int r12 = (int) r12
            long r13 = r1.e
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 == 0) goto L53
            ws r2 = r15.p(r2, r1)
            if (r2 != 0) goto L52
            if (r7 == 0) goto L21
            java.lang.Throwable r0 = r15.u()
            ts r1 = new ts
            r1.<init>(r0)
            return r1
        L52:
            r1 = r2
        L53:
            r0 = r15
            r3 = r16
            r2 = r12
            int r12 = defpackage.np.d(r0, r1, r2, r3, r4, r6, r7)
            if (r12 == 0) goto Lb5
            r3 = 1
            if (r12 == r3) goto Lb4
            r3 = 2
            r13 = 0
            if (r12 == r3) goto L8f
            r2 = 3
            if (r12 == r2) goto L89
            r2 = 4
            if (r12 == r2) goto L72
            r2 = 5
            if (r12 == r2) goto L6e
            goto L21
        L6e:
            r1.a()
            goto L21
        L72:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = defpackage.np.h
            long r2 = r2.get(r15)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L7f
            r1.a()
        L7f:
            java.lang.Throwable r0 = r15.u()
            ts r1 = new ts
            r1.<init>(r0)
            return r1
        L89:
            java.lang.String r0 = "unexpected"
            defpackage.c.q(r0)
            return r13
        L8f:
            if (r7 == 0) goto L9e
            r1.m()
            java.lang.Throwable r0 = r15.u()
            ts r1 = new ts
            r1.<init>(r0)
            return r1
        L9e:
            boolean r3 = r6 instanceof defpackage.or3
            if (r3 == 0) goto La5
            r13 = r6
            or3 r13 = (defpackage.or3) r13
        La5:
            if (r13 == 0) goto Lac
            int r12 = r2 + r9
            r13.a(r1, r12)
        Lac:
            long r3 = r1.e
            long r3 = r3 * r10
            long r1 = (long) r2
            long r3 = r3 + r1
            r15.k(r3)
        Lb4:
            return r8
        Lb5:
            r1.a()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y20.Q(java.lang.Object, boolean):java.lang.Object");
    }

    @Override // defpackage.np, defpackage.lv2
    public final Object a(p40 p40Var, Object obj) throws Throwable {
        if (Q(obj, true) instanceof ts) {
            throw u();
        }
        return dm3.a;
    }

    @Override // defpackage.np, defpackage.lv2
    public final Object l(Object obj) {
        return Q(obj, false);
    }
}
