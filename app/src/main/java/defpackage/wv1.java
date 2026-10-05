package defpackage;

import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class wv1 {
    public static final float a = w7.S;
    public static final float b = 56.0f;
    public static final float c = 4.0f;
    public static final float d;
    public static final float e;
    public static final float f;
    public static final t20 g;

    static {
        float f2 = gv3.B;
        float f3 = (56.0f - f2) / 2.0f;
        d = f3;
        e = (32.0f - f2) / 2.0f;
        f = f3;
        g = new t20(new x91(26));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(bq1 bq1Var, long j, long j2, js3 js3Var, final d00 d00Var, nv0 nv0Var, final int i, final int i2) {
        bq1 bq1Var2;
        int i3;
        long j3;
        long jB;
        int i4;
        final js3 js3Var2;
        final bq1 bq1Var3;
        final long j4;
        final long j5;
        xj2 xj2VarT;
        bq1 bq1Var4;
        long j6;
        js3 xf1Var;
        nv0Var.b0(331386280);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            bq1Var2 = bq1Var;
        } else if ((i & 6) == 0) {
            bq1Var2 = bq1Var;
            i3 = i | (nv0Var.f(bq1Var2) ? 4 : 2);
        } else {
            bq1Var2 = bq1Var;
            i3 = i;
        }
        if ((i2 & 2) == 0) {
            j3 = j;
            int i6 = nv0Var.e(j3) ? 32 : 16;
            int i7 = i3 | i6;
            if ((i2 & 4) != 0) {
                jB = j2;
                int i8 = nv0Var.e(jB) ? 256 : 128;
                i4 = i7 | i8 | 11264;
                if (nv0Var.R(i4 & 1, (74899 & i4) != 74898)) {
                    nv0Var.W();
                    if ((i & 1) == 0 || nv0Var.A()) {
                        bq1 bq1Var5 = i5 != 0 ? yp1.a : bq1Var2;
                        long jE = (i2 & 2) != 0 ? hy.e(w7.R, nv0Var) : j3;
                        if ((i2 & 4) != 0) {
                            jB = hy.b(jE, nv0Var);
                        }
                        WeakHashMap weakHashMap = qt3.w;
                        bq1Var4 = bq1Var5;
                        j6 = jE;
                        xf1Var = new xf1(new am3(ak2.e(nv0Var).g, ak2.e(nv0Var).b), 48 | 9);
                    } else {
                        nv0Var.U();
                        xf1Var = js3Var;
                        bq1Var4 = bq1Var2;
                        j6 = j3;
                    }
                    long j7 = jB;
                    nv0Var.q();
                    ((f90) nv0Var.j(g)).a(new jv1(bq1Var4, j6, j7, xf1Var, d00Var), nv0Var, 0);
                    bq1Var3 = bq1Var4;
                    j4 = j6;
                    j5 = j7;
                    js3Var2 = xf1Var;
                } else {
                    nv0Var.U();
                    js3Var2 = js3Var;
                    bq1Var3 = bq1Var2;
                    j4 = j3;
                    j5 = jB;
                }
                xj2VarT = nv0Var.t();
                if (xj2VarT != null) {
                    xj2VarT.d = new rs0() { // from class: uv1
                        @Override // defpackage.rs0
                        public final Object f(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            wv1.a(bq1Var3, j4, j5, js3Var2, d00Var, (nv0) obj, jo3.y(i | 1), i2);
                            return dm3.a;
                        }
                    };
                    return;
                }
                return;
            }
            jB = j2;
            i4 = i7 | i8 | 11264;
            if (nv0Var.R(i4 & 1, (74899 & i4) != 74898)) {
            }
            xj2VarT = nv0Var.t();
            if (xj2VarT != null) {
            }
        } else {
            j3 = j;
        }
        int i72 = i3 | i6;
        if ((i2 & 4) != 0) {
        }
        i4 = i72 | i8 | 11264;
        if (nv0Var.R(i4 & 1, (74899 & i4) != 74898)) {
        }
        xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final boolean z, final cs0 cs0Var, final d00 d00Var, bq1 bq1Var, boolean z2, final rs0 rs0Var, boolean z3, tv1 tv1Var, nv0 nv0Var, final int i, final int i2) {
        tv1 tv1Var2;
        int i3;
        nv0 nv0Var2;
        final bq1 bq1Var2;
        final boolean z4;
        final boolean z5;
        final tv1 tv1Var3;
        xj2 xj2VarT;
        tv1 tv1VarV;
        bq1 bq1Var3;
        boolean z6;
        boolean z7;
        d00 d00VarN;
        z13 z13VarA;
        nv0Var.b0(-1620317701);
        int i4 = i | (nv0Var.g(z) ? 4 : 2) | (nv0Var.h(cs0Var) ? 32 : 16) | 1600512;
        if ((i2 & 128) == 0) {
            tv1Var2 = tv1Var;
            int i5 = nv0Var.f(tv1Var2) ? 8388608 : 4194304;
            i3 = i4 | i5 | 100663296;
            int i6 = 1;
            if (nv0Var.R(i3 & 1, (38347923 & i3) == 38347922)) {
                nv0Var2 = nv0Var;
                nv0Var2.U();
                bq1Var2 = bq1Var;
                z4 = z2;
                z5 = z3;
                tv1Var3 = tv1Var2;
            } else {
                nv0Var.W();
                if ((i & 1) == 0 || nv0Var.A()) {
                    tv1VarV = (i2 & 128) != 0 ? pq.v((fy) nv0Var.j(hy.a)) : tv1Var2;
                    bq1Var3 = yp1.a;
                    z6 = true;
                    z7 = true;
                } else {
                    nv0Var.U();
                    bq1Var3 = bq1Var;
                    z6 = z2;
                    z7 = z3;
                    tv1VarV = tv1Var2;
                }
                nv0Var.q();
                nv0Var.a0(253288608);
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
                d00 d00VarN2 = gq.N(206057749, new fv1(tv1VarV, z, z6, s83VarR, rs0Var, z7, d00Var, 1), nv0Var);
                if (rs0Var == null) {
                    nv0Var.a0(254215848);
                    nv0Var.p(false);
                    d00VarN = null;
                } else {
                    nv0Var.a0(254215849);
                    d00VarN = gq.N(-2056532825, new gv1(tv1VarV, z, z6, s83VarR, rs0Var, 1), nv0Var);
                    nv0Var.p(false);
                }
                d00 d00Var2 = d00VarN;
                boolean z9 = z6;
                bq1 bq1Var4 = bq1Var3;
                tv1 tv1Var4 = tv1VarV;
                bq1 bq1VarQ = j43.q(j43.b(gv3.J(bq1Var4, z, qr1Var, null, z9, new no2(4), cs0Var), 0.0f, b, 1), a, 0.0f, 2);
                cn1 cn1VarD = eo.d(f5.k, true);
                int iC = lq.C(nv0Var);
                n52 n52VarL = nv0Var.l();
                bq1 bq1VarM = lr.M(nv0Var, bq1VarQ);
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
                ua0 ua0Var = (ua0) nv0Var.j(s20.h);
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((ua0Var.p0(r2) - ua0Var.p0(56.0f)) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                boolean zF = nv0Var.f(qr1Var) | nv0Var.e(jFloatToRawIntBits);
                Object objO2 = nv0Var.O();
                if (zF || objO2 == zjVar) {
                    objO2 = new nm1(qr1Var, jFloatToRawIntBits);
                    nv0Var.j0(objO2);
                }
                nm1 nm1Var = (nm1) objO2;
                if (rs0Var != null) {
                    nv0Var.a0(-1825624334);
                    z13VarA = g23.a(gv3.A, nv0Var);
                    nv0Var.p(false);
                } else {
                    nv0Var.a0(-1825528978);
                    z13VarA = g23.a(b23.i, nv0Var);
                    nv0Var.p(false);
                }
                d00 d00VarN3 = gq.N(455696046, new z4(8, z13VarA, nm1Var), nv0Var);
                d00 d00VarN4 = gq.N(2137606782, new do1(e93VarB, tv1Var4, z13VarA, i6), nv0Var);
                boolean zF2 = nv0Var.f(e93VarB);
                Object objO3 = nv0Var.O();
                if (zF2 || objO3 == zjVar) {
                    objO3 = new qu1(e93VarB, 3);
                    nv0Var.j0(objO3);
                }
                cs0 cs0Var2 = (cs0) objO3;
                boolean zF3 = nv0Var.f(e93VarB2);
                Object objO4 = nv0Var.O();
                if (zF3 || objO4 == zjVar) {
                    objO4 = new qu1(e93VarB2, 4);
                    nv0Var.j0(objO4);
                }
                c(d00VarN3, d00VarN4, d00VarN2, d00Var2, z8, cs0Var2, (cs0) objO4, nv0Var, 25014);
                nv0Var2 = nv0Var;
                nv0Var2.p(true);
                z5 = z8;
                tv1Var3 = tv1Var4;
                z4 = z9;
                bq1Var2 = bq1Var4;
            }
            xj2VarT = nv0Var2.t();
            if (xj2VarT == null) {
                xj2VarT.d = new rs0(z, cs0Var, d00Var, bq1Var2, z4, rs0Var, z5, tv1Var3, i, i2) { // from class: vv1
                    public final /* synthetic */ boolean f;
                    public final /* synthetic */ cs0 g;
                    public final /* synthetic */ d00 h;
                    public final /* synthetic */ bq1 i;
                    public final /* synthetic */ boolean j;
                    public final /* synthetic */ rs0 k;
                    public final /* synthetic */ boolean l;
                    public final /* synthetic */ tv1 m;
                    public final /* synthetic */ int n;

                    {
                        this.n = i2;
                    }

                    @Override // defpackage.rs0
                    public final Object f(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iY = jo3.y(196993);
                        wv1.b(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (nv0) obj, iY, this.n);
                        return dm3.a;
                    }
                };
                return;
            }
            return;
        }
        tv1Var2 = tv1Var;
        i3 = i4 | i5 | 100663296;
        int i62 = 1;
        if (nv0Var.R(i3 & 1, (38347923 & i3) == 38347922)) {
        }
        xj2VarT = nv0Var2.t();
        if (xj2VarT == null) {
        }
    }

    public static final void c(d00 d00Var, d00 d00Var2, d00 d00Var3, rs0 rs0Var, boolean z, cs0 cs0Var, cs0 cs0Var2, nv0 nv0Var, int i) {
        int i2;
        boolean z2;
        boolean z3;
        rs0 rs0Var2 = rs0Var;
        nv0Var.b0(-759267492);
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
            boolean z4 = ((i2 & 7168) == 2048) | ((3670016 & i2) == 1048576) | (i4 == 16384);
            Object objO = nv0Var.O();
            zj zjVar = c20.a;
            if (z4 || objO == zjVar) {
                objO = new hv1(cs0Var2, rs0Var2, z, 1);
                nv0Var.j0(objO);
            }
            cn1 cn1Var = (cn1) objO;
            int iC = lq.C(nv0Var);
            n52 n52VarL = nv0Var.l();
            bq1 bq1VarM = lr.M(nv0Var, bq1VarC);
            w10.c.getClass();
            nv0Var.d0();
            boolean z5 = nv0Var.S;
            x91 x91Var = tb1.Y;
            if (z5) {
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
                nv0Var.a0(773116085);
                bq1 bq1VarU2 = r51.u(yp1Var, "label");
                boolean z6 = (i4 == 16384) | ((i5 & 458752) == 131072);
                Object objO2 = nv0Var.O();
                if (z6 || objO2 == zjVar) {
                    z2 = z;
                    objO2 = new bv1(1, cs0Var, z2);
                    nv0Var.j0(objO2);
                } else {
                    z2 = z;
                }
                bq1 bq1VarZ = vm1.z(bq1VarU2, (ns0) objO2);
                cn1 cn1VarD2 = eo.d(vmVar, false);
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
                nv0Var.a0(773387087);
                nv0Var.p(false);
            }
            nv0Var.p(z3);
        } else {
            z2 = z;
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new cv1(d00Var, d00Var2, d00Var3, rs0Var2, z2, cs0Var, cs0Var2, i, 1);
        }
    }
}
