package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.bq1 r28, long r29, long r31, defpackage.js3 r33, final defpackage.d00 r34, defpackage.nv0 r35, final int r36, final int r37) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wv1.a(bq1, long, long, js3, d00, nv0, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final boolean r22, final defpackage.cs0 r23, final defpackage.d00 r24, defpackage.bq1 r25, boolean r26, final defpackage.rs0 r27, boolean r28, defpackage.tv1 r29, defpackage.nv0 r30, final int r31, final int r32) {
        /*
            Method dump skipped, instruction units count: 645
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wv1.b(boolean, cs0, d00, bq1, boolean, rs0, boolean, tv1, nv0, int, int):void");
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
