package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class gj1 extends ej1 {
    public final lr0 a;

    public gj1(lr0 lr0Var, br3 br3Var) {
        this.a = lr0Var;
        br3Var.getClass();
        d60 d60Var = d60.b;
        d60Var.getClass();
        pl plVar = new pl(br3Var, fj1.c, d60Var);
        lu luVarA = rk2.a(fj1.class);
        String strB = luVarA.b();
        if (strB != null) {
        } else {
            c.p("Local and anonymous classes can not be ViewModels");
            throw null;
        }
    }

    public final String toString() {
        int iLastIndexOf;
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        lr0 lr0Var = this.a;
        String simpleName = lr0Var.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = lr0Var.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(iLastIndexOf + 1);
        }
        sb.append(simpleName);
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(lr0Var)));
        sb.append("}}");
        return sb.toString();
    }
}
