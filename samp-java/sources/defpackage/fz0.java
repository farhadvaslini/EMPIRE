package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class fz0 extends aq1 implements jb2 {
    public qr1 t;
    public zy0 u;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object p1(defpackage.fz0 r4, defpackage.q40 r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof defpackage.cz0
            if (r0 == 0) goto L13
            r0 = r5
            cz0 r0 = (defpackage.cz0) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            cz0 r0 = new cz0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.j
            int r1 = r0.l
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            zy0 r0 = r0.i
            defpackage.y02.Q(r5)
            goto L4a
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.y02.Q(r5)
            zy0 r5 = r4.u
            if (r5 != 0) goto L4c
            zy0 r5 = new zy0
            r5.<init>()
            qr1 r1 = r4.t
            r0.i = r5
            r0.l = r2
            java.lang.Object r0 = r1.b(r5, r0)
            y50 r1 = defpackage.y50.f
            if (r0 != r1) goto L49
            return r1
        L49:
            r0 = r5
        L4a:
            r4.u = r0
        L4c:
            dm3 r4 = defpackage.dm3.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz0.p1(fz0, q40):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q1(defpackage.fz0 r4, defpackage.q40 r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof defpackage.dz0
            if (r0 == 0) goto L13
            r0 = r5
            dz0 r0 = (defpackage.dz0) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            dz0 r0 = new dz0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.i
            int r1 = r0.k
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.y02.Q(r5)
            goto L45
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r4)
            return r2
        L2c:
            defpackage.y02.Q(r5)
            zy0 r5 = r4.u
            if (r5 == 0) goto L47
            az0 r1 = new az0
            r1.<init>(r5)
            qr1 r5 = r4.t
            r0.k = r3
            java.lang.Object r5 = r5.b(r1, r0)
            y50 r0 = defpackage.y50.f
            if (r5 != r0) goto L45
            return r0
        L45:
            r4.u = r2
        L47:
            dm3 r4 = defpackage.dm3.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz0.q1(fz0, q40):java.lang.Object");
    }

    @Override // defpackage.jb2
    public final void L0() {
        r1();
    }

    @Override // defpackage.jb2
    public final void i0(za2 za2Var, ab2 ab2Var, long j) {
        if (ab2Var == ab2.g) {
            int i = za2Var.f;
            p40 p40Var = null;
            if (i == 4) {
                cl3.t(d1(), null, new ez0(this, p40Var, 0), 3);
            } else if (i == 5) {
                cl3.t(d1(), null, new ez0(this, p40Var, 1), 3);
            }
        }
    }

    @Override // defpackage.aq1
    public final void i1() {
        r1();
    }

    public final void r1() {
        zy0 zy0Var = this.u;
        if (zy0Var != null) {
            this.t.c(new az0(zy0Var));
            this.u = null;
        }
    }
}
