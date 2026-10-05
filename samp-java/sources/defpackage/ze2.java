package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ze2 extends ja0 implements dw1 {
    public boolean v;
    public cs0 w;
    public af2 y;
    public float z;
    public boolean x = true;
    public final kw1 A = new kw1(this, null);
    public final z32 B = new z32(0.0f);
    public final z32 C = new z32(0.0f);

    public ze2(boolean z, cs0 cs0Var, af2 af2Var, float f) {
        this.v = z;
        this.w = cs0Var;
        this.y = af2Var;
        this.z = f;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s1(defpackage.ze2 r8, defpackage.q40 r9) {
        /*
            r8.getClass()
            boolean r0 = r9 instanceof defpackage.ve2
            if (r0 == 0) goto L17
            r0 = r9
            ve2 r0 = (defpackage.ve2) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.k = r1
        L15:
            r5 = r0
            goto L1d
        L17:
            ve2 r0 = new ve2
            r0.<init>(r8, r9)
            goto L15
        L1d:
            java.lang.Object r9 = r5.i
            int r0 = r5.k
            dm3 r7 = defpackage.dm3.a
            r1 = 1
            if (r0 == 0) goto L36
            if (r0 != r1) goto L2f
            defpackage.y02.Q(r9)     // Catch: java.lang.Throwable -> L2c
            goto L57
        L2c:
            r0 = move-exception
            r9 = r0
            goto L6c
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r8)
            r8 = 0
            return r8
        L36:
            defpackage.y02.Q(r9)
            af2 r9 = r8.y     // Catch: java.lang.Throwable -> L2c
            r5.k = r1     // Catch: java.lang.Throwable -> L2c
            ed r1 = r9.a     // Catch: java.lang.Throwable -> L2c
            java.lang.Float r2 = new java.lang.Float     // Catch: java.lang.Throwable -> L2c
            r9 = 1065353216(0x3f800000, float:1.0)
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L2c
            r4 = 0
            r6 = 14
            r3 = 0
            java.lang.Object r9 = defpackage.ed.c(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L2c
            y50 r0 = defpackage.y50.f
            if (r9 != r0) goto L53
            goto L54
        L53:
            r9 = r7
        L54:
            if (r9 != r0) goto L57
            return r0
        L57:
            boolean r9 = r8.s
            if (r9 == 0) goto L6b
            int r9 = r8.v1()
            float r9 = (float) r9
            r8.x1(r9)
            int r9 = r8.v1()
            float r9 = (float) r9
            r8.y1(r9)
        L6b:
            return r7
        L6c:
            boolean r0 = r8.s
            if (r0 == 0) goto L80
            int r0 = r8.v1()
            float r0 = (float) r0
            r8.x1(r0)
            int r0 = r8.v1()
            float r0 = (float) r0
            r8.y1(r0)
        L80:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ze2.s1(ze2, q40):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dw1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G0(long r5, defpackage.p40 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.xe2
            if (r0 == 0) goto L13
            r0 = r7
            xe2 r0 = (defpackage.xe2) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L1a
        L13:
            xe2 r0 = new xe2
            q40 r7 = (defpackage.q40) r7
            r0.<init>(r4, r7)
        L1a:
            java.lang.Object r7 = r0.i
            int r1 = r0.k
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            defpackage.y02.Q(r7)
            goto L40
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.y02.Q(r7)
            float r5 = defpackage.lp3.c(r5)
            r0.k = r2
            java.lang.Object r7 = r4.w1(r5, r0)
            y50 r4 = defpackage.y50.f
            if (r7 != r4) goto L40
            return r4
        L40:
            java.lang.Number r7 = (java.lang.Number) r7
            float r4 = r7.floatValue()
            r5 = 0
            long r4 = defpackage.d32.h(r5, r4)
            lp3 r6 = new lp3
            r6.<init>(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ze2.G0(long, p40):java.lang.Object");
    }

    @Override // defpackage.dw1
    public final long Q0(int i, long j) {
        if (!this.y.a.e() && this.x && i == 1 && Float.intBitsToFloat((int) (4294967295L & j)) < 0.0f) {
            return u1(j);
        }
        return 0L;
    }

    @Override // defpackage.aq1
    public final boolean e1() {
        return false;
    }

    @Override // defpackage.aq1
    public final void h1() {
        p1(this.A);
        cl3.t(d1(), null, new we2(this, null, 0), 3);
        y1(this.v ? v1() : 0.0f);
    }

    @Override // defpackage.dw1
    public final long l0(long j, int i, long j2) {
        if (this.y.a.e() || !this.x) {
            return 0L;
        }
        int i2 = 1;
        if (i != 1) {
            return 0L;
        }
        long jU1 = u1(j2);
        cl3.t(d1(), null, new we2(this, null, i2), 3);
        return jU1;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t1(defpackage.q40 r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.ue2
            if (r0 == 0) goto L14
            r0 = r10
            ue2 r0 = (defpackage.ue2) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.k = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            ue2 r0 = new ue2
            r0.<init>(r9, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r5.i
            int r0 = r5.k
            dm3 r7 = defpackage.dm3.a
            r1 = 1
            r8 = 0
            if (r0 == 0) goto L34
            if (r0 != r1) goto L2d
            defpackage.y02.Q(r10)     // Catch: java.lang.Throwable -> L2a
            goto L53
        L2a:
            r0 = move-exception
            r10 = r0
            goto L5a
        L2d:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r9)
            r9 = 0
            return r9
        L34:
            defpackage.y02.Q(r10)
            af2 r10 = r9.y     // Catch: java.lang.Throwable -> L2a
            r5.k = r1     // Catch: java.lang.Throwable -> L2a
            ed r1 = r10.a     // Catch: java.lang.Throwable -> L2a
            java.lang.Float r2 = new java.lang.Float     // Catch: java.lang.Throwable -> L2a
            r2.<init>(r8)     // Catch: java.lang.Throwable -> L2a
            r4 = 0
            r6 = 14
            r3 = 0
            java.lang.Object r10 = defpackage.ed.c(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L2a
            y50 r0 = defpackage.y50.f
            if (r10 != r0) goto L4f
            goto L50
        L4f:
            r10 = r7
        L50:
            if (r10 != r0) goto L53
            return r0
        L53:
            r9.x1(r8)
            r9.y1(r8)
            return r7
        L5a:
            r9.x1(r8)
            r9.y1(r8)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ze2.t1(q40):java.lang.Object");
    }

    public final long u1(long j) {
        float fG;
        float fV1;
        if (this.v) {
            fG = 0.0f;
        } else {
            z32 z32Var = this.C;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L)) + z32Var.g();
            if (fIntBitsToFloat < 0.0f) {
                fIntBitsToFloat = 0.0f;
            }
            fG = fIntBitsToFloat - z32Var.g();
            x1(fIntBitsToFloat);
            if (z32Var.g() * 0.5f <= v1()) {
                fV1 = z32Var.g() * 0.5f;
            } else {
                float fG2 = y02.g(Math.abs((z32Var.g() * 0.5f) / v1()) - 1.0f, 0.0f, 2.0f);
                fV1 = v1() + (v1() * (fG2 - (((float) Math.pow(fG2, 2.0d)) / 4.0f)));
            }
            y1(fV1);
        }
        return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fG)) & 4294967295L);
    }

    public final int v1() {
        return vr.X(this).E.p0(this.z);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w1(float r6, defpackage.q40 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.ye2
            if (r0 == 0) goto L13
            r0 = r7
            ye2 r0 = (defpackage.ye2) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ye2 r0 = new ye2
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.j
            int r1 = r0.l
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L28
            float r6 = r0.i
            defpackage.y02.Q(r7)
            goto L6f
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r5)
            r5 = 0
            return r5
        L2f:
            defpackage.y02.Q(r7)
            boolean r7 = r5.v
            if (r7 == 0) goto L3c
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r3)
            return r5
        L3c:
            z32 r7 = r5.C
            float r1 = r7.g()
            r4 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r4
            int r4 = r5.v1()
            float r4 = (float) r4
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 <= 0) goto L53
            cs0 r1 = r5.w
            r1.a()
        L53:
            float r7 = r7.g()
            int r7 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r7 != 0) goto L5d
        L5b:
            r6 = r3
            goto L62
        L5d:
            int r7 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r7 >= 0) goto L62
            goto L5b
        L62:
            r0.i = r6
            r0.l = r2
            java.lang.Object r7 = r5.t1(r0)
            y50 r0 = defpackage.y50.f
            if (r7 != r0) goto L6f
            return r0
        L6f:
            r5.x1(r3)
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ze2.w1(float, q40):java.lang.Object");
    }

    public final void x1(float f) {
        this.C.h(f);
    }

    public final void y1(float f) {
        this.B.h(f);
    }
}
