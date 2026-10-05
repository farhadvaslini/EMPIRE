package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class x43 {
    public static final x43 a = new x43();
    public static final float b;
    public static final float c;
    public static final da d;

    static {
        float f = n92.k0;
        b = f;
        c = f;
        d = ga.a();
    }

    public static r43 d(nv0 nv0Var) {
        fy fyVar = (fy) nv0Var.j(hy.a);
        r43 r43Var = fyVar.n0;
        if (r43Var != null) {
            return r43Var;
        }
        long jD = hy.d(fyVar, n92.e0);
        gy gyVar = n92.X;
        long jD2 = hy.d(fyVar, gyVar);
        gy gyVar2 = n92.i0;
        long jD3 = hy.d(fyVar, gyVar2);
        long jD4 = hy.d(fyVar, gyVar2);
        long jD5 = hy.d(fyVar, gyVar);
        long jX = vp.x(wx.b(n92.b0, hy.d(fyVar, n92.a0)), fyVar.p);
        gy gyVar3 = n92.Y;
        long jD6 = hy.d(fyVar, gyVar3);
        float f = n92.Z;
        long jB = wx.b(f, jD6);
        gy gyVar4 = n92.c0;
        long jD7 = hy.d(fyVar, gyVar4);
        float f2 = n92.d0;
        r43 r43Var2 = new r43(jD, jD2, jD3, jD4, jD5, jX, jB, wx.b(f2, jD7), wx.b(f2, hy.d(fyVar, gyVar4)), wx.b(f, hy.d(fyVar, gyVar3)));
        fyVar.n0 = r43Var2;
        return r43Var2;
    }

    public static void e(qf0 qf0Var, t02 t02Var, long j, long j2, long j3, float f, float f2) {
        ro2 ro2Var;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
        if (t02Var == t02.f) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            jk2 jk2VarB = b32.b(j, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
            ro2Var = new ro2(jk2VarB.a, jk2VarB.b, jk2VarB.c, jk2VarB.d, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits2);
        } else {
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 >> 32));
            jk2 jk2VarB2 = b32.b(j, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat2) << 32));
            ro2Var = new ro2(jk2VarB2.a, jk2VarB2.b, jk2VarB2.c, jk2VarB2.d, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits2, jFloatToRawIntBits);
        }
        da daVar = d;
        da.b(daVar, ro2Var);
        qf0.b1(qf0Var, daVar, j3, 0.0f, null, 60);
        daVar.h();
    }

    public final void a(final qr1 qr1Var, bq1 bq1Var, final r43 r43Var, final boolean z, long j, nv0 nv0Var, final int i) {
        final bq1 bq1Var2;
        final long j2;
        bq1 bq1Var3;
        nv0Var.b0(-290277409);
        int i2 = i | (nv0Var.f(qr1Var) ? 4 : 2) | 48 | (nv0Var.f(r43Var) ? 256 : 128) | (nv0Var.g(z) ? 2048 : 1024) | 24576;
        if (nv0Var.R(i2 & 1, (74899 & i2) != 74898)) {
            nv0Var.W();
            if ((i & 1) == 0 || nv0Var.A()) {
                j2 = g53.c;
                bq1Var3 = yp1.a;
            } else {
                nv0Var.U();
                bq1Var3 = bq1Var;
                j2 = j;
            }
            nv0Var.q();
            Object objO = nv0Var.O();
            zj zjVar = c20.a;
            if (objO == zjVar) {
                objO = new l73();
                nv0Var.j0(objO);
            }
            l73 l73Var = (l73) objO;
            boolean z2 = (i2 & 14) == 4;
            Object objO2 = nv0Var.O();
            if (z2 || objO2 == zjVar) {
                objO2 = new hd1(qr1Var, l73Var, null, 23);
                nv0Var.j0(objO2);
            }
            rn.l((rs0) objO2, nv0Var, qr1Var);
            long jFloatToRawIntBits = !l73Var.isEmpty() ? (((long) Float.floatToRawIntBits(md0.b(j2) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(md0.a(j2))) & 4294967295L) : j2;
            gm0 gm0Var = j43.a;
            oz2.g(nv0Var, gv3.v(cl3.o(j43.l(bq1Var3, md0.b(jFloatToRawIntBits), md0.a(jFloatToRawIntBits)), qr1Var), z ? r43Var.a : r43Var.f, g23.a(n92.g0, nv0Var)));
            bq1Var2 = bq1Var3;
        } else {
            nv0Var.U();
            bq1Var2 = bq1Var;
            j2 = j;
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new rs0(qr1Var, bq1Var2, r43Var, z, j2, i) { // from class: u43
                public final /* synthetic */ qr1 g;
                public final /* synthetic */ bq1 h;
                public final /* synthetic */ r43 i;
                public final /* synthetic */ boolean j;
                public final /* synthetic */ long k;

                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = jo3.y(196609);
                    this.f.a(this.g, this.h, this.i, this.j, this.k, (nv0) obj, iY);
                    return dm3.a;
                }
            };
        }
    }

    public final void b(final h53 h53Var, bq1 bq1Var, final boolean z, final r43 r43Var, rs0 rs0Var, ss0 ss0Var, float f, float f2, nv0 nv0Var, final int i) {
        int i2;
        final bq1 bq1Var2;
        final rs0 rs0Var2;
        final ss0 ss0Var2;
        final float f3;
        final float f4;
        int i3;
        rs0 rs0Var3;
        float f5;
        ss0 ss0Var3;
        bq1 bq1Var3;
        float f6;
        nv0Var.b0(49984771);
        if ((i & 6) == 0) {
            i2 = (nv0Var.h(h53Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            i4 |= nv0Var.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= nv0Var.f(r43Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= 8192;
        }
        int i5 = i4 | 14352384;
        if ((100663296 & i) == 0) {
            i5 |= nv0Var.f(this) ? 67108864 : 33554432;
        }
        if (nv0Var.R(i5 & 1, (38347923 & i5) != 38347922)) {
            nv0Var.W();
            if ((i & 1) == 0 || nv0Var.A()) {
                boolean z2 = ((((i5 & 7168) ^ 3072) > 2048 && nv0Var.f(r43Var)) || (i5 & 3072) == 2048) | ((i5 & 896) == 256);
                Object objO = nv0Var.O();
                zj zjVar = c20.a;
                if (z2 || objO == zjVar) {
                    objO = new lv(r43Var, z);
                    nv0Var.j0(objO);
                }
                rs0 rs0Var4 = (rs0) objO;
                i3 = i5 & (-57345);
                Object objO2 = nv0Var.O();
                if (objO2 == zjVar) {
                    objO2 = i00.i;
                    nv0Var.j0(objO2);
                }
                float f7 = g53.d;
                rs0Var3 = rs0Var4;
                f5 = g53.e;
                ss0Var3 = (ss0) objO2;
                bq1Var3 = yp1.a;
                f6 = f7;
            } else {
                nv0Var.U();
                i3 = i5 & (-57345);
                bq1Var3 = bq1Var;
                rs0Var3 = rs0Var;
                ss0Var3 = ss0Var;
                f6 = f;
                f5 = f2;
            }
            nv0Var.q();
            int i6 = i3 << 3;
            c(h53Var, bq1Var3, z, r43Var, rs0Var3, ss0Var3, f6, f5, nv0Var, 805306416 | (i3 & 14) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (3670016 & i6) | (29360128 & i6) | (i6 & 234881024), ((i3 >> 21) & 112) | 6);
            bq1Var2 = bq1Var3;
            f4 = f5;
            f3 = f6;
            ss0Var2 = ss0Var3;
            rs0Var2 = rs0Var3;
        } else {
            nv0Var.U();
            bq1Var2 = bq1Var;
            rs0Var2 = rs0Var;
            ss0Var2 = ss0Var;
            f3 = f;
            f4 = f2;
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new rs0() { // from class: t43
                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.f.b(h53Var, bq1Var2, z, r43Var, rs0Var2, ss0Var2, f3, f4, (nv0) obj, jo3.y(i | 1));
                    return dm3.a;
                }
            };
        }
    }

    public final void c(final h53 h53Var, final bq1 bq1Var, final boolean z, final r43 r43Var, final rs0 rs0Var, final ss0 ss0Var, final float f, final float f2, nv0 nv0Var, final int i, final int i2) {
        int i3;
        int i4;
        nv0 nv0Var2;
        int i5;
        long j;
        nv0Var.b0(133396521);
        if ((i & 6) == 0) {
            i3 = (nv0Var.h(h53Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= nv0Var.c(Float.NaN) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= nv0Var.f(bq1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= nv0Var.g(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= nv0Var.f(r43Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= nv0Var.h(rs0Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= nv0Var.h(ss0Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= nv0Var.c(f) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= nv0Var.c(f2) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= nv0Var.g(false) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (nv0Var.g(false) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if (nv0Var.R(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            final long jA = r43Var.a(z, false);
            final long jA2 = r43Var.a(z, true);
            long j2 = z ? r43Var.e : r43Var.j;
            if (z) {
                i5 = i3;
                j = r43Var.c;
            } else {
                i5 = i3;
                j = r43Var.h;
            }
            bq1 bq1VarD = h53Var.r == t02.f ? j43.o(bq1Var, g53.a).d(j43.b) : j43.e(j43.c(bq1Var, 1.0f), g53.a);
            int i6 = i5 & 112;
            boolean zH = (i6 == 32) | nv0Var.h(h53Var);
            Object objO = nv0Var.O();
            zj zjVar = c20.a;
            if (zH || objO == zjVar) {
                objO = new ir(16, h53Var);
                nv0Var.j0(objO);
            }
            bq1 bq1VarD2 = bq1VarD.d(vm1.C(yp1.a, (ss0) objO));
            boolean zH2 = (i6 == 32) | nv0Var.h(h53Var) | nv0Var.e(jA) | nv0Var.e(jA2) | nv0Var.e(j2) | nv0Var.e(j) | ((i5 & 29360128) == 8388608) | ((i5 & 234881024) == 67108864) | ((i5 & 458752) == 131072) | ((i5 & 3670016) == 1048576) | ((i5 & 1879048192) == 536870912) | ((i4 & 14) == 4);
            Object objO2 = nv0Var.O();
            if (zH2 || objO2 == zjVar) {
                nv0Var2 = nv0Var;
                final long j3 = j2;
                final long j4 = j;
                ns0 ns0Var = new ns0() { // from class: v43
                    /* JADX WARN: Removed duplicated region for block: B:100:0x0250  */
                    /* JADX WARN: Removed duplicated region for block: B:135:0x0327  */
                    @Override // defpackage.ns0
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object h(Object obj) {
                        float fT;
                        long j5;
                        long jA3;
                        float f3;
                        t02 t02Var;
                        float f4;
                        char c2;
                        rs0 rs0Var2;
                        float f5;
                        float f6;
                        long jFloatToRawIntBits;
                        int iFloatToRawIntBits;
                        long jFloatToRawIntBits2;
                        long jFloatToRawIntBits3;
                        int iFloatToRawIntBits2;
                        qf0 qf0Var;
                        t02 t02Var2;
                        long jFloatToRawIntBits4;
                        int iFloatToRawIntBits3;
                        long jFloatToRawIntBits5;
                        long jFloatToRawIntBits6;
                        int iFloatToRawIntBits4;
                        qf0 qf0Var2;
                        long jFloatToRawIntBits7;
                        int iFloatToRawIntBits5;
                        long jFloatToRawIntBits8;
                        long jFloatToRawIntBits9;
                        int iFloatToRawIntBits6;
                        long jFloatToRawIntBits10;
                        float fT2;
                        float fT3;
                        qf0 qf0Var3 = (qf0) obj;
                        boolean zB = jd0.b(Float.NaN, Float.NaN);
                        t02 t02Var3 = t02.f;
                        h53 h53Var2 = h53Var;
                        if (zB) {
                            fT = (h53Var2.r == t02Var3 ? Float.intBitsToFloat((int) (qf0Var3.a() >> 32)) : Float.intBitsToFloat((int) (qf0Var3.a() & 4294967295L))) / 2.0f;
                        } else {
                            fT = qf0Var3.T(Float.NaN);
                        }
                        x43 x43Var = x43.a;
                        float[] fArr = h53Var2.l;
                        float fB = h53Var2.b();
                        int i7 = 0;
                        float fX0 = qf0Var3.X0(0);
                        float fX02 = qf0Var3.X0(0);
                        float fX03 = qf0Var3.X0(h53Var2.p.g());
                        float fX04 = qf0Var3.X0(h53Var2.q.g());
                        float fA1 = qf0Var3.a1(fT);
                        t02 t02Var4 = h53Var2.r;
                        boolean z2 = t02Var4 == t02Var3;
                        boolean z3 = qf0Var3.getLayoutDirection() == bb1.g;
                        boolean z4 = z3 && !z2;
                        float fT4 = qf0Var3.T(fA1);
                        if (z2) {
                            j5 = 4294967295L;
                            jA3 = qf0Var3.a() & 4294967295L;
                        } else {
                            j5 = 4294967295L;
                            jA3 = qf0Var3.a() >> 32;
                        }
                        float fIntBitsToFloat = Float.intBitsToFloat((int) jA3);
                        fArr.getClass();
                        if (s51.m(0.0f, fArr.length == 0 ? null : Float.valueOf(fArr[0])) || s51.m(0.0f, uj.X(fArr))) {
                        }
                        float f7 = (fArr.length == 0 || (s51.m(fB, fArr.length != 0 ? Float.valueOf(fArr[0]) : null) || s51.m(fB, uj.X(fArr)))) ? ((fIntBitsToFloat - 0.0f) * fB) + 0.0f : (((fIntBitsToFloat - 0.0f) - (fT4 * 2.0f)) * fB) + 0.0f + fT4;
                        int length = fArr.length;
                        float fT5 = qf0Var3.T(f2);
                        float f8 = f;
                        if (jd0.a(f8, 0.0f) > 0) {
                            if (z2) {
                                qf0Var3.T(fX02);
                                qf0Var3.T(f8);
                                fT2 = qf0Var3.T(fX04) / 2.0f;
                                fT3 = qf0Var3.T(f8);
                            } else {
                                qf0Var3.T(fX0);
                                qf0Var3.T(f8);
                                fT2 = qf0Var3.T(fX03) / 2.0f;
                                fT3 = qf0Var3.T(f8);
                            }
                            f3 = fT3 + fT2;
                        } else {
                            f3 = 0.0f;
                        }
                        long jY0 = qf0Var3.y0();
                        Float.intBitsToFloat((int) (z2 ? jY0 & j5 : jY0 >> 32));
                        float f9 = (fIntBitsToFloat - f3) - fT4;
                        rs0 rs0Var3 = rs0Var;
                        if (f7 < f9) {
                            float f10 = z4 ? fT4 : fT5;
                            float f11 = z4 ? fT5 : fT4;
                            float f12 = f7 + f3;
                            float f13 = fIntBitsToFloat - f12;
                            if (z2) {
                                jFloatToRawIntBits6 = Float.floatToRawIntBits(0.0f);
                                iFloatToRawIntBits4 = Float.floatToRawIntBits(f12);
                                f4 = 0.0f;
                                c2 = ' ';
                            } else {
                                f4 = 0.0f;
                                c2 = ' ';
                                if (z3) {
                                    jFloatToRawIntBits6 = Float.floatToRawIntBits(0.0f);
                                    iFloatToRawIntBits4 = Float.floatToRawIntBits(0.0f);
                                } else {
                                    jFloatToRawIntBits6 = Float.floatToRawIntBits(f12);
                                    iFloatToRawIntBits4 = Float.floatToRawIntBits(0.0f);
                                }
                            }
                            long j6 = (jFloatToRawIntBits6 << c2) | (((long) iFloatToRawIntBits4) & j5);
                            if (z2) {
                                jFloatToRawIntBits7 = Float.floatToRawIntBits(Float.intBitsToFloat((int) (qf0Var3.a() >> c2)));
                                qf0Var2 = qf0Var3;
                                jFloatToRawIntBits8 = Float.floatToRawIntBits(f13);
                            } else {
                                qf0Var2 = qf0Var3;
                                if (z3) {
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (qf0Var2.a() >> c2)) - f12;
                                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (qf0Var2.a() & j5));
                                    jFloatToRawIntBits7 = Float.floatToRawIntBits(fIntBitsToFloat2);
                                    iFloatToRawIntBits5 = Float.floatToRawIntBits(fIntBitsToFloat3);
                                } else {
                                    float fIntBitsToFloat4 = Float.intBitsToFloat((int) (qf0Var2.a() & j5));
                                    jFloatToRawIntBits7 = Float.floatToRawIntBits(f13);
                                    iFloatToRawIntBits5 = Float.floatToRawIntBits(fIntBitsToFloat4);
                                }
                                jFloatToRawIntBits8 = iFloatToRawIntBits5;
                            }
                            long j7 = (jFloatToRawIntBits8 & j5) | (jFloatToRawIntBits7 << c2);
                            t02Var = t02Var4;
                            qf0Var3 = qf0Var2;
                            rs0Var2 = rs0Var3;
                            x43.e(qf0Var3, t02Var, j6, j7, jA, f10, f11);
                            if (z2) {
                                jFloatToRawIntBits9 = Float.floatToRawIntBits(Float.intBitsToFloat((int) (qf0Var3.y0() >> c2)));
                                iFloatToRawIntBits6 = Float.floatToRawIntBits(fIntBitsToFloat - fT4);
                            } else if (z3) {
                                jFloatToRawIntBits10 = (((long) Float.floatToRawIntBits(fT4)) << c2) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (qf0Var3.y0() & j5)))) & j5);
                                if (rs0Var2 != null) {
                                    rs0Var2.f(qf0Var3, new gy1(jFloatToRawIntBits10));
                                }
                            } else {
                                float fIntBitsToFloat5 = Float.intBitsToFloat((int) (qf0Var3.y0() & j5));
                                jFloatToRawIntBits9 = Float.floatToRawIntBits(fIntBitsToFloat - fT4);
                                iFloatToRawIntBits6 = Float.floatToRawIntBits(fIntBitsToFloat5);
                            }
                            jFloatToRawIntBits10 = (((long) iFloatToRawIntBits6) & j5) | (jFloatToRawIntBits9 << c2);
                            if (rs0Var2 != null) {
                            }
                        } else {
                            t02Var = t02Var4;
                            f4 = 0.0f;
                            c2 = ' ';
                            rs0Var2 = rs0Var3;
                        }
                        float f14 = f7 - f3;
                        float f15 = !z4 ? fT4 : fT5;
                        float f16 = z4 ? fT4 : fT5;
                        float f17 = z4 ? f14 : f14 - f4;
                        if (f17 > f15) {
                            if (!z2 && z3) {
                                jFloatToRawIntBits3 = Float.floatToRawIntBits(Float.intBitsToFloat((int) (qf0Var3.a() >> c2)) - f14);
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(f4);
                            } else {
                                jFloatToRawIntBits3 = Float.floatToRawIntBits(f4);
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(f4);
                            }
                            long j8 = (jFloatToRawIntBits3 << c2) | (((long) iFloatToRawIntBits2) & j5);
                            if (z2) {
                                qf0Var = qf0Var3;
                                t02Var2 = t02Var;
                                jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(f17)) & j5) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (qf0Var3.a() >> c2)))) << c2);
                            } else {
                                qf0Var = qf0Var3;
                                t02Var2 = t02Var;
                                if (z3) {
                                    float fIntBitsToFloat6 = Float.intBitsToFloat((int) (qf0Var.a() & j5));
                                    jFloatToRawIntBits4 = Float.floatToRawIntBits(f14);
                                    iFloatToRawIntBits3 = Float.floatToRawIntBits(fIntBitsToFloat6);
                                } else {
                                    float fIntBitsToFloat7 = Float.intBitsToFloat((int) (qf0Var.a() & j5));
                                    jFloatToRawIntBits4 = Float.floatToRawIntBits(f17);
                                    iFloatToRawIntBits3 = Float.floatToRawIntBits(fIntBitsToFloat7);
                                }
                                jFloatToRawIntBits5 = (jFloatToRawIntBits4 << c2) | (((long) iFloatToRawIntBits3) & j5);
                            }
                            long j9 = jFloatToRawIntBits5;
                            qf0Var3 = qf0Var;
                            x43.e(qf0Var3, t02Var2, j8, j9, jA2, f15, f16);
                        }
                        float f18 = f4 + fT4;
                        float f19 = fIntBitsToFloat - fT4;
                        float f20 = f7 - f3;
                        float f21 = f7 + f3;
                        int length2 = fArr.length;
                        int i8 = 0;
                        while (i7 < length2) {
                            float f22 = fArr[i7];
                            int i9 = i8 + 1;
                            if (rs0Var2 == null || i8 != fArr.length - 1) {
                                float fN = lq.N(f18, f19, f22);
                                if (fN < f20 || fN > f21) {
                                    if (z2) {
                                        jFloatToRawIntBits = Float.floatToRawIntBits(Float.intBitsToFloat((int) (qf0Var3.y0() >> c2)));
                                        f5 = f18;
                                        f6 = f20;
                                        jFloatToRawIntBits2 = Float.floatToRawIntBits(fN);
                                    } else {
                                        f5 = f18;
                                        f6 = f20;
                                        if (z3) {
                                            float fIntBitsToFloat8 = Float.intBitsToFloat((int) (qf0Var3.a() >> c2)) - fN;
                                            float fIntBitsToFloat9 = Float.intBitsToFloat((int) (qf0Var3.y0() & j5));
                                            jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat8);
                                            iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat9);
                                        } else {
                                            float fIntBitsToFloat10 = Float.intBitsToFloat((int) (qf0Var3.y0() & j5));
                                            jFloatToRawIntBits = Float.floatToRawIntBits(fN);
                                            iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat10);
                                        }
                                        jFloatToRawIntBits2 = iFloatToRawIntBits;
                                    }
                                    ss0Var.e(qf0Var3, new gy1((jFloatToRawIntBits2 & j5) | (jFloatToRawIntBits << c2)), new wx((fN < f4 || fN > f14) ? j3 : j4));
                                } else {
                                    f5 = f18;
                                    f6 = f20;
                                }
                            }
                            i7++;
                            i8 = i9;
                            f18 = f5;
                            f20 = f6;
                        }
                        return dm3.a;
                    }
                };
                nv0Var2.j0(ns0Var);
                objO2 = ns0Var;
            } else {
                nv0Var2 = nv0Var;
            }
            vr.a(0, (ns0) objO2, nv0Var2, bq1VarD2);
        } else {
            nv0Var2 = nv0Var;
            nv0Var2.U();
        }
        xj2 xj2VarT = nv0Var2.t();
        if (xj2VarT != null) {
            xj2VarT.d = new rs0() { // from class: w43
                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.f.c(h53Var, bq1Var, z, r43Var, rs0Var, ss0Var, f, f2, (nv0) obj, jo3.y(i | 1), jo3.y(i2));
                    return dm3.a;
                }
            };
        }
    }
}
