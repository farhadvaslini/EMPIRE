package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ka3 extends gq1 {
    public final nd0 a;

    public ka3(nd0 nd0Var) {
        this.a = nd0Var;
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
        if (!(obj instanceof ka3)) {
            return false;
        }
        ka3 ka3Var = (ka3) obj;
        na naVar = n92.n0;
        return naVar.equals(naVar) && s51.n(this.a, ka3Var.a);
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        return new la3(n92.n0, this.a);
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        la3 la3Var = (la3) aq1Var;
        na naVar = n92.n0;
        if (!s51.n(la3Var.u, naVar)) {
            la3Var.u = naVar;
            if (la3Var.v) {
                la3Var.r1();
            }
        }
        la3Var.t = this.a;
    }

    public final int hashCode() {
        int iB = by1.b(1022 * 31, 31, false);
        nd0 nd0Var = this.a;
        return iB + (nd0Var != null ? nd0Var.hashCode() : 0);
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + n92.n0 + ", overrideDescendants=false, touchBoundsExpansion=" + this.a + ")";
    }
}
