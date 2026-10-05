package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class xd2 {
    public static final l60 a = qq1.a;
    public static final l60 b = qq1.c;

    /* JADX WARN: Removed duplicated region for block: B:32:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(bq1 bq1Var, long j, float f, long j2, int i, float f2, nv0 nv0Var, final int i2, final int i3) {
        bq1 bq1Var2;
        int i4;
        float f3;
        int i5;
        final long j3;
        final bq1 bq1Var3;
        final long j4;
        final float f4;
        final int i6;
        final float f5;
        xj2 xj2VarT;
        long j5;
        int i7;
        final float f6;
        final int i8;
        final long j6;
        final float f7;
        final long j7;
        nv0Var.b0(333154241);
        int i9 = i3 & 1;
        if (i9 != 0) {
            i4 = i2 | 6;
            bq1Var2 = bq1Var;
        } else if ((i2 & 6) == 0) {
            bq1Var2 = bq1Var;
            i4 = (nv0Var.f(bq1Var2) ? 4 : 2) | i2;
        } else {
            bq1Var2 = bq1Var;
            i4 = i2;
        }
        long jE = j;
        int i10 = i4 | (((i3 & 2) == 0 && nv0Var.e(jE)) ? 32 : 16);
        int i11 = i3 & 4;
        if (i11 == 0) {
            if ((i2 & 384) == 0) {
                f3 = f;
                i10 |= nv0Var.c(f3) ? 256 : 128;
            }
            i5 = i10 | 222208;
            if (nv0Var.R(i5 & 1, (74899 & i5) == 74898)) {
                nv0Var.U();
                j3 = j2;
                bq1Var3 = bq1Var2;
                j4 = jE;
                f4 = f3;
                i6 = i;
                f5 = f2;
            } else {
                nv0Var.W();
                if ((i2 & 1) == 0 || nv0Var.A()) {
                    bq1Var3 = i9 != 0 ? yp1.a : bq1Var2;
                    if ((i3 & 2) != 0) {
                        jE = hy.e(cl3.o0, nv0Var);
                        i5 &= -113;
                    }
                    if (i11 != 0) {
                        f3 = 4.0f;
                    }
                    j5 = wx.f;
                    i7 = i5 & (-7169);
                    f6 = 4.0f;
                    i8 = 1;
                } else {
                    nv0Var.U();
                    if ((i3 & 2) != 0) {
                        i5 &= -113;
                    }
                    j5 = j2;
                    i8 = i;
                    f6 = f2;
                    i7 = i5 & (-7169);
                    bq1Var3 = bq1Var2;
                }
                nv0Var.q();
                final ga3 ga3Var = new ga3(((ua0) nv0Var.j(s20.h)).T(f3), 0.0f, i8, 0, null, 26);
                f21 f21VarM = ur.M(nv0Var);
                final d21 d21VarL = ur.l(f21VarM, 0.0f, 1080.0f, n92.o(n92.I(6000, 2, pg0.c), null, 6), nv0Var);
                s12 s12Var = new s12(21);
                r71 r71Var = new r71();
                s12Var.h(r71Var);
                final d21 d21VarL2 = ur.l(f21VarM, 0.0f, 360.0f, n92.o(new s71(r71Var), null, 6), nv0Var);
                r71 r71Var2 = new r71();
                r71Var2.a = 6000;
                r71Var2.a(Float.valueOf(0.87f), 3000).b = b;
                r71Var2.a(Float.valueOf(0.1f), 6000);
                final d21 d21VarL3 = ur.l(f21VarM, 0.1f, 0.87f, n92.o(new s71(r71Var2), null, 6), nv0Var);
                bq1 bq1VarK = j43.k(su2.a(bq1Var3, true, new s12(22)), 40.0f);
                boolean zF = ((i7 & 896) == 256) | nv0Var.f(d21VarL3) | nv0Var.f(d21VarL) | nv0Var.f(d21VarL2) | nv0Var.e(j5) | nv0Var.h(ga3Var) | ((((i7 & 112) ^ 48) > 32 && nv0Var.e(jE)) || (i7 & 48) == 32);
                Object objO = nv0Var.O();
                if (zF || objO == c20.a) {
                    j6 = jE;
                    f7 = f3;
                    j7 = j5;
                    objO = new ns0() { // from class: td2
                        @Override // defpackage.ns0
                        public final Object h(Object obj) {
                            long j8 = j7;
                            ga3 ga3Var2 = ga3Var;
                            long j9 = j6;
                            qf0 qf0Var = (qf0) obj;
                            float fFloatValue = ((Number) d21VarL3.getValue()).floatValue() * 360.0f;
                            int i12 = i8;
                            float f8 = f6;
                            if (i12 != 0 && Float.intBitsToFloat((int) (qf0Var.a() & 4294967295L)) <= Float.intBitsToFloat((int) (qf0Var.a() >> 32))) {
                                f8 += f7;
                            }
                            float fA1 = (f8 / ((float) (((double) qf0Var.a1(Float.intBitsToFloat((int) (qf0Var.a() >> 32)))) * 3.141592653589793d))) * 360.0f;
                            float fFloatValue2 = ((Number) d21VarL2.getValue()).floatValue() + ((Number) d21VarL.getValue()).floatValue();
                            long jY0 = qf0Var.y0();
                            pi piVarZ = qf0Var.Z();
                            long jA = piVarZ.A();
                            piVarZ.k().l();
                            try {
                                ((yl1) piVarZ.g).F(fFloatValue2, jY0);
                                xd2.d(qf0Var, Math.min(fFloatValue, fA1) + fFloatValue, (360.0f - fFloatValue) - (Math.min(fFloatValue, fA1) * 2.0f), j8, ga3Var2);
                                xd2.d(qf0Var, 0.0f, fFloatValue, j9, ga3Var2);
                                nc2.t(piVarZ, jA);
                                return dm3.a;
                            } catch (Throwable th) {
                                nc2.t(piVarZ, jA);
                                throw th;
                            }
                        }
                    };
                    nv0Var.j0(objO);
                } else {
                    j6 = jE;
                    f7 = f3;
                    j7 = j5;
                }
                vr.a(0, (ns0) objO, nv0Var, bq1VarK);
                i6 = i8;
                f5 = f6;
                f4 = f7;
                j3 = j7;
                j4 = j6;
            }
            xj2VarT = nv0Var.t();
            if (xj2VarT == null) {
                xj2VarT.d = new rs0() { // from class: ud2
                    @Override // defpackage.rs0
                    public final Object f(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        xd2.a(bq1Var3, j4, f4, j3, i6, f5, (nv0) obj, jo3.y(i2 | 1), i3);
                        return dm3.a;
                    }
                };
                return;
            }
            return;
        }
        i10 |= 384;
        f3 = f;
        i5 = i10 | 222208;
        if (nv0Var.R(i5 & 1, (74899 & i5) == 74898)) {
        }
        xj2VarT = nv0Var.t();
        if (xj2VarT == null) {
        }
    }

    public static final void b(final cs0 cs0Var, final bq1 bq1Var, long j, long j2, int i, float f, ns0 ns0Var, nv0 nv0Var, final int i2) {
        final long j3;
        final long j4;
        final int i3;
        final float f2;
        final ns0 ns0Var2;
        long jE;
        long jE2;
        ns0 ns0Var3;
        int i4;
        final float f3;
        final int i5;
        final ns0 ns0Var4;
        final long j5;
        final long j6;
        nv0Var.b0(-339970038);
        int i6 = i2 | (nv0Var.h(cs0Var) ? 4 : 2) | 746624;
        if (nv0Var.R(i6 & 1, (599187 & i6) != 599186)) {
            nv0Var.W();
            int i7 = i2 & 1;
            Object obj = c20.a;
            if (i7 == 0 || nv0Var.A()) {
                jE = hy.e(cl3.o0, nv0Var);
                jE2 = hy.e(cl3.p0, nv0Var);
                boolean zE = nv0Var.e(jE);
                Object objO = nv0Var.O();
                if (zE || objO == obj) {
                    objO = new i8(8, jE);
                    nv0Var.j0(objO);
                }
                ns0Var3 = (ns0) objO;
                i4 = i6 & (-3678081);
                f3 = 4.0f;
                i5 = 1;
            } else {
                nv0Var.U();
                i4 = i6 & (-3678081);
                jE = j;
                jE2 = j2;
                i5 = i;
                f3 = f;
                ns0Var3 = ns0Var;
            }
            nv0Var.q();
            boolean z = (i4 & 14) == 4;
            Object objO2 = nv0Var.O();
            if (z || objO2 == obj) {
                objO2 = new lx0(cs0Var, 4);
                nv0Var.j0(objO2);
            }
            final cs0 cs0Var2 = (cs0) objO2;
            bq1 bq1VarD = bq1Var.d(b2.b);
            boolean zF = nv0Var.f(cs0Var2);
            Object objO3 = nv0Var.O();
            if (zF || objO3 == obj) {
                objO3 = new rf(cs0Var2, 4);
                nv0Var.j0(objO3);
            }
            bq1 bq1VarL = j43.l(su2.a(bq1VarD, true, (ns0) objO3), 240.0f, 4.0f);
            boolean zF2 = nv0Var.f(cs0Var2) | nv0Var.e(jE2) | nv0Var.e(jE) | nv0Var.f(ns0Var3);
            Object objO4 = nv0Var.O();
            if (zF2 || objO4 == obj) {
                ns0Var4 = ns0Var3;
                j5 = jE;
                j6 = jE2;
                Object obj2 = new ns0() { // from class: vd2
                    @Override // defpackage.ns0
                    public final Object h(Object obj3) {
                        qf0 qf0Var = (qf0) obj3;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (qf0Var.a() & 4294967295L));
                        int i8 = i5;
                        float fA1 = f3;
                        if (i8 != 0 && Float.intBitsToFloat((int) (qf0Var.a() & 4294967295L)) <= Float.intBitsToFloat((int) (qf0Var.a() >> 32))) {
                            fA1 += qf0Var.a1(fIntBitsToFloat);
                        }
                        float fA12 = fA1 / qf0Var.a1(Float.intBitsToFloat((int) (qf0Var.a() >> 32)));
                        float fFloatValue = ((Number) cs0Var2.a()).floatValue();
                        float fMin = Math.min(fFloatValue, fA12) + fFloatValue;
                        if (fMin <= 1.0f) {
                            xd2.e(qf0Var, fMin, 1.0f, j6, fIntBitsToFloat, i8);
                        }
                        xd2.e(qf0Var, 0.0f, fFloatValue, j5, fIntBitsToFloat, i8);
                        ns0Var4.h(qf0Var);
                        return dm3.a;
                    }
                };
                nv0Var.j0(obj2);
                objO4 = obj2;
            } else {
                ns0Var4 = ns0Var3;
                j5 = jE;
                j6 = jE2;
            }
            vr.a(0, (ns0) objO4, nv0Var, bq1VarL);
            i3 = i5;
            f2 = f3;
            j4 = j6;
            j3 = j5;
            ns0Var2 = ns0Var4;
        } else {
            nv0Var.U();
            j3 = j;
            j4 = j2;
            i3 = i;
            f2 = f;
            ns0Var2 = ns0Var;
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new rs0(bq1Var, j3, j4, i3, f2, ns0Var2, i2) { // from class: wd2
                public final /* synthetic */ bq1 g;
                public final /* synthetic */ long h;
                public final /* synthetic */ long i;
                public final /* synthetic */ int j;
                public final /* synthetic */ float k;
                public final /* synthetic */ ns0 l;

                @Override // defpackage.rs0
                public final Object f(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iY = jo3.y(49);
                    xd2.b(this.f, this.g, this.h, this.i, this.j, this.k, this.l, (nv0) obj3, iY);
                    return dm3.a;
                }
            };
        }
    }

    public static final void c(final bq1 bq1Var, long j, long j2, int i, float f, nv0 nv0Var, final int i2) {
        final long j3;
        final long j4;
        final int i3;
        final float f2;
        long jE;
        long jE2;
        final int i4;
        final float f3;
        final long j5;
        final long j6;
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        nv0Var.b0(567589233);
        int i5 = i2 | 27792;
        if (nv0Var.R(i5 & 1, (i5 & 9363) != 9362)) {
            nv0Var.W();
            if ((i2 & 1) == 0 || nv0Var.A()) {
                jE = hy.e(cl3.o0, nv0Var);
                jE2 = hy.e(cl3.p0, nv0Var);
                i4 = 1;
                f3 = 4.0f;
            } else {
                nv0Var.U();
                jE = j;
                jE2 = j2;
                i4 = i;
                f3 = f;
            }
            nv0Var.q();
            f21 f21VarM = ur.M(nv0Var);
            r71 r71Var = new r71();
            r71Var.a = 1750;
            q71 q71VarA = r71Var.a(fValueOf2, 0);
            l60 l60Var = a;
            q71VarA.b = l60Var;
            r71Var.a(fValueOf, 1000);
            final d21 d21VarL = ur.l(f21VarM, 0.0f, 1.0f, n92.o(new s71(r71Var), null, 6), nv0Var);
            r71 r71Var2 = new r71();
            r71Var2.a = 1750;
            r71Var2.a(fValueOf2, 250).b = l60Var;
            r71Var2.a(fValueOf, 1250);
            final d21 d21VarL2 = ur.l(f21VarM, 0.0f, 1.0f, n92.o(new s71(r71Var2), null, 6), nv0Var);
            r71 r71Var3 = new r71();
            r71Var3.a = 1750;
            r71Var3.a(fValueOf2, 650).b = l60Var;
            r71Var3.a(fValueOf, 1500);
            final d21 d21VarL3 = ur.l(f21VarM, 0.0f, 1.0f, n92.o(new s71(r71Var3), null, 6), nv0Var);
            r71 r71Var4 = new r71();
            r71Var4.a = 1750;
            r71Var4.a(fValueOf2, 900).b = l60Var;
            r71Var4.a(fValueOf, 1750);
            final d21 d21VarL4 = ur.l(f21VarM, 0.0f, 1.0f, n92.o(new s71(r71Var4), null, 6), nv0Var);
            bq1 bq1VarL = j43.l(su2.a(bq1Var.d(b2.b), true, new s12(22)), 240.0f, 4.0f);
            boolean zF = nv0Var.f(d21VarL) | nv0Var.e(jE2) | nv0Var.f(d21VarL2) | nv0Var.e(jE) | nv0Var.f(d21VarL3) | nv0Var.f(d21VarL4);
            Object objO = nv0Var.O();
            if (zF || objO == c20.a) {
                j5 = jE;
                j6 = jE2;
                Object obj = new ns0() { // from class: rd2
                    @Override // defpackage.ns0
                    public final Object h(Object obj2) {
                        long j7;
                        qf0 qf0Var = (qf0) obj2;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (qf0Var.a() & 4294967295L));
                        int i6 = i4;
                        float fA1 = f3;
                        if (i6 != 0 && Float.intBitsToFloat((int) (4294967295L & qf0Var.a())) <= Float.intBitsToFloat((int) (qf0Var.a() >> 32))) {
                            fA1 += qf0Var.a1(fIntBitsToFloat);
                        }
                        float fA12 = fA1 / qf0Var.a1(Float.intBitsToFloat((int) (qf0Var.a() >> 32)));
                        e93 e93Var = d21VarL;
                        float fFloatValue = ((Number) e93Var.getValue()).floatValue();
                        float f4 = 1.0f - fA12;
                        long j8 = j6;
                        if (fFloatValue < f4) {
                            xd2.e(qf0Var, ((Number) e93Var.getValue()).floatValue() > 0.0f ? ((Number) e93Var.getValue()).floatValue() + fA12 : 0.0f, 1.0f, j8, fIntBitsToFloat, i6);
                        }
                        long j9 = j8;
                        float fFloatValue2 = ((Number) e93Var.getValue()).floatValue();
                        e93 e93Var2 = d21VarL2;
                        float fFloatValue3 = fFloatValue2 - ((Number) e93Var2.getValue()).floatValue();
                        long j10 = j5;
                        if (fFloatValue3 > 0.0f) {
                            xd2.e(qf0Var, ((Number) e93Var.getValue()).floatValue(), ((Number) e93Var2.getValue()).floatValue(), j10, fIntBitsToFloat, i6);
                            j7 = j10;
                        } else {
                            j7 = j10;
                        }
                        float fFloatValue4 = ((Number) e93Var2.getValue()).floatValue();
                        e93 e93Var3 = d21VarL3;
                        if (fFloatValue4 > fA12) {
                            xd2.e(qf0Var, ((Number) e93Var3.getValue()).floatValue() > 0.0f ? ((Number) e93Var3.getValue()).floatValue() + fA12 : 0.0f, ((Number) e93Var2.getValue()).floatValue() < 1.0f ? ((Number) e93Var2.getValue()).floatValue() - fA12 : 1.0f, j9, fIntBitsToFloat, i6);
                            j9 = j9;
                        }
                        float fFloatValue5 = ((Number) e93Var3.getValue()).floatValue();
                        e93 e93Var4 = d21VarL4;
                        if (fFloatValue5 - ((Number) e93Var4.getValue()).floatValue() > 0.0f) {
                            xd2.e(qf0Var, ((Number) e93Var3.getValue()).floatValue(), ((Number) e93Var4.getValue()).floatValue(), j7, fIntBitsToFloat, i6);
                            qf0Var = qf0Var;
                            fIntBitsToFloat = fIntBitsToFloat;
                        }
                        if (((Number) e93Var4.getValue()).floatValue() > fA12) {
                            xd2.e(qf0Var, 0.0f, ((Number) e93Var4.getValue()).floatValue() < 1.0f ? ((Number) e93Var4.getValue()).floatValue() - fA12 : 1.0f, j9, fIntBitsToFloat, i6);
                        }
                        return dm3.a;
                    }
                };
                nv0Var.j0(obj);
                objO = obj;
            } else {
                j5 = jE;
                j6 = jE2;
            }
            vr.a(0, (ns0) objO, nv0Var, bq1VarL);
            i3 = i4;
            f2 = f3;
            j4 = j6;
            j3 = j5;
        } else {
            nv0Var.U();
            j3 = j;
            j4 = j2;
            i3 = i;
            f2 = f;
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new rs0(j3, j4, i3, f2, i2) { // from class: sd2
                public final /* synthetic */ long g;
                public final /* synthetic */ long h;
                public final /* synthetic */ int i;
                public final /* synthetic */ float j;

                @Override // defpackage.rs0
                public final Object f(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iY = jo3.y(7);
                    xd2.c(this.f, this.g, this.h, this.i, this.j, (nv0) obj2, iY);
                    return dm3.a;
                }
            };
        }
    }

    public static final void d(qf0 qf0Var, float f, float f2, long j, ga3 ga3Var) {
        float f3 = ga3Var.a / 2.0f;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (qf0Var.a() >> 32)) - (2.0f * f3);
        qf0Var.X(j, f, f2, (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (768 & 64) != 0 ? 1.0f : 0.0f, ga3Var);
    }

    public static final void e(qf0 qf0Var, float f, float f2, long j, float f3, int i) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (qf0Var.a() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (qf0Var.a() & 4294967295L));
        float f4 = fIntBitsToFloat2 / 2.0f;
        boolean z = qf0Var.getLayoutDirection() == bb1.f;
        float f5 = (z ? f : 1.0f - f2) * fIntBitsToFloat;
        float f6 = (z ? f2 : 1.0f - f) * fIntBitsToFloat;
        if (i == 0 || fIntBitsToFloat2 > fIntBitsToFloat) {
            qf0Var.v0(j, (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), f3, (480 & 16) != 0 ? 0 : 0);
            return;
        }
        float f7 = f3 / 2.0f;
        float f8 = fIntBitsToFloat - f7;
        if (f5 < f7) {
            f5 = f7;
        }
        if (f5 > f8) {
            f5 = f8;
        }
        if (f6 < f7) {
            f6 = f7;
        }
        if (f6 <= f8) {
            f8 = f6;
        }
        if (Math.abs(f2 - f) > 0.0f) {
            qf0Var.v0(j, (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), f3, (480 & 16) != 0 ? 0 : i);
        }
    }
}
