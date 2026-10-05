package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
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
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object h(java.lang.Object r15) {
                /*
                    Method dump skipped, instruction units count: 246
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.e32.h(java.lang.Object):java.lang.Object");
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
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object h(java.lang.Object r15) {
                /*
                    Method dump skipped, instruction units count: 246
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.e32.h(java.lang.Object):java.lang.Object");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object s(defpackage.i32 r6, defpackage.ts1 r7, defpackage.rs0 r8, defpackage.q40 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.h32
            if (r0 == 0) goto L13
            r0 = r9
            h32 r0 = (defpackage.h32) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.n = r1
            goto L18
        L13:
            h32 r0 = new h32
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.l
            int r1 = r0.n
            r2 = 0
            r3 = 2
            r4 = 1
            y50 r5 = defpackage.y50.f
            if (r1 == 0) goto L40
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2d
            i32 r6 = r0.i
            defpackage.y02.Q(r9)
            goto L77
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r6)
            return r2
        L33:
            mb3 r6 = r0.k
            r8 = r6
            rs0 r8 = (defpackage.rs0) r8
            ts1 r7 = r0.j
            i32 r6 = r0.i
            defpackage.y02.Q(r9)
            goto L55
        L40:
            defpackage.y02.Q(r9)
            r0.i = r6
            r0.j = r7
            r9 = r8
            mb3 r9 = (defpackage.mb3) r9
            r0.k = r9
            r0.n = r4
            java.lang.Object r9 = r6.i(r0)
            if (r9 != r5) goto L55
            goto L76
        L55:
            l90 r9 = r6.k
            boolean r9 = r9.b()
            if (r9 != 0) goto L66
            int r9 = r6.k()
            a42 r1 = r6.r
            r1.h(r9)
        L66:
            l90 r9 = r6.k
            r0.i = r6
            r0.j = r2
            r0.k = r2
            r0.n = r3
            java.lang.Object r7 = r9.d(r7, r8, r0)
            if (r7 != r5) goto L77
        L76:
            return r5
        L77:
            r7 = -1
            a42 r6 = r6.q
            r6.h(r7)
            dm3 r6 = defpackage.dm3.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i32.s(i32, ts1, rs0, q40):java.lang.Object");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(int r12, defpackage.s83 r13, defpackage.p40 r14) {
        /*
            r11 = this;
            boolean r3 = r14 instanceof defpackage.f32
            if (r3 == 0) goto L14
            r3 = r14
            f32 r3 = (defpackage.f32) r3
            int r4 = r3.m
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L14
            int r4 = r4 - r5
            r3.m = r4
        L12:
            r6 = r3
            goto L1a
        L14:
            f32 r3 = new f32
            r3.<init>(r11, r14)
            goto L12
        L1a:
            java.lang.Object r2 = r6.k
            int r3 = r6.m
            r7 = 0
            r4 = 0
            dm3 r8 = defpackage.dm3.a
            r9 = 2
            r5 = 1
            y50 r10 = defpackage.y50.f
            if (r3 == 0) goto L40
            if (r3 == r5) goto L36
            if (r3 != r9) goto L30
            defpackage.y02.Q(r2)
            return r8
        L30:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r0)
            return r7
        L36:
            int r0 = r6.i
            s83 r3 = r6.j
            defpackage.y02.Q(r2)
            r2 = r4
            r4 = r3
            goto L69
        L40:
            defpackage.y02.Q(r2)
            int r2 = r11.k()
            if (r12 != r2) goto L52
            float r2 = r11.l()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L52
            goto L88
        L52:
            int r2 = r11.n()
            if (r2 != 0) goto L59
            goto L88
        L59:
            r6.j = r13
            r6.i = r12
            r6.m = r5
            java.lang.Object r3 = r11.i(r6)
            if (r3 != r10) goto L66
            goto L87
        L66:
            r0 = r12
            r2 = r4
            r4 = r13
        L69:
            int r0 = r11.j(r0)
            int r3 = r11.p()
            float r3 = (float) r3
            float r3 = r3 * r2
            r2 = r0
            g32 r0 = new g32
            r5 = 0
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r6.j = r7
            r6.m = r9
            ts1 r2 = defpackage.ts1.f
            java.lang.Object r0 = r11.d(r2, r0, r6)
            if (r0 != r10) goto L88
        L87:
            return r10
        L88:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i32.f(int, s83, p40):java.lang.Object");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(defpackage.y22 r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instruction units count: 882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i32.h(y22, boolean, boolean):void");
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
