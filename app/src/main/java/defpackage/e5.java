package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class e5 {
    public static final b22 a = new b22(24.0f, 24.0f, 24.0f, 24.0f);
    public static final b22 b = f80.g(16.0f);
    public static final b22 c = f80.g(16.0f);
    public static final b22 d = f80.g(24.0f);
    public static final t20 e = new t20(new v3(2));

    public static final void a(final d00 d00Var, bq1 bq1Var, final rs0 rs0Var, final rs0 rs0Var2, final rs0 rs0Var3, final z13 z13Var, final long j, final long j2, final long j3, final long j4, final long j5, nv0 nv0Var, final int i) {
        final bq1 bq1Var2;
        nv0Var.b0(1378716401);
        int i2 = i | 48 | (nv0Var.h(rs0Var) ? 256 : 128) | (nv0Var.h(rs0Var2) ? 2048 : 1024) | (nv0Var.h(rs0Var3) ? 16384 : 8192) | (nv0Var.f(z13Var) ? 131072 : 65536) | (nv0Var.e(j) ? 1048576 : 524288) | (nv0Var.c(0.0f) ? 8388608 : 4194304) | (nv0Var.e(j2) ? 67108864 : 33554432) | (nv0Var.e(j3) ? 536870912 : 268435456);
        if (nv0Var.R(i2 & 1, ((i2 & 306783379) == 306783378 && (((nv0Var.e(j4) ? (char) 4 : (char) 2) | (nv0Var.e(j5) ? ' ' : (char) 16)) & 19) == 18) ? false : true)) {
            d00 d00VarN = gq.N(-652798794, new a5(rs0Var, rs0Var2, rs0Var3, j3, j4, j5, j2, d00Var), nv0Var);
            int i3 = i2 >> 12;
            int i4 = (i3 & 896) | (i3 & 112) | 12582918 | ((i2 >> 9) & 57344);
            yp1 yp1Var = yp1.a;
            hb3.a(yp1Var, z13Var, j, 0L, 0.0f, 0.0f, null, d00VarN, nv0Var, i4, 104);
            bq1Var2 = yp1Var;
        } else {
            nv0Var.U();
            bq1Var2 = bq1Var;
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new rs0(bq1Var2, rs0Var, rs0Var2, rs0Var3, z13Var, j, j2, j3, j4, j5, i) { // from class: u4
                public final /* synthetic */ bq1 g;
                public final /* synthetic */ rs0 h;
                public final /* synthetic */ rs0 i;
                public final /* synthetic */ rs0 j;
                public final /* synthetic */ z13 k;
                public final /* synthetic */ long l;
                public final /* synthetic */ long m;
                public final /* synthetic */ long n;
                public final /* synthetic */ long o;
                public final /* synthetic */ long p;

                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = jo3.y(7);
                    e5.a(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, (nv0) obj, iY);
                    return dm3.a;
                }
            };
        }
    }

    public static final void b(d00 d00Var, nv0 nv0Var, int i) {
        nv0Var.b0(-917637668);
        int i2 = 0;
        if (nv0Var.R(i & 1, (i & 147) != 146)) {
            Object objO = nv0Var.O();
            if (objO == c20.a) {
                objO = new p8(7);
                nv0Var.j0(objO);
            }
            cn1 cn1Var = (cn1) objO;
            int iC = lq.C(nv0Var);
            n52 n52VarL = nv0Var.l();
            bq1 bq1VarM = lr.M(nv0Var, yp1.a);
            w10.c.getClass();
            nv0Var.d0();
            if (nv0Var.S) {
                nv0Var.k(tb1.Y);
            } else {
                nv0Var.m0();
            }
            y02.F(f5.E, nv0Var, cn1Var);
            y02.F(f5.D, nv0Var, n52VarL);
            z00 z00Var = f5.F;
            if (nv0Var.S || !s51.n(nv0Var.O(), Integer.valueOf(iC))) {
                nc2.q(iC, nv0Var, iC, z00Var);
            }
            y02.F(f5.C, nv0Var, bq1VarM);
            nc2.p(6, d00Var, nv0Var, true);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new w4(d00Var, i, i2);
        }
    }

    public static final void c(cs0 cs0Var, d00 d00Var, bq1 bq1Var, rs0 rs0Var, rs0 rs0Var2, rs0 rs0Var3, rs0 rs0Var4, z13 z13Var, long j, long j2, long j3, long j4, nb0 nb0Var, nv0 nv0Var, int i, int i2) {
        int i3;
        d00 d00Var2;
        rs0 rs0Var5;
        int i4;
        nv0Var.b0(-867616355);
        if ((i & 6) == 0) {
            i3 = (nv0Var.h(cs0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            d00Var2 = d00Var;
            i3 |= nv0Var.h(d00Var2) ? 32 : 16;
        } else {
            d00Var2 = d00Var;
        }
        if ((i & 384) == 0) {
            i3 |= nv0Var.f(bq1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            rs0Var5 = rs0Var;
            i3 |= nv0Var.h(rs0Var5) ? 2048 : 1024;
        } else {
            rs0Var5 = rs0Var;
        }
        if ((i & 24576) == 0) {
            i3 |= nv0Var.h(rs0Var2) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= nv0Var.h(rs0Var3) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= nv0Var.h(rs0Var4) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= nv0Var.f(z13Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= nv0Var.e(j) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= nv0Var.e(j2) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (nv0Var.e(j3) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= nv0Var.e(j4) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= nv0Var.c(0.0f) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= nv0Var.f(nb0Var) ? 2048 : 1024;
        }
        int i5 = i4;
        if (nv0Var.R(i3 & 1, ((i3 & 306783379) == 306783378 && (i5 & 1171) == 1170) ? false : true)) {
            d(cs0Var, bq1Var, nb0Var, gq.N(527420759, new d5(rs0Var2, rs0Var3, rs0Var4, z13Var, j, j2, j3, j4, rs0Var5, d00Var2), nv0Var), nv0Var, (i3 & 14) | 3072 | ((i3 >> 3) & 112) | ((i5 >> 3) & 896));
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new x4(cs0Var, d00Var, bq1Var, rs0Var, rs0Var2, rs0Var3, rs0Var4, z13Var, j, j2, j3, j4, nb0Var, i, i2, 0);
        }
    }

    public static final void d(cs0 cs0Var, bq1 bq1Var, nb0 nb0Var, d00 d00Var, nv0 nv0Var, int i) {
        int i2;
        nv0Var.b0(24925658);
        if ((i & 6) == 0) {
            i2 = (nv0Var.h(cs0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= nv0Var.f(bq1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= nv0Var.f(nb0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= nv0Var.h(d00Var) ? 2048 : 1024;
        }
        if (nv0Var.R(i2 & 1, (i2 & 1171) != 1170)) {
            ((k80) nv0Var.j(e)).a(new pl(cs0Var, bq1Var, nb0Var, d00Var), nv0Var, 0);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new v4(cs0Var, bq1Var, nb0Var, d00Var, i, 0);
        }
    }
}
