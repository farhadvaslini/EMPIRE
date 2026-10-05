package defpackage;

import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class on {
    public static final on a = new on();
    public static final float b = 640.0f;
    public static final float c = 56.0f;
    public static final float d = 125.0f;

    public final void a(float f, float f2, int i, long j, nv0 nv0Var, bq1 bq1Var, z13 z13Var) {
        float f3;
        float f4;
        long j2;
        bq1 bq1Var2;
        z13 z13Var2;
        float f5;
        float f6;
        z13 z13Var3;
        long jE;
        bq1 bq1Var3;
        nv0Var.b0(-1364277227);
        int i2 = i | 9654;
        int i3 = 1;
        if (nv0Var.R(i2 & 1, (i2 & 9363) != 9362)) {
            nv0Var.W();
            if ((i & 1) == 0 || nv0Var.A()) {
                f5 = s51.M;
                f6 = s51.L;
                z13Var3 = ((f23) nv0Var.j(g23.a)).e;
                jE = hy.e(s51.K, nv0Var);
                bq1Var3 = yp1.a;
            } else {
                nv0Var.U();
                f5 = f;
                f6 = f2;
                jE = j;
                bq1Var3 = bq1Var;
                z13Var3 = z13Var;
            }
            nv0Var.q();
            String strP = g12.P(R.string.m3c_bottom_sheet_drag_handle_description, nv0Var);
            zk3 zk3Var = q33.a;
            bq1 bq1VarL = f80.L(bq1Var3, 0.0f, 22.0f, 1);
            boolean zF = nv0Var.f(strP);
            Object objO = nv0Var.O();
            if (zF || objO == c20.a) {
                objO = new im(i3, strP);
                nv0Var.j0(objO);
            }
            hb3.a(su2.a(bq1VarL, false, (ns0) objO), z13Var3, jE, 0L, 0.0f, 0.0f, null, gq.N(-1039573072, new nn(f5, f6), nv0Var), nv0Var, 12582912, 120);
            f4 = f6;
            bq1Var2 = bq1Var3;
            z13Var2 = z13Var3;
            j2 = jE;
            f3 = f5;
        } else {
            nv0Var.U();
            f3 = f;
            f4 = f2;
            j2 = j;
            bq1Var2 = bq1Var;
            z13Var2 = z13Var;
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new mn(this, bq1Var2, f3, f4, z13Var2, j2, i);
        }
    }
}
