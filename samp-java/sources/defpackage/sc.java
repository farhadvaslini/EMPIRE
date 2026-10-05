package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class sc extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ long l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sc(long j, rb3 rb3Var, p40 p40Var) {
        super(2, p40Var);
        this.j = 2;
        this.l = j;
        this.m = rb3Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        x50 x50Var = (x50) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
        }
        return ((sc) m(p40Var, x50Var)).o(dm3Var);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        Object obj2 = this.m;
        switch (i) {
            case 0:
                return new sc((tc) obj2, this.l, p40Var, 0);
            case 1:
                return new sc((ed) obj2, this.l, p40Var, 1);
            default:
                return new sc(this.l, (rb3) obj2, p40Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (defpackage.ur.A(8, r13) == r7) goto L16;
     */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.j
            dm3 r6 = defpackage.dm3.a
            java.lang.Object r1 = r13.m
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            y50 r7 = defpackage.y50.f
            r5 = 1
            long r8 = r13.l
            switch(r0) {
                case 0: goto L7f;
                case 1: goto L55;
                default: goto L11;
            }
        L11:
            int r0 = r13.k
            r10 = 8
            r12 = 2
            if (r0 == 0) goto L29
            if (r0 == r5) goto L25
            if (r0 != r12) goto L20
            defpackage.y02.Q(r14)
            goto L41
        L20:
            defpackage.c.q(r3)
            r6 = r2
            goto L54
        L25:
            defpackage.y02.Q(r14)
            goto L37
        L29:
            defpackage.y02.Q(r14)
            long r2 = r8 - r10
            r13.k = r5
            java.lang.Object r0 = defpackage.ur.A(r2, r13)
            if (r0 != r7) goto L37
            goto L3f
        L37:
            r13.k = r12
            java.lang.Object r0 = defpackage.ur.A(r10, r13)
            if (r0 != r7) goto L41
        L3f:
            r6 = r7
            goto L54
        L41:
            rb3 r1 = (defpackage.rb3) r1
            jr r0 = r1.h
            if (r0 == 0) goto L54
            bb2 r1 = new bb2
            r1.<init>(r8)
            qn2 r2 = new qn2
            r2.<init>(r1)
            r0.t(r2)
        L54:
            return r6
        L55:
            int r0 = r13.k
            if (r0 == 0) goto L64
            if (r0 != r5) goto L5f
            defpackage.y02.Q(r14)
            goto L7e
        L5f:
            defpackage.c.q(r3)
            r6 = r2
            goto L7e
        L64:
            defpackage.y02.Q(r14)
            r0 = r1
            ed r0 = (defpackage.ed) r0
            gy1 r1 = new gy1
            r1.<init>(r8)
            s83 r2 = defpackage.mu2.d
            r13.k = r5
            r3 = 0
            r5 = 12
            r4 = r13
            java.lang.Object r0 = defpackage.ed.c(r0, r1, r2, r3, r4, r5)
            if (r0 != r7) goto L7e
            r6 = r7
        L7e:
            return r6
        L7f:
            int r0 = r13.k
            if (r0 == 0) goto L8e
            if (r0 != r5) goto L89
            defpackage.y02.Q(r14)
            goto L9e
        L89:
            defpackage.c.q(r3)
            r6 = r2
            goto L9e
        L8e:
            defpackage.y02.Q(r14)
            tc r1 = (defpackage.tc) r1
            gw1 r0 = r1.f
            r13.k = r5
            java.lang.Object r0 = r0.b(r8, r13)
            if (r0 != r7) goto L9e
            r6 = r7
        L9e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sc.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sc(Object obj, long j, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.m = obj;
        this.l = j;
    }
}
