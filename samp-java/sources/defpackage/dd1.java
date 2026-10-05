package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class dd1 implements en1 {
    public final zc1 f;
    public final sa3 g;
    public final ad1 h;
    public final or1 i;

    public dd1(zc1 zc1Var, sa3 sa3Var) {
        this.f = zc1Var;
        this.g = sa3Var;
        this.h = (ad1) zc1Var.b.a();
        h41.a();
        this.i = new or1();
    }

    @Override // defpackage.ua0
    public final long C0(long j) {
        return this.g.C0(j);
    }

    @Override // defpackage.ua0
    public final float G() {
        return this.g.G();
    }

    @Override // defpackage.ua0
    public final float H0(long j) {
        return this.g.H0(j);
    }

    @Override // defpackage.en1
    public final dn1 I0(int i, int i2, Map map, ns0 ns0Var) {
        return this.g.I0(i, i2, map, ns0Var);
    }

    @Override // defpackage.k51
    public final boolean M() {
        return this.g.M();
    }

    @Override // defpackage.ua0
    public final long P0(float f) {
        return this.g.P0(f);
    }

    @Override // defpackage.ua0
    public final long Q(float f) {
        return this.g.Q(f);
    }

    @Override // defpackage.ua0
    public final long R(long j) {
        return this.g.R(j);
    }

    @Override // defpackage.ua0
    public final float T(float f) {
        return this.g.T(f);
    }

    @Override // defpackage.ua0
    public final float X0(int i) {
        return this.g.X0(i);
    }

    @Override // defpackage.ua0
    public final float a1(float f) {
        return this.g.a1(f);
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
    public final List c(int i) {
        or1 or1Var = this.i;
        List list = (List) or1Var.b(i);
        if (list != null) {
            return list;
        }
        ad1 ad1Var = this.h;
        Object objB = ad1Var.b(i);
        List listE0 = this.g.e0(this.f.a(i, objB, ad1Var.c(i)), objB);
        or1Var.i(i, listE0);
        return listE0;
    }

    @Override // defpackage.ua0
    public final int f0(long j) {
        return this.g.f0(j);
    }

    @Override // defpackage.k51
    public final bb1 getLayoutDirection() {
        return this.g.getLayoutDirection();
    }

    @Override // defpackage.ua0
    public final float h() {
        return this.g.h();
    }

    @Override // defpackage.ua0
    public final float j0(long j) {
        return this.g.j0(j);
    }

    @Override // defpackage.en1
    public final dn1 o0(int i, int i2, Map map, ns0 ns0Var, ns0 ns0Var2) {
        return this.g.o0(i, i2, map, ns0Var, ns0Var2);
    }

    @Override // defpackage.ua0
    public final int p0(float f) {
        return this.g.p0(f);
    }
}
