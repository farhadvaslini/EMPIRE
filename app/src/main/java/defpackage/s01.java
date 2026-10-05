package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class s01 {
    public static final bq1 a = j43.k(yp1.a, cl3.t0);

    public static final void a(final w01 w01Var, String str, bq1 bq1Var, long j, nv0 nv0Var, final int i, final int i2) {
        String str2;
        nv0 nv0Var2;
        final long j2;
        final bq1 bq1Var2;
        nv0Var.b0(-126890956);
        int i3 = (nv0Var.f(w01Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= nv0Var.f(str) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= nv0Var.f(bq1Var) ? 256 : 128;
        }
        int i5 = i3 | (((i2 & 8) == 0 && nv0Var.e(j)) ? 2048 : 1024);
        if (nv0Var.R(i5 & 1, (i5 & 1171) != 1170)) {
            nv0Var.W();
            if ((i & 1) == 0 || nv0Var.A()) {
                if (i4 != 0) {
                    bq1Var = yp1.a;
                }
                if ((i2 & 8) != 0) {
                    j = ((wx) nv0Var.j(t30.a)).a;
                    i5 &= -7169;
                }
                bq1 bq1Var3 = bq1Var;
                long j3 = j;
                nv0Var.q();
                str2 = str;
                nv0Var2 = nv0Var;
                b(b32.A(w01Var, nv0Var), str2, bq1Var3, j3, nv0Var2, (i5 & 112) | 8 | (i5 & 896) | (i5 & 7168));
                bq1Var2 = bq1Var3;
                j2 = j3;
            } else {
                nv0Var.U();
                if ((i2 & 8) != 0) {
                    i5 &= -7169;
                }
                bq1 bq1Var32 = bq1Var;
                long j32 = j;
                nv0Var.q();
                str2 = str;
                nv0Var2 = nv0Var;
                b(b32.A(w01Var, nv0Var), str2, bq1Var32, j32, nv0Var2, (i5 & 112) | 8 | (i5 & 896) | (i5 & 7168));
                bq1Var2 = bq1Var32;
                j2 = j32;
            }
        } else {
            str2 = str;
            nv0Var2 = nv0Var;
            nv0Var2.U();
            j2 = j;
            bq1Var2 = bq1Var;
        }
        xj2 xj2VarT = nv0Var2.t();
        if (xj2VarT != null) {
            final String str3 = str2;
            xj2VarT.d = new rs0() { // from class: r01
                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    s01.a(w01Var, str3, bq1Var2, j2, (nv0) obj, jo3.y(i | 1), i2);
                    return dm3.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(o32 o32Var, String str, bq1 bq1Var, long j, nv0 nv0Var, int i) {
        int i2;
        bq1 bq1VarA;
        nv0Var.b0(-2142239481);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (nv0Var.h(o32Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= nv0Var.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= nv0Var.f(bq1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= nv0Var.e(j) ? 2048 : 1024;
        }
        if (nv0Var.R(i2 & 1, (i2 & 1171) != 1170)) {
            nv0Var.W();
            if ((i & 1) != 0 && !nv0Var.A()) {
                nv0Var.U();
            }
            nv0Var.q();
            boolean z = (((i2 & 7168) ^ 3072) > 2048 && nv0Var.e(j)) || (i2 & 3072) == 2048;
            Object objO = nv0Var.O();
            zj zjVar = c20.a;
            if (z || objO == zjVar) {
                objO = wx.c(j, wx.g) ? null : new xm(5, j);
                nv0Var.j0(objO);
            }
            yx yxVar = (yx) objO;
            yp1 yp1Var = yp1.a;
            if (str != null) {
                nv0Var.a0(-536990979);
                boolean z2 = (i2 & 112) == 32;
                Object objO2 = nv0Var.O();
                if (z2 || objO2 == zjVar) {
                    objO2 = new im(i3, str);
                    nv0Var.j0(objO2);
                }
                bq1VarA = su2.a(yp1Var, false, (ns0) objO2);
                nv0Var.p(false);
            } else {
                nv0Var.a0(-536832197);
                nv0Var.p(false);
                bq1VarA = yp1Var;
            }
            if (!h43.a(o32Var.d(), 9205357640488583168L)) {
                long jD = o32Var.d();
                bq1 bq1Var2 = (Float.isInfinite(Float.intBitsToFloat((int) (jD >> 32))) && Float.isInfinite(Float.intBitsToFloat((int) (jD & 4294967295L)))) ? a : yp1Var;
                eo.a(r51.w(bq1Var.d(bq1Var2), o32Var, yxVar).d(bq1VarA), nv0Var, 0);
            }
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new q01(o32Var, str, bq1Var, j, i);
        }
    }
}
