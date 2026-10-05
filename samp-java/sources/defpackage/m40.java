package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class m40 {
    public static final j40 a;

    static {
        t20 t20Var = xa.a;
        long j = wx.c;
        long j2 = wx.b;
        a = new j40(j, j2, j2, wx.b(0.38f, j2), wx.b(0.38f, j2));
    }

    public static final void a(j40 j40Var, bq1 bq1Var, d00 d00Var, nv0 nv0Var, int i) {
        int i2;
        nv0Var.b0(-527864079);
        if ((i & 6) == 0) {
            i2 = (nv0Var.f(j40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= nv0Var.f(bq1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= nv0Var.h(d00Var) ? 256 : 128;
        }
        if (nv0Var.R(i2 & 1, (i2 & 147) != 146)) {
            um umVar = l40.a;
            to2 to2VarA = uo2.a(4.0f);
            boolean z = jd0.a(3.0f, 0.0f) > 0;
            long j = vw0.a;
            bq1 bq1VarC = n92.C(f80.L(r51.E(gv3.v((jd0.a(3.0f, 0.0f) > 0 || z) ? bq1Var.d(new t13(to2VarA, z, j, j)) : bq1Var, j40Var.a, cl3.q0), m51.g), 0.0f, l40.d, 1), n92.A(nv0Var), true);
            int i3 = (i2 << 3) & 7168;
            qy qyVarA = oy.a(n92.d, f5.s, nv0Var, 0);
            int iHashCode = Long.hashCode(nv0Var.T);
            n52 n52VarL = nv0Var.l();
            bq1 bq1VarM = lr.M(nv0Var, bq1VarC);
            w10.c.getClass();
            nv0Var.d0();
            if (nv0Var.S) {
                nv0Var.k(tb1.Y);
            } else {
                nv0Var.m0();
            }
            y02.F(f5.E, nv0Var, qyVarA);
            y02.F(f5.D, nv0Var, n52VarL);
            y02.F(f5.F, nv0Var, Integer.valueOf(iHashCode));
            y02.C(nv0Var);
            y02.F(f5.C, nv0Var, bq1VarM);
            d00Var.e(ry.a, nv0Var, Integer.valueOf(((i3 >> 6) & 112) | 6));
            nv0Var.p(true);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new eb(j40Var, bq1Var, d00Var, i, 6);
        }
    }

    public static final void b(bq1 bq1Var, j40 j40Var, ns0 ns0Var, nv0 nv0Var, int i, int i2) {
        int i3;
        int i4;
        nv0Var.b0(-625529233);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else {
            i3 = (nv0Var.f(bq1Var) ? 4 : 2) | i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i4 = i3 | 48;
        } else {
            i4 = i3 | (nv0Var.f(j40Var) ? 32 : 16);
        }
        int i7 = i4 | (nv0Var.h(ns0Var) ? 256 : 128);
        if (nv0Var.R(i7 & 1, (i7 & 147) != 146)) {
            if (i5 != 0) {
                bq1Var = yp1.a;
            }
            if (i6 != 0) {
                j40Var = a;
            }
            a(j40Var, bq1Var, gq.N(-250345048, new w91(ns0Var, j40Var), nv0Var), nv0Var, ((i7 << 3) & 112) | ((i7 >> 3) & 14) | 384);
        } else {
            nv0Var.U();
        }
        bq1 bq1Var2 = bq1Var;
        j40 j40Var2 = j40Var;
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new eb(bq1Var2, j40Var2, ns0Var, i, i2);
        }
    }

    public static final void c(String str, boolean z, j40 j40Var, bq1 bq1Var, ss0 ss0Var, cs0 cs0Var, nv0 nv0Var, int i) {
        int i2;
        int i3;
        nv0Var.b0(-2001167027);
        if ((i & 6) == 0) {
            i2 = (nv0Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= nv0Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= nv0Var.f(j40Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= nv0Var.f(bq1Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= nv0Var.h(ss0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= nv0Var.h(cs0Var) ? 131072 : 65536;
        }
        if (nv0Var.R(i2 & 1, (74899 & i2) != 74898)) {
            um umVar = l40.a;
            float f = l40.c;
            jj jjVar = new jj(f, true, new c(1));
            boolean z2 = ((i2 & 112) == 32) | ((458752 & i2) == 131072);
            Object objO = nv0Var.O();
            if (z2 || objO == c20.a) {
                objO = new qv(1, cs0Var, z);
                nv0Var.j0(objO);
            }
            bq1 bq1VarL = f80.L(j43.m(j43.c(rn.y(bq1Var, z, str, (cs0) objO, 12), 1.0f), 112.0f, 48.0f, 280.0f, 48.0f), f, 0.0f, 2);
            dp2 dp2VarA = cp2.a(jjVar, umVar, nv0Var, 54);
            int iHashCode = Long.hashCode(nv0Var.T);
            n52 n52VarL = nv0Var.l();
            bq1 bq1VarM = lr.M(nv0Var, bq1VarL);
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
            y02.F(z00Var, nv0Var, dp2VarA);
            z00 z00Var2 = f5.D;
            y02.F(z00Var2, nv0Var, n52VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z00 z00Var3 = f5.F;
            y02.F(z00Var3, nv0Var, numValueOf);
            y02.C(nv0Var);
            z00 z00Var4 = f5.C;
            y02.F(z00Var4, nv0Var, bq1VarM);
            if (ss0Var == null) {
                nv0Var.a0(-1597947094);
                nv0Var.p(false);
                i3 = i2;
            } else {
                nv0Var.a0(-1597947093);
                float f2 = l40.e;
                bq1 bq1VarJ = j43.j(yp1.a, f2, 0.0f, f2, f2, 2);
                cn1 cn1VarD = eo.d(f5.g, false);
                i3 = i2;
                int iHashCode2 = Long.hashCode(nv0Var.T);
                n52 n52VarL2 = nv0Var.l();
                bq1 bq1VarM2 = lr.M(nv0Var, bq1VarJ);
                nv0Var.d0();
                if (nv0Var.S) {
                    nv0Var.k(x91Var);
                } else {
                    nv0Var.m0();
                }
                y02.F(z00Var, nv0Var, cn1VarD);
                y02.F(z00Var2, nv0Var, n52VarL2);
                nc2.r(iHashCode2, nv0Var, z00Var3, nv0Var);
                y02.F(z00Var4, nv0Var, bq1VarM2);
                ss0Var.e(new wx(z ? j40Var.c : j40Var.e), nv0Var, 0);
                nv0Var.p(true);
                nv0Var.p(false);
            }
            long j = z ? j40Var.b : j40Var.d;
            s51.b(str, new jc1(1.0f, true), new gh3(j, l40.h, l40.i, l40.k, 0L, l40.b, l40.j, 16613240), 0, false, 1, 0, nv0Var, (i3 & 14) | 1572864, 952);
            nv0Var.p(true);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new gm(str, z, j40Var, bq1Var, ss0Var, cs0Var, i);
        }
    }
}
