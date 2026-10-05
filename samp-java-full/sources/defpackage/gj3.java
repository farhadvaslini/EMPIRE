package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class gj3 {
    public static final b22 a = new b22(8.0f, 4.0f, 8.0f, 4.0f);

    public static final void a(final ij3 ij3Var, bq1 bq1Var, float f, z13 z13Var, long j, long j2, final d00 d00Var, nv0 nv0Var, final int i) {
        int i2;
        bq1 bq1Var2;
        final float f2;
        final z13 z13Var2;
        final long j3;
        final long j4;
        float f3;
        long jE;
        int i3;
        z13 z13Var3;
        long j5;
        nv0Var.b0(-343758958);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? nv0Var.f(ij3Var) : nv0Var.h(ij3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 3504;
        if ((i & 24576) == 0) {
            i4 = i2 | 11696;
        }
        if ((196608 & i) == 0) {
            i4 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= 524288;
        }
        int i5 = 113246208 | i4;
        if ((805306368 & i) == 0) {
            i5 |= nv0Var.h(d00Var) ? 536870912 : 268435456;
        }
        if (nv0Var.R(i5 & 1, (306783379 & i5) != 306783378)) {
            nv0Var.W();
            if ((i & 1) == 0 || nv0Var.A()) {
                f3 = dj3.a;
                z13 z13VarA = g23.a(s51.z, nv0Var);
                long jE2 = hy.e(s51.A, nv0Var);
                jE = hy.e(s51.y, nv0Var);
                i3 = i5 & (-4186113);
                z13Var3 = z13VarA;
                j5 = jE2;
                bq1Var2 = yp1.a;
            } else {
                nv0Var.U();
                i3 = i5 & (-4186113);
                bq1Var2 = bq1Var;
                f3 = f;
                z13Var3 = z13Var;
                j5 = j;
                jE = j2;
            }
            nv0Var.q();
            nv0Var.a0(-1719831991);
            nv0Var.p(false);
            int i6 = i3 >> 9;
            hb3.a(bq1Var2, z13Var3, jE, 0L, 0.0f, 0.0f, null, gq.N(-1573998995, new fj3(f3, j5, d00Var), nv0Var), nv0Var, (57344 & i6) | 12582912 | (i6 & 458752), 72);
            f2 = f3;
            j3 = j5;
            z13Var2 = z13Var3;
            j4 = jE;
        } else {
            nv0Var.U();
            bq1Var2 = bq1Var;
            f2 = f;
            z13Var2 = z13Var;
            j3 = j;
            j4 = j2;
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            final bq1 bq1Var3 = bq1Var2;
            xj2VarT.d = new rs0() { // from class: ej3
                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    gj3.a(ij3Var, bq1Var3, f2, z13Var2, j3, j4, d00Var, (nv0) obj, jo3.y(i | 1));
                    return dm3.a;
                }
            };
        }
    }

    public static final void b(ub2 ub2Var, d00 d00Var, jj3 jj3Var, bq1 bq1Var, boolean z, d00 d00Var2, nv0 nv0Var, int i) {
        int i2;
        bq1 bq1Var2;
        boolean z2;
        nv0Var.b0(-293753984);
        if ((i & 6) == 0) {
            i2 = (nv0Var.f(ub2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= nv0Var.h(d00Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? nv0Var.f(jj3Var) : nv0Var.h(jj3Var) ? 256 : 128;
        }
        int i3 = i2 | 14380032;
        if ((100663296 & i) == 0) {
            i3 |= nv0Var.h(d00Var2) ? 67108864 : 33554432;
        }
        if (nv0Var.R(i3 & 1, (38347923 & i3) != 38347922)) {
            gk3 gk3VarZ = w7.Z(jj3Var.b, "tooltip transition", nv0Var, 48, 0);
            Object objO = nv0Var.O();
            zj zjVar = c20.a;
            if (objO == zjVar) {
                objO = b32.w(null);
                nv0Var.j0(objO);
            }
            os1 os1Var = (os1) objO;
            Object objO2 = nv0Var.O();
            if (objO2 == zjVar) {
                new d03(os1Var, 25);
                objO2 = new ij3();
                nv0Var.j0(objO2);
            }
            vm1.f(ub2Var, gq.N(-527401546, new do1(5, d00Var, gk3VarZ, (ij3) objO2), nv0Var), jj3Var, gq.N(-23901870, new z4(12, os1Var, d00Var2), nv0Var), nv0Var, (i3 & 14) | 100663344 | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (i3 & 29360128));
            bq1Var2 = yp1.a;
            z2 = true;
        } else {
            nv0Var.U();
            bq1Var2 = bq1Var;
            z2 = z;
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new gm(ub2Var, d00Var, jj3Var, bq1Var2, z2, d00Var2, i);
        }
    }
}
