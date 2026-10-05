package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
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
    */
    public final void a(long j, List list, boolean z) {
        sr1 sr1Var;
        long[] jArr;
        long[] jArr2;
        int i;
        xw1 xw1Var;
        Object obj;
        int size = list.size();
        jx1 jx1Var = this.g;
        jx1 jx1Var2 = jx1Var;
        boolean z2 = true;
        int i2 = 0;
        while (true) {
            sr1Var = this.h;
            if (i2 >= size) {
                break;
            }
            aq1 aq1Var = (aq1) list.get(i2);
            if (aq1Var.s) {
                aq1Var.r = new u1(20, this, aq1Var);
                if (z2) {
                    qs1 qs1Var = jx1Var2.a;
                    Object[] objArr = qs1Var.f;
                    int i3 = qs1Var.h;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i3) {
                            obj = null;
                            break;
                        }
                        obj = objArr[i4];
                        if (s51.n(((xw1) obj).c, aq1Var)) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    xw1Var = (xw1) obj;
                    if (xw1Var != null) {
                        xw1Var.i = true;
                        xw1Var.d.a(j);
                        if (z) {
                            Object objD = sr1Var.d(j);
                            if (objD == null) {
                                objD = new as1();
                                sr1Var.g(j, objD);
                            }
                            ((as1) objD).b(xw1Var);
                        }
                        jx1Var2 = xw1Var;
                    } else {
                        z2 = false;
                        xw1Var = new xw1(aq1Var);
                        xw1Var.d.a(j);
                        if (z) {
                            Object objD2 = sr1Var.d(j);
                            if (objD2 == null) {
                                objD2 = new as1();
                                sr1Var.g(j, objD2);
                            }
                            ((as1) objD2).b(xw1Var);
                        }
                        jx1Var2.a.b(xw1Var);
                        jx1Var2 = xw1Var;
                    }
                } else {
                    xw1Var = new xw1(aq1Var);
                    xw1Var.d.a(j);
                    if (z) {
                    }
                    jx1Var2.a.b(xw1Var);
                    jx1Var2 = xw1Var;
                }
            }
            i2++;
        }
        if (z) {
            long[] jArr3 = sr1Var.b;
            Object[] objArr2 = sr1Var.c;
            long[] jArr4 = sr1Var.a;
            int length = jArr4.length - 2;
            if (length >= 0) {
                int i5 = 0;
                while (true) {
                    long j2 = jArr4[i5];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8;
                        int i7 = 8 - ((~(i5 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((255 & j2) < 128) {
                                int i9 = (i5 << 3) + i8;
                                long j3 = jArr3[i9];
                                as1 as1Var = (as1) objArr2[i9];
                                qs1 qs1Var2 = jx1Var.a;
                                i = i6;
                                Object[] objArr3 = qs1Var2.f;
                                int i10 = qs1Var2.h;
                                jArr2 = jArr3;
                                for (int i11 = 0; i11 < i10; i11++) {
                                    ((xw1) objArr3[i11]).f(j3, as1Var);
                                }
                            } else {
                                jArr2 = jArr3;
                                i = i6;
                            }
                            j2 >>= i;
                            i8++;
                            i6 = i;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        if (i7 != i6) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                    }
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                    jArr3 = jArr;
                }
            }
        }
        sr1Var.a();
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
