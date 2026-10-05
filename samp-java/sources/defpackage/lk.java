package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class lk extends aq1 {
    public vh3 t;
    public final /* synthetic */ mk u;

    public lk(mk mkVar) {
        this.u = mkVar;
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
    @Override // defpackage.aq1
    public final void h1() {
        mk mkVar = this.u;
        mkVar.a = this;
        if (mkVar.b != null) {
            i iVar = new i(5, this, mkVar);
            tb1 tb1VarX = vr.X(this);
            int i = tb1VarX.g;
            lk2 rectManager = ((h7) wb1.a(tb1VarX)).getRectManager();
            wh3 wh3Var = rectManager.d;
            wh3Var.getClass();
            or1 or1Var = wh3Var.a;
            vh3 vh3Var = new vh3(wh3Var, i, this, iVar);
            Object objB = or1Var.b(i);
            if (objB == null) {
                or1Var.i(i, vh3Var);
                objB = vh3Var;
            }
            vh3 vh3Var2 = (vh3) objB;
            if (vh3Var2 != vh3Var) {
                while (true) {
                    vh3 vh3Var3 = vh3Var2.d;
                    if (vh3Var3 == null) {
                        break;
                    } else {
                        vh3Var2 = vh3Var3;
                    }
                }
                vh3Var2.d = vh3Var;
            }
            tb1 tb1VarX2 = vr.X(this.f);
            if (lk2.d(tb1VarX2)) {
                h9 h9Var = rectManager.c;
                int iE = rectManager.e(tb1VarX2);
                long[] jArr = (long[]) h9Var.c;
                int i2 = iE + 2;
                jArr[i2] = (jArr[i2] & 8070450532247928831L) | (-8070450532247928832L);
            }
            rectManager.f = true;
            rectManager.k();
            this.t = vh3Var;
        }
    }

    @Override // defpackage.aq1
    public final void i1() {
        mk mkVar = this.u;
        if (mkVar.a == this) {
            mkVar.a = null;
        }
        vh3 vh3Var = this.t;
        if (vh3Var != null) {
            vh3Var.b();
        }
        this.t = null;
    }
}
