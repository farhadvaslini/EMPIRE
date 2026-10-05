package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class a80 extends mb3 implements rs0 {
    public ok2 j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ ok2 m;
    public final /* synthetic */ b80 n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ boolean p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a80(ok2 ok2Var, b80 b80Var, Object obj, boolean z, p40 p40Var) {
        super(2, p40Var);
        this.m = ok2Var;
        this.n = b80Var;
        this.o = obj;
        this.p = z;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        return ((a80) m((p40) obj2, (dm0) obj)).o(dm3.a);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        a80 a80Var = new a80(this.m, this.n, this.o, this.p, p40Var);
        a80Var.l = obj;
        return a80Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0075, code lost:
    
        if (r10 == r8) goto L21;
     */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r10) throws java.io.IOException {
        /*
            r9 = this;
            int r0 = r9.k
            dm3 r1 = defpackage.dm3.a
            java.lang.Object r2 = r9.o
            b80 r3 = r9.n
            ok2 r4 = r9.m
            r5 = 2
            r6 = 1
            r7 = 0
            y50 r8 = defpackage.y50.f
            if (r0 == 0) goto L29
            if (r0 == r6) goto L1f
            if (r0 != r5) goto L19
            defpackage.y02.Q(r10)
            goto L78
        L19:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r9)
            return r7
        L1f:
            ok2 r0 = r9.j
            java.lang.Object r6 = r9.l
            dm0 r6 = (defpackage.dm0) r6
            defpackage.y02.Q(r10)
            goto L50
        L29:
            defpackage.y02.Q(r10)
            java.lang.Object r10 = r9.l
            dm0 r10 = (defpackage.dm0) r10
            c43 r0 = r3.i()
            r9.l = r10
            r9.j = r4
            r9.k = r6
            yl1 r0 = r0.b
            java.lang.Object r0 = r0.g
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            int r0 = r0.incrementAndGet()
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r0)
            if (r6 != r8) goto L4c
            goto L77
        L4c:
            r0 = r6
            r6 = r10
            r10 = r0
            r0 = r4
        L50:
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            r0.f = r10
            r9.l = r7
            r9.j = r7
            r9.k = r5
            java.util.concurrent.atomic.AtomicBoolean r10 = r6.b
            boolean r10 = r10.get()
            if (r10 != 0) goto L91
            java.io.File r10 = r6.a
            y70 r0 = new y70
            r0.<init>(r6, r2, r7)
            java.lang.Object r10 = defpackage.lq.m(r10, r0, r9)
            if (r10 != r8) goto L74
            goto L75
        L74:
            r10 = r1
        L75:
            if (r10 != r8) goto L78
        L77:
            return r8
        L78:
            boolean r9 = r9.p
            if (r9 == 0) goto L90
            yl1 r9 = r3.g
            a70 r10 = new a70
            if (r2 == 0) goto L87
            int r0 = r2.hashCode()
            goto L88
        L87:
            r0 = 0
        L88:
            int r3 = r4.f
            r10.<init>(r0, r3, r2)
            r9.I(r10)
        L90:
            return r1
        L91:
            java.lang.String r9 = "This scope has already been closed."
            defpackage.c.q(r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a80.o(java.lang.Object):java.lang.Object");
    }
}
