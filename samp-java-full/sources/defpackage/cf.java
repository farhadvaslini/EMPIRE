package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class cf {
    public static final r32 a;

    static {
        ni0 ni0Var = ni0.f;
        a = new r32(ni0Var, ni0Var);
    }

    public static final void a(af afVar, List list, nv0 nv0Var, int i) {
        nv0Var.b0(-1794596951);
        int i2 = (i & 6) == 0 ? (nv0Var.f(afVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= nv0Var.h(list) ? 32 : 16;
        }
        int i3 = 1;
        if (nv0Var.R(i2 & 1, (i2 & 19) != 18)) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                ze zeVar = (ze) list.get(i4);
                ss0 ss0Var = (ss0) zeVar.a;
                int i5 = zeVar.b;
                int i6 = zeVar.c;
                Object objO = nv0Var.O();
                if (objO == c20.a) {
                    objO = p8.d;
                    nv0Var.j0(objO);
                }
                cn1 cn1Var = (cn1) objO;
                int iHashCode = Long.hashCode(nv0Var.T);
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
                y02.F(f5.F, nv0Var, Integer.valueOf(iHashCode));
                y02.C(nv0Var);
                y02.F(f5.C, nv0Var, bq1VarM);
                ss0Var.e(afVar.subSequence(i5, i6).g, nv0Var, 0);
                nv0Var.p(true);
            }
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new xc(i, i3, afVar, list);
        }
    }
}
