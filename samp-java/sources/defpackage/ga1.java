package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ga1 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ sa1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ga1(sa1 sa1Var, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.l = sa1Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                ((ga1) m((p40) obj2, Integer.valueOf(((Number) obj).intValue()))).o(dm3Var);
                return dm3Var;
            case 1:
                ((ga1) m((p40) obj2, Integer.valueOf(((Number) obj).intValue()))).o(dm3Var);
                return dm3Var;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return ((ga1) m((p40) obj2, (x50) obj)).o(dm3Var);
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                return ((ga1) m((p40) obj2, (x50) obj)).o(dm3Var);
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                return ((ga1) m((p40) obj2, (x50) obj)).o(dm3Var);
            default:
                return ((ga1) m((p40) obj2, (x50) obj)).o(dm3Var);
        }
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        sa1 sa1Var = this.l;
        switch (i) {
            case 0:
                ga1 ga1Var = new ga1(sa1Var, p40Var, 0);
                ga1Var.k = ((Number) obj).intValue();
                return ga1Var;
            case 1:
                ga1 ga1Var2 = new ga1(sa1Var, p40Var, 1);
                ga1Var2.k = ((Number) obj).intValue();
                return ga1Var2;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return new ga1(sa1Var, p40Var, 2);
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                return new ga1(sa1Var, p40Var, 3);
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                return new ga1(sa1Var, p40Var, 4);
            default:
                return new ga1(sa1Var, p40Var, 5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        if (defpackage.ur.w(r2, r9) == r5) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [p40] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r9v10, types: [i93] */
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
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ga1.o(java.lang.Object):java.lang.Object");
    }
}
