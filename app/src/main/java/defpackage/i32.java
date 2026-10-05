package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class i32 implements qs2 {
    public final os1 A;
    public final d42 B;
    public final d42 C;
    public final d42 D;
    public final d42 E;
    public boolean a;
    public y22 b;
    public final d42 c;
    public final a32 d;
    public int e;
    public int f;
    public long g;
    public long h;
    public float i;
    public float j;
    public final l90 k;
    public final boolean l;
    public final d42 m;
    public ua0 n;
    public int o;
    public final qr1 p;
    public final a42 q;
    public final a42 r;
    public final nd1 s;
    public final p22 t;
    public final po u;
    public final mk v;
    public final d42 w;
    public final ge1 x;
    public final kd1 y;
    public final os1 z;

    public i32(float f, int i) {
        double d = f;
        if (-0.5d > d || d > 0.5d) {
            p21.a("currentPageOffsetFraction " + f + " is not within the range -0.5 to 0.5");
        }
        this.c = b32.w(new gy1(0L));
        this.d = new a32(i, f, this);
        this.e = i;
        this.g = Long.MAX_VALUE;
        final int i2 = 0;
        this.k = new l90(new ns0(this) { // from class: e32
            public final /* synthetic */ i32 g;

            {
                this.g = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:40:0x00ab  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00b6  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
            /* JADX WARN: Type inference failed for: r0v4 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v7 */
            /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Float] */
            /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Long] */
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
            @Override // defpackage.ns0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object h(Object obj) {
                y22 y22Var;
                int i3 = i2;
                dm3 dm3Var = dm3.a;
                y22 y22Var2 = null;
                i32 i32Var = this.g;
                switch (i3) {
                    case 0:
                        ?? ValueOf = (Float) obj;
                        float fFloatValue = ValueOf.floatValue();
                        long jH = b32.h(i32Var);
                        float f2 = i32Var.i + fFloatValue;
                        long jN = vm1.N(f2);
                        i32Var.i = f2 - jN;
                        if (Math.abs(fFloatValue) >= 1.0E-4f) {
                            long j = jH + jN;
                            long jI = y02.i(j, i32Var.h, i32Var.g);
                            ?? r0 = j != jI;
                            long j2 = jI - jH;
                            float f3 = j2;
                            i32Var.j = f3;
                            if (Math.abs(j2) != 0) {
                                i32Var.D.setValue(Boolean.valueOf(f3 > 0.0f));
                                i32Var.E.setValue(Boolean.valueOf(f3 < 0.0f));
                            }
                            int i4 = (int) j2;
                            int i5 = -i4;
                            y22 y22VarH = ((y22) i32Var.m.getValue()).h(i5);
                            if (y22VarH == null || (y22Var = i32Var.b) == null) {
                                y22Var2 = y22VarH;
                                if (y22Var2 == null) {
                                    i32Var.h(y22Var2, i32Var.a, true);
                                    i32Var.z.setValue(dm3Var);
                                } else {
                                    a32 a32Var = i32Var.d;
                                    i32 i32Var2 = a32Var.a;
                                    z32 z32Var = a32Var.c;
                                    z32Var.h(z32Var.g() + (i32Var2.p() != 0 ? i4 / i32Var2.p() : 0.0f));
                                    tb1 tb1Var = (tb1) i32Var.w.getValue();
                                    if (tb1Var != null) {
                                        tb1Var.k();
                                    }
                                }
                                if (r0 != false) {
                                    ValueOf = Long.valueOf(j2);
                                }
                                fFloatValue = ValueOf.floatValue();
                            } else {
                                y22 y22VarH2 = y22Var.h(i5);
                                if (y22VarH2 != null) {
                                    i32Var.b = y22VarH2;
                                    y22Var2 = y22VarH;
                                }
                                if (y22Var2 == null) {
                                }
                                if (r0 != false) {
                                }
                                fFloatValue = ValueOf.floatValue();
                            }
                        }
                        return Float.valueOf(fFloatValue);
                    default:
                        ld1 ld1Var = (ld1) obj;
                        t63 t63VarL = jo3.l();
                        ns0 ns0VarE = t63VarL != null ? t63VarL.e() : null;
                        t63 t63VarS = jo3.s(t63VarL);
                        try {
                            ld1Var.a(i32Var.e);
                            return dm3Var;
                        } finally {
                            jo3.v(t63VarL, t63VarS, ns0VarE);
                        }
                }
            }
        });
        final int i3 = 1;
        this.l = true;
        this.m = new d42(k32.b, f5.f0);
        this.n = k32.a;
        this.p = new qr1();
        this.q = new a42(-1);
        this.r = new a42(i);
        m22 m22Var = m22.u;
        b32.k(new fd1(this, 2), m22Var);
        b32.k(new fd1(this, 3), m22Var);
        nd1 nd1Var = new nd1(new ns0(this) { // from class: e32
            public final /* synthetic */ i32 g;

            {
                this.g = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:40:0x00ab  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00b6  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
            /* JADX WARN: Type inference failed for: r0v4 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v7 */
            /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Float] */
            /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Long] */
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
            @Override // defpackage.ns0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object h(Object obj) {
                y22 y22Var;
                int i32 = i3;
                dm3 dm3Var = dm3.a;
                y22 y22Var2 = null;
                i32 i32Var = this.g;
                switch (i32) {
                    case 0:
                        ?? ValueOf = (Float) obj;
                        float fFloatValue = ValueOf.floatValue();
                        long jH = b32.h(i32Var);
                        float f2 = i32Var.i + fFloatValue;
                        long jN = vm1.N(f2);
                        i32Var.i = f2 - jN;
                        if (Math.abs(fFloatValue) >= 1.0E-4f) {
                            long j = jH + jN;
                            long jI = y02.i(j, i32Var.h, i32Var.g);
                            ?? r0 = j != jI;
                            long j2 = jI - jH;
                            float f3 = j2;
                            i32Var.j = f3;
                            if (Math.abs(j2) != 0) {
                                i32Var.D.setValue(Boolean.valueOf(f3 > 0.0f));
                                i32Var.E.setValue(Boolean.valueOf(f3 < 0.0f));
                            }
                            int i4 = (int) j2;
                            int i5 = -i4;
                            y22 y22VarH = ((y22) i32Var.m.getValue()).h(i5);
                            if (y22VarH == null || (y22Var = i32Var.b) == null) {
                                y22Var2 = y22VarH;
                                if (y22Var2 == null) {
                                    i32Var.h(y22Var2, i32Var.a, true);
                                    i32Var.z.setValue(dm3Var);
                                } else {
                                    a32 a32Var = i32Var.d;
                                    i32 i32Var2 = a32Var.a;
                                    z32 z32Var = a32Var.c;
                                    z32Var.h(z32Var.g() + (i32Var2.p() != 0 ? i4 / i32Var2.p() : 0.0f));
                                    tb1 tb1Var = (tb1) i32Var.w.getValue();
                                    if (tb1Var != null) {
                                        tb1Var.k();
                                    }
                                }
                                if (r0 != false) {
                                    ValueOf = Long.valueOf(j2);
                                }
                                fFloatValue = ValueOf.floatValue();
                            } else {
                                y22 y22VarH2 = y22Var.h(i5);
                                if (y22VarH2 != null) {
                                    i32Var.b = y22VarH2;
                                    y22Var2 = y22VarH;
                                }
                                if (y22Var2 == null) {
                                }
                                if (r0 != false) {
                                }
                                fFloatValue = ValueOf.floatValue();
                            }
                        }
                        return Float.valueOf(fFloatValue);
                    default:
                        ld1 ld1Var = (ld1) obj;
                        t63 t63VarL = jo3.l();
                        ns0 ns0VarE = t63VarL != null ? t63VarL.e() : null;
                        t63 t63VarS = jo3.s(t63VarL);
                        try {
                            ld1Var.a(i32Var.e);
                            return dm3Var;
                        } finally {
                            jo3.v(t63VarL, t63VarS, ns0VarE);
                        }
                }
            }
        });
        this.s = nd1Var;
        this.t = new p22(new k71(6, this), nd1Var, new fd1(this, 4));
        this.u = new po(1);
        this.v = new mk();
        this.w = b32.w(null);
        this.x = new ge1(this, 1);
        n30.b(0, 0, 0, 0, 15);
        this.y = new kd1();
        this.z = vp.y();
        this.A = vp.y();
        Boolean bool = Boolean.FALSE;
        this.B = b32.w(bool);
        this.C = b32.w(bool);
        this.D = b32.w(bool);
        this.E = b32.w(bool);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        if (r9.d(r7, r8, r0) == r5) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object s(i32 i32Var, ts1 ts1Var, rs0 rs0Var, q40 q40Var) {
        h32 h32Var;
        rs0 rs0Var2;
        if (q40Var instanceof h32) {
            h32Var = (h32) q40Var;
            int i = h32Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                h32Var.n = i - Integer.MIN_VALUE;
            } else {
                h32Var = new h32(i32Var, q40Var);
            }
        }
        Object obj = h32Var.l;
        int i2 = h32Var.n;
        Object obj2 = y50.f;
        if (i2 == 0) {
            y02.Q(obj);
            h32Var.i = i32Var;
            h32Var.j = ts1Var;
            h32Var.k = (mb3) rs0Var;
            h32Var.n = 1;
            rs0Var2 = rs0Var;
            if (i32Var.i(h32Var) != obj2) {
            }
            return obj2;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i32Var = h32Var.i;
            y02.Q(obj);
            i32Var.q.h(-1);
            return dm3.a;
        }
        rs0 rs0Var3 = (rs0) h32Var.k;
        ts1Var = h32Var.j;
        i32Var = h32Var.i;
        y02.Q(obj);
        rs0Var2 = rs0Var3;
        if (!i32Var.k.b()) {
            i32Var.r.h(i32Var.k());
        }
        l90 l90Var = i32Var.k;
        h32Var.i = i32Var;
        h32Var.j = null;
        h32Var.k = null;
        h32Var.n = 2;
    }

    @Override // defpackage.qs2
    public final boolean a() {
        return ((Boolean) this.C.getValue()).booleanValue();
    }

    @Override // defpackage.qs2
    public final boolean b() {
        return this.k.b();
    }

    @Override // defpackage.qs2
    public final boolean c() {
        return ((Boolean) this.B.getValue()).booleanValue();
    }

    @Override // defpackage.qs2
    public final Object d(ts1 ts1Var, rs0 rs0Var, q40 q40Var) {
        return s(this, ts1Var, rs0Var, q40Var);
    }

    @Override // defpackage.qs2
    public final float e(float f) {
        return this.k.e(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(int i, s83 s83Var, p40 p40Var) {
        f32 f32Var;
        int i2;
        float f;
        s83 s83Var2;
        if (p40Var instanceof f32) {
            f32Var = (f32) p40Var;
            int i3 = f32Var.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                f32Var.m = i3 - Integer.MIN_VALUE;
            } else {
                f32Var = new f32(this, p40Var);
            }
        }
        f32 f32Var2 = f32Var;
        Object obj = f32Var2.k;
        int i4 = f32Var2.m;
        dm3 dm3Var = dm3.a;
        Object obj2 = y50.f;
        if (i4 == 0) {
            y02.Q(obj);
            if ((i != k() || l() != 0.0f) && n() != 0) {
                f32Var2.j = s83Var;
                f32Var2.i = i;
                f32Var2.m = 1;
                if (i(f32Var2) != obj2) {
                    i2 = i;
                    f = 0.0f;
                    s83Var2 = s83Var;
                }
            }
        }
        if (i4 != 1) {
            if (i4 == 2) {
                y02.Q(obj);
                return dm3Var;
            }
            c.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i2 = f32Var2.i;
        s83 s83Var3 = f32Var2.j;
        y02.Q(obj);
        f = 0.0f;
        s83Var2 = s83Var3;
        rs0 g32Var = new g32(this, j(i2), p() * f, s83Var2, null);
        f32Var2.j = null;
        f32Var2.m = 2;
        return d(ts1.f, g32Var, f32Var2) == obj2 ? obj2 : dm3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x032c A[Catch: all -> 0x0338, TryCatch #0 {all -> 0x0338, blocks: (B:137:0x02da, B:140:0x02e3, B:143:0x02f0, B:145:0x02fc, B:153:0x0332, B:151:0x032c, B:148:0x0314), top: B:169:0x02da }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d7  */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r2v13, types: [int] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v30 */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(y22 y22Var, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        float f;
        int i;
        boolean z7;
        ?? r2;
        long jH;
        long j;
        List list = y22Var.a;
        int i2 = y22Var.l;
        fn1 fn1Var = y22Var.i;
        fn1 fn1Var2 = y22Var.j;
        float f2 = y22Var.k;
        this.s.e = list.size();
        this.o = y22Var.b + y22Var.c;
        if (!z && this.a) {
            this.b = y22Var;
            return;
        }
        boolean z8 = true;
        if (z) {
            this.a = true;
        }
        p22 p22Var = this.t;
        boolean z9 = this.l;
        a32 a32Var = this.d;
        if (!z2) {
            a32Var.getClass();
            a32Var.e = fn1Var2 != null ? fn1Var2.d : null;
            if (a32Var.d || !list.isEmpty()) {
                a32Var.d = true;
                int i3 = fn1Var2 != null ? fn1Var2.a : 0;
                a32Var.b.h(i3);
                a32Var.f.a(i3);
                a32Var.c.h(f2);
            }
            if (z9) {
                pi piVar = p22Var.o;
                or1 or1Var = p22Var.e;
                piVar.h = y22Var;
                piVar.i = p22Var.n;
                k71 k71Var = p22Var.a;
                int i4 = p22Var.g;
                float f3 = 0.0f;
                int i5 = -1;
                if (i4 != -1 && i4 != piVar.B()) {
                    p22Var.l = true;
                    if (piVar.t()) {
                        int i6 = p22Var.h;
                        if (i6 < 0) {
                            i6 = 0;
                        }
                        p22Var.h = i6;
                        int iB = piVar.x().a.isEmpty() ? -1 : piVar.B() - 1;
                        if (iB != -1) {
                            int i7 = p22Var.i;
                            if (i7 <= iB) {
                                iB = i7;
                            }
                            p22Var.i = iB;
                        }
                        if (p22Var.f <= 0.0f) {
                            p22Var.e(piVar.v(), p22Var.m - 1);
                        } else {
                            p22Var.e(0, piVar.r());
                        }
                    }
                }
                p22Var.m = piVar.B();
                if (piVar.t()) {
                    int size = piVar.x().r.size() + piVar.x().a.size() + piVar.x().q.size();
                    int i8 = 0;
                    while (i8 < size) {
                        int size2 = piVar.x().q.size();
                        int size3 = piVar.x().a.size();
                        if (i8 < size2) {
                            i = ((fn1) piVar.x().q.get(i8)).a;
                            f = f3;
                        } else {
                            f = f3;
                            i = (i8 < size2 || i8 >= size2 + size3) ? i8 >= size2 + size3 ? ((fn1) piVar.x().r.get((i8 - size2) - size3)).a : i5 : ((fn1) piVar.x().a.get(i8 - size2)).a;
                        }
                        int size4 = piVar.x().q.size();
                        int size5 = piVar.x().a.size();
                        Object obj = i8 < size4 ? ((fn1) piVar.x().q.get(i8)).d : (i8 < size4 || i8 >= size4 + size5) ? i8 >= size4 + size5 ? ((fn1) piVar.x().r.get((i8 - size4) - size5)).d : sq.c : ((fn1) piVar.x().a.get(i8 - size4)).d;
                        int i9 = piVar.x().b;
                        if (i == i5) {
                            z7 = true;
                        } else if (or1Var.a(i)) {
                            Object objB = or1Var.b(i);
                            objB.getClass();
                            int i10 = ((sq) objB).b;
                            Object objB2 = or1Var.b(i);
                            objB2.getClass();
                            Object obj2 = ((sq) objB2).a;
                            if (i10 == i9 && s51.n(obj2, obj)) {
                                z7 = true;
                            } else {
                                z7 = true;
                                p22Var.l = true;
                            }
                            sq sqVar = (sq) or1Var.b(i);
                            if (sqVar != null) {
                                sqVar.b = i9;
                                sqVar.a = obj;
                            } else {
                                sqVar = new sq();
                                sqVar.a = obj;
                                sqVar.b = i9;
                            }
                            or1Var.i(i, sqVar);
                            p22Var.h = Math.min(p22Var.h, i);
                            p22Var.i = Math.max(p22Var.i, i);
                            List list2 = (List) p22Var.b.g(i);
                            if (list2 != null) {
                                int size6 = list2.size();
                                for (int i11 = 0; i11 < size6; i11++) {
                                    ((md1) list2.get(i11)).cancel();
                                }
                            }
                        }
                        i8++;
                        f3 = f;
                        z8 = z7;
                        i5 = -1;
                    }
                    boolean z10 = z8;
                    float f4 = f3;
                    if (p22Var.l) {
                        boolean z11 = p22Var.f <= f4 ? z10 : false;
                        if (piVar.t()) {
                            t22.z(piVar.x());
                            z4 = z10;
                            z3 = z9;
                            z6 = false;
                            p22Var.c(piVar, piVar.r(), piVar.v(), piVar.x().t != null ? ((i32) k71Var.g).o : 0, piVar.y(), piVar.z(), 0.0f, z11);
                        } else {
                            z3 = z9;
                            z4 = z10;
                            z6 = false;
                        }
                        p22Var.l = z6;
                        z5 = z6;
                    } else {
                        z3 = z9;
                        z4 = z10;
                        z5 = false;
                    }
                } else {
                    z3 = z9;
                    z4 = true;
                    z5 = false;
                    p22Var.f();
                }
                p22Var.g = piVar.B();
                r2 = z5;
            }
            this.m.setValue(y22Var);
            this.B.setValue(Boolean.valueOf(y22Var.m));
            this.C.setValue(Boolean.valueOf((boolean) (((fn1Var == null ? fn1Var.a : r2) == 0 || i2 != 0) ? z4 : r2)));
            if (fn1Var != null) {
                this.e = fn1Var.a;
            }
            this.f = i2;
            t63 t63VarL = jo3.l();
            ns0 ns0VarE = t63VarL != null ? t63VarL.e() : null;
            t63 t63VarS = jo3.s(t63VarL);
            if (z3) {
                try {
                    if (y22Var.h < n() && Math.abs(this.j) > 0.5f) {
                        float f5 = this.j;
                        if (m().e == t02.f) {
                            if (Math.signum(f5) != Math.signum(-Float.intBitsToFloat((int) (q() & 4294967295L)))) {
                                if (r()) {
                                }
                            }
                            p22Var.d(this.j, y22Var);
                        } else {
                            if (Math.signum(f5) == Math.signum(-Float.intBitsToFloat((int) (q() >> 32)))) {
                            }
                            p22Var.d(this.j, y22Var);
                        }
                    }
                } finally {
                    jo3.v(t63VarL, t63VarS, ns0VarE);
                }
            }
            this.g = k32.a(y22Var, n());
            n();
            int i12 = (int) (y22Var.e != t02.g ? y22Var.i() >> 32 : y22Var.i() & 4294967295L);
            y22Var.n.getClass();
            jH = y02.h(r2, r2, i12);
            j = this.g;
            if (jH > j) {
                jH = j;
            }
            this.h = jH;
        }
        a32Var.c.h(f2);
        z4 = true;
        z3 = z9;
        r2 = 0;
        this.m.setValue(y22Var);
        this.B.setValue(Boolean.valueOf(y22Var.m));
        this.C.setValue(Boolean.valueOf((boolean) (((fn1Var == null ? fn1Var.a : r2) == 0 || i2 != 0) ? z4 : r2)));
        if (fn1Var != null) {
        }
        this.f = i2;
        t63 t63VarL2 = jo3.l();
        ns0 ns0VarE2 = t63VarL2 != null ? t63VarL2.e() : null;
        t63 t63VarS2 = jo3.s(t63VarL2);
        if (z3) {
        }
        this.g = k32.a(y22Var, n());
        n();
        int i122 = (int) (y22Var.e != t02.g ? y22Var.i() >> 32 : y22Var.i() & 4294967295L);
        y22Var.n.getClass();
        jH = y02.h(r2, r2, i122);
        j = this.g;
        if (jH > j) {
        }
        this.h = jH;
    }

    public final Object i(q40 q40Var) {
        Object objH;
        return (this.m.getValue() == k32.b && (objH = this.v.h(q40Var)) == y50.f) ? objH : dm3.a;
    }

    public final int j(int i) {
        if (n() > 0) {
            return y02.h(i, 0, n() - 1);
        }
        return 0;
    }

    public final int k() {
        return this.d.b.g();
    }

    public final float l() {
        return this.d.c.g();
    }

    public final y22 m() {
        return (y22) this.m.getValue();
    }

    public abstract int n();

    public final int o() {
        return ((y22) this.m.getValue()).b;
    }

    public final int p() {
        return ((y22) this.m.getValue()).c + o();
    }

    public final long q() {
        return ((gy1) this.c.getValue()).a;
    }

    public final boolean r() {
        return ((int) Float.intBitsToFloat((int) (q() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (q() & 4294967295L))) == 0;
    }

    public final void t(int i, float f, boolean z) {
        a32 a32Var = this.d;
        a42 a42Var = a32Var.b;
        z32 z32Var = a32Var.c;
        if (a42Var.g() != i || z32Var.g() != f) {
            this.t.f();
        }
        a32Var.b.h(i);
        a32Var.f.a(i);
        z32Var.h(f);
        a32Var.e = null;
        if (!z) {
            this.A.setValue(dm3.a);
            return;
        }
        tb1 tb1Var = (tb1) this.w.getValue();
        if (tb1Var != null) {
            tb1Var.k();
        }
    }
}
