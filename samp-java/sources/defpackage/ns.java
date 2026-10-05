package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class ns extends ls {
    public final fn0 i;

    public ns(fn0 fn0Var, o50 o50Var, int i, jp jpVar) {
        super(o50Var, i, jpVar);
        this.i = fn0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    @Override // defpackage.ls, defpackage.fn0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.gn0 r7, defpackage.p40 r8) throws java.lang.Throwable {
        /*
            r6 = this;
            int r0 = r6.g
            r1 = -3
            y50 r2 = defpackage.y50.f
            if (r0 != r1) goto L6f
            o50 r0 = r8.i()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            z00 r3 = new z00
            r4 = 14
            r5 = 0
            r3.<init>(r4, r5)
            o50 r4 = r6.f
            java.lang.Object r1 = r4.p(r3, r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L28
            o50 r1 = r0.k(r4)
            goto L2c
        L28:
            o50 r1 = defpackage.uq.p(r0, r4, r5)
        L2c:
            boolean r3 = defpackage.s51.n(r1, r0)
            if (r3 == 0) goto L39
            java.lang.Object r6 = r6.h(r7, r8)
            if (r6 != r2) goto L76
            return r6
        L39:
            f5 r3 = defpackage.f5.L
            m50 r4 = r1.m(r3)
            m50 r0 = r0.m(r3)
            boolean r0 = defpackage.s51.n(r4, r0)
            if (r0 == 0) goto L6f
            o50 r0 = r8.i()
            boolean r3 = r7 instanceof defpackage.mv2
            if (r3 != 0) goto L5c
            boolean r3 = r7 instanceof defpackage.px1
            if (r3 == 0) goto L56
            goto L5c
        L56:
            u5 r3 = new u5
            r3.<init>(r7, r0)
            r7 = r3
        L5c:
            j r0 = new j
            r3 = 0
            r4 = 9
            r0.<init>(r6, r3, r4)
            java.lang.Object r6 = defpackage.cl3.D(r1)
            java.lang.Object r6 = defpackage.br.N(r1, r7, r6, r0, r8)
            if (r6 != r2) goto L76
            return r6
        L6f:
            java.lang.Object r6 = super.a(r7, r8)
            if (r6 != r2) goto L76
            return r6
        L76:
            dm3 r6 = defpackage.dm3.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ns.a(gn0, p40):java.lang.Object");
    }

    @Override // defpackage.ls
    public final Object d(kd2 kd2Var, p40 p40Var) {
        Object objH = h(new mv2(kd2Var), p40Var);
        return objH == y50.f ? objH : dm3.a;
    }

    public abstract Object h(gn0 gn0Var, p40 p40Var);

    @Override // defpackage.ls
    public final String toString() {
        return this.i + " -> " + super.toString();
    }
}
