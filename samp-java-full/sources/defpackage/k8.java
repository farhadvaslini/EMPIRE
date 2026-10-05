package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class k8 {
    public static final float a = (25.0f * 2.0f) / 2.4142137f;

    public static final void a(jy1 jy1Var, bq1 bq1Var, long j, nv0 nv0Var, int i) {
        int i2;
        nv0Var.b0(1776202187);
        int i3 = (nv0Var.f(jy1Var) ? 4 : 2) | i | (nv0Var.f(bq1Var) ? 32 : 16) | 128;
        if (nv0Var.R(i3 & 1, (i3 & 147) != 146)) {
            nv0Var.W();
            if ((i & 1) == 0 || nv0Var.A()) {
                i2 = i3 & (-897);
                j = 9205357640488583168L;
            } else {
                nv0Var.U();
                i2 = i3 & (-897);
            }
            nv0Var.q();
            int i4 = i2 & 14;
            boolean z = i4 == 4;
            Object objO = nv0Var.O();
            if (z || objO == c20.a) {
                objO = new s(8, jy1Var);
                nv0Var.j0(objO);
            }
            gv3.e(jy1Var, f5.h, gq.N(-1653527038, new f8(j, su2.a(bq1Var, false, (ns0) objO)), nv0Var), nv0Var, i4 | 432);
        } else {
            nv0Var.U();
        }
        long j2 = j;
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new g8(jy1Var, bq1Var, j2, i);
        }
    }

    public static final void b(bq1 bq1Var, nv0 nv0Var, int i, int i2) {
        int i3;
        nv0Var.b0(694251107);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (nv0Var.f(bq1Var) ? 4 : 2) | i;
        }
        int i5 = 0;
        if (nv0Var.R(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                bq1Var = yp1.a;
            }
            oz2.g(nv0Var, w7.L(j43.l(bq1Var, a, 25.0f), new i8(i5, ((ah3) nv0Var.j(bh3.a)).a)));
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new h8(bq1Var, i, i2);
        }
    }
}
