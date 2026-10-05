package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class ee2 {
    public final qe1 a;

    public ee2(cs0 cs0Var) {
        this.a = new qe1(cs0Var);
    }

    public abstract he2 a(Object obj);

    public oo3 b() {
        return this.a;
    }

    public final he2 c(ns0 ns0Var) {
        return new he2(this, null, false, null, ns0Var, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034 A[PHI: r4
      0x0034: PHI (r4v2 oo3) = (r4v6 oo3), (r4v7 oo3) binds: [B:21:0x0040, B:16:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.oo3 d(defpackage.he2 r3, defpackage.oo3 r4) {
        /*
            r2 = this;
            boolean r2 = r4 instanceof defpackage.mg0
            r0 = 0
            if (r2 == 0) goto L16
            boolean r2 = r3.e
            if (r2 == 0) goto L43
            r0 = r4
            mg0 r0 = (defpackage.mg0) r0
            d42 r2 = r0.a
            java.lang.Object r4 = r3.a()
            r2.setValue(r4)
            goto L43
        L16:
            boolean r2 = r4 instanceof defpackage.s93
            if (r2 == 0) goto L36
            boolean r2 = r3.b
            if (r2 != 0) goto L22
            java.lang.Object r2 = r3.f
            if (r2 == 0) goto L43
        L22:
            boolean r2 = r3.e
            if (r2 != 0) goto L43
            java.lang.Object r2 = r3.a()
            s93 r4 = (defpackage.s93) r4
            java.lang.Object r1 = r4.a
            boolean r2 = defpackage.s51.n(r2, r1)
            if (r2 == 0) goto L43
        L34:
            r0 = r4
            goto L43
        L36:
            boolean r2 = r4 instanceof defpackage.u20
            if (r2 == 0) goto L43
            ns0 r2 = r3.d
            u20 r4 = (defpackage.u20) r4
            ns0 r1 = r4.a
            if (r2 != r1) goto L43
            goto L34
        L43:
            if (r0 != 0) goto L70
            boolean r2 = r3.e
            if (r2 == 0) goto L5c
            mg0 r2 = new mg0
            java.lang.Object r4 = r3.f
            h73 r3 = r3.c
            if (r3 != 0) goto L53
            m22 r3 = defpackage.m22.u
        L53:
            d42 r0 = new d42
            r0.<init>(r4, r3)
            r2.<init>(r0)
            return r2
        L5c:
            ns0 r2 = r3.d
            if (r2 == 0) goto L66
            u20 r3 = new u20
            r3.<init>(r2)
            return r3
        L66:
            s93 r2 = new s93
            java.lang.Object r3 = r3.a()
            r2.<init>(r3)
            return r2
        L70:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ee2.d(he2, oo3):oo3");
    }
}
