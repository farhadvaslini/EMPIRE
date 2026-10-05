package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class k70 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ b80 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k70(b80 b80Var, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.l = b80Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                return ((k70) m((p40) obj2, (gn0) obj)).o(dm3Var);
            case 1:
                return ((k70) m((p40) obj2, (x50) obj)).o(dm3Var);
            default:
                return ((k70) m((p40) obj2, (x50) obj)).o(dm3Var);
        }
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        b80 b80Var = this.l;
        switch (i) {
            case 0:
                return new k70(b80Var, p40Var, 0);
            case 1:
                return new k70(b80Var, p40Var, 1);
            default:
                return new k70(b80Var, p40Var, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r10 == r6) goto L22;
     */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            int r0 = r9.j
            dm3 r1 = defpackage.dm3.a
            r2 = -1
            r3 = 2
            r4 = 0
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            y50 r6 = defpackage.y50.f
            b80 r7 = r9.l
            r8 = 1
            switch(r0) {
                case 0: goto L9b;
                case 1: goto L57;
                default: goto L11;
            }
        L11:
            yl1 r0 = r7.g
            int r1 = r9.k
            if (r1 == 0) goto L29
            if (r1 == r8) goto L23
            if (r1 != r3) goto L1f
            defpackage.y02.Q(r10)
            goto L4d
        L1f:
            defpackage.c.q(r5)
            goto L56
        L23:
            defpackage.y02.Q(r10)     // Catch: java.lang.Throwable -> L27
            goto L42
        L27:
            r9 = move-exception
            goto L51
        L29:
            defpackage.y02.Q(r10)
            d93 r10 = r0.A()
            boolean r10 = r10 instanceof defpackage.km0
            if (r10 == 0) goto L39
            d93 r4 = r0.A()
            goto L56
        L39:
            r9.k = r8     // Catch: java.lang.Throwable -> L27
            java.lang.Object r10 = defpackage.b80.f(r7, r9)     // Catch: java.lang.Throwable -> L27
            if (r10 != r6) goto L42
            goto L4b
        L42:
            r9.k = r3
            r10 = 0
            java.lang.Object r10 = defpackage.b80.g(r7, r10, r9)
            if (r10 != r6) goto L4d
        L4b:
            r4 = r6
            goto L56
        L4d:
            r4 = r10
            d93 r4 = (defpackage.d93) r4
            goto L56
        L51:
            zi2 r4 = new zi2
            r4.<init>(r9, r2)
        L56:
            return r4
        L57:
            int r0 = r9.k
            if (r0 == 0) goto L6c
            if (r0 == r8) goto L68
            if (r0 != r3) goto L63
            defpackage.y02.Q(r10)
            goto L9a
        L63:
            defpackage.c.q(r5)
            r1 = r4
            goto L9a
        L68:
            defpackage.y02.Q(r10)
            goto L82
        L6c:
            defpackage.y02.Q(r10)
            pl r10 = r7.h
            r9.k = r8
            java.lang.Object r10 = r10.h
            gz r10 = (defpackage.gz) r10
            java.lang.Object r10 = r10.E(r9)
            if (r10 != r6) goto L7e
            goto L7f
        L7e:
            r10 = r1
        L7f:
            if (r10 != r6) goto L82
            goto L99
        L82:
            c43 r10 = r7.i()
            p70 r10 = r10.c
            fn0 r10 = defpackage.lr.m(r10, r2)
            k9 r0 = new k9
            r0.<init>(r8, r7)
            r9.k = r3
            java.lang.Object r9 = r10.a(r0, r9)
            if (r9 != r6) goto L9a
        L99:
            r1 = r6
        L9a:
            return r1
        L9b:
            int r0 = r9.k
            if (r0 == 0) goto Laa
            if (r0 != r8) goto La5
            defpackage.y02.Q(r10)
            goto Lb6
        La5:
            defpackage.c.q(r5)
            r1 = r4
            goto Lb6
        Laa:
            defpackage.y02.Q(r10)
            r9.k = r8
            java.lang.Object r9 = defpackage.b80.e(r7, r9)
            if (r9 != r6) goto Lb6
            r1 = r6
        Lb6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k70.o(java.lang.Object):java.lang.Object");
    }
}
