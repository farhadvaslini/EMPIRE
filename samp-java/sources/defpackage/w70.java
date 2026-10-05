package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class w70 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ boolean l;
    public final /* synthetic */ b80 m;
    public final /* synthetic */ int n;
    public Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w70(b80 b80Var, int i, p40 p40Var, int i2) {
        super(2, p40Var);
        this.j = i2;
        this.m = b80Var;
        this.n = i;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        p40 p40Var = (p40) obj2;
        switch (i) {
        }
        return ((w70) m(p40Var, bool)).o(dm3Var);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        int i2 = this.n;
        b80 b80Var = this.m;
        switch (i) {
            case 0:
                w70 w70Var = new w70(b80Var, i2, p40Var, 0);
                w70Var.l = ((Boolean) obj).booleanValue();
                return w70Var;
            default:
                w70 w70Var2 = new w70(b80Var, i2, p40Var, 1);
                w70Var2.l = ((Boolean) obj).booleanValue();
                return w70Var2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.j
            int r1 = r9.n
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            y50 r4 = defpackage.y50.f
            r5 = 1
            r6 = 2
            b80 r7 = r9.m
            switch(r0) {
                case 0: goto L62;
                default: goto L10;
            }
        L10:
            int r0 = r9.k
            if (r0 == 0) goto L28
            if (r0 == r5) goto L22
            if (r0 != r6) goto L1e
            java.lang.Object r9 = r9.o
            defpackage.y02.Q(r10)
            goto L4d
        L1e:
            defpackage.c.q(r3)
            goto L61
        L22:
            boolean r0 = r9.l
            defpackage.y02.Q(r10)
            goto L38
        L28:
            defpackage.y02.Q(r10)
            boolean r0 = r9.l
            r9.l = r0
            r9.k = r5
            java.lang.Object r10 = r7.j(r9)
            if (r10 != r4) goto L38
            goto L48
        L38:
            if (r0 == 0) goto L54
            c43 r0 = r7.i()
            r9.o = r10
            r9.k = r6
            java.lang.Integer r9 = r0.a()
            if (r9 != r4) goto L4a
        L48:
            r2 = r4
            goto L61
        L4a:
            r8 = r10
            r10 = r9
            r9 = r8
        L4d:
            java.lang.Number r10 = (java.lang.Number) r10
            int r1 = r10.intValue()
            r10 = r9
        L54:
            a70 r2 = new a70
            if (r10 == 0) goto L5d
            int r9 = r10.hashCode()
            goto L5e
        L5d:
            r9 = 0
        L5e:
            r2.<init>(r9, r1, r10)
        L61:
            return r2
        L62:
            int r0 = r9.k
            if (r0 == 0) goto L80
            if (r0 == r5) goto L78
            if (r0 != r6) goto L74
            boolean r0 = r9.l
            java.lang.Object r9 = r9.o
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            defpackage.y02.Q(r10)
            goto Laa
        L74:
            defpackage.c.q(r3)
            goto Lc0
        L78:
            boolean r0 = r9.l
            defpackage.y02.Q(r10)     // Catch: java.lang.Throwable -> L7e
            goto L90
        L7e:
            r10 = move-exception
            goto L93
        L80:
            defpackage.y02.Q(r10)
            boolean r0 = r9.l
            r9.l = r0     // Catch: java.lang.Throwable -> L7e
            r9.k = r5     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r10 = defpackage.b80.h(r7, r0, r9)     // Catch: java.lang.Throwable -> L7e
            if (r10 != r4) goto L90
            goto La5
        L90:
            d93 r10 = (defpackage.d93) r10     // Catch: java.lang.Throwable -> L7e
            goto Lb7
        L93:
            if (r0 == 0) goto Lb1
            c43 r1 = r7.i()
            r9.o = r10
            r9.l = r0
            r9.k = r6
            java.lang.Integer r9 = r1.a()
            if (r9 != r4) goto La7
        La5:
            r2 = r4
            goto Lc0
        La7:
            r8 = r10
            r10 = r9
            r9 = r8
        Laa:
            java.lang.Number r10 = (java.lang.Number) r10
            int r1 = r10.intValue()
            r10 = r9
        Lb1:
            zi2 r9 = new zi2
            r9.<init>(r10, r1)
            r10 = r9
        Lb7:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
            r32 r2 = new r32
            r2.<init>(r10, r9)
        Lc0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w70.o(java.lang.Object):java.lang.Object");
    }
}
