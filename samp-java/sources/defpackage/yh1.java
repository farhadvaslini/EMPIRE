package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class yh1 {
    public static final r93 a = new r93(new x91(13));
    public static final r93 b = new r93(new x91(13));

    public static final void a(bq1 bq1Var, nv0 nv0Var, int i) {
        nv0Var.b0(1048254258);
        int i2 = i | 6;
        int i3 = 1;
        if (nv0Var.R(i2 & 1, (i2 & 3) != 2)) {
            fy fyVar = (fy) nv0Var.j(hy.a);
            hg1 hg1Var = new hg1(vr.L(new wx(fyVar.n), new wx(wx.b(0.05f, fyVar.a)), new wx(wx.b(0.08f, fyVar.j)), new wx(fyVar.n)));
            yp1 yp1Var = yp1.a;
            bq1 bq1VarU = gv3.u(yp1Var, hg1Var);
            boolean zF = nv0Var.f(fyVar);
            Object objO = nv0Var.O();
            if (zF || objO == c20.a) {
                objO = new xc1(5, fyVar);
                nv0Var.j0(objO);
            }
            eo.a(w7.K(bq1VarU, (ns0) objO), nv0Var, 0);
            bq1Var = yp1Var;
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new co(bq1Var, i, i3);
        }
    }

    public static final void b(bq1 bq1Var, boolean z, ss0 ss0Var, d00 d00Var, nv0 nv0Var, int i) {
        bq1 bq1Var2;
        d00 d00Var2;
        boolean z2;
        ss0 ss0Var2;
        nv0Var.b0(1848935763);
        int i2 = i | 432;
        if (nv0Var.R(i2 & 1, (i2 & 1171) != 1170)) {
            d00 d00Var3 = s51.c;
            nv0Var.a0(-1289184086);
            ta1 ta1VarH = rn.H(null, nv0Var, 3);
            nv0Var.p(false);
            long j = ((fy) nv0Var.j(hy.a)).n;
            nv0Var.a0(-1309863298);
            boolean zE = nv0Var.e(j);
            Object objO = nv0Var.O();
            if (zE || objO == c20.a) {
                objO = new i8(7, j);
                nv0Var.j0(objO);
            }
            ta1 ta1VarH2 = rn.H((ns0) objO, nv0Var, 1);
            nv0Var.p(false);
            vm vmVar = f5.g;
            cn1 cn1VarD = eo.d(vmVar, false);
            int iHashCode = Long.hashCode(nv0Var.T);
            n52 n52VarL = nv0Var.l();
            bq1Var2 = bq1Var;
            bq1 bq1VarM = lr.M(nv0Var, bq1Var2);
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
            Integer numValueOf = Integer.valueOf(iHashCode);
            z00 z00Var3 = f5.F;
            y02.F(z00Var3, nv0Var, numValueOf);
            y02.C(nv0Var);
            z00 z00Var4 = f5.C;
            y02.F(z00Var4, nv0Var, bq1VarM);
            bq1 bq1VarH = j43.c;
            if (ta1VarH != null) {
                bq1VarH = f80.H(bq1VarH, ta1VarH);
            }
            cn1 cn1VarD2 = eo.d(vmVar, false);
            int iHashCode2 = Long.hashCode(nv0Var.T);
            n52 n52VarL2 = nv0Var.l();
            bq1 bq1VarM2 = lr.M(nv0Var, bq1VarH);
            nv0Var.d0();
            if (nv0Var.S) {
                nv0Var.k(x91Var);
            } else {
                nv0Var.m0();
            }
            y02.F(z00Var, nv0Var, cn1VarD2);
            y02.F(z00Var2, nv0Var, n52VarL2);
            nc2.r(iHashCode2, nv0Var, z00Var3, nv0Var);
            y02.F(z00Var4, nv0Var, bq1VarM2);
            d00Var3.e(jo.a, nv0Var, 54);
            nv0Var.p(true);
            d00Var2 = d00Var;
            vr.d(new he2[]{a.a(ta1VarH), b.a(ta1VarH2)}, gq.N(-1176013107, new w4(d00Var2, 4), nv0Var), nv0Var, 48);
            nv0Var.p(true);
            ss0Var2 = d00Var3;
            z2 = true;
        } else {
            bq1Var2 = bq1Var;
            d00Var2 = d00Var;
            nv0Var.U();
            z2 = z;
            ss0Var2 = ss0Var;
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new fw(bq1Var2, z2, ss0Var2, d00Var2, i, 1);
        }
    }

    public static final void c(bq1 bq1Var, d00 d00Var, nv0 nv0Var, int i) {
        nv0Var.b0(719826789);
        int i2 = 0;
        if (nv0Var.R(i & 1, (i & 19) != 18)) {
            ta1 ta1Var = (ta1) nv0Var.j(b);
            bq1 bq1VarH = ta1Var != null ? f80.H(bq1Var, ta1Var) : bq1Var;
            cn1 cn1VarD = eo.d(f5.g, false);
            int iHashCode = Long.hashCode(nv0Var.T);
            n52 n52VarL = nv0Var.l();
            bq1 bq1VarM = lr.M(nv0Var, bq1VarH);
            w10.c.getClass();
            nv0Var.d0();
            if (nv0Var.S) {
                nv0Var.k(tb1.Y);
            } else {
                nv0Var.m0();
            }
            y02.F(f5.E, nv0Var, cn1VarD);
            y02.F(f5.D, nv0Var, n52VarL);
            y02.F(f5.F, nv0Var, Integer.valueOf(iHashCode));
            y02.C(nv0Var);
            y02.F(f5.C, nv0Var, bq1VarM);
            d00Var.e(jo.a, nv0Var, 54);
            nv0Var.p(true);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new xh1(bq1Var, d00Var, i, i2);
        }
    }

    public static final bq1 d(bq1 bq1Var, final z13 z13Var, boolean z, long j, nv0 nv0Var, int i) {
        bq1Var.getClass();
        z13Var.getClass();
        final int i2 = 1;
        boolean z2 = (i & 2) != 0 ? true : z;
        final float f = (i & 8) != 0 ? 14.0f : 10.0f;
        final float f2 = (i & 16) != 0 ? 8.0f : 12.0f;
        final float f3 = (i & 32) == 0 ? 18.0f : 14.0f;
        final float f4 = (i & 64) != 0 ? 0.42f : 0.46f;
        final float f5 = (i & 128) != 0 ? 0.14f : 0.12f;
        gl glVar = (gl) nv0Var.j(a);
        if (!z2 || glVar == null) {
            return bq1Var;
        }
        final int i3 = 0;
        return cl3.m(bq1Var, glVar, new ja(27, z13Var), new ns0() { // from class: vh1
            @Override // defpackage.ns0
            public final Object h(Object obj) {
                hf0 hf0Var = (hf0) obj;
                hf0Var.getClass();
                zx.a(hf0Var);
                rn.u(hf0Var, hf0Var.f * f);
                if (z13Var instanceof to2) {
                    float f6 = hf0Var.f;
                    gq.J(hf0Var, f2 * f6, f6 * f3, 12);
                }
                return dm3.a;
            }
        }, new cs0() { // from class: wh1
            @Override // defpackage.cs0
            public final Object a() {
                int i4 = i3;
                float f6 = f4;
                switch (i4) {
                    case 0:
                        return zx0.a(zx0.e, 0.0f, 0.0f, f6, 11);
                    default:
                        return new q13(0L, f6, 23);
                }
            }
        }, new cs0() { // from class: wh1
            @Override // defpackage.cs0
            public final Object a() {
                int i4 = i2;
                float f6 = f5;
                switch (i4) {
                    case 0:
                        return zx0.a(zx0.e, 0.0f, 0.0f, f6, 11);
                    default:
                        return new q13(0L, f6, 23);
                }
            }
        }, null, null, new i8(6, j), 3040);
    }

    public static final gl e(nv0 nv0Var) {
        return (gl) nv0Var.j(a);
    }
}
