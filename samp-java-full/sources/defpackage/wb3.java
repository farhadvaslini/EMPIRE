package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class wb3 {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final s63 f;

    static {
        float f2 = gv3.o0;
        a = f2;
        b = gv3.y0;
        c = gv3.v0;
        float f3 = gv3.s0;
        d = f3;
        e = (f3 - f2) / 2.0f;
        f = new s63(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final boolean z, final ns0 ns0Var, bq1 bq1Var, boolean z2, tb3 tb3Var, nv0 nv0Var, final int i, final int i2) {
        int i3;
        bq1 bq1Var2;
        int i4;
        boolean z3;
        tb3 tb3Var2;
        int i5;
        final bq1 bq1Var3;
        final tb3 tb3Var3;
        final boolean z4;
        xj2 xj2VarT;
        tb3 tb3Var4;
        boolean z5;
        int i6;
        tb3 tb3Var5;
        nv0Var.b0(-263339167);
        if ((i & 6) == 0) {
            i3 = (nv0Var.g(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= nv0Var.h(ns0Var) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                bq1Var2 = bq1Var;
                i3 |= nv0Var.f(bq1Var2) ? 256 : 128;
            }
            int i8 = i3 | 3072;
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    z3 = z2;
                    i8 |= nv0Var.g(z3) ? 16384 : 8192;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        tb3Var2 = tb3Var;
                        int i9 = nv0Var.f(tb3Var2) ? 131072 : 65536;
                        i8 |= i9;
                    } else {
                        tb3Var2 = tb3Var;
                    }
                    i8 |= i9;
                } else {
                    tb3Var2 = tb3Var;
                }
                i5 = i8 | 1572864;
                if (nv0Var.R(i5 & 1, (599187 & i5) != 599186)) {
                    nv0Var.W();
                    int i10 = i & 1;
                    bq1 bq1VarK = yp1.a;
                    if (i10 == 0 || nv0Var.A()) {
                        if (i7 != 0) {
                            bq1Var2 = bq1VarK;
                        }
                        boolean z6 = i4 == 0 ? z3 : true;
                        if ((i2 & 32) != 0) {
                            fy fyVar = (fy) nv0Var.j(hy.a);
                            tb3 tb3Var6 = fyVar.o0;
                            long j = fyVar.p;
                            if (tb3Var6 == null) {
                                long jD = hy.d(fyVar, gv3.n0);
                                long jD2 = hy.d(fyVar, gv3.q0);
                                long j2 = wx.f;
                                long jD3 = hy.d(fyVar, gv3.p0);
                                long jD4 = hy.d(fyVar, gv3.x0);
                                long jD5 = hy.d(fyVar, gv3.A0);
                                long jD6 = hy.d(fyVar, gv3.w0);
                                long jD7 = hy.d(fyVar, gv3.z0);
                                long jX = vp.x(wx.b(gv3.a0, hy.d(fyVar, gv3.Z)), j);
                                long jD8 = hy.d(fyVar, gv3.d0);
                                float f2 = gv3.e0;
                                i6 = -458753;
                                tb3Var5 = new tb3(jD, jD2, j2, jD3, jD4, jD5, jD6, jD7, jX, vp.x(wx.b(f2, jD8), j), j2, vp.x(wx.b(gv3.c0, hy.d(fyVar, gv3.b0)), j), vp.x(wx.b(gv3.g0, hy.d(fyVar, gv3.f0)), j), vp.x(wx.b(f2, hy.d(fyVar, gv3.j0)), j), vp.x(wx.b(f2, hy.d(fyVar, gv3.k0)), j), vp.x(wx.b(gv3.i0, hy.d(fyVar, gv3.h0)), j));
                                fyVar.o0 = tb3Var5;
                            } else {
                                i6 = -458753;
                                tb3Var5 = tb3Var6;
                            }
                            i5 &= i6;
                            tb3Var2 = tb3Var5;
                        }
                        tb3Var4 = tb3Var2;
                        z5 = z6;
                    } else {
                        nv0Var.U();
                        if ((i2 & 32) != 0) {
                            i5 &= -458753;
                        }
                        z5 = z3;
                        tb3Var4 = tb3Var2;
                    }
                    bq1 bq1Var4 = bq1Var2;
                    nv0Var.q();
                    nv0Var.a0(1768604058);
                    Object objO = nv0Var.O();
                    if (objO == c20.a) {
                        objO = nc2.e(nv0Var);
                    }
                    qr1 qr1Var = (qr1) objO;
                    nv0Var.p(false);
                    if (ns0Var != null) {
                        ry0 ry0Var = w41.a;
                        bq1VarK = gv3.K(z, qr1Var, z5, new no2(2), ns0Var);
                    }
                    bq1 bq1VarS = j43.s(bq1Var4.d(bq1VarK));
                    float f3 = c;
                    float f4 = d;
                    int i11 = i5 << 3;
                    int i12 = i5 >> 6;
                    b(bq1VarS.d(new i43(f3, f4, f3, f4, false)), z, z5, tb3Var4, qr1Var, g23.a(gv3.l0, nv0Var), nv0Var, (i12 & 7168) | (i11 & 112) | (i12 & 896) | (i11 & 57344));
                    z4 = z5;
                    tb3Var3 = tb3Var4;
                    bq1Var3 = bq1Var4;
                } else {
                    nv0Var.U();
                    bq1Var3 = bq1Var2;
                    tb3Var3 = tb3Var2;
                    z4 = z3;
                }
                xj2VarT = nv0Var.t();
                if (xj2VarT != null) {
                    xj2VarT.d = new rs0() { // from class: ub3
                        @Override // defpackage.rs0
                        public final Object f(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            wb3.a(z, ns0Var, bq1Var3, z4, tb3Var3, (nv0) obj, jo3.y(i | 1), i2);
                            return dm3.a;
                        }
                    };
                    return;
                }
                return;
            }
            i8 = i3 | 27648;
            z3 = z2;
            if ((196608 & i) == 0) {
            }
            i5 = i8 | 1572864;
            if (nv0Var.R(i5 & 1, (599187 & i5) != 599186)) {
            }
            xj2VarT = nv0Var.t();
            if (xj2VarT != null) {
            }
        }
        bq1Var2 = bq1Var;
        int i82 = i3 | 3072;
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        z3 = z2;
        if ((196608 & i) == 0) {
        }
        i5 = i82 | 1572864;
        if (nv0Var.R(i5 & 1, (599187 & i5) != 599186)) {
        }
        xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
        }
    }

    public static final void b(final bq1 bq1Var, final boolean z, final boolean z2, final tb3 tb3Var, final t41 t41Var, final z13 z13Var, nv0 nv0Var, final int i) {
        int i2;
        long j;
        long j2;
        nv0Var.b0(-670917213);
        if ((i & 6) == 0) {
            i2 = (nv0Var.f(bq1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= nv0Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= nv0Var.g(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= nv0Var.f(tb3Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= nv0Var.h(null) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= nv0Var.f(t41Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= nv0Var.f(z13Var) ? 1048576 : 524288;
        }
        if (nv0Var.R(i2 & 1, (599187 & i2) != 599186)) {
            long j3 = z2 ? z ? tb3Var.b : tb3Var.f : z ? tb3Var.j : tb3Var.n;
            long j4 = z2 ? z ? tb3Var.a : tb3Var.e : z ? tb3Var.i : tb3Var.m;
            z13 z13VarA = g23.a(gv3.u0, nv0Var);
            float f2 = gv3.t0;
            if (z2) {
                j = j4;
                j2 = z ? tb3Var.c : tb3Var.g;
            } else {
                j = j4;
                j2 = z ? tb3Var.k : tb3Var.o;
            }
            bq1 bq1VarV = gv3.v(bq1Var.d(new kn(f2, new w73(j2), z13VarA)), j3, z13VarA);
            cn1 cn1VarD = eo.d(f5.g, false);
            int iC = lq.C(nv0Var);
            n52 n52VarL = nv0Var.l();
            bq1 bq1VarM = lr.M(nv0Var, bq1VarV);
            w10.c.getClass();
            nv0Var.d0();
            boolean z3 = nv0Var.S;
            x91 x91Var = tb1.Y;
            if (z3) {
                nv0Var.k(x91Var);
            } else {
                nv0Var.m0();
            }
            z00 z00Var = f5.E;
            y02.F(z00Var, nv0Var, cn1VarD);
            z00 z00Var2 = f5.D;
            y02.F(z00Var2, nv0Var, n52VarL);
            z00 z00Var3 = f5.F;
            if (nv0Var.S || !s51.n(nv0Var.O(), Integer.valueOf(iC))) {
                nc2.q(iC, nv0Var, iC, z00Var3);
            }
            z00 z00Var4 = f5.C;
            y02.F(z00Var4, nv0Var, bq1VarM);
            bq1 bq1VarV2 = gv3.v(l11.a(jo.a.a(yp1.a, f5.j).d(new yh3(t41Var, z, uq.R(pq1.g, nv0Var))), t41Var, ko2.a(gv3.r0 / 2.0f, 4, 0L, false)), j, z13Var);
            cn1 cn1VarD2 = eo.d(f5.k, false);
            int iC2 = lq.C(nv0Var);
            n52 n52VarL2 = nv0Var.l();
            bq1 bq1VarM2 = lr.M(nv0Var, bq1VarV2);
            nv0Var.d0();
            if (nv0Var.S) {
                nv0Var.k(x91Var);
            } else {
                nv0Var.m0();
            }
            y02.F(z00Var, nv0Var, cn1VarD2);
            y02.F(z00Var2, nv0Var, n52VarL2);
            if (nv0Var.S || !s51.n(nv0Var.O(), Integer.valueOf(iC2))) {
                nc2.q(iC2, nv0Var, iC2, z00Var3);
            }
            y02.F(z00Var4, nv0Var, bq1VarM2);
            nv0Var.a0(1236071411);
            nv0Var.p(false);
            nv0Var.p(true);
            nv0Var.p(true);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new rs0() { // from class: vb3
                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    wb3.b(bq1Var, z, z2, tb3Var, t41Var, z13Var, (nv0) obj, jo3.y(i | 1));
                    return dm3.a;
                }
            };
        }
    }
}
