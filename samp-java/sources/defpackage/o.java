package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class o extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ qr1 l;
    public final /* synthetic */ zc2 m;
    public final /* synthetic */ r n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(qr1 qr1Var, zc2 zc2Var, r rVar, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.l = qr1Var;
        this.m = zc2Var;
        this.n = rVar;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        x50 x50Var = (x50) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
        }
        return ((o) m(p40Var, x50Var)).o(dm3Var);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        switch (this.j) {
            case 0:
                return new o(this.l, this.m, this.n, p40Var, 0);
            default:
                return new o(this.l, this.m, this.n, p40Var, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r3.b(r9, r10) == r6) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
    
        if (r3.b(r9, r10) == r6) goto L31;
     */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.j
            dm3 r1 = defpackage.dm3.a
            r r2 = r10.n
            qr1 r3 = r10.l
            r4 = 0
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            y50 r6 = defpackage.y50.f
            r7 = 1
            r8 = 2
            zc2 r9 = r10.m
            switch(r0) {
                case 0: goto L44;
                default: goto L14;
            }
        L14:
            int r0 = r10.k
            if (r0 == 0) goto L29
            if (r0 == r7) goto L25
            if (r0 != r8) goto L20
            defpackage.y02.Q(r11)
            goto L41
        L20:
            defpackage.c.q(r5)
            r1 = r4
            goto L43
        L25:
            defpackage.y02.Q(r11)
            goto L37
        L29:
            defpackage.y02.Q(r11)
            long r4 = defpackage.yw.a
            r10.k = r7
            java.lang.Object r11 = defpackage.ur.A(r4, r10)
            if (r11 != r6) goto L37
            goto L3f
        L37:
            r10.k = r8
            java.lang.Object r10 = r3.b(r9, r10)
            if (r10 != r6) goto L41
        L3f:
            r1 = r6
            goto L43
        L41:
            r2.H = r9
        L43:
            return r1
        L44:
            int r0 = r10.k
            if (r0 == 0) goto L59
            if (r0 == r7) goto L55
            if (r0 != r8) goto L50
            defpackage.y02.Q(r11)
            goto L71
        L50:
            defpackage.c.q(r5)
            r1 = r4
            goto L73
        L55:
            defpackage.y02.Q(r11)
            goto L67
        L59:
            defpackage.y02.Q(r11)
            long r4 = defpackage.yw.a
            r10.k = r7
            java.lang.Object r11 = defpackage.ur.A(r4, r10)
            if (r11 != r6) goto L67
            goto L6f
        L67:
            r10.k = r8
            java.lang.Object r10 = r3.b(r9, r10)
            if (r10 != r6) goto L71
        L6f:
            r1 = r6
            goto L73
        L71:
            r2.L = r9
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o.o(java.lang.Object):java.lang.Object");
    }
}
