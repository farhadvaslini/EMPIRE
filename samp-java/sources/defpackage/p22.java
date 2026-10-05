package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class p22 {
    public final k71 a;
    public final or1 b;
    public final pr1 c;
    public final mr1 d;
    public final or1 e;
    public float f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public int m;
    public final nd1 n;
    public final pi o;

    public p22(k71 k71Var, nd1 nd1Var, fd1 fd1Var) {
        this.a = k71Var;
        or1 or1Var = h41.a;
        this.b = new or1();
        this.c = new pr1();
        int i = c41.a;
        this.d = new mr1();
        this.e = new or1();
        this.g = -1;
        this.h = Integer.MAX_VALUE;
        this.i = Integer.MIN_VALUE;
        this.n = nd1Var;
        this.o = new pi(fd1Var);
    }

    public final int a(pi piVar, int i, boolean z) {
        List list;
        List list2;
        or1 or1Var = this.e;
        if (or1Var.a(i)) {
            Object objB = or1Var.b(i);
            objB.getClass();
            return ((sq) objB).b;
        }
        or1 or1Var2 = this.b;
        int i2 = 0;
        if (or1Var2.a(i)) {
            if (!z || (list2 = (List) or1Var2.b(i)) == null) {
                return -1;
            }
            int size = list2.size();
            while (i2 < size) {
                ((md1) list2.get(i2)).a();
                i2++;
            }
            return -1;
        }
        qq qqVar = new qq(this, piVar, i2);
        long j = piVar.x().u;
        nd1 nd1Var = (nd1) piVar.i;
        if (nd1Var == null) {
            s51.F("state");
            throw null;
        }
        or1Var2.i(i, vr.K(nd1Var.a(i, j, true, new er1(5, qqVar, piVar))));
        if (!z || (list = (List) or1Var2.b(i)) == null) {
            return -1;
        }
        int size2 = list.size();
        while (i2 < size2) {
            ((md1) list.get(i2)).a();
            i2++;
        }
        return -1;
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
    public final void b(pi piVar, int i, int i2) {
        int i3;
        int i4;
        or1 or1Var = this.e;
        sq sqVar = (sq) or1Var.b(i);
        zj zjVar = sq.c;
        if (sqVar != null) {
            sqVar.b = i2;
            sqVar.a = zjVar;
        } else {
            sqVar = new sq();
            sqVar.a = zjVar;
            sqVar.b = i2;
        }
        or1Var.i(i, sqVar);
        if (i > this.i) {
            this.i = i;
            this.k -= i2;
        } else if (i < this.h) {
            this.h = i;
            this.j -= i2;
        }
        int i5 = 1;
        if (Math.signum(this.f) <= 0.0f) {
            if (this.k > 0) {
                i3 = this.i + 1;
                i4 = i3;
            }
            i4 = -1;
        } else {
            if (Math.signum(this.f) > 0.0f && this.j > 0) {
                i3 = this.h - 1;
                i4 = i3;
            }
            i4 = -1;
        }
        if (i4 > 0) {
            piVar.getClass();
            if (i4 != -1 && i4 < this.m) {
                qq qqVar = new qq(this, piVar, i5);
                long j = piVar.x().u;
                nd1 nd1Var = (nd1) piVar.i;
                if (nd1Var == null) {
                    s51.F("state");
                    throw null;
                }
                this.b.i(i4, vr.K(nd1Var.a(i4, j, true, new er1(5, qqVar, piVar))));
            }
        }
        g();
    }

    public final void c(pi piVar, int i, int i2, int i3, int i4, int i5, float f, boolean z) {
        int i6;
        int i7;
        boolean z2 = Math.signum(f) == Math.signum(this.f);
        if (!z) {
            if (!z2 || this.l) {
                this.j = i3 - i5;
                this.h = i;
            } else {
                int iM = vm1.M(Math.abs(f)) + this.j;
                int i8 = i3 - i5;
                if (iM > i8) {
                    iM = i8;
                }
                this.j = iM;
            }
            while (this.j > 0 && (i6 = this.h) > 0) {
                int iA = a(piVar, this.h - 1, i6 + (-1) == i + (-1) && f != 0.0f && Math.abs(f) >= ((float) i5));
                if (iA == -1) {
                    return;
                }
                this.h--;
                this.j -= iA;
            }
            return;
        }
        if (!z2 || this.l) {
            this.k = i3 - i4;
            this.i = i2;
        } else {
            int iM2 = vm1.M(Math.abs(f)) + this.k;
            int i9 = i3 - i4;
            if (iM2 > i9) {
                iM2 = i9;
            }
            this.k = iM2;
        }
        while (this.k > 0) {
            int i10 = this.i;
            piVar.getClass();
            if (i10 == -1 || (i7 = this.i) >= this.m - 1) {
                return;
            }
            int iA2 = a(piVar, this.i + 1, i7 + 1 == i2 + 1 && f != 0.0f && Math.abs(f) >= ((float) i4));
            if (iA2 == -1) {
                return;
            }
            this.i++;
            this.k -= iA2;
        }
    }

    public final void d(float f, y22 y22Var) {
        p22 p22Var;
        boolean z;
        int i;
        int i2;
        int i3;
        pi piVar = this.o;
        piVar.h = y22Var;
        piVar.i = this.n;
        float f2 = -f;
        g();
        if (piVar.t()) {
            t22.z(piVar.x());
            piVar.x();
            this.m = piVar.B();
            int iR = piVar.r();
            int iV = piVar.v();
            int iB = piVar.B();
            int iZ = piVar.z();
            int iY = piVar.y();
            or1 or1Var = this.e;
            if (f2 <= 0.0f) {
                this.j = 0 - iZ;
                this.h = iR;
                while (this.j > 0 && (i3 = this.h) > 0 && or1Var.a(i3 - 1)) {
                    Object objB = or1Var.b(this.h - 1);
                    objB.getClass();
                    this.h--;
                    this.j -= ((sq) objB).b;
                }
                e(0, this.h - 1);
            } else {
                this.k = 0 - iY;
                this.i = iV;
                while (this.k > 0 && (i2 = this.i) < iB - 1 && or1Var.a(i2 + 1)) {
                    Object objB2 = or1Var.b(this.i + 1);
                    objB2.getClass();
                    int i4 = ((sq) objB2).b;
                    this.i++;
                    this.k -= i4;
                }
                e(this.i + 1, iB - 1);
            }
        }
        if (piVar.t()) {
            t22.z(piVar.x());
            if (piVar.x().t != null) {
                i = ((i32) this.a.g).o;
                z = false;
            } else {
                z = false;
                i = 0;
            }
            p22Var = this;
            p22Var.c(piVar, piVar.r(), piVar.v(), i, piVar.y(), piVar.z(), f2, f2 <= 0.0f ? true : z);
        } else {
            p22Var = this;
        }
        p22Var.f = f2;
        p22Var.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(int r29, int r30) {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p22.e(int, int):void");
    }

    public final void f() {
        this.h = Integer.MAX_VALUE;
        this.i = Integer.MIN_VALUE;
        this.j = 0;
        this.k = 0;
        this.l = false;
        this.d.a();
        this.e.c();
        or1 or1Var = this.b;
        long[] jArr = or1Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = or1Var.b[i4];
                        List list = (List) or1Var.c[i4];
                        int size = list.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            ((md1) list.get(i6)).cancel();
                        }
                        or1Var.h(i4);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void g() {
        s51.J(this.j, "prefetchWindowStartExtraSpace");
        s51.J(this.k, "prefetchWindowEndExtraSpace");
        s51.J(this.h, "prefetchWindowStartIndex");
        s51.J(this.i, "prefetchWindowEndIndex");
    }
}
