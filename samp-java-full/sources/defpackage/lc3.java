package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class lc3 {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final long e;

    static {
        gy gyVar = cd2.a;
        a = cd2.e;
        b = 16.0f;
        c = 14.0f;
        d = 6.0f;
        e = oz2.w(20);
    }

    public static final void a(final boolean z, final cs0 cs0Var, final bq1 bq1Var, final boolean z2, final long j, final long j2, final d00 d00Var, nv0 nv0Var, final int i) {
        int i2;
        cs0 cs0Var2;
        nv0Var.b0(-1573136853);
        if ((i & 6) == 0) {
            i2 = (nv0Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            cs0Var2 = cs0Var;
            i2 |= nv0Var.h(cs0Var2) ? 32 : 16;
        } else {
            cs0Var2 = cs0Var;
        }
        if ((i & 384) == 0) {
            i2 |= nv0Var.f(bq1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= nv0Var.g(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= nv0Var.e(j) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= nv0Var.e(j2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= nv0Var.f(null) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= nv0Var.h(d00Var) ? 8388608 : 4194304;
        }
        if (nv0Var.R(i2 & 1, (4793491 & i2) != 4793490)) {
            nv0Var.W();
            if ((i & 1) != 0 && !nv0Var.A()) {
                nv0Var.U();
            }
            nv0Var.q();
            d00 d00VarN = gq.N(1128552423, new jc3(bq1Var, z, ko2.a(0.0f, 2, j, true), z2, cs0Var2, d00Var), nv0Var);
            int i3 = i2 >> 12;
            d(j, j2, z, d00VarN, nv0Var, ((i2 << 6) & 896) | (i3 & 112) | (i3 & 14) | 3072);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new rs0() { // from class: hc3
                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    lc3.a(z, cs0Var, bq1Var, z2, j, j2, d00Var, (nv0) obj, jo3.y(i | 1));
                    return dm3.a;
                }
            };
        }
    }

    public static final void b(final boolean z, final cs0 cs0Var, bq1 bq1Var, boolean z2, final rs0 rs0Var, long j, long j2, nv0 nv0Var, final int i) {
        final bq1 bq1Var2;
        final boolean z3;
        final long j3;
        final long j4;
        int i2;
        bq1 bq1Var3;
        long j5;
        boolean z4;
        long j6;
        d00 d00VarN;
        nv0Var.b0(1015017965);
        int i3 = 2;
        int i4 = i | (nv0Var.g(z) ? 4 : 2) | (nv0Var.h(cs0Var) ? 32 : 16) | 105581952;
        if (nv0Var.R(i4 & 1, (38347923 & i4) != 38347922)) {
            nv0Var.W();
            if ((i & 1) == 0 || nv0Var.A()) {
                long j7 = ((wx) nv0Var.j(t30.a)).a;
                i2 = i4 & (-33030145);
                bq1Var3 = yp1.a;
                j5 = j7;
                z4 = true;
                j6 = j5;
            } else {
                nv0Var.U();
                i2 = i4 & (-33030145);
                bq1Var3 = bq1Var;
                z4 = z2;
                j6 = j;
                j5 = j2;
            }
            nv0Var.q();
            if (rs0Var == null) {
                nv0Var.a0(1830899669);
                nv0Var.p(false);
                d00VarN = null;
            } else {
                nv0Var.a0(1830899670);
                d00VarN = gq.N(-1745256900, new y4(7, rs0Var), nv0Var);
                nv0Var.p(false);
            }
            a(z, cs0Var, vm1.C(bq1Var3, new z1(i3)), z4, j6, j5, gq.N(-906085472, new b12(1, d00VarN), nv0Var), nv0Var, (i2 & 112) | (i2 & 14) | 12582912 | 1575936);
            bq1Var2 = bq1Var3;
            z3 = z4;
            j3 = j6;
            j4 = j5;
        } else {
            nv0Var.U();
            bq1Var2 = bq1Var;
            z3 = z2;
            j3 = j;
            j4 = j2;
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new rs0(z, cs0Var, bq1Var2, z3, rs0Var, j3, j4, i) { // from class: gc3
                public final /* synthetic */ boolean f;
                public final /* synthetic */ cs0 g;
                public final /* synthetic */ bq1 h;
                public final /* synthetic */ boolean i;
                public final /* synthetic */ rs0 j;
                public final /* synthetic */ long k;
                public final /* synthetic */ long l;

                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = jo3.y(24577);
                    lc3.b(this.f, this.g, this.h, this.i, this.j, this.k, this.l, (nv0) obj, iY);
                    return dm3.a;
                }
            };
        }
    }

    public static final void c(rs0 rs0Var, nv0 nv0Var, int i) {
        boolean z;
        vm vmVar = f5.g;
        nv0Var.b0(-1349901398);
        int i2 = 2;
        int i3 = (nv0Var.h(rs0Var) ? 4 : 2) | i | (nv0Var.h(null) ? 32 : 16);
        if (nv0Var.R(i3 & 1, (i3 & 19) != 18)) {
            int i4 = i3 & 14;
            boolean z2 = ((i3 & 112) == 32) | (i4 == 4);
            Object objO = nv0Var.O();
            if (z2 || objO == c20.a) {
                objO = new rg1(i2, rs0Var);
                nv0Var.j0(objO);
            }
            cn1 cn1Var = (cn1) objO;
            int iC = lq.C(nv0Var);
            n52 n52VarL = nv0Var.l();
            yp1 yp1Var = yp1.a;
            bq1 bq1VarM = lr.M(nv0Var, yp1Var);
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
            y02.F(z00Var, nv0Var, cn1Var);
            z00 z00Var2 = f5.D;
            y02.F(z00Var2, nv0Var, n52VarL);
            z00 z00Var3 = f5.F;
            if (nv0Var.S || !s51.n(nv0Var.O(), Integer.valueOf(iC))) {
                nc2.q(iC, nv0Var, iC, z00Var3);
            }
            z00 z00Var4 = f5.C;
            y02.F(z00Var4, nv0Var, bq1VarM);
            if (rs0Var != null) {
                nv0Var.a0(870361332);
                bq1 bq1VarL = f80.L(r51.u(yp1Var, "text"), b, 0.0f, 2);
                cn1 cn1VarD = eo.d(vmVar, false);
                int iC2 = lq.C(nv0Var);
                n52 n52VarL2 = nv0Var.l();
                bq1 bq1VarM2 = lr.M(nv0Var, bq1VarL);
                nv0Var.d0();
                if (nv0Var.S) {
                    nv0Var.k(x91Var);
                } else {
                    nv0Var.m0();
                }
                y02.F(z00Var, nv0Var, cn1VarD);
                y02.F(z00Var2, nv0Var, n52VarL2);
                if (nv0Var.S || !s51.n(nv0Var.O(), Integer.valueOf(iC2))) {
                    nc2.q(iC2, nv0Var, iC2, z00Var3);
                }
                y02.F(z00Var4, nv0Var, bq1VarM2);
                rs0Var.f(nv0Var, Integer.valueOf(i4));
                z = true;
                nv0Var.p(true);
                nv0Var.p(false);
            } else {
                z = true;
                nv0Var.a0(870466081);
                nv0Var.p(false);
            }
            nv0Var.a0(870557345);
            nv0Var.p(false);
            nv0Var.p(z);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new xi1(i, rs0Var);
        }
    }

    public static final void d(final long j, final long j2, boolean z, final d00 d00Var, nv0 nv0Var, final int i) {
        int i2;
        final boolean z2;
        int i3;
        long j3;
        boolean z3;
        s83 s83VarR;
        nv0Var.b0(-833145221);
        if ((i & 6) == 0) {
            i2 = (nv0Var.e(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= nv0Var.e(j2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i2 |= nv0Var.g(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= nv0Var.h(d00Var) ? 2048 : 1024;
        }
        if (nv0Var.R(i2 & 1, (i2 & 1171) != 1170)) {
            int i4 = i2 >> 6;
            gk3 gk3VarD0 = w7.d0(Boolean.valueOf(z2), null, nv0Var, i4 & 14, 2);
            d42 d42Var = gk3VarD0.d;
            boolean zBooleanValue = ((Boolean) d42Var.getValue()).booleanValue();
            nv0Var.a0(-1069234984);
            long j4 = zBooleanValue ? j : j2;
            nv0Var.p(false);
            iy iyVarF = wx.f(j4);
            boolean zF = nv0Var.f(iyVarF);
            Object objO = nv0Var.O();
            if (zF || objO == c20.a) {
                bl3 bl3Var = new bl3(hd.m, new kd(2, iyVarF));
                nv0Var.j0(bl3Var);
                objO = bl3Var;
            }
            bl3 bl3Var2 = (bl3) objO;
            boolean zBooleanValue2 = ((Boolean) gk3VarD0.a.h()).booleanValue();
            nv0Var.a0(-1069234984);
            if (zBooleanValue2) {
                i3 = i4;
                j3 = j;
            } else {
                i3 = i4;
                j3 = j2;
            }
            nv0Var.p(false);
            wx wxVar = new wx(j3);
            boolean zBooleanValue3 = ((Boolean) d42Var.getValue()).booleanValue();
            nv0Var.a0(-1069234984);
            long j5 = zBooleanValue3 ? j : j2;
            nv0Var.p(false);
            wx wxVar2 = new wx(j5);
            ck3 ck3VarF = gk3VarD0.f();
            nv0Var.a0(1058649156);
            if (ck3VarF.b(Boolean.FALSE, Boolean.TRUE)) {
                nv0Var.a0(272207019);
                s83VarR = uq.R(pq1.h, nv0Var);
                z3 = false;
                nv0Var.p(false);
            } else {
                z3 = false;
                nv0Var.a0(272326989);
                s83VarR = uq.R(pq1.i, nv0Var);
                nv0Var.p(false);
            }
            nv0Var.p(z3);
            vr.c(nc2.f(((wx) w7.H(gk3VarD0, wxVar, wxVar2, s83VarR, bl3Var2, nv0Var, 0).o.getValue()).a, t30.a), d00Var, nv0Var, (i3 & 112) | 8);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new rs0() { // from class: ic3
                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    lc3.d(j, j2, z2, d00Var, (nv0) obj, jo3.y(i | 1));
                    return dm3.a;
                }
            };
        }
    }
}
