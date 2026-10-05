package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class dn0 {
    public static final t20 a = new t20(new q20(22));

    public static final void a(bq1 bq1Var, ie1 ie1Var, x12 x12Var, kj kjVar, ns0 ns0Var, nv0 nv0Var, int i, int i2) {
        ie1 ie1Var2;
        x12 x12Var2;
        ie1 ie1Var3;
        x12 x12VarE;
        ns0Var.getClass();
        nv0Var.b0(1558181381);
        int i3 = (((i2 & 2) == 0 && nv0Var.f(ie1Var)) ? 32 : 16) | i;
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= nv0Var.f(x12Var) ? 256 : 128;
        }
        int i5 = i3 | (nv0Var.h(ns0Var) ? 16384 : 8192);
        if (nv0Var.R(i5 & 1, (i5 & 9363) != 9362)) {
            nv0Var.W();
            if ((i & 1) == 0 || nv0Var.A()) {
                if ((i2 & 2) != 0) {
                    ie1Var = ke1.a(nv0Var);
                    i5 &= -113;
                }
                ie1Var3 = ie1Var;
                x12VarE = i4 != 0 ? f80.e(3) : x12Var;
            } else {
                nv0Var.U();
                if ((i2 & 2) != 0) {
                    i5 &= -113;
                }
                ie1Var3 = ie1Var;
                x12VarE = x12Var;
            }
            nv0Var.q();
            bb1 bb1Var = (bb1) nv0Var.j(s20.n);
            lr.g(((i5 << 15) & 1879048192) | (i5 & 126) | 24576, 488, null, null, kjVar, null, ns0Var, nv0Var, ie1Var3, bq1Var, new b22(x12VarE.a(bb1Var), x12VarE.d(), x12VarE.b(bb1Var), x12VarE.c() + ((jd0) nv0Var.j(a)).f), false);
            x12Var2 = x12VarE;
            ie1Var2 = ie1Var3;
        } else {
            nv0Var.U();
            ie1Var2 = ie1Var;
            x12Var2 = x12Var;
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new cn0(bq1Var, ie1Var2, x12Var2, kjVar, ns0Var, i, i2);
        }
    }
}
