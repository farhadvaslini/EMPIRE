package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class e12 implements ss0 {
    public final /* synthetic */ String f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ nr3 i;
    public final /* synthetic */ qr1 j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ rs0 l;
    public final /* synthetic */ rs0 m;
    public final /* synthetic */ rs0 n;
    public final /* synthetic */ rs0 o;
    public final /* synthetic */ rs0 p;
    public final /* synthetic */ se3 q;
    public final /* synthetic */ z13 r;

    public e12(String str, boolean z, boolean z2, nr3 nr3Var, qr1 qr1Var, boolean z3, rs0 rs0Var, rs0 rs0Var2, rs0 rs0Var3, rs0 rs0Var4, rs0 rs0Var5, se3 se3Var, z13 z13Var) {
        this.f = str;
        this.g = z;
        this.h = z2;
        this.i = nr3Var;
        this.j = qr1Var;
        this.k = z3;
        this.l = rs0Var;
        this.m = rs0Var2;
        this.n = rs0Var3;
        this.o = rs0Var4;
        this.p = rs0Var5;
        this.q = se3Var;
        this.r = z13Var;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.ss0
    public final Object e(Object obj, Object obj2, Object obj3) {
        rs0 rs0Var = (rs0) obj;
        nv0 nv0Var = (nv0) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= nv0Var.h(rs0Var) ? 4 : 2;
        }
        if (nv0Var.R(iIntValue & 1, (iIntValue & 19) != 18)) {
            f5 f5Var = f5.h0;
            z13 z13Var = this.r;
            boolean z = this.g;
            boolean z2 = this.k;
            qr1 qr1Var = this.j;
            se3 se3Var = this.q;
            f5Var.g(this.f, rs0Var, z, this.h, this.i, qr1Var, z2, this.l, this.m, this.n, this.o, this.p, se3Var, null, gq.N(-656940872, new gv1(z, z2, qr1Var, se3Var, z13Var), nv0Var), nv0Var, (iIntValue << 3) & 112);
        } else {
            nv0Var.U();
        }
        return dm3.a;
    }
}
