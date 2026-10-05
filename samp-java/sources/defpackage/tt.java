package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class tt extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ ed l;
    public final /* synthetic */ float m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ s41 o;
    public final /* synthetic */ os1 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tt(ed edVar, float f, boolean z, s41 s41Var, os1 os1Var, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.l = edVar;
        this.m = f;
        this.n = z;
        this.o = s41Var;
        this.p = os1Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        x50 x50Var = (x50) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
        }
        return ((tt) m(p40Var, x50Var)).o(dm3Var);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        switch (this.j) {
            case 0:
                return new tt(this.l, this.m, this.n, this.o, this.p, p40Var, 0);
            default:
                return new tt(this.l, this.m, this.n, this.o, this.p, p40Var, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        if (r6.f(r12, r13) == r5) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (defpackage.hh0.a(r6, r7, r13, r11, r12) == r5) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0093, code lost:
    
        if (r6.f(r12, r13) == r5) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a2, code lost:
    
        if (defpackage.hh0.a(r6, r7, r13, r11, r12) == r5) goto L37;
     */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.j
            dm3 r1 = defpackage.dm3.a
            boolean r2 = r12.n
            r3 = 0
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            y50 r5 = defpackage.y50.f
            ed r6 = r12.l
            float r7 = r12.m
            r8 = 1
            r9 = 2
            os1 r10 = r12.p
            s41 r11 = r12.o
            switch(r0) {
                case 0: goto L61;
                default: goto L18;
            }
        L18:
            int r0 = r12.k
            if (r0 == 0) goto L2a
            if (r0 == r8) goto L26
            if (r0 != r9) goto L21
            goto L26
        L21:
            defpackage.c.q(r4)
            r1 = r3
            goto L60
        L26:
            defpackage.y02.Q(r13)
            goto L5d
        L2a:
            defpackage.y02.Q(r13)
            d42 r13 = r6.e
            java.lang.Object r13 = r13.getValue()
            jd0 r13 = (defpackage.jd0) r13
            float r13 = r13.f
            boolean r13 = defpackage.jd0.b(r13, r7)
            if (r13 != 0) goto L60
            if (r2 != 0) goto L4d
            jd0 r13 = new jd0
            r13.<init>(r7)
            r12.k = r8
            java.lang.Object r12 = r6.f(r12, r13)
            if (r12 != r5) goto L5d
            goto L5b
        L4d:
            java.lang.Object r13 = r10.getValue()
            s41 r13 = (defpackage.s41) r13
            r12.k = r9
            java.lang.Object r12 = defpackage.hh0.a(r6, r7, r13, r11, r12)
            if (r12 != r5) goto L5d
        L5b:
            r1 = r5
            goto L60
        L5d:
            r10.setValue(r11)
        L60:
            return r1
        L61:
            int r0 = r12.k
            if (r0 == 0) goto L73
            if (r0 == r8) goto L6f
            if (r0 != r9) goto L6a
            goto L6f
        L6a:
            defpackage.c.q(r4)
            r1 = r3
            goto La9
        L6f:
            defpackage.y02.Q(r13)
            goto La6
        L73:
            defpackage.y02.Q(r13)
            d42 r13 = r6.e
            java.lang.Object r13 = r13.getValue()
            jd0 r13 = (defpackage.jd0) r13
            float r13 = r13.f
            boolean r13 = defpackage.jd0.b(r13, r7)
            if (r13 != 0) goto La9
            if (r2 != 0) goto L96
            jd0 r13 = new jd0
            r13.<init>(r7)
            r12.k = r8
            java.lang.Object r12 = r6.f(r12, r13)
            if (r12 != r5) goto La6
            goto La4
        L96:
            java.lang.Object r13 = r10.getValue()
            s41 r13 = (defpackage.s41) r13
            r12.k = r9
            java.lang.Object r12 = defpackage.hh0.a(r6, r7, r13, r11, r12)
            if (r12 != r5) goto La6
        La4:
            r1 = r5
            goto La9
        La6:
            r10.setValue(r11)
        La9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tt.o(java.lang.Object):java.lang.Object");
    }
}
