package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class q33 {
    public static final zk3 a = n92.I(300, 2, pg0.a);

    public static final void a(d00 d00Var, nv0 nv0Var, int i) {
        nv0Var.b0(1033612924);
        if (nv0Var.R(i & 1, (i & 19) != 18)) {
            String strP = g12.P(2131624367, nv0Var);
            py0 py0Var = new py0(f5.t);
            cn1 cn1VarD = eo.d(f5.g, false);
            int iC = lq.C(nv0Var);
            n52 n52VarL = nv0Var.l();
            bq1 bq1VarM = lr.M(nv0Var, py0Var);
            w10.c.getClass();
            nv0Var.d0();
            if (nv0Var.S) {
                nv0Var.k(tb1.Y);
            } else {
                nv0Var.m0();
            }
            y02.F(f5.E, nv0Var, cn1VarD);
            y02.F(f5.D, nv0Var, n52VarL);
            z00 z00Var = f5.F;
            if (nv0Var.S || !s51.n(nv0Var.O(), Integer.valueOf(iC))) {
                nc2.q(iC, nv0Var, iC, z00Var);
            }
            y02.F(f5.C, nv0Var, bq1VarM);
            float f = dj3.a;
            b22 b22Var = gj3.a;
            int iP0 = ((ua0) nv0Var.j(s20.h)).p0(4.0f);
            boolean zD = nv0Var.d(iP0);
            Object objO = nv0Var.O();
            Object obj = c20.a;
            if (zD || objO == obj) {
                objO = new hj3(iP0);
                nv0Var.j0(objO);
            }
            hj3 hj3Var = (hj3) objO;
            d00 d00VarN = gq.N(2059851063, new w90(2, strP), nv0Var);
            zs1 zs1Var = fm.a;
            boolean zG = nv0Var.g(false) | nv0Var.f(zs1Var);
            Object objO2 = nv0Var.O();
            if (zG || objO2 == obj) {
                objO2 = new jj3(zs1Var);
                nv0Var.j0(objO2);
            }
            gj3.b(hj3Var, d00VarN, (jj3) objO2, null, false, d00Var, nv0Var, 100663344);
            nv0Var.p(true);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new w4(d00Var, i, 6);
        }
    }
}
