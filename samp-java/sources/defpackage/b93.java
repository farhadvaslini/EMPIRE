package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class b93 extends mb3 implements ss0 {
    public int j;
    public /* synthetic */ gn0 k;
    public /* synthetic */ int l;
    public final /* synthetic */ c93 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b93(c93 c93Var, p40 p40Var) {
        super(3, p40Var);
        this.m = c93Var;
    }

    @Override // defpackage.ss0
    public final Object e(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        b93 b93Var = new b93(this.m, (p40) obj3);
        b93Var.k = (gn0) obj;
        b93Var.l = iIntValue;
        return b93Var.o(dm3.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r4.k(defpackage.m33.f, r16) == r13) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
    
        if (r4.k(defpackage.m33.h, r16) != r13) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            c93 r1 = r0.m
            long r2 = r1.b
            gn0 r4 = r0.k
            int r5 = r0.l
            int r6 = r0.j
            r7 = 0
            r8 = 5
            r9 = 4
            r10 = 3
            r11 = 2
            r12 = 1
            y50 r13 = defpackage.y50.f
            if (r6 == 0) goto L37
            if (r6 == r12) goto L33
            if (r6 == r11) goto L2f
            if (r6 == r10) goto L2b
            if (r6 == r9) goto L27
            if (r6 != r8) goto L21
            goto L33
        L21:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r0)
            return r7
        L27:
            defpackage.y02.Q(r17)
            goto L7c
        L2b:
            defpackage.y02.Q(r17)
            goto L6f
        L2f:
            defpackage.y02.Q(r17)
            goto L5a
        L33:
            defpackage.y02.Q(r17)
            goto L8b
        L37:
            defpackage.y02.Q(r17)
            if (r5 <= 0) goto L4b
            r0.k = r7
            r0.l = r5
            r0.j = r12
            m33 r1 = defpackage.m33.f
            java.lang.Object r0 = r4.k(r1, r0)
            if (r0 != r13) goto L8b
            goto L8a
        L4b:
            long r14 = r1.a
            r0.k = r4
            r0.l = r5
            r0.j = r11
            java.lang.Object r1 = defpackage.ur.A(r14, r0)
            if (r1 != r13) goto L5a
            goto L8a
        L5a:
            r11 = 0
            int r1 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r1 <= 0) goto L7c
            r0.k = r4
            r0.l = r5
            r0.j = r10
            m33 r1 = defpackage.m33.g
            java.lang.Object r1 = r4.k(r1, r0)
            if (r1 != r13) goto L6f
            goto L8a
        L6f:
            r0.k = r4
            r0.l = r5
            r0.j = r9
            java.lang.Object r1 = defpackage.ur.A(r2, r0)
            if (r1 != r13) goto L7c
            goto L8a
        L7c:
            r0.k = r7
            r0.l = r5
            r0.j = r8
            m33 r1 = defpackage.m33.h
            java.lang.Object r0 = r4.k(r1, r0)
            if (r0 != r13) goto L8b
        L8a:
            return r13
        L8b:
            dm3 r0 = defpackage.dm3.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b93.o(java.lang.Object):java.lang.Object");
    }
}
