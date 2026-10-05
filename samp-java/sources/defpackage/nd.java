package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class nd extends u71 implements ss0 {
    public final /* synthetic */ Object g;
    public final /* synthetic */ l73 h;
    public final /* synthetic */ zd i;
    public final /* synthetic */ d00 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nd(Object obj, l73 l73Var, zd zdVar, d00 d00Var) {
        super(3);
        this.g = obj;
        this.h = l73Var;
        this.i = zdVar;
        this.j = d00Var;
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
    @Override // defpackage.ss0
    public final Object e(Object obj, Object obj2, Object obj3) {
        he heVar = (he) obj;
        nv0 nv0Var = (nv0) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? nv0Var.f(heVar) : nv0Var.h(heVar) ? 4 : 2;
        }
        if (nv0Var.R(iIntValue & 1, (iIntValue & 19) != 18)) {
            l73 l73Var = this.h;
            boolean zF = nv0Var.f(l73Var);
            Object obj4 = this.g;
            boolean zH = zF | nv0Var.h(obj4);
            zd zdVar = this.i;
            boolean zH2 = zH | nv0Var.h(zdVar);
            Object objO = nv0Var.O();
            zj zjVar = c20.a;
            if (zH2 || objO == zjVar) {
                objO = new md(l73Var, obj4, zdVar, 0);
                nv0Var.j0(objO);
            }
            rn.h(heVar, obj4, (ns0) objO, nv0Var);
            is1 is1Var = zdVar.d;
            heVar.getClass();
            is1Var.m(obj4, ((ie) heVar).b);
            Object objO2 = nv0Var.O();
            if (objO2 == zjVar) {
                objO2 = new sd(heVar);
                nv0Var.j0(objO2);
            }
            this.j.l((sd) objO2, obj4, nv0Var, 0);
        } else {
            nv0Var.U();
        }
        return dm3.a;
    }
}
