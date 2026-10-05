package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class rb3 implements ua0, p40 {
    public final /* synthetic */ sb3 f;
    public final jr g;
    public jr h;
    public ab2 i = ab2.g;
    public final li0 j = li0.f;
    public final /* synthetic */ sb3 k;

    public rb3(sb3 sb3Var, jr jrVar) {
        this.k = sb3Var;
        this.f = sb3Var;
        this.g = jrVar;
    }

    @Override // defpackage.ua0
    public final long C0(long j) {
        return this.f.C0(j);
    }

    public final long E() {
        sb3 sb3Var = this.k;
        long jC0 = sb3Var.C0(vr.X(sb3Var).G.g());
        long j = sb3Var.D;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jC0 >> 32)) - ((int) (j >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jC0 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L);
    }

    public final oq3 F() {
        return vr.X(this.k).G;
    }

    @Override // defpackage.ua0
    public final float G() {
        return this.f.G();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H(long r8, defpackage.rs0 r10, defpackage.ml r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.pb3
            if (r0 == 0) goto L13
            r0 = r11
            pb3 r0 = (defpackage.pb3) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            pb3 r0 = new pb3
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.j
            int r1 = r0.l
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            w83 r7 = r0.i
            defpackage.y02.Q(r11)     // Catch: java.lang.Throwable -> L28
            goto L68
        L28:
            r8 = move-exception
            goto L72
        L2a:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r7)
            return r2
        L30:
            defpackage.y02.Q(r11)
            r4 = 0
            int r11 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r11 > 0) goto L4a
            jr r11 = r7.h
            if (r11 == 0) goto L4a
            bb2 r1 = new bb2
            r1.<init>(r8)
            qn2 r4 = new qn2
            r4.<init>(r1)
            r11.t(r4)
        L4a:
            sb3 r11 = r7.k
            x50 r11 = r11.d1()
            sc r1 = new sc
            r1.<init>(r8, r7, r2)
            r8 = 3
            w83 r8 = defpackage.cl3.t(r11, r2, r1, r8)
            r0.i = r8     // Catch: java.lang.Throwable -> L6e
            r0.l = r3     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r11 = r10.f(r7, r0)     // Catch: java.lang.Throwable -> L6e
            y50 r7 = defpackage.y50.f
            if (r11 != r7) goto L67
            return r7
        L67:
            r7 = r8
        L68:
            gr r8 = defpackage.gr.g
            r7.c(r8)
            return r11
        L6e:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L72:
            gr r9 = defpackage.gr.g
            r7.c(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rb3.H(long, rs0, ml):java.lang.Object");
    }

    @Override // defpackage.ua0
    public final float H0(long j) {
        return this.f.H0(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I(long r5, defpackage.rs0 r7, defpackage.q40 r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.qb3
            if (r0 == 0) goto L13
            r0 = r8
            qb3 r0 = (defpackage.qb3) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            qb3 r0 = new qb3
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.i
            int r1 = r0.k
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.y02.Q(r8)     // Catch: defpackage.bb2 -> L3b
            return r8
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r4)
            return r2
        L2c:
            defpackage.y02.Q(r8)
            r0.k = r3     // Catch: defpackage.bb2 -> L3b
            java.lang.Object r4 = r4.H(r5, r7, r0)     // Catch: defpackage.bb2 -> L3b
            y50 r5 = defpackage.y50.f
            if (r4 != r5) goto L3a
            return r5
        L3a:
            return r4
        L3b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rb3.I(long, rs0, q40):java.lang.Object");
    }

    @Override // defpackage.ua0
    public final long P0(float f) {
        return this.f.P0(f);
    }

    @Override // defpackage.ua0
    public final long Q(float f) {
        return this.f.Q(f);
    }

    @Override // defpackage.ua0
    public final long R(long j) {
        return this.f.R(j);
    }

    @Override // defpackage.ua0
    public final float T(float f) {
        return this.f.h() * f;
    }

    @Override // defpackage.ua0
    public final float X0(int i) {
        return this.f.X0(i);
    }

    @Override // defpackage.ua0
    public final float a1(float f) {
        return f / this.f.h();
    }

    public final Object c(ab2 ab2Var, ml mlVar) {
        jr jrVar = new jr(1, vr.I(mlVar));
        jrVar.s();
        this.i = ab2Var;
        this.h = jrVar;
        return jrVar.q();
    }

    @Override // defpackage.ua0
    public final int f0(long j) {
        return this.f.f0(j);
    }

    @Override // defpackage.ua0
    public final float h() {
        return this.f.h();
    }

    @Override // defpackage.p40
    public final o50 i() {
        return this.j;
    }

    @Override // defpackage.ua0
    public final float j0(long j) {
        return this.f.j0(j);
    }

    @Override // defpackage.ua0
    public final int p0(float f) {
        return this.f.p0(f);
    }

    @Override // defpackage.p40
    public final void t(Object obj) {
        sb3 sb3Var = this.k;
        synchronized (sb3Var.A) {
            sb3Var.z.j(this);
        }
        this.g.t(obj);
    }
}
