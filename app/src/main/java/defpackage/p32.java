package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
final class p32 extends gq1 {
    public final o32 a;
    public final yx b;

    public p32(o32 o32Var, yx yxVar) {
        this.a = o32Var;
        this.b = yxVar;
    }

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
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p32)) {
            return false;
        }
        p32 p32Var = (p32) obj;
        if (!s51.n(this.a, p32Var.a)) {
            return false;
        }
        vm vmVar = f5.k;
        return vmVar.equals(vmVar) && Float.compare(1.0f, 1.0f) == 0 && s51.n(this.b, p32Var.b);
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        vm vmVar = f5.k;
        q32 q32Var = new q32();
        q32Var.t = this.a;
        q32Var.u = true;
        q32Var.v = vmVar;
        q32Var.w = d40.b;
        q32Var.x = 1.0f;
        q32Var.y = this.b;
        return q32Var;
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        q32 q32Var = (q32) aq1Var;
        boolean z = q32Var.u;
        o32 o32Var = this.a;
        boolean z2 = (z && h43.a(q32Var.t.d(), o32Var.d())) ? false : true;
        q32Var.t = o32Var;
        q32Var.u = true;
        q32Var.v = f5.k;
        q32Var.w = d40.b;
        q32Var.x = 1.0f;
        q32Var.y = this.b;
        if (z2) {
            lq.J(q32Var);
        }
        vr.J(q32Var);
    }

    public final int hashCode() {
        int iA = nc2.a((d40.b.hashCode() + ((Float.hashCode(0.0f) + (Float.hashCode(0.0f) * 31) + by1.b(this.a.hashCode() * 31, 31, true)) * 31)) * 31, 1.0f, 31);
        yx yxVar = this.b;
        return iA + (yxVar == null ? 0 : yxVar.hashCode());
    }

    public final String toString() {
        return "PainterElement(painter=" + this.a + ", sizeToIntrinsics=true, alignment=" + f5.k + ", contentScale=" + d40.b + ", alpha=1.0, colorFilter=" + this.b + ")";
    }
}
