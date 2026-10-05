package defpackage;

import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class tf {
    public static final t20 a = new t20(new v3(14));
    public static final float b;
    public static final float c;

    static {
        new qe1(new v3(15));
        new l60(0.8f, 0.0f, 0.8f, 0.15f);
        b = 4.0f;
        c = 12.0f;
    }

    public static final void a(final bq1 bq1Var, final d00 d00Var, final gh3 gh3Var, final gh3 gh3Var2, final d00 d00Var2, final ss0 ss0Var, final float f, final js3 js3Var, final kj3 kj3Var, nv0 nv0Var, final int i, final int i2) {
        int i3;
        ss0 ss0Var2;
        float f2;
        int i4;
        tm tmVar = f5.s;
        nv0Var.b0(-2033800111);
        if ((i & 6) == 0) {
            i3 = (nv0Var.f(bq1Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= nv0Var.h(d00Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= nv0Var.f(gh3Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= nv0Var.h(null) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= nv0Var.f(gh3Var2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= nv0Var.f(tmVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= nv0Var.h(d00Var2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            ss0Var2 = ss0Var;
            i3 |= nv0Var.h(ss0Var2) ? 8388608 : 4194304;
        } else {
            ss0Var2 = ss0Var;
        }
        if ((100663296 & i) == 0) {
            f2 = f;
            i3 |= nv0Var.c(f2) ? 67108864 : 33554432;
        } else {
            f2 = f;
        }
        if ((805306368 & i) == 0) {
            i3 |= nv0Var.f(js3Var) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (nv0Var.f(kj3Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= nv0Var.f(null) ? 32 : 16;
        }
        if (nv0Var.R(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            ((q90) nv0Var.j(a)).a(new d43(bq1Var, d00Var, gh3Var, gh3Var2, d00Var2, ss0Var2, f2, js3Var, kj3Var), nv0Var, 0);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new rs0() { // from class: qf
                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    tf.a(bq1Var, d00Var, gh3Var, gh3Var2, d00Var2, ss0Var, f, js3Var, kj3Var, (nv0) obj, jo3.y(i | 1), jo3.y(i2));
                    return dm3.a;
                }
            };
        }
    }

    public static final void b(final d00 d00Var, bq1 bq1Var, final d00 d00Var2, final ss0 ss0Var, float f, js3 js3Var, final kj3 kj3Var, nv0 nv0Var, final int i) {
        int i2;
        final bq1 bq1Var2;
        final float f2;
        final js3 js3Var2;
        js3 xf1Var;
        int i3;
        bq1 bq1Var3;
        float f3;
        nv0Var.b0(1784421840);
        if ((i & 6) == 0) {
            i2 = (nv0Var.h(d00Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            i4 |= nv0Var.h(d00Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= nv0Var.h(ss0Var) ? 2048 : 1024;
        }
        int i5 = i4 | 24576;
        if ((196608 & i) == 0) {
            i5 = 90112 | i4;
        }
        if ((1572864 & i) == 0) {
            i5 |= nv0Var.f(kj3Var) ? 1048576 : 524288;
        }
        int i6 = 12582912 | i5;
        if (nv0Var.R(i6 & 1, (4793491 & i6) != 4793490)) {
            nv0Var.W();
            if ((i & 1) == 0 || nv0Var.A()) {
                WeakHashMap weakHashMap = qt3.w;
                xf1Var = new xf1(new am3(ak2.e(nv0Var).g, ak2.e(nv0Var).b), 15 | 16);
                i3 = i6 & (-458753);
                bq1Var3 = yp1.a;
                f3 = 64.0f;
            } else {
                nv0Var.U();
                xf1Var = js3Var;
                i3 = i6 & (-458753);
                bq1Var3 = bq1Var;
                f3 = f;
            }
            nv0Var.q();
            int i7 = i3 << 12;
            a(bq1Var3, d00Var, ql3.a(rn.e, nv0Var), gh3.d, d00Var2, ss0Var, (jd0.b(f3, Float.NaN) || jd0.b(f3, Float.POSITIVE_INFINITY)) ? 64.0f : f3, xf1Var, kj3Var, nv0Var, ((i3 >> 3) & 14) | 224256 | ((i3 << 3) & 112) | (3670016 & i7) | (i7 & 29360128), (i3 >> 18) & 126);
            f2 = f3;
            bq1Var2 = bq1Var3;
            js3Var2 = xf1Var;
        } else {
            nv0Var.U();
            bq1Var2 = bq1Var;
            f2 = f;
            js3Var2 = js3Var;
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new rs0() { // from class: pf
                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    tf.b(d00Var, bq1Var2, d00Var2, ss0Var, f2, js3Var2, kj3Var, (nv0) obj, jo3.y(i | 1));
                    return dm3.a;
                }
            };
        }
    }

    public static final void c(final bq1 bq1Var, final ym0 ym0Var, final long j, final long j2, final long j3, long j4, final d00 d00Var, final gh3 gh3Var, final gh3 gh3Var2, cs0 cs0Var, final d00 d00Var2, d00 d00Var3, final float f, nv0 nv0Var, final int i) {
        final cs0 cs0Var2;
        d00 d00Var4;
        final long j5 = j4;
        tm tmVar = f5.s;
        nv0Var.b0(126395868);
        int i2 = i | (nv0Var.f(bq1Var) ? 4 : 2) | (nv0Var.f(ym0Var) ? 32 : 16) | (nv0Var.e(j) ? 256 : 128) | (nv0Var.e(j2) ? 2048 : 1024) | (nv0Var.e(j3) ? 16384 : 8192) | (nv0Var.e(j5) ? 131072 : 65536) | (nv0Var.h(d00Var) ? 1048576 : 524288) | (nv0Var.f(gh3Var) ? 8388608 : 4194304) | (nv0Var.h(null) ? 67108864 : 33554432) | (nv0Var.f(gh3Var2) ? 536870912 : 268435456);
        int i3 = 1600566 | (nv0Var.f(tmVar) ? 256 : 128) | (nv0Var.h(d00Var2) ? 131072 : 65536) | (nv0Var.c(f) ? 8388608 : 4194304);
        if (nv0Var.R(i2 & 1, ((i2 & 306783379) == 306783378 && (4793491 & i3) == 4793490) ? false : true)) {
            boolean z = ((i2 & 112) == 32) | ((i3 & 896) == 256) | ((29360128 & i3) == 8388608);
            Object objO = nv0Var.O();
            zj zjVar = c20.a;
            if (z || objO == zjVar) {
                objO = new mj3(ym0Var, f);
                nv0Var.j0(objO);
            }
            mj3 mj3Var = (mj3) objO;
            int iC = lq.C(nv0Var);
            n52 n52VarL = nv0Var.l();
            bq1 bq1VarM = lr.M(nv0Var, bq1Var);
            w10.c.getClass();
            nv0Var.d0();
            boolean z2 = nv0Var.S;
            x91 x91Var = tb1.Y;
            if (z2) {
                nv0Var.k(x91Var);
            } else {
                nv0Var.m0();
            }
            z00 z00Var = f5.E;
            y02.F(z00Var, nv0Var, mj3Var);
            z00 z00Var2 = f5.D;
            y02.F(z00Var2, nv0Var, n52VarL);
            z00 z00Var3 = f5.F;
            if (nv0Var.S || !s51.n(nv0Var.O(), Integer.valueOf(iC))) {
                nc2.q(iC, nv0Var, iC, z00Var3);
            }
            z00 z00Var4 = f5.C;
            y02.F(z00Var4, nv0Var, bq1VarM);
            yp1 yp1Var = yp1.a;
            bq1 bq1VarU = r51.u(yp1Var, "navigationIcon");
            float f2 = b;
            bq1 bq1VarN = f80.N(bq1VarU, f2, 0.0f, 0.0f, 0.0f, 14);
            vm vmVar = f5.g;
            cn1 cn1VarD = eo.d(vmVar, false);
            int iC2 = lq.C(nv0Var);
            n52 n52VarL2 = nv0Var.l();
            bq1 bq1VarM2 = lr.M(nv0Var, bq1VarN);
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
            t20 t20Var = t30.a;
            vr.c(nc2.f(j, t20Var), d00Var2, nv0Var, ((i3 >> 12) & 112) | 8);
            nv0Var.p(true);
            nv0Var.a0(-1359701523);
            bq1 bq1VarL = f80.L(r51.u(yp1Var, "title"), f2, 0.0f, 2);
            nv0Var.a0(510340109);
            nv0Var.p(false);
            bq1 bq1VarD = bq1VarL.d(yp1Var);
            Object objO2 = nv0Var.O();
            if (objO2 == zjVar) {
                cs0Var2 = cs0Var;
                objO2 = new rf(cs0Var2, 0);
                nv0Var.j0(objO2);
            } else {
                cs0Var2 = cs0Var;
            }
            bq1 bq1VarZ = vm1.z(bq1VarD, (ns0) objO2);
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
            jo3.b(j2, gh3Var, d00Var, nv0Var, ((i2 >> 9) & 14) | ((i2 >> 18) & 112) | ((i2 >> 12) & 896));
            nv0Var.p(true);
            nv0Var.p(false);
            bq1 bq1VarN2 = f80.N(r51.u(yp1Var, "actionIcons"), 0.0f, 0.0f, f2, 0.0f, 11);
            cn1 cn1VarD3 = eo.d(vmVar, false);
            int iC4 = lq.C(nv0Var);
            n52 n52VarL4 = nv0Var.l();
            bq1 bq1VarM4 = lr.M(nv0Var, bq1VarN2);
            nv0Var.d0();
            if (nv0Var.S) {
                nv0Var.k(x91Var);
            } else {
                nv0Var.m0();
            }
            y02.F(z00Var, nv0Var, cn1VarD3);
            y02.F(z00Var2, nv0Var, n52VarL4);
            if (nv0Var.S || !s51.n(nv0Var.O(), Integer.valueOf(iC4))) {
                nc2.q(iC4, nv0Var, iC4, z00Var3);
            }
            y02.F(z00Var4, nv0Var, bq1VarM4);
            j5 = j4;
            d00Var4 = d00Var3;
            vr.c(t20Var.a(new wx(j5)), d00Var4, nv0Var, 56);
            nv0Var.p(true);
            nv0Var.p(true);
        } else {
            cs0Var2 = cs0Var;
            d00Var4 = d00Var3;
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            final d00 d00Var5 = d00Var4;
            xj2VarT.d = new rs0(ym0Var, j, j2, j3, j5, d00Var, gh3Var, gh3Var2, cs0Var2, d00Var2, d00Var5, f, i) { // from class: sf
                public final /* synthetic */ ym0 g;
                public final /* synthetic */ long h;
                public final /* synthetic */ long i;
                public final /* synthetic */ long j;
                public final /* synthetic */ long k;
                public final /* synthetic */ d00 l;
                public final /* synthetic */ gh3 m;
                public final /* synthetic */ gh3 n;
                public final /* synthetic */ cs0 o;
                public final /* synthetic */ d00 p;
                public final /* synthetic */ d00 q;
                public final /* synthetic */ float r;

                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = jo3.y(1);
                    tf.c(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, (nv0) obj, iY);
                    return dm3.a;
                }
            };
        }
    }
}
