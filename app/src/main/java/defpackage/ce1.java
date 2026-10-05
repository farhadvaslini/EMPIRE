package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ce1 {
    public final or1 a;
    public final be1 b;
    public final dd1 c;
    public final long d;
    public final /* synthetic */ dd1 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ g5 h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ long k;
    public final /* synthetic */ ie1 l;

    public ce1(long j, be1 be1Var, dd1 dd1Var, int i, int i2, g5 g5Var, int i3, int i4, long j2, ie1 ie1Var) {
        this.e = dd1Var;
        this.f = i;
        this.g = i2;
        this.h = g5Var;
        this.i = i3;
        this.j = i4;
        this.k = j2;
        this.l = ie1Var;
        or1 or1Var = h41.a;
        this.a = new or1();
        this.b = be1Var;
        this.c = dd1Var;
        this.d = n30.b(0, m30.i(j), 0, Integer.MAX_VALUE, 5);
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
    public final fe1 a(int i, long j) {
        long j2;
        List list;
        be1 be1Var = this.b;
        Object objB = be1Var.b(i);
        Object objC = be1Var.c(i);
        or1 or1Var = this.a;
        List list2 = (List) or1Var.b(i);
        if (list2 != null) {
            j2 = j;
            list = list2;
        } else {
            List listC = this.c.c(i);
            int size = listC.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((xm1) listC.get(i2)).t(j));
            }
            j2 = j;
            or1Var.i(i, arrayList);
            list = arrayList;
        }
        return new fe1(i, list, this.h, this.e.g.getLayoutDirection(), this.i, this.j, i != this.f + (-1) ? this.g : 0, this.k, objB, objC, this.l.n, j2);
    }
}
