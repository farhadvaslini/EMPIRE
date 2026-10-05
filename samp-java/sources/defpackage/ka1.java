package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ka1 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ sa1 l;
    public final /* synthetic */ kq2 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ka1(sa1 sa1Var, kq2 kq2Var, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.l = sa1Var;
        this.m = kq2Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        x50 x50Var = (x50) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
        }
        return ((ka1) m(p40Var, x50Var)).o(dm3Var);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        kq2 kq2Var = this.m;
        sa1 sa1Var = this.l;
        switch (i) {
            case 0:
                return new ka1(sa1Var, kq2Var, p40Var, 0);
            default:
                return new ka1(sa1Var, kq2Var, p40Var, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        if (r10.c(r0, r9) == r5) goto L25;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.j
            dm3 r1 = defpackage.dm3.a
            kq2 r2 = r9.m
            sa1 r3 = r9.l
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            y50 r5 = defpackage.y50.f
            r6 = 1
            r7 = 0
            switch(r0) {
                case 0: goto L2f;
                default: goto L11;
            }
        L11:
            int r0 = r9.k
            if (r0 == 0) goto L20
            if (r0 != r6) goto L1b
            defpackage.y02.Q(r10)
            goto L2e
        L1b:
            defpackage.c.q(r4)
            r1 = r7
            goto L2e
        L20:
            defpackage.y02.Q(r10)
            sv2 r10 = r2.a
            r9.k = r6
            java.lang.Object r9 = defpackage.sa1.f(r3, r10, r9)
            if (r9 != r5) goto L2e
            r1 = r5
        L2e:
            return r1
        L2f:
            java.lang.String r0 = r2.e
            int r2 = r9.k
            r8 = 2
            if (r2 == 0) goto L47
            if (r2 == r6) goto L43
            if (r2 != r8) goto L3e
            defpackage.y02.Q(r10)
            goto L66
        L3e:
            defpackage.c.q(r4)
            r1 = r7
            goto La9
        L43:
            defpackage.y02.Q(r10)
            goto L5a
        L47:
            defpackage.y02.Q(r10)
            i93 r10 = r3.p
            r10.i(r7)
            qy2 r10 = r3.c
            r9.k = r6
            java.lang.Object r10 = r10.i(r0, r9)
            if (r10 != r5) goto L5a
            goto L64
        L5a:
            lf2 r10 = r3.f
            r9.k = r8
            java.lang.Object r9 = r10.c(r0, r9)
            if (r9 != r5) goto L66
        L64:
            r1 = r5
            goto La9
        L66:
            i93 r9 = r3.k
        L68:
            java.lang.Object r10 = r9.getValue()
            r2 = r10
            java.util.Map r2 = (java.util.Map) r2
            r2.getClass()
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r2)
            r3.remove(r0)
            int r2 = r3.size()
            if (r2 == 0) goto La1
            if (r2 == r6) goto L83
            goto La3
        L83:
            java.util.Set r2 = r3.entrySet()
            java.util.Iterator r2 = r2.iterator()
            java.lang.Object r2 = r2.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            java.util.Map r3 = java.util.Collections.singletonMap(r3, r2)
            r3.getClass()
            goto La3
        La1:
            oi0 r3 = defpackage.oi0.f
        La3:
            boolean r10 = r9.h(r10, r3)
            if (r10 == 0) goto L68
        La9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ka1.o(java.lang.Object):java.lang.Object");
    }
}
