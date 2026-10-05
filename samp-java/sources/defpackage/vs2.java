package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class vs2 extends mb3 implements rs0 {
    public long j;
    public int k;
    public /* synthetic */ long l;
    public final /* synthetic */ ws2 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs2(ws2 ws2Var, p40 p40Var) {
        super(2, p40Var);
        this.m = ws2Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        long j = ((lp3) obj).a;
        vs2 vs2Var = new vs2(this.m, (p40) obj2);
        vs2Var.l = j;
        return vs2Var.o(dm3.a);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        vs2 vs2Var = new vs2(this.m, p40Var);
        vs2Var.l = ((lp3) obj).a;
        return vs2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.k
            r1 = 3
            r2 = 2
            r3 = 1
            ws2 r4 = r14.m
            y50 r5 = defpackage.y50.f
            if (r0 == 0) goto L2e
            if (r0 == r3) goto L28
            if (r0 == r2) goto L20
            if (r0 != r1) goto L19
            long r0 = r14.j
            long r2 = r14.l
            defpackage.y02.Q(r15)
            goto L70
        L19:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r14)
            r14 = 0
            return r14
        L20:
            long r2 = r14.j
            long r6 = r14.l
            defpackage.y02.Q(r15)
            goto L56
        L28:
            long r6 = r14.l
            defpackage.y02.Q(r15)
            goto L40
        L2e:
            defpackage.y02.Q(r15)
            long r6 = r14.l
            gw1 r15 = r4.f
            r14.l = r6
            r14.k = r3
            java.lang.Object r15 = r15.b(r6, r14)
            if (r15 != r5) goto L40
            goto L6d
        L40:
            lp3 r15 = (defpackage.lp3) r15
            long r8 = r15.a
            long r8 = defpackage.lp3.d(r6, r8)
            r14.l = r6
            r14.j = r8
            r14.k = r2
            java.lang.Object r15 = r4.a(r8, r14)
            if (r15 != r5) goto L55
            goto L6d
        L55:
            r2 = r8
        L56:
            lp3 r15 = (defpackage.lp3) r15
            long r11 = r15.a
            gw1 r8 = r4.f
            long r9 = defpackage.lp3.d(r2, r11)
            r14.l = r6
            r14.j = r11
            r14.k = r1
            r13 = r14
            java.lang.Object r15 = r8.a(r9, r11, r13)
            if (r15 != r5) goto L6e
        L6d:
            return r5
        L6e:
            r2 = r6
            r0 = r11
        L70:
            lp3 r15 = (defpackage.lp3) r15
            long r14 = r15.a
            long r14 = defpackage.lp3.d(r0, r14)
            long r14 = defpackage.lp3.d(r2, r14)
            lp3 r0 = new lp3
            r0.<init>(r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vs2.o(java.lang.Object):java.lang.Object");
    }
}
