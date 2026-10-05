package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class o63 implements rm0 {
    public final a31 a;
    public final h80 b;
    public final s83 c;
    public final ub0 d = ks2.b;

    public o63(a31 a31Var, h80 h80Var, s83 s83Var) {
        this.a = a31Var;
        this.b = h80Var;
        this.c = s83Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.o63 r5, defpackage.cs2 r6, float r7, float r8, defpackage.l63 r9, defpackage.q40 r10) {
        /*
            boolean r0 = r10 instanceof defpackage.n63
            if (r0 == 0) goto L14
            r0 = r10
            n63 r0 = (defpackage.n63) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.k = r1
        L12:
            r10 = r0
            goto L1a
        L14:
            n63 r0 = new n63
            r0.<init>(r5, r10)
            goto L12
        L1a:
            java.lang.Object r0 = r10.i
            int r1 = r10.k
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L28
            defpackage.y02.Q(r0)
            goto L9e
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r5)
            r5 = 0
            return r5
        L2f:
            defpackage.y02.Q(r0)
            float r0 = java.lang.Math.abs(r7)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L3c
            goto L44
        L3c:
            float r0 = java.lang.Math.abs(r8)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L4b
        L44:
            r5 = 28
            pe r5 = defpackage.cl3.c(r7, r8, r5)
            return r5
        L4b:
            r10.k = r2
            h80 r0 = r5.b
            pl r2 = new pl
            k71 r3 = r0.a
            r4 = 12
            r2.<init>(r4, r3)
            qe r3 = new qe
            r3.<init>(r1)
            qe r1 = new qe
            r1.<init>(r8)
            ue r1 = r2.w(r3, r1)
            qe r1 = (defpackage.qe) r1
            float r1 = r1.a
            float r1 = java.lang.Math.abs(r1)
            float r2 = java.lang.Math.abs(r7)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L7f
            yl1 r5 = new yl1
            r1 = 19
            r5.<init>(r1, r0)
        L7d:
            r0 = r7
            goto L8a
        L7f:
            k71 r0 = new k71
            s83 r5 = r5.c
            r1 = 21
            r0.<init>(r1, r5)
            r5 = r0
            goto L7d
        L8a:
            java.lang.Float r7 = new java.lang.Float
            r7.<init>(r0)
            r0 = r8
            java.lang.Float r8 = new java.lang.Float
            r8.<init>(r0)
            java.lang.Object r0 = r5.d(r6, r7, r8, r9, r10)
            y50 r5 = defpackage.y50.f
            if (r0 != r5) goto L9e
            return r5
        L9e:
            le r0 = (defpackage.le) r0
            pe r5 = r0.b
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o63.b(o63, cs2, float, float, l63, q40):java.lang.Object");
    }

    @Override // defpackage.rm0
    public Object a(ts2 ts2Var, float f, p40 p40Var) {
        return d(ts2Var, f, w7.h0, (q40) p40Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.cs2 r10, float r11, defpackage.ns0 r12, defpackage.q40 r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof defpackage.k63
            if (r0 == 0) goto L13
            r0 = r13
            k63 r0 = (defpackage.k63) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            k63 r0 = new k63
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.j
            int r1 = r0.l
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            ns0 r12 = r0.i
            defpackage.y02.Q(r13)
            goto L4b
        L27:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r9)
            r9 = 0
            return r9
        L2e:
            defpackage.y02.Q(r13)
            r80 r3 = new r80
            r8 = 0
            r4 = r9
            r7 = r10
            r5 = r11
            r6 = r12
            r3.<init>(r4, r5, r6, r7, r8)
            r0.i = r6
            r0.l = r2
            ub0 r9 = r4.d
            java.lang.Object r13 = defpackage.cl3.G(r9, r3, r0)
            y50 r9 = defpackage.y50.f
            if (r13 != r9) goto L4a
            return r9
        L4a:
            r12 = r6
        L4b:
            le r13 = (defpackage.le) r13
            java.lang.Float r9 = new java.lang.Float
            r10 = 0
            r9.<init>(r10)
            r12.h(r9)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o63.c(cs2, float, ns0, q40):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.cs2 r5, float r6, defpackage.ns0 r7, defpackage.q40 r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.m63
            if (r0 == 0) goto L13
            r0 = r8
            m63 r0 = (defpackage.m63) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            m63 r0 = new m63
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.i
            int r1 = r0.k
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.y02.Q(r8)
            goto L3a
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.y02.Q(r8)
            r0.k = r2
            java.lang.Object r8 = r4.c(r5, r6, r7, r0)
            y50 r4 = defpackage.y50.f
            if (r8 != r4) goto L3a
            return r4
        L3a:
            le r8 = (defpackage.le) r8
            java.lang.Float r4 = r8.a
            float r4 = r4.floatValue()
            pe r5 = r8.b
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L4a
            goto L54
        L4a:
            java.lang.Object r4 = r5.a()
            java.lang.Number r4 = (java.lang.Number) r4
            float r6 = r4.floatValue()
        L54:
            java.lang.Float r4 = new java.lang.Float
            r4.<init>(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o63.d(cs2, float, ns0, q40):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o63) {
            o63 o63Var = (o63) obj;
            return o63Var.c.equals(this.c) && s51.n(o63Var.b, this.b) && o63Var.a == this.a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + ((this.b.hashCode() + (this.c.hashCode() * 31)) * 31);
    }
}
