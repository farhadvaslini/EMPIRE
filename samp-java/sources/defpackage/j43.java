package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class j43 {
    public static final gm0 a;
    public static final gm0 b;
    public static final gm0 c;
    public static final pu3 d;
    public static final pu3 e;
    public static final pu3 f;
    public static final pu3 g;
    public static final pu3 h;
    public static final pu3 i;

    static {
        tb0 tb0Var = tb0.g;
        a = new gm0(tb0Var, 1.0f);
        tb0 tb0Var2 = tb0.f;
        b = new gm0(tb0Var2, 1.0f);
        tb0 tb0Var3 = tb0.h;
        c = new gm0(tb0Var3, 1.0f);
        tm tmVar = f5.t;
        int i2 = 15;
        d = new pu3(tb0Var, new pt2(i2, tmVar), tmVar);
        tm tmVar2 = f5.s;
        e = new pu3(tb0Var, new pt2(i2, tmVar2), tmVar2);
        um umVar = f5.q;
        int i3 = 16;
        f = new pu3(tb0Var2, new pt2(i3, umVar), umVar);
        um umVar2 = f5.p;
        g = new pu3(tb0Var2, new pt2(i3, umVar2), umVar2);
        vm vmVar = f5.k;
        int i4 = 17;
        h = new pu3(tb0Var3, new pt2(i4, vmVar), vmVar);
        vm vmVar2 = f5.g;
        i = new pu3(tb0Var3, new pt2(i4, vmVar2), vmVar2);
    }

    public static final bq1 a(bq1 bq1Var, float f2, float f3) {
        return bq1Var.d(new rm3(f2, f3));
    }

    public static /* synthetic */ bq1 b(bq1 bq1Var, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        return a(bq1Var, f2, f3);
    }

    public static final bq1 c(bq1 bq1Var, float f2) {
        return bq1Var.d(f2 == 1.0f ? a : new gm0(tb0.g, f2));
    }

    public static final bq1 e(bq1 bq1Var, float f2) {
        return bq1Var.d(new i43(0.0f, f2, 0.0f, f2, true, 5));
    }

    public static final bq1 f(bq1 bq1Var, float f2, float f3) {
        return bq1Var.d(new i43(0.0f, f2, 0.0f, f3, true, 5));
    }

    public static /* synthetic */ bq1 g(bq1 bq1Var, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        return f(bq1Var, f2, f3);
    }

    public static final bq1 h(bq1 bq1Var, float f2) {
        return bq1Var.d(new i43(0.0f, f2, 0.0f, f2, false, 5));
    }

    public static final bq1 i(bq1 bq1Var, float f2) {
        return bq1Var.d(new i43(f2, f2, f2, f2, false));
    }

    public static bq1 j(bq1 bq1Var, float f2, float f3, float f4, float f5, int i2) {
        return bq1Var.d(new i43(f2, (i2 & 2) != 0 ? Float.NaN : f3, (i2 & 4) != 0 ? Float.NaN : f4, (i2 & 8) != 0 ? Float.NaN : f5, false));
    }

    public static final bq1 k(bq1 bq1Var, float f2) {
        return bq1Var.d(new i43(f2, f2, f2, f2, true));
    }

    public static final bq1 l(bq1 bq1Var, float f2, float f3) {
        return bq1Var.d(new i43(f2, f3, f2, f3, true));
    }

    public static final bq1 m(bq1 bq1Var, float f2, float f3, float f4, float f5) {
        return bq1Var.d(new i43(f2, f3, f4, f5, true));
    }

    public static /* synthetic */ bq1 n(bq1 bq1Var, float f2, float f3, float f4, int i2) {
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        return m(bq1Var, f2, f3, f4, Float.NaN);
    }

    public static final bq1 o(bq1 bq1Var, float f2) {
        return bq1Var.d(new i43(f2, 0.0f, f2, 0.0f, true, 10));
    }

    public static final bq1 p(bq1 bq1Var, float f2, float f3) {
        return bq1Var.d(new i43(f2, 0.0f, f3, 0.0f, true, 10));
    }

    public static /* synthetic */ bq1 q(bq1 bq1Var, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        return p(bq1Var, f2, f3);
    }

    public static bq1 r(bq1 bq1Var) {
        pu3 pu3Var;
        um umVar = f5.q;
        if (s51.n(umVar, umVar)) {
            pu3Var = f;
        } else if (s51.n(umVar, f5.p)) {
            pu3Var = g;
        } else {
            pu3Var = new pu3(tb0.f, new pt2(16, umVar), umVar);
        }
        return bq1Var.d(pu3Var);
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
    public static bq1 s(bq1 bq1Var) {
        pu3 pu3Var;
        vm vmVar = f5.k;
        if (vmVar.equals(vmVar)) {
            pu3Var = h;
        } else if (vmVar.equals(f5.g)) {
            pu3Var = i;
        } else {
            pu3Var = new pu3(tb0.h, new pt2(17, vmVar), vmVar);
        }
        return bq1Var.d(pu3Var);
    }

    public static bq1 t(bq1 bq1Var) {
        pu3 pu3Var;
        tm tmVar = f5.t;
        if (s51.n(tmVar, tmVar)) {
            pu3Var = d;
        } else if (s51.n(tmVar, f5.s)) {
            pu3Var = e;
        } else {
            pu3Var = new pu3(tb0.g, new pt2(15, tmVar), tmVar);
        }
        return bq1Var.d(pu3Var);
    }
}
