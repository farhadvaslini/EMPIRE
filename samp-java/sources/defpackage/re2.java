package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class re2 {
    public static final re2 a = new re2();
    public static final to2 b = uo2.a;
    public static final float c = 80.0f;
    public static final float d = 80.0f;
    public static final float e = 3.0f;

    public final void a(final af2 af2Var, final boolean z, final bq1 bq1Var, long j, long j2, float f, nv0 nv0Var, final int i) {
        final long j3;
        final long j4;
        final float f2;
        int i2;
        float f3;
        long j5;
        long j6;
        nv0Var.b0(-1076870256);
        int i3 = i | (nv0Var.f(af2Var) ? 4 : 2) | (nv0Var.g(z) ? 32 : 16) | (nv0Var.f(bq1Var) ? 256 : 128) | 74752;
        if (nv0Var.R(i3 & 1, (599187 & i3) != 599186)) {
            nv0Var.W();
            if ((i & 1) == 0 || nv0Var.A()) {
                r93 r93Var = hy.a;
                long j7 = ((fy) nv0Var.j(r93Var)).G;
                long j8 = ((fy) nv0Var.j(r93Var)).s;
                i2 = i3 & (-523265);
                f3 = d;
                j5 = j8;
                j6 = j7;
            } else {
                nv0Var.U();
                i2 = i3 & (-523265);
                j6 = j;
                j5 = j2;
                f3 = f;
            }
            nv0Var.q();
            b(af2Var, z, bq1Var, f3, null, j6, 0.0f, gq.N(298232649, new qe2(z, j5, af2Var), nv0Var), nv0Var, (i2 & 896) | (i2 & 14) | 12582912 | (i2 & 112) | 100663296);
            f2 = f3;
            j3 = j6;
            j4 = j5;
        } else {
            nv0Var.U();
            j3 = j;
            j4 = j2;
            f2 = f;
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new rs0(af2Var, z, bq1Var, j3, j4, f2, i) { // from class: je2
                public final /* synthetic */ af2 g;
                public final /* synthetic */ boolean h;
                public final /* synthetic */ bq1 i;
                public final /* synthetic */ long j;
                public final /* synthetic */ long k;
                public final /* synthetic */ float l;

                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = jo3.y(1572865);
                    this.f.a(this.g, this.h, this.i, this.j, this.k, this.l, (nv0) obj, iY);
                    return dm3.a;
                }
            };
        }
    }

    public final void b(final af2 af2Var, final boolean z, final bq1 bq1Var, final float f, z13 z13Var, final long j, float f2, final d00 d00Var, nv0 nv0Var, final int i) {
        final af2 af2Var2;
        int i2;
        re2 re2Var;
        final z13 z13Var2;
        final float f3;
        int i3;
        z13 z13Var3;
        final z13 z13Var4;
        nv0Var.b0(-1341144489);
        if ((i & 6) == 0) {
            af2Var2 = af2Var;
            i2 = (nv0Var.f(af2Var2) ? 4 : 2) | i;
        } else {
            af2Var2 = af2Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= nv0Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= nv0Var.f(bq1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= nv0Var.c(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= nv0Var.e(j) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= nv0Var.h(d00Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            re2Var = this;
            i2 |= nv0Var.f(re2Var) ? 67108864 : 33554432;
        } else {
            re2Var = this;
        }
        if (nv0Var.R(i2 & 1, (38347923 & i2) != 38347922)) {
            nv0Var.W();
            if ((i & 1) == 0 || nv0Var.A()) {
                i3 = i2 & (-3727361);
                z13Var3 = b;
                f3 = e;
            } else {
                nv0Var.U();
                i3 = i2 & (-3727361);
                z13Var3 = z13Var;
                f3 = f2;
            }
            int i4 = i3;
            nv0Var.q();
            bq1 bq1VarK = j43.k(bq1Var, 40.0f);
            Object objO = nv0Var.O();
            zj zjVar = c20.a;
            if (objO == zjVar) {
                objO = new s12(23);
                nv0Var.j0(objO);
            }
            bq1 bq1VarM = w7.M(bq1VarK, (ns0) objO);
            boolean zC = ((i4 & 112) == 32) | ((i4 & 14) == 4) | ((((i4 & 7168) ^ 3072) > 2048 && nv0Var.c(f)) || (i4 & 3072) == 2048) | nv0Var.c(f3) | nv0Var.f(z13Var3);
            Object objO2 = nv0Var.O();
            if (zC || objO2 == zjVar) {
                z13Var4 = z13Var3;
                ss0 ss0Var = new ss0() { // from class: ke2
                    @Override // defpackage.ss0
                    public final Object e(Object obj, Object obj2, Object obj3) {
                        final i62 i62VarT = ((xm1) obj2).t(((m30) obj3).a);
                        int i5 = i62VarT.f;
                        int i6 = i62VarT.g;
                        final af2 af2Var3 = af2Var2;
                        final boolean z2 = z;
                        final float f4 = f;
                        final float f5 = f3;
                        final z13 z13Var5 = z13Var4;
                        return ((en1) obj).I0(i5, i6, oi0.f, new ns0() { // from class: me2
                            @Override // defpackage.ns0
                            public final Object h(Object obj4) {
                                final af2 af2Var4 = af2Var3;
                                final boolean z3 = z2;
                                final float f6 = f4;
                                final float f7 = f5;
                                final z13 z13Var6 = z13Var5;
                                h62.I((h62) obj4, i62VarT, 0, 0, new ns0() { // from class: ne2
                                    @Override // defpackage.ns0
                                    public final Object h(Object obj5) {
                                        uw0 uw0Var = (uw0) obj5;
                                        af2 af2Var5 = af2Var4;
                                        boolean z4 = ((Number) af2Var5.a.d()).floatValue() > 0.0f || z3;
                                        uw0Var.k((((Number) af2Var5.a.d()).floatValue() * uw0Var.p0(f6)) - Float.intBitsToFloat((int) (uw0Var.a() & 4294967295L)));
                                        uw0Var.g(z4 ? uw0Var.h() * f7 : 0.0f);
                                        uw0Var.P(z13Var6);
                                        uw0Var.o(true);
                                        return dm3.a;
                                    }
                                });
                                return dm3.a;
                            }
                        });
                    }
                };
                nv0Var.j0(ss0Var);
                objO2 = ss0Var;
            } else {
                z13Var4 = z13Var3;
            }
            bq1 bq1VarV = gv3.v(vm1.C(bq1VarM, (ss0) objO2), j, z13Var4);
            int i5 = ((i4 >> 12) & 7168) | 48;
            cn1 cn1VarD = eo.d(f5.k, false);
            int iC = lq.C(nv0Var);
            n52 n52VarL = nv0Var.l();
            bq1 bq1VarM2 = lr.M(nv0Var, bq1VarV);
            w10.c.getClass();
            nv0Var.d0();
            if (nv0Var.S) {
                nv0Var.k(tb1.Y);
            } else {
                nv0Var.m0();
            }
            y02.F(f5.E, nv0Var, cn1VarD);
            y02.F(f5.D, nv0Var, n52VarL);
            z00 z00Var = f5.F;
            if (nv0Var.S || !s51.n(nv0Var.O(), Integer.valueOf(iC))) {
                nc2.q(iC, nv0Var, iC, z00Var);
            }
            y02.F(f5.C, nv0Var, bq1VarM2);
            d00Var.e(jo.a, nv0Var, Integer.valueOf(((i5 >> 6) & 112) | 6));
            nv0Var.p(true);
            z13Var2 = z13Var4;
        } else {
            nv0Var.U();
            z13Var2 = z13Var;
            f3 = f2;
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            final re2 re2Var2 = re2Var;
            xj2VarT.d = new rs0() { // from class: le2
                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.f.b(af2Var, z, bq1Var, f, z13Var2, j, f3, d00Var, (nv0) obj, jo3.y(i | 1));
                    return dm3.a;
                }
            };
        }
    }
}
