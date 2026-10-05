package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class q90 {
    public static final q90 a = new q90();

    public final void a(d43 d43Var, nv0 nv0Var, int i) {
        nv0 nv0Var2 = nv0Var;
        float f = d43Var.g;
        nv0Var2.b0(2137486921);
        int i2 = 4;
        int i3 = i | (nv0Var2.f(d43Var) ? 4 : 2);
        if (nv0Var2.R(i3 & 1, (i3 & 3) != 2)) {
            kj3 kj3Var = d43Var.i;
            if (Float.isNaN(f) || (Float.floatToRawIntBits(f) & Integer.MAX_VALUE) >= 2139095040) {
                c.p("The expandedHeight is expected to be specified and finite");
                return;
            }
            boolean zF = nv0Var2.f(kj3Var) | nv0Var2.f(null);
            Object objO = nv0Var2.O();
            zj zjVar = c20.a;
            if (zF || objO == zjVar) {
                objO = b32.j(new p90(0, d43Var));
                nv0Var2.j0(objO);
            }
            e93 e93VarA = f43.a(((wx) ((e93) objO).getValue()).a, uq.R(pq1.h, nv0Var2), nv0Var2);
            d00 d00VarN = gq.N(-1658896622, new e90(5, d43Var), nv0Var2);
            nv0Var2.a0(690108113);
            nv0Var2.p(false);
            bq1 bq1Var = d43Var.a;
            yp1 yp1Var = yp1.a;
            bq1 bq1VarD = bq1Var.d(yp1Var);
            boolean zF2 = nv0Var2.f(e93VarA);
            Object objO2 = nv0Var2.O();
            if (zF2 || objO2 == zjVar) {
                objO2 = new m90(e93VarA, i);
                nv0Var2.j0(objO2);
            }
            bq1 bq1VarK = w7.K(bq1VarD, (ns0) objO2);
            Object objO3 = nv0Var2.O();
            if (objO3 == zjVar) {
                objO3 = new n20(i2);
                nv0Var2.j0(objO3);
            }
            bq1 bq1VarA = su2.a(bq1VarK, false, (ns0) objO3);
            Object objO4 = nv0Var2.O();
            if (objO4 == zjVar) {
                objO4 = o90.b;
                nv0Var2.j0(objO4);
            }
            bq1 bq1VarA2 = ob3.a(bq1VarA, dm3.a, (PointerInputEventHandler) objO4);
            cn1 cn1VarD = eo.d(f5.g, false);
            int iC = lq.C(nv0Var2);
            n52 n52VarL = nv0Var2.l();
            bq1 bq1VarM = lr.M(nv0Var2, bq1VarA2);
            w10.c.getClass();
            nv0Var2.d0();
            if (nv0Var2.S) {
                nv0Var2.k(tb1.Y);
            } else {
                nv0Var2.m0();
            }
            y02.F(f5.E, nv0Var2, cn1VarD);
            y02.F(f5.D, nv0Var2, n52VarL);
            z00 z00Var = f5.F;
            if (nv0Var2.S || !s51.n(nv0Var2.O(), Integer.valueOf(iC))) {
                nc2.q(iC, nv0Var2, iC, z00Var);
            }
            y02.F(f5.C, nv0Var2, bq1VarM);
            bq1 bq1VarU = gq.u(vm1.U(yp1Var, d43Var.h));
            t20 t20Var = tf.a;
            i = (i3 & 14) == 4 ? 1 : 0;
            Object objO5 = nv0Var2.O();
            if (i != 0 || objO5 == zjVar) {
                objO5 = new n90();
                nv0Var2.j0(objO5);
            }
            ym0 ym0Var = (ym0) objO5;
            long j = kj3Var.c;
            long j2 = kj3Var.d;
            long j3 = kj3Var.e;
            long j4 = kj3Var.f;
            d00 d00Var = d43Var.b;
            gh3 gh3Var = d43Var.c;
            gh3 gh3Var2 = d43Var.d;
            d00 d00Var2 = d43Var.e;
            float f2 = d43Var.g;
            Object objO6 = nv0Var2.O();
            if (objO6 == zjVar) {
                objO6 = new q20(18);
                nv0Var2.j0(objO6);
            }
            tf.c(bq1VarU, ym0Var, j, j2, j4, j3, d00Var, gh3Var, gh3Var2, (cs0) objO6, d00Var2, d00VarN, f2, nv0Var2, 0);
            nv0Var2 = nv0Var2;
            nv0Var2.p(true);
        } else {
            nv0Var2.U();
        }
        xj2 xj2VarT = nv0Var2.t();
        if (xj2VarT != null) {
            xj2VarT.d = new y7(i, 11, this, d43Var);
        }
    }
}
