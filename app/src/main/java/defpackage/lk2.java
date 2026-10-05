package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class lk2 {
    public final g41 a;
    public final h7 b;
    public final h9 c;
    public final wh3 d;
    public final as1 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public v6 i;
    public long j;
    public final it1 k;
    public final hs1 l;

    public lk2(or1 or1Var, h7 h7Var) {
        this.a = or1Var;
        this.b = h7Var;
        h9 h9Var = new h9(5);
        h9Var.c = new long[192];
        h9Var.d = new long[192];
        this.c = h9Var;
        this.d = new wh3();
        this.e = new as1();
        this.j = -1L;
        this.k = new it1(9, this);
        this.l = new hs1();
    }

    public static boolean c(ex1 ex1Var) {
        p12 p12Var = ex1Var.a0;
        return (p12Var == null || pq.G(((tw0) p12Var).b())) ? false : true;
    }

    public static boolean d(tb1 tb1Var) {
        return tb1Var.l != -4;
    }

    public static long g(tb1 tb1Var) {
        ax1 ax1Var = tb1Var.L;
        ex1 ex1Var = ax1Var.d;
        long jC = 0;
        for (ex1 ex1Var2 = ax1Var.c; ex1Var2 != null && ex1Var2 != ex1Var; ex1Var2 = ex1Var2.D) {
            if (c(ex1Var2)) {
                return 9223372034707292159L;
            }
            jC = i41.c(jC, ex1Var2.M);
        }
        return jC;
    }

    public static void j(tb1 tb1Var) {
        if (!tb1Var.h || c(tb1Var.L.d)) {
            return;
        }
        tb1Var.h = false;
        if (tb1Var.j) {
            tb1Var.i = g(tb1Var);
            tb1Var.j = false;
        }
        if (i41.a(tb1Var.i, 9223372034707292159L)) {
            return;
        }
        qs1 qs1VarZ = tb1Var.z();
        Object[] objArr = qs1VarZ.f;
        int i = qs1VarZ.h;
        for (int i2 = 0; i2 < i; i2++) {
            j((tb1) objArr[i2]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0219  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        boolean z;
        long j;
        h9 h9Var;
        int i;
        long j2;
        long j3;
        int i2;
        long[] jArr;
        long j4;
        long j5;
        v6 v6Var = this.i;
        if (v6Var != null) {
            this.b.removeCallbacks(v6Var);
            this.i = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z2 = this.f;
        boolean z3 = z2 || this.g;
        h9 h9Var2 = this.c;
        boolean z4 = true;
        wh3 wh3Var = this.d;
        if (z2) {
            this.f = false;
            as1 as1Var = this.e;
            Object[] objArr = as1Var.a;
            int i3 = as1Var.b;
            for (int i4 = 0; i4 < i3; i4++) {
                ((cs0) objArr[i4]).a();
            }
            long[] jArr2 = (long[]) h9Var2.c;
            int i5 = h9Var2.b;
            int i6 = 0;
            while (i6 < jArr2.length - 2 && i6 < i5) {
                long j6 = jArr2[i6 + 2];
                boolean z5 = z4;
                int i7 = i5;
                if ((((int) (j6 >> 60)) & 1) != 0) {
                    long j7 = jArr2[i6];
                    long j8 = jArr2[i6 + 1];
                    vh3 vh3Var = (vh3) wh3Var.a.b(((int) j6) & 33554431);
                    while (vh3Var != null) {
                        vh3 vh3Var2 = vh3Var.d;
                        boolean z6 = z3;
                        long j9 = vh3Var.g;
                        boolean z7 = (jCurrentTimeMillis - j9 >= 0 || j9 == Long.MIN_VALUE) ? z5 : false;
                        vh3Var.e = j7;
                        vh3Var.f = j8;
                        if (z7) {
                            vh3Var.g = jCurrentTimeMillis;
                            j4 = j7;
                            j5 = j8;
                            vh3Var.a(j4, j5, wh3Var.d, wh3Var.e, wh3Var.g);
                        } else {
                            j4 = j7;
                            j5 = j8;
                        }
                        vh3Var = vh3Var2;
                        j7 = j4;
                        j8 = j5;
                        z3 = z6;
                    }
                }
                i6 += 3;
                z4 = z5;
                i5 = i7;
                z3 = z3;
            }
            z = z3;
            j = 0;
            long[] jArr3 = (long[]) h9Var2.c;
            int i8 = h9Var2.b;
            for (int i9 = 0; i9 < jArr3.length - 2 && i9 < i8; i9 += 3) {
                int i10 = i9 + 2;
                jArr3[i10] = jArr3[i10] & (-1152921504606846977L);
            }
        } else {
            z = z3;
            j = 0;
        }
        if (this.g) {
            this.g = false;
            long j10 = wh3Var.d;
            long j11 = wh3Var.e;
            float[] fArr = wh3Var.g;
            or1 or1Var = wh3Var.a;
            j2 = 128;
            Object[] objArr2 = or1Var.c;
            long[] jArr4 = or1Var.a;
            int length = jArr4.length - 2;
            if (length >= 0) {
                int i11 = 0;
                int i12 = 8;
                j3 = 255;
                while (true) {
                    long j12 = j10;
                    long j13 = jArr4[i11];
                    int i13 = i12;
                    h9Var = h9Var2;
                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i14 = 8 - ((~(i11 - length)) >>> 31);
                        long j14 = j13;
                        int i15 = 0;
                        while (i15 < i14) {
                            if ((j14 & 255) < 128) {
                                vh3 vh3Var3 = (vh3) objArr2[(i11 << 3) + i15];
                                while (vh3Var3 != null) {
                                    wh3Var.a(vh3Var3, j12, j11, fArr, jCurrentTimeMillis);
                                    vh3Var3 = vh3Var3.d;
                                    i13 = i13;
                                    jArr4 = jArr4;
                                }
                            }
                            long[] jArr5 = jArr4;
                            int i16 = i13;
                            j14 >>= i16;
                            i15++;
                            j12 = j12;
                            i13 = i16;
                            jArr4 = jArr5;
                        }
                        jArr = jArr4;
                        i = i13;
                        j10 = j12;
                        if (i14 != i) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        i = i13;
                        j10 = j12;
                    }
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                    i12 = i;
                    h9Var2 = h9Var;
                    jArr4 = jArr;
                }
                if (z) {
                    long j15 = wh3Var.d;
                    long j16 = wh3Var.e;
                    float[] fArr2 = wh3Var.g;
                    vh3 vh3Var4 = wh3Var.b;
                    if (vh3Var4 != null) {
                        while (vh3Var4 != null) {
                            tb1 tb1VarX = vr.X(vh3Var4.b);
                            long jB = ((h7) wb1.a(tb1VarX)).getRectManager().b(tb1VarX);
                            vh3Var4.e = jB;
                            bn1 bn1Var = tb1VarX.M.p;
                            vh3Var4.f = (((long) (bn1Var.f + ((int) (jB >> 32)))) << 32) | (((long) (bn1Var.g + ((int) (jB & 4294967295L)))) & 4294967295L);
                            wh3Var.a(vh3Var4, j15, j16, fArr2, jCurrentTimeMillis);
                            vh3Var4 = vh3Var4.d;
                        }
                    }
                }
                if (this.h) {
                    i2 = 0;
                } else {
                    i2 = 0;
                    this.h = false;
                    h9 h9Var3 = h9Var;
                    long[] jArr6 = (long[]) h9Var3.c;
                    int i17 = h9Var3.b;
                    long[] jArr7 = (long[]) h9Var3.d;
                    int i18 = 0;
                    for (int i19 = 0; i19 < jArr6.length - 2 && i18 < jArr7.length - 2 && i19 < i17; i19 += 3) {
                        int i20 = i19 + 2;
                        if (jArr6[i20] != kk2.a) {
                            jArr7[i18] = jArr6[i19];
                            jArr7[i18 + 1] = jArr6[i19 + 1];
                            jArr7[i18 + 2] = jArr6[i20];
                            i18 += 3;
                        }
                    }
                    h9Var3.b = i18;
                    h9Var3.c = jArr7;
                    h9Var3.d = jArr6;
                }
                if (wh3Var.c <= jCurrentTimeMillis) {
                    or1 or1Var2 = wh3Var.a;
                    Object[] objArr3 = or1Var2.c;
                    long[] jArr8 = or1Var2.a;
                    int length2 = jArr8.length - 2;
                    if (length2 >= 0) {
                        int i21 = i2;
                        while (true) {
                            long j17 = jArr8[i21];
                            if ((((~j17) << 7) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i22 = 8 - ((~(i21 - length2)) >>> 31);
                                long j18 = j17;
                                for (int i23 = i2; i23 < i22; i23++) {
                                    if ((j18 & j3) < j2) {
                                        for (vh3 vh3Var5 = (vh3) objArr3[(i21 << 3) + i23]; vh3Var5 != null; vh3Var5 = vh3Var5.d) {
                                        }
                                    }
                                    j18 >>= i;
                                }
                                if (i22 != i) {
                                    break;
                                } else if (i21 == length2) {
                                    break;
                                } else {
                                    i21++;
                                }
                            }
                        }
                    }
                    vh3 vh3Var6 = wh3Var.b;
                    if (vh3Var6 != null) {
                        while (vh3Var6 != null) {
                            vh3Var6 = vh3Var6.d;
                        }
                    }
                    wh3Var.c = -1L;
                }
                if (wh3Var.c <= j) {
                    k();
                    return;
                }
                return;
            }
            h9Var = h9Var2;
            i = 8;
        } else {
            h9Var = h9Var2;
            i = 8;
            j2 = 128;
        }
        j3 = 255;
        if (z) {
        }
        if (this.h) {
        }
        if (wh3Var.c <= jCurrentTimeMillis) {
        }
        if (wh3Var.c <= j) {
        }
    }

    public final long b(tb1 tb1Var) {
        if (!d(tb1Var)) {
            return 9223372034707292159L;
        }
        long j = ((long[]) this.c.c)[e(tb1Var)];
        return (((long) ((int) (j >> 32))) << 32) | (((long) ((int) j)) & 4294967295L);
    }

    public final int e(tb1 tb1Var) {
        int i = tb1Var.l;
        if (i == -4) {
            i = -4;
        } else {
            int i2 = tb1Var.g;
            h9 h9Var = this.c;
            long[] jArr = (long[]) h9Var.c;
            if (i < 0 || i >= h9Var.b - 2 || (((int) jArr[i + 2]) & 33554431) != (i2 & 33554431)) {
                int i3 = i2 & 33554431;
                int i4 = h9Var.b;
                for (int i5 = 0; i5 < i4 - 2; i5 += 3) {
                    if ((((int) jArr[i5 + 2]) & 33554431) == i3) {
                        i = i5;
                        break;
                    }
                }
                i = -4;
            }
        }
        if (i == -4) {
            m21.a("LayoutNode " + tb1Var.g + " not found in RectList");
        }
        tb1Var.l = i;
        return i;
    }

    public final void f(tb1 tb1Var) {
        tb1Var.h = true;
        ax1 ax1Var = tb1Var.L;
        ex1 ex1Var = ax1Var.d;
        bn1 bn1Var = tb1Var.M.p;
        int iG0 = bn1Var.G0();
        float fF0 = bn1Var.F0();
        hs1 hs1Var = this.l;
        hs1Var.a = 0.0f;
        hs1Var.b = 0.0f;
        hs1Var.c = iG0;
        hs1Var.d = fF0;
        while (true) {
            if (ex1Var == null) {
                break;
            }
            tb1 tb1Var2 = ex1Var.z;
            if (ex1Var == tb1Var2.L.d && !tb1Var2.h) {
                if (!i41.a(b(tb1Var2), 9223372034707292159L)) {
                    hs1Var.c((((long) Float.floatToRawIntBits((int) (r9 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (r9 & 4294967295L))) & 4294967295L));
                    break;
                }
            }
            p12 p12Var = ex1Var.a0;
            if (p12Var != null) {
                float[] fArrB = ((tw0) p12Var).b();
                if (!pq.G(fArrB)) {
                    wm1.c(fArrB, hs1Var);
                }
            }
            long j = ex1Var.M;
            hs1Var.c((4294967295L & ((long) Float.floatToRawIntBits((int) (j & 4294967295L)))) | (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32));
            ex1Var = ex1Var.D;
        }
        int i = (int) hs1Var.a;
        int i2 = (int) hs1Var.b;
        int i3 = (int) hs1Var.c;
        int i4 = (int) hs1Var.d;
        int i5 = tb1Var.g;
        int i6 = tb1Var.l;
        h9 h9Var = this.c;
        if (i6 != -4) {
            int iE = e(tb1Var);
            long[] jArr = (long[]) h9Var.c;
            jArr[iE] = (((long) i) << 32) | (((long) i2) & 4294967295L);
            jArr[iE + 1] = (4294967295L & ((long) i4)) | (((long) i3) << 32);
            int i7 = iE + 2;
            long j2 = jArr[i7];
            jArr[i7] = j2 | (((j2 >> 63) & 1) << 60);
        } else {
            tb1 tb1VarU = tb1Var.u();
            tb1Var.l = h9Var.f(i5, i, i2, i3, i4, tb1VarU != null ? tb1VarU.g : -1, tb1VarU != null ? e(tb1VarU) : -4, ax1Var.d(1024), ax1Var.d(16), this.d.a.a(i5));
        }
        tb1Var.k = false;
        this.f = true;
        qs1 qs1VarZ = tb1Var.z();
        Object[] objArr = qs1VarZ.f;
        int i8 = qs1VarZ.h;
        for (int i9 = 0; i9 < i8; i9++) {
            tb1 tb1Var3 = (tb1) objArr[i9];
            if (tb1Var3.I()) {
                f(tb1Var3);
            }
        }
    }

    public final void h(tb1 tb1Var) {
        long j;
        boolean zI = tb1Var.I();
        ax1 ax1Var = tb1Var.L;
        if (zI && tb1Var.k) {
            tb1 tb1VarU = tb1Var.u();
            if (tb1VarU == null || tb1VarU.h) {
                j = tb1VarU == null ? 0L : 9223372034707292159L;
            } else {
                if (tb1VarU.j) {
                    tb1VarU.j = false;
                    tb1VarU.i = g(tb1VarU);
                }
                j = tb1VarU.i;
            }
            ex1 ex1Var = ax1Var.d;
            if (i41.a(j, 9223372034707292159L) || c(ex1Var)) {
                f(tb1Var);
            } else if (tb1Var.h) {
                f(tb1Var);
                j(tb1Var);
            } else {
                long jC = i41.c(j, ex1Var.M);
                bn1 bn1Var = tb1Var.M.p;
                int iG0 = bn1Var.G0();
                int iF0 = bn1Var.F0();
                int i = tb1Var.l;
                h9 h9Var = this.c;
                if (i != -4) {
                    int iE = e(tb1Var);
                    if (tb1VarU != null) {
                        int iE2 = e(tb1VarU);
                        long[] jArr = (long[]) h9Var.c;
                        long j2 = jArr[iE2];
                        int i2 = ((int) (j2 >> 32)) + ((int) (jC >> 32));
                        int i3 = ((int) j2) + ((int) (jC & 4294967295L));
                        long j3 = jArr[iE];
                        int i4 = i2 - ((int) (j3 >> 32));
                        int i5 = i3 - ((int) j3);
                        int i6 = iE + 2;
                        long j4 = jArr[i6];
                        jArr[iE] = (((long) i2) << 32) | (((long) i3) & 4294967295L);
                        jArr[iE + 1] = (((long) (iG0 + i2)) << 32) | (((long) (iF0 + i3)) & 4294967295L);
                        jArr[i6] = j4 | (((j4 >> 63) & 1) << 60);
                        if (i4 != 0 || i5 != 0) {
                            h9Var.j(iE, i4, i5, j4);
                        }
                    } else {
                        int iE3 = e(tb1Var);
                        int i7 = (int) (jC >> 32);
                        int i8 = (int) (jC & 4294967295L);
                        long[] jArr2 = (long[]) h9Var.c;
                        long j5 = jArr2[iE3];
                        jArr2[iE3] = (((long) i8) & 4294967295L) | (((long) i7) << 32);
                        jArr2[iE3 + 1] = (((long) (iF0 + i8)) & 4294967295L) | (((long) (iG0 + i7)) << 32);
                        int i9 = iE3 + 2;
                        long j6 = jArr2[i9];
                        jArr2[i9] = (((j6 >> 63) & 1) << 60) | j6;
                        int i10 = i7 - ((int) (j5 >> 32));
                        int i11 = i8 - ((int) j5);
                        if (i10 != 0 || i11 != 0) {
                            h9Var.j(iE3, i10, i11, j6);
                        }
                    }
                } else {
                    int i12 = tb1Var.g;
                    boolean zD = ax1Var.d(1024);
                    boolean zD2 = ax1Var.d(16);
                    boolean zA = this.d.a.a(i12);
                    if (tb1VarU != null) {
                        int i13 = tb1VarU.g;
                        int iE4 = e(tb1VarU);
                        int i14 = (int) (jC >> 32);
                        int i15 = (int) (jC & 4294967295L);
                        int i16 = i12 & 33554431;
                        long[] jArr3 = (long[]) h9Var.c;
                        if ((((int) jArr3[iE4 + 2]) & 33554431) != (33554431 & i13)) {
                            m21.a("Inserted child " + i16 + " without valid parent index or parent " + i13 + " not found");
                        }
                        long j7 = jArr3[iE4];
                        int i17 = ((int) (j7 >> 32)) + i14;
                        int i18 = ((int) j7) + i15;
                        tb1Var.l = h9Var.f(i16, i17, i18, i17 + iG0, i18 + iF0, i13, iE4, zD, zD2, zA);
                    } else {
                        int i19 = (int) (jC >> 32);
                        int i20 = (int) (jC & 4294967295L);
                        tb1Var.l = h9Var.f(i12, i19, i20, i19 + iG0, i20 + iF0, -1, -4, zD, zD2, zA);
                    }
                }
            }
            tb1Var.k = false;
            this.f = true;
            k();
        }
    }

    public final void i(tb1 tb1Var) {
        if (d(tb1Var)) {
            int iE = e(tb1Var);
            long[] jArr = (long[]) this.c.c;
            jArr[iE] = -1;
            jArr[iE + 1] = -1;
            jArr[iE + 2] = kk2.a;
            tb1Var.l = -4;
            tb1Var.k = true;
            this.f = true;
            this.h = true;
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
    public final void k() {
        v6 v6Var = this.i;
        boolean z = v6Var != null;
        long j = this.d.c;
        if (j >= 0 || !z) {
            if (this.j == j && z) {
                return;
            }
            h7 h7Var = this.b;
            if (v6Var != null) {
                h7Var.removeCallbacks(v6Var);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jMax = Math.max(j, 16 + jCurrentTimeMillis);
            this.j = jMax;
            v6 v6Var2 = new v6(this.k, 1);
            h7Var.postDelayed(v6Var2, jMax - jCurrentTimeMillis);
            this.i = v6Var2;
        }
    }
}
