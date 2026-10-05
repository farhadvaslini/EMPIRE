package defpackage;

import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class iv1 {
    public static final float a = cl3.l0;
    public static final float b = 8.0f;
    public static final float c = 4.0f;
    public static final float d = 16.0f;
    public static final float e = 4.0f;
    public static final float f = 12.0f;
    public static final float g = 44.0f;
    public static final t20 h = new t20(new x91(25));

    public static final void a(bq1 bq1Var, long j, long j2, js3 js3Var, final d00 d00Var, nv0 nv0Var, final int i) {
        final bq1 bq1Var2;
        final long j3;
        final long j4;
        final js3 js3Var2;
        long j5;
        bq1 bq1Var3;
        long j6;
        js3 js3Var3;
        nv0Var.b0(1054099326);
        int i2 = i | 11414;
        if (nv0Var.R(i2 & 1, (74899 & i2) != 74898)) {
            nv0Var.W();
            if ((i & 1) == 0 || nv0Var.A()) {
                long jE = hy.e(cl3.e0, nv0Var);
                long jA = hy.a((fy) nv0Var.j(hy.a), jE);
                WeakHashMap weakHashMap = qt3.w;
                xf1 xf1Var = new xf1(new am3(ak2.e(nv0Var).g, ak2.e(nv0Var).b), 15 | 32);
                j5 = jE;
                bq1Var3 = yp1.a;
                j6 = jA;
                js3Var3 = xf1Var;
            } else {
                nv0Var.U();
                bq1Var3 = bq1Var;
                j5 = j;
                j6 = j2;
                js3Var3 = js3Var;
            }
            nv0Var.q();
            ((d90) nv0Var.j(h)).a(new jv1(bq1Var3, j5, j6, js3Var3, d00Var), nv0Var, 0);
            bq1Var2 = bq1Var3;
            j3 = j5;
            j4 = j6;
            js3Var2 = js3Var3;
        } else {
            nv0Var.U();
            bq1Var2 = bq1Var;
            j3 = j;
            j4 = j2;
            js3Var2 = js3Var;
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new rs0(j3, j4, js3Var2, d00Var, i) { // from class: zu1
                public final /* synthetic */ long g;
                public final /* synthetic */ long h;
                public final /* synthetic */ js3 i;
                public final /* synthetic */ d00 j;

                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = jo3.y(196609);
                    iv1.a(this.f, this.g, this.h, this.i, this.j, (nv0) obj, iY);
                    return dm3.a;
                }
            };
        }
    }

    public static final void b(final ep2 ep2Var, final boolean z, final cs0 cs0Var, final d00 d00Var, bq1 bq1Var, boolean z2, final rs0 rs0Var, boolean z3, yu1 yu1Var, nv0 nv0Var, final int i) {
        int i2;
        nv0 nv0Var2;
        bq1 bq1Var2;
        final boolean z4;
        final boolean z5;
        final yu1 yu1Var2;
        int i3;
        yu1 yu1Var3;
        int i4;
        bq1 bq1Var3;
        yu1 yu1Var4;
        boolean z6;
        boolean z7;
        yu1 yu1Var5;
        d00 d00VarN;
        nv0Var.b0(974293026);
        if ((i & 6) == 0) {
            i2 = (nv0Var.f(ep2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= nv0Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= nv0Var.h(cs0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= nv0Var.h(d00Var) ? 2048 : 1024;
        }
        int i5 = i2 | 221184;
        if ((1572864 & i) == 0) {
            i5 |= nv0Var.h(rs0Var) ? 1048576 : 524288;
        }
        int i6 = 12582912 | i5;
        if ((100663296 & i) == 0) {
            i6 = 46137344 | i5;
        }
        int i7 = 805306368 | i6;
        if (nv0Var.R(i7 & 1, (306783379 & i7) != 306783378)) {
            nv0Var.W();
            if ((i & 1) == 0 || nv0Var.A()) {
                fy fyVar = (fy) nv0Var.j(hy.a);
                yu1 yu1Var6 = fyVar.j0;
                if (yu1Var6 == null) {
                    long jD = hy.d(fyVar, cl3.f0);
                    long jD2 = hy.d(fyVar, cl3.i0);
                    long jD3 = hy.d(fyVar, cl3.g0);
                    gy gyVar = cl3.j0;
                    long jD4 = hy.d(fyVar, gyVar);
                    i3 = -234881025;
                    gy gyVar2 = cl3.k0;
                    yu1Var3 = new yu1(jD, jD2, jD3, jD4, hy.d(fyVar, gyVar2), wx.b(0.38f, hy.d(fyVar, gyVar)), wx.b(0.38f, hy.d(fyVar, gyVar2)));
                    fyVar.j0 = yu1Var3;
                } else {
                    i3 = -234881025;
                    yu1Var3 = yu1Var6;
                }
                i4 = i7 & i3;
                bq1Var3 = yp1.a;
                yu1Var4 = yu1Var3;
                z6 = true;
                z7 = true;
            } else {
                nv0Var.U();
                i4 = i7 & (-234881025);
                bq1Var3 = bq1Var;
                z6 = z2;
                z7 = z3;
                yu1Var4 = yu1Var;
            }
            int i8 = i4;
            nv0Var.q();
            nv0Var.a0(-224963495);
            Object objO = nv0Var.O();
            zj zjVar = c20.a;
            if (objO == zjVar) {
                objO = nc2.e(nv0Var);
            }
            qr1 qr1Var = (qr1) objO;
            nv0Var.p(false);
            pq1 pq1Var = pq1.h;
            s83 s83VarR = uq.R(pq1Var, nv0Var);
            boolean z8 = z7;
            d00 d00VarN2 = gq.N(-876637252, new fv1(yu1Var4, z, z6, s83VarR, rs0Var, z7, d00Var, 0), nv0Var);
            if (rs0Var == null) {
                nv0Var.a0(-224036658);
                nv0Var.p(false);
                d00VarN = null;
                yu1Var5 = yu1Var4;
            } else {
                nv0Var.a0(-224036657);
                yu1Var5 = yu1Var4;
                d00VarN = gq.N(802208206, new gv1(yu1Var4, z, z6, s83VarR, rs0Var, 0), nv0Var);
                nv0Var.p(false);
            }
            d00 d00Var2 = d00VarN;
            Object objO2 = nv0Var.O();
            if (objO2 == zjVar) {
                objO2 = new a42(0);
                nv0Var.j0(objO2);
            }
            a42 a42Var = (a42) objO2;
            boolean z9 = z6;
            bq1 bq1Var4 = bq1Var3;
            bq1Var2 = bq1Var4;
            bq1 bq1VarA = ep2Var.a(j43.b(gv3.J(bq1Var4, z, qr1Var, null, z9, new no2(4), cs0Var), 0.0f, a, 1));
            Object objO3 = nv0Var.O();
            if (objO3 == zjVar) {
                objO3 = new q81(a42Var, 2);
                nv0Var.j0(objO3);
            }
            bq1 bq1VarW = cl3.w(bq1VarA, (ns0) objO3);
            cn1 cn1VarD = eo.d(f5.k, true);
            int iC = lq.C(nv0Var);
            n52 n52VarL = nv0Var.l();
            bq1 bq1VarM = lr.M(nv0Var, bq1VarW);
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
            y02.F(f5.C, nv0Var, bq1VarM);
            e93 e93VarB = gd.b(z ? 1.0f : 0.0f, uq.R(pq1Var, nv0Var), null, nv0Var, 0, 28);
            e93 e93VarB2 = gd.b(z ? 1.0f : 0.0f, uq.R(pq1.g, nv0Var), null, nv0Var, 0, 28);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(((ua0) nv0Var.j(s20.h)).T(f))) & 4294967295L) | (((long) Float.floatToRawIntBits((a42Var.g() - r3.p0(56.0f)) / 2.0f)) << 32);
            boolean zF = nv0Var.f(qr1Var) | nv0Var.e(jFloatToRawIntBits);
            Object objO4 = nv0Var.O();
            if (zF || objO4 == zjVar) {
                objO4 = new nm1(qr1Var, jFloatToRawIntBits);
                nv0Var.j0(objO4);
            }
            int i9 = 7;
            d00 d00VarN3 = gq.N(-2082182507, new e90(i9, (nm1) objO4), nv0Var);
            d00 d00VarN4 = gq.N(-799524251, new z4(i9, e93VarB, yu1Var5), nv0Var);
            boolean zF2 = nv0Var.f(e93VarB);
            Object objO5 = nv0Var.O();
            if (zF2 || objO5 == zjVar) {
                objO5 = new qu1(e93VarB, 1);
                nv0Var.j0(objO5);
            }
            cs0 cs0Var2 = (cs0) objO5;
            boolean zF3 = nv0Var.f(e93VarB2);
            Object objO6 = nv0Var.O();
            if (zF3 || objO6 == zjVar) {
                objO6 = new qu1(e93VarB2, 2);
                nv0Var.j0(objO6);
            }
            c(d00VarN3, d00VarN4, d00VarN2, d00Var2, z8, cs0Var2, (cs0) objO6, nv0Var, ((i8 >> 9) & 57344) | 438);
            nv0Var2 = nv0Var;
            nv0Var2.p(true);
            yu1Var2 = yu1Var5;
            z5 = z8;
            z4 = z9;
        } else {
            nv0Var2 = nv0Var;
            nv0Var2.U();
            bq1Var2 = bq1Var;
            z4 = z2;
            z5 = z3;
            yu1Var2 = yu1Var;
        }
        xj2 xj2VarT = nv0Var2.t();
        if (xj2VarT != null) {
            final bq1 bq1Var5 = bq1Var2;
            xj2VarT.d = new rs0() { // from class: av1
                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    iv1.b(ep2Var, z, cs0Var, d00Var, bq1Var5, z4, rs0Var, z5, yu1Var2, (nv0) obj, jo3.y(i | 1));
                    return dm3.a;
                }
            };
        }
    }

    public static final void c(d00 d00Var, d00 d00Var2, d00 d00Var3, rs0 rs0Var, boolean z, cs0 cs0Var, cs0 cs0Var2, nv0 nv0Var, int i) {
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        rs0 rs0Var2 = rs0Var;
        nv0Var.b0(-1019541078);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (nv0Var.h(d00Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= nv0Var.h(d00Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= nv0Var.h(d00Var3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= nv0Var.h(rs0Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= nv0Var.g(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= nv0Var.h(cs0Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= nv0Var.h(cs0Var2) ? 1048576 : 524288;
        }
        if (nv0Var.R(i2 & 1, (599187 & i2) != 599186)) {
            z1 z1Var = new z1(i3);
            yp1 yp1Var = yp1.a;
            bq1 bq1VarC = vm1.C(yp1Var, z1Var);
            int i4 = 57344 & i2;
            boolean z5 = ((i2 & 7168) == 2048) | ((3670016 & i2) == 1048576) | (i4 == 16384);
            Object objO = nv0Var.O();
            zj zjVar = c20.a;
            if (z5 || objO == zjVar) {
                objO = new hv1(cs0Var2, rs0Var2, z, 0);
                nv0Var.j0(objO);
            }
            cn1 cn1Var = (cn1) objO;
            int iC = lq.C(nv0Var);
            n52 n52VarL = nv0Var.l();
            bq1 bq1VarM = lr.M(nv0Var, bq1VarC);
            w10.c.getClass();
            nv0Var.d0();
            boolean z6 = nv0Var.S;
            x91 x91Var = tb1.Y;
            if (z6) {
                nv0Var.k(x91Var);
            } else {
                nv0Var.m0();
            }
            int i5 = i2;
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
            d00Var.f(nv0Var, Integer.valueOf(i5 & 14));
            d00Var2.f(nv0Var, Integer.valueOf((i5 >> 3) & 14));
            bq1 bq1VarU = r51.u(yp1Var, "icon");
            vm vmVar = f5.g;
            cn1 cn1VarD = eo.d(vmVar, false);
            int iC2 = lq.C(nv0Var);
            n52 n52VarL2 = nv0Var.l();
            bq1 bq1VarM2 = lr.M(nv0Var, bq1VarU);
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
            nc2.p((i5 >> 6) & 14, d00Var3, nv0Var, true);
            if (rs0Var != null) {
                nv0Var.a0(-660471321);
                bq1 bq1VarU2 = r51.u(yp1Var, "label");
                boolean z7 = (i4 == 16384) | ((i5 & 458752) == 131072);
                Object objO2 = nv0Var.O();
                if (z7 || objO2 == zjVar) {
                    z2 = z;
                    z4 = false;
                    objO2 = new bv1(0, cs0Var, z2);
                    nv0Var.j0(objO2);
                } else {
                    z2 = z;
                    z4 = false;
                }
                bq1 bq1VarZ = vm1.z(bq1VarU2, (ns0) objO2);
                cn1 cn1VarD2 = eo.d(vmVar, z4);
                int iC3 = lq.C(nv0Var);
                n52 n52VarL3 = nv0Var.l();
                bq1 bq1VarM3 = lr.M(nv0Var, bq1VarZ);
                nv0Var.d0();
                if (nv0Var.S) {
                    nv0Var.k(x91Var);
                } else {
                    nv0Var.m0();
                }
                y02.F(z00Var, nv0Var, cn1VarD2);
                y02.F(z00Var2, nv0Var, n52VarL3);
                if (nv0Var.S || !s51.n(nv0Var.O(), Integer.valueOf(iC3))) {
                    nc2.q(iC3, nv0Var, iC3, z00Var3);
                }
                y02.F(z00Var4, nv0Var, bq1VarM3);
                rs0Var2 = rs0Var;
                rs0Var2.f(nv0Var, Integer.valueOf((i5 >> 9) & 14));
                z3 = true;
                nv0Var.p(true);
                nv0Var.p(false);
            } else {
                rs0Var2 = rs0Var;
                z2 = z;
                z3 = true;
                nv0Var.a0(-660200319);
                nv0Var.p(false);
            }
            nv0Var.p(z3);
        } else {
            z2 = z;
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new cv1(d00Var, d00Var2, d00Var3, rs0Var2, z2, cs0Var, cs0Var2, i, 0);
        }
    }
}
