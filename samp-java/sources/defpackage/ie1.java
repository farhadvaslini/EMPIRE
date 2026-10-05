package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ie1 implements qs2 {
    public static final ar2 x = gq.K(new z00(22, 0), new n20(21));
    public final z80 a;
    public boolean b;
    public ee1 c;
    public boolean d;
    public final ot e;
    public final d42 f;
    public final qr1 g;
    public float h;
    public final l90 i;
    public final boolean j;
    public tb1 k;
    public final ge1 l;
    public final mk m;
    public final wc1 n;
    public final po o;
    public final nd1 p;
    public final k71 q;
    public final kd1 r;
    public final os1 s;
    public final d42 t;
    public final d42 u;
    public final os1 v;
    public final a31 w;

    public ie1(int i, int i2) {
        z80 z80Var = new z80();
        z80Var.a = -1;
        z80Var.d = -1;
        this.a = z80Var;
        ot otVar = new ot();
        otVar.b = new a42(i);
        otVar.c = new a42(i2);
        otVar.e = new ed1(i);
        this.e = otVar;
        this.f = new d42(ke1.a, f5.f0);
        this.g = new qr1();
        this.i = new l90(new xc1(3, this));
        this.j = true;
        this.l = new ge1(this, 0);
        this.m = new mk();
        this.n = new wc1(0);
        this.o = new po(1);
        this.p = new nd1(new w6(this, i));
        this.q = new k71(1, this);
        this.r = new kd1();
        this.s = vp.y();
        Boolean bool = Boolean.FALSE;
        this.t = b32.w(bool);
        this.u = b32.w(bool);
        this.v = vp.y();
        a31 a31Var = new a31(18, false);
        bl3 bl3Var = rn.f1;
        Float fValueOf = Float.valueOf(0.0f);
        a31Var.h = new pe(bl3Var, fValueOf, (ue) bl3Var.a.h(fValueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
        this.w = a31Var;
    }

    @Override // defpackage.qs2
    public final boolean a() {
        return ((Boolean) this.u.getValue()).booleanValue();
    }

    @Override // defpackage.qs2
    public final boolean b() {
        return this.i.b();
    }

    @Override // defpackage.qs2
    public final boolean c() {
        return ((Boolean) this.t.getValue()).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        if (r6.i.d(r7, r8, r0) == r5) goto L23;
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
    @Override // defpackage.qs2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ts1 r7, defpackage.rs0 r8, defpackage.q40 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.he1
            if (r0 == 0) goto L13
            r0 = r9
            he1 r0 = (defpackage.he1) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            he1 r0 = new he1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.k
            int r1 = r0.m
            r2 = 0
            r3 = 2
            r4 = 1
            y50 r5 = defpackage.y50.f
            if (r1 == 0) goto L3c
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.y02.Q(r9)
            goto L6a
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r6)
            return r2
        L31:
            mb3 r7 = r0.j
            r8 = r7
            rs0 r8 = (defpackage.rs0) r8
            ts1 r7 = r0.i
            defpackage.y02.Q(r9)
            goto L5b
        L3c:
            defpackage.y02.Q(r9)
            d42 r9 = r6.f
            java.lang.Object r9 = r9.getValue()
            ee1 r1 = defpackage.ke1.a
            if (r9 != r1) goto L5b
            r0.i = r7
            r9 = r8
            mb3 r9 = (defpackage.mb3) r9
            r0.j = r9
            r0.m = r4
            mk r9 = r6.m
            java.lang.Object r9 = r9.h(r0)
            if (r9 != r5) goto L5b
            goto L69
        L5b:
            r0.i = r2
            r0.j = r2
            r0.m = r3
            l90 r6 = r6.i
            java.lang.Object r6 = r6.d(r7, r8, r0)
            if (r6 != r5) goto L6a
        L69:
            return r5
        L6a:
            dm3 r6 = defpackage.dm3.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ie1.d(ts1, rs0, q40):java.lang.Object");
    }

    @Override // defpackage.qs2
    public final float e(float f) {
        return this.i.e(f);
    }

    public final void f(ee1 ee1Var, boolean z, boolean z2) {
        a31 a31Var;
        long j;
        t63 t63VarL;
        ns0 ns0VarE;
        t63 t63VarS;
        bl3 bl3Var = rn.f1;
        List list = ee1Var.l;
        int i = ee1Var.o;
        int i2 = ee1Var.b;
        fe1 fe1Var = ee1Var.a;
        this.p.e = list.size();
        a31 a31Var2 = this.w;
        ot otVar = this.e;
        p40 p40Var = null;
        if (!z && this.b) {
            this.c = ee1Var;
            t63VarL = jo3.l();
            ns0VarE = t63VarL != null ? t63VarL.e() : null;
            t63VarS = jo3.s(t63VarL);
            try {
                if (((Number) ((pe) a31Var2.h).g.getValue()).floatValue() != 0.0f && fe1Var != null && fe1Var.a == ((a42) otVar.b).g() && i2 == ((a42) otVar.c).g()) {
                    w83 w83Var = (w83) a31Var2.g;
                    if (w83Var != null) {
                        w83Var.c(null);
                    }
                    a31Var2.h = new pe(bl3Var, Float.valueOf(0.0f), null, 60);
                }
                return;
            } finally {
                jo3.v(t63VarL, t63VarS, ns0VarE);
            }
        }
        if (z) {
            this.b = true;
        }
        this.u.setValue(Boolean.valueOf(((fe1Var != null ? fe1Var.a : 0) == 0 && i2 == 0) ? false : true));
        this.t.setValue(Boolean.valueOf(ee1Var.c));
        this.h -= ee1Var.d;
        this.f.setValue(ee1Var);
        if (z2) {
            otVar.getClass();
            if (i2 < 0.0f) {
                p21.c("scrollOffset should be non-negative");
            }
            ((a42) otVar.c).h(i2);
            a31Var = a31Var2;
        } else {
            fe1 fe1Var2 = (fe1) qx.r0(list);
            fe1 fe1Var3 = (fe1) qx.z0(list);
            if (fe1Var2 != null) {
                a31Var = a31Var2;
                j = fe1Var2.a;
            } else {
                a31Var = a31Var2;
                j = -1;
            }
            s51.J(j, "firstVisibleItem:index");
            s51.J(fe1Var3 != null ? fe1Var3.a : -1L, "lastVisibleItem:index");
            otVar.getClass();
            otVar.d = fe1Var != null ? fe1Var.g : null;
            if (otVar.a || i > 0) {
                otVar.a = true;
                if (i2 < 0.0f) {
                    p21.c("scrollOffset should be non-negative");
                }
                otVar.d(fe1Var != null ? fe1Var.a : 0, i2);
            }
            if (this.j) {
                z80 z80Var = this.a;
                int i3 = z80Var.a;
                boolean z3 = z80Var.c;
                if (i3 != -1 && !list.isEmpty() && i3 != z80.a(ee1Var, z3)) {
                    z80Var.a = -1;
                    md1 md1Var = z80Var.b;
                    if (md1Var != null) {
                        md1Var.cancel();
                    }
                    z80Var.b = null;
                }
                int i4 = z80Var.d;
                if (i4 != -1 && z80Var.e != 0.0f && i4 != i && !list.isEmpty()) {
                    int iA = z80.a(ee1Var, z80Var.e < 0.0f);
                    if (iA >= 0 && iA < i) {
                        z80Var.a = iA;
                        z80Var.b = k71.n(this.q, iA);
                    }
                }
                z80Var.d = i;
            }
        }
        if (z) {
            float f = ee1Var.f;
            ua0 ua0Var = ee1Var.i;
            x50 x50Var = ee1Var.h;
            a31Var.getClass();
            if (f <= ua0Var.T(1.0f)) {
                return;
            }
            t63VarL = jo3.l();
            ns0VarE = t63VarL != null ? t63VarL.e() : null;
            t63VarS = jo3.s(t63VarL);
            a31 a31Var3 = a31Var;
            try {
                float fFloatValue = ((Number) ((pe) a31Var3.h).g.getValue()).floatValue();
                w83 w83Var2 = (w83) a31Var3.g;
                if (w83Var2 != null) {
                    w83Var2.c(null);
                }
                pe peVar = (pe) a31Var3.h;
                if (peVar.k) {
                    a31Var3.h = cl3.k(peVar, fFloatValue - f, 0.0f, 30);
                } else {
                    a31Var3.h = new pe(bl3Var, Float.valueOf(-f), null, 60);
                }
                a31Var3.g = cl3.t(x50Var, null, new l80(a31Var3, p40Var, 4), 3);
            } finally {
            }
        }
    }

    public final int g() {
        return ((a42) this.e.b).g();
    }

    public final int h() {
        return ((a42) this.e.c).g();
    }

    public final ee1 i() {
        return (ee1) this.f.getValue();
    }

    public final void j(float f, ee1 ee1Var) {
        md1 md1Var;
        md1 md1Var2;
        if (this.j) {
            boolean zIsEmpty = ee1Var.l.isEmpty();
            z80 z80Var = this.a;
            if (!zIsEmpty) {
                boolean z = f < 0.0f;
                int iA = z80.a(ee1Var, z);
                if (iA >= 0 && iA < ee1Var.o) {
                    if (iA != z80Var.a) {
                        if (z80Var.c != z) {
                            z80Var.a = -1;
                            md1 md1Var3 = z80Var.b;
                            if (md1Var3 != null) {
                                md1Var3.cancel();
                            }
                            z80Var.b = null;
                        }
                        z80Var.c = z;
                        z80Var.a = iA;
                        z80Var.b = k71.n(this.q, iA);
                    }
                    List list = ee1Var.l;
                    if (z) {
                        fe1 fe1Var = (fe1) qx.y0(list);
                        if (((fe1Var.j + fe1Var.k) + ee1Var.r) - ee1Var.n < (-f) && (md1Var2 = z80Var.b) != null) {
                            md1Var2.a();
                        }
                    } else if (ee1Var.m - ((fe1) qx.q0(list)).j < f && (md1Var = z80Var.b) != null) {
                        md1Var.a();
                    }
                }
            }
            z80Var.e = f;
        }
    }
}
