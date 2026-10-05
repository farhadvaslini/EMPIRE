package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class iy0 {
    public final ab1 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final as1 f = new as1();
    public final jx1 g = new jx1();
    public final sr1 h = new sr1(10);

    public iy0(ab1 ab1Var) {
        this.a = ab1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r19, java.util.List r21, boolean r22) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iy0.a(long, java.util.List, boolean):void");
    }

    public final boolean b(g51 g51Var, boolean z) {
        xk1 xk1Var = (xk1) g51Var.c;
        ab1 ab1Var = this.a;
        jx1 jx1Var = this.g;
        boolean zA = jx1Var.a(xk1Var, ab1Var, g51Var, z);
        qs1 qs1Var = jx1Var.a;
        if (!zA) {
            return false;
        }
        boolean z2 = true;
        this.b = true;
        Object[] objArr = qs1Var.f;
        int i = qs1Var.h;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z3 = ((xw1) objArr[i2]).e(g51Var, z) || z3;
        }
        Object[] objArr2 = qs1Var.f;
        int i3 = qs1Var.h;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            z4 = ((xw1) objArr2[i4]).d(g51Var) || z4;
        }
        jx1Var.b(g51Var);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.b = false;
        if (this.e) {
            this.e = false;
            as1 as1Var = this.f;
            int i5 = as1Var.b;
            for (int i6 = 0; i6 < i5; i6++) {
                d((aq1) as1Var.g(i6));
            }
            as1Var.e();
        }
        if (this.c) {
            this.c = false;
            c();
        }
        if (this.d) {
            this.d = false;
            jx1Var.a.g();
        }
        return z2;
    }

    public final void c() {
        if (this.b) {
            this.c = true;
            return;
        }
        jx1 jx1Var = this.g;
        qs1 qs1Var = jx1Var.a;
        Object[] objArr = qs1Var.f;
        int i = qs1Var.h;
        for (int i2 = 0; i2 < i; i2++) {
            ((xw1) objArr[i2]).c();
        }
        if (this.d) {
            this.d = true;
        } else {
            jx1Var.a.g();
        }
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
    public final void d(aq1 aq1Var) {
        if (this.b) {
            this.e = true;
            this.f.b(aq1Var);
            return;
        }
        jx1 jx1Var = this.g;
        as1 as1Var = jx1Var.b;
        as1Var.e();
        as1Var.b(jx1Var);
        while (as1Var.j()) {
            jx1 jx1Var2 = (jx1) as1Var.l(as1Var.b - 1);
            int i = 0;
            while (true) {
                qs1 qs1Var = jx1Var2.a;
                if (i < qs1Var.h) {
                    xw1 xw1Var = (xw1) qs1Var.f[i];
                    if (s51.n(xw1Var.c, aq1Var)) {
                        jx1Var2.a.j(xw1Var);
                        xw1Var.c();
                    } else {
                        as1Var.b(xw1Var);
                        i++;
                    }
                }
            }
        }
    }
}
