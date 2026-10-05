package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ms2 implements dw1 {
    public final ws2 f;
    public boolean g;

    public ms2(ws2 ws2Var, boolean z) {
        this.f = ws2Var;
        this.g = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dw1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J0(long r4, long r6, defpackage.p40 r8) throws java.lang.Throwable {
        /*
            r3 = this;
            boolean r4 = r8 instanceof defpackage.ls2
            if (r4 == 0) goto L13
            r4 = r8
            ls2 r4 = (defpackage.ls2) r4
            int r5 = r4.l
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r5 & r0
            if (r1 == 0) goto L13
            int r5 = r5 - r0
            r4.l = r5
            goto L1a
        L13:
            ls2 r4 = new ls2
            q40 r8 = (defpackage.q40) r8
            r4.<init>(r3, r8)
        L1a:
            java.lang.Object r5 = r4.j
            int r8 = r4.l
            r0 = 1
            if (r8 == 0) goto L30
            if (r8 != r0) goto L29
            long r6 = r4.i
            defpackage.y02.Q(r5)
            goto L4d
        L29:
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r3)
            r3 = 0
            return r3
        L30:
            defpackage.y02.Q(r5)
            boolean r5 = r3.g
            r1 = 0
            if (r5 == 0) goto L55
            ws2 r3 = r3.f
            boolean r5 = r3.i
            if (r5 == 0) goto L40
            goto L51
        L40:
            r4.i = r6
            r4.l = r0
            java.lang.Object r5 = r3.a(r6, r4)
            y50 r3 = defpackage.y50.f
            if (r5 != r3) goto L4d
            return r3
        L4d:
            lp3 r5 = (defpackage.lp3) r5
            long r1 = r5.a
        L51:
            long r1 = defpackage.lp3.d(r6, r1)
        L55:
            lp3 r3 = new lp3
            r3.<init>(r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ms2.J0(long, long, p40):java.lang.Object");
    }

    @Override // defpackage.dw1
    public final long l0(long j, int i, long j2) {
        if (!this.g) {
            return 0L;
        }
        ws2 ws2Var = this.f;
        if (ws2Var.a.b()) {
            return 0L;
        }
        return ws2Var.i(ws2Var.e(ws2Var.a.e(ws2Var.e(ws2Var.h(j2)))));
    }
}
